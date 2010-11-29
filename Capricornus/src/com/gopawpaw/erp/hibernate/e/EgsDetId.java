package com.gopawpaw.erp.hibernate.e;

/**
 * EgsDetId entity. @author MyEclipse Persistence Tools
 */
public class EgsDetId extends AbstractEgsDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgsDetId() {
	}

	/** minimal constructor */
	public EgsDetId(String egsDomain) {
		super(egsDomain);
	}

	/** full constructor */
	public EgsDetId(String egsDomain, String egsEngCode, String egsType,
			String egsSkill) {
		super(egsDomain, egsEngCode, egsType, egsSkill);
	}

}
