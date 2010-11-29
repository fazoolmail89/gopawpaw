package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRhdHist entity provides the base persistence definition of the
 * RhdHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRhdHist implements java.io.Serializable {

	// Fields

	private RhdHistId id;
	private String rhdNbr;
	private Integer rhdLine;
	private String rhdPart;
	private Double rhdQtyOrd;
	private Double rhdQtyAcp;
	private String rhdTrans;
	private Double rhdPrice;
	private String rhdSerial;
	private String rhdStatus;
	private String rhdUser1;
	private String rhdUser2;
	private String rhdProdline;
	private String rhdChr01;
	private String rhdChr02;
	private String rhdChr03;
	private String rhdChr04;
	private String rhdChr05;
	private String rhdChr06;
	private String rhdChr07;
	private String rhdChr08;
	private String rhdChr09;
	private String rhdChr10;
	private Date rhdDte01;
	private Date rhdDte02;
	private Double rhdDec01;
	private Double rhdDec02;
	private Boolean rhdLog01;
	private String rhdFaultCd;
	private String rhdType;
	private Integer rhdLink;
	private Boolean rhdRmaRtrn;
	private Double rhdCvrPct;
	private Integer rhdRef;
	private Date rhdExpDate;
	private Date rhdCplDate;
	private String rhdRmaNbr;
	private Integer rhdRmaLine;
	private String rhdSite;
	private String rhdLoc;
	private String rhdPrefix;
	private String rhdRev;
	private String rhdCust;
	private String rhdShip;
	private String rhdHistype;
	private String rhdChgType;
	private String rhdSaNbr;
	private Double rhdCovered;
	private String rhdSvCode;
	private String rhdEnduser;
	private Date rhdParDate;
	private Date rhdInsDate;
	private String rhdParPart;
	private String rhdParSer;
	private String rhdProcess;
	private String rhdEngArea;
	private String rhdEngCode;
	private String rhdEuArea;
	private String rhdDesc;
	private Integer rhdCmtindx;
	private Double rhdRestock;
	private Boolean rhdLoaner;
	private String rhdSerLon;
	private Boolean rhdDone;
	private Boolean rhdIss;
	private Boolean rhdEditIsb;
	private String rhdUm;
	private Double rhdUmConv;
	private Double rhdCustoms;
	private Double rhdQtyRel;
	private String rhdEnd;
	private Double rhdQtyNon;
	private String rhdStart;
	private String rhdOpTran;
	private String rhdQadc01;
	private String rhdQadc02;
	private String rhdQadc03;
	private Date rhdQadd01;
	private Date rhdQadd02;
	private Date rhdQadd03;
	private Double rhdQadde01;
	private Double rhdQadde02;
	private Integer rhdQadi01;
	private Integer rhdQadi02;
	private Boolean rhdQadl01;
	private Boolean rhdQadl02;
	private Boolean rhdQadl03;
	private Integer rhdQadi03;
	private Double rhdQadde03;
	private Date rhdQadd04;
	private Date rhdQadd05;
	private String rhdModUserid;
	private Date rhdModDate;
	private Double oidRhdHist;

	// Constructors

	/** default constructor */
	public AbstractRhdHist() {
	}

	/** minimal constructor */
	public AbstractRhdHist(RhdHistId id, String rhdEnduser, Double oidRhdHist) {
		this.id = id;
		this.rhdEnduser = rhdEnduser;
		this.oidRhdHist = oidRhdHist;
	}

	/** full constructor */
	public AbstractRhdHist(RhdHistId id, String rhdNbr, Integer rhdLine,
			String rhdPart, Double rhdQtyOrd, Double rhdQtyAcp,
			String rhdTrans, Double rhdPrice, String rhdSerial,
			String rhdStatus, String rhdUser1, String rhdUser2,
			String rhdProdline, String rhdChr01, String rhdChr02,
			String rhdChr03, String rhdChr04, String rhdChr05, String rhdChr06,
			String rhdChr07, String rhdChr08, String rhdChr09, String rhdChr10,
			Date rhdDte01, Date rhdDte02, Double rhdDec01, Double rhdDec02,
			Boolean rhdLog01, String rhdFaultCd, String rhdType,
			Integer rhdLink, Boolean rhdRmaRtrn, Double rhdCvrPct,
			Integer rhdRef, Date rhdExpDate, Date rhdCplDate, String rhdRmaNbr,
			Integer rhdRmaLine, String rhdSite, String rhdLoc,
			String rhdPrefix, String rhdRev, String rhdCust, String rhdShip,
			String rhdHistype, String rhdChgType, String rhdSaNbr,
			Double rhdCovered, String rhdSvCode, String rhdEnduser,
			Date rhdParDate, Date rhdInsDate, String rhdParPart,
			String rhdParSer, String rhdProcess, String rhdEngArea,
			String rhdEngCode, String rhdEuArea, String rhdDesc,
			Integer rhdCmtindx, Double rhdRestock, Boolean rhdLoaner,
			String rhdSerLon, Boolean rhdDone, Boolean rhdIss,
			Boolean rhdEditIsb, String rhdUm, Double rhdUmConv,
			Double rhdCustoms, Double rhdQtyRel, String rhdEnd,
			Double rhdQtyNon, String rhdStart, String rhdOpTran,
			String rhdQadc01, String rhdQadc02, String rhdQadc03,
			Date rhdQadd01, Date rhdQadd02, Date rhdQadd03, Double rhdQadde01,
			Double rhdQadde02, Integer rhdQadi01, Integer rhdQadi02,
			Boolean rhdQadl01, Boolean rhdQadl02, Boolean rhdQadl03,
			Integer rhdQadi03, Double rhdQadde03, Date rhdQadd04,
			Date rhdQadd05, String rhdModUserid, Date rhdModDate,
			Double oidRhdHist) {
		this.id = id;
		this.rhdNbr = rhdNbr;
		this.rhdLine = rhdLine;
		this.rhdPart = rhdPart;
		this.rhdQtyOrd = rhdQtyOrd;
		this.rhdQtyAcp = rhdQtyAcp;
		this.rhdTrans = rhdTrans;
		this.rhdPrice = rhdPrice;
		this.rhdSerial = rhdSerial;
		this.rhdStatus = rhdStatus;
		this.rhdUser1 = rhdUser1;
		this.rhdUser2 = rhdUser2;
		this.rhdProdline = rhdProdline;
		this.rhdChr01 = rhdChr01;
		this.rhdChr02 = rhdChr02;
		this.rhdChr03 = rhdChr03;
		this.rhdChr04 = rhdChr04;
		this.rhdChr05 = rhdChr05;
		this.rhdChr06 = rhdChr06;
		this.rhdChr07 = rhdChr07;
		this.rhdChr08 = rhdChr08;
		this.rhdChr09 = rhdChr09;
		this.rhdChr10 = rhdChr10;
		this.rhdDte01 = rhdDte01;
		this.rhdDte02 = rhdDte02;
		this.rhdDec01 = rhdDec01;
		this.rhdDec02 = rhdDec02;
		this.rhdLog01 = rhdLog01;
		this.rhdFaultCd = rhdFaultCd;
		this.rhdType = rhdType;
		this.rhdLink = rhdLink;
		this.rhdRmaRtrn = rhdRmaRtrn;
		this.rhdCvrPct = rhdCvrPct;
		this.rhdRef = rhdRef;
		this.rhdExpDate = rhdExpDate;
		this.rhdCplDate = rhdCplDate;
		this.rhdRmaNbr = rhdRmaNbr;
		this.rhdRmaLine = rhdRmaLine;
		this.rhdSite = rhdSite;
		this.rhdLoc = rhdLoc;
		this.rhdPrefix = rhdPrefix;
		this.rhdRev = rhdRev;
		this.rhdCust = rhdCust;
		this.rhdShip = rhdShip;
		this.rhdHistype = rhdHistype;
		this.rhdChgType = rhdChgType;
		this.rhdSaNbr = rhdSaNbr;
		this.rhdCovered = rhdCovered;
		this.rhdSvCode = rhdSvCode;
		this.rhdEnduser = rhdEnduser;
		this.rhdParDate = rhdParDate;
		this.rhdInsDate = rhdInsDate;
		this.rhdParPart = rhdParPart;
		this.rhdParSer = rhdParSer;
		this.rhdProcess = rhdProcess;
		this.rhdEngArea = rhdEngArea;
		this.rhdEngCode = rhdEngCode;
		this.rhdEuArea = rhdEuArea;
		this.rhdDesc = rhdDesc;
		this.rhdCmtindx = rhdCmtindx;
		this.rhdRestock = rhdRestock;
		this.rhdLoaner = rhdLoaner;
		this.rhdSerLon = rhdSerLon;
		this.rhdDone = rhdDone;
		this.rhdIss = rhdIss;
		this.rhdEditIsb = rhdEditIsb;
		this.rhdUm = rhdUm;
		this.rhdUmConv = rhdUmConv;
		this.rhdCustoms = rhdCustoms;
		this.rhdQtyRel = rhdQtyRel;
		this.rhdEnd = rhdEnd;
		this.rhdQtyNon = rhdQtyNon;
		this.rhdStart = rhdStart;
		this.rhdOpTran = rhdOpTran;
		this.rhdQadc01 = rhdQadc01;
		this.rhdQadc02 = rhdQadc02;
		this.rhdQadc03 = rhdQadc03;
		this.rhdQadd01 = rhdQadd01;
		this.rhdQadd02 = rhdQadd02;
		this.rhdQadd03 = rhdQadd03;
		this.rhdQadde01 = rhdQadde01;
		this.rhdQadde02 = rhdQadde02;
		this.rhdQadi01 = rhdQadi01;
		this.rhdQadi02 = rhdQadi02;
		this.rhdQadl01 = rhdQadl01;
		this.rhdQadl02 = rhdQadl02;
		this.rhdQadl03 = rhdQadl03;
		this.rhdQadi03 = rhdQadi03;
		this.rhdQadde03 = rhdQadde03;
		this.rhdQadd04 = rhdQadd04;
		this.rhdQadd05 = rhdQadd05;
		this.rhdModUserid = rhdModUserid;
		this.rhdModDate = rhdModDate;
		this.oidRhdHist = oidRhdHist;
	}

	// Property accessors

	public RhdHistId getId() {
		return this.id;
	}

	public void setId(RhdHistId id) {
		this.id = id;
	}

	public String getRhdNbr() {
		return this.rhdNbr;
	}

	public void setRhdNbr(String rhdNbr) {
		this.rhdNbr = rhdNbr;
	}

	public Integer getRhdLine() {
		return this.rhdLine;
	}

	public void setRhdLine(Integer rhdLine) {
		this.rhdLine = rhdLine;
	}

	public String getRhdPart() {
		return this.rhdPart;
	}

	public void setRhdPart(String rhdPart) {
		this.rhdPart = rhdPart;
	}

	public Double getRhdQtyOrd() {
		return this.rhdQtyOrd;
	}

	public void setRhdQtyOrd(Double rhdQtyOrd) {
		this.rhdQtyOrd = rhdQtyOrd;
	}

	public Double getRhdQtyAcp() {
		return this.rhdQtyAcp;
	}

	public void setRhdQtyAcp(Double rhdQtyAcp) {
		this.rhdQtyAcp = rhdQtyAcp;
	}

	public String getRhdTrans() {
		return this.rhdTrans;
	}

	public void setRhdTrans(String rhdTrans) {
		this.rhdTrans = rhdTrans;
	}

	public Double getRhdPrice() {
		return this.rhdPrice;
	}

	public void setRhdPrice(Double rhdPrice) {
		this.rhdPrice = rhdPrice;
	}

	public String getRhdSerial() {
		return this.rhdSerial;
	}

	public void setRhdSerial(String rhdSerial) {
		this.rhdSerial = rhdSerial;
	}

	public String getRhdStatus() {
		return this.rhdStatus;
	}

	public void setRhdStatus(String rhdStatus) {
		this.rhdStatus = rhdStatus;
	}

	public String getRhdUser1() {
		return this.rhdUser1;
	}

	public void setRhdUser1(String rhdUser1) {
		this.rhdUser1 = rhdUser1;
	}

	public String getRhdUser2() {
		return this.rhdUser2;
	}

	public void setRhdUser2(String rhdUser2) {
		this.rhdUser2 = rhdUser2;
	}

	public String getRhdProdline() {
		return this.rhdProdline;
	}

	public void setRhdProdline(String rhdProdline) {
		this.rhdProdline = rhdProdline;
	}

	public String getRhdChr01() {
		return this.rhdChr01;
	}

	public void setRhdChr01(String rhdChr01) {
		this.rhdChr01 = rhdChr01;
	}

	public String getRhdChr02() {
		return this.rhdChr02;
	}

	public void setRhdChr02(String rhdChr02) {
		this.rhdChr02 = rhdChr02;
	}

	public String getRhdChr03() {
		return this.rhdChr03;
	}

	public void setRhdChr03(String rhdChr03) {
		this.rhdChr03 = rhdChr03;
	}

	public String getRhdChr04() {
		return this.rhdChr04;
	}

	public void setRhdChr04(String rhdChr04) {
		this.rhdChr04 = rhdChr04;
	}

	public String getRhdChr05() {
		return this.rhdChr05;
	}

	public void setRhdChr05(String rhdChr05) {
		this.rhdChr05 = rhdChr05;
	}

	public String getRhdChr06() {
		return this.rhdChr06;
	}

	public void setRhdChr06(String rhdChr06) {
		this.rhdChr06 = rhdChr06;
	}

	public String getRhdChr07() {
		return this.rhdChr07;
	}

	public void setRhdChr07(String rhdChr07) {
		this.rhdChr07 = rhdChr07;
	}

	public String getRhdChr08() {
		return this.rhdChr08;
	}

	public void setRhdChr08(String rhdChr08) {
		this.rhdChr08 = rhdChr08;
	}

	public String getRhdChr09() {
		return this.rhdChr09;
	}

	public void setRhdChr09(String rhdChr09) {
		this.rhdChr09 = rhdChr09;
	}

	public String getRhdChr10() {
		return this.rhdChr10;
	}

	public void setRhdChr10(String rhdChr10) {
		this.rhdChr10 = rhdChr10;
	}

	public Date getRhdDte01() {
		return this.rhdDte01;
	}

	public void setRhdDte01(Date rhdDte01) {
		this.rhdDte01 = rhdDte01;
	}

	public Date getRhdDte02() {
		return this.rhdDte02;
	}

	public void setRhdDte02(Date rhdDte02) {
		this.rhdDte02 = rhdDte02;
	}

	public Double getRhdDec01() {
		return this.rhdDec01;
	}

	public void setRhdDec01(Double rhdDec01) {
		this.rhdDec01 = rhdDec01;
	}

	public Double getRhdDec02() {
		return this.rhdDec02;
	}

	public void setRhdDec02(Double rhdDec02) {
		this.rhdDec02 = rhdDec02;
	}

	public Boolean getRhdLog01() {
		return this.rhdLog01;
	}

	public void setRhdLog01(Boolean rhdLog01) {
		this.rhdLog01 = rhdLog01;
	}

	public String getRhdFaultCd() {
		return this.rhdFaultCd;
	}

	public void setRhdFaultCd(String rhdFaultCd) {
		this.rhdFaultCd = rhdFaultCd;
	}

	public String getRhdType() {
		return this.rhdType;
	}

	public void setRhdType(String rhdType) {
		this.rhdType = rhdType;
	}

	public Integer getRhdLink() {
		return this.rhdLink;
	}

	public void setRhdLink(Integer rhdLink) {
		this.rhdLink = rhdLink;
	}

	public Boolean getRhdRmaRtrn() {
		return this.rhdRmaRtrn;
	}

	public void setRhdRmaRtrn(Boolean rhdRmaRtrn) {
		this.rhdRmaRtrn = rhdRmaRtrn;
	}

	public Double getRhdCvrPct() {
		return this.rhdCvrPct;
	}

	public void setRhdCvrPct(Double rhdCvrPct) {
		this.rhdCvrPct = rhdCvrPct;
	}

	public Integer getRhdRef() {
		return this.rhdRef;
	}

	public void setRhdRef(Integer rhdRef) {
		this.rhdRef = rhdRef;
	}

	public Date getRhdExpDate() {
		return this.rhdExpDate;
	}

	public void setRhdExpDate(Date rhdExpDate) {
		this.rhdExpDate = rhdExpDate;
	}

	public Date getRhdCplDate() {
		return this.rhdCplDate;
	}

	public void setRhdCplDate(Date rhdCplDate) {
		this.rhdCplDate = rhdCplDate;
	}

	public String getRhdRmaNbr() {
		return this.rhdRmaNbr;
	}

	public void setRhdRmaNbr(String rhdRmaNbr) {
		this.rhdRmaNbr = rhdRmaNbr;
	}

	public Integer getRhdRmaLine() {
		return this.rhdRmaLine;
	}

	public void setRhdRmaLine(Integer rhdRmaLine) {
		this.rhdRmaLine = rhdRmaLine;
	}

	public String getRhdSite() {
		return this.rhdSite;
	}

	public void setRhdSite(String rhdSite) {
		this.rhdSite = rhdSite;
	}

	public String getRhdLoc() {
		return this.rhdLoc;
	}

	public void setRhdLoc(String rhdLoc) {
		this.rhdLoc = rhdLoc;
	}

	public String getRhdPrefix() {
		return this.rhdPrefix;
	}

	public void setRhdPrefix(String rhdPrefix) {
		this.rhdPrefix = rhdPrefix;
	}

	public String getRhdRev() {
		return this.rhdRev;
	}

	public void setRhdRev(String rhdRev) {
		this.rhdRev = rhdRev;
	}

	public String getRhdCust() {
		return this.rhdCust;
	}

	public void setRhdCust(String rhdCust) {
		this.rhdCust = rhdCust;
	}

	public String getRhdShip() {
		return this.rhdShip;
	}

	public void setRhdShip(String rhdShip) {
		this.rhdShip = rhdShip;
	}

	public String getRhdHistype() {
		return this.rhdHistype;
	}

	public void setRhdHistype(String rhdHistype) {
		this.rhdHistype = rhdHistype;
	}

	public String getRhdChgType() {
		return this.rhdChgType;
	}

	public void setRhdChgType(String rhdChgType) {
		this.rhdChgType = rhdChgType;
	}

	public String getRhdSaNbr() {
		return this.rhdSaNbr;
	}

	public void setRhdSaNbr(String rhdSaNbr) {
		this.rhdSaNbr = rhdSaNbr;
	}

	public Double getRhdCovered() {
		return this.rhdCovered;
	}

	public void setRhdCovered(Double rhdCovered) {
		this.rhdCovered = rhdCovered;
	}

	public String getRhdSvCode() {
		return this.rhdSvCode;
	}

	public void setRhdSvCode(String rhdSvCode) {
		this.rhdSvCode = rhdSvCode;
	}

	public String getRhdEnduser() {
		return this.rhdEnduser;
	}

	public void setRhdEnduser(String rhdEnduser) {
		this.rhdEnduser = rhdEnduser;
	}

	public Date getRhdParDate() {
		return this.rhdParDate;
	}

	public void setRhdParDate(Date rhdParDate) {
		this.rhdParDate = rhdParDate;
	}

	public Date getRhdInsDate() {
		return this.rhdInsDate;
	}

	public void setRhdInsDate(Date rhdInsDate) {
		this.rhdInsDate = rhdInsDate;
	}

	public String getRhdParPart() {
		return this.rhdParPart;
	}

	public void setRhdParPart(String rhdParPart) {
		this.rhdParPart = rhdParPart;
	}

	public String getRhdParSer() {
		return this.rhdParSer;
	}

	public void setRhdParSer(String rhdParSer) {
		this.rhdParSer = rhdParSer;
	}

	public String getRhdProcess() {
		return this.rhdProcess;
	}

	public void setRhdProcess(String rhdProcess) {
		this.rhdProcess = rhdProcess;
	}

	public String getRhdEngArea() {
		return this.rhdEngArea;
	}

	public void setRhdEngArea(String rhdEngArea) {
		this.rhdEngArea = rhdEngArea;
	}

	public String getRhdEngCode() {
		return this.rhdEngCode;
	}

	public void setRhdEngCode(String rhdEngCode) {
		this.rhdEngCode = rhdEngCode;
	}

	public String getRhdEuArea() {
		return this.rhdEuArea;
	}

	public void setRhdEuArea(String rhdEuArea) {
		this.rhdEuArea = rhdEuArea;
	}

	public String getRhdDesc() {
		return this.rhdDesc;
	}

	public void setRhdDesc(String rhdDesc) {
		this.rhdDesc = rhdDesc;
	}

	public Integer getRhdCmtindx() {
		return this.rhdCmtindx;
	}

	public void setRhdCmtindx(Integer rhdCmtindx) {
		this.rhdCmtindx = rhdCmtindx;
	}

	public Double getRhdRestock() {
		return this.rhdRestock;
	}

	public void setRhdRestock(Double rhdRestock) {
		this.rhdRestock = rhdRestock;
	}

	public Boolean getRhdLoaner() {
		return this.rhdLoaner;
	}

	public void setRhdLoaner(Boolean rhdLoaner) {
		this.rhdLoaner = rhdLoaner;
	}

	public String getRhdSerLon() {
		return this.rhdSerLon;
	}

	public void setRhdSerLon(String rhdSerLon) {
		this.rhdSerLon = rhdSerLon;
	}

	public Boolean getRhdDone() {
		return this.rhdDone;
	}

	public void setRhdDone(Boolean rhdDone) {
		this.rhdDone = rhdDone;
	}

	public Boolean getRhdIss() {
		return this.rhdIss;
	}

	public void setRhdIss(Boolean rhdIss) {
		this.rhdIss = rhdIss;
	}

	public Boolean getRhdEditIsb() {
		return this.rhdEditIsb;
	}

	public void setRhdEditIsb(Boolean rhdEditIsb) {
		this.rhdEditIsb = rhdEditIsb;
	}

	public String getRhdUm() {
		return this.rhdUm;
	}

	public void setRhdUm(String rhdUm) {
		this.rhdUm = rhdUm;
	}

	public Double getRhdUmConv() {
		return this.rhdUmConv;
	}

	public void setRhdUmConv(Double rhdUmConv) {
		this.rhdUmConv = rhdUmConv;
	}

	public Double getRhdCustoms() {
		return this.rhdCustoms;
	}

	public void setRhdCustoms(Double rhdCustoms) {
		this.rhdCustoms = rhdCustoms;
	}

	public Double getRhdQtyRel() {
		return this.rhdQtyRel;
	}

	public void setRhdQtyRel(Double rhdQtyRel) {
		this.rhdQtyRel = rhdQtyRel;
	}

	public String getRhdEnd() {
		return this.rhdEnd;
	}

	public void setRhdEnd(String rhdEnd) {
		this.rhdEnd = rhdEnd;
	}

	public Double getRhdQtyNon() {
		return this.rhdQtyNon;
	}

	public void setRhdQtyNon(Double rhdQtyNon) {
		this.rhdQtyNon = rhdQtyNon;
	}

	public String getRhdStart() {
		return this.rhdStart;
	}

	public void setRhdStart(String rhdStart) {
		this.rhdStart = rhdStart;
	}

	public String getRhdOpTran() {
		return this.rhdOpTran;
	}

	public void setRhdOpTran(String rhdOpTran) {
		this.rhdOpTran = rhdOpTran;
	}

	public String getRhdQadc01() {
		return this.rhdQadc01;
	}

	public void setRhdQadc01(String rhdQadc01) {
		this.rhdQadc01 = rhdQadc01;
	}

	public String getRhdQadc02() {
		return this.rhdQadc02;
	}

	public void setRhdQadc02(String rhdQadc02) {
		this.rhdQadc02 = rhdQadc02;
	}

	public String getRhdQadc03() {
		return this.rhdQadc03;
	}

	public void setRhdQadc03(String rhdQadc03) {
		this.rhdQadc03 = rhdQadc03;
	}

	public Date getRhdQadd01() {
		return this.rhdQadd01;
	}

	public void setRhdQadd01(Date rhdQadd01) {
		this.rhdQadd01 = rhdQadd01;
	}

	public Date getRhdQadd02() {
		return this.rhdQadd02;
	}

	public void setRhdQadd02(Date rhdQadd02) {
		this.rhdQadd02 = rhdQadd02;
	}

	public Date getRhdQadd03() {
		return this.rhdQadd03;
	}

	public void setRhdQadd03(Date rhdQadd03) {
		this.rhdQadd03 = rhdQadd03;
	}

	public Double getRhdQadde01() {
		return this.rhdQadde01;
	}

	public void setRhdQadde01(Double rhdQadde01) {
		this.rhdQadde01 = rhdQadde01;
	}

	public Double getRhdQadde02() {
		return this.rhdQadde02;
	}

	public void setRhdQadde02(Double rhdQadde02) {
		this.rhdQadde02 = rhdQadde02;
	}

	public Integer getRhdQadi01() {
		return this.rhdQadi01;
	}

	public void setRhdQadi01(Integer rhdQadi01) {
		this.rhdQadi01 = rhdQadi01;
	}

	public Integer getRhdQadi02() {
		return this.rhdQadi02;
	}

	public void setRhdQadi02(Integer rhdQadi02) {
		this.rhdQadi02 = rhdQadi02;
	}

	public Boolean getRhdQadl01() {
		return this.rhdQadl01;
	}

	public void setRhdQadl01(Boolean rhdQadl01) {
		this.rhdQadl01 = rhdQadl01;
	}

	public Boolean getRhdQadl02() {
		return this.rhdQadl02;
	}

	public void setRhdQadl02(Boolean rhdQadl02) {
		this.rhdQadl02 = rhdQadl02;
	}

	public Boolean getRhdQadl03() {
		return this.rhdQadl03;
	}

	public void setRhdQadl03(Boolean rhdQadl03) {
		this.rhdQadl03 = rhdQadl03;
	}

	public Integer getRhdQadi03() {
		return this.rhdQadi03;
	}

	public void setRhdQadi03(Integer rhdQadi03) {
		this.rhdQadi03 = rhdQadi03;
	}

	public Double getRhdQadde03() {
		return this.rhdQadde03;
	}

	public void setRhdQadde03(Double rhdQadde03) {
		this.rhdQadde03 = rhdQadde03;
	}

	public Date getRhdQadd04() {
		return this.rhdQadd04;
	}

	public void setRhdQadd04(Date rhdQadd04) {
		this.rhdQadd04 = rhdQadd04;
	}

	public Date getRhdQadd05() {
		return this.rhdQadd05;
	}

	public void setRhdQadd05(Date rhdQadd05) {
		this.rhdQadd05 = rhdQadd05;
	}

	public String getRhdModUserid() {
		return this.rhdModUserid;
	}

	public void setRhdModUserid(String rhdModUserid) {
		this.rhdModUserid = rhdModUserid;
	}

	public Date getRhdModDate() {
		return this.rhdModDate;
	}

	public void setRhdModDate(Date rhdModDate) {
		this.rhdModDate = rhdModDate;
	}

	public Double getOidRhdHist() {
		return this.oidRhdHist;
	}

	public void setOidRhdHist(Double oidRhdHist) {
		this.oidRhdHist = oidRhdHist;
	}

}