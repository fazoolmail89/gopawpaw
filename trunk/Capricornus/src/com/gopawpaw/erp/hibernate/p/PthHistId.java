package com.gopawpaw.erp.hibernate.p;

/**
 * PthHistId entity. @author MyEclipse Persistence Tools
 */
public class PthHistId extends AbstractPthHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PthHistId() {
	}

	/** minimal constructor */
	public PthHistId(String pthDomain, Integer pthYear) {
		super(pthDomain, pthYear);
	}

	/** full constructor */
	public PthHistId(String pthDomain, Integer pthYear, String pthPart) {
		super(pthDomain, pthYear, pthPart);
	}

}
