package com.gopawpaw.erp.hibernate.f;

/**
 * FwkMstrId entity. @author MyEclipse Persistence Tools
 */
public class FwkMstrId extends AbstractFwkMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FwkMstrId() {
	}

	/** minimal constructor */
	public FwkMstrId(String fwkDomain) {
		super(fwkDomain);
	}

	/** full constructor */
	public FwkMstrId(String fwkDomain, String fwkCaIntType) {
		super(fwkDomain, fwkCaIntType);
	}

}
