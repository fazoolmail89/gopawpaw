package com.gopawpaw.kynb.module.datascan2;

import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

public class DataOpertor extends XXNCYLBXDBAccess {
	
	/**
	 * 查询所有，只返回前五条记录
	 * @return
	 */
	public List<OtherData> findListFrontFive() {
		String sql = "select * from OtherData order by id";
		List<OtherData> list = new ArrayList<OtherData>();
		if (commonsql.connect(user, password)) {
			if (commonsql.query(sql)) {
				OtherData odata = null;
				int i = 0;
				while (commonsql.nextrecord()) {
					if(i == 5) break;
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
					i++;
				}
			}
			commonsql.close();
		}
		return list;
	}
}
