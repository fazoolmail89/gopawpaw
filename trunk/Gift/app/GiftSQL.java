package app;

import java.sql.ResultSet;

public class GiftSQL {
	private String fileurl = null;
	
	private AccessBase accbase;
	
	public GiftSQL(){
		initialize();
	}
	
	private void initialize() {
		
		this.fileurl = System.getProperty("user.dir")+"\\Data.mdb";
		
		this.accbase = new AccessBase(this.fileurl,"","");
		
		accbase.connect();
	}
	
	public ResultSet executeQuery(String sql) {
		
		return accbase.executeQuery(sql);
	}
	
	public void close(){
		
		accbase.close();
		
	}

}
