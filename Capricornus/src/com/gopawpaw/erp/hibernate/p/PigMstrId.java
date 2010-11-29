package com.gopawpaw.erp.hibernate.p;

/**
 * PigMstrId entity. @author MyEclipse Persistence Tools
 */
public class PigMstrId extends AbstractPigMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PigMstrId() {
	}

	/** minimal constructor */
	public PigMstrId(String pigDomain) {
		super(pigDomain);
	}

	/** full constructor */
	public PigMstrId(String pigDomain, String pigCode, String pigAmtType) {
		super(pigDomain, pigCode, pigAmtType);
	}

}
