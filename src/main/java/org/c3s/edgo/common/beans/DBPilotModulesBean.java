/**
 *  Autogenerated class
 */
package org.c3s.edgo.common.beans;

import java.io.Serializable;
import java.util.*;
import org.c3s.db.beans.DbBean;
import org.c3s.data.annotations.DataSource;
import org.c3s.data.annotations.DataTarget;
import org.c3s.reflection.annotation.*;


public class DBPilotModulesBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"pilot_ship_id", "pilotShipId"})
	@DataTarget("pilot_ship_id")
	@XMLSimple("pilotShipId")
	private java.lang.Long pilotShipId;
	
	public java.lang.Long getPilotShipId() {
		return pilotShipId;
	}
	
	public DBPilotModulesBean setPilotShipId(java.lang.Long value) {
		this.pilotShipId = value;
		return this;
	}
	
	
	@DataSource({"module_id", "moduleId"})
	@DataTarget("module_id")
	@XMLSimple("moduleId")
	private java.lang.Long moduleId;
	
	public java.lang.Long getModuleId() {
		return moduleId;
	}
	
	public DBPilotModulesBean setModuleId(java.lang.Long value) {
		this.moduleId = value;
		return this;
	}
	
	
	@DataSource({"pilot_module_id", "pilotModuleId"})
	@DataTarget("pilot_module_id")
	@XMLSimple("pilotModuleId")
	private java.lang.Long pilotModuleId;
	
	public java.lang.Long getPilotModuleId() {
		return pilotModuleId;
	}
	
	public DBPilotModulesBean setPilotModuleId(java.lang.Long value) {
		this.pilotModuleId = value;
		return this;
	}
	
	
	@DataSource({"slot_id", "slotId"})
	@DataTarget("slot_id")
	@XMLSimple("slotId")
	private java.lang.Long slotId;
	
	public java.lang.Long getSlotId() {
		return slotId;
	}
	
	public DBPilotModulesBean setSlotId(java.lang.Long value) {
		this.slotId = value;
		return this;
	}
	
	
	@DataSource({"can_deleted", "canDeleted"})
	@DataTarget("can_deleted")
	@XMLSimple("canDeleted")
	private java.lang.Integer canDeleted;
	
	public java.lang.Integer getCanDeleted() {
		return canDeleted;
	}
	
	public DBPilotModulesBean setCanDeleted(java.lang.Integer value) {
		this.canDeleted = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setPilotModuleId(new java.lang.Long(value.toString()));
		
	}	
	
}