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


public class DBRanksBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"federation", "federation"})
	@DataTarget("federation")
	@XMLSimple("federation")
	private java.lang.Integer federation;
	
	public java.lang.Integer getFederation() {
		return federation;
	}
	
	public DBRanksBean setFederation(java.lang.Integer value) {
		federation = value;
		return this;
	}
	
	
	@DataSource({"trade", "trade"})
	@DataTarget("trade")
	@XMLSimple("trade")
	private java.lang.Integer trade;
	
	public java.lang.Integer getTrade() {
		return trade;
	}
	
	public DBRanksBean setTrade(java.lang.Integer value) {
		trade = value;
		return this;
	}
	
	
	@DataSource({"explore", "explore"})
	@DataTarget("explore")
	@XMLSimple("explore")
	private java.lang.Integer explore;
	
	public java.lang.Integer getExplore() {
		return explore;
	}
	
	public DBRanksBean setExplore(java.lang.Integer value) {
		explore = value;
		return this;
	}
	
	
	@DataSource({"cqc", "cqc"})
	@DataTarget("cqc")
	@XMLSimple("cqc")
	private java.lang.Integer cqc;
	
	public java.lang.Integer getCqc() {
		return cqc;
	}
	
	public DBRanksBean setCqc(java.lang.Integer value) {
		cqc = value;
		return this;
	}
	
	
	@DataSource({"empire", "empire"})
	@DataTarget("empire")
	@XMLSimple("empire")
	private java.lang.Integer empire;
	
	public java.lang.Integer getEmpire() {
		return empire;
	}
	
	public DBRanksBean setEmpire(java.lang.Integer value) {
		empire = value;
		return this;
	}
	
	
	@DataSource({"combat", "combat"})
	@DataTarget("combat")
	@XMLSimple("combat")
	private java.lang.Integer combat;
	
	public java.lang.Integer getCombat() {
		return combat;
	}
	
	public DBRanksBean setCombat(java.lang.Integer value) {
		combat = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBRanksBean setPilotId(java.lang.Long value) {
		pilotId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}