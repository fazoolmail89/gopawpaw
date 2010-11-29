package com.gopawpaw.erp.hibernate.s;

/**
 * SadDetId entity. @author MyEclipse Persistence Tools
 */
public class SadDetId extends AbstractSadDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SadDetId() {
	}

	/** minimal constructor */
	public SadDetId(String sadDomain) {
		super(sadDomain);
	}

	/** full constructor */
	public SadDetId(String sadDomain, String sadNbr, String sadPrefix,
			Integer sadLine) {
		super(sadDomain, sadNbr, sadPrefix, sadLine);
	}

}
