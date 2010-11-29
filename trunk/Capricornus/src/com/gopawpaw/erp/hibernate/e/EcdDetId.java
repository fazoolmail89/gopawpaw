package com.gopawpaw.erp.hibernate.e;

/**
 * EcdDetId entity. @author MyEclipse Persistence Tools
 */
public class EcdDetId extends AbstractEcdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EcdDetId() {
	}

	/** minimal constructor */
	public EcdDetId(String ecdDomain) {
		super(ecdDomain);
	}

	/** full constructor */
	public EcdDetId(String ecdDomain, String ecdNbr, String ecdPart,
			Boolean ecdNew) {
		super(ecdDomain, ecdNbr, ecdPart, ecdNew);
	}

}
