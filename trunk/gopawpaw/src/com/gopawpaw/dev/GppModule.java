/**
 * 
 */
package com.gopawpaw.dev;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import com.gopawpaw.dev.common.GppPanelFreeOrder;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JList;
import java.awt.Frame;
import java.applet.Applet;
import java.awt.GridBagLayout;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.TextArea;

/**
 * @version 2009-10-8
 * @author �����
 */
public class GppModule implements GppModuleActionListener{

	private String mitem = null; // @jve:decl-index=0:
	private JList jList = null; // @jve:decl-index=0:visual-constraint="515,52"
	private DefaultListModel ModelList = new DefaultListModel();
	private GppModuleActionListener gppModuleActionListener = null; // @jve:decl-index=0:
	/**
	 * 
	 */
	public GppModule() {

		init();
	}

	private void init() {

	}

	/**
	 * ��ȡģ�鵼�����
	 * 
	 * @return �������
	 */
	public JPanel getModuleNav() {
		String[] arrmitem = this.mitem.split("\\.");

		if (this.mitem.equals("0")
				|| (arrmitem.length == 2 && arrmitem[0].equals("A"))) {

			GppPanelFreeOrder gppPanel = new GppPanelFreeOrder(
					GppPanelFreeOrder.Y_AXIS, 4);
			gppPanel.setAlignmentY(GppPanelFreeOrder.TOP);

			GppSQL gppsql = new GppSQL();
			final ResultSet rst = gppsql
					.query("select * from gpp_module where modID like 'A.%' and modID not like 'A.%.%'");

			try {
				while (rst.next()) {
					final String tempmodID = rst.getString("modID");
					JButton tempjButton = new JButton(rst.getString("modName"));
					tempjButton
							.addMouseListener(new java.awt.event.MouseAdapter() {
								@Override
								public void mouseClicked(
										java.awt.event.MouseEvent e) {
									gppModuleActionListener
											.actionGppModule(tempmodID);
								}
							});

					gppPanel.add(tempjButton);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			gppsql.close();

			return gppPanel.getGppPanel();
		} else if (arrmitem.length == 3 && arrmitem[0].equals("A")) {
			GppPanelFreeOrder gppPanel = new GppPanelFreeOrder(
					GppPanelFreeOrder.Y_AXIS, 4);
			gppPanel.setAlignmentY(GppPanelFreeOrder.TOP);
			// -------------------------
			// ���˵�
			final String tempmit0 = "0";
			JButton tempjButton = new JButton(this.getModName(tempmit0));
			tempjButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					gppModuleActionListener.actionGppModule(tempmit0);
				}
			});

			gppPanel.add(tempjButton);

			// -------------------------
			// ����˵�
			final String tempmit1 = "A." + arrmitem[1];
			JButton tempjButton1 = new JButton(this.getModName(tempmit1));
			tempjButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					gppModuleActionListener.actionGppModule(tempmit1);
				}
			});

			gppPanel.add(tempjButton1);

			// -------------------------
			// �����˵�
			final String tempmit2 = this.mitem;
			JButton tempjButton2 = new JButton(this.getModName(this
					.getModAction(tempmit2)));
			tempjButton2.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					gppModuleActionListener.actionGppModule(tempmit2);
				}
			});

			gppPanel.add(tempjButton2);

			// -------------------------
			return gppPanel.getGppPanel();
		} else {
			// N���Ӳ˵�
			GppPanelFreeOrder gppPanel = new GppPanelFreeOrder(
					GppPanelFreeOrder.Y_AXIS, 100);
			gppPanel.setAlignmentY(GppPanelFreeOrder.TOP);
			// -------------------------
			// ���˵�
			final String tempmit0 = "0";
			JButton tempjButton = new JButton(this.getModName(tempmit0));
			tempjButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					gppModuleActionListener.actionGppModule(tempmit0);
				}
			});

			gppPanel.add(tempjButton);

			// -------------------------
			// ����˵�
			final String tempmit1 = "A." + arrmitem[0];
			JButton tempjButton1 = new JButton(this.getModName(tempmit1));
			tempjButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					gppModuleActionListener.actionGppModule(tempmit1);
				}
			});

			gppPanel.add(tempjButton1);

			// -------------------------
			// �Ӳ˵�
			String temp = null;
			int n = arrmitem.length;
			for (int i = 0; i < n; i++) {
				if (temp == null) {
					temp = arrmitem[i];
				} else {
					temp += "." + arrmitem[i];
				}

				final String tempmit = temp;
				JButton tempjButton2 = new JButton(this.getModName(tempmit));
				tempjButton2
						.addMouseListener(new java.awt.event.MouseAdapter() {
							@Override
							public void mouseClicked(java.awt.event.MouseEvent e) {
								gppModuleActionListener
										.actionGppModule(tempmit);
							}
						});

				gppPanel.add(tempjButton2);
			}
			// -------------------------
			return gppPanel.getGppPanel();
		}
	}

	/**
	 * ��ȡ�����б�
	 * 
	 * @return ģ�鹦���б�
	 */
	public JList getModuleList() {
		String[] arrmitem = this.mitem.split("\\.");

		if (this.mitem.equals("0")) {

			((DefaultListModel) getJList().getModel()).removeAllElements();
		} else if (arrmitem.length == 2 && arrmitem[0].equals("A")) {

			GppSQL gppsql = new GppSQL();
			ResultSet rst = gppsql
					.query("select * from gpp_module where modID like '"
							+ this.mitem + ".%' order by orderby");

			try {
				while (rst.next()) {
					String temp = rst.getString("modAction");
					addModuleData(temp, getModName(temp), isHaveChild(temp));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			gppsql.close();
		} else {
			String sqllike = null;

			// �Ƿ����¼�
			if (!this.isHaveChild(this.mitem)) {

				int n = arrmitem.length - 1;
				for (int i = 0; i < n; i++) {
					if (sqllike == null) {
						sqllike = arrmitem[i];
					} else {
						sqllike += "." + arrmitem[i];
					}
				}
				// ��������mitem,�Ա㲻ˢ��ģ�鹦���б�
				this.mitem = sqllike;
				arrmitem = this.mitem.split("\\.");
			} else {
				sqllike = getModAction(this.mitem);
			}

			GppSQL gppsql = new GppSQL();
			String tempsql = "select * from gpp_module where modID like '"
					+ sqllike + ".%' order by orderby";

			ResultSet rst = gppsql.query(tempsql);
			this.mitem = getModAction(this.mitem);

			arrmitem = this.mitem.split("\\.");
			try {
				while (rst.next()) {
					String tempmodID = rst.getString("modID");
					String[] tempmodIDarr = tempmodID.split("\\.");

					// �ж��Ƿ����ڸò˵��¼����ܲ˵�
					if ((arrmitem.length + 1) == tempmodIDarr.length) {

						addModuleData(tempmodIDarr[tempmodIDarr.length - 1],
								rst.getString("modName"),
								isHaveChild(tempmodID));
					}

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			gppsql.close();
		}
		return getJList();
	}

	/**
	 * ִ�в˵�����
	 * 
	 * @param mitem
	 *            �˵���
	 * @return ִ�н��
	 */
	public boolean actionModule(String mitem) {
		this.mitem = mitem;
		if (!isHaveChild(mitem)) {
			// ִ�г�������
			System.out.println("GppModule.actionModule()-ִ�г���"
					+ this.getModAction(mitem));
			return true;
		} else {
			// �����¼��˵�
			System.out.println("GppModule.actionModule()-����˵���" + mitem);
			return true;
		}

	}

	/**
	 * �ж��Ƿ�����һ���Ӳ˵�
	 * 
	 * @param mitem
	 *            �˵���
	 * @return �����Ӳ˵���true��, �������Ӳ˵���false��
	 */
	public boolean isHaveChild(String mitem) {
		boolean ret = false;
		String mitem0 = this.getModAction(mitem);

		String[] arrmitem = mitem0.split("\\.");
		if (arrmitem[arrmitem.length - 1].equals("jar")) {
			ret = false;
		} else {
			ret = true;
		}

		return ret;
	}

	/**
	 * This method initializes jList
	 * 
	 * @return javax.swing.JList
	 */
	public JList getJList() {
		if (jList == null) {

			jList = new JList(ModelList);

			jList.setSize(new Dimension(135, 52));
			jList.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {

					String temp2 = null;
					temp2 = (String) jList.getSelectedValue();

					if (temp2 == null) {
						return;
					}
					String temp = mitem + "."
							+ unconvertModuleDataPrefix(temp2);

					if (e.getClickCount() == 2) {
						gppModuleActionListener.actionGppModule(temp);
					}
				}
			});
			GppKeyListener tempGppKeyListener = new GppKeyListener(jList);
			tempGppKeyListener.addGppModuleActionListener(this);
			jList.addKeyListener(tempGppKeyListener);
//			jList.addKeyListener(new KeyListener() {
//				public void keyPressed(KeyEvent e) {
//					
//					if(e.getKeyCode() == 10){
//						String temp2 = null;
//						temp2 = (String) jList.getSelectedValue();
//
//						if (temp2 == null) {
//							return;
//						}
//						String temp = mitem + "."
//								+ unconvertModuleDataPrefix(temp2);
//						gppModuleActionListener.actionGppModule(temp);
//						
//					}
//				}
//
//				public void keyReleased(KeyEvent e) {
//				}
//
//				public void keyTyped(KeyEvent e) {
//				}
//			});
		}
		return jList;
	}

	/**
	 * ��ȡģ������
	 * 
	 * @param modid
	 *            ģ��ID
	 * @return ģ������
	 */
	private String getModName(String modid) {
		String retstr = null;

		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql
				.query("select modName from gpp_module where modID = '" + modid
						+ "'");

		try {
			while (rst.next()) {
				retstr = rst.getString("modName");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		gppsql.close();

		return retstr;
	}

	/**
	 * ��ȡģ��ִ�г���
	 * 
	 * @param modid
	 *            ģ��ID
	 * @return ִ�г�������
	 */
	private String getModAction(String modid) {
		String retstr = null;

		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql
				.query("select modAction from gpp_module where modID = '"
						+ modid + "'");

		try {
			while (rst.next()) {
				retstr = rst.getString("modAction");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		gppsql.close();

		return retstr;
	}

	/**
	 * ���ʵ��GppModuleActionListener�Ķ���
	 * 
	 * @param gm
	 *            GppModuleActionListener ����
	 */
	public void addGppModuleActionListener(GppModuleActionListener gm) {
		this.gppModuleActionListener = gm;
	}

	/**
	 * �������б���ӹ��ܲ˵�
	 * 
	 * @param nowmodid
	 *            ģ��ID
	 * @param nowmodname
	 *            ģ������
	 * @param nowhavechild
	 *            �Ƿ����¼�ģ��
	 */
	private void addModuleData(String nowmodid, String nowmodname,
			boolean nowhavechild) {
		String tempstr = "";
		if (nowhavechild) {
			tempstr = " ... ";
		}
		((DefaultListModel) getJList().getModel())
				.addElement(convertModuleDataPrefix(nowmodid) + nowmodname
						+ tempstr);
	}

	/**
	 * ����ǰ���ת��ΪҪ��ʾ��ǰ׺
	 * 
	 * @param moddata
	 *            ģ�����ݣ��磺�˵�Ϊ1.2.5���� modata Ϊ 5 ���� 1.2.5
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
	 * ������ȡģ������ǰ׺
	 * 
	 * @param modname
	 * @return
	 */
	private String unconvertModuleDataPrefix(String modname) {
		String[] temparr = modname.split(" - ");

		return temparr[0].trim();
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppModuleActionListener#actionGppModule(java.lang.String)
	 */
	@Override
	public boolean actionGppModule(String modid) {
		String temp = mitem + "."+ unconvertModuleDataPrefix(modid);
		
		gppModuleActionListener.actionGppModule(temp);
		return false;
	}
}
