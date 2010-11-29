package com.gopawpaw.erp.hibernate.g;

/**
 * GltmdDetId entity. @author MyEclipse Persistence Tools
 */
public class GltmdDetId extends AbstractGltmdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GltmdDetId() {
	}

	/** full constructor */
	public GltmdDetId(String gltmdDomain, String gltmdEntity, String gltmdAcct,
			Integer gltmdMatchNbr, String gltmdRef, Boolean gltmdRflag,
			Integer gltmdLine) {
		super(gltmdDomain, gltmdEntity, gltmdAcct, gltmdMatchNbr, gltmdRef,
				gltmdRflag, gltmdLine);
	}

}
