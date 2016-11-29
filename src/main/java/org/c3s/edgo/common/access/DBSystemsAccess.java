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
public class DBSystemsAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "systems";
	}
	
	
	public int insert(DBSystemsBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBSystemsBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBSystemsBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBSystemsBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBSystemsBean>();
			for (Map<String, Object> res : result) {
				DBSystemsBean bean = dataMapper.mapFromRow(res, DBSystemsBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBSystemsBean getByUniq(java.lang.String paramNameUniq)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBSystemsBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  name_uniq= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			
		}
		sql += injector.getLimitQuery();
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByUniq", sql ,  paramNameUniq);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBSystemsBean.class);
			
		}
		return ret;
	}
	
	public DBSystemsBean getByPrimaryKey(java.math.BigInteger paramSystemId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBSystemsBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  system_id= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			
		}
		sql += injector.getLimitQuery();
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramSystemId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBSystemsBean.class);
			
		}
		return ret;
	}
	
}