package com.gopawpaw.erp.hibernate.s;

import java.math.BigDecimal;

/**
 * AbstractSocCtrl entity provides the base persistence definition of the
 * SocCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSocCtrl implements java.io.Serializable {

	// Fields

	private String socDomain;
	private Boolean socOnOrd;
	private Boolean socReq;
	private Boolean socAll;
	private Boolean socPick;
	private Boolean socQad01;
	private Boolean socQad02;
	private Integer socInv;
	private Integer socSo;
	private Integer socAllDays;
	private Boolean socAllAvl;
	private Boolean socLnFmt;
	private Integer socJrnl;
	private Boolean socSoHist;
	private Integer socShpLead;
	private Boolean socPrint;
	private Boolean socAr;
	private String socCompany;
	private String socFob;
	private Boolean socHcmmts;
	private Boolean socLcmmts;
	private String socNtaxdesc;
	private Boolean socSa;
	private Integer socFcstFwd;
	private Integer socFcstBck;
	private String socTrlTax;
	private Boolean socInvHist;
	private Boolean socLnInv;
	private Boolean socConfirm;
	private Integer socQad03;
	private Boolean socDetAll;
	private Integer socFysm;
	private String socTrlNtax;
	private String socUser1;
	private String socUser2;
	private Integer socIndex1;
	private Integer socNextAbl;
	private Integer socNextCid;
	private Boolean socFrBySite;
	private String socInvPre;
	private String socSoPre;
	private Boolean socMargin;
	private Boolean socCrHold;
	private Boolean socPlReq;
	private BigDecimal socMinShip;
	private Double socInvMin;
	private Boolean socFrShpCalc;
	private String socFrcReturns;
	private String socCrtaccAcct;
	private String socCrtaccCc;
	private String socCrtappAcct;
	private String socCrtappCc;
	private Boolean socEditIsb;
	private Double socMinShpamt;
	private Boolean socPcLine;
	private Boolean socPimIsb;
	private String socPrintId;
	private Boolean socPtReq;
	private Boolean socBatch;
	private String socBatchId;
	private Boolean socReturnsIsb;
	private Boolean socQadl02;
	private Boolean socQadl03;
	private String socQadc01;
	private String socQadc02;
	private String socQadc03;
	private Integer socQadi01;
	private Integer socQadi02;
	private Boolean socApm;
	private String socBtbType;
	private Boolean socDueCalc;
	private Boolean socBtbAll;
	private String socBtbSel;
	private Boolean socUseBtb;
	private String socDumLoc;
	private Boolean socMlevelBtb;
	private String socExRatetype;
	private Boolean socUseFrtTrlCd;
	private String socCrtappSub;
	private String socCrtaccSub;
	private Boolean socPassCurr;
	private Boolean socAutoChg;
	private Boolean socAtpEnabled;
	private Boolean socCalcPromiseDate;
	private Integer socHorizon;
	private Integer socCrnNext;
	private String socCrnPre;
	private Double oidSocCtrl;

	// Constructors

	/** default constructor */
	public AbstractSocCtrl() {
	}

	/** minimal constructor */
	public AbstractSocCtrl(Boolean socReturnsIsb, Boolean socApm,
			String socBtbType, Boolean socDueCalc, Boolean socBtbAll,
			String socBtbSel, Boolean socUseBtb, String socDumLoc,
			String socExRatetype, Boolean socAtpEnabled,
			Boolean socCalcPromiseDate, Integer socHorizon, Integer socCrnNext,
			String socCrnPre, Double oidSocCtrl) {
		this.socReturnsIsb = socReturnsIsb;
		this.socApm = socApm;
		this.socBtbType = socBtbType;
		this.socDueCalc = socDueCalc;
		this.socBtbAll = socBtbAll;
		this.socBtbSel = socBtbSel;
		this.socUseBtb = socUseBtb;
		this.socDumLoc = socDumLoc;
		this.socExRatetype = socExRatetype;
		this.socAtpEnabled = socAtpEnabled;
		this.socCalcPromiseDate = socCalcPromiseDate;
		this.socHorizon = socHorizon;
		this.socCrnNext = socCrnNext;
		this.socCrnPre = socCrnPre;
		this.oidSocCtrl = oidSocCtrl;
	}

	/** full constructor */
	public AbstractSocCtrl(Boolean socOnOrd, Boolean socReq, Boolean socAll,
			Boolean socPick, Boolean socQad01, Boolean socQad02,
			Integer socInv, Integer socSo, Integer socAllDays,
			Boolean socAllAvl, Boolean socLnFmt, Integer socJrnl,
			Boolean socSoHist, Integer socShpLead, Boolean socPrint,
			Boolean socAr, String socCompany, String socFob, Boolean socHcmmts,
			Boolean socLcmmts, String socNtaxdesc, Boolean socSa,
			Integer socFcstFwd, Integer socFcstBck, String socTrlTax,
			Boolean socInvHist, Boolean socLnInv, Boolean socConfirm,
			Integer socQad03, Boolean socDetAll, Integer socFysm,
			String socTrlNtax, String socUser1, String socUser2,
			Integer socIndex1, Integer socNextAbl, Integer socNextCid,
			Boolean socFrBySite, String socInvPre, String socSoPre,
			Boolean socMargin, Boolean socCrHold, Boolean socPlReq,
			BigDecimal socMinShip, Double socInvMin, Boolean socFrShpCalc,
			String socFrcReturns, String socCrtaccAcct, String socCrtaccCc,
			String socCrtappAcct, String socCrtappCc, Boolean socEditIsb,
			Double socMinShpamt, Boolean socPcLine, Boolean socPimIsb,
			String socPrintId, Boolean socPtReq, Boolean socBatch,
			String socBatchId, Boolean socReturnsIsb, Boolean socQadl02,
			Boolean socQadl03, String socQadc01, String socQadc02,
			String socQadc03, Integer socQadi01, Integer socQadi02,
			Boolean socApm, String socBtbType, Boolean socDueCalc,
			Boolean socBtbAll, String socBtbSel, Boolean socUseBtb,
			String socDumLoc, Boolean socMlevelBtb, String socExRatetype,
			Boolean socUseFrtTrlCd, String socCrtappSub, String socCrtaccSub,
			Boolean socPassCurr, Boolean socAutoChg, Boolean socAtpEnabled,
			Boolean socCalcPromiseDate, Integer socHorizon, Integer socCrnNext,
			String socCrnPre, Double oidSocCtrl) {
		this.socOnOrd = socOnOrd;
		this.socReq = socReq;
		this.socAll = socAll;
		this.socPick = socPick;
		this.socQad01 = socQad01;
		this.socQad02 = socQad02;
		this.socInv = socInv;
		this.socSo = socSo;
		this.socAllDays = socAllDays;
		this.socAllAvl = socAllAvl;
		this.socLnFmt = socLnFmt;
		this.socJrnl = socJrnl;
		this.socSoHist = socSoHist;
		this.socShpLead = socShpLead;
		this.socPrint = socPrint;
		this.socAr = socAr;
		this.socCompany = socCompany;
		this.socFob = socFob;
		this.socHcmmts = socHcmmts;
		this.socLcmmts = socLcmmts;
		this.socNtaxdesc = socNtaxdesc;
		this.socSa = socSa;
		this.socFcstFwd = socFcstFwd;
		this.socFcstBck = socFcstBck;
		this.socTrlTax = socTrlTax;
		this.socInvHist = socInvHist;
		this.socLnInv = socLnInv;
		this.socConfirm = socConfirm;
		this.socQad03 = socQad03;
		this.socDetAll = socDetAll;
		this.socFysm = socFysm;
		this.socTrlNtax = socTrlNtax;
		this.socUser1 = socUser1;
		this.socUser2 = socUser2;
		this.socIndex1 = socIndex1;
		this.socNextAbl = socNextAbl;
		this.socNextCid = socNextCid;
		this.socFrBySite = socFrBySite;
		this.socInvPre = socInvPre;
		this.socSoPre = socSoPre;
		this.socMargin = socMargin;
		this.socCrHold = socCrHold;
		this.socPlReq = socPlReq;
		this.socMinShip = socMinShip;
		this.socInvMin = socInvMin;
		this.socFrShpCalc = socFrShpCalc;
		this.socFrcReturns = socFrcReturns;
		this.socCrtaccAcct = socCrtaccAcct;
		this.socCrtaccCc = socCrtaccCc;
		this.socCrtappAcct = socCrtappAcct;
		this.socCrtappCc = socCrtappCc;
		this.socEditIsb = socEditIsb;
		this.socMinShpamt = socMinShpamt;
		this.socPcLine = socPcLine;
		this.socPimIsb = socPimIsb;
		this.socPrintId = socPrintId;
		this.socPtReq = socPtReq;
		this.socBatch = socBatch;
		this.socBatchId = socBatchId;
		this.socReturnsIsb = socReturnsIsb;
		this.socQadl02 = socQadl02;
		this.socQadl03 = socQadl03;
		this.socQadc01 = socQadc01;
		this.socQadc02 = socQadc02;
		this.socQadc03 = socQadc03;
		this.socQadi01 = socQadi01;
		this.socQadi02 = socQadi02;
		this.socApm = socApm;
		this.socBtbType = socBtbType;
		this.socDueCalc = socDueCalc;
		this.socBtbAll = socBtbAll;
		this.socBtbSel = socBtbSel;
		this.socUseBtb = socUseBtb;
		this.socDumLoc = socDumLoc;
		this.socMlevelBtb = socMlevelBtb;
		this.socExRatetype = socExRatetype;
		this.socUseFrtTrlCd = socUseFrtTrlCd;
		this.socCrtappSub = socCrtappSub;
		this.socCrtaccSub = socCrtaccSub;
		this.socPassCurr = socPassCurr;
		this.socAutoChg = socAutoChg;
		this.socAtpEnabled = socAtpEnabled;
		this.socCalcPromiseDate = socCalcPromiseDate;
		this.socHorizon = socHorizon;
		this.socCrnNext = socCrnNext;
		this.socCrnPre = socCrnPre;
		this.oidSocCtrl = oidSocCtrl;
	}

	// Property accessors

	public String getSocDomain() {
		return this.socDomain;
	}

	public void setSocDomain(String socDomain) {
		this.socDomain = socDomain;
	}

	public Boolean getSocOnOrd() {
		return this.socOnOrd;
	}

	public void setSocOnOrd(Boolean socOnOrd) {
		this.socOnOrd = socOnOrd;
	}

	public Boolean getSocReq() {
		return this.socReq;
	}

	public void setSocReq(Boolean socReq) {
		this.socReq = socReq;
	}

	public Boolean getSocAll() {
		return this.socAll;
	}

	public void setSocAll(Boolean socAll) {
		this.socAll = socAll;
	}

	public Boolean getSocPick() {
		return this.socPick;
	}

	public void setSocPick(Boolean socPick) {
		this.socPick = socPick;
	}

	public Boolean getSocQad01() {
		return this.socQad01;
	}

	public void setSocQad01(Boolean socQad01) {
		this.socQad01 = socQad01;
	}

	public Boolean getSocQad02() {
		return this.socQad02;
	}

	public void setSocQad02(Boolean socQad02) {
		this.socQad02 = socQad02;
	}

	public Integer getSocInv() {
		return this.socInv;
	}

	public void setSocInv(Integer socInv) {
		this.socInv = socInv;
	}

	public Integer getSocSo() {
		return this.socSo;
	}

	public void setSocSo(Integer socSo) {
		this.socSo = socSo;
	}

	public Integer getSocAllDays() {
		return this.socAllDays;
	}

	public void setSocAllDays(Integer socAllDays) {
		this.socAllDays = socAllDays;
	}

	public Boolean getSocAllAvl() {
		return this.socAllAvl;
	}

	public void setSocAllAvl(Boolean socAllAvl) {
		this.socAllAvl = socAllAvl;
	}

	public Boolean getSocLnFmt() {
		return this.socLnFmt;
	}

	public void setSocLnFmt(Boolean socLnFmt) {
		this.socLnFmt = socLnFmt;
	}

	public Integer getSocJrnl() {
		return this.socJrnl;
	}

	public void setSocJrnl(Integer socJrnl) {
		this.socJrnl = socJrnl;
	}

	public Boolean getSocSoHist() {
		return this.socSoHist;
	}

	public void setSocSoHist(Boolean socSoHist) {
		this.socSoHist = socSoHist;
	}

	public Integer getSocShpLead() {
		return this.socShpLead;
	}

	public void setSocShpLead(Integer socShpLead) {
		this.socShpLead = socShpLead;
	}

	public Boolean getSocPrint() {
		return this.socPrint;
	}

	public void setSocPrint(Boolean socPrint) {
		this.socPrint = socPrint;
	}

	public Boolean getSocAr() {
		return this.socAr;
	}

	public void setSocAr(Boolean socAr) {
		this.socAr = socAr;
	}

	public String getSocCompany() {
		return this.socCompany;
	}

	public void setSocCompany(String socCompany) {
		this.socCompany = socCompany;
	}

	public String getSocFob() {
		return this.socFob;
	}

	public void setSocFob(String socFob) {
		this.socFob = socFob;
	}

	public Boolean getSocHcmmts() {
		return this.socHcmmts;
	}

	public void setSocHcmmts(Boolean socHcmmts) {
		this.socHcmmts = socHcmmts;
	}

	public Boolean getSocLcmmts() {
		return this.socLcmmts;
	}

	public void setSocLcmmts(Boolean socLcmmts) {
		this.socLcmmts = socLcmmts;
	}

	public String getSocNtaxdesc() {
		return this.socNtaxdesc;
	}

	public void setSocNtaxdesc(String socNtaxdesc) {
		this.socNtaxdesc = socNtaxdesc;
	}

	public Boolean getSocSa() {
		return this.socSa;
	}

	public void setSocSa(Boolean socSa) {
		this.socSa = socSa;
	}

	public Integer getSocFcstFwd() {
		return this.socFcstFwd;
	}

	public void setSocFcstFwd(Integer socFcstFwd) {
		this.socFcstFwd = socFcstFwd;
	}

	public Integer getSocFcstBck() {
		return this.socFcstBck;
	}

	public void setSocFcstBck(Integer socFcstBck) {
		this.socFcstBck = socFcstBck;
	}

	public String getSocTrlTax() {
		return this.socTrlTax;
	}

	public void setSocTrlTax(String socTrlTax) {
		this.socTrlTax = socTrlTax;
	}

	public Boolean getSocInvHist() {
		return this.socInvHist;
	}

	public void setSocInvHist(Boolean socInvHist) {
		this.socInvHist = socInvHist;
	}

	public Boolean getSocLnInv() {
		return this.socLnInv;
	}

	public void setSocLnInv(Boolean socLnInv) {
		this.socLnInv = socLnInv;
	}

	public Boolean getSocConfirm() {
		return this.socConfirm;
	}

	public void setSocConfirm(Boolean socConfirm) {
		this.socConfirm = socConfirm;
	}

	public Integer getSocQad03() {
		return this.socQad03;
	}

	public void setSocQad03(Integer socQad03) {
		this.socQad03 = socQad03;
	}

	public Boolean getSocDetAll() {
		return this.socDetAll;
	}

	public void setSocDetAll(Boolean socDetAll) {
		this.socDetAll = socDetAll;
	}

	public Integer getSocFysm() {
		return this.socFysm;
	}

	public void setSocFysm(Integer socFysm) {
		this.socFysm = socFysm;
	}

	public String getSocTrlNtax() {
		return this.socTrlNtax;
	}

	public void setSocTrlNtax(String socTrlNtax) {
		this.socTrlNtax = socTrlNtax;
	}

	public String getSocUser1() {
		return this.socUser1;
	}

	public void setSocUser1(String socUser1) {
		this.socUser1 = socUser1;
	}

	public String getSocUser2() {
		return this.socUser2;
	}

	public void setSocUser2(String socUser2) {
		this.socUser2 = socUser2;
	}

	public Integer getSocIndex1() {
		return this.socIndex1;
	}

	public void setSocIndex1(Integer socIndex1) {
		this.socIndex1 = socIndex1;
	}

	public Integer getSocNextAbl() {
		return this.socNextAbl;
	}

	public void setSocNextAbl(Integer socNextAbl) {
		this.socNextAbl = socNextAbl;
	}

	public Integer getSocNextCid() {
		return this.socNextCid;
	}

	public void setSocNextCid(Integer socNextCid) {
		this.socNextCid = socNextCid;
	}

	public Boolean getSocFrBySite() {
		return this.socFrBySite;
	}

	public void setSocFrBySite(Boolean socFrBySite) {
		this.socFrBySite = socFrBySite;
	}

	public String getSocInvPre() {
		return this.socInvPre;
	}

	public void setSocInvPre(String socInvPre) {
		this.socInvPre = socInvPre;
	}

	public String getSocSoPre() {
		return this.socSoPre;
	}

	public void setSocSoPre(String socSoPre) {
		this.socSoPre = socSoPre;
	}

	public Boolean getSocMargin() {
		return this.socMargin;
	}

	public void setSocMargin(Boolean socMargin) {
		this.socMargin = socMargin;
	}

	public Boolean getSocCrHold() {
		return this.socCrHold;
	}

	public void setSocCrHold(Boolean socCrHold) {
		this.socCrHold = socCrHold;
	}

	public Boolean getSocPlReq() {
		return this.socPlReq;
	}

	public void setSocPlReq(Boolean socPlReq) {
		this.socPlReq = socPlReq;
	}

	public BigDecimal getSocMinShip() {
		return this.socMinShip;
	}

	public void setSocMinShip(BigDecimal socMinShip) {
		this.socMinShip = socMinShip;
	}

	public Double getSocInvMin() {
		return this.socInvMin;
	}

	public void setSocInvMin(Double socInvMin) {
		this.socInvMin = socInvMin;
	}

	public Boolean getSocFrShpCalc() {
		return this.socFrShpCalc;
	}

	public void setSocFrShpCalc(Boolean socFrShpCalc) {
		this.socFrShpCalc = socFrShpCalc;
	}

	public String getSocFrcReturns() {
		return this.socFrcReturns;
	}

	public void setSocFrcReturns(String socFrcReturns) {
		this.socFrcReturns = socFrcReturns;
	}

	public String getSocCrtaccAcct() {
		return this.socCrtaccAcct;
	}

	public void setSocCrtaccAcct(String socCrtaccAcct) {
		this.socCrtaccAcct = socCrtaccAcct;
	}

	public String getSocCrtaccCc() {
		return this.socCrtaccCc;
	}

	public void setSocCrtaccCc(String socCrtaccCc) {
		this.socCrtaccCc = socCrtaccCc;
	}

	public String getSocCrtappAcct() {
		return this.socCrtappAcct;
	}

	public void setSocCrtappAcct(String socCrtappAcct) {
		this.socCrtappAcct = socCrtappAcct;
	}

	public String getSocCrtappCc() {
		return this.socCrtappCc;
	}

	public void setSocCrtappCc(String socCrtappCc) {
		this.socCrtappCc = socCrtappCc;
	}

	public Boolean getSocEditIsb() {
		return this.socEditIsb;
	}

	public void setSocEditIsb(Boolean socEditIsb) {
		this.socEditIsb = socEditIsb;
	}

	public Double getSocMinShpamt() {
		return this.socMinShpamt;
	}

	public void setSocMinShpamt(Double socMinShpamt) {
		this.socMinShpamt = socMinShpamt;
	}

	public Boolean getSocPcLine() {
		return this.socPcLine;
	}

	public void setSocPcLine(Boolean socPcLine) {
		this.socPcLine = socPcLine;
	}

	public Boolean getSocPimIsb() {
		return this.socPimIsb;
	}

	public void setSocPimIsb(Boolean socPimIsb) {
		this.socPimIsb = socPimIsb;
	}

	public String getSocPrintId() {
		return this.socPrintId;
	}

	public void setSocPrintId(String socPrintId) {
		this.socPrintId = socPrintId;
	}

	public Boolean getSocPtReq() {
		return this.socPtReq;
	}

	public void setSocPtReq(Boolean socPtReq) {
		this.socPtReq = socPtReq;
	}

	public Boolean getSocBatch() {
		return this.socBatch;
	}

	public void setSocBatch(Boolean socBatch) {
		this.socBatch = socBatch;
	}

	public String getSocBatchId() {
		return this.socBatchId;
	}

	public void setSocBatchId(String socBatchId) {
		this.socBatchId = socBatchId;
	}

	public Boolean getSocReturnsIsb() {
		return this.socReturnsIsb;
	}

	public void setSocReturnsIsb(Boolean socReturnsIsb) {
		this.socReturnsIsb = socReturnsIsb;
	}

	public Boolean getSocQadl02() {
		return this.socQadl02;
	}

	public void setSocQadl02(Boolean socQadl02) {
		this.socQadl02 = socQadl02;
	}

	public Boolean getSocQadl03() {
		return this.socQadl03;
	}

	public void setSocQadl03(Boolean socQadl03) {
		this.socQadl03 = socQadl03;
	}

	public String getSocQadc01() {
		return this.socQadc01;
	}

	public void setSocQadc01(String socQadc01) {
		this.socQadc01 = socQadc01;
	}

	public String getSocQadc02() {
		return this.socQadc02;
	}

	public void setSocQadc02(String socQadc02) {
		this.socQadc02 = socQadc02;
	}

	public String getSocQadc03() {
		return this.socQadc03;
	}

	public void setSocQadc03(String socQadc03) {
		this.socQadc03 = socQadc03;
	}

	public Integer getSocQadi01() {
		return this.socQadi01;
	}

	public void setSocQadi01(Integer socQadi01) {
		this.socQadi01 = socQadi01;
	}

	public Integer getSocQadi02() {
		return this.socQadi02;
	}

	public void setSocQadi02(Integer socQadi02) {
		this.socQadi02 = socQadi02;
	}

	public Boolean getSocApm() {
		return this.socApm;
	}

	public void setSocApm(Boolean socApm) {
		this.socApm = socApm;
	}

	public String getSocBtbType() {
		return this.socBtbType;
	}

	public void setSocBtbType(String socBtbType) {
		this.socBtbType = socBtbType;
	}

	public Boolean getSocDueCalc() {
		return this.socDueCalc;
	}

	public void setSocDueCalc(Boolean socDueCalc) {
		this.socDueCalc = socDueCalc;
	}

	public Boolean getSocBtbAll() {
		return this.socBtbAll;
	}

	public void setSocBtbAll(Boolean socBtbAll) {
		this.socBtbAll = socBtbAll;
	}

	public String getSocBtbSel() {
		return this.socBtbSel;
	}

	public void setSocBtbSel(String socBtbSel) {
		this.socBtbSel = socBtbSel;
	}

	public Boolean getSocUseBtb() {
		return this.socUseBtb;
	}

	public void setSocUseBtb(Boolean socUseBtb) {
		this.socUseBtb = socUseBtb;
	}

	public String getSocDumLoc() {
		return this.socDumLoc;
	}

	public void setSocDumLoc(String socDumLoc) {
		this.socDumLoc = socDumLoc;
	}

	public Boolean getSocMlevelBtb() {
		return this.socMlevelBtb;
	}

	public void setSocMlevelBtb(Boolean socMlevelBtb) {
		this.socMlevelBtb = socMlevelBtb;
	}

	public String getSocExRatetype() {
		return this.socExRatetype;
	}

	public void setSocExRatetype(String socExRatetype) {
		this.socExRatetype = socExRatetype;
	}

	public Boolean getSocUseFrtTrlCd() {
		return this.socUseFrtTrlCd;
	}

	public void setSocUseFrtTrlCd(Boolean socUseFrtTrlCd) {
		this.socUseFrtTrlCd = socUseFrtTrlCd;
	}

	public String getSocCrtappSub() {
		return this.socCrtappSub;
	}

	public void setSocCrtappSub(String socCrtappSub) {
		this.socCrtappSub = socCrtappSub;
	}

	public String getSocCrtaccSub() {
		return this.socCrtaccSub;
	}

	public void setSocCrtaccSub(String socCrtaccSub) {
		this.socCrtaccSub = socCrtaccSub;
	}

	public Boolean getSocPassCurr() {
		return this.socPassCurr;
	}

	public void setSocPassCurr(Boolean socPassCurr) {
		this.socPassCurr = socPassCurr;
	}

	public Boolean getSocAutoChg() {
		return this.socAutoChg;
	}

	public void setSocAutoChg(Boolean socAutoChg) {
		this.socAutoChg = socAutoChg;
	}

	public Boolean getSocAtpEnabled() {
		return this.socAtpEnabled;
	}

	public void setSocAtpEnabled(Boolean socAtpEnabled) {
		this.socAtpEnabled = socAtpEnabled;
	}

	public Boolean getSocCalcPromiseDate() {
		return this.socCalcPromiseDate;
	}

	public void setSocCalcPromiseDate(Boolean socCalcPromiseDate) {
		this.socCalcPromiseDate = socCalcPromiseDate;
	}

	public Integer getSocHorizon() {
		return this.socHorizon;
	}

	public void setSocHorizon(Integer socHorizon) {
		this.socHorizon = socHorizon;
	}

	public Integer getSocCrnNext() {
		return this.socCrnNext;
	}

	public void setSocCrnNext(Integer socCrnNext) {
		this.socCrnNext = socCrnNext;
	}

	public String getSocCrnPre() {
		return this.socCrnPre;
	}

	public void setSocCrnPre(String socCrnPre) {
		this.socCrnPre = socCrnPre;
	}

	public Double getOidSocCtrl() {
		return this.oidSocCtrl;
	}

	public void setOidSocCtrl(Double oidSocCtrl) {
		this.oidSocCtrl = oidSocCtrl;
	}

}