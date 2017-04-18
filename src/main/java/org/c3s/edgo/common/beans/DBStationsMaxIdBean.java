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


public class DBStationsMaxIdBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"max_station_id", "maxStationId"})
	@DataTarget("max_station_id")
	@XMLSimple("maxStationId")
	private java.lang.Long maxStationId;
	
	public java.lang.Long getMaxStationId() {
		return maxStationId;
	}
	
	public DBStationsMaxIdBean setMaxStationId(java.lang.Long value) {
		maxStationId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}