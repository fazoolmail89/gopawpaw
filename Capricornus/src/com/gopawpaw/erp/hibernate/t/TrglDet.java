package com.gopawpaw.erp.hibernate.t;

/**
 * TrglDet entity. @author MyEclipse Persistence Tools
 */
public class TrglDet extends AbstractTrglDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrglDet() {
	}

	/** minimal constructor */
	public TrglDet(TrglDetId id, String trglDyCode, String trglDyNum,
			Double oidTrglDet) {
		super(id, trglDyCode, trglDyNum, oidTrglDet);
	}

	/** full constructor */
	public TrglDet(TrglDetId id, String trglCrAcct, String trglCrCc,
			String trglDrAcct, String trglDrCc, Double trglGlAmt,
			String trglType, String trglCrProj, String trglDrProj,
			Integer trglCrLine, Integer trglDrLine, String trglUser1,
			String trglUser2, String trglQadc01, String trglDyCode,
			String trglDyNum, String trglCrSub, String trglDrSub,
			Double oidTrglDet) {
		super(id, trglCrAcct, trglCrCc, trglDrAcct, trglDrCc, trglGlAmt,
				trglType, trglCrProj, trglDrProj, trglCrLine, trglDrLine,
				trglUser1, trglUser2, trglQadc01, trglDyCode, trglDyNum,
				trglCrSub, trglDrSub, oidTrglDet);
	}

}
