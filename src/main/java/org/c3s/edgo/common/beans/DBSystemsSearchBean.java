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


public class DBSystemsSearchBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"system_id", "systemId"})
	@DataTarget("system_id")
	@XMLSimple("systemId")
	private java.math.BigInteger systemId;
	
	public java.math.BigInteger getSystemId() {
		return systemId;
	}
	
	public DBSystemsSearchBean setSystemId(java.math.BigInteger value) {
		systemId = value;
		return this;
	}
	
	
	@DataSource({"name", "name"})
	@DataTarget("name")
	@XMLSimple("name")
	private java.lang.String name;
	
	public java.lang.String getName() {
		return name;
	}
	
	public DBSystemsSearchBean setName(java.lang.String value) {
		name = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}