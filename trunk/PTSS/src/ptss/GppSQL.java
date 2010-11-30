package ptss;

/**
 * 
 */
import java.sql.ResultSet;

import com.gopawpaw.dev.common.GppCommonDBAccess;
import com.gopawpaw.dev.common.GppConfiguration;

/**
 * @version 2010-03-2
 * @author �����
 */
public class GppSQL {
	private GppCommonDBAccess commonsql = null;

	
	/**
	 * 
	 */
	public GppSQL() {
	
		GppConfiguration gppconf = new GppConfiguration("ProgressToSQLServer.ini");
		commonsql = new GppCommonDBAccess();
		commonsql.setDriveName(gppconf.getValue("DriveName"));
		commonsql
				.setConnectName(gppconf.getValue(gppconf.getValue("DefaultConnect")));
		if (commonsql.connect(gppconf.getValue("User"), gppconf.getValue("Password"))) {
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

