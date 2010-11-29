package com.gopawpaw.erp.hibernate.e;

/**
 * Ecd2DetId entity. @author MyEclipse Persistence Tools
 */
public class Ecd2DetId extends AbstractEcd2DetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd2DetId() {
	}

	/** minimal constructor */
	public Ecd2DetId(String ecd2Domain, String ecd2Routing, Integer ecd2Op) {
		super(ecd2Domain, ecd2Routing, ecd2Op);
	}

	/** full constructor */
	public Ecd2DetId(String ecd2Domain, String ecd2Nbr, String ecd2Routing,
			Integer ecd2Op) {
		super(ecd2Domain, ecd2Nbr, ecd2Routing, ecd2Op);
	}

}
