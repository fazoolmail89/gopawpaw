package com.gopawpaw.erp.hibernate.l;

/**
 * LsMstrId entity. @author MyEclipse Persistence Tools
 */
public class LsMstrId extends AbstractLsMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LsMstrId() {
	}

	/** minimal constructor */
	public LsMstrId(String lsDomain, String lsType) {
		super(lsDomain, lsType);
	}

	/** full constructor */
	public LsMstrId(String lsDomain, String lsAddr, String lsType) {
		super(lsDomain, lsAddr, lsType);
	}

}
