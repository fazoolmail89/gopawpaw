/**
 * 
 */
package com.gopawpaw.kynb.module.datasift2;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JProgressBar;

/**
 * @version 2012-4-15
 * @author LiJinHua
 */
public class ProgressActionSift extends Thread {// 自定义类progress,执行筛选用

	private Object[][] table1;
	private JProgressBar progressBar;
	private ProgressActionSiftListener progressActionSiftListener;
	private JButton jButton;
	private int[] conditionIndex;
	private int mDifferent = -1;
	public ProgressActionSift(Object[][] table1,int[] conditionIndex,int different,ProgressActionSiftListener progressActionSiftListener) {
		this.table1 = table1;
		this.conditionIndex = conditionIndex;
		this.mDifferent = different;
		this.progressActionSiftListener = progressActionSiftListener;
	}
	
	public ProgressActionSift(Object[][] table1,int[] conditionIndex,int different,ProgressActionSiftListener progressActionSiftListener,JProgressBar progressBar) {
		this.table1 = table1;
		this.conditionIndex = conditionIndex;
		this.mDifferent = different;
		this.progressActionSiftListener = progressActionSiftListener;
		this.progressBar = progressBar;
	}

	@Override
	public void run() {
		if(jButton != null){
			jButton.setEnabled(false);
		}
		
		if(progressBar != null){
			progressBar.setMaximum(100);
			progressBar.setStringPainted(true); // 显示提示信息
			progressBar.setIndeterminate(false); // 确定进度的进度条
		}
		
		
		Object[][][] objs = null;
		
		//区分条件完全相同
		Object[][] objDifferent = null;
		if(conditionIndex != null){
			if(mDifferent >= 0){
				int[] condit = new int[conditionIndex.length+1];
				for(int i=0;i<conditionIndex.length;i++){
					condit[i] = conditionIndex[i];
				}
				condit[conditionIndex.length] = mDifferent;
				
				//先过滤区分条件
				objs = actionSift(table1,condit);
				
				if(objs != null){
					//把区分条件相同的出，再过减少一个区分条件过来相同条件
					objDifferent = objs[1];
					
					objs = actionSift(objs[0],conditionIndex);
				}
			}else{
				objs = actionSift(table1,conditionIndex);
			}
			
		}else{
			return;
		}
		if(objs[0] == null){
			objs[0] = new Object[][]{};
		}
		
		if(objs[1] == null){
			objs[1] = new Object[][]{};
		}
		
		if(objDifferent == null){
			objDifferent = new Object[][]{};
		}
		
		progressActionSiftListener.onProgressActionSiftFinish(objs[0], objs[1],objDifferent);
		if(progressBar != null){
			progressBar.setString("筛选进度：100 % ");
			progressBar.setValue(100); // 进度值
		}
		
		if(jButton != null){
			jButton.setEnabled(true);
		}

	}
	
	/**
	 * 数据筛选
	 * @param table1	第一个表的数据
	 * @param table2	第二个表的数据
	 * @param index1	第一个表中，用来对比的列索引
	 * @param index2	第二个表中，用来对比的列索引
	 * @return	筛选结果的4个表数据（Object[][]）数组<br>
	 * 				0:在table1中相同部分的数据；<br>
	 * 				1:在table1中不同部分的数据；<br>
	 * 				2:在table2中相同部分的数据；<br>
	 * 				3:在table2中不同部分的数据；<br>
	 */
	private Object[][][] actionSift(Object[][] table,
			int[] conditionIndex){
		
		if(table == null){
			return null;
		}
		
		//唯一记录
		ArrayList<Object[]> table11 = new ArrayList<Object[]>(); 
		
		//相同记录
		ArrayList<Object[]> table12 = new ArrayList<Object[]>(); 
		
		HashMap<Integer,String> hasFindRow = new HashMap<Integer,String>();
		
		
		//临时存放相同记录
		ArrayList<Object[]> rowList = new ArrayList<Object[]>(); 
		
		int size = table.length;
		for(int i=0;i<size;i++){
			
			if(progressBar != null){
				int progr = (int)(((float)i / size) * 100);
				progressBar.setString("筛选进度：" + progr + " % ");
				progressBar.setValue(progr); // 进度值
			}
			
			if(hasFindRow.get(i) != null){
				//该行已经被找到相同，则忽略比较
				
				continue;
			}
			
			Object[] row = table[i];
			if(row == null){
				continue;
			}
			
			rowList.clear();
			
			//存放相同的数量
			int equalsNum = 0;
			
			for(int n=i+1;n<size;n++){
				//从i的下一行开始遍历
				Object[] rowNext = table[n];
				if(rowNext == null){
					continue;
				}
				
				boolean flagEquals = true;
				for(int con=0;con<conditionIndex.length;con++){
					//遍历条件
					String vRow = (String) row[conditionIndex[con]];
					vRow = (vRow == null ? "" : vRow);
					
					String vRowNext = (String) rowNext[conditionIndex[con]];
					vRowNext = (vRowNext == null ? "" : vRowNext);
					
					if(!vRow.equals(vRowNext)){
						flagEquals = false;
						//条件不相等，则退出条件比较
						break;
					}
				}
				
				if(flagEquals){
					//找到与当前记录相等的行
					rowList.add(rowNext);
					
					hasFindRow.put(n, ""+n);
					equalsNum++;
				}
				
			}
			
			if(equalsNum == 0){
				//第i条记录是唯一的
				table11.add(row);
			}else{
				//第i条记录存在equalsNum条相同，即共有equalsNum+1条
				
				//把当前记录添加到相同表中
				Object[] rowD = new Object[row.length+1];
				for(int kk=0;kk<row.length;kk++){
					rowD[kk] = row[kk];
				}
				
				rowD[row.length] = ""+(equalsNum+1);
				
				table12.add(rowD);
				
				for(Object[] rowTemp : rowList){
					//把与当前记录相同的都添加到相同表中
					Object[] temp = new Object[rowTemp.length+1];
					for(int tt=0;tt<rowTemp.length;tt++){
						temp[tt] = rowTemp[tt];
					}
					
					temp[rowTemp.length] = ""+(equalsNum+1);
					
					table12.add(temp);
				}
			}
		}
		
		//唯一记录
		Object[][] ok11 = new Object[table11.size()][];
			int ok11i = 0;
			for (Object[] objects : table11) {
				ok11[ok11i] = objects;
				ok11i++;
			};
		//相同记录
		Object[][] ok12 = new Object[table12.size()][];
			int ok12i = 0;
			for (Object[] objects : table12) {
				ok12[ok12i] = objects;
				ok12i++;
			};
			
			
		Object[][][] objret = new Object[][][]{ok11,ok12};
		
		return objret;
		
	}

	public void setButton(JButton jButton) {
		this.jButton = jButton;
	}

	public static void main(String[] args) {
		
		ProgressActionSiftListener lis = new ProgressActionSiftListener() {
			
			@Override
			public void onProgressActionSiftFinish(Object[][] table11,Object[][] table12,Object[][] table13) {
				
				print(table11);
				System.out.println("===============");
				print(table12);
				System.out.println("===============");
				print(table13);
			}
		};
		
		/**
		 * 第一个表的数据
		 */
		 Object[][] mTableData1 = new Object[][]{
				 {"黄桂春","111","222","333"},
				 {"黄桂春1","11","22","33"},
				 {"黄桂春1","11","22","44"},
				 {"黄朝辉","123","33","5"},
				 {"黄桂春2","11","55","555"},
				 {"黄桂春","333","324","55"},
				 {"黄桂春","111","234","555"},
				 {"黄桂春3","234","555","565"}
		 };
		
		 int[] mCondition = new int[]{0,3};
		ProgressActionSift p = new ProgressActionSift(mTableData1,mCondition,2,lis);
		p.start();
	}
	
	private static void print(Object[][] table){
		if(table == null){
			return;
		}
		for(int i=0;i<table.length;i++){
			Object[] row = table[i];
			String strRow = "";
			for(int n=0;n<row.length;n++){
				Object obj = row[n];
				strRow = strRow + obj + ",";
			}
			System.out.println(strRow);
		}
	}
}
