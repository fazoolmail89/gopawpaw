package com.gopawpaw.erp.hibernate.s;

/**
 * SodDetId entity. @author MyEclipse Persistence Tools
 */
public class SodDetId extends AbstractSodDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SodDetId() {
	}

	/** minimal constructor */
	public SodDetId(String sodDomain, String sodNbr) {
		super(sodDomain, sodNbr);
	}

	/** full constructor */
	public SodDetId(String sodDomain, String sodNbr, Integer sodLine) {
		super(sodDomain, sodNbr, sodLine);
	}

}
