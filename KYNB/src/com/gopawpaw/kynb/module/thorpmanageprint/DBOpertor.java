/**
 * 
 */
package com.gopawpaw.kynb.module.thorpmanageprint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**
 * 数据库操作类
 * 
 * @version 2012-5-6
 * @author Jason
 */
public class DBOpertor extends XXNCYLBXDBAccess {
	
	public boolean insertThorpPrint(Thorp thorp) throws DBException {
		if (commonsql.connect(user, password)) {

			String sql = "insert into printThorp (t_name) values ('"
					+ thorp.getT_name() + "')";

			boolean ret = commonsql.executesql(sql);

			if (ret) {
				sql = "select * from printThorp where t_name='" + thorp.getT_name()
						+ "'";
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

	public boolean updateThorpPrint(Thorp thorp) throws DBException {
		if (commonsql.connect(user, password)) {

			String sql = "update printThorp set t_name='" + thorp.getT_name()
					+ "' where t_id=" + thorp.getT_id();

			boolean ret = commonsql.executesql(sql);

			commonsql.close();
			return ret;

		} else {

			System.err.println("connect failed!");

			throw new DBException(DBException.DB_OPEN_FALSE);

		}

	}

	public boolean deleteThorpPrint(Thorp thorp) throws DBException {
		if (commonsql.connect(user, password)) {

			String sql = "delete from printThorp where t_id=" + thorp.getT_id();

			boolean ret = commonsql.executesql(sql);

			commonsql.close();
			return ret;

		} else {

			System.err.println("connect failed!");

			throw new DBException(DBException.DB_OPEN_FALSE);

		}

	}

	public Thorp getThorpByIdPrint(int t_id) throws DBException {
		if (commonsql.connect(user, password)) {

			String sql = "select * from printThorp where t_id=" + t_id;

			if (!commonsql.query(sql)) {

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

	public List<Thorp> getThorpAllPrint() throws DBException {
		if (commonsql.connect(user, password)) {

			String sql = "select * from printThorp ";

			if (!commonsql.query(sql)) {

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

	public boolean isExistThorpPrint(String t_name) throws DBException {
		if (commonsql.connect(user, password)) {

			String sql = "select * from printThorp where t_name='" + t_name + "'";

			if (!commonsql.query(sql)) {

				return false;
			}

			boolean ret = false;
			if (commonsql.nextrecord()) {
				ret = true;
			}

			commonsql.close();
			return ret;

		} else {

			System.err.println("connect failed!");

			throw new DBException(DBException.DB_OPEN_FALSE);

		}

	}

	public boolean isExistThorpPrint(int t_id) throws DBException {
		if (commonsql.connect(user, password)) {

			String sql = "select * from printThorp where t_id=" + t_id;

			if (!commonsql.query(sql)) {

				return false;
			}

			boolean ret = false;
			if (commonsql.nextrecord()) {
				ret = true;
			}

			commonsql.close();
			return ret;

		} else {

			System.err.println("connect failed!");

			throw new DBException(DBException.DB_OPEN_FALSE);

		}

	}
}
