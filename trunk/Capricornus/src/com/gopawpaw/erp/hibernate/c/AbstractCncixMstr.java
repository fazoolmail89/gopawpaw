package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCncixMstr entity provides the base persistence definition of the
 * CncixMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCncixMstr implements java.io.Serializable {

	// Fields

	private CncixMstrId id;
	private Integer cncixShipTrnbr;
	private Boolean cncixSelfbill;
	private String cncixSoNbr;
	private Integer cncixSodLine;
	private String cncixSite;
	private String cncixShipto;
	private String cncixCust;
	private String cncixPart;
	private String cncixCustpart;
	private Double cncixQtyShip;
	private String cncixStockUm;
	private Double cncixPrice;
	private Double cncixShipValue;
	private String cncixCurr;
	private String cncixAsnShipper;
	private String cncixAuth;
	private String cncixPo;
	private Date cncixShipDate;
	private Double cncixQtyStock;
	private String cncixCurrentLoc;
	private String cncixLotser;
	private String cncixRef;
	private String cncixCustJob;
	private String cncixCustSeq;
	private String cncixCustRef;
	private String cncixCustDock;
	private String cncixLineFeed;
	private String cncixModelyr;
	private Date cncixAgedDate;
	private Date cncixOrigAgedDate;
	private Boolean cncixIntransit;
	private String cncixModUserid;
	private Date cncixModDate;
	private String cncixUser1;
	private String cncixUser2;
	private String cncixQadc01;
	private String cncixQadc02;
	private Boolean cncixIntConsignment;
	private Double oidCncixMstr;

	// Constructors

	/** default constructor */
	public AbstractCncixMstr() {
	}

	/** minimal constructor */
	public AbstractCncixMstr(CncixMstrId id, Integer cncixShipTrnbr,
			Boolean cncixSelfbill, String cncixSoNbr, Integer cncixSodLine,
			String cncixSite, String cncixShipto, String cncixCust,
			String cncixPart, String cncixCustpart, Double cncixQtyShip,
			String cncixStockUm, Double cncixPrice, Double cncixShipValue,
			String cncixCurr, String cncixAsnShipper, String cncixAuth,
			String cncixPo, Date cncixShipDate, Double cncixQtyStock,
			String cncixCurrentLoc, String cncixLotser, String cncixRef,
			String cncixCustJob, String cncixCustSeq, String cncixCustRef,
			String cncixCustDock, String cncixLineFeed, String cncixModelyr,
			Boolean cncixIntransit, String cncixModUserid, Date cncixModDate,
			String cncixUser1, String cncixUser2, String cncixQadc01,
			String cncixQadc02, Boolean cncixIntConsignment, Double oidCncixMstr) {
		this.id = id;
		this.cncixShipTrnbr = cncixShipTrnbr;
		this.cncixSelfbill = cncixSelfbill;
		this.cncixSoNbr = cncixSoNbr;
		this.cncixSodLine = cncixSodLine;
		this.cncixSite = cncixSite;
		this.cncixShipto = cncixShipto;
		this.cncixCust = cncixCust;
		this.cncixPart = cncixPart;
		this.cncixCustpart = cncixCustpart;
		this.cncixQtyShip = cncixQtyShip;
		this.cncixStockUm = cncixStockUm;
		this.cncixPrice = cncixPrice;
		this.cncixShipValue = cncixShipValue;
		this.cncixCurr = cncixCurr;
		this.cncixAsnShipper = cncixAsnShipper;
		this.cncixAuth = cncixAuth;
		this.cncixPo = cncixPo;
		this.cncixShipDate = cncixShipDate;
		this.cncixQtyStock = cncixQtyStock;
		this.cncixCurrentLoc = cncixCurrentLoc;
		this.cncixLotser = cncixLotser;
		this.cncixRef = cncixRef;
		this.cncixCustJob = cncixCustJob;
		this.cncixCustSeq = cncixCustSeq;
		this.cncixCustRef = cncixCustRef;
		this.cncixCustDock = cncixCustDock;
		this.cncixLineFeed = cncixLineFeed;
		this.cncixModelyr = cncixModelyr;
		this.cncixIntransit = cncixIntransit;
		this.cncixModUserid = cncixModUserid;
		this.cncixModDate = cncixModDate;
		this.cncixUser1 = cncixUser1;
		this.cncixUser2 = cncixUser2;
		this.cncixQadc01 = cncixQadc01;
		this.cncixQadc02 = cncixQadc02;
		this.cncixIntConsignment = cncixIntConsignment;
		this.oidCncixMstr = oidCncixMstr;
	}

	/** full constructor */
	public AbstractCncixMstr(CncixMstrId id, Integer cncixShipTrnbr,
			Boolean cncixSelfbill, String cncixSoNbr, Integer cncixSodLine,
			String cncixSite, String cncixShipto, String cncixCust,
			String cncixPart, String cncixCustpart, Double cncixQtyShip,
			String cncixStockUm, Double cncixPrice, Double cncixShipValue,
			String cncixCurr, String cncixAsnShipper, String cncixAuth,
			String cncixPo, Date cncixShipDate, Double cncixQtyStock,
			String cncixCurrentLoc, String cncixLotser, String cncixRef,
			String cncixCustJob, String cncixCustSeq, String cncixCustRef,
			String cncixCustDock, String cncixLineFeed, String cncixModelyr,
			Date cncixAgedDate, Date cncixOrigAgedDate, Boolean cncixIntransit,
			String cncixModUserid, Date cncixModDate, String cncixUser1,
			String cncixUser2, String cncixQadc01, String cncixQadc02,
			Boolean cncixIntConsignment, Double oidCncixMstr) {
		this.id = id;
		this.cncixShipTrnbr = cncixShipTrnbr;
		this.cncixSelfbill = cncixSelfbill;
		this.cncixSoNbr = cncixSoNbr;
		this.cncixSodLine = cncixSodLine;
		this.cncixSite = cncixSite;
		this.cncixShipto = cncixShipto;
		this.cncixCust = cncixCust;
		this.cncixPart = cncixPart;
		this.cncixCustpart = cncixCustpart;
		this.cncixQtyShip = cncixQtyShip;
		this.cncixStockUm = cncixStockUm;
		this.cncixPrice = cncixPrice;
		this.cncixShipValue = cncixShipValue;
		this.cncixCurr = cncixCurr;
		this.cncixAsnShipper = cncixAsnShipper;
		this.cncixAuth = cncixAuth;
		this.cncixPo = cncixPo;
		this.cncixShipDate = cncixShipDate;
		this.cncixQtyStock = cncixQtyStock;
		this.cncixCurrentLoc = cncixCurrentLoc;
		this.cncixLotser = cncixLotser;
		this.cncixRef = cncixRef;
		this.cncixCustJob = cncixCustJob;
		this.cncixCustSeq = cncixCustSeq;
		this.cncixCustRef = cncixCustRef;
		this.cncixCustDock = cncixCustDock;
		this.cncixLineFeed = cncixLineFeed;
		this.cncixModelyr = cncixModelyr;
		this.cncixAgedDate = cncixAgedDate;
		this.cncixOrigAgedDate = cncixOrigAgedDate;
		this.cncixIntransit = cncixIntransit;
		this.cncixModUserid = cncixModUserid;
		this.cncixModDate = cncixModDate;
		this.cncixUser1 = cncixUser1;
		this.cncixUser2 = cncixUser2;
		this.cncixQadc01 = cncixQadc01;
		this.cncixQadc02 = cncixQadc02;
		this.cncixIntConsignment = cncixIntConsignment;
		this.oidCncixMstr = oidCncixMstr;
	}

	// Property accessors

	public CncixMstrId getId() {
		return this.id;
	}

	public void setId(CncixMstrId id) {
		this.id = id;
	}

	public Integer getCncixShipTrnbr() {
		return this.cncixShipTrnbr;
	}

	public void setCncixShipTrnbr(Integer cncixShipTrnbr) {
		this.cncixShipTrnbr = cncixShipTrnbr;
	}

	public Boolean getCncixSelfbill() {
		return this.cncixSelfbill;
	}

	public void setCncixSelfbill(Boolean cncixSelfbill) {
		this.cncixSelfbill = cncixSelfbill;
	}

	public String getCncixSoNbr() {
		return this.cncixSoNbr;
	}

	public void setCncixSoNbr(String cncixSoNbr) {
		this.cncixSoNbr = cncixSoNbr;
	}

	public Integer getCncixSodLine() {
		return this.cncixSodLine;
	}

	public void setCncixSodLine(Integer cncixSodLine) {
		this.cncixSodLine = cncixSodLine;
	}

	public String getCncixSite() {
		return this.cncixSite;
	}

	public void setCncixSite(String cncixSite) {
		this.cncixSite = cncixSite;
	}

	public String getCncixShipto() {
		return this.cncixShipto;
	}

	public void setCncixShipto(String cncixShipto) {
		this.cncixShipto = cncixShipto;
	}

	public String getCncixCust() {
		return this.cncixCust;
	}

	public void setCncixCust(String cncixCust) {
		this.cncixCust = cncixCust;
	}

	public String getCncixPart() {
		return this.cncixPart;
	}

	public void setCncixPart(String cncixPart) {
		this.cncixPart = cncixPart;
	}

	public String getCncixCustpart() {
		return this.cncixCustpart;
	}

	public void setCncixCustpart(String cncixCustpart) {
		this.cncixCustpart = cncixCustpart;
	}

	public Double getCncixQtyShip() {
		return this.cncixQtyShip;
	}

	public void setCncixQtyShip(Double cncixQtyShip) {
		this.cncixQtyShip = cncixQtyShip;
	}

	public String getCncixStockUm() {
		return this.cncixStockUm;
	}

	public void setCncixStockUm(String cncixStockUm) {
		this.cncixStockUm = cncixStockUm;
	}

	public Double getCncixPrice() {
		return this.cncixPrice;
	}

	public void setCncixPrice(Double cncixPrice) {
		this.cncixPrice = cncixPrice;
	}

	public Double getCncixShipValue() {
		return this.cncixShipValue;
	}

	public void setCncixShipValue(Double cncixShipValue) {
		this.cncixShipValue = cncixShipValue;
	}

	public String getCncixCurr() {
		return this.cncixCurr;
	}

	public void setCncixCurr(String cncixCurr) {
		this.cncixCurr = cncixCurr;
	}

	public String getCncixAsnShipper() {
		return this.cncixAsnShipper;
	}

	public void setCncixAsnShipper(String cncixAsnShipper) {
		this.cncixAsnShipper = cncixAsnShipper;
	}

	public String getCncixAuth() {
		return this.cncixAuth;
	}

	public void setCncixAuth(String cncixAuth) {
		this.cncixAuth = cncixAuth;
	}

	public String getCncixPo() {
		return this.cncixPo;
	}

	public void setCncixPo(String cncixPo) {
		this.cncixPo = cncixPo;
	}

	public Date getCncixShipDate() {
		return this.cncixShipDate;
	}

	public void setCncixShipDate(Date cncixShipDate) {
		this.cncixShipDate = cncixShipDate;
	}

	public Double getCncixQtyStock() {
		return this.cncixQtyStock;
	}

	public void setCncixQtyStock(Double cncixQtyStock) {
		this.cncixQtyStock = cncixQtyStock;
	}

	public String getCncixCurrentLoc() {
		return this.cncixCurrentLoc;
	}

	public void setCncixCurrentLoc(String cncixCurrentLoc) {
		this.cncixCurrentLoc = cncixCurrentLoc;
	}

	public String getCncixLotser() {
		return this.cncixLotser;
	}

	public void setCncixLotser(String cncixLotser) {
		this.cncixLotser = cncixLotser;
	}

	public String getCncixRef() {
		return this.cncixRef;
	}

	public void setCncixRef(String cncixRef) {
		this.cncixRef = cncixRef;
	}

	public String getCncixCustJob() {
		return this.cncixCustJob;
	}

	public void setCncixCustJob(String cncixCustJob) {
		this.cncixCustJob = cncixCustJob;
	}

	public String getCncixCustSeq() {
		return this.cncixCustSeq;
	}

	public void setCncixCustSeq(String cncixCustSeq) {
		this.cncixCustSeq = cncixCustSeq;
	}

	public String getCncixCustRef() {
		return this.cncixCustRef;
	}

	public void setCncixCustRef(String cncixCustRef) {
		this.cncixCustRef = cncixCustRef;
	}

	public String getCncixCustDock() {
		return this.cncixCustDock;
	}

	public void setCncixCustDock(String cncixCustDock) {
		this.cncixCustDock = cncixCustDock;
	}

	public String getCncixLineFeed() {
		return this.cncixLineFeed;
	}

	public void setCncixLineFeed(String cncixLineFeed) {
		this.cncixLineFeed = cncixLineFeed;
	}

	public String getCncixModelyr() {
		return this.cncixModelyr;
	}

	public void setCncixModelyr(String cncixModelyr) {
		this.cncixModelyr = cncixModelyr;
	}

	public Date getCncixAgedDate() {
		return this.cncixAgedDate;
	}

	public void setCncixAgedDate(Date cncixAgedDate) {
		this.cncixAgedDate = cncixAgedDate;
	}

	public Date getCncixOrigAgedDate() {
		return this.cncixOrigAgedDate;
	}

	public void setCncixOrigAgedDate(Date cncixOrigAgedDate) {
		this.cncixOrigAgedDate = cncixOrigAgedDate;
	}

	public Boolean getCncixIntransit() {
		return this.cncixIntransit;
	}

	public void setCncixIntransit(Boolean cncixIntransit) {
		this.cncixIntransit = cncixIntransit;
	}

	public String getCncixModUserid() {
		return this.cncixModUserid;
	}

	public void setCncixModUserid(String cncixModUserid) {
		this.cncixModUserid = cncixModUserid;
	}

	public Date getCncixModDate() {
		return this.cncixModDate;
	}

	public void setCncixModDate(Date cncixModDate) {
		this.cncixModDate = cncixModDate;
	}

	public String getCncixUser1() {
		return this.cncixUser1;
	}

	public void setCncixUser1(String cncixUser1) {
		this.cncixUser1 = cncixUser1;
	}

	public String getCncixUser2() {
		return this.cncixUser2;
	}

	public void setCncixUser2(String cncixUser2) {
		this.cncixUser2 = cncixUser2;
	}

	public String getCncixQadc01() {
		return this.cncixQadc01;
	}

	public void setCncixQadc01(String cncixQadc01) {
		this.cncixQadc01 = cncixQadc01;
	}

	public String getCncixQadc02() {
		return this.cncixQadc02;
	}

	public void setCncixQadc02(String cncixQadc02) {
		this.cncixQadc02 = cncixQadc02;
	}

	public Boolean getCncixIntConsignment() {
		return this.cncixIntConsignment;
	}

	public void setCncixIntConsignment(Boolean cncixIntConsignment) {
		this.cncixIntConsignment = cncixIntConsignment;
	}

	public Double getOidCncixMstr() {
		return this.oidCncixMstr;
	}

	public void setOidCncixMstr(Double oidCncixMstr) {
		this.oidCncixMstr = oidCncixMstr;
	}

}