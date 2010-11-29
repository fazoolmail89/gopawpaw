package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTxhdDet entity provides the base persistence definition of the
 * TxhdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxhdDet implements java.io.Serializable {

	// Fields

	private TxhdDetId id;
	private Boolean txhdPosted;
	private String txhdTrType;
	private String txhdRef;
	private Integer txhdLine;
	private Boolean txhdEditHist;
	private String txhdSite;
	private String txhdTaxCtry;
	private String txhdTaxNbr;
	private Date txhdEffdate;
	private String txhdProgram;
	private String txhdTransRef;
	private Boolean txhdVatSlIn;
	private Boolean txhdTdStatIn;
	private Date txhdEnterDate;
	private String txhdUserId;
	private Date txhdChgDate;
	private String txhdUsrIdChg;
	private Date txhdVatSlDate;
	private Date txhdStatSubmit;
	private Date txhdDbExport;
	private String txhdCustNum;
	private String txhdCustCtry;
	private Double txhdVatValue;
	private Boolean txhdProcInd;
	private Boolean txhdFlowIn;
	private String txhdCommCode;
	private String txhdDelTerms;
	private String txhdTaxUsage;
	private String txhdDesdisCtry;
	private String txhdTranMode;
	private String txhdOrigCtry;
	private String txhdDesdisPort;
	private String txhdTranshPort;
	private String txhdStatProc;
	private String txhdContainer;
	private String txhdTaric;
	private Double txhdInvValue;
	private Double txhdStatValue;
	private Integer txhdNetWt;
	private Integer txhdSupplUnit;
	private String txhdQad01;
	private String txhdQad02;
	private Boolean txhdQad03;
	private String txhdUser1;
	private String txhdUser2;
	private String txhdFiscalClass;
	private String txhdNbr;
	private String txhdTrl;
	private String txhdTaxCode;
	private String txhdCurr;
	private Double txhdDec01;
	private Double txhdDec02;
	private Date txhdDte01;
	private Boolean txhdLog01;
	private Double txhdQad04;
	private Double txhdQad05;
	private Date txhdQad06;
	private String txhdChr01;
	private String txhdChr02;
	private Double oidTxhdDet;

	// Constructors

	/** default constructor */
	public AbstractTxhdDet() {
	}

	/** minimal constructor */
	public AbstractTxhdDet(TxhdDetId id, Boolean txhdPosted, String txhdTrType,
			String txhdRef, Integer txhdLine, Boolean txhdEditHist,
			Boolean txhdVatSlIn, Boolean txhdTdStatIn, Boolean txhdProcInd,
			Boolean txhdFlowIn, String txhdNbr, String txhdTrl,
			String txhdTaxCode, Double oidTxhdDet) {
		this.id = id;
		this.txhdPosted = txhdPosted;
		this.txhdTrType = txhdTrType;
		this.txhdRef = txhdRef;
		this.txhdLine = txhdLine;
		this.txhdEditHist = txhdEditHist;
		this.txhdVatSlIn = txhdVatSlIn;
		this.txhdTdStatIn = txhdTdStatIn;
		this.txhdProcInd = txhdProcInd;
		this.txhdFlowIn = txhdFlowIn;
		this.txhdNbr = txhdNbr;
		this.txhdTrl = txhdTrl;
		this.txhdTaxCode = txhdTaxCode;
		this.oidTxhdDet = oidTxhdDet;
	}

	/** full constructor */
	public AbstractTxhdDet(TxhdDetId id, Boolean txhdPosted, String txhdTrType,
			String txhdRef, Integer txhdLine, Boolean txhdEditHist,
			String txhdSite, String txhdTaxCtry, String txhdTaxNbr,
			Date txhdEffdate, String txhdProgram, String txhdTransRef,
			Boolean txhdVatSlIn, Boolean txhdTdStatIn, Date txhdEnterDate,
			String txhdUserId, Date txhdChgDate, String txhdUsrIdChg,
			Date txhdVatSlDate, Date txhdStatSubmit, Date txhdDbExport,
			String txhdCustNum, String txhdCustCtry, Double txhdVatValue,
			Boolean txhdProcInd, Boolean txhdFlowIn, String txhdCommCode,
			String txhdDelTerms, String txhdTaxUsage, String txhdDesdisCtry,
			String txhdTranMode, String txhdOrigCtry, String txhdDesdisPort,
			String txhdTranshPort, String txhdStatProc, String txhdContainer,
			String txhdTaric, Double txhdInvValue, Double txhdStatValue,
			Integer txhdNetWt, Integer txhdSupplUnit, String txhdQad01,
			String txhdQad02, Boolean txhdQad03, String txhdUser1,
			String txhdUser2, String txhdFiscalClass, String txhdNbr,
			String txhdTrl, String txhdTaxCode, String txhdCurr,
			Double txhdDec01, Double txhdDec02, Date txhdDte01,
			Boolean txhdLog01, Double txhdQad04, Double txhdQad05,
			Date txhdQad06, String txhdChr01, String txhdChr02,
			Double oidTxhdDet) {
		this.id = id;
		this.txhdPosted = txhdPosted;
		this.txhdTrType = txhdTrType;
		this.txhdRef = txhdRef;
		this.txhdLine = txhdLine;
		this.txhdEditHist = txhdEditHist;
		this.txhdSite = txhdSite;
		this.txhdTaxCtry = txhdTaxCtry;
		this.txhdTaxNbr = txhdTaxNbr;
		this.txhdEffdate = txhdEffdate;
		this.txhdProgram = txhdProgram;
		this.txhdTransRef = txhdTransRef;
		this.txhdVatSlIn = txhdVatSlIn;
		this.txhdTdStatIn = txhdTdStatIn;
		this.txhdEnterDate = txhdEnterDate;
		this.txhdUserId = txhdUserId;
		this.txhdChgDate = txhdChgDate;
		this.txhdUsrIdChg = txhdUsrIdChg;
		this.txhdVatSlDate = txhdVatSlDate;
		this.txhdStatSubmit = txhdStatSubmit;
		this.txhdDbExport = txhdDbExport;
		this.txhdCustNum = txhdCustNum;
		this.txhdCustCtry = txhdCustCtry;
		this.txhdVatValue = txhdVatValue;
		this.txhdProcInd = txhdProcInd;
		this.txhdFlowIn = txhdFlowIn;
		this.txhdCommCode = txhdCommCode;
		this.txhdDelTerms = txhdDelTerms;
		this.txhdTaxUsage = txhdTaxUsage;
		this.txhdDesdisCtry = txhdDesdisCtry;
		this.txhdTranMode = txhdTranMode;
		this.txhdOrigCtry = txhdOrigCtry;
		this.txhdDesdisPort = txhdDesdisPort;
		this.txhdTranshPort = txhdTranshPort;
		this.txhdStatProc = txhdStatProc;
		this.txhdContainer = txhdContainer;
		this.txhdTaric = txhdTaric;
		this.txhdInvValue = txhdInvValue;
		this.txhdStatValue = txhdStatValue;
		this.txhdNetWt = txhdNetWt;
		this.txhdSupplUnit = txhdSupplUnit;
		this.txhdQad01 = txhdQad01;
		this.txhdQad02 = txhdQad02;
		this.txhdQad03 = txhdQad03;
		this.txhdUser1 = txhdUser1;
		this.txhdUser2 = txhdUser2;
		this.txhdFiscalClass = txhdFiscalClass;
		this.txhdNbr = txhdNbr;
		this.txhdTrl = txhdTrl;
		this.txhdTaxCode = txhdTaxCode;
		this.txhdCurr = txhdCurr;
		this.txhdDec01 = txhdDec01;
		this.txhdDec02 = txhdDec02;
		this.txhdDte01 = txhdDte01;
		this.txhdLog01 = txhdLog01;
		this.txhdQad04 = txhdQad04;
		this.txhdQad05 = txhdQad05;
		this.txhdQad06 = txhdQad06;
		this.txhdChr01 = txhdChr01;
		this.txhdChr02 = txhdChr02;
		this.oidTxhdDet = oidTxhdDet;
	}

	// Property accessors

	public TxhdDetId getId() {
		return this.id;
	}

	public void setId(TxhdDetId id) {
		this.id = id;
	}

	public Boolean getTxhdPosted() {
		return this.txhdPosted;
	}

	public void setTxhdPosted(Boolean txhdPosted) {
		this.txhdPosted = txhdPosted;
	}

	public String getTxhdTrType() {
		return this.txhdTrType;
	}

	public void setTxhdTrType(String txhdTrType) {
		this.txhdTrType = txhdTrType;
	}

	public String getTxhdRef() {
		return this.txhdRef;
	}

	public void setTxhdRef(String txhdRef) {
		this.txhdRef = txhdRef;
	}

	public Integer getTxhdLine() {
		return this.txhdLine;
	}

	public void setTxhdLine(Integer txhdLine) {
		this.txhdLine = txhdLine;
	}

	public Boolean getTxhdEditHist() {
		return this.txhdEditHist;
	}

	public void setTxhdEditHist(Boolean txhdEditHist) {
		this.txhdEditHist = txhdEditHist;
	}

	public String getTxhdSite() {
		return this.txhdSite;
	}

	public void setTxhdSite(String txhdSite) {
		this.txhdSite = txhdSite;
	}

	public String getTxhdTaxCtry() {
		return this.txhdTaxCtry;
	}

	public void setTxhdTaxCtry(String txhdTaxCtry) {
		this.txhdTaxCtry = txhdTaxCtry;
	}

	public String getTxhdTaxNbr() {
		return this.txhdTaxNbr;
	}

	public void setTxhdTaxNbr(String txhdTaxNbr) {
		this.txhdTaxNbr = txhdTaxNbr;
	}

	public Date getTxhdEffdate() {
		return this.txhdEffdate;
	}

	public void setTxhdEffdate(Date txhdEffdate) {
		this.txhdEffdate = txhdEffdate;
	}

	public String getTxhdProgram() {
		return this.txhdProgram;
	}

	public void setTxhdProgram(String txhdProgram) {
		this.txhdProgram = txhdProgram;
	}

	public String getTxhdTransRef() {
		return this.txhdTransRef;
	}

	public void setTxhdTransRef(String txhdTransRef) {
		this.txhdTransRef = txhdTransRef;
	}

	public Boolean getTxhdVatSlIn() {
		return this.txhdVatSlIn;
	}

	public void setTxhdVatSlIn(Boolean txhdVatSlIn) {
		this.txhdVatSlIn = txhdVatSlIn;
	}

	public Boolean getTxhdTdStatIn() {
		return this.txhdTdStatIn;
	}

	public void setTxhdTdStatIn(Boolean txhdTdStatIn) {
		this.txhdTdStatIn = txhdTdStatIn;
	}

	public Date getTxhdEnterDate() {
		return this.txhdEnterDate;
	}

	public void setTxhdEnterDate(Date txhdEnterDate) {
		this.txhdEnterDate = txhdEnterDate;
	}

	public String getTxhdUserId() {
		return this.txhdUserId;
	}

	public void setTxhdUserId(String txhdUserId) {
		this.txhdUserId = txhdUserId;
	}

	public Date getTxhdChgDate() {
		return this.txhdChgDate;
	}

	public void setTxhdChgDate(Date txhdChgDate) {
		this.txhdChgDate = txhdChgDate;
	}

	public String getTxhdUsrIdChg() {
		return this.txhdUsrIdChg;
	}

	public void setTxhdUsrIdChg(String txhdUsrIdChg) {
		this.txhdUsrIdChg = txhdUsrIdChg;
	}

	public Date getTxhdVatSlDate() {
		return this.txhdVatSlDate;
	}

	public void setTxhdVatSlDate(Date txhdVatSlDate) {
		this.txhdVatSlDate = txhdVatSlDate;
	}

	public Date getTxhdStatSubmit() {
		return this.txhdStatSubmit;
	}

	public void setTxhdStatSubmit(Date txhdStatSubmit) {
		this.txhdStatSubmit = txhdStatSubmit;
	}

	public Date getTxhdDbExport() {
		return this.txhdDbExport;
	}

	public void setTxhdDbExport(Date txhdDbExport) {
		this.txhdDbExport = txhdDbExport;
	}

	public String getTxhdCustNum() {
		return this.txhdCustNum;
	}

	public void setTxhdCustNum(String txhdCustNum) {
		this.txhdCustNum = txhdCustNum;
	}

	public String getTxhdCustCtry() {
		return this.txhdCustCtry;
	}

	public void setTxhdCustCtry(String txhdCustCtry) {
		this.txhdCustCtry = txhdCustCtry;
	}

	public Double getTxhdVatValue() {
		return this.txhdVatValue;
	}

	public void setTxhdVatValue(Double txhdVatValue) {
		this.txhdVatValue = txhdVatValue;
	}

	public Boolean getTxhdProcInd() {
		return this.txhdProcInd;
	}

	public void setTxhdProcInd(Boolean txhdProcInd) {
		this.txhdProcInd = txhdProcInd;
	}

	public Boolean getTxhdFlowIn() {
		return this.txhdFlowIn;
	}

	public void setTxhdFlowIn(Boolean txhdFlowIn) {
		this.txhdFlowIn = txhdFlowIn;
	}

	public String getTxhdCommCode() {
		return this.txhdCommCode;
	}

	public void setTxhdCommCode(String txhdCommCode) {
		this.txhdCommCode = txhdCommCode;
	}

	public String getTxhdDelTerms() {
		return this.txhdDelTerms;
	}

	public void setTxhdDelTerms(String txhdDelTerms) {
		this.txhdDelTerms = txhdDelTerms;
	}

	public String getTxhdTaxUsage() {
		return this.txhdTaxUsage;
	}

	public void setTxhdTaxUsage(String txhdTaxUsage) {
		this.txhdTaxUsage = txhdTaxUsage;
	}

	public String getTxhdDesdisCtry() {
		return this.txhdDesdisCtry;
	}

	public void setTxhdDesdisCtry(String txhdDesdisCtry) {
		this.txhdDesdisCtry = txhdDesdisCtry;
	}

	public String getTxhdTranMode() {
		return this.txhdTranMode;
	}

	public void setTxhdTranMode(String txhdTranMode) {
		this.txhdTranMode = txhdTranMode;
	}

	public String getTxhdOrigCtry() {
		return this.txhdOrigCtry;
	}

	public void setTxhdOrigCtry(String txhdOrigCtry) {
		this.txhdOrigCtry = txhdOrigCtry;
	}

	public String getTxhdDesdisPort() {
		return this.txhdDesdisPort;
	}

	public void setTxhdDesdisPort(String txhdDesdisPort) {
		this.txhdDesdisPort = txhdDesdisPort;
	}

	public String getTxhdTranshPort() {
		return this.txhdTranshPort;
	}

	public void setTxhdTranshPort(String txhdTranshPort) {
		this.txhdTranshPort = txhdTranshPort;
	}

	public String getTxhdStatProc() {
		return this.txhdStatProc;
	}

	public void setTxhdStatProc(String txhdStatProc) {
		this.txhdStatProc = txhdStatProc;
	}

	public String getTxhdContainer() {
		return this.txhdContainer;
	}

	public void setTxhdContainer(String txhdContainer) {
		this.txhdContainer = txhdContainer;
	}

	public String getTxhdTaric() {
		return this.txhdTaric;
	}

	public void setTxhdTaric(String txhdTaric) {
		this.txhdTaric = txhdTaric;
	}

	public Double getTxhdInvValue() {
		return this.txhdInvValue;
	}

	public void setTxhdInvValue(Double txhdInvValue) {
		this.txhdInvValue = txhdInvValue;
	}

	public Double getTxhdStatValue() {
		return this.txhdStatValue;
	}

	public void setTxhdStatValue(Double txhdStatValue) {
		this.txhdStatValue = txhdStatValue;
	}

	public Integer getTxhdNetWt() {
		return this.txhdNetWt;
	}

	public void setTxhdNetWt(Integer txhdNetWt) {
		this.txhdNetWt = txhdNetWt;
	}

	public Integer getTxhdSupplUnit() {
		return this.txhdSupplUnit;
	}

	public void setTxhdSupplUnit(Integer txhdSupplUnit) {
		this.txhdSupplUnit = txhdSupplUnit;
	}

	public String getTxhdQad01() {
		return this.txhdQad01;
	}

	public void setTxhdQad01(String txhdQad01) {
		this.txhdQad01 = txhdQad01;
	}

	public String getTxhdQad02() {
		return this.txhdQad02;
	}

	public void setTxhdQad02(String txhdQad02) {
		this.txhdQad02 = txhdQad02;
	}

	public Boolean getTxhdQad03() {
		return this.txhdQad03;
	}

	public void setTxhdQad03(Boolean txhdQad03) {
		this.txhdQad03 = txhdQad03;
	}

	public String getTxhdUser1() {
		return this.txhdUser1;
	}

	public void setTxhdUser1(String txhdUser1) {
		this.txhdUser1 = txhdUser1;
	}

	public String getTxhdUser2() {
		return this.txhdUser2;
	}

	public void setTxhdUser2(String txhdUser2) {
		this.txhdUser2 = txhdUser2;
	}

	public String getTxhdFiscalClass() {
		return this.txhdFiscalClass;
	}

	public void setTxhdFiscalClass(String txhdFiscalClass) {
		this.txhdFiscalClass = txhdFiscalClass;
	}

	public String getTxhdNbr() {
		return this.txhdNbr;
	}

	public void setTxhdNbr(String txhdNbr) {
		this.txhdNbr = txhdNbr;
	}

	public String getTxhdTrl() {
		return this.txhdTrl;
	}

	public void setTxhdTrl(String txhdTrl) {
		this.txhdTrl = txhdTrl;
	}

	public String getTxhdTaxCode() {
		return this.txhdTaxCode;
	}

	public void setTxhdTaxCode(String txhdTaxCode) {
		this.txhdTaxCode = txhdTaxCode;
	}

	public String getTxhdCurr() {
		return this.txhdCurr;
	}

	public void setTxhdCurr(String txhdCurr) {
		this.txhdCurr = txhdCurr;
	}

	public Double getTxhdDec01() {
		return this.txhdDec01;
	}

	public void setTxhdDec01(Double txhdDec01) {
		this.txhdDec01 = txhdDec01;
	}

	public Double getTxhdDec02() {
		return this.txhdDec02;
	}

	public void setTxhdDec02(Double txhdDec02) {
		this.txhdDec02 = txhdDec02;
	}

	public Date getTxhdDte01() {
		return this.txhdDte01;
	}

	public void setTxhdDte01(Date txhdDte01) {
		this.txhdDte01 = txhdDte01;
	}

	public Boolean getTxhdLog01() {
		return this.txhdLog01;
	}

	public void setTxhdLog01(Boolean txhdLog01) {
		this.txhdLog01 = txhdLog01;
	}

	public Double getTxhdQad04() {
		return this.txhdQad04;
	}

	public void setTxhdQad04(Double txhdQad04) {
		this.txhdQad04 = txhdQad04;
	}

	public Double getTxhdQad05() {
		return this.txhdQad05;
	}

	public void setTxhdQad05(Double txhdQad05) {
		this.txhdQad05 = txhdQad05;
	}

	public Date getTxhdQad06() {
		return this.txhdQad06;
	}

	public void setTxhdQad06(Date txhdQad06) {
		this.txhdQad06 = txhdQad06;
	}

	public String getTxhdChr01() {
		return this.txhdChr01;
	}

	public void setTxhdChr01(String txhdChr01) {
		this.txhdChr01 = txhdChr01;
	}

	public String getTxhdChr02() {
		return this.txhdChr02;
	}

	public void setTxhdChr02(String txhdChr02) {
		this.txhdChr02 = txhdChr02;
	}

	public Double getOidTxhdDet() {
		return this.oidTxhdDet;
	}

	public void setOidTxhdDet(Double oidTxhdDet) {
		this.oidTxhdDet = oidTxhdDet;
	}

}