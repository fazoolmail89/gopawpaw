package com.gopawpaw.erp.hibernate.s;

/**
 * SptDetId entity. @author MyEclipse Persistence Tools
 */
public class SptDetId extends AbstractSptDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SptDetId() {
	}

	/** minimal constructor */
	public SptDetId(String sptDomain) {
		super(sptDomain);
	}

	/** full constructor */
	public SptDetId(String sptDomain, String sptSite, String sptSim,
			String sptPart, String sptElement) {
		super(sptDomain, sptSite, sptSim, sptPart, sptElement);
	}

}
