package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PjshHist entity. @author MyEclipse Persistence Tools
 */
public class PjshHist extends AbstractPjshHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PjshHist() {
	}

	/** minimal constructor */
	public PjshHist(PjshHistId id, String pjshNbr, Integer pjshPjsLine,
			Date pjshTrDate, Integer pjshTrTime, String pjshTrType,
			String pjshTrInd, Double pjshTrQty, Double pjshTrCost,
			Double pjshAmtInv, Double pjshAmtInvChg, Double pjshCostActual,
			Double pjshCostActChg, Double pjshCostIss, Double pjshCostIssChg,
			Double pjshCostPlanned, Double pjshCostPlnChg, Double pjshCostWip,
			Double pjshCostWipChg, Double pjshQtyActual, Double pjshQtyActChg,
			Double pjshQtyBudget, Double pjshQtyBgChg, Double pjshQtyInv,
			Double pjshQtyInvChg, Double pjshQtyIss, Double pjshQtyIssChg,
			Double pjshQtyOh, Double pjshQtyOhChg, Double pjshQtyPlanned,
			Double pjshQtyPlnChg, Double pjshQtySelInv, Double pjshQtySelChg,
			Double pjshQtyWip, Double pjshQtyWipChg, Double pjshPovarAmt,
			Double pjshPovarChg, String pjshOldStatus, String pjshStatus,
			String pjshRelNbr, String pjshUserid, Date pjshModDate,
			String pjshModUserid, Double oidPjshHist) {
		super(id, pjshNbr, pjshPjsLine, pjshTrDate, pjshTrTime, pjshTrType,
				pjshTrInd, pjshTrQty, pjshTrCost, pjshAmtInv, pjshAmtInvChg,
				pjshCostActual, pjshCostActChg, pjshCostIss, pjshCostIssChg,
				pjshCostPlanned, pjshCostPlnChg, pjshCostWip, pjshCostWipChg,
				pjshQtyActual, pjshQtyActChg, pjshQtyBudget, pjshQtyBgChg,
				pjshQtyInv, pjshQtyInvChg, pjshQtyIss, pjshQtyIssChg,
				pjshQtyOh, pjshQtyOhChg, pjshQtyPlanned, pjshQtyPlnChg,
				pjshQtySelInv, pjshQtySelChg, pjshQtyWip, pjshQtyWipChg,
				pjshPovarAmt, pjshPovarChg, pjshOldStatus, pjshStatus,
				pjshRelNbr, pjshUserid, pjshModDate, pjshModUserid, oidPjshHist);
	}

	/** full constructor */
	public PjshHist(PjshHistId id, String pjshNbr, Integer pjshPjsLine,
			Date pjshTrDate, Integer pjshTrTime, String pjshTrType,
			String pjshTrInd, Double pjshTrQty, Double pjshTrCost,
			Double pjshAmtInv, Double pjshAmtInvChg, Double pjshCostActual,
			Double pjshCostActChg, Double pjshCostIss, Double pjshCostIssChg,
			Double pjshCostPlanned, Double pjshCostPlnChg, Double pjshCostWip,
			Double pjshCostWipChg, Double pjshQtyActual, Double pjshQtyActChg,
			Double pjshQtyBudget, Double pjshQtyBgChg, Double pjshQtyInv,
			Double pjshQtyInvChg, Double pjshQtyIss, Double pjshQtyIssChg,
			Double pjshQtyOh, Double pjshQtyOhChg, Double pjshQtyPlanned,
			Double pjshQtyPlnChg, Double pjshQtySelInv, Double pjshQtySelChg,
			Double pjshQtyWip, Double pjshQtyWipChg, Double pjshPovarAmt,
			Double pjshPovarChg, String pjshOldStatus, String pjshStatus,
			String pjshRelNbr, String pjshUserid, Date pjshModDate,
			String pjshModUserid, String pjshUser1, String pjshUser2,
			String pjshQadc01, Double pjshQadd01, Integer pjshQadi01,
			Boolean pjshQadl01, Date pjshQadt01, Double oidPjshHist) {
		super(id, pjshNbr, pjshPjsLine, pjshTrDate, pjshTrTime, pjshTrType,
				pjshTrInd, pjshTrQty, pjshTrCost, pjshAmtInv, pjshAmtInvChg,
				pjshCostActual, pjshCostActChg, pjshCostIss, pjshCostIssChg,
				pjshCostPlanned, pjshCostPlnChg, pjshCostWip, pjshCostWipChg,
				pjshQtyActual, pjshQtyActChg, pjshQtyBudget, pjshQtyBgChg,
				pjshQtyInv, pjshQtyInvChg, pjshQtyIss, pjshQtyIssChg,
				pjshQtyOh, pjshQtyOhChg, pjshQtyPlanned, pjshQtyPlnChg,
				pjshQtySelInv, pjshQtySelChg, pjshQtyWip, pjshQtyWipChg,
				pjshPovarAmt, pjshPovarChg, pjshOldStatus, pjshStatus,
				pjshRelNbr, pjshUserid, pjshModDate, pjshModUserid, pjshUser1,
				pjshUser2, pjshQadc01, pjshQadd01, pjshQadi01, pjshQadl01,
				pjshQadt01, oidPjshHist);
	}

}
