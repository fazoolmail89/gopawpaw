package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractShpHist entity provides the base persistence definition of the
 * ShpHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShpHist implements java.io.Serializable {

	// Fields

	private ShpHistId id;
	private String shpNbr;
	private Integer shpLine;
	private String shpShipfrom;
	private String shpPart;
	private String shpCustPart;
	private Double shpOpenQty;
	private Double shpExtPrice;
	private Date shpDueDate;
	private Date shpReqDate;
	private Date shpPerfDate;
	private Date shpShipDate;
	private String shpCust;
	private Double shpShipQty;
	private Double shpShipPrice;
	private String shpAbsId;
	private Boolean shpInclude;
	private Date shpModDate;
	private String shpModUserid;
	private String shpShipto;
	private String shpShipTime;
	private String shpRelId;
	private Integer shpCmtindx;
	private String shpOrderCategory;
	private String shpCustomerSource;
	private String shpShipUm;
	private Double shpShipUmConv;
	private String shpCurrency;
	private String shpOrdUm;
	private Double shpOrdUmConv;
	private String shpSchedTime;
	private String shpDoReq;
	private String shpQadc01;
	private String shpQadc02;
	private String shpUser1;
	private String shpUser2;
	private Double shpQtyPct;
	private Double oidShpHist;

	// Constructors

	/** default constructor */
	public AbstractShpHist() {
	}

	/** minimal constructor */
	public AbstractShpHist(ShpHistId id, String shpNbr, Integer shpLine,
			String shpShipfrom, String shpPart, String shpCustPart,
			Double shpOpenQty, Double shpExtPrice, String shpCust,
			Double shpShipQty, Double shpShipPrice, String shpAbsId,
			Boolean shpInclude, Date shpModDate, String shpModUserid,
			String shpShipto, String shpShipTime, String shpRelId,
			Integer shpCmtindx, String shpOrderCategory,
			String shpCustomerSource, String shpShipUm, Double shpShipUmConv,
			String shpCurrency, String shpOrdUm, Double shpOrdUmConv,
			String shpSchedTime, String shpDoReq, String shpQadc01,
			String shpQadc02, String shpUser1, String shpUser2,
			Double shpQtyPct, Double oidShpHist) {
		this.id = id;
		this.shpNbr = shpNbr;
		this.shpLine = shpLine;
		this.shpShipfrom = shpShipfrom;
		this.shpPart = shpPart;
		this.shpCustPart = shpCustPart;
		this.shpOpenQty = shpOpenQty;
		this.shpExtPrice = shpExtPrice;
		this.shpCust = shpCust;
		this.shpShipQty = shpShipQty;
		this.shpShipPrice = shpShipPrice;
		this.shpAbsId = shpAbsId;
		this.shpInclude = shpInclude;
		this.shpModDate = shpModDate;
		this.shpModUserid = shpModUserid;
		this.shpShipto = shpShipto;
		this.shpShipTime = shpShipTime;
		this.shpRelId = shpRelId;
		this.shpCmtindx = shpCmtindx;
		this.shpOrderCategory = shpOrderCategory;
		this.shpCustomerSource = shpCustomerSource;
		this.shpShipUm = shpShipUm;
		this.shpShipUmConv = shpShipUmConv;
		this.shpCurrency = shpCurrency;
		this.shpOrdUm = shpOrdUm;
		this.shpOrdUmConv = shpOrdUmConv;
		this.shpSchedTime = shpSchedTime;
		this.shpDoReq = shpDoReq;
		this.shpQadc01 = shpQadc01;
		this.shpQadc02 = shpQadc02;
		this.shpUser1 = shpUser1;
		this.shpUser2 = shpUser2;
		this.shpQtyPct = shpQtyPct;
		this.oidShpHist = oidShpHist;
	}

	/** full constructor */
	public AbstractShpHist(ShpHistId id, String shpNbr, Integer shpLine,
			String shpShipfrom, String shpPart, String shpCustPart,
			Double shpOpenQty, Double shpExtPrice, Date shpDueDate,
			Date shpReqDate, Date shpPerfDate, Date shpShipDate,
			String shpCust, Double shpShipQty, Double shpShipPrice,
			String shpAbsId, Boolean shpInclude, Date shpModDate,
			String shpModUserid, String shpShipto, String shpShipTime,
			String shpRelId, Integer shpCmtindx, String shpOrderCategory,
			String shpCustomerSource, String shpShipUm, Double shpShipUmConv,
			String shpCurrency, String shpOrdUm, Double shpOrdUmConv,
			String shpSchedTime, String shpDoReq, String shpQadc01,
			String shpQadc02, String shpUser1, String shpUser2,
			Double shpQtyPct, Double oidShpHist) {
		this.id = id;
		this.shpNbr = shpNbr;
		this.shpLine = shpLine;
		this.shpShipfrom = shpShipfrom;
		this.shpPart = shpPart;
		this.shpCustPart = shpCustPart;
		this.shpOpenQty = shpOpenQty;
		this.shpExtPrice = shpExtPrice;
		this.shpDueDate = shpDueDate;
		this.shpReqDate = shpReqDate;
		this.shpPerfDate = shpPerfDate;
		this.shpShipDate = shpShipDate;
		this.shpCust = shpCust;
		this.shpShipQty = shpShipQty;
		this.shpShipPrice = shpShipPrice;
		this.shpAbsId = shpAbsId;
		this.shpInclude = shpInclude;
		this.shpModDate = shpModDate;
		this.shpModUserid = shpModUserid;
		this.shpShipto = shpShipto;
		this.shpShipTime = shpShipTime;
		this.shpRelId = shpRelId;
		this.shpCmtindx = shpCmtindx;
		this.shpOrderCategory = shpOrderCategory;
		this.shpCustomerSource = shpCustomerSource;
		this.shpShipUm = shpShipUm;
		this.shpShipUmConv = shpShipUmConv;
		this.shpCurrency = shpCurrency;
		this.shpOrdUm = shpOrdUm;
		this.shpOrdUmConv = shpOrdUmConv;
		this.shpSchedTime = shpSchedTime;
		this.shpDoReq = shpDoReq;
		this.shpQadc01 = shpQadc01;
		this.shpQadc02 = shpQadc02;
		this.shpUser1 = shpUser1;
		this.shpUser2 = shpUser2;
		this.shpQtyPct = shpQtyPct;
		this.oidShpHist = oidShpHist;
	}

	// Property accessors

	public ShpHistId getId() {
		return this.id;
	}

	public void setId(ShpHistId id) {
		this.id = id;
	}

	public String getShpNbr() {
		return this.shpNbr;
	}

	public void setShpNbr(String shpNbr) {
		this.shpNbr = shpNbr;
	}

	public Integer getShpLine() {
		return this.shpLine;
	}

	public void setShpLine(Integer shpLine) {
		this.shpLine = shpLine;
	}

	public String getShpShipfrom() {
		return this.shpShipfrom;
	}

	public void setShpShipfrom(String shpShipfrom) {
		this.shpShipfrom = shpShipfrom;
	}

	public String getShpPart() {
		return this.shpPart;
	}

	public void setShpPart(String shpPart) {
		this.shpPart = shpPart;
	}

	public String getShpCustPart() {
		return this.shpCustPart;
	}

	public void setShpCustPart(String shpCustPart) {
		this.shpCustPart = shpCustPart;
	}

	public Double getShpOpenQty() {
		return this.shpOpenQty;
	}

	public void setShpOpenQty(Double shpOpenQty) {
		this.shpOpenQty = shpOpenQty;
	}

	public Double getShpExtPrice() {
		return this.shpExtPrice;
	}

	public void setShpExtPrice(Double shpExtPrice) {
		this.shpExtPrice = shpExtPrice;
	}

	public Date getShpDueDate() {
		return this.shpDueDate;
	}

	public void setShpDueDate(Date shpDueDate) {
		this.shpDueDate = shpDueDate;
	}

	public Date getShpReqDate() {
		return this.shpReqDate;
	}

	public void setShpReqDate(Date shpReqDate) {
		this.shpReqDate = shpReqDate;
	}

	public Date getShpPerfDate() {
		return this.shpPerfDate;
	}

	public void setShpPerfDate(Date shpPerfDate) {
		this.shpPerfDate = shpPerfDate;
	}

	public Date getShpShipDate() {
		return this.shpShipDate;
	}

	public void setShpShipDate(Date shpShipDate) {
		this.shpShipDate = shpShipDate;
	}

	public String getShpCust() {
		return this.shpCust;
	}

	public void setShpCust(String shpCust) {
		this.shpCust = shpCust;
	}

	public Double getShpShipQty() {
		return this.shpShipQty;
	}

	public void setShpShipQty(Double shpShipQty) {
		this.shpShipQty = shpShipQty;
	}

	public Double getShpShipPrice() {
		return this.shpShipPrice;
	}

	public void setShpShipPrice(Double shpShipPrice) {
		this.shpShipPrice = shpShipPrice;
	}

	public String getShpAbsId() {
		return this.shpAbsId;
	}

	public void setShpAbsId(String shpAbsId) {
		this.shpAbsId = shpAbsId;
	}

	public Boolean getShpInclude() {
		return this.shpInclude;
	}

	public void setShpInclude(Boolean shpInclude) {
		this.shpInclude = shpInclude;
	}

	public Date getShpModDate() {
		return this.shpModDate;
	}

	public void setShpModDate(Date shpModDate) {
		this.shpModDate = shpModDate;
	}

	public String getShpModUserid() {
		return this.shpModUserid;
	}

	public void setShpModUserid(String shpModUserid) {
		this.shpModUserid = shpModUserid;
	}

	public String getShpShipto() {
		return this.shpShipto;
	}

	public void setShpShipto(String shpShipto) {
		this.shpShipto = shpShipto;
	}

	public String getShpShipTime() {
		return this.shpShipTime;
	}

	public void setShpShipTime(String shpShipTime) {
		this.shpShipTime = shpShipTime;
	}

	public String getShpRelId() {
		return this.shpRelId;
	}

	public void setShpRelId(String shpRelId) {
		this.shpRelId = shpRelId;
	}

	public Integer getShpCmtindx() {
		return this.shpCmtindx;
	}

	public void setShpCmtindx(Integer shpCmtindx) {
		this.shpCmtindx = shpCmtindx;
	}

	public String getShpOrderCategory() {
		return this.shpOrderCategory;
	}

	public void setShpOrderCategory(String shpOrderCategory) {
		this.shpOrderCategory = shpOrderCategory;
	}

	public String getShpCustomerSource() {
		return this.shpCustomerSource;
	}

	public void setShpCustomerSource(String shpCustomerSource) {
		this.shpCustomerSource = shpCustomerSource;
	}

	public String getShpShipUm() {
		return this.shpShipUm;
	}

	public void setShpShipUm(String shpShipUm) {
		this.shpShipUm = shpShipUm;
	}

	public Double getShpShipUmConv() {
		return this.shpShipUmConv;
	}

	public void setShpShipUmConv(Double shpShipUmConv) {
		this.shpShipUmConv = shpShipUmConv;
	}

	public String getShpCurrency() {
		return this.shpCurrency;
	}

	public void setShpCurrency(String shpCurrency) {
		this.shpCurrency = shpCurrency;
	}

	public String getShpOrdUm() {
		return this.shpOrdUm;
	}

	public void setShpOrdUm(String shpOrdUm) {
		this.shpOrdUm = shpOrdUm;
	}

	public Double getShpOrdUmConv() {
		return this.shpOrdUmConv;
	}

	public void setShpOrdUmConv(Double shpOrdUmConv) {
		this.shpOrdUmConv = shpOrdUmConv;
	}

	public String getShpSchedTime() {
		return this.shpSchedTime;
	}

	public void setShpSchedTime(String shpSchedTime) {
		this.shpSchedTime = shpSchedTime;
	}

	public String getShpDoReq() {
		return this.shpDoReq;
	}

	public void setShpDoReq(String shpDoReq) {
		this.shpDoReq = shpDoReq;
	}

	public String getShpQadc01() {
		return this.shpQadc01;
	}

	public void setShpQadc01(String shpQadc01) {
		this.shpQadc01 = shpQadc01;
	}

	public String getShpQadc02() {
		return this.shpQadc02;
	}

	public void setShpQadc02(String shpQadc02) {
		this.shpQadc02 = shpQadc02;
	}

	public String getShpUser1() {
		return this.shpUser1;
	}

	public void setShpUser1(String shpUser1) {
		this.shpUser1 = shpUser1;
	}

	public String getShpUser2() {
		return this.shpUser2;
	}

	public void setShpUser2(String shpUser2) {
		this.shpUser2 = shpUser2;
	}

	public Double getShpQtyPct() {
		return this.shpQtyPct;
	}

	public void setShpQtyPct(Double shpQtyPct) {
		this.shpQtyPct = shpQtyPct;
	}

	public Double getOidShpHist() {
		return this.oidShpHist;
	}

	public void setOidShpHist(Double oidShpHist) {
		this.oidShpHist = oidShpHist;
	}

}