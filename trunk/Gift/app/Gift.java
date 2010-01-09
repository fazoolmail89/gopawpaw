package app;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Gift extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JToolBar jJToolBarBar = null;

	private JButton jButton = null;

	private JButton jButton1 = null;

	private JToolBar jJToolBarBar1 = null;

	private JPanel jPanel = null;

	private JButton jButton2 = null;

	private JButton jButton3 = null;

	private JToolBar jJToolBarBar2 = null;

	private JPanel jPanel1 = null;

	private JLabel jLabel = null;

	private JLabel jLabel1 = null;

	private JLabel jLabel2 = null;

	private JTextArea jTextArea = null;

	private JScrollPane jScrollPane = null;

	private JPanel jPanel2 = null;

	private JLabel jLabel3 = null;

	private JComboBox jComboBox = null;

	private JLabel jLabel4 = null;

	private GiftSQL giftSQL = null; // @jve:decl-index=0:

	// 是否允许重复获奖
	private boolean ifRepeatGetAwards = false;

	// 用户数组
	private Vector memberdata = new Vector(); // @jve:decl-index=0:

	Thread threadGift = null;

	// 抽取奖项个数
	private int giftnumbers = 0;

	// 奖项ID
	private int giftid = 0;

	// 是否启动抽奖
	private boolean ifgetgift = false;

	// 是否一次抽取完
	private boolean ifgetallgift = true;

	private int nowgiftn = 0;

	private JButton jButton4 = null;

	// 左边缩进字符
	private String leftstr = ""; // @jve:decl-index=0:

	/**
	 * This method initializes jJToolBarBar
	 * 
	 * @return javax.swing.JToolBar
	 */
	private JToolBar getJJToolBarBar() {
		if (jJToolBarBar == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("   选择奖项：");
			jJToolBarBar = new JToolBar();
			jJToolBarBar.add(getJButton());
			jJToolBarBar.add(getJButton1());
			jJToolBarBar.add(getJButton4());
			jJToolBarBar.add(jLabel4);
			jJToolBarBar.add(getJComboBox());
		}
		return jJToolBarBar;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("设置参数");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					Parameter pa = new Parameter();
					pa.setVisible(true);
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
			jButton1.setText("数据管理");
			jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					DataEdit de = new DataEdit();
					de.setVisible(true);
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jJToolBarBar1
	 * 
	 * @return javax.swing.JToolBar
	 */
	private JToolBar getJJToolBarBar1() {
		if (jJToolBarBar1 == null) {
			jJToolBarBar1 = new JToolBar();
			jJToolBarBar1.add(getJPanel());
		}
		return jJToolBarBar1;
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new GridBagLayout());
			jPanel.add(getJButton2(), new GridBagConstraints());
			jPanel.add(getJButton3(), new GridBagConstraints());
		}
		return jPanel;
	}

	/**
	 * This method initializes jButton2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("开始");
			jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					initdata();

					GiftSQL mgiftSQL = new GiftSQL();

					String sql = null;

					if (ifRepeatGetAwards) {
						sql = "select * from memberdata";
					} else {
						sql = "select * from memberdata where awid<=0";
					}

					ResultSet rs = mgiftSQL.executeQuery(sql);
					memberdata.removeAllElements();
					try {
						while (rs.next()) {

							memberdata.add(rs.getString("uname"));
						}
					} catch (SQLException e1) {
						// TODO 自动生成 catch 块
						e1.printStackTrace();
					}

					// 获取每个奖项数目
					String str = (String) getJComboBox().getSelectedItem();
					int numbers = 0;
					int awid = 0;
					sql = "select * from awards where ItemName='" + str + "'";
					rs = mgiftSQL.executeQuery(sql);

					try {
						while (rs.next()) {

							numbers = Integer.parseInt(rs.getString("numbers"));
							awid = Integer.parseInt(rs.getString("id"));
						}
					} catch (SQLException e1) {
						// TODO 自动生成 catch 块
						e1.printStackTrace();
					}

					mgiftSQL.close();

					if (ifgetallgift) {// 一次抽奖完
						getJTextArea().setText("");
					} else {
						if (nowgiftn >= numbers) {
							getJTextArea().setText("");
							nowgiftn = 0;
						}
						nowgiftn++;
					}
					giftnumbers = numbers;
					giftid = awid;
					// getselcetmember(numbers, awid);
					reStart();
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
			jButton3.setText("抽取");
			jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					ifgetgift = true;
				}
			});
		}
		return jButton3;
	}

	/**
	 * This method initializes jJToolBarBar2
	 * 
	 * @return javax.swing.JToolBar
	 */
	private JToolBar getJJToolBarBar2() {
		if (jJToolBarBar2 == null) {
			jJToolBarBar2 = new JToolBar();
			jJToolBarBar2.add(getJPanel1());
		}
		return jJToolBarBar2;
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
			jPanel1.add(getJScrollPane(), BorderLayout.CENTER);
			jPanel1.add(getJPanel2(), BorderLayout.NORTH);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jLabel2
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("抽三等奖:   ");
			jLabel2.setBackground(Color.BLUE);
			Font f = new Font("TimesRoman", Font.BOLD, 34);
			jLabel2.setFont(f);

		}
		return jLabel2;
	}

	/**
	 * This method initializes jTextArea
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();

			jTextArea.setForeground(Color.RED);
			jTextArea.setBackground(Color.CYAN);

			Font f = new Font("TimesRoman", Font.BOLD, 72);
			jTextArea.setFont(f);

		}
		return jTextArea;
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
	 * This method initializes jPanel2
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 1;
			gridBagConstraints1.gridy = 0;
			jPanel2 = new JPanel();
			jPanel2.setLayout(new GridBagLayout());
			jPanel2.add(getJLabel2(), new GridBagConstraints());
			jPanel2.add(getJLabel3(), gridBagConstraints1);
		}
		return jPanel2;
	}

	/**
	 * This method initializes jLabel3
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("============");

			Font f = new Font("TimesRoman", Font.BOLD, 34);
			jLabel3.setFont(f);
			jLabel2.setForeground(Color.BLUE);
			jLabel3.setBackground(Color.CYAN);
		}
		return jLabel3;
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

					String str = (String) getJComboBox().getSelectedItem();

					giftSQL = new GiftSQL();
					String sql = "select * from awards where ItemName='" + str
							+ "'";
					ResultSet rs = giftSQL.executeQuery(sql);

					String snum = null;
					try {
						while (rs.next()) {
							snum = rs.getString("numbers");
						}
					} catch (SQLException e1) {
						// TODO 自动生成 catch 块
						e1.printStackTrace();
					}

					giftSQL.close();

					getJLabel2().setText("抽取 " + str + " （共 " + snum + "名）：  ");
				}
			});

			giftSQL = new GiftSQL();
			String sql = "select * from awards";
			ResultSet rs = giftSQL.executeQuery(sql);

			try {
				while (rs.next()) {
					jComboBox.addItem(rs.getString("ItemName"));
				}
			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}

			try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
			giftSQL.close();

		}

		return jComboBox;
	}

	/**
	 * This method initializes jButton4
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("初始化抽奖");
			jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					GiftSQL mgiftSQL = new GiftSQL();

					String sql = "update memberdata set awid=0";

					mgiftSQL.executeQuery(sql);

					mgiftSQL.close();

					String tem = "成功初始化！";
					JOptionPane.showMessageDialog(null, tem, "提示",
							JOptionPane.OK_OPTION);
				}
			});
		}
		return jButton4;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成方法存根
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Gift thisClass = new Gift();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public Gift() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(744, 340);
		this.setContentPane(getJContentPane());
		this.setTitle("随机抽奖程序 V0.5 Beta —— Copyright 信管062");
		

		initdata();
		// ///////////////////
		GiftSQL mgiftSQL = new GiftSQL();
		String sql = "select * from syscfg where keystr='leftnum'";

		ResultSet rs = mgiftSQL.executeQuery(sql);

		String tem5 = null;

		try {
			while (rs.next()) {

				tem5 = rs.getString("valuestr");
				int ii = Integer.parseInt(tem5);

				for (int k = 0; k < ii; k++) {
					leftstr = leftstr + " ";
				}
			}
		} catch (SQLException e1) {
			// TODO 自动生成 catch 块
			e1.printStackTrace();
		}

	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("");
			jLabel = new JLabel();
			jLabel.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJJToolBarBar(), BorderLayout.NORTH);
			jContentPane.add(getJJToolBarBar1(), BorderLayout.SOUTH);
			jContentPane.add(getJJToolBarBar2(), BorderLayout.CENTER);
			jContentPane.add(jLabel, BorderLayout.EAST);
			jContentPane.add(jLabel1, BorderLayout.WEST);
		}
		return jContentPane;
	}

	/**
	 * 
	 * @param numbers
	 *            抽取奖项个数
	 * @param awid
	 *            奖项ID号
	 */
	private void getselcetmember(int numbers, int awid) {

		// 用户总数
		int usernumber = memberdata.size();

		System.out.println(usernumber);
		// System.out.println(memberdata.get(0));
		// System.out.println(awid);
		// System.out.println(numbers);
		// java.util.Random r=new java.util.Random(10);
		//		
		//		
		// for(int i=0;i<10;i++){
		// int intRd = Math.abs(r.nextInt())%32+1;
		// System.out.println(intRd);
		// }

		int[] intRet = new int[numbers];
		int intRd = 0; // 存放随机数
		int count = 0; // 记录生成的随机数个数
		int flag = 0; // 是否已经生成过标志
		while (count < numbers) {
			Random rdm = new Random(System.currentTimeMillis());
			intRd = Math.abs(rdm.nextInt()) % usernumber;
			for (int i = 0; i < count; i++) {
				if (intRet[i] == intRd) {
					flag = 1;
					break;
				} else {
					flag = 0;
				}
			}
			if (flag == 0) {
				intRet[count] = intRd;
				count++;
			}
		}
		for (int t = 0; t < numbers; t++) {
			System.out.println(t + "->" + intRet[t] + "=="
					+ memberdata.get(intRet[t]));
		}
	}

	public void run() {

		// 用户总数
		int usernumber = memberdata.size();

		if (ifgetallgift) {// 一次抽奖完

			// 开始抽奖
			if (!ifgetgift) {
				while (true) {
					if (ifgetgift)
						break;
					Random rdms = new Random(System.currentTimeMillis());
					int indexuser = Math.abs(rdms.nextInt()) % usernumber;

					getJLabel3().setText((String) memberdata.get(indexuser));
				}
			}
			// 抽取奖项

			int[] intRet = new int[giftnumbers];
			int intRd = 0; // 存放随机数
			int count = 0; // 记录生成的随机数个数
			int flag = 0; // 是否已经生成过标志
			while (count < giftnumbers) {
				Random rdm = new Random(System.currentTimeMillis());
				intRd = Math.abs(rdm.nextInt()) % usernumber;
				for (int i = 0; i < count; i++) {
					if (intRet[i] == intRd) {
						flag = 1;
						break;
					} else {
						flag = 0;
					}
				}
				if (flag == 0) {
					intRet[count] = intRd;
					count++;
				}
			}

			for (int t = 0; t < giftnumbers; t++) {

				// System.out.println(t + "->" + intRet[t] + "=="
				// + memberdata.get(intRet[t]));

				getJTextArea()
						.append(
								(leftstr + (String) memberdata.get(intRet[t]))
										+ "\r\n");

				GiftSQL mgiftSQL = new GiftSQL();

				String sql = "update memberdata set awid=" + this.giftid
						+ " where uname='"
						+ ((String) memberdata.get(intRet[t])) + "'";

				mgiftSQL.executeQuery(sql);

				mgiftSQL.close();

			}

		} else {// 单个抽奖
			// 开始抽奖
			int indexuser = 0;
			if (!ifgetgift) {
				while (true) {
					if (ifgetgift)
						break;
					Random rdms = new Random(System.currentTimeMillis());
					indexuser = Math.abs(rdms.nextInt()) % usernumber;

					getJLabel3().setText((String) memberdata.get(indexuser));

				}
			}
			getJTextArea().append(
					leftstr + (String) memberdata.get(indexuser) + "\r\n");

			GiftSQL mgiftSQL = new GiftSQL();

			String sql = "update memberdata set awid=" + this.giftid
					+ " where uname='" + ((String) memberdata.get(indexuser))
					+ "'";

			mgiftSQL.executeQuery(sql);

			mgiftSQL.close();

		}

		getJLabel3().setText("============");

	}

	private void reStart() {
		ifgetgift = false;
		threadGift = new Thread(this);
		threadGift.start();
	}

	/**
	 * 初始化系统参数
	 * 
	 */
	private void initdata() {
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
		if (tem.endsWith("Y")) {// 一个一个抽奖
			ifgetallgift = false;
		} else {// 一次性抽完
			ifgetallgift = true;
		}
		// ///////////////////////////
		sql = "select * from syscfg where keystr='tfontsize'";

		rs = mgiftSQL.executeQuery(sql);

		String tem2 = null;

		try {
			while (rs.next()) {

				tem2 = rs.getString("valuestr");

				Font f = new Font("TimesRoman", Font.BOLD, Integer
						.parseInt(tem2));
				getJLabel3().setFont(f);
			}
		} catch (SQLException e1) {
			// TODO 自动生成 catch 块
			e1.printStackTrace();
		}
		// ///////////////////
		sql = "select * from syscfg where keystr='nfontsize'";

		rs = mgiftSQL.executeQuery(sql);

		String tem3 = null;

		try {
			while (rs.next()) {

				tem3 = rs.getString("valuestr");

				Font f = new Font("TimesRoman", Font.BOLD, Integer
						.parseInt(tem3));
				getJTextArea().setFont(f);
			}
		} catch (SQLException e1) {
			// TODO 自动生成 catch 块
			e1.printStackTrace();
		}

		// ///////////////////
		sql = "select * from syscfg where keystr='tfontsize0'";

		rs = mgiftSQL.executeQuery(sql);

		String tem4 = null;

		try {
			while (rs.next()) {

				tem4 = rs.getString("valuestr");
				Font f = new Font("TimesRoman", Font.BOLD, Integer
						.parseInt(tem4));
				getJLabel2().setFont(f);
			}
		} catch (SQLException e1) {
			// TODO 自动生成 catch 块
			e1.printStackTrace();
		}

		mgiftSQL.close();
	}
} // @jve:decl-index=0:visual-constraint="131,12"
