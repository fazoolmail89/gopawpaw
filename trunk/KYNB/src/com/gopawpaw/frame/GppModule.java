/**
 * 
 */
package com.gopawpaw.frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import com.gopawpaw.dev.common.GppDynamicJar;
import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.dev.common.GppManifestReader;
import com.gopawpaw.dev.common.GppPanelFreeOrder;
import com.gopawpaw.frame.dataEntity.Dmnd_det;
import com.gopawpaw.frame.dataEntity.Omnd_det;
import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.javax.swing.GppJButton;
import com.gopawpaw.javax.swing.GppJList;

/**
 * @version 2010-3-4
 * @author 李锦华
 * 
 */
public class GppModule {
	private static final String TAG = GppModule.class.getSimpleName();
	private JList jList = null; // @jve:decl-index=0:visual-constraint="515,52"
	private DefaultListModel ModelList = new DefaultListModel();

	private GppModuleActionListener gppModuleActionListener = null;

	private Dmnd_det m_Dmnd_det;

	private JTree jTree = null;

	// private static boolean isHomePage = false;

	/**
	 * 
	 */
	public GppModule() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取模块导航面板
	 * 
	 * @return 导航面板
	 */
	public JPanel getModuleNav() {
		JPanel retjp = null;

		if (GlobalParameter.getGuiClient().getNavShowType() == GUIclient.NavShowType_Tree) {
			retjp = getModuleNavTree();
		} else {
			retjp = getModuleNavButton();
		}

		return retjp;

	}

	/**
	 * 获取模块按钮导航面板
	 * 
	 * @return 导航面板
	 */
	public JPanel getModuleNavTree() {
		JPanel retjp = new JPanel();
		retjp.setLayout(new BorderLayout());
		retjp.add(getJTree(), BorderLayout.CENTER);

		return retjp;
	}

	/**
	 * 设置树子节点
	 */
	private void setTreeSunRoot(Dmnd_det dd, DefaultMutableTreeNode root) {
		
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

				DefaultMutableTreeNode temp = new DefaultMutableTreeNode();
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
	 * 获取树对象
	 */
	private JTree getJTree() {
		GLog.d(TAG, "getJTree");
		if (jTree == null) {
//			GlobalParameter.initialize();
			Dmnd_det dd = new Dmnd_det();
			dd.setMnd_nbr("A");
			dd.setMnd_select(1);
			Omnd_det od = new Omnd_det(dd);
			od.updateDmnd_det();
			od.updataVector();

			DefaultMutableTreeNode root = new DefaultMutableTreeNode(od
					.getDmnd_det());

			DefaultTreeModel treeModel = new DefaultTreeModel(root);
			jTree = new JTree(treeModel);
			jTree
					.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
						public void treeExpanded(
								javax.swing.event.TreeExpansionEvent e) {

							DefaultMutableTreeNode sunroot = (DefaultMutableTreeNode) e
									.getPath().getLastPathComponent();
							Dmnd_det dd = (Dmnd_det) (sunroot.getUserObject());
							
							String tem = sunroot.getFirstChild().toString();
							
							//如果是根节点或已经展开过该节点，
							//则不需要再次设置该子节点，直接返回
							if(sunroot.isRoot() || tem != null ){
								return;
							}
							
							if (dd.isHaveChild()) {
								setTreeSunRoot(dd, sunroot);
							}
						}

						public void treeCollapsed(
								javax.swing.event.TreeExpansionEvent e) {

						}
					});
			jTree
					.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
						public void valueChanged(
								javax.swing.event.TreeSelectionEvent e) {
							System.out.println("valueChanged()"); // TODO
							DefaultMutableTreeNode sunroot = (DefaultMutableTreeNode) e
									.getPath().getLastPathComponent();
							Dmnd_det dd = (Dmnd_det) (sunroot.getUserObject());

							if (dd.isHaveChild()) {
								gppModuleActionListener.actionGppModule(dd);
							}
						}
					});
			jTree.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

				}
			});
			setTreeSunRoot(dd, root);
//			Vector<Dmnd_det> vedd = od.getVectorDmnd_det();
//
//			Iterator it = vedd.iterator();
//			int i = 0;
//			while (it.hasNext()) {
//
//				Dmnd_det tempdd = (Dmnd_det) it.next();
//
//				DefaultMutableTreeNode temproot = new DefaultMutableTreeNode(
//						tempdd);
//				treeModel.insertNodeInto(temproot, root, i);
//				if (tempdd.isHaveChild()) {
//
//						
//				}
//				i++;
//			}

		}
		return jTree;
	}

	/**
	 * 获取模块按钮导航面板
	 * 
	 * @return 导航面板
	 */
	public JPanel getModuleNavButton() {
		GLog.d(TAG, "getModuleNavButton");
		GppPanelFreeOrder gppPanelFreeOrder = null;
		// 主菜单
		if (this.m_Dmnd_det.getMnd_nbr().isEmpty()
				|| this.m_Dmnd_det.getMnd_exec().trim().startsWith("A")) {

			gppPanelFreeOrder = new GppPanelFreeOrder(GppPanelFreeOrder.Y_AXIS,
					4);
			gppPanelFreeOrder.setAlignmentY(GppPanelFreeOrder.TOP);
			Dmnd_det dd = new Dmnd_det();
			dd.setMnd_nbr("");
			dd.setMnd_select(2);

			Omnd_det od = new Omnd_det(dd);
			od.updateDmnd_det();

			Omnd_det omnd_det = new Omnd_det(od.getDmnd_det());

			omnd_det.updataVector();
			Iterator<Dmnd_det> it = omnd_det.getVectorDmnd_det().iterator();

			while (it.hasNext()) {
				final Dmnd_det tempDmnd = (Dmnd_det) it.next();

				JButton tempjButton = new GppJButton(tempDmnd.getMnd_label()) {
					/**
					 * 
					 */
					private static final long serialVersionUID = 5603970558769081869L;

					public boolean actionEnter() {
						MainFrame.actionHistory.removeAllElements();
						gppModuleActionListener.actionGppModule(tempDmnd);
						return false;
					}
				};
				tempjButton.addMouseListener(new java.awt.event.MouseAdapter() {
					@Override
					public void mouseClicked(java.awt.event.MouseEvent e) {
						MainFrame.actionHistory.removeAllElements();

						gppModuleActionListener.actionGppModule(tempDmnd);
					}
				});

				gppPanelFreeOrder.add(tempjButton);
			}

		} else {

			// 导航主菜单
			gppPanelFreeOrder = new GppPanelFreeOrder(GppPanelFreeOrder.Y_AXIS,
					10);
			gppPanelFreeOrder.setAlignmentY(GppPanelFreeOrder.TOP);

			Omnd_det omnd_det = new Omnd_det(this.m_Dmnd_det);
			omnd_det.updateDmnd_det();
			Iterator<Dmnd_det> it = omnd_det.getVectorFatherNav().iterator();
			MainFrame.actionHistory = omnd_det.getVectorFatherNav();
			while (it.hasNext()) {
				final Dmnd_det tempDmnd = (Dmnd_det) it.next();
				String tempexec = "";
				if (!tempDmnd.getMnd_exec().trim().startsWith("A")
						&& !isJarFile(tempDmnd.getMnd_exec())) {
					tempexec = tempDmnd.getMnd_exec();
				} else if (isJarFile(tempDmnd.getMnd_exec())) {
					tempexec = tempDmnd.getMnd_nbr() + "."
							+ tempDmnd.getMnd_select();
				}
				JButton tempjButton = new GppJButton(tempexec
						+ tempDmnd.getMnd_label()) {
					/**
					 * 
					 */
					private static final long serialVersionUID = -2951971560828897850L;

					public boolean actionEnter() {
						MainFrame.actionHistory.add(tempDmnd);
						gppModuleActionListener.actionGppModule(tempDmnd);
						return false;
					}
				};
				tempjButton.addMouseListener(new java.awt.event.MouseAdapter() {
					@Override
					public void mouseClicked(java.awt.event.MouseEvent e) {
						MainFrame.actionHistory.add(tempDmnd);
						gppModuleActionListener.actionGppModule(tempDmnd);
					}
				});

				gppPanelFreeOrder.add(tempjButton);
			}

		}
		return gppPanelFreeOrder.getGppPanel();
	}

	/**
	 * 获取功能列表
	 * 
	 * @return 模块功能列表
	 */
	public JList getModuleList() {

		if (this.m_Dmnd_det.getMnd_nbr().isEmpty()) {
			((DefaultListModel) getjList().getModel()).removeAllElements();

			Iterator<Dmnd_det> it = GlobalParameter
					.getFrequently_used_menu_item().iterator();
			while (it.hasNext()) {
				Dmnd_det tempDmnd = (Dmnd_det) it.next();

				// addModuleData(tempDmnd);

				// String tempstr = "";
				// if (tempDmnd.isHaveChild()) {
				// tempstr = " ... ";
				// }
				((DefaultListModel) getjList().getModel()).addElement(tempDmnd);
			}
			// isHomePage = true;
		} else if (GppModule.isJarFile(this.m_Dmnd_det.getMnd_exec())) {
			this.m_Dmnd_det = Omnd_det.getFatherNbr(this.m_Dmnd_det);
			Omnd_det omnd_det = new Omnd_det(this.m_Dmnd_det);
			omnd_det.updataVector();
			Iterator<Dmnd_det> it = omnd_det.getVectorDmnd_det().iterator();
			while (it.hasNext()) {
				Dmnd_det tempDmnd = (Dmnd_det) it.next();
				if (Authorization.canRun(tempDmnd)) {
					addModuleData(tempDmnd);
				}

			}
			// isHomePage = false;
		} else {
			Omnd_det omnd_det = new Omnd_det(this.m_Dmnd_det);
			omnd_det.updataVector();
			Iterator<Dmnd_det> it = omnd_det.getVectorDmnd_det().iterator();

			while (it.hasNext()) {
				Dmnd_det tempDmnd = (Dmnd_det) it.next();
				if (Authorization.canRun(tempDmnd)) {
					addModuleData(tempDmnd);
				}
			}
			// isHomePage = false;
		}
		getjList().setSelectedIndex(0);
		getjList().setRequestFocusEnabled(true);
		return getjList();
	}

	/**
	 * 给功能列表添加功能菜单
	 * 
	 * @param nowmodid
	 *            模块ID
	 * @param nowmodname
	 *            模块名称
	 * @param nowhavechild
	 *            是否有下级模块
	 */
	private void addModuleData(Dmnd_det tempDmnd) {
		// String tempstr = "";
		// if (tempDmnd.isHaveChild()) {
		// tempstr = " ... ";
		// }
		// ((DefaultListModel) getjList().getModel())
		// .addElement(convertModuleDataPrefix(String.valueOf(tempDmnd
		// .getMnd_select()))
		// + tempDmnd.getMnd_label() + tempstr);
		((DefaultListModel) getjList().getModel()).addElement(tempDmnd);
	}

	/**
	 * @return the jList
	 */
	private JList getjList() {
		if (jList == null) {
			jList = new GppJList(ModelList) {
				/**
				 * 
				 */
				private static final long serialVersionUID = -7762697930556604542L;

				public boolean actionEnter() {
					// String temp2 = null;
					// temp2 = (String) jList.getSelectedValue();
					//
					// if (temp2 == null) {
					// return false;
					// }
					Dmnd_det tempdd = (Dmnd_det) jList.getSelectedValue();

					// if(GppModule.isHomePage){
					// tempdd.setMnd_nbr(Omnd_det.getNbr(unconvertModuleDataPrefix(temp2)));
					// tempdd.setMnd_select(Omnd_det.getSelect(unconvertModuleDataPrefix(temp2)));
					// }else{
					// tempdd.setMnd_nbr(m_Dmnd_det.getMnd_exec());
					// tempdd.setMnd_select(Integer
					// .valueOf(unconvertModuleDataPrefix(temp2)));
					// }

					Omnd_det od = new Omnd_det(tempdd);
					od.updateDmnd_det();
					gppModuleActionListener.actionGppModule(od.getDmnd_det());

					return false;
				}

				public boolean actionEscape() {
					if (!MainFrame.actionHistory.isEmpty()) {
						Dmnd_det tempdd = MainFrame.actionHistory
								.lastElement();
						MainFrame.actionHistory.removeElement(tempdd);
						if (!MainFrame.actionHistory.isEmpty()) {
							tempdd = MainFrame.actionHistory.lastElement();
							gppModuleActionListener.actionGppModule(tempdd);
						}
					} else {
						MainFrame.exitSystem();
					}

					return true;
				}
			};

			jList.setSize(new Dimension(135, 52));
			jList.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {

					// String temp2 = null;
					// Omnd_det = (Dmnd_det) jList.getSelectedValue();
					//
					// if (temp2 == null) {
					// return;
					// }
					Dmnd_det tempdd = (Dmnd_det) jList.getSelectedValue();

					// if(GppModule.isHomePage){
					// tempdd.setMnd_nbr(Omnd_det.getNbr(unconvertModuleDataPrefix(temp2)));
					// tempdd.setMnd_select(Omnd_det.getSelect(unconvertModuleDataPrefix(temp2)));
					// }else{
					// tempdd.setMnd_nbr(m_Dmnd_det.getMnd_exec());
					// tempdd.setMnd_select(Integer
					// .valueOf(unconvertModuleDataPrefix(temp2)));
					// }

					Omnd_det od = new Omnd_det(tempdd);
					od.updateDmnd_det();

					if (e.getClickCount() == 2) {
						MainFrame.actionHistory.add(od.getDmnd_det());
						if (od.getDmnd_det().getMnd_exec() != null) {
							gppModuleActionListener.actionGppModule(od
									.getDmnd_det());
						} else {
							String tempmsg = "菜单未定义！";
							JOptionPane.showConfirmDialog(null, tempmsg,
									"系统提示", JOptionPane.YES_NO_OPTION,
									JOptionPane.QUESTION_MESSAGE);
						}

					}
				}
			});
			// GppKeyListener tempGppKeyListener = new GppKeyListener(jList);
			// tempGppKeyListener.addGppModuleActionListener(this);
			// jList.addKeyListener(tempGppKeyListener);
		}
		return jList;
	}

	/**
	 * 将当前编号转换为要显示的前缀
	 * 
	 * @param moddata
	 *            模块数据，如：菜单为1.2.5，则 modata 为 5 而非 1.2.5
	 * @return
	 */
	private String convertModuleDataPrefix(String moddata) {

		String splitstr = " - ";
		if (moddata.length() < 2) {
			moddata = "  " + moddata + splitstr;
		} else {
			moddata = moddata + splitstr;
		}

		return moddata;
	}

	/**
	 * 解析获取模块数据前缀
	 * 
	 * @param modname
	 * @return
	 */
	private String unconvertModuleDataPrefix(String modname) {
		String[] temparr = modname.split(" - ");

		return temparr[0].trim();
	}

	/**
	 * 执行菜单命令
	 * 
	 * @param mitem
	 *            菜单项
	 * @return 执行结果
	 */
	public boolean actionModule(Dmnd_det dd) {
		boolean retb = false;
		this.m_Dmnd_det = dd;
		if (dd == null) {
			return false;
		}
		if (!Authorization.canRun(dd)) {
			String tempmsg = "您没有权限使用该功能：" + dd.getMnd_label();
			JOptionPane.showConfirmDialog(null, tempmsg, "系统提示",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			return retb;
		}
		// 如果是jar文件
		if (isJarFile(dd.getMnd_exec())) {
			System.out.println("GppModule.actionModule() 执行jar程序:"
					+ dd.getMnd_exec());

			// GppCmdShell.actionCommand("java -jar E:\\GERP\\receivingDispensingPreserving.jar");
			String tem = GlobalParameter.getProgramAbsolutePath()
					+ File.separator + dd.getMnd_exec();
			// String tem = "\\\\10.8.2.250\\keerqad\\rdp2-2.jar";
			// System.out.println(tem);

			actionJarProgram(tem);

			return false;
		}

		if (dd.isHaveChild()) {
			// 进入下级菜单
			System.out.println("GppModule.actionModule()-进入菜单："
					+ dd.getMnd_exec());

		} else {
			// 执行程序命令
			System.out.println("GppModule.actionModule()-执行程序："
					+ dd.getMnd_exec());
			// GppCmdShell.actionCommand("java -jar E:\\GERP\\receivingDispensingPreserving.jar");
			// actionJarProgram("file:///E:\\GERP\\receivingDispensingPreserving.jar","com.gopawpaw.erp.program.report.receivingDispensingPreserving.ReceivingDispensingPreservingTotal");
		}

		return retb;
	}

	/**
	 * 判断是否为可执行的jar文件
	 */
	public static boolean isJarFile(String mnd_exec) {
		boolean retb = false;

		if (mnd_exec == null) {
			return false;
		}
		String[] arrmitem = mnd_exec.split("\\.");
		if (arrmitem[arrmitem.length - 1].equals("jar")
				|| arrmitem[arrmitem.length - 1].equals("p")
				|| arrmitem[arrmitem.length - 1].equals("r")) {
			retb = true;
		} else {
			retb = false;
		}

		return retb;
	}

	/**
	 * 运行JAR程序
	 */
	private void actionJarProgram(String jarPath) {
		GppDynamicJar gdj = new GppDynamicJar(GppDynamicJar.LOCAL, jarPath);
		if (gdj.isExistJarPack()) {
			gdj.runJar(null);
		} else {

			String tempmsg = "找不到程序：" + jarPath;
			JOptionPane.showConfirmDialog(null, tempmsg, "系统提示",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
	}

	public void addGppModuleActionListener(GppModuleActionListener gm) {
		this.gppModuleActionListener = gm;
	}

	public static void main(String[] args) {
		GppModule ggpm = new GppModule();
		ggpm.getModuleNav();
		// System.out.println(ggpm.isJarFile(null));
		// System.out.println(Omnd_det.isHaveChild("3.6.44"));
	}

}
