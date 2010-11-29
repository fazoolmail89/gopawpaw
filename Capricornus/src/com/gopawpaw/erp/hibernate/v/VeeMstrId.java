package com.gopawpaw.erp.hibernate.v;

/**
 * VeeMstrId entity. @author MyEclipse Persistence Tools
 */
public class VeeMstrId extends AbstractVeeMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VeeMstrId() {
	}

	/** full constructor */
	public VeeMstrId(String veeDomain, String veeEvent) {
		super(veeDomain, veeEvent);
	}

}
