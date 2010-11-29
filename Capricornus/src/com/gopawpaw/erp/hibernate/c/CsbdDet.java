package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CsbdDet entity. @author MyEclipse Persistence Tools
 */
public class CsbdDet extends AbstractCsbdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsbdDet() {
	}

	/** minimal constructor */
	public CsbdDet(CsbdDetId id, String csbdEdi, String csbdBranch,
			String csbdBkAcct, String csbdUserid, String csbdUser1,
			String csbdUser2, String csbdChr01, String csbdChr02,
			String csbdChr03, String csbdChr04, String csbdChr05,
			Double csbdDec01, Double csbdDec02, String csbdQad01,
			String csbdQad02, Double csbdQad03, Double csbdQad04,
			String csbdValidation, Double oidCsbdDet) {
		super(id, csbdEdi, csbdBranch, csbdBkAcct, csbdUserid, csbdUser1,
				csbdUser2, csbdChr01, csbdChr02, csbdChr03, csbdChr04,
				csbdChr05, csbdDec01, csbdDec02, csbdQad01, csbdQad02,
				csbdQad03, csbdQad04, csbdValidation, oidCsbdDet);
	}

	/** full constructor */
	public CsbdDet(CsbdDetId id, String csbdEdi, String csbdBranch,
			String csbdBkAcct, Date csbdEndDate, Date csbdBegDate,
			String csbdUserid, Date csbdModDate, String csbdUser1,
			String csbdUser2, String csbdChr01, String csbdChr02,
			String csbdChr03, String csbdChr04, String csbdChr05,
			Double csbdDec01, Double csbdDec02, Date csbdDte01, Date csbdDte02,
			Boolean csbdLog01, Boolean csbdLog02, String csbdQad01,
			String csbdQad02, Double csbdQad03, Double csbdQad04,
			Date csbdQad05, Date csbdQad06, Boolean csbdQad07,
			Boolean csbdQad08, String csbdValidation, Double oidCsbdDet) {
		super(id, csbdEdi, csbdBranch, csbdBkAcct, csbdEndDate, csbdBegDate,
				csbdUserid, csbdModDate, csbdUser1, csbdUser2, csbdChr01,
				csbdChr02, csbdChr03, csbdChr04, csbdChr05, csbdDec01,
				csbdDec02, csbdDte01, csbdDte02, csbdLog01, csbdLog02,
				csbdQad01, csbdQad02, csbdQad03, csbdQad04, csbdQad05,
				csbdQad06, csbdQad07, csbdQad08, csbdValidation, oidCsbdDet);
	}

}
