/**
 * 
 */
package com.gopawpaw.erp.common;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import java.awt.Frame;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import com.gopawpaw.dev.common.encryption.MD5;
import com.gopawpaw.javax.swing.GppJButton;
import com.gopawpaw.javax.swing.GppJComboBox;
import com.gopawpaw.javax.swing.GppJLabel;
import com.gopawpaw.javax.swing.GppJPanel;
import com.gopawpaw.javax.swing.GppJTextField;
import com.sunking.swing.JDatePicker;

/**
 * @version 2010-4-17
 * @author �����
 * 
 */
public class DataSelectObject {

	public final static int dataType_txt = 0;
	public final static int dataType_int = 1;
	public final static int dataType_double = 2;
	public final static int dataType_boolean = 3;
	public final static int dataType_date = 4;
	
	public final static int PANEL_NO_LABEL = -1;
	public final static int PANEL_DEF = 0;
	
	private int panel_type = PANEL_DEF;
	
	
	private GppJPanel jPanel = null; // @jve:decl-index=0:visual-constraint="155,85"
	private GppJLabel jLabel = null;
	private GppJTextField jTextField = null;
	private GppJButton jButton = null;

	private String label = null;
	private int dataType = dataType_txt;
	private Vector<String> columnTitle = null;
	private Vector<Vector<String>> dataSource = null;
	private Frame owner = null;
	private String title = null;
	private String dataKey = null;
	private String defValues = null;
	private GppJComboBox jComboBox = null;  //  @jve:decl-index=0:visual-constraint="460,89"
	private GppJLabel jLabel1 = null;  //  @jve:decl-index=0:visual-constraint="292,159"

	private int dataKeyIndex = 0;
	private int courrentDataSourceIndex = 0;
	
	/**
	 * ��Ȩ������к�
	 */
	protected String authorizationSerial = null;
	
	
	/**
	 * ��Ȩ������к�����
	 */
	private String[] arrComSerial = new String[8];
	
	/**
	 * @param label
	 *            ��ǩ
	 */
	public DataSelectObject(String label) {
		this.label = label;
		initialize();
	}

	/**
	 * @param label
	 *            ��ǩ
	 * @param dataType
	 *            ��������
	 */
	public DataSelectObject(String label, int dataType) {
		this.label = label;
		this.dataType = dataType;
		initialize();
	}
	
	/**
	 * @param label
	 *            ��ǩ
	 * @param dataType
	 *            ��������
	 * @param columnTitle
	 *            ѡ����б���
	 * @param dataSource
	 *            ѡ������
	 * @param dataKey
	 *            ����key��
	 * @param owner
	 *            ѡ��򸸴���
	 * @param title
	 *            ѡ������
	 */
	public DataSelectObject(String label, int dataType,
			Vector<String> columnTitle, Vector<Vector<String>> dataSource,
			String dataKey, Frame owner, String title) {
		this.label = label;
		this.dataType = dataType;
		this.columnTitle = columnTitle;
		this.dataSource = dataSource;
		this.dataKey = dataKey;
		this.owner = owner;
		this.title = title;
		initialize();
	}

	private void initialize() {
		if(this.dataType != DataSelectObject.dataType_date){
			this.dataKeyIndex = columnTitle.indexOf(dataKey);
			this.courrentDataSourceIndex = 0;
		}
		
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new GppJPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
			jPanel.setSize(new Dimension(262, 32));
			jPanel.setAuthorizationSerial(this.arrComSerial[0]);
			jPanel.setName(this.label+"(���)");
			jPanel.add(getJLabel(), null);
			
			if (dataType == DataSelectObject.dataType_date) {
				jPanel.add(getJComboBox(), null);
				
			}else{
				jPanel.add(getJTextField(), null);
				jPanel.add(getJButton(), null);
			}
			
		}
		return jPanel;
	}

	/**
	 * This method initializes jLabel
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel() {
		if (jLabel == null) {
			jLabel = new GppJLabel();
			jLabel.setAuthorizationSerial(this.arrComSerial[1]);
			jLabel.setText(this.label);
			jLabel.setName(this.label+"(��ǩ)");
			
		}
		return jLabel;
	}

	/**
	 * This method initializes jTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new GppJTextField(){
			
				/**
				 * 
				 */
				private static final long serialVersionUID = 7528600431118431396L;
				public boolean actionUp() {
					if(courrentDataSourceIndex>0){
						courrentDataSourceIndex = courrentDataSourceIndex - 1;
						String temp = (String) ((Vector<?>)dataSource.get(courrentDataSourceIndex)).get(dataKeyIndex);
						jTextField.setText(temp);
					}
					return false;
				}
				
				public boolean actionDown() {
					if(courrentDataSourceIndex<dataSource.size()-1){
						courrentDataSourceIndex = courrentDataSourceIndex + 1;
						String temp = (String) ((Vector<?>)dataSource.get(courrentDataSourceIndex)).get(dataKeyIndex);
						jTextField.setText(temp);
						
					}
					return false;
				}
			};
			jTextField.setAuthorizationSerial(this.arrComSerial[2]);
			jTextField.setName(this.label+"(�༭��)");
			
		}
		return jTextField;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new GppJButton();
			jButton.setText("F");
			jButton.setAuthorizationSerial(this.arrComSerial[3]);
			jButton.setName(this.label+"(�����ť)");
			jButton.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (dataType == DataSelectObject.dataType_txt) {

						SelectDialog sd = new SelectDialog(owner, title, true,
								columnTitle, dataSource);

						sd.setSeekContext(dataKey, jTextField.getText());
						sd.seekAction();

						sd.setVisible(true);
						jTextField.setText(sd.getSelectedValues());
						courrentDataSourceIndex = sd.getSelectedRow();
					}
				}

				public void mousePressed(java.awt.event.MouseEvent e) {
				}

				public void mouseReleased(java.awt.event.MouseEvent e) {
				}

				public void mouseEntered(java.awt.event.MouseEvent e) {
				}

				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jButton;
	}

	/**
	 * ��ȡѡ�����
	 */
	public JPanel getSelectPanel() {
		return getJPanel();
	}
	
	/**
	 * ��ȡѡ�����PANEL_NO_LABEL
	 */
	public JPanel getSelectPanel(int panel_type) {
		this.panel_type = panel_type;
		
		if(this.panel_type == DataSelectObject.PANEL_NO_LABEL){
			getJPanel().remove(getJLabel());
		}
		
		return getJPanel();
	}
	/**
	 * This method initializes jComboBox
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JDatePicker(JDatePicker.STYLE_CN_DATE1);
			jComboBox.setSize(new Dimension(142, 24));
			jComboBox.setSelectedItem("2010-04-19");
			jComboBox.setAuthorizationSerial(this.arrComSerial[4]);
			jComboBox.setName(this.label+"(���ѡ���)");
		}
		return jComboBox;
	}

	/**
	 * @return the jLabel
	 */
	public JLabel getLabel() {
		return this.getJLabel();
	}

	/**
	 * @param jLabel the jLabel to set
	 */
	public void setLabel(GppJLabel jLabel) {
		this.jLabel = jLabel;
	}

	/**
	 * @return the jTextField
	 */
	public JTextField getTextField() {
		return this.getJTextField();
	}

	/**
	 * @param jTextField the jTextField to set
	 */
	public void setTextField(GppJTextField jTextField) {
		this.jTextField = jTextField;
	}

	/**
	 * @return the jButton
	 */
	public JButton getButton() {
		return this.getJButton();
	}

	/**
	 * @param jButton the jButton to set
	 */
	public void setButton(GppJButton jButton) {
		this.jButton = jButton;
	}

	/**
	 * @return the jComboBox
	 */
	public JComboBox getComboBox() {
		return this.getJComboBox();
	}

	/**
	 * @param jComboBox the jComboBox to set
	 */
	public void setComboBox(GppJComboBox jComboBox) {
		this.jComboBox = jComboBox;
	}
	
	/**
	 * ��ȡֵ
	 */
	public String getValues(){
		if (dataType == DataSelectObject.dataType_date) {
			return this.getJComboBox().getSelectedItem().toString();
		}else{
			return this.getJTextField().getText();
		}
		 
	}
	
	/**
	 * ��ȡTO��ǩ
	 */
	public JLabel getTOLabel(){
		
		return getJLabel1();
	}

	/**
	 * ��ȡTO��ǩ
	 */
	public  void setTOLabel(GppJLabel jlabel){
		this.jLabel1 = jlabel;
	}
	
	/**
	 * This method initializes jLabel1	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new GppJLabel();
			jLabel1.setText("TO");
			jLabel1.setAuthorizationSerial(this.arrComSerial[5]);
			jLabel1.setName(this.label+"(TO��ǩ)");
		}
		return jLabel1;
	}
	/**
	 * ������Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	public void setAuthorizationSerial(String authorizationSerial){
		this.authorizationSerial = authorizationSerial;
		
		if(authorizationSerial != null && !authorizationSerial.isEmpty() && authorizationSerial != ""){
			MD5 m = new MD5();
			arrComSerial[0] = m.getMD5ofStr(authorizationSerial.substring(0, 4));
			arrComSerial[1] = m.getMD5ofStr(authorizationSerial.substring(4, 8));
			arrComSerial[2] = m.getMD5ofStr(authorizationSerial.substring(8, 12));
			arrComSerial[3] = m.getMD5ofStr(authorizationSerial.substring(12, 16));
			arrComSerial[4] = m.getMD5ofStr(authorizationSerial.substring(16, 20));
			arrComSerial[5] = m.getMD5ofStr(authorizationSerial.substring(20, 24));
			arrComSerial[6] = m.getMD5ofStr(authorizationSerial.substring(24, 28));
			arrComSerial[7] = m.getMD5ofStr(authorizationSerial.substring(28, 32));
			
//			System.out.println(authorizationSerial);
//			for (int i=0;i<8;i++){
//				System.out.println(arrComSerial[i]);
//			}
		}
	}
	
	/**
	 * ��ȡ��Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	public String getAuthorizationSerial( ){
		return authorizationSerial;
	}

}
