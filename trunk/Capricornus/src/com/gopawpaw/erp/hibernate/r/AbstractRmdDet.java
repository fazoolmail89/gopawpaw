package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRmdDet entity provides the base persistence definition of the RmdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRmdDet implements java.io.Serializable {

	// Fields

	private RmdDetId id;
	private Boolean rmdEditIsb;
	private String rmdPart;
	private Double rmdQtyOrd;
	private Double rmdQtyAcp;
	private String rmdQadc04;
	private Double rmdPrice;
	private String rmdSer;
	private String rmdDesc;
	private String rmdComment;
	private Integer rmdCmtindx;
	private String rmdStatus;
	private String rmdUser1;
	private String rmdUser2;
	private String rmdProdline;
	private String rmdChr01;
	private String rmdChr02;
	private String rmdChr03;
	private String rmdChr04;
	private String rmdChr05;
	private String rmdChr06;
	private String rmdChr07;
	private String rmdChr08;
	private String rmdChr09;
	private String rmdChr10;
	private Date rmdDte01;
	private Date rmdDte02;
	private Double rmdDec01;
	private Double rmdDec02;
	private Boolean rmdLog01;
	private String rmdRoute;
	private String rmdFaultCd;
	private String rmdType;
	private Integer rmdLink;
	private Boolean rmdRmaRtrn;
	private Double rmdCvrPct;
	private Integer rmdRef;
	private Date rmdExpDate;
	private Date rmdCplDate;
	private Boolean rmdIss;
	private String rmdRmaNbr;
	private Integer rmdRmaLine;
	private String rmdSite;
	private String rmdLoc;
	private Double rmdRestock;
	private Boolean rmdLoaner;
	private String rmdSerLon;
	private Boolean rmdDone;
	private String rmdRev;
	private String rmdChgType;
	private String rmdEngCode;
	private String rmdSvCode;
	private String rmdUm;
	private Double rmdUmConv;
	private Double rmdCustoms;
	private Double rmdQtyRel;
	private String rmdSaNbr;
	private Double rmdCovered;
	private String rmdEnd;
	private Date rmdInsDate;
	private Date rmdParDate;
	private String rmdParPart;
	private String rmdParSer;
	private String rmdProcess;
	private Double rmdQtyNon;
	private String rmdStart;
	private String rmdOpTran;
	private String rmdQadc01;
	private String rmdQadc02;
	private String rmdQadc03;
	private Date rmdQadt01;
	private Date rmdQadt02;
	private Date rmdQadt03;
	private Double rmdQadd01;
	private Double rmdQadd02;
	private Integer rmdQadi01;
	private Integer rmdQadi02;
	private Boolean rmdQadl01;
	private Boolean rmdQadl02;
	private Boolean rmdQadl03;
	private Integer rmdQadi03;
	private Double rmdQadd03;
	private Date rmdQadt04;
	private Date rmdQadt05;
	private String rmdModUserid;
	private Date rmdModDate;
	private Double oidRmdDet;

	// Constructors

	/** default constructor */
	public AbstractRmdDet() {
	}

	/** minimal constructor */
	public AbstractRmdDet(RmdDetId id, String rmdProcess, String rmdStart,
			Double oidRmdDet) {
		this.id = id;
		this.rmdProcess = rmdProcess;
		this.rmdStart = rmdStart;
		this.oidRmdDet = oidRmdDet;
	}

	/** full constructor */
	public AbstractRmdDet(RmdDetId id, Boolean rmdEditIsb, String rmdPart,
			Double rmdQtyOrd, Double rmdQtyAcp, String rmdQadc04,
			Double rmdPrice, String rmdSer, String rmdDesc, String rmdComment,
			Integer rmdCmtindx, String rmdStatus, String rmdUser1,
			String rmdUser2, String rmdProdline, String rmdChr01,
			String rmdChr02, String rmdChr03, String rmdChr04, String rmdChr05,
			String rmdChr06, String rmdChr07, String rmdChr08, String rmdChr09,
			String rmdChr10, Date rmdDte01, Date rmdDte02, Double rmdDec01,
			Double rmdDec02, Boolean rmdLog01, String rmdRoute,
			String rmdFaultCd, String rmdType, Integer rmdLink,
			Boolean rmdRmaRtrn, Double rmdCvrPct, Integer rmdRef,
			Date rmdExpDate, Date rmdCplDate, Boolean rmdIss, String rmdRmaNbr,
			Integer rmdRmaLine, String rmdSite, String rmdLoc,
			Double rmdRestock, Boolean rmdLoaner, String rmdSerLon,
			Boolean rmdDone, String rmdRev, String rmdChgType,
			String rmdEngCode, String rmdSvCode, String rmdUm,
			Double rmdUmConv, Double rmdCustoms, Double rmdQtyRel,
			String rmdSaNbr, Double rmdCovered, String rmdEnd, Date rmdInsDate,
			Date rmdParDate, String rmdParPart, String rmdParSer,
			String rmdProcess, Double rmdQtyNon, String rmdStart,
			String rmdOpTran, String rmdQadc01, String rmdQadc02,
			String rmdQadc03, Date rmdQadt01, Date rmdQadt02, Date rmdQadt03,
			Double rmdQadd01, Double rmdQadd02, Integer rmdQadi01,
			Integer rmdQadi02, Boolean rmdQadl01, Boolean rmdQadl02,
			Boolean rmdQadl03, Integer rmdQadi03, Double rmdQadd03,
			Date rmdQadt04, Date rmdQadt05, String rmdModUserid,
			Date rmdModDate, Double oidRmdDet) {
		this.id = id;
		this.rmdEditIsb = rmdEditIsb;
		this.rmdPart = rmdPart;
		this.rmdQtyOrd = rmdQtyOrd;
		this.rmdQtyAcp = rmdQtyAcp;
		this.rmdQadc04 = rmdQadc04;
		this.rmdPrice = rmdPrice;
		this.rmdSer = rmdSer;
		this.rmdDesc = rmdDesc;
		this.rmdComment = rmdComment;
		this.rmdCmtindx = rmdCmtindx;
		this.rmdStatus = rmdStatus;
		this.rmdUser1 = rmdUser1;
		this.rmdUser2 = rmdUser2;
		this.rmdProdline = rmdProdline;
		this.rmdChr01 = rmdChr01;
		this.rmdChr02 = rmdChr02;
		this.rmdChr03 = rmdChr03;
		this.rmdChr04 = rmdChr04;
		this.rmdChr05 = rmdChr05;
		this.rmdChr06 = rmdChr06;
		this.rmdChr07 = rmdChr07;
		this.rmdChr08 = rmdChr08;
		this.rmdChr09 = rmdChr09;
		this.rmdChr10 = rmdChr10;
		this.rmdDte01 = rmdDte01;
		this.rmdDte02 = rmdDte02;
		this.rmdDec01 = rmdDec01;
		this.rmdDec02 = rmdDec02;
		this.rmdLog01 = rmdLog01;
		this.rmdRoute = rmdRoute;
		this.rmdFaultCd = rmdFaultCd;
		this.rmdType = rmdType;
		this.rmdLink = rmdLink;
		this.rmdRmaRtrn = rmdRmaRtrn;
		this.rmdCvrPct = rmdCvrPct;
		this.rmdRef = rmdRef;
		this.rmdExpDate = rmdExpDate;
		this.rmdCplDate = rmdCplDate;
		this.rmdIss = rmdIss;
		this.rmdRmaNbr = rmdRmaNbr;
		this.rmdRmaLine = rmdRmaLine;
		this.rmdSite = rmdSite;
		this.rmdLoc = rmdLoc;
		this.rmdRestock = rmdRestock;
		this.rmdLoaner = rmdLoaner;
		this.rmdSerLon = rmdSerLon;
		this.rmdDone = rmdDone;
		this.rmdRev = rmdRev;
		this.rmdChgType = rmdChgType;
		this.rmdEngCode = rmdEngCode;
		this.rmdSvCode = rmdSvCode;
		this.rmdUm = rmdUm;
		this.rmdUmConv = rmdUmConv;
		this.rmdCustoms = rmdCustoms;
		this.rmdQtyRel = rmdQtyRel;
		this.rmdSaNbr = rmdSaNbr;
		this.rmdCovered = rmdCovered;
		this.rmdEnd = rmdEnd;
		this.rmdInsDate = rmdInsDate;
		this.rmdParDate = rmdParDate;
		this.rmdParPart = rmdParPart;
		this.rmdParSer = rmdParSer;
		this.rmdProcess = rmdProcess;
		this.rmdQtyNon = rmdQtyNon;
		this.rmdStart = rmdStart;
		this.rmdOpTran = rmdOpTran;
		this.rmdQadc01 = rmdQadc01;
		this.rmdQadc02 = rmdQadc02;
		this.rmdQadc03 = rmdQadc03;
		this.rmdQadt01 = rmdQadt01;
		this.rmdQadt02 = rmdQadt02;
		this.rmdQadt03 = rmdQadt03;
		this.rmdQadd01 = rmdQadd01;
		this.rmdQadd02 = rmdQadd02;
		this.rmdQadi01 = rmdQadi01;
		this.rmdQadi02 = rmdQadi02;
		this.rmdQadl01 = rmdQadl01;
		this.rmdQadl02 = rmdQadl02;
		this.rmdQadl03 = rmdQadl03;
		this.rmdQadi03 = rmdQadi03;
		this.rmdQadd03 = rmdQadd03;
		this.rmdQadt04 = rmdQadt04;
		this.rmdQadt05 = rmdQadt05;
		this.rmdModUserid = rmdModUserid;
		this.rmdModDate = rmdModDate;
		this.oidRmdDet = oidRmdDet;
	}

	// Property accessors

	public RmdDetId getId() {
		return this.id;
	}

	public void setId(RmdDetId id) {
		this.id = id;
	}

	public Boolean getRmdEditIsb() {
		return this.rmdEditIsb;
	}

	public void setRmdEditIsb(Boolean rmdEditIsb) {
		this.rmdEditIsb = rmdEditIsb;
	}

	public String getRmdPart() {
		return this.rmdPart;
	}

	public void setRmdPart(String rmdPart) {
		this.rmdPart = rmdPart;
	}

	public Double getRmdQtyOrd() {
		return this.rmdQtyOrd;
	}

	public void setRmdQtyOrd(Double rmdQtyOrd) {
		this.rmdQtyOrd = rmdQtyOrd;
	}

	public Double getRmdQtyAcp() {
		return this.rmdQtyAcp;
	}

	public void setRmdQtyAcp(Double rmdQtyAcp) {
		this.rmdQtyAcp = rmdQtyAcp;
	}

	public String getRmdQadc04() {
		return this.rmdQadc04;
	}

	public void setRmdQadc04(String rmdQadc04) {
		this.rmdQadc04 = rmdQadc04;
	}

	public Double getRmdPrice() {
		return this.rmdPrice;
	}

	public void setRmdPrice(Double rmdPrice) {
		this.rmdPrice = rmdPrice;
	}

	public String getRmdSer() {
		return this.rmdSer;
	}

	public void setRmdSer(String rmdSer) {
		this.rmdSer = rmdSer;
	}

	public String getRmdDesc() {
		return this.rmdDesc;
	}

	public void setRmdDesc(String rmdDesc) {
		this.rmdDesc = rmdDesc;
	}

	public String getRmdComment() {
		return this.rmdComment;
	}

	public void setRmdComment(String rmdComment) {
		this.rmdComment = rmdComment;
	}

	public Integer getRmdCmtindx() {
		return this.rmdCmtindx;
	}

	public void setRmdCmtindx(Integer rmdCmtindx) {
		this.rmdCmtindx = rmdCmtindx;
	}

	public String getRmdStatus() {
		return this.rmdStatus;
	}

	public void setRmdStatus(String rmdStatus) {
		this.rmdStatus = rmdStatus;
	}

	public String getRmdUser1() {
		return this.rmdUser1;
	}

	public void setRmdUser1(String rmdUser1) {
		this.rmdUser1 = rmdUser1;
	}

	public String getRmdUser2() {
		return this.rmdUser2;
	}

	public void setRmdUser2(String rmdUser2) {
		this.rmdUser2 = rmdUser2;
	}

	public String getRmdProdline() {
		return this.rmdProdline;
	}

	public void setRmdProdline(String rmdProdline) {
		this.rmdProdline = rmdProdline;
	}

	public String getRmdChr01() {
		return this.rmdChr01;
	}

	public void setRmdChr01(String rmdChr01) {
		this.rmdChr01 = rmdChr01;
	}

	public String getRmdChr02() {
		return this.rmdChr02;
	}

	public void setRmdChr02(String rmdChr02) {
		this.rmdChr02 = rmdChr02;
	}

	public String getRmdChr03() {
		return this.rmdChr03;
	}

	public void setRmdChr03(String rmdChr03) {
		this.rmdChr03 = rmdChr03;
	}

	public String getRmdChr04() {
		return this.rmdChr04;
	}

	public void setRmdChr04(String rmdChr04) {
		this.rmdChr04 = rmdChr04;
	}

	public String getRmdChr05() {
		return this.rmdChr05;
	}

	public void setRmdChr05(String rmdChr05) {
		this.rmdChr05 = rmdChr05;
	}

	public String getRmdChr06() {
		return this.rmdChr06;
	}

	public void setRmdChr06(String rmdChr06) {
		this.rmdChr06 = rmdChr06;
	}

	public String getRmdChr07() {
		return this.rmdChr07;
	}

	public void setRmdChr07(String rmdChr07) {
		this.rmdChr07 = rmdChr07;
	}

	public String getRmdChr08() {
		return this.rmdChr08;
	}

	public void setRmdChr08(String rmdChr08) {
		this.rmdChr08 = rmdChr08;
	}

	public String getRmdChr09() {
		return this.rmdChr09;
	}

	public void setRmdChr09(String rmdChr09) {
		this.rmdChr09 = rmdChr09;
	}

	public String getRmdChr10() {
		return this.rmdChr10;
	}

	public void setRmdChr10(String rmdChr10) {
		this.rmdChr10 = rmdChr10;
	}

	public Date getRmdDte01() {
		return this.rmdDte01;
	}

	public void setRmdDte01(Date rmdDte01) {
		this.rmdDte01 = rmdDte01;
	}

	public Date getRmdDte02() {
		return this.rmdDte02;
	}

	public void setRmdDte02(Date rmdDte02) {
		this.rmdDte02 = rmdDte02;
	}

	public Double getRmdDec01() {
		return this.rmdDec01;
	}

	public void setRmdDec01(Double rmdDec01) {
		this.rmdDec01 = rmdDec01;
	}

	public Double getRmdDec02() {
		return this.rmdDec02;
	}

	public void setRmdDec02(Double rmdDec02) {
		this.rmdDec02 = rmdDec02;
	}

	public Boolean getRmdLog01() {
		return this.rmdLog01;
	}

	public void setRmdLog01(Boolean rmdLog01) {
		this.rmdLog01 = rmdLog01;
	}

	public String getRmdRoute() {
		return this.rmdRoute;
	}

	public void setRmdRoute(String rmdRoute) {
		this.rmdRoute = rmdRoute;
	}

	public String getRmdFaultCd() {
		return this.rmdFaultCd;
	}

	public void setRmdFaultCd(String rmdFaultCd) {
		this.rmdFaultCd = rmdFaultCd;
	}

	public String getRmdType() {
		return this.rmdType;
	}

	public void setRmdType(String rmdType) {
		this.rmdType = rmdType;
	}

	public Integer getRmdLink() {
		return this.rmdLink;
	}

	public void setRmdLink(Integer rmdLink) {
		this.rmdLink = rmdLink;
	}

	public Boolean getRmdRmaRtrn() {
		return this.rmdRmaRtrn;
	}

	public void setRmdRmaRtrn(Boolean rmdRmaRtrn) {
		this.rmdRmaRtrn = rmdRmaRtrn;
	}

	public Double getRmdCvrPct() {
		return this.rmdCvrPct;
	}

	public void setRmdCvrPct(Double rmdCvrPct) {
		this.rmdCvrPct = rmdCvrPct;
	}

	public Integer getRmdRef() {
		return this.rmdRef;
	}

	public void setRmdRef(Integer rmdRef) {
		this.rmdRef = rmdRef;
	}

	public Date getRmdExpDate() {
		return this.rmdExpDate;
	}

	public void setRmdExpDate(Date rmdExpDate) {
		this.rmdExpDate = rmdExpDate;
	}

	public Date getRmdCplDate() {
		return this.rmdCplDate;
	}

	public void setRmdCplDate(Date rmdCplDate) {
		this.rmdCplDate = rmdCplDate;
	}

	public Boolean getRmdIss() {
		return this.rmdIss;
	}

	public void setRmdIss(Boolean rmdIss) {
		this.rmdIss = rmdIss;
	}

	public String getRmdRmaNbr() {
		return this.rmdRmaNbr;
	}

	public void setRmdRmaNbr(String rmdRmaNbr) {
		this.rmdRmaNbr = rmdRmaNbr;
	}

	public Integer getRmdRmaLine() {
		return this.rmdRmaLine;
	}

	public void setRmdRmaLine(Integer rmdRmaLine) {
		this.rmdRmaLine = rmdRmaLine;
	}

	public String getRmdSite() {
		return this.rmdSite;
	}

	public void setRmdSite(String rmdSite) {
		this.rmdSite = rmdSite;
	}

	public String getRmdLoc() {
		return this.rmdLoc;
	}

	public void setRmdLoc(String rmdLoc) {
		this.rmdLoc = rmdLoc;
	}

	public Double getRmdRestock() {
		return this.rmdRestock;
	}

	public void setRmdRestock(Double rmdRestock) {
		this.rmdRestock = rmdRestock;
	}

	public Boolean getRmdLoaner() {
		return this.rmdLoaner;
	}

	public void setRmdLoaner(Boolean rmdLoaner) {
		this.rmdLoaner = rmdLoaner;
	}

	public String getRmdSerLon() {
		return this.rmdSerLon;
	}

	public void setRmdSerLon(String rmdSerLon) {
		this.rmdSerLon = rmdSerLon;
	}

	public Boolean getRmdDone() {
		return this.rmdDone;
	}

	public void setRmdDone(Boolean rmdDone) {
		this.rmdDone = rmdDone;
	}

	public String getRmdRev() {
		return this.rmdRev;
	}

	public void setRmdRev(String rmdRev) {
		this.rmdRev = rmdRev;
	}

	public String getRmdChgType() {
		return this.rmdChgType;
	}

	public void setRmdChgType(String rmdChgType) {
		this.rmdChgType = rmdChgType;
	}

	public String getRmdEngCode() {
		return this.rmdEngCode;
	}

	public void setRmdEngCode(String rmdEngCode) {
		this.rmdEngCode = rmdEngCode;
	}

	public String getRmdSvCode() {
		return this.rmdSvCode;
	}

	public void setRmdSvCode(String rmdSvCode) {
		this.rmdSvCode = rmdSvCode;
	}

	public String getRmdUm() {
		return this.rmdUm;
	}

	public void setRmdUm(String rmdUm) {
		this.rmdUm = rmdUm;
	}

	public Double getRmdUmConv() {
		return this.rmdUmConv;
	}

	public void setRmdUmConv(Double rmdUmConv) {
		this.rmdUmConv = rmdUmConv;
	}

	public Double getRmdCustoms() {
		return this.rmdCustoms;
	}

	public void setRmdCustoms(Double rmdCustoms) {
		this.rmdCustoms = rmdCustoms;
	}

	public Double getRmdQtyRel() {
		return this.rmdQtyRel;
	}

	public void setRmdQtyRel(Double rmdQtyRel) {
		this.rmdQtyRel = rmdQtyRel;
	}

	public String getRmdSaNbr() {
		return this.rmdSaNbr;
	}

	public void setRmdSaNbr(String rmdSaNbr) {
		this.rmdSaNbr = rmdSaNbr;
	}

	public Double getRmdCovered() {
		return this.rmdCovered;
	}

	public void setRmdCovered(Double rmdCovered) {
		this.rmdCovered = rmdCovered;
	}

	public String getRmdEnd() {
		return this.rmdEnd;
	}

	public void setRmdEnd(String rmdEnd) {
		this.rmdEnd = rmdEnd;
	}

	public Date getRmdInsDate() {
		return this.rmdInsDate;
	}

	public void setRmdInsDate(Date rmdInsDate) {
		this.rmdInsDate = rmdInsDate;
	}

	public Date getRmdParDate() {
		return this.rmdParDate;
	}

	public void setRmdParDate(Date rmdParDate) {
		this.rmdParDate = rmdParDate;
	}

	public String getRmdParPart() {
		return this.rmdParPart;
	}

	public void setRmdParPart(String rmdParPart) {
		this.rmdParPart = rmdParPart;
	}

	public String getRmdParSer() {
		return this.rmdParSer;
	}

	public void setRmdParSer(String rmdParSer) {
		this.rmdParSer = rmdParSer;
	}

	public String getRmdProcess() {
		return this.rmdProcess;
	}

	public void setRmdProcess(String rmdProcess) {
		this.rmdProcess = rmdProcess;
	}

	public Double getRmdQtyNon() {
		return this.rmdQtyNon;
	}

	public void setRmdQtyNon(Double rmdQtyNon) {
		this.rmdQtyNon = rmdQtyNon;
	}

	public String getRmdStart() {
		return this.rmdStart;
	}

	public void setRmdStart(String rmdStart) {
		this.rmdStart = rmdStart;
	}

	public String getRmdOpTran() {
		return this.rmdOpTran;
	}

	public void setRmdOpTran(String rmdOpTran) {
		this.rmdOpTran = rmdOpTran;
	}

	public String getRmdQadc01() {
		return this.rmdQadc01;
	}

	public void setRmdQadc01(String rmdQadc01) {
		this.rmdQadc01 = rmdQadc01;
	}

	public String getRmdQadc02() {
		return this.rmdQadc02;
	}

	public void setRmdQadc02(String rmdQadc02) {
		this.rmdQadc02 = rmdQadc02;
	}

	public String getRmdQadc03() {
		return this.rmdQadc03;
	}

	public void setRmdQadc03(String rmdQadc03) {
		this.rmdQadc03 = rmdQadc03;
	}

	public Date getRmdQadt01() {
		return this.rmdQadt01;
	}

	public void setRmdQadt01(Date rmdQadt01) {
		this.rmdQadt01 = rmdQadt01;
	}

	public Date getRmdQadt02() {
		return this.rmdQadt02;
	}

	public void setRmdQadt02(Date rmdQadt02) {
		this.rmdQadt02 = rmdQadt02;
	}

	public Date getRmdQadt03() {
		return this.rmdQadt03;
	}

	public void setRmdQadt03(Date rmdQadt03) {
		this.rmdQadt03 = rmdQadt03;
	}

	public Double getRmdQadd01() {
		return this.rmdQadd01;
	}

	public void setRmdQadd01(Double rmdQadd01) {
		this.rmdQadd01 = rmdQadd01;
	}

	public Double getRmdQadd02() {
		return this.rmdQadd02;
	}

	public void setRmdQadd02(Double rmdQadd02) {
		this.rmdQadd02 = rmdQadd02;
	}

	public Integer getRmdQadi01() {
		return this.rmdQadi01;
	}

	public void setRmdQadi01(Integer rmdQadi01) {
		this.rmdQadi01 = rmdQadi01;
	}

	public Integer getRmdQadi02() {
		return this.rmdQadi02;
	}

	public void setRmdQadi02(Integer rmdQadi02) {
		this.rmdQadi02 = rmdQadi02;
	}

	public Boolean getRmdQadl01() {
		return this.rmdQadl01;
	}

	public void setRmdQadl01(Boolean rmdQadl01) {
		this.rmdQadl01 = rmdQadl01;
	}

	public Boolean getRmdQadl02() {
		return this.rmdQadl02;
	}

	public void setRmdQadl02(Boolean rmdQadl02) {
		this.rmdQadl02 = rmdQadl02;
	}

	public Boolean getRmdQadl03() {
		return this.rmdQadl03;
	}

	public void setRmdQadl03(Boolean rmdQadl03) {
		this.rmdQadl03 = rmdQadl03;
	}

	public Integer getRmdQadi03() {
		return this.rmdQadi03;
	}

	public void setRmdQadi03(Integer rmdQadi03) {
		this.rmdQadi03 = rmdQadi03;
	}

	public Double getRmdQadd03() {
		return this.rmdQadd03;
	}

	public void setRmdQadd03(Double rmdQadd03) {
		this.rmdQadd03 = rmdQadd03;
	}

	public Date getRmdQadt04() {
		return this.rmdQadt04;
	}

	public void setRmdQadt04(Date rmdQadt04) {
		this.rmdQadt04 = rmdQadt04;
	}

	public Date getRmdQadt05() {
		return this.rmdQadt05;
	}

	public void setRmdQadt05(Date rmdQadt05) {
		this.rmdQadt05 = rmdQadt05;
	}

	public String getRmdModUserid() {
		return this.rmdModUserid;
	}

	public void setRmdModUserid(String rmdModUserid) {
		this.rmdModUserid = rmdModUserid;
	}

	public Date getRmdModDate() {
		return this.rmdModDate;
	}

	public void setRmdModDate(Date rmdModDate) {
		this.rmdModDate = rmdModDate;
	}

	public Double getOidRmdDet() {
		return this.oidRmdDet;
	}

	public void setOidRmdDet(Double oidRmdDet) {
		this.oidRmdDet = oidRmdDet;
	}

}