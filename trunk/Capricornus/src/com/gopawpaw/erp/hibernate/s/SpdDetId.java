package com.gopawpaw.erp.hibernate.s;

/**
 * SpdDetId entity. @author MyEclipse Persistence Tools
 */
public class SpdDetId extends AbstractSpdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SpdDetId() {
	}

	/** minimal constructor */
	public SpdDetId(String spdDomain) {
		super(spdDomain);
	}

	/** full constructor */
	public SpdDetId(String spdDomain, String spdAddr, String spdProdLn,
			String spdPart, String spdCust) {
		super(spdDomain, spdAddr, spdProdLn, spdPart, spdCust);
	}

}
