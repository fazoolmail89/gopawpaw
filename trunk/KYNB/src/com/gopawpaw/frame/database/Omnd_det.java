/**
 * 
 */
package com.gopawpaw.frame.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.log.GLog;

/**
 * @version 2010-3-4
 * @author 李锦华
 * 
 */
public class Omnd_det {
	
	private static final String TAG = Omnd_det.class.getSimpleName();
	
	private GlobalParameter globalParameter = new GlobalParameter();
	/**
	 * 
	 */
	private java.util.Vector<Dmnd_det> vectorDmnd_det;

	private com.gopawpaw.frame.database.Dmnd_det dmnd_det = null;

	/**
	 * 
	 */
	public Omnd_det() {
		init();
	}

	public Omnd_det(Dmnd_det dmnd_det) {
		this.dmnd_det = dmnd_det;
		init();
	}

	private void init() {
		vectorDmnd_det = new Vector<Dmnd_det>();
	}

	/**
	 * @return the dmnd_det
	 */

	public com.gopawpaw.frame.database.Dmnd_det getDmnd_det() {
		if (dmnd_det == null) {
			dmnd_det = new Dmnd_det();
		}
		return dmnd_det;
	}

	/**
	 * @param dmndDet
	 *            the dmnd_det to set
	 */
	public void setDmnd_det(com.gopawpaw.frame.database.Dmnd_det dmndDet) {
		dmnd_det = dmndDet;
	}

	/**
	 * @return the vectorDmnd_det
	 */
	public java.util.Vector<Dmnd_det> getVectorDmnd_det() {
		if (this.vectorDmnd_det == null) {
			vectorDmnd_det = new Vector<Dmnd_det>();
			updataVector();
		}
		return vectorDmnd_det;
	}

	/**
	 * @param vectorDmndDet
	 *            the vectorDmnd_det to set
	 */
	public void setVectorDmnd_det(java.util.Vector<Dmnd_det> vectorDmndDet) {
		vectorDmnd_det = vectorDmndDet;
	}

	/**
	 * 更新数组数据
	 */
	public boolean updataVector() {
		boolean retb = false;
		String sqlstr = null;

		if (this.vectorDmnd_det == null) {
			vectorDmnd_det = new Vector<Dmnd_det>();
		}

		// 清空原数组数据
		vectorDmnd_det.removeAllElements();

		if (this.dmnd_det == null) {
			return false;
		}

		if (!this.dmnd_det.isHaveChild()) {
			vectorDmnd_det.add(this.dmnd_det);
			return false;
		} else {
			// sqlstr =
			// "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_nbr='"
			// + this.dmnd_det.getMnd_exec() +
			// "' and mnt_lang='"+this.globalParameter.getDefaultLanguage()+"'order by mnd_select";

			if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Progress) {

				sqlstr = " select * from \"MFGPROD\".\"PUB\".\"mnd_det\" left join \"MFGPROD\".\"PUB\".\"mnt_det\" on \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_nbr\"=\"MFGPROD\".\"PUB\".\"mnt_det\".\"mnt_nbr\" and \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_select\"=\"MFGPROD\".\"PUB\".\"mnt_det\".\"mnt_select\" where \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_nbr\"='"
						+ this.dmnd_det.getMnd_exec()
						+ "' and \"MFGPROD\".\"PUB\".\"mnt_det\".\"mnt_lang\"='"
						+ this.globalParameter.getDefaultLanguage()
						+ "' order by \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_select\"";
			} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Access) {
				 sqlstr =
				 "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_nbr='"
				 + this.dmnd_det.getMnd_exec() +
				 "' and mnt_lang='"+this.globalParameter.getDefaultLanguage()+"' order by mnd_select";
			} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_SQLServer) {
				sqlstr =
					 "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_nbr='"
					 + this.dmnd_det.getMnd_exec() +
					 "' and mnt_lang='"+this.globalParameter.getDefaultLanguage()+"' order by mnd_select";
			} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_MySQL) {
				sqlstr =
					 "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_nbr='"
					 + this.dmnd_det.getMnd_exec() +
					 "' and mnt_lang='"+this.globalParameter.getDefaultLanguage()+"' order by mnd_select";
			}

		}
		// MntDetDAO mntDAO =
		// MntDetDAO.getFromApplicationContext(GppMainFrame.glb_ctx);
		// List l = mntDAO.findAll();
		// for(Object o:l){
		// // getJTextArea().append(((MntDet)o).getMntLabel()+"\n");
		// }
		GLog.d(TAG, sqlstr);
		
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(sqlstr);
		try {
			while (rst.next()) {

				Dmnd_det tem = new Dmnd_det();

				tem.setMnd_nbr(rst.getString("mnd_nbr"));
				tem.setMnd_select(rst.getInt("mnd_select"));

				tem.setMnd_exec(rst.getString("mnd_exec"));
				tem.setMnd_fkey(rst.getInt("mnd_fkey"));
				tem.setMnd_help(rst.getString("mnd_help"));
				tem.setMnd_canrun(rst.getString("mnd_canrun"));
				tem.setMnd_name(rst.getString("mnd_name"));
				tem.setMnd_user1(rst.getString("mnd_user1"));
				tem.setMnd_user2(rst.getString("mnd_user2"));
				tem.setMnd__qadc01(rst.getString("mnd__qadc01"));
				tem.setOid_mnd_det(rst.getDouble("oid_mnd_det"));
				tem.setMnd_uri(rst.getString("mnd_uri"));
				tem.setMnd_label(rst.getString("mnt_label"));

				tem.setHaveChild(Omnd_det.isHaveNbr(tem.getMnd_exec()));
				this.vectorDmnd_det.add(tem);
				
				retb = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		gppsql.close();

		return retb;
	}

	/**
	 * 获取菜单exec
	 */
	// public static String getExec(String nbr, int select) {
	// String rets = null;
	//
	// String sqlstr = "select mnd_exec from mnd_det where mnd_nbr='" + nbr
	// + "' and mnd_select='" + select + "'";
	// ;
	//
	// GppSQL gppsql = new GppSQL();
	// ResultSet rst = gppsql.query(sqlstr);
	// try {
	// while (rst.next()) {
	// rets = rst.getString("mnd_exec");
	// }
	//
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// gppsql.close();
	//
	// return rets;
	// }

	/**
	 * 获取菜单NBR，如：从3.6.18 获取3.6
	 */
	public static String getNbr(String nbr_select) {
		String rets = null;
		String[] mdnns = nbr_select.split("\\.");

		if (mdnns.length == 1) {
			rets = nbr_select;
		} else {
			String temp = null;
			for (int i = 0; i < mdnns.length - 1; i++) {
				if (temp == null) {
					temp = mdnns[i];
				} else {
					temp = temp + "." + mdnns[i];
				}

			}
			rets = temp;
		}

		return rets;
	}

	/**
	 * 获取菜单select，如：从3.6.18 获取18
	 */
	public static int getSelect(String nbr_select) {
		int rets = 0;
		String[] mdnns = nbr_select.split("\\.");

		if (mdnns.length == 1) {
			rets = 0;
		} else {

			rets = Integer.valueOf(mdnns[mdnns.length - 1]);
		}

		return rets;
	}

	/**
	 * 判断是否有下一级子菜单
	 * 
	 * @param dd
	 *            菜单项 如：3.6 Dmnd_det
	 * @return 存在子菜单（true）, 不存在子菜单（false）
	 */
	// private boolean isHaveChild(Dmnd_det dd) {
	// boolean retb = false;
	// String rsts = "";
	//		
	// String sqlstr =
	// "select mnd_exec from mnd_det where mnd_nbr='"+dd.getMnd_nbr()+"' and mnd_select="+dd.getMnd_select();
	//
	// GppSQL gppsql = new GppSQL();
	// ResultSet rst = gppsql
	// .query(sqlstr);
	//		
	// try {
	// while (rst != null && rst.next()) {
	// rsts = rst.getString("mnd_exec");
	// }
	//			
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// gppsql.close();
	//		
	// return isHaveNbr(rsts);
	// }

	/**
	 * 判断exec是否存在与菜单nbr
	 */
	public static boolean isHaveNbr(String mnd_nbr) {
		boolean retb = false;
		int counti = 0;

		// String sqlstr =
		// "select count(*) as cont from mnd_det where mnd_nbr='"
		// + mnd_nbr + "'";
		String sqlstr = "";
		if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Progress) {
			sqlstr = "select count(*) as cont from \"MFGPROD\".\"PUB\".\"mnd_det\" where \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_nbr\"='"
					+ mnd_nbr + "'";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Access) {
			sqlstr ="select count(*) as cont from mnd_det where mnd_nbr='"
				 + mnd_nbr + "'";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_SQLServer) {
			sqlstr ="select count(*) as cont from mnd_det where mnd_nbr='"
				 + mnd_nbr + "'";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_MySQL) {
			sqlstr ="select count(*) as cont from mnd_det where mnd_nbr='"
				 + mnd_nbr + "'";
		}

		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(sqlstr);
		try {
			while (rst != null && rst.next()) {
				counti = rst.getInt("cont");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		gppsql.close();

		if (counti > 0) {
			retb = true;
		} else {
			retb = false;
		}

		return retb;
	}

	/**
	 * 获取父级菜单导航数据
	 */
	public Vector<Dmnd_det> getVectorFatherNav() {
		Vector<Dmnd_det> retv = new Vector<Dmnd_det>();
		Vector<Dmnd_det> retv2 = new Vector<Dmnd_det>();
		Dmnd_det dd = getFatherNbr(this.dmnd_det);
		while (dd != null) {
			retv.add(dd);
			dd = getFatherNbr(dd);
		}
		int si = retv.size();
		for (int i = si - 1; i >= 0; i--) {
			retv2.add(retv.get(i));
		}
		retv2.add(this.dmnd_det);
		return retv2;
	}

	/**
	 * 获取父级菜单项
	 */
	public static Dmnd_det getFatherNbr(Dmnd_det dd) {
		Dmnd_det retDmnd_det = null;
		if (dd.getMnd_nbr().isEmpty()) {
			return null;
		}
		GlobalParameter gp = new GlobalParameter();
		// String sqlstr =
		// "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_exec='"
		// + dd.getMnd_nbr() + "' and mnt_lang='"+gp.getDefaultLanguage()+"'";

		String sqlstr = "";

		if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Progress) {
			sqlstr = " select * from \"MFGPROD\".\"PUB\".\"mnd_det\" left join \"MFGPROD\".\"PUB\".\"mnt_det\" on \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_nbr\"=\"MFGPROD\".\"PUB\".\"mnt_det\".\"mnt_nbr\" and \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_select\"=\"MFGPROD\".\"PUB\".\"mnt_det\".\"mnt_select\" where \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_exec\"='"
				+ dd.getMnd_nbr()
				+ "' and \"MFGPROD\".\"PUB\".\"mnt_det\".\"mnt_lang\"='"
				+ gp.getDefaultLanguage()
				+ "' order by \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_select\"";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Access) {
			 sqlstr =
			 "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_exec='"
			 + dd.getMnd_nbr() + "' and mnt_lang='"+gp.getDefaultLanguage()+"'";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_SQLServer) {
			 sqlstr =
				 "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_exec='"
				 + dd.getMnd_nbr() + "' and mnt_lang='"+gp.getDefaultLanguage()+"'";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_MySQL) {
			 sqlstr =
				 "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_exec='"
				 + dd.getMnd_nbr() + "' and mnt_lang='"+gp.getDefaultLanguage()+"'";
		}
		
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(sqlstr);
		try {
			while (rst != null && rst.next()) {

				Dmnd_det tem = new Dmnd_det();

				tem.setMnd_nbr(rst.getString("mnd_nbr"));
				tem.setMnd_select(rst.getInt("mnd_select"));

				tem.setMnd_exec(rst.getString("mnd_exec"));
				tem.setMnd_fkey(rst.getInt("mnd_fkey"));
				tem.setMnd_help(rst.getString("mnd_help"));
				tem.setMnd_canrun(rst.getString("mnd_canrun"));
				tem.setMnd_name(rst.getString("mnd_name"));
				tem.setMnd_user1(rst.getString("mnd_user1"));
				tem.setMnd_user2(rst.getString("mnd_user2"));
				tem.setMnd__qadc01(rst.getString("mnd__qadc01"));
				tem.setOid_mnd_det(rst.getDouble("oid_mnd_det"));
				tem.setMnd_uri(rst.getString("mnd_uri"));
				tem.setMnd_label(rst.getString("mnt_label"));

				tem.setHaveChild(true);
				retDmnd_det = tem;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gppsql.close();

		return retDmnd_det;
	}

	/**
	 * 根据主键 mnd_nbr、mnd_select 更新 变量 dmmd_det 信息，可通过 getDmnd_det() 获取。
	 */
	public boolean updateDmnd_det() {
		boolean retb = false;
		String sqlstr = "";

		// sqlstr =
		// "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_nbr='"
		// + this.dmnd_det.getMnd_nbr() + "' and mnd_select="
		// + this.dmnd_det.getMnd_select()
		// +" and mnt_lang='"+this.globalParameter.getDefaultLanguage()+"'";

		if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Progress) {
			sqlstr = " select * from \"MFGPROD\".\"PUB\".\"mnd_det\" left join \"MFGPROD\".\"PUB\".\"mnt_det\" on \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_nbr\"=\"MFGPROD\".\"PUB\".\"mnt_det\".\"mnt_nbr\" and \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_select\"=\"MFGPROD\".\"PUB\".\"mnt_det\".\"mnt_select\" where \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_nbr\"='"
				+ this.dmnd_det.getMnd_nbr()
				+ "' and \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_select\"='"
				+ this.dmnd_det.getMnd_select()
				+ "' and \"MFGPROD\".\"PUB\".\"mnt_det\".\"mnt_lang\"='"
				+ this.globalParameter.getDefaultLanguage()
				+ "' order by \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_select\"";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Access) {
			 sqlstr =
			 "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_nbr='"
			 + this.dmnd_det.getMnd_nbr() + "' and mnd_select="
			 + this.dmnd_det.getMnd_select()
			 +" and mnt_lang='"+this.globalParameter.getDefaultLanguage()+"'";
			 
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_SQLServer) {
			sqlstr =
				 "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_nbr='"
				 + this.dmnd_det.getMnd_nbr() + "' and mnd_select="
				 + this.dmnd_det.getMnd_select()
				 +" and mnt_lang='"+this.globalParameter.getDefaultLanguage()+"'";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_MySQL) {
			sqlstr =
				 "select * from mnd_det left join mnt_det on mnd_det.mnd_nbr=mnt_det.mnt_nbr and mnd_det.mnd_select=mnt_det.mnt_select where mnd_nbr='"
				 + this.dmnd_det.getMnd_nbr() + "' and mnd_select="
				 + this.dmnd_det.getMnd_select()
				 +" and mnt_lang='"+this.globalParameter.getDefaultLanguage()+"'";
		}
		
		GLog.d(TAG, "updateDmnd_det = :" + GlobalParameter.getDatabaseInfo().getDatabaseType());
		GLog.d(TAG, "updateDmnd_det = :" + sqlstr);
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(sqlstr);
		try {
			while (rst != null && rst.next()) {

				Dmnd_det tem = new Dmnd_det();

				tem.setMnd_nbr(rst.getString("mnd_nbr"));
				tem.setMnd_select(rst.getInt("mnd_select"));

				tem.setMnd_exec(rst.getString("mnd_exec"));
				tem.setMnd_fkey(rst.getInt("mnd_fkey"));
				tem.setMnd_help(rst.getString("mnd_help"));
				tem.setMnd_canrun(rst.getString("mnd_canrun"));
				tem.setMnd_name(rst.getString("mnd_name"));
				tem.setMnd_user1(rst.getString("mnd_user1"));
				tem.setMnd_user2(rst.getString("mnd_user2"));
				tem.setMnd__qadc01(rst.getString("mnd__qadc01"));
				tem.setOid_mnd_det(rst.getDouble("oid_mnd_det"));
				tem.setMnd_uri(rst.getString("mnd_uri"));
				tem.setMnd_label(rst.getString("mnt_label"));

				tem.setHaveChild(Omnd_det.isHaveNbr(tem.getMnd_exec()));

				this.dmnd_det = tem;
				retb = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		gppsql.close();

		return retb;
	}

	/**
	 * 是否存在可执行文件
	 */
	public static boolean isExistExec(String mnd_exec) {
		boolean retb = false;
		// String sqlstr = "select * from mnd_det where mnd_exec='" + mnd_exec +
		// "'";

		String sqlstr = "";
		if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Progress) {
			sqlstr = "select *  from \"MFGPROD\".\"PUB\".\"mnd_det\" where \"MFGPROD\".\"PUB\".\"mnd_det\".\"mnd_exec\"='"
				+ mnd_exec + "'";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Access) {
			 sqlstr = "select * from mnd_det where mnd_exec='" + mnd_exec +
			 "'";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_SQLServer) {
			sqlstr = "select * from mnd_det where mnd_exec='" + mnd_exec +
			 "'";
		} else if (GlobalParameter.getDatabaseInfo().getDatabaseType() == GlobalParameter.DataBaseType_Hibernate) {

		}
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(sqlstr);
		try {
			while (rst != null && rst.next()) {
				retb = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gppsql.close();

		return retb;
	}
	// public static void main(String[] args) {
	// Omnd_det omnd = new Omnd_det("7.18.4");
	// omnd.updataVector();
	// Iterator<?> it = omnd.getVectorDmnd_det().iterator();
	//		
	// while(it.hasNext()){
	// System.out.println(((Dmnd_det)it.next()).getMnd_nbr());
	// }
	// }
}
