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


public class DBMissionsBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"reward", "reward"})
	@DataTarget("reward")
	@XMLSimple("reward")
	private java.lang.Integer reward;
	
	public java.lang.Integer getReward() {
		return reward;
	}
	
	public DBMissionsBean setReward(java.lang.Integer value) {
		reward = value;
		return this;
	}
	
	
	@DataSource({"target_system_id", "targetSystemId"})
	@DataTarget("target_system_id")
	@XMLSimple("targetSystemId")
	private java.math.BigInteger targetSystemId;
	
	public java.math.BigInteger getTargetSystemId() {
		return targetSystemId;
	}
	
	public DBMissionsBean setTargetSystemId(java.math.BigInteger value) {
		targetSystemId = value;
		return this;
	}
	
	
	@DataSource({"mission_id", "missionId"})
	@DataTarget("mission_id")
	@XMLSimple("missionId")
	private java.math.BigInteger missionId;
	
	public java.math.BigInteger getMissionId() {
		return missionId;
	}
	
	public DBMissionsBean setMissionId(java.math.BigInteger value) {
		missionId = value;
		return this;
	}
	
	
	@DataSource({"faction_id", "factionId"})
	@DataTarget("faction_id")
	@XMLSimple("factionId")
	private java.lang.Long factionId;
	
	public java.lang.Long getFactionId() {
		return factionId;
	}
	
	public DBMissionsBean setFactionId(java.lang.Long value) {
		factionId = value;
		return this;
	}
	
	
	@DataSource({"complete_date", "completeDate"})
	@DataTarget("complete_date")
	@XMLSimple("completeDate")
	private java.sql.Timestamp completeDate;
	
	public java.sql.Timestamp getCompleteDate() {
		return completeDate;
	}
	
	public DBMissionsBean setCompleteDate(java.sql.Timestamp value) {
		completeDate = value;
		return this;
	}
	
	
	@DataSource({"target_station_id", "targetStationId"})
	@DataTarget("target_station_id")
	@XMLSimple("targetStationId")
	private java.lang.Long targetStationId;
	
	public java.lang.Long getTargetStationId() {
		return targetStationId;
	}
	
	public DBMissionsBean setTargetStationId(java.lang.Long value) {
		targetStationId = value;
		return this;
	}
	
	
	@DataSource({"is_failed", "isFailed"})
	@DataTarget("is_failed")
	@XMLSimple("isFailed")
	private java.lang.Integer isFailed;
	
	public java.lang.Integer getIsFailed() {
		return isFailed;
	}
	
	public DBMissionsBean setIsFailed(java.lang.Integer value) {
		isFailed = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBMissionsBean setPilotId(java.lang.Long value) {
		pilotId = value;
		return this;
	}
	
	
	@DataSource({"expire_date", "expireDate"})
	@DataTarget("expire_date")
	@XMLSimple("expireDate")
	private java.sql.Timestamp expireDate;
	
	public java.sql.Timestamp getExpireDate() {
		return expireDate;
	}
	
	public DBMissionsBean setExpireDate(java.sql.Timestamp value) {
		expireDate = value;
		return this;
	}
	
	
	@DataSource({"accept_date", "acceptDate"})
	@DataTarget("accept_date")
	@XMLSimple("acceptDate")
	private java.sql.Timestamp acceptDate;
	
	public java.sql.Timestamp getAcceptDate() {
		return acceptDate;
	}
	
	public DBMissionsBean setAcceptDate(java.sql.Timestamp value) {
		acceptDate = value;
		return this;
	}
	
	
	@DataSource({"mission_link_id", "missionLinkId"})
	@DataTarget("mission_link_id")
	@XMLSimple("missionLinkId")
	private java.lang.Long missionLinkId;
	
	public java.lang.Long getMissionLinkId() {
		return missionLinkId;
	}
	
	public DBMissionsBean setMissionLinkId(java.lang.Long value) {
		missionLinkId = value;
		return this;
	}
	
	
	@DataSource({"mission_type_id", "missionTypeId"})
	@DataTarget("mission_type_id")
	@XMLSimple("missionTypeId")
	private java.lang.Long missionTypeId;
	
	public java.lang.Long getMissionTypeId() {
		return missionTypeId;
	}
	
	public DBMissionsBean setMissionTypeId(java.lang.Long value) {
		missionTypeId = value;
		return this;
	}
	
	
	@DataSource({"target_faction_id", "targetFactionId"})
	@DataTarget("target_faction_id")
	@XMLSimple("targetFactionId")
	private java.lang.Long targetFactionId;
	
	public java.lang.Long getTargetFactionId() {
		return targetFactionId;
	}
	
	public DBMissionsBean setTargetFactionId(java.lang.Long value) {
		targetFactionId = value;
		return this;
	}
	
	
	@DataSource({"source_location_id", "sourceLocationId"})
	@DataTarget("source_location_id")
	@XMLSimple("sourceLocationId")
	private java.math.BigInteger sourceLocationId;
	
	public java.math.BigInteger getSourceLocationId() {
		return sourceLocationId;
	}
	
	public DBMissionsBean setSourceLocationId(java.math.BigInteger value) {
		sourceLocationId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setMissionId(new java.math.BigInteger(value.toString()));
		
	}	
	
}