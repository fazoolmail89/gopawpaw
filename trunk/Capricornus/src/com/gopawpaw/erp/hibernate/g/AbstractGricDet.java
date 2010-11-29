package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGricDet entity provides the base persistence definition of the
 * GricDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGricDet implements java.io.Serializable {

	// Fields

	private GricDetId id;
	private Integer gricWidth;
	private Integer gricYear;
	private Integer gricPerFrom;
	private Integer gricQuarter;
	private String gricActivity;
	private String gricLabel;
	private String gricColType;
	private String gricBgCode;
	private Boolean gricPrint;
	private Boolean gricSelect;
	private Integer gricPerTo;
	private Boolean gricCurrency;
	private String gricSymbol;
	private String gricUser1;
	private String gricUser2;
	private String gricQadc01;
	private Double oidGricDet;

	// Constructors

	/** default constructor */
	public AbstractGricDet() {
	}

	/** minimal constructor */
	public AbstractGricDet(GricDetId id, Double oidGricDet) {
		this.id = id;
		this.oidGricDet = oidGricDet;
	}

	/** full constructor */
	public AbstractGricDet(GricDetId id, Integer gricWidth, Integer gricYear,
			Integer gricPerFrom, Integer gricQuarter, String gricActivity,
			String gricLabel, String gricColType, String gricBgCode,
			Boolean gricPrint, Boolean gricSelect, Integer gricPerTo,
			Boolean gricCurrency, String gricSymbol, String gricUser1,
			String gricUser2, String gricQadc01, Double oidGricDet) {
		this.id = id;
		this.gricWidth = gricWidth;
		this.gricYear = gricYear;
		this.gricPerFrom = gricPerFrom;
		this.gricQuarter = gricQuarter;
		this.gricActivity = gricActivity;
		this.gricLabel = gricLabel;
		this.gricColType = gricColType;
		this.gricBgCode = gricBgCode;
		this.gricPrint = gricPrint;
		this.gricSelect = gricSelect;
		this.gricPerTo = gricPerTo;
		this.gricCurrency = gricCurrency;
		this.gricSymbol = gricSymbol;
		this.gricUser1 = gricUser1;
		this.gricUser2 = gricUser2;
		this.gricQadc01 = gricQadc01;
		this.oidGricDet = oidGricDet;
	}

	// Property accessors

	public GricDetId getId() {
		return this.id;
	}

	public void setId(GricDetId id) {
		this.id = id;
	}

	public Integer getGricWidth() {
		return this.gricWidth;
	}

	public void setGricWidth(Integer gricWidth) {
		this.gricWidth = gricWidth;
	}

	public Integer getGricYear() {
		return this.gricYear;
	}

	public void setGricYear(Integer gricYear) {
		this.gricYear = gricYear;
	}

	public Integer getGricPerFrom() {
		return this.gricPerFrom;
	}

	public void setGricPerFrom(Integer gricPerFrom) {
		this.gricPerFrom = gricPerFrom;
	}

	public Integer getGricQuarter() {
		return this.gricQuarter;
	}

	public void setGricQuarter(Integer gricQuarter) {
		this.gricQuarter = gricQuarter;
	}

	public String getGricActivity() {
		return this.gricActivity;
	}

	public void setGricActivity(String gricActivity) {
		this.gricActivity = gricActivity;
	}

	public String getGricLabel() {
		return this.gricLabel;
	}

	public void setGricLabel(String gricLabel) {
		this.gricLabel = gricLabel;
	}

	public String getGricColType() {
		return this.gricColType;
	}

	public void setGricColType(String gricColType) {
		this.gricColType = gricColType;
	}

	public String getGricBgCode() {
		return this.gricBgCode;
	}

	public void setGricBgCode(String gricBgCode) {
		this.gricBgCode = gricBgCode;
	}

	public Boolean getGricPrint() {
		return this.gricPrint;
	}

	public void setGricPrint(Boolean gricPrint) {
		this.gricPrint = gricPrint;
	}

	public Boolean getGricSelect() {
		return this.gricSelect;
	}

	public void setGricSelect(Boolean gricSelect) {
		this.gricSelect = gricSelect;
	}

	public Integer getGricPerTo() {
		return this.gricPerTo;
	}

	public void setGricPerTo(Integer gricPerTo) {
		this.gricPerTo = gricPerTo;
	}

	public Boolean getGricCurrency() {
		return this.gricCurrency;
	}

	public void setGricCurrency(Boolean gricCurrency) {
		this.gricCurrency = gricCurrency;
	}

	public String getGricSymbol() {
		return this.gricSymbol;
	}

	public void setGricSymbol(String gricSymbol) {
		this.gricSymbol = gricSymbol;
	}

	public String getGricUser1() {
		return this.gricUser1;
	}

	public void setGricUser1(String gricUser1) {
		this.gricUser1 = gricUser1;
	}

	public String getGricUser2() {
		return this.gricUser2;
	}

	public void setGricUser2(String gricUser2) {
		this.gricUser2 = gricUser2;
	}

	public String getGricQadc01() {
		return this.gricQadc01;
	}

	public void setGricQadc01(String gricQadc01) {
		this.gricQadc01 = gricQadc01;
	}

	public Double getOidGricDet() {
		return this.oidGricDet;
	}

	public void setOidGricDet(Double oidGricDet) {
		this.oidGricDet = oidGricDet;
	}

}