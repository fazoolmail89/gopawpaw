/**
 * 
 */
package ptss;

import java.sql.ResultSet;

import com.gopawpaw.dev.common.GppCommonDBAccess;
import com.gopawpaw.dev.common.GppConfiguration;

/**
 * @version 2010-6-12
 * @author �����
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
	 * ִ�в����ؽ����SQL
	 * 
	 * @param strsql
	 * @return ������ɹ���true�� ʧ�ܣ�false��
	 */
	public boolean executesql(String strsql) {
		return commonsql.executesql(strsql);
	}

	/**
	 * ִ�в�ѯ���ؽ����SQL
	 * 
	 * @param strsql
	 * @return �����
	 */
	public ResultSet query(String strsql) {
		commonsql.query(strsql);
		return commonsql.getResultLists();
	}

	/**
	 * �ر����ݿ��������
	 * 
	 * @return ������ɹ���true�� ʧ�ܣ�false��
	 */
	public boolean close() {
		return commonsql.close();
	}

}
