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


public class DBBountyTypesBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"bounty_type_uniq", "bountyTypeUniq"})
	@DataTarget("bounty_type_uniq")
	@XMLSimple("bountyTypeUniq")
	private java.lang.String bountyTypeUniq;
	
	public java.lang.String getBountyTypeUniq() {
		return bountyTypeUniq;
	}
	
	public DBBountyTypesBean setBountyTypeUniq(java.lang.String value) {
		this.bountyTypeUniq = value;
		return this;
	}
	
	
	@DataSource({"bounty_type", "bountyType"})
	@DataTarget("bounty_type")
	@XMLSimple("bountyType")
	private java.lang.String bountyType;
	
	public java.lang.String getBountyType() {
		return bountyType;
	}
	
	public DBBountyTypesBean setBountyType(java.lang.String value) {
		this.bountyType = value;
		return this;
	}
	
	
	@DataSource({"bounty_type_id", "bountyTypeId"})
	@DataTarget("bounty_type_id")
	@XMLSimple("bountyTypeId")
	private java.lang.Long bountyTypeId;
	
	public java.lang.Long getBountyTypeId() {
		return bountyTypeId;
	}
	
	public DBBountyTypesBean setBountyTypeId(java.lang.Long value) {
		this.bountyTypeId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setBountyTypeId(new java.lang.Long(value.toString()));
		
	}	
	
}