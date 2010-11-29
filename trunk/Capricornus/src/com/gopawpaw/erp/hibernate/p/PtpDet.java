package com.gopawpaw.erp.hibernate.p;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PtpDet entity. @author MyEclipse Persistence Tools
 */
public class PtpDet extends AbstractPtpDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtpDet() {
	}

	/** minimal constructor */
	public PtpDet(PtpDetId id, Date ptpAdded, String ptpDraw,
			Boolean ptpEcoPend, Integer ptpLlBom, Boolean ptpRollup,
			String ptpTrantype, Integer ptpLlDrp, String ptpJointType,
			String ptpBtbType, String ptpRunSeq1, String ptpRunSeq2,
			String ptpAtpEnforcement, Boolean ptpAtpFamily, Double oidPtpDet) {
		super(id, ptpAdded, ptpDraw, ptpEcoPend, ptpLlBom, ptpRollup,
				ptpTrantype, ptpLlDrp, ptpJointType, ptpBtbType, ptpRunSeq1,
				ptpRunSeq2, ptpAtpEnforcement, ptpAtpFamily, oidPtpDet);
	}

	/** full constructor */
	public PtpDet(PtpDetId id, Double ptpBatch, String ptpBomCode,
			Date ptpQad01, String ptpBuyer, Integer ptpCumLead,
			BigDecimal ptpQad02, Integer ptpInsLead, Boolean ptpInsRqd,
			Boolean ptpIssPol, BigDecimal ptpMfgLead, Boolean ptpMs,
			BigDecimal ptpOrdMax, BigDecimal ptpOrdMin, BigDecimal ptpOrdMult,
			Integer ptpOrdPer, String ptpOrdPol, Double ptpOrdQty,
			Boolean ptpPhantom, Boolean ptpPlanOrd, String ptpPmCode,
			Integer ptpPurLead, String ptpRev, BigDecimal ptpRop,
			String ptpRouting, Double ptpRun, Double ptpRunLl, Double ptpSetup,
			Double ptpSetupLl, BigDecimal ptpSftyStk, BigDecimal ptpSftyTme,
			Integer ptpTimefnce, String ptpUser1, String ptpUser2,
			String ptpVend, Double ptpYldPct, Double ptpAssay, String ptpGrade,
			String ptpNetwork, Integer ptpQad03, Integer ptpQad04,
			Date ptpAdded, Integer ptpQad05, String ptpDraw,
			Boolean ptpEcoPend, Integer ptpLlBom, Boolean ptpRollup,
			String ptpTrantype, String ptpChr01, String ptpChr02,
			String ptpChr03, String ptpChr04, String ptpChr05, String ptpChr06,
			String ptpChr07, String ptpChr08, String ptpChr09, String ptpChr10,
			Double ptpDec01, Double ptpDec02, Date ptpDte01, Date ptpDte02,
			Boolean ptpLog01, Boolean ptpLog02, Integer ptpLlDrp,
			String ptpPoSite, String ptpUserid, Date ptpModDate,
			String ptpRollupId, Double ptpMfgPct, Double ptpPurPct,
			Double ptpDrpPct, String ptpPouCode, Double ptpWksAvg,
			Double ptpWksMax, Double ptpWksMin, Integer ptpPickLogic,
			String ptpJointType, String ptpBtbType, String ptpCfgType,
			Boolean ptpOpYield, String ptpRunSeq1, String ptpRunSeq2,
			String ptpAtpEnforcement, Boolean ptpAtpFamily, Double oidPtpDet) {
		super(id, ptpBatch, ptpBomCode, ptpQad01, ptpBuyer, ptpCumLead,
				ptpQad02, ptpInsLead, ptpInsRqd, ptpIssPol, ptpMfgLead, ptpMs,
				ptpOrdMax, ptpOrdMin, ptpOrdMult, ptpOrdPer, ptpOrdPol,
				ptpOrdQty, ptpPhantom, ptpPlanOrd, ptpPmCode, ptpPurLead,
				ptpRev, ptpRop, ptpRouting, ptpRun, ptpRunLl, ptpSetup,
				ptpSetupLl, ptpSftyStk, ptpSftyTme, ptpTimefnce, ptpUser1,
				ptpUser2, ptpVend, ptpYldPct, ptpAssay, ptpGrade, ptpNetwork,
				ptpQad03, ptpQad04, ptpAdded, ptpQad05, ptpDraw, ptpEcoPend,
				ptpLlBom, ptpRollup, ptpTrantype, ptpChr01, ptpChr02, ptpChr03,
				ptpChr04, ptpChr05, ptpChr06, ptpChr07, ptpChr08, ptpChr09,
				ptpChr10, ptpDec01, ptpDec02, ptpDte01, ptpDte02, ptpLog01,
				ptpLog02, ptpLlDrp, ptpPoSite, ptpUserid, ptpModDate,
				ptpRollupId, ptpMfgPct, ptpPurPct, ptpDrpPct, ptpPouCode,
				ptpWksAvg, ptpWksMax, ptpWksMin, ptpPickLogic, ptpJointType,
				ptpBtbType, ptpCfgType, ptpOpYield, ptpRunSeq1, ptpRunSeq2,
				ptpAtpEnforcement, ptpAtpFamily, oidPtpDet);
	}

}
