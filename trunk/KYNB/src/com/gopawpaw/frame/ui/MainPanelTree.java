/**
 * 
 */
package com.gopawpaw.frame.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.database.Dmnd_det;
import com.gopawpaw.frame.database.Omnd_det;
import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.frame.widget.BaseJInternalFrame;
import com.sunking.swing.JGroupPanel;

/**
 * @version 2010-6-4
 * @author 李锦华
 * 
 */
public class MainPanelTree extends JPanel implements ModulesListener{
	private static final String TAG = MainPanelTree.class.getSimpleName();
	private static final long serialVersionUID = 1L;
	private JSplitPane jSplitPane = null;
	private JPanel jPanel = null;

	private JGroupPanel jGroupPanel = null;

	/**
	 * 模块运行对象
	 */
	private Modules modules = null;  //  @jve:decl-index=0:

	/**
	 * 模块桌面管理面板
	 */
	private JDesktopPane desktopPane;
	
	/**
	 * 模块背景图片
	 */
	private static final String BACKGROUND_MODULE_IMG_PATH = "bg_module.jpg";

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
		modules = new Modules(this);

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
			jSplitPane.setDividerLocation(200);
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
	private JComponent getJPanel1() {
		
		if (desktopPane == null) {
			desktopPane = new JDesktopPane(){
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				
				
				private Image backgroundImage = null;
				
				//确保图片加载失败时，不重新加载
				private boolean isInitImage = false;
				
				public void paintComponent(Graphics g){ 
					super.paintComponent(g);
					
					if(backgroundImage == null && !isInitImage){
						try {
				            backgroundImage = ImageIO.read(new File(BACKGROUND_MODULE_IMG_PATH));
				        } catch (IOException e) {
				            System.out.println("无法读取背景图片");
				            e.printStackTrace(System.err);
				            isInitImage = true;
				        }
					}
					
			        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

			    } 

			};
		}
		return desktopPane;
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
					if (e.getClickCount() >= 2 ) {
						//双击事件
						modules.actionModule(dd3);
					}
					
					return;
				}

				String tem = sunroot.getFirstChild().toString();
				// 则不需要再次设置该子节点，直接返回
				if (!tem.equals("")) {


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

	
	/**
	 * This method initializes jList
	 * 
	 * @return javax.swing.JList
	 */

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

	/**
	 * 运行模块
	 * @version 2012-5-6
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	public void actionModule(Object obdd){
		// 获取菜单对象

		Dmnd_det dd = null;
		String editString = null;

		if (obdd instanceof Dmnd_det) {
			dd = (Dmnd_det) obdd;
		} else {
			editString = (String) obdd;
		}

		if (dd != null) {// 标准菜单对象

			Omnd_det od = new Omnd_det(dd);
			
			if (od.updateDmnd_det()) {
				
				modules.actionModule(dd);
				
			} else {// 不存在该菜单
				JOptionPane.showConfirmDialog(null, "菜单项不存在：" + dd,
						"系统提示", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
			}

		} else {// 非标准菜单对象
			if (Dmnd_det.isRightMenu(editString)) {
				Dmnd_det tempdd = new Dmnd_det();
				if (Dmnd_det.isTopMenu(editString)) {
					int tselect = -1;
					
					try{
						tselect = Integer.parseInt(editString);
					}catch(Exception e){
						
					}
					
					tempdd.setMnd_nbr("0");
					tempdd.setMnd_select(tselect);
					
					
				} else {
					tempdd.setMnd_nbr(Dmnd_det
							.getMnd_nbrOfMenuString(editString));
					tempdd.setMnd_select(Dmnd_det
							.getMnd_selectOfMenuString(editString));
				}
				GLog.d("==="+editString, ""+tempdd);
				Omnd_det tempod = new Omnd_det(tempdd);

				if (tempod.updateDmnd_det()) {
					tempdd = tempod.getDmnd_det();
					modules.actionModule(tempdd);
					
				} else {// 不存在该菜单
					JOptionPane.showConfirmDialog(null, "菜单项不存在："
							+ editString, "系统提示",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE);
				}
			} else {
				JOptionPane.showConfirmDialog(null, "非法菜单格式！ "
						+ editString, "系统提示",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
			}

		}
	}

	@Override
	public void onModulesAction(boolean actionState, String errMsg,
			BaseJInternalFrame baseJInternalFrame) {
		if(!actionState){
			JOptionPane.showConfirmDialog(null, errMsg, "系统提示",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			return;
		}
		
		if(baseJInternalFrame != null){
			//先移除后天添加，由于Modules采用缓存机制，相同的引用add两次会有BUG
			desktopPane.remove(baseJInternalFrame);
			desktopPane.add(baseJInternalFrame);
			
			try {
				
				baseJInternalFrame.setClosable(true);
				baseJInternalFrame.setMaximizable(true);
				baseJInternalFrame.setMaximum(true);
				baseJInternalFrame.setIconifiable(true);
				baseJInternalFrame.setResizable(true);
				baseJInternalFrame.setVisible(true);
				baseJInternalFrame.setSelected(true);
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	/**
	 * 执行所有子模块最小化
	 * @version 2012-5-6
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	public void actionMinAllModule(){

		Map<String, BaseJInternalFrame> map = modules.getModulesCache();
		Collection<BaseJInternalFrame> cs = map.values();
		for (Iterator<BaseJInternalFrame> iterator = cs.iterator(); iterator.hasNext();) {
			BaseJInternalFrame baseJInternalFrame = (BaseJInternalFrame) iterator
					.next();
			if(baseJInternalFrame == null){
				continue;
			}
			try {
				baseJInternalFrame.setIcon(true);
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 关闭所有子模块
	 * @version 2012-5-6
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	public void actionCloseAllModule(){
		
		Map<String, BaseJInternalFrame> map = modules.getModulesCache();
		Collection<BaseJInternalFrame> cs = map.values();
		for (Iterator<BaseJInternalFrame> iterator = cs.iterator(); iterator.hasNext();) {
			BaseJInternalFrame baseJInternalFrame = (BaseJInternalFrame) iterator
					.next();
			if(baseJInternalFrame == null){
				continue;
			}
			try {
				baseJInternalFrame.setClosed(true);
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
} // @jve:decl-index=0:visual-constraint="10,10"
