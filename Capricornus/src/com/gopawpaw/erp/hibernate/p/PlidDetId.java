package com.gopawpaw.erp.hibernate.p;

/**
 * PlidDetId entity. @author MyEclipse Persistence Tools
 */
public class PlidDetId extends AbstractPlidDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PlidDetId() {
	}

	/** full constructor */
	public PlidDetId(String plidDomain, Integer plidPliKeyid, Integer plidLine) {
		super(plidDomain, plidPliKeyid, plidLine);
	}

}
