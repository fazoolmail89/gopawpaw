/**
 * 
 */
package com.gopawpaw.frame;

import java.util.HashMap;

import org.apache.log4j.chainsaw.Main;

import com.gopawpaw.frame.dataEntity.Dmnd_det;

/**
 * @version 2010-5-31
 * @author �����
 *	��Ȩ��
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
	 * ��ʼ��
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
	 * �ж��Ƿ��������У����ṩ˽�е���
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
	 * �ж��Ƿ��������У����ṩ˽�е���
	 */
	private boolean canRunFather(Dmnd_det dd){
		boolean retboo = false;
		
		Authorization auth = new Authorization();
		
		
		
		return retboo;
	}
	/**
	 * ���¸ò˵������е��û���Ϣ[*,mfg,!sc001]�� HashMap
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
