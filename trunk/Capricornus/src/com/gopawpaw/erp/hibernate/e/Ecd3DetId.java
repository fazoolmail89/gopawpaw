package com.gopawpaw.erp.hibernate.e;

/**
 * Ecd3DetId entity. @author MyEclipse Persistence Tools
 */
public class Ecd3DetId extends AbstractEcd3DetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd3DetId() {
	}

	/** minimal constructor */
	public Ecd3DetId(String ecd3Domain) {
		super(ecd3Domain);
	}

	/** full constructor */
	public Ecd3DetId(String ecd3Domain, String ecd3Nbr, Integer ecd3Cmtindx) {
		super(ecd3Domain, ecd3Nbr, ecd3Cmtindx);
	}

}
