/**
 * 
 */
package com.gopawpaw.kynb.module.idnoupgrade2;

import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JProgressBar;

import com.gopawpaw.kynb.utils.IDNumberChecker;

/**
 * �Զ�����progress,ִ���������֤����
 * @version 2012-4-15
 * @author LiJinHua
 */
public class ProgressUpgradeIdno extends Thread {

	private Object[][] table1;
	private int index;
	private JProgressBar progressBar;
	private ProgressUpgradeIdnoListener progressUpgradeIdnoListener;
	private JButton jButton;
	private int TableColumn;
	
	public ProgressUpgradeIdno(Object[][] table1,int index) {
		this.table1 = table1;
		this.index= index;
	}

	public ProgressUpgradeIdno(Object[][] table1,int index, JProgressBar progressBar) {
		this.table1 = table1;
		this.index = index;
		this.progressBar = progressBar;

	}

	public ProgressUpgradeIdno(Object[][] table1,int index, JProgressBar progressBar,
			ProgressUpgradeIdnoListener progressUpgradeIdnoListener) {
		this.table1 = table1;
		this.index = index;
		this.progressBar = progressBar;
		this.progressUpgradeIdnoListener = progressUpgradeIdnoListener;

	}

	@Override
	public void run() {
		if(jButton != null){
			jButton.setEnabled(false);
		}
		actionIdNoCheck(table1,index);
		if(jButton != null){
			jButton.setEnabled(true);
		}

	}
	
	/**
	 * ���֤��飬�����ִ�������֤�����15λ����Ϊ18λ���֤�����������֤����
	 * @version 2012-4-3
	 * @author Jason
	 * @param
	 * @return Object[]
	 */
	private void actionIdNoCheck(Object[][] table,int index){
		
		ArrayList<Object[]> table1 = new ArrayList<Object[]>(); 
		ArrayList<Object[]> table2 = new ArrayList<Object[]>(); 
		ArrayList<Object[]> table3 = new ArrayList<Object[]>(); 
		
		
		if(table == null){
			return;
		}
		
		int size = table.length;
		progressBar.setMaximum(100);
		progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����
		for(int i=0;i<size;i++){
			
			int progr = (int)(((float)i / size) * 100);
			progressBar.setString("���������ȣ�" + progr + " % ");
			progressBar.setValue(progr); // ����ֵ
			
			Object[] v1 =  table[i];
			if(v1 == null){
				continue;
			}
			
			String vTemp1 = (String) v1[index];
			
			try {
				if(vTemp1 != null && vTemp1.endsWith("x")){
					vTemp1 = vTemp1.subSequence(0, vTemp1.length()-1) + "X";
				}
				
				int checkCode = IDNumberChecker.checkIDCard(vTemp1);
				if(IDNumberChecker.IDCARD_IS_OK == checkCode){
					//�Ϸ���18λ���֤
					table1.add(v1);
				}else if(IDNumberChecker.IDCARD_IS_OK_15 == checkCode){
					//�Ϸ���15λ���֤����Ҫ��������
					Object[] v10 = new Object[TableColumn+1];

					for(int j=0;j<v1.length;j++){
						//����һ������
						v10[j] = v1[j];
					}
					//��ĩβ���һ��
					v10[TableColumn] = IDNumberChecker.SwitchIDCard15To18(vTemp1);
					table2.add(v10);
					
				}else{
					//��������֤����Ҫ��ʾ������Ϣ
					Object[] v10 = new Object[TableColumn+1];

					for(int j=0;j<v1.length;j++){
						//����һ������
						v10[j] = v1[j];
					}
					//��ĩβ���һ��
					v10[TableColumn] = IDNumberChecker.getIDCardErrorInfo(checkCode);
					table3.add(v10);
				}
				
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(progressUpgradeIdnoListener != null){
			Object[][] tableOK = new Object[table1.size()][];
			int ok11i = 0;
			for (Object[] objects : table1) {
				tableOK[ok11i] = objects;
				ok11i++;
			};
			
			Object[][] tableUP = new Object[table2.size()][];
			int ok12i = 0;
			for (Object[] objects : table2) {
				tableUP[ok12i] = objects;
				ok12i++;
			};
			
			Object[][] tableErr = new Object[table3.size()][];
			int ok21i = 0;
			for (Object[] objects : table3) {
				tableErr[ok21i] = objects;
				ok21i++;
			};
			
			progressUpgradeIdnoListener.onProgressUpgradeFinish(tableOK, tableUP, tableErr);
			
			progressBar.setString("���������ȣ�100 % ");
			progressBar.setValue(100); // ����ֵ
		}
		
	}

	public void setButton(JButton jButton) {
		this.jButton = jButton;
	}

	public void setTableColumn(int tableColumn) {
		TableColumn = tableColumn;
	}

}
