package com.gopawpaw.erp.hibernate.a;

/**
 * ApMstrId entity. @author MyEclipse Persistence Tools
 */
public class ApMstrId extends AbstractApMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ApMstrId() {
	}

	/** minimal constructor */
	public ApMstrId(String apDomain) {
		super(apDomain);
	}

	/** full constructor */
	public ApMstrId(String apDomain, String apType, String apRef) {
		super(apDomain, apType, apRef);
	}

}
