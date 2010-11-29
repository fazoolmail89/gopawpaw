package com.gopawpaw.erp.hibernate.m;

/**
 * MphHistId entity. @author MyEclipse Persistence Tools
 */
public class MphHistId extends AbstractMphHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MphHistId() {
	}

	/** minimal constructor */
	public MphHistId(String mphDomain, String mphPart, String mphRouting,
			Integer mphOp, String mphTest) {
		super(mphDomain, mphPart, mphRouting, mphOp, mphTest);
	}

	/** full constructor */
	public MphHistId(String mphDomain, String mphLot, String mphPart,
			String mphRouting, Integer mphOp, String mphTest) {
		super(mphDomain, mphLot, mphPart, mphRouting, mphOp, mphTest);
	}

}
