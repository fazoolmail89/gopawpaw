package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrcdDet entity provides the base persistence definition of the
 * GrcdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrcdDet implements java.io.Serializable {

	// Fields

	private GrcdDetId id;
	private String grcdColType;
	private String grcdDesc;
	private String grcdPerTo;
	private String grcdSymbol;
	private String grcdProject;
	private String grcdBgCode;
	private Boolean grcdPercent;
	private Boolean grcdPrint;
	private String grcdFormat;
	private Boolean grcdOverride;
	private String grcdRound;
	private String grcdLabel;
	private String grcdUser1;
	private String grcdUser2;
	private String grcdQuarter;
	private String grcdPerFrom;
	private String grcdYear;
	private String grcdActivity;
	private Boolean grcdBgRoll;
	private Integer grcdWidth;
	private String grcdRvpol;
	private String grcdCalc;
	private Boolean grcdCurrency;
	private String grcdQadc01;
	private Double oidGrcdDet;

	// Constructors

	/** default constructor */
	public AbstractGrcdDet() {
	}

	/** minimal constructor */
	public AbstractGrcdDet(GrcdDetId id, Double oidGrcdDet) {
		this.id = id;
		this.oidGrcdDet = oidGrcdDet;
	}

	/** full constructor */
	public AbstractGrcdDet(GrcdDetId id, String grcdColType, String grcdDesc,
			String grcdPerTo, String grcdSymbol, String grcdProject,
			String grcdBgCode, Boolean grcdPercent, Boolean grcdPrint,
			String grcdFormat, Boolean grcdOverride, String grcdRound,
			String grcdLabel, String grcdUser1, String grcdUser2,
			String grcdQuarter, String grcdPerFrom, String grcdYear,
			String grcdActivity, Boolean grcdBgRoll, Integer grcdWidth,
			String grcdRvpol, String grcdCalc, Boolean grcdCurrency,
			String grcdQadc01, Double oidGrcdDet) {
		this.id = id;
		this.grcdColType = grcdColType;
		this.grcdDesc = grcdDesc;
		this.grcdPerTo = grcdPerTo;
		this.grcdSymbol = grcdSymbol;
		this.grcdProject = grcdProject;
		this.grcdBgCode = grcdBgCode;
		this.grcdPercent = grcdPercent;
		this.grcdPrint = grcdPrint;
		this.grcdFormat = grcdFormat;
		this.grcdOverride = grcdOverride;
		this.grcdRound = grcdRound;
		this.grcdLabel = grcdLabel;
		this.grcdUser1 = grcdUser1;
		this.grcdUser2 = grcdUser2;
		this.grcdQuarter = grcdQuarter;
		this.grcdPerFrom = grcdPerFrom;
		this.grcdYear = grcdYear;
		this.grcdActivity = grcdActivity;
		this.grcdBgRoll = grcdBgRoll;
		this.grcdWidth = grcdWidth;
		this.grcdRvpol = grcdRvpol;
		this.grcdCalc = grcdCalc;
		this.grcdCurrency = grcdCurrency;
		this.grcdQadc01 = grcdQadc01;
		this.oidGrcdDet = oidGrcdDet;
	}

	// Property accessors

	public GrcdDetId getId() {
		return this.id;
	}

	public void setId(GrcdDetId id) {
		this.id = id;
	}

	public String getGrcdColType() {
		return this.grcdColType;
	}

	public void setGrcdColType(String grcdColType) {
		this.grcdColType = grcdColType;
	}

	public String getGrcdDesc() {
		return this.grcdDesc;
	}

	public void setGrcdDesc(String grcdDesc) {
		this.grcdDesc = grcdDesc;
	}

	public String getGrcdPerTo() {
		return this.grcdPerTo;
	}

	public void setGrcdPerTo(String grcdPerTo) {
		this.grcdPerTo = grcdPerTo;
	}

	public String getGrcdSymbol() {
		return this.grcdSymbol;
	}

	public void setGrcdSymbol(String grcdSymbol) {
		this.grcdSymbol = grcdSymbol;
	}

	public String getGrcdProject() {
		return this.grcdProject;
	}

	public void setGrcdProject(String grcdProject) {
		this.grcdProject = grcdProject;
	}

	public String getGrcdBgCode() {
		return this.grcdBgCode;
	}

	public void setGrcdBgCode(String grcdBgCode) {
		this.grcdBgCode = grcdBgCode;
	}

	public Boolean getGrcdPercent() {
		return this.grcdPercent;
	}

	public void setGrcdPercent(Boolean grcdPercent) {
		this.grcdPercent = grcdPercent;
	}

	public Boolean getGrcdPrint() {
		return this.grcdPrint;
	}

	public void setGrcdPrint(Boolean grcdPrint) {
		this.grcdPrint = grcdPrint;
	}

	public String getGrcdFormat() {
		return this.grcdFormat;
	}

	public void setGrcdFormat(String grcdFormat) {
		this.grcdFormat = grcdFormat;
	}

	public Boolean getGrcdOverride() {
		return this.grcdOverride;
	}

	public void setGrcdOverride(Boolean grcdOverride) {
		this.grcdOverride = grcdOverride;
	}

	public String getGrcdRound() {
		return this.grcdRound;
	}

	public void setGrcdRound(String grcdRound) {
		this.grcdRound = grcdRound;
	}

	public String getGrcdLabel() {
		return this.grcdLabel;
	}

	public void setGrcdLabel(String grcdLabel) {
		this.grcdLabel = grcdLabel;
	}

	public String getGrcdUser1() {
		return this.grcdUser1;
	}

	public void setGrcdUser1(String grcdUser1) {
		this.grcdUser1 = grcdUser1;
	}

	public String getGrcdUser2() {
		return this.grcdUser2;
	}

	public void setGrcdUser2(String grcdUser2) {
		this.grcdUser2 = grcdUser2;
	}

	public String getGrcdQuarter() {
		return this.grcdQuarter;
	}

	public void setGrcdQuarter(String grcdQuarter) {
		this.grcdQuarter = grcdQuarter;
	}

	public String getGrcdPerFrom() {
		return this.grcdPerFrom;
	}

	public void setGrcdPerFrom(String grcdPerFrom) {
		this.grcdPerFrom = grcdPerFrom;
	}

	public String getGrcdYear() {
		return this.grcdYear;
	}

	public void setGrcdYear(String grcdYear) {
		this.grcdYear = grcdYear;
	}

	public String getGrcdActivity() {
		return this.grcdActivity;
	}

	public void setGrcdActivity(String grcdActivity) {
		this.grcdActivity = grcdActivity;
	}

	public Boolean getGrcdBgRoll() {
		return this.grcdBgRoll;
	}

	public void setGrcdBgRoll(Boolean grcdBgRoll) {
		this.grcdBgRoll = grcdBgRoll;
	}

	public Integer getGrcdWidth() {
		return this.grcdWidth;
	}

	public void setGrcdWidth(Integer grcdWidth) {
		this.grcdWidth = grcdWidth;
	}

	public String getGrcdRvpol() {
		return this.grcdRvpol;
	}

	public void setGrcdRvpol(String grcdRvpol) {
		this.grcdRvpol = grcdRvpol;
	}

	public String getGrcdCalc() {
		return this.grcdCalc;
	}

	public void setGrcdCalc(String grcdCalc) {
		this.grcdCalc = grcdCalc;
	}

	public Boolean getGrcdCurrency() {
		return this.grcdCurrency;
	}

	public void setGrcdCurrency(Boolean grcdCurrency) {
		this.grcdCurrency = grcdCurrency;
	}

	public String getGrcdQadc01() {
		return this.grcdQadc01;
	}

	public void setGrcdQadc01(String grcdQadc01) {
		this.grcdQadc01 = grcdQadc01;
	}

	public Double getOidGrcdDet() {
		return this.oidGrcdDet;
	}

	public void setOidGrcdDet(Double oidGrcdDet) {
		this.oidGrcdDet = oidGrcdDet;
	}

}