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


public class DBPilotShipsBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"link_ship_id", "linkShipId"})
	@DataTarget("link_ship_id")
	@XMLSimple("linkShipId")
	private java.lang.Long linkShipId;
	
	public java.lang.Long getLinkShipId() {
		return linkShipId;
	}
	
	public DBPilotShipsBean setLinkShipId(java.lang.Long value) {
		linkShipId = value;
		return this;
	}
	
	
	@DataSource({"pilot_ship_id", "pilotShipId"})
	@DataTarget("pilot_ship_id")
	@XMLSimple("pilotShipId")
	private java.lang.Long pilotShipId;
	
	public java.lang.Long getPilotShipId() {
		return pilotShipId;
	}
	
	public DBPilotShipsBean setPilotShipId(java.lang.Long value) {
		pilotShipId = value;
		return this;
	}
	
	
	@DataSource({"system_id", "systemId"})
	@DataTarget("system_id")
	@XMLSimple("systemId")
	private java.lang.Long systemId;
	
	public java.lang.Long getSystemId() {
		return systemId;
	}
	
	public DBPilotShipsBean setSystemId(java.lang.Long value) {
		systemId = value;
		return this;
	}
	
	
	@DataSource({"is_main", "isMain"})
	@DataTarget("is_main")
	@XMLSimple("isMain")
	private java.lang.Integer isMain;
	
	public java.lang.Integer getIsMain() {
		return isMain;
	}
	
	public DBPilotShipsBean setIsMain(java.lang.Integer value) {
		isMain = value;
		return this;
	}
	
	
	@DataSource({"station_id", "stationId"})
	@DataTarget("station_id")
	@XMLSimple("stationId")
	private java.lang.Integer stationId;
	
	public java.lang.Integer getStationId() {
		return stationId;
	}
	
	public DBPilotShipsBean setStationId(java.lang.Integer value) {
		stationId = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBPilotShipsBean setPilotId(java.lang.Long value) {
		pilotId = value;
		return this;
	}
	
	
	@DataSource({"ship_id", "shipId"})
	@DataTarget("ship_id")
	@XMLSimple("shipId")
	private java.lang.Long shipId;
	
	public java.lang.Long getShipId() {
		return shipId;
	}
	
	public DBPilotShipsBean setShipId(java.lang.Long value) {
		shipId = value;
		return this;
	}
	
	
	@DataSource({"ship", "ship"})
	@DataTarget("ship")
	@XMLReflectionField

	private DBShipsBean ship;
	
	public DBShipsBean getShip() {
		return ship;
	}
	
	public DBPilotShipsBean setShip(DBShipsBean value) {
		ship = value;
		return this;
	}
	
	
	@DataSource({"modules", "modules"})
	@DataTarget("modules")
	@XMLFieldList

	private List<? extends Object> modules;
	
	public List<? extends Object> getModules() {
		return modules;
	}
	
	public DBPilotShipsBean setModules(List<? extends Object> value) {
		modules = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setPilotShipId(new java.lang.Long(value.toString()));
		
	}	
	
}