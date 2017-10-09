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


public class DBSystemsFactionHistoryBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"system_id", "systemId"})
	@DataTarget("system_id")
	@XMLSimple("systemId")
	private java.math.BigInteger systemId;
	
	public java.math.BigInteger getSystemId() {
		return systemId;
	}
	
	public DBSystemsFactionHistoryBean setSystemId(java.math.BigInteger value) {
		this.systemId = value;
		return this;
	}
	
	
	@DataSource({"faction_id", "factionId"})
	@DataTarget("faction_id")
	@XMLSimple("factionId")
	private java.lang.Long factionId;
	
	public java.lang.Long getFactionId() {
		return factionId;
	}
	
	public DBSystemsFactionHistoryBean setFactionId(java.lang.Long value) {
		this.factionId = value;
		return this;
	}
	
	
	@DataSource({"create_date", "createDate"})
	@DataTarget("create_date")
	@XMLSimple("createDate")
	private java.lang.String createDate;
	
	public java.lang.String getCreateDate() {
		return createDate;
	}
	
	public DBSystemsFactionHistoryBean setCreateDate(java.lang.String value) {
		this.createDate = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}