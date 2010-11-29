package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * Ecd2Det entity. @author MyEclipse Persistence Tools
 */
public class Ecd2Det extends AbstractEcd2Det implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd2Det() {
	}

	/** minimal constructor */
	public Ecd2Det(Ecd2DetId id, Double oidEcd2Det) {
		super(id, oidEcd2Det);
	}

	/** full constructor */
	public Ecd2Det(Ecd2DetId id, String ecd2StdOp, String ecd2Desc,
			String ecd2Wkctr, Double ecd2Setup, Double ecd2Run,
			Double ecd2YieldPct, String ecd2Tool, String ecd2Vend,
			Double ecd2SubCost, Boolean ecd2Subcntrt, String ecd2Mch,
			Double ecd2SetupMen, Double ecd2MenMch, Integer ecd2MchOp,
			Double ecd2Batch, Double ecd2RunPerB, Integer ecd2Cmtindx,
			Integer ecd2Recindx, String ecd2Process, Boolean ecd2Qad01,
			Date ecd2Qad02, String ecd2Qad03, String ecd2Qad04,
			String ecd2Qad05, Date ecd2ModDate, String ecd2Userid,
			String ecd2User1, String ecd2User2, Double oidEcd2Det) {
		super(id, ecd2StdOp, ecd2Desc, ecd2Wkctr, ecd2Setup, ecd2Run,
				ecd2YieldPct, ecd2Tool, ecd2Vend, ecd2SubCost, ecd2Subcntrt,
				ecd2Mch, ecd2SetupMen, ecd2MenMch, ecd2MchOp, ecd2Batch,
				ecd2RunPerB, ecd2Cmtindx, ecd2Recindx, ecd2Process, ecd2Qad01,
				ecd2Qad02, ecd2Qad03, ecd2Qad04, ecd2Qad05, ecd2ModDate,
				ecd2Userid, ecd2User1, ecd2User2, oidEcd2Det);
	}

}
