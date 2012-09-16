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
 * ����ɸѡ����ѡ��Ի���
 * @version 2012-4-23
 * @author LiJinHua
 */
public class ConditionSelectorDialog extends JDialog {

	
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
	private GJCheckBox checkBox1 = new GJCheckBox("��ͬ����һ��");
	private GJCheckBox checkBox2 = new GJCheckBox("��ͬ��������");
	private GJCheckBox checkBox3 = new GJCheckBox("��ͬ��������");
	private GJCheckBox checkBox4 = new GJCheckBox("��ͬ�����ģ�");
	private GJCheckBox checkBox5 = new GJCheckBox("��ͬ�����壺");
	
	/**
	 * ��һ������
	 */
	private GJComboBox comboBox11 = new GJComboBox();
	
	/**
	 * �ڶ�������
	 */
	private GJComboBox comboBox21 = new GJComboBox();
	
	/**
	 * ����������
	 */
	private GJComboBox comboBox31 = new GJComboBox();
	
	/**
	 * ����������
	 */
	private GJComboBox comboBox41 = new GJComboBox();
	
	/**
	 * ����������
	 */
	private GJComboBox comboBox51 = new GJComboBox();
	
	private JRadioButton radioButton1 = new JRadioButton("��������һ");
	private JRadioButton radioButton2 = new JRadioButton("����������");
	private JRadioButton radioButton3 = new JRadioButton("����������");
	private JRadioButton radioButton4 = new JRadioButton("����������");
	private JRadioButton radioButton5 = new JRadioButton("����������");
	
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
		super.setTitle("ѡ������");
		this.setSize(400, 300);
		
		this.setLocation(this.getOwner().getLocation().x+this.getOwner().getSize().width/3,this.getOwner().getLocation().y+this.getOwner().getSize().height/4);

		this.add(getJPanelContent());
		initTitleComboBox();
		
		if(!arg0){
			//�ص�ʱ�����лص��ӿڣ���ѡ�����������ȥ
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
		jPanelX0.add(new JLabel("ѡ���ظ�������"));

		
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
		jButton.setText("ȷ�� ");
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
				//����һѡ��
				jbi = (JComboBoxItem)comboBox11.getSelectedItem();
				contitionMap.put(jbi.index,jbi.toString());
			}
			
			if(checkBox2.isSelected()){
				//����2ѡ��
				jbi = (JComboBoxItem)comboBox21.getSelectedItem();
				contitionMap.put(jbi.index,jbi.toString());
			}
			
			if(checkBox3.isSelected()){
				//����3ѡ��
				jbi = (JComboBoxItem)comboBox31.getSelectedItem();
				contitionMap.put(jbi.index,jbi.toString());
			}
			
			if(checkBox4.isSelected()){
				//����4ѡ��
				jbi = (JComboBoxItem)comboBox41.getSelectedItem();
				contitionMap.put(jbi.index,jbi.toString());
			}
			
			if(checkBox5.isSelected()){
				//����5ѡ��
				jbi = (JComboBoxItem)comboBox51.getSelectedItem();
				contitionMap.put(jbi.index,jbi.toString());
			}
			
			if(radioButton1.isSelected()){
				jbi = (JComboBoxItem)comboBox11.getSelectedItem();
				mDifferent = jbi.index;
				mDifferentString = "����������\n"+jbi.toString();
			}else if(radioButton2.isSelected()){
				jbi = (JComboBoxItem)comboBox21.getSelectedItem();
				mDifferent = jbi.index;
				mDifferentString = "����������\n"+jbi.toString();
			}else if(radioButton3.isSelected()){
				jbi = (JComboBoxItem)comboBox31.getSelectedItem();
				mDifferent = jbi.index;
				mDifferentString = "����������\n"+jbi.toString();
			}else if(radioButton4.isSelected()){
				jbi = (JComboBoxItem)comboBox41.getSelectedItem();
				mDifferent = jbi.index;
				mDifferentString = "����������\n"+jbi.toString();
			}else if(radioButton5.isSelected()){
				jbi = (JComboBoxItem)comboBox51.getSelectedItem();
				mDifferent = jbi.index;
				mDifferentString = "����������\n"+jbi.toString();
			}else{
				mDifferent = -1;
				mDifferentString = "����������\n ��";
			}
			
			if(contitionMap.size()<=0){
				jLabelConditionShow.setText("<������>");
			}else{
				Iterator<Integer> it = contitionMap.keySet().iterator();
				
				StringBuffer sb = new StringBuffer();
				sb.append("��ͬ������\n");
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
			//���ѡ��
			jLabelConditionShow.setText("<������>");
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
 * ����ѡ�������
 * @version 2012-4-23
 * @author LiJinHua
 */
interface ConditionSelectedListener{
	
	/**
	 * ��Ӧѡ���ص�
	 * ��һ��������һ�����i��=�ڶ�����ĵ�k��
	 * contition[0]
	 * @version 2012-4-23
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	public void onConditionSelected(int[] condition,int different);
}
