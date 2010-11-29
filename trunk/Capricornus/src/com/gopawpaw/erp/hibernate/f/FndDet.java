package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FndDet entity. @author MyEclipse Persistence Tools
 */
public class FndDet extends AbstractFndDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FndDet() {
	}

	/** minimal constructor */
	public FndDet(FndDetId id, Double oidFndDet) {
		super(id, oidFndDet);
	}

	/** full constructor */
	public FndDet(FndDetId id, Date fndCompDate, String fndEcmNbr,
			String fndModUserid, String fndChr01, String fndChr02,
			String fndChr03, String fndChr04, Double fndDec01, Double fndDec02,
			Double fndDec03, Date fndDte01, Date fndDte02, Date fndDte03,
			Boolean fndLog01, Boolean fndLog02, Boolean fndLog03,
			String fndQadc01, String fndQadc02, String fndQadc03,
			String fndQadc04, Date fndQadt01, Date fndQadt02, Date fndQadt03,
			Double fndQade01, Double fndQade02, Double fndQade03,
			Boolean fndQadl01, Boolean fndQadl02, Boolean fndQadl03,
			Date fndModDate, String fndUser1, String fndUser2, Double oidFndDet) {
		super(id, fndCompDate, fndEcmNbr, fndModUserid, fndChr01, fndChr02,
				fndChr03, fndChr04, fndDec01, fndDec02, fndDec03, fndDte01,
				fndDte02, fndDte03, fndLog01, fndLog02, fndLog03, fndQadc01,
				fndQadc02, fndQadc03, fndQadc04, fndQadt01, fndQadt02,
				fndQadt03, fndQade01, fndQade02, fndQade03, fndQadl01,
				fndQadl02, fndQadl03, fndModDate, fndUser1, fndUser2, oidFndDet);
	}

}
