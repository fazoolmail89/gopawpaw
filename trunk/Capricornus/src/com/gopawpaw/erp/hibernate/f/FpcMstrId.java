package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FpcMstrId entity. @author MyEclipse Persistence Tools
 */
public class FpcMstrId extends AbstractFpcMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FpcMstrId() {
	}

	/** minimal constructor */
	public FpcMstrId(String fpcDomain) {
		super(fpcDomain);
	}

	/** full constructor */
	public FpcMstrId(String fpcDomain, String fpcList, String fpcListType,
			String fpcCurr, String fpcCaIntType, String fpcSvcGroup,
			String fpcProdLine, String fpcFscCode, String fpcPart,
			String fpcUm, Date fpcStart) {
		super(fpcDomain, fpcList, fpcListType, fpcCurr, fpcCaIntType,
				fpcSvcGroup, fpcProdLine, fpcFscCode, fpcPart, fpcUm, fpcStart);
	}

}
