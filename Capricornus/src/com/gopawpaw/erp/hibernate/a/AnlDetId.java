package com.gopawpaw.erp.hibernate.a;

/**
 * AnlDetId entity. @author MyEclipse Persistence Tools
 */
public class AnlDetId extends AbstractAnlDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AnlDetId() {
	}

	/** minimal constructor */
	public AnlDetId(String anlDomain, String anlType, String anlCode) {
		super(anlDomain, anlType, anlCode);
	}

	/** full constructor */
	public AnlDetId(String anlDomain, String anlType, String anlCode,
			String anlLinkCode) {
		super(anlDomain, anlType, anlCode, anlLinkCode);
	}

}
