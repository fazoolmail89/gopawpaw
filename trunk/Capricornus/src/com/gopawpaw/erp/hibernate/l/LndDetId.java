package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LndDetId entity. @author MyEclipse Persistence Tools
 */
public class LndDetId extends AbstractLndDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LndDetId() {
	}

	/** minimal constructor */
	public LndDetId(String lndDomain) {
		super(lndDomain);
	}

	/** full constructor */
	public LndDetId(String lndDomain, String lndLine, String lndSite,
			String lndPart, Date lndStart) {
		super(lndDomain, lndLine, lndSite, lndPart, lndStart);
	}

}
