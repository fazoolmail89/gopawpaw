package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DaldDetId entity. @author MyEclipse Persistence Tools
 */
public class DaldDetId extends AbstractDaldDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DaldDetId() {
	}

	/** minimal constructor */
	public DaldDetId(String daldDomain) {
		super(daldDomain);
	}

	/** full constructor */
	public DaldDetId(String daldDomain, String daldListId, String daldAppId,
			Date daldEffDtIn) {
		super(daldDomain, daldListId, daldAppId, daldEffDtIn);
	}

}
