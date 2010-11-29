package com.gopawpaw.erp.hibernate.a;

/**
 * AcMstrId entity. @author MyEclipse Persistence Tools
 */
public class AcMstrId extends AbstractAcMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcMstrId() {
	}

	/** minimal constructor */
	public AcMstrId(String acDomain) {
		super(acDomain);
	}

	/** full constructor */
	public AcMstrId(String acDomain, String acCode) {
		super(acDomain, acCode);
	}

}
