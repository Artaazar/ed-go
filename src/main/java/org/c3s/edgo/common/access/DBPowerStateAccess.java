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
public class DBPowerStateAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "power_state";
	}
	
	
	public int insert(DBPowerStateBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBPowerStateBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBPowerStateBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBPowerStateBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBPowerStateBean>();
			for (Map<String, Object> res : result) {
				DBPowerStateBean bean = dataMapper.mapFromRow(res, DBPowerStateBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBPowerStateBean getByPrimaryKey(java.lang.Long paramPowerStateId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBPowerStateBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  power_state_id= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			
		}
		sql += injector.getLimitQuery();
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramPowerStateId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBPowerStateBean.class);
			
		}
		return ret;
	}
	
	public int updateByPrimaryKey(DBPowerStateBean bean, java.lang.Long paramPowerStateId) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		 Map<String, Object> map = dataMapper.mapToRow(bean);
		 Map<String, Object> keys = new HashMap<String, Object>();
		 
		 keys.put("power_state_id",  paramPowerStateId);
		 
		return getConnection().updateRow("power_state", map, keys);
	}
	
	public int deleteByPrimaryKey(java.lang.Long paramPowerStateId) throws SQLException {
		setNames();
		String sql = "DELETE FROM " + tablename + " WHERE  1=1 AND  power_state_id= ?  ";
		return getConnection().query(sql, paramPowerStateId);
	}
	
	public DBPrevWeekSystemStateSingleBean getPrevWeekSystemStateSingle(java.math.BigInteger paramSystemId, java.sql.Timestamp paramWeekStart, java.sql.Timestamp paramWeekStartAdd) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT p.*, ps.*, pt.* 				FROM powers p, power_state ps, power_state_type pt 				WHERE ps.system_id = ? 				AND ps.power_state_type_id = pt.power_state_type_id 				AND (pt.is_permanent = 0 AND ps.start_week = ? 				OR pt.is_weekly = 0 AND ps.start_week <= ? 				OR pt.is_permanent = 1) 				AND p.power_id = ps.power_id 				LIMIT 1 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getPrevWeekSystemStateSingle", query ,  paramSystemId,  paramWeekStart,  paramWeekStartAdd);
		DBPrevWeekSystemStateSingleBean ret = null;
		if (result != null) {
					ret = new DBPrevWeekSystemStateSingleBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBPrevWeekSystemStateSingleBean.class);
					
		}
			
		return ret;
	}
	
	public DBPrevWeekSystemStateCountBean getPrevWeekSystemStateCount(java.math.BigInteger paramSystemId, java.sql.Timestamp paramWeekStart, java.sql.Timestamp paramWeekStartAdd) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT count(ps.power_state_id) as count 				FROM power_state ps, power_state_type pt 				WHERE ps.system_id = ? 				AND ps.power_state_type_id = pt.power_state_type_id 				AND (pt.is_permanent = 0 AND ps.start_week = ? 				OR pt.is_weekly = 0 AND ps.start_week <= ? 				OR pt.is_permanent = 1) 				LIMIT 1 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getPrevWeekSystemStateCount", query ,  paramSystemId,  paramWeekStart,  paramWeekStartAdd);
		DBPrevWeekSystemStateCountBean ret = null;
		if (result != null) {
					ret = new DBPrevWeekSystemStateCountBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBPrevWeekSystemStateCountBean.class);
					
		}
			
		return ret;
	}
	
}