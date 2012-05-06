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
 * @author �����
 * 
 */
public class MainPanelTree extends JPanel implements ModulesListener{
	private static final String TAG = MainPanelTree.class.getSimpleName();
	private static final long serialVersionUID = 1L;
	private JSplitPane jSplitPane = null;
	private JPanel jPanel = null;

	private JGroupPanel jGroupPanel = null;

	/**
	 * ģ�����ж���
	 */
	private Modules modules = null;  //  @jve:decl-index=0:

	/**
	 * ģ������������
	 */
	private JDesktopPane desktopPane;
	
	/**
	 * ģ�鱳��ͼƬ
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
				
				//ȷ��ͼƬ����ʧ��ʱ�������¼���
				private boolean isInitImage = false;
				
				public void paintComponent(Graphics g){ 
					super.paintComponent(g);
					
					if(backgroundImage == null && !isInitImage){
						try {
				            backgroundImage = ImageIO.read(new File(BACKGROUND_MODULE_IMG_PATH));
				        } catch (IOException e) {
				            System.out.println("�޷���ȡ����ͼƬ");
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
	 * ��ȡ���˵�����
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
						// ����Ҫ�ٴ����ø��ӽڵ㣬ֱ�ӷ���
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
						// // �������ӽڵ㣬�򷵻�
						// if (!dd3.isHaveChild()) {
						// return;
						// }
						//
						// String tem = sunroot.getFirstChild().toString();
						//
						// // ����Ҫ�ٴ����ø��ӽڵ㣬ֱ�ӷ���
						// if (tem != null) {
						//
						// int n = sunroot.getChildCount();
						// // ����б��ӽڵ�
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

				// �������ӽڵ㣬�򷵻�
				if (!dd3.isHaveChild()) {
					if (e.getClickCount() >= 2 ) {
						//˫���¼�
						modules.actionModule(dd3);
					}
					
					return;
				}

				String tem = sunroot.getFirstChild().toString();
				// ����Ҫ�ٴ����ø��ӽڵ㣬ֱ�ӷ���
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
	 * �������ӽڵ�
	 */
	private void setTreeSunRoot(Dmnd_det dd, DefaultMutableTreeNode root,
			final JTree roottree) {
		// ������ӽڵ�
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
	 * �������ӽڵ�
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
	 * ����ģ��
	 * @version 2012-5-6
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	public void actionModule(Object obdd){
		// ��ȡ�˵�����

		Dmnd_det dd = null;
		String editString = null;

		if (obdd instanceof Dmnd_det) {
			dd = (Dmnd_det) obdd;
		} else {
			editString = (String) obdd;
		}

		if (dd != null) {// ��׼�˵�����

			Omnd_det od = new Omnd_det(dd);
			
			if (od.updateDmnd_det()) {
				
				modules.actionModule(dd);
				
			} else {// �����ڸò˵�
				JOptionPane.showConfirmDialog(null, "�˵�����ڣ�" + dd,
						"ϵͳ��ʾ", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
			}

		} else {// �Ǳ�׼�˵�����
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
					
				} else {// �����ڸò˵�
					JOptionPane.showConfirmDialog(null, "�˵�����ڣ�"
							+ editString, "ϵͳ��ʾ",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE);
				}
			} else {
				JOptionPane.showConfirmDialog(null, "�Ƿ��˵���ʽ�� "
						+ editString, "ϵͳ��ʾ",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
			}

		}
	}

	@Override
	public void onModulesAction(boolean actionState, String errMsg,
			BaseJInternalFrame baseJInternalFrame) {
		if(!actionState){
			JOptionPane.showConfirmDialog(null, errMsg, "ϵͳ��ʾ",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			return;
		}
		
		if(baseJInternalFrame != null){
			//���Ƴ�������ӣ�����Modules���û�����ƣ���ͬ������add���λ���BUG
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
	 * ִ��������ģ����С��
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
	 * �ر�������ģ��
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
