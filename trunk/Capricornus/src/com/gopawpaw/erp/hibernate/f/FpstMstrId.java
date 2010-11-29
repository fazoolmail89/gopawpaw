package com.gopawpaw.erp.hibernate.f;

/**
 * FpstMstrId entity. @author MyEclipse Persistence Tools
 */
public class FpstMstrId extends AbstractFpstMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FpstMstrId() {
	}

	/** minimal constructor */
	public FpstMstrId(String fpstDomain) {
		super(fpstDomain);
	}

	/** full constructor */
	public FpstMstrId(String fpstDomain, String fpstStatus) {
		super(fpstDomain, fpstStatus);
	}

}
