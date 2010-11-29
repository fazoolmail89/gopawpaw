package com.gopawpaw.erp.hibernate.e;

/**
 * Ecd1DetId entity. @author MyEclipse Persistence Tools
 */
public class Ecd1DetId extends AbstractEcd1DetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd1DetId() {
	}

	/** minimal constructor */
	public Ecd1DetId(String ecd1Domain, String ecd1Par, String ecd1Comp) {
		super(ecd1Domain, ecd1Par, ecd1Comp);
	}

	/** full constructor */
	public Ecd1DetId(String ecd1Domain, String ecd1Nbr, String ecd1Par,
			String ecd1Comp, String ecd1Ref) {
		super(ecd1Domain, ecd1Nbr, ecd1Par, ecd1Comp, ecd1Ref);
	}

}
