package com.gopawpaw.erp.hibernate.i;

/**
 * IldDetId entity. @author MyEclipse Persistence Tools
 */
public class IldDetId extends AbstractIldDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IldDetId() {
	}

	/** minimal constructor */
	public IldDetId(String ildDomain, String ildPart) {
		super(ildDomain, ildPart);
	}

	/** full constructor */
	public IldDetId(String ildDomain, String ildPart, String ildSite,
			String ildLoc) {
		super(ildDomain, ildPart, ildSite, ildLoc);
	}

}
