package app;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataEdit extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel jPanel = null;

	private JLabel jLabel = null;

	private JTextField jTextField = null;

	private JButton jButton = null;

	private JButton jButton1 = null;

	private JButton jButton2 = null;

	private JButton jButton3 = null;

	private JLabel jLabel1 = null;

	private JButton jButton4 = null;

	private JTextArea jTextArea = null;

	private JScrollPane jScrollPane = null;

	private JPanel jPanel1 = null;

	/**
	 * This is the default constructor
	 */
	public DataEdit() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(480, 213);
		this.setContentPane(getJContentPane());
		this.setTitle("数据管理");
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
			jContentPane.add(getJScrollPane(), BorderLayout.CENTER);
			jContentPane.add(getJPanel1(), BorderLayout.SOUTH);
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
			jLabel = new JLabel();
			jLabel.setText("用户名：");
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
			jPanel.add(jLabel, null);
			jPanel.add(getJTextField(), null);
			jPanel.add(getJButton(), null);
			jPanel.add(getJButton1(), null);
			jPanel.add(getJButton2(), null);
		}
		return jPanel;
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
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("查询");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					
					String uname = getJTextField().getText();
					getJTextArea().setText("");
					if(!ifhaveuser(uname)){
						getJTextArea().append("你查询的记录："+uname+" 不存在！");
					}else{
						getJTextArea().append("你查询的记录："+uname+" 已经存在！");
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
			jButton1.setText("增加");
			jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					String uname = getJTextField().getText();
					getJTextArea().setText("");
					uname = uname.trim();
					if(uname.isEmpty()){
						getJTextArea().append("请输入记录！");
						return;
					}
					
					if(ifhaveuser(uname)){
						getJTextArea().append("你插入的记录："+uname+" 已经存在！");
					}else{
						GiftSQL mgiftSQL = new GiftSQL();

						String sql = "insert into memberdata(uname) values('"+uname+"')";
						
						mgiftSQL.executeQuery(sql);
						
						mgiftSQL.close();
						
						getJTextArea().append("成功增加记录："+uname+" ！");
					}
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
			jButton2.setText("删除");
			jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					String uname = getJTextField().getText();
					getJTextArea().setText("");
					if(!ifhaveuser(uname)){
						getJTextArea().append("您要删除的记录："+uname+" 已经不存在！");
					}else{
						GiftSQL mgiftSQL = new GiftSQL();

						String sql = "DELETE from memberdata where uname='"+uname+"'";
						
						mgiftSQL.executeQuery(sql);
						
						mgiftSQL.close();
						
						getJTextArea().append("成功删除记录："+uname+" ！");
					}
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
			jButton3.setText("显示所有");
			jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					
					getJTextArea().setText("");
					GiftSQL mgiftSQL = new GiftSQL();

					String sql = "select * from memberdata ";
					
					ResultSet rs = mgiftSQL.executeQuery(sql);
					int nn = 0;
						try {
							while (rs.next()) {
								getJTextArea().append(rs.getString("uname")+"\r\n");
								nn++;
							}
						} catch (SQLException e1) {
							// TODO 自动生成 catch 块
							e1.printStackTrace();
						}
						getJLabel1().setText("   共 "+nn+" 条记录   ");
					mgiftSQL.close();
				}
			});
		}
		return jButton3;
	}

	/**
	 * This method initializes jLabel1	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("   共   条记录   ");
		}
		return jLabel1;
	}

	/**
	 * This method initializes jButton4	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("导入");
			jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					int nok = 0;
					int nno = 0;
					GiftSQL mgiftSQL = new GiftSQL();
					 String[]   lines;
					 lines=getJTextArea().getText().split("\n");   
					  for(int   i=0;i<lines.length;i++)
					  {
						  String uname = lines[i];
						  
						  uname = uname.trim();
						  if(uname == null || uname.isEmpty() || ifhaveuser(uname)){
							  nno++;
						  }else{
								
								String sql = "insert into memberdata(uname) values('"+uname+"')";
								
								mgiftSQL.executeQuery(sql);
								nok++;
						  }
								
					  }
					  mgiftSQL.close();
					  String tem = "成功导入："+nok+"条记录，导入失败："+nno+"条记录！";
					  JOptionPane.showMessageDialog(null, tem,
								"提示", JOptionPane.ERROR_MESSAGE);
				}
			});
		}
		return jButton4;
	}

	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
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
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 2;
			gridBagConstraints2.gridy = 0;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 4;
			gridBagConstraints1.gridy = 0;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 3;
			gridBagConstraints.gridy = 0;
			jPanel1 = new JPanel();
			jPanel1.setLayout(new GridBagLayout());
			jPanel1.add(getJButton3(), gridBagConstraints);
			jPanel1.add(getJLabel1(), gridBagConstraints1);
			jPanel1.add(getJButton4(), gridBagConstraints2);
		}
		return jPanel1;
	}
	
	private boolean ifhaveuser(String uname){
		
		boolean rt = false;
		GiftSQL mgiftSQL = new GiftSQL();

		String sql = "select * from memberdata where uname='"+uname+"'";
		
		ResultSet rs = mgiftSQL.executeQuery(sql);
		
		String uid = "";
		
			try {
				while (rs.next()) {
					uid = rs.getString("ID");
				}
			} catch (SQLException e1) {
				// TODO 自动生成 catch 块
				e1.printStackTrace();
			}
			
		if(uid.isEmpty()){
			rt = false;
		}else{
			rt = true;
		}
		mgiftSQL.close();
		
		return rt;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
