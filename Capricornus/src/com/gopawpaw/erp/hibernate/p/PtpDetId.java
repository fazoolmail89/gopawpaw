package com.gopawpaw.erp.hibernate.p;

/**
 * PtpDetId entity. @author MyEclipse Persistence Tools
 */
public class PtpDetId extends AbstractPtpDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtpDetId() {
	}

	/** minimal constructor */
	public PtpDetId(String ptpDomain, String ptpPart) {
		super(ptpDomain, ptpPart);
	}

	/** full constructor */
	public PtpDetId(String ptpDomain, String ptpPart, String ptpSite) {
		super(ptpDomain, ptpPart, ptpSite);
	}

}
