package com.gopawpaw.erp.hibernate.l;

/**
 * LnfDetId entity. @author MyEclipse Persistence Tools
 */
public class LnfDetId extends AbstractLnfDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LnfDetId() {
	}

	/** full constructor */
	public LnfDetId(String lnfDomain, String lnfSite, String lnfProductionLine,
			String lnfPart) {
		super(lnfDomain, lnfSite, lnfProductionLine, lnfPart);
	}

}
