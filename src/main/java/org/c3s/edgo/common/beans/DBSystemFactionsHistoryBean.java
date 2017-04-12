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


public class DBSystemFactionsHistoryBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"system_id", "systemId"})
	@DataTarget("system_id")
	@XMLSimple("systemId")
	private java.math.BigInteger systemId;
	
	public java.math.BigInteger getSystemId() {
		return systemId;
	}
	
	public DBSystemFactionsHistoryBean setSystemId(java.math.BigInteger value) {
		systemId = value;
		return this;
	}
	
	
	@DataSource({"faction_id", "factionId"})
	@DataTarget("faction_id")
	@XMLSimple("factionId")
	private java.lang.Long factionId;
	
	public java.lang.Long getFactionId() {
		return factionId;
	}
	
	public DBSystemFactionsHistoryBean setFactionId(java.lang.Long value) {
		factionId = value;
		return this;
	}
	
	
	@DataSource({"state_id", "stateId"})
	@DataTarget("state_id")
	@XMLSimple("stateId")
	private java.lang.Long stateId;
	
	public java.lang.Long getStateId() {
		return stateId;
	}
	
	public DBSystemFactionsHistoryBean setStateId(java.lang.Long value) {
		stateId = value;
		return this;
	}
	
	
	@DataSource({"create_date", "createDate"})
	@DataTarget("create_date")
	@XMLSimple("createDate")
	private java.sql.Timestamp createDate;
	
	public java.sql.Timestamp getCreateDate() {
		return createDate;
	}
	
	public DBSystemFactionsHistoryBean setCreateDate(java.sql.Timestamp value) {
		createDate = value;
		return this;
	}
	
	
	@DataSource({"system_factions_history_id", "systemFactionsHistoryId"})
	@DataTarget("system_factions_history_id")
	@XMLSimple("systemFactionsHistoryId")
	private java.math.BigInteger systemFactionsHistoryId;
	
	public java.math.BigInteger getSystemFactionsHistoryId() {
		return systemFactionsHistoryId;
	}
	
	public DBSystemFactionsHistoryBean setSystemFactionsHistoryId(java.math.BigInteger value) {
		systemFactionsHistoryId = value;
		return this;
	}
	
	
	@DataSource({"influence", "influence"})
	@DataTarget("influence")
	@XMLSimple("influence")
	private java.lang.Float influence;
	
	public java.lang.Float getInfluence() {
		return influence;
	}
	
	public DBSystemFactionsHistoryBean setInfluence(java.lang.Float value) {
		influence = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setSystemFactionsHistoryId(new java.math.BigInteger(value.toString()));
		
	}	
	
}