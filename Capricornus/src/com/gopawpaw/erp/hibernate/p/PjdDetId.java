package com.gopawpaw.erp.hibernate.p;

/**
 * PjdDetId entity. @author MyEclipse Persistence Tools
 */
public class PjdDetId extends AbstractPjdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PjdDetId() {
	}

	/** full constructor */
	public PjdDetId(String pjdDomain, String pjdNbr, Integer pjdSubNbr) {
		super(pjdDomain, pjdNbr, pjdSubNbr);
	}

}
