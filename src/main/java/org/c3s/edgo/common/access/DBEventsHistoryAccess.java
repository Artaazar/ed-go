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
public class DBEventsHistoryAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "events_history";
	}
	
	
	public int insert(DBEventsHistoryBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBEventsHistoryBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBEventsHistoryBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBEventsHistoryBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBEventsHistoryBean>();
			for (Map<String, Object> res : result) {
				DBEventsHistoryBean bean = dataMapper.mapFromRow(res, DBEventsHistoryBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBEventsHistoryBean getByUserIdTimestampAndHash(java.lang.Long paramUserId, java.sql.Timestamp paramEventTimestamp, java.lang.String paramEventHash)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBEventsHistoryBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1  AND  user_id= ?  AND  event_timestamp= ?  AND  event_hash= ?  "+injector.getWhereQuery()+" ";
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
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByUserIdTimestampAndHash", sql ,  paramUserId,  paramEventTimestamp,  paramEventHash);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBEventsHistoryBean.class);
			
		}
		return ret;
	}
	
	public DBEventsHistoryBean getByPrimaryKey(java.math.BigInteger paramEventsHistoryId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBEventsHistoryBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1  AND  events_history_id= ?  "+injector.getWhereQuery()+" ";
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
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramEventsHistoryId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBEventsHistoryBean.class);
			
		}
		return ret;
	}
	
	public int updateByPrimaryKey(DBEventsHistoryBean bean, java.math.BigInteger paramEventsHistoryId) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		 Map<String, Object> map = dataMapper.mapToRow(bean);
		 Map<String, Object> keys = new HashMap<String, Object>();
		 
		 keys.put("events_history_id",  paramEventsHistoryId);
		 
		return getConnection().updateRow("events_history", map, keys);
	}
	
	public int deleteByPrimaryKey(java.math.BigInteger paramEventsHistoryId) throws SQLException {
		setNames();
		String sql = "DELETE FROM " + tablename + " WHERE  1=1  AND  events_history_id= ?  ";
		return getConnection().query(sql, paramEventsHistoryId);
	}
	
	public DBLastActivityTimeBean getLastActivityTime(long paramPilotId) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT e.event_timestamp, DATE_FORMAT(diffDate, '%Y %m %d') as `event_date`, DATE_FORMAT(diffTime, '%H %i %S') as `event_time` 				, HOUR(difftime) as hours, MINUTE(difftime) as minutes, SECOND(difftime) as seconds 				, YEAR(diffDate) as year, MONTH(diffDate) as monthes, DAY(diffDate) as days  				FROM 					(SELECT e1.event_timestamp, TIMEDIFF(NOW(), e1.event_timestamp) AS diffTime, DATEDIFF(NOW(), e1.event_timestamp) AS diffDate 					FROM events_history e1  					WHERE e1.pilot_id = ? 					ORDER BY e1.event_timestamp DESC 					LIMIT 1  				) AS e 				LIMIT 1 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getLastActivityTime", query ,  paramPilotId);
		DBLastActivityTimeBean ret = null;
		if (result != null) {
					ret = new DBLastActivityTimeBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBLastActivityTimeBean.class);
					
		}
			
		return ret;
	}
	
	public DBLastEventForUserBean getLastEventForUser(long paramUserId) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT h.event_name as `event`, h.event_hash  as `hash`, DATE_FORMAT(h.event_timestamp, '%Y-%m-%dT%TZ') as `timestamp`, GROUP_CONCAT(p.pilot_name SEPARATOR '|||||') as `used_names` 				FROM events_history h  				LEFT JOIN pilots p ON p.user_id = h.user_id 				WHERE h.user_id = ? 				AND h.event_name != 'CompanionApi' 				GROUP BY h.events_history_id 				ORDER BY h.event_timestamp DESC 				LIMIT 1 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getLastEventForUser", query ,  paramUserId);
		DBLastEventForUserBean ret = null;
		if (result != null) {
					ret = new DBLastEventForUserBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBLastEventForUserBean.class);
					
		}
			
		return ret;
	}
	
	public DBEventMaxMinDateForPilotBean getEventMaxMinDateForPilot(org.c3s.db.injectors.EmptySqlInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT p.pilot_id, MAX(DATE(e.event_timestamp)) as max_date, MIN(DATE(e.event_timestamp)) as min_date 				FROM pilots p 				LEFT JOIN events_history e ON e.pilot_id = p.pilot_id  				WHERE 1 = 1 				" + where + " 				GROUP BY p.pilot_id 				LIMIT 1  			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getEventMaxMinDateForPilot", query );
		DBEventMaxMinDateForPilotBean ret = null;
		if (result != null) {
					ret = new DBEventMaxMinDateForPilotBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBEventMaxMinDateForPilotBean.class);
					
		}
			
		return ret;
	}
	
	public List<DBHistoryActivityBean> getHistoryActivity(org.c3s.db.injectors.EmptySqlInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT DAY(e.event_timestamp) as event_date, COUNT(DISTINCT HOUR(e.event_timestamp)) as times 				FROM events_history e 				WHERE 1=1 				" + where + " 				GROUP BY DAY(e.event_timestamp) 				ORDER BY event_date ASC 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getHistoryActivity", query );
		List<DBHistoryActivityBean> ret = null;
		if (result != null) {
					ret = new ArrayList<DBHistoryActivityBean>();
				
			for (Map<String, Object> res : result) {
				DBHistoryActivityBean bean = dataMapper.mapFromRow(res, DBHistoryActivityBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
	public List<DBEventsHistoryBean> getPilotsLastEvents(org.c3s.edgo.common.intruders.EventHistoryPilotsInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT h.* 				FROM events_history h 				WHERE 1=1 				" + where + " 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getPilotsLastEvents", query );
		List<DBEventsHistoryBean> ret = null;
		if (result != null) {
					ret = new ArrayList<DBEventsHistoryBean>();
				
			for (Map<String, Object> res : result) {
				DBEventsHistoryBean bean = dataMapper.mapFromRow(res, DBEventsHistoryBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
}