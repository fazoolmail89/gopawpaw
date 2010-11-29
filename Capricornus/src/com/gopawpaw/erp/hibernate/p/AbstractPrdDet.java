package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPrdDet entity provides the base persistence definition of the PrdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPrdDet implements java.io.Serializable {

	// Fields

	private String prdDev;
	private String prdDesc;
	private String prdSt80;
	private String prdReset;
	private String prdSt132;
	private String prdStBc;
	private String prdEndBc;
	private String prdNegLine;
	private Integer prdLength;
	private Integer prdBlank;
	private String prdPage;
	private String prdType;
	private Boolean prdSpooler;
	private String prdPath;
	private String prdInit;
	private String prdInitPro;
	private String prdRsetPro;
	private String prdUser1;
	private String prdUser2;
	private String prdMapterm;
	private Integer prdMaxPage;
	private Boolean prdScrollOnly;
	private String prdQad01;
	private Integer prdDestType;
	private Double oidPrdDet;

	// Constructors

	/** default constructor */
	public AbstractPrdDet() {
	}

	/** minimal constructor */
	public AbstractPrdDet(String prdPath, Integer prdDestType, Double oidPrdDet) {
		this.prdPath = prdPath;
		this.prdDestType = prdDestType;
		this.oidPrdDet = oidPrdDet;
	}

	/** full constructor */
	public AbstractPrdDet(String prdDesc, String prdSt80, String prdReset,
			String prdSt132, String prdStBc, String prdEndBc,
			String prdNegLine, Integer prdLength, Integer prdBlank,
			String prdPage, String prdType, Boolean prdSpooler, String prdPath,
			String prdInit, String prdInitPro, String prdRsetPro,
			String prdUser1, String prdUser2, String prdMapterm,
			Integer prdMaxPage, Boolean prdScrollOnly, String prdQad01,
			Integer prdDestType, Double oidPrdDet) {
		this.prdDesc = prdDesc;
		this.prdSt80 = prdSt80;
		this.prdReset = prdReset;
		this.prdSt132 = prdSt132;
		this.prdStBc = prdStBc;
		this.prdEndBc = prdEndBc;
		this.prdNegLine = prdNegLine;
		this.prdLength = prdLength;
		this.prdBlank = prdBlank;
		this.prdPage = prdPage;
		this.prdType = prdType;
		this.prdSpooler = prdSpooler;
		this.prdPath = prdPath;
		this.prdInit = prdInit;
		this.prdInitPro = prdInitPro;
		this.prdRsetPro = prdRsetPro;
		this.prdUser1 = prdUser1;
		this.prdUser2 = prdUser2;
		this.prdMapterm = prdMapterm;
		this.prdMaxPage = prdMaxPage;
		this.prdScrollOnly = prdScrollOnly;
		this.prdQad01 = prdQad01;
		this.prdDestType = prdDestType;
		this.oidPrdDet = oidPrdDet;
	}

	// Property accessors

	public String getPrdDev() {
		return this.prdDev;
	}

	public void setPrdDev(String prdDev) {
		this.prdDev = prdDev;
	}

	public String getPrdDesc() {
		return this.prdDesc;
	}

	public void setPrdDesc(String prdDesc) {
		this.prdDesc = prdDesc;
	}

	public String getPrdSt80() {
		return this.prdSt80;
	}

	public void setPrdSt80(String prdSt80) {
		this.prdSt80 = prdSt80;
	}

	public String getPrdReset() {
		return this.prdReset;
	}

	public void setPrdReset(String prdReset) {
		this.prdReset = prdReset;
	}

	public String getPrdSt132() {
		return this.prdSt132;
	}

	public void setPrdSt132(String prdSt132) {
		this.prdSt132 = prdSt132;
	}

	public String getPrdStBc() {
		return this.prdStBc;
	}

	public void setPrdStBc(String prdStBc) {
		this.prdStBc = prdStBc;
	}

	public String getPrdEndBc() {
		return this.prdEndBc;
	}

	public void setPrdEndBc(String prdEndBc) {
		this.prdEndBc = prdEndBc;
	}

	public String getPrdNegLine() {
		return this.prdNegLine;
	}

	public void setPrdNegLine(String prdNegLine) {
		this.prdNegLine = prdNegLine;
	}

	public Integer getPrdLength() {
		return this.prdLength;
	}

	public void setPrdLength(Integer prdLength) {
		this.prdLength = prdLength;
	}

	public Integer getPrdBlank() {
		return this.prdBlank;
	}

	public void setPrdBlank(Integer prdBlank) {
		this.prdBlank = prdBlank;
	}

	public String getPrdPage() {
		return this.prdPage;
	}

	public void setPrdPage(String prdPage) {
		this.prdPage = prdPage;
	}

	public String getPrdType() {
		return this.prdType;
	}

	public void setPrdType(String prdType) {
		this.prdType = prdType;
	}

	public Boolean getPrdSpooler() {
		return this.prdSpooler;
	}

	public void setPrdSpooler(Boolean prdSpooler) {
		this.prdSpooler = prdSpooler;
	}

	public String getPrdPath() {
		return this.prdPath;
	}

	public void setPrdPath(String prdPath) {
		this.prdPath = prdPath;
	}

	public String getPrdInit() {
		return this.prdInit;
	}

	public void setPrdInit(String prdInit) {
		this.prdInit = prdInit;
	}

	public String getPrdInitPro() {
		return this.prdInitPro;
	}

	public void setPrdInitPro(String prdInitPro) {
		this.prdInitPro = prdInitPro;
	}

	public String getPrdRsetPro() {
		return this.prdRsetPro;
	}

	public void setPrdRsetPro(String prdRsetPro) {
		this.prdRsetPro = prdRsetPro;
	}

	public String getPrdUser1() {
		return this.prdUser1;
	}

	public void setPrdUser1(String prdUser1) {
		this.prdUser1 = prdUser1;
	}

	public String getPrdUser2() {
		return this.prdUser2;
	}

	public void setPrdUser2(String prdUser2) {
		this.prdUser2 = prdUser2;
	}

	public String getPrdMapterm() {
		return this.prdMapterm;
	}

	public void setPrdMapterm(String prdMapterm) {
		this.prdMapterm = prdMapterm;
	}

	public Integer getPrdMaxPage() {
		return this.prdMaxPage;
	}

	public void setPrdMaxPage(Integer prdMaxPage) {
		this.prdMaxPage = prdMaxPage;
	}

	public Boolean getPrdScrollOnly() {
		return this.prdScrollOnly;
	}

	public void setPrdScrollOnly(Boolean prdScrollOnly) {
		this.prdScrollOnly = prdScrollOnly;
	}

	public String getPrdQad01() {
		return this.prdQad01;
	}

	public void setPrdQad01(String prdQad01) {
		this.prdQad01 = prdQad01;
	}

	public Integer getPrdDestType() {
		return this.prdDestType;
	}

	public void setPrdDestType(Integer prdDestType) {
		this.prdDestType = prdDestType;
	}

	public Double getOidPrdDet() {
		return this.oidPrdDet;
	}

	public void setOidPrdDet(Double oidPrdDet) {
		this.oidPrdDet = oidPrdDet;
	}

}