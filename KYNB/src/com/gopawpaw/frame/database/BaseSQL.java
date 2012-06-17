package com.gopawpaw.frame.database;

import com.gopawpaw.kynb.db.DBException;

public class BaseSQL extends GppSQL {

	public BaseSQL() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean updateConfig(String key,String valuse) throws DBException{
		if (commonsql.connect(user, password)) {
			
			String sql = "update config set c_v='"+valuse+"' where c_k='"+key+"'";
			
			boolean ret = commonsql.executesql(sql);
			
			commonsql.close();
			return ret;
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
	}
	
	public String getConfig(String key) throws DBException{
		String ret = null;
		if (commonsql.connect(user, password)) {
			
			String sql = "select c_v from config where c_k='"+key+"'";
			
			if(!commonsql.query(sql)){
				
				return null;
			}
			
			while (commonsql.nextrecord()) {
				ret = commonsql.getString("c_v");
			}
			
			commonsql.close();
			
		} else {
			
			System.err.println("connect failed!");
			
			throw new DBException(DBException.DB_OPEN_FALSE);
			
		}
		
		return ret;
		
	}
	
}
