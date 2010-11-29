package com.gopawpaw.erp.hibernate.g;

/**
 * GrrdDet entity. @author MyEclipse Persistence Tools
 */
public class GrrdDet extends AbstractGrrdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrrdDet() {
	}

	/** minimal constructor */
	public GrrdDet(GrrdDetId id, Double oidGrrdDet) {
		super(id, oidGrrdDet);
	}

	/** full constructor */
	public GrrdDet(GrrdDetId id, String grrdRowType, String grrdLabel,
			Integer grrdIndent, Boolean grrdApplySym, String grrdZeroSuppress,
			String grrdPreUnd, String grrdPostUnd, Integer grrdStartCol,
			String grrdRvpol, Boolean grrdShow, Boolean grrdPercent,
			Boolean grrdPrint, Boolean grrdReverse, String grrdFormat,
			Boolean grrdOverride, String grrdRound, Boolean grrdPage,
			Boolean grrdPrecedence, String grrdUser1, String grrdUser2,
			Integer grrdSkips, String grrdText, String grrdCalc,
			String grrdQadc01, Double oidGrrdDet) {
		super(id, grrdRowType, grrdLabel, grrdIndent, grrdApplySym,
				grrdZeroSuppress, grrdPreUnd, grrdPostUnd, grrdStartCol,
				grrdRvpol, grrdShow, grrdPercent, grrdPrint, grrdReverse,
				grrdFormat, grrdOverride, grrdRound, grrdPage, grrdPrecedence,
				grrdUser1, grrdUser2, grrdSkips, grrdText, grrdCalc,
				grrdQadc01, oidGrrdDet);
	}

}
