/**
 * 
 */
package com.gopawpaw.kynb.bean;

import java.util.ArrayList;

/**
 * @version 2011-11-13
 * @author Jason
 */
public class Villager {
	
	public final static String tab_v_id = "���";
	public final static String tab_t_id = "��ID";
	public final static String tab_v_name = "����";
	public final static String tab_v_sex = "�Ա�";
	public final static String tab_v_ic = "���֤��";
	public final static String tab_v_nation = "����";
	public final static String tab_v_birthday = "��������";
	public final static String tab_v_address_live = "�־�ס��ַ";
	public final static String tab_v_bank_name = "�ɷ���������";
	public final static String tab_v_bank_account = "�ɷ������ʺ�";
	public final static String tab_v_bank_account_name = "�ɷ����л���";
	public final static String tab_v_bank2_name = "֧����������";
	public final static String tab_v_bank2_account = "֧�������ʺ�";
	public final static String tab_v_bank2_account_name = "֧�����л���";
	public final static String tab_v_capture_expend_calss = "����ɷѵ���";
	public final static String tab_v_type = "��Ա���";
	public final static String tab_v_join_time = "�α�ʱ��";
	public final static String tab_v_archival_location = "�������λ��";
	public final static String tab_v_old_balance = "��ũ���ʻ����";
	public final static String tab_v_old_balance_flag = "�μ���ũ����־";
	public final static String tab_v_householder_name = "��������";
	public final static String tab_v_householder_ic = "�������֤��";
	public final static String tab_v_householder_relation = "�뻧�����ϵ";
	public final static String tab_v_standard_culture = "�Ļ��̶�";
	public final static String tab_v_60not_enough15_flag = "��60�겻��15��ɷѱ�־";
	public final static String tab_v_phone_num = "��ϵ�绰";
	public final static String tab_v_marital_status = "����״��";
	public final static String tab_v_politics_status = "������ò";
	public final static String tab_v_contact_name = "��ϵ��";
	public final static String tab_v_address_com = "ͨѶ��ַ";
	public final static String tab_v_address_zip_code = "��������";
	public final static String tab_v_soldie_flag = "��ת��Ա��־";
	public final static String tab_v_model_worker = "�Ͷ�ģ��";
	public final static String tab_v_social_security_num = "�籣�˺�";
	public final static String tab_v_begin_get_date = "��������";
	public final static String tab_v_status = "״̬";
	public final static String tab_v_mark = "�α���ע";
	public final static String tab_v_mark2 = "������Ϣ��ע";

	private static ArrayList<String> keyList ;
	
	private int v_id;
	private int t_id;
	private String v_name="";
	private String v_sex="";
	private String v_ic="";
	private String v_nation="";
	private String v_birthday="";
	private String v_address_live="";
	private String v_bank_name="";
	private String v_bank_account="";
	private String v_bank_account_name="";
	private String v_bank2_name="";
	private String v_bank2_account="";
	private String v_bank2_account_name="";
	private String v_capture_expend_calss="";
	private String v_type="";
	private String v_join_time="";
	private String v_archival_location="";
	private String v_old_balance="";
	private String v_old_balance_flag="";
	private String v_householder_name="";
	private String v_householder_ic="";
	private String v_householder_relation="";
	private String v_standard_culture="";
	private String v_60not_enough15_flag="";
	private String v_phone_num="";
	private String v_marital_status="";
	private String v_politics_status="";
	private String v_contact_name="";
	private String v_address_com="";
	private String v_address_zip_code="";
	private String v_soldie_flag="";
	private String v_model_worker="";
	private String v_social_security_num="";
	private String v_begin_get_date="";
	private String v_status="";
	private String v_mark="";
	private String v_mark2="";
	
	/**
	 * 
	 */
	public Villager() {
		// TODO Auto-generated constructor stub
	}

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getV_name() {
		return v_name;
	}

	public void setV_name(String v_name) {
		this.v_name = v_name;
	}

	public String getV_sex() {
		return v_sex;
	}

	public void setV_sex(String v_sex) {
		this.v_sex = v_sex;
	}

	public String getV_ic() {
		return v_ic;
	}

	public void setV_ic(String v_ic) {
		this.v_ic = v_ic;
	}

	public String getV_nation() {
		return v_nation;
	}

	public void setV_nation(String v_nation) {
		this.v_nation = v_nation;
	}

	public String getV_birthday() {
		return v_birthday;
	}

	public void setV_birthday(String v_birthday) {
		this.v_birthday = v_birthday;
	}

	public String getV_address_live() {
		return v_address_live;
	}

	public void setV_address_live(String v_address_live) {
		this.v_address_live = v_address_live;
	}

	public String getV_bank_name() {
		return v_bank_name;
	}

	public void setV_bank_name(String v_bank_name) {
		this.v_bank_name = v_bank_name;
	}

	public String getV_bank_account() {
		return v_bank_account;
	}

	public void setV_bank_account(String v_bank_account) {
		this.v_bank_account = v_bank_account;
	}

	public String getV_capture_expend_calss() {
		return v_capture_expend_calss;
	}

	public void setV_capture_expend_calss(String v_capture_expend_calss) {
		this.v_capture_expend_calss = v_capture_expend_calss;
	}

	public String getV_type() {
		return v_type;
	}

	public void setV_type(String v_type) {
		this.v_type = v_type;
	}

	public String getV_join_time() {
		return v_join_time;
	}

	public void setV_join_time(String v_join_time) {
		this.v_join_time = v_join_time;
	}

	public String getV_archival_location() {
		return v_archival_location;
	}

	public void setV_archival_location(String v_archival_location) {
		this.v_archival_location = v_archival_location;
	}

	public String getV_old_balance() {
		return v_old_balance;
	}

	public void setV_old_balance(String v_old_balance) {
		this.v_old_balance = v_old_balance;
	}

	public String getV_old_balance_flag() {
		return v_old_balance_flag;
	}

	public void setV_old_balance_flag(String v_old_balance_flag) {
		this.v_old_balance_flag = v_old_balance_flag;
	}

	public String getV_householder_name() {
		return v_householder_name;
	}

	public void setV_householder_name(String v_householder_name) {
		this.v_householder_name = v_householder_name;
	}

	public String getV_householder_ic() {
		return v_householder_ic;
	}

	public void setV_householder_ic(String v_householder_ic) {
		this.v_householder_ic = v_householder_ic;
	}

	public String getV_householder_relation() {
		return v_householder_relation;
	}

	public void setV_householder_relation(String v_householder_relation) {
		this.v_householder_relation = v_householder_relation;
	}

	public String getV_standard_culture() {
		return v_standard_culture;
	}

	public void setV_standard_culture(String v_standard_culture) {
		this.v_standard_culture = v_standard_culture;
	}

	public String getV_60not_enough15_flag() {
		return v_60not_enough15_flag;
	}

	public void setV_60not_enough15_flag(String v_60not_enough15_flag) {
		this.v_60not_enough15_flag = v_60not_enough15_flag;
	}

	public String getV_phone_num() {
		return v_phone_num;
	}

	public void setV_phone_num(String v_phone_num) {
		this.v_phone_num = v_phone_num;
	}

	public String getV_marital_status() {
		return v_marital_status;
	}

	public void setV_marital_status(String v_marital_status) {
		this.v_marital_status = v_marital_status;
	}

	public String getV_politics_status() {
		return v_politics_status;
	}

	public void setV_politics_status(String v_politics_status) {
		this.v_politics_status = v_politics_status;
	}

	public String getV_contact_name() {
		return v_contact_name;
	}

	public void setV_contact_name(String v_contact_name) {
		this.v_contact_name = v_contact_name;
	}

	public String getV_address_com() {
		return v_address_com;
	}

	public void setV_address_com(String v_address_com) {
		this.v_address_com = v_address_com;
	}

	public String getV_address_zip_code() {
		return v_address_zip_code;
	}

	public void setV_address_zip_code(String v_address_zip_code) {
		this.v_address_zip_code = v_address_zip_code;
	}

	public String getV_soldie_flag() {
		return v_soldie_flag;
	}

	public void setV_soldie_flag(String v_soldie_flag) {
		this.v_soldie_flag = v_soldie_flag;
	}

	public String getV_model_worker() {
		return v_model_worker;
	}

	public void setV_model_worker(String v_model_worker) {
		this.v_model_worker = v_model_worker;
	}

	public String getV_social_security_num() {
		return v_social_security_num;
	}

	public void setV_social_security_num(String v_social_security_num) {
		this.v_social_security_num = v_social_security_num;
	}

	public String getV_begin_get_date() {
		return v_begin_get_date;
	}

	public void setV_begin_get_date(String v_begin_get_date) {
		this.v_begin_get_date = v_begin_get_date;
	}

	public String getV_status() {
		return v_status;
	}

	public void setV_status(String v_status) {
		this.v_status = v_status;
	}

	public String getV_mark() {
		return v_mark;
	}

	public void setV_mark(String v_mark) {
		this.v_mark = v_mark;
	}

	

	public static ArrayList<String> getKeyList() {
		if(keyList == null || keyList.size()==0){
			keyList = new ArrayList<String>();
			keyList.add(tab_v_name);
			keyList.add(tab_v_sex);
			keyList.add(tab_v_ic);
			keyList.add(tab_v_nation);
			keyList.add(tab_v_birthday);
			keyList.add(tab_v_address_live);
			keyList.add(tab_v_bank_name);
			keyList.add(tab_v_bank_account);
			keyList.add(tab_v_bank_account_name);
			keyList.add(tab_v_bank2_name);
			keyList.add(tab_v_bank2_account);
			keyList.add(tab_v_bank2_account_name);
			keyList.add(tab_v_capture_expend_calss);
			keyList.add(tab_v_type);
			keyList.add(tab_v_join_time);
			keyList.add(tab_v_archival_location);
			keyList.add(tab_v_old_balance);
			keyList.add(tab_v_old_balance_flag);
			keyList.add(tab_v_householder_name);
			keyList.add(tab_v_householder_ic);
			keyList.add(tab_v_householder_relation);
			keyList.add(tab_v_standard_culture);
			keyList.add(tab_v_60not_enough15_flag);
			keyList.add(tab_v_phone_num);
			keyList.add(tab_v_marital_status);
			keyList.add(tab_v_politics_status);
			keyList.add(tab_v_contact_name);
			keyList.add(tab_v_address_com);
			keyList.add(tab_v_address_zip_code);
			keyList.add(tab_v_soldie_flag);
			keyList.add(tab_v_model_worker);
			keyList.add(tab_v_social_security_num);
			keyList.add(tab_v_begin_get_date);
			keyList.add(tab_v_mark);
			keyList.add(tab_v_mark2);
		}
		return keyList;
	}

	public String getV_bank_account_name() {
		return v_bank_account_name;
	}

	public void setV_bank_account_name(String v_bank_account_name) {
		this.v_bank_account_name = v_bank_account_name;
	}

	public String getV_bank2_name() {
		return v_bank2_name;
	}

	public void setV_bank2_name(String v_bank2_name) {
		this.v_bank2_name = v_bank2_name;
	}

	public String getV_bank2_account() {
		return v_bank2_account;
	}

	public void setV_bank2_account(String v_bank2_account) {
		this.v_bank2_account = v_bank2_account;
	}

	public String getV_bank2_account_name() {
		return v_bank2_account_name;
	}

	public void setV_bank2_account_name(String v_bank2_account_name) {
		this.v_bank2_account_name = v_bank2_account_name;
	}

	@Override
	public String toString() {
		return "Villager [v_id=" + v_id + ", t_id=" + t_id + ", v_name="
				+ v_name + ", v_sex=" + v_sex + ", v_ic=" + v_ic
				+ ", v_nation=" + v_nation + ", v_birthday=" + v_birthday
				+ ", v_address_live=" + v_address_live + ", v_bank_name="
				+ v_bank_name + ", v_bank_account=" + v_bank_account
				+ ", v_bank_account_name=" + v_bank_account_name
				+ ", v_bank2_name=" + v_bank2_name + ", v_bank2_account="
				+ v_bank2_account + ", v_bank2_account_name="
				+ v_bank2_account_name + ", v_capture_expend_calss="
				+ v_capture_expend_calss + ", v_type=" + v_type
				+ ", v_join_time=" + v_join_time + ", v_archival_location="
				+ v_archival_location + ", v_old_balance=" + v_old_balance
				+ ", v_old_balance_flag=" + v_old_balance_flag
				+ ", v_householder_name=" + v_householder_name
				+ ", v_householder_ic=" + v_householder_ic
				+ ", v_householder_relation=" + v_householder_relation
				+ ", v_standard_culture=" + v_standard_culture
				+ ", v_60not_enough15_flag=" + v_60not_enough15_flag
				+ ", v_phone_num=" + v_phone_num + ", v_marital_status="
				+ v_marital_status + ", v_politics_status=" + v_politics_status
				+ ", v_contact_name=" + v_contact_name + ", v_address_com="
				+ v_address_com + ", v_address_zip_code=" + v_address_zip_code
				+ ", v_soldie_flag=" + v_soldie_flag + ", v_model_worker="
				+ v_model_worker + ", v_social_security_num="
				+ v_social_security_num + ", v_begin_get_date="
				+ v_begin_get_date + ", v_status=" + v_status + ", v_mark="
				+ v_mark + "]";
	}

	public String getV_mark2() {
		return v_mark2;
	}

	public void setV_mark2(String v_mark2) {
		this.v_mark2 = v_mark2;
	}

	
	
}
