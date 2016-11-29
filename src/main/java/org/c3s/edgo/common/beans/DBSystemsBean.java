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


public class DBSystemsBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"system_id", "systemId"})
	@DataTarget("system_id")
	@XMLSimple("systemId")
	private java.math.BigInteger systemId;
	
	public java.math.BigInteger getSystemId() {
		return systemId;
	}
	
	public DBSystemsBean setSystemId(java.math.BigInteger value) {
		systemId = value;
		return this;
	}
	
	
	@DataSource({"x", "x"})
	@DataTarget("x")
	@XMLSimple("x")
	private java.lang.Double x;
	
	public java.lang.Double getX() {
		return x;
	}
	
	public DBSystemsBean setX(java.lang.Double value) {
		x = value;
		return this;
	}
	
	
	@DataSource({"name", "name"})
	@DataTarget("name")
	@XMLSimple("name")
	private java.lang.String name;
	
	public java.lang.String getName() {
		return name;
	}
	
	public DBSystemsBean setName(java.lang.String value) {
		name = value;
		return this;
	}
	
	
	@DataSource({"is_populated", "isPopulated"})
	@DataTarget("is_populated")
	@XMLSimple("isPopulated")
	private java.lang.Integer isPopulated;
	
	public java.lang.Integer getIsPopulated() {
		return isPopulated;
	}
	
	public DBSystemsBean setIsPopulated(java.lang.Integer value) {
		isPopulated = value;
		return this;
	}
	
	
	@DataSource({"y", "y"})
	@DataTarget("y")
	@XMLSimple("y")
	private java.lang.Double y;
	
	public java.lang.Double getY() {
		return y;
	}
	
	public DBSystemsBean setY(java.lang.Double value) {
		y = value;
		return this;
	}
	
	
	@DataSource({"z", "z"})
	@DataTarget("z")
	@XMLSimple("z")
	private java.lang.Double z;
	
	public java.lang.Double getZ() {
		return z;
	}
	
	public DBSystemsBean setZ(java.lang.Double value) {
		z = value;
		return this;
	}
	
	
	@DataSource({"name_stations", "nameStations"})
	@DataTarget("name_stations")
	@XMLSimple("nameStations")
	private java.lang.String nameStations;
	
	public java.lang.String getNameStations() {
		return nameStations;
	}
	
	public DBSystemsBean setNameStations(java.lang.String value) {
		nameStations = value;
		return this;
	}
	
	
	@DataSource({"name_uniq", "nameUniq"})
	@DataTarget("name_uniq")
	@XMLSimple("nameUniq")
	private java.lang.String nameUniq;
	
	public java.lang.String getNameUniq() {
		return nameUniq;
	}
	
	public DBSystemsBean setNameUniq(java.lang.String value) {
		nameUniq = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}