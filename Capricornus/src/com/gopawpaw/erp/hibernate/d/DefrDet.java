package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DefrDet entity. @author MyEclipse Persistence Tools
 */
public class DefrDet extends AbstractDefrDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DefrDet() {
	}

	/** minimal constructor */
	public DefrDet(DefrDetId id, String defrCurr, String defrCust,
			String defrEntity, String defrEuNbr, Double defrExRate,
			Double defrExRate2, String defrExRatetype, Integer defrExruSeq,
			String defrFor, Double defrAccrAmt, Double defrInvAmt,
			Double defrPerPeriodAmt, Double defrPeriodCurrAmt,
			Double defrPeriodRemain, Double defrRevAmt, Double defrRecAmt,
			String defrProject, String defrSlsAcct, String defrSlsSub,
			String defrSlsCc, String defrAcct, String defrSub, String defrCc,
			String defrUser1, String defrUser2, Double defrUserd01,
			Integer defrUseri01, Boolean defrUserl01, String defrQadc01,
			Double defrQadd01, Integer defrQadi01, Boolean defrQadl01,
			String defrModUserid, Date defrModDate, String defrQadc02,
			String defrBillTo, Double oidDefrDet) {
		super(id, defrCurr, defrCust, defrEntity, defrEuNbr, defrExRate,
				defrExRate2, defrExRatetype, defrExruSeq, defrFor, defrAccrAmt,
				defrInvAmt, defrPerPeriodAmt, defrPeriodCurrAmt,
				defrPeriodRemain, defrRevAmt, defrRecAmt, defrProject,
				defrSlsAcct, defrSlsSub, defrSlsCc, defrAcct, defrSub, defrCc,
				defrUser1, defrUser2, defrUserd01, defrUseri01, defrUserl01,
				defrQadc01, defrQadd01, defrQadi01, defrQadl01, defrModUserid,
				defrModDate, defrQadc02, defrBillTo, oidDefrDet);
	}

	/** full constructor */
	public DefrDet(DefrDetId id, String defrCurr, String defrCust,
			Date defrEffDate, String defrEntity, String defrEuNbr,
			Double defrExRate, Double defrExRate2, String defrExRatetype,
			Integer defrExruSeq, String defrFor, Double defrAccrAmt,
			Double defrInvAmt, Double defrPerPeriodAmt,
			Double defrPeriodCurrAmt, Double defrPeriodRemain,
			Double defrRevAmt, Double defrRecAmt, String defrProject,
			String defrSlsAcct, String defrSlsSub, String defrSlsCc,
			String defrAcct, String defrSub, String defrCc, String defrUser1,
			String defrUser2, Double defrUserd01, Integer defrUseri01,
			Boolean defrUserl01, Date defrUsert01, String defrQadc01,
			Double defrQadd01, Integer defrQadi01, Boolean defrQadl01,
			Date defrQadt01, String defrModUserid, Date defrModDate,
			String defrQadc02, String defrBillTo, Double oidDefrDet) {
		super(id, defrCurr, defrCust, defrEffDate, defrEntity, defrEuNbr,
				defrExRate, defrExRate2, defrExRatetype, defrExruSeq, defrFor,
				defrAccrAmt, defrInvAmt, defrPerPeriodAmt, defrPeriodCurrAmt,
				defrPeriodRemain, defrRevAmt, defrRecAmt, defrProject,
				defrSlsAcct, defrSlsSub, defrSlsCc, defrAcct, defrSub, defrCc,
				defrUser1, defrUser2, defrUserd01, defrUseri01, defrUserl01,
				defrUsert01, defrQadc01, defrQadd01, defrQadi01, defrQadl01,
				defrQadt01, defrModUserid, defrModDate, defrQadc02, defrBillTo,
				oidDefrDet);
	}

}
