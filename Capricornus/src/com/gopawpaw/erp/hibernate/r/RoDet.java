package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RoDet entity. @author MyEclipse Persistence Tools
 */
public class RoDet extends AbstractRoDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RoDet() {
	}

	/** minimal constructor */
	public RoDet(RoDetId id, Double oidRoDet) {
		super(id, oidRoDet);
	}

	/** full constructor */
	public RoDet(RoDetId id, String roDesc, String roWkctr, Double roSetup,
			Double roRun, Double roMove, Double roYieldPct, String roTool,
			String roVend, Double roSubCost, Date roEnd, Integer roTranQty,
			Double roInvValue, Integer roCmtindx, String roMch,
			Boolean roMilestone, Double roBatch, String roUser1,
			String roUser2, String roStdOp, Double roSetupMen, Double roMenMch,
			Integer roMchOp, Double roLbrOvhd, Double roQueue, Double roWait,
			Integer roSubLead, Double roCycUnit, Double roCycRate,
			String roChr01, String roChr02, String roChr03, String roChr04,
			String roChr05, Date roDte01, Date roDte02, Double roDec01,
			Double roDec02, Boolean roLog01, Double roStdBatch,
			Boolean roRollup, String roRollupId, String roElmLbr,
			String roElmBdn, String roElmSub, String roStartEcn,
			String roEndEcn, String roPoNbr, Integer roPoLine,
			Boolean roMvNxtOp, String roWipmtlPart, Boolean roAutoLbr,
			String roBomCode, Double roCost, String roFsmType, Double roPrice,
			Date roModDate, String roModUserid, String roQadc01,
			String roQadc02, String roQadc03, Double roQade01, Double roQade02,
			Date roQadt01, Date roQadt02, Boolean roQadl01, Boolean roQadl02,
			String roFscCode, Double oidRoDet) {
		super(id, roDesc, roWkctr, roSetup, roRun, roMove, roYieldPct, roTool,
				roVend, roSubCost, roEnd, roTranQty, roInvValue, roCmtindx,
				roMch, roMilestone, roBatch, roUser1, roUser2, roStdOp,
				roSetupMen, roMenMch, roMchOp, roLbrOvhd, roQueue, roWait,
				roSubLead, roCycUnit, roCycRate, roChr01, roChr02, roChr03,
				roChr04, roChr05, roDte01, roDte02, roDec01, roDec02, roLog01,
				roStdBatch, roRollup, roRollupId, roElmLbr, roElmBdn, roElmSub,
				roStartEcn, roEndEcn, roPoNbr, roPoLine, roMvNxtOp,
				roWipmtlPart, roAutoLbr, roBomCode, roCost, roFsmType, roPrice,
				roModDate, roModUserid, roQadc01, roQadc02, roQadc03, roQade01,
				roQade02, roQadt01, roQadt02, roQadl01, roQadl02, roFscCode,
				oidRoDet);
	}

}
