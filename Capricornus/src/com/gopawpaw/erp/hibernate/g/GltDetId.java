package com.gopawpaw.erp.hibernate.g;

/**
 * GltDetId entity. @author MyEclipse Persistence Tools
 */
public class GltDetId extends AbstractGltDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GltDetId() {
	}

	/** minimal constructor */
	public GltDetId(String gltDomain) {
		super(gltDomain);
	}

	/** full constructor */
	public GltDetId(String gltDomain, String gltRef, Boolean gltRflag,
			Integer gltLine) {
		super(gltDomain, gltRef, gltRflag, gltLine);
	}

}
