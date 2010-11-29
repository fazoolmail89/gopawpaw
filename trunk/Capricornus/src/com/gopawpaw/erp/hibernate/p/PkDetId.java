package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PkDetId entity. @author MyEclipse Persistence Tools
 */
public class PkDetId extends AbstractPkDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PkDetId() {
	}

	/** minimal constructor */
	public PkDetId(String pkDomain, String pkPart) {
		super(pkDomain, pkPart);
	}

	/** full constructor */
	public PkDetId(String pkDomain, String pkUser, String pkPart,
			String pkReference, Date pkStart, Date pkEnd) {
		super(pkDomain, pkUser, pkPart, pkReference, pkStart, pkEnd);
	}

}
