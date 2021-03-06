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
public class DBMissionsAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "missions";
	}
	
	
	public int insert(DBMissionsBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBMissionsBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBMissionsBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBMissionsBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBMissionsBean>();
			for (Map<String, Object> res : result) {
				DBMissionsBean bean = dataMapper.mapFromRow(res, DBMissionsBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBMissionsBean getByPrimaryKey(java.math.BigInteger paramMissionId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBMissionsBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1  AND  mission_id= ?  "+injector.getWhereQuery()+" ";
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
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramMissionId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBMissionsBean.class);
			
		}
		return ret;
	}
	
	public DBMissionsBean getByPilotIdAndLinkId(java.lang.Long paramPilotId, java.lang.Long paramMissionLinkId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBMissionsBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1  AND  pilot_id= ?  AND  mission_link_id= ?  "+injector.getWhereQuery()+" ";
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
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPilotIdAndLinkId", sql ,  paramPilotId,  paramMissionLinkId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBMissionsBean.class);
			
		}
		return ret;
	}
	
	public int updateByPrimaryKey(DBMissionsBean bean, java.math.BigInteger paramMissionId) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		 Map<String, Object> map = dataMapper.mapToRow(bean);
		 Map<String, Object> keys = new HashMap<String, Object>();
		 
		 keys.put("mission_id",  paramMissionId);
		 
		return getConnection().updateRow("missions", map, keys);
	}
	
	public int deleteByPrimaryKey(java.math.BigInteger paramMissionId) throws SQLException {
		setNames();
		String sql = "DELETE FROM " + tablename + " WHERE  1=1  AND  mission_id= ?  ";
		return getConnection().query(sql, paramMissionId);
	}
	
	public List<DBMissionsComplitedListByPilotsBean> getMissionsComplitedListByPilots(org.c3s.edgo.common.intruders.CommonInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT m.*, DATE_FORMAT(m.complete_date, '%Y-%m-%d %T') AS mission_date, t.*, f.faction_id, f.name as faction_name, s.name as system_name, st.name as station_name,  					s1.name as target_system_name, st1.name as target_station_name, 					GROUP_CONCAT(DISTINCT rc.commodity_id SEPARATOR ',') as commodity_idx, GROUP_CONCAT(DISTINCT rm.material_id SEPARATOR ',') as material_idx 				FROM mission_types t, factions f, (missions m, station_history h) 				LEFT JOIN reward_commodities rc ON rc.mission_id = m.mission_id  				LEFT JOIN reward_materials rm ON rm.mission_id = m.mission_id 				LEFT JOIN location_history l ON l.location_id = h.location_id  				LEFT JOIN systems s ON s.system_id = l.system_id 				LEFT JOIN stations st ON st.station_id = h.station_id 				LEFT JOIN systems s1 ON s1.system_id = m.target_system_id 				LEFT JOIN stations st1 ON st1.station_id = m.target_station_id 				LEFT JOIN bodies b ON b.body_id = h.body_id 				WHERE 1=1  				" + where + " 				AND NOT ISNULL(m.complete_date) 				AND t.mission_type_id = m.mission_type_id 				AND f.faction_id = m.faction_id 				AND h.station_history_id = m.station_history_id 				GROUP BY m.mission_id  				ORDER BY m.complete_date DESC 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getMissionsComplitedListByPilots", query );
		List<DBMissionsComplitedListByPilotsBean> ret = null;
		if (result != null) {
					ret = new ArrayList<DBMissionsComplitedListByPilotsBean>();
				
			for (Map<String, Object> res : result) {
				DBMissionsComplitedListByPilotsBean bean = dataMapper.mapFromRow(res, DBMissionsComplitedListByPilotsBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
	public DBMissionsBean getgetLastComplitedByPilotId(long parampilot_id) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT m.*  				FROM missions m  				WHERE m.pilot_id = ? 				AND NOT ISNULL(m.complete_date) 				ORDER BY m.complete_date DESC 				LIMIT 1  			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getgetLastComplitedByPilotId", query ,  parampilot_id);
		DBMissionsBean ret = null;
		if (result != null) {
					ret = new DBMissionsBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBMissionsBean.class);
					
		}
			
		return ret;
	}
	
	public List<DBMissionsSystemsListBean> getMissionsSystemsList(org.c3s.edgo.common.intruders.InInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT s.system_id, s.name as system_name 				FROM missions m, station_history h, location_history l, systems s 				WHERE NOT ISNULL(m.complete_date) 				" + where + " 				AND h.station_history_id = m.station_history_id 				AND l.location_id = h.location_id 				AND s.system_id = l.system_id 				GROUP BY s.system_id 				ORDER BY system_name 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getMissionsSystemsList", query );
		List<DBMissionsSystemsListBean> ret = null;
		if (result != null) {
					ret = new ArrayList<DBMissionsSystemsListBean>();
				
			for (Map<String, Object> res : result) {
				DBMissionsSystemsListBean bean = dataMapper.mapFromRow(res, DBMissionsSystemsListBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
	public List<DBMissionsDateRangeBean> getMissionsDateRange(org.c3s.edgo.common.intruders.InInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT DATE_FORMAT(MIN(m.complete_date), '%Y-%m-%d') AS min_date, DATE_FORMAT(MAX(m.complete_date), '%Y-%m-%d') AS max_date 				FROM missions m 				WHERE NOT ISNULL(m.complete_date) 				" + where + " 				GROUP BY m.pilot_id				 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getMissionsDateRange", query );
		List<DBMissionsDateRangeBean> ret = null;
		if (result != null) {
					ret = new ArrayList<DBMissionsDateRangeBean>();
				
			for (Map<String, Object> res : result) {
				DBMissionsDateRangeBean bean = dataMapper.mapFromRow(res, DBMissionsDateRangeBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
	public List<DBMissionsFactionsListBean> getMissionsFactionsList(org.c3s.edgo.common.intruders.InInjector paramIntruder) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT f.faction_id, f.name as faction_name 				FROM missions m, factions f 				WHERE NOT ISNULL(m.complete_date) 				" + where + " 				AND f.faction_id = m.faction_id 				GROUP BY f.faction_id 				ORDER BY faction_name 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getMissionsFactionsList", query );
		List<DBMissionsFactionsListBean> ret = null;
		if (result != null) {
					ret = new ArrayList<DBMissionsFactionsListBean>();
				
			for (Map<String, Object> res : result) {
				DBMissionsFactionsListBean bean = dataMapper.mapFromRow(res, DBMissionsFactionsListBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
}