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
public class DBRolesAccess extends Access {
	protected DBConnection getConnection() {
		setNames();
		return getCon();
	}
	
	private DataMapper dataMapper = new GeneralDataMapper(new GeneralCastType()); 
	
	protected void setNames() {
		con_name = "edgo";
		tablename = "roles";
	}
	
	
	public int insert(DBRolesBean bean) throws SQLException, IllegalArgumentException, IllegalAccessException {
		setNames();
		int res = _insert(bean);
		bean.setAutoincrementField(res);
		return res;
	}

	
	public List<DBRolesBean> getTableRecords() throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		return getTableRecords(null);
	}
	public List<DBRolesBean> getTableRecords(SqlInjectorInterface injector) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		List<Map<String, Object>> result = _getTableRecords(injector);
		
		List<DBRolesBean> ret = null;
		if (result != null) {
			ret = new ArrayList<DBRolesBean>();
			for (Map<String, Object> res : result) {
				DBRolesBean bean = dataMapper.mapFromRow(res, DBRolesBean.class);
				
				ret.add(bean);
			}
		}
		return ret;
	}
	
	
	public List<DBRolesBean> getRolesForUser(long paramuserId) throws SQLException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		setNames();
		SqlInjectorInterface injector = new EmptySqlInjector();
		
		
		String query = injector.getFullQuery();
		if (query == null) {
			String record = injector.getRecordQuery();
			String from = injector.getRecordQuery();
			String join = injector.getRecordQuery();
			String where = injector.getRecordQuery();
			String order = injector.getRecordQuery();
			String limit = injector.getRecordQuery();
			query = " 				SELECT r.* 				FROM roles r, user_roles ur 				WHERE ur.user_id = ? 				AND ur.role_id = r.role_id 			";
		}

		
		List<Map<String, Object>> result = getConnection().fetchRows(tablename + ".getRolesForUser", query ,  paramuserId);
		List<DBRolesBean> ret = null;
		if (result != null) {
					ret = new ArrayList<DBRolesBean>();
				
			for (Map<String, Object> res : result) {
				DBRolesBean bean = dataMapper.mapFromRow(res, DBRolesBean.class);
														
				ret.add(bean);
			}
					
		}
			
		return ret;
	}
	
}