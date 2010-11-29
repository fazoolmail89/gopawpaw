package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * Fp3Plan entity. @author MyEclipse Persistence Tools
 */
public class Fp3Plan extends AbstractFp3Plan implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fp3Plan() {
	}

	/** minimal constructor */
	public Fp3Plan(Fp3PlanId id, Double oidFp3Plan) {
		super(id, oidFp3Plan);
	}

	/** full constructor */
	public Fp3Plan(Fp3PlanId id, Double fp3BegInv, String fp3ProdAct,
			String fp3ProdFcst, String fp3ShipAct, String fp3ShipFcst,
			Double fp3Target, String fp3ApprvList, String fp3WoList,
			String fp3User1, String fp3User2, String fp3ModUserid,
			Date fp3ModDate, String fp3Chr01, String fp3Chr02, String fp3Chr03,
			String fp3Chr04, String fp3Chr05, Double fp3Dec01, Double fp3Dec02,
			Boolean fp3Log01, Boolean fp3Log02, String fp3Qadc01,
			Double oidFp3Plan) {
		super(id, fp3BegInv, fp3ProdAct, fp3ProdFcst, fp3ShipAct, fp3ShipFcst,
				fp3Target, fp3ApprvList, fp3WoList, fp3User1, fp3User2,
				fp3ModUserid, fp3ModDate, fp3Chr01, fp3Chr02, fp3Chr03,
				fp3Chr04, fp3Chr05, fp3Dec01, fp3Dec02, fp3Log01, fp3Log02,
				fp3Qadc01, oidFp3Plan);
	}

}
