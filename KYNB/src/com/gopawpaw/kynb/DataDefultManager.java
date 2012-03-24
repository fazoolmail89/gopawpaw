/**
 * 
 */
package com.gopawpaw.kynb;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.gopawpaw.kynb.bean.DefultData;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.utils.GppConfiguration;

/**
 * @author 李锦华
 * @since: 2011-11-14
 */
public class DataDefultManager {

	private static DataDefultManager mDataDefultManager;
	
	private final static String confPath = "conf\\edit\\";
	
	private final static String iniFile = "ini.ini";
	
	private final static String filePostfix=".ini";
	
	private final static String defIC = confPath+"ic.ini";
	
	private GppConfiguration mGppConfiguration ;
	
	private HashMap<String,List<DefultData>> mHashMapDefultData = new HashMap<String,List<DefultData>>();
	
	private DefultDataComparator mDefultDataComparator = new DefultDataComparator();
	
	private HashMap<String,Boolean> mDefultEditShow = new HashMap<String,Boolean>();
	
	private static GppConfiguration mGppConfigurationIni;
	
	private ArrayList<DefultData> editOrderList;
	
	
	/**
	 * 
	 */
	private DataDefultManager() {
		// TODO Auto-generated constructor stub
	}

	public static DataDefultManager getInstance(){
		if(mDataDefultManager == null){
			mDataDefultManager = new DataDefultManager();
			mDataDefultManager.initData();
		}
		
		return mDataDefultManager;
	}
	
	/**
	 * 判断文件是否存在
	 * @author 李锦华
	 * @since:2011-11-15
	 * @param filePath
	 * @return
	 */
	private boolean isFileExist(String filePath){
		if(filePath==null || "".equals(filePath)){
			return false;
		}
		File f = new File(filePath);
		return f.exists();
	}
	
	/**
	 * 初始化数据
	 * @author 李锦华
	 * @since:2011-11-14
	 * @return
	 */
	private boolean initData(){
		
//		System.out.println(isFileExist(defIC));
//		mGppConfiguration = new GppConfiguration(defIC);
//		mHashMapIC = new HashMap<String,String>();
//		
//		Set set = mGppConfiguration.getKeySet();
//		Iterator it = set.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		initEditOrderList();
		return true;
	}
	
	public List<DefultData> getDefultData(String fileName){
		
		String path = confPath + fileName+filePostfix;
		
		List<DefultData> listDD = mHashMapDefultData.get(fileName);
		
		if(listDD == null){
			listDD = new ArrayList<DefultData>();
			if(isFileExist(path)){
				DefultData dd = null;
				mGppConfiguration = new GppConfiguration(path);
				Iterator<?> it = mGppConfiguration.getKeySet().iterator();
				while(it.hasNext()){
					
					String key = (String) it.next();
					String valuse = mGppConfiguration.getValue(key);
					dd = new DefultData(key,valuse);
					listDD.add(dd);
				}
				
				Collections.sort(listDD,mDefultDataComparator);
				mHashMapDefultData.put(fileName, listDD);
			}
		}
		
		return listDD;
	} 
	
	class DefultDataComparator implements Comparator<DefultData> {

		@Override
		public int compare(DefultData arg0, DefultData arg1) {
			// TODO Auto-generated method stub
			String k1 = arg0.getKey();
			String k2 = arg1.getKey();
			
			try{
				Integer i1 = Integer.parseInt(k1);
				Integer i2 = Integer.parseInt(k2);
				
				if(i1 != null && i2 != null){
					if(i1>i2){
						return 1;
					}else if(i1 < i2){
						return -1;
					}else{
						return 0;
					}
				}
			}catch (NumberFormatException nfe){
				
			}
			
			
			
			return arg0.getKey().compareToIgnoreCase(arg1.getKey());
		}
		
	}
	
	/**
	 * @author 李锦华
	 * @since:2011-11-14
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataDefultManager.getInstance();
	}

	public HashMap<String, Boolean> getmDefultEditShow() {
		
		if(mDefultEditShow == null || mDefultEditShow.size() == 0){
			mDefultEditShow = new HashMap<String,Boolean>();
			if(isFileExist(iniFile)){
				mGppConfigurationIni = new GppConfiguration(iniFile);
				
				List<String> list = Villager.getKeyList();
				for(String key :list){
					String valuse = mGppConfigurationIni.getValue(key);
//					System.out.println(key+"=="+valuse);
					if("1".equals(valuse)){
						mDefultEditShow.put(key, true);
					}else{
						mDefultEditShow.put(key, false);
					}
					
				}
				
			}
		}
		
		return mDefultEditShow;
	}

	public static GppConfiguration getmGppConfigurationIni() {
		
		if(mGppConfigurationIni == null){
			mGppConfigurationIni = new GppConfiguration(iniFile);
		}
		return mGppConfigurationIni;
	}
	
	/**
	 * 初始化编辑顺序
	 * @version 2011-12-5
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void initEditOrderList(){
//		return;
		String path = confPath + "EditOrder.ini";
		mGppConfiguration = new GppConfiguration(path);
		editOrderList = new ArrayList<DefultData>();
		DefultData dd ;
		Iterator<?> it = mGppConfiguration.getKeySet().iterator();
		while(it.hasNext()){
			
			String key = (String) it.next();
			String valuse = mGppConfiguration.getValue(key);
			dd = new DefultData(key,valuse);
			editOrderList.add(dd);
		}
		
		Collections.sort(editOrderList,mDefultDataComparator);
	}

	/**
	 * 获取数据编辑顺序
	 * @version 2011-12-6
	 * @author Jason
	 * @param
	 * @return ArrayList<DefultData>
	 */
	public ArrayList<DefultData> getEditOrder(HashMap<String,Object> hashMap){
		ArrayList<DefultData> list = new ArrayList<DefultData>();
		
		for(DefultData dd:editOrderList){
			dd.setObj(hashMap.get(dd.getValuse()));
			list.add(dd);
		}
		
		return list;
	}
	
	public ArrayList<DefultData> getEditNextFocuseOrder(HashMap<String,Object> hashMap){
		ArrayList<DefultData> list = new ArrayList<DefultData>();
		
		for(DefultData dd:editOrderList){
			dd.setObj(hashMap.get(dd.getValuse()));
			list.add(dd);
		}
		
		return list;
	}
	
}




