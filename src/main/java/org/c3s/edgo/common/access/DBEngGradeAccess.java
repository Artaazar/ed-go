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
public class DBEngGradeAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "eng_grade";
	}
	
	
	public int insert(DBEngGradeBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBEngGradeBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBEngGradeBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBEngGradeBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBEngGradeBean>();
			for (Map<String, Object> res : result) {
				DBEngGradeBean bean = dataMapper.mapFromRow(res, DBEngGradeBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public DBEngGradeBean getByPrimaryKey(java.lang.Long paramEngGradeId)  throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		DBEngGradeBean ret = null;
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		String sql = "SELECT t.* "+injector.getRecordQuery()+" FROM " + tablename + " as t "+injector.getFromQuery()+" WHERE 1=1 AND  eng_grade_id= ?  "+injector.getWhereQuery()+" ";
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
		
		
		
		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getByPrimaryKey", sql ,  paramEngGradeId);
		if (result != null) {
			
			ret = dataMapper.mapFromRow(result.get(0), DBEngGradeBean.class);
			
		}
		return ret;
	}
	
	public int updateByPrimaryKey(DBEngGradeBean bean, java.lang.Long paramEngGradeId) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		 Map<String, Object> map = dataMapper.mapToRow(bean);
		 Map<String, Object> keys = new HashMap<String, Object>();
		 
		 keys.put("eng_grade_id",  paramEngGradeId);
		 
		return getConnection().updateRow("eng_grade", map, keys);
	}
	
	public int deleteByPrimaryKey(java.lang.Long paramEngGradeId) throws SQLException {
		setNames();
		String sql = "DELETE FROM " + tablename + " WHERE  1=1 AND  eng_grade_id= ?  ";
		return getConnection().query(sql, paramEngGradeId);
	}
	
	public List<DBGradesByTypeUniqBean> getGradesByTypeUniq(String paramTypeUniq) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
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
			query = " 				SELECT g.*, b.*, GROUP_CONCAT(DISTINCT e.engeneer_name ORDER BY e.engeneer_name SEPARATOR ', ') as engeneers 				FROM eng_blueprint b, eng_type t, eng_grade g 				LEFT JOIN eng_engeneers_grade eg ON eg.eng_grade_id = g.eng_grade_id  				LEFT JOIN eng_engeneers e ON e.eng_engeneer_id = eg.eng_engeneer_id 				WHERE t.eng_type_uniq = ?  				AND b.eng_type_id = t.eng_type_id 				AND g.eng_blueprint_id = b.eng_blueprint_id 				GROUP BY g.eng_grade_id 				ORDER BY b.eng_blueprint_uniq, g.grade 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getGradesByTypeUniq", query ,  paramTypeUniq);
		List<DBGradesByTypeUniqBean> ret = null;
		if (result != null) {
					ret = new ArrayList<DBGradesByTypeUniqBean>();
				
			for (Map<String, Object> res : result) {
				DBGradesByTypeUniqBean bean = dataMapper.mapFromRow(res, DBGradesByTypeUniqBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
}