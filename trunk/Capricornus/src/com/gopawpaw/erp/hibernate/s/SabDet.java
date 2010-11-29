package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SabDet entity. @author MyEclipse Persistence Tools
 */
public class SabDet extends AbstractSabDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SabDet() {
	}

	/** minimal constructor */
	public SabDet(SabDetId id, String sabLineType, String sabEuNbr,
			String sabSoNbr, Integer sabSodLine, String sabCust,
			String sabBillTo, String sabAmtType, String sabCycle,
			String sabDesc, Double sabExtPrice, String sabFor,
			Double sabListPr, String sabSvCode, Double sabPrice,
			Double sabQtyChg, Double sabQtyPer, Integer sabRef,
			String sabSerial, Boolean sabTaxable, String sabTaxc,
			String sabTaxEnv, Boolean sabTaxIn, String sabTaxUsage,
			Integer sabLineSeq, String sabCurr, Integer sabUiLine,
			String sabUser1, String sabUser2, Double sabUserd01,
			Integer sabUseri01, Boolean sabUserl01, String sabQadc01,
			Double sabQadd01, Integer sabQadi01, Boolean sabQadl01,
			String sabModUserid, Date sabModDate, Double sabExRate,
			Double sabExRate2, String sabExRatetype, Integer sabExruSeq,
			String sabQadc02, Double oidSabDet) {
		super(id, sabLineType, sabEuNbr, sabSoNbr, sabSodLine, sabCust,
				sabBillTo, sabAmtType, sabCycle, sabDesc, sabExtPrice, sabFor,
				sabListPr, sabSvCode, sabPrice, sabQtyChg, sabQtyPer, sabRef,
				sabSerial, sabTaxable, sabTaxc, sabTaxEnv, sabTaxIn,
				sabTaxUsage, sabLineSeq, sabCurr, sabUiLine, sabUser1,
				sabUser2, sabUserd01, sabUseri01, sabUserl01, sabQadc01,
				sabQadd01, sabQadi01, sabQadl01, sabModUserid, sabModDate,
				sabExRate, sabExRate2, sabExRatetype, sabExruSeq, sabQadc02,
				oidSabDet);
	}

	/** full constructor */
	public SabDet(SabDetId id, String sabLineType, String sabEuNbr,
			String sabSoNbr, Integer sabSodLine, String sabCust,
			String sabBillTo, String sabAmtType, String sabCycle,
			String sabDesc, Date sabEndCover, Date sabEndDate,
			Double sabExtPrice, String sabFor, Double sabListPr,
			Date sabLstcover, String sabSvCode, Double sabPrice,
			Double sabQtyChg, Double sabQtyPer, Integer sabRef,
			String sabSerial, Date sabStCover, Date sabStDate,
			Boolean sabTaxable, String sabTaxc, String sabTaxEnv,
			Boolean sabTaxIn, String sabTaxUsage, Integer sabLineSeq,
			String sabCurr, Integer sabUiLine, String sabUser1,
			String sabUser2, Double sabUserd01, Integer sabUseri01,
			Boolean sabUserl01, Date sabUsert01, String sabQadc01,
			Double sabQadd01, Integer sabQadi01, Boolean sabQadl01,
			Date sabQadt01, String sabModUserid, Date sabModDate,
			Double sabExRate, Double sabExRate2, String sabExRatetype,
			Integer sabExruSeq, String sabQadc02, Double oidSabDet) {
		super(id, sabLineType, sabEuNbr, sabSoNbr, sabSodLine, sabCust,
				sabBillTo, sabAmtType, sabCycle, sabDesc, sabEndCover,
				sabEndDate, sabExtPrice, sabFor, sabListPr, sabLstcover,
				sabSvCode, sabPrice, sabQtyChg, sabQtyPer, sabRef, sabSerial,
				sabStCover, sabStDate, sabTaxable, sabTaxc, sabTaxEnv,
				sabTaxIn, sabTaxUsage, sabLineSeq, sabCurr, sabUiLine,
				sabUser1, sabUser2, sabUserd01, sabUseri01, sabUserl01,
				sabUsert01, sabQadc01, sabQadd01, sabQadi01, sabQadl01,
				sabQadt01, sabModUserid, sabModDate, sabExRate, sabExRate2,
				sabExRatetype, sabExruSeq, sabQadc02, oidSabDet);
	}

}
