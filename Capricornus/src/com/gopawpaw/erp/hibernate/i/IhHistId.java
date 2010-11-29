package com.gopawpaw.erp.hibernate.i;

/**
 * IhHistId entity. @author MyEclipse Persistence Tools
 */
public class IhHistId extends AbstractIhHistId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IhHistId() {
	}

	/** minimal constructor */
	public IhHistId(String ihDomain, String ihNbr) {
		super(ihDomain, ihNbr);
	}

	/** full constructor */
	public IhHistId(String ihDomain, String ihInvNbr, String ihNbr) {
		super(ihDomain, ihInvNbr, ihNbr);
	}

}
