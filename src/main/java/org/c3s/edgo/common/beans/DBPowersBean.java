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


public class DBPowersBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"power_name", "powerName"})
	@DataTarget("power_name")
	@XMLSimple("powerName")
	private java.lang.String powerName;
	
	public java.lang.String getPowerName() {
		return powerName;
	}
	
	public DBPowersBean setPowerName(java.lang.String value) {
		this.powerName = value;
		return this;
	}
	
	
	@DataSource({"power_uniq", "powerUniq"})
	@DataTarget("power_uniq")
	@XMLSimple("powerUniq")
	private java.lang.String powerUniq;
	
	public java.lang.String getPowerUniq() {
		return powerUniq;
	}
	
	public DBPowersBean setPowerUniq(java.lang.String value) {
		this.powerUniq = value;
		return this;
	}
	
	
	@DataSource({"power_id", "powerId"})
	@DataTarget("power_id")
	@XMLSimple("powerId")
	private java.lang.Long powerId;
	
	public java.lang.Long getPowerId() {
		return powerId;
	}
	
	public DBPowersBean setPowerId(java.lang.Long value) {
		this.powerId = value;
		return this;
	}
	
	
	@DataSource({"power_aliases", "powerAliases"})
	@DataTarget("power_aliases")
	@XMLSimple("powerAliases")
	private java.lang.String powerAliases;
	
	public java.lang.String getPowerAliases() {
		return powerAliases;
	}
	
	public DBPowersBean setPowerAliases(java.lang.String value) {
		this.powerAliases = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setPowerId(new java.lang.Long(value.toString()));
		
	}	
	
}