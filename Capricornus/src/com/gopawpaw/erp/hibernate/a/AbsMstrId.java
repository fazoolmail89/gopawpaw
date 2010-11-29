package com.gopawpaw.erp.hibernate.a;

/**
 * AbsMstrId entity. @author MyEclipse Persistence Tools
 */
public class AbsMstrId extends AbstractAbsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbsMstrId() {
	}

	/** minimal constructor */
	public AbsMstrId(String absDomain) {
		super(absDomain);
	}

	/** full constructor */
	public AbsMstrId(String absDomain, String absShipfrom, String absId) {
		super(absDomain, absShipfrom, absId);
	}

}
