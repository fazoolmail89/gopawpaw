package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPfdDet entity provides the base persistence definition of the PfdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPfdDet implements java.io.Serializable {

	// Fields

	private PfdDetId id;
	private String pfdWarrCd;
	private Integer pfdPvmDays;
	private Boolean pfdIsb;
	private Double pfdMttr;
	private Double pfdMtbf;
	private String pfdSvcGroup;
	private Boolean pfdVenWarr;
	private Boolean pfdFru;
	private Double pfdMfgMttr;
	private Double pfdMfgMtbf;
	private Double pfdSttr;
	private String pfdOrigin;
	private String pfdTariff;
	private Boolean pfdInstCall;
	private Boolean pfdCover;
	private Boolean pfdUnitIsb;
	private String pfdRpBom;
	private String pfdRpRoute;
	private String pfdPvmRoute;
	private String pfdPvmBom;
	private Date pfdObsDate;
	private String pfdPvmUm;
	private String pfdRpVendor;
	private String pfdUser1;
	private String pfdUser2;
	private Integer pfdBenchLead;
	private Boolean pfdCusInstall;
	private Double pfdFieldLead;
	private String pfdLifeCycle;
	private Boolean pfdRepairable;
	private String pfdRpSite;
	private Boolean pfdPvmExceed;
	private Double pfdPvmLimit;
	private Boolean pfdPvmReplace;
	private Double pfdPvmSaftey;
	private Boolean pfdTraceActive;
	private Boolean pfdPmMrp;
	private Boolean pfdQadl01;
	private Boolean pfdQadl02;
	private String pfdQadc01;
	private String pfdQadc02;
	private Integer pfdQadi01;
	private Integer pfdQadi02;
	private Date pfdQadd01;
	private String pfdChr01;
	private String pfdChr02;
	private Boolean pfdLog01;
	private Boolean pfdLog02;
	private Integer pfdInt01;
	private Integer pfdInt02;
	private Date pfdDte01;
	private Date pfdDte02;
	private String pfdModUserid;
	private Date pfdModDate;
	private String pfdInsBom;
	private String pfdInsRoute;
	private Double oidPfdDet;

	// Constructors

	/** default constructor */
	public AbstractPfdDet() {
	}

	/** minimal constructor */
	public AbstractPfdDet(PfdDetId id, Double oidPfdDet) {
		this.id = id;
		this.oidPfdDet = oidPfdDet;
	}

	/** full constructor */
	public AbstractPfdDet(PfdDetId id, String pfdWarrCd, Integer pfdPvmDays,
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
		this.id = id;
		this.pfdWarrCd = pfdWarrCd;
		this.pfdPvmDays = pfdPvmDays;
		this.pfdIsb = pfdIsb;
		this.pfdMttr = pfdMttr;
		this.pfdMtbf = pfdMtbf;
		this.pfdSvcGroup = pfdSvcGroup;
		this.pfdVenWarr = pfdVenWarr;
		this.pfdFru = pfdFru;
		this.pfdMfgMttr = pfdMfgMttr;
		this.pfdMfgMtbf = pfdMfgMtbf;
		this.pfdSttr = pfdSttr;
		this.pfdOrigin = pfdOrigin;
		this.pfdTariff = pfdTariff;
		this.pfdInstCall = pfdInstCall;
		this.pfdCover = pfdCover;
		this.pfdUnitIsb = pfdUnitIsb;
		this.pfdRpBom = pfdRpBom;
		this.pfdRpRoute = pfdRpRoute;
		this.pfdPvmRoute = pfdPvmRoute;
		this.pfdPvmBom = pfdPvmBom;
		this.pfdObsDate = pfdObsDate;
		this.pfdPvmUm = pfdPvmUm;
		this.pfdRpVendor = pfdRpVendor;
		this.pfdUser1 = pfdUser1;
		this.pfdUser2 = pfdUser2;
		this.pfdBenchLead = pfdBenchLead;
		this.pfdCusInstall = pfdCusInstall;
		this.pfdFieldLead = pfdFieldLead;
		this.pfdLifeCycle = pfdLifeCycle;
		this.pfdRepairable = pfdRepairable;
		this.pfdRpSite = pfdRpSite;
		this.pfdPvmExceed = pfdPvmExceed;
		this.pfdPvmLimit = pfdPvmLimit;
		this.pfdPvmReplace = pfdPvmReplace;
		this.pfdPvmSaftey = pfdPvmSaftey;
		this.pfdTraceActive = pfdTraceActive;
		this.pfdPmMrp = pfdPmMrp;
		this.pfdQadl01 = pfdQadl01;
		this.pfdQadl02 = pfdQadl02;
		this.pfdQadc01 = pfdQadc01;
		this.pfdQadc02 = pfdQadc02;
		this.pfdQadi01 = pfdQadi01;
		this.pfdQadi02 = pfdQadi02;
		this.pfdQadd01 = pfdQadd01;
		this.pfdChr01 = pfdChr01;
		this.pfdChr02 = pfdChr02;
		this.pfdLog01 = pfdLog01;
		this.pfdLog02 = pfdLog02;
		this.pfdInt01 = pfdInt01;
		this.pfdInt02 = pfdInt02;
		this.pfdDte01 = pfdDte01;
		this.pfdDte02 = pfdDte02;
		this.pfdModUserid = pfdModUserid;
		this.pfdModDate = pfdModDate;
		this.pfdInsBom = pfdInsBom;
		this.pfdInsRoute = pfdInsRoute;
		this.oidPfdDet = oidPfdDet;
	}

	// Property accessors

	public PfdDetId getId() {
		return this.id;
	}

	public void setId(PfdDetId id) {
		this.id = id;
	}

	public String getPfdWarrCd() {
		return this.pfdWarrCd;
	}

	public void setPfdWarrCd(String pfdWarrCd) {
		this.pfdWarrCd = pfdWarrCd;
	}

	public Integer getPfdPvmDays() {
		return this.pfdPvmDays;
	}

	public void setPfdPvmDays(Integer pfdPvmDays) {
		this.pfdPvmDays = pfdPvmDays;
	}

	public Boolean getPfdIsb() {
		return this.pfdIsb;
	}

	public void setPfdIsb(Boolean pfdIsb) {
		this.pfdIsb = pfdIsb;
	}

	public Double getPfdMttr() {
		return this.pfdMttr;
	}

	public void setPfdMttr(Double pfdMttr) {
		this.pfdMttr = pfdMttr;
	}

	public Double getPfdMtbf() {
		return this.pfdMtbf;
	}

	public void setPfdMtbf(Double pfdMtbf) {
		this.pfdMtbf = pfdMtbf;
	}

	public String getPfdSvcGroup() {
		return this.pfdSvcGroup;
	}

	public void setPfdSvcGroup(String pfdSvcGroup) {
		this.pfdSvcGroup = pfdSvcGroup;
	}

	public Boolean getPfdVenWarr() {
		return this.pfdVenWarr;
	}

	public void setPfdVenWarr(Boolean pfdVenWarr) {
		this.pfdVenWarr = pfdVenWarr;
	}

	public Boolean getPfdFru() {
		return this.pfdFru;
	}

	public void setPfdFru(Boolean pfdFru) {
		this.pfdFru = pfdFru;
	}

	public Double getPfdMfgMttr() {
		return this.pfdMfgMttr;
	}

	public void setPfdMfgMttr(Double pfdMfgMttr) {
		this.pfdMfgMttr = pfdMfgMttr;
	}

	public Double getPfdMfgMtbf() {
		return this.pfdMfgMtbf;
	}

	public void setPfdMfgMtbf(Double pfdMfgMtbf) {
		this.pfdMfgMtbf = pfdMfgMtbf;
	}

	public Double getPfdSttr() {
		return this.pfdSttr;
	}

	public void setPfdSttr(Double pfdSttr) {
		this.pfdSttr = pfdSttr;
	}

	public String getPfdOrigin() {
		return this.pfdOrigin;
	}

	public void setPfdOrigin(String pfdOrigin) {
		this.pfdOrigin = pfdOrigin;
	}

	public String getPfdTariff() {
		return this.pfdTariff;
	}

	public void setPfdTariff(String pfdTariff) {
		this.pfdTariff = pfdTariff;
	}

	public Boolean getPfdInstCall() {
		return this.pfdInstCall;
	}

	public void setPfdInstCall(Boolean pfdInstCall) {
		this.pfdInstCall = pfdInstCall;
	}

	public Boolean getPfdCover() {
		return this.pfdCover;
	}

	public void setPfdCover(Boolean pfdCover) {
		this.pfdCover = pfdCover;
	}

	public Boolean getPfdUnitIsb() {
		return this.pfdUnitIsb;
	}

	public void setPfdUnitIsb(Boolean pfdUnitIsb) {
		this.pfdUnitIsb = pfdUnitIsb;
	}

	public String getPfdRpBom() {
		return this.pfdRpBom;
	}

	public void setPfdRpBom(String pfdRpBom) {
		this.pfdRpBom = pfdRpBom;
	}

	public String getPfdRpRoute() {
		return this.pfdRpRoute;
	}

	public void setPfdRpRoute(String pfdRpRoute) {
		this.pfdRpRoute = pfdRpRoute;
	}

	public String getPfdPvmRoute() {
		return this.pfdPvmRoute;
	}

	public void setPfdPvmRoute(String pfdPvmRoute) {
		this.pfdPvmRoute = pfdPvmRoute;
	}

	public String getPfdPvmBom() {
		return this.pfdPvmBom;
	}

	public void setPfdPvmBom(String pfdPvmBom) {
		this.pfdPvmBom = pfdPvmBom;
	}

	public Date getPfdObsDate() {
		return this.pfdObsDate;
	}

	public void setPfdObsDate(Date pfdObsDate) {
		this.pfdObsDate = pfdObsDate;
	}

	public String getPfdPvmUm() {
		return this.pfdPvmUm;
	}

	public void setPfdPvmUm(String pfdPvmUm) {
		this.pfdPvmUm = pfdPvmUm;
	}

	public String getPfdRpVendor() {
		return this.pfdRpVendor;
	}

	public void setPfdRpVendor(String pfdRpVendor) {
		this.pfdRpVendor = pfdRpVendor;
	}

	public String getPfdUser1() {
		return this.pfdUser1;
	}

	public void setPfdUser1(String pfdUser1) {
		this.pfdUser1 = pfdUser1;
	}

	public String getPfdUser2() {
		return this.pfdUser2;
	}

	public void setPfdUser2(String pfdUser2) {
		this.pfdUser2 = pfdUser2;
	}

	public Integer getPfdBenchLead() {
		return this.pfdBenchLead;
	}

	public void setPfdBenchLead(Integer pfdBenchLead) {
		this.pfdBenchLead = pfdBenchLead;
	}

	public Boolean getPfdCusInstall() {
		return this.pfdCusInstall;
	}

	public void setPfdCusInstall(Boolean pfdCusInstall) {
		this.pfdCusInstall = pfdCusInstall;
	}

	public Double getPfdFieldLead() {
		return this.pfdFieldLead;
	}

	public void setPfdFieldLead(Double pfdFieldLead) {
		this.pfdFieldLead = pfdFieldLead;
	}

	public String getPfdLifeCycle() {
		return this.pfdLifeCycle;
	}

	public void setPfdLifeCycle(String pfdLifeCycle) {
		this.pfdLifeCycle = pfdLifeCycle;
	}

	public Boolean getPfdRepairable() {
		return this.pfdRepairable;
	}

	public void setPfdRepairable(Boolean pfdRepairable) {
		this.pfdRepairable = pfdRepairable;
	}

	public String getPfdRpSite() {
		return this.pfdRpSite;
	}

	public void setPfdRpSite(String pfdRpSite) {
		this.pfdRpSite = pfdRpSite;
	}

	public Boolean getPfdPvmExceed() {
		return this.pfdPvmExceed;
	}

	public void setPfdPvmExceed(Boolean pfdPvmExceed) {
		this.pfdPvmExceed = pfdPvmExceed;
	}

	public Double getPfdPvmLimit() {
		return this.pfdPvmLimit;
	}

	public void setPfdPvmLimit(Double pfdPvmLimit) {
		this.pfdPvmLimit = pfdPvmLimit;
	}

	public Boolean getPfdPvmReplace() {
		return this.pfdPvmReplace;
	}

	public void setPfdPvmReplace(Boolean pfdPvmReplace) {
		this.pfdPvmReplace = pfdPvmReplace;
	}

	public Double getPfdPvmSaftey() {
		return this.pfdPvmSaftey;
	}

	public void setPfdPvmSaftey(Double pfdPvmSaftey) {
		this.pfdPvmSaftey = pfdPvmSaftey;
	}

	public Boolean getPfdTraceActive() {
		return this.pfdTraceActive;
	}

	public void setPfdTraceActive(Boolean pfdTraceActive) {
		this.pfdTraceActive = pfdTraceActive;
	}

	public Boolean getPfdPmMrp() {
		return this.pfdPmMrp;
	}

	public void setPfdPmMrp(Boolean pfdPmMrp) {
		this.pfdPmMrp = pfdPmMrp;
	}

	public Boolean getPfdQadl01() {
		return this.pfdQadl01;
	}

	public void setPfdQadl01(Boolean pfdQadl01) {
		this.pfdQadl01 = pfdQadl01;
	}

	public Boolean getPfdQadl02() {
		return this.pfdQadl02;
	}

	public void setPfdQadl02(Boolean pfdQadl02) {
		this.pfdQadl02 = pfdQadl02;
	}

	public String getPfdQadc01() {
		return this.pfdQadc01;
	}

	public void setPfdQadc01(String pfdQadc01) {
		this.pfdQadc01 = pfdQadc01;
	}

	public String getPfdQadc02() {
		return this.pfdQadc02;
	}

	public void setPfdQadc02(String pfdQadc02) {
		this.pfdQadc02 = pfdQadc02;
	}

	public Integer getPfdQadi01() {
		return this.pfdQadi01;
	}

	public void setPfdQadi01(Integer pfdQadi01) {
		this.pfdQadi01 = pfdQadi01;
	}

	public Integer getPfdQadi02() {
		return this.pfdQadi02;
	}

	public void setPfdQadi02(Integer pfdQadi02) {
		this.pfdQadi02 = pfdQadi02;
	}

	public Date getPfdQadd01() {
		return this.pfdQadd01;
	}

	public void setPfdQadd01(Date pfdQadd01) {
		this.pfdQadd01 = pfdQadd01;
	}

	public String getPfdChr01() {
		return this.pfdChr01;
	}

	public void setPfdChr01(String pfdChr01) {
		this.pfdChr01 = pfdChr01;
	}

	public String getPfdChr02() {
		return this.pfdChr02;
	}

	public void setPfdChr02(String pfdChr02) {
		this.pfdChr02 = pfdChr02;
	}

	public Boolean getPfdLog01() {
		return this.pfdLog01;
	}

	public void setPfdLog01(Boolean pfdLog01) {
		this.pfdLog01 = pfdLog01;
	}

	public Boolean getPfdLog02() {
		return this.pfdLog02;
	}

	public void setPfdLog02(Boolean pfdLog02) {
		this.pfdLog02 = pfdLog02;
	}

	public Integer getPfdInt01() {
		return this.pfdInt01;
	}

	public void setPfdInt01(Integer pfdInt01) {
		this.pfdInt01 = pfdInt01;
	}

	public Integer getPfdInt02() {
		return this.pfdInt02;
	}

	public void setPfdInt02(Integer pfdInt02) {
		this.pfdInt02 = pfdInt02;
	}

	public Date getPfdDte01() {
		return this.pfdDte01;
	}

	public void setPfdDte01(Date pfdDte01) {
		this.pfdDte01 = pfdDte01;
	}

	public Date getPfdDte02() {
		return this.pfdDte02;
	}

	public void setPfdDte02(Date pfdDte02) {
		this.pfdDte02 = pfdDte02;
	}

	public String getPfdModUserid() {
		return this.pfdModUserid;
	}

	public void setPfdModUserid(String pfdModUserid) {
		this.pfdModUserid = pfdModUserid;
	}

	public Date getPfdModDate() {
		return this.pfdModDate;
	}

	public void setPfdModDate(Date pfdModDate) {
		this.pfdModDate = pfdModDate;
	}

	public String getPfdInsBom() {
		return this.pfdInsBom;
	}

	public void setPfdInsBom(String pfdInsBom) {
		this.pfdInsBom = pfdInsBom;
	}

	public String getPfdInsRoute() {
		return this.pfdInsRoute;
	}

	public void setPfdInsRoute(String pfdInsRoute) {
		this.pfdInsRoute = pfdInsRoute;
	}

	public Double getOidPfdDet() {
		return this.oidPfdDet;
	}

	public void setOidPfdDet(Double oidPfdDet) {
		this.oidPfdDet = oidPfdDet;
	}

}