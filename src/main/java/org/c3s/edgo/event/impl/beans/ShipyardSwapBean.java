package org.c3s.edgo.event.impl.beans;

public class ShipyardSwapBean {
	/**
	 *  type of ship being switched to
	 */
	private String ShipType;
	/**
	 * 
	 */
	private String ShipID;
	/**
	 *  (if storing old ship) type of ship being stored
	 */
	private String StoreOldShip;
	/**
	 * 
	 */
	private String StoreShipID;
	/**
	 *  (if selling old ship) type of ship being sold
	 */
	private String SellOldShip;
	/**
	 * 
	 */
	private String SellShipID;
	/**
	 * @return
	 */
	public String getShipType() {
		return ShipType;
	}
	/**
	 * @param shiptype
	 */
	public void setShipType(String shiptype) {
		this.ShipType = shiptype;
	}
	/**
	 * @return
	 */
	public String getShipID() {
		return ShipID;
	}
	/**
	 * @param shipid
	 */
	public void setShipID(String shipid) {
		this.ShipID = shipid;
	}
	/**
	 * @return
	 */
	public String getStoreOldShip() {
		return StoreOldShip;
	}
	/**
	 * @param storeoldship
	 */
	public void setStoreOldShip(String storeoldship) {
		this.StoreOldShip = storeoldship;
	}
	/**
	 * @return
	 */
	public String getStoreShipID() {
		return StoreShipID;
	}
	/**
	 * @param storeshipid
	 */
	public void setStoreShipID(String storeshipid) {
		this.StoreShipID = storeshipid;
	}
	/**
	 * @return
	 */
	public String getSellOldShip() {
		return SellOldShip;
	}
	/**
	 * @param selloldship
	 */
	public void setSellOldShip(String selloldship) {
		this.SellOldShip = selloldship;
	}
	/**
	 * @return
	 */
	public String getSellShipID() {
		return SellShipID;
	}
	/**
	 * @param sellshipid
	 */
	public void setSellShipID(String sellshipid) {
		this.SellShipID = sellshipid;
	}
	
}	
	