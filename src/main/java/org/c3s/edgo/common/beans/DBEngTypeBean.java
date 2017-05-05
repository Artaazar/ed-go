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


public class DBEngTypeBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"eng_type_name", "engTypeName"})
	@DataTarget("eng_type_name")
	@XMLSimple("engTypeName")
	private java.lang.String engTypeName;
	
	public java.lang.String getEngTypeName() {
		return engTypeName;
	}
	
	public DBEngTypeBean setEngTypeName(java.lang.String value) {
		engTypeName = value;
		return this;
	}
	
	
	@DataSource({"eng_type_uniq", "engTypeUniq"})
	@DataTarget("eng_type_uniq")
	@XMLSimple("engTypeUniq")
	private java.lang.String engTypeUniq;
	
	public java.lang.String getEngTypeUniq() {
		return engTypeUniq;
	}
	
	public DBEngTypeBean setEngTypeUniq(java.lang.String value) {
		engTypeUniq = value;
		return this;
	}
	
	
	@DataSource({"eng_type_id", "engTypeId"})
	@DataTarget("eng_type_id")
	@XMLSimple("engTypeId")
	private java.lang.Long engTypeId;
	
	public java.lang.Long getEngTypeId() {
		return engTypeId;
	}
	
	public DBEngTypeBean setEngTypeId(java.lang.Long value) {
		engTypeId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setEngTypeId(new java.lang.Long(value.toString()));
		
	}	
	
}