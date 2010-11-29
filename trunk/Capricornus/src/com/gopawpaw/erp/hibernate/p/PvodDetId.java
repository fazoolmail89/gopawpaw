package com.gopawpaw.erp.hibernate.p;

/**
 * PvodDetId entity. @author MyEclipse Persistence Tools
 */
public class PvodDetId extends AbstractPvodDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PvodDetId() {
	}

	/** full constructor */
	public PvodDetId(String pvodDomain, Integer pvodId, Integer pvodIdLine) {
		super(pvodDomain, pvodId, pvodIdLine);
	}

}
