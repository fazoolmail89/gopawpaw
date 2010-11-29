package com.gopawpaw.erp.hibernate.l;

/**
 * LnaDetId entity. @author MyEclipse Persistence Tools
 */
public class LnaDetId extends AbstractLnaDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LnaDetId() {
	}

	/** full constructor */
	public LnaDetId(String lnaDomain, String lnaSite, String lnaLine,
			String lnaPart) {
		super(lnaDomain, lnaSite, lnaLine, lnaPart);
	}

}
