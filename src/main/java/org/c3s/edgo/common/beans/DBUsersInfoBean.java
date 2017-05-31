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


public class DBUsersInfoBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"user_id", "userId"})
	@DataTarget("user_id")
	@XMLSimple("userId")
	private java.lang.Long userId;
	
	public java.lang.Long getUserId() {
		return userId;
	}
	
	public DBUsersInfoBean setUserId(java.lang.Long value) {
		userId = value;
		return this;
	}
	
	
	@DataSource({"level", "level"})
	@DataTarget("level")
	@XMLSimple("level")
	private java.lang.Long level;
	
	public java.lang.Long getLevel() {
		return level;
	}
	
	public DBUsersInfoBean setLevel(java.lang.Long value) {
		level = value;
		return this;
	}
	
	
	@DataSource({"info_id", "infoId"})
	@DataTarget("info_id")
	@XMLSimple("infoId")
	private java.lang.Long infoId;
	
	public java.lang.Long getInfoId() {
		return infoId;
	}
	
	public DBUsersInfoBean setInfoId(java.lang.Long value) {
		infoId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}