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
public class DBPilotGameModesAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "pilot_game_modes";
	}
	
	
	public int insert(DBPilotGameModesBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBPilotGameModesBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBPilotGameModesBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBPilotGameModesBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBPilotGameModesBean>();
			for (Map<String, Object> res : result) {
				DBPilotGameModesBean bean = dataMapper.mapFromRow(res, DBPilotGameModesBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBPilotGameModesBean getLastByPilotId(java.lang.Long paramPilotId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBPilotGameModesBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  pilot_id= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			sql += "ORDER BY BY mode_start DESC";
			
		}
		String limit = injector.getLimitQuery();
		if (limit.length() != 0) {
			sql += limit;
		} else {
			sql += " LIMIT 1";
		}
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getLastByPilotId", sql ,  paramPilotId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBPilotGameModesBean.class);
			
		}
		return ret;
	}
	
	public DBPilotGameModesBean getByPrimaryKey(java.math.BigInteger paramPilotGameModeId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBPilotGameModesBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  pilot_game_mode_id= ?  "+injector.getWhereQuery()+" ";
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
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramPilotGameModeId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBPilotGameModesBean.class);
			
		}
		return ret;
	}
	
	public int updateByPrimaryKey(DBPilotGameModesBean bean, java.math.BigInteger paramPilotGameModeId) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		 Map<String, Object> map = dataMapper.mapToRow(bean);
		 Map<String, Object> keys = new HashMap<String, Object>();
		 
		 keys.put("pilot_game_mode_id",  paramPilotGameModeId);
		 
		return getConnection().updateRow("pilot_game_modes", map, keys);
	}
	
}