package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRdfMstr entity provides the base persistence definition of the
 * RdfMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRdfMstr implements java.io.Serializable {

	// Fields

	private RdfMstrId id;
	private String rdfGroup;
	private String rdfRtnSite;
	private String rdfRtnLoc;
	private String rdfSpareSite;
	private String rdfSpareLoc;
	private String rdfSrtnSite;
	private String rdfSrtnLoc;
	private String rdfRtsSite;
	private String rdfRtsLoc;
	private String rdfDesc;
	private String rdfUser1;
	private String rdfUser2;
	private String rdfScrapSite;
	private String rdfScrapLoc;
	private String rdfAddr;
	private String rdfCaType;
	private String rdfEsNbr;
	private Boolean rdfNotify;
	private String rdfFax;
	private String rdfEmail;
	private String rdfTransitLoc;
	private String rdfTransitSite;
	private Double rdfShipTime;
	private Double rdfRepairDays;
	private String rdfBomCode;
	private String rdfRouting;
	private String rdfRrtsLoc;
	private String rdfRrtsSite;
	private String rdfRepSite;
	private String rdfRepLoc;
	private String rdfChr01;
	private String rdfChr02;
	private String rdfChr03;
	private String rdfChr04;
	private String rdfChr05;
	private Double rdfDec01;
	private Double rdfDec02;
	private Date rdfDte01;
	private Date rdfDte02;
	private Boolean rdfLog01;
	private Boolean rdfLog02;
	private String rdfQadc01;
	private String rdfQadc02;
	private String rdfQadc03;
	private Date rdfQadt01;
	private Double rdfQade01;
	private Double rdfQade02;
	private Boolean rdfQadl01;
	private Boolean rdfQadl02;
	private Date rdfModDate;
	private String rdfModUserid;
	private Double oidRdfMstr;

	// Constructors

	/** default constructor */
	public AbstractRdfMstr() {
	}

	/** minimal constructor */
	public AbstractRdfMstr(RdfMstrId id, String rdfBomCode, Double oidRdfMstr) {
		this.id = id;
		this.rdfBomCode = rdfBomCode;
		this.oidRdfMstr = oidRdfMstr;
	}

	/** full constructor */
	public AbstractRdfMstr(RdfMstrId id, String rdfGroup, String rdfRtnSite,
			String rdfRtnLoc, String rdfSpareSite, String rdfSpareLoc,
			String rdfSrtnSite, String rdfSrtnLoc, String rdfRtsSite,
			String rdfRtsLoc, String rdfDesc, String rdfUser1, String rdfUser2,
			String rdfScrapSite, String rdfScrapLoc, String rdfAddr,
			String rdfCaType, String rdfEsNbr, Boolean rdfNotify,
			String rdfFax, String rdfEmail, String rdfTransitLoc,
			String rdfTransitSite, Double rdfShipTime, Double rdfRepairDays,
			String rdfBomCode, String rdfRouting, String rdfRrtsLoc,
			String rdfRrtsSite, String rdfRepSite, String rdfRepLoc,
			String rdfChr01, String rdfChr02, String rdfChr03, String rdfChr04,
			String rdfChr05, Double rdfDec01, Double rdfDec02, Date rdfDte01,
			Date rdfDte02, Boolean rdfLog01, Boolean rdfLog02,
			String rdfQadc01, String rdfQadc02, String rdfQadc03,
			Date rdfQadt01, Double rdfQade01, Double rdfQade02,
			Boolean rdfQadl01, Boolean rdfQadl02, Date rdfModDate,
			String rdfModUserid, Double oidRdfMstr) {
		this.id = id;
		this.rdfGroup = rdfGroup;
		this.rdfRtnSite = rdfRtnSite;
		this.rdfRtnLoc = rdfRtnLoc;
		this.rdfSpareSite = rdfSpareSite;
		this.rdfSpareLoc = rdfSpareLoc;
		this.rdfSrtnSite = rdfSrtnSite;
		this.rdfSrtnLoc = rdfSrtnLoc;
		this.rdfRtsSite = rdfRtsSite;
		this.rdfRtsLoc = rdfRtsLoc;
		this.rdfDesc = rdfDesc;
		this.rdfUser1 = rdfUser1;
		this.rdfUser2 = rdfUser2;
		this.rdfScrapSite = rdfScrapSite;
		this.rdfScrapLoc = rdfScrapLoc;
		this.rdfAddr = rdfAddr;
		this.rdfCaType = rdfCaType;
		this.rdfEsNbr = rdfEsNbr;
		this.rdfNotify = rdfNotify;
		this.rdfFax = rdfFax;
		this.rdfEmail = rdfEmail;
		this.rdfTransitLoc = rdfTransitLoc;
		this.rdfTransitSite = rdfTransitSite;
		this.rdfShipTime = rdfShipTime;
		this.rdfRepairDays = rdfRepairDays;
		this.rdfBomCode = rdfBomCode;
		this.rdfRouting = rdfRouting;
		this.rdfRrtsLoc = rdfRrtsLoc;
		this.rdfRrtsSite = rdfRrtsSite;
		this.rdfRepSite = rdfRepSite;
		this.rdfRepLoc = rdfRepLoc;
		this.rdfChr01 = rdfChr01;
		this.rdfChr02 = rdfChr02;
		this.rdfChr03 = rdfChr03;
		this.rdfChr04 = rdfChr04;
		this.rdfChr05 = rdfChr05;
		this.rdfDec01 = rdfDec01;
		this.rdfDec02 = rdfDec02;
		this.rdfDte01 = rdfDte01;
		this.rdfDte02 = rdfDte02;
		this.rdfLog01 = rdfLog01;
		this.rdfLog02 = rdfLog02;
		this.rdfQadc01 = rdfQadc01;
		this.rdfQadc02 = rdfQadc02;
		this.rdfQadc03 = rdfQadc03;
		this.rdfQadt01 = rdfQadt01;
		this.rdfQade01 = rdfQade01;
		this.rdfQade02 = rdfQade02;
		this.rdfQadl01 = rdfQadl01;
		this.rdfQadl02 = rdfQadl02;
		this.rdfModDate = rdfModDate;
		this.rdfModUserid = rdfModUserid;
		this.oidRdfMstr = oidRdfMstr;
	}

	// Property accessors

	public RdfMstrId getId() {
		return this.id;
	}

	public void setId(RdfMstrId id) {
		this.id = id;
	}

	public String getRdfGroup() {
		return this.rdfGroup;
	}

	public void setRdfGroup(String rdfGroup) {
		this.rdfGroup = rdfGroup;
	}

	public String getRdfRtnSite() {
		return this.rdfRtnSite;
	}

	public void setRdfRtnSite(String rdfRtnSite) {
		this.rdfRtnSite = rdfRtnSite;
	}

	public String getRdfRtnLoc() {
		return this.rdfRtnLoc;
	}

	public void setRdfRtnLoc(String rdfRtnLoc) {
		this.rdfRtnLoc = rdfRtnLoc;
	}

	public String getRdfSpareSite() {
		return this.rdfSpareSite;
	}

	public void setRdfSpareSite(String rdfSpareSite) {
		this.rdfSpareSite = rdfSpareSite;
	}

	public String getRdfSpareLoc() {
		return this.rdfSpareLoc;
	}

	public void setRdfSpareLoc(String rdfSpareLoc) {
		this.rdfSpareLoc = rdfSpareLoc;
	}

	public String getRdfSrtnSite() {
		return this.rdfSrtnSite;
	}

	public void setRdfSrtnSite(String rdfSrtnSite) {
		this.rdfSrtnSite = rdfSrtnSite;
	}

	public String getRdfSrtnLoc() {
		return this.rdfSrtnLoc;
	}

	public void setRdfSrtnLoc(String rdfSrtnLoc) {
		this.rdfSrtnLoc = rdfSrtnLoc;
	}

	public String getRdfRtsSite() {
		return this.rdfRtsSite;
	}

	public void setRdfRtsSite(String rdfRtsSite) {
		this.rdfRtsSite = rdfRtsSite;
	}

	public String getRdfRtsLoc() {
		return this.rdfRtsLoc;
	}

	public void setRdfRtsLoc(String rdfRtsLoc) {
		this.rdfRtsLoc = rdfRtsLoc;
	}

	public String getRdfDesc() {
		return this.rdfDesc;
	}

	public void setRdfDesc(String rdfDesc) {
		this.rdfDesc = rdfDesc;
	}

	public String getRdfUser1() {
		return this.rdfUser1;
	}

	public void setRdfUser1(String rdfUser1) {
		this.rdfUser1 = rdfUser1;
	}

	public String getRdfUser2() {
		return this.rdfUser2;
	}

	public void setRdfUser2(String rdfUser2) {
		this.rdfUser2 = rdfUser2;
	}

	public String getRdfScrapSite() {
		return this.rdfScrapSite;
	}

	public void setRdfScrapSite(String rdfScrapSite) {
		this.rdfScrapSite = rdfScrapSite;
	}

	public String getRdfScrapLoc() {
		return this.rdfScrapLoc;
	}

	public void setRdfScrapLoc(String rdfScrapLoc) {
		this.rdfScrapLoc = rdfScrapLoc;
	}

	public String getRdfAddr() {
		return this.rdfAddr;
	}

	public void setRdfAddr(String rdfAddr) {
		this.rdfAddr = rdfAddr;
	}

	public String getRdfCaType() {
		return this.rdfCaType;
	}

	public void setRdfCaType(String rdfCaType) {
		this.rdfCaType = rdfCaType;
	}

	public String getRdfEsNbr() {
		return this.rdfEsNbr;
	}

	public void setRdfEsNbr(String rdfEsNbr) {
		this.rdfEsNbr = rdfEsNbr;
	}

	public Boolean getRdfNotify() {
		return this.rdfNotify;
	}

	public void setRdfNotify(Boolean rdfNotify) {
		this.rdfNotify = rdfNotify;
	}

	public String getRdfFax() {
		return this.rdfFax;
	}

	public void setRdfFax(String rdfFax) {
		this.rdfFax = rdfFax;
	}

	public String getRdfEmail() {
		return this.rdfEmail;
	}

	public void setRdfEmail(String rdfEmail) {
		this.rdfEmail = rdfEmail;
	}

	public String getRdfTransitLoc() {
		return this.rdfTransitLoc;
	}

	public void setRdfTransitLoc(String rdfTransitLoc) {
		this.rdfTransitLoc = rdfTransitLoc;
	}

	public String getRdfTransitSite() {
		return this.rdfTransitSite;
	}

	public void setRdfTransitSite(String rdfTransitSite) {
		this.rdfTransitSite = rdfTransitSite;
	}

	public Double getRdfShipTime() {
		return this.rdfShipTime;
	}

	public void setRdfShipTime(Double rdfShipTime) {
		this.rdfShipTime = rdfShipTime;
	}

	public Double getRdfRepairDays() {
		return this.rdfRepairDays;
	}

	public void setRdfRepairDays(Double rdfRepairDays) {
		this.rdfRepairDays = rdfRepairDays;
	}

	public String getRdfBomCode() {
		return this.rdfBomCode;
	}

	public void setRdfBomCode(String rdfBomCode) {
		this.rdfBomCode = rdfBomCode;
	}

	public String getRdfRouting() {
		return this.rdfRouting;
	}

	public void setRdfRouting(String rdfRouting) {
		this.rdfRouting = rdfRouting;
	}

	public String getRdfRrtsLoc() {
		return this.rdfRrtsLoc;
	}

	public void setRdfRrtsLoc(String rdfRrtsLoc) {
		this.rdfRrtsLoc = rdfRrtsLoc;
	}

	public String getRdfRrtsSite() {
		return this.rdfRrtsSite;
	}

	public void setRdfRrtsSite(String rdfRrtsSite) {
		this.rdfRrtsSite = rdfRrtsSite;
	}

	public String getRdfRepSite() {
		return this.rdfRepSite;
	}

	public void setRdfRepSite(String rdfRepSite) {
		this.rdfRepSite = rdfRepSite;
	}

	public String getRdfRepLoc() {
		return this.rdfRepLoc;
	}

	public void setRdfRepLoc(String rdfRepLoc) {
		this.rdfRepLoc = rdfRepLoc;
	}

	public String getRdfChr01() {
		return this.rdfChr01;
	}

	public void setRdfChr01(String rdfChr01) {
		this.rdfChr01 = rdfChr01;
	}

	public String getRdfChr02() {
		return this.rdfChr02;
	}

	public void setRdfChr02(String rdfChr02) {
		this.rdfChr02 = rdfChr02;
	}

	public String getRdfChr03() {
		return this.rdfChr03;
	}

	public void setRdfChr03(String rdfChr03) {
		this.rdfChr03 = rdfChr03;
	}

	public String getRdfChr04() {
		return this.rdfChr04;
	}

	public void setRdfChr04(String rdfChr04) {
		this.rdfChr04 = rdfChr04;
	}

	public String getRdfChr05() {
		return this.rdfChr05;
	}

	public void setRdfChr05(String rdfChr05) {
		this.rdfChr05 = rdfChr05;
	}

	public Double getRdfDec01() {
		return this.rdfDec01;
	}

	public void setRdfDec01(Double rdfDec01) {
		this.rdfDec01 = rdfDec01;
	}

	public Double getRdfDec02() {
		return this.rdfDec02;
	}

	public void setRdfDec02(Double rdfDec02) {
		this.rdfDec02 = rdfDec02;
	}

	public Date getRdfDte01() {
		return this.rdfDte01;
	}

	public void setRdfDte01(Date rdfDte01) {
		this.rdfDte01 = rdfDte01;
	}

	public Date getRdfDte02() {
		return this.rdfDte02;
	}

	public void setRdfDte02(Date rdfDte02) {
		this.rdfDte02 = rdfDte02;
	}

	public Boolean getRdfLog01() {
		return this.rdfLog01;
	}

	public void setRdfLog01(Boolean rdfLog01) {
		this.rdfLog01 = rdfLog01;
	}

	public Boolean getRdfLog02() {
		return this.rdfLog02;
	}

	public void setRdfLog02(Boolean rdfLog02) {
		this.rdfLog02 = rdfLog02;
	}

	public String getRdfQadc01() {
		return this.rdfQadc01;
	}

	public void setRdfQadc01(String rdfQadc01) {
		this.rdfQadc01 = rdfQadc01;
	}

	public String getRdfQadc02() {
		return this.rdfQadc02;
	}

	public void setRdfQadc02(String rdfQadc02) {
		this.rdfQadc02 = rdfQadc02;
	}

	public String getRdfQadc03() {
		return this.rdfQadc03;
	}

	public void setRdfQadc03(String rdfQadc03) {
		this.rdfQadc03 = rdfQadc03;
	}

	public Date getRdfQadt01() {
		return this.rdfQadt01;
	}

	public void setRdfQadt01(Date rdfQadt01) {
		this.rdfQadt01 = rdfQadt01;
	}

	public Double getRdfQade01() {
		return this.rdfQade01;
	}

	public void setRdfQade01(Double rdfQade01) {
		this.rdfQade01 = rdfQade01;
	}

	public Double getRdfQade02() {
		return this.rdfQade02;
	}

	public void setRdfQade02(Double rdfQade02) {
		this.rdfQade02 = rdfQade02;
	}

	public Boolean getRdfQadl01() {
		return this.rdfQadl01;
	}

	public void setRdfQadl01(Boolean rdfQadl01) {
		this.rdfQadl01 = rdfQadl01;
	}

	public Boolean getRdfQadl02() {
		return this.rdfQadl02;
	}

	public void setRdfQadl02(Boolean rdfQadl02) {
		this.rdfQadl02 = rdfQadl02;
	}

	public Date getRdfModDate() {
		return this.rdfModDate;
	}

	public void setRdfModDate(Date rdfModDate) {
		this.rdfModDate = rdfModDate;
	}

	public String getRdfModUserid() {
		return this.rdfModUserid;
	}

	public void setRdfModUserid(String rdfModUserid) {
		this.rdfModUserid = rdfModUserid;
	}

	public Double getOidRdfMstr() {
		return this.oidRdfMstr;
	}

	public void setOidRdfMstr(Double oidRdfMstr) {
		this.oidRdfMstr = oidRdfMstr;
	}

}