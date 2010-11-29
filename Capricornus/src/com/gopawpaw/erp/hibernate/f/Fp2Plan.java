package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * Fp2Plan entity. @author MyEclipse Persistence Tools
 */
public class Fp2Plan extends AbstractFp2Plan implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fp2Plan() {
	}

	/** minimal constructor */
	public Fp2Plan(Fp2PlanId id, Double oidFp2Plan) {
		super(id, oidFp2Plan);
	}

	/** full constructor */
	public Fp2Plan(Fp2PlanId id, Double fp2BegInv, String fp2InvAct,
			String fp2InvFcst, String fp2OrdAct, String fp2OrdFcst,
			Double fp2Target, String fp2User1, String fp2User2,
			String fp2ModUserid, Date fp2ModDate, String fp2Chr01,
			String fp2Chr02, String fp2Chr03, String fp2Chr04, String fp2Chr05,
			Double fp2Dec01, Double fp2Dec02, Boolean fp2Log01,
			Boolean fp2Log02, String fp2Qadc01, Double oidFp2Plan) {
		super(id, fp2BegInv, fp2InvAct, fp2InvFcst, fp2OrdAct, fp2OrdFcst,
				fp2Target, fp2User1, fp2User2, fp2ModUserid, fp2ModDate,
				fp2Chr01, fp2Chr02, fp2Chr03, fp2Chr04, fp2Chr05, fp2Dec01,
				fp2Dec02, fp2Log01, fp2Log02, fp2Qadc01, oidFp2Plan);
	}

}
