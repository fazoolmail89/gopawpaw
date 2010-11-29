package com.gopawpaw.erp.hibernate.c;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractCmMstr entity provides the base persistence definition of the CmMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmMstr implements java.io.Serializable {

	// Fields

	private CmMstrId id;
	private String cmShip;
	private String cmType;
	private String cmCrTerms;
	private String cmXslspsn;
	private Integer cmQadi01;
	private String cmPrList;
	private Double cmDiscPct;
	private Boolean cmPartial;
	private Boolean cmStmt;
	private Boolean cmDun;
	private Boolean cmFin;
	private String cmArAcct;
	private String cmArCc;
	private String cmQadc07;
	private String cmQadc01;
	private String cmStmtCyc;
	private String cmShipvia;
	private String cmRmks;
	private String cmResale;
	private String cmRegion;
	private String cmQad04;
	private String cmSort;
	private Double cmBalance;
	private Boolean cmTaxable;
	private Date cmPayDate;
	private String cmXslspsn2;
	private Integer cmQadi02;
	private Integer cmAvgPay;
	private String cmUser1;
	private String cmUser2;
	private String cmCurr;
	private String cmLang;
	private String cmDb;
	private Boolean cmCrHold;
	private String cmCrRating;
	private Double cmHighCr;
	private Date cmHighDate;
	private Date cmSaleDate;
	private Integer cmInvoices;
	private Date cmFinDate;
	private Boolean cmQad06;
	private String cmFstId;
	private String cmPstId;
	private Boolean cmPst;
	private Boolean cmTaxIn;
	private String cmSite;
	private String cmClass;
	private String cmTaxc;
	private String cmBill;
	private String cmChr01;
	private String cmChr02;
	private String cmChr03;
	private String cmChr04;
	private String cmChr05;
	private String cmChr06;
	private String cmChr07;
	private String cmChr08;
	private String cmChr09;
	private String cmChr10;
	private Date cmDte01;
	private Date cmDte02;
	private Double cmDec01;
	private Double cmDec02;
	private Boolean cmLog01;
	private String cmQadc02;
	private String cmFrList;
	private String cmFrTerms;
	private String cmUserid;
	private Date cmModDate;
	private String cmConrepLogic;
	private String cmSlspsn;
	private BigDecimal cmFrMinWt;
	private Double cmDrftBal;
	private Double cmLcBal;
	private String cmPrList2;
	private Boolean cmFixPr;
	private Date cmCrUpdate;
	private Date cmCrReview;
	private String cmCollMthd;
	private Double cmDrftMin;
	private Double cmDrftMax;
	private Boolean cmDrftDisc;
	private Boolean cmDrftApv;
	private Boolean cmInternal;
	private String cmSvcList;
	private Boolean cmPoReqd;
	private String cmServTerms;
	private BigDecimal cmCrLimit;
	private String cmPromo;
	private Boolean cmBtbCr;
	private String cmBtbType;
	private Integer cmShipLt;
	private Boolean cmBtbMthd;
	private String cmExRatetype;
	private String cmDiscComb;
	private String cmScurr;
	private String cmQadc03;
	private String cmQadc04;
	private String cmQadc05;
	private String cmQadc06;
	private Double cmQadd01;
	private Double cmQadd02;
	private Boolean cmQadl01;
	private Boolean cmQadl02;
	private Boolean cmQadl03;
	private Boolean cmQadl04;
	private Date cmQadt01;
	private Date cmQadt02;
	private Integer cmQadi03;
	private Integer cmQadi04;
	private String cmArSub;
	private String cmSic;
	private String cmPayMethod;
	private Boolean cmSubmitProp;
	private String cmBank;
	private Double oidCmMstr;

	// Constructors

	/** default constructor */
	public AbstractCmMstr() {
	}

	/** minimal constructor */
	public AbstractCmMstr(CmMstrId id, String cmCollMthd, Double cmDrftMin,
			Double cmDrftMax, Boolean cmDrftDisc, Boolean cmDrftApv,
			String cmPromo, Boolean cmBtbCr, String cmBtbType,
			Integer cmShipLt, Boolean cmBtbMthd, String cmExRatetype,
			String cmScurr, String cmSic, String cmPayMethod,
			Boolean cmSubmitProp, String cmBank, Double oidCmMstr) {
		this.id = id;
		this.cmCollMthd = cmCollMthd;
		this.cmDrftMin = cmDrftMin;
		this.cmDrftMax = cmDrftMax;
		this.cmDrftDisc = cmDrftDisc;
		this.cmDrftApv = cmDrftApv;
		this.cmPromo = cmPromo;
		this.cmBtbCr = cmBtbCr;
		this.cmBtbType = cmBtbType;
		this.cmShipLt = cmShipLt;
		this.cmBtbMthd = cmBtbMthd;
		this.cmExRatetype = cmExRatetype;
		this.cmScurr = cmScurr;
		this.cmSic = cmSic;
		this.cmPayMethod = cmPayMethod;
		this.cmSubmitProp = cmSubmitProp;
		this.cmBank = cmBank;
		this.oidCmMstr = oidCmMstr;
	}

	/** full constructor */
	public AbstractCmMstr(CmMstrId id, String cmShip, String cmType,
			String cmCrTerms, String cmXslspsn, Integer cmQadi01,
			String cmPrList, Double cmDiscPct, Boolean cmPartial,
			Boolean cmStmt, Boolean cmDun, Boolean cmFin, String cmArAcct,
			String cmArCc, String cmQadc07, String cmQadc01, String cmStmtCyc,
			String cmShipvia, String cmRmks, String cmResale, String cmRegion,
			String cmQad04, String cmSort, Double cmBalance, Boolean cmTaxable,
			Date cmPayDate, String cmXslspsn2, Integer cmQadi02,
			Integer cmAvgPay, String cmUser1, String cmUser2, String cmCurr,
			String cmLang, String cmDb, Boolean cmCrHold, String cmCrRating,
			Double cmHighCr, Date cmHighDate, Date cmSaleDate,
			Integer cmInvoices, Date cmFinDate, Boolean cmQad06,
			String cmFstId, String cmPstId, Boolean cmPst, Boolean cmTaxIn,
			String cmSite, String cmClass, String cmTaxc, String cmBill,
			String cmChr01, String cmChr02, String cmChr03, String cmChr04,
			String cmChr05, String cmChr06, String cmChr07, String cmChr08,
			String cmChr09, String cmChr10, Date cmDte01, Date cmDte02,
			Double cmDec01, Double cmDec02, Boolean cmLog01, String cmQadc02,
			String cmFrList, String cmFrTerms, String cmUserid, Date cmModDate,
			String cmConrepLogic, String cmSlspsn, BigDecimal cmFrMinWt,
			Double cmDrftBal, Double cmLcBal, String cmPrList2,
			Boolean cmFixPr, Date cmCrUpdate, Date cmCrReview,
			String cmCollMthd, Double cmDrftMin, Double cmDrftMax,
			Boolean cmDrftDisc, Boolean cmDrftApv, Boolean cmInternal,
			String cmSvcList, Boolean cmPoReqd, String cmServTerms,
			BigDecimal cmCrLimit, String cmPromo, Boolean cmBtbCr,
			String cmBtbType, Integer cmShipLt, Boolean cmBtbMthd,
			String cmExRatetype, String cmDiscComb, String cmScurr,
			String cmQadc03, String cmQadc04, String cmQadc05, String cmQadc06,
			Double cmQadd01, Double cmQadd02, Boolean cmQadl01,
			Boolean cmQadl02, Boolean cmQadl03, Boolean cmQadl04,
			Date cmQadt01, Date cmQadt02, Integer cmQadi03, Integer cmQadi04,
			String cmArSub, String cmSic, String cmPayMethod,
			Boolean cmSubmitProp, String cmBank, Double oidCmMstr) {
		this.id = id;
		this.cmShip = cmShip;
		this.cmType = cmType;
		this.cmCrTerms = cmCrTerms;
		this.cmXslspsn = cmXslspsn;
		this.cmQadi01 = cmQadi01;
		this.cmPrList = cmPrList;
		this.cmDiscPct = cmDiscPct;
		this.cmPartial = cmPartial;
		this.cmStmt = cmStmt;
		this.cmDun = cmDun;
		this.cmFin = cmFin;
		this.cmArAcct = cmArAcct;
		this.cmArCc = cmArCc;
		this.cmQadc07 = cmQadc07;
		this.cmQadc01 = cmQadc01;
		this.cmStmtCyc = cmStmtCyc;
		this.cmShipvia = cmShipvia;
		this.cmRmks = cmRmks;
		this.cmResale = cmResale;
		this.cmRegion = cmRegion;
		this.cmQad04 = cmQad04;
		this.cmSort = cmSort;
		this.cmBalance = cmBalance;
		this.cmTaxable = cmTaxable;
		this.cmPayDate = cmPayDate;
		this.cmXslspsn2 = cmXslspsn2;
		this.cmQadi02 = cmQadi02;
		this.cmAvgPay = cmAvgPay;
		this.cmUser1 = cmUser1;
		this.cmUser2 = cmUser2;
		this.cmCurr = cmCurr;
		this.cmLang = cmLang;
		this.cmDb = cmDb;
		this.cmCrHold = cmCrHold;
		this.cmCrRating = cmCrRating;
		this.cmHighCr = cmHighCr;
		this.cmHighDate = cmHighDate;
		this.cmSaleDate = cmSaleDate;
		this.cmInvoices = cmInvoices;
		this.cmFinDate = cmFinDate;
		this.cmQad06 = cmQad06;
		this.cmFstId = cmFstId;
		this.cmPstId = cmPstId;
		this.cmPst = cmPst;
		this.cmTaxIn = cmTaxIn;
		this.cmSite = cmSite;
		this.cmClass = cmClass;
		this.cmTaxc = cmTaxc;
		this.cmBill = cmBill;
		this.cmChr01 = cmChr01;
		this.cmChr02 = cmChr02;
		this.cmChr03 = cmChr03;
		this.cmChr04 = cmChr04;
		this.cmChr05 = cmChr05;
		this.cmChr06 = cmChr06;
		this.cmChr07 = cmChr07;
		this.cmChr08 = cmChr08;
		this.cmChr09 = cmChr09;
		this.cmChr10 = cmChr10;
		this.cmDte01 = cmDte01;
		this.cmDte02 = cmDte02;
		this.cmDec01 = cmDec01;
		this.cmDec02 = cmDec02;
		this.cmLog01 = cmLog01;
		this.cmQadc02 = cmQadc02;
		this.cmFrList = cmFrList;
		this.cmFrTerms = cmFrTerms;
		this.cmUserid = cmUserid;
		this.cmModDate = cmModDate;
		this.cmConrepLogic = cmConrepLogic;
		this.cmSlspsn = cmSlspsn;
		this.cmFrMinWt = cmFrMinWt;
		this.cmDrftBal = cmDrftBal;
		this.cmLcBal = cmLcBal;
		this.cmPrList2 = cmPrList2;
		this.cmFixPr = cmFixPr;
		this.cmCrUpdate = cmCrUpdate;
		this.cmCrReview = cmCrReview;
		this.cmCollMthd = cmCollMthd;
		this.cmDrftMin = cmDrftMin;
		this.cmDrftMax = cmDrftMax;
		this.cmDrftDisc = cmDrftDisc;
		this.cmDrftApv = cmDrftApv;
		this.cmInternal = cmInternal;
		this.cmSvcList = cmSvcList;
		this.cmPoReqd = cmPoReqd;
		this.cmServTerms = cmServTerms;
		this.cmCrLimit = cmCrLimit;
		this.cmPromo = cmPromo;
		this.cmBtbCr = cmBtbCr;
		this.cmBtbType = cmBtbType;
		this.cmShipLt = cmShipLt;
		this.cmBtbMthd = cmBtbMthd;
		this.cmExRatetype = cmExRatetype;
		this.cmDiscComb = cmDiscComb;
		this.cmScurr = cmScurr;
		this.cmQadc03 = cmQadc03;
		this.cmQadc04 = cmQadc04;
		this.cmQadc05 = cmQadc05;
		this.cmQadc06 = cmQadc06;
		this.cmQadd01 = cmQadd01;
		this.cmQadd02 = cmQadd02;
		this.cmQadl01 = cmQadl01;
		this.cmQadl02 = cmQadl02;
		this.cmQadl03 = cmQadl03;
		this.cmQadl04 = cmQadl04;
		this.cmQadt01 = cmQadt01;
		this.cmQadt02 = cmQadt02;
		this.cmQadi03 = cmQadi03;
		this.cmQadi04 = cmQadi04;
		this.cmArSub = cmArSub;
		this.cmSic = cmSic;
		this.cmPayMethod = cmPayMethod;
		this.cmSubmitProp = cmSubmitProp;
		this.cmBank = cmBank;
		this.oidCmMstr = oidCmMstr;
	}

	// Property accessors

	public CmMstrId getId() {
		return this.id;
	}

	public void setId(CmMstrId id) {
		this.id = id;
	}

	public String getCmShip() {
		return this.cmShip;
	}

	public void setCmShip(String cmShip) {
		this.cmShip = cmShip;
	}

	public String getCmType() {
		return this.cmType;
	}

	public void setCmType(String cmType) {
		this.cmType = cmType;
	}

	public String getCmCrTerms() {
		return this.cmCrTerms;
	}

	public void setCmCrTerms(String cmCrTerms) {
		this.cmCrTerms = cmCrTerms;
	}

	public String getCmXslspsn() {
		return this.cmXslspsn;
	}

	public void setCmXslspsn(String cmXslspsn) {
		this.cmXslspsn = cmXslspsn;
	}

	public Integer getCmQadi01() {
		return this.cmQadi01;
	}

	public void setCmQadi01(Integer cmQadi01) {
		this.cmQadi01 = cmQadi01;
	}

	public String getCmPrList() {
		return this.cmPrList;
	}

	public void setCmPrList(String cmPrList) {
		this.cmPrList = cmPrList;
	}

	public Double getCmDiscPct() {
		return this.cmDiscPct;
	}

	public void setCmDiscPct(Double cmDiscPct) {
		this.cmDiscPct = cmDiscPct;
	}

	public Boolean getCmPartial() {
		return this.cmPartial;
	}

	public void setCmPartial(Boolean cmPartial) {
		this.cmPartial = cmPartial;
	}

	public Boolean getCmStmt() {
		return this.cmStmt;
	}

	public void setCmStmt(Boolean cmStmt) {
		this.cmStmt = cmStmt;
	}

	public Boolean getCmDun() {
		return this.cmDun;
	}

	public void setCmDun(Boolean cmDun) {
		this.cmDun = cmDun;
	}

	public Boolean getCmFin() {
		return this.cmFin;
	}

	public void setCmFin(Boolean cmFin) {
		this.cmFin = cmFin;
	}

	public String getCmArAcct() {
		return this.cmArAcct;
	}

	public void setCmArAcct(String cmArAcct) {
		this.cmArAcct = cmArAcct;
	}

	public String getCmArCc() {
		return this.cmArCc;
	}

	public void setCmArCc(String cmArCc) {
		this.cmArCc = cmArCc;
	}

	public String getCmQadc07() {
		return this.cmQadc07;
	}

	public void setCmQadc07(String cmQadc07) {
		this.cmQadc07 = cmQadc07;
	}

	public String getCmQadc01() {
		return this.cmQadc01;
	}

	public void setCmQadc01(String cmQadc01) {
		this.cmQadc01 = cmQadc01;
	}

	public String getCmStmtCyc() {
		return this.cmStmtCyc;
	}

	public void setCmStmtCyc(String cmStmtCyc) {
		this.cmStmtCyc = cmStmtCyc;
	}

	public String getCmShipvia() {
		return this.cmShipvia;
	}

	public void setCmShipvia(String cmShipvia) {
		this.cmShipvia = cmShipvia;
	}

	public String getCmRmks() {
		return this.cmRmks;
	}

	public void setCmRmks(String cmRmks) {
		this.cmRmks = cmRmks;
	}

	public String getCmResale() {
		return this.cmResale;
	}

	public void setCmResale(String cmResale) {
		this.cmResale = cmResale;
	}

	public String getCmRegion() {
		return this.cmRegion;
	}

	public void setCmRegion(String cmRegion) {
		this.cmRegion = cmRegion;
	}

	public String getCmQad04() {
		return this.cmQad04;
	}

	public void setCmQad04(String cmQad04) {
		this.cmQad04 = cmQad04;
	}

	public String getCmSort() {
		return this.cmSort;
	}

	public void setCmSort(String cmSort) {
		this.cmSort = cmSort;
	}

	public Double getCmBalance() {
		return this.cmBalance;
	}

	public void setCmBalance(Double cmBalance) {
		this.cmBalance = cmBalance;
	}

	public Boolean getCmTaxable() {
		return this.cmTaxable;
	}

	public void setCmTaxable(Boolean cmTaxable) {
		this.cmTaxable = cmTaxable;
	}

	public Date getCmPayDate() {
		return this.cmPayDate;
	}

	public void setCmPayDate(Date cmPayDate) {
		this.cmPayDate = cmPayDate;
	}

	public String getCmXslspsn2() {
		return this.cmXslspsn2;
	}

	public void setCmXslspsn2(String cmXslspsn2) {
		this.cmXslspsn2 = cmXslspsn2;
	}

	public Integer getCmQadi02() {
		return this.cmQadi02;
	}

	public void setCmQadi02(Integer cmQadi02) {
		this.cmQadi02 = cmQadi02;
	}

	public Integer getCmAvgPay() {
		return this.cmAvgPay;
	}

	public void setCmAvgPay(Integer cmAvgPay) {
		this.cmAvgPay = cmAvgPay;
	}

	public String getCmUser1() {
		return this.cmUser1;
	}

	public void setCmUser1(String cmUser1) {
		this.cmUser1 = cmUser1;
	}

	public String getCmUser2() {
		return this.cmUser2;
	}

	public void setCmUser2(String cmUser2) {
		this.cmUser2 = cmUser2;
	}

	public String getCmCurr() {
		return this.cmCurr;
	}

	public void setCmCurr(String cmCurr) {
		this.cmCurr = cmCurr;
	}

	public String getCmLang() {
		return this.cmLang;
	}

	public void setCmLang(String cmLang) {
		this.cmLang = cmLang;
	}

	public String getCmDb() {
		return this.cmDb;
	}

	public void setCmDb(String cmDb) {
		this.cmDb = cmDb;
	}

	public Boolean getCmCrHold() {
		return this.cmCrHold;
	}

	public void setCmCrHold(Boolean cmCrHold) {
		this.cmCrHold = cmCrHold;
	}

	public String getCmCrRating() {
		return this.cmCrRating;
	}

	public void setCmCrRating(String cmCrRating) {
		this.cmCrRating = cmCrRating;
	}

	public Double getCmHighCr() {
		return this.cmHighCr;
	}

	public void setCmHighCr(Double cmHighCr) {
		this.cmHighCr = cmHighCr;
	}

	public Date getCmHighDate() {
		return this.cmHighDate;
	}

	public void setCmHighDate(Date cmHighDate) {
		this.cmHighDate = cmHighDate;
	}

	public Date getCmSaleDate() {
		return this.cmSaleDate;
	}

	public void setCmSaleDate(Date cmSaleDate) {
		this.cmSaleDate = cmSaleDate;
	}

	public Integer getCmInvoices() {
		return this.cmInvoices;
	}

	public void setCmInvoices(Integer cmInvoices) {
		this.cmInvoices = cmInvoices;
	}

	public Date getCmFinDate() {
		return this.cmFinDate;
	}

	public void setCmFinDate(Date cmFinDate) {
		this.cmFinDate = cmFinDate;
	}

	public Boolean getCmQad06() {
		return this.cmQad06;
	}

	public void setCmQad06(Boolean cmQad06) {
		this.cmQad06 = cmQad06;
	}

	public String getCmFstId() {
		return this.cmFstId;
	}

	public void setCmFstId(String cmFstId) {
		this.cmFstId = cmFstId;
	}

	public String getCmPstId() {
		return this.cmPstId;
	}

	public void setCmPstId(String cmPstId) {
		this.cmPstId = cmPstId;
	}

	public Boolean getCmPst() {
		return this.cmPst;
	}

	public void setCmPst(Boolean cmPst) {
		this.cmPst = cmPst;
	}

	public Boolean getCmTaxIn() {
		return this.cmTaxIn;
	}

	public void setCmTaxIn(Boolean cmTaxIn) {
		this.cmTaxIn = cmTaxIn;
	}

	public String getCmSite() {
		return this.cmSite;
	}

	public void setCmSite(String cmSite) {
		this.cmSite = cmSite;
	}

	public String getCmClass() {
		return this.cmClass;
	}

	public void setCmClass(String cmClass) {
		this.cmClass = cmClass;
	}

	public String getCmTaxc() {
		return this.cmTaxc;
	}

	public void setCmTaxc(String cmTaxc) {
		this.cmTaxc = cmTaxc;
	}

	public String getCmBill() {
		return this.cmBill;
	}

	public void setCmBill(String cmBill) {
		this.cmBill = cmBill;
	}

	public String getCmChr01() {
		return this.cmChr01;
	}

	public void setCmChr01(String cmChr01) {
		this.cmChr01 = cmChr01;
	}

	public String getCmChr02() {
		return this.cmChr02;
	}

	public void setCmChr02(String cmChr02) {
		this.cmChr02 = cmChr02;
	}

	public String getCmChr03() {
		return this.cmChr03;
	}

	public void setCmChr03(String cmChr03) {
		this.cmChr03 = cmChr03;
	}

	public String getCmChr04() {
		return this.cmChr04;
	}

	public void setCmChr04(String cmChr04) {
		this.cmChr04 = cmChr04;
	}

	public String getCmChr05() {
		return this.cmChr05;
	}

	public void setCmChr05(String cmChr05) {
		this.cmChr05 = cmChr05;
	}

	public String getCmChr06() {
		return this.cmChr06;
	}

	public void setCmChr06(String cmChr06) {
		this.cmChr06 = cmChr06;
	}

	public String getCmChr07() {
		return this.cmChr07;
	}

	public void setCmChr07(String cmChr07) {
		this.cmChr07 = cmChr07;
	}

	public String getCmChr08() {
		return this.cmChr08;
	}

	public void setCmChr08(String cmChr08) {
		this.cmChr08 = cmChr08;
	}

	public String getCmChr09() {
		return this.cmChr09;
	}

	public void setCmChr09(String cmChr09) {
		this.cmChr09 = cmChr09;
	}

	public String getCmChr10() {
		return this.cmChr10;
	}

	public void setCmChr10(String cmChr10) {
		this.cmChr10 = cmChr10;
	}

	public Date getCmDte01() {
		return this.cmDte01;
	}

	public void setCmDte01(Date cmDte01) {
		this.cmDte01 = cmDte01;
	}

	public Date getCmDte02() {
		return this.cmDte02;
	}

	public void setCmDte02(Date cmDte02) {
		this.cmDte02 = cmDte02;
	}

	public Double getCmDec01() {
		return this.cmDec01;
	}

	public void setCmDec01(Double cmDec01) {
		this.cmDec01 = cmDec01;
	}

	public Double getCmDec02() {
		return this.cmDec02;
	}

	public void setCmDec02(Double cmDec02) {
		this.cmDec02 = cmDec02;
	}

	public Boolean getCmLog01() {
		return this.cmLog01;
	}

	public void setCmLog01(Boolean cmLog01) {
		this.cmLog01 = cmLog01;
	}

	public String getCmQadc02() {
		return this.cmQadc02;
	}

	public void setCmQadc02(String cmQadc02) {
		this.cmQadc02 = cmQadc02;
	}

	public String getCmFrList() {
		return this.cmFrList;
	}

	public void setCmFrList(String cmFrList) {
		this.cmFrList = cmFrList;
	}

	public String getCmFrTerms() {
		return this.cmFrTerms;
	}

	public void setCmFrTerms(String cmFrTerms) {
		this.cmFrTerms = cmFrTerms;
	}

	public String getCmUserid() {
		return this.cmUserid;
	}

	public void setCmUserid(String cmUserid) {
		this.cmUserid = cmUserid;
	}

	public Date getCmModDate() {
		return this.cmModDate;
	}

	public void setCmModDate(Date cmModDate) {
		this.cmModDate = cmModDate;
	}

	public String getCmConrepLogic() {
		return this.cmConrepLogic;
	}

	public void setCmConrepLogic(String cmConrepLogic) {
		this.cmConrepLogic = cmConrepLogic;
	}

	public String getCmSlspsn() {
		return this.cmSlspsn;
	}

	public void setCmSlspsn(String cmSlspsn) {
		this.cmSlspsn = cmSlspsn;
	}

	public BigDecimal getCmFrMinWt() {
		return this.cmFrMinWt;
	}

	public void setCmFrMinWt(BigDecimal cmFrMinWt) {
		this.cmFrMinWt = cmFrMinWt;
	}

	public Double getCmDrftBal() {
		return this.cmDrftBal;
	}

	public void setCmDrftBal(Double cmDrftBal) {
		this.cmDrftBal = cmDrftBal;
	}

	public Double getCmLcBal() {
		return this.cmLcBal;
	}

	public void setCmLcBal(Double cmLcBal) {
		this.cmLcBal = cmLcBal;
	}

	public String getCmPrList2() {
		return this.cmPrList2;
	}

	public void setCmPrList2(String cmPrList2) {
		this.cmPrList2 = cmPrList2;
	}

	public Boolean getCmFixPr() {
		return this.cmFixPr;
	}

	public void setCmFixPr(Boolean cmFixPr) {
		this.cmFixPr = cmFixPr;
	}

	public Date getCmCrUpdate() {
		return this.cmCrUpdate;
	}

	public void setCmCrUpdate(Date cmCrUpdate) {
		this.cmCrUpdate = cmCrUpdate;
	}

	public Date getCmCrReview() {
		return this.cmCrReview;
	}

	public void setCmCrReview(Date cmCrReview) {
		this.cmCrReview = cmCrReview;
	}

	public String getCmCollMthd() {
		return this.cmCollMthd;
	}

	public void setCmCollMthd(String cmCollMthd) {
		this.cmCollMthd = cmCollMthd;
	}

	public Double getCmDrftMin() {
		return this.cmDrftMin;
	}

	public void setCmDrftMin(Double cmDrftMin) {
		this.cmDrftMin = cmDrftMin;
	}

	public Double getCmDrftMax() {
		return this.cmDrftMax;
	}

	public void setCmDrftMax(Double cmDrftMax) {
		this.cmDrftMax = cmDrftMax;
	}

	public Boolean getCmDrftDisc() {
		return this.cmDrftDisc;
	}

	public void setCmDrftDisc(Boolean cmDrftDisc) {
		this.cmDrftDisc = cmDrftDisc;
	}

	public Boolean getCmDrftApv() {
		return this.cmDrftApv;
	}

	public void setCmDrftApv(Boolean cmDrftApv) {
		this.cmDrftApv = cmDrftApv;
	}

	public Boolean getCmInternal() {
		return this.cmInternal;
	}

	public void setCmInternal(Boolean cmInternal) {
		this.cmInternal = cmInternal;
	}

	public String getCmSvcList() {
		return this.cmSvcList;
	}

	public void setCmSvcList(String cmSvcList) {
		this.cmSvcList = cmSvcList;
	}

	public Boolean getCmPoReqd() {
		return this.cmPoReqd;
	}

	public void setCmPoReqd(Boolean cmPoReqd) {
		this.cmPoReqd = cmPoReqd;
	}

	public String getCmServTerms() {
		return this.cmServTerms;
	}

	public void setCmServTerms(String cmServTerms) {
		this.cmServTerms = cmServTerms;
	}

	public BigDecimal getCmCrLimit() {
		return this.cmCrLimit;
	}

	public void setCmCrLimit(BigDecimal cmCrLimit) {
		this.cmCrLimit = cmCrLimit;
	}

	public String getCmPromo() {
		return this.cmPromo;
	}

	public void setCmPromo(String cmPromo) {
		this.cmPromo = cmPromo;
	}

	public Boolean getCmBtbCr() {
		return this.cmBtbCr;
	}

	public void setCmBtbCr(Boolean cmBtbCr) {
		this.cmBtbCr = cmBtbCr;
	}

	public String getCmBtbType() {
		return this.cmBtbType;
	}

	public void setCmBtbType(String cmBtbType) {
		this.cmBtbType = cmBtbType;
	}

	public Integer getCmShipLt() {
		return this.cmShipLt;
	}

	public void setCmShipLt(Integer cmShipLt) {
		this.cmShipLt = cmShipLt;
	}

	public Boolean getCmBtbMthd() {
		return this.cmBtbMthd;
	}

	public void setCmBtbMthd(Boolean cmBtbMthd) {
		this.cmBtbMthd = cmBtbMthd;
	}

	public String getCmExRatetype() {
		return this.cmExRatetype;
	}

	public void setCmExRatetype(String cmExRatetype) {
		this.cmExRatetype = cmExRatetype;
	}

	public String getCmDiscComb() {
		return this.cmDiscComb;
	}

	public void setCmDiscComb(String cmDiscComb) {
		this.cmDiscComb = cmDiscComb;
	}

	public String getCmScurr() {
		return this.cmScurr;
	}

	public void setCmScurr(String cmScurr) {
		this.cmScurr = cmScurr;
	}

	public String getCmQadc03() {
		return this.cmQadc03;
	}

	public void setCmQadc03(String cmQadc03) {
		this.cmQadc03 = cmQadc03;
	}

	public String getCmQadc04() {
		return this.cmQadc04;
	}

	public void setCmQadc04(String cmQadc04) {
		this.cmQadc04 = cmQadc04;
	}

	public String getCmQadc05() {
		return this.cmQadc05;
	}

	public void setCmQadc05(String cmQadc05) {
		this.cmQadc05 = cmQadc05;
	}

	public String getCmQadc06() {
		return this.cmQadc06;
	}

	public void setCmQadc06(String cmQadc06) {
		this.cmQadc06 = cmQadc06;
	}

	public Double getCmQadd01() {
		return this.cmQadd01;
	}

	public void setCmQadd01(Double cmQadd01) {
		this.cmQadd01 = cmQadd01;
	}

	public Double getCmQadd02() {
		return this.cmQadd02;
	}

	public void setCmQadd02(Double cmQadd02) {
		this.cmQadd02 = cmQadd02;
	}

	public Boolean getCmQadl01() {
		return this.cmQadl01;
	}

	public void setCmQadl01(Boolean cmQadl01) {
		this.cmQadl01 = cmQadl01;
	}

	public Boolean getCmQadl02() {
		return this.cmQadl02;
	}

	public void setCmQadl02(Boolean cmQadl02) {
		this.cmQadl02 = cmQadl02;
	}

	public Boolean getCmQadl03() {
		return this.cmQadl03;
	}

	public void setCmQadl03(Boolean cmQadl03) {
		this.cmQadl03 = cmQadl03;
	}

	public Boolean getCmQadl04() {
		return this.cmQadl04;
	}

	public void setCmQadl04(Boolean cmQadl04) {
		this.cmQadl04 = cmQadl04;
	}

	public Date getCmQadt01() {
		return this.cmQadt01;
	}

	public void setCmQadt01(Date cmQadt01) {
		this.cmQadt01 = cmQadt01;
	}

	public Date getCmQadt02() {
		return this.cmQadt02;
	}

	public void setCmQadt02(Date cmQadt02) {
		this.cmQadt02 = cmQadt02;
	}

	public Integer getCmQadi03() {
		return this.cmQadi03;
	}

	public void setCmQadi03(Integer cmQadi03) {
		this.cmQadi03 = cmQadi03;
	}

	public Integer getCmQadi04() {
		return this.cmQadi04;
	}

	public void setCmQadi04(Integer cmQadi04) {
		this.cmQadi04 = cmQadi04;
	}

	public String getCmArSub() {
		return this.cmArSub;
	}

	public void setCmArSub(String cmArSub) {
		this.cmArSub = cmArSub;
	}

	public String getCmSic() {
		return this.cmSic;
	}

	public void setCmSic(String cmSic) {
		this.cmSic = cmSic;
	}

	public String getCmPayMethod() {
		return this.cmPayMethod;
	}

	public void setCmPayMethod(String cmPayMethod) {
		this.cmPayMethod = cmPayMethod;
	}

	public Boolean getCmSubmitProp() {
		return this.cmSubmitProp;
	}

	public void setCmSubmitProp(Boolean cmSubmitProp) {
		this.cmSubmitProp = cmSubmitProp;
	}

	public String getCmBank() {
		return this.cmBank;
	}

	public void setCmBank(String cmBank) {
		this.cmBank = cmBank;
	}

	public Double getOidCmMstr() {
		return this.oidCmMstr;
	}

	public void setOidCmMstr(Double oidCmMstr) {
		this.oidCmMstr = oidCmMstr;
	}

}