package com.gopawpaw.erp.hibernate.s;

/**
 * SimDetId entity. @author MyEclipse Persistence Tools
 */
public class SimDetId extends AbstractSimDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SimDetId() {
	}

	/** full constructor */
	public SimDetId(String simDomain, String simSite, String simInvMov) {
		super(simDomain, simSite, simInvMov);
	}

}
