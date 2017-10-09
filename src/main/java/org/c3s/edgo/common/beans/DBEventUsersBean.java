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


public class DBEventUsersBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"user_id", "userId"})
	@DataTarget("user_id")
	@XMLSimple("userId")
	private java.lang.Long userId;
	
	public java.lang.Long getUserId() {
		return userId;
	}
	
	public DBEventUsersBean setUserId(java.lang.Long value) {
		this.userId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}