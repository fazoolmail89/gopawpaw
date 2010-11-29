package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCnsudDet entity provides the base persistence definition of the
 * CnsudDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCnsudDet implements java.io.Serializable {

	// Fields

	private CnsudDetId id;
	private Double cnsudQtyUsed;
	private Integer cnsudReceiptTrnbr;
	private String cnsudReceiver;
	private String cnsudAsnShipper;
	private Date cnsudAgedDate;
	private Date cnsudOrigAgedDate;
	private String cnsudModUserid;
	private Date cnsudModDate;
	private String cnsudUser1;
	private String cnsudUser2;
	private String cnsudQadc01;
	private String cnsudQadc02;
	private Boolean cnsudIntConsignment;
	private Double oidCnsudDet;

	// Constructors

	/** default constructor */
	public AbstractCnsudDet() {
	}

	/** minimal constructor */
	public AbstractCnsudDet(CnsudDetId id, Double cnsudQtyUsed,
			Integer cnsudReceiptTrnbr, String cnsudReceiver,
			String cnsudAsnShipper, String cnsudModUserid, Date cnsudModDate,
			String cnsudUser1, String cnsudUser2, String cnsudQadc01,
			String cnsudQadc02, Boolean cnsudIntConsignment, Double oidCnsudDet) {
		this.id = id;
		this.cnsudQtyUsed = cnsudQtyUsed;
		this.cnsudReceiptTrnbr = cnsudReceiptTrnbr;
		this.cnsudReceiver = cnsudReceiver;
		this.cnsudAsnShipper = cnsudAsnShipper;
		this.cnsudModUserid = cnsudModUserid;
		this.cnsudModDate = cnsudModDate;
		this.cnsudUser1 = cnsudUser1;
		this.cnsudUser2 = cnsudUser2;
		this.cnsudQadc01 = cnsudQadc01;
		this.cnsudQadc02 = cnsudQadc02;
		this.cnsudIntConsignment = cnsudIntConsignment;
		this.oidCnsudDet = oidCnsudDet;
	}

	/** full constructor */
	public AbstractCnsudDet(CnsudDetId id, Double cnsudQtyUsed,
			Integer cnsudReceiptTrnbr, String cnsudReceiver,
			String cnsudAsnShipper, Date cnsudAgedDate, Date cnsudOrigAgedDate,
			String cnsudModUserid, Date cnsudModDate, String cnsudUser1,
			String cnsudUser2, String cnsudQadc01, String cnsudQadc02,
			Boolean cnsudIntConsignment, Double oidCnsudDet) {
		this.id = id;
		this.cnsudQtyUsed = cnsudQtyUsed;
		this.cnsudReceiptTrnbr = cnsudReceiptTrnbr;
		this.cnsudReceiver = cnsudReceiver;
		this.cnsudAsnShipper = cnsudAsnShipper;
		this.cnsudAgedDate = cnsudAgedDate;
		this.cnsudOrigAgedDate = cnsudOrigAgedDate;
		this.cnsudModUserid = cnsudModUserid;
		this.cnsudModDate = cnsudModDate;
		this.cnsudUser1 = cnsudUser1;
		this.cnsudUser2 = cnsudUser2;
		this.cnsudQadc01 = cnsudQadc01;
		this.cnsudQadc02 = cnsudQadc02;
		this.cnsudIntConsignment = cnsudIntConsignment;
		this.oidCnsudDet = oidCnsudDet;
	}

	// Property accessors

	public CnsudDetId getId() {
		return this.id;
	}

	public void setId(CnsudDetId id) {
		this.id = id;
	}

	public Double getCnsudQtyUsed() {
		return this.cnsudQtyUsed;
	}

	public void setCnsudQtyUsed(Double cnsudQtyUsed) {
		this.cnsudQtyUsed = cnsudQtyUsed;
	}

	public Integer getCnsudReceiptTrnbr() {
		return this.cnsudReceiptTrnbr;
	}

	public void setCnsudReceiptTrnbr(Integer cnsudReceiptTrnbr) {
		this.cnsudReceiptTrnbr = cnsudReceiptTrnbr;
	}

	public String getCnsudReceiver() {
		return this.cnsudReceiver;
	}

	public void setCnsudReceiver(String cnsudReceiver) {
		this.cnsudReceiver = cnsudReceiver;
	}

	public String getCnsudAsnShipper() {
		return this.cnsudAsnShipper;
	}

	public void setCnsudAsnShipper(String cnsudAsnShipper) {
		this.cnsudAsnShipper = cnsudAsnShipper;
	}

	public Date getCnsudAgedDate() {
		return this.cnsudAgedDate;
	}

	public void setCnsudAgedDate(Date cnsudAgedDate) {
		this.cnsudAgedDate = cnsudAgedDate;
	}

	public Date getCnsudOrigAgedDate() {
		return this.cnsudOrigAgedDate;
	}

	public void setCnsudOrigAgedDate(Date cnsudOrigAgedDate) {
		this.cnsudOrigAgedDate = cnsudOrigAgedDate;
	}

	public String getCnsudModUserid() {
		return this.cnsudModUserid;
	}

	public void setCnsudModUserid(String cnsudModUserid) {
		this.cnsudModUserid = cnsudModUserid;
	}

	public Date getCnsudModDate() {
		return this.cnsudModDate;
	}

	public void setCnsudModDate(Date cnsudModDate) {
		this.cnsudModDate = cnsudModDate;
	}

	public String getCnsudUser1() {
		return this.cnsudUser1;
	}

	public void setCnsudUser1(String cnsudUser1) {
		this.cnsudUser1 = cnsudUser1;
	}

	public String getCnsudUser2() {
		return this.cnsudUser2;
	}

	public void setCnsudUser2(String cnsudUser2) {
		this.cnsudUser2 = cnsudUser2;
	}

	public String getCnsudQadc01() {
		return this.cnsudQadc01;
	}

	public void setCnsudQadc01(String cnsudQadc01) {
		this.cnsudQadc01 = cnsudQadc01;
	}

	public String getCnsudQadc02() {
		return this.cnsudQadc02;
	}

	public void setCnsudQadc02(String cnsudQadc02) {
		this.cnsudQadc02 = cnsudQadc02;
	}

	public Boolean getCnsudIntConsignment() {
		return this.cnsudIntConsignment;
	}

	public void setCnsudIntConsignment(Boolean cnsudIntConsignment) {
		this.cnsudIntConsignment = cnsudIntConsignment;
	}

	public Double getOidCnsudDet() {
		return this.oidCnsudDet;
	}

	public void setOidCnsudDet(Double oidCnsudDet) {
		this.oidCnsudDet = oidCnsudDet;
	}

}