package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSfhHist entity provides the base persistence definition of the
 * SfhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSfhHist implements java.io.Serializable {

	// Fields

	private SfhHistId id;
	private Integer sfhCmtindx;
	private Double sfhCoveredAmt;
	private String sfhDesc;
	private Integer sfhFisColumn;
	private String sfhFisSort;
	private String sfhFscCode;
	private Integer sfhLine;
	private String sfhNbr;
	private Integer sfhOp;
	private String sfhPart;
	private Double sfhPrice;
	private Integer sfhPtType;
	private Double sfhQtyBilled;
	private Double sfhQtyInv;
	private Double sfhQtyReq;
	private String sfhSerial;
	private Integer sfhSoLine;
	private Double sfhTotalStd;
	private String sfhChr01;
	private String sfhChr02;
	private String sfhChr03;
	private String sfhChr04;
	private Double sfhDec01;
	private Double sfhDec02;
	private Double sfhDec03;
	private Date sfhDte01;
	private Date sfhDte02;
	private Date sfhDte03;
	private Boolean sfhLog01;
	private Boolean sfhLog02;
	private Boolean sfhLog03;
	private String sfhQadc01;
	private String sfhQadc02;
	private String sfhQadc03;
	private String sfhQadc04;
	private Date sfhQadd01;
	private Date sfhQadd02;
	private Date sfhQadd03;
	private Double sfhQadde01;
	private Double sfhQadde02;
	private Double sfhQadde03;
	private Boolean sfhQadl01;
	private Boolean sfhQadl02;
	private Boolean sfhExchange;
	private String sfhFcgCode;
	private Double sfhQtyRet;
	private Double sfhExgPrice;
	private String sfhUm;
	private Boolean sfhDetail;
	private Double sfhFixedCost;
	private Double sfhFixedPrice;
	private Double sfhInvoiceCost;
	private Date sfhCaOpnDate;
	private String sfhInvNbr;
	private String sfhUser1;
	private String sfhUser2;
	private Date sfhModDate;
	private String sfhModUserid;
	private String sfhReport;
	private String sfhRetSerial;
	private String sfhTaxc;
	private String sfhTaxUsage;
	private Boolean sfhTaxable;
	private Boolean sfhTaxIn;
	private String sfhTaxEnv;
	private Boolean sfhPst;
	private Boolean sfhQadl03;
	private Boolean sfhQadl04;
	private Boolean sfhPriceOnInv;
	private Boolean sfhQtyOnInv;
	private Double oidSfhHist;

	// Constructors

	/** default constructor */
	public AbstractSfhHist() {
	}

	/** minimal constructor */
	public AbstractSfhHist(SfhHistId id, Boolean sfhPriceOnInv,
			Boolean sfhQtyOnInv, Double oidSfhHist) {
		this.id = id;
		this.sfhPriceOnInv = sfhPriceOnInv;
		this.sfhQtyOnInv = sfhQtyOnInv;
		this.oidSfhHist = oidSfhHist;
	}

	/** full constructor */
	public AbstractSfhHist(SfhHistId id, Integer sfhCmtindx,
			Double sfhCoveredAmt, String sfhDesc, Integer sfhFisColumn,
			String sfhFisSort, String sfhFscCode, Integer sfhLine,
			String sfhNbr, Integer sfhOp, String sfhPart, Double sfhPrice,
			Integer sfhPtType, Double sfhQtyBilled, Double sfhQtyInv,
			Double sfhQtyReq, String sfhSerial, Integer sfhSoLine,
			Double sfhTotalStd, String sfhChr01, String sfhChr02,
			String sfhChr03, String sfhChr04, Double sfhDec01, Double sfhDec02,
			Double sfhDec03, Date sfhDte01, Date sfhDte02, Date sfhDte03,
			Boolean sfhLog01, Boolean sfhLog02, Boolean sfhLog03,
			String sfhQadc01, String sfhQadc02, String sfhQadc03,
			String sfhQadc04, Date sfhQadd01, Date sfhQadd02, Date sfhQadd03,
			Double sfhQadde01, Double sfhQadde02, Double sfhQadde03,
			Boolean sfhQadl01, Boolean sfhQadl02, Boolean sfhExchange,
			String sfhFcgCode, Double sfhQtyRet, Double sfhExgPrice,
			String sfhUm, Boolean sfhDetail, Double sfhFixedCost,
			Double sfhFixedPrice, Double sfhInvoiceCost, Date sfhCaOpnDate,
			String sfhInvNbr, String sfhUser1, String sfhUser2,
			Date sfhModDate, String sfhModUserid, String sfhReport,
			String sfhRetSerial, String sfhTaxc, String sfhTaxUsage,
			Boolean sfhTaxable, Boolean sfhTaxIn, String sfhTaxEnv,
			Boolean sfhPst, Boolean sfhQadl03, Boolean sfhQadl04,
			Boolean sfhPriceOnInv, Boolean sfhQtyOnInv, Double oidSfhHist) {
		this.id = id;
		this.sfhCmtindx = sfhCmtindx;
		this.sfhCoveredAmt = sfhCoveredAmt;
		this.sfhDesc = sfhDesc;
		this.sfhFisColumn = sfhFisColumn;
		this.sfhFisSort = sfhFisSort;
		this.sfhFscCode = sfhFscCode;
		this.sfhLine = sfhLine;
		this.sfhNbr = sfhNbr;
		this.sfhOp = sfhOp;
		this.sfhPart = sfhPart;
		this.sfhPrice = sfhPrice;
		this.sfhPtType = sfhPtType;
		this.sfhQtyBilled = sfhQtyBilled;
		this.sfhQtyInv = sfhQtyInv;
		this.sfhQtyReq = sfhQtyReq;
		this.sfhSerial = sfhSerial;
		this.sfhSoLine = sfhSoLine;
		this.sfhTotalStd = sfhTotalStd;
		this.sfhChr01 = sfhChr01;
		this.sfhChr02 = sfhChr02;
		this.sfhChr03 = sfhChr03;
		this.sfhChr04 = sfhChr04;
		this.sfhDec01 = sfhDec01;
		this.sfhDec02 = sfhDec02;
		this.sfhDec03 = sfhDec03;
		this.sfhDte01 = sfhDte01;
		this.sfhDte02 = sfhDte02;
		this.sfhDte03 = sfhDte03;
		this.sfhLog01 = sfhLog01;
		this.sfhLog02 = sfhLog02;
		this.sfhLog03 = sfhLog03;
		this.sfhQadc01 = sfhQadc01;
		this.sfhQadc02 = sfhQadc02;
		this.sfhQadc03 = sfhQadc03;
		this.sfhQadc04 = sfhQadc04;
		this.sfhQadd01 = sfhQadd01;
		this.sfhQadd02 = sfhQadd02;
		this.sfhQadd03 = sfhQadd03;
		this.sfhQadde01 = sfhQadde01;
		this.sfhQadde02 = sfhQadde02;
		this.sfhQadde03 = sfhQadde03;
		this.sfhQadl01 = sfhQadl01;
		this.sfhQadl02 = sfhQadl02;
		this.sfhExchange = sfhExchange;
		this.sfhFcgCode = sfhFcgCode;
		this.sfhQtyRet = sfhQtyRet;
		this.sfhExgPrice = sfhExgPrice;
		this.sfhUm = sfhUm;
		this.sfhDetail = sfhDetail;
		this.sfhFixedCost = sfhFixedCost;
		this.sfhFixedPrice = sfhFixedPrice;
		this.sfhInvoiceCost = sfhInvoiceCost;
		this.sfhCaOpnDate = sfhCaOpnDate;
		this.sfhInvNbr = sfhInvNbr;
		this.sfhUser1 = sfhUser1;
		this.sfhUser2 = sfhUser2;
		this.sfhModDate = sfhModDate;
		this.sfhModUserid = sfhModUserid;
		this.sfhReport = sfhReport;
		this.sfhRetSerial = sfhRetSerial;
		this.sfhTaxc = sfhTaxc;
		this.sfhTaxUsage = sfhTaxUsage;
		this.sfhTaxable = sfhTaxable;
		this.sfhTaxIn = sfhTaxIn;
		this.sfhTaxEnv = sfhTaxEnv;
		this.sfhPst = sfhPst;
		this.sfhQadl03 = sfhQadl03;
		this.sfhQadl04 = sfhQadl04;
		this.sfhPriceOnInv = sfhPriceOnInv;
		this.sfhQtyOnInv = sfhQtyOnInv;
		this.oidSfhHist = oidSfhHist;
	}

	// Property accessors

	public SfhHistId getId() {
		return this.id;
	}

	public void setId(SfhHistId id) {
		this.id = id;
	}

	public Integer getSfhCmtindx() {
		return this.sfhCmtindx;
	}

	public void setSfhCmtindx(Integer sfhCmtindx) {
		this.sfhCmtindx = sfhCmtindx;
	}

	public Double getSfhCoveredAmt() {
		return this.sfhCoveredAmt;
	}

	public void setSfhCoveredAmt(Double sfhCoveredAmt) {
		this.sfhCoveredAmt = sfhCoveredAmt;
	}

	public String getSfhDesc() {
		return this.sfhDesc;
	}

	public void setSfhDesc(String sfhDesc) {
		this.sfhDesc = sfhDesc;
	}

	public Integer getSfhFisColumn() {
		return this.sfhFisColumn;
	}

	public void setSfhFisColumn(Integer sfhFisColumn) {
		this.sfhFisColumn = sfhFisColumn;
	}

	public String getSfhFisSort() {
		return this.sfhFisSort;
	}

	public void setSfhFisSort(String sfhFisSort) {
		this.sfhFisSort = sfhFisSort;
	}

	public String getSfhFscCode() {
		return this.sfhFscCode;
	}

	public void setSfhFscCode(String sfhFscCode) {
		this.sfhFscCode = sfhFscCode;
	}

	public Integer getSfhLine() {
		return this.sfhLine;
	}

	public void setSfhLine(Integer sfhLine) {
		this.sfhLine = sfhLine;
	}

	public String getSfhNbr() {
		return this.sfhNbr;
	}

	public void setSfhNbr(String sfhNbr) {
		this.sfhNbr = sfhNbr;
	}

	public Integer getSfhOp() {
		return this.sfhOp;
	}

	public void setSfhOp(Integer sfhOp) {
		this.sfhOp = sfhOp;
	}

	public String getSfhPart() {
		return this.sfhPart;
	}

	public void setSfhPart(String sfhPart) {
		this.sfhPart = sfhPart;
	}

	public Double getSfhPrice() {
		return this.sfhPrice;
	}

	public void setSfhPrice(Double sfhPrice) {
		this.sfhPrice = sfhPrice;
	}

	public Integer getSfhPtType() {
		return this.sfhPtType;
	}

	public void setSfhPtType(Integer sfhPtType) {
		this.sfhPtType = sfhPtType;
	}

	public Double getSfhQtyBilled() {
		return this.sfhQtyBilled;
	}

	public void setSfhQtyBilled(Double sfhQtyBilled) {
		this.sfhQtyBilled = sfhQtyBilled;
	}

	public Double getSfhQtyInv() {
		return this.sfhQtyInv;
	}

	public void setSfhQtyInv(Double sfhQtyInv) {
		this.sfhQtyInv = sfhQtyInv;
	}

	public Double getSfhQtyReq() {
		return this.sfhQtyReq;
	}

	public void setSfhQtyReq(Double sfhQtyReq) {
		this.sfhQtyReq = sfhQtyReq;
	}

	public String getSfhSerial() {
		return this.sfhSerial;
	}

	public void setSfhSerial(String sfhSerial) {
		this.sfhSerial = sfhSerial;
	}

	public Integer getSfhSoLine() {
		return this.sfhSoLine;
	}

	public void setSfhSoLine(Integer sfhSoLine) {
		this.sfhSoLine = sfhSoLine;
	}

	public Double getSfhTotalStd() {
		return this.sfhTotalStd;
	}

	public void setSfhTotalStd(Double sfhTotalStd) {
		this.sfhTotalStd = sfhTotalStd;
	}

	public String getSfhChr01() {
		return this.sfhChr01;
	}

	public void setSfhChr01(String sfhChr01) {
		this.sfhChr01 = sfhChr01;
	}

	public String getSfhChr02() {
		return this.sfhChr02;
	}

	public void setSfhChr02(String sfhChr02) {
		this.sfhChr02 = sfhChr02;
	}

	public String getSfhChr03() {
		return this.sfhChr03;
	}

	public void setSfhChr03(String sfhChr03) {
		this.sfhChr03 = sfhChr03;
	}

	public String getSfhChr04() {
		return this.sfhChr04;
	}

	public void setSfhChr04(String sfhChr04) {
		this.sfhChr04 = sfhChr04;
	}

	public Double getSfhDec01() {
		return this.sfhDec01;
	}

	public void setSfhDec01(Double sfhDec01) {
		this.sfhDec01 = sfhDec01;
	}

	public Double getSfhDec02() {
		return this.sfhDec02;
	}

	public void setSfhDec02(Double sfhDec02) {
		this.sfhDec02 = sfhDec02;
	}

	public Double getSfhDec03() {
		return this.sfhDec03;
	}

	public void setSfhDec03(Double sfhDec03) {
		this.sfhDec03 = sfhDec03;
	}

	public Date getSfhDte01() {
		return this.sfhDte01;
	}

	public void setSfhDte01(Date sfhDte01) {
		this.sfhDte01 = sfhDte01;
	}

	public Date getSfhDte02() {
		return this.sfhDte02;
	}

	public void setSfhDte02(Date sfhDte02) {
		this.sfhDte02 = sfhDte02;
	}

	public Date getSfhDte03() {
		return this.sfhDte03;
	}

	public void setSfhDte03(Date sfhDte03) {
		this.sfhDte03 = sfhDte03;
	}

	public Boolean getSfhLog01() {
		return this.sfhLog01;
	}

	public void setSfhLog01(Boolean sfhLog01) {
		this.sfhLog01 = sfhLog01;
	}

	public Boolean getSfhLog02() {
		return this.sfhLog02;
	}

	public void setSfhLog02(Boolean sfhLog02) {
		this.sfhLog02 = sfhLog02;
	}

	public Boolean getSfhLog03() {
		return this.sfhLog03;
	}

	public void setSfhLog03(Boolean sfhLog03) {
		this.sfhLog03 = sfhLog03;
	}

	public String getSfhQadc01() {
		return this.sfhQadc01;
	}

	public void setSfhQadc01(String sfhQadc01) {
		this.sfhQadc01 = sfhQadc01;
	}

	public String getSfhQadc02() {
		return this.sfhQadc02;
	}

	public void setSfhQadc02(String sfhQadc02) {
		this.sfhQadc02 = sfhQadc02;
	}

	public String getSfhQadc03() {
		return this.sfhQadc03;
	}

	public void setSfhQadc03(String sfhQadc03) {
		this.sfhQadc03 = sfhQadc03;
	}

	public String getSfhQadc04() {
		return this.sfhQadc04;
	}

	public void setSfhQadc04(String sfhQadc04) {
		this.sfhQadc04 = sfhQadc04;
	}

	public Date getSfhQadd01() {
		return this.sfhQadd01;
	}

	public void setSfhQadd01(Date sfhQadd01) {
		this.sfhQadd01 = sfhQadd01;
	}

	public Date getSfhQadd02() {
		return this.sfhQadd02;
	}

	public void setSfhQadd02(Date sfhQadd02) {
		this.sfhQadd02 = sfhQadd02;
	}

	public Date getSfhQadd03() {
		return this.sfhQadd03;
	}

	public void setSfhQadd03(Date sfhQadd03) {
		this.sfhQadd03 = sfhQadd03;
	}

	public Double getSfhQadde01() {
		return this.sfhQadde01;
	}

	public void setSfhQadde01(Double sfhQadde01) {
		this.sfhQadde01 = sfhQadde01;
	}

	public Double getSfhQadde02() {
		return this.sfhQadde02;
	}

	public void setSfhQadde02(Double sfhQadde02) {
		this.sfhQadde02 = sfhQadde02;
	}

	public Double getSfhQadde03() {
		return this.sfhQadde03;
	}

	public void setSfhQadde03(Double sfhQadde03) {
		this.sfhQadde03 = sfhQadde03;
	}

	public Boolean getSfhQadl01() {
		return this.sfhQadl01;
	}

	public void setSfhQadl01(Boolean sfhQadl01) {
		this.sfhQadl01 = sfhQadl01;
	}

	public Boolean getSfhQadl02() {
		return this.sfhQadl02;
	}

	public void setSfhQadl02(Boolean sfhQadl02) {
		this.sfhQadl02 = sfhQadl02;
	}

	public Boolean getSfhExchange() {
		return this.sfhExchange;
	}

	public void setSfhExchange(Boolean sfhExchange) {
		this.sfhExchange = sfhExchange;
	}

	public String getSfhFcgCode() {
		return this.sfhFcgCode;
	}

	public void setSfhFcgCode(String sfhFcgCode) {
		this.sfhFcgCode = sfhFcgCode;
	}

	public Double getSfhQtyRet() {
		return this.sfhQtyRet;
	}

	public void setSfhQtyRet(Double sfhQtyRet) {
		this.sfhQtyRet = sfhQtyRet;
	}

	public Double getSfhExgPrice() {
		return this.sfhExgPrice;
	}

	public void setSfhExgPrice(Double sfhExgPrice) {
		this.sfhExgPrice = sfhExgPrice;
	}

	public String getSfhUm() {
		return this.sfhUm;
	}

	public void setSfhUm(String sfhUm) {
		this.sfhUm = sfhUm;
	}

	public Boolean getSfhDetail() {
		return this.sfhDetail;
	}

	public void setSfhDetail(Boolean sfhDetail) {
		this.sfhDetail = sfhDetail;
	}

	public Double getSfhFixedCost() {
		return this.sfhFixedCost;
	}

	public void setSfhFixedCost(Double sfhFixedCost) {
		this.sfhFixedCost = sfhFixedCost;
	}

	public Double getSfhFixedPrice() {
		return this.sfhFixedPrice;
	}

	public void setSfhFixedPrice(Double sfhFixedPrice) {
		this.sfhFixedPrice = sfhFixedPrice;
	}

	public Double getSfhInvoiceCost() {
		return this.sfhInvoiceCost;
	}

	public void setSfhInvoiceCost(Double sfhInvoiceCost) {
		this.sfhInvoiceCost = sfhInvoiceCost;
	}

	public Date getSfhCaOpnDate() {
		return this.sfhCaOpnDate;
	}

	public void setSfhCaOpnDate(Date sfhCaOpnDate) {
		this.sfhCaOpnDate = sfhCaOpnDate;
	}

	public String getSfhInvNbr() {
		return this.sfhInvNbr;
	}

	public void setSfhInvNbr(String sfhInvNbr) {
		this.sfhInvNbr = sfhInvNbr;
	}

	public String getSfhUser1() {
		return this.sfhUser1;
	}

	public void setSfhUser1(String sfhUser1) {
		this.sfhUser1 = sfhUser1;
	}

	public String getSfhUser2() {
		return this.sfhUser2;
	}

	public void setSfhUser2(String sfhUser2) {
		this.sfhUser2 = sfhUser2;
	}

	public Date getSfhModDate() {
		return this.sfhModDate;
	}

	public void setSfhModDate(Date sfhModDate) {
		this.sfhModDate = sfhModDate;
	}

	public String getSfhModUserid() {
		return this.sfhModUserid;
	}

	public void setSfhModUserid(String sfhModUserid) {
		this.sfhModUserid = sfhModUserid;
	}

	public String getSfhReport() {
		return this.sfhReport;
	}

	public void setSfhReport(String sfhReport) {
		this.sfhReport = sfhReport;
	}

	public String getSfhRetSerial() {
		return this.sfhRetSerial;
	}

	public void setSfhRetSerial(String sfhRetSerial) {
		this.sfhRetSerial = sfhRetSerial;
	}

	public String getSfhTaxc() {
		return this.sfhTaxc;
	}

	public void setSfhTaxc(String sfhTaxc) {
		this.sfhTaxc = sfhTaxc;
	}

	public String getSfhTaxUsage() {
		return this.sfhTaxUsage;
	}

	public void setSfhTaxUsage(String sfhTaxUsage) {
		this.sfhTaxUsage = sfhTaxUsage;
	}

	public Boolean getSfhTaxable() {
		return this.sfhTaxable;
	}

	public void setSfhTaxable(Boolean sfhTaxable) {
		this.sfhTaxable = sfhTaxable;
	}

	public Boolean getSfhTaxIn() {
		return this.sfhTaxIn;
	}

	public void setSfhTaxIn(Boolean sfhTaxIn) {
		this.sfhTaxIn = sfhTaxIn;
	}

	public String getSfhTaxEnv() {
		return this.sfhTaxEnv;
	}

	public void setSfhTaxEnv(String sfhTaxEnv) {
		this.sfhTaxEnv = sfhTaxEnv;
	}

	public Boolean getSfhPst() {
		return this.sfhPst;
	}

	public void setSfhPst(Boolean sfhPst) {
		this.sfhPst = sfhPst;
	}

	public Boolean getSfhQadl03() {
		return this.sfhQadl03;
	}

	public void setSfhQadl03(Boolean sfhQadl03) {
		this.sfhQadl03 = sfhQadl03;
	}

	public Boolean getSfhQadl04() {
		return this.sfhQadl04;
	}

	public void setSfhQadl04(Boolean sfhQadl04) {
		this.sfhQadl04 = sfhQadl04;
	}

	public Boolean getSfhPriceOnInv() {
		return this.sfhPriceOnInv;
	}

	public void setSfhPriceOnInv(Boolean sfhPriceOnInv) {
		this.sfhPriceOnInv = sfhPriceOnInv;
	}

	public Boolean getSfhQtyOnInv() {
		return this.sfhQtyOnInv;
	}

	public void setSfhQtyOnInv(Boolean sfhQtyOnInv) {
		this.sfhQtyOnInv = sfhQtyOnInv;
	}

	public Double getOidSfhHist() {
		return this.oidSfhHist;
	}

	public void setOidSfhHist(Double oidSfhHist) {
		this.oidSfhHist = oidSfhHist;
	}

}