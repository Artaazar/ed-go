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
public class DBLocationSystemHistoryAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "location_system_history";
	}
	
	
	public int insert(DBLocationSystemHistoryBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBLocationSystemHistoryBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBLocationSystemHistoryBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBLocationSystemHistoryBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBLocationSystemHistoryBean>();
			for (Map<String, Object> res : result) {
				DBLocationSystemHistoryBean bean = dataMapper.mapFromRow(res, DBLocationSystemHistoryBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBLocationSystemHistoryBean getLastSystemLocation(java.lang.Long paramPilotId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBLocationSystemHistoryBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  pilot_id= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			sql += "ORDER BY location_time DESC";
			
		}
		String limit = injector.getLimitQuery();
		if (limit.length() != 0) {
			sql += limit;
		} else {
			sql += " LIMIT 1";
		}
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getLastSystemLocation", sql ,  paramPilotId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBLocationSystemHistoryBean.class);
			
		}
		return ret;
	}
	
	public DBLocationSystemHistoryBean getByPrimaryKey(java.math.BigInteger paramLocationSystemId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBLocationSystemHistoryBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  location_system_id= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			
		}
		String limit = injector.getLimitQuery();
		if (limit.length() != 0) {
			sql += limit;
		} else {
			sql += " LIMIT 1";
		}
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramLocationSystemId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBLocationSystemHistoryBean.class);
			
		}
		return ret;
	}
	
	public DBLocationSystemHistoryBean getLastLocationForPilot(long paramPilotId) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		
		String query = injector.getFullQuery();
		if (query == null) {
			String record = injector.getRecordQuery();
			String from = injector.getFromQuery();
			String join = injector.getJoinQuery();
			String where = injector.getWhereQuery();
			String order = injector.getOrderQuery();
			String limit = injector.getLimitQuery();
			query = " 				SELECT l.*, sy.name as system_name 				FROM location_system_history l 				LEFT JOIN systems sy ON l.system_id = sy.system_id 				WHERE l.pilot_id = ? 				ORDER BY l.location_time DESC 				LIMIT 1  			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getLastLocationForPilot", query ,  paramPilotId);
		DBLocationSystemHistoryBean ret = null;
		if (result != null) {
					ret = new DBLocationSystemHistoryBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBLocationSystemHistoryBean.class);
					
		}
			
		return ret;
	}
	
	public DBMaxMinDateSystemHistoryForPilotBean getMaxMinDateSystemHistoryForPilot(org.c3s.db.injectors.EmptySqlInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT p.pilot_id, MAX(DATE(l.location_time)) as max_date, MIN(DATE(l.location_time)) as min_date 				FROM pilots p 				LEFT JOIN location_system_history l ON l.pilot_id = p.pilot_id  				WHERE 1 = 1 				" + where + " 				GROUP BY p.pilot_id 				LIMIT 1  			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getMaxMinDateSystemHistoryForPilot", query );
		DBMaxMinDateSystemHistoryForPilotBean ret = null;
		if (result != null) {
					ret = new DBMaxMinDateSystemHistoryForPilotBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBMaxMinDateSystemHistoryForPilotBean.class);
					
		}
			
		return ret;
	}
	
	public List<DBSystemPathBean> getSystemPath(long paramPilotId, org.c3s.db.injectors.EmptySqlInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT l.*, sy.name as system_name, sy.x, sy.y, sy.z, DATE_FORMAT(l.location_time, '%Y-%m-%d %T') as `timestamp`, 					CONCAT('[', FORMAT(sy.x, 2), ',', FORMAT(sy.y, 2), ',', FORMAT(sy.z, 2), ']') as position, FORMAT(SQRT(sy.x * sy.x + sy.y * sy.y + sy.z * sy.z), 2) as distance 				FROM location_system_history l 				LEFT JOIN systems sy ON l.system_id = sy.system_id 				WHERE 1 = 1 				" + where + " 				ORDER BY l.location_time DESC 				 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getSystemPath", query ,  paramPilotId);
		List<DBSystemPathBean> ret = null;
		if (result != null) {
					ret = new ArrayList<DBSystemPathBean>();
				
			for (Map<String, Object> res : result) {
				DBSystemPathBean bean = dataMapper.mapFromRow(res, DBSystemPathBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
	public DBSystemPathCountBean getSystemPathCount(long paramPilotId, org.c3s.db.injectors.EmptySqlInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT count(l.location_system_id) as count  				FROM location_system_history l 				WHERE l.pilot_id = ? 				" + where + " 				LIMIT 1 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getSystemPathCount", query ,  paramPilotId);
		DBSystemPathCountBean ret = null;
		if (result != null) {
					ret = new DBSystemPathCountBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBSystemPathCountBean.class);
					
		}
			
		return ret;
	}
	
}