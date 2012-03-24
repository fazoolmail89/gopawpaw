/**
 * 
 */
package com.gopawpaw.frame;

import java.util.HashMap;

import org.apache.log4j.chainsaw.Main;

import com.gopawpaw.frame.dataEntity.Dmnd_det;

/**
 * @version 2010-5-31
 * @author 李锦华
 *	授权类
 */
public class Authorization {

	private HashMap<String, Boolean> hmcanrun = new HashMap<String, Boolean>();
	
	private static Authorization thisAuthorization = null;
	/**
	 * 
	 */
	private Authorization() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 初始化
	 */
	private static void initialize() {
		thisAuthorization = new Authorization();
	}
	
	public static boolean canRun(Dmnd_det dd){
		
		if(thisAuthorization == null){
			initialize();
		}
		
		thisAuthorization.updateCanRunMap(dd.getMnd_canrun());
		
		return thisAuthorization.canRun();
	}
	
	/**
	 * 判断是否运行运行，仅提供私有调用
	 */
	private boolean canRun(){
		boolean retboo = false;
		String tem = GlobalParameter.getLoginSession().getUsername();
		Boolean bool = (Boolean)hmcanrun.get(tem);
		
		if(bool == null){
			bool = (Boolean)hmcanrun.get("*");
			if(bool == null || !bool){
				retboo = false;
			}else{
				retboo = true;
			}
		}else if(!bool){
			retboo = false;
		}else{
			retboo = true;
		}
//		System.out.println(tem);
//		System.out.println(retboo);
		return retboo;
	}
	
	/**
	 * 判断是否运行运行，仅提供私有调用
	 */
	private boolean canRunFather(Dmnd_det dd){
		boolean retboo = false;
		
		Authorization auth = new Authorization();
		
		
		
		return retboo;
	}
	/**
	 * 更新该菜单可运行的用户信息[*,mfg,!sc001]到 HashMap
	 */
	private void updateCanRunMap(String canRun){
		hmcanrun.clear();
		if(canRun == null || canRun.isEmpty()){
			return;
		}
	
		String[] c = canRun.split(",");
		for(int i=0;i<c.length;i++){
			String tem = c[i];
			if(tem.startsWith("!")){
				tem = tem.substring(1, tem.length());
				hmcanrun.put(tem, false);
//				System.out.println("=="+tem+"false");
			}else{
				hmcanrun.put(tem, true);
//				System.out.println("=="+tem+"true");
			}
			
		}
	}

	public static void main(String[] args) {
		Authorization a = new Authorization();
		GlobalParameter.initialize();
		a.updateCanRunMap("!*");
		a.canRun();
	}
	
}
