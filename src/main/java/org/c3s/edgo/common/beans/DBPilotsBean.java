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


public class DBPilotsBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"parent_pilot_id", "parentPilotId"})
	@DataTarget("parent_pilot_id")
	@XMLSimple("parentPilotId")
	private java.lang.Long parentPilotId;
	
	public java.lang.Long getParentPilotId() {
		return parentPilotId;
	}
	
	public DBPilotsBean setParentPilotId(java.lang.Long value) {
		parentPilotId = value;
		return this;
	}
	
	
	@DataSource({"user_id", "userId"})
	@DataTarget("user_id")
	@XMLSimple("userId")
	private java.lang.Long userId;
	
	public java.lang.Long getUserId() {
		return userId;
	}
	
	public DBPilotsBean setUserId(java.lang.Long value) {
		userId = value;
		return this;
	}
	
	
	@DataSource({"pilot_name", "pilotName"})
	@DataTarget("pilot_name")
	@XMLSimple("pilotName")
	private java.lang.String pilotName;
	
	public java.lang.String getPilotName() {
		return pilotName;
	}
	
	public DBPilotsBean setPilotName(java.lang.String value) {
		pilotName = value;
		return this;
	}
	
	
	@DataSource({"is_current", "isCurrent"})
	@DataTarget("is_current")
	@XMLSimple("isCurrent")
	private java.lang.Integer isCurrent;
	
	public java.lang.Integer getIsCurrent() {
		return isCurrent;
	}
	
	public DBPilotsBean setIsCurrent(java.lang.Integer value) {
		isCurrent = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBPilotsBean setPilotId(java.lang.Long value) {
		pilotId = value;
		return this;
	}
	
	
	@DataSource({"is_ignored", "isIgnored"})
	@DataTarget("is_ignored")
	@XMLSimple("isIgnored")
	private java.lang.Integer isIgnored;
	
	public java.lang.Integer getIsIgnored() {
		return isIgnored;
	}
	
	public DBPilotsBean setIsIgnored(java.lang.Integer value) {
		isIgnored = value;
		return this;
	}
	
	
	@DataSource({"ships", "ships"})
	@DataTarget("ships")
	@XMLFieldList

	private List<DBPilotShipsBean> ships;
	
	public List<DBPilotShipsBean> getShips() {
		return ships;
	}
	
	public DBPilotsBean setShips(List<DBPilotShipsBean> value) {
		ships = value;
		return this;
	}
	
	
	@DataSource({"current_ship", "currentShip"})
	@DataTarget("current_ship")
	@XMLReflectionField

	private DBPilotShipsBean currentShip;
	
	public DBPilotShipsBean getCurrentShip() {
		return currentShip;
	}
	
	public DBPilotsBean setCurrentShip(DBPilotShipsBean value) {
		currentShip = value;
		return this;
	}
	
	
	@DataSource({"childs", "childs"})
	@DataTarget("childs")
	@XMLFieldList

	private List<? extends Object> childs;
	
	public List<? extends Object> getChilds() {
		return childs;
	}
	
	public DBPilotsBean setChilds(List<? extends Object> value) {
		childs = value;
		return this;
	}
	
	
	@DataSource({"Location", "location"})
	@DataTarget("Location")
	@XMLReflectionField

	private DBLocationHistoryBean location;
	
	public DBLocationHistoryBean getLocation() {
		return location;
	}
	
	public DBPilotsBean setLocation(DBLocationHistoryBean value) {
		location = value;
		return this;
	}
	
	
	@DataSource({"Rank", "rank"})
	@DataTarget("Rank")
	@XMLReflectionField

	private DBRanksBean rank;
	
	public DBRanksBean getRank() {
		return rank;
	}
	
	public DBPilotsBean setRank(DBRanksBean value) {
		rank = value;
		return this;
	}
	
	
	@DataSource({"Progress", "progress"})
	@DataTarget("Progress")
	@XMLReflectionField

	private DBProgressBean progress;
	
	public DBProgressBean getProgress() {
		return progress;
	}
	
	public DBPilotsBean setProgress(DBProgressBean value) {
		progress = value;
		return this;
	}
	
	
	@DataSource({"powers", "powers"})
	@DataTarget("powers")
	@XMLReflectionField

	private DBPowerCortageBean powers;
	
	public DBPowerCortageBean getPowers() {
		return powers;
	}
	
	public DBPilotsBean setPowers(DBPowerCortageBean value) {
		powers = value;
		return this;
	}
	
	
	@DataSource({"last_info", "lastInfo"})
	@DataTarget("last_info")
	@XMLReflectionField

	private DBPilotLastInfoBean lastInfo;
	
	public DBPilotLastInfoBean getLastInfo() {
		return lastInfo;
	}
	
	public DBPilotsBean setLastInfo(DBPilotLastInfoBean value) {
		lastInfo = value;
		return this;
	}
	
	
	@DataSource({"addition_one", "additionOne"})
	@DataTarget("addition_one")
	@XMLFieldList

	private List<? extends Object> additionOne;
	
	public List<? extends Object> getAdditionOne() {
		return additionOne;
	}
	
	public DBPilotsBean setAdditionOne(List<? extends Object> value) {
		additionOne = value;
		return this;
	}
	
	
	@DataSource({"addition_two", "additionTwo"})
	@DataTarget("addition_two")
	@XMLFieldList

	private List<? extends Object> additionTwo;
	
	public List<? extends Object> getAdditionTwo() {
		return additionTwo;
	}
	
	public DBPilotsBean setAdditionTwo(List<? extends Object> value) {
		additionTwo = value;
		return this;
	}
	
	
	@DataSource({"addition_three", "additionThree"})
	@DataTarget("addition_three")
	@XMLFieldList

	private List<? extends Object> additionThree;
	
	public List<? extends Object> getAdditionThree() {
		return additionThree;
	}
	
	public DBPilotsBean setAdditionThree(List<? extends Object> value) {
		additionThree = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setPilotId(new java.lang.Long(value.toString()));
		
	}	
	
}