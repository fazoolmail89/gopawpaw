package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LdDet entity. @author MyEclipse Persistence Tools
 */
public class LdDet extends AbstractLdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LdDet() {
	}

	/** minimal constructor */
	public LdDet(LdDetId id, Double ldQtyOh, Double ldCustConsignQty,
			Double ldSuppConsignQty, Double oidLdDet) {
		super(id, ldQtyOh, ldCustConsignQty, ldSuppConsignQty, oidLdDet);
	}

	/** full constructor */
	public LdDet(LdDetId id, Date ldDate, Double ldQtyOh, Date ldCntDate,
			Double ldAssay, Date ldExpire, String ldUser1, String ldUser2,
			String ldStatus, Double ldQtyAll, String ldGrade, Double ldQtyFrz,
			Date ldDateFrz, String ldVdLot, Integer ldCmtindx, Double ldWork,
			String ldChr01, String ldChr02, String ldChr03, String ldChr04,
			String ldChr05, Date ldDte01, Date ldDte02, Double ldDec01,
			Double ldDec02, Boolean ldLog01, Double ldCost, String ldRev,
			Double ldCustConsignQty, Double ldSuppConsignQty, Double oidLdDet) {
		super(id, ldDate, ldQtyOh, ldCntDate, ldAssay, ldExpire, ldUser1,
				ldUser2, ldStatus, ldQtyAll, ldGrade, ldQtyFrz, ldDateFrz,
				ldVdLot, ldCmtindx, ldWork, ldChr01, ldChr02, ldChr03, ldChr04,
				ldChr05, ldDte01, ldDte02, ldDec01, ldDec02, ldLog01, ldCost,
				ldRev, ldCustConsignQty, ldSuppConsignQty, oidLdDet);
	}

}
