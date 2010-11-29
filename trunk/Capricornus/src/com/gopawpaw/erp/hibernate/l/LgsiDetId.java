package com.gopawpaw.erp.hibernate.l;

/**
 * LgsiDetId entity. @author MyEclipse Persistence Tools
 */
public class LgsiDetId extends AbstractLgsiDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public LgsiDetId() {
	}

	/** minimal constructor */
	public LgsiDetId(String lgsiDomain) {
		super(lgsiDomain);
	}

	/** full constructor */
	public LgsiDetId(String lgsiDomain, String lgsiAppId, String lgsiSite) {
		super(lgsiDomain, lgsiAppId, lgsiSite);
	}

}
