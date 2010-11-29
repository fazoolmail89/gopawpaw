package com.gopawpaw.erp.hibernate.e;

/**
 * EgtMstrId entity. @author MyEclipse Persistence Tools
 */
public class EgtMstrId extends AbstractEgtMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgtMstrId() {
	}

	/** minimal constructor */
	public EgtMstrId(String egtDomain) {
		super(egtDomain);
	}

	/** full constructor */
	public EgtMstrId(String egtDomain, Integer egtTrnbr) {
		super(egtDomain, egtTrnbr);
	}

}
