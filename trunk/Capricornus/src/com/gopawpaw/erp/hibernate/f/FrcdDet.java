package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FrcdDet entity. @author MyEclipse Persistence Tools
 */
public class FrcdDet extends AbstractFrcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FrcdDet() {
	}

	/** minimal constructor */
	public FrcdDet(FrcdDetId id, Double oidFrcdDet) {
		super(id, oidFrcdDet);
	}

	/** full constructor */
	public FrcdDet(FrcdDetId id, Date frcdEnd, String frcdUser1,
			Double frcdMinWtc, Double frcdTotWtc, Double frcdXtrWtc,
			String frcdUser2, String frcdChr01, String frcdChr02,
			String frcdChr03, String frcdChr04, String frcdChr05,
			String frcdChr06, String frcdChr07, String frcdChr08,
			Double frcdDec01, Double frcdDec02, Date frcdDte01,
			Double frcdMinWt, Date frcdDte02, Boolean frcdLog01,
			Boolean frcdLog02, Double oidFrcdDet) {
		super(id, frcdEnd, frcdUser1, frcdMinWtc, frcdTotWtc, frcdXtrWtc,
				frcdUser2, frcdChr01, frcdChr02, frcdChr03, frcdChr04,
				frcdChr05, frcdChr06, frcdChr07, frcdChr08, frcdDec01,
				frcdDec02, frcdDte01, frcdMinWt, frcdDte02, frcdLog01,
				frcdLog02, oidFrcdDet);
	}

}
