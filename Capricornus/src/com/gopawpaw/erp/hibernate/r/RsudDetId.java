package com.gopawpaw.erp.hibernate.r;

/**
 * RsudDetId entity. @author MyEclipse Persistence Tools
 */
public class RsudDetId extends AbstractRsudDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RsudDetId() {
	}

	/** full constructor */
	public RsudDetId(String rsudDomain, Integer rsudIndex, String rsudGroup) {
		super(rsudDomain, rsudIndex, rsudGroup);
	}

}
