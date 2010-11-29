package com.gopawpaw.erp.hibernate.f;

/**
 * FktMstrId entity. @author MyEclipse Persistence Tools
 */
public class FktMstrId extends AbstractFktMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FktMstrId() {
	}

	/** minimal constructor */
	public FktMstrId(String fktDomain) {
		super(fktDomain);
	}

	/** full constructor */
	public FktMstrId(String fktDomain, String fktSerial) {
		super(fktDomain, fktSerial);
	}

}
