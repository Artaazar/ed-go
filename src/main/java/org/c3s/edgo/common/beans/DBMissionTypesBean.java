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


public class DBMissionTypesBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"mission_type_uniq", "missionTypeUniq"})
	@DataTarget("mission_type_uniq")
	@XMLSimple("missionTypeUniq")
	private java.lang.String missionTypeUniq;
	
	public java.lang.String getMissionTypeUniq() {
		return missionTypeUniq;
	}
	
	public DBMissionTypesBean setMissionTypeUniq(java.lang.String value) {
		this.missionTypeUniq = value;
		return this;
	}
	
	
	@DataSource({"mission_type_name", "missionTypeName"})
	@DataTarget("mission_type_name")
	@XMLSimple("missionTypeName")
	private java.lang.String missionTypeName;
	
	public java.lang.String getMissionTypeName() {
		return missionTypeName;
	}
	
	public DBMissionTypesBean setMissionTypeName(java.lang.String value) {
		this.missionTypeName = value;
		return this;
	}
	
	
	@DataSource({"mission_type_id", "missionTypeId"})
	@DataTarget("mission_type_id")
	@XMLSimple("missionTypeId")
	private java.lang.Long missionTypeId;
	
	public java.lang.Long getMissionTypeId() {
		return missionTypeId;
	}
	
	public DBMissionTypesBean setMissionTypeId(java.lang.Long value) {
		this.missionTypeId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setMissionTypeId(new java.lang.Long(value.toString()));
		
	}	
	
}