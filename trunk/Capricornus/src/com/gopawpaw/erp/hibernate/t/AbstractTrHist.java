package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTrHist entity provides the base persistence definition of the TrHist
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrHist implements java.io.Serializable {

	// Fields

	private TrHistId id;
	private String trPart;
	private Date trDate;
	private Date trPerDate;
	private String trType;
	private String trLoc;
	private Double trLocBegin;
	private Double trBeginQoh;
	private Double trQtyReq;
	private Double trQtyChg;
	private Double trQtyShort;
	private String trUm;
	private Date trLastDate;
	private String trNbr;
	private String trSoJob;
	private String trShipType;
	private String trAddr;
	private String trRmks;
	private String trXdrAcct;
	private String trXcrAcct;
	private Double trMtlStd;
	private Double trLbrStd;
	private Double trBdnStd;
	private Double trPrice;
	private Double trGlAmt;
	private String trXdrCc;
	private String trXcrCc;
	private String trLot;
	private Double trSubStd;
	private Date trGlDate;
	private Double trQtyLoc;
	private String trUserid;
	private String trSerial;
	private Date trEffdate;
	private String trProdLine;
	private String trXslspsn1;
	private String trXslspsn2;
	private String trXcrProj;
	private String trXdrProj;
	private Integer trLine;
	private String trUser1;
	private String trUser2;
	private String trCurr;
	private Double trExRate;
	private String trRev;
	private Integer trTime;
	private Double trOvhStd;
	private String trSite;
	private String trStatus;
	private String trGrade;
	private Date trExpire;
	private Double trAssay;
	private String trXglRef;
	private String trChr01;
	private String trChr02;
	private String trChr03;
	private String trChr04;
	private String trChr05;
	private String trChr06;
	private String trChr07;
	private String trChr08;
	private String trChr09;
	private String trChr10;
	private String trChr11;
	private String trChr12;
	private String trChr13;
	private String trChr14;
	private String trChr15;
	private Date trDte01;
	private Date trDte02;
	private Date trDte03;
	private Date trDte04;
	private Date trDte05;
	private Double trDec01;
	private Double trDec02;
	private Double trDec03;
	private Double trDec04;
	private Double trDec05;
	private Boolean trLog01;
	private Boolean trLog02;
	private String trRef;
	private Integer trMsg;
	private String trProgram;
	private Integer trOrdRev;
	private String trRefSite;
	private String trFor;
	private String trRsnCode;
	private String trDaycode;
	private Date trVendDate;
	private String trVendLot;
	private String trSlspsn;
	private String trFsmType;
	private Boolean trUpdIsb;
	private Boolean trAutoInstall;
	private String trCaIntType;
	private Double trCoveredAmt;
	private String trBatch;
	private String trFcgCode;
	private String trFscCode;
	private String trSaNbr;
	private String trSvCode;
	private String trEngArea;
	private String trSysProd;
	private String trSvcType;
	private Date trCaOpnDate;
	private Double trCprice;
	private String trEngCode;
	private Integer trWodOp;
	private String trEnduser;
	private String trShipInvMov;
	private Date trShipDate;
	private String trShipId;
	private Double trExRate2;
	private String trExRatetype;
	private Integer trExruSeq;
	private Date trPromiseDate;
	private Integer trFldchgCmtindx;
	private Double oidTrHist;

	// Constructors

	/** default constructor */
	public AbstractTrHist() {
	}

	/** minimal constructor */
	public AbstractTrHist(TrHistId id, String trBatch, String trShipInvMov,
			String trShipId, Double trExRate2, String trExRatetype,
			Integer trExruSeq, Integer trFldchgCmtindx, Double oidTrHist) {
		this.id = id;
		this.trBatch = trBatch;
		this.trShipInvMov = trShipInvMov;
		this.trShipId = trShipId;
		this.trExRate2 = trExRate2;
		this.trExRatetype = trExRatetype;
		this.trExruSeq = trExruSeq;
		this.trFldchgCmtindx = trFldchgCmtindx;
		this.oidTrHist = oidTrHist;
	}

	/** full constructor */
	public AbstractTrHist(TrHistId id, String trPart, Date trDate,
			Date trPerDate, String trType, String trLoc, Double trLocBegin,
			Double trBeginQoh, Double trQtyReq, Double trQtyChg,
			Double trQtyShort, String trUm, Date trLastDate, String trNbr,
			String trSoJob, String trShipType, String trAddr, String trRmks,
			String trXdrAcct, String trXcrAcct, Double trMtlStd,
			Double trLbrStd, Double trBdnStd, Double trPrice, Double trGlAmt,
			String trXdrCc, String trXcrCc, String trLot, Double trSubStd,
			Date trGlDate, Double trQtyLoc, String trUserid, String trSerial,
			Date trEffdate, String trProdLine, String trXslspsn1,
			String trXslspsn2, String trXcrProj, String trXdrProj,
			Integer trLine, String trUser1, String trUser2, String trCurr,
			Double trExRate, String trRev, Integer trTime, Double trOvhStd,
			String trSite, String trStatus, String trGrade, Date trExpire,
			Double trAssay, String trXglRef, String trChr01, String trChr02,
			String trChr03, String trChr04, String trChr05, String trChr06,
			String trChr07, String trChr08, String trChr09, String trChr10,
			String trChr11, String trChr12, String trChr13, String trChr14,
			String trChr15, Date trDte01, Date trDte02, Date trDte03,
			Date trDte04, Date trDte05, Double trDec01, Double trDec02,
			Double trDec03, Double trDec04, Double trDec05, Boolean trLog01,
			Boolean trLog02, String trRef, Integer trMsg, String trProgram,
			Integer trOrdRev, String trRefSite, String trFor, String trRsnCode,
			String trDaycode, Date trVendDate, String trVendLot,
			String trSlspsn, String trFsmType, Boolean trUpdIsb,
			Boolean trAutoInstall, String trCaIntType, Double trCoveredAmt,
			String trBatch, String trFcgCode, String trFscCode, String trSaNbr,
			String trSvCode, String trEngArea, String trSysProd,
			String trSvcType, Date trCaOpnDate, Double trCprice,
			String trEngCode, Integer trWodOp, String trEnduser,
			String trShipInvMov, Date trShipDate, String trShipId,
			Double trExRate2, String trExRatetype, Integer trExruSeq,
			Date trPromiseDate, Integer trFldchgCmtindx, Double oidTrHist) {
		this.id = id;
		this.trPart = trPart;
		this.trDate = trDate;
		this.trPerDate = trPerDate;
		this.trType = trType;
		this.trLoc = trLoc;
		this.trLocBegin = trLocBegin;
		this.trBeginQoh = trBeginQoh;
		this.trQtyReq = trQtyReq;
		this.trQtyChg = trQtyChg;
		this.trQtyShort = trQtyShort;
		this.trUm = trUm;
		this.trLastDate = trLastDate;
		this.trNbr = trNbr;
		this.trSoJob = trSoJob;
		this.trShipType = trShipType;
		this.trAddr = trAddr;
		this.trRmks = trRmks;
		this.trXdrAcct = trXdrAcct;
		this.trXcrAcct = trXcrAcct;
		this.trMtlStd = trMtlStd;
		this.trLbrStd = trLbrStd;
		this.trBdnStd = trBdnStd;
		this.trPrice = trPrice;
		this.trGlAmt = trGlAmt;
		this.trXdrCc = trXdrCc;
		this.trXcrCc = trXcrCc;
		this.trLot = trLot;
		this.trSubStd = trSubStd;
		this.trGlDate = trGlDate;
		this.trQtyLoc = trQtyLoc;
		this.trUserid = trUserid;
		this.trSerial = trSerial;
		this.trEffdate = trEffdate;
		this.trProdLine = trProdLine;
		this.trXslspsn1 = trXslspsn1;
		this.trXslspsn2 = trXslspsn2;
		this.trXcrProj = trXcrProj;
		this.trXdrProj = trXdrProj;
		this.trLine = trLine;
		this.trUser1 = trUser1;
		this.trUser2 = trUser2;
		this.trCurr = trCurr;
		this.trExRate = trExRate;
		this.trRev = trRev;
		this.trTime = trTime;
		this.trOvhStd = trOvhStd;
		this.trSite = trSite;
		this.trStatus = trStatus;
		this.trGrade = trGrade;
		this.trExpire = trExpire;
		this.trAssay = trAssay;
		this.trXglRef = trXglRef;
		this.trChr01 = trChr01;
		this.trChr02 = trChr02;
		this.trChr03 = trChr03;
		this.trChr04 = trChr04;
		this.trChr05 = trChr05;
		this.trChr06 = trChr06;
		this.trChr07 = trChr07;
		this.trChr08 = trChr08;
		this.trChr09 = trChr09;
		this.trChr10 = trChr10;
		this.trChr11 = trChr11;
		this.trChr12 = trChr12;
		this.trChr13 = trChr13;
		this.trChr14 = trChr14;
		this.trChr15 = trChr15;
		this.trDte01 = trDte01;
		this.trDte02 = trDte02;
		this.trDte03 = trDte03;
		this.trDte04 = trDte04;
		this.trDte05 = trDte05;
		this.trDec01 = trDec01;
		this.trDec02 = trDec02;
		this.trDec03 = trDec03;
		this.trDec04 = trDec04;
		this.trDec05 = trDec05;
		this.trLog01 = trLog01;
		this.trLog02 = trLog02;
		this.trRef = trRef;
		this.trMsg = trMsg;
		this.trProgram = trProgram;
		this.trOrdRev = trOrdRev;
		this.trRefSite = trRefSite;
		this.trFor = trFor;
		this.trRsnCode = trRsnCode;
		this.trDaycode = trDaycode;
		this.trVendDate = trVendDate;
		this.trVendLot = trVendLot;
		this.trSlspsn = trSlspsn;
		this.trFsmType = trFsmType;
		this.trUpdIsb = trUpdIsb;
		this.trAutoInstall = trAutoInstall;
		this.trCaIntType = trCaIntType;
		this.trCoveredAmt = trCoveredAmt;
		this.trBatch = trBatch;
		this.trFcgCode = trFcgCode;
		this.trFscCode = trFscCode;
		this.trSaNbr = trSaNbr;
		this.trSvCode = trSvCode;
		this.trEngArea = trEngArea;
		this.trSysProd = trSysProd;
		this.trSvcType = trSvcType;
		this.trCaOpnDate = trCaOpnDate;
		this.trCprice = trCprice;
		this.trEngCode = trEngCode;
		this.trWodOp = trWodOp;
		this.trEnduser = trEnduser;
		this.trShipInvMov = trShipInvMov;
		this.trShipDate = trShipDate;
		this.trShipId = trShipId;
		this.trExRate2 = trExRate2;
		this.trExRatetype = trExRatetype;
		this.trExruSeq = trExruSeq;
		this.trPromiseDate = trPromiseDate;
		this.trFldchgCmtindx = trFldchgCmtindx;
		this.oidTrHist = oidTrHist;
	}

	// Property accessors

	public TrHistId getId() {
		return this.id;
	}

	public void setId(TrHistId id) {
		this.id = id;
	}

	public String getTrPart() {
		return this.trPart;
	}

	public void setTrPart(String trPart) {
		this.trPart = trPart;
	}

	public Date getTrDate() {
		return this.trDate;
	}

	public void setTrDate(Date trDate) {
		this.trDate = trDate;
	}

	public Date getTrPerDate() {
		return this.trPerDate;
	}

	public void setTrPerDate(Date trPerDate) {
		this.trPerDate = trPerDate;
	}

	public String getTrType() {
		return this.trType;
	}

	public void setTrType(String trType) {
		this.trType = trType;
	}

	public String getTrLoc() {
		return this.trLoc;
	}

	public void setTrLoc(String trLoc) {
		this.trLoc = trLoc;
	}

	public Double getTrLocBegin() {
		return this.trLocBegin;
	}

	public void setTrLocBegin(Double trLocBegin) {
		this.trLocBegin = trLocBegin;
	}

	public Double getTrBeginQoh() {
		return this.trBeginQoh;
	}

	public void setTrBeginQoh(Double trBeginQoh) {
		this.trBeginQoh = trBeginQoh;
	}

	public Double getTrQtyReq() {
		return this.trQtyReq;
	}

	public void setTrQtyReq(Double trQtyReq) {
		this.trQtyReq = trQtyReq;
	}

	public Double getTrQtyChg() {
		return this.trQtyChg;
	}

	public void setTrQtyChg(Double trQtyChg) {
		this.trQtyChg = trQtyChg;
	}

	public Double getTrQtyShort() {
		return this.trQtyShort;
	}

	public void setTrQtyShort(Double trQtyShort) {
		this.trQtyShort = trQtyShort;
	}

	public String getTrUm() {
		return this.trUm;
	}

	public void setTrUm(String trUm) {
		this.trUm = trUm;
	}

	public Date getTrLastDate() {
		return this.trLastDate;
	}

	public void setTrLastDate(Date trLastDate) {
		this.trLastDate = trLastDate;
	}

	public String getTrNbr() {
		return this.trNbr;
	}

	public void setTrNbr(String trNbr) {
		this.trNbr = trNbr;
	}

	public String getTrSoJob() {
		return this.trSoJob;
	}

	public void setTrSoJob(String trSoJob) {
		this.trSoJob = trSoJob;
	}

	public String getTrShipType() {
		return this.trShipType;
	}

	public void setTrShipType(String trShipType) {
		this.trShipType = trShipType;
	}

	public String getTrAddr() {
		return this.trAddr;
	}

	public void setTrAddr(String trAddr) {
		this.trAddr = trAddr;
	}

	public String getTrRmks() {
		return this.trRmks;
	}

	public void setTrRmks(String trRmks) {
		this.trRmks = trRmks;
	}

	public String getTrXdrAcct() {
		return this.trXdrAcct;
	}

	public void setTrXdrAcct(String trXdrAcct) {
		this.trXdrAcct = trXdrAcct;
	}

	public String getTrXcrAcct() {
		return this.trXcrAcct;
	}

	public void setTrXcrAcct(String trXcrAcct) {
		this.trXcrAcct = trXcrAcct;
	}

	public Double getTrMtlStd() {
		return this.trMtlStd;
	}

	public void setTrMtlStd(Double trMtlStd) {
		this.trMtlStd = trMtlStd;
	}

	public Double getTrLbrStd() {
		return this.trLbrStd;
	}

	public void setTrLbrStd(Double trLbrStd) {
		this.trLbrStd = trLbrStd;
	}

	public Double getTrBdnStd() {
		return this.trBdnStd;
	}

	public void setTrBdnStd(Double trBdnStd) {
		this.trBdnStd = trBdnStd;
	}

	public Double getTrPrice() {
		return this.trPrice;
	}

	public void setTrPrice(Double trPrice) {
		this.trPrice = trPrice;
	}

	public Double getTrGlAmt() {
		return this.trGlAmt;
	}

	public void setTrGlAmt(Double trGlAmt) {
		this.trGlAmt = trGlAmt;
	}

	public String getTrXdrCc() {
		return this.trXdrCc;
	}

	public void setTrXdrCc(String trXdrCc) {
		this.trXdrCc = trXdrCc;
	}

	public String getTrXcrCc() {
		return this.trXcrCc;
	}

	public void setTrXcrCc(String trXcrCc) {
		this.trXcrCc = trXcrCc;
	}

	public String getTrLot() {
		return this.trLot;
	}

	public void setTrLot(String trLot) {
		this.trLot = trLot;
	}

	public Double getTrSubStd() {
		return this.trSubStd;
	}

	public void setTrSubStd(Double trSubStd) {
		this.trSubStd = trSubStd;
	}

	public Date getTrGlDate() {
		return this.trGlDate;
	}

	public void setTrGlDate(Date trGlDate) {
		this.trGlDate = trGlDate;
	}

	public Double getTrQtyLoc() {
		return this.trQtyLoc;
	}

	public void setTrQtyLoc(Double trQtyLoc) {
		this.trQtyLoc = trQtyLoc;
	}

	public String getTrUserid() {
		return this.trUserid;
	}

	public void setTrUserid(String trUserid) {
		this.trUserid = trUserid;
	}

	public String getTrSerial() {
		return this.trSerial;
	}

	public void setTrSerial(String trSerial) {
		this.trSerial = trSerial;
	}

	public Date getTrEffdate() {
		return this.trEffdate;
	}

	public void setTrEffdate(Date trEffdate) {
		this.trEffdate = trEffdate;
	}

	public String getTrProdLine() {
		return this.trProdLine;
	}

	public void setTrProdLine(String trProdLine) {
		this.trProdLine = trProdLine;
	}

	public String getTrXslspsn1() {
		return this.trXslspsn1;
	}

	public void setTrXslspsn1(String trXslspsn1) {
		this.trXslspsn1 = trXslspsn1;
	}

	public String getTrXslspsn2() {
		return this.trXslspsn2;
	}

	public void setTrXslspsn2(String trXslspsn2) {
		this.trXslspsn2 = trXslspsn2;
	}

	public String getTrXcrProj() {
		return this.trXcrProj;
	}

	public void setTrXcrProj(String trXcrProj) {
		this.trXcrProj = trXcrProj;
	}

	public String getTrXdrProj() {
		return this.trXdrProj;
	}

	public void setTrXdrProj(String trXdrProj) {
		this.trXdrProj = trXdrProj;
	}

	public Integer getTrLine() {
		return this.trLine;
	}

	public void setTrLine(Integer trLine) {
		this.trLine = trLine;
	}

	public String getTrUser1() {
		return this.trUser1;
	}

	public void setTrUser1(String trUser1) {
		this.trUser1 = trUser1;
	}

	public String getTrUser2() {
		return this.trUser2;
	}

	public void setTrUser2(String trUser2) {
		this.trUser2 = trUser2;
	}

	public String getTrCurr() {
		return this.trCurr;
	}

	public void setTrCurr(String trCurr) {
		this.trCurr = trCurr;
	}

	public Double getTrExRate() {
		return this.trExRate;
	}

	public void setTrExRate(Double trExRate) {
		this.trExRate = trExRate;
	}

	public String getTrRev() {
		return this.trRev;
	}

	public void setTrRev(String trRev) {
		this.trRev = trRev;
	}

	public Integer getTrTime() {
		return this.trTime;
	}

	public void setTrTime(Integer trTime) {
		this.trTime = trTime;
	}

	public Double getTrOvhStd() {
		return this.trOvhStd;
	}

	public void setTrOvhStd(Double trOvhStd) {
		this.trOvhStd = trOvhStd;
	}

	public String getTrSite() {
		return this.trSite;
	}

	public void setTrSite(String trSite) {
		this.trSite = trSite;
	}

	public String getTrStatus() {
		return this.trStatus;
	}

	public void setTrStatus(String trStatus) {
		this.trStatus = trStatus;
	}

	public String getTrGrade() {
		return this.trGrade;
	}

	public void setTrGrade(String trGrade) {
		this.trGrade = trGrade;
	}

	public Date getTrExpire() {
		return this.trExpire;
	}

	public void setTrExpire(Date trExpire) {
		this.trExpire = trExpire;
	}

	public Double getTrAssay() {
		return this.trAssay;
	}

	public void setTrAssay(Double trAssay) {
		this.trAssay = trAssay;
	}

	public String getTrXglRef() {
		return this.trXglRef;
	}

	public void setTrXglRef(String trXglRef) {
		this.trXglRef = trXglRef;
	}

	public String getTrChr01() {
		return this.trChr01;
	}

	public void setTrChr01(String trChr01) {
		this.trChr01 = trChr01;
	}

	public String getTrChr02() {
		return this.trChr02;
	}

	public void setTrChr02(String trChr02) {
		this.trChr02 = trChr02;
	}

	public String getTrChr03() {
		return this.trChr03;
	}

	public void setTrChr03(String trChr03) {
		this.trChr03 = trChr03;
	}

	public String getTrChr04() {
		return this.trChr04;
	}

	public void setTrChr04(String trChr04) {
		this.trChr04 = trChr04;
	}

	public String getTrChr05() {
		return this.trChr05;
	}

	public void setTrChr05(String trChr05) {
		this.trChr05 = trChr05;
	}

	public String getTrChr06() {
		return this.trChr06;
	}

	public void setTrChr06(String trChr06) {
		this.trChr06 = trChr06;
	}

	public String getTrChr07() {
		return this.trChr07;
	}

	public void setTrChr07(String trChr07) {
		this.trChr07 = trChr07;
	}

	public String getTrChr08() {
		return this.trChr08;
	}

	public void setTrChr08(String trChr08) {
		this.trChr08 = trChr08;
	}

	public String getTrChr09() {
		return this.trChr09;
	}

	public void setTrChr09(String trChr09) {
		this.trChr09 = trChr09;
	}

	public String getTrChr10() {
		return this.trChr10;
	}

	public void setTrChr10(String trChr10) {
		this.trChr10 = trChr10;
	}

	public String getTrChr11() {
		return this.trChr11;
	}

	public void setTrChr11(String trChr11) {
		this.trChr11 = trChr11;
	}

	public String getTrChr12() {
		return this.trChr12;
	}

	public void setTrChr12(String trChr12) {
		this.trChr12 = trChr12;
	}

	public String getTrChr13() {
		return this.trChr13;
	}

	public void setTrChr13(String trChr13) {
		this.trChr13 = trChr13;
	}

	public String getTrChr14() {
		return this.trChr14;
	}

	public void setTrChr14(String trChr14) {
		this.trChr14 = trChr14;
	}

	public String getTrChr15() {
		return this.trChr15;
	}

	public void setTrChr15(String trChr15) {
		this.trChr15 = trChr15;
	}

	public Date getTrDte01() {
		return this.trDte01;
	}

	public void setTrDte01(Date trDte01) {
		this.trDte01 = trDte01;
	}

	public Date getTrDte02() {
		return this.trDte02;
	}

	public void setTrDte02(Date trDte02) {
		this.trDte02 = trDte02;
	}

	public Date getTrDte03() {
		return this.trDte03;
	}

	public void setTrDte03(Date trDte03) {
		this.trDte03 = trDte03;
	}

	public Date getTrDte04() {
		return this.trDte04;
	}

	public void setTrDte04(Date trDte04) {
		this.trDte04 = trDte04;
	}

	public Date getTrDte05() {
		return this.trDte05;
	}

	public void setTrDte05(Date trDte05) {
		this.trDte05 = trDte05;
	}

	public Double getTrDec01() {
		return this.trDec01;
	}

	public void setTrDec01(Double trDec01) {
		this.trDec01 = trDec01;
	}

	public Double getTrDec02() {
		return this.trDec02;
	}

	public void setTrDec02(Double trDec02) {
		this.trDec02 = trDec02;
	}

	public Double getTrDec03() {
		return this.trDec03;
	}

	public void setTrDec03(Double trDec03) {
		this.trDec03 = trDec03;
	}

	public Double getTrDec04() {
		return this.trDec04;
	}

	public void setTrDec04(Double trDec04) {
		this.trDec04 = trDec04;
	}

	public Double getTrDec05() {
		return this.trDec05;
	}

	public void setTrDec05(Double trDec05) {
		this.trDec05 = trDec05;
	}

	public Boolean getTrLog01() {
		return this.trLog01;
	}

	public void setTrLog01(Boolean trLog01) {
		this.trLog01 = trLog01;
	}

	public Boolean getTrLog02() {
		return this.trLog02;
	}

	public void setTrLog02(Boolean trLog02) {
		this.trLog02 = trLog02;
	}

	public String getTrRef() {
		return this.trRef;
	}

	public void setTrRef(String trRef) {
		this.trRef = trRef;
	}

	public Integer getTrMsg() {
		return this.trMsg;
	}

	public void setTrMsg(Integer trMsg) {
		this.trMsg = trMsg;
	}

	public String getTrProgram() {
		return this.trProgram;
	}

	public void setTrProgram(String trProgram) {
		this.trProgram = trProgram;
	}

	public Integer getTrOrdRev() {
		return this.trOrdRev;
	}

	public void setTrOrdRev(Integer trOrdRev) {
		this.trOrdRev = trOrdRev;
	}

	public String getTrRefSite() {
		return this.trRefSite;
	}

	public void setTrRefSite(String trRefSite) {
		this.trRefSite = trRefSite;
	}

	public String getTrFor() {
		return this.trFor;
	}

	public void setTrFor(String trFor) {
		this.trFor = trFor;
	}

	public String getTrRsnCode() {
		return this.trRsnCode;
	}

	public void setTrRsnCode(String trRsnCode) {
		this.trRsnCode = trRsnCode;
	}

	public String getTrDaycode() {
		return this.trDaycode;
	}

	public void setTrDaycode(String trDaycode) {
		this.trDaycode = trDaycode;
	}

	public Date getTrVendDate() {
		return this.trVendDate;
	}

	public void setTrVendDate(Date trVendDate) {
		this.trVendDate = trVendDate;
	}

	public String getTrVendLot() {
		return this.trVendLot;
	}

	public void setTrVendLot(String trVendLot) {
		this.trVendLot = trVendLot;
	}

	public String getTrSlspsn() {
		return this.trSlspsn;
	}

	public void setTrSlspsn(String trSlspsn) {
		this.trSlspsn = trSlspsn;
	}

	public String getTrFsmType() {
		return this.trFsmType;
	}

	public void setTrFsmType(String trFsmType) {
		this.trFsmType = trFsmType;
	}

	public Boolean getTrUpdIsb() {
		return this.trUpdIsb;
	}

	public void setTrUpdIsb(Boolean trUpdIsb) {
		this.trUpdIsb = trUpdIsb;
	}

	public Boolean getTrAutoInstall() {
		return this.trAutoInstall;
	}

	public void setTrAutoInstall(Boolean trAutoInstall) {
		this.trAutoInstall = trAutoInstall;
	}

	public String getTrCaIntType() {
		return this.trCaIntType;
	}

	public void setTrCaIntType(String trCaIntType) {
		this.trCaIntType = trCaIntType;
	}

	public Double getTrCoveredAmt() {
		return this.trCoveredAmt;
	}

	public void setTrCoveredAmt(Double trCoveredAmt) {
		this.trCoveredAmt = trCoveredAmt;
	}

	public String getTrBatch() {
		return this.trBatch;
	}

	public void setTrBatch(String trBatch) {
		this.trBatch = trBatch;
	}

	public String getTrFcgCode() {
		return this.trFcgCode;
	}

	public void setTrFcgCode(String trFcgCode) {
		this.trFcgCode = trFcgCode;
	}

	public String getTrFscCode() {
		return this.trFscCode;
	}

	public void setTrFscCode(String trFscCode) {
		this.trFscCode = trFscCode;
	}

	public String getTrSaNbr() {
		return this.trSaNbr;
	}

	public void setTrSaNbr(String trSaNbr) {
		this.trSaNbr = trSaNbr;
	}

	public String getTrSvCode() {
		return this.trSvCode;
	}

	public void setTrSvCode(String trSvCode) {
		this.trSvCode = trSvCode;
	}

	public String getTrEngArea() {
		return this.trEngArea;
	}

	public void setTrEngArea(String trEngArea) {
		this.trEngArea = trEngArea;
	}

	public String getTrSysProd() {
		return this.trSysProd;
	}

	public void setTrSysProd(String trSysProd) {
		this.trSysProd = trSysProd;
	}

	public String getTrSvcType() {
		return this.trSvcType;
	}

	public void setTrSvcType(String trSvcType) {
		this.trSvcType = trSvcType;
	}

	public Date getTrCaOpnDate() {
		return this.trCaOpnDate;
	}

	public void setTrCaOpnDate(Date trCaOpnDate) {
		this.trCaOpnDate = trCaOpnDate;
	}

	public Double getTrCprice() {
		return this.trCprice;
	}

	public void setTrCprice(Double trCprice) {
		this.trCprice = trCprice;
	}

	public String getTrEngCode() {
		return this.trEngCode;
	}

	public void setTrEngCode(String trEngCode) {
		this.trEngCode = trEngCode;
	}

	public Integer getTrWodOp() {
		return this.trWodOp;
	}

	public void setTrWodOp(Integer trWodOp) {
		this.trWodOp = trWodOp;
	}

	public String getTrEnduser() {
		return this.trEnduser;
	}

	public void setTrEnduser(String trEnduser) {
		this.trEnduser = trEnduser;
	}

	public String getTrShipInvMov() {
		return this.trShipInvMov;
	}

	public void setTrShipInvMov(String trShipInvMov) {
		this.trShipInvMov = trShipInvMov;
	}

	public Date getTrShipDate() {
		return this.trShipDate;
	}

	public void setTrShipDate(Date trShipDate) {
		this.trShipDate = trShipDate;
	}

	public String getTrShipId() {
		return this.trShipId;
	}

	public void setTrShipId(String trShipId) {
		this.trShipId = trShipId;
	}

	public Double getTrExRate2() {
		return this.trExRate2;
	}

	public void setTrExRate2(Double trExRate2) {
		this.trExRate2 = trExRate2;
	}

	public String getTrExRatetype() {
		return this.trExRatetype;
	}

	public void setTrExRatetype(String trExRatetype) {
		this.trExRatetype = trExRatetype;
	}

	public Integer getTrExruSeq() {
		return this.trExruSeq;
	}

	public void setTrExruSeq(Integer trExruSeq) {
		this.trExruSeq = trExruSeq;
	}

	public Date getTrPromiseDate() {
		return this.trPromiseDate;
	}

	public void setTrPromiseDate(Date trPromiseDate) {
		this.trPromiseDate = trPromiseDate;
	}

	public Integer getTrFldchgCmtindx() {
		return this.trFldchgCmtindx;
	}

	public void setTrFldchgCmtindx(Integer trFldchgCmtindx) {
		this.trFldchgCmtindx = trFldchgCmtindx;
	}

	public Double getOidTrHist() {
		return this.oidTrHist;
	}

	public void setOidTrHist(Double oidTrHist) {
		this.oidTrHist = oidTrHist;
	}

}