package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FnhHistId entity. @author MyEclipse Persistence Tools
 */
public class FnhHistId extends AbstractFnhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FnhHistId() {
	}

	/** minimal constructor */
	public FnhHistId(String fnhDomain) {
		super(fnhDomain);
	}

	/** full constructor */
	public FnhHistId(String fnhDomain, String fnhNbr, Date fnhEffDate,
			Integer fnhSequence) {
		super(fnhDomain, fnhNbr, fnhEffDate, fnhSequence);
	}

}
