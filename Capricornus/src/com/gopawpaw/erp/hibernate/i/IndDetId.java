package com.gopawpaw.erp.hibernate.i;

/**
 * IndDetId entity. @author MyEclipse Persistence Tools
 */
public class IndDetId extends AbstractIndDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IndDetId() {
	}

	/** minimal constructor */
	public IndDetId(String indDomain) {
		super(indDomain);
	}

	/** full constructor */
	public IndDetId(String indDomain, String indSite, String indNbr,
			String indPart) {
		super(indDomain, indSite, indNbr, indPart);
	}

}
