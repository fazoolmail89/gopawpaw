package com.gopawpaw.erp.hibernate.a;

/**
 * AnxDetId entity. @author MyEclipse Persistence Tools
 */
public class AnxDetId extends AbstractAnxDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AnxDetId() {
	}

	/** minimal constructor */
	public AnxDetId(String anxDomain, String anxType, String anxCode) {
		super(anxDomain, anxType, anxCode);
	}

	/** full constructor */
	public AnxDetId(String anxDomain, String anxType, String anxCode,
			String anxNode) {
		super(anxDomain, anxType, anxCode, anxNode);
	}

}
