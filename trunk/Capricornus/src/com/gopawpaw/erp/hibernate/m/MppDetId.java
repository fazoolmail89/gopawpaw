package com.gopawpaw.erp.hibernate.m;

/**
 * MppDetId entity. @author MyEclipse Persistence Tools
 */
public class MppDetId extends AbstractMppDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MppDetId() {
	}

	/** minimal constructor */
	public MppDetId(String mppDomain) {
		super(mppDomain);
	}

	/** full constructor */
	public MppDetId(String mppDomain, String mppProgram, Integer mppSequence,
			Integer mppLine) {
		super(mppDomain, mppProgram, mppSequence, mppLine);
	}

}
