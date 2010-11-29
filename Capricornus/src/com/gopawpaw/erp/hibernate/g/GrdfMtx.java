package com.gopawpaw.erp.hibernate.g;

/**
 * GrdfMtx entity. @author MyEclipse Persistence Tools
 */
public class GrdfMtx extends AbstractGrdfMtx implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrdfMtx() {
	}

	/** minimal constructor */
	public GrdfMtx(GrdfMtxId id, Double oidGrdfMtx) {
		super(id, oidGrdfMtx);
	}

	/** full constructor */
	public GrdfMtx(GrdfMtxId id, String grdfFormat, String grdfRound,
			Boolean grdfReverse, String grdfFormula, Boolean grdfPrint,
			String grdfUser1, String grdfUser2, String grdfQadc01,
			Double oidGrdfMtx) {
		super(id, grdfFormat, grdfRound, grdfReverse, grdfFormula, grdfPrint,
				grdfUser1, grdfUser2, grdfQadc01, oidGrdfMtx);
	}

}
