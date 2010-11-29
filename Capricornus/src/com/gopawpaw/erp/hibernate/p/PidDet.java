package com.gopawpaw.erp.hibernate.p;

/**
 * PidDet entity. @author MyEclipse Persistence Tools
 */
public class PidDet extends AbstractPidDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PidDet() {
	}

	/** minimal constructor */
	public PidDet(PidDetId id, Double oidPidDet) {
		super(id, oidPidDet);
	}

	/** full constructor */
	public PidDet(PidDetId id, Double pidAmt, String pidFrTerms,
			String pidCrTerms, String pidFrList, String pidUser1,
			String pidUser2, String pidQadc01, Double pidQadd01,
			Double oidPidDet) {
		super(id, pidAmt, pidFrTerms, pidCrTerms, pidFrList, pidUser1,
				pidUser2, pidQadc01, pidQadd01, oidPidDet);
	}

}
