package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FrcdDetId entity. @author MyEclipse Persistence Tools
 */
public class FrcdDetId extends AbstractFrcdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FrcdDetId() {
	}

	/** minimal constructor */
	public FrcdDetId(String frcdDomain, String frcdFrList, String frcdZone) {
		super(frcdDomain, frcdFrList, frcdZone);
	}

	/** full constructor */
	public FrcdDetId(String frcdDomain, String frcdFrList, String frcdSite,
			String frcdCurr, String frcdZone, String frcdClass,
			Double frcdMaxWt, Date frcdStart) {
		super(frcdDomain, frcdFrList, frcdSite, frcdCurr, frcdZone, frcdClass,
				frcdMaxWt, frcdStart);
	}

}
