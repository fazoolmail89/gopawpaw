package com.gopawpaw.erp.hibernate.e;

/**
 * EcxRefId entity. @author MyEclipse Persistence Tools
 */
public class EcxRefId extends AbstractEcxRefId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EcxRefId() {
	}

	/** full constructor */
	public EcxRefId(String ecxDomain, String ecxOrderType, String ecxNbr,
			String ecxLine, String ecxSite, String ecxLineSite) {
		super(ecxDomain, ecxOrderType, ecxNbr, ecxLine, ecxSite, ecxLineSite);
	}

}
