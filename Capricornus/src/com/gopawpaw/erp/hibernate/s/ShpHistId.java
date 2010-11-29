package com.gopawpaw.erp.hibernate.s;

/**
 * ShpHistId entity. @author MyEclipse Persistence Tools
 */
public class ShpHistId extends AbstractShpHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShpHistId() {
	}

	/** full constructor */
	public ShpHistId(String shpDomain, Integer shpTranId) {
		super(shpDomain, shpTranId);
	}

}
