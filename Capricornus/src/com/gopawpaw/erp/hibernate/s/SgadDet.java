package com.gopawpaw.erp.hibernate.s;

/**
 * SgadDet entity. @author MyEclipse Persistence Tools
 */
public class SgadDet extends AbstractSgadDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SgadDet() {
	}

	/** minimal constructor */
	public SgadDet(SgadDetId id, String sgadConsShip, Double oidSgadDet) {
		super(id, sgadConsShip, oidSgadDet);
	}

	/** full constructor */
	public SgadDet(SgadDetId id, String sgadConsShip, String sgadUser1,
			String sgadUser2, String sgadQadc01, Double oidSgadDet) {
		super(id, sgadConsShip, sgadUser1, sgadUser2, sgadQadc01, oidSgadDet);
	}

}
