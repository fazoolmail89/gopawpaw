package com.gopawpaw.erp.hibernate.c;

/**
 * CctMstrId entity. @author MyEclipse Persistence Tools
 */
public class CctMstrId extends AbstractCctMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CctMstrId() {
	}

	/** full constructor */
	public CctMstrId(String cctDomain, String cctChargeType) {
		super(cctDomain, cctChargeType);
	}

}
