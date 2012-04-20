/**
 * 
 */
package com.gopawpaw.frame.common;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.javax.swing.GppJDialog;

/**
 * @version 2010-4-15
 * @author 李锦华
 * 
 */
public class SelectDialog extends GppJDialog implements DocumentListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7776526943885501351L;
	private JPanel jPanel = null;
	private JComboBox jComboBox = null;
	private JTextField jTextField = null;
	private JScrollPane jScrollPane = null;
	private JTable jTable = null;

	private Frame owner = null;

	private Vector<Vector<String>> dataSource = null; // @jve:decl-index=0:
	private Vector<String> columnTitle = null; // @jve:decl-index=0:
	private String seekContex = null;  //  @jve:decl-index=0:
	private String seekTitle = null;  //  @jve:decl-index=0:
	private String columnID = null;  //  @jve:decl-index=0:
	private JButton jButton = null;

	private String selectedValues = null;
	private int selectedRow = 0;
	private String columnAll = "[所有]";  //  @jve:decl-index=0:
	
	private boolean flag_seekAll = true;
	private JCheckBox jCheckBox = null;  //  @jve:decl-index=0:visual-constraint="619,66"
	/**
	 * @param owner
	 */
	public SelectDialog(Frame owner,Vector<String> columnTitle,Vector<Vector<String>> dataSource) {
		super(owner);
		this.owner = owner;
		this.columnTitle = columnTitle;
		this.dataSource = dataSource;
		
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 */
	public SelectDialog(Dialog owner) {
		super(owner);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 */
	public SelectDialog(Window owner) {
		super(owner);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param modal
	 */
	public SelectDialog(Frame owner, boolean modal,Vector<String> columnTitle,Vector<Vector<String>> dataSource) {
		super(owner, modal);
		this.owner = owner;
		this.columnTitle = columnTitle;
		this.dataSource = dataSource;
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param title
	 */
	public SelectDialog(Frame owner, String title,Vector<String> columnTitle,Vector<Vector<String>> dataSource) {
		super(owner, title);
		this.owner = owner;
		this.columnTitle = columnTitle;
		this.dataSource = dataSource;
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param title
	 */
	public SelectDialog(Dialog owner, String title) {
		super(owner, title);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param title
	 */
	public SelectDialog(Window owner, String title) {
		super(owner, title);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param modalityType
	 */
	public SelectDialog(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public SelectDialog(Frame owner, String title, boolean modal,Vector<String> columnTitle,Vector<Vector<String>> dataSource) {
		super(owner, title, modal);
		this.owner = owner;
		this.columnTitle = columnTitle;
		this.dataSource = dataSource;
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public SelectDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 */
	public SelectDialog(Window owner, String title, ModalityType modalityType) {
		super(owner, title, modalityType);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public SelectDialog(Frame owner, String title, boolean modal,
			GraphicsConfiguration gc,Vector<String> columnTitle,Vector<Vector<String>> dataSource) {
		super(owner, title, modal, gc);
		this.owner = owner;
		this.columnTitle = columnTitle;
		this.dataSource = dataSource;
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public SelectDialog(Dialog owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 * @param gc
	 */
	public SelectDialog(Window owner, String title, ModalityType modalityType,
			GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {

		this.setSize(new Dimension(521, 248));
		if (dataSource == null || columnTitle == null) {
			JOptionPane.showConfirmDialog(null, "未设置列标题和数据源！", "系统提示",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			return;
		}

		this.add(getJPanel(), BorderLayout.NORTH);
		this.add(getJScrollPane(), BorderLayout.CENTER);
		
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
			jPanel.add(getJComboBox(), null);
			jPanel.add(getJTextField(), null);
			jPanel.add(getJCheckBox(), null);
			
		}
		return jPanel;
	}

	/**
	 * This method initializes jComboBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JComboBox();
			jComboBox.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					seekTitle = (String) jComboBox.getSelectedItem();
					if(seekTitle.equals(columnAll)){
						flag_seekAll = true;
					}else {
						flag_seekAll = false;
					}
				}
			});
			Iterator<String> it = columnTitle.iterator();
			jComboBox.addItem(columnAll);
			while(it.hasNext()){
				jComboBox.addItem(((String)it.next()).trim());
			}
			
		}
		return jComboBox;
	}

	/**
	 * This method initializes jTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			// 添加文档事件
			jTextField.getDocument().addDocumentListener(this);
		}
		return jTextField;
	}

	/**
	 * This method initializes jScrollPane
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTable
	 * 
	 * @return javax.swing.JTable
	 */
	private JTable getJTable() {
		if (jTable == null) {
			jTable = new JTable(){
				/**
				 * 
				 */
				private static final long serialVersionUID = 5671188849438198200L;

				public boolean isCellEditable(int row, int column) {
			        return false;
			    }
			};

			jTable.setModel(new DefaultTableModel(dataSource, columnTitle));
			jTable.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					String temp = null;
					int temprow = jTable.getSelectedRow();
					
					temp = (String) jTable.getValueAt(temprow,jTable.getColumnModel().getColumnIndex(columnID));
					
					if (temp == null) {
						return;
					}
					
					if (e.getClickCount() >= 2) {
						selectedValues = temp;
						selectedRow = temprow;
						Gpp_ThisJDialog.setVisible(false);
		        		Gpp_ThisJDialog.dispose();
					}
				}
			});
		}
		return jTable;
	}

	/**
	 * 设置数据列表源
	 */
	public void setDataSource(Vector<Vector<String>> vesource) {
		this.dataSource = vesource;
	}

	/**
	 * 设置搜索内容
	 */
	public void setSeekContext(String seekTitle,String txt) {
		this.columnID = seekTitle;
		this.seekTitle = seekTitle;
		this.seekContex = txt;
		jTextField.setText(txt);
		jComboBox.setSelectedItem(columnAll);
		
	}

	/**
	 * 执行搜索
	 */
	public void seekAction() {
		
		
//		Iterator it = columnTitle.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		jTable.setModel(new DefaultTableModel(searchSmsContent(seekContex), columnTitle));
		jTable.repaint();
		jTable.updateUI();
	}
	
	/**
	 * 根据搜索条件在Vector中搜索，并将搜索结果返回
	 */
	public Vector searchSmsContent(String content) {

		Vector afterRow = new Vector();
		int colIndex2 = 0;
		if(!this.flag_seekAll){
			colIndex2 = jTable.getColumnModel().getColumnIndex(this.seekTitle);
		}
		
		for (int rowIndex = 0; rowIndex < dataSource.size(); rowIndex++) {
			Vector<?> colSms = (Vector<?>) dataSource.get(rowIndex);

			Vector afterCol = new Vector();
			
			boolean flag = false;
			if(this.flag_seekAll){
				for (int colIndex = 0; colIndex < colSms.size(); colIndex++) {
					afterCol.add(colSms.get(colIndex));
					if(jCheckBox.isSelected()){
						if (colSms.get(colIndex).toString().indexOf(content) > -1) {
							flag = true;
						}
					}else{
						if (colSms.get(colIndex).toString().startsWith(content)) {
							flag = true;
						}
					}
					
				}
			}else{
				
				for (int colIndex = 0; colIndex < colSms.size(); colIndex++) {
					afterCol.add(colSms.get(colIndex));
					if(jCheckBox.isSelected()){
						if (colIndex == colIndex2 && colSms.get(colIndex).toString().indexOf(content) > -1) {
							flag = true;
						}
					}else{
						if (colIndex == colIndex2 && colSms.get(colIndex).toString().startsWith(content)) {
							flag = true;
						}
						
					}
					
				}
				
			}
			
			

			if (flag) {
				afterRow.add(afterCol);
			}
		}
		return afterRow;
	}


	/**
	 * @return the selectedValues
	 */
	public String getSelectedValues() {
		return selectedValues;
	}
	/**
	 * 获取选择行
	 */
	public int getSelectedRow(){
		return selectedRow;
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		seekContex = jTextField.getText();
		seekAction();
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		seekContex = jTextField.getText();
		seekAction();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		seekContex = jTextField.getText();
		seekAction();
	}

	/**
	 * This method initializes jCheckBox1	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBox() {
		if (jCheckBox == null) {
			jCheckBox = new JCheckBox();
			jCheckBox.setText("模糊");
			jCheckBox.setSelected(true);
		}
		return jCheckBox;
	}

} // @jve:decl-index=0:visual-constraint="10,10"
