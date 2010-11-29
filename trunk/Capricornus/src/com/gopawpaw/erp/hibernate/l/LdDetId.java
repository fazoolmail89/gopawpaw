package com.gopawpaw.erp.hibernate.l;

/**
 * LdDetId entity. @author MyEclipse Persistence Tools
 */
public class LdDetId extends AbstractLdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LdDetId() {
	}

	/** minimal constructor */
	public LdDetId(String ldDomain, String ldPart) {
		super(ldDomain, ldPart);
	}

	/** full constructor */
	public LdDetId(String ldDomain, String ldSite, String ldLoc, String ldPart,
			String ldLot, String ldRef) {
		super(ldDomain, ldSite, ldLoc, ldPart, ldLot, ldRef);
	}

}
