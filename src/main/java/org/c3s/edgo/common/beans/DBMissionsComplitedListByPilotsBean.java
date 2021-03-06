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


public class DBMissionsComplitedListByPilotsBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"target_system_id", "targetSystemId"})
	@DataTarget("target_system_id")
	@XMLSimple("targetSystemId")
	private java.math.BigInteger targetSystemId;
	
	public java.math.BigInteger getTargetSystemId() {
		return targetSystemId;
	}
	
	public DBMissionsComplitedListByPilotsBean setTargetSystemId(java.math.BigInteger value) {
		this.targetSystemId = value;
		return this;
	}
	
	
	@DataSource({"commodity_idx", "commodityIdx"})
	@DataTarget("commodity_idx")
	@XMLSimple("commodityIdx")
	private java.lang.String commodityIdx;
	
	public java.lang.String getCommodityIdx() {
		return commodityIdx;
	}
	
	public DBMissionsComplitedListByPilotsBean setCommodityIdx(java.lang.String value) {
		this.commodityIdx = value;
		return this;
	}
	
	
	@DataSource({"mission_id", "missionId"})
	@DataTarget("mission_id")
	@XMLSimple("missionId")
	private java.math.BigInteger missionId;
	
	public java.math.BigInteger getMissionId() {
		return missionId;
	}
	
	public DBMissionsComplitedListByPilotsBean setMissionId(java.math.BigInteger value) {
		this.missionId = value;
		return this;
	}
	
	
	@DataSource({"reputation", "reputation"})
	@DataTarget("reputation")
	@XMLSimple("reputation")
	private java.lang.String reputation;
	
	public java.lang.String getReputation() {
		return reputation;
	}
	
	public DBMissionsComplitedListByPilotsBean setReputation(java.lang.String value) {
		this.reputation = value;
		return this;
	}
	
	
	@DataSource({"description", "description"})
	@DataTarget("description")
	@XMLSimple("description")
	private java.lang.String description;
	
	public java.lang.String getDescription() {
		return description;
	}
	
	public DBMissionsComplitedListByPilotsBean setDescription(java.lang.String value) {
		this.description = value;
		return this;
	}
	
	
	@DataSource({"faction_id", "factionId"})
	@DataTarget("faction_id")
	@XMLSimple("factionId")
	private java.lang.Long factionId;
	
	public java.lang.Long getFactionId() {
		return factionId;
	}
	
	public DBMissionsComplitedListByPilotsBean setFactionId(java.lang.Long value) {
		this.factionId = value;
		return this;
	}
	
	
	@DataSource({"complete_date", "completeDate"})
	@DataTarget("complete_date")
	@XMLSimple("completeDate")
	private java.sql.Timestamp completeDate;
	
	public java.sql.Timestamp getCompleteDate() {
		return completeDate;
	}
	
	public DBMissionsComplitedListByPilotsBean setCompleteDate(java.sql.Timestamp value) {
		this.completeDate = value;
		return this;
	}
	
	
	@DataSource({"is_failed", "isFailed"})
	@DataTarget("is_failed")
	@XMLSimple("isFailed")
	private java.lang.Integer isFailed;
	
	public java.lang.Integer getIsFailed() {
		return isFailed;
	}
	
	public DBMissionsComplitedListByPilotsBean setIsFailed(java.lang.Integer value) {
		this.isFailed = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBMissionsComplitedListByPilotsBean setPilotId(java.lang.Long value) {
		this.pilotId = value;
		return this;
	}
	
	
	@DataSource({"material_idx", "materialIdx"})
	@DataTarget("material_idx")
	@XMLSimple("materialIdx")
	private java.lang.String materialIdx;
	
	public java.lang.String getMaterialIdx() {
		return materialIdx;
	}
	
	public DBMissionsComplitedListByPilotsBean setMaterialIdx(java.lang.String value) {
		this.materialIdx = value;
		return this;
	}
	
	
	@DataSource({"influence", "influence"})
	@DataTarget("influence")
	@XMLSimple("influence")
	private java.lang.String influence;
	
	public java.lang.String getInfluence() {
		return influence;
	}
	
	public DBMissionsComplitedListByPilotsBean setInfluence(java.lang.String value) {
		this.influence = value;
		return this;
	}
	
	
	@DataSource({"target_system_name", "targetSystemName"})
	@DataTarget("name")
	@XMLSimple("targetSystemName")
	private java.lang.String targetSystemName;
	
	public java.lang.String getTargetSystemName() {
		return targetSystemName;
	}
	
	public DBMissionsComplitedListByPilotsBean setTargetSystemName(java.lang.String value) {
		this.targetSystemName = value;
		return this;
	}
	
	
	@DataSource({"mission_type_id", "missionTypeId"})
	@DataTarget("mission_type_id")
	@XMLSimple("missionTypeId")
	private java.lang.Long missionTypeId;
	
	public java.lang.Long getMissionTypeId() {
		return missionTypeId;
	}
	
	public DBMissionsComplitedListByPilotsBean setMissionTypeId(java.lang.Long value) {
		this.missionTypeId = value;
		return this;
	}
	
	
	@DataSource({"target_faction_id", "targetFactionId"})
	@DataTarget("target_faction_id")
	@XMLSimple("targetFactionId")
	private java.lang.Long targetFactionId;
	
	public java.lang.Long getTargetFactionId() {
		return targetFactionId;
	}
	
	public DBMissionsComplitedListByPilotsBean setTargetFactionId(java.lang.Long value) {
		this.targetFactionId = value;
		return this;
	}
	
	
	@DataSource({"reward", "reward"})
	@DataTarget("reward")
	@XMLSimple("reward")
	private java.lang.Integer reward;
	
	public java.lang.Integer getReward() {
		return reward;
	}
	
	public DBMissionsComplitedListByPilotsBean setReward(java.lang.Integer value) {
		this.reward = value;
		return this;
	}
	
	
	@DataSource({"station_name", "stationName"})
	@DataTarget("name")
	@XMLSimple("stationName")
	private java.lang.String stationName;
	
	public java.lang.String getStationName() {
		return stationName;
	}
	
	public DBMissionsComplitedListByPilotsBean setStationName(java.lang.String value) {
		this.stationName = value;
		return this;
	}
	
	
	@DataSource({"passengers", "passengers"})
	@DataTarget("passengers")
	@XMLSimple("passengers")
	private java.lang.Integer passengers;
	
	public java.lang.Integer getPassengers() {
		return passengers;
	}
	
	public DBMissionsComplitedListByPilotsBean setPassengers(java.lang.Integer value) {
		this.passengers = value;
		return this;
	}
	
	
	@DataSource({"faction_name", "factionName"})
	@DataTarget("name")
	@XMLSimple("factionName")
	private java.lang.String factionName;
	
	public java.lang.String getFactionName() {
		return factionName;
	}
	
	public DBMissionsComplitedListByPilotsBean setFactionName(java.lang.String value) {
		this.factionName = value;
		return this;
	}
	
	
	@DataSource({"station_history_id", "stationHistoryId"})
	@DataTarget("station_history_id")
	@XMLSimple("stationHistoryId")
	private java.math.BigInteger stationHistoryId;
	
	public java.math.BigInteger getStationHistoryId() {
		return stationHistoryId;
	}
	
	public DBMissionsComplitedListByPilotsBean setStationHistoryId(java.math.BigInteger value) {
		this.stationHistoryId = value;
		return this;
	}
	
	
	@DataSource({"system_name", "systemName"})
	@DataTarget("name")
	@XMLSimple("systemName")
	private java.lang.String systemName;
	
	public java.lang.String getSystemName() {
		return systemName;
	}
	
	public DBMissionsComplitedListByPilotsBean setSystemName(java.lang.String value) {
		this.systemName = value;
		return this;
	}
	
	
	@DataSource({"mission_type_uniq", "missionTypeUniq"})
	@DataTarget("mission_type_uniq")
	@XMLSimple("missionTypeUniq")
	private java.lang.String missionTypeUniq;
	
	public java.lang.String getMissionTypeUniq() {
		return missionTypeUniq;
	}
	
	public DBMissionsComplitedListByPilotsBean setMissionTypeUniq(java.lang.String value) {
		this.missionTypeUniq = value;
		return this;
	}
	
	
	@DataSource({"target_station_id", "targetStationId"})
	@DataTarget("target_station_id")
	@XMLSimple("targetStationId")
	private java.lang.Long targetStationId;
	
	public java.lang.Long getTargetStationId() {
		return targetStationId;
	}
	
	public DBMissionsComplitedListByPilotsBean setTargetStationId(java.lang.Long value) {
		this.targetStationId = value;
		return this;
	}
	
	
	@DataSource({"mission_type_name", "missionTypeName"})
	@DataTarget("mission_type_name")
	@XMLSimple("missionTypeName")
	private java.lang.String missionTypeName;
	
	public java.lang.String getMissionTypeName() {
		return missionTypeName;
	}
	
	public DBMissionsComplitedListByPilotsBean setMissionTypeName(java.lang.String value) {
		this.missionTypeName = value;
		return this;
	}
	
	
	@DataSource({"target_station_name", "targetStationName"})
	@DataTarget("name")
	@XMLSimple("targetStationName")
	private java.lang.String targetStationName;
	
	public java.lang.String getTargetStationName() {
		return targetStationName;
	}
	
	public DBMissionsComplitedListByPilotsBean setTargetStationName(java.lang.String value) {
		this.targetStationName = value;
		return this;
	}
	
	
	@DataSource({"expire_date", "expireDate"})
	@DataTarget("expire_date")
	@XMLSimple("expireDate")
	private java.sql.Timestamp expireDate;
	
	public java.sql.Timestamp getExpireDate() {
		return expireDate;
	}
	
	public DBMissionsComplitedListByPilotsBean setExpireDate(java.sql.Timestamp value) {
		this.expireDate = value;
		return this;
	}
	
	
	@DataSource({"accept_date", "acceptDate"})
	@DataTarget("accept_date")
	@XMLSimple("acceptDate")
	private java.sql.Timestamp acceptDate;
	
	public java.sql.Timestamp getAcceptDate() {
		return acceptDate;
	}
	
	public DBMissionsComplitedListByPilotsBean setAcceptDate(java.sql.Timestamp value) {
		this.acceptDate = value;
		return this;
	}
	
	
	@DataSource({"mission_link_id", "missionLinkId"})
	@DataTarget("mission_link_id")
	@XMLSimple("missionLinkId")
	private java.lang.Long missionLinkId;
	
	public java.lang.Long getMissionLinkId() {
		return missionLinkId;
	}
	
	public DBMissionsComplitedListByPilotsBean setMissionLinkId(java.lang.Long value) {
		this.missionLinkId = value;
		return this;
	}
	
	
	@DataSource({"mission_date", "missionDate"})
	@DataTarget("mission_date")
	@XMLSimple("missionDate")
	private java.lang.String missionDate;
	
	public java.lang.String getMissionDate() {
		return missionDate;
	}
	
	public DBMissionsComplitedListByPilotsBean setMissionDate(java.lang.String value) {
		this.missionDate = value;
		return this;
	}
	
	
	@DataSource({"commodity_id", "commodityId"})
	@DataTarget("commodity_id")
	@XMLSimple

	private Integer[] commodityId;
	
	public Integer[] getCommodityId() {
		return commodityId;
	}
	
	public DBMissionsComplitedListByPilotsBean setCommodityId(Integer[] value) {
		this.commodityId = value;
		return this;
	}
	
	
	@DataSource({"material_id", "materialId"})
	@DataTarget("material_id")
	@XMLSimple

	private Integer[] materialId;
	
	public Integer[] getMaterialId() {
		return materialId;
	}
	
	public DBMissionsComplitedListByPilotsBean setMaterialId(Integer[] value) {
		this.materialId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setMissionId(new java.math.BigInteger(value.toString()));
		
		setFactionId(new java.lang.Long(value.toString()));
		
		setMissionTypeId(new java.lang.Long(value.toString()));
		
	}	
	
}