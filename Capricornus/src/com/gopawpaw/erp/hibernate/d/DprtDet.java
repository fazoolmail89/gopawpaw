package com.gopawpaw.erp.hibernate.d;

/**
 * DprtDet entity. @author MyEclipse Persistence Tools
 */
public class DprtDet extends AbstractDprtDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DprtDet() {
	}

	/** minimal constructor */
	public DprtDet(DprtDetId id, Double oidDprtDet) {
		super(id, oidDprtDet);
	}

	/** full constructor */
	public DprtDet(DprtDetId id, Double dprtAmt, Double dprtPercent,
			Boolean dprtQad01, String dprtQad02, String dprtQad03,
			String dprtUser1, String dprtUser2, Double oidDprtDet) {
		super(id, dprtAmt, dprtPercent, dprtQad01, dprtQad02, dprtQad03,
				dprtUser1, dprtUser2, oidDprtDet);
	}

}
