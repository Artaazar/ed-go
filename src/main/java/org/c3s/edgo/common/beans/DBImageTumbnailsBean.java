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


public class DBImageTumbnailsBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"update_time", "updateTime"})
	@DataTarget("update_time")
	@XMLSimple("updateTime")
	private java.sql.Timestamp updateTime;
	
	public java.sql.Timestamp getUpdateTime() {
		return updateTime;
	}
	
	public DBImageTumbnailsBean setUpdateTime(java.sql.Timestamp value) {
		this.updateTime = value;
		return this;
	}
	
	
	@DataSource({"create_time", "createTime"})
	@DataTarget("create_time")
	@XMLSimple("createTime")
	private java.sql.Timestamp createTime;
	
	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}
	
	public DBImageTumbnailsBean setCreateTime(java.sql.Timestamp value) {
		this.createTime = value;
		return this;
	}
	
	
	@DataSource({"config_id", "configId"})
	@DataTarget("config_id")
	@XMLSimple("configId")
	private java.lang.Long configId;
	
	public java.lang.Long getConfigId() {
		return configId;
	}
	
	public DBImageTumbnailsBean setConfigId(java.lang.Long value) {
		this.configId = value;
		return this;
	}
	
	
	@DataSource({"width", "width"})
	@DataTarget("width")
	@XMLSimple("width")
	private java.lang.Long width;
	
	public java.lang.Long getWidth() {
		return width;
	}
	
	public DBImageTumbnailsBean setWidth(java.lang.Long value) {
		this.width = value;
		return this;
	}
	
	
	@DataSource({"tumbnail_id", "tumbnailId"})
	@DataTarget("tumbnail_id")
	@XMLSimple("tumbnailId")
	private java.lang.Long tumbnailId;
	
	public java.lang.Long getTumbnailId() {
		return tumbnailId;
	}
	
	public DBImageTumbnailsBean setTumbnailId(java.lang.Long value) {
		this.tumbnailId = value;
		return this;
	}
	
	
	@DataSource({"image_id", "imageId"})
	@DataTarget("image_id")
	@XMLSimple("imageId")
	private java.lang.Long imageId;
	
	public java.lang.Long getImageId() {
		return imageId;
	}
	
	public DBImageTumbnailsBean setImageId(java.lang.Long value) {
		this.imageId = value;
		return this;
	}
	
	
	@DataSource({"height", "height"})
	@DataTarget("height")
	@XMLSimple("height")
	private java.lang.Long height;
	
	public java.lang.Long getHeight() {
		return height;
	}
	
	public DBImageTumbnailsBean setHeight(java.lang.Long value) {
		this.height = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setTumbnailId(new java.lang.Long(value.toString()));
		
	}	
	
}