package com.gopawpaw.erp.hibernate.f;

/**
 * FpciMstrId entity. @author MyEclipse Persistence Tools
 */
public class FpciMstrId extends AbstractFpciMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FpciMstrId() {
	}

	/** minimal constructor */
	public FpciMstrId(String fpciDomain) {
		super(fpciDomain);
	}

	/** full constructor */
	public FpciMstrId(String fpciDomain, String fpciIndex, Integer fpciYear) {
		super(fpciDomain, fpciIndex, fpciYear);
	}

}
