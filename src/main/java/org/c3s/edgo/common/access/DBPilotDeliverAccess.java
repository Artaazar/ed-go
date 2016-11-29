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
public class DBPilotDeliverAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "pilot_deliver";
	}
	
	
	public int insert(DBPilotDeliverBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBPilotDeliverBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBPilotDeliverBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBPilotDeliverBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBPilotDeliverBean>();
			for (Map<String, Object> res : result) {
				DBPilotDeliverBean bean = dataMapper.mapFromRow(res, DBPilotDeliverBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public List<DBPilotDeliverBean> getHistoryByPilotId(java.lang.Long paramPilotId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<DBPilotDeliverBean> ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  pilot_id= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			sql += "ORDER BY start_week DESC";
			
		}
		sql += injector.getLimitQuery();
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getHistoryByPilotId", sql ,  paramPilotId);
		if (result != null) {
			
			ret = new ArrayList<DBPilotDeliverBean>();
			for (Map<String, Object> res : result) {
				DBPilotDeliverBean bean = dataMapper.mapFromRow(res, DBPilotDeliverBean.class);
				 
				ret.add(bean);
			}
				
		}
		return ret;
	}
	
	public DBPilotDeliverBean getByPrimaryKey(java.lang.Long paramPilotDeliverId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBPilotDeliverBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  pilot_deliver_id= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			
		}
		sql += injector.getLimitQuery();
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramPilotDeliverId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBPilotDeliverBean.class);
			
		}
		return ret;
	}
	
	public DBPilotDeliverBean getByPilotIdAndSystemIdAndWeek(java.lang.Long paramPilotId, java.math.BigInteger paramSystemId, java.sql.Timestamp paramStartWeek)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBPilotDeliverBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  pilot_id= ? AND  system_id= ? AND  start_week= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			
		}
		sql += injector.getLimitQuery();
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPilotIdAndSystemIdAndWeek", sql ,  paramPilotId,  paramSystemId,  paramStartWeek);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBPilotDeliverBean.class);
			
		}
		return ret;
	}
	
	public int updateByPrimaryKey(DBPilotDeliverBean bean, java.lang.Long paramPilotDeliverId) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		 Map<String, Object> map = dataMapper.mapToRow(bean);
		 Map<String, Object> keys = new HashMap<String, Object>();
		 
		 keys.put("pilot_deliver_id",  paramPilotDeliverId);
		 
		return getConnection().updateRow("pilot_deliver", map, keys);
	}
	
	public int deleteByPrimaryKey(java.lang.Long paramPilotDeliverId) throws SQLException {
		setNames();
		String sql = "DELETE FROM " + tablename + " WHERE  1=1 AND  pilot_deliver_id= ?  ";
		return getConnection().query(sql, paramPilotDeliverId);
	}
	
	public List<DBPilotDeliverBean> getListForPilots(org.c3s.edgo.common.intruders.InInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		if (paramIntruder != null) {
			injector = paramIntruder;
		}
		
		
		String query = injector.getFullQuery();
		if (query == null) {
			String record = injector.getRecordQuery();
			String from = injector.getFromQuery();
			String join = injector.getJoinQuery();
			String where = injector.getWhereQuery();
			String order = injector.getOrderQuery();
			String limit = injector.getLimitQuery();
			query = " 				SELECT t.*, s.name as system_name 				FROM pilot_deliver t, systems s 				WHERE 1=1 				" + where + " 				AND t.system_id = s.system_id 				ORDER BY start_week DESC 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getListForPilots", query );
		List<DBPilotDeliverBean> ret = null;
		if (result != null) {
					ret = new ArrayList<DBPilotDeliverBean>();
				
			for (Map<String, Object> res : result) {
				DBPilotDeliverBean bean = dataMapper.mapFromRow(res, DBPilotDeliverBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
}