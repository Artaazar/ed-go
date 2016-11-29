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


public class DBPilotMaterialsBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"quantity", "quantity"})
	@DataTarget("quantity")
	@XMLSimple("quantity")
	private java.lang.Integer quantity;
	
	public java.lang.Integer getQuantity() {
		return quantity;
	}
	
	public DBPilotMaterialsBean setQuantity(java.lang.Integer value) {
		quantity = value;
		return this;
	}
	
	
	@DataSource({"material_id", "materialId"})
	@DataTarget("material_id")
	@XMLSimple("materialId")
	private java.lang.Long materialId;
	
	public java.lang.Long getMaterialId() {
		return materialId;
	}
	
	public DBPilotMaterialsBean setMaterialId(java.lang.Long value) {
		materialId = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBPilotMaterialsBean setPilotId(java.lang.Long value) {
		pilotId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}