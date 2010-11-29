package com.gopawpaw.erp.hibernate.e;

/**
 * Ecd4DetId entity. @author MyEclipse Persistence Tools
 */
public class Ecd4DetId extends AbstractEcd4DetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd4DetId() {
	}

	/** full constructor */
	public Ecd4DetId(String ecd4Domain, String ecd4Part, String ecd4Routing,
			Integer ecd4Op, String ecd4Nbr, String ecd4Sequence) {
		super(ecd4Domain, ecd4Part, ecd4Routing, ecd4Op, ecd4Nbr, ecd4Sequence);
	}

}
