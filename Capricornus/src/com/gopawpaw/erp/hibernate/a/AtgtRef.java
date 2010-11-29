package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtgtRef entity. @author MyEclipse Persistence Tools
 */
public class AtgtRef extends AbstractAtgtRef implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtgtRef() {
	}

	/** full constructor */
	public AtgtRef(AtgtRefId id, Double oidAtgtRef, Date atgtModDate,
			String atgtModUserid, String atgtUser1, String atgtUser2,
			String atgtQadc01, String atgtQadc02) {
		super(id, oidAtgtRef, atgtModDate, atgtModUserid, atgtUser1, atgtUser2,
				atgtQadc01, atgtQadc02);
	}

}
