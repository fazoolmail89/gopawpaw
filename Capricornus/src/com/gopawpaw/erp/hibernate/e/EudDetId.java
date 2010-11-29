package com.gopawpaw.erp.hibernate.e;

/**
 * EudDetId entity. @author MyEclipse Persistence Tools
 */
public class EudDetId extends AbstractEudDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EudDetId() {
	}

	/** minimal constructor */
	public EudDetId(String eudDomain) {
		super(eudDomain);
	}

	/** full constructor */
	public EudDetId(String eudDomain, Integer eudTrnbr) {
		super(eudDomain, eudTrnbr);
	}

}
