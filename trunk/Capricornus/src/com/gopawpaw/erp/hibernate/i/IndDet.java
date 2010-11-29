package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IndDet entity. @author MyEclipse Persistence Tools
 */
public class IndDet extends AbstractIndDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IndDet() {
	}

	/** minimal constructor */
	public IndDet(IndDetId id, Double oidIndDet) {
		super(id, oidIndDet);
	}

	/** full constructor */
	public IndDet(IndDetId id, Double indQtyReq, Double indQtyAll,
			Double indQtyPick, Double indQtyIss, Double indQtyChg,
			Double indBoChg, String indLoc, String indSerial, Date indReqDate,
			String indRequest, String indRemarks, String indProject,
			String indType, String indUm, Double indUmConv, Date indModDate,
			String indUserid, Integer indCmtindx, String indUser1,
			String indUser2, String indChr01, String indChr02, String indChr03,
			String indChr04, String indChr05, Date indDte01, Date indDte02,
			Double indDec01, Double indDec02, Boolean indLog01, Double oidIndDet) {
		super(id, indQtyReq, indQtyAll, indQtyPick, indQtyIss, indQtyChg,
				indBoChg, indLoc, indSerial, indReqDate, indRequest,
				indRemarks, indProject, indType, indUm, indUmConv, indModDate,
				indUserid, indCmtindx, indUser1, indUser2, indChr01, indChr02,
				indChr03, indChr04, indChr05, indDte01, indDte02, indDec01,
				indDec02, indLog01, oidIndDet);
	}

}
