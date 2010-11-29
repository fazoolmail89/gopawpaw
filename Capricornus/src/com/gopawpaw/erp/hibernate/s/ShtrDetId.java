package com.gopawpaw.erp.hibernate.s;

/**
 * ShtrDetId entity. @author MyEclipse Persistence Tools
 */
public class ShtrDetId extends AbstractShtrDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShtrDetId() {
	}

	/** minimal constructor */
	public ShtrDetId(String shtrDomain, String shtrNbr) {
		super(shtrDomain, shtrNbr);
	}

	/** full constructor */
	public ShtrDetId(String shtrDomain, String shtrNbr, String shtrShipId,
			String shtrCd) {
		super(shtrDomain, shtrNbr, shtrShipId, shtrCd);
	}

}
