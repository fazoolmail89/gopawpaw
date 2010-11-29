package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EgdDetId entity. @author MyEclipse Persistence Tools
 */
public class EgdDetId extends AbstractEgdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgdDetId() {
	}

	/** minimal constructor */
	public EgdDetId(String egdDomain) {
		super(egdDomain);
	}

	/** full constructor */
	public EgdDetId(String egdDomain, String egdEngCode, Date egdStartEff) {
		super(egdDomain, egdEngCode, egdStartEff);
	}

}
