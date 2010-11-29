package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSfbDet entity provides the base persistence definition of the SfbDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSfbDet implements java.io.Serializable {

	// Fields

	private SfbDetId id;
	private Integer sfbCmtindx;
	private Double sfbCoveredAmt;
	private String sfbDesc;
	private Integer sfbFisColumn;
	private String sfbFscCode;
	private Integer sfbOp;
	private String sfbPart;
	private Double sfbPrice;
	private Double sfbQtyBilled;
	private Double sfbQtyInv;
	private Double sfbQtyReq;
	private String sfbSerial;
	private Double sfbTotalStd;
	private String sfbChr01;
	private String sfbChr02;
	private String sfbChr03;
	private String sfbChr04;
	private Double sfbDec01;
	private Double sfbDec02;
	private Double sfbDec03;
	private Date sfbDte01;
	private Date sfbDte02;
	private Date sfbDte03;
	private Boolean sfbLog01;
	private Boolean sfbLog02;
	private Boolean sfbLog03;
	private String sfbQadc01;
	private String sfbQadc02;
	private String sfbQadc03;
	private String sfbQadc04;
	private Date sfbQadd01;
	private Date sfbQadd02;
	private Date sfbQadd03;
	private Double sfbQadde01;
	private Double sfbQadde02;
	private Double sfbQadde03;
	private Boolean sfbQadl01;
	private Boolean sfbQadl02;
	private Boolean sfbExchange;
	private String sfbFcgCode;
	private Double sfbQtyRet;
	private Double sfbExgPrice;
	private String sfbUm;
	private Boolean sfbDetail;
	private Double sfbFixedCost;
	private Double sfbFixedPrice;
	private Double sfbInvoiceCost;
	private Date sfbCaOpnDate;
	private String sfbUser1;
	private String sfbUser2;
	private Date sfbModDate;
	private String sfbModUserid;
	private String sfbReport;
	private String sfbRetSerial;
	private String sfbTaxc;
	private String sfbTaxUsage;
	private Boolean sfbTaxable;
	private Boolean sfbTaxIn;
	private String sfbTaxEnv;
	private Boolean sfbPst;
	private Boolean sfbQadl03;
	private Boolean sfbQadl04;
	private Boolean sfbPriceOnInv;
	private Boolean sfbQtyOnInv;
	private Double oidSfbDet;

	// Constructors

	/** default constructor */
	public AbstractSfbDet() {
	}

	/** minimal constructor */
	public AbstractSfbDet(SfbDetId id, Boolean sfbPriceOnInv,
			Boolean sfbQtyOnInv, Double oidSfbDet) {
		this.id = id;
		this.sfbPriceOnInv = sfbPriceOnInv;
		this.sfbQtyOnInv = sfbQtyOnInv;
		this.oidSfbDet = oidSfbDet;
	}

	/** full constructor */
	public AbstractSfbDet(SfbDetId id, Integer sfbCmtindx,
			Double sfbCoveredAmt, String sfbDesc, Integer sfbFisColumn,
			String sfbFscCode, Integer sfbOp, String sfbPart, Double sfbPrice,
			Double sfbQtyBilled, Double sfbQtyInv, Double sfbQtyReq,
			String sfbSerial, Double sfbTotalStd, String sfbChr01,
			String sfbChr02, String sfbChr03, String sfbChr04, Double sfbDec01,
			Double sfbDec02, Double sfbDec03, Date sfbDte01, Date sfbDte02,
			Date sfbDte03, Boolean sfbLog01, Boolean sfbLog02,
			Boolean sfbLog03, String sfbQadc01, String sfbQadc02,
			String sfbQadc03, String sfbQadc04, Date sfbQadd01, Date sfbQadd02,
			Date sfbQadd03, Double sfbQadde01, Double sfbQadde02,
			Double sfbQadde03, Boolean sfbQadl01, Boolean sfbQadl02,
			Boolean sfbExchange, String sfbFcgCode, Double sfbQtyRet,
			Double sfbExgPrice, String sfbUm, Boolean sfbDetail,
			Double sfbFixedCost, Double sfbFixedPrice, Double sfbInvoiceCost,
			Date sfbCaOpnDate, String sfbUser1, String sfbUser2,
			Date sfbModDate, String sfbModUserid, String sfbReport,
			String sfbRetSerial, String sfbTaxc, String sfbTaxUsage,
			Boolean sfbTaxable, Boolean sfbTaxIn, String sfbTaxEnv,
			Boolean sfbPst, Boolean sfbQadl03, Boolean sfbQadl04,
			Boolean sfbPriceOnInv, Boolean sfbQtyOnInv, Double oidSfbDet) {
		this.id = id;
		this.sfbCmtindx = sfbCmtindx;
		this.sfbCoveredAmt = sfbCoveredAmt;
		this.sfbDesc = sfbDesc;
		this.sfbFisColumn = sfbFisColumn;
		this.sfbFscCode = sfbFscCode;
		this.sfbOp = sfbOp;
		this.sfbPart = sfbPart;
		this.sfbPrice = sfbPrice;
		this.sfbQtyBilled = sfbQtyBilled;
		this.sfbQtyInv = sfbQtyInv;
		this.sfbQtyReq = sfbQtyReq;
		this.sfbSerial = sfbSerial;
		this.sfbTotalStd = sfbTotalStd;
		this.sfbChr01 = sfbChr01;
		this.sfbChr02 = sfbChr02;
		this.sfbChr03 = sfbChr03;
		this.sfbChr04 = sfbChr04;
		this.sfbDec01 = sfbDec01;
		this.sfbDec02 = sfbDec02;
		this.sfbDec03 = sfbDec03;
		this.sfbDte01 = sfbDte01;
		this.sfbDte02 = sfbDte02;
		this.sfbDte03 = sfbDte03;
		this.sfbLog01 = sfbLog01;
		this.sfbLog02 = sfbLog02;
		this.sfbLog03 = sfbLog03;
		this.sfbQadc01 = sfbQadc01;
		this.sfbQadc02 = sfbQadc02;
		this.sfbQadc03 = sfbQadc03;
		this.sfbQadc04 = sfbQadc04;
		this.sfbQadd01 = sfbQadd01;
		this.sfbQadd02 = sfbQadd02;
		this.sfbQadd03 = sfbQadd03;
		this.sfbQadde01 = sfbQadde01;
		this.sfbQadde02 = sfbQadde02;
		this.sfbQadde03 = sfbQadde03;
		this.sfbQadl01 = sfbQadl01;
		this.sfbQadl02 = sfbQadl02;
		this.sfbExchange = sfbExchange;
		this.sfbFcgCode = sfbFcgCode;
		this.sfbQtyRet = sfbQtyRet;
		this.sfbExgPrice = sfbExgPrice;
		this.sfbUm = sfbUm;
		this.sfbDetail = sfbDetail;
		this.sfbFixedCost = sfbFixedCost;
		this.sfbFixedPrice = sfbFixedPrice;
		this.sfbInvoiceCost = sfbInvoiceCost;
		this.sfbCaOpnDate = sfbCaOpnDate;
		this.sfbUser1 = sfbUser1;
		this.sfbUser2 = sfbUser2;
		this.sfbModDate = sfbModDate;
		this.sfbModUserid = sfbModUserid;
		this.sfbReport = sfbReport;
		this.sfbRetSerial = sfbRetSerial;
		this.sfbTaxc = sfbTaxc;
		this.sfbTaxUsage = sfbTaxUsage;
		this.sfbTaxable = sfbTaxable;
		this.sfbTaxIn = sfbTaxIn;
		this.sfbTaxEnv = sfbTaxEnv;
		this.sfbPst = sfbPst;
		this.sfbQadl03 = sfbQadl03;
		this.sfbQadl04 = sfbQadl04;
		this.sfbPriceOnInv = sfbPriceOnInv;
		this.sfbQtyOnInv = sfbQtyOnInv;
		this.oidSfbDet = oidSfbDet;
	}

	// Property accessors

	public SfbDetId getId() {
		return this.id;
	}

	public void setId(SfbDetId id) {
		this.id = id;
	}

	public Integer getSfbCmtindx() {
		return this.sfbCmtindx;
	}

	public void setSfbCmtindx(Integer sfbCmtindx) {
		this.sfbCmtindx = sfbCmtindx;
	}

	public Double getSfbCoveredAmt() {
		return this.sfbCoveredAmt;
	}

	public void setSfbCoveredAmt(Double sfbCoveredAmt) {
		this.sfbCoveredAmt = sfbCoveredAmt;
	}

	public String getSfbDesc() {
		return this.sfbDesc;
	}

	public void setSfbDesc(String sfbDesc) {
		this.sfbDesc = sfbDesc;
	}

	public Integer getSfbFisColumn() {
		return this.sfbFisColumn;
	}

	public void setSfbFisColumn(Integer sfbFisColumn) {
		this.sfbFisColumn = sfbFisColumn;
	}

	public String getSfbFscCode() {
		return this.sfbFscCode;
	}

	public void setSfbFscCode(String sfbFscCode) {
		this.sfbFscCode = sfbFscCode;
	}

	public Integer getSfbOp() {
		return this.sfbOp;
	}

	public void setSfbOp(Integer sfbOp) {
		this.sfbOp = sfbOp;
	}

	public String getSfbPart() {
		return this.sfbPart;
	}

	public void setSfbPart(String sfbPart) {
		this.sfbPart = sfbPart;
	}

	public Double getSfbPrice() {
		return this.sfbPrice;
	}

	public void setSfbPrice(Double sfbPrice) {
		this.sfbPrice = sfbPrice;
	}

	public Double getSfbQtyBilled() {
		return this.sfbQtyBilled;
	}

	public void setSfbQtyBilled(Double sfbQtyBilled) {
		this.sfbQtyBilled = sfbQtyBilled;
	}

	public Double getSfbQtyInv() {
		return this.sfbQtyInv;
	}

	public void setSfbQtyInv(Double sfbQtyInv) {
		this.sfbQtyInv = sfbQtyInv;
	}

	public Double getSfbQtyReq() {
		return this.sfbQtyReq;
	}

	public void setSfbQtyReq(Double sfbQtyReq) {
		this.sfbQtyReq = sfbQtyReq;
	}

	public String getSfbSerial() {
		return this.sfbSerial;
	}

	public void setSfbSerial(String sfbSerial) {
		this.sfbSerial = sfbSerial;
	}

	public Double getSfbTotalStd() {
		return this.sfbTotalStd;
	}

	public void setSfbTotalStd(Double sfbTotalStd) {
		this.sfbTotalStd = sfbTotalStd;
	}

	public String getSfbChr01() {
		return this.sfbChr01;
	}

	public void setSfbChr01(String sfbChr01) {
		this.sfbChr01 = sfbChr01;
	}

	public String getSfbChr02() {
		return this.sfbChr02;
	}

	public void setSfbChr02(String sfbChr02) {
		this.sfbChr02 = sfbChr02;
	}

	public String getSfbChr03() {
		return this.sfbChr03;
	}

	public void setSfbChr03(String sfbChr03) {
		this.sfbChr03 = sfbChr03;
	}

	public String getSfbChr04() {
		return this.sfbChr04;
	}

	public void setSfbChr04(String sfbChr04) {
		this.sfbChr04 = sfbChr04;
	}

	public Double getSfbDec01() {
		return this.sfbDec01;
	}

	public void setSfbDec01(Double sfbDec01) {
		this.sfbDec01 = sfbDec01;
	}

	public Double getSfbDec02() {
		return this.sfbDec02;
	}

	public void setSfbDec02(Double sfbDec02) {
		this.sfbDec02 = sfbDec02;
	}

	public Double getSfbDec03() {
		return this.sfbDec03;
	}

	public void setSfbDec03(Double sfbDec03) {
		this.sfbDec03 = sfbDec03;
	}

	public Date getSfbDte01() {
		return this.sfbDte01;
	}

	public void setSfbDte01(Date sfbDte01) {
		this.sfbDte01 = sfbDte01;
	}

	public Date getSfbDte02() {
		return this.sfbDte02;
	}

	public void setSfbDte02(Date sfbDte02) {
		this.sfbDte02 = sfbDte02;
	}

	public Date getSfbDte03() {
		return this.sfbDte03;
	}

	public void setSfbDte03(Date sfbDte03) {
		this.sfbDte03 = sfbDte03;
	}

	public Boolean getSfbLog01() {
		return this.sfbLog01;
	}

	public void setSfbLog01(Boolean sfbLog01) {
		this.sfbLog01 = sfbLog01;
	}

	public Boolean getSfbLog02() {
		return this.sfbLog02;
	}

	public void setSfbLog02(Boolean sfbLog02) {
		this.sfbLog02 = sfbLog02;
	}

	public Boolean getSfbLog03() {
		return this.sfbLog03;
	}

	public void setSfbLog03(Boolean sfbLog03) {
		this.sfbLog03 = sfbLog03;
	}

	public String getSfbQadc01() {
		return this.sfbQadc01;
	}

	public void setSfbQadc01(String sfbQadc01) {
		this.sfbQadc01 = sfbQadc01;
	}

	public String getSfbQadc02() {
		return this.sfbQadc02;
	}

	public void setSfbQadc02(String sfbQadc02) {
		this.sfbQadc02 = sfbQadc02;
	}

	public String getSfbQadc03() {
		return this.sfbQadc03;
	}

	public void setSfbQadc03(String sfbQadc03) {
		this.sfbQadc03 = sfbQadc03;
	}

	public String getSfbQadc04() {
		return this.sfbQadc04;
	}

	public void setSfbQadc04(String sfbQadc04) {
		this.sfbQadc04 = sfbQadc04;
	}

	public Date getSfbQadd01() {
		return this.sfbQadd01;
	}

	public void setSfbQadd01(Date sfbQadd01) {
		this.sfbQadd01 = sfbQadd01;
	}

	public Date getSfbQadd02() {
		return this.sfbQadd02;
	}

	public void setSfbQadd02(Date sfbQadd02) {
		this.sfbQadd02 = sfbQadd02;
	}

	public Date getSfbQadd03() {
		return this.sfbQadd03;
	}

	public void setSfbQadd03(Date sfbQadd03) {
		this.sfbQadd03 = sfbQadd03;
	}

	public Double getSfbQadde01() {
		return this.sfbQadde01;
	}

	public void setSfbQadde01(Double sfbQadde01) {
		this.sfbQadde01 = sfbQadde01;
	}

	public Double getSfbQadde02() {
		return this.sfbQadde02;
	}

	public void setSfbQadde02(Double sfbQadde02) {
		this.sfbQadde02 = sfbQadde02;
	}

	public Double getSfbQadde03() {
		return this.sfbQadde03;
	}

	public void setSfbQadde03(Double sfbQadde03) {
		this.sfbQadde03 = sfbQadde03;
	}

	public Boolean getSfbQadl01() {
		return this.sfbQadl01;
	}

	public void setSfbQadl01(Boolean sfbQadl01) {
		this.sfbQadl01 = sfbQadl01;
	}

	public Boolean getSfbQadl02() {
		return this.sfbQadl02;
	}

	public void setSfbQadl02(Boolean sfbQadl02) {
		this.sfbQadl02 = sfbQadl02;
	}

	public Boolean getSfbExchange() {
		return this.sfbExchange;
	}

	public void setSfbExchange(Boolean sfbExchange) {
		this.sfbExchange = sfbExchange;
	}

	public String getSfbFcgCode() {
		return this.sfbFcgCode;
	}

	public void setSfbFcgCode(String sfbFcgCode) {
		this.sfbFcgCode = sfbFcgCode;
	}

	public Double getSfbQtyRet() {
		return this.sfbQtyRet;
	}

	public void setSfbQtyRet(Double sfbQtyRet) {
		this.sfbQtyRet = sfbQtyRet;
	}

	public Double getSfbExgPrice() {
		return this.sfbExgPrice;
	}

	public void setSfbExgPrice(Double sfbExgPrice) {
		this.sfbExgPrice = sfbExgPrice;
	}

	public String getSfbUm() {
		return this.sfbUm;
	}

	public void setSfbUm(String sfbUm) {
		this.sfbUm = sfbUm;
	}

	public Boolean getSfbDetail() {
		return this.sfbDetail;
	}

	public void setSfbDetail(Boolean sfbDetail) {
		this.sfbDetail = sfbDetail;
	}

	public Double getSfbFixedCost() {
		return this.sfbFixedCost;
	}

	public void setSfbFixedCost(Double sfbFixedCost) {
		this.sfbFixedCost = sfbFixedCost;
	}

	public Double getSfbFixedPrice() {
		return this.sfbFixedPrice;
	}

	public void setSfbFixedPrice(Double sfbFixedPrice) {
		this.sfbFixedPrice = sfbFixedPrice;
	}

	public Double getSfbInvoiceCost() {
		return this.sfbInvoiceCost;
	}

	public void setSfbInvoiceCost(Double sfbInvoiceCost) {
		this.sfbInvoiceCost = sfbInvoiceCost;
	}

	public Date getSfbCaOpnDate() {
		return this.sfbCaOpnDate;
	}

	public void setSfbCaOpnDate(Date sfbCaOpnDate) {
		this.sfbCaOpnDate = sfbCaOpnDate;
	}

	public String getSfbUser1() {
		return this.sfbUser1;
	}

	public void setSfbUser1(String sfbUser1) {
		this.sfbUser1 = sfbUser1;
	}

	public String getSfbUser2() {
		return this.sfbUser2;
	}

	public void setSfbUser2(String sfbUser2) {
		this.sfbUser2 = sfbUser2;
	}

	public Date getSfbModDate() {
		return this.sfbModDate;
	}

	public void setSfbModDate(Date sfbModDate) {
		this.sfbModDate = sfbModDate;
	}

	public String getSfbModUserid() {
		return this.sfbModUserid;
	}

	public void setSfbModUserid(String sfbModUserid) {
		this.sfbModUserid = sfbModUserid;
	}

	public String getSfbReport() {
		return this.sfbReport;
	}

	public void setSfbReport(String sfbReport) {
		this.sfbReport = sfbReport;
	}

	public String getSfbRetSerial() {
		return this.sfbRetSerial;
	}

	public void setSfbRetSerial(String sfbRetSerial) {
		this.sfbRetSerial = sfbRetSerial;
	}

	public String getSfbTaxc() {
		return this.sfbTaxc;
	}

	public void setSfbTaxc(String sfbTaxc) {
		this.sfbTaxc = sfbTaxc;
	}

	public String getSfbTaxUsage() {
		return this.sfbTaxUsage;
	}

	public void setSfbTaxUsage(String sfbTaxUsage) {
		this.sfbTaxUsage = sfbTaxUsage;
	}

	public Boolean getSfbTaxable() {
		return this.sfbTaxable;
	}

	public void setSfbTaxable(Boolean sfbTaxable) {
		this.sfbTaxable = sfbTaxable;
	}

	public Boolean getSfbTaxIn() {
		return this.sfbTaxIn;
	}

	public void setSfbTaxIn(Boolean sfbTaxIn) {
		this.sfbTaxIn = sfbTaxIn;
	}

	public String getSfbTaxEnv() {
		return this.sfbTaxEnv;
	}

	public void setSfbTaxEnv(String sfbTaxEnv) {
		this.sfbTaxEnv = sfbTaxEnv;
	}

	public Boolean getSfbPst() {
		return this.sfbPst;
	}

	public void setSfbPst(Boolean sfbPst) {
		this.sfbPst = sfbPst;
	}

	public Boolean getSfbQadl03() {
		return this.sfbQadl03;
	}

	public void setSfbQadl03(Boolean sfbQadl03) {
		this.sfbQadl03 = sfbQadl03;
	}

	public Boolean getSfbQadl04() {
		return this.sfbQadl04;
	}

	public void setSfbQadl04(Boolean sfbQadl04) {
		this.sfbQadl04 = sfbQadl04;
	}

	public Boolean getSfbPriceOnInv() {
		return this.sfbPriceOnInv;
	}

	public void setSfbPriceOnInv(Boolean sfbPriceOnInv) {
		this.sfbPriceOnInv = sfbPriceOnInv;
	}

	public Boolean getSfbQtyOnInv() {
		return this.sfbQtyOnInv;
	}

	public void setSfbQtyOnInv(Boolean sfbQtyOnInv) {
		this.sfbQtyOnInv = sfbQtyOnInv;
	}

	public Double getOidSfbDet() {
		return this.oidSfbDet;
	}

	public void setOidSfbDet(Double oidSfbDet) {
		this.oidSfbDet = oidSfbDet;
	}

}