package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtakDet entity. @author MyEclipse Persistence Tools
 */
public class AtakDet extends AbstractAtakDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtakDet() {
	}

	/** full constructor */
	public AtakDet(AtakDetId id, Double oidAtakDet, String atakKeyType,
			Date atakModDate, String atakModUserid, String atakUser1,
			String atakUser2, String atakQadc01, String atakQadc02) {
		super(id, oidAtakDet, atakKeyType, atakModDate, atakModUserid,
				atakUser1, atakUser2, atakQadc01, atakQadc02);
	}

}
