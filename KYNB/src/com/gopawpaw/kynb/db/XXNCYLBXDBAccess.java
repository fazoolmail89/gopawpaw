/**
 * 
 */
package com.gopawpaw.kynb.db;

import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.frame.database.BaseSQL;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.utils.KYHashMap;
import com.gopawpaw.kynb.utils.KeyConstants;

/**
 * @version 2011-11-13
 * @author Jason
 */
public class XXNCYLBXDBAccess extends BaseSQL{

	
	public final static String t_id = "t_id";
	public final static String t_name = "t_name";
	
	public final static String v_id = "v_id";
	public final static String v_name = "v_name";
	public final static String v_sex = "v_sex";
	public final static String v_ic = "v_ic";
	public final static String v_nation = "v_nation";
	public final static String v_birthday = "v_birthday";
	public final static String v_address_live = "v_address_live";
	public final static String v_bank_name = "v_bank_name";
	public final static String v_bank_account = "v_bank_account";
	public final static String v_bank_account_name = "v_bank_account_name";
	public final static String v_bank2_name = "v_bank2_name";
	public final static String v_bank2_account = "v_bank2_account";
	public final static String v_bank2_account_name = "v_bank2_account_name";
	public final static String v_capture_expend_calss = "v_capture_expend_calss";
	public final static String v_type = "v_type";
	public final static String v_join_time = "v_join_time";
	public final static String v_archival_location = "v_archival_location";
	public final static String v_old_balance = "v_old_balance";
	public final static String v_old_balance_flag = "v_old_balance_flag";
	public final static String v_householder_name = "v_householder_name";
	public final static String v_householder_ic = "v_householder_ic";
	public final static String v_householder_relation = "v_householder_relation";
	public final static String v_standard_culture = "v_standard_culture";
	public final static String v_60not_enough15_flag = "v_60not_enough15_flag";
	public final static String v_phone_num = "v_phone_num";
	public final static String v_marital_status = "v_marital_status";
	public final static String v_politics_status = "v_politics_status";
	public final static String v_contact_name = "v_contact_name";
	public final static String v_address_com = "v_address_com";
	public final static String v_address_zip_code = "v_address_zip_code";
	public final static String v_soldie_flag = "v_soldie_flag";
	public final static String v_model_worker = "v_model_worker";
	public final static String v_social_security_num = "v_social_security_num";
	public final static String v_begin_get_date = "v_begin_get_date";
	public final static String v_status = "v_status";
	public final static String v_mark = "v_mark";
	public final static String v_mark2 = "v_mark2";
	/**
	 * 
	 */
	public XXNCYLBXDBAccess() {
		super();
	}
	
	public boolean insertThorp(Thorp thorp) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "insert into thorp (t_name) values ('"+thorp.getT_name()+"')";
			
			boolean ret = commonsql.executesql(sql);
			
			if(ret){
				sql = "select * from thorp where t_name='"+thorp.getT_name()+"'";
				commonsql.query(sql);
				
				while (commonsql.nextrecord()) {
					thorp.setT_name(commonsql.getString("t_name"));
					thorp.setT_id(commonsql.getInt("t_id"));
				}
			}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	
	public boolean updateThorp(Thorp thorp) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "update thorp set t_name='"+thorp.getT_name()+"' where t_id="+thorp.getT_id();
			
			boolean ret = commonsql.executesql(sql);
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean deleteThorp(Thorp thorp) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "delete from thorp where t_id="+thorp.getT_id();
			
			boolean ret = commonsql.executesql(sql);
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public Thorp getThorpById(int t_id) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from thorp where t_id="+t_id;
			
			if(!commonsql.query(sql)){
				
				return null;
			}
			
			
			Thorp thorp = new Thorp();
			
			while (commonsql.nextrecord()) {
				thorp.setT_name(commonsql.getString("t_name"));
				thorp.setT_id(commonsql.getInt("t_id"));
			}
			
			commonsql.close();
			return thorp;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public List<Thorp> getThorpAll() throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from thorp ";
			
			if(!commonsql.query(sql)){
				
				return null;
			}
			
			List<Thorp> list = new ArrayList<Thorp>();
			Thorp thorp = null;
			
			while (commonsql.nextrecord()) {
				thorp = new Thorp();
				thorp.setT_name(commonsql.getString("t_name"));
				thorp.setT_id(commonsql.getInt("t_id"));
				
				list.add(thorp);
			}
			
			commonsql.close();
			return list;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean isExistThorp(String t_name) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from thorp where t_name='"+t_name+"'";
			
			if(!commonsql.query(sql)){
				
				return false;
			}
			
			boolean ret =  false;
			if(commonsql.nextrecord()){
				ret = true;
			}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean isExistThorp(int t_id) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from thorp where t_id="+t_id;
			
			if(!commonsql.query(sql)){
				
				return false;
			}
			
			boolean ret =  false;
			if(commonsql.nextrecord()){
				ret = true;
			}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean insertVillager(Villager villager) throws DBException{
		
		int new_v_id = getVillagerNewId(villager.getT_id());
		if(villager.getV_archival_location() == null || "".equals(villager.getV_archival_location())){
			//没有填写档案时，自动生成默认值
			Thorp thorp = this.getThorpById(villager.getT_id());
			if(thorp.getT_name() != null && !"".equals(thorp.getT_name())){
				villager.setV_archival_location(thorp.getT_name()+new_v_id);
			}else{
				villager.setV_archival_location("");
			}
			
		}
		
		if (commonsql.connect(user, password)) {
			
			String sql = "insert into villager ("+
					v_id+","+
					t_id+","+
					v_name+","+
					v_sex+","+
					v_ic+","+
					v_nation+","+
					v_birthday+","+
					v_address_live+","+
					v_bank_name+","+
					v_bank_account+","+
					v_bank_account_name+","+
					v_bank2_name+","+
					v_bank2_account+","+
					v_bank2_account_name+","+
					v_capture_expend_calss+","+
					v_type+","+
					v_join_time+","+
					v_archival_location+","+
					v_old_balance+","+
					v_old_balance_flag+","+
					v_householder_name+","+
					v_householder_ic+","+
					v_householder_relation +","+
					v_standard_culture +","+
					v_60not_enough15_flag +","+
					v_phone_num +","+
					v_marital_status+","+
					v_politics_status+","+
					v_contact_name+","+
					v_address_com+","+
					v_address_zip_code+","+
					v_soldie_flag+","+
					v_model_worker+","+
					v_social_security_num+","+
					v_begin_get_date+","+
					v_status+","+
					v_mark+","+
					v_mark2+") values ("+
					new_v_id+","+
					villager.getT_id()+",'"+
					villager.getV_name()+"','"+
					villager.getV_sex()+"','"+
					villager.getV_ic()+"','"+
					villager.getV_nation()+"','"+
					villager.getV_birthday()+"','"+
					villager.getV_address_live()+"','"+
					villager.getV_bank_name()+"','"+
					villager.getV_bank_account()+"','"+
					villager.getV_bank_account_name()+"','"+
					villager.getV_bank2_name()+"','"+
					villager.getV_bank2_account()+"','"+
					villager.getV_bank2_account_name()+"','"+
					villager.getV_capture_expend_calss()+"','"+
					villager.getV_type()+"','"+
					villager.getV_join_time()+"','"+
					villager.getV_archival_location()+"','"+
					villager.getV_old_balance()+"','"+
					villager.getV_old_balance_flag()+"','"+
					villager.getV_householder_name()+"','"+
					villager.getV_householder_ic()+"','"+
					villager.getV_householder_relation()+"','"+
					villager.getV_standard_culture()+"','"+
					villager.getV_60not_enough15_flag()+"','"+
					villager.getV_phone_num()+"','"+
					villager.getV_marital_status()+"','"+
					villager.getV_politics_status()+"','"+
					villager.getV_contact_name()+"','"+
					villager.getV_address_com()+"','"+
					villager.getV_address_zip_code()+"','"+
					villager.getV_soldie_flag()+"','"+
					villager.getV_model_worker()+"','"+
					villager.getV_social_security_num()+"','"+
					villager.getV_begin_get_date()+"','"+
					villager.getV_status()+"','"+
					villager.getV_mark()+"','"+
					villager.getV_mark2()+
					"')";
			
			boolean ret = commonsql.executesql(sql);
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean updateVillager(Villager villager) throws DBException{
		return updateVillager(villager,false);
	}
	
	/**
	 * 
	 * @version 2011-11-28
	 * @author Jason
	 * @param
	 * @return boolean 是否更新最新的ID号
	 */
	public boolean updateVillager(Villager villager,boolean isNewId) throws DBException{
		
		if(isNewId){
			villager.setV_id(getVillagerNewId(villager.getT_id(),villager.getV_status()));
		}
		
		if(villager.getV_archival_location() == null || "".equals(villager.getV_archival_location())){
			//没有填写档案时，自动生成默认值
			Thorp thorp = this.getThorpById(villager.getT_id());
			if(thorp.getT_name() != null && !"".equals(thorp.getT_name())){
				villager.setV_archival_location(thorp.getT_name()+villager.getV_id());
			}else{
				villager.setV_archival_location("");
			}
			
		}
		
		if (commonsql.connect(user, password)) {
			
			String sql = "update villager set " +
					t_id+"="+villager.getT_id()+", " +
					v_name+"='"+villager.getV_name()+"', " +
					v_sex+"='"+villager.getV_sex()+"', " +
					v_id+"='"+villager.getV_id()+"', " +
					v_nation+"='"+villager.getV_nation()+"', " +
					v_birthday+"='"+villager.getV_birthday()+"', " +
					v_address_live+"='"+villager.getV_address_live()+"', " +
					v_bank_name+"='"+villager.getV_bank_name()+"', " +
					v_bank_account+"='"+villager.getV_bank_account()+"', " +
					v_bank_account_name+"='"+villager.getV_bank_account_name()+"', " +
					v_bank2_name+"='"+villager.getV_bank2_name()+"', " +
					v_bank2_account+"='"+villager.getV_bank2_account()+"', " +
					v_bank2_account_name+"='"+villager.getV_bank2_account_name()+"', " +
					v_capture_expend_calss+"='"+villager.getV_capture_expend_calss()+"', " +
					v_type+"='"+villager.getV_type()+"', " +
					v_join_time+"='"+villager.getV_join_time()+"', " +
					v_archival_location+"='"+villager.getV_archival_location()+"', " +
					v_old_balance+"='"+villager.getV_old_balance()+"', " +
					v_old_balance_flag+"='"+villager.getV_old_balance_flag()+"', " +
					v_householder_name+"='"+villager.getV_householder_name()+"', " +
					v_householder_ic+"='"+villager.getV_householder_ic()+"', " +
					v_householder_relation+"='"+villager.getV_householder_relation()+"', " +
					v_standard_culture+"='"+villager.getV_standard_culture()+"', " +
					v_60not_enough15_flag+"='"+villager.getV_60not_enough15_flag()+"', " +
					v_phone_num+"='"+villager.getV_phone_num()+"', " +
					v_marital_status+"='"+villager.getV_marital_status()+"', " +
					v_politics_status+"='"+villager.getV_politics_status()+"', " +
					v_contact_name+"='"+villager.getV_contact_name()+"', " +
					v_address_com+"='"+villager.getV_address_com()+"', " +
					v_address_zip_code+"='"+villager.getV_address_zip_code()+"', " +
					v_soldie_flag+"='"+villager.getV_soldie_flag()+"', " +
					v_model_worker+"='"+villager.getV_model_worker()+"', " +
					v_social_security_num+"='"+villager.getV_social_security_num()+"', " +
					v_begin_get_date+"='"+villager.getV_begin_get_date()+"', " +
					v_status+"='"+villager.getV_status()+"', " +
					v_mark+"='"+villager.getV_mark()+"', " +
					v_mark2+"='"+villager.getV_mark2()+"' " +
					"where v_ic='"+villager.getV_ic()+"'";
			
			boolean ret = commonsql.executesql(sql);
			System.out.println(sql);
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	/**
	 * 更新银行信息
	 * @version 2011-12-4
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public boolean updateVillagerBank(Villager villager) throws DBException{
		
		
		if (commonsql.connect(user, password)) {
			
			String sql = "update villager set " +
					v_name+"='"+villager.getV_name()+"', " +
					v_bank_name+"='"+villager.getV_bank_name()+"', " +
					v_bank_account+"='"+villager.getV_bank_account()+"', " +
					v_bank_account_name+"='"+villager.getV_bank_account_name()+"', " +
					v_bank2_name+"='"+villager.getV_bank2_name()+"', " +
					v_bank2_account+"='"+villager.getV_bank2_account()+"', " +
					v_bank2_account_name+"='"+villager.getV_bank2_account_name()+"', " +
					v_mark+"='"+villager.getV_mark()+"' " +
					"where v_ic='"+villager.getV_ic()+"'";
			boolean ret = commonsql.executesql(sql);
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}

	public boolean updateVillagerStatus(List<String> vv_ics,String vv_status) throws DBException{
		if (commonsql.connect(user, password)) {
			
			boolean ret = true;
			
			for(String v_ic:vv_ics){
				String sql = "update villager set " +
				v_status+"='"+vv_status+"' " +
				"where v_ic='"+v_ic+"'";
				
				if(!commonsql.executesql(sql)){
					ret = false;
				}
			}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean resetVillagerOrderID(List<String> vv_ics) throws DBException{
		if (commonsql.connect(user, password)) {
			
			boolean ret = true;
			int size = vv_ics.size();
			for(int i=0;i<size;i++){
				String vic = vv_ics.get(i);
				String sql = "update villager set " +
				v_id+"='"+(i+1)+"' " +
				"where v_ic='"+vic+"'";
				
				if(!commonsql.executesql(sql)){
					ret = false;
				}
			}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean deleteVillager(String v_ic) throws DBException{

		return deleteVillager(v_ic,true);
		
	}
	
	public boolean deleteVillager(String v_ic,boolean isCache) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "delete from villager where v_ic='"+v_ic+"'";
			if(isCache){
				sql = "update villager set " +
				t_id+"=0 " +
				" where v_ic='"+v_ic+"'";
			}else{
				 sql = "delete from villager where v_ic='"+v_ic+"'";
			}
			
			boolean ret = commonsql.executesql(sql);
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean deleteVillagerAll() throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "delete from villager";
			
			boolean ret = commonsql.executesql(sql);
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean isExistVillager(String v_ic) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from villager where v_ic='"+v_ic+"'";
			
			if(!commonsql.query(sql)){
				
				return false;
			}
			
			boolean ret =  false;
			if(commonsql.nextrecord()){
				ret = true;
			}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public int getVillagerNewId(int t_id) throws DBException{
		return getVillagerNewId(t_id,"a");
	}
	
	public int getVillagerNewId(int t_id,String state) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select max(v_id) as newv_id from villager where t_id="+t_id+" and "+v_status+"='"+state+"'";
			
			if(!commonsql.query(sql)){
				
				return 1;
			}
			
			int newid = 0;
			while (commonsql.nextrecord()) {
				newid = commonsql.getInt("newv_id");
			}
			
			commonsql.close();
			return newid+1;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public Villager getVillagerByIc(String v_ic) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from villager where v_ic='"+v_ic+"'";
			
			if(!commonsql.query(sql)){
				
				return null;
			}
			
			
			Villager villager = new Villager();
			
			while (commonsql.nextrecord()) {
				villager.setT_id(commonsql.getInt(t_id));
				villager.setV_id(commonsql.getInt(XXNCYLBXDBAccess.v_id));
				villager.setV_name(commonsql.getString(v_name));
				villager.setV_sex(commonsql.getString(v_sex));
				villager.setV_ic(commonsql.getString(XXNCYLBXDBAccess.v_ic));
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
			}
			
			commonsql.close();
			return villager;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public List<Villager> getVillagerByThorp(int t_id,String v_statuss) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from villager ";
			String orderby = " order by v_id";
			if(t_id<=-2){
				if(v_status == null || "".equals(v_statuss)){
					sql = "select * from villager "+orderby;
				}else{
					sql = "select * from villager where v_status='"+v_statuss+"' "+orderby;
				}
			}else{
				if(v_status == null || "".equals(v_status)){
					sql = "select * from villager where t_id="+t_id+" "+orderby;
				}else{
					sql = "select * from villager where t_id="+t_id+" and v_status='"+v_statuss+"' "+orderby;
				}
			}
			
			if(!commonsql.query(sql)){
				
				return null;
			}
			
			List<Villager> list = new ArrayList<Villager>();
			Villager villager = null;
			
			while (commonsql.nextrecord()) {
				villager = new Villager();
				
				villager.setT_id(commonsql.getInt(XXNCYLBXDBAccess.t_id));
				villager.setV_id(commonsql.getInt(XXNCYLBXDBAccess.v_id));
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
				list.add(villager);
			}
			
			commonsql.close();
			return list;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean insertVillagerError(List<String> list_ic) throws DBException{
		if (commonsql.connect(user, password)) {
			
			boolean ret = true;
			for(String ic:list_ic){
				String sql = "insert into villager_error (ve_ic) values ('"+ic+"')";
				
				if(!commonsql.executesql(sql)){
					ret = false;
				}
			}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean insertVillagerError(String ve_ic) throws DBException{
		if (commonsql.connect(user, password)) {
			
			boolean ret = true;
				String sql = "insert into villager_error (ve_ic) values ('"+ve_ic+"')";
				
				if(!commonsql.executesql(sql)){
					ret = false;
				}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	/**
	 * 插入一条黑名单
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return boolean
	 */
	public boolean insertVillagerError(KYHashMap<String,String> kyMap) throws DBException{
		
		if(kyMap == null){
			return false;
		}
		
		if (commonsql.connect(user, password)) {
			
			boolean ret = true;
				String sql = "insert into villager_error ("+KeyConstants.DB.ve_ic+
				","+KeyConstants.DB.ve_name+
				","+KeyConstants.DB.ve_type+
				","+KeyConstants.DB.ve_remark1+
				","+KeyConstants.DB.ve_remark2+
				","+KeyConstants.DB.ve_remark3+") values ('"+kyMap.get(KeyConstants.DB.ve_ic)+
				"','"+kyMap.get(KeyConstants.DB.ve_name)+
				"','"+kyMap.get(KeyConstants.DB.ve_type)+
				"','"+kyMap.get(KeyConstants.DB.ve_remark1)+
				"','"+kyMap.get(KeyConstants.DB.ve_remark2)+
				"','"+kyMap.get(KeyConstants.DB.ve_remark3)+"')";
				
				if(!commonsql.executesql(sql)){
					ret = false;
				}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	/**
	 * 更新一条黑名单
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return boolean
	 */
	public boolean updateVillagerError(KYHashMap<String,String> kyMap) throws DBException{
		
		if(kyMap == null){
			return false;
		}
		
		if (commonsql.connect(user, password)) {
			
			boolean ret = true;
				
				String sql = "update villager_error set " +
				KeyConstants.DB.ve_ic+"='"+kyMap.get(KeyConstants.DB.ve_ic)+"', " +
				KeyConstants.DB.ve_name+"='"+kyMap.get(KeyConstants.DB.ve_name)+"', " +
				KeyConstants.DB.ve_type+"='"+kyMap.get(KeyConstants.DB.ve_type)+"', " +
				KeyConstants.DB.ve_remark1+"='"+kyMap.get(KeyConstants.DB.ve_remark1)+"', " +
				KeyConstants.DB.ve_remark2+"='"+kyMap.get(KeyConstants.DB.ve_remark2)+"', " +
				KeyConstants.DB.ve_remark3+"='"+kyMap.get(KeyConstants.DB.ve_remark3)+"'" + 
				"where "+KeyConstants.DB.ve_ic+"='"+kyMap.get(KeyConstants.DB.ve_ic)+"'";
				if(!commonsql.executesql(sql)){
					ret = false;
				}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean isExistVillagerError(String v_ic) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from villager_error where ve_ic='"+v_ic+"'";
			
			if(!commonsql.query(sql)){
				
				return false;
			}
			
			boolean ret =  false;
			if(commonsql.nextrecord()){
				ret = true;
			}
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public boolean deleteVillagerError(String ve_ic) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "delete from villager_error where ve_ic='"+ve_ic+"'";
			
			boolean ret = commonsql.executesql(sql);
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public List<String> getVillagerErrorAll() throws DBException{
		
		return getVillagerErrorAll("");
	}
	
	public List<String> getVillagerErrorAll(String ve_ic) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from villager_error ";
			
			if(ve_ic != null && !"".equals(ve_ic)){
				sql = "select * from villager_error where ve_ic like '%"+ve_ic+"%'";
			}
			
			if(!commonsql.query(sql)){
				
				return null;
			}
			
			List<String> list = new ArrayList<String>();
			
			while (commonsql.nextrecord()) {
				
				list.add(commonsql.getString("ve_ic"));
			}
			
			commonsql.close();
			return list;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	/**
	 * 根据人名模糊查询黑名单
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return String[][]
	 */
	public String[][] getVillagerErrorAll2ForName(String ve_name) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from villager_error ";
			
			if(ve_name != null && !"".equals(ve_name)){
				sql = "select * from villager_error where ve_name like '%"+ve_name+"%'";
			}
			
			if(!commonsql.query(sql)){
				
				return null;
			}
			
			int size = (int) commonsql.getrowcount();
			String[][] arr = new String[size][];
			
			int i = 0;
			while (commonsql.nextrecord()) {
				String[] temp = new String[6];
				temp[0] = commonsql.getString("ve_ic");
				temp[1] = commonsql.getString("ve_name");
				temp[2] = commonsql.getString("ve_type");
				temp[3] = commonsql.getString("ve_remark1");
				temp[4] = commonsql.getString("ve_remark2");
				temp[5] = commonsql.getString("ve_remark3");
				
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
	
	/**
	 * 根据黑名单类型查询黑名单
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return String[][]
	 */
	public String[][] getVillagerErrorAll2ForType(String ve_type) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from villager_error ";
			
			if(ve_type != null && !"".equals(ve_type)){
				sql = "select * from villager_error where ve_type = '"+ve_type+"'";
			}else{
				sql = "select * from villager_error ";
			}
			
			if(!commonsql.query(sql)){
				
				return null;
			}
			
			int size = (int) commonsql.getrowcount();
			String[][] arr = new String[size][];
			
			int i = 0;
			while (commonsql.nextrecord()) {
				String[] temp = new String[6];
				temp[0] = commonsql.getString("ve_ic");
				temp[1] = commonsql.getString("ve_name");
				temp[2] = commonsql.getString("ve_type");
				temp[3] = commonsql.getString("ve_remark1");
				temp[4] = commonsql.getString("ve_remark2");
				temp[5] = commonsql.getString("ve_remark3");
				
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
	public String[][] getVillagerErrorAll2(String ve_ic) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "select * from villager_error ";
			
			if(ve_ic != null && !"".equals(ve_ic)){
				sql = "select * from villager_error where ve_ic like '%"+ve_ic+"%'";
			}
			
			if(!commonsql.query(sql)){
				
				return null;
			}
			
			int size = (int) commonsql.getrowcount();
			String[][] arr = new String[size][];
			
			int i = 0;
			while (commonsql.nextrecord()) {
				String[] temp = new String[6];
				temp[0] = commonsql.getString("ve_ic");
				temp[1] = commonsql.getString("ve_name");
				temp[2] = commonsql.getString("ve_type");
				temp[3] = commonsql.getString("ve_remark1");
				temp[4] = commonsql.getString("ve_remark2");
				temp[5] = commonsql.getString("ve_remark3");
				
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

	public static String getInsertVillagerSQL(Villager villager){
		String sql = "insert into villager ("+
		t_id+","+
		v_name+","+
		v_sex+","+
		v_ic+","+
		v_nation+","+
		v_birthday+","+
		v_address_live+","+
		v_bank_name+","+
		v_bank_account+","+
		v_bank_account_name+","+
		v_bank2_name+","+
		v_bank2_account+","+
		v_bank2_account_name+","+
		v_capture_expend_calss+","+
		v_type+","+
		v_join_time+","+
		v_archival_location+","+
		v_old_balance+","+
		v_old_balance_flag+","+
		v_householder_name+","+
		v_householder_ic+","+
		v_householder_relation +","+
		v_standard_culture +","+
		v_60not_enough15_flag +","+
		v_phone_num +","+
		v_marital_status+","+
		v_politics_status+","+
		v_contact_name+","+
		v_address_com+","+
		v_address_zip_code+","+
		v_soldie_flag+","+
		v_model_worker+","+
		v_social_security_num+","+
		v_begin_get_date+","+
		v_status+","+
		v_mark+","+
		v_mark2+") values ("+
		villager.getT_id()+",'"+
		villager.getV_name()+"','"+
		villager.getV_sex()+"','"+
		villager.getV_ic()+"','"+
		villager.getV_nation()+"','"+
		villager.getV_birthday()+"','"+
		villager.getV_address_live()+"','"+
		villager.getV_bank_name()+"','"+
		villager.getV_bank_account()+"','"+
		villager.getV_bank_account_name()+"','"+
		villager.getV_bank2_name()+"','"+
		villager.getV_bank2_account()+"','"+
		villager.getV_bank2_account_name()+"','"+
		villager.getV_capture_expend_calss()+"','"+
		villager.getV_type()+"','"+
		villager.getV_join_time()+"','"+
		villager.getV_archival_location()+"','"+
		villager.getV_old_balance()+"','"+
		villager.getV_old_balance_flag()+"','"+
		villager.getV_householder_name()+"','"+
		villager.getV_householder_ic()+"','"+
		villager.getV_householder_relation()+"','"+
		villager.getV_standard_culture()+"','"+
		villager.getV_60not_enough15_flag()+"','"+
		villager.getV_phone_num()+"','"+
		villager.getV_marital_status()+"','"+
		villager.getV_politics_status()+"','"+
		villager.getV_contact_name()+"','"+
		villager.getV_address_com()+"','"+
		villager.getV_address_zip_code()+"','"+
		villager.getV_soldie_flag()+"','"+
		villager.getV_model_worker()+"','"+
		villager.getV_social_security_num()+"','"+
		villager.getV_begin_get_date()+"','"+
		villager.getV_status()+"','"+
		villager.getV_mark()+"','"+
		villager.getV_mark2()+
		"')";
		return sql;
	}

}
