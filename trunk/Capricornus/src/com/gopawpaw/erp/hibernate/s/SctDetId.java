package com.gopawpaw.erp.hibernate.s;

/**
 * SctDetId entity. @author MyEclipse Persistence Tools
 */
public class SctDetId extends AbstractSctDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SctDetId() {
	}

	/** minimal constructor */
	public SctDetId(String sctDomain) {
		super(sctDomain);
	}

	/** full constructor */
	public SctDetId(String sctDomain, String sctSim, String sctPart,
			String sctSite) {
		super(sctDomain, sctSim, sctPart, sctSite);
	}

}
