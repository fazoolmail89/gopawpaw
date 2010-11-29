package com.gopawpaw.erp.hibernate.c;

/**
 * CdfMstrId entity. @author MyEclipse Persistence Tools
 */
public class CdfMstrId extends AbstractCdfMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CdfMstrId() {
	}

	/** minimal constructor */
	public CdfMstrId(String cdfDomain) {
		super(cdfDomain);
	}

	/** full constructor */
	public CdfMstrId(String cdfDomain, String cdfCaCategory,
			String cdfCaIntType, String cdfModel, String cdfGroup,
			String cdfStatusType) {
		super(cdfDomain, cdfCaCategory, cdfCaIntType, cdfModel, cdfGroup,
				cdfStatusType);
	}

}
