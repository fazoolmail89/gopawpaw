package app;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import test.FontChooserWithPole;

public class Parameter extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel jPanel = null;

	private JTabbedPane jTabbedPane = null;

	private JPanel jPanel1 = null;

	private JPanel jPanel2 = null;

	private JPanel jPanel3 = null;

	private JRadioButton jRadioButton = null;

	private JRadioButton jRadioButton1 = null;

	private JPanel jPanel4 = null;

	private JButton jButton = null;

	ButtonGroup buttonGroup = null; // @jve:decl-index=0:

	private JPanel jPanel5 = null;

	private JLabel jLabel = null;

	private JComboBox jComboBox = null;

	private JPanel jPanel7 = null; // @jve:decl-index=0:visual-constraint="443,21"

	private JPanel jPanel8 = null; // @jve:decl-index=0:visual-constraint="531,172"

	private JPanel jPanel6 = null;

	private JButton jButton1 = null;

	private JButton jButton2 = null;

	private JButton jButton3 = null;

	private JPanel jPanel9 = null;

	private JLabel jLabel1 = null;

	private JTextField jTextField = null;

	private JLabel jLabel2 = null;

	private JTextField jTextField1 = null;
	
	private int nowawardsid = 0;

	private JPanel jPanel71 = null;

	private JButton jButton4 = null;

	private JLabel jLabel3 = null;

	private JPanel jPanel72 = null;

	private JLabel jLabel5 = null;

	private JLabel jLabel6 = null;

	private JTextField jTextField2 = null;

	private JTextField jTextField3 = null;

	private JLabel jLabel4 = null;

	private JTextField jTextField4 = null;

	private JLabel jLabel7 = null;

	private JTextField jTextField5 = null;

	/**
	 * This is the default constructor
	 */
	public Parameter() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(333, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("设置抽奖参数");

		GiftSQL mgiftSQL = new GiftSQL();

		String sql = "select * from syscfg where keystr='singlelucky'";

		ResultSet rs = mgiftSQL.executeQuery(sql);

		String tem = null;
		try {
			while (rs.next()) {
				tem = rs.getString("valuestr");
			}
		} catch (SQLException e1) {
			// TODO 自动生成 catch 块
			e1.printStackTrace();
		}

		if (tem.endsWith("Y")) {
			getJRadioButton().setSelected(true);
		} else {
			getJRadioButton1().setSelected(true);
		}

		mgiftSQL.close();
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
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BorderLayout());
			jPanel.add(getJPanel5(), BorderLayout.NORTH);
			jPanel.add(getJPanel6(), BorderLayout.SOUTH);
			jPanel.add(getJPanel9(), BorderLayout.CENTER);
		}
		return jPanel;
	}

	/**
	 * This method initializes jTabbedPane
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.addTab("奖项设置", null, getJPanel(), null);
			jTabbedPane.addTab("抽奖方式", null, getJPanel1(), null);
			jTabbedPane.addTab("风格显示", null, getJPanel2(), null);
		}
		return jTabbedPane;
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

			jPanel1.add(getJPanel3(), BorderLayout.CENTER);
			jPanel1.add(getJPanel4(), BorderLayout.SOUTH);
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
			jLabel3 = new JLabel();
			jLabel3.setText("可设置抽奖显示的字体类型、颜色、大小及背景颜色");
			jPanel2 = new JPanel();
			jPanel2.setLayout(new BorderLayout());
			jPanel2.add(getJPanel71(), BorderLayout.SOUTH);
			jPanel2.add(jLabel3, BorderLayout.NORTH);
			jPanel2.add(getJPanel72(), BorderLayout.CENTER);
		}
		return jPanel2;
	}

	/**
	 * This method initializes jPanel3
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {

			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridy = 1;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			buttonGroup = new ButtonGroup();
			buttonGroup.add(getJRadioButton());
			buttonGroup.add(getJRadioButton1());

			jPanel3 = new JPanel();
			jPanel3.setLayout(new GridBagLayout());
			jPanel3.add(getJRadioButton(), gridBagConstraints);
			jPanel3.add(getJRadioButton1(), gridBagConstraints1);
		}
		return jPanel3;
	}

	/**
	 * This method initializes jRadioButton
	 * 
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getJRadioButton() {
		if (jRadioButton == null) {
			jRadioButton = new JRadioButton();
			jRadioButton.setText("单个抽奖（每个奖项名额一个一个的抽）");
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
			jRadioButton1.setText("一次抽完（每个奖项名额一次性抽奖完）");
		}
		return jRadioButton1;
	}

	/**
	 * This method initializes jPanel4
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 0;
			gridBagConstraints4.gridy = 0;
			jPanel4 = new JPanel();
			jPanel4.setLayout(new GridBagLayout());
			jPanel4.add(getJButton(), gridBagConstraints4);
		}
		return jPanel4;
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

					GiftSQL mgiftSQL = new GiftSQL();

					String sql = null;

					if (getJRadioButton().isSelected()) {
						sql = "update syscfg set valuestr='Y' where keystr='singlelucky'";
					} else {
						sql = "update syscfg set valuestr='N' where keystr='singlelucky'";
					}

					mgiftSQL.executeQuery(sql);

					mgiftSQL.close();

					String tem = "成功设置！";
					JOptionPane.showMessageDialog(null, tem, "提示",
							JOptionPane.OK_OPTION);
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jPanel5
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jLabel = new JLabel();
			jLabel.setText("  奖项: ");
			jPanel5 = new JPanel();
			jPanel5.setLayout(new BoxLayout(jPanel5, BoxLayout.X_AXIS));
			jPanel5.add(jLabel, null);
			jPanel5.add(getJComboBox(), null);
		}
		return jPanel5;
	}

	/**
	 * This method initializes jComboBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JComboBox();
			jComboBox.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {

					String itemname = (String) getJComboBox().getSelectedItem();

					if(itemname == null) return;
					itemname = itemname.trim();

					GiftSQL mgiftSQL = new GiftSQL();

					String sql = null;

					sql = "select * from awards where ItemName='" + itemname
							+ "'";

					ResultSet rs = mgiftSQL.executeQuery(sql);

					try {
						while (rs.next()) {
							nowawardsid = Integer.parseInt((String)rs.getString("ID"));
							getJTextField().setText(rs.getString("ItemName"));
							getJTextField1().setText(rs.getString("numbers"));
							

						}
					} catch (SQLException e1) {
						// TODO 自动生成 catch 块
						e1.printStackTrace();
					}

					mgiftSQL.close();

				}
			});

			GiftSQL mgiftSQL = new GiftSQL();

			String sql = null;

			sql = "select * from awards";

			ResultSet rs = mgiftSQL.executeQuery(sql);

			try {
				while (rs.next()) {
					String tem = rs.getString("ItemName");
					jComboBox.addItem(tem);
				}
			} catch (SQLException e1) {
				// TODO 自动生成 catch 块
				e1.printStackTrace();
			}

			mgiftSQL.close();
		}
		return jComboBox;
	}

	/**
	 * This method initializes jPanel6
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel6() {
		if (jPanel6 == null) {
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 2;
			gridBagConstraints5.gridy = 0;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 1;
			gridBagConstraints3.gridy = 0;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.gridy = 0;
			jPanel6 = new JPanel();
			jPanel6.setLayout(new GridBagLayout());
			jPanel6.add(getJButton1(), gridBagConstraints2);
			jPanel6.add(getJButton2(), gridBagConstraints3);
			jPanel6.add(getJButton3(), gridBagConstraints5);
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
			jButton1.setText("增加");
			jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					String itemname = getJTextField().getText();
					String numbers = getJTextField1().getText();
					itemname = itemname.trim();
					numbers = numbers.trim();

					if (itemname.isEmpty()) {
						String tem = "请输入奖项！";
						JOptionPane.showMessageDialog(null, tem, "提示",
								JOptionPane.OK_OPTION);
						return;
					}

					if (numbers.isEmpty()) {
						String tem = "请输入奖项数量！";
						JOptionPane.showMessageDialog(null, tem, "提示",
								JOptionPane.OK_OPTION);
						return;
					}

					if (!isNum(numbers)) {
						String tem = "数量请输入数字！";
						JOptionPane.showMessageDialog(null, tem, "提示",
								JOptionPane.OK_OPTION);
						return;
					}

					if (ishaveawards(itemname)) {
						String tem = "您要添加的奖项：" + itemname + " 已经存在！";
						JOptionPane.showMessageDialog(null, tem, "提示",
								JOptionPane.OK_OPTION);

						return;
					}

					GiftSQL mgiftSQL = new GiftSQL();

					String sql = "insert into awards(ItemName,numbers) values('"
							+ itemname + "'," + numbers + ")";

					mgiftSQL.executeQuery(sql);

					mgiftSQL.close();

					String tem = "成功添加奖项：" + itemname + " ！";
					JOptionPane.showMessageDialog(null, tem, "提示",
							JOptionPane.OK_OPTION);

					initjComboBoxData();
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jButton2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("修改");
			jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {


					String itemname = getJTextField().getText();
					String numbers = getJTextField1().getText();
					itemname = itemname.trim();
					numbers = numbers.trim();

					if (itemname.isEmpty()) {
						String tem = "请输入奖项！";
						JOptionPane.showMessageDialog(null, tem, "提示",
								JOptionPane.OK_OPTION);
						return;
					}

					if (numbers.isEmpty()) {
						String tem = "请输入奖项数量！";
						JOptionPane.showMessageDialog(null, tem, "提示",
								JOptionPane.OK_OPTION);
						return;
					}

					if (!isNum(numbers)) {
						String tem = "数量请输入数字！";
						JOptionPane.showMessageDialog(null, tem, "提示",
								JOptionPane.OK_OPTION);
						return;
					}
					
					GiftSQL mgiftSQL = new GiftSQL();

					String sql = "update awards set ItemName='"+itemname+"',numbers="+numbers+" where ID="+nowawardsid;

					mgiftSQL.executeQuery(sql);

					mgiftSQL.close();

					String tem = "成功修改奖项：" + itemname + " ！";
					JOptionPane.showMessageDialog(null, tem, "提示",
							JOptionPane.OK_OPTION);

				
					initjComboBoxData();
				}
			});
			
		}
		return jButton2;
	}

	/**
	 * This method initializes jButton3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("删除");
			jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					
					String itemname = getJTextField().getText();
					itemname = itemname.trim();
					
					if(!ishaveawards(itemname)){
						String tem ="您要删除的记录："+itemname+" 已经不存在！";
						
						JOptionPane.showMessageDialog(null, tem, "提示",
								JOptionPane.OK_OPTION);
						return;
					}
					
						GiftSQL mgiftSQL = new GiftSQL();

						String sql = "DELETE from awards where ItemName='"+itemname+"'";
						
						mgiftSQL.executeQuery(sql);
						
						mgiftSQL.close();
						
						String tem = "成功删除记录："+itemname+" ！";
						
						JOptionPane.showMessageDialog(null, tem, "提示",
								JOptionPane.OK_OPTION);
					
						initjComboBoxData();
				}
			});
		}
		return jButton3;
	}

	/**
	 * This method initializes jPanel9
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel9() {
		if (jPanel9 == null) {
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints9.gridy = 1;
			gridBagConstraints9.weightx = 1.0;
			gridBagConstraints9.gridx = 1;
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.gridx = 0;
			gridBagConstraints8.gridy = 1;
			jLabel2 = new JLabel();
			jLabel2.setText("数量：");
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints7.gridy = 0;
			gridBagConstraints7.weightx = 1.0;
			gridBagConstraints7.gridx = 1;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.gridy = 0;
			jLabel1 = new JLabel();
			jLabel1.setText("名称：");
			jPanel9 = new JPanel();
			jPanel9.setLayout(new GridBagLayout());
			jPanel9.add(jLabel1, gridBagConstraints6);
			jPanel9.add(getJTextField(), gridBagConstraints7);
			jPanel9.add(jLabel2, gridBagConstraints8);
			jPanel9.add(getJTextField1(), gridBagConstraints9);
		}
		return jPanel9;
	}

	/**
	 * This method initializes jTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField(20);

		}
		return jTextField;
	}

	/**
	 * This method initializes jTextField1
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField(20);
		}
		return jTextField1;
	}

	private boolean ishaveawards(String itemname) {

		boolean rt = false;

		itemname = itemname.trim();

		GiftSQL mgiftSQL = new GiftSQL();

		String sql = null;

		sql = "select * from awards where ItemName='" + itemname + "'";

		ResultSet rs = mgiftSQL.executeQuery(sql);
		String tem = "";
		try {
			while (rs.next()) {
				tem = rs.getString("ItemName");

			}
		} catch (SQLException e1) {
			// TODO 自动生成 catch 块
			e1.printStackTrace();
		}

		if (tem.isEmpty()) {
			rt = false;
		} else {
			rt = true;
		}
		mgiftSQL.close();

		return rt;

	}

	/**
	 * 判断是否为数字
	 * @param msg
	 * @return
	 */
	private boolean isNum(String msg) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(msg);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	private void initjComboBoxData(){
		getJComboBox().removeAllItems();
		
		GiftSQL mgiftSQL = new GiftSQL();

		String sql = null;

		sql = "select * from awards";

		ResultSet rs = mgiftSQL.executeQuery(sql);

		try {
			while (rs.next()) {
				String tem = rs.getString("ItemName");
				getJComboBox().addItem(tem);
			}
		} catch (SQLException e1) {
			// TODO 自动生成 catch 块
			e1.printStackTrace();
		}

		mgiftSQL.close();
	}

	/**
	 * This method initializes jPanel71	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel71() {
		if (jPanel71 == null) {
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints10.gridx = 0;
			gridBagConstraints10.gridy = 0;
			jPanel71 = new JPanel();
			jPanel71.setLayout(new GridBagLayout());
			jPanel71.add(getJButton4(), gridBagConstraints10);
		}
		return jPanel71;
	}

	/**
	 * This method initializes jButton4	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("确定");
			jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					String str1 = getJTextField2().getText();
					String str2 = getJTextField3().getText();
					String str0 = getJTextField4().getText();
					String str3 = getJTextField5().getText();
					
					str1 = str1.trim();
					str2 = str2.trim();
					str0 = str0.trim();
					str3 = str3.trim();
					
					if(!isNum(str1) || !isNum(str2) || !isNum(str0) || !isNum(str3)){
						String tem = "请输入数字！";
						JOptionPane.showMessageDialog(null, tem, "提示",
								JOptionPane.OK_OPTION);
						return;
					}
					
					GiftSQL mgiftSQL = new GiftSQL();

					String sql = "update syscfg set valuestr='"+str1+"' where keystr='tfontsize'";

					mgiftSQL.executeQuery(sql);
					
					sql = "update syscfg set valuestr='"+str2+"' where keystr='nfontsize'";

					mgiftSQL.executeQuery(sql);
					
					sql = "update syscfg set valuestr='"+str0+"' where keystr='tfontsize0'";

					mgiftSQL.executeQuery(sql);
					
					sql = "update syscfg set valuestr='"+str3+"' where keystr='leftnum'";

					mgiftSQL.executeQuery(sql);

					mgiftSQL.close();

					String tem = "成功修改字体 ！";
					JOptionPane.showMessageDialog(null, tem, "提示",
							JOptionPane.OK_OPTION);
					
					
				}
			});
		}
		return jButton4;
	}

	/**
	 * This method initializes jPanel72	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel72() {
		if (jPanel72 == null) {
			GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
			gridBagConstraints18.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints18.gridy = 3;
			gridBagConstraints18.weightx = 1.0;
			gridBagConstraints18.gridx = 1;
			GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
			gridBagConstraints17.gridx = 0;
			gridBagConstraints17.gridy = 3;
			jLabel7 = new JLabel();
			jLabel7.setText("左边缩进字符：");
			GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
			gridBagConstraints16.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints16.gridy = 0;
			gridBagConstraints16.weightx = 1.0;
			gridBagConstraints16.gridx = 1;
			GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
			gridBagConstraints15.gridx = 0;
			gridBagConstraints15.gridy = 0;
			jLabel4 = new JLabel();
			jLabel4.setText("标题字体大小：");
			jLabel4.setToolTipText("如：抽取 三等奖 （共2名）：");
			GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
			gridBagConstraints14.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints14.gridy = 2;
			gridBagConstraints14.weightx = 1.0;
			gridBagConstraints14.gridx = 1;
			GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
			gridBagConstraints13.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints13.gridy = 1;
			gridBagConstraints13.weightx = 1.0;
			gridBagConstraints13.gridx = 1;
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			gridBagConstraints12.gridx = 0;
			gridBagConstraints12.gridy = 2;
			jLabel6 = new JLabel();
			jLabel6.setText("号码字体大小：");
			jLabel4.setToolTipText("如：200600705083 （显示在抽奖结果字体）");
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 0;
			gridBagConstraints11.gridy = 1;
			jLabel5 = new JLabel();
			jLabel5.setText("滚动字体大小：");
			jLabel5.setToolTipText("如：200600705083 (显示在滚动位置字体)");
			jPanel72 = new JPanel();
			jPanel72.setLayout(new GridBagLayout());
			jPanel72.add(jLabel5, gridBagConstraints11);
			jPanel72.add(jLabel6, gridBagConstraints12);
			jPanel72.add(getJTextField2(), gridBagConstraints13);
			jPanel72.add(getJTextField3(), gridBagConstraints14);
			jPanel72.add(jLabel4, gridBagConstraints15);
			jPanel72.add(getJTextField4(), gridBagConstraints16);
			jPanel72.add(jLabel7, gridBagConstraints17);
			jPanel72.add(getJTextField5(), gridBagConstraints18);
		}
		return jPanel72;
	}

	/**
	 * This method initializes jTextField2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField(5);
			
			GiftSQL mgiftSQL = new GiftSQL();

			String sql = null;

			sql = "select * from syscfg where keystr='tfontsize'";

			ResultSet rs = mgiftSQL.executeQuery(sql);
			String tem = "";
			try {
				while (rs.next()) {
					tem = rs.getString("valuestr");

				}
			} catch (SQLException e1) {
				// TODO 自动生成 catch 块
				e1.printStackTrace();
			}
			jTextField2.setText(tem);
			mgiftSQL.close();
		}
		return jTextField2;
	}

	/**
	 * This method initializes jTextField3	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField(5);
			
			GiftSQL mgiftSQL = new GiftSQL();

			String sql = null;

			sql = "select * from syscfg where keystr='nfontsize'";

			ResultSet rs = mgiftSQL.executeQuery(sql);
			String tem = "";
			try {
				while (rs.next()) {
					tem = rs.getString("valuestr");

				}
			} catch (SQLException e1) {
				// TODO 自动生成 catch 块
				e1.printStackTrace();
			}
			jTextField3.setText(tem);
			mgiftSQL.close();
		}
		return jTextField3;
	}

	/**
	 * This method initializes jTextField4	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField(5);
			
			GiftSQL mgiftSQL = new GiftSQL();

			String sql = null;

			sql = "select * from syscfg where keystr='tfontsize0'";

			ResultSet rs = mgiftSQL.executeQuery(sql);
			String tem = "";
			try {
				while (rs.next()) {
					tem = rs.getString("valuestr");

				}
			} catch (SQLException e1) {
				// TODO 自动生成 catch 块
				e1.printStackTrace();
			}
			jTextField4.setText(tem);
			mgiftSQL.close();
		}
		return jTextField4;
	}

	/**
	 * This method initializes jTextField5	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField(5);
			GiftSQL mgiftSQL = new GiftSQL();

			String sql = null;

			sql = "select * from syscfg where keystr='leftnum'";

			ResultSet rs = mgiftSQL.executeQuery(sql);
			String tem = "";
			try {
				while (rs.next()) {
					tem = rs.getString("valuestr");

				}
			} catch (SQLException e1) {
				// TODO 自动生成 catch 块
				e1.printStackTrace();
			}
			jTextField5.setText(tem);
			mgiftSQL.close();
		}
		return jTextField5;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
