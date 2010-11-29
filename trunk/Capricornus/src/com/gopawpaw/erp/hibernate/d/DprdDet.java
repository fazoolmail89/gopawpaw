package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DprdDet entity. @author MyEclipse Persistence Tools
 */
public class DprdDet extends AbstractDprdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DprdDet() {
	}

	/** minimal constructor */
	public DprdDet(DprdDetId id, Double dprdExRate2, String dprdExRatetype,
			Integer dprdExruSeq, Double oidDprdDet) {
		super(id, dprdExRate2, dprdExRatetype, dprdExruSeq, oidDprdDet);
	}

	/** full constructor */
	public DprdDet(DprdDetId id, Integer dprdPd, Double dprdAmt,
			Double dprdCurrAmt, Double dprdExRate, Double dprdEntEx,
			String dprdUser1, Boolean dprdPost, Date dprdEffdate,
			String dprdAcct, String dprdSub, String dprdCc, String dprdProj,
			String dprdType, String dprdMethod, String dprdQad01,
			String dprdQad02, Boolean dprdPdClosed, String dprdRef,
			Integer dprdGlLine, String dprdUser2, String dprdDesc,
			Double dprdCostPct, Double dprdExRate2, String dprdExRatetype,
			Integer dprdExruSeq, Double oidDprdDet) {
		super(id, dprdPd, dprdAmt, dprdCurrAmt, dprdExRate, dprdEntEx,
				dprdUser1, dprdPost, dprdEffdate, dprdAcct, dprdSub, dprdCc,
				dprdProj, dprdType, dprdMethod, dprdQad01, dprdQad02,
				dprdPdClosed, dprdRef, dprdGlLine, dprdUser2, dprdDesc,
				dprdCostPct, dprdExRate2, dprdExRatetype, dprdExruSeq,
				oidDprdDet);
	}

}
