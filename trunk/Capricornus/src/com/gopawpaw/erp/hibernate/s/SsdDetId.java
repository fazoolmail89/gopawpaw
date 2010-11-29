package com.gopawpaw.erp.hibernate.s;

/**
 * SsdDetId entity. @author MyEclipse Persistence Tools
 */
public class SsdDetId extends AbstractSsdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SsdDetId() {
	}

	/** minimal constructor */
	public SsdDetId(String ssdDomain) {
		super(ssdDomain);
	}

	/** full constructor */
	public SsdDetId(String ssdDomain, String ssdNetwork, String ssdRecSite,
			String ssdSrcSite, String ssdRef) {
		super(ssdDomain, ssdNetwork, ssdRecSite, ssdSrcSite, ssdRef);
	}

}
