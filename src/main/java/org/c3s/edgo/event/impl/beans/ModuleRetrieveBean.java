package org.c3s.edgo.event.impl.beans;

import java.util.Date;

import org.c3s.edgo.event.AbstractEventBean;

public class ModuleRetrieveBean extends AbstractEventBean {

	private Date timestamp;
	private String event;
	/**
	 * 
	 */
	private String Slot;
	/**
	 * 
	 */
	private String Ship;
	/**
	 * 
	 */
	private int ShipID;
	/**
	 * 
	 */
	private String RetrievedItem;
	/**
	 * name of modification blueprint, if any
	 */
	private String EngineerModifications;
	/**
	 * (if slot was not empty)
	 */
	private String SwapOutItem;
	/**
	 * 
	 */
	private String Cost;

	/**
	 * @return
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * @param event
	 */
	public void setEvent(String event) {
		this.event = event;
	}

	/**
	 * @return
	 */
	public String getSlot() {
		return Slot;
	}

	/**
	 * @param slot
	 */
	public void setSlot(String slot) {
		this.Slot = slot;
	}

	/**
	 * @return
	 */
	public String getShip() {
		return Ship;
	}

	/**
	 * @param ship
	 */
	public void setShip(String ship) {
		this.Ship = ship;
	}

	/**
	 * @return
	 */
	public int getShipID() {
		return ShipID;
	}

	/**
	 * @param shipid
	 */
	public void setShipID(int shipid) {
		this.ShipID = shipid;
	}

	/**
	 * @return
	 */
	public String getRetrievedItem() {
		return RetrievedItem;
	}

	/**
	 * @param retrieveditem
	 */
	public void setRetrievedItem(String retrieveditem) {
		this.RetrievedItem = retrieveditem;
	}

	/**
	 * @return
	 */
	public String getEngineerModifications() {
		return EngineerModifications;
	}

	/**
	 * @param engineermodifications
	 */
	public void setEngineerModifications(String engineermodifications) {
		this.EngineerModifications = engineermodifications;
	}

	/**
	 * @return
	 */
	public String getSwapOutItem() {
		return SwapOutItem;
	}

	/**
	 * @param swapoutitem
	 */
	public void setSwapOutItem(String swapoutitem) {
		this.SwapOutItem = swapoutitem;
	}

	/**
	 * @return
	 */
	public String getCost() {
		return Cost;
	}

	/**
	 * @param cost
	 */
	public void setCost(String cost) {
		this.Cost = cost;
	}

}
