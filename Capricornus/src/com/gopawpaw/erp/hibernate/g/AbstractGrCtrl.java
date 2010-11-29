package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrCtrl entity provides the base persistence definition of the GrCtrl
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrCtrl implements java.io.Serializable {

	// Fields

	private String grDomain;
	private Integer grIndex1;
	private String grFormat;
	private String grRound;
	private String grQtrLbl;
	private Boolean grAcCmmts;
	private Boolean grRgCmmts;
	private Boolean grCgCmmts;
	private Boolean grRpCmmts;
	private Integer grRgWidth;
	private Integer grRunId;
	private Integer grColWidth;
	private Boolean grPrecedence;
	private Integer grPer;
	private Integer grYear;
	private String grCyre;
	private String grCyis;
	private Integer grTxtIx;
	private String grUser1;
	private String grUser2;
	private String grQadc01;
	private Double oidGrCtrl;

	// Constructors

	/** default constructor */
	public AbstractGrCtrl() {
	}

	/** minimal constructor */
	public AbstractGrCtrl(Double oidGrCtrl) {
		this.oidGrCtrl = oidGrCtrl;
	}

	/** full constructor */
	public AbstractGrCtrl(Integer grIndex1, String grFormat, String grRound,
			String grQtrLbl, Boolean grAcCmmts, Boolean grRgCmmts,
			Boolean grCgCmmts, Boolean grRpCmmts, Integer grRgWidth,
			Integer grRunId, Integer grColWidth, Boolean grPrecedence,
			Integer grPer, Integer grYear, String grCyre, String grCyis,
			Integer grTxtIx, String grUser1, String grUser2, String grQadc01,
			Double oidGrCtrl) {
		this.grIndex1 = grIndex1;
		this.grFormat = grFormat;
		this.grRound = grRound;
		this.grQtrLbl = grQtrLbl;
		this.grAcCmmts = grAcCmmts;
		this.grRgCmmts = grRgCmmts;
		this.grCgCmmts = grCgCmmts;
		this.grRpCmmts = grRpCmmts;
		this.grRgWidth = grRgWidth;
		this.grRunId = grRunId;
		this.grColWidth = grColWidth;
		this.grPrecedence = grPrecedence;
		this.grPer = grPer;
		this.grYear = grYear;
		this.grCyre = grCyre;
		this.grCyis = grCyis;
		this.grTxtIx = grTxtIx;
		this.grUser1 = grUser1;
		this.grUser2 = grUser2;
		this.grQadc01 = grQadc01;
		this.oidGrCtrl = oidGrCtrl;
	}

	// Property accessors

	public String getGrDomain() {
		return this.grDomain;
	}

	public void setGrDomain(String grDomain) {
		this.grDomain = grDomain;
	}

	public Integer getGrIndex1() {
		return this.grIndex1;
	}

	public void setGrIndex1(Integer grIndex1) {
		this.grIndex1 = grIndex1;
	}

	public String getGrFormat() {
		return this.grFormat;
	}

	public void setGrFormat(String grFormat) {
		this.grFormat = grFormat;
	}

	public String getGrRound() {
		return this.grRound;
	}

	public void setGrRound(String grRound) {
		this.grRound = grRound;
	}

	public String getGrQtrLbl() {
		return this.grQtrLbl;
	}

	public void setGrQtrLbl(String grQtrLbl) {
		this.grQtrLbl = grQtrLbl;
	}

	public Boolean getGrAcCmmts() {
		return this.grAcCmmts;
	}

	public void setGrAcCmmts(Boolean grAcCmmts) {
		this.grAcCmmts = grAcCmmts;
	}

	public Boolean getGrRgCmmts() {
		return this.grRgCmmts;
	}

	public void setGrRgCmmts(Boolean grRgCmmts) {
		this.grRgCmmts = grRgCmmts;
	}

	public Boolean getGrCgCmmts() {
		return this.grCgCmmts;
	}

	public void setGrCgCmmts(Boolean grCgCmmts) {
		this.grCgCmmts = grCgCmmts;
	}

	public Boolean getGrRpCmmts() {
		return this.grRpCmmts;
	}

	public void setGrRpCmmts(Boolean grRpCmmts) {
		this.grRpCmmts = grRpCmmts;
	}

	public Integer getGrRgWidth() {
		return this.grRgWidth;
	}

	public void setGrRgWidth(Integer grRgWidth) {
		this.grRgWidth = grRgWidth;
	}

	public Integer getGrRunId() {
		return this.grRunId;
	}

	public void setGrRunId(Integer grRunId) {
		this.grRunId = grRunId;
	}

	public Integer getGrColWidth() {
		return this.grColWidth;
	}

	public void setGrColWidth(Integer grColWidth) {
		this.grColWidth = grColWidth;
	}

	public Boolean getGrPrecedence() {
		return this.grPrecedence;
	}

	public void setGrPrecedence(Boolean grPrecedence) {
		this.grPrecedence = grPrecedence;
	}

	public Integer getGrPer() {
		return this.grPer;
	}

	public void setGrPer(Integer grPer) {
		this.grPer = grPer;
	}

	public Integer getGrYear() {
		return this.grYear;
	}

	public void setGrYear(Integer grYear) {
		this.grYear = grYear;
	}

	public String getGrCyre() {
		return this.grCyre;
	}

	public void setGrCyre(String grCyre) {
		this.grCyre = grCyre;
	}

	public String getGrCyis() {
		return this.grCyis;
	}

	public void setGrCyis(String grCyis) {
		this.grCyis = grCyis;
	}

	public Integer getGrTxtIx() {
		return this.grTxtIx;
	}

	public void setGrTxtIx(Integer grTxtIx) {
		this.grTxtIx = grTxtIx;
	}

	public String getGrUser1() {
		return this.grUser1;
	}

	public void setGrUser1(String grUser1) {
		this.grUser1 = grUser1;
	}

	public String getGrUser2() {
		return this.grUser2;
	}

	public void setGrUser2(String grUser2) {
		this.grUser2 = grUser2;
	}

	public String getGrQadc01() {
		return this.grQadc01;
	}

	public void setGrQadc01(String grQadc01) {
		this.grQadc01 = grQadc01;
	}

	public Double getOidGrCtrl() {
		return this.oidGrCtrl;
	}

	public void setOidGrCtrl(Double oidGrCtrl) {
		this.oidGrCtrl = oidGrCtrl;
	}

}