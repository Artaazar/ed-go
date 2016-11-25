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


public class DBPilotPowerBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"pilot_power_id", "pilotPowerId"})
	@DataTarget("pilot_power_id")
	@XMLSimple("pilotPowerId")
	private java.lang.Long pilotPowerId;
	
	public java.lang.Long getPilotPowerId() {
		return pilotPowerId;
	}
	
	public DBPilotPowerBean setPilotPowerId(java.lang.Long value) {
		pilotPowerId = value;
		return this;
	}
	
	
	@DataSource({"pilot_power_time", "pilotPowerTime"})
	@DataTarget("pilot_power_time")
	@XMLSimple("pilotPowerTime")
	private java.sql.Timestamp pilotPowerTime;
	
	public java.sql.Timestamp getPilotPowerTime() {
		return pilotPowerTime;
	}
	
	public DBPilotPowerBean setPilotPowerTime(java.sql.Timestamp value) {
		pilotPowerTime = value;
		return this;
	}
	
	
	@DataSource({"power_id", "powerId"})
	@DataTarget("power_id")
	@XMLSimple("powerId")
	private java.lang.Long powerId;
	
	public java.lang.Long getPowerId() {
		return powerId;
	}
	
	public DBPilotPowerBean setPowerId(java.lang.Long value) {
		powerId = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBPilotPowerBean setPilotId(java.lang.Long value) {
		pilotId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setPilotPowerId(new java.lang.Long(value.toString()));
		
	}	
	
}