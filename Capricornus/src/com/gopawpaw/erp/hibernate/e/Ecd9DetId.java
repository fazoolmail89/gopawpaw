package com.gopawpaw.erp.hibernate.e;

/**
 * Ecd9DetId entity. @author MyEclipse Persistence Tools
 */
public class Ecd9DetId extends AbstractEcd9DetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd9DetId() {
	}

	/** minimal constructor */
	public Ecd9DetId(String ecd9Domain) {
		super(ecd9Domain);
	}

	/** full constructor */
	public Ecd9DetId(String ecd9Domain, String ecd9Nbr, String ecd9Group) {
		super(ecd9Domain, ecd9Nbr, ecd9Group);
	}

}
