package com.gopawpaw.kynb.module.scandatamange;

import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class DataOpertor extends XXNCYLBXDBAccess {

	/**
	 * 批量保存，会清空原有数据
	 * 
	 * @param list
	 * @return
	 */
	public boolean batSave(List<OtherData> list) {
		boolean result = false;
		if (list == null || list.size() < 1)
			return result;
		String sql = "";
		if (commonsql.connect(user, password)) {
			// 清空原表数据
			sql = "delete from OtherData";
			commonsql.executesql(sql);
			commonsql.close();
		}
		int i = 0;
		int n = 0;
		if (commonsql.connect(user, password)) {
			for (OtherData odata : list) {
				result = false;
				sql = "insert into OtherData(A,B,C,D,E,F,G,H,I,J) values("
						+ "'"
						+ odata.getAcol().trim()
						+ "',"
						+ "'"
						+ odata.getBcol().trim()
						+ "',"
						+ "'"
						+ odata.getCcol().trim()
						+ "',"
						+ "'"
						+ odata.getDcol().trim()
						+ "',"
						+ "'"
						+ odata.getEcol().trim()
						+ "',"
						+ "'"
						+ odata.getFcol().trim()
						+ "',"
						+ "'"
						+ odata.getGcol().trim()
						+ "',"
						+ "'"
						+ odata.getHcol().trim()
						+ "',"
						+ "'"
						+ odata.getIcol().trim()
						+ "',"
						+ "'"
						+ odata.getJcol().trim() + "'" + ")";
				if (commonsql.executesql(sql)) {
					result = true;
					n++;
				} else {
					try {
						throw new DBException(DBException.DB_OPEN_FALSE);
					} catch (DBException e) {
						e.printStackTrace();
					}
				}

				// 重启连接
				if (i % 500 == 0) {
					commonsql.close();
					commonsql.connect(user, password);
				}
				i++;
				System.out.println("=====================================" + i);
			}
			commonsql.close();
		}
		System.out.println("=====================================");
		System.out.println(list.size());
		System.out.println(n);
		return result;
	}

	public boolean saveOrUpdate(OtherData odata) {
		boolean result = false;
		String sql = "";
		if (commonsql.connect(user, password)) {
			if (odata.getId() == null || "".equals(odata.getId())) {
				sql = "insert into OtherData(A,B,C,D,E,F,G,H,I,J) values("
						+ "'"
						+ odata.getAcol().trim()
						+ "',"
						+ "'"
						+ odata.getBcol().trim()
						+ "',"
						+ "'"
						+ odata.getCcol().trim()
						+ "',"
						+ "'"
						+ odata.getDcol().trim()
						+ "',"
						+ "'"
						+ odata.getEcol().trim()
						+ "',"
						+ "'"
						+ odata.getFcol().trim()
						+ "',"
						+ "'"
						+ odata.getGcol().trim()
						+ "',"
						+ "'"
						+ odata.getHcol().trim()
						+ "',"
						+ "'"
						+ odata.getIcol().trim()
						+ "',"
						+ "'"
						+ odata.getJcol().trim() + "'" + ")";
			} else {
				sql = "update OtherData set " + " A = '"
						+ odata.getAcol().trim() + "'," + " B = '"
						+ odata.getBcol().trim() + "'," + " C = '"
						+ odata.getCcol().trim() + "'," + " D = '"
						+ odata.getDcol().trim() + "'," + " E = '"
						+ odata.getEcol().trim() + "'," + " F = '"
						+ odata.getFcol().trim() + "'," + " G = '"
						+ odata.getGcol().trim() + "'," + " H = '"
						+ odata.getHcol().trim() + "'," + " I = '"
						+ odata.getIcol().trim() + "'," + " J = '"
						+ odata.getJcol().trim() + "'" + " where ID = "
						+ odata.getId();
			}
			if (commonsql.executesql(sql)) {
				result = true;
			}
		}
		return result;
	}

	public boolean deleteOData(OtherData odata) {
		boolean result = false;
		String sql = " delete from OtherData where ID = " + odata.getId();
		if (commonsql.connect(user, password)) {
			if (commonsql.executesql(sql)) {
				result = true;
			}
		}
		return result;
	}

	public List<OtherData> findListAll() {
		String sql = "select * from OtherData order by id";
		return findListBySql(sql);
	}

	public List<OtherData> findListByQB(List<QueryBean> qbList) {
		String sql = "select * from OtherData where 1=1 ";
		for (QueryBean qb : qbList) {
			sql = sql + " and " + qb.getColumnName() + " like '%"
					+ qb.getCondition() + "%' ";
		}
		sql = sql + " order by id ";
		return findListBySql(sql);
	}

	private List<OtherData> findListBySql(String sql) {
		List<OtherData> list = new ArrayList<OtherData>();
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				OtherData odata = null;
				while (commonsql.nextrecord()) {
					odata = new OtherData();
					odata.setId(commonsql.getString(OtherData.ID));
					odata.setAcol(commonsql.getString(OtherData.ACOL));
					odata.setBcol(commonsql.getString(OtherData.BCOL));
					odata.setCcol(commonsql.getString(OtherData.CCOL));
					odata.setDcol(commonsql.getString(OtherData.DCOL));
					odata.setEcol(commonsql.getString(OtherData.ECOL));
					odata.setFcol(commonsql.getString(OtherData.FCOL));
					odata.setGcol(commonsql.getString(OtherData.GCOL));
					odata.setHcol(commonsql.getString(OtherData.HCOL));
					odata.setIcol(commonsql.getString(OtherData.ICOL));
					odata.setJcol(commonsql.getString(OtherData.JCOL));
					list.add(odata);
				}
			}
			commonsql.close();
		}
		return list;
	}
}
