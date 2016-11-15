package org.c3s.edgo.scripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.c3s.db.jpa.ManagerJPA;
import org.c3s.edgo.common.entity.Module;
import org.c3s.edgo.common.entity.Pilot;
import org.c3s.edgo.common.entity.PilotShip;
import org.c3s.edgo.common.entity.Ship;
import org.c3s.edgo.common.entity.ShipSlot;
import org.c3s.edgo.common.entity.ShipSlotPK;
import org.c3s.edgo.common.entity.Slot;
import org.c3s.edgo.companion.CompanionBean;
import org.c3s.exceptions.FileSystemException;
import org.c3s.utils.FileSystem;
import org.c3s.utils.JSONUtils;

public class CompanionParser {

	public static void main(String[] args) throws FileSystemException {
		
		
		List<String> skip =  Arrays.asList(new String[] {"PaintJob", "Decal", "PlanetaryApproachSuite", "Bobble", "WeaponColour", "EngineColour", "ShipKit"});
		
		String source = FileSystem.fileGetContents("E:/sites/ed-tourney/tmp/commander_new.txt");
		source = source.replaceAll("\\[\\]", "{}");
		
		CompanionBean companion = JSONUtils.fromJSON(source, CompanionBean.class);
		
		EntityManager em = ManagerJPA.get("edgo");
		
		em.getTransaction().begin();
		
		
		Pilot pilot = em.find(Pilot.class, 1);
		int currentShipId = companion.ship.id;
		
		for (String id: companion.ships.keySet()) {
			
			PilotShip pilotShip = pilot.getPilotShip(companion.ships.get(id).id);
			
			Ship ship = null;
			if (pilotShip == null) {
				ship = em.createNamedQuery("Ship.findByUniq", Ship.class).setParameter("uniq", companion.ships.get(id).name).getResultList().stream().findFirst().orElse(null);
				//System.out.println(ship);
				if (ship == null) {
					ship = new Ship();
					ship.setUniq(companion.ships.get(id).name);
					em.persist(ship);
				}
				
				pilotShip = new PilotShip();
				pilotShip.setShip(ship);
				pilotShip.setLinkShipId(companion.ships.get(id).id);
				pilotShip.setIsMain((companion.ships.get(id).id == currentShipId) ? (byte)1:0);
				pilotShip.setPilot(pilot);
				em.persist(pilotShip);
			} else {
				ship = pilotShip.getShip();
			}
				

			for (final String cslot : companion.ships.get(id).modules.keySet()) {
				
				if (companion.ships.get(id).modules.get(cslot).module == null || skip.stream().filter(s -> cslot.toLowerCase().startsWith(s.toLowerCase())).map(s->true).findFirst().orElse(false)) {
					//System.out.println("Skip: " + cslot);
					continue;
				}
				
				Module module = em.createNamedQuery("Module.findByUniq", Module.class).setParameter("uniq", companion.ships.get(id).modules.get(cslot).module.name).getResultList().stream().findFirst().orElse(null);
				if (module != null) {
					Slot slot = em.createNamedQuery("Slot.findByUniq", Slot.class).setParameter("uniq", cslot).getResultList().stream().findFirst().orElse(null);
					
					if (slot == null) {
						slot = new Slot();
						slot.setSlotType(module.getModuleGroup().getSlotType());
						slot.setUniq(cslot);
						em.persist(slot);
					}

					if (ship.getSlot(cslot) == null) {
						ShipSlotPK ssPk = new ShipSlotPK();
						ssPk.setShipId(ship.getId());
						ssPk.setSlotId(slot.getId());
						
						ShipSlot shipSlot = new ShipSlot();
						shipSlot.setId(ssPk);
						shipSlot.setShip(ship);
						shipSlot.setSlot(slot);
						em.merge(shipSlot);
					}
					
					em.merge(slot);
					em.merge(ship);
					
				} else {
					System.out.println(id + "|" + cslot + "|" + companion.ships.get(id).modules.get(cslot).module.name);
				}
			}
			
		}
		
		/*
		 * Хреначим модули у пилота 
		 */
		
		for (PilotShip pilotShip : pilot.getPilotShips()) {
			 org.c3s.edgo.companion.Ship cship = companion.ships.get(pilotShip.getLinkShipId());
			 
			 
		}
		/*
		 * Коммитим 
		 */
		em.getTransaction().commit();
	}

}
