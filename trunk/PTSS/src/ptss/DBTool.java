/**
 * 
 */
package ptss;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.gopawpaw.dev.common.GppConfiguration;

import java.awt.GridBagConstraints;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JProgressBar;

/**
 * @version 2010-3-15
 * @author 李锦华
 * 
 */
public class DBTool extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel jPanel = null;
	private JPanel jPanel1 = null;
	private JLabel jLabel = null;
	private JComboBox jComboBox = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JTextField jTextField = null;
	private JPanel jPanel2 = null;
	private JButton jButton = null;

	private GppConfiguration pts_DataTypeShineUpon = new GppConfiguration(
			"pts_DataTypeShineUpon.ini"); // @jve:decl-index=0:
	private String data_xtype_str = ""; // @jve:decl-index=0:
	private int data_xtype = 0;
	private double data_leng_times = 1;
	private Vector<Object> veTable = new Vector<Object>(); // @jve:decl-index=0:
	private Vector<Object> veTable2 = new Vector<Object>(); // @jve:decl-index=0:
	private JPanel jPanel3 = null;
	private JPanel jPanel4 = null;
	private JLabel jLabel3 = null;
	private JProgressBar jProgressBar = null;
	private JLabel jLabel4 = null;
	private JPanel jPanel5 = null;
	private JPanel jPanel6 = null;
	private JButton jButton1 = null;

	private Thread threadAdjustFrom = null;
	private Thread threadReparKey = null;
	private JPanel jPanel7 = null;
	private JLabel jLabel5 = null;
	private JProgressBar jProgressBar1 = null;

	/**
	 * @throws HeadlessException
	 */
	public DBTool() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public DBTool(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public DBTool(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DBTool(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * This method initializes jTabbedPane
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.addTab("表结构调整", null, getJPanel(), null);
			jTabbedPane.addTab("修复主键", null, getJPanel5(), null);
		}
		return jTabbedPane;
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BorderLayout());
			jPanel.add(getJPanel1(), BorderLayout.NORTH);
			jPanel.add(getJPanel2(), BorderLayout.SOUTH);
			jPanel.add(getJPanel3(), BorderLayout.CENTER);
		}
		return jPanel;
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("原来长度*");
			jLabel1 = new JLabel();
			jLabel1.setText("长度调整为：");
			jLabel = new JLabel();
			jLabel.setText("所有数据类型：");
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
			jPanel1.add(jLabel, null);
			jPanel1.add(getJComboBox(), null);
			jPanel1.add(jLabel1, null);
			jPanel1.add(jLabel2, null);
			jPanel1.add(getJTextField(), null);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jComboBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JComboBox();

			Iterator<?> it = pts_DataTypeShineUpon.getKeySet().iterator();

			while (it.hasNext()) {
				jComboBox.addItem(it.next());
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
			jTextField.setText("1");
		}
		return jTextField;
	}

	/**
	 * This method initializes jPanel2
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			jPanel2 = new JPanel();
			jPanel2.setLayout(new GridBagLayout());
			jPanel2.add(getJButton(), gridBagConstraints);
		}
		return jPanel2;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("确定");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					data_xtype_str = (String) getJComboBox().getSelectedItem();
					data_xtype = Integer.valueOf(pts_DataTypeShineUpon
							.getValue(data_xtype_str));

					data_leng_times = Double.valueOf(getJTextField().getText());

					if (!threadAdjustFrom.isAlive()) {

						actionAdjust();
						startAdjustFrom();
					}
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jPanel3
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jPanel3 = new JPanel();
			jPanel3.setLayout(new BorderLayout());
			jPanel3.add(getJPanel4(), BorderLayout.NORTH);
		}
		return jPanel3;
	}

	/**
	 * This method initializes jPanel4
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			jPanel4 = new JPanel();
			jPanel4.setLayout(new BoxLayout(jPanel4, BoxLayout.X_AXIS));
			jPanel4.add(getJLabel3(), null);
			jPanel4.add(getJProgressBar(), null);
			jPanel4.add(getJLabel4(), null);
		}
		return jPanel4;
	}

	/**
	 * This method initializes jLabel3
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("进度：");
		}
		return jLabel3;
	}

	/**
	 * This method initializes jProgressBar
	 * 
	 * @return javax.swing.JProgressBar
	 */
	private JProgressBar getJProgressBar() {
		if (jProgressBar == null) {
			jProgressBar = new JProgressBar();
		}
		return jProgressBar;
	}

	/**
	 * This method initializes jLabel4
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("");
		}
		return jLabel4;
	}

	/**
	 * This method initializes jPanel5
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jPanel5 = new JPanel();
			jPanel5.setLayout(new BorderLayout());
			jPanel5.add(getJPanel6(), BorderLayout.SOUTH);
			jPanel5.add(getJPanel7(), BorderLayout.NORTH);
		}
		return jPanel5;
	}

	/**
	 * This method initializes jPanel6
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel6() {
		if (jPanel6 == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridy = 0;
			jPanel6 = new JPanel();
			jPanel6.setLayout(new GridBagLayout());
			jPanel6.add(getJButton1(), gridBagConstraints1);
		}
		return jPanel6;
	}

	/**
	 * This method initializes jButton1
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("确定");
			jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (!threadAdjustFrom.isAlive()) {

						repairKey();
						startRepairKey();
					}

				}
			});
		}
		return jButton1;
	}

	private void repairKey() {

		String sqlstr = "Select   SysObjects.name as tname,SysColumns.name as cname   From   SysColumns   Left   Outer   Join   SysObjects   On   SysColumns.ID=SysObjects.ID where SysColumns.name like 'oid_%'";
		int allnum = 0;
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(sqlstr);
		try {
			while (rst != null && rst.next()) {
				allnum++;
				DBToolData tempData = new DBToolData();
				tempData.setTableName(rst.getString("tname"));
				tempData.setColumnsName(rst.getString("cname"));
				veTable2.add(tempData);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		gppsql.close();
		getJProgressBar1().setMaximum(allnum);
		getJProgressBar1().setValue(0);
		getJProgressBar1().setStringPainted(true);
		

//		JOptionPane.showMessageDialog(null, "OK！", "执行完毕！",
//				JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * This method initializes jPanel7	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel7() {
		if (jPanel7 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("进度：");
			jPanel7 = new JPanel();
			jPanel7.setLayout(new BoxLayout(jPanel7, BoxLayout.X_AXIS));
			jPanel7.add(jLabel5, null);
			jPanel7.add(getJProgressBar1(), null);
		}
		return jPanel7;
	}

	/**
	 * This method initializes jProgressBar1	
	 * 	
	 * @return javax.swing.JProgressBar	
	 */
	private JProgressBar getJProgressBar1() {
		if (jProgressBar1 == null) {
			jProgressBar1 = new JProgressBar();
		}
		return jProgressBar1;
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				DBTool thisClass = new DBTool();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(476, 207);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
		this.setLocation(300, 200);

		this.threadReparKey = new Thread(this);
		this.threadAdjustFrom = new Thread(this);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJTabbedPane(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * 执行数据结构调整
	 */
	private void actionAdjust() {
		// updateVeTable();

		String sqlstr = "Select   SysObjects.name as tname,SysColumns.name as cname,SysColumns.xtype,SysColumns.length   From   SysColumns   Left   Outer   Join   SysObjects   On   SysColumns.ID=SysObjects.ID where SysObjects.type='U' and SysColumns.xtype="
				+ this.data_xtype;
		int allnum = 0;
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(sqlstr);
		try {
			while (rst != null && rst.next()) {
				allnum++;
				DBToolData tempData = new DBToolData();
				tempData.setTableName(rst.getString("tname"));
				tempData.setColumnsName(rst.getString("cname"));
				tempData.setColumnsLen(rst.getInt("length"));
				veTable.add(tempData);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		gppsql.close();

		getJProgressBar().setMaximum(allnum);
		getJProgressBar().setValue(0);
		getJProgressBar().setStringPainted(true);
//		JOptionPane.showMessageDialog(null, "OK！", "执行完毕！",
//				JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * 更新数据表
	 */
	private void alterTable(String tname, String cname, int len) {
		String sqlstr = "alter   table " + tname + " alter column " + cname
				+ " " + data_xtype_str + "(" + len + ")";
		GppSQL gppsql = new GppSQL();
		gppsql.executesql(sqlstr);
		// System.out.println(sqlstr);
		gppsql.close();
	}

	/**
	 * 更新数据表
	 */
	private void alterTableKey(String tname, String cname, String keyname) {
		String sqlstr = "alter table " + tname + " add constraint " + keyname
				+ " primary key(" + cname + ")";
		GppSQL gppsql = new GppSQL();
		gppsql.executesql(sqlstr);
		// System.out.println(sqlstr);
		gppsql.close();
	}

	/**
	 * 开始调整表
	 */
	private void startAdjustFrom() {
		threadAdjustFrom = new Thread(this);
		threadAdjustFrom.start();
	}

	private void startRepairKey() {
		threadReparKey = new Thread(this);
		threadReparKey.start();
	}

	@Override
	public void run() {
		while (true) {
			
			if(threadReparKey == Thread.currentThread() ){
				
				Iterator<Object> it = veTable2.iterator();

				int ik2 = 0;
				while (it.hasNext()) {
					ik2++;
					DBToolData tempd = (DBToolData) it.next();
					String temtname = tempd.getTableName();
					String temcname = tempd.getColumnsName();

					alterTableKey(temtname, temcname, temtname + "_pk");
					 getJProgressBar1().setValue(ik2);
					 getJProgressBar1().setStringPainted(true);
				}
				threadReparKey.stop();
			}
			
			if(threadAdjustFrom == Thread.currentThread() ){
				Iterator<Object> it = veTable.iterator();

				int ik2 = 0;
				while (it.hasNext()) {
					ik2++;
					DBToolData tempd = (DBToolData) it.next();
					String temtname = tempd.getTableName();
					String temcname = tempd.getColumnsName();
					int temlen = tempd.getColumnsLen();

					alterTable(temtname, temcname,
							(int) (temlen * this.data_leng_times));
					 getJProgressBar().setValue(ik2);
					 getJProgressBar().setStringPainted(true);
					 
				}

				threadAdjustFrom.stop();
			}
		}

	}
} // @jve:decl-index=0:visual-constraint="10,10"
