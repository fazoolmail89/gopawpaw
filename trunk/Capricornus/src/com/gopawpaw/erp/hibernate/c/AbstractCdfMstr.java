package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCdfMstr entity provides the base persistence definition of the
 * CdfMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCdfMstr implements java.io.Serializable {

	// Fields

	private CdfMstrId id;
	private String cdfCaType;
	private String cdfCaProb;
	private String cdfCaQue;
	private String cdfCaSeverity;
	private Integer cdfCaPri;
	private String cdfCaNxtsts;
	private String cdfCaStatus;
	private String cdfDesc;
	private String cdfPart;
	private String cdfCaDesc;
	private String cdfUser1;
	private String cdfUser2;
	private String cdfExec;
	private String cdfChr01;
	private String cdfChr02;
	private String cdfChr03;
	private String cdfChr04;
	private Double cdfDec01;
	private Double cdfDec02;
	private Double cdfDec03;
	private Date cdfDte01;
	private Date cdfDte02;
	private Date cdfDte03;
	private Boolean cdfLog01;
	private Boolean cdfLog02;
	private Boolean cdfLog03;
	private String cdfQadc01;
	private String cdfQadc02;
	private String cdfQadc03;
	private String cdfQadc04;
	private Date cdfQadd01;
	private Date cdfQadd02;
	private Date cdfQadd03;
	private Double cdfQadde01;
	private Double cdfQadde02;
	private Double cdfQadde03;
	private Boolean cdfQadl01;
	private Boolean cdfQadl02;
	private Boolean cdfQadl03;
	private String cdfCaEsNbr;
	private String cdfEstTime;
	private String cdfModUserid;
	private Date cdfModDate;
	private Double oidCdfMstr;

	// Constructors

	/** default constructor */
	public AbstractCdfMstr() {
	}

	/** minimal constructor */
	public AbstractCdfMstr(CdfMstrId id, Double oidCdfMstr) {
		this.id = id;
		this.oidCdfMstr = oidCdfMstr;
	}

	/** full constructor */
	public AbstractCdfMstr(CdfMstrId id, String cdfCaType, String cdfCaProb,
			String cdfCaQue, String cdfCaSeverity, Integer cdfCaPri,
			String cdfCaNxtsts, String cdfCaStatus, String cdfDesc,
			String cdfPart, String cdfCaDesc, String cdfUser1, String cdfUser2,
			String cdfExec, String cdfChr01, String cdfChr02, String cdfChr03,
			String cdfChr04, Double cdfDec01, Double cdfDec02, Double cdfDec03,
			Date cdfDte01, Date cdfDte02, Date cdfDte03, Boolean cdfLog01,
			Boolean cdfLog02, Boolean cdfLog03, String cdfQadc01,
			String cdfQadc02, String cdfQadc03, String cdfQadc04,
			Date cdfQadd01, Date cdfQadd02, Date cdfQadd03, Double cdfQadde01,
			Double cdfQadde02, Double cdfQadde03, Boolean cdfQadl01,
			Boolean cdfQadl02, Boolean cdfQadl03, String cdfCaEsNbr,
			String cdfEstTime, String cdfModUserid, Date cdfModDate,
			Double oidCdfMstr) {
		this.id = id;
		this.cdfCaType = cdfCaType;
		this.cdfCaProb = cdfCaProb;
		this.cdfCaQue = cdfCaQue;
		this.cdfCaSeverity = cdfCaSeverity;
		this.cdfCaPri = cdfCaPri;
		this.cdfCaNxtsts = cdfCaNxtsts;
		this.cdfCaStatus = cdfCaStatus;
		this.cdfDesc = cdfDesc;
		this.cdfPart = cdfPart;
		this.cdfCaDesc = cdfCaDesc;
		this.cdfUser1 = cdfUser1;
		this.cdfUser2 = cdfUser2;
		this.cdfExec = cdfExec;
		this.cdfChr01 = cdfChr01;
		this.cdfChr02 = cdfChr02;
		this.cdfChr03 = cdfChr03;
		this.cdfChr04 = cdfChr04;
		this.cdfDec01 = cdfDec01;
		this.cdfDec02 = cdfDec02;
		this.cdfDec03 = cdfDec03;
		this.cdfDte01 = cdfDte01;
		this.cdfDte02 = cdfDte02;
		this.cdfDte03 = cdfDte03;
		this.cdfLog01 = cdfLog01;
		this.cdfLog02 = cdfLog02;
		this.cdfLog03 = cdfLog03;
		this.cdfQadc01 = cdfQadc01;
		this.cdfQadc02 = cdfQadc02;
		this.cdfQadc03 = cdfQadc03;
		this.cdfQadc04 = cdfQadc04;
		this.cdfQadd01 = cdfQadd01;
		this.cdfQadd02 = cdfQadd02;
		this.cdfQadd03 = cdfQadd03;
		this.cdfQadde01 = cdfQadde01;
		this.cdfQadde02 = cdfQadde02;
		this.cdfQadde03 = cdfQadde03;
		this.cdfQadl01 = cdfQadl01;
		this.cdfQadl02 = cdfQadl02;
		this.cdfQadl03 = cdfQadl03;
		this.cdfCaEsNbr = cdfCaEsNbr;
		this.cdfEstTime = cdfEstTime;
		this.cdfModUserid = cdfModUserid;
		this.cdfModDate = cdfModDate;
		this.oidCdfMstr = oidCdfMstr;
	}

	// Property accessors

	public CdfMstrId getId() {
		return this.id;
	}

	public void setId(CdfMstrId id) {
		this.id = id;
	}

	public String getCdfCaType() {
		return this.cdfCaType;
	}

	public void setCdfCaType(String cdfCaType) {
		this.cdfCaType = cdfCaType;
	}

	public String getCdfCaProb() {
		return this.cdfCaProb;
	}

	public void setCdfCaProb(String cdfCaProb) {
		this.cdfCaProb = cdfCaProb;
	}

	public String getCdfCaQue() {
		return this.cdfCaQue;
	}

	public void setCdfCaQue(String cdfCaQue) {
		this.cdfCaQue = cdfCaQue;
	}

	public String getCdfCaSeverity() {
		return this.cdfCaSeverity;
	}

	public void setCdfCaSeverity(String cdfCaSeverity) {
		this.cdfCaSeverity = cdfCaSeverity;
	}

	public Integer getCdfCaPri() {
		return this.cdfCaPri;
	}

	public void setCdfCaPri(Integer cdfCaPri) {
		this.cdfCaPri = cdfCaPri;
	}

	public String getCdfCaNxtsts() {
		return this.cdfCaNxtsts;
	}

	public void setCdfCaNxtsts(String cdfCaNxtsts) {
		this.cdfCaNxtsts = cdfCaNxtsts;
	}

	public String getCdfCaStatus() {
		return this.cdfCaStatus;
	}

	public void setCdfCaStatus(String cdfCaStatus) {
		this.cdfCaStatus = cdfCaStatus;
	}

	public String getCdfDesc() {
		return this.cdfDesc;
	}

	public void setCdfDesc(String cdfDesc) {
		this.cdfDesc = cdfDesc;
	}

	public String getCdfPart() {
		return this.cdfPart;
	}

	public void setCdfPart(String cdfPart) {
		this.cdfPart = cdfPart;
	}

	public String getCdfCaDesc() {
		return this.cdfCaDesc;
	}

	public void setCdfCaDesc(String cdfCaDesc) {
		this.cdfCaDesc = cdfCaDesc;
	}

	public String getCdfUser1() {
		return this.cdfUser1;
	}

	public void setCdfUser1(String cdfUser1) {
		this.cdfUser1 = cdfUser1;
	}

	public String getCdfUser2() {
		return this.cdfUser2;
	}

	public void setCdfUser2(String cdfUser2) {
		this.cdfUser2 = cdfUser2;
	}

	public String getCdfExec() {
		return this.cdfExec;
	}

	public void setCdfExec(String cdfExec) {
		this.cdfExec = cdfExec;
	}

	public String getCdfChr01() {
		return this.cdfChr01;
	}

	public void setCdfChr01(String cdfChr01) {
		this.cdfChr01 = cdfChr01;
	}

	public String getCdfChr02() {
		return this.cdfChr02;
	}

	public void setCdfChr02(String cdfChr02) {
		this.cdfChr02 = cdfChr02;
	}

	public String getCdfChr03() {
		return this.cdfChr03;
	}

	public void setCdfChr03(String cdfChr03) {
		this.cdfChr03 = cdfChr03;
	}

	public String getCdfChr04() {
		return this.cdfChr04;
	}

	public void setCdfChr04(String cdfChr04) {
		this.cdfChr04 = cdfChr04;
	}

	public Double getCdfDec01() {
		return this.cdfDec01;
	}

	public void setCdfDec01(Double cdfDec01) {
		this.cdfDec01 = cdfDec01;
	}

	public Double getCdfDec02() {
		return this.cdfDec02;
	}

	public void setCdfDec02(Double cdfDec02) {
		this.cdfDec02 = cdfDec02;
	}

	public Double getCdfDec03() {
		return this.cdfDec03;
	}

	public void setCdfDec03(Double cdfDec03) {
		this.cdfDec03 = cdfDec03;
	}

	public Date getCdfDte01() {
		return this.cdfDte01;
	}

	public void setCdfDte01(Date cdfDte01) {
		this.cdfDte01 = cdfDte01;
	}

	public Date getCdfDte02() {
		return this.cdfDte02;
	}

	public void setCdfDte02(Date cdfDte02) {
		this.cdfDte02 = cdfDte02;
	}

	public Date getCdfDte03() {
		return this.cdfDte03;
	}

	public void setCdfDte03(Date cdfDte03) {
		this.cdfDte03 = cdfDte03;
	}

	public Boolean getCdfLog01() {
		return this.cdfLog01;
	}

	public void setCdfLog01(Boolean cdfLog01) {
		this.cdfLog01 = cdfLog01;
	}

	public Boolean getCdfLog02() {
		return this.cdfLog02;
	}

	public void setCdfLog02(Boolean cdfLog02) {
		this.cdfLog02 = cdfLog02;
	}

	public Boolean getCdfLog03() {
		return this.cdfLog03;
	}

	public void setCdfLog03(Boolean cdfLog03) {
		this.cdfLog03 = cdfLog03;
	}

	public String getCdfQadc01() {
		return this.cdfQadc01;
	}

	public void setCdfQadc01(String cdfQadc01) {
		this.cdfQadc01 = cdfQadc01;
	}

	public String getCdfQadc02() {
		return this.cdfQadc02;
	}

	public void setCdfQadc02(String cdfQadc02) {
		this.cdfQadc02 = cdfQadc02;
	}

	public String getCdfQadc03() {
		return this.cdfQadc03;
	}

	public void setCdfQadc03(String cdfQadc03) {
		this.cdfQadc03 = cdfQadc03;
	}

	public String getCdfQadc04() {
		return this.cdfQadc04;
	}

	public void setCdfQadc04(String cdfQadc04) {
		this.cdfQadc04 = cdfQadc04;
	}

	public Date getCdfQadd01() {
		return this.cdfQadd01;
	}

	public void setCdfQadd01(Date cdfQadd01) {
		this.cdfQadd01 = cdfQadd01;
	}

	public Date getCdfQadd02() {
		return this.cdfQadd02;
	}

	public void setCdfQadd02(Date cdfQadd02) {
		this.cdfQadd02 = cdfQadd02;
	}

	public Date getCdfQadd03() {
		return this.cdfQadd03;
	}

	public void setCdfQadd03(Date cdfQadd03) {
		this.cdfQadd03 = cdfQadd03;
	}

	public Double getCdfQadde01() {
		return this.cdfQadde01;
	}

	public void setCdfQadde01(Double cdfQadde01) {
		this.cdfQadde01 = cdfQadde01;
	}

	public Double getCdfQadde02() {
		return this.cdfQadde02;
	}

	public void setCdfQadde02(Double cdfQadde02) {
		this.cdfQadde02 = cdfQadde02;
	}

	public Double getCdfQadde03() {
		return this.cdfQadde03;
	}

	public void setCdfQadde03(Double cdfQadde03) {
		this.cdfQadde03 = cdfQadde03;
	}

	public Boolean getCdfQadl01() {
		return this.cdfQadl01;
	}

	public void setCdfQadl01(Boolean cdfQadl01) {
		this.cdfQadl01 = cdfQadl01;
	}

	public Boolean getCdfQadl02() {
		return this.cdfQadl02;
	}

	public void setCdfQadl02(Boolean cdfQadl02) {
		this.cdfQadl02 = cdfQadl02;
	}

	public Boolean getCdfQadl03() {
		return this.cdfQadl03;
	}

	public void setCdfQadl03(Boolean cdfQadl03) {
		this.cdfQadl03 = cdfQadl03;
	}

	public String getCdfCaEsNbr() {
		return this.cdfCaEsNbr;
	}

	public void setCdfCaEsNbr(String cdfCaEsNbr) {
		this.cdfCaEsNbr = cdfCaEsNbr;
	}

	public String getCdfEstTime() {
		return this.cdfEstTime;
	}

	public void setCdfEstTime(String cdfEstTime) {
		this.cdfEstTime = cdfEstTime;
	}

	public String getCdfModUserid() {
		return this.cdfModUserid;
	}

	public void setCdfModUserid(String cdfModUserid) {
		this.cdfModUserid = cdfModUserid;
	}

	public Date getCdfModDate() {
		return this.cdfModDate;
	}

	public void setCdfModDate(Date cdfModDate) {
		this.cdfModDate = cdfModDate;
	}

	public Double getOidCdfMstr() {
		return this.oidCdfMstr;
	}

	public void setOidCdfMstr(Double oidCdfMstr) {
		this.oidCdfMstr = oidCdfMstr;
	}

}