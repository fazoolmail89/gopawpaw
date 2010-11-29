package com.gopawpaw.erp.hibernate.d;

/**
 * DsrMstrId entity. @author MyEclipse Persistence Tools
 */
public class DsrMstrId extends AbstractDsrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DsrMstrId() {
	}

	/** minimal constructor */
	public DsrMstrId(String dsrDomain, String dsrReqNbr) {
		super(dsrDomain, dsrReqNbr);
	}

	/** full constructor */
	public DsrMstrId(String dsrDomain, String dsrSite, String dsrReqNbr) {
		super(dsrDomain, dsrSite, dsrReqNbr);
	}

}
