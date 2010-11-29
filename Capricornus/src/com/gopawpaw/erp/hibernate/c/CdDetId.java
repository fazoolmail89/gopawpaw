package com.gopawpaw.erp.hibernate.c;

/**
 * CdDetId entity. @author MyEclipse Persistence Tools
 */
public class CdDetId extends AbstractCdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CdDetId() {
	}

	/** minimal constructor */
	public CdDetId(String cdDomain) {
		super(cdDomain);
	}

	/** full constructor */
	public CdDetId(String cdDomain, String cdRef, String cdType, String cdLang,
			Integer cdSeq) {
		super(cdDomain, cdRef, cdType, cdLang, cdSeq);
	}

}
