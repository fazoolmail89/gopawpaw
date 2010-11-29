package com.gopawpaw.erp.hibernate.c;

/**
 * CslmMstrId entity. @author MyEclipse Persistence Tools
 */
public class CslmMstrId extends AbstractCslmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CslmMstrId() {
	}

	/** minimal constructor */
	public CslmMstrId(String cslmDomain) {
		super(cslmDomain);
	}

	/** full constructor */
	public CslmMstrId(String cslmDomain, String cslmCtryCode, String cslmAuth,
			String cslmLicen, String cslmCtrl) {
		super(cslmDomain, cslmCtryCode, cslmAuth, cslmLicen, cslmCtrl);
	}

}
