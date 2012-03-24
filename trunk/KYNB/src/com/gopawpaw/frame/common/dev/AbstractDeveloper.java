/**
 * 
 */
package com.gopawpaw.frame.common.dev;

import java.awt.Frame;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.gopawpaw.dev.common.encryption.MD5;
import com.gopawpaw.frame.common.DataSelectObject;
import com.gopawpaw.javax.swing.GppJButton;
import com.gopawpaw.javax.swing.GppJComboBox;
import com.gopawpaw.javax.swing.GppJLabel;
import com.gopawpaw.javax.swing.GppJPanel;
import com.gopawpaw.javax.swing.GppJTextField;


/**
 * @version 2010-4-20
 * @author 李锦华
 *
 */
public abstract class AbstractDeveloper {

	protected DataSelectObject dso = null;
	protected DataSelectObject dso2 = null;
	
	protected Frame owner = null;
	private GppJPanel jPanel = null;  //  @jve:decl-index=0:visual-constraint="245,79"
	
	protected String authorizationSerial = null;
	
	/**
	 * 
	 */
	public AbstractDeveloper(Frame owner) {
		this.owner = owner;
		initialize();
	}
	private void initialize() {
		refreshData();
		
	}
	
	/**
	 * 刷新数据,该方法必须被子类重写
	 */
	public abstract void refreshData();
	
//	public void refreshData(){
//		Vector<String> cname = new Vector<String>(2);
//		cname.add("类型");
//		cname.add("描述");
//		
//		Vector<Vector<String>> vesource = new Vector<Vector<String>>();
//		
//		List<CodeMstr> l = GppCodeMstr.getPt_part_type();
//		for(Object o:l){
//			Vector<String> temve = new Vector<String>(2);
//			temve.add(((CodeMstr)o).getId().getCodeValue());
//			temve.add(((CodeMstr)o).getCodeDesc());
//			vesource.add(temve);
//		}
//		
//		dso = new DataSelectObject("物料类：",DataSelectObject.dataType_txt,cname,vesource,"类型",owner,"物料类型");

//	}
	
	/**
	 * 获取选择面板
	 */
	public JPanel getSelectPanel() {
		return this.dso.getSelectPanel();
	}
	
	/**
	 * 获取选择面板PANEL_NO_LABEL
	 */
	public JPanel getSelectPanelNoLabel() {
		
		return this.dso.getSelectPanel(DataSelectObject.PANEL_NO_LABEL);
	}
	/**
	 * @return the jLabel
	 */
	public JLabel getLabel() {
		return this.dso.getLabel();
	}

	/**
	 * @param jLabel the jLabel to set
	 */
	public void setLabel(GppJLabel jLabel) {
		this.dso.setLabel(jLabel);
	}

	/**
	 * @return the jTextField
	 */
	public JTextField getTextField() {
		return this.dso.getTextField();
	}

	/**
	 * @param jTextField the jTextField to set
	 */
	public void setTextField(GppJTextField jTextField) {
		this.dso.setTextField(jTextField);
	}

	/**
	 * @return the jButton
	 */
	public JButton getButton() {
		return this.dso.getButton();
	}

	/**
	 * @param jButton the jButton to set
	 */
	public void setButton(GppJButton jButton) {
		this.dso.setButton(jButton);
	}

	/**
	 * @return the jComboBox
	 */
	public JComboBox getComboBox() {
		return this.dso.getComboBox();
	}

	/**
	 * @param jComboBox the jComboBox to set
	 */
	public void setComboBox(GppJComboBox jComboBox) {
		this.dso.setComboBox(jComboBox);
	}
	
	/**
	 * 获取值
	 */
	public String getValues(){
		return this.dso.getValues();
	}
	
	/**
	 * 获取TO标签
	 */
	public JLabel getTOLabel(){
		return this.dso.getTOLabel();
	}
	
	/**
	 * 设置TO标签
	 */
	public void setTOLabel(GppJLabel jlabel){
		this.dso.setTOLabel(jlabel);
	}
	
	/**
	 * 获取选择面板
	 */
	public JPanel getSelectPanel2() {
		return this.dso2.getSelectPanel();
	}
	
	/**
	 * 获取选择面板PANEL_NO_LABEL
	 */
	public JPanel getSelectPanelNoLabel2() {
		
		return this.dso2.getSelectPanel(DataSelectObject.PANEL_NO_LABEL);
	}
	/**
	 * @return the jLabel
	 */
	public JLabel getLabel2() {
		return this.dso2.getLabel();
	}

	/**
	 * @param jLabel the jLabel to set
	 */
	public void setLabel2(GppJLabel jLabel) {
		this.dso2.setLabel(jLabel);
	}

	/**
	 * @return the jTextField
	 */
	public JTextField getTextField2() {
		return this.dso2.getTextField();
	}

	/**
	 * @param jTextField the jTextField to set
	 */
	public void setTextField2(GppJTextField jTextField) {
		this.dso2.setTextField(jTextField);
	}

	/**
	 * @return the jButton
	 */
	public JButton getButton2() {
		return this.dso2.getButton();
	}

	/**
	 * @param jButton the jButton to set
	 */
	public void setButton2(GppJButton jButton) {
		this.dso2.setButton(jButton);
	}

	/**
	 * @return the jComboBox
	 */
	public JComboBox getComboBox2() {
		return this.dso2.getComboBox();
	}

	/**
	 * @param jComboBox the jComboBox to set
	 */
	public void setComboBox2(GppJComboBox jComboBox) {
		this.dso2.setComboBox(jComboBox);
	}
	
	/**
	 * 获取值2
	 */
	public String getValues2(){
		return this.dso2.getValues();
	}
	
	/**
	 * 获取选择面板
	 */
	public JPanel getPanel() {
		return this.getJPanel();
	}
	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new GppJPanel();
			jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.X_AXIS));
			jPanel.setAuthorizationSerial(authorizationSerial);
			
			jPanel.add(getSelectPanel());
			jPanel.add(this.getTOLabel());
			jPanel.add(this.getSelectPanelNoLabel2());
		}
		return jPanel;
	}
	
	/**
	 * 设置授权序列号，用于控制该组件的可编辑、可显示状态的唯一标识符，一般为32位MD5密文
	 */
	public void setAuthorizationSerial(String authorizationSerial){
		this.authorizationSerial = authorizationSerial;
		if(authorizationSerial != null && !authorizationSerial.isEmpty() && authorizationSerial != ""){
			String tem1 = authorizationSerial.substring(0, 16);
			String tem2 = authorizationSerial.substring(16, 32);
			MD5 m = new MD5();
			dso.setAuthorizationSerial(m.getMD5ofStr(tem1));
			dso2.setAuthorizationSerial(m.getMD5ofStr(tem2));
		}
	}
	
	/**
	 * 获取授权序列号，用于控制该组件的可编辑、可显示状态的唯一标识符，一般为32位MD5密文
	 */
	public String getAuthorizationSerial( ){
		return authorizationSerial;
	}
}
