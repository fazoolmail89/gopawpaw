package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * ArdDet entity. @author MyEclipse Persistence Tools
 */
public class ArdDet extends AbstractArdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ArdDet() {
	}

	/** minimal constructor */
	public ArdDet(ArdDetId id, String ardDyCode, String ardDyNum,
			Double ardExRate2, String ardExRatetype, Integer ardExruSeq,
			Double oidArdDet) {
		super(id, ardDyCode, ardDyNum, ardExRate2, ardExRatetype, ardExruSeq,
				oidArdDet);
	}

	/** full constructor */
	public ArdDet(ArdDetId id, Double ardAmt, String ardDesc, Double ardDisc,
			String ardUser1, String ardUser2, String ardQad02, Date ardQad01,
			String ardProject, Double ardCurAmt, Double ardCurDisc,
			Double ardExRate, String ardTaxUsage, String ardTaxc,
			String ardDyCode, String ardDyNum, Double ardExRate2,
			String ardExRatetype, Integer ardDedNbr, Integer ardExruSeq,
			Double oidArdDet) {
		super(id, ardAmt, ardDesc, ardDisc, ardUser1, ardUser2, ardQad02,
				ardQad01, ardProject, ardCurAmt, ardCurDisc, ardExRate,
				ardTaxUsage, ardTaxc, ardDyCode, ardDyNum, ardExRate2,
				ardExRatetype, ardDedNbr, ardExruSeq, oidArdDet);
	}

}
