package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PfdDet entity. @author MyEclipse Persistence Tools
 */
public class PfdDet extends AbstractPfdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PfdDet() {
	}

	/** minimal constructor */
	public PfdDet(PfdDetId id, Double oidPfdDet) {
		super(id, oidPfdDet);
	}

	/** full constructor */
	public PfdDet(PfdDetId id, String pfdWarrCd, Integer pfdPvmDays,
			Boolean pfdIsb, Double pfdMttr, Double pfdMtbf, String pfdSvcGroup,
			Boolean pfdVenWarr, Boolean pfdFru, Double pfdMfgMttr,
			Double pfdMfgMtbf, Double pfdSttr, String pfdOrigin,
			String pfdTariff, Boolean pfdInstCall, Boolean pfdCover,
			Boolean pfdUnitIsb, String pfdRpBom, String pfdRpRoute,
			String pfdPvmRoute, String pfdPvmBom, Date pfdObsDate,
			String pfdPvmUm, String pfdRpVendor, String pfdUser1,
			String pfdUser2, Integer pfdBenchLead, Boolean pfdCusInstall,
			Double pfdFieldLead, String pfdLifeCycle, Boolean pfdRepairable,
			String pfdRpSite, Boolean pfdPvmExceed, Double pfdPvmLimit,
			Boolean pfdPvmReplace, Double pfdPvmSaftey, Boolean pfdTraceActive,
			Boolean pfdPmMrp, Boolean pfdQadl01, Boolean pfdQadl02,
			String pfdQadc01, String pfdQadc02, Integer pfdQadi01,
			Integer pfdQadi02, Date pfdQadd01, String pfdChr01,
			String pfdChr02, Boolean pfdLog01, Boolean pfdLog02,
			Integer pfdInt01, Integer pfdInt02, Date pfdDte01, Date pfdDte02,
			String pfdModUserid, Date pfdModDate, String pfdInsBom,
			String pfdInsRoute, Double oidPfdDet) {
		super(id, pfdWarrCd, pfdPvmDays, pfdIsb, pfdMttr, pfdMtbf, pfdSvcGroup,
				pfdVenWarr, pfdFru, pfdMfgMttr, pfdMfgMtbf, pfdSttr, pfdOrigin,
				pfdTariff, pfdInstCall, pfdCover, pfdUnitIsb, pfdRpBom,
				pfdRpRoute, pfdPvmRoute, pfdPvmBom, pfdObsDate, pfdPvmUm,
				pfdRpVendor, pfdUser1, pfdUser2, pfdBenchLead, pfdCusInstall,
				pfdFieldLead, pfdLifeCycle, pfdRepairable, pfdRpSite,
				pfdPvmExceed, pfdPvmLimit, pfdPvmReplace, pfdPvmSaftey,
				pfdTraceActive, pfdPmMrp, pfdQadl01, pfdQadl02, pfdQadc01,
				pfdQadc02, pfdQadi01, pfdQadi02, pfdQadd01, pfdChr01, pfdChr02,
				pfdLog01, pfdLog02, pfdInt01, pfdInt02, pfdDte01, pfdDte02,
				pfdModUserid, pfdModDate, pfdInsBom, pfdInsRoute, oidPfdDet);
	}

}
