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
public class DBMaterialCategoryAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "material_category";
	}
	
	
	public int insert(DBMaterialCategoryBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBMaterialCategoryBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBMaterialCategoryBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBMaterialCategoryBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBMaterialCategoryBean>();
			for (Map<String, Object> res : result) {
				DBMaterialCategoryBean bean = dataMapper.mapFromRow(res, DBMaterialCategoryBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBMaterialCategoryBean getByUniq(java.lang.String paramMaterialCategoryName)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBMaterialCategoryBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  material_category_name= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			
		}
		sql += injector.getLimitQuery();
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByUniq", sql ,  paramMaterialCategoryName);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBMaterialCategoryBean.class);
			
		}
		return ret;
	}
	
	public DBMaterialCategoryBean getByPrimaryKey(java.lang.Long paramMaterialCategoryId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBMaterialCategoryBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  material_category_id= ?  "+injector.getWhereQuery()+" ";
		if (injector.getOrderQuery().length() != 0) {
			sql += injector.getOrderQuery();
		} else { 
			
		}
		sql += injector.getLimitQuery();
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramMaterialCategoryId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBMaterialCategoryBean.class);
			
		}
		return ret;
	}
	
	public int updateByPrimaryKey(DBMaterialCategoryBean bean, java.lang.Long paramMaterialCategoryId) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		 Map<String, Object> map = dataMapper.mapToRow(bean);
		 Map<String, Object> keys = new HashMap<String, Object>();
		 
		 keys.put("material_category_id",  paramMaterialCategoryId);
		 
		return getConnection().updateRow("material_category", map, keys);
	}
	
	public int deleteByPrimaryKey(java.lang.Long paramMaterialCategoryId) throws SQLException {
		setNames();
		String sql = "DELETE FROM " + tablename + " WHERE  1=1 AND  material_category_id= ?  ";
		return getConnection().query(sql, paramMaterialCategoryId);
	}
	
}