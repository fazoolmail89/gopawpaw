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
 * 数据筛选条件选择对话框
 * @version 2012-4-23
 * @author LiJinHua
 */
public class ConditionSelectorDialog extends GppDialog {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 条件显示
	 */
	private JTextArea jLabelConditionShow = new JTextArea();
	
	/**
	 * 条件是否被启用
	 */
	private GppJCheckBox checkBox1 = new GppJCheckBox("条件一：");
	private GppJCheckBox checkBox2 = new GppJCheckBox("条件二：");
	private GppJCheckBox checkBox3 = new GppJCheckBox("条件三：");
	private GppJCheckBox checkBox4 = new GppJCheckBox("条件四：");
	private GppJCheckBox checkBox5 = new GppJCheckBox("条件五：");
	
	/**
	 * 第一组条件
	 */
	private GppJComboBox comboBox11 = new GppJComboBox();
	private GppJComboBox comboBox12 = new GppJComboBox();
	
	/**
	 * 第二组条件
	 */
	private GppJComboBox comboBox21 = new GppJComboBox();
	private GppJComboBox comboBox22 = new GppJComboBox();
	
	/**
	 * 第三组条件
	 */
	private GppJComboBox comboBox31 = new GppJComboBox();
	private GppJComboBox comboBox32 = new GppJComboBox();
	
	/**
	 * 第四组条件
	 */
	private GppJComboBox comboBox41 = new GppJComboBox();
	private GppJComboBox comboBox42 = new GppJComboBox();
	
	/**
	 * 第五组条件
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
		super.setTitle("选择条件");
		this.setSize(400, 300);
		
		this.setLocation(this.getOwner().getLocation().x+this.getOwner().getSize().width/3,this.getOwner().getLocation().y+this.getOwner().getSize().height/4);

		this.add(getJPanelContent());
		initTitleComboBox();
		
		if(!arg0){
			//关掉时，进行回调接口，将选择的条件传回去
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
		jPanelX0.add(new JLabel("条件选择                 A表.A列 = B表.A列           "));

		
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
		
		//确认取消按钮面板 
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
	 * 初始化条件选择框
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
		jButton.setText("确定 ");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {

				actionSelect(true);
			}
		});
		
		return jButton;
	}
	
	private JButton getJButtonCancel() {

		JButton jButton = new JButton();
		jButton.setText("取消 ");
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
				//条件一选中
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
				//条件2选中
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
				//条件3选中
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
				//条件4选中
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
				//条件5选中
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
				jLabelConditionShow.setText("<无条件>");
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
			//清空选择
			jLabelConditionShow.setText("<无条件>");
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
 * 条件选择监听器
 * @version 2012-4-23
 * @author LiJinHua
 */
interface ConditionSelectedListener{
	
	/**
	 * 响应选择后回调
	 * 第一组条件第一个表的i列=第二个表的滴k咧
	 * contition[0][0] == contition[0][1];
	 * @version 2012-4-23
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	public void onConditionSelected(int[][] condition);
}
