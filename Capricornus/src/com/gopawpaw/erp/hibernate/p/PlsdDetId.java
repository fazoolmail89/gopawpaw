package com.gopawpaw.erp.hibernate.p;

/**
 * PlsdDetId entity. @author MyEclipse Persistence Tools
 */
public class PlsdDetId extends AbstractPlsdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PlsdDetId() {
	}

	/** minimal constructor */
	public PlsdDetId(String plsdDomain, String plsdProdline) {
		super(plsdDomain, plsdProdline);
	}

	/** full constructor */
	public PlsdDetId(String plsdDomain, String plsdProdline, String plsdSite,
			String plsdCmtype, String plsdChannel) {
		super(plsdDomain, plsdProdline, plsdSite, plsdCmtype, plsdChannel);
	}

}
