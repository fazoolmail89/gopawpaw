package com.gopawpaw.erp.hibernate.p;

/**
 * PcldDetId entity. @author MyEclipse Persistence Tools
 */
public class PcldDetId extends AbstractPcldDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PcldDetId() {
	}

	/** full constructor */
	public PcldDetId(String pcldDomain, String pcldGroup, String pcldId) {
		super(pcldDomain, pcldGroup, pcldId);
	}

}
