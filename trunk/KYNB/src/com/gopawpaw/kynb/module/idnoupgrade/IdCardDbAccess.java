package com.gopawpaw.kynb.module.idnoupgrade;

import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**
 * @描述 身份证号码升级数据库操作类
 * @作者 卢向琪
 * @版本 2012-03-28
 */
public class IdCardDbAccess extends XXNCYLBXDBAccess {
	
	private final static String t_id = "t_id";
	@SuppressWarnings("unused")
	private final static String t_name = "t_name";
	
	private final static String v_id = "v_id";
	private final static String v_name = "v_name";
	private final static String v_sex = "v_sex";
	private final static String v_ic = "v_ic";
	private final static String v_nation = "v_nation";
	private final static String v_birthday = "v_birthday";
	private final static String v_address_live = "v_address_live";
	private final static String v_bank_name = "v_bank_name";
	private final static String v_bank_account = "v_bank_account";
	private final static String v_bank_account_name = "v_bank_account_name";
	private final static String v_bank2_name = "v_bank2_name";
	private final static String v_bank2_account = "v_bank2_account";
	private final static String v_bank2_account_name = "v_bank2_account_name";
	private final static String v_capture_expend_calss = "v_capture_expend_calss";
	private final static String v_type = "v_type";
	private final static String v_join_time = "v_join_time";
	private final static String v_archival_location = "v_archival_location";
	private final static String v_old_balance = "v_old_balance";
	private final static String v_old_balance_flag = "v_old_balance_flag";
	private final static String v_householder_name = "v_householder_name";
	private final static String v_householder_ic = "v_householder_ic";
	private final static String v_householder_relation = "v_householder_relation";
	private final static String v_standard_culture = "v_standard_culture";
	private final static String v_60not_enough15_flag = "v_60not_enough15_flag";
	private final static String v_phone_num = "v_phone_num";
	private final static String v_marital_status = "v_marital_status";
	private final static String v_politics_status = "v_politics_status";
	private final static String v_contact_name = "v_contact_name";
	private final static String v_address_com = "v_address_com";
	private final static String v_address_zip_code = "v_address_zip_code";
	private final static String v_soldie_flag = "v_soldie_flag";
	private final static String v_model_worker = "v_model_worker";
	private final static String v_social_security_num = "v_social_security_num";
	private final static String v_begin_get_date = "v_begin_get_date";
	private final static String v_status = "v_status";
	private final static String v_mark = "v_mark";
	private final static String v_mark2 = "v_mark2";
	private final static String v_old_ic = "v_old_ic";
	
	/**
	 * 查询出所有Villager信息
	 * @return Villager列表
	 * @throws DBException
	 */
	@SuppressWarnings("static-access")
	public List<Villager> findAllVillagers() throws DBException {
		List<Villager> list = null;
		if (commonsql.connect(user, password)) {
			list = new ArrayList<Villager>();
			String sql = "select * from villager a order by a.v_id";

			if (commonsql.query(sql)) {
				Villager villager = null;
				
				while (commonsql.nextrecord()) {
					villager = new Villager();
					
					villager.setT_id(commonsql.getInt(this.t_id));
					villager.setV_id(commonsql.getInt(this.v_id));
					villager.setV_name(commonsql.getString(v_name));
					villager.setV_sex(commonsql.getString(v_sex));
					villager.setV_ic(commonsql.getString(v_ic));
					villager.setV_nation(commonsql.getString(v_nation));
					villager.setV_birthday(commonsql.getString(v_birthday));
					villager.setV_address_live(commonsql.getString(v_address_live));
					villager.setV_bank_name(commonsql.getString(v_bank_name));
					villager.setV_bank_account(commonsql.getString(v_bank_account));
					villager.setV_bank_account_name(commonsql.getString(v_bank_account_name));
					villager.setV_bank2_name(commonsql.getString(v_bank2_name));
					villager.setV_bank2_account(commonsql.getString(v_bank2_account));
					villager.setV_bank2_account_name(commonsql.getString(v_bank2_account_name));
					villager.setV_capture_expend_calss(commonsql.getString(v_capture_expend_calss));
					villager.setV_type(commonsql.getString(v_type));
					villager.setV_join_time(commonsql.getString(v_join_time));
					villager.setV_archival_location(commonsql.getString(v_archival_location));
					villager.setV_old_balance(commonsql.getString(v_old_balance));
					villager.setV_old_balance_flag(commonsql.getString(v_old_balance_flag));
					villager.setV_householder_name(commonsql.getString(v_householder_name));
					villager.setV_householder_ic(commonsql.getString(v_householder_ic));
					villager.setV_householder_relation(commonsql.getString(v_householder_relation));
					villager.setV_standard_culture(commonsql.getString(v_standard_culture));
					villager.setV_60not_enough15_flag(commonsql.getString(v_60not_enough15_flag));
					villager.setV_phone_num(commonsql.getString(v_phone_num));
					villager.setV_marital_status(commonsql.getString(v_marital_status));
					villager.setV_politics_status(commonsql.getString(v_politics_status));
					villager.setV_contact_name(commonsql.getString(v_contact_name));
					villager.setV_address_com(commonsql.getString(v_address_com));
					villager.setV_address_zip_code(commonsql.getString(v_address_zip_code));
					villager.setV_soldie_flag(commonsql.getString(v_soldie_flag));
					villager.setV_model_worker(commonsql.getString(v_model_worker));
					villager.setV_social_security_num(commonsql.getString(v_social_security_num));
					villager.setV_begin_get_date(commonsql.getString(v_begin_get_date));
					villager.setV_status(commonsql.getString(v_status));
					villager.setV_mark(commonsql.getString(v_mark));
					villager.setV_mark2(commonsql.getString(v_mark2));
					villager.setV_mark2(commonsql.getString(v_old_ic));
					list.add(villager);					
				}
				commonsql.close();
			}
		} else {
			System.err.println("connect failed!");
			throw new DBException(DBException.DB_OPEN_FALSE);
		}
		return list;
	}
	
	/**
	 * 更新身份证信息（将旧身份证号写入v_old_id字段）
	 * @param villagers 需更新Villager列表
	 * @return true：更新成功；false：更新失败
	 * @throws DBException
	 */
	public boolean update(List<Villager> villagers) throws DBException {
		boolean result = false;
		if (commonsql.connect(user, password)) {
			
			for(Villager v: villagers) {
				String sql = "update villager set " + 
						v_ic + " = '" + v.getV_ic() + "' , " + 
						v_old_ic + " = '" + v.getV_old_ic() + "'" +
						" where " + v_ic + " = '" + v.getV_old_ic() + "'";
				result = commonsql.executesql(sql);
				System.out.println(sql + " : " + result);
			}
			commonsql.close();
			return result;
			
		} else {
			System.err.println("connect failed!");
			throw new DBException(DBException.DB_OPEN_FALSE);
		}
	}
}
