package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPccCtrl entity provides the base persistence definition of the
 * PccCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPccCtrl implements java.io.Serializable {

	// Fields

	private String pccDomain;
	private Integer pccQadi01;
	private Boolean pccAutoNbr;
	private String pccCmmtType;
	private Boolean pccSecurityOn;
	private Integer pccMaxWkfl;
	private Boolean pccStructOk;
	private Boolean pccRoutingOk;
	private Boolean pccQspecOk;
	private Boolean pccQualityOk;
	private Date pccInitialDate;
	private Date pccEcooffDate;
	private String pccCommLang;
	private String pccPcoPre;
	private String pccNextPco;
	private Integer pccDbSeq;
	private String pccUser1;
	private String pccUser2;
	private String pccQadc01;
	private Boolean pccFormulaOk;
	private Boolean pccProcessOk;
	private Double oidPccCtrl;
	private Boolean pccEnforceSeq;

	// Constructors

	/** default constructor */
	public AbstractPccCtrl() {
	}

	/** minimal constructor */
	public AbstractPccCtrl(Integer pccQadi01, Boolean pccAutoNbr,
			String pccCmmtType, Boolean pccSecurityOn, Integer pccMaxWkfl,
			Boolean pccStructOk, Boolean pccRoutingOk, Boolean pccQspecOk,
			Boolean pccQualityOk, String pccCommLang, String pccPcoPre,
			String pccNextPco, Integer pccDbSeq, Boolean pccFormulaOk,
			Boolean pccProcessOk, Double oidPccCtrl, Boolean pccEnforceSeq) {
		this.pccQadi01 = pccQadi01;
		this.pccAutoNbr = pccAutoNbr;
		this.pccCmmtType = pccCmmtType;
		this.pccSecurityOn = pccSecurityOn;
		this.pccMaxWkfl = pccMaxWkfl;
		this.pccStructOk = pccStructOk;
		this.pccRoutingOk = pccRoutingOk;
		this.pccQspecOk = pccQspecOk;
		this.pccQualityOk = pccQualityOk;
		this.pccCommLang = pccCommLang;
		this.pccPcoPre = pccPcoPre;
		this.pccNextPco = pccNextPco;
		this.pccDbSeq = pccDbSeq;
		this.pccFormulaOk = pccFormulaOk;
		this.pccProcessOk = pccProcessOk;
		this.oidPccCtrl = oidPccCtrl;
		this.pccEnforceSeq = pccEnforceSeq;
	}

	/** full constructor */
	public AbstractPccCtrl(Integer pccQadi01, Boolean pccAutoNbr,
			String pccCmmtType, Boolean pccSecurityOn, Integer pccMaxWkfl,
			Boolean pccStructOk, Boolean pccRoutingOk, Boolean pccQspecOk,
			Boolean pccQualityOk, Date pccInitialDate, Date pccEcooffDate,
			String pccCommLang, String pccPcoPre, String pccNextPco,
			Integer pccDbSeq, String pccUser1, String pccUser2,
			String pccQadc01, Boolean pccFormulaOk, Boolean pccProcessOk,
			Double oidPccCtrl, Boolean pccEnforceSeq) {
		this.pccQadi01 = pccQadi01;
		this.pccAutoNbr = pccAutoNbr;
		this.pccCmmtType = pccCmmtType;
		this.pccSecurityOn = pccSecurityOn;
		this.pccMaxWkfl = pccMaxWkfl;
		this.pccStructOk = pccStructOk;
		this.pccRoutingOk = pccRoutingOk;
		this.pccQspecOk = pccQspecOk;
		this.pccQualityOk = pccQualityOk;
		this.pccInitialDate = pccInitialDate;
		this.pccEcooffDate = pccEcooffDate;
		this.pccCommLang = pccCommLang;
		this.pccPcoPre = pccPcoPre;
		this.pccNextPco = pccNextPco;
		this.pccDbSeq = pccDbSeq;
		this.pccUser1 = pccUser1;
		this.pccUser2 = pccUser2;
		this.pccQadc01 = pccQadc01;
		this.pccFormulaOk = pccFormulaOk;
		this.pccProcessOk = pccProcessOk;
		this.oidPccCtrl = oidPccCtrl;
		this.pccEnforceSeq = pccEnforceSeq;
	}

	// Property accessors

	public String getPccDomain() {
		return this.pccDomain;
	}

	public void setPccDomain(String pccDomain) {
		this.pccDomain = pccDomain;
	}

	public Integer getPccQadi01() {
		return this.pccQadi01;
	}

	public void setPccQadi01(Integer pccQadi01) {
		this.pccQadi01 = pccQadi01;
	}

	public Boolean getPccAutoNbr() {
		return this.pccAutoNbr;
	}

	public void setPccAutoNbr(Boolean pccAutoNbr) {
		this.pccAutoNbr = pccAutoNbr;
	}

	public String getPccCmmtType() {
		return this.pccCmmtType;
	}

	public void setPccCmmtType(String pccCmmtType) {
		this.pccCmmtType = pccCmmtType;
	}

	public Boolean getPccSecurityOn() {
		return this.pccSecurityOn;
	}

	public void setPccSecurityOn(Boolean pccSecurityOn) {
		this.pccSecurityOn = pccSecurityOn;
	}

	public Integer getPccMaxWkfl() {
		return this.pccMaxWkfl;
	}

	public void setPccMaxWkfl(Integer pccMaxWkfl) {
		this.pccMaxWkfl = pccMaxWkfl;
	}

	public Boolean getPccStructOk() {
		return this.pccStructOk;
	}

	public void setPccStructOk(Boolean pccStructOk) {
		this.pccStructOk = pccStructOk;
	}

	public Boolean getPccRoutingOk() {
		return this.pccRoutingOk;
	}

	public void setPccRoutingOk(Boolean pccRoutingOk) {
		this.pccRoutingOk = pccRoutingOk;
	}

	public Boolean getPccQspecOk() {
		return this.pccQspecOk;
	}

	public void setPccQspecOk(Boolean pccQspecOk) {
		this.pccQspecOk = pccQspecOk;
	}

	public Boolean getPccQualityOk() {
		return this.pccQualityOk;
	}

	public void setPccQualityOk(Boolean pccQualityOk) {
		this.pccQualityOk = pccQualityOk;
	}

	public Date getPccInitialDate() {
		return this.pccInitialDate;
	}

	public void setPccInitialDate(Date pccInitialDate) {
		this.pccInitialDate = pccInitialDate;
	}

	public Date getPccEcooffDate() {
		return this.pccEcooffDate;
	}

	public void setPccEcooffDate(Date pccEcooffDate) {
		this.pccEcooffDate = pccEcooffDate;
	}

	public String getPccCommLang() {
		return this.pccCommLang;
	}

	public void setPccCommLang(String pccCommLang) {
		this.pccCommLang = pccCommLang;
	}

	public String getPccPcoPre() {
		return this.pccPcoPre;
	}

	public void setPccPcoPre(String pccPcoPre) {
		this.pccPcoPre = pccPcoPre;
	}

	public String getPccNextPco() {
		return this.pccNextPco;
	}

	public void setPccNextPco(String pccNextPco) {
		this.pccNextPco = pccNextPco;
	}

	public Integer getPccDbSeq() {
		return this.pccDbSeq;
	}

	public void setPccDbSeq(Integer pccDbSeq) {
		this.pccDbSeq = pccDbSeq;
	}

	public String getPccUser1() {
		return this.pccUser1;
	}

	public void setPccUser1(String pccUser1) {
		this.pccUser1 = pccUser1;
	}

	public String getPccUser2() {
		return this.pccUser2;
	}

	public void setPccUser2(String pccUser2) {
		this.pccUser2 = pccUser2;
	}

	public String getPccQadc01() {
		return this.pccQadc01;
	}

	public void setPccQadc01(String pccQadc01) {
		this.pccQadc01 = pccQadc01;
	}

	public Boolean getPccFormulaOk() {
		return this.pccFormulaOk;
	}

	public void setPccFormulaOk(Boolean pccFormulaOk) {
		this.pccFormulaOk = pccFormulaOk;
	}

	public Boolean getPccProcessOk() {
		return this.pccProcessOk;
	}

	public void setPccProcessOk(Boolean pccProcessOk) {
		this.pccProcessOk = pccProcessOk;
	}

	public Double getOidPccCtrl() {
		return this.oidPccCtrl;
	}

	public void setOidPccCtrl(Double oidPccCtrl) {
		this.oidPccCtrl = oidPccCtrl;
	}

	public Boolean getPccEnforceSeq() {
		return this.pccEnforceSeq;
	}

	public void setPccEnforceSeq(Boolean pccEnforceSeq) {
		this.pccEnforceSeq = pccEnforceSeq;
	}

}