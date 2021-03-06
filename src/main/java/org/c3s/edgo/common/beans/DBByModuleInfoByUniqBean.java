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


public class DBByModuleInfoByUniqBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"module_rating", "moduleRating"})
	@DataTarget("module_rating")
	@XMLSimple("moduleRating")
	private java.lang.String moduleRating;
	
	public java.lang.String getModuleRating() {
		return moduleRating;
	}
	
	public DBByModuleInfoByUniqBean setModuleRating(java.lang.String value) {
		this.moduleRating = value;
		return this;
	}
	
	
	@DataSource({"slot_type_id", "slotTypeId"})
	@DataTarget("slot_type_id")
	@XMLSimple("slotTypeId")
	private java.lang.Long slotTypeId;
	
	public java.lang.Long getSlotTypeId() {
		return slotTypeId;
	}
	
	public DBByModuleInfoByUniqBean setSlotTypeId(java.lang.Long value) {
		this.slotTypeId = value;
		return this;
	}
	
	
	@DataSource({"slot_type_name", "slotTypeName"})
	@DataTarget("slot_type_name")
	@XMLSimple("slotTypeName")
	private java.lang.String slotTypeName;
	
	public java.lang.String getSlotTypeName() {
		return slotTypeName;
	}
	
	public DBByModuleInfoByUniqBean setSlotTypeName(java.lang.String value) {
		this.slotTypeName = value;
		return this;
	}
	
	
	@DataSource({"module_group_id", "moduleGroupId"})
	@DataTarget("module_group_id")
	@XMLSimple("moduleGroupId")
	private java.lang.Long moduleGroupId;
	
	public java.lang.Long getModuleGroupId() {
		return moduleGroupId;
	}
	
	public DBByModuleInfoByUniqBean setModuleGroupId(java.lang.Long value) {
		this.moduleGroupId = value;
		return this;
	}
	
	
	@DataSource({"module_group_name", "moduleGroupName"})
	@DataTarget("module_group_name")
	@XMLSimple("moduleGroupName")
	private java.lang.String moduleGroupName;
	
	public java.lang.String getModuleGroupName() {
		return moduleGroupName;
	}
	
	public DBByModuleInfoByUniqBean setModuleGroupName(java.lang.String value) {
		this.moduleGroupName = value;
		return this;
	}
	
	
	@DataSource({"module_id", "moduleId"})
	@DataTarget("module_id")
	@XMLSimple("moduleId")
	private java.lang.Long moduleId;
	
	public java.lang.Long getModuleId() {
		return moduleId;
	}
	
	public DBByModuleInfoByUniqBean setModuleId(java.lang.Long value) {
		this.moduleId = value;
		return this;
	}
	
	
	@DataSource({"eddb_id", "eddbId"})
	@DataTarget("eddb_id")
	@XMLSimple("eddbId")
	private java.lang.Integer eddbId;
	
	public java.lang.Integer getEddbId() {
		return eddbId;
	}
	
	public DBByModuleInfoByUniqBean setEddbId(java.lang.Integer value) {
		this.eddbId = value;
		return this;
	}
	
	
	@DataSource({"module_weapon_mode", "moduleWeaponMode"})
	@DataTarget("module_weapon_mode")
	@XMLSimple("moduleWeaponMode")
	private java.lang.String moduleWeaponMode;
	
	public java.lang.String getModuleWeaponMode() {
		return moduleWeaponMode;
	}
	
	public DBByModuleInfoByUniqBean setModuleWeaponMode(java.lang.String value) {
		this.moduleWeaponMode = value;
		return this;
	}
	
	
	@DataSource({"module_loc_description", "moduleLocDescription"})
	@DataTarget("module_loc_description")
	@XMLSimple("moduleLocDescription")
	private java.lang.String moduleLocDescription;
	
	public java.lang.String getModuleLocDescription() {
		return moduleLocDescription;
	}
	
	public DBByModuleInfoByUniqBean setModuleLocDescription(java.lang.String value) {
		this.moduleLocDescription = value;
		return this;
	}
	
	
	@DataSource({"module_name", "moduleName"})
	@DataTarget("module_name")
	@XMLSimple("moduleName")
	private java.lang.String moduleName;
	
	public java.lang.String getModuleName() {
		return moduleName;
	}
	
	public DBByModuleInfoByUniqBean setModuleName(java.lang.String value) {
		this.moduleName = value;
		return this;
	}
	
	
	@DataSource({"module_uniq", "moduleUniq"})
	@DataTarget("module_uniq")
	@XMLSimple("moduleUniq")
	private java.lang.String moduleUniq;
	
	public java.lang.String getModuleUniq() {
		return moduleUniq;
	}
	
	public DBByModuleInfoByUniqBean setModuleUniq(java.lang.String value) {
		this.moduleUniq = value;
		return this;
	}
	
	
	@DataSource({"module_loc_name", "moduleLocName"})
	@DataTarget("module_loc_name")
	@XMLSimple("moduleLocName")
	private java.lang.String moduleLocName;
	
	public java.lang.String getModuleLocName() {
		return moduleLocName;
	}
	
	public DBByModuleInfoByUniqBean setModuleLocName(java.lang.String value) {
		this.moduleLocName = value;
		return this;
	}
	
	
	@DataSource({"module_class", "moduleClass"})
	@DataTarget("module_class")
	@XMLSimple("moduleClass")
	private java.lang.Integer moduleClass;
	
	public java.lang.Integer getModuleClass() {
		return moduleClass;
	}
	
	public DBByModuleInfoByUniqBean setModuleClass(java.lang.Integer value) {
		this.moduleClass = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setSlotTypeId(new java.lang.Long(value.toString()));
		
	}	
	
}