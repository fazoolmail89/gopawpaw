package com.gopawpaw.erp.hibernate.t;

/**
 * TeMstrId entity. @author MyEclipse Persistence Tools
 */
public class TeMstrId extends AbstractTeMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TeMstrId() {
	}

	/** minimal constructor */
	public TeMstrId(String teDomain) {
		super(teDomain);
	}

	/** full constructor */
	public TeMstrId(String teDomain, String teSite, Integer teNbr,
			Integer teLine) {
		super(teDomain, teSite, teNbr, teLine);
	}

}
