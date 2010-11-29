package com.gopawpaw.erp.test.qqmenu;

import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JGroupPanel extends JPanel {
	/* ������������������� */
	private JPanel pNorth = new JPanel() {
	};

	private JPanel pCenter = new JPanel();

	private JPanel pSouth = new JPanel();

	ArrayList openFlag = new ArrayList();

	/* ��ǰȫ����ļ��� */
	private ArrayList groupList = new ArrayList();

	/* �Ƿ��ѽ�ֹ������ */
	private boolean forbidFlag = false;

	String[][] str = new String[3][5];

	/* ��ǰ������� */
	private JGroupContainer activeGroup = null;

	transient ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			JButton bttTitle = (JButton) e.getSource();
			expandGroup((JGroupContainer) bttTitle.getParent());
		}
	};

	public boolean hasCreateDefaultGroup = false;

	public JGroupPanel() {
		initComponents();
		createDefaultGroup();
	}

	private void initComponents() {
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		this.add(pNorth, null);
		this.add(pCenter, null);
		this.add(pSouth, null);
		pNorth.setLayout(new GroupLayout());
		pCenter.setLayout(new GroupLayout());
		pSouth.setLayout(new GroupLayout());
		forbidFlag = true;
		System.out.println(this.getComponentCount());
//		System.out.println(this.getGroupCount());
		for (int i = 0; i < 3; i++) {
			openFlag.add(i,Integer.valueOf(0));
		}
	}

	private void createDefaultGroup() {
		// Default Group
		for (int i = 1; i <= 3; i++) {
			insertGroup(i - 1, "Group " + i);

			for (int j = 1; j <= 5; j++) {
				str[i - 1][j - 1] = "Member " + j + "of " + i;
				JButton bttMember = new JButton(str[i - 1][j - 1]);
				bttMember.setActionCommand(str[i - 1][j - 1]);

				addMember(i - 1, bttMember);
				bttMember.setPreferredSize(new Dimension(1, 40));
				bttMember.setOpaque(false);
			}

			getGroup(i - 1).setMemberGap(20, 5);
		}
		// expandGroup(0);
		hasCreateDefaultGroup = true;
	}

	/**
	 * @param groupNames
	 *            String[] Ԥ������
	 */
	public JGroupPanel(String groupNames[]) {
		initComponents();
		addGroup(groupNames);
	}

	/**
	 * չ����
	 * 
	 * @param name
	 *            String ����
	 */
	public void expandGroup(String name) {
		for (int i = getGroupCount() - 1; i >= 0; i--) {
			if (getGroupName(i).equals(name)) {
				expandGroup(i);
			}
		}
	}

	/**
	 * չ����
	 * 
	 * @param index
	 *            int ���˳���
	 */
	public void expandGroup(int index) {
		expandGroup(getGroup(index));
	}

	/**
	 * չ����
	 * 
	 * @param group
	 *            JGroupContainer ��
	 */
	protected void expandGroup(JGroupContainer group) {
		int num = 0;
		pNorth.removeAll();
		pCenter.removeAll();
		pSouth.removeAll();
		boolean hasAddCenter = false;
		for (int i = 0; i < groupList.size(); i++) {
			Component c = (Component) groupList.get(i);
			if (openFlag.get(i) == Integer.valueOf(0)) {
				if (hasAddCenter) {
					pSouth.add(c);
				} else if (c == group) {
					pCenter.add(c, BorderLayout.CENTER);
					openFlag.add(i, Integer.valueOf(1));
					num = i + 1;
					hasAddCenter = true;
				} else {
					pNorth.add(c);
				}
			} else {
				if (activeGroup != null) {
					activeGroup.collapse();
					activeGroup = null;
				}
				if (c == group) {
					pNorth.add(c);
				} else if (num == 0) {
					pNorth.add(c);
				} else if (num > i + 1) {
					pNorth.add(c);
				} else {
					pSouth.add(c);
				}
				openFlag.add(i, Integer.valueOf(0));
				
			}
		}
		if (activeGroup != null) {
			activeGroup.collapse();
		}
		for (int i = 0; i < groupList.size(); i++) {
			Component c = (Component) groupList.get(i);
			if (c == group && openFlag.get(i) == Integer.valueOf(1)) {
				activeGroup = group;
				activeGroup.expand();
			}
		}
		pNorth.doLayout();
		pCenter.doLayout();
		pSouth.doLayout();
		doLayout();
	}

	/**
	 * ������
	 * 
	 * @param name
	 *            String ����
	 */
	public void collapseGroup(String name) {
		for (int i = getGroupCount() - 1; i >= 0; i--) {
			if (getGroupName(i).equals(name)) {
				collapseGroup(i);
			}
		}
	}

	/**
	 * ������
	 * 
	 * @param index
	 *            int ���˳���
	 */
	public void collapseGroup(int index) {
		collapseGroup(getGroup(index));
	}

	/**
	 * ������
	 * 
	 * @param group
	 *            JGroupContainer ��
	 */
	protected void collapseGroup(JGroupContainer group) {
		if (group == activeGroup) {
			activeGroup.collapse();
			activeGroup = null;
		}
	}

	/**
	 * �����
	 * 
	 * @param name
	 *            String ����
	 */
	public void addGroup(String name) {
		this.insertGroup(getGroupCount(), name);
	}

	/**
	 * ��Ӷ����
	 * 
	 * @param names
	 *            String[] ����
	 */
	public void addGroup(String names[]) {
		for (int i = 0; i < names.length; i++) {
			addGroup(names[i]);
		}
	}

	/**
	 * ����һ����
	 * 
	 * @param index
	 *            int ˳���
	 * @param name
	 *            String ����
	 * @param bg
	 *            Color ����ɫ
	 */
	public void insertGroup(int index, String name, Color bg) {
		if (index < 0 || index > groupList.size()) {
			throw new ArrayIndexOutOfBoundsException("index:" + index
					+ " >count:" + groupList.size());
		}
		if (hasCreateDefaultGroup) {
			while (getGroupCount() > 0) {
				removeGroup(0);
			}
			hasCreateDefaultGroup = false;
		}
		int countNorth = pNorth.getComponentCount();
		int countCenter = pCenter.getComponentCount();
		int countSouth = pSouth.getComponentCount();
		JGroupContainer group;
		if (index <= countNorth) {
			group = insertGroup(pNorth, index, name, bg);
		} else if (index <= countNorth + countCenter) {
			group = insertGroup(pCenter, index - countNorth, name, bg);
		} else if (index <= countNorth + countCenter + countSouth) {
			group = insertGroup(pSouth, index - countNorth - countCenter, name,
					bg);
		} else {
			group = insertGroup(pSouth, countSouth, name, bg);
		}
		group.getTitleButton().addActionListener(al);
		groupList.add(index, group);

	}

	/**
	 * ����һ����
	 * 
	 * @param index
	 *            int ˳���
	 * @param name
	 *            String ����
	 */
	public void insertGroup(int index, String name) {
		insertGroup(index, name, UIManager.getColor("Desktop.background"));
	}

	/**
	 * ����һ����
	 * 
	 * @param p
	 *            JPanel Ŀ�����
	 * @param index
	 *            int ˳���
	 * @param name
	 *            String ����
	 * 
	 * 
	 *            /** ����һ����
	 * @param p
	 *            JPanel Ŀ�����
	 * @param index
	 *            int ˳���
	 * @param name
	 *            String ����
	 * @return JGroupContainer
	 */
	private JGroupContainer insertGroup(JPanel p, int index, String name,
			Color bg) {
		JGroupContainer group = new JGroupContainer(name, bg);
		p.add(group);
		return group;
	}

	/**
	 * ɾ��һ����
	 * 
	 * @param index
	 *            int ˳���
	 */
	public void removeGroup(int index) {
		JGroupContainer c = (JGroupContainer) groupList.get(index);
		c.getParent().remove(c);
		c.getTitleButton().removeActionListener(al);
	}

	/**
	 * ɾ��һ����
	 * 
	 * @param name
	 *            String ����
	 */
	public void removeGroup(String name) {
		for (int i = getGroupCount() - 1; i >= 0; i--) {
			if (getGroupName(i).equals(name)) {
				this.removeGroup(i);
			}
		}
	}

	/**
	 * ��������
	 * 
	 * @param index
	 *            int ˳���
	 * @param name
	 *            String ����
	 */
	public void setGroupName(int index, String name) {
		this.getGroup(index).setName(name);
	}

	/**
	 * ȡ������
	 * 
	 * @param groupIndex
	 *            int ˳���
	 * @return String ����
	 */
	public String getGroupName(int groupIndex) {
		return getGroup(groupIndex).getName();
	}

	/**
	 * ȡ��ȫ������
	 * 
	 * @return String[]
	 */
	public String[] getGroupNames() {
		String sResult[] = new String[getGroupCount()];
		for (int i = 0; i < getGroupCount(); i++) {
			sResult[i] = getGroupName(i);
		}
		return sResult;
	}

	/**
	 * ȡ�õ�ǰ�������
	 * 
	 * @return int
	 */
	public int getGroupCount() {
		return groupList.size();
	}

	/**
	 * ��������ӳ�Ա���
	 * 
	 * @param groupIndex
	 *            int ���˳���
	 * @param member
	 *            Component ��Ա���
	 */
	public void addMember(int groupIndex, Component member) {
		getGroup(groupIndex).addMember(getGroup(groupIndex).getMemberCount(),
				member);
	}

	/**
	 * �����в����Ա���
	 * 
	 * @param groupIndex
	 *            int ���˳���
	 * @param memberIndex
	 *            int �����˳���
	 * @param member
	 *            Component ��Ա���
	 */
	public void insertMember(int groupIndex, int memberIndex, Component member) {
		getGroup(groupIndex).addMember(memberIndex, member);
	}

	/**
	 * �������Ƴ���Ա���
	 * 
	 * @param groupIndex
	 *            int
	 * @param memberIndex
	 *            int
	 */
	public void removeMember(int groupIndex, int memberIndex) {
		getGroup(groupIndex).removeMember(memberIndex);
	}

	/**
	 * ȡ�ó�Ա���
	 * 
	 * @param groupIndex
	 *            int ���˳���
	 * @param memberIndex
	 *            int ��Ա�����˳���
	 * @return Component ��Ա���
	 */
	public Component getMember(int groupIndex, int memberIndex) {
		return getGroup(groupIndex).getMember(memberIndex);
	}

	/**
	 * ȡ��ȫ����Ա���
	 * 
	 * @param groupIndex
	 *            int ���˳���
	 * @return Component[] ȫ����Ա���
	 */
	public Component[] getMembers(int groupIndex) {
		return getGroup(groupIndex).getMembers();
	}

	/**
	 * ȡ�ó�Ա���������
	 * 
	 * @param groupIndex
	 *            int ���˳���
	 * @return int ����
	 */
	public int getMemberCount(int groupIndex) {
		return getGroup(groupIndex).getMemberCount();
	}

	/**
	 * ȡ����
	 * 
	 * @param index
	 *            int ���˳���
	 * @return JGroupContainer ��
	 */
	protected JGroupContainer getGroup(int index) {
		return (JGroupContainer) groupList.get(index);
	}

	/**
	 * ��д��addImpl����,��ֹ����JGroupPane��������
	 * 
	 * @param comp
	 *            Component
	 * @param constraints
	 *            Object
	 * @param index
	 *            int
	 */
	protected void addImpl(Component comp, Object constraints, int index) {
		if (forbidFlag) {
			if (!(comp instanceof JGroupContainer)) {
				throw new UnsupportedOperationException(
						"JGroupPane can't add component!");
			}
		} else {
			super.addImpl(comp, constraints, index);
		}
	}

	/**
	 * <p>
	 * Title: OpenSwing
	 * </p>
	 * <p>
	 * Description: ����岼�ֹ�����
	 * </p>
	 * <p>
	 * Copyright: Copyright (c) 2004
	 * </p>
	 * <p>
	 * Company:
	 * </p>
	 * 
	 * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
	 * @version 1.0
	 */
	class GroupLayout implements LayoutManager, java.io.Serializable {
		int vgap = 0;

		int hgap = 0;

		public GroupLayout() {
		}

		public GroupLayout(int hg, int vg) {
			this.hgap = hg;
			this.vgap = vg;
		}

		public void addLayoutComponent(String name, Component comp) {
		}

		public void removeLayoutComponent(Component comp) {
		}

		public Dimension preferredLayoutSize(Container parent) {
			synchronized (parent.getTreeLock()) {
				Insets insets = parent.getInsets();
				int ncomponents = parent.getComponentCount();
				int w = 0;
				int h = 0;
				for (int i = 0; i < ncomponents; i++) {
					Component comp = parent.getComponent(i);
					Dimension d = comp.getPreferredSize();
					if (w < d.width) {
						w = d.width;
					}
					h += d.height + vgap;
				}
				return new Dimension(insets.left + insets.right + w + 2 * hgap,
						insets.top + insets.bottom + h + 2 * vgap);
			}
		}

		public Dimension minimumLayoutSize(Container parent) {
			return preferredLayoutSize(parent);
		}

		public void layoutContainer(Container parent) {
			synchronized (parent.getTreeLock()) {
				Insets insets = parent.getInsets();
				int ncomponents = parent.getComponentCount();
				if (ncomponents == 0) {
					return;
				}
				int y = insets.top + vgap;
				for (int c = 0; c < ncomponents; c++) {
					int h = parent.getComponent(c).getPreferredSize().height;
					parent.getComponent(c).setBounds(
							insets.left + hgap,
							y,
							parent.getWidth() - insets.left - insets.right - 2
									* hgap, h);
					y += h + vgap;
				}
			}
		}

		public String toString() {
			return getClass().getName();
		}
	}

	/**
	 * <p>
	 * Title: OpenSwing
	 * </p>
	 * <p>
	 * Description: ��
	 * </p>
	 * <p>
	 * Copyright: Copyright (c) 2004
	 * </p>
	 * <p>
	 * Company:
	 * </p>
	 * 
	 * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
	 * @version 1.0
	 */
	class JGroupContainer extends JPanel {
		private JButton bttGroupTitle = new JButton();

		private JPanel pMembers = new JPanel();

		// private JScrollPane sp;
		public JGroupContainer() {
			this("");
		}

		public JGroupContainer(String name) {
			this(name, UIManager.getColor("Desktop.background"));
		}

		/**
		 * @param name
		 *            String ����
		 * @param background
		 *            Color ��Ա���������屳��ɫ
		 */
		public JGroupContainer(String name, Color background) {
			bttGroupTitle.setText(name);
			bttGroupTitle.setFocusable(false);
			pMembers.setLayout(new GroupLayout(5, 5));
			this.setLayout(new BorderLayout());
			this.add(bttGroupTitle, BorderLayout.NORTH);

			// pMembers.setBackground(background);

			Color thumbColor = UIManager.getColor("ScrollBar.thumb");
			Color trackColor = UIManager.getColor("ScrollBar.track");
			Color trackHighlightColor = UIManager
					.getColor("ScrollBar.trackHighlight");

			UIManager.put("ScrollBar.thumb", background);
			UIManager.put("ScrollBar.track", background);
			UIManager.put("ScrollBar.trackHighlight", background);
			/*
			 * sp = new JScrollPane(pMembers); sp.setHorizontalScrollBarPolicy(
			 * JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			 */
			this.add(pMembers, BorderLayout.CENTER);
			collapse();
			UIManager.put("ScrollBar.thumb", thumbColor);
			UIManager.put("ScrollBar.track", trackColor);
			UIManager.put("ScrollBar.trackHighlight", trackHighlightColor);

		}

		/**
		 * ���ü��
		 * 
		 * @param hgap
		 *            int ����
		 * @param vgap
		 *            int �����
		 */
		public void setMemberGap(int hgap, int vgap) {
			pMembers.setLayout(new GroupLayout(hgap, vgap));
		}

		/**
		 * ȡ����ı��ⰴť
		 * 
		 * @return JButton
		 */
		public JButton getTitleButton() {
			return bttGroupTitle;
		}

		/**
		 * ȡ����ĳ�Ա������
		 * 
		 * @return JPanel
		 */
		public JPanel getMembersContainer() {
			return pMembers;
		}

		/**
		 * ������
		 */
		public void collapse() {
			pMembers.setVisible(false);
			this.revalidate();
		}

		/**
		 * չ����
		 */
		public void expand() {
			pMembers.setVisible(true);
			this.revalidate();
		}

		/**
		 * ��������
		 * 
		 * @param name
		 *            String ����
		 */
		public void setName(String name) {
			bttGroupTitle.setText(name);
		}

		/**
		 * ȡ������
		 * 
		 * @return String
		 */
		public String getName() {
			return bttGroupTitle.getText();
		}

		/**
		 * ���һ����Ա���
		 * 
		 * @param index
		 *            int ˳���
		 * @param c
		 *            Component ��Ա���
		 */
		public void addMember(int index, Component c) {
			pMembers.add(c, index);
			pMembers.doLayout();
		}

		/**
		 * ɾ��һ����Ա���
		 * 
		 * @param index
		 *            int ˳���
		 */
		public void removeMember(int index) {
			pMembers.remove(index);
			pMembers.doLayout();
		}

		/**
		 * ȡ��һ����Ա���
		 * 
		 * @param index
		 *            int ˳���
		 * @return Component ��Ա���
		 */
		public Component getMember(int index) {
			return pMembers.getComponent(index);
		}

		/**
		 * ȡ��ȫ����Ա���
		 * 
		 * @return Component[] ��Ա���
		 */
		public Component[] getMembers() {
			Component coms[] = new Component[getMemberCount()];
			for (int i = 0; i < coms.length; i++) {
				coms[i] = pMembers.getComponent(i);
			}
			return coms;
		}

		/**
		 * ȡ�ó�Ա�������
		 * 
		 * @return int ����
		 */
		public int getMemberCount() {
			return pMembers.getComponentCount();
		}

		/**
		 * ��д��toString����
		 * 
		 * @return String
		 */
		public String toString() {
			return getName();
		}
	}

	/**
	 * /** ���Գ���
	 * 
	 * @param args
	 *            String[]
	 */
	public static void main(String[] args) {
		try {
			String windowsClassName = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
			UIManager.setLookAndFeel((LookAndFeel) Class.forName(
					windowsClassName).newInstance());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFrame frame = new JFrame("JGroupPanel Demo");
		frame.getContentPane().setLayout(new BorderLayout());
		
		JGroupPanel jgp = new JGroupPanel();
		int n = jgp.getGroupCount();
		
//		for(int i=0;i<n;i++){
//			jgp.removeGroup(i);
//		}
//		JPanel jp001= new JPanel();
//		jp001.setLayout(new BorderLayout());
//		jp001.add(new JButton("kk"),BorderLayout.CENTER);
//		jgp.insertGroup(jp001, 0, "eeeeeee", Color.blue);
//		jgp.getGroup(0).setMemberGap(20, 5);
		
		
		frame.getContentPane().add(jgp, BorderLayout.CENTER);
		frame.setSize(150, 600);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(d.width - frame.getSize().width - 10, 10);
		frame.setVisible(true);
	}
}
