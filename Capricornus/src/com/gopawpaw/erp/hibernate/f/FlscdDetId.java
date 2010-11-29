package com.gopawpaw.erp.hibernate.f;

/**
 * FlscdDetId entity. @author MyEclipse Persistence Tools
 */
public class FlscdDetId extends AbstractFlscdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlscdDetId() {
	}

	/** full constructor */
	public FlscdDetId(String flscdDomain, String flscdScheduleCode,
			String flscdSite, String flscdProductionLine) {
		super(flscdDomain, flscdScheduleCode, flscdSite, flscdProductionLine);
	}

}
