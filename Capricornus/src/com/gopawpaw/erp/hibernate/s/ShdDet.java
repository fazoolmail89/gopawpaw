package com.gopawpaw.erp.hibernate.s;

/**
 * ShdDet entity. @author MyEclipse Persistence Tools
 */
public class ShdDet extends AbstractShdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShdDet() {
	}

	/** minimal constructor */
	public ShdDet(ShdDetId id, Double oidShdDet) {
		super(id, oidShdDet);
	}

	/** full constructor */
	public ShdDet(ShdDetId id, String shdUser1, String shdUser2,
			String shdQadc01, Double oidShdDet) {
		super(id, shdUser1, shdUser2, shdQadc01, oidShdDet);
	}

}
