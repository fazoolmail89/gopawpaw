package com.gopawpaw.erp.hibernate.s;

/**
 * SiMstrId entity. @author MyEclipse Persistence Tools
 */
public class SiMstrId extends AbstractSiMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SiMstrId() {
	}

	/** minimal constructor */
	public SiMstrId(String siDomain) {
		super(siDomain);
	}

	/** full constructor */
	public SiMstrId(String siDomain, String siSite) {
		super(siDomain, siSite);
	}

}
