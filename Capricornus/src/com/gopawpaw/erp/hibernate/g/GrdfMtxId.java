package com.gopawpaw.erp.hibernate.g;

/**
 * GrdfMtxId entity. @author MyEclipse Persistence Tools
 */
public class GrdfMtxId extends AbstractGrdfMtxId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrdfMtxId() {
	}

	/** minimal constructor */
	public GrdfMtxId(String grdfDomain) {
		super(grdfDomain);
	}

	/** full constructor */
	public GrdfMtxId(String grdfDomain, Integer grdfRunId, Integer grdfRow,
			Integer grdfCol) {
		super(grdfDomain, grdfRunId, grdfRow, grdfCol);
	}

}
