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
public class ProgressActionSift extends Thread {// �Զ�����progress,ִ��ɸѡ��

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
			progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
			progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����
		}
		
		
		Object[][][] objs = null;
		
		//����������ȫ��ͬ
		Object[][] objDifferent = null;
		if(conditionIndex != null){
			if(mDifferent >= 0){
				int[] condit = new int[conditionIndex.length+1];
				for(int i=0;i<conditionIndex.length;i++){
					condit[i] = conditionIndex[i];
				}
				condit[conditionIndex.length] = mDifferent;
				
				//�ȹ�����������
				objs = actionSift(table1,condit);
				
				if(objs != null){
					//������������ͬ�ĳ����ٹ�����һ����������������ͬ����
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
			progressBar.setString("ɸѡ���ȣ�100 % ");
			progressBar.setValue(100); // ����ֵ
		}
		
		if(jButton != null){
			jButton.setEnabled(true);
		}

	}
	
	/**
	 * ����ɸѡ
	 * @param table1	��һ���������
	 * @param table2	�ڶ����������
	 * @param index1	��һ�����У������Աȵ�������
	 * @param index2	�ڶ������У������Աȵ�������
	 * @return	ɸѡ�����4�������ݣ�Object[][]������<br>
	 * 				0:��table1����ͬ���ֵ����ݣ�<br>
	 * 				1:��table1�в�ͬ���ֵ����ݣ�<br>
	 * 				2:��table2����ͬ���ֵ����ݣ�<br>
	 * 				3:��table2�в�ͬ���ֵ����ݣ�<br>
	 */
	private Object[][][] actionSift(Object[][] table,
			int[] conditionIndex){
		
		if(table == null){
			return null;
		}
		
		//Ψһ��¼
		ArrayList<Object[]> table11 = new ArrayList<Object[]>(); 
		
		//��ͬ��¼
		ArrayList<Object[]> table12 = new ArrayList<Object[]>(); 
		
		HashMap<Integer,String> hasFindRow = new HashMap<Integer,String>();
		
		
		//��ʱ�����ͬ��¼
		ArrayList<Object[]> rowList = new ArrayList<Object[]>(); 
		
		int size = table.length;
		for(int i=0;i<size;i++){
			
			if(progressBar != null){
				int progr = (int)(((float)i / size) * 100);
				progressBar.setString("ɸѡ���ȣ�" + progr + " % ");
				progressBar.setValue(progr); // ����ֵ
			}
			
			if(hasFindRow.get(i) != null){
				//�����Ѿ����ҵ���ͬ������ԱȽ�
				
				continue;
			}
			
			Object[] row = table[i];
			if(row == null){
				continue;
			}
			
			rowList.clear();
			
			//�����ͬ������
			int equalsNum = 0;
			
			for(int n=i+1;n<size;n++){
				//��i����һ�п�ʼ����
				Object[] rowNext = table[n];
				if(rowNext == null){
					continue;
				}
				
				boolean flagEquals = true;
				for(int con=0;con<conditionIndex.length;con++){
					//��������
					String vRow = (String) row[conditionIndex[con]];
					vRow = (vRow == null ? "" : vRow);
					
					String vRowNext = (String) rowNext[conditionIndex[con]];
					vRowNext = (vRowNext == null ? "" : vRowNext);
					
					if(!vRow.equals(vRowNext)){
						flagEquals = false;
						//��������ȣ����˳������Ƚ�
						break;
					}
				}
				
				if(flagEquals){
					//�ҵ��뵱ǰ��¼��ȵ���
					rowList.add(rowNext);
					
					hasFindRow.put(n, ""+n);
					equalsNum++;
				}
				
			}
			
			if(equalsNum == 0){
				//��i����¼��Ψһ��
				table11.add(row);
			}else{
				//��i����¼����equalsNum����ͬ��������equalsNum+1��
				
				//�ѵ�ǰ��¼��ӵ���ͬ����
				Object[] rowD = new Object[row.length+1];
				for(int kk=0;kk<row.length;kk++){
					rowD[kk] = row[kk];
				}
				
				rowD[row.length] = ""+(equalsNum+1);
				
				table12.add(rowD);
				
				for(Object[] rowTemp : rowList){
					//���뵱ǰ��¼��ͬ�Ķ���ӵ���ͬ����
					Object[] temp = new Object[rowTemp.length+1];
					for(int tt=0;tt<rowTemp.length;tt++){
						temp[tt] = rowTemp[tt];
					}
					
					temp[rowTemp.length] = ""+(equalsNum+1);
					
					table12.add(temp);
				}
			}
		}
		
		//Ψһ��¼
		Object[][] ok11 = new Object[table11.size()][];
			int ok11i = 0;
			for (Object[] objects : table11) {
				ok11[ok11i] = objects;
				ok11i++;
			};
		//��ͬ��¼
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
		 * ��һ���������
		 */
		 Object[][] mTableData1 = new Object[][]{
				 {"�ƹ�","111","222","333"},
				 {"�ƹ�1","11","22","33"},
				 {"�ƹ�1","11","22","44"},
				 {"�Ƴ���","123","33","5"},
				 {"�ƹ�2","11","55","555"},
				 {"�ƹ�","333","324","55"},
				 {"�ƹ�","111","234","555"},
				 {"�ƹ�3","234","555","565"}
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
