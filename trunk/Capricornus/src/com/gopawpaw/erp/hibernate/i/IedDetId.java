package com.gopawpaw.erp.hibernate.i;

/**
 * IedDetId entity. @author MyEclipse Persistence Tools
 */
public class IedDetId extends AbstractIedDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IedDetId() {
	}

	/** minimal constructor */
	public IedDetId(String iedDomain) {
		super(iedDomain);
	}

	/** full constructor */
	public IedDetId(String iedDomain, String iedType, String iedNbr,
			Integer iedLine) {
		super(iedDomain, iedType, iedNbr, iedLine);
	}

}
