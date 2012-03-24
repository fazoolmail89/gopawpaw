package com.gopawpaw.kynb.db;

public class DBException extends Exception{
	
	public final static int DB_OPEN_FALSE = 1;
	
	private int exCode ;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public DBException(int exCode) {
		// TODO Auto-generated constructor stub
		this.exCode = exCode;
	}
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}


	public int getExCode() {
		return exCode;
	}

}
