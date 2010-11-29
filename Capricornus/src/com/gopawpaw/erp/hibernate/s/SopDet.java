package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SopDet entity. @author MyEclipse Persistence Tools
 */
public class SopDet extends AbstractSopDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SopDet() {
	}

	/** minimal constructor */
	public SopDet(SopDetId id, Double oidSopDet) {
		super(id, oidSopDet);
	}

	/** full constructor */
	public SopDet(SopDetId id, Double sopCost, String sopUser1,
			String sopUser2, String sopWkctr, Double sopSetup, Double sopRun,
			Double sopYieldPct, Double sopSubCost, Date sopStart, Date sopEnd,
			Double sopInvValue, Boolean sopMilestone, Double sopBatch,
			Double sopSetupMen, Double sopMenMch, Integer sopMchOp,
			Double sopStdBatch, String sopElmLbr, String sopElmBdn,
			String sopElmSub, String sopQadc01, Double oidSopDet) {
		super(id, sopCost, sopUser1, sopUser2, sopWkctr, sopSetup, sopRun,
				sopYieldPct, sopSubCost, sopStart, sopEnd, sopInvValue,
				sopMilestone, sopBatch, sopSetupMen, sopMenMch, sopMchOp,
				sopStdBatch, sopElmLbr, sopElmBdn, sopElmSub, sopQadc01,
				oidSopDet);
	}

}
