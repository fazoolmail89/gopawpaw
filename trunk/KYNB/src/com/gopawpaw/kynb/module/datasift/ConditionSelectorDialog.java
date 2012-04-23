/**
 * 
 */
package com.gopawpaw.kynb.module.datasift;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.gopawpaw.frame.java.awt.GppDialog;
import com.gopawpaw.frame.javax.swing.GppJCheckBox;
import com.gopawpaw.frame.javax.swing.GppJComboBox;
import com.gopawpaw.kynb.bean.JComboBoxItem;

/**
 * ����ɸѡ����ѡ��Ի���
 * @version 2012-4-23
 * @author LiJinHua
 */
public class ConditionSelectorDialog extends GppDialog {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * ������ʾ
	 */
	private JTextArea jLabelConditionShow = new JTextArea();
	
	/**
	 * �����Ƿ�����
	 */
	private GppJCheckBox checkBox1 = new GppJCheckBox("����һ��");
	private GppJCheckBox checkBox2 = new GppJCheckBox("��������");
	private GppJCheckBox checkBox3 = new GppJCheckBox("��������");
	private GppJCheckBox checkBox4 = new GppJCheckBox("�����ģ�");
	private GppJCheckBox checkBox5 = new GppJCheckBox("�����壺");
	
	/**
	 * ��һ������
	 */
	private GppJComboBox comboBox11 = new GppJComboBox();
	private GppJComboBox comboBox12 = new GppJComboBox();
	
	/**
	 * �ڶ�������
	 */
	private GppJComboBox comboBox21 = new GppJComboBox();
	private GppJComboBox comboBox22 = new GppJComboBox();
	
	/**
	 * ����������
	 */
	private GppJComboBox comboBox31 = new GppJComboBox();
	private GppJComboBox comboBox32 = new GppJComboBox();
	
	/**
	 * ����������
	 */
	private GppJComboBox comboBox41 = new GppJComboBox();
	private GppJComboBox comboBox42 = new GppJComboBox();
	
	/**
	 * ����������
	 */
	private GppJComboBox comboBox51 = new GppJComboBox();
	private GppJComboBox comboBox52 = new GppJComboBox();
	
	
	private Object[] titleA;
	private Object[] titleB;
	
	private ConditionSelectedListener conditionSelectedListener;
	
	private int[][] contition;
	
	public ConditionSelectorDialog(Frame owner) {
		super(owner);
		init();
	}

	
	private void init() {
		
		jLabelConditionShow.setEditable(false);
		
		checkBox1.addItemListener(new java.awt.event.ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
					if (e.getStateChange() == 1) {
					} else {
					}
			}
		
		});
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				ConditionSelectorDialog.this.setVisible(false);
			}
		});
		
		this.setModal(true);
	}
	
	@Override
	public void setVisible(boolean arg0) {
		super.setTitle("ѡ������");
		this.setSize(400, 300);
		
		this.setLocation(this.getOwner().getLocation().x+this.getOwner().getSize().width/3,this.getOwner().getLocation().y+this.getOwner().getSize().height/4);

		this.add(getJPanelContent());
		initTitleComboBox();
		
		if(!arg0){
			//�ص�ʱ�����лص��ӿڣ���ѡ�����������ȥ
			if(conditionSelectedListener != null){
				conditionSelectedListener.onConditionSelected(contition);
			}
		}
		super.setVisible(arg0);
	}
	
	
	
	private JPanel getJPanelContent() {
		JPanel jPanelContent = new JPanel();
		jPanelContent.setLayout(new BorderLayout());
		
		JPanel jPanelY = new JPanel();
		jPanelY.setLayout(new BoxLayout(jPanelY, BoxLayout.Y_AXIS));
		
		JPanel jPanelX0 = new JPanel();
		jPanelX0.setLayout(new BoxLayout(jPanelX0, BoxLayout.X_AXIS));
		jPanelX0.add(new JLabel("����ѡ��                 A��.A�� = B��.A��           "));

		
		JPanel jPanelX1 = new JPanel();
		jPanelX1.setLayout(new BoxLayout(jPanelX1, BoxLayout.X_AXIS));
		jPanelX1.add(new JLabel("   "));
		jPanelX1.add(checkBox1);
		jPanelX1.add(comboBox11);
		jPanelX1.add(new JLabel(" = "));
		jPanelX1.add(comboBox12);
		
		JPanel jPanelX2 = new JPanel();
		jPanelX2.setLayout(new BoxLayout(jPanelX2, BoxLayout.X_AXIS));
		jPanelX2.add(new JLabel("   "));
		jPanelX2.add(checkBox2);
		jPanelX2.add(comboBox21);
		jPanelX2.add(new JLabel(" = "));
		jPanelX2.add(comboBox22);
		
		JPanel jPanelX3 = new JPanel();
		jPanelX3.setLayout(new BoxLayout(jPanelX3, BoxLayout.X_AXIS));
		jPanelX3.add(new JLabel("   "));
		jPanelX3.add(checkBox3);
		jPanelX3.add(comboBox31);
		jPanelX3.add(new JLabel(" = "));
		jPanelX3.add(comboBox32);
		
		JPanel jPanelX4 = new JPanel();
		jPanelX4.setLayout(new BoxLayout(jPanelX4, BoxLayout.X_AXIS));
		jPanelX4.add(new JLabel("   "));
		jPanelX4.add(checkBox4);
		jPanelX4.add(comboBox41);
		jPanelX4.add(new JLabel(" = "));
		jPanelX4.add(comboBox42);
		
		JPanel jPanelX5 = new JPanel();
		jPanelX5.setLayout(new BoxLayout(jPanelX5, BoxLayout.X_AXIS));
		jPanelX5.add(new JLabel("   "));
		jPanelX5.add(checkBox5);
		jPanelX5.add(comboBox51);
		jPanelX5.add(new JLabel(" = "));
		jPanelX5.add(comboBox52);
		
		jPanelY.add(jPanelX0);
		jPanelY.add(jPanelX1);
		jPanelY.add(jPanelX2);
		jPanelY.add(jPanelX3);
		jPanelY.add(jPanelX4);
		jPanelY.add(jPanelX5);
		
		//ȷ��ȡ����ť��� 
		JPanel jPanelXOK = new JPanel();
		jPanelXOK
					.setLayout(new GridLayout());
		jPanelXOK.add(getJButtonConfirm());
//		jPanelXOK.add(getJButtonCancel());
		
		jPanelContent.add(jPanelY, BorderLayout.NORTH);
		jPanelContent.add(jLabelConditionShow, BorderLayout.CENTER);
		jPanelContent.add(jPanelXOK, BorderLayout.SOUTH);
		
		return jPanelContent;
	}
	
	/**
	 * ��ʼ������ѡ���
	 * @version 2012-4-23
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	private void initTitleComboBox(){
		if(titleA == null || titleB == null){
			return;
		}
		
		int size = titleA.length;
		for (int i = 0; i < size; i++) {
			JComboBoxItem ji = new JComboBoxItem();
			ji.index = i;
			ji.name = (String) titleA[i];
			comboBox11.addItem(ji);
			comboBox21.addItem(ji);
			comboBox31.addItem(ji);
			comboBox41.addItem(ji);
			comboBox51.addItem(ji);
		}
		
		int size2 = titleB.length;
		for (int i = 0; i < size2; i++) {
			JComboBoxItem ji = new JComboBoxItem();
			ji.index = i;
			ji.name = (String) titleB[i];
			comboBox12.addItem(ji);
			comboBox22.addItem(ji);
			comboBox32.addItem(ji);
			comboBox42.addItem(ji);
			comboBox52.addItem(ji);
		}
		
		
	}
	
	private JButton getJButtonConfirm() {

		JButton jButton = new JButton();
		jButton.setText("ȷ�� ");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {

				actionSelect(true);
			}
		});
		
		return jButton;
	}
	
	private JButton getJButtonCancel() {

		JButton jButton = new JButton();
		jButton.setText("ȡ�� ");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
			}
		});
		
		return jButton;
	}
	
	private void actionSelect(boolean flag){
		if(flag){
			
			JComboBoxItem jbi;
			int conditionCount = 0;
			
			StringBuffer showCondition = new StringBuffer();
			
			int[] condi1 = null;
			if(checkBox1.isSelected()){
				//����һѡ��
				condi1 = new int[2];
				conditionCount ++;
				jbi = (JComboBoxItem)comboBox11.getSelectedItem();
				condi1[0] = jbi.index;
				showCondition.append("\n"+jbi.toString());
				jbi = (JComboBoxItem)comboBox12.getSelectedItem();
				condi1[1] = jbi.index;
				showCondition.append("  =  "+jbi.toString());
			}
			
			int[] condi2 = null;
			if(checkBox2.isSelected()){
				//����2ѡ��
				condi2 = new int[2];
				conditionCount ++;
				jbi = (JComboBoxItem)comboBox21.getSelectedItem();
				condi2[0] = jbi.index;
				showCondition.append("\n"+jbi.toString());
				jbi = (JComboBoxItem)comboBox22.getSelectedItem();
				condi2[1] = jbi.index;
				showCondition.append("  =  "+jbi.toString());
			}
			
			int[] condi3 = null;
			if(checkBox3.isSelected()){
				//����3ѡ��
				condi3 = new int[2];
				conditionCount ++;
				jbi = (JComboBoxItem)comboBox31.getSelectedItem();
				condi3[0] = jbi.index;
				showCondition.append("\n"+jbi.toString());
				jbi = (JComboBoxItem)comboBox32.getSelectedItem();
				condi3[1] = jbi.index;
				showCondition.append("  =  "+jbi.toString());
			}
			
			int[] condi4 = null;
			if(checkBox4.isSelected()){
				//����4ѡ��
				condi4 = new int[2];
				conditionCount ++;
				jbi = (JComboBoxItem)comboBox41.getSelectedItem();
				condi4[0] = jbi.index;
				showCondition.append("\n"+jbi.toString());
				jbi = (JComboBoxItem)comboBox42.getSelectedItem();
				condi4[1] = jbi.index;
				showCondition.append("  =  "+jbi.toString());
			}
			
			int[] condi5 = null;
			if(checkBox5.isSelected()){
				//����5ѡ��
				condi5 = new int[2];
				conditionCount ++;
				jbi = (JComboBoxItem)comboBox51.getSelectedItem();
				condi5[0] = jbi.index;
				showCondition.append("\n"+jbi.toString());
				jbi = (JComboBoxItem)comboBox52.getSelectedItem();
				condi5[1] = jbi.index;
				showCondition.append("  =  "+jbi.toString());
			}
			
			if("".equals(showCondition.toString())){
				jLabelConditionShow.setText("<������>");
				contition = null;
			}else{
				
				jLabelConditionShow.setText(showCondition.toString());
				
				contition = new int[conditionCount][];
				
				for(int i=0;i<conditionCount;i++){
					if(condi1 != null){
						contition[i] = condi1;
						condi1 = null;
						continue;
					}
					
					if(condi2 != null){
						contition[i] = condi2;
						condi2 = null;
						continue;
					}
					
					if(condi3 != null){
						contition[i] = condi3;
						condi3 = null;
						continue;
					}
					
					if(condi4 != null){
						contition[i] = condi4;
						condi4 = null;
						continue;
					}
					
					if(condi5 != null){
						contition[i] = condi5;
						condi5 = null;
						continue;
					}
				}
			}
			
			
		}else{
			//���ѡ��
			jLabelConditionShow.setText("<������>");
			contition = null;
		}
		
	}

	
	public Object[] getTitleA() {
		return titleA;
	}


	public void setTitleA(Object[] titleA) {
		this.titleA = titleA;
	}


	public Object[] getTitleB() {
		return titleB;
	}


	public void setTitleB(Object[] titleB) {
		this.titleB = titleB;
	}


	public ConditionSelectedListener getConditionSelectedListener() {
		return conditionSelectedListener;
	}


	public void setConditionSelectedListener(
			ConditionSelectedListener conditionSelectedListener) {
		this.conditionSelectedListener = conditionSelectedListener;
	}
}

/**
 * ����ѡ�������
 * @version 2012-4-23
 * @author LiJinHua
 */
interface ConditionSelectedListener{
	
	/**
	 * ��Ӧѡ���ص�
	 * ��һ��������һ�����i��=�ڶ�����ĵ�k��
	 * contition[0][0] == contition[0][1];
	 * @version 2012-4-23
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	public void onConditionSelected(int[][] condition);
}
