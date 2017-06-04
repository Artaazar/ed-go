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
public class DBPilotLastInfoAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "pilot_last_info";
	}
	
	
	public int insert(DBPilotLastInfoBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBPilotLastInfoBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBPilotLastInfoBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBPilotLastInfoBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBPilotLastInfoBean>();
			for (Map<String, Object> res : result) {
				DBPilotLastInfoBean bean = dataMapper.mapFromRow(res, DBPilotLastInfoBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBPilotLastInfoBean getByPrimaryKey(java.lang.Long paramPilotId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBPilotLastInfoBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  pilot_id= ?  "+injector.getWhereQuery()+" ";
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
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramPilotId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBPilotLastInfoBean.class);
			
		}
		return ret;
	}
	
	public int updateByPrimaryKey(DBPilotLastInfoBean bean, java.lang.Long paramPilotId) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		 Map<String, Object> map = dataMapper.mapToRow(bean);
		 Map<String, Object> keys = new HashMap<String, Object>();
		 
		 keys.put("pilot_id",  paramPilotId);
		 
		return getConnection().updateRow("pilot_last_info", map, keys);
	}
	
	public DBLastPilotInfoBean getLastPilotInfo(long paramPilotId) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT li.*, m.*, gm.game_mode 				FROM pilot_last_info li, pilot_game_modes m, game_modes gm 				WHERE li.pilot_id = ? 				AND m.pilot_id = li.pilot_id 				AND m.game_mode_id = gm.game_mode_id 				ORDER BY m.mode_start DESC 				LIMIT 1  			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getLastPilotInfo", query ,  paramPilotId);
		DBLastPilotInfoBean ret = null;
		if (result != null) {
					ret = new DBLastPilotInfoBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBLastPilotInfoBean.class);
					
		}
			
		return ret;
	}
	
	public int updateSupercruiseFlag(long paramIsSupercruise, long paramPilotId) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				UPDATE pilot_last_info li  				SET li.is_supercruise = ? 				WHERE li.pilot_id = ?  				LIMIT 1 			";
		}

		
		int ret = getConnection().query(query,  paramIsSupercruise,  paramPilotId);
			
		return ret;
	}
	
	public DBFullLastInfoBean getFullLastInfo(long paramPilotId) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT pr.*,  				pp.combat as progress_combat, pp.trade as progress_trade, pp.explore as progress_explore, pp.empire as progress_empire, pp.federation as progress_federation, pp.cqc as progress_cqc, 				gm.*, gms.*, s.name as system_name, st.name as station_name, b.body_name, 				pli.*, COUNT(DISTINCT e.event_id) as quered_events , TIMESTAMPDIFF(SECOND, gm.mode_end, NOW()) as last_event, eh.event_name, '' as last_seen, '' as fly_mode  				FROM events_history eh, pilots p 				LEFT JOIN events e ON e.user_id = p.user_id AND is_locked < 3 				LEFT JOIN pilot_game_modes gm ON gm.pilot_game_mode_id = 					(SELECT gm1.pilot_game_mode_id  						FROM pilot_game_modes gm1  						WHERE gm1.pilot_id = p.pilot_id 						AND NOT ISNULL(gm1.mode_end) 						ORDER BY gm1.pilot_game_mode_id DESC 						LIMIT 1 					) 				LEFT JOIN game_modes gms ON gms.game_mode_id = gm.game_mode_id 				LEFT JOIN ranks pr ON pr.pilot_id = p.pilot_id 				LEFT JOIN progress pp ON pp.pilot_id = p.pilot_id 				LEFT JOIN pilot_last_info pli ON pli.pilot_id = p.pilot_id 				LEFT JOIN systems s ON s.system_id = pli.system_id 				LEFT JOIN stations st ON st.station_id = pli.station_id 				LEFT JOIN bodies b ON b.body_id = pli.body_id 				WHERE p.pilot_id = ? 				AND  eh.pilot_id = p.pilot_id 				GROUP BY p.user_id 				LIMIT 1 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getFullLastInfo", query ,  paramPilotId);
		DBFullLastInfoBean ret = null;
		if (result != null) {
					ret = new DBFullLastInfoBean();
				
					ret = dataMapper.mapFromRow(result.get(0), DBFullLastInfoBean.class);
					
		}
			
		return ret;
	}
	
}