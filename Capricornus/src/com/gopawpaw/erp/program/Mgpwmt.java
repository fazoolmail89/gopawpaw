/**
 * 
 */
package com.gopawpaw.erp.program;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionListener;

import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.erp.Authorization;
import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.GppMainFrame;
import com.gopawpaw.erp.common.BaseFrame;
import com.gopawpaw.erp.common.DataSelectObject;
import com.gopawpaw.erp.common.dev.DateSelect;
import com.gopawpaw.erp.common.dev.Mnt_nbr;
import com.gopawpaw.erp.dataEntity.Dmnd_det;
import com.gopawpaw.erp.dataEntity.Omnd_det;
import com.gopawpaw.erp.hibernate.p.PlMstr;
import com.gopawpaw.erp.hibernate.p.PlMstrDAO;
import com.gopawpaw.erp.hibernate.t.TrHist;
import com.gopawpaw.erp.hibernate.t.TrHistDAO;
import com.gopawpaw.javax.swing.GppJButton;
import com.gopawpaw.javax.swing.GppJLabel;
import com.gopawpaw.javax.swing.GppJPanel;
import com.gopawpaw.javax.swing.GppJScrollPane;
import com.gopawpaw.javax.swing.GppJSplitPane;
import com.gopawpaw.javax.swing.GppJTextField;
import com.gopawpaw.javax.swing.GppJTree;
import java.awt.BorderLayout;
import java.awt.Canvas;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import com.swtdesigner.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
/**
 * @version 2010-7-24
 * @author 李锦华
 * @36.3.10 菜单安全维护
 */
public class Mgpwmt extends BaseFrame implements GppJarRunableInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5260006917881077379L;
	private GppJPanel gppJPanel1;
	private GppJTree gppJTree1;
	private GppJScrollPane gppJScrollPane2;
	private GppJScrollPane gppJScrollPane1;
	private GppJSplitPane gppJSplitPane1;
	private GppJLabel gppJLabel1;
	private GppJPanel panel;
	private GppJTextField textField_1;
	private GppJButton gppJButton1;
	private GppJTextField textField_2;
	private GppJTextField textField_3;

	/**
	 * @throws HeadlessException
	 */
	public Mgpwmt() throws HeadlessException {
		initialize();
	}

	/**
	 * @param args
	 * @throws HeadlessException
	 */
	public Mgpwmt(String[] args) throws HeadlessException {
		super(args);
		initialize();

	}

	/**
	 * @param gc
	 */
	public Mgpwmt(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public Mgpwmt(String title) throws HeadlessException {
		super(title);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public Mgpwmt(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
	}

	private void initialize() {
		{
			this.setSize(738, 256);
		}
		{
			gppJPanel1 = new GppJPanel();
			getContentPane().add(gppJPanel1, BorderLayout.CENTER);
//			gppJPanel1
//					.setAuthorizationSerial("DED2D38FDC8552E909C2A1786028B9C1");
			gppJPanel1.setName("gppJPanel1");
			gppJPanel1.setLayout(new BorderLayout());
			{
				gppJSplitPane1 = new GppJSplitPane();
				gppJSplitPane1
						.setAuthorizationSerial("92A12F0DD36079626A3D8D0322310A72");
				gppJSplitPane1.setDividerSize(8);
				gppJSplitPane1.setDividerLocation(250);
				gppJSplitPane1.setResizeWeight(0.4);

				gppJPanel1.add(gppJSplitPane1, BorderLayout.CENTER);
				{
					gppJScrollPane1 = new GppJScrollPane();

					gppJScrollPane1
							.setAuthorizationSerial("327087AD4E49674A3C1CF64B34A096FE");
					gppJSplitPane1.add(gppJScrollPane1, JSplitPane.LEFT);
					{
						Dmnd_det dd = new Dmnd_det();
						dd.setMnd_nbr("-1");
						dd.setMnd_select(-1);
						Omnd_det od = new Omnd_det(dd);
						od.updateDmnd_det();
						gppJTree1 = getTreeMenuObject(od.getDmnd_det());
						gppJScrollPane1.setViewportView(gppJTree1);
					}
				}
				{
					gppJScrollPane2 = new GppJScrollPane();
					gppJScrollPane2
							.setAuthorizationSerial("977A4B1E4E7C8823E1940D5CE8DA9344");
					gppJSplitPane1.add(gppJScrollPane2, JSplitPane.RIGHT);
					{
						panel = new GppJPanel();
						
						panel.setAuthorizationSerial("52BE62579D44C2F2916443558B129469");
						gppJScrollPane2.setViewportView(panel);
						FlowLayout panelLayout = new FlowLayout();
						panel.setLayout(panelLayout);
						{
							textField_1 = new GppJTextField();
							textField_1.setAuthorizationSerial("A142770F56AA6B8C4E25E151D307D2C3");
							panel.add(textField_1);
							textField_1.setColumns(10);
							textField_1.setBackground(new java.awt.Color(255,
									255, 255));
						}
						{
							textField_3 = new GppJTextField();
							textField_3.setAuthorizationSerial("FDFF25267B85BB868C0D203E679864D8");
							
							panel.add(textField_3);
							textField_3.setColumns(10);
						}
						{
							textField_2 = new GppJTextField();
							textField_2.setAuthorizationSerial("20B3261C7544196894B889A42123DFAC");
							
							panel.add(textField_2);
							textField_2.setColumns(10);
						}
						{
							gppJButton1 = new GppJButton();
							panel.add(gppJButton1);
							gppJButton1.setText("gppJButton1");
							gppJButton1.addMouseListener(new MouseAdapter() {
								public void mouseClicked(MouseEvent evt) {
									gppJButton1MouseClicked(evt);
								}
							});
						}
						panel
								.setFocusTraversalPolicy(new FocusTraversalOnArray(
										new Component[] { textField_3,
												textField_2, textField_1 }));
						panel.setBackground(new java.awt.Color(192, 192, 192));
					}
				}
			}
		}

	}

	/**
	 * 获取树菜单对象
	 */
	private GppJTree getTreeMenuObject(Dmnd_det dd) {
		// JTree retJTree = null;
		Omnd_det od = new Omnd_det(dd);
		od.updataVector();

		DefaultMutableTreeNode menuroot = new DefaultMutableTreeNode(od
				.getDmnd_det());

		DefaultTreeModel menuTreeModel = new DefaultTreeModel(menuroot);

		final GppJTree retJTree = new GppJTree(menuTreeModel);

		retJTree.setFont(GlobalParameter.getGuiClient()
				.getFontOfFunctionTreeNav());
		retJTree.setBackground(GlobalParameter.getGuiClient()
				.getBackgroundOfFunctionTreeNav());

		if (dd.isHaveChild()) {
			// DefaultMutableTreeNode temp = new DefaultMutableTreeNode("");
			// menuroot.add(temp);
			setTreeSunRoot(dd, menuroot, retJTree);
		}

		retJTree.addTreeExpansionListener(new TreeExpansionListener() {
			public void treeExpanded(
					javax.swing.event.TreeExpansionEvent e) {
				
				DefaultMutableTreeNode sunroot = (DefaultMutableTreeNode) e
				.getPath().getLastPathComponent();
				
				Dmnd_det dd3 = (Dmnd_det) (sunroot.getUserObject());
				
				String tem = sunroot.getFirstChild().toString();
				// 则不需要再次设置该子节点，直接返回
				if (!tem.equals("")) {
					return;
				}
				
				if (dd3.isHaveChild()) {
					
					setTreeSunRoot(dd3, sunroot, retJTree);
				}
			}
			
			public void treeCollapsed(
					javax.swing.event.TreeExpansionEvent e) {
				
			}
		});

		retJTree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(
					javax.swing.event.TreeSelectionEvent e) {
				DefaultMutableTreeNode sunroot =
					(DefaultMutableTreeNode) e
					.getPath().getLastPathComponent();
				Dmnd_det dd3 = (Dmnd_det) (sunroot.getUserObject());
				
				System.out.println(e);
				//
				// // 不存在子节点，则返回
				// if (!dd3.isHaveChild()) {
					// return;
					// }
				//
				// String tem = sunroot.getFirstChild().toString();
				//
				// // 则不需要再次设置该子节点，直接返回
				// if (tem != null) {
					//
					// int n = sunroot.getChildCount();
					// // 清空列表子节点
					// ((DefaultListModel) getJList().getModel())
					// .removeAllElements();
					//
					// for (int i = 0; i < n; i++) {
						// DefaultMutableTreeNode c = (DefaultMutableTreeNode)
						// (sunroot
								// .getChildAt(i));
						//
						// ((DefaultListModel) getJList().getModel())
						// .addElement((Dmnd_det) (c
								// .getUserObject()));
						// }
					//
					// return;
					// }
				//
				// setTreeSunRoot(dd3, sunroot, retJTree);
				
			}
		});

		retJTree.setRootVisible(false);
		retJTree.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				gppJTree1MouseClicked(evt);
			}
		});

		return retJTree;
	}

	/**
	 * 设置树子节点
	 */
	private void setTreeSunRoot(Dmnd_det dd, DefaultMutableTreeNode root,
			final JTree roottree) {
		// 清空树子节点
		root.removeAllChildren();

		Omnd_det od = new Omnd_det(dd);

		od.updateDmnd_det();
		od.updataVector();
		Vector<Dmnd_det> vedd = od.getVectorDmnd_det();
		Iterator<Dmnd_det> it = vedd.iterator();
		int i = 0;
		while (it.hasNext()) {
			Dmnd_det tempdd = (Dmnd_det) it.next();
			if (tempdd.getMnd_nbr().equals("")
					&& (tempdd.getMnd_select() == 0 || tempdd.getMnd_select() == 1)) {
				continue;
			}
			if (Authorization.canRun(tempdd)) {
				DefaultMutableTreeNode temproot = new DefaultMutableTreeNode(
						tempdd);
				root.insert(temproot, i);
				if (tempdd.isHaveChild()) {

					DefaultMutableTreeNode temp = new DefaultMutableTreeNode("");
					temproot.add(temp);

				}

				i++;
			}
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				roottree.updateUI();
			}
		});
	}

	@Override
	public boolean runJar(String[] args) {
		Mgpwmt.main(args);
		return false;
	}

	public static void main(String[] args) {
		GlobalParameter.initialize();
		// System.out.println(args[0]+":"+args[1]);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String[] aarg = new String[2];
				aarg[0] = "MD5=tree335";
				aarg[1] = "MND=36.3.10";

				Mgpwmt thisClass = new Mgpwmt(aarg);
				thisClass
						.setAuthorizationSerial("E14D18C136A1444C52770579964C275A");
				thisClass.setDefaultCloseOperation(Mgpwmt.HIDE_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}
	
	private void gppJTree1MouseClicked(MouseEvent evt) {
		if(evt.getButton() == 3){
			System.out.println(evt);
		}
		
	}
	
	private void gppJButton1MouseClicked(MouseEvent evt) {
		System.out.println("gppJButton1.mouseClicked, event="+evt);
		TrHistDAO dao = TrHistDAO.getFromApplicationContext(GlobalParameter
				.getAppContextXMLClass("TrHistDAO"));
		List<?> l = dao.findAll();

		for (Object o : l) {
			
			TrHist tem = (TrHist)o;
			System.out.println(tem.getTrPart());
			
		}
	}

}
