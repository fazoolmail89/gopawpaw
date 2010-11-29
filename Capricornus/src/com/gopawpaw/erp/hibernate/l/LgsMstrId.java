package com.gopawpaw.erp.hibernate.l;

/**
 * LgsMstrId entity. @author MyEclipse Persistence Tools
 */
public class LgsMstrId extends AbstractLgsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public LgsMstrId() {
	}

	/** minimal constructor */
	public LgsMstrId(String lgsDomain) {
		super(lgsDomain);
	}

	/** full constructor */
	public LgsMstrId(String lgsDomain, String lgsAppId) {
		super(lgsDomain, lgsAppId);
	}

}
