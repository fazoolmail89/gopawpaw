/**
 * 
 */
package com.gopawpaw.kynb.module.datasift;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JProgressBar;

/**
 * @version 2012-4-15
 * @author LiJinHua
 */
public class ProgressActionSift extends Thread {// �Զ�����progress,ִ��ɸѡ��

	private Object[][] table1;
	private Object[][] table2;
	private int index1;
	private int index2;
	private JProgressBar progressBar;
	private ProgressActionSiftListener progressActionSiftListener;
	private JButton jButton;
	private int[][] conditionIndex;
	public ProgressActionSift(Object[][] table1, Object[][] table2,
			int index1, int index2) {
		this.table1 = table1;
		this.table2 = table2;
		this.index1 = index1;
		this.index2 = index2;
	}

	public ProgressActionSift(Object[][] table1, Object[][] table2,
			int index1, int index2, JProgressBar progressBar) {
		this.table1 = table1;
		this.table2 = table2;
		this.index1 = index1;
		this.index2 = index2;
		this.progressBar = progressBar;

	}

	public ProgressActionSift(Object[][] table1, Object[][] table2,
			int index1, int index2, JProgressBar progressBar,
			ProgressActionSiftListener progressActionSiftListener) {
		this.table1 = table1;
		this.table2 = table2;
		this.index1 = index1;
		this.index2 = index2;
		this.progressBar = progressBar;
		this.progressActionSiftListener = progressActionSiftListener;

	}
	
	public ProgressActionSift(Object[][] table1, Object[][] table2,
			int[][] conditionIndex, JProgressBar progressBar,
			ProgressActionSiftListener progressActionSiftListener) {
		this.table1 = table1;
		this.table2 = table2;
		this.conditionIndex = conditionIndex;
		this.progressBar = progressBar;
		this.progressActionSiftListener = progressActionSiftListener;

	}

	@Override
	public void run() {
		if(jButton != null){
			jButton.setEnabled(false);
		}
		if(conditionIndex != null){
			actionSift(table1,table2,conditionIndex);
		}else{
			actionSift(table1,table2,index1,index2);
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
	private void actionSift(Object[][] table1, Object[][] table2,
			int[][] conditionIndex){
		
		if(table1 == null || table2 == null){
			return;
		}
		
		ArrayList<Object[]> table11 = new ArrayList<Object[]>(); 
		ArrayList<Object[]> table12 = new ArrayList<Object[]>(); 
		ArrayList<Object[]> table21 = new ArrayList<Object[]>(); 
		ArrayList<Object[]> table22 = new ArrayList<Object[]>(); 
		
		for(int i=0;i<table2.length;i++){
			//���Ƶڶ�����
			table22.add(table2[i]);
			
		}
		
		
		int sizet1 = table1.length;
		progressBar.setMaximum(100);
		progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����
		
		for(int i1 = 0;i1<sizet1; i1++){
			
			int progr = (int)(((float)i1 / sizet1) * 100);
			progressBar.setString("ɸѡ���ȣ�" + progr + " % ");
			progressBar.setValue(progr); // ����ֵ
			
			Object[] v1 = table1[i1];
			
			if(v1 == null){
				continue;
			}
			//��һ����ĵ�һ��������
			String vTemp1 = (String) v1[conditionIndex[0][0]];
			
			vTemp1 = (vTemp1 == null ? "" : vTemp1);
			
			boolean flag = false;
			
			int sizet2 = table2.length;
			
			for(int i2 = 0;i2<sizet2; i2++){
				Object[] v2 = table2[i2];
				
				if(v2 == null){
					continue;
				}
				//�ڶ�����ĵ�һ��������
				String vTemp2 = (String) v2[conditionIndex[0][1]];
				
				if(vTemp1.equals(vTemp2)){
					//AB�������һ����������ƥ������ݣ����ж��Ƿ�ڶ������������Ƿ�Ҳ��ͬ
					//��־Ĭ��N�����������
					boolean falgConditionN = true;
					int csize = conditionIndex.length;
					for(int ci=1;ci<csize;ci++){
						String vTempN1 = (String) v1[conditionIndex[ci][0]];
						String vTempN2 = (String) v2[conditionIndex[ci][1]];
						
						vTempN1 = (vTempN1 == null ? "" : vTempN1);
						
						if(!vTempN1.equals(vTempN2)){
							//�ں�����������ֻҪ��һ���������ȣ��ͱ�־Ϊʧ��
							falgConditionN=false;
						}
					}
					
					if(falgConditionN){
						//��N����������Ⱥ�
						table11.add(v1);
						table21.add(v2);
						
						//����ͬ���ִ�B���Ƴ���ʣ�µ�table22���ǽ���B���еĲ���
						table22.remove(v2);
						flag = true;
					}
					break;
				}
				
			}
			
			if(!flag){
				//�ڵڶ�������û���ҵ�������ʱ��������A���еĲ���
				table12.add(v1);
			}
		}
		
		int size12 = table22.size();
		
		for(int i=0;i<size12;i++){
			if(table22.get(i) == null){
				table22.remove(i);
				i--;
				size12--;
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
			
			Object[][] ok21 = new Object[table21.size()][];
			int ok21i = 0;
			for (Object[] objects : table21) {
				ok21[ok21i] = objects;
				ok21i++;
			};
			
			Object[][] ok22 = new Object[table22.size()][];
			int ok22i = 0;
			for (Object[] objects : table22) {
				ok22[ok22i] = objects;
				ok22i++;
			};
			progressActionSiftListener.onProgressActionSiftFinish(ok11, ok12, ok21, ok22);
			
			progressBar.setString("ɸѡ���ȣ�100 % ");
			progressBar.setValue(100); // ����ֵ
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
	private void actionSift(Object[][] table1, Object[][] table2,
			int index1, int index2){
		
		if(table1 == null || table2 == null){
			return;
		}
		
		ArrayList<Object[]> table11 = new ArrayList<Object[]>(); 
		ArrayList<Object[]> table12 = new ArrayList<Object[]>(); 
		ArrayList<Object[]> table21 = new ArrayList<Object[]>(); 
		ArrayList<Object[]> table22 = new ArrayList<Object[]>(); 
		
		for(int i=0;i<table2.length;i++){
			//���Ƶڶ�����
			table22.add(table2[i]);
			
		}
		
		
		int sizet1 = table1.length;
		progressBar.setMaximum(100);
		progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����
		
		for(int i1 = 0;i1<sizet1; i1++){
			
			int progr = (int)(((float)i1 / sizet1) * 100);
			progressBar.setString("ɸѡ���ȣ�" + progr + " % ");
			progressBar.setValue(progr); // ����ֵ
			
			Object[] v1 = table1[i1];
			
			if(v1 == null){
				continue;
			}
			
			String vTemp1 = (String) v1[index1];
			
			vTemp1 = (vTemp1 == null ? "" : vTemp1);
			
			boolean flag = false;
			
			int sizet2 = table2.length;
			
			for(int i2 = 0;i2<sizet2; i2++){
				Object[] v2 = table2[i2];
				
				if(v2 == null){
					continue;
				}
				
				String vTemp2 = (String) v2[index2];
				
				if(vTemp1.equals(vTemp2)){
					//AB����������ƥ�������
					table11.add(v1);
					table21.add(v2);
					
					//����ͬ���ִ�B���Ƴ���ʣ�µ�table22���ǽ���B���еĲ���
					table22.remove(v2);
					flag = true;
					break;
				}
				
			}
			
			if(!flag){
				//�ڵڶ�������û���ҵ�������ʱ��������A���еĲ���
				table12.add(v1);
			}
		}
		
		int size12 = table22.size();
		
		for(int i=0;i<size12;i++){
			if(table22.get(i) == null){
				table22.remove(i);
				i--;
				size12--;
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
			
			Object[][] ok21 = new Object[table21.size()][];
			int ok21i = 0;
			for (Object[] objects : table21) {
				ok21[ok21i] = objects;
				ok21i++;
			};
			
			Object[][] ok22 = new Object[table22.size()][];
			int ok22i = 0;
			for (Object[] objects : table22) {
				ok22[ok22i] = objects;
				ok22i++;
			};
			progressActionSiftListener.onProgressActionSiftFinish(ok11, ok12, ok21, ok22);
			
			progressBar.setString("ɸѡ���ȣ�100 % ");
			progressBar.setValue(100); // ����ֵ
		}
		
	}

	public void setButton(JButton jButton) {
		this.jButton = jButton;
	}

}
