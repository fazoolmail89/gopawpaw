package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TrldDet entity. @author MyEclipse Persistence Tools
 */
public class TrldDet extends AbstractTrldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrldDet() {
	}

	/** minimal constructor */
	public TrldDet(TrldDetId id, Double oidTrldDet) {
		super(id, oidTrldDet);
	}

	/** full constructor */
	public TrldDet(TrldDetId id, Boolean trldTaxable, String trldTaxc,
			String trldUser1, String trldUser2, String trldChr01,
			Boolean trldLog01, String trldQad01, String trldQad02,
			Double trldQad03, Date trldQad04, Boolean trldQad05,
			Double oidTrldDet) {
		super(id, trldTaxable, trldTaxc, trldUser1, trldUser2, trldChr01,
				trldLog01, trldQad01, trldQad02, trldQad03, trldQad04,
				trldQad05, oidTrldDet);
	}

}
