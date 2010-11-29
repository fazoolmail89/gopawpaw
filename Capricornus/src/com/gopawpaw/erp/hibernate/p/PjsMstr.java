package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PjsMstr entity. @author MyEclipse Persistence Tools
 */
public class PjsMstr extends AbstractPjsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PjsMstr() {
	}

	/** minimal constructor */
	public PjsMstr(PjsMstrId id, Integer pjsSubNbr, String pjsLineDisp,
			Integer pjsLinePar, Integer pjsLineSeq, String pjsLineSort,
			Double pjsAmtInv, Integer pjsBudgetType, String pjsCaIntType,
			Integer pjsCmtindx, Boolean pjsCompleted, Double pjsCost,
			Double pjsCostActual, Double pjsCostIss, Double pjsCostWip,
			String pjsDesc, Double pjsDiscPct, Boolean pjsFrozen,
			String pjsFscCode, Boolean pjsDetailOnInv, Boolean pjsPriceOnInv,
			Boolean pjsInvLvl, String pjsInvGroup, Boolean pjsLinkOk,
			Double pjsListPr, String pjsPart, Double pjsPovarAmt,
			Double pjsPrice, String pjsProdLine, Double pjsQtyActual,
			Double pjsQtyBudget, Double pjsQtyInv, Double pjsQtyIss,
			Double pjsQtyOh, Double pjsQtyPlanned, Double pjsQtySelInv,
			Double pjsQtyWip, String pjsStatus, Boolean pjsSubassy,
			String pjsUm, Double pjsUmConv, Boolean pjsVariation,
			Date pjsModDate, String pjsModUserid, Double oidPjsMstr) {
		super(id, pjsSubNbr, pjsLineDisp, pjsLinePar, pjsLineSeq, pjsLineSort,
				pjsAmtInv, pjsBudgetType, pjsCaIntType, pjsCmtindx,
				pjsCompleted, pjsCost, pjsCostActual, pjsCostIss, pjsCostWip,
				pjsDesc, pjsDiscPct, pjsFrozen, pjsFscCode, pjsDetailOnInv,
				pjsPriceOnInv, pjsInvLvl, pjsInvGroup, pjsLinkOk, pjsListPr,
				pjsPart, pjsPovarAmt, pjsPrice, pjsProdLine, pjsQtyActual,
				pjsQtyBudget, pjsQtyInv, pjsQtyIss, pjsQtyOh, pjsQtyPlanned,
				pjsQtySelInv, pjsQtyWip, pjsStatus, pjsSubassy, pjsUm,
				pjsUmConv, pjsVariation, pjsModDate, pjsModUserid, oidPjsMstr);
	}

	/** full constructor */
	public PjsMstr(PjsMstrId id, Integer pjsSubNbr, String pjsLineDisp,
			Integer pjsLinePar, Integer pjsLineSeq, String pjsLineSort,
			Double pjsAmtInv, Integer pjsBudgetType, String pjsCaIntType,
			Integer pjsCmtindx, Boolean pjsCompleted, Double pjsCost,
			Double pjsCostActual, Double pjsCostIss, Double pjsCostWip,
			String pjsDesc, Double pjsDiscPct, Boolean pjsFrozen,
			String pjsFscCode, Boolean pjsDetailOnInv, Boolean pjsPriceOnInv,
			Boolean pjsInvLvl, String pjsInvGroup, Boolean pjsLinkOk,
			Double pjsListPr, String pjsPart, Double pjsPovarAmt,
			Double pjsPrice, String pjsProdLine, Double pjsQtyActual,
			Double pjsQtyBudget, Double pjsQtyInv, Double pjsQtyIss,
			Double pjsQtyOh, Double pjsQtyPlanned, Double pjsQtySelInv,
			Double pjsQtyWip, String pjsStatus, Boolean pjsSubassy,
			String pjsUm, Double pjsUmConv, Boolean pjsVariation,
			Date pjsModDate, String pjsModUserid, String pjsUser1,
			String pjsUser2, String pjsChr01, Double pjsDec01, Double pjsDec02,
			Boolean pjsLog01, Boolean pjsLog02, Date pjsDte01, Date pjsDte02,
			String pjsQadc01, String pjsQadc02, String pjsQadc03,
			Double pjsQadd01, Double pjsQadd02, Integer pjsQadi01,
			Integer pjsQadi02, Boolean pjsQadl01, Boolean pjsQadl02,
			Date pjsQadt01, Date pjsQadt02, Double oidPjsMstr) {
		super(id, pjsSubNbr, pjsLineDisp, pjsLinePar, pjsLineSeq, pjsLineSort,
				pjsAmtInv, pjsBudgetType, pjsCaIntType, pjsCmtindx,
				pjsCompleted, pjsCost, pjsCostActual, pjsCostIss, pjsCostWip,
				pjsDesc, pjsDiscPct, pjsFrozen, pjsFscCode, pjsDetailOnInv,
				pjsPriceOnInv, pjsInvLvl, pjsInvGroup, pjsLinkOk, pjsListPr,
				pjsPart, pjsPovarAmt, pjsPrice, pjsProdLine, pjsQtyActual,
				pjsQtyBudget, pjsQtyInv, pjsQtyIss, pjsQtyOh, pjsQtyPlanned,
				pjsQtySelInv, pjsQtyWip, pjsStatus, pjsSubassy, pjsUm,
				pjsUmConv, pjsVariation, pjsModDate, pjsModUserid, pjsUser1,
				pjsUser2, pjsChr01, pjsDec01, pjsDec02, pjsLog01, pjsLog02,
				pjsDte01, pjsDte02, pjsQadc01, pjsQadc02, pjsQadc03, pjsQadd01,
				pjsQadd02, pjsQadi01, pjsQadi02, pjsQadl01, pjsQadl02,
				pjsQadt01, pjsQadt02, oidPjsMstr);
	}

}
