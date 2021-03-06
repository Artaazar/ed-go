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


public class DBBountyFactionBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"bounty_faction_id", "bountyFactionId"})
	@DataTarget("bounty_faction_id")
	@XMLSimple("bountyFactionId")
	private java.math.BigInteger bountyFactionId;
	
	public java.math.BigInteger getBountyFactionId() {
		return bountyFactionId;
	}
	
	public DBBountyFactionBean setBountyFactionId(java.math.BigInteger value) {
		this.bountyFactionId = value;
		return this;
	}
	
	
	@DataSource({"amount", "amount"})
	@DataTarget("amount")
	@XMLSimple("amount")
	private java.lang.Long amount;
	
	public java.lang.Long getAmount() {
		return amount;
	}
	
	public DBBountyFactionBean setAmount(java.lang.Long value) {
		this.amount = value;
		return this;
	}
	
	
	@DataSource({"station_history_id", "stationHistoryId"})
	@DataTarget("station_history_id")
	@XMLSimple("stationHistoryId")
	private java.math.BigInteger stationHistoryId;
	
	public java.math.BigInteger getStationHistoryId() {
		return stationHistoryId;
	}
	
	public DBBountyFactionBean setStationHistoryId(java.math.BigInteger value) {
		this.stationHistoryId = value;
		return this;
	}
	
	
	@DataSource({"broker_percent", "brokerPercent"})
	@DataTarget("broker_percent")
	@XMLSimple("brokerPercent")
	private java.lang.Integer brokerPercent;
	
	public java.lang.Integer getBrokerPercent() {
		return brokerPercent;
	}
	
	public DBBountyFactionBean setBrokerPercent(java.lang.Integer value) {
		this.brokerPercent = value;
		return this;
	}
	
	
	@DataSource({"faction_id", "factionId"})
	@DataTarget("faction_id")
	@XMLSimple("factionId")
	private java.lang.Long factionId;
	
	public java.lang.Long getFactionId() {
		return factionId;
	}
	
	public DBBountyFactionBean setFactionId(java.lang.Long value) {
		this.factionId = value;
		return this;
	}
	
	
	@DataSource({"create_date", "createDate"})
	@DataTarget("create_date")
	@XMLSimple("createDate")
	private java.sql.Timestamp createDate;
	
	public java.sql.Timestamp getCreateDate() {
		return createDate;
	}
	
	public DBBountyFactionBean setCreateDate(java.sql.Timestamp value) {
		this.createDate = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBBountyFactionBean setPilotId(java.lang.Long value) {
		this.pilotId = value;
		return this;
	}
	
	
	@DataSource({"bounty_type_id", "bountyTypeId"})
	@DataTarget("bounty_type_id")
	@XMLSimple("bountyTypeId")
	private java.lang.Long bountyTypeId;
	
	public java.lang.Long getBountyTypeId() {
		return bountyTypeId;
	}
	
	public DBBountyFactionBean setBountyTypeId(java.lang.Long value) {
		this.bountyTypeId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setBountyFactionId(new java.math.BigInteger(value.toString()));
		
	}	
	
}