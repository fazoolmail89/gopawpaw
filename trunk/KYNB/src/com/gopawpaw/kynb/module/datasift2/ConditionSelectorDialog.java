/**
 * 
 */
package com.gopawpaw.kynb.module.datasift2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import com.gopawpaw.frame.widget.GJCheckBox;
import com.gopawpaw.frame.widget.GJComboBox;
import com.gopawpaw.kynb.bean.JComboBoxItem;

/**
 * 数据筛选条件选择对话框
 * @version 2012-4-23
 * @author LiJinHua
 */
public class ConditionSelectorDialog extends JDialog {

	
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
	private GJCheckBox checkBox1 = new GJCheckBox("相同条件一：");
	private GJCheckBox checkBox2 = new GJCheckBox("相同条件二：");
	private GJCheckBox checkBox3 = new GJCheckBox("相同条件三：");
	private GJCheckBox checkBox4 = new GJCheckBox("相同条件四：");
	private GJCheckBox checkBox5 = new GJCheckBox("相同条件五：");
	
	/**
	 * 第一组条件
	 */
	private GJComboBox comboBox11 = new GJComboBox();
	
	/**
	 * 第二组条件
	 */
	private GJComboBox comboBox21 = new GJComboBox();
	
	/**
	 * 第三组条件
	 */
	private GJComboBox comboBox31 = new GJComboBox();
	
	/**
	 * 第四组条件
	 */
	private GJComboBox comboBox41 = new GJComboBox();
	
	/**
	 * 第五组条件
	 */
	private GJComboBox comboBox51 = new GJComboBox();
	
	private JRadioButton radioButton1 = new JRadioButton("区分条件一");
	private JRadioButton radioButton2 = new JRadioButton("区分条件二");
	private JRadioButton radioButton3 = new JRadioButton("区分条件三");
	private JRadioButton radioButton4 = new JRadioButton("区分条件四");
	private JRadioButton radioButton5 = new JRadioButton("区分条件五");
	
	private ButtonGroup group = new ButtonGroup ();

	
	private Object[] titleA;
	
	private ConditionSelectedListener conditionSelectedListener;
	
	private HashMap<Integer,String> contitionMap = new HashMap<Integer,String>();
	
	private int mDifferent = -1;
	
	private String mDifferentString = "";
	public ConditionSelectorDialog() {
		init();
	}

	
	private void init() {
		
		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		group.add(radioButton4);
		group.add(radioButton5);
		
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
				
				int[] contition = new int[contitionMap.size()];
				
				Iterator<Integer> it = contitionMap.keySet().iterator();
				
				int i=0;
				while(it.hasNext()){
					Integer key = it.next();
					contition[i] = key;
					i++;
				}
				conditionSelectedListener.onConditionSelected(contition,mDifferent);
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
		jPanelX0.add(new JLabel("选择重复条件列"));

		
		JPanel jPanelX1 = new JPanel();
		jPanelX1.setLayout(new BoxLayout(jPanelX1, BoxLayout.X_AXIS));
		jPanelX1.add(new JLabel("   "));
		jPanelX1.add(checkBox1);
		jPanelX1.add(comboBox11);
		jPanelX1.add(radioButton1);
		
		
		JPanel jPanelX2 = new JPanel();
		jPanelX2.setLayout(new BoxLayout(jPanelX2, BoxLayout.X_AXIS));
		jPanelX2.add(new JLabel("   "));
		jPanelX2.add(checkBox2);
		jPanelX2.add(comboBox21);
		jPanelX2.add(radioButton2);
		
		JPanel jPanelX3 = new JPanel();
		jPanelX3.setLayout(new BoxLayout(jPanelX3, BoxLayout.X_AXIS));
		jPanelX3.add(new JLabel("   "));
		jPanelX3.add(checkBox3);
		jPanelX3.add(comboBox31);
		jPanelX3.add(radioButton3);
		
		JPanel jPanelX4 = new JPanel();
		jPanelX4.setLayout(new BoxLayout(jPanelX4, BoxLayout.X_AXIS));
		jPanelX4.add(new JLabel("   "));
		jPanelX4.add(checkBox4);
		jPanelX4.add(comboBox41);
		jPanelX4.add(radioButton4);
		
		JPanel jPanelX5 = new JPanel();
		jPanelX5.setLayout(new BoxLayout(jPanelX5, BoxLayout.X_AXIS));
		jPanelX5.add(new JLabel("   "));
		jPanelX5.add(checkBox5);
		jPanelX5.add(comboBox51);
		jPanelX5.add(radioButton5);
		
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
		if(titleA == null){
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
	
	
	private void actionSelect(boolean flag){
		if(flag){
			
			JComboBoxItem jbi;
			
			
			if(checkBox1.isSelected()){
				//条件一选中
				jbi = (JComboBoxItem)comboBox11.getSelectedItem();
				contitionMap.put(jbi.index,jbi.toString());
			}
			
			if(checkBox2.isSelected()){
				//条件2选中
				jbi = (JComboBoxItem)comboBox21.getSelectedItem();
				contitionMap.put(jbi.index,jbi.toString());
			}
			
			if(checkBox3.isSelected()){
				//条件3选中
				jbi = (JComboBoxItem)comboBox31.getSelectedItem();
				contitionMap.put(jbi.index,jbi.toString());
			}
			
			if(checkBox4.isSelected()){
				//条件4选中
				jbi = (JComboBoxItem)comboBox41.getSelectedItem();
				contitionMap.put(jbi.index,jbi.toString());
			}
			
			if(checkBox5.isSelected()){
				//条件5选中
				jbi = (JComboBoxItem)comboBox51.getSelectedItem();
				contitionMap.put(jbi.index,jbi.toString());
			}
			
			if(radioButton1.isSelected()){
				jbi = (JComboBoxItem)comboBox11.getSelectedItem();
				mDifferent = jbi.index;
				mDifferentString = "区分条件：\n"+jbi.toString();
			}else if(radioButton2.isSelected()){
				jbi = (JComboBoxItem)comboBox21.getSelectedItem();
				mDifferent = jbi.index;
				mDifferentString = "区分条件：\n"+jbi.toString();
			}else if(radioButton3.isSelected()){
				jbi = (JComboBoxItem)comboBox31.getSelectedItem();
				mDifferent = jbi.index;
				mDifferentString = "区分条件：\n"+jbi.toString();
			}else if(radioButton4.isSelected()){
				jbi = (JComboBoxItem)comboBox41.getSelectedItem();
				mDifferent = jbi.index;
				mDifferentString = "区分条件：\n"+jbi.toString();
			}else if(radioButton5.isSelected()){
				jbi = (JComboBoxItem)comboBox51.getSelectedItem();
				mDifferent = jbi.index;
				mDifferentString = "区分条件：\n"+jbi.toString();
			}else{
				mDifferent = -1;
				mDifferentString = "区分条件：\n 无";
			}
			
			if(contitionMap.size()<=0){
				jLabelConditionShow.setText("<无条件>");
			}else{
				Iterator<Integer> it = contitionMap.keySet().iterator();
				
				StringBuffer sb = new StringBuffer();
				sb.append("相同条件：\n");
				while(it.hasNext()){
					Integer key = it.next();
					String str = contitionMap.get(key);
					sb.append(str);
					sb.append("\n");
				}
				sb.append("\n\n"+mDifferentString);
				
				jLabelConditionShow.setText(sb.toString());
				
			}
			
			
		}else{
			//清空选择
			jLabelConditionShow.setText("<无条件>");
			contitionMap.clear();
		}
		
	}

	
	public Object[] getTitleA() {
		return titleA;
	}


	public void setTitleA(Object[] titleA) {
		this.titleA = titleA;
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
	 * contition[0]
	 * @version 2012-4-23
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	public void onConditionSelected(int[] condition,int different);
}
