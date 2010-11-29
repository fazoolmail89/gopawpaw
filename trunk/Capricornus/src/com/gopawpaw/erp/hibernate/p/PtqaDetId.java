package com.gopawpaw.erp.hibernate.p;

/**
 * PtqaDetId entity. @author MyEclipse Persistence Tools
 */
public class PtqaDetId extends AbstractPtqaDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtqaDetId() {
	}

	/** minimal constructor */
	public PtqaDetId(String ptqaDomain) {
		super(ptqaDomain);
	}

	/** full constructor */
	public PtqaDetId(String ptqaDomain, String ptqaPart, String ptqaElement) {
		super(ptqaDomain, ptqaPart, ptqaElement);
	}

}
