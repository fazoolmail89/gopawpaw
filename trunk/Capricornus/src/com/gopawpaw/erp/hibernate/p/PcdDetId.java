package com.gopawpaw.erp.hibernate.p;

/**
 * PcdDetId entity. @author MyEclipse Persistence Tools
 */
public class PcdDetId extends AbstractPcdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PcdDetId() {
	}

	/** minimal constructor */
	public PcdDetId(String pcdDomain, String pcdNbr) {
		super(pcdDomain, pcdNbr);
	}

	/** full constructor */
	public PcdDetId(String pcdDomain, String pcdNbr, Integer pcdLine,
			String pcdElement) {
		super(pcdDomain, pcdNbr, pcdLine, pcdElement);
	}

}
