package com.gopawpaw.erp.hibernate.s;

/**
 * SopDetId entity. @author MyEclipse Persistence Tools
 */
public class SopDetId extends AbstractSopDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SopDetId() {
	}

	/** minimal constructor */
	public SopDetId(String sopDomain) {
		super(sopDomain);
	}

	/** full constructor */
	public SopDetId(String sopDomain, String sopSim, String sopRouting,
			Integer sopOp, String sopElement) {
		super(sopDomain, sopSim, sopRouting, sopOp, sopElement);
	}

}
