/**
 * 
 */
package com.gopawpaw.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Dimension;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import com.gopawpaw.frame.dataEntity.Dmnd_det;
import com.gopawpaw.frame.dataEntity.Omnd_det;
import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.javax.swing.GppJList;
import com.sunking.swing.JGroupPanel;

import javax.swing.JList;
import javax.swing.JButton;

/**
 * @version 2010-6-4
 * @author 李锦华
 * 
 */
public class MainPanelTree extends JPanel implements MainPanelInterface{
	private static final String TAG = MainPanelTree.class.getSimpleName();
	private static final long serialVersionUID = 1L;
	private JSplitPane jSplitPane = null;
	private JPanel jPanel = null;
	private JPanel jPanel1 = null;
	private JScrollPane jScrollPane1 = null;
	
	private JList jList = null;
	private DefaultListModel ModelList = new DefaultListModel();

	private JGroupPanel jGroupPanel = null;

	private Modules modules = null;  //  @jve:decl-index=0:

	/**
	 * This is the default constructor
	 */
	public MainPanelTree() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GlobalParameter.initialize();
		modules = new Modules();

		this.setSize(588, 217);
		this.setLayout(new BorderLayout());
		this.add(getJSplitPane(), BorderLayout.CENTER);

	}

	/**
	 * This method initializes jSplitPane
	 * 
	 * @return javax.swing.JSplitPane
	 */
	private JSplitPane getJSplitPane() {
		if (jSplitPane == null) {
			jSplitPane = new JSplitPane();
			jSplitPane.setDividerSize(8);
			jSplitPane.setDividerLocation(250);
			jSplitPane.setResizeWeight(0.4);
			jSplitPane.setLeftComponent(getJPanel());
			jSplitPane.setRightComponent(getJPanel1());
			jSplitPane.setOneTouchExpandable(true);
		}
		return jSplitPane;
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
			jPanel.add(getjGroupPanel(), BorderLayout.CENTER);
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
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BorderLayout());
			jPanel1.add(getJScrollPane1(), BorderLayout.CENTER);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jScrollPane1
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJList());
		}
		return jScrollPane1;
	}

	/**
	 * 获取树菜单对象
	 */
	private JTree getTreeMenuObject(Dmnd_det dd) {
		// JTree retJTree = null;
		GLog.d(TAG, "getTreeMenuObject:" + dd);
		Omnd_det od = new Omnd_det(dd);
		od.updataVector();

		DefaultMutableTreeNode menuroot = new DefaultMutableTreeNode(od
				.getDmnd_det());

		DefaultTreeModel menuTreeModel = new DefaultTreeModel(menuroot);

		final JTree retJTree = new JTree(menuTreeModel);

		retJTree.setFont(GlobalParameter.getGuiClient().getFontOfFunctionTreeNav());
		retJTree.setBackground(GlobalParameter.getGuiClient().getBackgroundOfFunctionTreeNav());
		
		if (dd.isHaveChild()) {
//			DefaultMutableTreeNode temp = new DefaultMutableTreeNode("");
//			menuroot.add(temp);
			setTreeSunRoot(dd, menuroot, retJTree);
		}

		retJTree
				.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
					public void treeExpanded(
							javax.swing.event.TreeExpansionEvent e) {

						DefaultMutableTreeNode sunroot = (DefaultMutableTreeNode) e
								.getPath().getLastPathComponent();
						Dmnd_det dd3 = (Dmnd_det) (sunroot.getUserObject());
						// System.out.println(dd3);
						String tem = sunroot.getFirstChild().toString();
						// 则不需要再次设置该子节点，直接返回
						if (!tem.equals("")) {
							return;
						}

						if (dd3.isHaveChild()) {
							if (!MainFrame.actionHistory.lastElement()
									.equals(dd3)) {
								MainFrame.actionHistory.add(dd3);
							}
							setTreeSunRoot(dd3, sunroot, retJTree);
						}
					}

					public void treeCollapsed(
							javax.swing.event.TreeExpansionEvent e) {

					}
				});

		retJTree
				.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
					public void valueChanged(
							javax.swing.event.TreeSelectionEvent e) {
						// DefaultMutableTreeNode sunroot =
						// (DefaultMutableTreeNode) e
						// .getPath().getLastPathComponent();
						// Dmnd_det dd3 = (Dmnd_det) (sunroot.getUserObject());
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
		retJTree.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				DefaultMutableTreeNode sunroot = (DefaultMutableTreeNode) ((JTree) e
						.getComponent()).getLastSelectedPathComponent();

				if (sunroot == null) {
					return;
				}
				Object temob = sunroot.getUserObject();

				if (temob == null) {
					return;
				}

				Dmnd_det dd3 = (Dmnd_det) temob;

				// 不存在子节点，则返回
				if (!dd3.isHaveChild()) {
					if (e.getClickCount() >= 2 && !modules.actionModule(dd3)) {
						JOptionPane.showConfirmDialog(null, modules
								.getActionModuleMessage(), "系统提示",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE);
					}
					
					return;
				}
				// 添加操作历史
				if (MainFrame.actionHistory.size() == 0) {
					MainFrame.actionHistory.add(dd3);
				} else if (MainFrame.actionHistory.size() > 0
						&& !MainFrame.actionHistory.lastElement()
								.equals(dd3)) {
					MainFrame.actionHistory.add(dd3);
				}
				MainFrame.actionHistory2.removeAllElements();
				String tem = sunroot.getFirstChild().toString();
				// 则不需要再次设置该子节点，直接返回
				if (!tem.equals("")) {

					int n = sunroot.getChildCount();
					// 清空列表子节点
					((DefaultListModel) getJList().getModel())
							.removeAllElements();
					for (int i = 0; i < n; i++) {
						DefaultMutableTreeNode c = (DefaultMutableTreeNode) (sunroot
								.getChildAt(i));

						((DefaultListModel) getJList().getModel())
								.addElement((Dmnd_det) (c.getUserObject()));
					}

					return;
				}
				setTreeSunRoot(dd3, sunroot, retJTree);
			}
		});

		retJTree.setRootVisible(false);
		return retJTree;
	}

	
	/**
	 * 设置树子节点
	 */
	private void setTreeSunRoot(Dmnd_det dd, DefaultMutableTreeNode root,
			final JTree roottree) {
		// 清空树子节点
		root.removeAllChildren();
		// 清空列表子节点
		((DefaultListModel) getJList().getModel()).removeAllElements();

		Omnd_det od = new Omnd_det(dd);

		od.updateDmnd_det();
		od.updataVector();
		Vector<Dmnd_det> vedd = od.getVectorDmnd_det();
		Iterator<Dmnd_det> it = vedd.iterator();
		int i = 0;
		while (it.hasNext()) {
			Dmnd_det tempdd = (Dmnd_det) it.next();

			if (Authorization.canRun(tempdd)) {
				DefaultMutableTreeNode temproot = new DefaultMutableTreeNode(tempdd);
				root.insert(temproot, i);
				if (tempdd.isHaveChild()) {

					DefaultMutableTreeNode temp = new DefaultMutableTreeNode("");
					temproot.add(temp);

				}

				if (jList != null) {
					((DefaultListModel) getJList().getModel()).addElement(tempdd);
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

	/**
	 * 设置树子节点
	 */
	private void setTreeSunRoot(Dmnd_det dd, DefaultMutableTreeNode root) {
		// 清空树子节点
		root.removeAllChildren();
		// 清空列表子节点
		((DefaultListModel) getJList().getModel()).removeAllElements();

		Omnd_det od = new Omnd_det(dd);

		od.updateDmnd_det();
		od.updataVector();
		Vector<Dmnd_det> vedd = od.getVectorDmnd_det();
		Iterator<Dmnd_det> it = vedd.iterator();
		int i = 0;
		while (it.hasNext()) {
			Dmnd_det tempdd = (Dmnd_det) it.next();

			DefaultMutableTreeNode temproot = new DefaultMutableTreeNode(tempdd);
			root.insert(temproot, i);
			if (tempdd.isHaveChild()) {

				DefaultMutableTreeNode temp = new DefaultMutableTreeNode();
				temproot.add(temp);

			}

			if (jList != null) {
				((DefaultListModel) getJList().getModel()).addElement(tempdd);
			}

			i++;
		}

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
			}
		});
	}

	/*
	 * 获取功能列表
	 */
	public JList getJListFunction() {
		return getJList();
	}
	/**
	 * This method initializes jList
	 * 
	 * @return javax.swing.JList
	 */
	private JList getJList() {
		if (jList == null) {
			jList = new GppJList(ModelList) {
				/**
				 * 
				 */
				private static final long serialVersionUID = -7762697930556604542L;

				public boolean actionEnter() {

					Dmnd_det tempdd = (Dmnd_det) jList.getSelectedValue();

					Omnd_det od = new Omnd_det(tempdd);
					od.updateDmnd_det();
					tempdd = od.getDmnd_det();

					if (!modules.actionModule(tempdd)) {

						JOptionPane.showConfirmDialog(null, modules
								.getActionModuleMessage(), "系统提示",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE);
					} else {

						if (tempdd.isHaveChild()) {
							MainFrame.actionHistory.add(tempdd);
							// 清空列表子节点
							((DefaultListModel) jList.getModel())
									.removeAllElements();
							od.updataVector();
							Iterator<?> it = od.getVectorDmnd_det().iterator();
							while (it.hasNext()) {
								Dmnd_det tempdd2 = (Dmnd_det) it.next();
								((DefaultListModel) jList.getModel())
										.addElement(tempdd2);
							}
						}
					}
					return false;
				}

				public boolean actionEscape() {
					if (MainFrame.actionHistory.size() > 1) {
						Dmnd_det tempdd = MainFrame.actionHistory
								.lastElement();
						MainFrame.actionHistory2.add(tempdd);
						MainFrame.actionHistory.removeElement(tempdd);
						if (!MainFrame.actionHistory.isEmpty()) {
							tempdd = MainFrame.actionHistory.lastElement();
							if (tempdd.isHaveChild()) {
								// 清空列表子节点
								((DefaultListModel) jList.getModel())
										.removeAllElements();
								Omnd_det od = new Omnd_det(tempdd);
								od.updataVector();
								Iterator<?> it = od.getVectorDmnd_det()
										.iterator();
								while (it.hasNext()) {
									Dmnd_det tempdd2 = (Dmnd_det) it.next();
									((DefaultListModel) jList.getModel())
											.addElement(tempdd2);
								}
							}
						}
					} else {
						MainFrame.exitSystem();
					}

					return true;
				}
			};
			jList.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {

					Dmnd_det tempdd = (Dmnd_det) jList.getSelectedValue();

					if (tempdd == null) {
						return;
					}

					Omnd_det od = new Omnd_det(tempdd);
					od.updateDmnd_det();
					tempdd = od.getDmnd_det();

					if (e.getClickCount() == 2) {
						MainFrame.actionHistory.add(tempdd);
						if (tempdd.getMnd_exec() != null) {

							if (!modules.actionModule(tempdd)) {

								JOptionPane.showConfirmDialog(null, modules
										.getActionModuleMessage(), "系统提示",
										JOptionPane.YES_NO_OPTION,
										JOptionPane.QUESTION_MESSAGE);
							} else {

								if (tempdd.isHaveChild()) {
									// 清空列表子节点
									((DefaultListModel) jList.getModel())
											.removeAllElements();
									od.updataVector();
									Iterator<?> it = od.getVectorDmnd_det()
											.iterator();
									while (it.hasNext()) {
										Dmnd_det tempdd2 = (Dmnd_det) it.next();
										((DefaultListModel) jList.getModel())
												.addElement(tempdd2);
									}
								}

							}
						} else {
							String tempmsg = "菜单未定义！";
							JOptionPane.showConfirmDialog(null, tempmsg,
									"系统提示", JOptionPane.YES_NO_OPTION,
									JOptionPane.QUESTION_MESSAGE);
						}

					}
				}
			});
			
			jList.setFont(GlobalParameter.getGuiClient().getFontOfFunctionList());
			jList.setBackground(GlobalParameter.getGuiClient().getBackgroundOfFunctionList());
		}
//		this.actionMainMenu();
		
		return jList;
	}

	public JGroupPanel getjGroupPanel() {
		if (jGroupPanel == null) {
			jGroupPanel = new JGroupPanel();

			Dmnd_det dd = new Dmnd_det();
			dd.setMnd_nbr("");
			dd.setMnd_select(2);
			Omnd_det od = new Omnd_det(dd);
			od.updateDmnd_det();
			od.updataVector();
			Vector<Dmnd_det> vedd = od.getVectorDmnd_det();
			GLog.d(TAG, "getjGroupPanel" + dd);
			Iterator<Dmnd_det> it = vedd.iterator();

			// System.out.println(size);
			int i = 0;
			while (it.hasNext()) {

				Dmnd_det tempdd = (Dmnd_det) it.next();
				jGroupPanel.insertGroup(i, tempdd.toString(), GlobalParameter.getGuiClient().getBackgroundOfFunctionNav());
				jGroupPanel.getTitleButtonObject(i).setHorizontalAlignment(
						JButton.LEFT);
				jGroupPanel.getTitleButtonObject(i).setBackground(GlobalParameter.getGuiClient().getBackgroundOfFunctionGruop());
				jGroupPanel.getTitleButtonObject(i).setFont(GlobalParameter.getGuiClient().getFontOfFunctionGruop());
				
//				Omnd_det od2 = new Omnd_det(tempdd);
//				od2.updateDmnd_det();
//				od2.updataVector();
//				Vector<Dmnd_det> vedd2 = od2.getVectorDmnd_det();
//
//				Iterator<Dmnd_det> it2 = vedd2.iterator();
//
//				while (it2.hasNext()) {
//					Dmnd_det tempdd2 = (Dmnd_det) it2.next();

					// JButton bttMember = new JButton(tempdd2.toString());

					jGroupPanel.addMember(i, getTreeMenuObject(tempdd));
					// bttMember.setPreferredSize(new Dimension(1, 40));
					// bttMember.setOpaque(false);
//				}

				// for (int j = 1; j <= 5; j++) {
				// JButton bttMember = new JButton("Member " + j + " of " + i);
				// jGroupPanel.addMember(i, bttMember);
				// bttMember.setPreferredSize(new Dimension(1, 40));
				// bttMember.setOpaque(false);
				// // bttMember.setForeground(mc);
				// }
//				 jGroupPanel.getGroup(i).setMemberGap(20, 5);
				// getGroup(i - 1).getTitleButton().setForeground(bg[i - 1]);
				i++;
			}

		}
		// }

		return jGroupPanel;
	}

	@Override
	public void actionMainMenu() {
		((DefaultListModel) jList.getModel()).removeAllElements();

		Iterator<Dmnd_det> it = GlobalParameter
				.getFrequently_used_menu_item().iterator();
		while (it.hasNext()) {
			Dmnd_det tempDmnd = (Dmnd_det) it.next();

			((DefaultListModel) jList.getModel()).addElement(tempDmnd);
		}
	}

} // @jve:decl-index=0:visual-constraint="10,10"
