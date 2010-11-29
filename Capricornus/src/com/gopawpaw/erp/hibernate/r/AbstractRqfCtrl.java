package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqfCtrl entity provides the base persistence definition of the
 * RqfCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqfCtrl implements java.io.Serializable {

	// Fields

	private String rqfDomain;
	private Integer rqfQadi01;
	private Integer rqfNbr;
	private String rqfPre;
	private Boolean rqfLnFmt;
	private Double rqfTolVal;
	private Boolean rqfUseTolval;
	private Double rqfTolPct;
	private Boolean rqfUseTolpct;
	private Boolean rqfLcmmts;
	private Boolean rqfHcmmts;
	private String rqfApprCurr;
	private String rqfEmailOpt;
	private String rqfOotRtg;
	private Boolean rqfOotRtgMode;
	private Integer rqfDiraprsReq;
	private Integer rqfHoraprsReq;
	private Integer rqfVrtaprsReq;
	private String rqfChr01;
	private String rqfChr02;
	private String rqfChr03;
	private String rqfChr04;
	private Double rqfDec01;
	private Boolean rqfLog01;
	private Date rqfDte01;
	private String rqfQadc01;
	private String rqfQadc02;
	private String rqfQadc03;
	private String rqfQadc04;
	private Double oidRqfCtrl;

	// Constructors

	/** default constructor */
	public AbstractRqfCtrl() {
	}

	/** minimal constructor */
	public AbstractRqfCtrl(Double oidRqfCtrl) {
		this.oidRqfCtrl = oidRqfCtrl;
	}

	/** full constructor */
	public AbstractRqfCtrl(Integer rqfQadi01, Integer rqfNbr, String rqfPre,
			Boolean rqfLnFmt, Double rqfTolVal, Boolean rqfUseTolval,
			Double rqfTolPct, Boolean rqfUseTolpct, Boolean rqfLcmmts,
			Boolean rqfHcmmts, String rqfApprCurr, String rqfEmailOpt,
			String rqfOotRtg, Boolean rqfOotRtgMode, Integer rqfDiraprsReq,
			Integer rqfHoraprsReq, Integer rqfVrtaprsReq, String rqfChr01,
			String rqfChr02, String rqfChr03, String rqfChr04, Double rqfDec01,
			Boolean rqfLog01, Date rqfDte01, String rqfQadc01,
			String rqfQadc02, String rqfQadc03, String rqfQadc04,
			Double oidRqfCtrl) {
		this.rqfQadi01 = rqfQadi01;
		this.rqfNbr = rqfNbr;
		this.rqfPre = rqfPre;
		this.rqfLnFmt = rqfLnFmt;
		this.rqfTolVal = rqfTolVal;
		this.rqfUseTolval = rqfUseTolval;
		this.rqfTolPct = rqfTolPct;
		this.rqfUseTolpct = rqfUseTolpct;
		this.rqfLcmmts = rqfLcmmts;
		this.rqfHcmmts = rqfHcmmts;
		this.rqfApprCurr = rqfApprCurr;
		this.rqfEmailOpt = rqfEmailOpt;
		this.rqfOotRtg = rqfOotRtg;
		this.rqfOotRtgMode = rqfOotRtgMode;
		this.rqfDiraprsReq = rqfDiraprsReq;
		this.rqfHoraprsReq = rqfHoraprsReq;
		this.rqfVrtaprsReq = rqfVrtaprsReq;
		this.rqfChr01 = rqfChr01;
		this.rqfChr02 = rqfChr02;
		this.rqfChr03 = rqfChr03;
		this.rqfChr04 = rqfChr04;
		this.rqfDec01 = rqfDec01;
		this.rqfLog01 = rqfLog01;
		this.rqfDte01 = rqfDte01;
		this.rqfQadc01 = rqfQadc01;
		this.rqfQadc02 = rqfQadc02;
		this.rqfQadc03 = rqfQadc03;
		this.rqfQadc04 = rqfQadc04;
		this.oidRqfCtrl = oidRqfCtrl;
	}

	// Property accessors

	public String getRqfDomain() {
		return this.rqfDomain;
	}

	public void setRqfDomain(String rqfDomain) {
		this.rqfDomain = rqfDomain;
	}

	public Integer getRqfQadi01() {
		return this.rqfQadi01;
	}

	public void setRqfQadi01(Integer rqfQadi01) {
		this.rqfQadi01 = rqfQadi01;
	}

	public Integer getRqfNbr() {
		return this.rqfNbr;
	}

	public void setRqfNbr(Integer rqfNbr) {
		this.rqfNbr = rqfNbr;
	}

	public String getRqfPre() {
		return this.rqfPre;
	}

	public void setRqfPre(String rqfPre) {
		this.rqfPre = rqfPre;
	}

	public Boolean getRqfLnFmt() {
		return this.rqfLnFmt;
	}

	public void setRqfLnFmt(Boolean rqfLnFmt) {
		this.rqfLnFmt = rqfLnFmt;
	}

	public Double getRqfTolVal() {
		return this.rqfTolVal;
	}

	public void setRqfTolVal(Double rqfTolVal) {
		this.rqfTolVal = rqfTolVal;
	}

	public Boolean getRqfUseTolval() {
		return this.rqfUseTolval;
	}

	public void setRqfUseTolval(Boolean rqfUseTolval) {
		this.rqfUseTolval = rqfUseTolval;
	}

	public Double getRqfTolPct() {
		return this.rqfTolPct;
	}

	public void setRqfTolPct(Double rqfTolPct) {
		this.rqfTolPct = rqfTolPct;
	}

	public Boolean getRqfUseTolpct() {
		return this.rqfUseTolpct;
	}

	public void setRqfUseTolpct(Boolean rqfUseTolpct) {
		this.rqfUseTolpct = rqfUseTolpct;
	}

	public Boolean getRqfLcmmts() {
		return this.rqfLcmmts;
	}

	public void setRqfLcmmts(Boolean rqfLcmmts) {
		this.rqfLcmmts = rqfLcmmts;
	}

	public Boolean getRqfHcmmts() {
		return this.rqfHcmmts;
	}

	public void setRqfHcmmts(Boolean rqfHcmmts) {
		this.rqfHcmmts = rqfHcmmts;
	}

	public String getRqfApprCurr() {
		return this.rqfApprCurr;
	}

	public void setRqfApprCurr(String rqfApprCurr) {
		this.rqfApprCurr = rqfApprCurr;
	}

	public String getRqfEmailOpt() {
		return this.rqfEmailOpt;
	}

	public void setRqfEmailOpt(String rqfEmailOpt) {
		this.rqfEmailOpt = rqfEmailOpt;
	}

	public String getRqfOotRtg() {
		return this.rqfOotRtg;
	}

	public void setRqfOotRtg(String rqfOotRtg) {
		this.rqfOotRtg = rqfOotRtg;
	}

	public Boolean getRqfOotRtgMode() {
		return this.rqfOotRtgMode;
	}

	public void setRqfOotRtgMode(Boolean rqfOotRtgMode) {
		this.rqfOotRtgMode = rqfOotRtgMode;
	}

	public Integer getRqfDiraprsReq() {
		return this.rqfDiraprsReq;
	}

	public void setRqfDiraprsReq(Integer rqfDiraprsReq) {
		this.rqfDiraprsReq = rqfDiraprsReq;
	}

	public Integer getRqfHoraprsReq() {
		return this.rqfHoraprsReq;
	}

	public void setRqfHoraprsReq(Integer rqfHoraprsReq) {
		this.rqfHoraprsReq = rqfHoraprsReq;
	}

	public Integer getRqfVrtaprsReq() {
		return this.rqfVrtaprsReq;
	}

	public void setRqfVrtaprsReq(Integer rqfVrtaprsReq) {
		this.rqfVrtaprsReq = rqfVrtaprsReq;
	}

	public String getRqfChr01() {
		return this.rqfChr01;
	}

	public void setRqfChr01(String rqfChr01) {
		this.rqfChr01 = rqfChr01;
	}

	public String getRqfChr02() {
		return this.rqfChr02;
	}

	public void setRqfChr02(String rqfChr02) {
		this.rqfChr02 = rqfChr02;
	}

	public String getRqfChr03() {
		return this.rqfChr03;
	}

	public void setRqfChr03(String rqfChr03) {
		this.rqfChr03 = rqfChr03;
	}

	public String getRqfChr04() {
		return this.rqfChr04;
	}

	public void setRqfChr04(String rqfChr04) {
		this.rqfChr04 = rqfChr04;
	}

	public Double getRqfDec01() {
		return this.rqfDec01;
	}

	public void setRqfDec01(Double rqfDec01) {
		this.rqfDec01 = rqfDec01;
	}

	public Boolean getRqfLog01() {
		return this.rqfLog01;
	}

	public void setRqfLog01(Boolean rqfLog01) {
		this.rqfLog01 = rqfLog01;
	}

	public Date getRqfDte01() {
		return this.rqfDte01;
	}

	public void setRqfDte01(Date rqfDte01) {
		this.rqfDte01 = rqfDte01;
	}

	public String getRqfQadc01() {
		return this.rqfQadc01;
	}

	public void setRqfQadc01(String rqfQadc01) {
		this.rqfQadc01 = rqfQadc01;
	}

	public String getRqfQadc02() {
		return this.rqfQadc02;
	}

	public void setRqfQadc02(String rqfQadc02) {
		this.rqfQadc02 = rqfQadc02;
	}

	public String getRqfQadc03() {
		return this.rqfQadc03;
	}

	public void setRqfQadc03(String rqfQadc03) {
		this.rqfQadc03 = rqfQadc03;
	}

	public String getRqfQadc04() {
		return this.rqfQadc04;
	}

	public void setRqfQadc04(String rqfQadc04) {
		this.rqfQadc04 = rqfQadc04;
	}

	public Double getOidRqfCtrl() {
		return this.oidRqfCtrl;
	}

	public void setOidRqfCtrl(Double oidRqfCtrl) {
		this.oidRqfCtrl = oidRqfCtrl;
	}

}