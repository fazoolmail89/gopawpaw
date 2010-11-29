package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GipDet entity. @author MyEclipse Persistence Tools
 */
public class GipDet extends AbstractGipDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GipDet() {
	}

	/** minimal constructor */
	public GipDet(GipDetId id, String gipAppCode, Boolean gipLogical,
			Integer gipInteger, String gipChar, Double gipDecimal,
			String gipTableName, Date gipModDate, String gipModUserid,
			String gipUser1, String gipUser2, String gipQadc01,
			String gipQadc02, Double oidGipDet) {
		super(id, gipAppCode, gipLogical, gipInteger, gipChar, gipDecimal,
				gipTableName, gipModDate, gipModUserid, gipUser1, gipUser2,
				gipQadc01, gipQadc02, oidGipDet);
	}

	/** full constructor */
	public GipDet(GipDetId id, String gipAppCode, Boolean gipLogical,
			Integer gipInteger, String gipChar, Double gipDecimal,
			String gipTableName, Date gipDate, Date gipModDate,
			String gipModUserid, String gipUser1, String gipUser2,
			String gipQadc01, String gipQadc02, Double oidGipDet) {
		super(id, gipAppCode, gipLogical, gipInteger, gipChar, gipDecimal,
				gipTableName, gipDate, gipModDate, gipModUserid, gipUser1,
				gipUser2, gipQadc01, gipQadc02, oidGipDet);
	}

}
