package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MrpDet entity. @author MyEclipse Persistence Tools
 */
public class MrpDet extends AbstractMrpDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MrpDet() {
	}

	/** minimal constructor */
	public MrpDet(MrpDetId id, Integer mrpKeyid, Double oidMrpDet) {
		super(id, mrpKeyid, oidMrpDet);
	}

	/** full constructor */
	public MrpDet(MrpDetId id, Date mrpRelDate, Date mrpDueDate, Double mrpQty,
			String mrpType, String mrpDetail, Boolean mrpQad01, String mrpSite,
			String mrpUser1, String mrpUser2, String mrpOrdSite,
			Integer mrpKeyid, Double oidMrpDet) {
		super(id, mrpRelDate, mrpDueDate, mrpQty, mrpType, mrpDetail, mrpQad01,
				mrpSite, mrpUser1, mrpUser2, mrpOrdSite, mrpKeyid, oidMrpDet);
	}

}
