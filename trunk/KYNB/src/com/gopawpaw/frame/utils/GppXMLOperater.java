/**
 * 
 */
package com.gopawpaw.frame.utils;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.JTextArea;

import org.jdom.Attribute;
import org.jdom.DocType;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

/**
 * @version 2010-4-13
 * @author 李锦华
 * 
 */
public class GppXMLOperater extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JLabel jLabel = null;
	private JComboBox jComboBox = null;
	private JLabel jLabel1 = null;
	private JTextField jTextField = null;
	private JButton jButton = null;
	private JScrollPane jScrollPane = null;
	private JPanel jPanel1 = null;
	private JLabel jLabel2 = null;
	private JTextField jTextField1 = null;
	private JButton jButton1 = null;
	private JPanel jPanel2 = null;
	private JButton jButton2 = null;
	private JPanel jPanel3 = null;
	private JTextArea jTextArea = null;
	private JPanel jPanel4 = null;

	private String xmlType = null;
	private String xmlFile = null;
	private String xmlFileName = null;
	private String outPath = null;

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("文件：");
			jLabel = new JLabel();
			jLabel.setText("类型：");
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
			jPanel.add(jLabel, null);
			jPanel.add(getJComboBox(), null);
			jPanel.add(jLabel1, null);
			jPanel.add(getJTextField(), null);
			jPanel.add(getJButton(), null);
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
			jComboBox.addItem("hibernate.cfg.xml");
			jComboBox.addItem("applicationContext.xml");
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
			jButton.setText("浏览");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JFileChooser jFileChooser = new JFileChooser();
					jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
					jFileChooser.showOpenDialog(null);
					File f = jFileChooser.getSelectedFile();
					if (f == null) {
						return;
					}
					String ph = f.getAbsolutePath();
					getJTextField().setText(ph);
				}
			});
		}
		return jButton;
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
			jLabel2 = new JLabel();
			jLabel2.setText("输出目录：");
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
			jPanel1.add(jLabel2, null);
			jPanel1.add(getJTextField1(), null);
			jPanel1.add(getJButton1(), null);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jTextField1
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	/**
	 * This method initializes jButton1
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("浏览");
			jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
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
					getJTextField1().setText(ph);
				}
			});
		}
		return jButton1;
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
			jPanel2.add(getJButton2(), gridBagConstraints);
		}
		return jPanel2;
	}

	/**
	 * This method initializes jButton2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("确定");
			jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					xmlType = (String) getJComboBox().getSelectedItem();
					xmlFile = getJTextField().getText();
					outPath = getJTextField1().getText();
					xmlFileName = getFileName(xmlFile);

					if (xmlType == null || xmlFile == null || outPath == null) {
						return;
					}
					// createXml(xmlFile);
					actionXML();
					// System.out.println(getFileNameStart(xmlFile));
				}
			});
		}
		return jButton2;
	}

	/**
	 * This method initializes jPanel3
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jPanel3 = new JPanel();
			jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));
			jPanel3.add(getJPanel1(), null);
			jPanel3.add(getJPanel2(), null);
		}
		return jPanel3;
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
	 * This method initializes jPanel4
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			jPanel4 = new JPanel();
			jPanel4.setLayout(new BorderLayout());
			jPanel4.add(getJScrollPane(), BorderLayout.CENTER);
		}
		return jPanel4;
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GppXMLOperater thisClass = new GppXMLOperater();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public GppXMLOperater() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(488, 247);
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
			jContentPane.add(getJPanel3(), BorderLayout.SOUTH);
			jContentPane.add(getJPanel4(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	private boolean actionXML() {

		SAXBuilder builder = new SAXBuilder();

		Document doc = null;
		try {
			doc = builder.build(new File(xmlFile));
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (xmlType.equals("hibernate.cfg.xml")) {

			System.out.println("h");
			actionHibernateCFG(doc);
		} else if (xmlType.equals("applicationContext.xml")) {
			System.out.println("a");
			actionAppContext(doc);

		}

		return false;
	}

	private void actionHibernateCFG(Document doc) {
		Element persons = doc.getRootElement();
		HashMap<String, HashMap<?, ?>> hm = new HashMap<String, HashMap<?, ?>>();

		Document document;
		Element root;
		
		DocType docType = new DocType("hibernate-configuration");//创建一个DTD对象   
		//所有者:quqtalk,DTD名字:quqtalk date,语言的种类:CN
		docType.setPublicID("-//Hibernate/Hibernate Configuration DTD 3.0//EN");   
		//DTD位置,可以是绝对路径也可以是相对路径   
		docType.setSystemID("hibernate-configuration-3.0.dtd");  
		
		
		root = new Element(persons.getName());
		document = new Document(root);
		document.setDocType(docType);
		Element sessionFactory = new Element("session-factory");
		root.addContent(sessionFactory);

		List<?> list = persons.getChildren("session-factory");
		for (Iterator<?> it = list.iterator(); it.hasNext();) {
			Element person = (Element) it.next();
			List<?> li = person.getChildren("property");
			for (Iterator<?> it2 = li.iterator(); it2.hasNext();) {
				Element perso = (Element) it2.next();
				System.out.println(perso.getText().trim());

				Element name = new Element(perso.getName());
				sessionFactory.addContent(name);
				name.setText(perso.getText().trim());
				name.setAttribute("name", perso.getAttributeValue("name"));
			}

			List<?> li2 = person.getChildren("mapping");
			for (Iterator<?> it2 = li2.iterator(); it2.hasNext();) {
				Element perso = (Element) it2.next();
				// Element name = new Element(perso.getName());
				// sessionFactory.addContent(name);

				String attr = perso.getAttributeValue("resource");

				// name.setAttribute("resource", attr);

				String fnstrat = getFileNameStart(attr);
				if (hm.get(fnstrat) == null) {
					hm.put(fnstrat, new HashMap());
					((HashMap) hm.get(fnstrat)).put(attr, "");
				} else {
					((HashMap) hm.get(fnstrat)).put(attr, "");
				}
			}

			// 分开生成XML
			int mapcoun = 0;

			Set kset = hm.keySet();
			Iterator itkey = kset.iterator();
			while (itkey.hasNext()) {
				String keystr = (String) itkey.next();
				HashMap temHM = hm.get(keystr);

				Iterator temit = temHM.keySet().iterator();
				// 清楚mapping
				for (int i = 0; i < mapcoun; mapcoun--) {
					sessionFactory.removeChild("mapping");
				}

				while (temit.hasNext()) {
					Element name = new Element("mapping");
					sessionFactory.addContent(name);
					String tempss = (String) temit.next();
					name.setAttribute("resource", tempss);
					mapcoun++;
				}
				createXml(document, outPath + "\\" + keystr + "." + xmlFileName);
			}

		}

		// createXml(document,xmlFile+".q.xml");
	}

	private void actionAppContext(Document doc) {
		Element beans = doc.getRootElement();
		List<?> beanlist = beans.getChildren();
		HashMap<String, HashMap<?, ?>> hm = new HashMap<String, HashMap<?, ?>>();

		Namespace nsw = beans.getNamespace();

		System.out.println("GppXMLOperater.actionAppContext()"
				+ beanlist.size());
		for (Iterator<?> it = beanlist.iterator(); it.hasNext();) {
			Element bean = (Element) it.next();
			String strid = bean.getAttributeValue("id");
			String strclass = bean.getAttributeValue("class");

			if (strid.equals("sessionFactory")) {
				continue;
			}
			System.out.println(strid);
			String fnstrat = getStringStart(strid);
			if (hm.get(fnstrat) == null) {
				hm.put(fnstrat, new HashMap());
				((HashMap) hm.get(fnstrat)).put(strid, "");
			} else {
				((HashMap) hm.get(fnstrat)).put(strid, "");
			}
		}

		// 分开生成XML
		Iterator hmit = hm.keySet().iterator();
		while (hmit.hasNext()) {
			String keystr = (String) hmit.next();
			System.out.println("keystr:"+keystr);
			Document document;
			Element root;
			root = new Element("beans");
			// root.setAttribute("xmlns",
			// "http://www.springframework.org/schema/beans");
			// root.setAttribute("xmlns:xsi",
			// "http://www.w3.org/2001/XMLSchema-instance");
			// root.setAttribute("xmlns:p",
			// "http://www.springframework.org/schema/p");
			// root.setAttribute("xsi:schemaLocation",
			// "http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd");
			root.setNamespace(nsw);
			Namespace ns = Namespace.getNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			root.addNamespaceDeclaration(ns);
			root.addNamespaceDeclaration(Namespace.getNamespace("p",
					"http://www.springframework.org/schema/p"));
			// root.addNamespaceDeclaration(Namespace.getNamespace("xsi:schemaLocation","http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd"));
			root
					.setAttribute(new Attribute(
							"schemaLocation",
							"http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd",
							ns));

			document = new Document(root);
			Element beanse = new Element("bean");
			beanse.setAttribute("id", "sessionFactory");
			beanse
					.setAttribute("class",
							"org.springframework.orm.hibernate3.LocalSessionFactoryBean");
			root.addContent(beanse);
			Element beanseproperty = new Element("property");
			beanseproperty.setAttribute("name", "configLocation");
			beanseproperty.setAttribute("value", "file:src/com/gopawpaw/erp/hibernate/cfg/"+keystr+".hibernate.cfg.xml");
			beanseproperty.setNamespace(nsw);
			beanse.addContent(beanseproperty);
			
			beanse.setNamespace(nsw);
			HashMap temHM = hm.get(keystr);
			Iterator temit = temHM.keySet().iterator();
			
			while(temit.hasNext()){
				String tempstr = (String) temit.next();
				System.out.println("tempstr:"+tempstr);
				Element beansew = new Element("bean");
				beansew.setAttribute("id", tempstr);
				beansew
						.setAttribute("class",
								"com.gopawpaw.erp.hibernate."+keystr+"."+tempstr);
				root.addContent(beansew);
				Element beansepropertyw = new Element("property");
				beansepropertyw.setAttribute("name", "sessionFactory");
				beansepropertyw.setNamespace(nsw);
				beansew.addContent(beansepropertyw);
				
				Element beansref = new Element("ref");
				beansref.setAttribute("bean", "sessionFactory");
				beansref.setNamespace(nsw);
				beansepropertyw.addContent(beansref);
				
				beansew.setNamespace(nsw);
			}
			
			createXml(document, outPath + "\\"+keystr+"." + xmlFileName);

		}

	}

	/**
	 * 从绝对路径中获取文件名
	 */
	private String getFileName(String filenamepath) {
		File f = new File(filenamepath);
		return f.getName();
	}

	/**
	 * 获取文件第一个字母
	 */
	private String getFileNameStart(String filename) {
		// String[] str = filename.split(File);
		File f = new File(filename);
		String str = f.getName();

		char[] ch = str.toCharArray();
		return String.valueOf(ch[0]).toLowerCase();

	}

	/**
	 * 获取字符串第一个字母
	 */
	private String getStringStart(String str) {
		char[] ch = str.toCharArray();
		return String.valueOf(ch[0]).toLowerCase();

	}

	public void createXml(Document document, String fileName) {
		// Document document;
		// Element root;
		// root = new Element("employees");
		// document = new Document(root);
		// Element employee = new Element("employee");
		// root.addContent(employee);
		// Element name = new Element("name");
		// name.setText("ddvip");
		// employee.addContent(name);
		// Element sex = new Element("sex");
		// sex.setText("m");
		// employee.addContent(sex);
		// Element age = new Element("age");
		// age.setText("23");
		// employee.addContent(age);
		XMLOutputter XMLOut = new XMLOutputter();
		try {
			XMLOut.output(document, new FileOutputStream(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

} // @jve:decl-index=0:visual-constraint="10,10"
