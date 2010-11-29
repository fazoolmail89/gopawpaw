package com.gopawpaw.erp.hibernate.s;

/**
 * SbdDet entity. @author MyEclipse Persistence Tools
 */
public class SbdDet extends AbstractSbdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SbdDet() {
	}

	/** minimal constructor */
	public SbdDet(SbdDetId id, Double oidSbdDet) {
		super(id, oidSbdDet);
	}

	/** full constructor */
	public SbdDet(SbdDetId id, String sbdAccBeg, String sbdAccEnd,
			String sbdUser1, String sbdUser2, String sbdQadc01, Double oidSbdDet) {
		super(id, sbdAccBeg, sbdAccEnd, sbdUser1, sbdUser2, sbdQadc01,
				oidSbdDet);
	}

}
