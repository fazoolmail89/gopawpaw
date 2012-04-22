package com.gopawpaw.kynb.module.scandatamange;

import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class DataOpertor extends XXNCYLBXDBAccess{
	
	/**
	 * 批量保存，会清空原有数据 
	 * @param list
	 * @return
	 */
	public boolean batSave(List<OtherDataBean> list) {
		boolean result = false;
		if(list == null || list.size() < 1) return result;
		String sql = "";
		if(commonsql.connect(user, password)) {
			//清空原表数据
			sql = "delete from OtherData";
			commonsql.executesql(sql);
			
			for(OtherDataBean odata: list) {
				result = false;
				sql = "insert into OtherData(A,B,C,D,E,F,G,H,I,J) values(" +
						"'" + odata.getAcol() + "'," +
						"'" + odata.getBcol() + "'," +
						"'" + odata.getCcol() + "'," +
						"'" + odata.getDcol() + "'," +
						"'" + odata.getEcol() + "'," +
						"'" + odata.getFcol() + "'," +
						"'" + odata.getGcol() + "'," +
						"'" + odata.getHcol() + "'," +
						"'" + odata.getIcol() + "'," +
						"'" + odata.getJcol() + "'" +
						")";
				if(commonsql.executesql(sql)) {
					result = true;
				}
			}
			commonsql.close();
		} 
		return result;
	}
	
	public boolean saveOrUpdate(OtherDataBean odata) {
		boolean result = false;
		String sql = "";
		if(commonsql.connect(user, password)) {
			if(odata.getId() == null || "".equals(odata.getId())) {
				sql = "insert into OtherData(A,B,C,D,E,F,G,H,I,J) values(" +
						"'" + odata.getAcol() + "'," +
						"'" + odata.getBcol() + "'," +
						"'" + odata.getCcol() + "'," +
						"'" + odata.getDcol() + "'," +
						"'" + odata.getEcol() + "'," +
						"'" + odata.getFcol() + "'," +
						"'" + odata.getGcol() + "'," +
						"'" + odata.getHcol() + "'," +
						"'" + odata.getIcol() + "'," +
						"'" + odata.getJcol() + "'" +
						")";
			} else {
				sql = "update OtherData set " +
						" A = '" + odata.getAcol() + "'," +
						" B = '" + odata.getBcol() + "'," +
						" C = '" + odata.getCcol() + "'," +
						" D = '" + odata.getDcol() + "'," +
						" E = '" + odata.getEcol() + "'," +
						" F = '" + odata.getFcol() + "'," +
						" G = '" + odata.getGcol() + "'," +
						" H = '" + odata.getHcol() + "'," +
						" I = '" + odata.getIcol() + "'," +
						" J = '" + odata.getJcol() + "'" +
						" where ID = '" + odata.getId() + "'";
			}		
			if(commonsql.executesql(sql)) {
				result = true;
			}	
		} 
		return result;
	}
	
	public List<OtherDataBean> findListAll() {
		List<OtherDataBean> list = new ArrayList<OtherDataBean>();
		String sql = "select * from OtherData";
		return findListBySql(sql);
	}
	
	public List<OtherDataBean> findListByQB(List<QueryBean> qbList) {
		String sql = "select * from OtherData where 1=1 ";
		for(QueryBean qb : qbList) {
			sql = sql + " and " + qb.getColumnName() + " like '%" + qb.getCondition() + "%' ";
		}
		return findListBySql(sql);
	}
	
	private List<OtherDataBean> findListBySql(String sql) {
		List<OtherDataBean> list = new ArrayList<OtherDataBean>();
		if(commonsql.connect(user, password)) {
			if(commonsql.query(sql)) {
				OtherDataBean odata = null;
				while(commonsql.nextrecord()) {
					odata = new OtherDataBean();
					odata.setId(commonsql.getString(OtherDataBean.ID));
					odata.setAcol(commonsql.getString(OtherDataBean.ACOL));
					odata.setBcol(commonsql.getString(OtherDataBean.BCOL));
					odata.setCcol(commonsql.getString(OtherDataBean.CCOL));
					odata.setDcol(commonsql.getString(OtherDataBean.DCOL));
					odata.setEcol(commonsql.getString(OtherDataBean.ECOL));
					odata.setFcol(commonsql.getString(OtherDataBean.FCOL));
					odata.setGcol(commonsql.getString(OtherDataBean.GCOL));
					odata.setHcol(commonsql.getString(OtherDataBean.HCOL));
					odata.setIcol(commonsql.getString(OtherDataBean.ICOL));
					odata.setJcol(commonsql.getString(OtherDataBean.JCOL));
					list.add(odata);
				}
			} 
			commonsql.close();
		}
		return list;
	}
}
