package com.gopawpaw.erp.hibernate.c;

/**
 * CtdDet entity. @author MyEclipse Persistence Tools
 */
public class CtdDet extends AbstractCtdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CtdDet() {
	}

	/** minimal constructor */
	public CtdDet(CtdDetId id, Double oidCtdDet) {
		super(id, oidCtdDet);
	}

	/** full constructor */
	public CtdDet(CtdDetId id, String ctdDateCd, Double ctdPctDue,
			String ctdUser1, String ctdUser2, String ctdQadc01, Double oidCtdDet) {
		super(id, ctdDateCd, ctdPctDue, ctdUser1, ctdUser2, ctdQadc01,
				oidCtdDet);
	}

}
