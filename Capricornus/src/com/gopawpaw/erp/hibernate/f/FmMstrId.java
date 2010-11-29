package com.gopawpaw.erp.hibernate.f;

/**
 * FmMstrId entity. @author MyEclipse Persistence Tools
 */
public class FmMstrId extends AbstractFmMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FmMstrId() {
	}

	/** minimal constructor */
	public FmMstrId(String fmDomain) {
		super(fmDomain);
	}

	/** full constructor */
	public FmMstrId(String fmDomain, Integer fmFpos, String fmType,
			Integer fmSumsInto) {
		super(fmDomain, fmFpos, fmType, fmSumsInto);
	}

}
