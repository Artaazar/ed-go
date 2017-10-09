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


public class DBLocationHistoryBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"system_id", "systemId"})
	@DataTarget("system_id")
	@XMLSimple("systemId")
	private java.math.BigInteger systemId;
	
	public java.math.BigInteger getSystemId() {
		return systemId;
	}
	
	public DBLocationHistoryBean setSystemId(java.math.BigInteger value) {
		this.systemId = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBLocationHistoryBean setPilotId(java.lang.Long value) {
		this.pilotId = value;
		return this;
	}
	
	
	@DataSource({"location_id", "locationId"})
	@DataTarget("location_id")
	@XMLSimple("locationId")
	private java.math.BigInteger locationId;
	
	public java.math.BigInteger getLocationId() {
		return locationId;
	}
	
	public DBLocationHistoryBean setLocationId(java.math.BigInteger value) {
		this.locationId = value;
		return this;
	}
	
	
	@DataSource({"location_time", "locationTime"})
	@DataTarget("location_time")
	@XMLSimple("locationTime")
	private java.sql.Timestamp locationTime;
	
	public java.sql.Timestamp getLocationTime() {
		return locationTime;
	}
	
	public DBLocationHistoryBean setLocationTime(java.sql.Timestamp value) {
		this.locationTime = value;
		return this;
	}
	
	
	@DataSource({"system_name", "systemName"})
	@DataTarget("system_name")
	@XMLSimple("systemName")

	private String systemName;
	
	public String getSystemName() {
		return systemName;
	}
	
	public DBLocationHistoryBean setSystemName(String value) {
		this.systemName = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setLocationId(new java.math.BigInteger(value.toString()));
		
	}	
	
}