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


public class DBFactionsSearchBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"max_date", "maxDate"})
	@DataTarget("max_date")
	@XMLSimple("maxDate")
	private java.lang.Long maxDate;
	
	public java.lang.Long getMaxDate() {
		return maxDate;
	}
	
	public DBFactionsSearchBean setMaxDate(java.lang.Long value) {
		maxDate = value;
		return this;
	}
	
	
	@DataSource({"min_date", "minDate"})
	@DataTarget("min_date")
	@XMLSimple("minDate")
	private java.lang.Long minDate;
	
	public java.lang.Long getMinDate() {
		return minDate;
	}
	
	public DBFactionsSearchBean setMinDate(java.lang.Long value) {
		minDate = value;
		return this;
	}
	
	
	@DataSource({"name", "name"})
	@DataTarget("name")
	@XMLSimple("name")
	private java.lang.String name;
	
	public java.lang.String getName() {
		return name;
	}
	
	public DBFactionsSearchBean setName(java.lang.String value) {
		name = value;
		return this;
	}
	
	
	@DataSource({"faction_id", "factionId"})
	@DataTarget("faction_id")
	@XMLSimple("factionId")
	private java.lang.Long factionId;
	
	public java.lang.Long getFactionId() {
		return factionId;
	}
	
	public DBFactionsSearchBean setFactionId(java.lang.Long value) {
		factionId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setFactionId(new java.lang.Long(value.toString()));
		
	}	
	
}