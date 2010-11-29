package com.gopawpaw.erp.hibernate.f;

/**
 * FcdMstrId entity. @author MyEclipse Persistence Tools
 */
public class FcdMstrId extends AbstractFcdMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FcdMstrId() {
	}

	/** minimal constructor */
	public FcdMstrId(String fcdDomain) {
		super(fcdDomain);
	}

	/** full constructor */
	public FcdMstrId(String fcdDomain, String fcdSvCode, String fcdCaIntType,
			String fcdFscCode, String fcdEuType) {
		super(fcdDomain, fcdSvCode, fcdCaIntType, fcdFscCode, fcdEuType);
	}

}
