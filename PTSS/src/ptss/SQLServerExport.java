/**
 * 
 */
package ptss;

import javax.swing.BoxLayout;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JComboBox;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;


/**
 * @version 2010-6-12
 * @author 李锦华
 *
 */
public class SQLServerExport extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JLabel jLabel = null;
	private JComboBox jComboBox = null;
	private JLabel jLabel1 = null;
	private JComboBox jComboBox1 = null;
	
	private Vector<DatabaseInfo> veDBInfo = new Vector<DatabaseInfo>();  //  @jve:decl-index=0:

	private String nowTable = null;
	private DatabaseInfo nowDatabase = null;
	private JScrollPane jScrollPane = null;
	private JPanel jPanel1 = null;
	private JLabel jLabel2 = null;
	private JTextField jTextField = null;
	private JButton jButton = null;
	
	private Vector venowTableClun = new Vector();  //  @jve:decl-index=0:
	/**
	 * @throws HeadlessException
	 */
	public SQLServerExport() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public SQLServerExport(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public SQLServerExport(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public SQLServerExport(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("数据表：");
			jLabel = new JLabel();
			jLabel.setText("数据库：");
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));

			jPanel.add(jLabel, null);
			jPanel.add(getJComboBox(), null);
			jPanel.add(jLabel1, null);
			jPanel.add(getJComboBox1(), null);
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
			jComboBox.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					nowDatabase = (DatabaseInfo) jComboBox.getSelectedItem();
				
					String sqlstr = "Select  name from    SysObjects where type='U' order by name";
					
					GppSQLServer gppsql = new GppSQLServer(nowDatabase);
					getJComboBox1().removeAllItems();
					ResultSet rst = gppsql.query(sqlstr);
					try {
						while (rst != null && rst.next()) {
							
							String tem = rst.getString("name");
							getJComboBox1().addItem(tem);
							
						}
					} catch (SQLException ee) {
						ee.printStackTrace();
					}
					gppsql.close();
				
				}
			});
			
			Iterator<DatabaseInfo> it = veDBInfo.iterator();
			while(it.hasNext()){
				DatabaseInfo dbinfo = (DatabaseInfo) it.next();
				
				jComboBox.addItem(dbinfo);
			}
			
		}
		return jComboBox;
	}

	/**
	 * This method initializes jComboBox1	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox1() {
		if (jComboBox1 == null) {
			jComboBox1 = new JComboBox();
			jComboBox1.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					
					if(jComboBox1 == null){
						return;
					}
					
					nowTable = (String) jComboBox1.getSelectedItem();
					String sqlstr = "Select   SysColumns.name as cname   From   SysObjects   Left    Join SysColumns     On   SysColumns.ID=SysObjects.ID where SysObjects.name='"+nowTable+"' order by SysColumns.colid";
					System.out.println(sqlstr);
					
					GppSQLServer gppsql = new GppSQLServer(nowDatabase);
//					getJComboBox1().removeAllItems();
					ResultSet rst = gppsql.query(sqlstr);
					try {
						while (rst != null && rst.next()) {
							
							String tem = rst.getString("cname");
							venowTableClun.add(tem);
							System.out.println(tem);
						}
					} catch (SQLException ee) {
						ee.printStackTrace();
					}
					gppsql.close();
					
					saveFile();
				}
			});
		}
		return jComboBox1;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
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
			jLabel2 = new JLabel();
			jLabel2.setText("导出文件：");
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
			jPanel1.add(jLabel2, null);
			jPanel1.add(getJTextField(), null);
			jPanel1.add(getJButton(), null);
		}
		return jPanel1;
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
			jButton.setText("导出");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return jButton;
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SQLServerExport thisClass = new SQLServerExport();
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
		iniSQLServerConf();
		this.setSize(582, 213);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
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
	 * 初始化数据库配置
	 */
	private void iniSQLServerConf(){

		String filename = System.getProperties().getProperty("user.dir")+File.separator+"config.xml";

		SAXBuilder builder = new SAXBuilder();

		Document doc = null;
		try {
			doc = builder.build(new File(filename));
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Element persons = doc.getRootElement();
		
		
		//读取数据库参数
		List<?> list2 = persons.getChildren("database-config");
		for (Iterator<?> it = list2.iterator(); it.hasNext();) {
			
			DatabaseInfo dbinfo = new DatabaseInfo();
			
			
			Element person = (Element) it.next();
			List<?> li = person.getChildren("property");
			for (Iterator<?> it2 = li.iterator(); it2.hasNext();) {
				Element perso = (Element) it2.next();
				
				if(perso.getAttributeValue("name").equals("connection.url")){
					dbinfo.setConnectName(perso.getText().trim());
				}else if(perso.getAttributeValue("name").equals("connection.driver_class")){
					dbinfo.setDriveName(perso.getText().trim());
				}else if(perso.getAttributeValue("name").equals("connection.username")){
					dbinfo.setUser(perso.getText().trim());
				}else if(perso.getAttributeValue("name").equals("connection.password")){
					dbinfo.setPassword(perso.getText().trim());
				}else if(perso.getAttributeValue("name").equals("dataBaseName")){
					dbinfo.setDatabaseName(perso.getText().trim());
				}
			}
			
			veDBInfo.add(dbinfo);
		}
		
	}
	
	private void saveFile(){

		boolean retb = false;

		String logfs = "D:\\d.soure.log";
	

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(logfs));
			String sqlstr = "Select  * from   "+nowTable;
			
			GppSQLServer gppsql = new GppSQLServer(nowDatabase);
			getJComboBox1().removeAllItems();
			ResultSet rst = gppsql.query(sqlstr);
			try {
				while (rst != null && rst.next()) {
					String insertsql = "insert into "+this.nowTable;
					String clunname = null;
					String valuess = null;
					
					Iterator it = venowTableClun.iterator();
					
					while(it.hasNext()){
						String tempc = (String) it.next();
						if(clunname == null){
							clunname =  "("+tempc;
						}else{
							clunname = clunname + ","+ tempc;
						}
						
						String tem = (String) rst.getObject(tempc).toString();
						tem = "'"+tem+"'";
						if(valuess == null){
							valuess = "("+tem;
						}else{
							valuess = valuess+","+tem;
						}
						

					}
					
					clunname = clunname + ")";
					valuess = valuess+")";
					
					
					pw.println(insertsql+clunname+valuess);
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			gppsql.close();
			

			pw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
