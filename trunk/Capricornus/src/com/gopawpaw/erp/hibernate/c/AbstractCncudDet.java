package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCncudDet entity provides the base persistence definition of the
 * CncudDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCncudDet implements java.io.Serializable {

	// Fields

	private CncudDetId id;
	private Double cncudUsageQty;
	private String cncudUsageUm;
	private Double cncudUsageUmConv;
	private Integer cncudShipTrnbr;
	private Boolean cncudSelfbill;
	private Double cncudQtyShip;
	private String cncudStockUm;
	private Double cncudPrice;
	private Double cncudShipValue;
	private String cncudCurr;
	private String cncudAsnShipper;
	private Date cncudShipDate;
	private String cncudCurrentLoc;
	private String cncudCustDock;
	private String cncudLineFeed;
	private Date cncudAgedDate;
	private Date cncudOrigAgedDate;
	private String cncudModUserid;
	private Date cncudModDate;
	private String cncudUser1;
	private String cncudUser2;
	private String cncudQadc01;
	private String cncudQadc02;
	private Boolean cncudIntConsignment;
	private Double oidCncudDet;

	// Constructors

	/** default constructor */
	public AbstractCncudDet() {
	}

	/** minimal constructor */
	public AbstractCncudDet(CncudDetId id, Double cncudUsageQty,
			String cncudUsageUm, Double cncudUsageUmConv,
			Integer cncudShipTrnbr, Boolean cncudSelfbill, Double cncudQtyShip,
			String cncudStockUm, Double cncudPrice, Double cncudShipValue,
			String cncudCurr, String cncudAsnShipper, Date cncudShipDate,
			String cncudCurrentLoc, String cncudCustDock, String cncudLineFeed,
			String cncudModUserid, Date cncudModDate, String cncudUser1,
			String cncudUser2, String cncudQadc01, String cncudQadc02,
			Boolean cncudIntConsignment, Double oidCncudDet) {
		this.id = id;
		this.cncudUsageQty = cncudUsageQty;
		this.cncudUsageUm = cncudUsageUm;
		this.cncudUsageUmConv = cncudUsageUmConv;
		this.cncudShipTrnbr = cncudShipTrnbr;
		this.cncudSelfbill = cncudSelfbill;
		this.cncudQtyShip = cncudQtyShip;
		this.cncudStockUm = cncudStockUm;
		this.cncudPrice = cncudPrice;
		this.cncudShipValue = cncudShipValue;
		this.cncudCurr = cncudCurr;
		this.cncudAsnShipper = cncudAsnShipper;
		this.cncudShipDate = cncudShipDate;
		this.cncudCurrentLoc = cncudCurrentLoc;
		this.cncudCustDock = cncudCustDock;
		this.cncudLineFeed = cncudLineFeed;
		this.cncudModUserid = cncudModUserid;
		this.cncudModDate = cncudModDate;
		this.cncudUser1 = cncudUser1;
		this.cncudUser2 = cncudUser2;
		this.cncudQadc01 = cncudQadc01;
		this.cncudQadc02 = cncudQadc02;
		this.cncudIntConsignment = cncudIntConsignment;
		this.oidCncudDet = oidCncudDet;
	}

	/** full constructor */
	public AbstractCncudDet(CncudDetId id, Double cncudUsageQty,
			String cncudUsageUm, Double cncudUsageUmConv,
			Integer cncudShipTrnbr, Boolean cncudSelfbill, Double cncudQtyShip,
			String cncudStockUm, Double cncudPrice, Double cncudShipValue,
			String cncudCurr, String cncudAsnShipper, Date cncudShipDate,
			String cncudCurrentLoc, String cncudCustDock, String cncudLineFeed,
			Date cncudAgedDate, Date cncudOrigAgedDate, String cncudModUserid,
			Date cncudModDate, String cncudUser1, String cncudUser2,
			String cncudQadc01, String cncudQadc02,
			Boolean cncudIntConsignment, Double oidCncudDet) {
		this.id = id;
		this.cncudUsageQty = cncudUsageQty;
		this.cncudUsageUm = cncudUsageUm;
		this.cncudUsageUmConv = cncudUsageUmConv;
		this.cncudShipTrnbr = cncudShipTrnbr;
		this.cncudSelfbill = cncudSelfbill;
		this.cncudQtyShip = cncudQtyShip;
		this.cncudStockUm = cncudStockUm;
		this.cncudPrice = cncudPrice;
		this.cncudShipValue = cncudShipValue;
		this.cncudCurr = cncudCurr;
		this.cncudAsnShipper = cncudAsnShipper;
		this.cncudShipDate = cncudShipDate;
		this.cncudCurrentLoc = cncudCurrentLoc;
		this.cncudCustDock = cncudCustDock;
		this.cncudLineFeed = cncudLineFeed;
		this.cncudAgedDate = cncudAgedDate;
		this.cncudOrigAgedDate = cncudOrigAgedDate;
		this.cncudModUserid = cncudModUserid;
		this.cncudModDate = cncudModDate;
		this.cncudUser1 = cncudUser1;
		this.cncudUser2 = cncudUser2;
		this.cncudQadc01 = cncudQadc01;
		this.cncudQadc02 = cncudQadc02;
		this.cncudIntConsignment = cncudIntConsignment;
		this.oidCncudDet = oidCncudDet;
	}

	// Property accessors

	public CncudDetId getId() {
		return this.id;
	}

	public void setId(CncudDetId id) {
		this.id = id;
	}

	public Double getCncudUsageQty() {
		return this.cncudUsageQty;
	}

	public void setCncudUsageQty(Double cncudUsageQty) {
		this.cncudUsageQty = cncudUsageQty;
	}

	public String getCncudUsageUm() {
		return this.cncudUsageUm;
	}

	public void setCncudUsageUm(String cncudUsageUm) {
		this.cncudUsageUm = cncudUsageUm;
	}

	public Double getCncudUsageUmConv() {
		return this.cncudUsageUmConv;
	}

	public void setCncudUsageUmConv(Double cncudUsageUmConv) {
		this.cncudUsageUmConv = cncudUsageUmConv;
	}

	public Integer getCncudShipTrnbr() {
		return this.cncudShipTrnbr;
	}

	public void setCncudShipTrnbr(Integer cncudShipTrnbr) {
		this.cncudShipTrnbr = cncudShipTrnbr;
	}

	public Boolean getCncudSelfbill() {
		return this.cncudSelfbill;
	}

	public void setCncudSelfbill(Boolean cncudSelfbill) {
		this.cncudSelfbill = cncudSelfbill;
	}

	public Double getCncudQtyShip() {
		return this.cncudQtyShip;
	}

	public void setCncudQtyShip(Double cncudQtyShip) {
		this.cncudQtyShip = cncudQtyShip;
	}

	public String getCncudStockUm() {
		return this.cncudStockUm;
	}

	public void setCncudStockUm(String cncudStockUm) {
		this.cncudStockUm = cncudStockUm;
	}

	public Double getCncudPrice() {
		return this.cncudPrice;
	}

	public void setCncudPrice(Double cncudPrice) {
		this.cncudPrice = cncudPrice;
	}

	public Double getCncudShipValue() {
		return this.cncudShipValue;
	}

	public void setCncudShipValue(Double cncudShipValue) {
		this.cncudShipValue = cncudShipValue;
	}

	public String getCncudCurr() {
		return this.cncudCurr;
	}

	public void setCncudCurr(String cncudCurr) {
		this.cncudCurr = cncudCurr;
	}

	public String getCncudAsnShipper() {
		return this.cncudAsnShipper;
	}

	public void setCncudAsnShipper(String cncudAsnShipper) {
		this.cncudAsnShipper = cncudAsnShipper;
	}

	public Date getCncudShipDate() {
		return this.cncudShipDate;
	}

	public void setCncudShipDate(Date cncudShipDate) {
		this.cncudShipDate = cncudShipDate;
	}

	public String getCncudCurrentLoc() {
		return this.cncudCurrentLoc;
	}

	public void setCncudCurrentLoc(String cncudCurrentLoc) {
		this.cncudCurrentLoc = cncudCurrentLoc;
	}

	public String getCncudCustDock() {
		return this.cncudCustDock;
	}

	public void setCncudCustDock(String cncudCustDock) {
		this.cncudCustDock = cncudCustDock;
	}

	public String getCncudLineFeed() {
		return this.cncudLineFeed;
	}

	public void setCncudLineFeed(String cncudLineFeed) {
		this.cncudLineFeed = cncudLineFeed;
	}

	public Date getCncudAgedDate() {
		return this.cncudAgedDate;
	}

	public void setCncudAgedDate(Date cncudAgedDate) {
		this.cncudAgedDate = cncudAgedDate;
	}

	public Date getCncudOrigAgedDate() {
		return this.cncudOrigAgedDate;
	}

	public void setCncudOrigAgedDate(Date cncudOrigAgedDate) {
		this.cncudOrigAgedDate = cncudOrigAgedDate;
	}

	public String getCncudModUserid() {
		return this.cncudModUserid;
	}

	public void setCncudModUserid(String cncudModUserid) {
		this.cncudModUserid = cncudModUserid;
	}

	public Date getCncudModDate() {
		return this.cncudModDate;
	}

	public void setCncudModDate(Date cncudModDate) {
		this.cncudModDate = cncudModDate;
	}

	public String getCncudUser1() {
		return this.cncudUser1;
	}

	public void setCncudUser1(String cncudUser1) {
		this.cncudUser1 = cncudUser1;
	}

	public String getCncudUser2() {
		return this.cncudUser2;
	}

	public void setCncudUser2(String cncudUser2) {
		this.cncudUser2 = cncudUser2;
	}

	public String getCncudQadc01() {
		return this.cncudQadc01;
	}

	public void setCncudQadc01(String cncudQadc01) {
		this.cncudQadc01 = cncudQadc01;
	}

	public String getCncudQadc02() {
		return this.cncudQadc02;
	}

	public void setCncudQadc02(String cncudQadc02) {
		this.cncudQadc02 = cncudQadc02;
	}

	public Boolean getCncudIntConsignment() {
		return this.cncudIntConsignment;
	}

	public void setCncudIntConsignment(Boolean cncudIntConsignment) {
		this.cncudIntConsignment = cncudIntConsignment;
	}

	public Double getOidCncudDet() {
		return this.oidCncudDet;
	}

	public void setOidCncudDet(Double oidCncudDet) {
		this.oidCncudDet = oidCncudDet;
	}

}