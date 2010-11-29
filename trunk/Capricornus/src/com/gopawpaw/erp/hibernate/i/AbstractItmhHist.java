package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractItmhHist entity provides the base persistence definition of the
 * ItmhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractItmhHist implements java.io.Serializable {

	// Fields

	private ItmhHistId id;
	private String itmhBomCode;
	private String itmhCaIntType;
	private Integer itmhCmtindx;
	private Date itmhCompDate;
	private String itmhDesc;
	private String itmhEngCode;
	private String itmhNxtAct;
	private Date itmhNxtDate;
	private String itmhNxtTime;
	private String itmhPart;
	private Double itmhQtyCall;
	private Double itmhQtyRcRec;
	private Double itmhQtyRcShip;
	private Double itmhQtyRec;
	private Double itmhQtyShip;
	private Date itmhRecDate;
	private Integer itmhRef;
	private String itmhRev;
	private String itmhRoute;
	private Integer itmhSadLine;
	private String itmhSaNbr;
	private String itmhSerial;
	private Date itmhShipDate;
	private String itmhStatus;
	private String itmhSvCode;
	private String itmhUser1;
	private String itmhUser2;
	private String itmhTaxc;
	private String itmhTaxUsage;
	private String itmhChr01;
	private String itmhChr02;
	private String itmhChr03;
	private String itmhChr04;
	private Double itmhDec01;
	private Double itmhDec02;
	private Double itmhDec03;
	private Date itmhDte01;
	private Date itmhDte02;
	private Date itmhDte03;
	private Boolean itmhLog01;
	private Boolean itmhLog02;
	private Boolean itmhLog03;
	private String itmhQadc01;
	private String itmhQadc02;
	private String itmhQadc03;
	private String itmhQadc04;
	private Date itmhQadt01;
	private Date itmhQadt02;
	private Date itmhQadt03;
	private Double itmhQadd01;
	private Double itmhQadd02;
	private Double itmhQadd03;
	private Boolean itmhQadl01;
	private Boolean itmhQadl02;
	private Boolean itmhQadl03;
	private String itmhStdownTime;
	private Date itmhStdownDate;
	private Date itmhStjobDate;
	private Date itmhEndownDate;
	private String itmhEndownTime;
	private Boolean itmhBomGen;
	private Date itmhDueDate;
	private Date itmhExpRec;
	private Boolean itmhFixPr;
	private Boolean itmhRouteGen;
	private String itmhSaSv;
	private String itmhSvcType;
	private Boolean itmhTaxable;
	private String itmhWarrSv;
	private String itmhQadc05;
	private String itmhQadc06;
	private Date itmhOpnDate;
	private String itmhStjobTime;
	private Double itmhFixedPrice;
	private Boolean itmhBillDetail;
	private Boolean itmhUnprocessed;
	private Boolean itmhInvoiced;
	private Boolean itmhUninvoiced;
	private String itmhEstTime;
	private Boolean itmhRecorded;
	private Double itmhQtyChg;
	private String itmhTag;
	private String itmhRrcNbr;
	private Integer itmhRrcSeq;
	private Boolean itmhSepDoc;
	private String itmhSite;
	private String itmhLoc;
	private Boolean itmhUpdIsb;
	private String itmhModUserid;
	private Date itmhModDate;
	private String itmhTaxEnv;
	private Boolean itmhTaxIn;
	private String itmhPrList;
	private String itmhProdLine;
	private Boolean itmhOverrideLmt;
	private String itmhEuNbr;
	private Boolean itmhPst;
	private String itmhAcct;
	private String itmhSub;
	private String itmhCc;
	private String itmhProject;
	private String itmhDscAcct;
	private String itmhDscSub;
	private String itmhDscCc;
	private String itmhDscProject;
	private Double oidItmhHist;

	// Constructors

	/** default constructor */
	public AbstractItmhHist() {
	}

	/** minimal constructor */
	public AbstractItmhHist(ItmhHistId id, Double oidItmhHist) {
		this.id = id;
		this.oidItmhHist = oidItmhHist;
	}

	/** full constructor */
	public AbstractItmhHist(ItmhHistId id, String itmhBomCode,
			String itmhCaIntType, Integer itmhCmtindx, Date itmhCompDate,
			String itmhDesc, String itmhEngCode, String itmhNxtAct,
			Date itmhNxtDate, String itmhNxtTime, String itmhPart,
			Double itmhQtyCall, Double itmhQtyRcRec, Double itmhQtyRcShip,
			Double itmhQtyRec, Double itmhQtyShip, Date itmhRecDate,
			Integer itmhRef, String itmhRev, String itmhRoute,
			Integer itmhSadLine, String itmhSaNbr, String itmhSerial,
			Date itmhShipDate, String itmhStatus, String itmhSvCode,
			String itmhUser1, String itmhUser2, String itmhTaxc,
			String itmhTaxUsage, String itmhChr01, String itmhChr02,
			String itmhChr03, String itmhChr04, Double itmhDec01,
			Double itmhDec02, Double itmhDec03, Date itmhDte01, Date itmhDte02,
			Date itmhDte03, Boolean itmhLog01, Boolean itmhLog02,
			Boolean itmhLog03, String itmhQadc01, String itmhQadc02,
			String itmhQadc03, String itmhQadc04, Date itmhQadt01,
			Date itmhQadt02, Date itmhQadt03, Double itmhQadd01,
			Double itmhQadd02, Double itmhQadd03, Boolean itmhQadl01,
			Boolean itmhQadl02, Boolean itmhQadl03, String itmhStdownTime,
			Date itmhStdownDate, Date itmhStjobDate, Date itmhEndownDate,
			String itmhEndownTime, Boolean itmhBomGen, Date itmhDueDate,
			Date itmhExpRec, Boolean itmhFixPr, Boolean itmhRouteGen,
			String itmhSaSv, String itmhSvcType, Boolean itmhTaxable,
			String itmhWarrSv, String itmhQadc05, String itmhQadc06,
			Date itmhOpnDate, String itmhStjobTime, Double itmhFixedPrice,
			Boolean itmhBillDetail, Boolean itmhUnprocessed,
			Boolean itmhInvoiced, Boolean itmhUninvoiced, String itmhEstTime,
			Boolean itmhRecorded, Double itmhQtyChg, String itmhTag,
			String itmhRrcNbr, Integer itmhRrcSeq, Boolean itmhSepDoc,
			String itmhSite, String itmhLoc, Boolean itmhUpdIsb,
			String itmhModUserid, Date itmhModDate, String itmhTaxEnv,
			Boolean itmhTaxIn, String itmhPrList, String itmhProdLine,
			Boolean itmhOverrideLmt, String itmhEuNbr, Boolean itmhPst,
			String itmhAcct, String itmhSub, String itmhCc, String itmhProject,
			String itmhDscAcct, String itmhDscSub, String itmhDscCc,
			String itmhDscProject, Double oidItmhHist) {
		this.id = id;
		this.itmhBomCode = itmhBomCode;
		this.itmhCaIntType = itmhCaIntType;
		this.itmhCmtindx = itmhCmtindx;
		this.itmhCompDate = itmhCompDate;
		this.itmhDesc = itmhDesc;
		this.itmhEngCode = itmhEngCode;
		this.itmhNxtAct = itmhNxtAct;
		this.itmhNxtDate = itmhNxtDate;
		this.itmhNxtTime = itmhNxtTime;
		this.itmhPart = itmhPart;
		this.itmhQtyCall = itmhQtyCall;
		this.itmhQtyRcRec = itmhQtyRcRec;
		this.itmhQtyRcShip = itmhQtyRcShip;
		this.itmhQtyRec = itmhQtyRec;
		this.itmhQtyShip = itmhQtyShip;
		this.itmhRecDate = itmhRecDate;
		this.itmhRef = itmhRef;
		this.itmhRev = itmhRev;
		this.itmhRoute = itmhRoute;
		this.itmhSadLine = itmhSadLine;
		this.itmhSaNbr = itmhSaNbr;
		this.itmhSerial = itmhSerial;
		this.itmhShipDate = itmhShipDate;
		this.itmhStatus = itmhStatus;
		this.itmhSvCode = itmhSvCode;
		this.itmhUser1 = itmhUser1;
		this.itmhUser2 = itmhUser2;
		this.itmhTaxc = itmhTaxc;
		this.itmhTaxUsage = itmhTaxUsage;
		this.itmhChr01 = itmhChr01;
		this.itmhChr02 = itmhChr02;
		this.itmhChr03 = itmhChr03;
		this.itmhChr04 = itmhChr04;
		this.itmhDec01 = itmhDec01;
		this.itmhDec02 = itmhDec02;
		this.itmhDec03 = itmhDec03;
		this.itmhDte01 = itmhDte01;
		this.itmhDte02 = itmhDte02;
		this.itmhDte03 = itmhDte03;
		this.itmhLog01 = itmhLog01;
		this.itmhLog02 = itmhLog02;
		this.itmhLog03 = itmhLog03;
		this.itmhQadc01 = itmhQadc01;
		this.itmhQadc02 = itmhQadc02;
		this.itmhQadc03 = itmhQadc03;
		this.itmhQadc04 = itmhQadc04;
		this.itmhQadt01 = itmhQadt01;
		this.itmhQadt02 = itmhQadt02;
		this.itmhQadt03 = itmhQadt03;
		this.itmhQadd01 = itmhQadd01;
		this.itmhQadd02 = itmhQadd02;
		this.itmhQadd03 = itmhQadd03;
		this.itmhQadl01 = itmhQadl01;
		this.itmhQadl02 = itmhQadl02;
		this.itmhQadl03 = itmhQadl03;
		this.itmhStdownTime = itmhStdownTime;
		this.itmhStdownDate = itmhStdownDate;
		this.itmhStjobDate = itmhStjobDate;
		this.itmhEndownDate = itmhEndownDate;
		this.itmhEndownTime = itmhEndownTime;
		this.itmhBomGen = itmhBomGen;
		this.itmhDueDate = itmhDueDate;
		this.itmhExpRec = itmhExpRec;
		this.itmhFixPr = itmhFixPr;
		this.itmhRouteGen = itmhRouteGen;
		this.itmhSaSv = itmhSaSv;
		this.itmhSvcType = itmhSvcType;
		this.itmhTaxable = itmhTaxable;
		this.itmhWarrSv = itmhWarrSv;
		this.itmhQadc05 = itmhQadc05;
		this.itmhQadc06 = itmhQadc06;
		this.itmhOpnDate = itmhOpnDate;
		this.itmhStjobTime = itmhStjobTime;
		this.itmhFixedPrice = itmhFixedPrice;
		this.itmhBillDetail = itmhBillDetail;
		this.itmhUnprocessed = itmhUnprocessed;
		this.itmhInvoiced = itmhInvoiced;
		this.itmhUninvoiced = itmhUninvoiced;
		this.itmhEstTime = itmhEstTime;
		this.itmhRecorded = itmhRecorded;
		this.itmhQtyChg = itmhQtyChg;
		this.itmhTag = itmhTag;
		this.itmhRrcNbr = itmhRrcNbr;
		this.itmhRrcSeq = itmhRrcSeq;
		this.itmhSepDoc = itmhSepDoc;
		this.itmhSite = itmhSite;
		this.itmhLoc = itmhLoc;
		this.itmhUpdIsb = itmhUpdIsb;
		this.itmhModUserid = itmhModUserid;
		this.itmhModDate = itmhModDate;
		this.itmhTaxEnv = itmhTaxEnv;
		this.itmhTaxIn = itmhTaxIn;
		this.itmhPrList = itmhPrList;
		this.itmhProdLine = itmhProdLine;
		this.itmhOverrideLmt = itmhOverrideLmt;
		this.itmhEuNbr = itmhEuNbr;
		this.itmhPst = itmhPst;
		this.itmhAcct = itmhAcct;
		this.itmhSub = itmhSub;
		this.itmhCc = itmhCc;
		this.itmhProject = itmhProject;
		this.itmhDscAcct = itmhDscAcct;
		this.itmhDscSub = itmhDscSub;
		this.itmhDscCc = itmhDscCc;
		this.itmhDscProject = itmhDscProject;
		this.oidItmhHist = oidItmhHist;
	}

	// Property accessors

	public ItmhHistId getId() {
		return this.id;
	}

	public void setId(ItmhHistId id) {
		this.id = id;
	}

	public String getItmhBomCode() {
		return this.itmhBomCode;
	}

	public void setItmhBomCode(String itmhBomCode) {
		this.itmhBomCode = itmhBomCode;
	}

	public String getItmhCaIntType() {
		return this.itmhCaIntType;
	}

	public void setItmhCaIntType(String itmhCaIntType) {
		this.itmhCaIntType = itmhCaIntType;
	}

	public Integer getItmhCmtindx() {
		return this.itmhCmtindx;
	}

	public void setItmhCmtindx(Integer itmhCmtindx) {
		this.itmhCmtindx = itmhCmtindx;
	}

	public Date getItmhCompDate() {
		return this.itmhCompDate;
	}

	public void setItmhCompDate(Date itmhCompDate) {
		this.itmhCompDate = itmhCompDate;
	}

	public String getItmhDesc() {
		return this.itmhDesc;
	}

	public void setItmhDesc(String itmhDesc) {
		this.itmhDesc = itmhDesc;
	}

	public String getItmhEngCode() {
		return this.itmhEngCode;
	}

	public void setItmhEngCode(String itmhEngCode) {
		this.itmhEngCode = itmhEngCode;
	}

	public String getItmhNxtAct() {
		return this.itmhNxtAct;
	}

	public void setItmhNxtAct(String itmhNxtAct) {
		this.itmhNxtAct = itmhNxtAct;
	}

	public Date getItmhNxtDate() {
		return this.itmhNxtDate;
	}

	public void setItmhNxtDate(Date itmhNxtDate) {
		this.itmhNxtDate = itmhNxtDate;
	}

	public String getItmhNxtTime() {
		return this.itmhNxtTime;
	}

	public void setItmhNxtTime(String itmhNxtTime) {
		this.itmhNxtTime = itmhNxtTime;
	}

	public String getItmhPart() {
		return this.itmhPart;
	}

	public void setItmhPart(String itmhPart) {
		this.itmhPart = itmhPart;
	}

	public Double getItmhQtyCall() {
		return this.itmhQtyCall;
	}

	public void setItmhQtyCall(Double itmhQtyCall) {
		this.itmhQtyCall = itmhQtyCall;
	}

	public Double getItmhQtyRcRec() {
		return this.itmhQtyRcRec;
	}

	public void setItmhQtyRcRec(Double itmhQtyRcRec) {
		this.itmhQtyRcRec = itmhQtyRcRec;
	}

	public Double getItmhQtyRcShip() {
		return this.itmhQtyRcShip;
	}

	public void setItmhQtyRcShip(Double itmhQtyRcShip) {
		this.itmhQtyRcShip = itmhQtyRcShip;
	}

	public Double getItmhQtyRec() {
		return this.itmhQtyRec;
	}

	public void setItmhQtyRec(Double itmhQtyRec) {
		this.itmhQtyRec = itmhQtyRec;
	}

	public Double getItmhQtyShip() {
		return this.itmhQtyShip;
	}

	public void setItmhQtyShip(Double itmhQtyShip) {
		this.itmhQtyShip = itmhQtyShip;
	}

	public Date getItmhRecDate() {
		return this.itmhRecDate;
	}

	public void setItmhRecDate(Date itmhRecDate) {
		this.itmhRecDate = itmhRecDate;
	}

	public Integer getItmhRef() {
		return this.itmhRef;
	}

	public void setItmhRef(Integer itmhRef) {
		this.itmhRef = itmhRef;
	}

	public String getItmhRev() {
		return this.itmhRev;
	}

	public void setItmhRev(String itmhRev) {
		this.itmhRev = itmhRev;
	}

	public String getItmhRoute() {
		return this.itmhRoute;
	}

	public void setItmhRoute(String itmhRoute) {
		this.itmhRoute = itmhRoute;
	}

	public Integer getItmhSadLine() {
		return this.itmhSadLine;
	}

	public void setItmhSadLine(Integer itmhSadLine) {
		this.itmhSadLine = itmhSadLine;
	}

	public String getItmhSaNbr() {
		return this.itmhSaNbr;
	}

	public void setItmhSaNbr(String itmhSaNbr) {
		this.itmhSaNbr = itmhSaNbr;
	}

	public String getItmhSerial() {
		return this.itmhSerial;
	}

	public void setItmhSerial(String itmhSerial) {
		this.itmhSerial = itmhSerial;
	}

	public Date getItmhShipDate() {
		return this.itmhShipDate;
	}

	public void setItmhShipDate(Date itmhShipDate) {
		this.itmhShipDate = itmhShipDate;
	}

	public String getItmhStatus() {
		return this.itmhStatus;
	}

	public void setItmhStatus(String itmhStatus) {
		this.itmhStatus = itmhStatus;
	}

	public String getItmhSvCode() {
		return this.itmhSvCode;
	}

	public void setItmhSvCode(String itmhSvCode) {
		this.itmhSvCode = itmhSvCode;
	}

	public String getItmhUser1() {
		return this.itmhUser1;
	}

	public void setItmhUser1(String itmhUser1) {
		this.itmhUser1 = itmhUser1;
	}

	public String getItmhUser2() {
		return this.itmhUser2;
	}

	public void setItmhUser2(String itmhUser2) {
		this.itmhUser2 = itmhUser2;
	}

	public String getItmhTaxc() {
		return this.itmhTaxc;
	}

	public void setItmhTaxc(String itmhTaxc) {
		this.itmhTaxc = itmhTaxc;
	}

	public String getItmhTaxUsage() {
		return this.itmhTaxUsage;
	}

	public void setItmhTaxUsage(String itmhTaxUsage) {
		this.itmhTaxUsage = itmhTaxUsage;
	}

	public String getItmhChr01() {
		return this.itmhChr01;
	}

	public void setItmhChr01(String itmhChr01) {
		this.itmhChr01 = itmhChr01;
	}

	public String getItmhChr02() {
		return this.itmhChr02;
	}

	public void setItmhChr02(String itmhChr02) {
		this.itmhChr02 = itmhChr02;
	}

	public String getItmhChr03() {
		return this.itmhChr03;
	}

	public void setItmhChr03(String itmhChr03) {
		this.itmhChr03 = itmhChr03;
	}

	public String getItmhChr04() {
		return this.itmhChr04;
	}

	public void setItmhChr04(String itmhChr04) {
		this.itmhChr04 = itmhChr04;
	}

	public Double getItmhDec01() {
		return this.itmhDec01;
	}

	public void setItmhDec01(Double itmhDec01) {
		this.itmhDec01 = itmhDec01;
	}

	public Double getItmhDec02() {
		return this.itmhDec02;
	}

	public void setItmhDec02(Double itmhDec02) {
		this.itmhDec02 = itmhDec02;
	}

	public Double getItmhDec03() {
		return this.itmhDec03;
	}

	public void setItmhDec03(Double itmhDec03) {
		this.itmhDec03 = itmhDec03;
	}

	public Date getItmhDte01() {
		return this.itmhDte01;
	}

	public void setItmhDte01(Date itmhDte01) {
		this.itmhDte01 = itmhDte01;
	}

	public Date getItmhDte02() {
		return this.itmhDte02;
	}

	public void setItmhDte02(Date itmhDte02) {
		this.itmhDte02 = itmhDte02;
	}

	public Date getItmhDte03() {
		return this.itmhDte03;
	}

	public void setItmhDte03(Date itmhDte03) {
		this.itmhDte03 = itmhDte03;
	}

	public Boolean getItmhLog01() {
		return this.itmhLog01;
	}

	public void setItmhLog01(Boolean itmhLog01) {
		this.itmhLog01 = itmhLog01;
	}

	public Boolean getItmhLog02() {
		return this.itmhLog02;
	}

	public void setItmhLog02(Boolean itmhLog02) {
		this.itmhLog02 = itmhLog02;
	}

	public Boolean getItmhLog03() {
		return this.itmhLog03;
	}

	public void setItmhLog03(Boolean itmhLog03) {
		this.itmhLog03 = itmhLog03;
	}

	public String getItmhQadc01() {
		return this.itmhQadc01;
	}

	public void setItmhQadc01(String itmhQadc01) {
		this.itmhQadc01 = itmhQadc01;
	}

	public String getItmhQadc02() {
		return this.itmhQadc02;
	}

	public void setItmhQadc02(String itmhQadc02) {
		this.itmhQadc02 = itmhQadc02;
	}

	public String getItmhQadc03() {
		return this.itmhQadc03;
	}

	public void setItmhQadc03(String itmhQadc03) {
		this.itmhQadc03 = itmhQadc03;
	}

	public String getItmhQadc04() {
		return this.itmhQadc04;
	}

	public void setItmhQadc04(String itmhQadc04) {
		this.itmhQadc04 = itmhQadc04;
	}

	public Date getItmhQadt01() {
		return this.itmhQadt01;
	}

	public void setItmhQadt01(Date itmhQadt01) {
		this.itmhQadt01 = itmhQadt01;
	}

	public Date getItmhQadt02() {
		return this.itmhQadt02;
	}

	public void setItmhQadt02(Date itmhQadt02) {
		this.itmhQadt02 = itmhQadt02;
	}

	public Date getItmhQadt03() {
		return this.itmhQadt03;
	}

	public void setItmhQadt03(Date itmhQadt03) {
		this.itmhQadt03 = itmhQadt03;
	}

	public Double getItmhQadd01() {
		return this.itmhQadd01;
	}

	public void setItmhQadd01(Double itmhQadd01) {
		this.itmhQadd01 = itmhQadd01;
	}

	public Double getItmhQadd02() {
		return this.itmhQadd02;
	}

	public void setItmhQadd02(Double itmhQadd02) {
		this.itmhQadd02 = itmhQadd02;
	}

	public Double getItmhQadd03() {
		return this.itmhQadd03;
	}

	public void setItmhQadd03(Double itmhQadd03) {
		this.itmhQadd03 = itmhQadd03;
	}

	public Boolean getItmhQadl01() {
		return this.itmhQadl01;
	}

	public void setItmhQadl01(Boolean itmhQadl01) {
		this.itmhQadl01 = itmhQadl01;
	}

	public Boolean getItmhQadl02() {
		return this.itmhQadl02;
	}

	public void setItmhQadl02(Boolean itmhQadl02) {
		this.itmhQadl02 = itmhQadl02;
	}

	public Boolean getItmhQadl03() {
		return this.itmhQadl03;
	}

	public void setItmhQadl03(Boolean itmhQadl03) {
		this.itmhQadl03 = itmhQadl03;
	}

	public String getItmhStdownTime() {
		return this.itmhStdownTime;
	}

	public void setItmhStdownTime(String itmhStdownTime) {
		this.itmhStdownTime = itmhStdownTime;
	}

	public Date getItmhStdownDate() {
		return this.itmhStdownDate;
	}

	public void setItmhStdownDate(Date itmhStdownDate) {
		this.itmhStdownDate = itmhStdownDate;
	}

	public Date getItmhStjobDate() {
		return this.itmhStjobDate;
	}

	public void setItmhStjobDate(Date itmhStjobDate) {
		this.itmhStjobDate = itmhStjobDate;
	}

	public Date getItmhEndownDate() {
		return this.itmhEndownDate;
	}

	public void setItmhEndownDate(Date itmhEndownDate) {
		this.itmhEndownDate = itmhEndownDate;
	}

	public String getItmhEndownTime() {
		return this.itmhEndownTime;
	}

	public void setItmhEndownTime(String itmhEndownTime) {
		this.itmhEndownTime = itmhEndownTime;
	}

	public Boolean getItmhBomGen() {
		return this.itmhBomGen;
	}

	public void setItmhBomGen(Boolean itmhBomGen) {
		this.itmhBomGen = itmhBomGen;
	}

	public Date getItmhDueDate() {
		return this.itmhDueDate;
	}

	public void setItmhDueDate(Date itmhDueDate) {
		this.itmhDueDate = itmhDueDate;
	}

	public Date getItmhExpRec() {
		return this.itmhExpRec;
	}

	public void setItmhExpRec(Date itmhExpRec) {
		this.itmhExpRec = itmhExpRec;
	}

	public Boolean getItmhFixPr() {
		return this.itmhFixPr;
	}

	public void setItmhFixPr(Boolean itmhFixPr) {
		this.itmhFixPr = itmhFixPr;
	}

	public Boolean getItmhRouteGen() {
		return this.itmhRouteGen;
	}

	public void setItmhRouteGen(Boolean itmhRouteGen) {
		this.itmhRouteGen = itmhRouteGen;
	}

	public String getItmhSaSv() {
		return this.itmhSaSv;
	}

	public void setItmhSaSv(String itmhSaSv) {
		this.itmhSaSv = itmhSaSv;
	}

	public String getItmhSvcType() {
		return this.itmhSvcType;
	}

	public void setItmhSvcType(String itmhSvcType) {
		this.itmhSvcType = itmhSvcType;
	}

	public Boolean getItmhTaxable() {
		return this.itmhTaxable;
	}

	public void setItmhTaxable(Boolean itmhTaxable) {
		this.itmhTaxable = itmhTaxable;
	}

	public String getItmhWarrSv() {
		return this.itmhWarrSv;
	}

	public void setItmhWarrSv(String itmhWarrSv) {
		this.itmhWarrSv = itmhWarrSv;
	}

	public String getItmhQadc05() {
		return this.itmhQadc05;
	}

	public void setItmhQadc05(String itmhQadc05) {
		this.itmhQadc05 = itmhQadc05;
	}

	public String getItmhQadc06() {
		return this.itmhQadc06;
	}

	public void setItmhQadc06(String itmhQadc06) {
		this.itmhQadc06 = itmhQadc06;
	}

	public Date getItmhOpnDate() {
		return this.itmhOpnDate;
	}

	public void setItmhOpnDate(Date itmhOpnDate) {
		this.itmhOpnDate = itmhOpnDate;
	}

	public String getItmhStjobTime() {
		return this.itmhStjobTime;
	}

	public void setItmhStjobTime(String itmhStjobTime) {
		this.itmhStjobTime = itmhStjobTime;
	}

	public Double getItmhFixedPrice() {
		return this.itmhFixedPrice;
	}

	public void setItmhFixedPrice(Double itmhFixedPrice) {
		this.itmhFixedPrice = itmhFixedPrice;
	}

	public Boolean getItmhBillDetail() {
		return this.itmhBillDetail;
	}

	public void setItmhBillDetail(Boolean itmhBillDetail) {
		this.itmhBillDetail = itmhBillDetail;
	}

	public Boolean getItmhUnprocessed() {
		return this.itmhUnprocessed;
	}

	public void setItmhUnprocessed(Boolean itmhUnprocessed) {
		this.itmhUnprocessed = itmhUnprocessed;
	}

	public Boolean getItmhInvoiced() {
		return this.itmhInvoiced;
	}

	public void setItmhInvoiced(Boolean itmhInvoiced) {
		this.itmhInvoiced = itmhInvoiced;
	}

	public Boolean getItmhUninvoiced() {
		return this.itmhUninvoiced;
	}

	public void setItmhUninvoiced(Boolean itmhUninvoiced) {
		this.itmhUninvoiced = itmhUninvoiced;
	}

	public String getItmhEstTime() {
		return this.itmhEstTime;
	}

	public void setItmhEstTime(String itmhEstTime) {
		this.itmhEstTime = itmhEstTime;
	}

	public Boolean getItmhRecorded() {
		return this.itmhRecorded;
	}

	public void setItmhRecorded(Boolean itmhRecorded) {
		this.itmhRecorded = itmhRecorded;
	}

	public Double getItmhQtyChg() {
		return this.itmhQtyChg;
	}

	public void setItmhQtyChg(Double itmhQtyChg) {
		this.itmhQtyChg = itmhQtyChg;
	}

	public String getItmhTag() {
		return this.itmhTag;
	}

	public void setItmhTag(String itmhTag) {
		this.itmhTag = itmhTag;
	}

	public String getItmhRrcNbr() {
		return this.itmhRrcNbr;
	}

	public void setItmhRrcNbr(String itmhRrcNbr) {
		this.itmhRrcNbr = itmhRrcNbr;
	}

	public Integer getItmhRrcSeq() {
		return this.itmhRrcSeq;
	}

	public void setItmhRrcSeq(Integer itmhRrcSeq) {
		this.itmhRrcSeq = itmhRrcSeq;
	}

	public Boolean getItmhSepDoc() {
		return this.itmhSepDoc;
	}

	public void setItmhSepDoc(Boolean itmhSepDoc) {
		this.itmhSepDoc = itmhSepDoc;
	}

	public String getItmhSite() {
		return this.itmhSite;
	}

	public void setItmhSite(String itmhSite) {
		this.itmhSite = itmhSite;
	}

	public String getItmhLoc() {
		return this.itmhLoc;
	}

	public void setItmhLoc(String itmhLoc) {
		this.itmhLoc = itmhLoc;
	}

	public Boolean getItmhUpdIsb() {
		return this.itmhUpdIsb;
	}

	public void setItmhUpdIsb(Boolean itmhUpdIsb) {
		this.itmhUpdIsb = itmhUpdIsb;
	}

	public String getItmhModUserid() {
		return this.itmhModUserid;
	}

	public void setItmhModUserid(String itmhModUserid) {
		this.itmhModUserid = itmhModUserid;
	}

	public Date getItmhModDate() {
		return this.itmhModDate;
	}

	public void setItmhModDate(Date itmhModDate) {
		this.itmhModDate = itmhModDate;
	}

	public String getItmhTaxEnv() {
		return this.itmhTaxEnv;
	}

	public void setItmhTaxEnv(String itmhTaxEnv) {
		this.itmhTaxEnv = itmhTaxEnv;
	}

	public Boolean getItmhTaxIn() {
		return this.itmhTaxIn;
	}

	public void setItmhTaxIn(Boolean itmhTaxIn) {
		this.itmhTaxIn = itmhTaxIn;
	}

	public String getItmhPrList() {
		return this.itmhPrList;
	}

	public void setItmhPrList(String itmhPrList) {
		this.itmhPrList = itmhPrList;
	}

	public String getItmhProdLine() {
		return this.itmhProdLine;
	}

	public void setItmhProdLine(String itmhProdLine) {
		this.itmhProdLine = itmhProdLine;
	}

	public Boolean getItmhOverrideLmt() {
		return this.itmhOverrideLmt;
	}

	public void setItmhOverrideLmt(Boolean itmhOverrideLmt) {
		this.itmhOverrideLmt = itmhOverrideLmt;
	}

	public String getItmhEuNbr() {
		return this.itmhEuNbr;
	}

	public void setItmhEuNbr(String itmhEuNbr) {
		this.itmhEuNbr = itmhEuNbr;
	}

	public Boolean getItmhPst() {
		return this.itmhPst;
	}

	public void setItmhPst(Boolean itmhPst) {
		this.itmhPst = itmhPst;
	}

	public String getItmhAcct() {
		return this.itmhAcct;
	}

	public void setItmhAcct(String itmhAcct) {
		this.itmhAcct = itmhAcct;
	}

	public String getItmhSub() {
		return this.itmhSub;
	}

	public void setItmhSub(String itmhSub) {
		this.itmhSub = itmhSub;
	}

	public String getItmhCc() {
		return this.itmhCc;
	}

	public void setItmhCc(String itmhCc) {
		this.itmhCc = itmhCc;
	}

	public String getItmhProject() {
		return this.itmhProject;
	}

	public void setItmhProject(String itmhProject) {
		this.itmhProject = itmhProject;
	}

	public String getItmhDscAcct() {
		return this.itmhDscAcct;
	}

	public void setItmhDscAcct(String itmhDscAcct) {
		this.itmhDscAcct = itmhDscAcct;
	}

	public String getItmhDscSub() {
		return this.itmhDscSub;
	}

	public void setItmhDscSub(String itmhDscSub) {
		this.itmhDscSub = itmhDscSub;
	}

	public String getItmhDscCc() {
		return this.itmhDscCc;
	}

	public void setItmhDscCc(String itmhDscCc) {
		this.itmhDscCc = itmhDscCc;
	}

	public String getItmhDscProject() {
		return this.itmhDscProject;
	}

	public void setItmhDscProject(String itmhDscProject) {
		this.itmhDscProject = itmhDscProject;
	}

	public Double getOidItmhHist() {
		return this.oidItmhHist;
	}

	public void setOidItmhHist(Double oidItmhHist) {
		this.oidItmhHist = oidItmhHist;
	}

}