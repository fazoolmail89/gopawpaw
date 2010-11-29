package com.gopawpaw.erp.hibernate.t;

/**
 * TrglDetId entity. @author MyEclipse Persistence Tools
 */
public class TrglDetId extends AbstractTrglDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrglDetId() {
	}

	/** minimal constructor */
	public TrglDetId(String trglDomain) {
		super(trglDomain);
	}

	/** full constructor */
	public TrglDetId(String trglDomain, Integer trglTrnbr, String trglGlRef,
			Integer trglSequence) {
		super(trglDomain, trglTrnbr, trglGlRef, trglSequence);
	}

}
