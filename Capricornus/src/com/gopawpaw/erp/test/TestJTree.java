/**
 * 
 */
package com.gopawpaw.erp.test;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.dataEntity.Dmnd_det;
import com.gopawpaw.erp.dataEntity.Omnd_det;

/**
 * @version 2010-6-1
 * @author 李锦华
 * 
 */
public class TestJTree extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JScrollPane jScrollPane = null;
	private JTree jTree = null;

	private static boolean flagsetSunRoot = false;

	/**
	 * @throws HeadlessException
	 */
	public TestJTree() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public TestJTree(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public TestJTree(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public TestJTree(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * This method initializes jScrollPane
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTree());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTree
	 * 
	 * @return javax.swing.JTree
	 */
	private JTree getJTree() {
		if (jTree == null) {
			GlobalParameter.initialize();
			Dmnd_det dd = new Dmnd_det();
			dd.setMnd_nbr("A");
			dd.setMnd_select(1);
			Omnd_det od = new Omnd_det(dd);
			od.updateDmnd_det();
			od.updataVector();

			DefaultMutableTreeNode root = new DefaultMutableTreeNode(od
					.getDmnd_det());
			// DefaultMutableTreeNode subroot = new
			// DefaultMutableTreeNode("SubRoot");
			// DefaultMutableTreeNode leaf1 = new
			// DefaultMutableTreeNode("Leaf 1");
			// DefaultMutableTreeNode leaf2 = new
			// DefaultMutableTreeNode("Leaf 2");
			// DefaultMutableTreeNode leaf3 = new
			// DefaultMutableTreeNode("Leaf 3");
			DefaultTreeModel treeModel = new DefaultTreeModel(root);
			jTree = new JTree(treeModel);
			jTree
					.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
						public void treeExpanded(
								javax.swing.event.TreeExpansionEvent e) {
							// System.out.println("treeExpanded()"); // TODO
							// Auto-generated Event stub treeExpanded()

							DefaultMutableTreeNode sunroot = (DefaultMutableTreeNode) e
									.getPath().getLastPathComponent();
							Dmnd_det dd = (Dmnd_det) (sunroot.getUserObject());

							if (dd.isHaveChild()) {
//								System.out.println("====fff==="
//										+ dd.getMnd_label());
								// flagsetSunRoot = true;
								setSunRoot(dd, sunroot);
							}
							// getJTree().repaint();
							// try{

							// Thread.currentThread().yield();
							// ///////////////////
							// ///////////////////

							// tree.updateUI();////此处抛出的异常竟然不能捕获!
							// ///////////////////
							// ///////////////////

							// }catch(Exception ex){
							// public void
							// treeExpanded(javax.swing.event.TreeExpansionEvent
							// e) {
							// getJTree().updateUI();
							// }
							//	        			
							// }
							//	        		
//							System.out.println("====fff==yyyyyyyyy=");
						}

						public void treeCollapsed(
								javax.swing.event.TreeExpansionEvent e) {
							// System.out.println("treeCollapsed()"); // TODO
							// Auto-generated Event stub treeExpanded()

						}
					});
			jTree
					.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
						public void valueChanged(
								javax.swing.event.TreeSelectionEvent e) {
							System.out.println("valueChanged()"); // TODO
																	// Auto-generated
																	// Event
																	// stub
																	// valueChanged()
							// jTree.getSelectionModel().g
							// System.out.println("==="+((Dmnd_det)((DefaultMutableTreeNode)e.getNewLeadSelectionPath().getLastPathComponent()).getUserObject()));
							// DefaultMutableTreeNode sunroot =
							// (DefaultMutableTreeNode)e.getNewLeadSelectionPath().getLastPathComponent();
							// Dmnd_det dd =
							// (Dmnd_det)(sunroot.getUserObject());
							//	        		
							// if(dd.isHaveChild()){
							// System.out.println("=======");
							// setSunRoot(dd,sunroot);
							// }
							// getJTree().updateUI();
							// 取得选择状态变化的所有路径
							// TreePath[] paths = e.getPaths();
							//
							// for (int i=0; i<paths.length; i++) {
							// // 如果处于选择状态
							// if (e.isAddedPath(i)) {
							// // 将路径转化为节点数组
							// Object[] nodes=paths[i].getPath();
							//
							// // 得到最后一个节点,即选择的节点
							// DefaultMutableTreeNode
							// node=(DefaultMutableTreeNode)nodes[nodes.length-1];
							//	                        
							// System.out.println(node.getFirstLeaf());
							// // Dmnd_det dd =
							// (Dmnd_det)e.getNewLeadSelectionPath().getLastPathComponent();
							// //
							// setSunRoot(node.getLastLeaf(),(Dmnd_det)e.getNewLeadSelectionPath().getLastPathComponent());
							// }
							// }

						}
					});
			jTree.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// System.out.println("mouseClicked()"); // TODO
					// Auto-generated Event stub mouseClicked()
				}
			});

			// subroot.insert(leaf2, 0);
			// leaf1.insert(leaf3, 0);

			Vector<Dmnd_det> vedd = od.getVectorDmnd_det();

			// System.out.println(od.getDmnd_det().getMnd_label());
			Iterator it = vedd.iterator();
			int i = 0;
			while (it.hasNext()) {

				Dmnd_det tempdd = (Dmnd_det) it.next();
				// System.out.println(tempdd.getMnd_exec());

				DefaultMutableTreeNode temproot = new DefaultMutableTreeNode(
						tempdd);
				treeModel.insertNodeInto(temproot, root, i);
				if (tempdd.isHaveChild()) {
					// setSunRoot(tempdd,temproot);
					// if(flagsetSunRoot){
					DefaultMutableTreeNode temp = new DefaultMutableTreeNode("");
					temproot.add(temp);
					// flagsetSunRoot = false;
					// }
				}
				i++;
			}

		}
		return jTree;
	}

	private void setSunRoot(Dmnd_det dd, DefaultMutableTreeNode root) {
		root.removeAllChildren();
		Omnd_det od = new Omnd_det(dd);

		od.updateDmnd_det();
		od.updataVector();
		Vector<Dmnd_det> vedd = od.getVectorDmnd_det();
		Iterator it = vedd.iterator();
		int i = 0;
		while (it.hasNext()) {
			Dmnd_det tempdd = (Dmnd_det) it.next();

			DefaultMutableTreeNode temproot = new DefaultMutableTreeNode(tempdd);
			root.insert(temproot, i);
			if (tempdd.isHaveChild()) {
			
				DefaultMutableTreeNode temp = new DefaultMutableTreeNode("");
				temproot.add(temp);

			}
			i++;
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				getJTree().updateUI();
			}
		});

	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TestJTree thisClass = new TestJTree();
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
		this.setSize(300, 200);
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
			jContentPane.add(getJScrollPane(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

}
