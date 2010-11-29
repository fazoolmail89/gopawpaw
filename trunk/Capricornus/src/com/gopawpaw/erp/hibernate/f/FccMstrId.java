package com.gopawpaw.erp.hibernate.f;

/**
 * FccMstrId entity. @author MyEclipse Persistence Tools
 */
public class FccMstrId extends AbstractFccMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FccMstrId() {
	}

	/** minimal constructor */
	public FccMstrId(String fccDomain) {
		super(fccDomain);
	}

	/** full constructor */
	public FccMstrId(String fccDomain, String fccType, String fccFcgCode,
			String fccCaIntType, String fccFscCode, String fccSvCode,
			String fccPtProdLine, String fccPtSvcGroup) {
		super(fccDomain, fccType, fccFcgCode, fccCaIntType, fccFscCode,
				fccSvCode, fccPtProdLine, fccPtSvcGroup);
	}

}
