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
public class DBUserKeysAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "user_keys";
	}
	
	
	public int insert(DBUserKeysBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBUserKeysBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBUserKeysBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBUserKeysBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBUserKeysBean>();
			for (Map<String, Object> res : result) {
				DBUserKeysBean bean = dataMapper.mapFromRow(res, DBUserKeysBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBUserKeysBean getByPrimaryKey(java.lang.Long paramUserKeyId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBUserKeysBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1  AND  user_key_id= ?  "+injector.getWhereQuery()+" ";
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
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramUserKeyId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBUserKeysBean.class);
			
		}
		return ret;
	}
	
	public int updateByPrimaryKey(DBUserKeysBean bean, java.lang.Long paramUserKeyId) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		 Map<String, Object> map = dataMapper.mapToRow(bean);
		 Map<String, Object> keys = new HashMap<String, Object>();
		 
		 keys.put("user_key_id",  paramUserKeyId);
		 
		return getConnection().updateRow("user_keys", map, keys);
	}
	
	public int deleteByPrimaryKey(java.lang.Long paramUserKeyId) throws SQLException {
		setNames();
		String sql = "DELETE FROM " + tablename + " WHERE  1=1  AND  user_key_id= ?  ";
		return getConnection().query(sql, paramUserKeyId);
	}
	
	public int updateSessionKey(String paramSession, long paramUserKeyId) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				UPDATE user_keys SET session_key = ? WHERE user_key_id = ? LIMIT 1  			";
		}

		
		int ret = getConnection().query(query,  paramSession,  paramUserKeyId);
			
		return ret;
	}
	
}