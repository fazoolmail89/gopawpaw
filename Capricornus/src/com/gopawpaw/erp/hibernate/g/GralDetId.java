package com.gopawpaw.erp.hibernate.g;

/**
 * GralDetId entity. @author MyEclipse Persistence Tools
 */
public class GralDetId extends AbstractGralDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GralDetId() {
	}

	/** minimal constructor */
	public GralDetId(String gralDomain) {
		super(gralDomain);
	}

	/** full constructor */
	public GralDetId(String gralDomain, String gralAnCode, String gralLinkCode,
			Double gralSeq) {
		super(gralDomain, gralAnCode, gralLinkCode, gralSeq);
	}

}
