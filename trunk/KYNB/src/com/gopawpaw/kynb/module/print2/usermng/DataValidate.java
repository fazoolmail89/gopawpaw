/**     
* @{#} DataValidate.java Create on 2012-10-2 ����3:48:21     
*     
* Copyright (c) 2012 by ¬����.     
*/   

package com.gopawpaw.kynb.module.print2.usermng;
/**     
 * @author ¬���� luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class DataValidate {
	
	/**
	 * ��֤�û��������ش�����Ϣ������null��ʾ��֤ͨ��
	 * @param newName
	 * @param oldName
	 * @return 
	 */
	public String CheckUsername(String newName, String oldName) {
		String error = null;
		if(newName == null || "".equals(newName)) {
			error = "�û�������Ϊ�գ�";
		} else {
			if(!newName.equals(oldName)) {
				UserDAO ud = new UserDAO();
				User user = ud.findByUsername(newName);
				if(user != null) {
					error = "�û��������ظ���";
				}			
			}
		}
		return error;
	}
	
	public String CheckPassword(String password) {
		String error = null;
		if(password == null || "".equals(password))
			error = "���벻��Ϊ�գ�";
		return error;
	}
}
