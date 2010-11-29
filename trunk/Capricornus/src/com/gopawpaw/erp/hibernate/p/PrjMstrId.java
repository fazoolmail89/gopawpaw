package com.gopawpaw.erp.hibernate.p;

/**
 * PrjMstrId entity. @author MyEclipse Persistence Tools
 */
public class PrjMstrId extends AbstractPrjMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PrjMstrId() {
	}

	/** full constructor */
	public PrjMstrId(String prjDomain, String prjNbr) {
		super(prjDomain, prjNbr);
	}

}
