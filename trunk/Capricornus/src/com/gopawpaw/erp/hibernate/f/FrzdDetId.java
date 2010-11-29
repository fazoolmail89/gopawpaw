package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FrzdDetId entity. @author MyEclipse Persistence Tools
 */
public class FrzdDetId extends AbstractFrzdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FrzdDetId() {
	}

	/** minimal constructor */
	public FrzdDetId(String frzdDomain, String frzdFrList, String frzdZone,
			String frzdPostSt) {
		super(frzdDomain, frzdFrList, frzdZone, frzdPostSt);
	}

	/** full constructor */
	public FrzdDetId(String frzdDomain, String frzdFrList, String frzdSite,
			String frzdZone, String frzdPostSt, Date frzdStart) {
		super(frzdDomain, frzdFrList, frzdSite, frzdZone, frzdPostSt, frzdStart);
	}

}
