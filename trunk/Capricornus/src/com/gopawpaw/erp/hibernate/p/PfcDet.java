package com.gopawpaw.erp.hibernate.p;

/**
 * PfcDet entity. @author MyEclipse Persistence Tools
 */
public class PfcDet extends AbstractPfcDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PfcDet() {
	}

	/** minimal constructor */
	public PfcDet(PfcDetId id, Double oidPfcDet) {
		super(id, oidPfcDet);
	}

	/** full constructor */
	public PfcDet(PfcDetId id, Double pfcQty, Integer pfcIdNum,
			String pfcUser1, String pfcUser2, String pfcQadc01, Double oidPfcDet) {
		super(id, pfcQty, pfcIdNum, pfcUser1, pfcUser2, pfcQadc01, oidPfcDet);
	}

}
