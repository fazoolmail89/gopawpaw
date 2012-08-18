package com.gopawpaw.kynb.module.search;

import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**
 * 数据库操作类
 * @version 2012-8-9
 * @author Jason
 */
public class DataOpertor extends XXNCYLBXDBAccess {
	
	public static final int KEY_ALL = 0;
	
	public static final int KEY_IC = 1;
	
	public static final int KEY_NAME = 2;
	
	public static final int KEY_ADDRESS = 3;
	
	/**
	 * 模糊查询基础数据
	 * @version 2012-08-09
	 * @author LiJinHua
	 * @param
	 * @return String[][]
	 */
	public String[][] getVillagerAll(int key,String str) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from villager left join thorp on villager.t_id=thorp.t_id";
			
			if(key == KEY_IC){
				sql = "select * from villager left join thorp on villager.t_id=thorp.t_id where v_ic like '%"+str+"%'";
			}else if(key == KEY_NAME){
				sql = "select * from villager left join thorp on villager.t_id=thorp.t_id where v_name like '%"+str+"%'";
			}else if(key == KEY_ADDRESS){
				sql = "select * from villager left join thorp on villager.t_id=thorp.t_id where v_address_live like '%"+str+"%'";
			}
			
			if(!commonsql.query(sql)){
				
				return null;
			}
			
			int size = (int) commonsql.getrowcount();
			String[][] arr = new String[size][];
			
			int i = 0;
			while (commonsql.nextrecord()) {
				String[] temp = new String[38];
				
				temp[0] = ""+commonsql.getInt(XXNCYLBXDBAccess.v_id);
				temp[1] = commonsql.getString(v_name);
				temp[2] = commonsql.getString(v_sex);
				temp[3] = commonsql.getString(v_ic);
				temp[4] = commonsql.getString(v_nation);
				temp[5] = commonsql.getString(v_birthday);
				temp[6] = commonsql.getString(v_address_live);
				temp[7] = commonsql.getString(v_bank_name);
				temp[8] = commonsql.getString(v_bank_account);
				temp[9] = commonsql.getString(v_bank_account_name);
				temp[10] = commonsql.getString(v_bank2_name);
				temp[11] = commonsql.getString(v_bank2_account);
				temp[12] = commonsql.getString(v_bank2_account_name);
				temp[13] = commonsql.getString(v_capture_expend_calss);
				temp[14] = commonsql.getString(v_type);
				temp[15] = commonsql.getString(v_join_time);
				temp[16] = commonsql.getString(v_archival_location);
				temp[17] = commonsql.getString(v_old_balance);
				temp[18] = commonsql.getString(v_old_balance_flag);
				temp[19] = commonsql.getString(v_householder_name);
				temp[20] = commonsql.getString(v_householder_ic);
				temp[21] = commonsql.getString(v_householder_relation);
				temp[22] = commonsql.getString(v_standard_culture);
				temp[23] = commonsql.getString(v_60not_enough15_flag);
				temp[24] = commonsql.getString(v_phone_num);
				temp[25] = commonsql.getString(v_marital_status);
				temp[26] = commonsql.getString(v_politics_status);
				temp[27] = commonsql.getString(v_contact_name);
				temp[28] = commonsql.getString(v_address_com);
				temp[29] = commonsql.getString(v_address_zip_code);
				temp[30] = commonsql.getString(v_soldie_flag);
				temp[31] = commonsql.getString(v_model_worker);
				temp[32] = commonsql.getString(v_social_security_num);
				temp[33] = commonsql.getString(v_begin_get_date);
				temp[34] = commonsql.getString(v_status);
				temp[35] = commonsql.getString(v_mark);
				temp[36] = commonsql.getString(v_mark2);
				temp[37] = commonsql.getString(XXNCYLBXDBAccess.t_name);
				arr[i] = temp;
				i++;
			}
			
			commonsql.close();
			return arr;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
}
