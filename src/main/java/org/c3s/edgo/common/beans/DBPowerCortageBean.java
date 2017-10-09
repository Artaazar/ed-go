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


public class DBPowerCortageBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"weeks", "weeks"})
	@DataTarget("weeks")
	@XMLFieldList

	private List<? extends Object> weeks;
	
	public List<? extends Object> getWeeks() {
		return weeks;
	}
	
	public DBPowerCortageBean setWeeks(List<? extends Object> value) {
		this.weeks = value;
		return this;
	}
	
	
	@DataSource({"merits_war", "meritsWar"})
	@DataTarget("merits_war")
	@XMLFieldList

	private List<? extends Object> meritsWar;
	
	public List<? extends Object> getMeritsWar() {
		return meritsWar;
	}
	
	public DBPowerCortageBean setMeritsWar(List<? extends Object> value) {
		this.meritsWar = value;
		return this;
	}
	
	
	@DataSource({"merits_kill", "meritsKill"})
	@DataTarget("merits_kill")
	@XMLFieldList

	private List<? extends Object> meritsKill;
	
	public List<? extends Object> getMeritsKill() {
		return meritsKill;
	}
	
	public DBPowerCortageBean setMeritsKill(List<? extends Object> value) {
		this.meritsKill = value;
		return this;
	}
	
	
	@DataSource({"merits_deliver", "meritsDeliver"})
	@DataTarget("merits_deliver")
	@XMLFieldList

	private List<? extends Object> meritsDeliver;
	
	public List<? extends Object> getMeritsDeliver() {
		return meritsDeliver;
	}
	
	public DBPowerCortageBean setMeritsDeliver(List<? extends Object> value) {
		this.meritsDeliver = value;
		return this;
	}
	
	
	@DataSource({"credits_spend", "creditsSpend"})
	@DataTarget("credits_spend")
	@XMLFieldList

	private List<? extends Object> creditsSpend;
	
	public List<? extends Object> getCreditsSpend() {
		return creditsSpend;
	}
	
	public DBPowerCortageBean setCreditsSpend(List<? extends Object> value) {
		this.creditsSpend = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}