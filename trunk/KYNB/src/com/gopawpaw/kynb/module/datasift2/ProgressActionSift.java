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
	public ProgressActionSift(Object[][] table1,int[] conditionIndex,ProgressActionSiftListener progressActionSiftListener) {
		this.table1 = table1;
		this.conditionIndex = conditionIndex;
		this.progressActionSiftListener = progressActionSiftListener;
	}
	
	public ProgressActionSift(Object[][] table1,int[] conditionIndex,ProgressActionSiftListener progressActionSiftListener,JProgressBar progressBar) {
		this.table1 = table1;
		this.conditionIndex = conditionIndex;
		this.progressActionSiftListener = progressActionSiftListener;
		this.progressBar = progressBar;
	}

	@Override
	public void run() {
		if(jButton != null){
			jButton.setEnabled(false);
		}
		if(conditionIndex != null){
			actionSift(table1,conditionIndex);
		}else{
			
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
	private void actionSift(Object[][] table,
			int[] conditionIndex){
		
		if(table1 == null){
			return;
		}
		
		ArrayList<Object[]> table11 = new ArrayList<Object[]>(); 
		ArrayList<Object[]> table12 = new ArrayList<Object[]>(); 
		
		HashMap<Integer,String> hasFindRow = new HashMap<Integer,String>();
		
		if(progressBar != null){
			progressBar.setMaximum(100);
			progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
			progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����
		}
		
		int size = table1.length;
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
					hasFindRow.put(n, ""+n);
					equalsNum++;
				}
				
			}
			
			if(equalsNum == 0){
				//��i����¼��Ψһ��
				table11.add(row);
			}else{
				//��i����¼����equalsNum����ͬ��������equalsNum+1��
				Object[] rowD = new Object[row.length+1];
				for(int kk=0;kk<row.length;kk++){
					rowD[kk] = row[kk];
				}
				
				rowD[row.length] = ""+(equalsNum+1);
				
				table12.add(rowD);
			}
		}
		
		if(progressActionSiftListener != null){
			Object[][] ok11 = new Object[table11.size()][];
			int ok11i = 0;
			for (Object[] objects : table11) {
				ok11[ok11i] = objects;
				ok11i++;
			};
			
			Object[][] ok12 = new Object[table12.size()][];
			int ok12i = 0;
			for (Object[] objects : table12) {
				ok12[ok12i] = objects;
				ok12i++;
			};
			
			progressActionSiftListener.onProgressActionSiftFinish(ok11, ok12);
			if(progressBar != null){
				progressBar.setString("ɸѡ���ȣ�100 % ");
				progressBar.setValue(100); // ����ֵ
			}
		}
		
	}

	public void setButton(JButton jButton) {
		this.jButton = jButton;
	}

	public static void main(String[] args) {
		
		ProgressActionSiftListener lis = new ProgressActionSiftListener() {
			
			@Override
			public void onProgressActionSiftFinish(Object[][] table11,Object[][] table12) {
				
				print(table11);
				System.out.println("===============");
				print(table12);
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
		
		 int[] mCondition = new int[]{0,2};
		ProgressActionSift p = new ProgressActionSift(mTableData1,mCondition,lis);
		p.start();
	}
	
	private static void print(Object[][] table){
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
