package com.gopawpaw.erp.hibernate.l;

/**
 * LacdDetId entity. @author MyEclipse Persistence Tools
 */
public class LacdDetId extends AbstractLacdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public LacdDetId() {
	}

	/** full constructor */
	public LacdDetId(String lacdDomain, String lacdInternalRef,
			String lacdShipfrom, String lacdLcCharge, String lacdInternalRefType) {
		super(lacdDomain, lacdInternalRef, lacdShipfrom, lacdLcCharge,
				lacdInternalRefType);
	}

}
