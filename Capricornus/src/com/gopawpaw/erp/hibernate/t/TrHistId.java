package com.gopawpaw.erp.hibernate.t;

/**
 * TrHistId entity. @author MyEclipse Persistence Tools
 */
public class TrHistId extends AbstractTrHistId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrHistId() {
	}

	/** minimal constructor */
	public TrHistId(String trDomain) {
		super(trDomain);
	}

	/** full constructor */
	public TrHistId(String trDomain, Integer trTrnbr) {
		super(trDomain, trTrnbr);
	}

}
