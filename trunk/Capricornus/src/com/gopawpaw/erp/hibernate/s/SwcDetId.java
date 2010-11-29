package com.gopawpaw.erp.hibernate.s;

/**
 * SwcDetId entity. @author MyEclipse Persistence Tools
 */
public class SwcDetId extends AbstractSwcDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SwcDetId() {
	}

	/** minimal constructor */
	public SwcDetId(String swcDomain) {
		super(swcDomain);
	}

	/** full constructor */
	public SwcDetId(String swcDomain, String swcSim, String swcWkctr,
			String swcMch, String swcElement) {
		super(swcDomain, swcSim, swcWkctr, swcMch, swcElement);
	}

}
