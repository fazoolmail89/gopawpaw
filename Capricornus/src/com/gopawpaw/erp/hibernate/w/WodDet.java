package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WodDet entity. @author MyEclipse Persistence Tools
 */
public class WodDet extends AbstractWodDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WodDet() {
	}

	/** minimal constructor */
	public WodDet(WodDetId id, String wodSodNbr, Double oidWodDet) {
		super(id, wodSodNbr, oidWodDet);
	}

	/** full constructor */
	public WodDet(WodDetId id, String wodNbr, Date wodIssDate,
			Double wodQtyReq, Double wodQtyAll, Double wodQtyPick,
			Double wodQtyIss, Double wodTotStd, String wodDeliver,
			Double wodQtyChg, Double wodBoChg, String wodLoc, String wodSerial,
			Integer wodCmtindx, String wodUser1, String wodUser2,
			Boolean wodCritical, String wodSite, String wodChr01,
			String wodChr02, String wodChr03, String wodChr04, String wodChr05,
			Date wodDte01, Date wodDte02, Double wodDec01, Double wodDec02,
			Boolean wodLog01, Double wodBomQty, Double wodMtlTotx,
			Double wodMvusePost, Double wodBomAmt, Double wodMvrtePost,
			Double wodMvrteRval, Double wodMvuseRval, Double wodMvrteAccr,
			Double wodMvuseAccr, String wodCaIntType, Double wodCoveredAmt,
			String wodEngCode, String wodFcgCode, Integer wodFcgIndex,
			Integer wodFisColumn, String wodFisSort, String wodFscCode,
			String wodFsmType, Double wodListPr, Double wodPrice,
			String wodProdLine, Double wodQtyPosted, Double wodQtyRet,
			String wodStatus, Double wodLinePrice, Double wodCoveredPost,
			String wodProject, Double wodRetIss, Double wodExgPrice,
			String wodSvCode, String wodRetSite, String wodRetLoc,
			Double wodStdCost, Integer wodItmLine, Integer wodSodLine,
			String wodSodNbr, Boolean wodSeoLoad, String wodFromLoc,
			String wodFromSite, String wodRef, String wodRetSerial,
			String wodQadc01, String wodQadc02, String wodQadc03,
			Date wodQadt01, Date wodQadt02, Double wodQade01, Double wodQade02,
			Boolean wodQadl01, Boolean wodQadl02, Integer wodIsbRef,
			String wodRetRef, Double wodYieldPct, Double oidWodDet) {
		super(id, wodNbr, wodIssDate, wodQtyReq, wodQtyAll, wodQtyPick,
				wodQtyIss, wodTotStd, wodDeliver, wodQtyChg, wodBoChg, wodLoc,
				wodSerial, wodCmtindx, wodUser1, wodUser2, wodCritical,
				wodSite, wodChr01, wodChr02, wodChr03, wodChr04, wodChr05,
				wodDte01, wodDte02, wodDec01, wodDec02, wodLog01, wodBomQty,
				wodMtlTotx, wodMvusePost, wodBomAmt, wodMvrtePost,
				wodMvrteRval, wodMvuseRval, wodMvrteAccr, wodMvuseAccr,
				wodCaIntType, wodCoveredAmt, wodEngCode, wodFcgCode,
				wodFcgIndex, wodFisColumn, wodFisSort, wodFscCode, wodFsmType,
				wodListPr, wodPrice, wodProdLine, wodQtyPosted, wodQtyRet,
				wodStatus, wodLinePrice, wodCoveredPost, wodProject, wodRetIss,
				wodExgPrice, wodSvCode, wodRetSite, wodRetLoc, wodStdCost,
				wodItmLine, wodSodLine, wodSodNbr, wodSeoLoad, wodFromLoc,
				wodFromSite, wodRef, wodRetSerial, wodQadc01, wodQadc02,
				wodQadc03, wodQadt01, wodQadt02, wodQade01, wodQade02,
				wodQadl01, wodQadl02, wodIsbRef, wodRetRef, wodYieldPct,
				oidWodDet);
	}

}
