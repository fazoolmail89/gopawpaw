package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractArMstr entity provides the base persistence definition of the ArMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArMstr implements java.io.Serializable {

	// Fields

	private ArMstrId id;
	private String arType;
	private String arCust;
	private String arSoNbr;
	private String arXcommPct;
	private Date arEffdate;
	private Date arDate;
	private String arCrTerms;
	private String arPo;
	private Double arAmt;
	private Double arApplied;
	private Date arDiscDate;
	private Date arDueDate;
	private Date arExptDate;
	private String arAcct;
	private String arCc;
	private Double arSalesAmt;
	private String arXslspsn1;
	private String arXslspsn2;
	private Date arPaidDate;
	private String arBatch;
	private String arDiscAcct;
	private String arDiscCc;
	private String arShip;
	private Boolean arOpen;
	private Boolean arContested;
	private String arCheck;
	private Integer arCmtindx;
	private String arUser1;
	private String arUser2;
	private String arCurr;
	private Double arExRate;
	private String arVarAcct;
	private String arVarCc;
	private String arBank;
	private Double arMrgnAmt;
	private String arEntity;
	private Double arEntEx;
	private String arChr01;
	private String arChr02;
	private String arChr03;
	private String arChr04;
	private String arChr05;
	private Date arDte01;
	private Date arDte02;
	private Double arDec01;
	private Double arDec02;
	private Boolean arLog01;
	private Boolean arDraft;
	private Date arLdueDate;
	private Boolean arPrint;
	private String arInvCr;
	private String arFrTerms;
	private String arSlspsn;
	private Date arTaxDate;
	private String arCommPct;
	private String arBill;
	private String arTaxEnv;
	private String arQad01;
	private String arQad02;
	private Boolean arQad03;
	private Boolean arDrftSel;
	private String arCollMthd;
	private Double arAmtChg;
	private Double arDiscChg;
	private Double arBaseAmt;
	private String arFsmType;
	private String arCommAmt;
	private String arDyCode;
	private Integer arDunLevel;
	private Double arExRate2;
	private String arExRatetype;
	private Double arBaseAmtChg;
	private Double arBaseApplied;
	private String arBaseCommAmt;
	private Integer arExruSeq;
	private String arDdCurr;
	private Double arDdExRate;
	private Double arDdExRate2;
	private Integer arDdExruSeq;
	private String arAppOwner;
	private String arSub;
	private String arDiscSub;
	private String arVarSub;
	private Boolean arPrepayment;
	private String arShipfrom;
	private String arCustomerBank;
	private Date arDraftDiscDate;
	private Date arReconDate;
	private String arStatus;
	private Boolean arCustomerInitiated;
	private Date arDraftSubmitDate;
	private String arPayMethod;
	private Date arVoidDate;
	private Double oidArMstr;

	// Constructors

	/** default constructor */
	public AbstractArMstr() {
	}

	/** minimal constructor */
	public AbstractArMstr(ArMstrId id, Boolean arDrftSel, String arCollMthd,
			Double arAmtChg, Double arDiscChg, Double arBaseAmt,
			String arDyCode, Integer arDunLevel, Double arExRate2,
			String arExRatetype, Double arBaseAmtChg, Double arBaseApplied,
			String arBaseCommAmt, Integer arExruSeq, String arDdCurr,
			Double arDdExRate, Double arDdExRate2, Integer arDdExruSeq,
			Boolean arPrepayment, String arCustomerBank, String arStatus,
			Boolean arCustomerInitiated, String arPayMethod, Double oidArMstr) {
		this.id = id;
		this.arDrftSel = arDrftSel;
		this.arCollMthd = arCollMthd;
		this.arAmtChg = arAmtChg;
		this.arDiscChg = arDiscChg;
		this.arBaseAmt = arBaseAmt;
		this.arDyCode = arDyCode;
		this.arDunLevel = arDunLevel;
		this.arExRate2 = arExRate2;
		this.arExRatetype = arExRatetype;
		this.arBaseAmtChg = arBaseAmtChg;
		this.arBaseApplied = arBaseApplied;
		this.arBaseCommAmt = arBaseCommAmt;
		this.arExruSeq = arExruSeq;
		this.arDdCurr = arDdCurr;
		this.arDdExRate = arDdExRate;
		this.arDdExRate2 = arDdExRate2;
		this.arDdExruSeq = arDdExruSeq;
		this.arPrepayment = arPrepayment;
		this.arCustomerBank = arCustomerBank;
		this.arStatus = arStatus;
		this.arCustomerInitiated = arCustomerInitiated;
		this.arPayMethod = arPayMethod;
		this.oidArMstr = oidArMstr;
	}

	/** full constructor */
	public AbstractArMstr(ArMstrId id, String arType, String arCust,
			String arSoNbr, String arXcommPct, Date arEffdate, Date arDate,
			String arCrTerms, String arPo, Double arAmt, Double arApplied,
			Date arDiscDate, Date arDueDate, Date arExptDate, String arAcct,
			String arCc, Double arSalesAmt, String arXslspsn1,
			String arXslspsn2, Date arPaidDate, String arBatch,
			String arDiscAcct, String arDiscCc, String arShip, Boolean arOpen,
			Boolean arContested, String arCheck, Integer arCmtindx,
			String arUser1, String arUser2, String arCurr, Double arExRate,
			String arVarAcct, String arVarCc, String arBank, Double arMrgnAmt,
			String arEntity, Double arEntEx, String arChr01, String arChr02,
			String arChr03, String arChr04, String arChr05, Date arDte01,
			Date arDte02, Double arDec01, Double arDec02, Boolean arLog01,
			Boolean arDraft, Date arLdueDate, Boolean arPrint, String arInvCr,
			String arFrTerms, String arSlspsn, Date arTaxDate,
			String arCommPct, String arBill, String arTaxEnv, String arQad01,
			String arQad02, Boolean arQad03, Boolean arDrftSel,
			String arCollMthd, Double arAmtChg, Double arDiscChg,
			Double arBaseAmt, String arFsmType, String arCommAmt,
			String arDyCode, Integer arDunLevel, Double arExRate2,
			String arExRatetype, Double arBaseAmtChg, Double arBaseApplied,
			String arBaseCommAmt, Integer arExruSeq, String arDdCurr,
			Double arDdExRate, Double arDdExRate2, Integer arDdExruSeq,
			String arAppOwner, String arSub, String arDiscSub, String arVarSub,
			Boolean arPrepayment, String arShipfrom, String arCustomerBank,
			Date arDraftDiscDate, Date arReconDate, String arStatus,
			Boolean arCustomerInitiated, Date arDraftSubmitDate,
			String arPayMethod, Date arVoidDate, Double oidArMstr) {
		this.id = id;
		this.arType = arType;
		this.arCust = arCust;
		this.arSoNbr = arSoNbr;
		this.arXcommPct = arXcommPct;
		this.arEffdate = arEffdate;
		this.arDate = arDate;
		this.arCrTerms = arCrTerms;
		this.arPo = arPo;
		this.arAmt = arAmt;
		this.arApplied = arApplied;
		this.arDiscDate = arDiscDate;
		this.arDueDate = arDueDate;
		this.arExptDate = arExptDate;
		this.arAcct = arAcct;
		this.arCc = arCc;
		this.arSalesAmt = arSalesAmt;
		this.arXslspsn1 = arXslspsn1;
		this.arXslspsn2 = arXslspsn2;
		this.arPaidDate = arPaidDate;
		this.arBatch = arBatch;
		this.arDiscAcct = arDiscAcct;
		this.arDiscCc = arDiscCc;
		this.arShip = arShip;
		this.arOpen = arOpen;
		this.arContested = arContested;
		this.arCheck = arCheck;
		this.arCmtindx = arCmtindx;
		this.arUser1 = arUser1;
		this.arUser2 = arUser2;
		this.arCurr = arCurr;
		this.arExRate = arExRate;
		this.arVarAcct = arVarAcct;
		this.arVarCc = arVarCc;
		this.arBank = arBank;
		this.arMrgnAmt = arMrgnAmt;
		this.arEntity = arEntity;
		this.arEntEx = arEntEx;
		this.arChr01 = arChr01;
		this.arChr02 = arChr02;
		this.arChr03 = arChr03;
		this.arChr04 = arChr04;
		this.arChr05 = arChr05;
		this.arDte01 = arDte01;
		this.arDte02 = arDte02;
		this.arDec01 = arDec01;
		this.arDec02 = arDec02;
		this.arLog01 = arLog01;
		this.arDraft = arDraft;
		this.arLdueDate = arLdueDate;
		this.arPrint = arPrint;
		this.arInvCr = arInvCr;
		this.arFrTerms = arFrTerms;
		this.arSlspsn = arSlspsn;
		this.arTaxDate = arTaxDate;
		this.arCommPct = arCommPct;
		this.arBill = arBill;
		this.arTaxEnv = arTaxEnv;
		this.arQad01 = arQad01;
		this.arQad02 = arQad02;
		this.arQad03 = arQad03;
		this.arDrftSel = arDrftSel;
		this.arCollMthd = arCollMthd;
		this.arAmtChg = arAmtChg;
		this.arDiscChg = arDiscChg;
		this.arBaseAmt = arBaseAmt;
		this.arFsmType = arFsmType;
		this.arCommAmt = arCommAmt;
		this.arDyCode = arDyCode;
		this.arDunLevel = arDunLevel;
		this.arExRate2 = arExRate2;
		this.arExRatetype = arExRatetype;
		this.arBaseAmtChg = arBaseAmtChg;
		this.arBaseApplied = arBaseApplied;
		this.arBaseCommAmt = arBaseCommAmt;
		this.arExruSeq = arExruSeq;
		this.arDdCurr = arDdCurr;
		this.arDdExRate = arDdExRate;
		this.arDdExRate2 = arDdExRate2;
		this.arDdExruSeq = arDdExruSeq;
		this.arAppOwner = arAppOwner;
		this.arSub = arSub;
		this.arDiscSub = arDiscSub;
		this.arVarSub = arVarSub;
		this.arPrepayment = arPrepayment;
		this.arShipfrom = arShipfrom;
		this.arCustomerBank = arCustomerBank;
		this.arDraftDiscDate = arDraftDiscDate;
		this.arReconDate = arReconDate;
		this.arStatus = arStatus;
		this.arCustomerInitiated = arCustomerInitiated;
		this.arDraftSubmitDate = arDraftSubmitDate;
		this.arPayMethod = arPayMethod;
		this.arVoidDate = arVoidDate;
		this.oidArMstr = oidArMstr;
	}

	// Property accessors

	public ArMstrId getId() {
		return this.id;
	}

	public void setId(ArMstrId id) {
		this.id = id;
	}

	public String getArType() {
		return this.arType;
	}

	public void setArType(String arType) {
		this.arType = arType;
	}

	public String getArCust() {
		return this.arCust;
	}

	public void setArCust(String arCust) {
		this.arCust = arCust;
	}

	public String getArSoNbr() {
		return this.arSoNbr;
	}

	public void setArSoNbr(String arSoNbr) {
		this.arSoNbr = arSoNbr;
	}

	public String getArXcommPct() {
		return this.arXcommPct;
	}

	public void setArXcommPct(String arXcommPct) {
		this.arXcommPct = arXcommPct;
	}

	public Date getArEffdate() {
		return this.arEffdate;
	}

	public void setArEffdate(Date arEffdate) {
		this.arEffdate = arEffdate;
	}

	public Date getArDate() {
		return this.arDate;
	}

	public void setArDate(Date arDate) {
		this.arDate = arDate;
	}

	public String getArCrTerms() {
		return this.arCrTerms;
	}

	public void setArCrTerms(String arCrTerms) {
		this.arCrTerms = arCrTerms;
	}

	public String getArPo() {
		return this.arPo;
	}

	public void setArPo(String arPo) {
		this.arPo = arPo;
	}

	public Double getArAmt() {
		return this.arAmt;
	}

	public void setArAmt(Double arAmt) {
		this.arAmt = arAmt;
	}

	public Double getArApplied() {
		return this.arApplied;
	}

	public void setArApplied(Double arApplied) {
		this.arApplied = arApplied;
	}

	public Date getArDiscDate() {
		return this.arDiscDate;
	}

	public void setArDiscDate(Date arDiscDate) {
		this.arDiscDate = arDiscDate;
	}

	public Date getArDueDate() {
		return this.arDueDate;
	}

	public void setArDueDate(Date arDueDate) {
		this.arDueDate = arDueDate;
	}

	public Date getArExptDate() {
		return this.arExptDate;
	}

	public void setArExptDate(Date arExptDate) {
		this.arExptDate = arExptDate;
	}

	public String getArAcct() {
		return this.arAcct;
	}

	public void setArAcct(String arAcct) {
		this.arAcct = arAcct;
	}

	public String getArCc() {
		return this.arCc;
	}

	public void setArCc(String arCc) {
		this.arCc = arCc;
	}

	public Double getArSalesAmt() {
		return this.arSalesAmt;
	}

	public void setArSalesAmt(Double arSalesAmt) {
		this.arSalesAmt = arSalesAmt;
	}

	public String getArXslspsn1() {
		return this.arXslspsn1;
	}

	public void setArXslspsn1(String arXslspsn1) {
		this.arXslspsn1 = arXslspsn1;
	}

	public String getArXslspsn2() {
		return this.arXslspsn2;
	}

	public void setArXslspsn2(String arXslspsn2) {
		this.arXslspsn2 = arXslspsn2;
	}

	public Date getArPaidDate() {
		return this.arPaidDate;
	}

	public void setArPaidDate(Date arPaidDate) {
		this.arPaidDate = arPaidDate;
	}

	public String getArBatch() {
		return this.arBatch;
	}

	public void setArBatch(String arBatch) {
		this.arBatch = arBatch;
	}

	public String getArDiscAcct() {
		return this.arDiscAcct;
	}

	public void setArDiscAcct(String arDiscAcct) {
		this.arDiscAcct = arDiscAcct;
	}

	public String getArDiscCc() {
		return this.arDiscCc;
	}

	public void setArDiscCc(String arDiscCc) {
		this.arDiscCc = arDiscCc;
	}

	public String getArShip() {
		return this.arShip;
	}

	public void setArShip(String arShip) {
		this.arShip = arShip;
	}

	public Boolean getArOpen() {
		return this.arOpen;
	}

	public void setArOpen(Boolean arOpen) {
		this.arOpen = arOpen;
	}

	public Boolean getArContested() {
		return this.arContested;
	}

	public void setArContested(Boolean arContested) {
		this.arContested = arContested;
	}

	public String getArCheck() {
		return this.arCheck;
	}

	public void setArCheck(String arCheck) {
		this.arCheck = arCheck;
	}

	public Integer getArCmtindx() {
		return this.arCmtindx;
	}

	public void setArCmtindx(Integer arCmtindx) {
		this.arCmtindx = arCmtindx;
	}

	public String getArUser1() {
		return this.arUser1;
	}

	public void setArUser1(String arUser1) {
		this.arUser1 = arUser1;
	}

	public String getArUser2() {
		return this.arUser2;
	}

	public void setArUser2(String arUser2) {
		this.arUser2 = arUser2;
	}

	public String getArCurr() {
		return this.arCurr;
	}

	public void setArCurr(String arCurr) {
		this.arCurr = arCurr;
	}

	public Double getArExRate() {
		return this.arExRate;
	}

	public void setArExRate(Double arExRate) {
		this.arExRate = arExRate;
	}

	public String getArVarAcct() {
		return this.arVarAcct;
	}

	public void setArVarAcct(String arVarAcct) {
		this.arVarAcct = arVarAcct;
	}

	public String getArVarCc() {
		return this.arVarCc;
	}

	public void setArVarCc(String arVarCc) {
		this.arVarCc = arVarCc;
	}

	public String getArBank() {
		return this.arBank;
	}

	public void setArBank(String arBank) {
		this.arBank = arBank;
	}

	public Double getArMrgnAmt() {
		return this.arMrgnAmt;
	}

	public void setArMrgnAmt(Double arMrgnAmt) {
		this.arMrgnAmt = arMrgnAmt;
	}

	public String getArEntity() {
		return this.arEntity;
	}

	public void setArEntity(String arEntity) {
		this.arEntity = arEntity;
	}

	public Double getArEntEx() {
		return this.arEntEx;
	}

	public void setArEntEx(Double arEntEx) {
		this.arEntEx = arEntEx;
	}

	public String getArChr01() {
		return this.arChr01;
	}

	public void setArChr01(String arChr01) {
		this.arChr01 = arChr01;
	}

	public String getArChr02() {
		return this.arChr02;
	}

	public void setArChr02(String arChr02) {
		this.arChr02 = arChr02;
	}

	public String getArChr03() {
		return this.arChr03;
	}

	public void setArChr03(String arChr03) {
		this.arChr03 = arChr03;
	}

	public String getArChr04() {
		return this.arChr04;
	}

	public void setArChr04(String arChr04) {
		this.arChr04 = arChr04;
	}

	public String getArChr05() {
		return this.arChr05;
	}

	public void setArChr05(String arChr05) {
		this.arChr05 = arChr05;
	}

	public Date getArDte01() {
		return this.arDte01;
	}

	public void setArDte01(Date arDte01) {
		this.arDte01 = arDte01;
	}

	public Date getArDte02() {
		return this.arDte02;
	}

	public void setArDte02(Date arDte02) {
		this.arDte02 = arDte02;
	}

	public Double getArDec01() {
		return this.arDec01;
	}

	public void setArDec01(Double arDec01) {
		this.arDec01 = arDec01;
	}

	public Double getArDec02() {
		return this.arDec02;
	}

	public void setArDec02(Double arDec02) {
		this.arDec02 = arDec02;
	}

	public Boolean getArLog01() {
		return this.arLog01;
	}

	public void setArLog01(Boolean arLog01) {
		this.arLog01 = arLog01;
	}

	public Boolean getArDraft() {
		return this.arDraft;
	}

	public void setArDraft(Boolean arDraft) {
		this.arDraft = arDraft;
	}

	public Date getArLdueDate() {
		return this.arLdueDate;
	}

	public void setArLdueDate(Date arLdueDate) {
		this.arLdueDate = arLdueDate;
	}

	public Boolean getArPrint() {
		return this.arPrint;
	}

	public void setArPrint(Boolean arPrint) {
		this.arPrint = arPrint;
	}

	public String getArInvCr() {
		return this.arInvCr;
	}

	public void setArInvCr(String arInvCr) {
		this.arInvCr = arInvCr;
	}

	public String getArFrTerms() {
		return this.arFrTerms;
	}

	public void setArFrTerms(String arFrTerms) {
		this.arFrTerms = arFrTerms;
	}

	public String getArSlspsn() {
		return this.arSlspsn;
	}

	public void setArSlspsn(String arSlspsn) {
		this.arSlspsn = arSlspsn;
	}

	public Date getArTaxDate() {
		return this.arTaxDate;
	}

	public void setArTaxDate(Date arTaxDate) {
		this.arTaxDate = arTaxDate;
	}

	public String getArCommPct() {
		return this.arCommPct;
	}

	public void setArCommPct(String arCommPct) {
		this.arCommPct = arCommPct;
	}

	public String getArBill() {
		return this.arBill;
	}

	public void setArBill(String arBill) {
		this.arBill = arBill;
	}

	public String getArTaxEnv() {
		return this.arTaxEnv;
	}

	public void setArTaxEnv(String arTaxEnv) {
		this.arTaxEnv = arTaxEnv;
	}

	public String getArQad01() {
		return this.arQad01;
	}

	public void setArQad01(String arQad01) {
		this.arQad01 = arQad01;
	}

	public String getArQad02() {
		return this.arQad02;
	}

	public void setArQad02(String arQad02) {
		this.arQad02 = arQad02;
	}

	public Boolean getArQad03() {
		return this.arQad03;
	}

	public void setArQad03(Boolean arQad03) {
		this.arQad03 = arQad03;
	}

	public Boolean getArDrftSel() {
		return this.arDrftSel;
	}

	public void setArDrftSel(Boolean arDrftSel) {
		this.arDrftSel = arDrftSel;
	}

	public String getArCollMthd() {
		return this.arCollMthd;
	}

	public void setArCollMthd(String arCollMthd) {
		this.arCollMthd = arCollMthd;
	}

	public Double getArAmtChg() {
		return this.arAmtChg;
	}

	public void setArAmtChg(Double arAmtChg) {
		this.arAmtChg = arAmtChg;
	}

	public Double getArDiscChg() {
		return this.arDiscChg;
	}

	public void setArDiscChg(Double arDiscChg) {
		this.arDiscChg = arDiscChg;
	}

	public Double getArBaseAmt() {
		return this.arBaseAmt;
	}

	public void setArBaseAmt(Double arBaseAmt) {
		this.arBaseAmt = arBaseAmt;
	}

	public String getArFsmType() {
		return this.arFsmType;
	}

	public void setArFsmType(String arFsmType) {
		this.arFsmType = arFsmType;
	}

	public String getArCommAmt() {
		return this.arCommAmt;
	}

	public void setArCommAmt(String arCommAmt) {
		this.arCommAmt = arCommAmt;
	}

	public String getArDyCode() {
		return this.arDyCode;
	}

	public void setArDyCode(String arDyCode) {
		this.arDyCode = arDyCode;
	}

	public Integer getArDunLevel() {
		return this.arDunLevel;
	}

	public void setArDunLevel(Integer arDunLevel) {
		this.arDunLevel = arDunLevel;
	}

	public Double getArExRate2() {
		return this.arExRate2;
	}

	public void setArExRate2(Double arExRate2) {
		this.arExRate2 = arExRate2;
	}

	public String getArExRatetype() {
		return this.arExRatetype;
	}

	public void setArExRatetype(String arExRatetype) {
		this.arExRatetype = arExRatetype;
	}

	public Double getArBaseAmtChg() {
		return this.arBaseAmtChg;
	}

	public void setArBaseAmtChg(Double arBaseAmtChg) {
		this.arBaseAmtChg = arBaseAmtChg;
	}

	public Double getArBaseApplied() {
		return this.arBaseApplied;
	}

	public void setArBaseApplied(Double arBaseApplied) {
		this.arBaseApplied = arBaseApplied;
	}

	public String getArBaseCommAmt() {
		return this.arBaseCommAmt;
	}

	public void setArBaseCommAmt(String arBaseCommAmt) {
		this.arBaseCommAmt = arBaseCommAmt;
	}

	public Integer getArExruSeq() {
		return this.arExruSeq;
	}

	public void setArExruSeq(Integer arExruSeq) {
		this.arExruSeq = arExruSeq;
	}

	public String getArDdCurr() {
		return this.arDdCurr;
	}

	public void setArDdCurr(String arDdCurr) {
		this.arDdCurr = arDdCurr;
	}

	public Double getArDdExRate() {
		return this.arDdExRate;
	}

	public void setArDdExRate(Double arDdExRate) {
		this.arDdExRate = arDdExRate;
	}

	public Double getArDdExRate2() {
		return this.arDdExRate2;
	}

	public void setArDdExRate2(Double arDdExRate2) {
		this.arDdExRate2 = arDdExRate2;
	}

	public Integer getArDdExruSeq() {
		return this.arDdExruSeq;
	}

	public void setArDdExruSeq(Integer arDdExruSeq) {
		this.arDdExruSeq = arDdExruSeq;
	}

	public String getArAppOwner() {
		return this.arAppOwner;
	}

	public void setArAppOwner(String arAppOwner) {
		this.arAppOwner = arAppOwner;
	}

	public String getArSub() {
		return this.arSub;
	}

	public void setArSub(String arSub) {
		this.arSub = arSub;
	}

	public String getArDiscSub() {
		return this.arDiscSub;
	}

	public void setArDiscSub(String arDiscSub) {
		this.arDiscSub = arDiscSub;
	}

	public String getArVarSub() {
		return this.arVarSub;
	}

	public void setArVarSub(String arVarSub) {
		this.arVarSub = arVarSub;
	}

	public Boolean getArPrepayment() {
		return this.arPrepayment;
	}

	public void setArPrepayment(Boolean arPrepayment) {
		this.arPrepayment = arPrepayment;
	}

	public String getArShipfrom() {
		return this.arShipfrom;
	}

	public void setArShipfrom(String arShipfrom) {
		this.arShipfrom = arShipfrom;
	}

	public String getArCustomerBank() {
		return this.arCustomerBank;
	}

	public void setArCustomerBank(String arCustomerBank) {
		this.arCustomerBank = arCustomerBank;
	}

	public Date getArDraftDiscDate() {
		return this.arDraftDiscDate;
	}

	public void setArDraftDiscDate(Date arDraftDiscDate) {
		this.arDraftDiscDate = arDraftDiscDate;
	}

	public Date getArReconDate() {
		return this.arReconDate;
	}

	public void setArReconDate(Date arReconDate) {
		this.arReconDate = arReconDate;
	}

	public String getArStatus() {
		return this.arStatus;
	}

	public void setArStatus(String arStatus) {
		this.arStatus = arStatus;
	}

	public Boolean getArCustomerInitiated() {
		return this.arCustomerInitiated;
	}

	public void setArCustomerInitiated(Boolean arCustomerInitiated) {
		this.arCustomerInitiated = arCustomerInitiated;
	}

	public Date getArDraftSubmitDate() {
		return this.arDraftSubmitDate;
	}

	public void setArDraftSubmitDate(Date arDraftSubmitDate) {
		this.arDraftSubmitDate = arDraftSubmitDate;
	}

	public String getArPayMethod() {
		return this.arPayMethod;
	}

	public void setArPayMethod(String arPayMethod) {
		this.arPayMethod = arPayMethod;
	}

	public Date getArVoidDate() {
		return this.arVoidDate;
	}

	public void setArVoidDate(Date arVoidDate) {
		this.arVoidDate = arVoidDate;
	}

	public Double getOidArMstr() {
		return this.oidArMstr;
	}

	public void setOidArMstr(Double oidArMstr) {
		this.oidArMstr = oidArMstr;
	}

}