package com.gopawpaw.erp.hibernate.p;

/**
 * PttDetId entity. @author MyEclipse Persistence Tools
 */
public class PttDetId extends AbstractPttDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PttDetId() {
	}

	/** minimal constructor */
	public PttDetId(String pttDomain, String pttPart) {
		super(pttDomain, pttPart);
	}

	/** full constructor */
	public PttDetId(String pttDomain, String pttPart, String pttTaxType) {
		super(pttDomain, pttPart, pttTaxType);
	}

}
