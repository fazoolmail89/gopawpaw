package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtpDet entity. @author MyEclipse Persistence Tools
 */
public class AtpDet extends AbstractAtpDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtpDet() {
	}

	/** minimal constructor */
	public AtpDet(AtpDetId id, Double oidAtpDet) {
		super(id, oidAtpDet);
	}

	/** full constructor */
	public AtpDet(AtpDetId id, Date atpQad02, Double atpQty, String atpQad03,
			String atpQad04, String atpQad01, String atpUser1, String atpUser2,
			Double oidAtpDet) {
		super(id, atpQad02, atpQty, atpQad03, atpQad04, atpQad01, atpUser1,
				atpUser2, oidAtpDet);
	}

}
