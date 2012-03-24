/**
 * 
 */
package com.gopawpaw.frame.dataEntity;

/**
 * @version 2010-3-4
 * @author 李锦华
 * 
 */
public class Dmnd_det {

	/**
	 * The number assigned to menu
	 */
	private String mnd_nbr;
	/**
	 * 
	 */
	private int mnd_select;
	/**
	 * 
	 */
	private java.lang.String mnd_label;
	/**
	 * 
	 */
	private java.lang.String mnd_exec;
	/**
	 * 
	 */
	private int mnd_fkey;
	/**
	 * 
	 */
	private java.lang.String mnd_help;
	/**
	 * 
	 */
	private java.lang.String mnd_canrun;
	/**
	 * 
	 */
	private java.lang.String mnd_name;
	/**
	 * 
	 */
	private java.lang.String mnd_user1;
	/**
	 * 
	 */
	private java.lang.String mnd_user2;
	/**
	 * 
	 */
	private java.lang.String mnd__qadc01;
	/**
	 * 
	 */
	private double oid_mnd_det;
	/**
	 * 
	 */
	private java.lang.String mnd_uri;
	/**
	 * 
	 */
	private boolean isHaveChild = false;

	/**
	 * 
	 */
	public Dmnd_det() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 判断是否是有效的菜单格式
	 */
	public static boolean isRightMenu(String menuitem) {
		boolean retb = false;
		
		if (menuitem == null || menuitem.isEmpty()) {
			retb = false;
		} else {
			
			if (menuitem.split("\\.").length == 1) {
				retb = true;
			} else {
				String tem = "";
				String[] str = menuitem.split("\\.");

				tem = str[str.length - 1];
				tem = tem.trim();
				retb = true;
				try {
					Integer.parseInt(tem);
				} catch (NumberFormatException e) {
					retb = false;
				}
				
			}
		}

		return retb;
	}

	/**
	 * 判断菜单项（3.6）是否为顶级菜单
	 */
	public static boolean isTopMenu(String menuitem) {
		boolean retb = false;

		if (menuitem == null || menuitem.isEmpty()) {
			retb = true;
		} else {
			int ii = menuitem.split("\\.").length;
			if (ii == 1) {
				retb = true;
			} else {
				retb = false;
			}
		}

		return retb;
	}

	/**
	 * 从菜单项字符串中获取mnd_nbr 如：3.6.18 中的3.6
	 */
	public static String getMnd_nbrOfMenuString(String menuitem) {
		String rets = "";

		if (isTopMenu(menuitem)) {
			rets = menuitem;
		} else {
			String tem = null;
			String[] str = menuitem.split("\\.");
			for (int i = 0; i < str.length - 1; i++) {
				if (tem == null) {
					tem = str[i];
				} else {
					tem = tem + "." + str[i];
				}
			}
			rets = tem;
		}

		return rets;
	}

	/**
	 * 从菜单项字符串中获取mnd_select 如：3.6.18 中的 18
	 */
	public static int getMnd_selectOfMenuString(String menuitem) {
		int reti = -1;

		if(!isRightMenu(menuitem)){
			return -1;
		}
		
		if (isTopMenu(menuitem)) {
			reti = -1;
		} else {
			String tem = "";
			String[] str = menuitem.split("\\.");

			tem = str[str.length - 1];

			reti = Integer.valueOf(tem);
		}

		return reti;
	}

	/**
	 * @return the mnd_nbr
	 */
	public String getMnd_nbr() {
		return mnd_nbr;
	}

	/**
	 * @param mndNbr
	 *            the mnd_nbr to set
	 */
	public void setMnd_nbr(String mndNbr) {
		mnd_nbr = mndNbr;
	}

	/**
	 * @return the mnd_select
	 */
	public int getMnd_select() {
		return mnd_select;
	}

	/**
	 * @param mndSelect
	 *            the mnd_select to set
	 */
	public void setMnd_select(int mndSelect) {
		mnd_select = mndSelect;
	}

	/**
	 * @return the mnd_label
	 */
	public java.lang.String getMnd_label() {
		return mnd_label;
	}

	/**
	 * @param mndLabel
	 *            the mnd_label to set
	 */
	public void setMnd_label(java.lang.String mndLabel) {
		mnd_label = mndLabel;
	}

	/**
	 * @return the mnd_exec
	 */
	public java.lang.String getMnd_exec() {
		return mnd_exec;
	}

	/**
	 * @param mndExec
	 *            the mnd_exec to set
	 */
	public void setMnd_exec(java.lang.String mndExec) {
		mnd_exec = mndExec;
	}

	/**
	 * @return the mnd_fkey
	 */
	public int getMnd_fkey() {
		return mnd_fkey;
	}

	/**
	 * @param mndFkey
	 *            the mnd_fkey to set
	 */
	public void setMnd_fkey(int mndFkey) {
		mnd_fkey = mndFkey;
	}

	/**
	 * @return the mnd_help
	 */
	public java.lang.String getMnd_help() {
		return mnd_help;
	}

	/**
	 * @param mndHelp
	 *            the mnd_help to set
	 */
	public void setMnd_help(java.lang.String mndHelp) {
		mnd_help = mndHelp;
	}

	/**
	 * @return the mnd_canrun
	 */
	public java.lang.String getMnd_canrun() {
		return mnd_canrun;
	}

	/**
	 * @param mndCanrun
	 *            the mnd_canrun to set
	 */
	public void setMnd_canrun(java.lang.String mndCanrun) {
		mnd_canrun = mndCanrun;
	}

	/**
	 * @return the mnd_name
	 */
	public java.lang.String getMnd_name() {
		return mnd_name;
	}

	/**
	 * @param mndName
	 *            the mnd_name to set
	 */
	public void setMnd_name(java.lang.String mndName) {
		mnd_name = mndName;
	}

	/**
	 * @return the mnd_user1
	 */
	public java.lang.String getMnd_user1() {
		return mnd_user1;
	}

	/**
	 * @param mndUser1
	 *            the mnd_user1 to set
	 */
	public void setMnd_user1(java.lang.String mndUser1) {
		mnd_user1 = mndUser1;
	}

	/**
	 * @return the mnd_user2
	 */
	public java.lang.String getMnd_user2() {
		return mnd_user2;
	}

	/**
	 * @param mndUser2
	 *            the mnd_user2 to set
	 */
	public void setMnd_user2(java.lang.String mndUser2) {
		mnd_user2 = mndUser2;
	}

	/**
	 * @return the mnd__qadc01
	 */
	public java.lang.String getMnd__qadc01() {
		return mnd__qadc01;
	}

	/**
	 * @param mndQadc01
	 *            the mnd__qadc01 to set
	 */
	public void setMnd__qadc01(java.lang.String mndQadc01) {
		mnd__qadc01 = mndQadc01;
	}

	/**
	 * @return the oid_mnd_det
	 */
	public double getOid_mnd_det() {
		return oid_mnd_det;
	}

	/**
	 * @param oidMndDet
	 *            the oid_mnd_det to set
	 */
	public void setOid_mnd_det(double oidMndDet) {
		oid_mnd_det = oidMndDet;
	}

	/**
	 * @return the mnd_uri
	 */
	public java.lang.String getMnd_uri() {
		return mnd_uri;
	}

	/**
	 * @param mndUri
	 *            the mnd_uri to set
	 */
	public void setMnd_uri(java.lang.String mndUri) {
		mnd_uri = mndUri;
	}

	/**
	 * @return the isHaveChild
	 */
	public boolean isHaveChild() {
		return isHaveChild;
	}

	/**
	 * @param isHaveChild
	 *            the isHaveChild to set
	 */
	public void setHaveChild(boolean isHaveChild) {
		this.isHaveChild = isHaveChild;
	}

	public String toString() {
		String retstr = "";
		if (this.mnd_nbr.startsWith("a") || this.mnd_nbr.startsWith("A")) {

			if (this.mnd_nbr.split("\\.").length == 1) {
				retstr = this.mnd_label;
			} else {
				retstr = this.mnd_select + " - " + this.mnd_label;
				if (isHaveChild) {
					retstr = retstr + " ... ";
				}
			}

		}else if(this.mnd_nbr.equals("")){
			retstr = this.mnd_label;
		}
		else {
			retstr = this.mnd_nbr + "." + this.mnd_select + " - "
					+ this.mnd_label;

			if (isHaveChild) {
				retstr = retstr + " ... ";
			}
		}

		return retstr;
	}

}
