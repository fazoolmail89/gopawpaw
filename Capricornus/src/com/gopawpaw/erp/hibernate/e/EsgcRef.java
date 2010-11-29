package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsgcRef entity. @author MyEclipse Persistence Tools
 */
public class EsgcRef extends AbstractEsgcRef implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsgcRef() {
	}

	/** full constructor */
	public EsgcRef(EsgcRefId id, Double oidEsgcRef, Date esgcModDate,
			String esgcModUserid, String esgcUser1, String esgcUser2,
			String esgcQadc01, String esgcQadc02) {
		super(id, oidEsgcRef, esgcModDate, esgcModUserid, esgcUser1, esgcUser2,
				esgcQadc01, esgcQadc02);
	}

}
