/**
 *  Autogenerated class
 */
package org.c3s.edgo.common.access;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.c3s.db.access.Access;
import org.c3s.db.*;
import org.c3s.db.beans.*;
import org.c3s.db.injectors.SqlInjectorInterface;
import org.c3s.db.injectors.EmptySqlInjector;
import org.c3s.data.mapers.*;
import org.c3s.data.cast.*;


import org.c3s.edgo.common.beans.*;


@SuppressWarnings("unused")
public class DBPilotModulesAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "pilot_modules";
	}
	
	
	public int insert(DBPilotModulesBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBPilotModulesBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBPilotModulesBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBPilotModulesBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBPilotModulesBean>();
			for (Map<String, Object> res : result) {
				DBPilotModulesBean bean = dataMapper.mapFromRow(res, DBPilotModulesBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBPilotModulesBean getByPrimaryKey(java.lang.Long paramPilotModuleId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBPilotModulesBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  pilot_module_id= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			
		}
		sql += injector.getLimitQuery();
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramPilotModuleId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBPilotModulesBean.class);
			
		}
		return ret;
	}
	
	public int updateByPrimaryKey(DBPilotModulesBean bean, java.lang.Long paramPilotModuleId) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		 Map<String, Object> map = dataMapper.mapToRow(bean);
		 Map<String, Object> keys = new HashMap<String, Object>();
		 
		 keys.put("pilot_module_id",  paramPilotModuleId);
		 
		return getConnection().updateRow("pilot_modules", map, keys);
	}
	
	public int deleteByPrimaryKey(java.lang.Long paramPilotModuleId) throws SQLException {
		setNames();
		String sql = "DELETE FROM " + tablename + " WHERE  1=1 AND  pilot_module_id= ?  ";
		return getConnection().query(sql, paramPilotModuleId);
	}
	
	public List<DBPilotShipModulesListBean> getPilotShipModulesList(long paramPilotShipId) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		
		String query = injector.getFullQuery();
		if (query == null) {
			String record = injector.getRecordQuery();
			String from = injector.getRecordQuery();
			String join = injector.getRecordQuery();
			String where = injector.getRecordQuery();
			String order = injector.getRecordQuery();
			String limit = injector.getRecordQuery();
			query = " 				SELECT ps.pilot_ship_id, sh.ship_name, sl.slot_uniq, st.slot_type_name, st.slot_type_id, m.*, mg.* 				FROM (pilot_ships ps, ships sh, ship_slots ss, slots sl, slot_types st) 				LEFT JOIN  pilot_modules pm ON pm.pilot_ship_id = ps.pilot_ship_id AND pm.slot_id = sl.slot_id 				LEFT JOIN modules m ON m.module_id = pm.module_id 				LEFT JOIN module_groups mg ON mg.module_group_id = m.module_group_id 				WHERE ps.pilot_ship_id = ? 				AND ps.ship_id = sh.ship_id  				AND ss.ship_id = sh.ship_id 				AND sl.slot_id = ss.slot_id 				AND st.slot_type_id = sl.slot_type_id 				ORDER BY st.slot_type_name, m.module_class DESC, m.module_rating 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getPilotShipModulesList", query ,  paramPilotShipId);
		List<DBPilotShipModulesListBean> ret = new ArrayList<DBPilotShipModulesListBean>();
		if (result != null) {
				
			for (Map<String, Object> res : result) {
				DBPilotShipModulesListBean bean = dataMapper.mapFromRow(res, DBPilotShipModulesListBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
}