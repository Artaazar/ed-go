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


public class DBShipsBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"ship_uniq", "shipUniq"})
	@DataTarget("ship_uniq")
	@XMLSimple("shipUniq")
	private java.lang.String shipUniq;
	
	public java.lang.String getShipUniq() {
		return shipUniq;
	}
	
	public DBShipsBean setShipUniq(java.lang.String value) {
		this.shipUniq = value;
		return this;
	}
	
	
	@DataSource({"is_special", "isSpecial"})
	@DataTarget("is_special")
	@XMLSimple("isSpecial")
	private java.lang.Integer isSpecial;
	
	public java.lang.Integer getIsSpecial() {
		return isSpecial;
	}
	
	public DBShipsBean setIsSpecial(java.lang.Integer value) {
		this.isSpecial = value;
		return this;
	}
	
	
	@DataSource({"ship_name", "shipName"})
	@DataTarget("ship_name")
	@XMLSimple("shipName")
	private java.lang.String shipName;
	
	public java.lang.String getShipName() {
		return shipName;
	}
	
	public DBShipsBean setShipName(java.lang.String value) {
		this.shipName = value;
		return this;
	}
	
	
	@DataSource({"ship_id", "shipId"})
	@DataTarget("ship_id")
	@XMLSimple("shipId")
	private java.lang.Long shipId;
	
	public java.lang.Long getShipId() {
		return shipId;
	}
	
	public DBShipsBean setShipId(java.lang.Long value) {
		this.shipId = value;
		return this;
	}
	
	
	@DataSource({"slots", "slots"})
	@DataTarget("slots")
	@XMLReflectionField

	private DBSlotsBean slots;
	
	public DBSlotsBean getSlots() {
		return slots;
	}
	
	public DBShipsBean setSlots(DBSlotsBean value) {
		this.slots = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setShipId(new java.lang.Long(value.toString()));
		
	}	
	
}