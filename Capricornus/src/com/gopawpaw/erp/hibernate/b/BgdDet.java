package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BgdDet entity. @author MyEclipse Persistence Tools
 */
public class BgdDet extends AbstractBgdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BgdDet() {
	}

	/** minimal constructor */
	public BgdDet(BgdDetId id, Double oidBgdDet) {
		super(id, oidBgdDet);
	}

	/** full constructor */
	public BgdDet(BgdDetId id, Date bgdEntDt, Double bgdAmt, Double bgdPct,
			String bgdUser1, String bgdUser2, String bgdUserid, Date bgdDate,
			Double bgdEcurAmt, Double bgdEnEnrate, String bgdQadc01,
			Double oidBgdDet) {
		super(id, bgdEntDt, bgdAmt, bgdPct, bgdUser1, bgdUser2, bgdUserid,
				bgdDate, bgdEcurAmt, bgdEnEnrate, bgdQadc01, oidBgdDet);
	}

}
