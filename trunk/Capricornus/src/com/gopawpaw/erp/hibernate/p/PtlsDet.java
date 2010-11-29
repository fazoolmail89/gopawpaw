package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PtlsDet entity. @author MyEclipse Persistence Tools
 */
public class PtlsDet extends AbstractPtlsDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtlsDet() {
	}

	/** minimal constructor */
	public PtlsDet(PtlsDetId id, Double oidPtlsDet) {
		super(id, oidPtlsDet);
	}

	/** full constructor */
	public PtlsDet(PtlsDetId id, Double ptlsAssay, Integer ptlsCmtindx,
			Date ptlsExpire, String ptlsGrade, String ptlsStatus,
			String ptlsUser1, String ptlsUser2, String ptlsChr01,
			String ptlsChr02, String ptlsChr03, String ptlsChr04,
			String ptlsChr05, Double ptlsDec01, Double ptlsDec02,
			Double oidPtlsDet) {
		super(id, ptlsAssay, ptlsCmtindx, ptlsExpire, ptlsGrade, ptlsStatus,
				ptlsUser1, ptlsUser2, ptlsChr01, ptlsChr02, ptlsChr03,
				ptlsChr04, ptlsChr05, ptlsDec01, ptlsDec02, oidPtlsDet);
	}

}
