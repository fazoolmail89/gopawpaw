/**
 * 
 */
package ptss;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.gopawpaw.dev.common.GppConfiguration;

import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

/**
 * @version 2010-3-7
 * @author 李锦华
 *
 */
public class ParamSet extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel jPanel = null;
	private JPanel jPanel1 = null;
	private JLabel jLabel = null;
	private JComboBox jComboBox = null;
	private JPanel jPanel2 = null;
	private JButton jButton = null;
	private JPanel jPanel3 = null;
	private JPanel jPanel4 = null;
	private JLabel jLabel1 = null;
	private JRadioButton jRadioButton = null;
	private JRadioButton jRadioButton1 = null;
	private JPanel jPanel5 = null;
	private JButton jButton1 = null;
	
	ButtonGroup buttonGroup = null;  //  @jve:decl-index=0:
	private JTextPane jTextPane = null;
	private JTextPane jTextPane1 = null;
	/**
	 * @throws HeadlessException
	 */
	public ParamSet() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public ParamSet(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public ParamSet(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public ParamSet(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(414, 224);
		this.setContentPane(getJContentPane());
		this.setLocation(300, 200);
		this.setTitle("参数配置");
		
		
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
	 * This method initializes jTabbedPane	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.addTab("数据库", null, getJPanel(), null);
			jTabbedPane.addTab("导入方式", null, getJPanel3(), null);
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
			jPanel.add(getJTextPane(), BorderLayout.CENTER);
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
			jLabel = new JLabel();
			jLabel.setText("连接数据库：");
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
			jPanel1.add(jLabel, null);
			jPanel1.add(getJComboBox(), null);
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
			jComboBox.addItem("admprod");
			jComboBox.addItem("hlpprod");
			jComboBox.addItem("mfgprod");
			
			GppConfiguration gppconf = new GppConfiguration("ProgressToSQLServer.ini");
			jComboBox.setSelectedItem(gppconf.getValue("DefaultConnect"));
		}
		return jComboBox;
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
					String selet = (String) getJComboBox().getSelectedItem();
					GppConfiguration gppconf = new GppConfiguration("ProgressToSQLServer.ini");
					gppconf.setValue("DefaultConnect", selet);
					gppconf.saveFile("ProgressToSQLServer.ini", "");
					
				JOptionPane.showMessageDialog(null, "OK！", "",
								JOptionPane.INFORMATION_MESSAGE);
						
					
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
			jPanel3.add(getJPanel5(), BorderLayout.SOUTH);
			jPanel3.add(getJTextPane1(), BorderLayout.CENTER);
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
			jLabel1 = new JLabel();
			jLabel1.setText("导入前清空数据：");
			jPanel4 = new JPanel();
			jPanel4.setLayout(new BoxLayout(jPanel4, BoxLayout.X_AXIS));
			
			buttonGroup = new ButtonGroup();
			buttonGroup.add(getJRadioButton());
			buttonGroup.add(getJRadioButton1());
			jPanel4.add(jLabel1, null);
			jPanel4.add(getJRadioButton(), null);
			jPanel4.add(getJRadioButton1(), null);
			
			GppConfiguration gppconf = new GppConfiguration("ProgressToSQLServer.ini");
			String tem = gppconf.getValue("DefaultClear");
			
			if (tem.equals("Y")) {
				getJRadioButton().setSelected(true);
			} else {
				getJRadioButton1().setSelected(true);
			}
		}
		return jPanel4;
	}

	/**
	 * This method initializes jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton() {
		if (jRadioButton == null) {
			jRadioButton = new JRadioButton();
			jRadioButton.setText("是");
		}
		return jRadioButton;
	}

	/**
	 * This method initializes jRadioButton1	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton1() {
		if (jRadioButton1 == null) {
			jRadioButton1 = new JRadioButton();
			jRadioButton1.setText("否");
		}
		return jRadioButton1;
	}

	/**
	 * This method initializes jPanel5	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jPanel5 = new JPanel();
			jPanel5.setLayout(new GridBagLayout());
			jPanel5.add(getJButton1(), new GridBagConstraints());
		}
		return jPanel5;
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
					
					GppConfiguration gppconf = new GppConfiguration("ProgressToSQLServer.ini");
					
					String tempmsg = "";
					
					if(getJRadioButton().isSelected()){
						gppconf.setValue("DefaultClear", "Y");
						tempmsg = "注意：当前状态为“Y” 导入数据前，清空原有数据！";
					}else{
						gppconf.setValue("DefaultClear", "N");
						tempmsg = "注意：当前状态为“N” 导入数据前，不清空原有数据！";
					}
					
					gppconf.saveFile("ProgressToSQLServer.ini", "");
					
				JOptionPane.showMessageDialog(null, tempmsg, "",
								JOptionPane.INFORMATION_MESSAGE);
				
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jTextPane	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getJTextPane() {
		if (jTextPane == null) {
			jTextPane = new JTextPane();
			jTextPane.setText("在配置好3个数据库的ODBC链接后，设置好配置文件：ProgressToSQLServer.ini 中相应3个参数（mfgprod=数据源、hlpprod=数据源、admprod=数据源），在数据开始导入前请在此选择当前导入的数据库。");
		}
		return jTextPane;
	}

	/**
	 * This method initializes jTextPane1	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getJTextPane1() {
		if (jTextPane1 == null) {
			jTextPane1 = new JTextPane();
			jTextPane1.setText("注意：选择“是” 表示数据每导入一个表前，都会清空该表原有的数据；选择“否”表示数据导入前，程序不会清空该表原有数据。建议：选择是，否则会出现有重复主键而不能完全导入。");
		}
		return jTextPane1;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
