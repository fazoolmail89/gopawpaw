package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FrzdDet entity. @author MyEclipse Persistence Tools
 */
public class FrzdDet extends AbstractFrzdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FrzdDet() {
	}

	/** minimal constructor */
	public FrzdDet(FrzdDetId id, Double oidFrzdDet) {
		super(id, oidFrzdDet);
	}

	/** full constructor */
	public FrzdDet(FrzdDetId id, String frzdPostEn, Date frzdEnd,
			String frzdUser1, String frzdUser2, String frzdChr01,
			String frzdChr02, String frzdChr03, String frzdChr04,
			String frzdChr05, String frzdChr06, String frzdChr07,
			String frzdChr08, Double frzdDec01, Double frzdDec02,
			Date frzdDte01, Date frzdDte02, Boolean frzdLog01,
			Boolean frzdLog02, Double oidFrzdDet) {
		super(id, frzdPostEn, frzdEnd, frzdUser1, frzdUser2, frzdChr01,
				frzdChr02, frzdChr03, frzdChr04, frzdChr05, frzdChr06,
				frzdChr07, frzdChr08, frzdDec01, frzdDec02, frzdDte01,
				frzdDte02, frzdLog01, frzdLog02, oidFrzdDet);
	}

}
