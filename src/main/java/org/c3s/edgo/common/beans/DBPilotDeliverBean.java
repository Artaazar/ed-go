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


public class DBPilotDeliverBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"quantity", "quantity"})
	@DataTarget("quantity")
	@XMLSimple("quantity")
	private java.lang.Long quantity;
	
	public java.lang.Long getQuantity() {
		return quantity;
	}
	
	public DBPilotDeliverBean setQuantity(java.lang.Long value) {
		this.quantity = value;
		return this;
	}
	
	
	@DataSource({"system_id", "systemId"})
	@DataTarget("system_id")
	@XMLSimple("systemId")
	private java.math.BigInteger systemId;
	
	public java.math.BigInteger getSystemId() {
		return systemId;
	}
	
	public DBPilotDeliverBean setSystemId(java.math.BigInteger value) {
		this.systemId = value;
		return this;
	}
	
	
	@DataSource({"pilot_power_id", "pilotPowerId"})
	@DataTarget("pilot_power_id")
	@XMLSimple("pilotPowerId")
	private java.lang.Long pilotPowerId;
	
	public java.lang.Long getPilotPowerId() {
		return pilotPowerId;
	}
	
	public DBPilotDeliverBean setPilotPowerId(java.lang.Long value) {
		this.pilotPowerId = value;
		return this;
	}
	
	
	@DataSource({"pilot_deliver_id", "pilotDeliverId"})
	@DataTarget("pilot_deliver_id")
	@XMLSimple("pilotDeliverId")
	private java.lang.Long pilotDeliverId;
	
	public java.lang.Long getPilotDeliverId() {
		return pilotDeliverId;
	}
	
	public DBPilotDeliverBean setPilotDeliverId(java.lang.Long value) {
		this.pilotDeliverId = value;
		return this;
	}
	
	
	@DataSource({"start_week", "startWeek"})
	@DataTarget("start_week")
	@XMLSimple("startWeek")
	private java.sql.Timestamp startWeek;
	
	public java.sql.Timestamp getStartWeek() {
		return startWeek;
	}
	
	public DBPilotDeliverBean setStartWeek(java.sql.Timestamp value) {
		this.startWeek = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBPilotDeliverBean setPilotId(java.lang.Long value) {
		this.pilotId = value;
		return this;
	}
	
	
	@DataSource({"system_name", "systemName"})
	@DataTarget("system_name")
	@XMLSimple("systemName")

	private String systemName;
	
	public String getSystemName() {
		return systemName;
	}
	
	public DBPilotDeliverBean setSystemName(String value) {
		this.systemName = value;
		return this;
	}
	
	
	@DataSource({"quantity_summ", "quantitySumm"})
	@DataTarget("quantity_summ")
	@XMLSimple("quantitySumm")

	private java.math.BigDecimal quantitySumm;
	
	public java.math.BigDecimal getQuantitySumm() {
		return quantitySumm;
	}
	
	public DBPilotDeliverBean setQuantitySumm(java.math.BigDecimal value) {
		this.quantitySumm = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setPilotDeliverId(new java.lang.Long(value.toString()));
		
	}	
	
}