package com.gopawpaw.erp.hibernate.a;

/**
 * AcdDet entity. @author MyEclipse Persistence Tools
 */
public class AcdDet extends AbstractAcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcdDet() {
	}

	/** minimal constructor */
	public AcdDet(AcdDetId id, Double acdDrAmt, Double acdCrAmt,
			Double acdCrCurrAmt, Double acdDrCurrAmt, Double oidAcdDet) {
		super(id, acdDrAmt, acdCrAmt, acdCrCurrAmt, acdDrCurrAmt, oidAcdDet);
	}

	/** full constructor */
	public AcdDet(AcdDetId id, Double acdAmt, Double acdCurrAmt,
			String acdUser1, String acdUser2, Double acdEcurAmt,
			String acdQadc01, Double acdDrAmt, Double acdCrAmt,
			Double acdCrCurrAmt, Double acdDrCurrAmt, Double oidAcdDet) {
		super(id, acdAmt, acdCurrAmt, acdUser1, acdUser2, acdEcurAmt,
				acdQadc01, acdDrAmt, acdCrAmt, acdCrCurrAmt, acdDrCurrAmt,
				oidAcdDet);
	}

}
