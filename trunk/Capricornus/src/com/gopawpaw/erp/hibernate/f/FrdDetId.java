package com.gopawpaw.erp.hibernate.f;

/**
 * FrdDetId entity. @author MyEclipse Persistence Tools
 */
public class FrdDetId extends AbstractFrdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FrdDetId() {
	}

	/** minimal constructor */
	public FrdDetId(String frdDomain) {
		super(frdDomain);
	}

	/** full constructor */
	public FrdDetId(String frdDomain, String frdCode, Double frdWeight) {
		super(frdDomain, frdCode, frdWeight);
	}

}
