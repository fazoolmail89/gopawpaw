package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCnsixMstr entity provides the base persistence definition of the
 * CnsixMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCnsixMstr implements java.io.Serializable {

	// Fields

	private CnsixMstrId id;
	private Integer cnsixReceiptTrnbr;
	private String cnsixReceiver;
	private String cnsixPoNbr;
	private Integer cnsixPodLine;
	private String cnsixSite;
	private String cnsixPart;
	private String cnsixAsnShipper;
	private Double cnsixQtyConsigned;
	private String cnsixLotser;
	private String cnsixRef;
	private Date cnsixAgedDate;
	private Date cnsixOrigAgedDate;
	private String cnsixModUserid;
	private Date cnsixModDate;
	private String cnsixUser1;
	private String cnsixUser2;
	private String cnsixQadc01;
	private String cnsixQadc02;
	private Boolean cnsixIntConsignment;
	private Double oidCnsixMstr;

	// Constructors

	/** default constructor */
	public AbstractCnsixMstr() {
	}

	/** minimal constructor */
	public AbstractCnsixMstr(CnsixMstrId id, Integer cnsixReceiptTrnbr,
			String cnsixReceiver, String cnsixPoNbr, Integer cnsixPodLine,
			String cnsixSite, String cnsixPart, String cnsixAsnShipper,
			Double cnsixQtyConsigned, String cnsixLotser, String cnsixRef,
			String cnsixModUserid, Date cnsixModDate, String cnsixUser1,
			String cnsixUser2, String cnsixQadc01, String cnsixQadc02,
			Boolean cnsixIntConsignment, Double oidCnsixMstr) {
		this.id = id;
		this.cnsixReceiptTrnbr = cnsixReceiptTrnbr;
		this.cnsixReceiver = cnsixReceiver;
		this.cnsixPoNbr = cnsixPoNbr;
		this.cnsixPodLine = cnsixPodLine;
		this.cnsixSite = cnsixSite;
		this.cnsixPart = cnsixPart;
		this.cnsixAsnShipper = cnsixAsnShipper;
		this.cnsixQtyConsigned = cnsixQtyConsigned;
		this.cnsixLotser = cnsixLotser;
		this.cnsixRef = cnsixRef;
		this.cnsixModUserid = cnsixModUserid;
		this.cnsixModDate = cnsixModDate;
		this.cnsixUser1 = cnsixUser1;
		this.cnsixUser2 = cnsixUser2;
		this.cnsixQadc01 = cnsixQadc01;
		this.cnsixQadc02 = cnsixQadc02;
		this.cnsixIntConsignment = cnsixIntConsignment;
		this.oidCnsixMstr = oidCnsixMstr;
	}

	/** full constructor */
	public AbstractCnsixMstr(CnsixMstrId id, Integer cnsixReceiptTrnbr,
			String cnsixReceiver, String cnsixPoNbr, Integer cnsixPodLine,
			String cnsixSite, String cnsixPart, String cnsixAsnShipper,
			Double cnsixQtyConsigned, String cnsixLotser, String cnsixRef,
			Date cnsixAgedDate, Date cnsixOrigAgedDate, String cnsixModUserid,
			Date cnsixModDate, String cnsixUser1, String cnsixUser2,
			String cnsixQadc01, String cnsixQadc02,
			Boolean cnsixIntConsignment, Double oidCnsixMstr) {
		this.id = id;
		this.cnsixReceiptTrnbr = cnsixReceiptTrnbr;
		this.cnsixReceiver = cnsixReceiver;
		this.cnsixPoNbr = cnsixPoNbr;
		this.cnsixPodLine = cnsixPodLine;
		this.cnsixSite = cnsixSite;
		this.cnsixPart = cnsixPart;
		this.cnsixAsnShipper = cnsixAsnShipper;
		this.cnsixQtyConsigned = cnsixQtyConsigned;
		this.cnsixLotser = cnsixLotser;
		this.cnsixRef = cnsixRef;
		this.cnsixAgedDate = cnsixAgedDate;
		this.cnsixOrigAgedDate = cnsixOrigAgedDate;
		this.cnsixModUserid = cnsixModUserid;
		this.cnsixModDate = cnsixModDate;
		this.cnsixUser1 = cnsixUser1;
		this.cnsixUser2 = cnsixUser2;
		this.cnsixQadc01 = cnsixQadc01;
		this.cnsixQadc02 = cnsixQadc02;
		this.cnsixIntConsignment = cnsixIntConsignment;
		this.oidCnsixMstr = oidCnsixMstr;
	}

	// Property accessors

	public CnsixMstrId getId() {
		return this.id;
	}

	public void setId(CnsixMstrId id) {
		this.id = id;
	}

	public Integer getCnsixReceiptTrnbr() {
		return this.cnsixReceiptTrnbr;
	}

	public void setCnsixReceiptTrnbr(Integer cnsixReceiptTrnbr) {
		this.cnsixReceiptTrnbr = cnsixReceiptTrnbr;
	}

	public String getCnsixReceiver() {
		return this.cnsixReceiver;
	}

	public void setCnsixReceiver(String cnsixReceiver) {
		this.cnsixReceiver = cnsixReceiver;
	}

	public String getCnsixPoNbr() {
		return this.cnsixPoNbr;
	}

	public void setCnsixPoNbr(String cnsixPoNbr) {
		this.cnsixPoNbr = cnsixPoNbr;
	}

	public Integer getCnsixPodLine() {
		return this.cnsixPodLine;
	}

	public void setCnsixPodLine(Integer cnsixPodLine) {
		this.cnsixPodLine = cnsixPodLine;
	}

	public String getCnsixSite() {
		return this.cnsixSite;
	}

	public void setCnsixSite(String cnsixSite) {
		this.cnsixSite = cnsixSite;
	}

	public String getCnsixPart() {
		return this.cnsixPart;
	}

	public void setCnsixPart(String cnsixPart) {
		this.cnsixPart = cnsixPart;
	}

	public String getCnsixAsnShipper() {
		return this.cnsixAsnShipper;
	}

	public void setCnsixAsnShipper(String cnsixAsnShipper) {
		this.cnsixAsnShipper = cnsixAsnShipper;
	}

	public Double getCnsixQtyConsigned() {
		return this.cnsixQtyConsigned;
	}

	public void setCnsixQtyConsigned(Double cnsixQtyConsigned) {
		this.cnsixQtyConsigned = cnsixQtyConsigned;
	}

	public String getCnsixLotser() {
		return this.cnsixLotser;
	}

	public void setCnsixLotser(String cnsixLotser) {
		this.cnsixLotser = cnsixLotser;
	}

	public String getCnsixRef() {
		return this.cnsixRef;
	}

	public void setCnsixRef(String cnsixRef) {
		this.cnsixRef = cnsixRef;
	}

	public Date getCnsixAgedDate() {
		return this.cnsixAgedDate;
	}

	public void setCnsixAgedDate(Date cnsixAgedDate) {
		this.cnsixAgedDate = cnsixAgedDate;
	}

	public Date getCnsixOrigAgedDate() {
		return this.cnsixOrigAgedDate;
	}

	public void setCnsixOrigAgedDate(Date cnsixOrigAgedDate) {
		this.cnsixOrigAgedDate = cnsixOrigAgedDate;
	}

	public String getCnsixModUserid() {
		return this.cnsixModUserid;
	}

	public void setCnsixModUserid(String cnsixModUserid) {
		this.cnsixModUserid = cnsixModUserid;
	}

	public Date getCnsixModDate() {
		return this.cnsixModDate;
	}

	public void setCnsixModDate(Date cnsixModDate) {
		this.cnsixModDate = cnsixModDate;
	}

	public String getCnsixUser1() {
		return this.cnsixUser1;
	}

	public void setCnsixUser1(String cnsixUser1) {
		this.cnsixUser1 = cnsixUser1;
	}

	public String getCnsixUser2() {
		return this.cnsixUser2;
	}

	public void setCnsixUser2(String cnsixUser2) {
		this.cnsixUser2 = cnsixUser2;
	}

	public String getCnsixQadc01() {
		return this.cnsixQadc01;
	}

	public void setCnsixQadc01(String cnsixQadc01) {
		this.cnsixQadc01 = cnsixQadc01;
	}

	public String getCnsixQadc02() {
		return this.cnsixQadc02;
	}

	public void setCnsixQadc02(String cnsixQadc02) {
		this.cnsixQadc02 = cnsixQadc02;
	}

	public Boolean getCnsixIntConsignment() {
		return this.cnsixIntConsignment;
	}

	public void setCnsixIntConsignment(Boolean cnsixIntConsignment) {
		this.cnsixIntConsignment = cnsixIntConsignment;
	}

	public Double getOidCnsixMstr() {
		return this.oidCnsixMstr;
	}

	public void setOidCnsixMstr(Double oidCnsixMstr) {
		this.oidCnsixMstr = oidCnsixMstr;
	}

}