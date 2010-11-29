package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractItmDet entity provides the base persistence definition of the ItmDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractItmDet implements java.io.Serializable {

	// Fields

	private ItmDetId id;
	private String itmPart;
	private String itmRev;
	private Integer itmCmtindx;
	private String itmSerial;
	private Integer itmRef;
	private String itmUser1;
	private String itmUser2;
	private String itmQadc06;
	private String itmQadc05;
	private Boolean itmBillDetail;
	private String itmBomCode;
	private Boolean itmBomGen;
	private String itmCaIntType;
	private Date itmCompDate;
	private String itmDesc;
	private String itmEngCode;
	private Date itmStdownDate;
	private String itmNxtAct;
	private Date itmNxtDate;
	private String itmNxtTime;
	private Date itmEndownDate;
	private Double itmQtyCall;
	private Double itmQtyRcRec;
	private Double itmQtyRcShip;
	private Double itmQtyRec;
	private Double itmQtyShip;
	private Date itmRecDate;
	private String itmRoute;
	private Boolean itmRouteGen;
	private Integer itmSadLine;
	private String itmSaNbr;
	private Date itmShipDate;
	private String itmStatus;
	private String itmSvcType;
	private String itmSvCode;
	private Boolean itmTaxable;
	private String itmTaxc;
	private String itmTaxUsage;
	private String itmChr01;
	private String itmChr02;
	private String itmChr03;
	private String itmChr04;
	private Double itmDec01;
	private Double itmDec02;
	private Double itmDec03;
	private Date itmDte01;
	private Date itmDte02;
	private Date itmDte03;
	private Boolean itmLog01;
	private Boolean itmLog02;
	private Boolean itmLog03;
	private String itmQadc01;
	private String itmQadc02;
	private String itmQadc03;
	private String itmQadc04;
	private Date itmQadd01;
	private Date itmQadd02;
	private Date itmQadd03;
	private Double itmQadde01;
	private Double itmQadde02;
	private Double itmQadde03;
	private Boolean itmQadl01;
	private Boolean itmQadl02;
	private Boolean itmQadl03;
	private Boolean itmUnprocessed;
	private Boolean itmInvoiced;
	private Boolean itmUninvoiced;
	private Date itmExpRec;
	private Boolean itmRecorded;
	private Date itmDueDate;
	private String itmEndownTime;
	private String itmWarrSv;
	private String itmSaSv;
	private Boolean itmFixPr;
	private String itmPrList;
	private String itmStdownTime;
	private Date itmStjobDate;
	private String itmStjobTime;
	private Double itmQtyChg;
	private String itmTag;
	private String itmRrcNbr;
	private Integer itmRrcSeq;
	private Boolean itmSepDoc;
	private String itmSite;
	private String itmLoc;
	private Double itmFixedPrice;
	private Boolean itmUpdIsb;
	private String itmModUserid;
	private Date itmModDate;
	private String itmTaxEnv;
	private Boolean itmTaxIn;
	private String itmEstTime;
	private String itmProdLine;
	private Boolean itmOverrideLmt;
	private String itmEuNbr;
	private Boolean itmPst;
	private String itmAcct;
	private String itmSub;
	private String itmCc;
	private String itmProject;
	private String itmDscAcct;
	private String itmDscSub;
	private String itmDscCc;
	private String itmDscProject;
	private Double oidItmDet;

	// Constructors

	/** default constructor */
	public AbstractItmDet() {
	}

	/** minimal constructor */
	public AbstractItmDet(ItmDetId id, Double oidItmDet) {
		this.id = id;
		this.oidItmDet = oidItmDet;
	}

	/** full constructor */
	public AbstractItmDet(ItmDetId id, String itmPart, String itmRev,
			Integer itmCmtindx, String itmSerial, Integer itmRef,
			String itmUser1, String itmUser2, String itmQadc06,
			String itmQadc05, Boolean itmBillDetail, String itmBomCode,
			Boolean itmBomGen, String itmCaIntType, Date itmCompDate,
			String itmDesc, String itmEngCode, Date itmStdownDate,
			String itmNxtAct, Date itmNxtDate, String itmNxtTime,
			Date itmEndownDate, Double itmQtyCall, Double itmQtyRcRec,
			Double itmQtyRcShip, Double itmQtyRec, Double itmQtyShip,
			Date itmRecDate, String itmRoute, Boolean itmRouteGen,
			Integer itmSadLine, String itmSaNbr, Date itmShipDate,
			String itmStatus, String itmSvcType, String itmSvCode,
			Boolean itmTaxable, String itmTaxc, String itmTaxUsage,
			String itmChr01, String itmChr02, String itmChr03, String itmChr04,
			Double itmDec01, Double itmDec02, Double itmDec03, Date itmDte01,
			Date itmDte02, Date itmDte03, Boolean itmLog01, Boolean itmLog02,
			Boolean itmLog03, String itmQadc01, String itmQadc02,
			String itmQadc03, String itmQadc04, Date itmQadd01, Date itmQadd02,
			Date itmQadd03, Double itmQadde01, Double itmQadde02,
			Double itmQadde03, Boolean itmQadl01, Boolean itmQadl02,
			Boolean itmQadl03, Boolean itmUnprocessed, Boolean itmInvoiced,
			Boolean itmUninvoiced, Date itmExpRec, Boolean itmRecorded,
			Date itmDueDate, String itmEndownTime, String itmWarrSv,
			String itmSaSv, Boolean itmFixPr, String itmPrList,
			String itmStdownTime, Date itmStjobDate, String itmStjobTime,
			Double itmQtyChg, String itmTag, String itmRrcNbr,
			Integer itmRrcSeq, Boolean itmSepDoc, String itmSite,
			String itmLoc, Double itmFixedPrice, Boolean itmUpdIsb,
			String itmModUserid, Date itmModDate, String itmTaxEnv,
			Boolean itmTaxIn, String itmEstTime, String itmProdLine,
			Boolean itmOverrideLmt, String itmEuNbr, Boolean itmPst,
			String itmAcct, String itmSub, String itmCc, String itmProject,
			String itmDscAcct, String itmDscSub, String itmDscCc,
			String itmDscProject, Double oidItmDet) {
		this.id = id;
		this.itmPart = itmPart;
		this.itmRev = itmRev;
		this.itmCmtindx = itmCmtindx;
		this.itmSerial = itmSerial;
		this.itmRef = itmRef;
		this.itmUser1 = itmUser1;
		this.itmUser2 = itmUser2;
		this.itmQadc06 = itmQadc06;
		this.itmQadc05 = itmQadc05;
		this.itmBillDetail = itmBillDetail;
		this.itmBomCode = itmBomCode;
		this.itmBomGen = itmBomGen;
		this.itmCaIntType = itmCaIntType;
		this.itmCompDate = itmCompDate;
		this.itmDesc = itmDesc;
		this.itmEngCode = itmEngCode;
		this.itmStdownDate = itmStdownDate;
		this.itmNxtAct = itmNxtAct;
		this.itmNxtDate = itmNxtDate;
		this.itmNxtTime = itmNxtTime;
		this.itmEndownDate = itmEndownDate;
		this.itmQtyCall = itmQtyCall;
		this.itmQtyRcRec = itmQtyRcRec;
		this.itmQtyRcShip = itmQtyRcShip;
		this.itmQtyRec = itmQtyRec;
		this.itmQtyShip = itmQtyShip;
		this.itmRecDate = itmRecDate;
		this.itmRoute = itmRoute;
		this.itmRouteGen = itmRouteGen;
		this.itmSadLine = itmSadLine;
		this.itmSaNbr = itmSaNbr;
		this.itmShipDate = itmShipDate;
		this.itmStatus = itmStatus;
		this.itmSvcType = itmSvcType;
		this.itmSvCode = itmSvCode;
		this.itmTaxable = itmTaxable;
		this.itmTaxc = itmTaxc;
		this.itmTaxUsage = itmTaxUsage;
		this.itmChr01 = itmChr01;
		this.itmChr02 = itmChr02;
		this.itmChr03 = itmChr03;
		this.itmChr04 = itmChr04;
		this.itmDec01 = itmDec01;
		this.itmDec02 = itmDec02;
		this.itmDec03 = itmDec03;
		this.itmDte01 = itmDte01;
		this.itmDte02 = itmDte02;
		this.itmDte03 = itmDte03;
		this.itmLog01 = itmLog01;
		this.itmLog02 = itmLog02;
		this.itmLog03 = itmLog03;
		this.itmQadc01 = itmQadc01;
		this.itmQadc02 = itmQadc02;
		this.itmQadc03 = itmQadc03;
		this.itmQadc04 = itmQadc04;
		this.itmQadd01 = itmQadd01;
		this.itmQadd02 = itmQadd02;
		this.itmQadd03 = itmQadd03;
		this.itmQadde01 = itmQadde01;
		this.itmQadde02 = itmQadde02;
		this.itmQadde03 = itmQadde03;
		this.itmQadl01 = itmQadl01;
		this.itmQadl02 = itmQadl02;
		this.itmQadl03 = itmQadl03;
		this.itmUnprocessed = itmUnprocessed;
		this.itmInvoiced = itmInvoiced;
		this.itmUninvoiced = itmUninvoiced;
		this.itmExpRec = itmExpRec;
		this.itmRecorded = itmRecorded;
		this.itmDueDate = itmDueDate;
		this.itmEndownTime = itmEndownTime;
		this.itmWarrSv = itmWarrSv;
		this.itmSaSv = itmSaSv;
		this.itmFixPr = itmFixPr;
		this.itmPrList = itmPrList;
		this.itmStdownTime = itmStdownTime;
		this.itmStjobDate = itmStjobDate;
		this.itmStjobTime = itmStjobTime;
		this.itmQtyChg = itmQtyChg;
		this.itmTag = itmTag;
		this.itmRrcNbr = itmRrcNbr;
		this.itmRrcSeq = itmRrcSeq;
		this.itmSepDoc = itmSepDoc;
		this.itmSite = itmSite;
		this.itmLoc = itmLoc;
		this.itmFixedPrice = itmFixedPrice;
		this.itmUpdIsb = itmUpdIsb;
		this.itmModUserid = itmModUserid;
		this.itmModDate = itmModDate;
		this.itmTaxEnv = itmTaxEnv;
		this.itmTaxIn = itmTaxIn;
		this.itmEstTime = itmEstTime;
		this.itmProdLine = itmProdLine;
		this.itmOverrideLmt = itmOverrideLmt;
		this.itmEuNbr = itmEuNbr;
		this.itmPst = itmPst;
		this.itmAcct = itmAcct;
		this.itmSub = itmSub;
		this.itmCc = itmCc;
		this.itmProject = itmProject;
		this.itmDscAcct = itmDscAcct;
		this.itmDscSub = itmDscSub;
		this.itmDscCc = itmDscCc;
		this.itmDscProject = itmDscProject;
		this.oidItmDet = oidItmDet;
	}

	// Property accessors

	public ItmDetId getId() {
		return this.id;
	}

	public void setId(ItmDetId id) {
		this.id = id;
	}

	public String getItmPart() {
		return this.itmPart;
	}

	public void setItmPart(String itmPart) {
		this.itmPart = itmPart;
	}

	public String getItmRev() {
		return this.itmRev;
	}

	public void setItmRev(String itmRev) {
		this.itmRev = itmRev;
	}

	public Integer getItmCmtindx() {
		return this.itmCmtindx;
	}

	public void setItmCmtindx(Integer itmCmtindx) {
		this.itmCmtindx = itmCmtindx;
	}

	public String getItmSerial() {
		return this.itmSerial;
	}

	public void setItmSerial(String itmSerial) {
		this.itmSerial = itmSerial;
	}

	public Integer getItmRef() {
		return this.itmRef;
	}

	public void setItmRef(Integer itmRef) {
		this.itmRef = itmRef;
	}

	public String getItmUser1() {
		return this.itmUser1;
	}

	public void setItmUser1(String itmUser1) {
		this.itmUser1 = itmUser1;
	}

	public String getItmUser2() {
		return this.itmUser2;
	}

	public void setItmUser2(String itmUser2) {
		this.itmUser2 = itmUser2;
	}

	public String getItmQadc06() {
		return this.itmQadc06;
	}

	public void setItmQadc06(String itmQadc06) {
		this.itmQadc06 = itmQadc06;
	}

	public String getItmQadc05() {
		return this.itmQadc05;
	}

	public void setItmQadc05(String itmQadc05) {
		this.itmQadc05 = itmQadc05;
	}

	public Boolean getItmBillDetail() {
		return this.itmBillDetail;
	}

	public void setItmBillDetail(Boolean itmBillDetail) {
		this.itmBillDetail = itmBillDetail;
	}

	public String getItmBomCode() {
		return this.itmBomCode;
	}

	public void setItmBomCode(String itmBomCode) {
		this.itmBomCode = itmBomCode;
	}

	public Boolean getItmBomGen() {
		return this.itmBomGen;
	}

	public void setItmBomGen(Boolean itmBomGen) {
		this.itmBomGen = itmBomGen;
	}

	public String getItmCaIntType() {
		return this.itmCaIntType;
	}

	public void setItmCaIntType(String itmCaIntType) {
		this.itmCaIntType = itmCaIntType;
	}

	public Date getItmCompDate() {
		return this.itmCompDate;
	}

	public void setItmCompDate(Date itmCompDate) {
		this.itmCompDate = itmCompDate;
	}

	public String getItmDesc() {
		return this.itmDesc;
	}

	public void setItmDesc(String itmDesc) {
		this.itmDesc = itmDesc;
	}

	public String getItmEngCode() {
		return this.itmEngCode;
	}

	public void setItmEngCode(String itmEngCode) {
		this.itmEngCode = itmEngCode;
	}

	public Date getItmStdownDate() {
		return this.itmStdownDate;
	}

	public void setItmStdownDate(Date itmStdownDate) {
		this.itmStdownDate = itmStdownDate;
	}

	public String getItmNxtAct() {
		return this.itmNxtAct;
	}

	public void setItmNxtAct(String itmNxtAct) {
		this.itmNxtAct = itmNxtAct;
	}

	public Date getItmNxtDate() {
		return this.itmNxtDate;
	}

	public void setItmNxtDate(Date itmNxtDate) {
		this.itmNxtDate = itmNxtDate;
	}

	public String getItmNxtTime() {
		return this.itmNxtTime;
	}

	public void setItmNxtTime(String itmNxtTime) {
		this.itmNxtTime = itmNxtTime;
	}

	public Date getItmEndownDate() {
		return this.itmEndownDate;
	}

	public void setItmEndownDate(Date itmEndownDate) {
		this.itmEndownDate = itmEndownDate;
	}

	public Double getItmQtyCall() {
		return this.itmQtyCall;
	}

	public void setItmQtyCall(Double itmQtyCall) {
		this.itmQtyCall = itmQtyCall;
	}

	public Double getItmQtyRcRec() {
		return this.itmQtyRcRec;
	}

	public void setItmQtyRcRec(Double itmQtyRcRec) {
		this.itmQtyRcRec = itmQtyRcRec;
	}

	public Double getItmQtyRcShip() {
		return this.itmQtyRcShip;
	}

	public void setItmQtyRcShip(Double itmQtyRcShip) {
		this.itmQtyRcShip = itmQtyRcShip;
	}

	public Double getItmQtyRec() {
		return this.itmQtyRec;
	}

	public void setItmQtyRec(Double itmQtyRec) {
		this.itmQtyRec = itmQtyRec;
	}

	public Double getItmQtyShip() {
		return this.itmQtyShip;
	}

	public void setItmQtyShip(Double itmQtyShip) {
		this.itmQtyShip = itmQtyShip;
	}

	public Date getItmRecDate() {
		return this.itmRecDate;
	}

	public void setItmRecDate(Date itmRecDate) {
		this.itmRecDate = itmRecDate;
	}

	public String getItmRoute() {
		return this.itmRoute;
	}

	public void setItmRoute(String itmRoute) {
		this.itmRoute = itmRoute;
	}

	public Boolean getItmRouteGen() {
		return this.itmRouteGen;
	}

	public void setItmRouteGen(Boolean itmRouteGen) {
		this.itmRouteGen = itmRouteGen;
	}

	public Integer getItmSadLine() {
		return this.itmSadLine;
	}

	public void setItmSadLine(Integer itmSadLine) {
		this.itmSadLine = itmSadLine;
	}

	public String getItmSaNbr() {
		return this.itmSaNbr;
	}

	public void setItmSaNbr(String itmSaNbr) {
		this.itmSaNbr = itmSaNbr;
	}

	public Date getItmShipDate() {
		return this.itmShipDate;
	}

	public void setItmShipDate(Date itmShipDate) {
		this.itmShipDate = itmShipDate;
	}

	public String getItmStatus() {
		return this.itmStatus;
	}

	public void setItmStatus(String itmStatus) {
		this.itmStatus = itmStatus;
	}

	public String getItmSvcType() {
		return this.itmSvcType;
	}

	public void setItmSvcType(String itmSvcType) {
		this.itmSvcType = itmSvcType;
	}

	public String getItmSvCode() {
		return this.itmSvCode;
	}

	public void setItmSvCode(String itmSvCode) {
		this.itmSvCode = itmSvCode;
	}

	public Boolean getItmTaxable() {
		return this.itmTaxable;
	}

	public void setItmTaxable(Boolean itmTaxable) {
		this.itmTaxable = itmTaxable;
	}

	public String getItmTaxc() {
		return this.itmTaxc;
	}

	public void setItmTaxc(String itmTaxc) {
		this.itmTaxc = itmTaxc;
	}

	public String getItmTaxUsage() {
		return this.itmTaxUsage;
	}

	public void setItmTaxUsage(String itmTaxUsage) {
		this.itmTaxUsage = itmTaxUsage;
	}

	public String getItmChr01() {
		return this.itmChr01;
	}

	public void setItmChr01(String itmChr01) {
		this.itmChr01 = itmChr01;
	}

	public String getItmChr02() {
		return this.itmChr02;
	}

	public void setItmChr02(String itmChr02) {
		this.itmChr02 = itmChr02;
	}

	public String getItmChr03() {
		return this.itmChr03;
	}

	public void setItmChr03(String itmChr03) {
		this.itmChr03 = itmChr03;
	}

	public String getItmChr04() {
		return this.itmChr04;
	}

	public void setItmChr04(String itmChr04) {
		this.itmChr04 = itmChr04;
	}

	public Double getItmDec01() {
		return this.itmDec01;
	}

	public void setItmDec01(Double itmDec01) {
		this.itmDec01 = itmDec01;
	}

	public Double getItmDec02() {
		return this.itmDec02;
	}

	public void setItmDec02(Double itmDec02) {
		this.itmDec02 = itmDec02;
	}

	public Double getItmDec03() {
		return this.itmDec03;
	}

	public void setItmDec03(Double itmDec03) {
		this.itmDec03 = itmDec03;
	}

	public Date getItmDte01() {
		return this.itmDte01;
	}

	public void setItmDte01(Date itmDte01) {
		this.itmDte01 = itmDte01;
	}

	public Date getItmDte02() {
		return this.itmDte02;
	}

	public void setItmDte02(Date itmDte02) {
		this.itmDte02 = itmDte02;
	}

	public Date getItmDte03() {
		return this.itmDte03;
	}

	public void setItmDte03(Date itmDte03) {
		this.itmDte03 = itmDte03;
	}

	public Boolean getItmLog01() {
		return this.itmLog01;
	}

	public void setItmLog01(Boolean itmLog01) {
		this.itmLog01 = itmLog01;
	}

	public Boolean getItmLog02() {
		return this.itmLog02;
	}

	public void setItmLog02(Boolean itmLog02) {
		this.itmLog02 = itmLog02;
	}

	public Boolean getItmLog03() {
		return this.itmLog03;
	}

	public void setItmLog03(Boolean itmLog03) {
		this.itmLog03 = itmLog03;
	}

	public String getItmQadc01() {
		return this.itmQadc01;
	}

	public void setItmQadc01(String itmQadc01) {
		this.itmQadc01 = itmQadc01;
	}

	public String getItmQadc02() {
		return this.itmQadc02;
	}

	public void setItmQadc02(String itmQadc02) {
		this.itmQadc02 = itmQadc02;
	}

	public String getItmQadc03() {
		return this.itmQadc03;
	}

	public void setItmQadc03(String itmQadc03) {
		this.itmQadc03 = itmQadc03;
	}

	public String getItmQadc04() {
		return this.itmQadc04;
	}

	public void setItmQadc04(String itmQadc04) {
		this.itmQadc04 = itmQadc04;
	}

	public Date getItmQadd01() {
		return this.itmQadd01;
	}

	public void setItmQadd01(Date itmQadd01) {
		this.itmQadd01 = itmQadd01;
	}

	public Date getItmQadd02() {
		return this.itmQadd02;
	}

	public void setItmQadd02(Date itmQadd02) {
		this.itmQadd02 = itmQadd02;
	}

	public Date getItmQadd03() {
		return this.itmQadd03;
	}

	public void setItmQadd03(Date itmQadd03) {
		this.itmQadd03 = itmQadd03;
	}

	public Double getItmQadde01() {
		return this.itmQadde01;
	}

	public void setItmQadde01(Double itmQadde01) {
		this.itmQadde01 = itmQadde01;
	}

	public Double getItmQadde02() {
		return this.itmQadde02;
	}

	public void setItmQadde02(Double itmQadde02) {
		this.itmQadde02 = itmQadde02;
	}

	public Double getItmQadde03() {
		return this.itmQadde03;
	}

	public void setItmQadde03(Double itmQadde03) {
		this.itmQadde03 = itmQadde03;
	}

	public Boolean getItmQadl01() {
		return this.itmQadl01;
	}

	public void setItmQadl01(Boolean itmQadl01) {
		this.itmQadl01 = itmQadl01;
	}

	public Boolean getItmQadl02() {
		return this.itmQadl02;
	}

	public void setItmQadl02(Boolean itmQadl02) {
		this.itmQadl02 = itmQadl02;
	}

	public Boolean getItmQadl03() {
		return this.itmQadl03;
	}

	public void setItmQadl03(Boolean itmQadl03) {
		this.itmQadl03 = itmQadl03;
	}

	public Boolean getItmUnprocessed() {
		return this.itmUnprocessed;
	}

	public void setItmUnprocessed(Boolean itmUnprocessed) {
		this.itmUnprocessed = itmUnprocessed;
	}

	public Boolean getItmInvoiced() {
		return this.itmInvoiced;
	}

	public void setItmInvoiced(Boolean itmInvoiced) {
		this.itmInvoiced = itmInvoiced;
	}

	public Boolean getItmUninvoiced() {
		return this.itmUninvoiced;
	}

	public void setItmUninvoiced(Boolean itmUninvoiced) {
		this.itmUninvoiced = itmUninvoiced;
	}

	public Date getItmExpRec() {
		return this.itmExpRec;
	}

	public void setItmExpRec(Date itmExpRec) {
		this.itmExpRec = itmExpRec;
	}

	public Boolean getItmRecorded() {
		return this.itmRecorded;
	}

	public void setItmRecorded(Boolean itmRecorded) {
		this.itmRecorded = itmRecorded;
	}

	public Date getItmDueDate() {
		return this.itmDueDate;
	}

	public void setItmDueDate(Date itmDueDate) {
		this.itmDueDate = itmDueDate;
	}

	public String getItmEndownTime() {
		return this.itmEndownTime;
	}

	public void setItmEndownTime(String itmEndownTime) {
		this.itmEndownTime = itmEndownTime;
	}

	public String getItmWarrSv() {
		return this.itmWarrSv;
	}

	public void setItmWarrSv(String itmWarrSv) {
		this.itmWarrSv = itmWarrSv;
	}

	public String getItmSaSv() {
		return this.itmSaSv;
	}

	public void setItmSaSv(String itmSaSv) {
		this.itmSaSv = itmSaSv;
	}

	public Boolean getItmFixPr() {
		return this.itmFixPr;
	}

	public void setItmFixPr(Boolean itmFixPr) {
		this.itmFixPr = itmFixPr;
	}

	public String getItmPrList() {
		return this.itmPrList;
	}

	public void setItmPrList(String itmPrList) {
		this.itmPrList = itmPrList;
	}

	public String getItmStdownTime() {
		return this.itmStdownTime;
	}

	public void setItmStdownTime(String itmStdownTime) {
		this.itmStdownTime = itmStdownTime;
	}

	public Date getItmStjobDate() {
		return this.itmStjobDate;
	}

	public void setItmStjobDate(Date itmStjobDate) {
		this.itmStjobDate = itmStjobDate;
	}

	public String getItmStjobTime() {
		return this.itmStjobTime;
	}

	public void setItmStjobTime(String itmStjobTime) {
		this.itmStjobTime = itmStjobTime;
	}

	public Double getItmQtyChg() {
		return this.itmQtyChg;
	}

	public void setItmQtyChg(Double itmQtyChg) {
		this.itmQtyChg = itmQtyChg;
	}

	public String getItmTag() {
		return this.itmTag;
	}

	public void setItmTag(String itmTag) {
		this.itmTag = itmTag;
	}

	public String getItmRrcNbr() {
		return this.itmRrcNbr;
	}

	public void setItmRrcNbr(String itmRrcNbr) {
		this.itmRrcNbr = itmRrcNbr;
	}

	public Integer getItmRrcSeq() {
		return this.itmRrcSeq;
	}

	public void setItmRrcSeq(Integer itmRrcSeq) {
		this.itmRrcSeq = itmRrcSeq;
	}

	public Boolean getItmSepDoc() {
		return this.itmSepDoc;
	}

	public void setItmSepDoc(Boolean itmSepDoc) {
		this.itmSepDoc = itmSepDoc;
	}

	public String getItmSite() {
		return this.itmSite;
	}

	public void setItmSite(String itmSite) {
		this.itmSite = itmSite;
	}

	public String getItmLoc() {
		return this.itmLoc;
	}

	public void setItmLoc(String itmLoc) {
		this.itmLoc = itmLoc;
	}

	public Double getItmFixedPrice() {
		return this.itmFixedPrice;
	}

	public void setItmFixedPrice(Double itmFixedPrice) {
		this.itmFixedPrice = itmFixedPrice;
	}

	public Boolean getItmUpdIsb() {
		return this.itmUpdIsb;
	}

	public void setItmUpdIsb(Boolean itmUpdIsb) {
		this.itmUpdIsb = itmUpdIsb;
	}

	public String getItmModUserid() {
		return this.itmModUserid;
	}

	public void setItmModUserid(String itmModUserid) {
		this.itmModUserid = itmModUserid;
	}

	public Date getItmModDate() {
		return this.itmModDate;
	}

	public void setItmModDate(Date itmModDate) {
		this.itmModDate = itmModDate;
	}

	public String getItmTaxEnv() {
		return this.itmTaxEnv;
	}

	public void setItmTaxEnv(String itmTaxEnv) {
		this.itmTaxEnv = itmTaxEnv;
	}

	public Boolean getItmTaxIn() {
		return this.itmTaxIn;
	}

	public void setItmTaxIn(Boolean itmTaxIn) {
		this.itmTaxIn = itmTaxIn;
	}

	public String getItmEstTime() {
		return this.itmEstTime;
	}

	public void setItmEstTime(String itmEstTime) {
		this.itmEstTime = itmEstTime;
	}

	public String getItmProdLine() {
		return this.itmProdLine;
	}

	public void setItmProdLine(String itmProdLine) {
		this.itmProdLine = itmProdLine;
	}

	public Boolean getItmOverrideLmt() {
		return this.itmOverrideLmt;
	}

	public void setItmOverrideLmt(Boolean itmOverrideLmt) {
		this.itmOverrideLmt = itmOverrideLmt;
	}

	public String getItmEuNbr() {
		return this.itmEuNbr;
	}

	public void setItmEuNbr(String itmEuNbr) {
		this.itmEuNbr = itmEuNbr;
	}

	public Boolean getItmPst() {
		return this.itmPst;
	}

	public void setItmPst(Boolean itmPst) {
		this.itmPst = itmPst;
	}

	public String getItmAcct() {
		return this.itmAcct;
	}

	public void setItmAcct(String itmAcct) {
		this.itmAcct = itmAcct;
	}

	public String getItmSub() {
		return this.itmSub;
	}

	public void setItmSub(String itmSub) {
		this.itmSub = itmSub;
	}

	public String getItmCc() {
		return this.itmCc;
	}

	public void setItmCc(String itmCc) {
		this.itmCc = itmCc;
	}

	public String getItmProject() {
		return this.itmProject;
	}

	public void setItmProject(String itmProject) {
		this.itmProject = itmProject;
	}

	public String getItmDscAcct() {
		return this.itmDscAcct;
	}

	public void setItmDscAcct(String itmDscAcct) {
		this.itmDscAcct = itmDscAcct;
	}

	public String getItmDscSub() {
		return this.itmDscSub;
	}

	public void setItmDscSub(String itmDscSub) {
		this.itmDscSub = itmDscSub;
	}

	public String getItmDscCc() {
		return this.itmDscCc;
	}

	public void setItmDscCc(String itmDscCc) {
		this.itmDscCc = itmDscCc;
	}

	public String getItmDscProject() {
		return this.itmDscProject;
	}

	public void setItmDscProject(String itmDscProject) {
		this.itmDscProject = itmDscProject;
	}

	public Double getOidItmDet() {
		return this.oidItmDet;
	}

	public void setOidItmDet(Double oidItmDet) {
		this.oidItmDet = oidItmDet;
	}

}