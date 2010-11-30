/**
 * 
 */
package ptss;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import java.awt.Dimension;
import java.awt.Label;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import com.gopawpaw.dev.common.GppConfiguration;
import com.gopawpaw.javax.swing.GppJFrame;

/**
 * @version 2010-3-4
 * @author 李锦华
 * 
 */

public class ProgressToSQLServer extends GppJFrame implements Runnable {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTextField jTextField = null;
	private JTextArea jTextArea = null;
	private JPanel jPanel = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JScrollPane jScrollPane = null;
	private JSplitPane jSplitPane = null;
	private JScrollPane jScrollPane1 = null;
	private JTextArea jTextArea1 = null;
	private Thread threadImp = null;
	private JPanel jPanel1 = null;
	private JPanel jPanel2 = null;
	private JProgressBar jProgressBar = null;
	private boolean isWaitAnalyzer = true;
	private String dataFile = null;
	// private String insertSQL = null;

	private ArrayList<String> arrlDataFile = null; // @jve:decl-index=0:
	private ArrayList<String> arrlFileRecord = null; // @jve:decl-index=0:
	// private ArrayList<String> arrlfalse = null; // @jve:decl-index=0:
	private JPanel jPanel3 = null;
	private JPanel jPanel4 = null; // @jve:decl-index=0:visual-constraint="172,306"
	private JSplitPane jSplitPane1 = null;
	private JScrollPane jScrollPane2 = null;
	private JTextArea jTextArea2 = null;
	private JButton jButton3 = null;
	private JLabel jLabel = null;
	private JPanel jPanel5 = null;
	private JProgressBar jProgressBar1 = null;
	private JLabel jLabel1 = null;
	private JButton jButton2 = null;
	private JButton jButton4 = null;

	private boolean isStop = false;
	private Label label = null;
	private Label label1 = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JSplitPane jSplitPane2 = null;
	private JScrollPane jScrollPane3 = null;
	private JTextArea jTextArea3 = null;
	private GppConfiguration pts_mfgprod = new GppConfiguration(
			"pts_mfgprod.ini"); // @jve:decl-index=0:
	private GppConfiguration pts_admprod = new GppConfiguration(
			"pts_admprod.ini"); // @jve:decl-index=0:
	private GppConfiguration pts_hlpprod = new GppConfiguration(
			"pts_hlpprod.ini"); // @jve:decl-index=0:
	private GppConfiguration confProgressToSQLServer = new GppConfiguration(
			"ProgressToSQLServer.ini"); // @jve:decl-index=0:

	// private String confFile = "ProgressToSQLServer.ini"; //
	// @jve:decl-index=0:

	private String logdir = System.getProperty("user.dir") + "\\log\\"; // @jve:decl-index=0:
	private String logfile = "l.log"; // @jve:decl-index=0:
	private HashMap<Object, Object> logtableerr = new HashMap<Object, Object>(); // @jve:decl-index=0:
	private SimpleDateFormat formatter = new SimpleDateFormat(
			"yyyy-MM-dd-HH-mm-ss"); // @jve:decl-index=0:
	private JMenu jMenu1 = null;
	private About about = null;

	private Vector<Integer> ve_data_xtype = new Vector<Integer>(); // @jve:decl-index=0:

	private Vector<String> ve_column_name = new Vector<String>(); // @jve:decl-index=0:

	private JMenu jMenu2 = null;

	public ProgressToSQLServer() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		initialize();
	}

	public ProgressToSQLServer(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	public ProgressToSQLServer(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	public ProgressToSQLServer(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * This method initializes jTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
		}
		return jTextField;
	}

	/**
	 * This method initializes jTextArea
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setText("");
		}
		return jTextArea;
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
			jPanel.add(getJTextField(), null);
			jPanel.add(getJButton(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("浏览");

			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JFileChooser jFileChooser = new JFileChooser();

					jFileChooser
							.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					jFileChooser.showOpenDialog(null);
					File f = jFileChooser.getSelectedFile();
					if (f == null) {
						return;
					}
					String ph = f.getAbsolutePath();
					getJTextField().setText(ph);

					File file = new File(ph);
					String[] tempList = file.list();
					for (int i = 0; i < tempList.length; i++) {
						getJTextArea().append(tempList[i] + "\n");
					}
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jButton1
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("导入");
			jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					dataFile = getJTextField().getText();
					String filestr = getJTextArea().getText();
					if (dataFile.isEmpty() || filestr.isEmpty()) {
						return;
					}
					arrlDataFile.clear();
					String[] filelist = filestr.split("\n");
					for (int i = 0; i < filelist.length; i++) {
						arrlDataFile.add(filelist[i]);
					}

					logfile = formatter
							.format(Calendar.getInstance().getTime());

					if (!threadImp.isAlive()) {

						getJProgressBar().setValue(0);
						getJProgressBar().setStringPainted(true);
						getJProgressBar1().setValue(0);
						getJProgressBar1().setStringPainted(true);

						reStart();
					}

				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jScrollPane
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTextArea());

		}
		return jScrollPane;
	}

	/**
	 * This method initializes jSplitPane
	 * 
	 * @return javax.swing.JSplitPane
	 */
	private JSplitPane getJSplitPane() {
		if (jSplitPane == null) {
			// jSplitPane = new JSplitPane()
			// jSplitPane.setRightComponent(getJScrollPane1());
			// jSplitPane.setLeftComponent(getJScrollPane());

			jSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
			jSplitPane.setResizeWeight(0.6);
			jSplitPane.setDividerSize(8);
			jSplitPane.setTopComponent(getJPanel4());
			jSplitPane.setBottomComponent(getJPanel1());
			jSplitPane.setOneTouchExpandable(true);
		}
		return jSplitPane;
	}

	/**
	 * This method initializes jScrollPane1
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTextArea1());
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes jTextArea1
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea1() {
		if (jTextArea1 == null) {
			jTextArea1 = new JTextArea();
		}
		return jTextArea1;
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BorderLayout());
			jPanel1.add(getJPanel2(), BorderLayout.NORTH);
			jPanel1.add(getJSplitPane2(), BorderLayout.CENTER);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jPanel2
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.X_AXIS));
			jPanel2.add(getJLabel(), null);
			jPanel2.add(getJProgressBar(), null);
			jPanel2.add(getLabel1(), null);
		}
		return jPanel2;
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
	 * This method initializes jPanel3
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 3;
			gridBagConstraints3.gridy = 0;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 2;
			gridBagConstraints2.gridy = 0;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 1;
			gridBagConstraints1.gridy = 0;
			jPanel3 = new JPanel();
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;

			jPanel3.setLayout(new GridBagLayout());
			jPanel3.add(getJButton1(), new GridBagConstraints());
			jPanel3.add(getJButton3(), gridBagConstraints1);
			jPanel3.add(getJButton2(), gridBagConstraints2);
			jPanel3.add(getJButton4(), gridBagConstraints3);
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
			jPanel4.setLayout(new BorderLayout());
			jPanel4.setSize(new Dimension(321, 108));
			jPanel4.add(getJSplitPane1(), BorderLayout.CENTER);
			jPanel4.add(getJPanel5(), BorderLayout.SOUTH);
		}
		return jPanel4;
	}

	/**
	 * This method initializes jSplitPane1
	 * 
	 * @return javax.swing.JSplitPane
	 */
	private JSplitPane getJSplitPane1() {
		if (jSplitPane1 == null) {
			jSplitPane1 = new JSplitPane();
			jSplitPane1.setResizeWeight(0.4);
			jSplitPane1.setDividerSize(8);
			jSplitPane1.setOneTouchExpandable(true);
			jSplitPane1.setLeftComponent(getJScrollPane());
			jSplitPane1.setRightComponent(getJScrollPane2());
		}
		return jSplitPane1;
	}

	/**
	 * This method initializes jScrollPane2
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setViewportView(getJTextArea2());
		}
		return jScrollPane2;
	}

	/**
	 * This method initializes jTextArea2
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea2() {
		if (jTextArea2 == null) {
			jTextArea2 = new JTextArea();
		}
		return jTextArea2;
	}

	/**
	 * This method initializes jButton3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("暂停");
			jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// isRun = false;
					isWaitAnalyzer = true;
				}
			});
		}
		return jButton3;
	}

	/**
	 * This method initializes jLabel
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel() {
		if (jLabel == null) {
			jLabel = new JLabel();
			jLabel.setText("当前进度：");
		}
		return jLabel;
	}

	/**
	 * This method initializes jPanel5
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jPanel5 = new JPanel();
			jPanel5.setLayout(new BoxLayout(jPanel5, BoxLayout.X_AXIS));
			jPanel5.add(getJLabel1(), null);
			jPanel5.add(getJProgressBar1(), null);
			jPanel5.add(getLabel(), null);
		}
		return jPanel5;
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
	 * This method initializes jLabel1
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("总  进  度：");
		}
		return jLabel1;
	}

	/**
	 * This method initializes jButton2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("继续");
			jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// isRun = true;
					isWaitAnalyzer = false;
					analyzerNotifyAll();
				}
			});
		}
		return jButton2;
	}

	/**
	 * This method initializes jButton4
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("停止");
			jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					isStop = true;
					isWaitAnalyzer = false;
					analyzerNotifyAll();

				}
			});
		}
		return jButton4;
	}

	/**
	 * This method initializes label
	 * 
	 * @return java.awt.Label
	 */
	private Label getLabel() {
		if (label == null) {
			label = new Label();
			label.setText("");
		}
		return label;
	}

	/**
	 * This method initializes label1
	 * 
	 * @return java.awt.Label
	 */
	private Label getLabel1() {
		if (label1 == null) {
			label1 = new Label();
			label1.setText("");
		}
		return label1;
	}

	/**
	 * This method initializes jJMenuBar
	 * 
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu2());
			jJMenuBar.add(getJMenu1());

		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("参数设置");
			jMenu.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					ParamSet ps = new ParamSet();
					ps.setVisible(true);
				}
			});
		}
		return jMenu;
	}

	/**
	 * This method initializes jSplitPane2
	 * 
	 * @return javax.swing.JSplitPane
	 */
	private JSplitPane getJSplitPane2() {
		if (jSplitPane2 == null) {
			jSplitPane2 = new JSplitPane();
			jSplitPane2.setResizeWeight(0.4);
			jSplitPane2.setDividerSize(8);
			jSplitPane2.setOneTouchExpandable(true);
			jSplitPane2.setLeftComponent(getJScrollPane1());
			jSplitPane2.setRightComponent(getJScrollPane3());
		}
		return jSplitPane2;
	}

	/**
	 * This method initializes jScrollPane3
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane3() {
		if (jScrollPane3 == null) {
			jScrollPane3 = new JScrollPane();
			jScrollPane3.setViewportView(getJTextArea3());
		}
		return jScrollPane3;
	}

	/**
	 * This method initializes jTextArea3
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea3() {
		if (jTextArea3 == null) {
			jTextArea3 = new JTextArea();
		}
		return jTextArea3;
	}

	/**
	 * This method initializes jMenu1
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("关于");
			jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					about.setVisible(true);
				}
			});
		}
		return jMenu1;
	}

	/**
	 * This method initializes jMenu2
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("数据库结构调整");
			jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					DBTool dbt = new DBTool();
					dbt.setVisible(true);
				}
			});
		}
		return jMenu2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ProgressToSQLServer thisClass = new ProgressToSQLServer() {
					/**
					 * 
					 */
					private static final long serialVersionUID = -2948895842430695588L;

					public void initProductionName() {
						ProgressToSQLServer.productionName = "PTSS";
					}
				};
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
		this.setSize(704, 271);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("PTSS 数据导入工具 V0.3 Beta");
		this.setLocation(300, 200);

		arrlFileRecord = new ArrayList<String>();
		arrlDataFile = new ArrayList<String>();

		threadImp = new Thread(this);

		about = new About(this);
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
			jContentPane.add(getJPanel(), BorderLayout.NORTH);
			jContentPane.add(getJSplitPane(), BorderLayout.CENTER);
			jContentPane.add(getJPanel3(), BorderLayout.SOUTH);

		}
		return jContentPane;
	}

	private boolean deleteFormData(String dbForm) {
		boolean retb = false;

		GppSQL gppsql = new GppSQL();
		retb = gppsql.executesql("delete from " + dbForm);
		gppsql.close();

		return retb;
	}

	private boolean insertIntoSQL(String insertSQL) {
		boolean ret = false;
		GppSQL gppsql = new GppSQL();
		ret = gppsql.executesql(insertSQL);
		gppsql.close();
		return ret;
	}

	private String convFormName(String formName) {

		if (confProgressToSQLServer.getValue("DefaultConnect")
				.equals("mfgprod")) {
			return pts_mfgprod.getValue(formName);
		} else if (confProgressToSQLServer.getValue("DefaultConnect").equals(
				"admprod")) {
			return pts_admprod.getValue(formName);
		} else if (confProgressToSQLServer.getValue("DefaultConnect").equals(
				"hlpprod")) {
			return pts_hlpprod.getValue(formName);
		} else {
			return formName;
		}

		// String rets = "";
		// boolean bool = false;
		// String fname = formName;
		//
		// String sqlstr = "Select   name   From   SysObjects where name='"
		// + formName + "'";
		//
		// GppSQL gppsql = new GppSQL();
		// ResultSet rst = gppsql.query(sqlstr);
		// try {
		// while (rst.next()) {
		// bool = true;
		// }
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		// gppsql.close();
		//
		// // 保持原样返回
		// if (bool) {
		// pts_admprod.setValue(formName, formName);
		// } else {
		// System.out.println(formName);
		// // sqlstr = "Select   name   From   SysObjects where name like '"
		// // + fname + "%'";
		// // String temps = "";
		// // GppSQL gppsql2 = new GppSQL();
		// // ResultSet rst2 = gppsql.query(sqlstr);
		// // try {
		// // while (rst2.next()) {
		// // bool = true;
		// // temps = rst2.getString("name");
		// // }
		// // } catch (SQLException e) {
		// // e.printStackTrace();
		// // }
		// // gppsql2.close();
		// // if(bool){
		// // pts_mfgprod.setValue(formName, temps);
		// // }else{
		// // pts_mfgprod2.setValue(formName, formName);
		// // }
		//			
		// }
		//
		// // if(str.length == 2){
		// // pts_mfgprod.setValue(str[1], "");
		// // }else{
		// // pts_mfgprod.setValue(formName, "");
		// // }
		//
		// pts_admprod.saveFile("pts_admprod.ini", "");
		// // pts_mfgprod2.saveFile("pts_mfgprod2.ini", "");
		// return rets;
	}

	/**
	 * 获取表Insert前缀
	 */
	private String getInsertSQL(String dbForm) {

		String rets = null;
		ve_data_xtype.removeAllElements();
		ve_column_name.removeAllElements();

		dbForm = convFormName(dbForm);

		String sqlstr = "Select   *   From   SysColumns   Left   Outer   Join   SysObjects   On   SysColumns.ID=SysObjects.ID where SysObjects.name='"
				+ dbForm + "'";

		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(sqlstr);
		try {
			while (rst.next()) {
				String tem = rst.getString("name");
				if (rets == null) {
					rets = "insert into " + dbForm + "(" + tem;
				} else {
					rets = rets + "," + tem;
				}

				ve_column_name.add(tem);
				ve_data_xtype.add(rst.getInt("xtype"));
			}

			rets = rets + ")";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		gppsql.close();
		return rets;
	}

	/**
	 * 将progress导出数据转换为SQL数据格式 正则表达算法
	 */
	// private String convSQLData(String sqlValues) {
	// String rets = null;
	// // sqlValues = sqlValues.replaceAll("'", "''");
	// // System.out.println(sqlValues);
	// // Pattern p =
	// //
	// Pattern.compile("(?<=\"{1})[^\"\\s]+\\s+?(?=\"+?)|(?<=\"{1})[^\"\\s]*(?=\"+?)|(?<=\"{1}\\s{1})[^\\s\"]+(?=\\s??)");
	//
	// // Pattern p =
	// //
	// Pattern.compile("(?<=^\"{1})[^\\s]*(?=(\"\\s)+?)|(?<=(\\s\"){1}).*(?=(\"{1}[\\S{1}\\s{1}]))");
	//
	// // Pattern p = Pattern.compile("(?<=^\"{1})[^\\s]*(?=(\"\\s)+?)"); //开头
	// // Pattern p =
	// // Pattern.compile("(?<=(\\s{1}\"){1})\\S*(?=(\"{1}\\s{1})+?)");//没有空格
	// // Pattern p =
	// //
	// Pattern.compile("(?<=(\\s{1}\"){1})[^\"]?[^\\s]+([^\\s]*\\s+[^\\s]*)+[^\\s]+[^\"](?=(\"{1}\\s{1})+?)");//中间有空格，两边没空格
	// // Pattern p =
	// // Pattern.compile("(?<=(\\s\"){1})(.{0,}?)(?=(\"{1}\\s{1})+?)");//匹配中间
	// // Pattern p =
	// // Pattern.compile("(?<=\"{1}\\s{1})[^\\s\"]+(?=\\s?)");//匹配字母数字
	// // Pattern p =
	// //
	// Pattern.compile("(?<=(\\s{1}\"){1})\\s*[^\"][^\\s]+\\s*[^\\s]+[^\"]\\s+(?=(\"{1}\\s{1})+?)");
	// // Pattern p =
	// //
	// Pattern.compile("(?<=(\\s{1}\"){1})\\s*[^\"][^\\s]+\\s*[^\\s]+[^\"](?=(\"{1}\\s{1})+?)");
	// // Pattern p =
	// //
	// Pattern.compile("(?<=(\\s{1}\"){1})(.*[\"]{2}.*){1,}?(?=(\"{1}\\s{1})+?)");
	//
	// //
	// Pattern.compile("(?<=^\"{1})[^\\s]*(?=(\"\\s)+?)|(?<=(\"\\s\"))(.{0,}?)(?=(\"{1}\\s{1})+?)|(?<=\"{1}\\s{1})[^\\s\"]+(?=\\s?)");
	// // Pattern p = Pattern
	// //
	// .compile("(?<=^\"{1})[^\\s]*(?=(\"\\s)+?)|(?<=\\s\")(.{0,}?)(?=(\"\\s){1,}?)|(?<=\"{1}\\s{1})[^\\s\"]+(?=\\s?)");
	// // (((?'Open'<div[^>]*>)[^<>]*)+((?'-Open'</div>)[^<>]*)+)
	// Pattern p = Pattern.compile(".*?(?=\\s\"|\\s\\d)|\\d*");
	//
	// Pattern p2 = Pattern.compile("(?<=\").*(?=\")");
	//
	// Matcher m = p.matcher(sqlValues);
	//
	// while (m.find()) {
	// String temp = m.group();
	// if (temp.trim().isEmpty()) {
	// continue;
	// }
	// temp = temp.trim();
	// if (temp.startsWith("\"") && temp.endsWith("\"")) {
	// Matcher m2 = p2.matcher(temp);
	// if (m2.find())
	// temp = m2.group();
	// }
	//
	// // 将Progress的logical数据类型转换为SQL Server 的tinyint数据类型
	// if (temp.equals("no")) {
	// temp = "0";
	// } else if (temp.equals("yes")) {
	// temp = "1";
	// }
	//
	// // 过滤双引号
	// temp = temp.replaceAll("\"\"", "\"");
	//
	// if (rets == null) {
	// rets = "'" + temp + "'";
	// } else {
	// rets = rets + ",'" + temp + "'";
	// }
	// }
	// // rets = rets.replaceAll(",' \"',", ",");
	// // System.out.println(rets);
	// return rets;
	// }

	/**
	 * 将progress导出数据转换为SQL数据格式 循环算法
	 */
	private String convSQLData2(String sqlValues) {
		String rets = null;
		String str = sqlValues.trim();
		str = str.replaceAll("'", "''");
		boolean bool = false;
		boolean boolString = false;
		String oneFile = null;
		char[] tempchar = str.toCharArray();
		int slen = tempchar.length;
		int si = 0;
		int coum_xtype = -1;
		for (int i = 0; i < slen; i++) {
			String tempc = String.valueOf(tempchar[i]);
			// System.out.println("i="+i+tempc);
			// 标记开始
			if ((i == 0 && !tempc.equals("\""))) {
				bool = true;
				boolString = false;
				si = i;
			}

			if ((!bool && tempc.equals("\""))) {
				bool = true;
				boolString = true;
				si = i;
				continue;
			}

			if (!bool && tempc.equals(" ")
					&& !(String.valueOf(tempchar[i + 1])).equals("\"")) {
				bool = true;
				boolString = false;
				si = i;
				continue;
			}

			if (!bool && tempc.equals(" ")
					&& (String.valueOf(tempchar[i + 1])).equals("\"")) {

				continue;
			}

			if (!bool && !tempc.equals(" ") && !tempc.equals("\"")) {
				bool = true;
				boolString = false;
				si = i;
			}
			// 标记结束
			if (i == 1) {
				if (bool && tempc.equals("\"")
						&& (String.valueOf(tempchar[0])).equals("\"")
						&& (String.valueOf(tempchar[i + 1])).equals(" ")) {
					bool = false;
				} else if (bool && tempc.equals(" ")
						&& !(String.valueOf(tempchar[0])).equals("\"")
						&& !(String.valueOf(tempchar[0])).equals(" ")) {
					bool = false;
				}

			} else if (i > 1 && i + 1 < slen) {
				if (bool && !boolString && tempc.equals(" ")) {
					bool = false;
				} else if (bool && boolString && tempc.equals("\"")
						&& ((String.valueOf(tempchar[i + 1])).equals(" "))) {

					char buf[] = new char[i - si + 1];
					str.getChars(si, i + 1, buf, 0);
					String tempst = String.valueOf(buf);

					Pattern p = Pattern.compile("\"");

					Matcher m = p.matcher(tempst);

					int iin = 0;
					while (m.find()) {
						iin++;
					}

					if (iin % 2 == 0) {
						bool = false;
					}

				}

			} else if (i + 1 == slen) {
				if (bool && !boolString) {
					bool = false;
				} else if (bool && tempc.equals("\"")) {
					bool = false;
				}
			}

			// 获取值
			if (bool) {
				if (oneFile == null) {
					oneFile = "'" + tempc;
				} else {
					oneFile = oneFile + tempc;
				}

			} else {
				if (!tempc.equals("\"")) {
					if (i + 1 == slen && oneFile == null) {
						oneFile = "'" + tempc + "'";
					} else if (i + 1 == slen && oneFile != null) {
						oneFile = oneFile + tempc + "'";
					} else {
						oneFile = oneFile + "'";
					}

				} else {
					if (i - si == 1) {
						oneFile = "''";
					} else {
						oneFile = oneFile + "'";
					}

				}

				// 将Progress的logical数据类型转换为SQL Server 的tinyint数据类型
				if (oneFile.equals("'no'")) {
					oneFile = "'0'";
				} else if (oneFile.equals("'yes'")) {
					oneFile = "'1'";
				}

				if (oneFile.equals("'?'")) {
					oneFile = "''";
				}

				coum_xtype++;
				int tem = ve_data_xtype.get(coum_xtype);
				String tems = ve_column_name.get(coum_xtype);

				oneFile = oneFile.replaceAll("\"\"", "\"");
				if (rets == null) {

					if (tem == 61
							&& (oneFile.equals("'0'") || oneFile.equals("''"))) {
						oneFile = "'10/01/01'";
					} else if (tem == 106 && oneFile.equals("''")) {
						oneFile = "'0'";
					}

					// 关键字为0时，赋值时间微妙
					if (tems.startsWith("oid_")
							&& (oneFile.equals("'0'") || oneFile.equals("''"))) {
						oneFile = String.valueOf(Calendar.getInstance()
								.getTimeInMillis());
					}

					rets = oneFile;
				} else {
					if (tem == 61
							&& (oneFile.equals("'0'") || oneFile.equals("''"))) {
						oneFile = "'10/01/01'";
					} else if (tem == 106 && oneFile.equals("''")) {
						oneFile = "'0'";
					}

					// 关键字为0时，赋值时间微妙
					if (tems.startsWith("oid_")
							&& (oneFile.equals("'0'") || oneFile.equals("''"))) {
						oneFile = String.valueOf(Calendar.getInstance()
								.getTimeInMillis());
					}
					rets = rets + "," + oneFile;
				}
				oneFile = null;
			}
		}
		// System.out.println(sqlValues);
		// System.out.println(rets);
		return rets;
	}

	private boolean saveERRLog() {
		boolean retb = false;

		String logfs = this.logdir + this.logfile + ".soure.log";
		String logfc = this.logdir + this.logfile + ".conv.log";
		String logfd = this.logdir + this.logfile + "-"
				+ confProgressToSQLServer.getValue("DefaultConnect");

		PrintWriter pw, pw2, pw4 = null;
		try {
			pw = new PrintWriter(new FileWriter(logfs));
			pw2 = new PrintWriter(new FileWriter(logfc));

			String[] str1 = getJTextArea1().getText().split("\n");
			String[] str2 = getJTextArea3().getText().split("\n");

			pw2.println("--错误日志：" + logfile);
			pw2.println("--数据库："
					+ confProgressToSQLServer.getValue("DefaultConnect"));

			for (int i = 0; i < str1.length; i++) {
				pw.println(str1[i]);
			}
			for (int i = 0; i < str2.length; i++) {
				pw2.println(str2[i]);
			}

			File f = new File(logfd);
			f.mkdir();

			Iterator<Object> it = this.logtableerr.keySet().iterator();
			while (it.hasNext()) {
				String temptname = (String) it.next();
				Iterator<?> tempit = ((Vector<?>) this.logtableerr
						.get(temptname)).iterator();

				pw4 = new PrintWriter(new FileWriter(logfd + File.separator
						+ temptname));

				while (tempit.hasNext()) {
					String te = (String) tempit.next();

					pw4.println(te);
				}
				pw4.close();

			}

			pw.close();
			pw2.close();

			retb = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			retb = false;
		}

		return retb;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (isWaitAnalyzer) {
				try {
					analyzerWait();
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}

			int tnum = 0;
			int tnummax = arrlDataFile.size();
			Iterator<String> itDataFile = arrlDataFile.iterator();

			getJProgressBar1().setMaximum(tnummax);
			/**
			 * 遍历所有文件
			 */
			while (itDataFile.hasNext()) {
				tnum++;

				String oneDataFile = itDataFile.next().toString().trim();
				String[] tempD = oneDataFile.split("\\.");
				String dbForm = tempD[0];

				getJTextArea2().append(
						oneDataFile + " =======Import Into Table=======》 "
								+ dbForm + " \n");
				getJTextArea2().setCaretPosition(
						getJTextArea2().getText().length());
				getLabel().setText(tnum + " / " + tnummax);
				getJProgressBar1().setValue(tnum);
				getJProgressBar1().setStringPainted(true);

				// 清空数据表数据
				GppConfiguration gppconf = new GppConfiguration(
						"ProgressToSQLServer.ini");
				if (gppconf.getValue("DefaultClear").equals("Y")) {
					deleteFormData(dbForm);
				}

				/**
				 * 读取数据文件到数组arrlFileRecord
				 */
				arrlFileRecord.clear();
				try {
					File file = new File(this.dataFile + "\\" + oneDataFile);
					BufferedReader in = new BufferedReader(new FileReader(file));
					String line = null;

					while ((line = in.readLine()) != null) {
						arrlFileRecord.add(line);
					}
				} catch (Exception ew) {
					ew.printStackTrace();
				}

				/**
				 * 获取数据表字段名称
				 */
				String insertSQLPre = getInsertSQL(dbForm);

				int rnum = 0;
				int rnummax = arrlFileRecord.size();
				Iterator<String> itFileRecord = arrlFileRecord.iterator();
				getJProgressBar().setMaximum(rnummax);

				/**
				 * 遍历文件记录
				 */
				while (itFileRecord.hasNext()) {

					if (isStop) {
						getLabel().setText("0 / 0");
						getLabel1().setText("0 / 0");
						getJProgressBar().setValue(0);
						getJProgressBar1().setValue(0);
						return;
					}

					if (isWaitAnalyzer) {
						try {
							analyzerWait();
						} catch (InterruptedException e) {
							// TODO 自动生成 catch 块
							e.printStackTrace();
						}
					}

					rnum++;

					String temp = itFileRecord.next();
					// 判断是否有还有数据记录
					if (temp.trim().equals(".") || temp.trim().equals("PSC")) {
						getJProgressBar().setValue(arrlFileRecord.size());
						getJProgressBar().setStringPainted(true);
						break;
					}
					getLabel1().setText(rnum + " / " + rnummax);
					getJProgressBar().setValue(rnum);
					getJProgressBar().setStringPainted(true);
					// convSQLData2(temp);
					String tempSQLEXE = insertSQLPre + " values ("
							+ convSQLData2(temp) + ")";

					if (!insertIntoSQL(tempSQLEXE)) {
						getJTextArea1().append(temp + "\n");
						getJTextArea1().setCaretPosition(
								getJTextArea1().getText().length());

						getJTextArea3().append(tempSQLEXE + "\n");
						getJTextArea3().setCaretPosition(
								getJTextArea3().getText().length());

						Vector<String> tempve = (Vector<String>) logtableerr
								.get(oneDataFile);

						if (tempve == null) {
							tempve = new Vector<String>();
						}
						tempve.add(temp);

						logtableerr.put(oneDataFile, tempve);

					}

				}
			}
			saveERRLog();
			isWaitAnalyzer = true;
		}
	}

	private void reStart() {

		isStop = false;
		isWaitAnalyzer = false;
		threadImp = new Thread(this);
		threadImp.start();

		// if (!threadImp.isAlive())
		// threadImp.start();

		analyzerNotifyAll();
	}

	public synchronized void analyzerWait() throws InterruptedException {
		isWaitAnalyzer = true;
		wait();
	}

	public synchronized void analyzerNotifyAll() {
		notifyAll();
	}
} // @jve:decl-index=0:visual-constraint="10,10"
