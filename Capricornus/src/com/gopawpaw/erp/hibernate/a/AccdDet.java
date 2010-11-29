package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AccdDet entity. @author MyEclipse Persistence Tools
 */
public class AccdDet extends AbstractAccdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AccdDet() {
	}

	/** minimal constructor */
	public AccdDet(AccdDetId id, Double accdExRate2, String accdExRatetype,
			Integer accdExruSeq, Double oidAccdDet) {
		super(id, accdExRate2, accdExRatetype, accdExruSeq, oidAccdDet);
	}

	/** full constructor */
	public AccdDet(AccdDetId id, String accdDesc, Date accdDate,
			Double accdAmt, String accdCurr, Double accdCurrAmt,
			Double accdExRate, Double accdEntEx, Integer accdLifeYr,
			Integer accdLifeMnth, String accdUserid, Date accdModDate,
			String accdUser1, String accdUser2, String accdQadc01,
			Double accdExRate2, String accdExRatetype, Integer accdExruSeq,
			Double oidAccdDet) {
		super(id, accdDesc, accdDate, accdAmt, accdCurr, accdCurrAmt,
				accdExRate, accdEntEx, accdLifeYr, accdLifeMnth, accdUserid,
				accdModDate, accdUser1, accdUser2, accdQadc01, accdExRate2,
				accdExRatetype, accdExruSeq, oidAccdDet);
	}

}
