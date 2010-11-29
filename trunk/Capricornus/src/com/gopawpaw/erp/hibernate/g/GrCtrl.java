package com.gopawpaw.erp.hibernate.g;

/**
 * GrCtrl entity. @author MyEclipse Persistence Tools
 */
public class GrCtrl extends AbstractGrCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrCtrl() {
	}

	/** minimal constructor */
	public GrCtrl(Double oidGrCtrl) {
		super(oidGrCtrl);
	}

	/** full constructor */
	public GrCtrl(Integer grIndex1, String grFormat, String grRound,
			String grQtrLbl, Boolean grAcCmmts, Boolean grRgCmmts,
			Boolean grCgCmmts, Boolean grRpCmmts, Integer grRgWidth,
			Integer grRunId, Integer grColWidth, Boolean grPrecedence,
			Integer grPer, Integer grYear, String grCyre, String grCyis,
			Integer grTxtIx, String grUser1, String grUser2, String grQadc01,
			Double oidGrCtrl) {
		super(grIndex1, grFormat, grRound, grQtrLbl, grAcCmmts, grRgCmmts,
				grCgCmmts, grRpCmmts, grRgWidth, grRunId, grColWidth,
				grPrecedence, grPer, grYear, grCyre, grCyis, grTxtIx, grUser1,
				grUser2, grQadc01, oidGrCtrl);
	}

}
