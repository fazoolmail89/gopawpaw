package com.gopawpaw.erp.hibernate.g;

/**
 * GrcdDet entity. @author MyEclipse Persistence Tools
 */
public class GrcdDet extends AbstractGrcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrcdDet() {
	}

	/** minimal constructor */
	public GrcdDet(GrcdDetId id, Double oidGrcdDet) {
		super(id, oidGrcdDet);
	}

	/** full constructor */
	public GrcdDet(GrcdDetId id, String grcdColType, String grcdDesc,
			String grcdPerTo, String grcdSymbol, String grcdProject,
			String grcdBgCode, Boolean grcdPercent, Boolean grcdPrint,
			String grcdFormat, Boolean grcdOverride, String grcdRound,
			String grcdLabel, String grcdUser1, String grcdUser2,
			String grcdQuarter, String grcdPerFrom, String grcdYear,
			String grcdActivity, Boolean grcdBgRoll, Integer grcdWidth,
			String grcdRvpol, String grcdCalc, Boolean grcdCurrency,
			String grcdQadc01, Double oidGrcdDet) {
		super(id, grcdColType, grcdDesc, grcdPerTo, grcdSymbol, grcdProject,
				grcdBgCode, grcdPercent, grcdPrint, grcdFormat, grcdOverride,
				grcdRound, grcdLabel, grcdUser1, grcdUser2, grcdQuarter,
				grcdPerFrom, grcdYear, grcdActivity, grcdBgRoll, grcdWidth,
				grcdRvpol, grcdCalc, grcdCurrency, grcdQadc01, oidGrcdDet);
	}

}
