package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPrhHist entity provides the base persistence definition of the
 * PrhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPrhHist implements java.io.Serializable {

	// Fields

	private PrhHistId id;
	private String prhPart;
	private Double prhRcvd;
	private Double prhPurCost;
	private Double prhPurStd;
	private Date prhRcpDate;
	private String prhVend;
	private String prhLot;
	private String prhPsNbr;
	private Double prhPsQty;
	private Double prhBoQty;
	private String prhQadc02;
	private String prhXinvoice;
	private Date prhXinvDt;
	private Double prhQadd01;
	private Double prhXinvCst;
	private String prhQadc03;
	private String prhQadc04;
	private String prhQadc05;
	private String prhRev;
	private String prhType;
	private Boolean prhPrint;
	private Double prhLbrStd;
	private Double prhMtlStd;
	private Double prhBdnStd;
	private Double prhSubStd;
	private String prhBuyer;
	private Double prhQad03;
	private String prhQad02;
	private String prhShipto;
	private Boolean prhCstUp;
	private String prhUm;
	private Double prhUmConv;
	private String prhCurr;
	private Double prhExRate;
	private Double prhCurrAmt;
	private String prhPayUm;
	private Double prhPumConv;
	private String prhUser1;
	private String prhUser2;
	private Double prhOvhStd;
	private String prhSite;
	private String prhShip;
	private Double prhQtyOrd;
	private Date prhPerDate;
	private String prhRcpType;
	private String prhReason;
	private String prhRequest;
	private String prhApprove;
	private Integer prhQad04;
	private String prhTaxAt;
	private String prhChr01;
	private String prhChr02;
	private String prhChr03;
	private String prhChr04;
	private String prhChr05;
	private String prhChr06;
	private String prhChr07;
	private String prhChr08;
	private String prhChr09;
	private String prhChr10;
	private Date prhDte01;
	private Date prhDte02;
	private Date prhDte03;
	private Date prhDte04;
	private Date prhDte05;
	private Double prhDec01;
	private Double prhDec02;
	private Double prhDec03;
	private Double prhDec04;
	private Double prhDec05;
	private Boolean prhLog01;
	private Boolean prhLog02;
	private String prhRmaType;
	private Boolean prhFixRate;
	private String prhPoSite;
	private Double prhCumReq;
	private Double prhCumRcvd;
	private String prhFsmType;
	private String prhBank;
	private String prhCurrRlseId;
	private Boolean prhFixPr;
	private Double prhCrtInt;
	private String prhTaxEnv;
	private Boolean prhTaxIn;
	private String prhTaxUsage;
	private String prhTaxc;
	private String prhVendLot;
	private Date prhShipDate;
	private Integer prhQadi01;
	private Double prhExRate2;
	private String prhExRatetype;
	private Integer prhExruSeq;
	private String prhQadc06;
	private String prhQadc01;
	private Double oidPrhHist;

	// Constructors

	/** default constructor */
	public AbstractPrhHist() {
	}

	/** minimal constructor */
	public AbstractPrhHist(PrhHistId id, Double prhExRate2,
			String prhExRatetype, Integer prhExruSeq, String prhQadc01,
			Double oidPrhHist) {
		this.id = id;
		this.prhExRate2 = prhExRate2;
		this.prhExRatetype = prhExRatetype;
		this.prhExruSeq = prhExruSeq;
		this.prhQadc01 = prhQadc01;
		this.oidPrhHist = oidPrhHist;
	}

	/** full constructor */
	public AbstractPrhHist(PrhHistId id, String prhPart, Double prhRcvd,
			Double prhPurCost, Double prhPurStd, Date prhRcpDate,
			String prhVend, String prhLot, String prhPsNbr, Double prhPsQty,
			Double prhBoQty, String prhQadc02, String prhXinvoice,
			Date prhXinvDt, Double prhQadd01, Double prhXinvCst,
			String prhQadc03, String prhQadc04, String prhQadc05,
			String prhRev, String prhType, Boolean prhPrint, Double prhLbrStd,
			Double prhMtlStd, Double prhBdnStd, Double prhSubStd,
			String prhBuyer, Double prhQad03, String prhQad02,
			String prhShipto, Boolean prhCstUp, String prhUm, Double prhUmConv,
			String prhCurr, Double prhExRate, Double prhCurrAmt,
			String prhPayUm, Double prhPumConv, String prhUser1,
			String prhUser2, Double prhOvhStd, String prhSite, String prhShip,
			Double prhQtyOrd, Date prhPerDate, String prhRcpType,
			String prhReason, String prhRequest, String prhApprove,
			Integer prhQad04, String prhTaxAt, String prhChr01,
			String prhChr02, String prhChr03, String prhChr04, String prhChr05,
			String prhChr06, String prhChr07, String prhChr08, String prhChr09,
			String prhChr10, Date prhDte01, Date prhDte02, Date prhDte03,
			Date prhDte04, Date prhDte05, Double prhDec01, Double prhDec02,
			Double prhDec03, Double prhDec04, Double prhDec05,
			Boolean prhLog01, Boolean prhLog02, String prhRmaType,
			Boolean prhFixRate, String prhPoSite, Double prhCumReq,
			Double prhCumRcvd, String prhFsmType, String prhBank,
			String prhCurrRlseId, Boolean prhFixPr, Double prhCrtInt,
			String prhTaxEnv, Boolean prhTaxIn, String prhTaxUsage,
			String prhTaxc, String prhVendLot, Date prhShipDate,
			Integer prhQadi01, Double prhExRate2, String prhExRatetype,
			Integer prhExruSeq, String prhQadc06, String prhQadc01,
			Double oidPrhHist) {
		this.id = id;
		this.prhPart = prhPart;
		this.prhRcvd = prhRcvd;
		this.prhPurCost = prhPurCost;
		this.prhPurStd = prhPurStd;
		this.prhRcpDate = prhRcpDate;
		this.prhVend = prhVend;
		this.prhLot = prhLot;
		this.prhPsNbr = prhPsNbr;
		this.prhPsQty = prhPsQty;
		this.prhBoQty = prhBoQty;
		this.prhQadc02 = prhQadc02;
		this.prhXinvoice = prhXinvoice;
		this.prhXinvDt = prhXinvDt;
		this.prhQadd01 = prhQadd01;
		this.prhXinvCst = prhXinvCst;
		this.prhQadc03 = prhQadc03;
		this.prhQadc04 = prhQadc04;
		this.prhQadc05 = prhQadc05;
		this.prhRev = prhRev;
		this.prhType = prhType;
		this.prhPrint = prhPrint;
		this.prhLbrStd = prhLbrStd;
		this.prhMtlStd = prhMtlStd;
		this.prhBdnStd = prhBdnStd;
		this.prhSubStd = prhSubStd;
		this.prhBuyer = prhBuyer;
		this.prhQad03 = prhQad03;
		this.prhQad02 = prhQad02;
		this.prhShipto = prhShipto;
		this.prhCstUp = prhCstUp;
		this.prhUm = prhUm;
		this.prhUmConv = prhUmConv;
		this.prhCurr = prhCurr;
		this.prhExRate = prhExRate;
		this.prhCurrAmt = prhCurrAmt;
		this.prhPayUm = prhPayUm;
		this.prhPumConv = prhPumConv;
		this.prhUser1 = prhUser1;
		this.prhUser2 = prhUser2;
		this.prhOvhStd = prhOvhStd;
		this.prhSite = prhSite;
		this.prhShip = prhShip;
		this.prhQtyOrd = prhQtyOrd;
		this.prhPerDate = prhPerDate;
		this.prhRcpType = prhRcpType;
		this.prhReason = prhReason;
		this.prhRequest = prhRequest;
		this.prhApprove = prhApprove;
		this.prhQad04 = prhQad04;
		this.prhTaxAt = prhTaxAt;
		this.prhChr01 = prhChr01;
		this.prhChr02 = prhChr02;
		this.prhChr03 = prhChr03;
		this.prhChr04 = prhChr04;
		this.prhChr05 = prhChr05;
		this.prhChr06 = prhChr06;
		this.prhChr07 = prhChr07;
		this.prhChr08 = prhChr08;
		this.prhChr09 = prhChr09;
		this.prhChr10 = prhChr10;
		this.prhDte01 = prhDte01;
		this.prhDte02 = prhDte02;
		this.prhDte03 = prhDte03;
		this.prhDte04 = prhDte04;
		this.prhDte05 = prhDte05;
		this.prhDec01 = prhDec01;
		this.prhDec02 = prhDec02;
		this.prhDec03 = prhDec03;
		this.prhDec04 = prhDec04;
		this.prhDec05 = prhDec05;
		this.prhLog01 = prhLog01;
		this.prhLog02 = prhLog02;
		this.prhRmaType = prhRmaType;
		this.prhFixRate = prhFixRate;
		this.prhPoSite = prhPoSite;
		this.prhCumReq = prhCumReq;
		this.prhCumRcvd = prhCumRcvd;
		this.prhFsmType = prhFsmType;
		this.prhBank = prhBank;
		this.prhCurrRlseId = prhCurrRlseId;
		this.prhFixPr = prhFixPr;
		this.prhCrtInt = prhCrtInt;
		this.prhTaxEnv = prhTaxEnv;
		this.prhTaxIn = prhTaxIn;
		this.prhTaxUsage = prhTaxUsage;
		this.prhTaxc = prhTaxc;
		this.prhVendLot = prhVendLot;
		this.prhShipDate = prhShipDate;
		this.prhQadi01 = prhQadi01;
		this.prhExRate2 = prhExRate2;
		this.prhExRatetype = prhExRatetype;
		this.prhExruSeq = prhExruSeq;
		this.prhQadc06 = prhQadc06;
		this.prhQadc01 = prhQadc01;
		this.oidPrhHist = oidPrhHist;
	}

	// Property accessors

	public PrhHistId getId() {
		return this.id;
	}

	public void setId(PrhHistId id) {
		this.id = id;
	}

	public String getPrhPart() {
		return this.prhPart;
	}

	public void setPrhPart(String prhPart) {
		this.prhPart = prhPart;
	}

	public Double getPrhRcvd() {
		return this.prhRcvd;
	}

	public void setPrhRcvd(Double prhRcvd) {
		this.prhRcvd = prhRcvd;
	}

	public Double getPrhPurCost() {
		return this.prhPurCost;
	}

	public void setPrhPurCost(Double prhPurCost) {
		this.prhPurCost = prhPurCost;
	}

	public Double getPrhPurStd() {
		return this.prhPurStd;
	}

	public void setPrhPurStd(Double prhPurStd) {
		this.prhPurStd = prhPurStd;
	}

	public Date getPrhRcpDate() {
		return this.prhRcpDate;
	}

	public void setPrhRcpDate(Date prhRcpDate) {
		this.prhRcpDate = prhRcpDate;
	}

	public String getPrhVend() {
		return this.prhVend;
	}

	public void setPrhVend(String prhVend) {
		this.prhVend = prhVend;
	}

	public String getPrhLot() {
		return this.prhLot;
	}

	public void setPrhLot(String prhLot) {
		this.prhLot = prhLot;
	}

	public String getPrhPsNbr() {
		return this.prhPsNbr;
	}

	public void setPrhPsNbr(String prhPsNbr) {
		this.prhPsNbr = prhPsNbr;
	}

	public Double getPrhPsQty() {
		return this.prhPsQty;
	}

	public void setPrhPsQty(Double prhPsQty) {
		this.prhPsQty = prhPsQty;
	}

	public Double getPrhBoQty() {
		return this.prhBoQty;
	}

	public void setPrhBoQty(Double prhBoQty) {
		this.prhBoQty = prhBoQty;
	}

	public String getPrhQadc02() {
		return this.prhQadc02;
	}

	public void setPrhQadc02(String prhQadc02) {
		this.prhQadc02 = prhQadc02;
	}

	public String getPrhXinvoice() {
		return this.prhXinvoice;
	}

	public void setPrhXinvoice(String prhXinvoice) {
		this.prhXinvoice = prhXinvoice;
	}

	public Date getPrhXinvDt() {
		return this.prhXinvDt;
	}

	public void setPrhXinvDt(Date prhXinvDt) {
		this.prhXinvDt = prhXinvDt;
	}

	public Double getPrhQadd01() {
		return this.prhQadd01;
	}

	public void setPrhQadd01(Double prhQadd01) {
		this.prhQadd01 = prhQadd01;
	}

	public Double getPrhXinvCst() {
		return this.prhXinvCst;
	}

	public void setPrhXinvCst(Double prhXinvCst) {
		this.prhXinvCst = prhXinvCst;
	}

	public String getPrhQadc03() {
		return this.prhQadc03;
	}

	public void setPrhQadc03(String prhQadc03) {
		this.prhQadc03 = prhQadc03;
	}

	public String getPrhQadc04() {
		return this.prhQadc04;
	}

	public void setPrhQadc04(String prhQadc04) {
		this.prhQadc04 = prhQadc04;
	}

	public String getPrhQadc05() {
		return this.prhQadc05;
	}

	public void setPrhQadc05(String prhQadc05) {
		this.prhQadc05 = prhQadc05;
	}

	public String getPrhRev() {
		return this.prhRev;
	}

	public void setPrhRev(String prhRev) {
		this.prhRev = prhRev;
	}

	public String getPrhType() {
		return this.prhType;
	}

	public void setPrhType(String prhType) {
		this.prhType = prhType;
	}

	public Boolean getPrhPrint() {
		return this.prhPrint;
	}

	public void setPrhPrint(Boolean prhPrint) {
		this.prhPrint = prhPrint;
	}

	public Double getPrhLbrStd() {
		return this.prhLbrStd;
	}

	public void setPrhLbrStd(Double prhLbrStd) {
		this.prhLbrStd = prhLbrStd;
	}

	public Double getPrhMtlStd() {
		return this.prhMtlStd;
	}

	public void setPrhMtlStd(Double prhMtlStd) {
		this.prhMtlStd = prhMtlStd;
	}

	public Double getPrhBdnStd() {
		return this.prhBdnStd;
	}

	public void setPrhBdnStd(Double prhBdnStd) {
		this.prhBdnStd = prhBdnStd;
	}

	public Double getPrhSubStd() {
		return this.prhSubStd;
	}

	public void setPrhSubStd(Double prhSubStd) {
		this.prhSubStd = prhSubStd;
	}

	public String getPrhBuyer() {
		return this.prhBuyer;
	}

	public void setPrhBuyer(String prhBuyer) {
		this.prhBuyer = prhBuyer;
	}

	public Double getPrhQad03() {
		return this.prhQad03;
	}

	public void setPrhQad03(Double prhQad03) {
		this.prhQad03 = prhQad03;
	}

	public String getPrhQad02() {
		return this.prhQad02;
	}

	public void setPrhQad02(String prhQad02) {
		this.prhQad02 = prhQad02;
	}

	public String getPrhShipto() {
		return this.prhShipto;
	}

	public void setPrhShipto(String prhShipto) {
		this.prhShipto = prhShipto;
	}

	public Boolean getPrhCstUp() {
		return this.prhCstUp;
	}

	public void setPrhCstUp(Boolean prhCstUp) {
		this.prhCstUp = prhCstUp;
	}

	public String getPrhUm() {
		return this.prhUm;
	}

	public void setPrhUm(String prhUm) {
		this.prhUm = prhUm;
	}

	public Double getPrhUmConv() {
		return this.prhUmConv;
	}

	public void setPrhUmConv(Double prhUmConv) {
		this.prhUmConv = prhUmConv;
	}

	public String getPrhCurr() {
		return this.prhCurr;
	}

	public void setPrhCurr(String prhCurr) {
		this.prhCurr = prhCurr;
	}

	public Double getPrhExRate() {
		return this.prhExRate;
	}

	public void setPrhExRate(Double prhExRate) {
		this.prhExRate = prhExRate;
	}

	public Double getPrhCurrAmt() {
		return this.prhCurrAmt;
	}

	public void setPrhCurrAmt(Double prhCurrAmt) {
		this.prhCurrAmt = prhCurrAmt;
	}

	public String getPrhPayUm() {
		return this.prhPayUm;
	}

	public void setPrhPayUm(String prhPayUm) {
		this.prhPayUm = prhPayUm;
	}

	public Double getPrhPumConv() {
		return this.prhPumConv;
	}

	public void setPrhPumConv(Double prhPumConv) {
		this.prhPumConv = prhPumConv;
	}

	public String getPrhUser1() {
		return this.prhUser1;
	}

	public void setPrhUser1(String prhUser1) {
		this.prhUser1 = prhUser1;
	}

	public String getPrhUser2() {
		return this.prhUser2;
	}

	public void setPrhUser2(String prhUser2) {
		this.prhUser2 = prhUser2;
	}

	public Double getPrhOvhStd() {
		return this.prhOvhStd;
	}

	public void setPrhOvhStd(Double prhOvhStd) {
		this.prhOvhStd = prhOvhStd;
	}

	public String getPrhSite() {
		return this.prhSite;
	}

	public void setPrhSite(String prhSite) {
		this.prhSite = prhSite;
	}

	public String getPrhShip() {
		return this.prhShip;
	}

	public void setPrhShip(String prhShip) {
		this.prhShip = prhShip;
	}

	public Double getPrhQtyOrd() {
		return this.prhQtyOrd;
	}

	public void setPrhQtyOrd(Double prhQtyOrd) {
		this.prhQtyOrd = prhQtyOrd;
	}

	public Date getPrhPerDate() {
		return this.prhPerDate;
	}

	public void setPrhPerDate(Date prhPerDate) {
		this.prhPerDate = prhPerDate;
	}

	public String getPrhRcpType() {
		return this.prhRcpType;
	}

	public void setPrhRcpType(String prhRcpType) {
		this.prhRcpType = prhRcpType;
	}

	public String getPrhReason() {
		return this.prhReason;
	}

	public void setPrhReason(String prhReason) {
		this.prhReason = prhReason;
	}

	public String getPrhRequest() {
		return this.prhRequest;
	}

	public void setPrhRequest(String prhRequest) {
		this.prhRequest = prhRequest;
	}

	public String getPrhApprove() {
		return this.prhApprove;
	}

	public void setPrhApprove(String prhApprove) {
		this.prhApprove = prhApprove;
	}

	public Integer getPrhQad04() {
		return this.prhQad04;
	}

	public void setPrhQad04(Integer prhQad04) {
		this.prhQad04 = prhQad04;
	}

	public String getPrhTaxAt() {
		return this.prhTaxAt;
	}

	public void setPrhTaxAt(String prhTaxAt) {
		this.prhTaxAt = prhTaxAt;
	}

	public String getPrhChr01() {
		return this.prhChr01;
	}

	public void setPrhChr01(String prhChr01) {
		this.prhChr01 = prhChr01;
	}

	public String getPrhChr02() {
		return this.prhChr02;
	}

	public void setPrhChr02(String prhChr02) {
		this.prhChr02 = prhChr02;
	}

	public String getPrhChr03() {
		return this.prhChr03;
	}

	public void setPrhChr03(String prhChr03) {
		this.prhChr03 = prhChr03;
	}

	public String getPrhChr04() {
		return this.prhChr04;
	}

	public void setPrhChr04(String prhChr04) {
		this.prhChr04 = prhChr04;
	}

	public String getPrhChr05() {
		return this.prhChr05;
	}

	public void setPrhChr05(String prhChr05) {
		this.prhChr05 = prhChr05;
	}

	public String getPrhChr06() {
		return this.prhChr06;
	}

	public void setPrhChr06(String prhChr06) {
		this.prhChr06 = prhChr06;
	}

	public String getPrhChr07() {
		return this.prhChr07;
	}

	public void setPrhChr07(String prhChr07) {
		this.prhChr07 = prhChr07;
	}

	public String getPrhChr08() {
		return this.prhChr08;
	}

	public void setPrhChr08(String prhChr08) {
		this.prhChr08 = prhChr08;
	}

	public String getPrhChr09() {
		return this.prhChr09;
	}

	public void setPrhChr09(String prhChr09) {
		this.prhChr09 = prhChr09;
	}

	public String getPrhChr10() {
		return this.prhChr10;
	}

	public void setPrhChr10(String prhChr10) {
		this.prhChr10 = prhChr10;
	}

	public Date getPrhDte01() {
		return this.prhDte01;
	}

	public void setPrhDte01(Date prhDte01) {
		this.prhDte01 = prhDte01;
	}

	public Date getPrhDte02() {
		return this.prhDte02;
	}

	public void setPrhDte02(Date prhDte02) {
		this.prhDte02 = prhDte02;
	}

	public Date getPrhDte03() {
		return this.prhDte03;
	}

	public void setPrhDte03(Date prhDte03) {
		this.prhDte03 = prhDte03;
	}

	public Date getPrhDte04() {
		return this.prhDte04;
	}

	public void setPrhDte04(Date prhDte04) {
		this.prhDte04 = prhDte04;
	}

	public Date getPrhDte05() {
		return this.prhDte05;
	}

	public void setPrhDte05(Date prhDte05) {
		this.prhDte05 = prhDte05;
	}

	public Double getPrhDec01() {
		return this.prhDec01;
	}

	public void setPrhDec01(Double prhDec01) {
		this.prhDec01 = prhDec01;
	}

	public Double getPrhDec02() {
		return this.prhDec02;
	}

	public void setPrhDec02(Double prhDec02) {
		this.prhDec02 = prhDec02;
	}

	public Double getPrhDec03() {
		return this.prhDec03;
	}

	public void setPrhDec03(Double prhDec03) {
		this.prhDec03 = prhDec03;
	}

	public Double getPrhDec04() {
		return this.prhDec04;
	}

	public void setPrhDec04(Double prhDec04) {
		this.prhDec04 = prhDec04;
	}

	public Double getPrhDec05() {
		return this.prhDec05;
	}

	public void setPrhDec05(Double prhDec05) {
		this.prhDec05 = prhDec05;
	}

	public Boolean getPrhLog01() {
		return this.prhLog01;
	}

	public void setPrhLog01(Boolean prhLog01) {
		this.prhLog01 = prhLog01;
	}

	public Boolean getPrhLog02() {
		return this.prhLog02;
	}

	public void setPrhLog02(Boolean prhLog02) {
		this.prhLog02 = prhLog02;
	}

	public String getPrhRmaType() {
		return this.prhRmaType;
	}

	public void setPrhRmaType(String prhRmaType) {
		this.prhRmaType = prhRmaType;
	}

	public Boolean getPrhFixRate() {
		return this.prhFixRate;
	}

	public void setPrhFixRate(Boolean prhFixRate) {
		this.prhFixRate = prhFixRate;
	}

	public String getPrhPoSite() {
		return this.prhPoSite;
	}

	public void setPrhPoSite(String prhPoSite) {
		this.prhPoSite = prhPoSite;
	}

	public Double getPrhCumReq() {
		return this.prhCumReq;
	}

	public void setPrhCumReq(Double prhCumReq) {
		this.prhCumReq = prhCumReq;
	}

	public Double getPrhCumRcvd() {
		return this.prhCumRcvd;
	}

	public void setPrhCumRcvd(Double prhCumRcvd) {
		this.prhCumRcvd = prhCumRcvd;
	}

	public String getPrhFsmType() {
		return this.prhFsmType;
	}

	public void setPrhFsmType(String prhFsmType) {
		this.prhFsmType = prhFsmType;
	}

	public String getPrhBank() {
		return this.prhBank;
	}

	public void setPrhBank(String prhBank) {
		this.prhBank = prhBank;
	}

	public String getPrhCurrRlseId() {
		return this.prhCurrRlseId;
	}

	public void setPrhCurrRlseId(String prhCurrRlseId) {
		this.prhCurrRlseId = prhCurrRlseId;
	}

	public Boolean getPrhFixPr() {
		return this.prhFixPr;
	}

	public void setPrhFixPr(Boolean prhFixPr) {
		this.prhFixPr = prhFixPr;
	}

	public Double getPrhCrtInt() {
		return this.prhCrtInt;
	}

	public void setPrhCrtInt(Double prhCrtInt) {
		this.prhCrtInt = prhCrtInt;
	}

	public String getPrhTaxEnv() {
		return this.prhTaxEnv;
	}

	public void setPrhTaxEnv(String prhTaxEnv) {
		this.prhTaxEnv = prhTaxEnv;
	}

	public Boolean getPrhTaxIn() {
		return this.prhTaxIn;
	}

	public void setPrhTaxIn(Boolean prhTaxIn) {
		this.prhTaxIn = prhTaxIn;
	}

	public String getPrhTaxUsage() {
		return this.prhTaxUsage;
	}

	public void setPrhTaxUsage(String prhTaxUsage) {
		this.prhTaxUsage = prhTaxUsage;
	}

	public String getPrhTaxc() {
		return this.prhTaxc;
	}

	public void setPrhTaxc(String prhTaxc) {
		this.prhTaxc = prhTaxc;
	}

	public String getPrhVendLot() {
		return this.prhVendLot;
	}

	public void setPrhVendLot(String prhVendLot) {
		this.prhVendLot = prhVendLot;
	}

	public Date getPrhShipDate() {
		return this.prhShipDate;
	}

	public void setPrhShipDate(Date prhShipDate) {
		this.prhShipDate = prhShipDate;
	}

	public Integer getPrhQadi01() {
		return this.prhQadi01;
	}

	public void setPrhQadi01(Integer prhQadi01) {
		this.prhQadi01 = prhQadi01;
	}

	public Double getPrhExRate2() {
		return this.prhExRate2;
	}

	public void setPrhExRate2(Double prhExRate2) {
		this.prhExRate2 = prhExRate2;
	}

	public String getPrhExRatetype() {
		return this.prhExRatetype;
	}

	public void setPrhExRatetype(String prhExRatetype) {
		this.prhExRatetype = prhExRatetype;
	}

	public Integer getPrhExruSeq() {
		return this.prhExruSeq;
	}

	public void setPrhExruSeq(Integer prhExruSeq) {
		this.prhExruSeq = prhExruSeq;
	}

	public String getPrhQadc06() {
		return this.prhQadc06;
	}

	public void setPrhQadc06(String prhQadc06) {
		this.prhQadc06 = prhQadc06;
	}

	public String getPrhQadc01() {
		return this.prhQadc01;
	}

	public void setPrhQadc01(String prhQadc01) {
		this.prhQadc01 = prhQadc01;
	}

	public Double getOidPrhHist() {
		return this.oidPrhHist;
	}

	public void setOidPrhHist(Double oidPrhHist) {
		this.oidPrhHist = oidPrhHist;
	}

}