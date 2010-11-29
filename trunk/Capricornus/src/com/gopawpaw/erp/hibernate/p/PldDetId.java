package com.gopawpaw.erp.hibernate.p;

/**
 * PldDetId entity. @author MyEclipse Persistence Tools
 */
public class PldDetId extends AbstractPldDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PldDetId() {
	}

	/** minimal constructor */
	public PldDetId(String pldDomain, String pldProdline) {
		super(pldDomain, pldProdline);
	}

	/** full constructor */
	public PldDetId(String pldDomain, String pldProdline, String pldSite,
			String pldLoc) {
		super(pldDomain, pldProdline, pldSite, pldLoc);
	}

}
