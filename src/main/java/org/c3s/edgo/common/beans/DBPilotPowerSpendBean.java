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


public class DBPilotPowerSpendBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"pilot_power_spend_id", "pilotPowerSpendId"})
	@DataTarget("pilot_power_spend_id")
	@XMLSimple("pilotPowerSpendId")
	private java.lang.Long pilotPowerSpendId;
	
	public java.lang.Long getPilotPowerSpendId() {
		return pilotPowerSpendId;
	}
	
	public DBPilotPowerSpendBean setPilotPowerSpendId(java.lang.Long value) {
		pilotPowerSpendId = value;
		return this;
	}
	
	
	@DataSource({"quantity", "quantity"})
	@DataTarget("quantity")
	@XMLSimple("quantity")
	private java.lang.Long quantity;
	
	public java.lang.Long getQuantity() {
		return quantity;
	}
	
	public DBPilotPowerSpendBean setQuantity(java.lang.Long value) {
		quantity = value;
		return this;
	}
	
	
	@DataSource({"start_week", "startWeek"})
	@DataTarget("start_week")
	@XMLSimple("startWeek")
	private java.sql.Timestamp startWeek;
	
	public java.sql.Timestamp getStartWeek() {
		return startWeek;
	}
	
	public DBPilotPowerSpendBean setStartWeek(java.sql.Timestamp value) {
		startWeek = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBPilotPowerSpendBean setPilotId(java.lang.Long value) {
		pilotId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setPilotPowerSpendId(new java.lang.Long(value.toString()));
		
	}	
	
}