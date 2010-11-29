package com.gopawpaw.erp.hibernate.r;

/**
 * RqdDetId entity. @author MyEclipse Persistence Tools
 */
public class RqdDetId extends AbstractRqdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqdDetId() {
	}

	/** minimal constructor */
	public RqdDetId(String rqdDomain) {
		super(rqdDomain);
	}

	/** full constructor */
	public RqdDetId(String rqdDomain, String rqdNbr, Integer rqdLine) {
		super(rqdDomain, rqdNbr, rqdLine);
	}

}
