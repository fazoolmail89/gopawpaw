package com.gopawpaw.erp.hibernate.b;

/**
 * BkdDetId entity. @author MyEclipse Persistence Tools
 */
public class BkdDetId extends AbstractBkdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BkdDetId() {
	}

	/** full constructor */
	public BkdDetId(String bkdDomain, String bkdBank, String bkdPayMethod,
			String bkdModule) {
		super(bkdDomain, bkdBank, bkdPayMethod, bkdModule);
	}

}
