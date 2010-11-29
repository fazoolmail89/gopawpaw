package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PfcDetId entity. @author MyEclipse Persistence Tools
 */
public class PfcDetId extends AbstractPfcDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PfcDetId() {
	}

	/** minimal constructor */
	public PfcDetId(String pfcDomain, String pfcPart) {
		super(pfcDomain, pfcPart);
	}

	/** full constructor */
	public PfcDetId(String pfcDomain, String pfcPart, String pfcSite,
			String pfcPegPart, Date pfcDate) {
		super(pfcDomain, pfcPart, pfcSite, pfcPegPart, pfcDate);
	}

}
