package com.gopawpaw.erp.hibernate.b;

/**
 * BdldDetId entity. @author MyEclipse Persistence Tools
 */
public class BdldDetId extends AbstractBdldDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public BdldDetId() {
	}

	/** minimal constructor */
	public BdldDetId(String bdldDomain) {
		super(bdldDomain);
	}

	/** full constructor */
	public BdldDetId(String bdldDomain, String bdldSource, Integer bdldId,
			Integer bdldLine) {
		super(bdldDomain, bdldSource, bdldId, bdldLine);
	}

}
