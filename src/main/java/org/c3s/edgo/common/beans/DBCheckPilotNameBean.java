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


public class DBCheckPilotNameBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"name_other", "nameOther"})
	@DataTarget("name_other")
	@XMLSimple("nameOther")
	private java.lang.Long nameOther;
	
	public java.lang.Long getNameOther() {
		return nameOther;
	}
	
	public DBCheckPilotNameBean setNameOther(java.lang.Long value) {
		this.nameOther = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}