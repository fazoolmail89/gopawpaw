package com.gopawpaw.erp.hibernate.f;

/**
 * FndDetId entity. @author MyEclipse Persistence Tools
 */
public class FndDetId extends AbstractFndDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FndDetId() {
	}

	/** minimal constructor */
	public FndDetId(String fndDomain) {
		super(fndDomain);
	}

	/** full constructor */
	public FndDetId(String fndDomain, String fndNbr, String fndCaNbr) {
		super(fndDomain, fndNbr, fndCaNbr);
	}

}
