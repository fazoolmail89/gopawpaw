package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * Fp1Plan entity. @author MyEclipse Persistence Tools
 */
public class Fp1Plan extends AbstractFp1Plan implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fp1Plan() {
	}

	/** minimal constructor */
	public Fp1Plan(Fp1PlanId id, Double oidFp1Plan) {
		super(id, oidFp1Plan);
	}

	/** full constructor */
	public Fp1Plan(Fp1PlanId id, Double fp1BegInv, String fp1BklgAct,
			String fp1BklgFcst, String fp1CostAct, String fp1CostFcst,
			Double fp1Target, String fp1User1, String fp1User2,
			String fp1ModUserid, Date fp1ModDate, String fp1Chr01,
			String fp1Chr02, String fp1Chr03, String fp1Chr04, String fp1Chr05,
			Double fp1Dec01, Double fp1Dec02, Boolean fp1Log01,
			Boolean fp1Log02, String fp1Qadc01, Double oidFp1Plan) {
		super(id, fp1BegInv, fp1BklgAct, fp1BklgFcst, fp1CostAct, fp1CostFcst,
				fp1Target, fp1User1, fp1User2, fp1ModUserid, fp1ModDate,
				fp1Chr01, fp1Chr02, fp1Chr03, fp1Chr04, fp1Chr05, fp1Dec01,
				fp1Dec02, fp1Log01, fp1Log02, fp1Qadc01, oidFp1Plan);
	}

}
