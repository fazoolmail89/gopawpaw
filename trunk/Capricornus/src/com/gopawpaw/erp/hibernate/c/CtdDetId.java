package com.gopawpaw.erp.hibernate.c;

/**
 * CtdDetId entity. @author MyEclipse Persistence Tools
 */
public class CtdDetId extends AbstractCtdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CtdDetId() {
	}

	/** minimal constructor */
	public CtdDetId(String ctdDomain, Integer ctdSeq) {
		super(ctdDomain, ctdSeq);
	}

	/** full constructor */
	public CtdDetId(String ctdDomain, String ctdCode, Integer ctdSeq) {
		super(ctdDomain, ctdCode, ctdSeq);
	}

}
