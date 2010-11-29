package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIehHist entity provides the base persistence definition of the
 * IehHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIehHist implements java.io.Serializable {

	// Fields

	private IehHistId id;
	private String iehAddr;
	private String iehComCode;
	private String iehCtryDesdisp;
	private String iehCtryOrigin;
	private String iehAuthority;
	private String iehDeclPeriod;
	private String iehDeclYear;
	private Date iehDeclDate;
	private String iehDeclarant;
	private Boolean iehReported;
	private Date iehEffdate;
	private String iehFlow;
	private String iehInvCur;
	private Date iehInvDate;
	private Double iehInvAmtGl;
	private Double iehInvAmtCur;
	private Integer iehLine;
	private String iehModeTransp;
	private String iehNatTrans;
	private String iehNbr;
	private Double iehNetWt;
	private String iehNetWtUm;
	private String iehPart;
	private String iehPortArrdisp;
	private String iehPortTransh;
	private String iehProgram;
	private Double iehQty;
	private String iehQtyUm;
	private String iehRef;
	private Date iehRefDate;
	private String iehPstId;
	private String iehDeclCur;
	private String iehSite;
	private String iehStatProc;
	private Double iehStatVal;
	private Double iehSupplUnits;
	private String iehSupplUm;
	private String iehTermsDeliv;
	private String iehRegion;
	private Double iehDeclInvAmt;
	private String iehType;
	private String iehVoucher;
	private String iehUserid;
	private Date iehModDate;
	private Double iehDeclStatval;
	private Integer iehDeclarationId;
	private String iehChr01;
	private String iehChr02;
	private String iehChr03;
	private String iehChr04;
	private String iehChr05;
	private Double iehDec01;
	private Double iehDec02;
	private Double iehDec03;
	private Double iehDec04;
	private Double iehDec05;
	private Date iehDte01;
	private Date iehDte02;
	private Date iehDte03;
	private Date iehDte04;
	private Date iehDte05;
	private String iehDeclarantId;
	private String iehAgent;
	private String iehAgentId;
	private String iehQadc04;
	private String iehQadc05;
	private String iehQadc06;
	private String iehQadc07;
	private String iehQadc08;
	private String iehQadc09;
	private String iehQadc10;
	private Integer iehQadi01;
	private Double iehQadd01;
	private Double iehQadd02;
	private Double iehQadd03;
	private Double iehQadd04;
	private Double iehQadd05;
	private Double iehQadd06;
	private Boolean iehQadl01;
	private Boolean iehQadl02;
	private Date iehQadt01;
	private Date iehQadt02;
	private String iehUser1;
	private String iehUser2;
	private Boolean iehCorrection;
	private String iehOrigDoc;
	private Integer iehOrigMonth;
	private Integer iehOrigYear;
	private String iehAffiliation;
	private Boolean iehContainer;
	private Integer iehCsa;
	private String iehDeclRegion;
	private String iehItemSpec;
	private Integer iehPreference;
	private String iehReqNbr;
	private String iehShipvia;
	private Integer iehTrnbr;
	private Double oidIehHist;

	// Constructors

	/** default constructor */
	public AbstractIehHist() {
	}

	/** minimal constructor */
	public AbstractIehHist(IehHistId id, Date iehRefDate,
			Boolean iehCorrection, String iehOrigDoc, Integer iehOrigMonth,
			Integer iehOrigYear, String iehAffiliation, Boolean iehContainer,
			Integer iehCsa, String iehDeclRegion, String iehItemSpec,
			Integer iehPreference, String iehReqNbr, String iehShipvia,
			Integer iehTrnbr, Double oidIehHist) {
		this.id = id;
		this.iehRefDate = iehRefDate;
		this.iehCorrection = iehCorrection;
		this.iehOrigDoc = iehOrigDoc;
		this.iehOrigMonth = iehOrigMonth;
		this.iehOrigYear = iehOrigYear;
		this.iehAffiliation = iehAffiliation;
		this.iehContainer = iehContainer;
		this.iehCsa = iehCsa;
		this.iehDeclRegion = iehDeclRegion;
		this.iehItemSpec = iehItemSpec;
		this.iehPreference = iehPreference;
		this.iehReqNbr = iehReqNbr;
		this.iehShipvia = iehShipvia;
		this.iehTrnbr = iehTrnbr;
		this.oidIehHist = oidIehHist;
	}

	/** full constructor */
	public AbstractIehHist(IehHistId id, String iehAddr, String iehComCode,
			String iehCtryDesdisp, String iehCtryOrigin, String iehAuthority,
			String iehDeclPeriod, String iehDeclYear, Date iehDeclDate,
			String iehDeclarant, Boolean iehReported, Date iehEffdate,
			String iehFlow, String iehInvCur, Date iehInvDate,
			Double iehInvAmtGl, Double iehInvAmtCur, Integer iehLine,
			String iehModeTransp, String iehNatTrans, String iehNbr,
			Double iehNetWt, String iehNetWtUm, String iehPart,
			String iehPortArrdisp, String iehPortTransh, String iehProgram,
			Double iehQty, String iehQtyUm, String iehRef, Date iehRefDate,
			String iehPstId, String iehDeclCur, String iehSite,
			String iehStatProc, Double iehStatVal, Double iehSupplUnits,
			String iehSupplUm, String iehTermsDeliv, String iehRegion,
			Double iehDeclInvAmt, String iehType, String iehVoucher,
			String iehUserid, Date iehModDate, Double iehDeclStatval,
			Integer iehDeclarationId, String iehChr01, String iehChr02,
			String iehChr03, String iehChr04, String iehChr05, Double iehDec01,
			Double iehDec02, Double iehDec03, Double iehDec04, Double iehDec05,
			Date iehDte01, Date iehDte02, Date iehDte03, Date iehDte04,
			Date iehDte05, String iehDeclarantId, String iehAgent,
			String iehAgentId, String iehQadc04, String iehQadc05,
			String iehQadc06, String iehQadc07, String iehQadc08,
			String iehQadc09, String iehQadc10, Integer iehQadi01,
			Double iehQadd01, Double iehQadd02, Double iehQadd03,
			Double iehQadd04, Double iehQadd05, Double iehQadd06,
			Boolean iehQadl01, Boolean iehQadl02, Date iehQadt01,
			Date iehQadt02, String iehUser1, String iehUser2,
			Boolean iehCorrection, String iehOrigDoc, Integer iehOrigMonth,
			Integer iehOrigYear, String iehAffiliation, Boolean iehContainer,
			Integer iehCsa, String iehDeclRegion, String iehItemSpec,
			Integer iehPreference, String iehReqNbr, String iehShipvia,
			Integer iehTrnbr, Double oidIehHist) {
		this.id = id;
		this.iehAddr = iehAddr;
		this.iehComCode = iehComCode;
		this.iehCtryDesdisp = iehCtryDesdisp;
		this.iehCtryOrigin = iehCtryOrigin;
		this.iehAuthority = iehAuthority;
		this.iehDeclPeriod = iehDeclPeriod;
		this.iehDeclYear = iehDeclYear;
		this.iehDeclDate = iehDeclDate;
		this.iehDeclarant = iehDeclarant;
		this.iehReported = iehReported;
		this.iehEffdate = iehEffdate;
		this.iehFlow = iehFlow;
		this.iehInvCur = iehInvCur;
		this.iehInvDate = iehInvDate;
		this.iehInvAmtGl = iehInvAmtGl;
		this.iehInvAmtCur = iehInvAmtCur;
		this.iehLine = iehLine;
		this.iehModeTransp = iehModeTransp;
		this.iehNatTrans = iehNatTrans;
		this.iehNbr = iehNbr;
		this.iehNetWt = iehNetWt;
		this.iehNetWtUm = iehNetWtUm;
		this.iehPart = iehPart;
		this.iehPortArrdisp = iehPortArrdisp;
		this.iehPortTransh = iehPortTransh;
		this.iehProgram = iehProgram;
		this.iehQty = iehQty;
		this.iehQtyUm = iehQtyUm;
		this.iehRef = iehRef;
		this.iehRefDate = iehRefDate;
		this.iehPstId = iehPstId;
		this.iehDeclCur = iehDeclCur;
		this.iehSite = iehSite;
		this.iehStatProc = iehStatProc;
		this.iehStatVal = iehStatVal;
		this.iehSupplUnits = iehSupplUnits;
		this.iehSupplUm = iehSupplUm;
		this.iehTermsDeliv = iehTermsDeliv;
		this.iehRegion = iehRegion;
		this.iehDeclInvAmt = iehDeclInvAmt;
		this.iehType = iehType;
		this.iehVoucher = iehVoucher;
		this.iehUserid = iehUserid;
		this.iehModDate = iehModDate;
		this.iehDeclStatval = iehDeclStatval;
		this.iehDeclarationId = iehDeclarationId;
		this.iehChr01 = iehChr01;
		this.iehChr02 = iehChr02;
		this.iehChr03 = iehChr03;
		this.iehChr04 = iehChr04;
		this.iehChr05 = iehChr05;
		this.iehDec01 = iehDec01;
		this.iehDec02 = iehDec02;
		this.iehDec03 = iehDec03;
		this.iehDec04 = iehDec04;
		this.iehDec05 = iehDec05;
		this.iehDte01 = iehDte01;
		this.iehDte02 = iehDte02;
		this.iehDte03 = iehDte03;
		this.iehDte04 = iehDte04;
		this.iehDte05 = iehDte05;
		this.iehDeclarantId = iehDeclarantId;
		this.iehAgent = iehAgent;
		this.iehAgentId = iehAgentId;
		this.iehQadc04 = iehQadc04;
		this.iehQadc05 = iehQadc05;
		this.iehQadc06 = iehQadc06;
		this.iehQadc07 = iehQadc07;
		this.iehQadc08 = iehQadc08;
		this.iehQadc09 = iehQadc09;
		this.iehQadc10 = iehQadc10;
		this.iehQadi01 = iehQadi01;
		this.iehQadd01 = iehQadd01;
		this.iehQadd02 = iehQadd02;
		this.iehQadd03 = iehQadd03;
		this.iehQadd04 = iehQadd04;
		this.iehQadd05 = iehQadd05;
		this.iehQadd06 = iehQadd06;
		this.iehQadl01 = iehQadl01;
		this.iehQadl02 = iehQadl02;
		this.iehQadt01 = iehQadt01;
		this.iehQadt02 = iehQadt02;
		this.iehUser1 = iehUser1;
		this.iehUser2 = iehUser2;
		this.iehCorrection = iehCorrection;
		this.iehOrigDoc = iehOrigDoc;
		this.iehOrigMonth = iehOrigMonth;
		this.iehOrigYear = iehOrigYear;
		this.iehAffiliation = iehAffiliation;
		this.iehContainer = iehContainer;
		this.iehCsa = iehCsa;
		this.iehDeclRegion = iehDeclRegion;
		this.iehItemSpec = iehItemSpec;
		this.iehPreference = iehPreference;
		this.iehReqNbr = iehReqNbr;
		this.iehShipvia = iehShipvia;
		this.iehTrnbr = iehTrnbr;
		this.oidIehHist = oidIehHist;
	}

	// Property accessors

	public IehHistId getId() {
		return this.id;
	}

	public void setId(IehHistId id) {
		this.id = id;
	}

	public String getIehAddr() {
		return this.iehAddr;
	}

	public void setIehAddr(String iehAddr) {
		this.iehAddr = iehAddr;
	}

	public String getIehComCode() {
		return this.iehComCode;
	}

	public void setIehComCode(String iehComCode) {
		this.iehComCode = iehComCode;
	}

	public String getIehCtryDesdisp() {
		return this.iehCtryDesdisp;
	}

	public void setIehCtryDesdisp(String iehCtryDesdisp) {
		this.iehCtryDesdisp = iehCtryDesdisp;
	}

	public String getIehCtryOrigin() {
		return this.iehCtryOrigin;
	}

	public void setIehCtryOrigin(String iehCtryOrigin) {
		this.iehCtryOrigin = iehCtryOrigin;
	}

	public String getIehAuthority() {
		return this.iehAuthority;
	}

	public void setIehAuthority(String iehAuthority) {
		this.iehAuthority = iehAuthority;
	}

	public String getIehDeclPeriod() {
		return this.iehDeclPeriod;
	}

	public void setIehDeclPeriod(String iehDeclPeriod) {
		this.iehDeclPeriod = iehDeclPeriod;
	}

	public String getIehDeclYear() {
		return this.iehDeclYear;
	}

	public void setIehDeclYear(String iehDeclYear) {
		this.iehDeclYear = iehDeclYear;
	}

	public Date getIehDeclDate() {
		return this.iehDeclDate;
	}

	public void setIehDeclDate(Date iehDeclDate) {
		this.iehDeclDate = iehDeclDate;
	}

	public String getIehDeclarant() {
		return this.iehDeclarant;
	}

	public void setIehDeclarant(String iehDeclarant) {
		this.iehDeclarant = iehDeclarant;
	}

	public Boolean getIehReported() {
		return this.iehReported;
	}

	public void setIehReported(Boolean iehReported) {
		this.iehReported = iehReported;
	}

	public Date getIehEffdate() {
		return this.iehEffdate;
	}

	public void setIehEffdate(Date iehEffdate) {
		this.iehEffdate = iehEffdate;
	}

	public String getIehFlow() {
		return this.iehFlow;
	}

	public void setIehFlow(String iehFlow) {
		this.iehFlow = iehFlow;
	}

	public String getIehInvCur() {
		return this.iehInvCur;
	}

	public void setIehInvCur(String iehInvCur) {
		this.iehInvCur = iehInvCur;
	}

	public Date getIehInvDate() {
		return this.iehInvDate;
	}

	public void setIehInvDate(Date iehInvDate) {
		this.iehInvDate = iehInvDate;
	}

	public Double getIehInvAmtGl() {
		return this.iehInvAmtGl;
	}

	public void setIehInvAmtGl(Double iehInvAmtGl) {
		this.iehInvAmtGl = iehInvAmtGl;
	}

	public Double getIehInvAmtCur() {
		return this.iehInvAmtCur;
	}

	public void setIehInvAmtCur(Double iehInvAmtCur) {
		this.iehInvAmtCur = iehInvAmtCur;
	}

	public Integer getIehLine() {
		return this.iehLine;
	}

	public void setIehLine(Integer iehLine) {
		this.iehLine = iehLine;
	}

	public String getIehModeTransp() {
		return this.iehModeTransp;
	}

	public void setIehModeTransp(String iehModeTransp) {
		this.iehModeTransp = iehModeTransp;
	}

	public String getIehNatTrans() {
		return this.iehNatTrans;
	}

	public void setIehNatTrans(String iehNatTrans) {
		this.iehNatTrans = iehNatTrans;
	}

	public String getIehNbr() {
		return this.iehNbr;
	}

	public void setIehNbr(String iehNbr) {
		this.iehNbr = iehNbr;
	}

	public Double getIehNetWt() {
		return this.iehNetWt;
	}

	public void setIehNetWt(Double iehNetWt) {
		this.iehNetWt = iehNetWt;
	}

	public String getIehNetWtUm() {
		return this.iehNetWtUm;
	}

	public void setIehNetWtUm(String iehNetWtUm) {
		this.iehNetWtUm = iehNetWtUm;
	}

	public String getIehPart() {
		return this.iehPart;
	}

	public void setIehPart(String iehPart) {
		this.iehPart = iehPart;
	}

	public String getIehPortArrdisp() {
		return this.iehPortArrdisp;
	}

	public void setIehPortArrdisp(String iehPortArrdisp) {
		this.iehPortArrdisp = iehPortArrdisp;
	}

	public String getIehPortTransh() {
		return this.iehPortTransh;
	}

	public void setIehPortTransh(String iehPortTransh) {
		this.iehPortTransh = iehPortTransh;
	}

	public String getIehProgram() {
		return this.iehProgram;
	}

	public void setIehProgram(String iehProgram) {
		this.iehProgram = iehProgram;
	}

	public Double getIehQty() {
		return this.iehQty;
	}

	public void setIehQty(Double iehQty) {
		this.iehQty = iehQty;
	}

	public String getIehQtyUm() {
		return this.iehQtyUm;
	}

	public void setIehQtyUm(String iehQtyUm) {
		this.iehQtyUm = iehQtyUm;
	}

	public String getIehRef() {
		return this.iehRef;
	}

	public void setIehRef(String iehRef) {
		this.iehRef = iehRef;
	}

	public Date getIehRefDate() {
		return this.iehRefDate;
	}

	public void setIehRefDate(Date iehRefDate) {
		this.iehRefDate = iehRefDate;
	}

	public String getIehPstId() {
		return this.iehPstId;
	}

	public void setIehPstId(String iehPstId) {
		this.iehPstId = iehPstId;
	}

	public String getIehDeclCur() {
		return this.iehDeclCur;
	}

	public void setIehDeclCur(String iehDeclCur) {
		this.iehDeclCur = iehDeclCur;
	}

	public String getIehSite() {
		return this.iehSite;
	}

	public void setIehSite(String iehSite) {
		this.iehSite = iehSite;
	}

	public String getIehStatProc() {
		return this.iehStatProc;
	}

	public void setIehStatProc(String iehStatProc) {
		this.iehStatProc = iehStatProc;
	}

	public Double getIehStatVal() {
		return this.iehStatVal;
	}

	public void setIehStatVal(Double iehStatVal) {
		this.iehStatVal = iehStatVal;
	}

	public Double getIehSupplUnits() {
		return this.iehSupplUnits;
	}

	public void setIehSupplUnits(Double iehSupplUnits) {
		this.iehSupplUnits = iehSupplUnits;
	}

	public String getIehSupplUm() {
		return this.iehSupplUm;
	}

	public void setIehSupplUm(String iehSupplUm) {
		this.iehSupplUm = iehSupplUm;
	}

	public String getIehTermsDeliv() {
		return this.iehTermsDeliv;
	}

	public void setIehTermsDeliv(String iehTermsDeliv) {
		this.iehTermsDeliv = iehTermsDeliv;
	}

	public String getIehRegion() {
		return this.iehRegion;
	}

	public void setIehRegion(String iehRegion) {
		this.iehRegion = iehRegion;
	}

	public Double getIehDeclInvAmt() {
		return this.iehDeclInvAmt;
	}

	public void setIehDeclInvAmt(Double iehDeclInvAmt) {
		this.iehDeclInvAmt = iehDeclInvAmt;
	}

	public String getIehType() {
		return this.iehType;
	}

	public void setIehType(String iehType) {
		this.iehType = iehType;
	}

	public String getIehVoucher() {
		return this.iehVoucher;
	}

	public void setIehVoucher(String iehVoucher) {
		this.iehVoucher = iehVoucher;
	}

	public String getIehUserid() {
		return this.iehUserid;
	}

	public void setIehUserid(String iehUserid) {
		this.iehUserid = iehUserid;
	}

	public Date getIehModDate() {
		return this.iehModDate;
	}

	public void setIehModDate(Date iehModDate) {
		this.iehModDate = iehModDate;
	}

	public Double getIehDeclStatval() {
		return this.iehDeclStatval;
	}

	public void setIehDeclStatval(Double iehDeclStatval) {
		this.iehDeclStatval = iehDeclStatval;
	}

	public Integer getIehDeclarationId() {
		return this.iehDeclarationId;
	}

	public void setIehDeclarationId(Integer iehDeclarationId) {
		this.iehDeclarationId = iehDeclarationId;
	}

	public String getIehChr01() {
		return this.iehChr01;
	}

	public void setIehChr01(String iehChr01) {
		this.iehChr01 = iehChr01;
	}

	public String getIehChr02() {
		return this.iehChr02;
	}

	public void setIehChr02(String iehChr02) {
		this.iehChr02 = iehChr02;
	}

	public String getIehChr03() {
		return this.iehChr03;
	}

	public void setIehChr03(String iehChr03) {
		this.iehChr03 = iehChr03;
	}

	public String getIehChr04() {
		return this.iehChr04;
	}

	public void setIehChr04(String iehChr04) {
		this.iehChr04 = iehChr04;
	}

	public String getIehChr05() {
		return this.iehChr05;
	}

	public void setIehChr05(String iehChr05) {
		this.iehChr05 = iehChr05;
	}

	public Double getIehDec01() {
		return this.iehDec01;
	}

	public void setIehDec01(Double iehDec01) {
		this.iehDec01 = iehDec01;
	}

	public Double getIehDec02() {
		return this.iehDec02;
	}

	public void setIehDec02(Double iehDec02) {
		this.iehDec02 = iehDec02;
	}

	public Double getIehDec03() {
		return this.iehDec03;
	}

	public void setIehDec03(Double iehDec03) {
		this.iehDec03 = iehDec03;
	}

	public Double getIehDec04() {
		return this.iehDec04;
	}

	public void setIehDec04(Double iehDec04) {
		this.iehDec04 = iehDec04;
	}

	public Double getIehDec05() {
		return this.iehDec05;
	}

	public void setIehDec05(Double iehDec05) {
		this.iehDec05 = iehDec05;
	}

	public Date getIehDte01() {
		return this.iehDte01;
	}

	public void setIehDte01(Date iehDte01) {
		this.iehDte01 = iehDte01;
	}

	public Date getIehDte02() {
		return this.iehDte02;
	}

	public void setIehDte02(Date iehDte02) {
		this.iehDte02 = iehDte02;
	}

	public Date getIehDte03() {
		return this.iehDte03;
	}

	public void setIehDte03(Date iehDte03) {
		this.iehDte03 = iehDte03;
	}

	public Date getIehDte04() {
		return this.iehDte04;
	}

	public void setIehDte04(Date iehDte04) {
		this.iehDte04 = iehDte04;
	}

	public Date getIehDte05() {
		return this.iehDte05;
	}

	public void setIehDte05(Date iehDte05) {
		this.iehDte05 = iehDte05;
	}

	public String getIehDeclarantId() {
		return this.iehDeclarantId;
	}

	public void setIehDeclarantId(String iehDeclarantId) {
		this.iehDeclarantId = iehDeclarantId;
	}

	public String getIehAgent() {
		return this.iehAgent;
	}

	public void setIehAgent(String iehAgent) {
		this.iehAgent = iehAgent;
	}

	public String getIehAgentId() {
		return this.iehAgentId;
	}

	public void setIehAgentId(String iehAgentId) {
		this.iehAgentId = iehAgentId;
	}

	public String getIehQadc04() {
		return this.iehQadc04;
	}

	public void setIehQadc04(String iehQadc04) {
		this.iehQadc04 = iehQadc04;
	}

	public String getIehQadc05() {
		return this.iehQadc05;
	}

	public void setIehQadc05(String iehQadc05) {
		this.iehQadc05 = iehQadc05;
	}

	public String getIehQadc06() {
		return this.iehQadc06;
	}

	public void setIehQadc06(String iehQadc06) {
		this.iehQadc06 = iehQadc06;
	}

	public String getIehQadc07() {
		return this.iehQadc07;
	}

	public void setIehQadc07(String iehQadc07) {
		this.iehQadc07 = iehQadc07;
	}

	public String getIehQadc08() {
		return this.iehQadc08;
	}

	public void setIehQadc08(String iehQadc08) {
		this.iehQadc08 = iehQadc08;
	}

	public String getIehQadc09() {
		return this.iehQadc09;
	}

	public void setIehQadc09(String iehQadc09) {
		this.iehQadc09 = iehQadc09;
	}

	public String getIehQadc10() {
		return this.iehQadc10;
	}

	public void setIehQadc10(String iehQadc10) {
		this.iehQadc10 = iehQadc10;
	}

	public Integer getIehQadi01() {
		return this.iehQadi01;
	}

	public void setIehQadi01(Integer iehQadi01) {
		this.iehQadi01 = iehQadi01;
	}

	public Double getIehQadd01() {
		return this.iehQadd01;
	}

	public void setIehQadd01(Double iehQadd01) {
		this.iehQadd01 = iehQadd01;
	}

	public Double getIehQadd02() {
		return this.iehQadd02;
	}

	public void setIehQadd02(Double iehQadd02) {
		this.iehQadd02 = iehQadd02;
	}

	public Double getIehQadd03() {
		return this.iehQadd03;
	}

	public void setIehQadd03(Double iehQadd03) {
		this.iehQadd03 = iehQadd03;
	}

	public Double getIehQadd04() {
		return this.iehQadd04;
	}

	public void setIehQadd04(Double iehQadd04) {
		this.iehQadd04 = iehQadd04;
	}

	public Double getIehQadd05() {
		return this.iehQadd05;
	}

	public void setIehQadd05(Double iehQadd05) {
		this.iehQadd05 = iehQadd05;
	}

	public Double getIehQadd06() {
		return this.iehQadd06;
	}

	public void setIehQadd06(Double iehQadd06) {
		this.iehQadd06 = iehQadd06;
	}

	public Boolean getIehQadl01() {
		return this.iehQadl01;
	}

	public void setIehQadl01(Boolean iehQadl01) {
		this.iehQadl01 = iehQadl01;
	}

	public Boolean getIehQadl02() {
		return this.iehQadl02;
	}

	public void setIehQadl02(Boolean iehQadl02) {
		this.iehQadl02 = iehQadl02;
	}

	public Date getIehQadt01() {
		return this.iehQadt01;
	}

	public void setIehQadt01(Date iehQadt01) {
		this.iehQadt01 = iehQadt01;
	}

	public Date getIehQadt02() {
		return this.iehQadt02;
	}

	public void setIehQadt02(Date iehQadt02) {
		this.iehQadt02 = iehQadt02;
	}

	public String getIehUser1() {
		return this.iehUser1;
	}

	public void setIehUser1(String iehUser1) {
		this.iehUser1 = iehUser1;
	}

	public String getIehUser2() {
		return this.iehUser2;
	}

	public void setIehUser2(String iehUser2) {
		this.iehUser2 = iehUser2;
	}

	public Boolean getIehCorrection() {
		return this.iehCorrection;
	}

	public void setIehCorrection(Boolean iehCorrection) {
		this.iehCorrection = iehCorrection;
	}

	public String getIehOrigDoc() {
		return this.iehOrigDoc;
	}

	public void setIehOrigDoc(String iehOrigDoc) {
		this.iehOrigDoc = iehOrigDoc;
	}

	public Integer getIehOrigMonth() {
		return this.iehOrigMonth;
	}

	public void setIehOrigMonth(Integer iehOrigMonth) {
		this.iehOrigMonth = iehOrigMonth;
	}

	public Integer getIehOrigYear() {
		return this.iehOrigYear;
	}

	public void setIehOrigYear(Integer iehOrigYear) {
		this.iehOrigYear = iehOrigYear;
	}

	public String getIehAffiliation() {
		return this.iehAffiliation;
	}

	public void setIehAffiliation(String iehAffiliation) {
		this.iehAffiliation = iehAffiliation;
	}

	public Boolean getIehContainer() {
		return this.iehContainer;
	}

	public void setIehContainer(Boolean iehContainer) {
		this.iehContainer = iehContainer;
	}

	public Integer getIehCsa() {
		return this.iehCsa;
	}

	public void setIehCsa(Integer iehCsa) {
		this.iehCsa = iehCsa;
	}

	public String getIehDeclRegion() {
		return this.iehDeclRegion;
	}

	public void setIehDeclRegion(String iehDeclRegion) {
		this.iehDeclRegion = iehDeclRegion;
	}

	public String getIehItemSpec() {
		return this.iehItemSpec;
	}

	public void setIehItemSpec(String iehItemSpec) {
		this.iehItemSpec = iehItemSpec;
	}

	public Integer getIehPreference() {
		return this.iehPreference;
	}

	public void setIehPreference(Integer iehPreference) {
		this.iehPreference = iehPreference;
	}

	public String getIehReqNbr() {
		return this.iehReqNbr;
	}

	public void setIehReqNbr(String iehReqNbr) {
		this.iehReqNbr = iehReqNbr;
	}

	public String getIehShipvia() {
		return this.iehShipvia;
	}

	public void setIehShipvia(String iehShipvia) {
		this.iehShipvia = iehShipvia;
	}

	public Integer getIehTrnbr() {
		return this.iehTrnbr;
	}

	public void setIehTrnbr(Integer iehTrnbr) {
		this.iehTrnbr = iehTrnbr;
	}

	public Double getOidIehHist() {
		return this.oidIehHist;
	}

	public void setOidIehHist(Double oidIehHist) {
		this.oidIehHist = oidIehHist;
	}

}