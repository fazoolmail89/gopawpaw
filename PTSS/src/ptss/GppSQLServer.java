/**
 * 
 */
package ptss;

import java.sql.ResultSet;

import com.gopawpaw.dev.common.GppCommonDBAccess;
import com.gopawpaw.dev.common.GppConfiguration;

/**
 * @version 2010-6-12
 * @author 李锦华
 *
 */
public class GppSQLServer {
	
	private GppCommonDBAccess commonsql = null;
	DatabaseInfo dbinfo = null;
	/**
	 * 
	 */
	public GppSQLServer(DatabaseInfo dbinfo) {
		this.dbinfo = dbinfo;
		System.out.println(dbinfo.getUser()+dbinfo.getPassword());
		commonsql = new GppCommonDBAccess();
		commonsql.setDriveName(dbinfo.getDriveName());
		commonsql
				.setConnectName(dbinfo.getConnectName());
		
		if (commonsql.connect(dbinfo.getUser(), dbinfo.getPassword())) {
//			System.out.print("connect seccessed!");
		} else {
			System.err.println("connect failed!");
		}
	}
	
	/**
	 * 执行不返回结果的SQL
	 * 
	 * @param strsql
	 * @return 结果：成功（true） 失败（false）
	 */
	public boolean executesql(String strsql) {
		return commonsql.executesql(strsql);
	}

	/**
	 * 执行查询返回结果的SQL
	 * 
	 * @param strsql
	 * @return 结果集
	 */
	public ResultSet query(String strsql) {
		commonsql.query(strsql);
		return commonsql.getResultLists();
	}

	/**
	 * 关闭数据库操作对象
	 * 
	 * @return 结果：成功（true） 失败（false）
	 */
	public boolean close() {
		return commonsql.close();
	}

}
