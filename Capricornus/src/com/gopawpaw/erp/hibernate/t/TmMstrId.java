package com.gopawpaw.erp.hibernate.t;

/**
 * TmMstrId entity. @author MyEclipse Persistence Tools
 */
public class TmMstrId extends AbstractTmMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TmMstrId() {
	}

	/** minimal constructor */
	public TmMstrId(String tmDomain) {
		super(tmDomain);
	}

	/** full constructor */
	public TmMstrId(String tmDomain, String tmCode) {
		super(tmDomain, tmCode);
	}

}
