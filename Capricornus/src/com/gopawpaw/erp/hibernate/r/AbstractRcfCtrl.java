package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRcfCtrl entity provides the base persistence definition of the
 * RcfCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRcfCtrl implements java.io.Serializable {

	// Fields

	private String rcfDomain;
	private Integer rcfQadi03;
	private Boolean rcfActive;
	private Boolean rcfIncInRss;
	private Boolean rcfSchDefault;
	private Boolean rcfPackingOrder;
	private Boolean rcfShipperPrint;
	private Boolean rcfInvoicePrint;
	private Boolean rcfAsnEdi;
	private Boolean rcfInvoiceEdi;
	private Integer rcfFirmSeqDays;
	private Integer rcfSeqPerContainer;
	private Boolean rcfMergeSeq;
	private Boolean rcfCheckSeqTol;
	private Integer rcfMaxTol;
	private String rcfModUserid;
	private Date rcfModDate;
	private String rcfModPgm;
	private String rcfUser1;
	private String rcfUser2;
	private String rcfQadc01;
	private String rcfQadc02;
	private Double rcfQadd01;
	private Double rcfQadd02;
	private Integer rcfQadi01;
	private Integer rcfQadi02;
	private Boolean rcfQadl01;
	private Boolean rcfQadl02;
	private Boolean rcfQadl03;
	private Boolean rcfQadl04;
	private Date rcfQadt01;
	private Date rcfQadt02;
	private Double oidRcfCtrl;

	// Constructors

	/** default constructor */
	public AbstractRcfCtrl() {
	}

	/** minimal constructor */
	public AbstractRcfCtrl(Double oidRcfCtrl) {
		this.oidRcfCtrl = oidRcfCtrl;
	}

	/** full constructor */
	public AbstractRcfCtrl(Integer rcfQadi03, Boolean rcfActive,
			Boolean rcfIncInRss, Boolean rcfSchDefault,
			Boolean rcfPackingOrder, Boolean rcfShipperPrint,
			Boolean rcfInvoicePrint, Boolean rcfAsnEdi, Boolean rcfInvoiceEdi,
			Integer rcfFirmSeqDays, Integer rcfSeqPerContainer,
			Boolean rcfMergeSeq, Boolean rcfCheckSeqTol, Integer rcfMaxTol,
			String rcfModUserid, Date rcfModDate, String rcfModPgm,
			String rcfUser1, String rcfUser2, String rcfQadc01,
			String rcfQadc02, Double rcfQadd01, Double rcfQadd02,
			Integer rcfQadi01, Integer rcfQadi02, Boolean rcfQadl01,
			Boolean rcfQadl02, Boolean rcfQadl03, Boolean rcfQadl04,
			Date rcfQadt01, Date rcfQadt02, Double oidRcfCtrl) {
		this.rcfQadi03 = rcfQadi03;
		this.rcfActive = rcfActive;
		this.rcfIncInRss = rcfIncInRss;
		this.rcfSchDefault = rcfSchDefault;
		this.rcfPackingOrder = rcfPackingOrder;
		this.rcfShipperPrint = rcfShipperPrint;
		this.rcfInvoicePrint = rcfInvoicePrint;
		this.rcfAsnEdi = rcfAsnEdi;
		this.rcfInvoiceEdi = rcfInvoiceEdi;
		this.rcfFirmSeqDays = rcfFirmSeqDays;
		this.rcfSeqPerContainer = rcfSeqPerContainer;
		this.rcfMergeSeq = rcfMergeSeq;
		this.rcfCheckSeqTol = rcfCheckSeqTol;
		this.rcfMaxTol = rcfMaxTol;
		this.rcfModUserid = rcfModUserid;
		this.rcfModDate = rcfModDate;
		this.rcfModPgm = rcfModPgm;
		this.rcfUser1 = rcfUser1;
		this.rcfUser2 = rcfUser2;
		this.rcfQadc01 = rcfQadc01;
		this.rcfQadc02 = rcfQadc02;
		this.rcfQadd01 = rcfQadd01;
		this.rcfQadd02 = rcfQadd02;
		this.rcfQadi01 = rcfQadi01;
		this.rcfQadi02 = rcfQadi02;
		this.rcfQadl01 = rcfQadl01;
		this.rcfQadl02 = rcfQadl02;
		this.rcfQadl03 = rcfQadl03;
		this.rcfQadl04 = rcfQadl04;
		this.rcfQadt01 = rcfQadt01;
		this.rcfQadt02 = rcfQadt02;
		this.oidRcfCtrl = oidRcfCtrl;
	}

	// Property accessors

	public String getRcfDomain() {
		return this.rcfDomain;
	}

	public void setRcfDomain(String rcfDomain) {
		this.rcfDomain = rcfDomain;
	}

	public Integer getRcfQadi03() {
		return this.rcfQadi03;
	}

	public void setRcfQadi03(Integer rcfQadi03) {
		this.rcfQadi03 = rcfQadi03;
	}

	public Boolean getRcfActive() {
		return this.rcfActive;
	}

	public void setRcfActive(Boolean rcfActive) {
		this.rcfActive = rcfActive;
	}

	public Boolean getRcfIncInRss() {
		return this.rcfIncInRss;
	}

	public void setRcfIncInRss(Boolean rcfIncInRss) {
		this.rcfIncInRss = rcfIncInRss;
	}

	public Boolean getRcfSchDefault() {
		return this.rcfSchDefault;
	}

	public void setRcfSchDefault(Boolean rcfSchDefault) {
		this.rcfSchDefault = rcfSchDefault;
	}

	public Boolean getRcfPackingOrder() {
		return this.rcfPackingOrder;
	}

	public void setRcfPackingOrder(Boolean rcfPackingOrder) {
		this.rcfPackingOrder = rcfPackingOrder;
	}

	public Boolean getRcfShipperPrint() {
		return this.rcfShipperPrint;
	}

	public void setRcfShipperPrint(Boolean rcfShipperPrint) {
		this.rcfShipperPrint = rcfShipperPrint;
	}

	public Boolean getRcfInvoicePrint() {
		return this.rcfInvoicePrint;
	}

	public void setRcfInvoicePrint(Boolean rcfInvoicePrint) {
		this.rcfInvoicePrint = rcfInvoicePrint;
	}

	public Boolean getRcfAsnEdi() {
		return this.rcfAsnEdi;
	}

	public void setRcfAsnEdi(Boolean rcfAsnEdi) {
		this.rcfAsnEdi = rcfAsnEdi;
	}

	public Boolean getRcfInvoiceEdi() {
		return this.rcfInvoiceEdi;
	}

	public void setRcfInvoiceEdi(Boolean rcfInvoiceEdi) {
		this.rcfInvoiceEdi = rcfInvoiceEdi;
	}

	public Integer getRcfFirmSeqDays() {
		return this.rcfFirmSeqDays;
	}

	public void setRcfFirmSeqDays(Integer rcfFirmSeqDays) {
		this.rcfFirmSeqDays = rcfFirmSeqDays;
	}

	public Integer getRcfSeqPerContainer() {
		return this.rcfSeqPerContainer;
	}

	public void setRcfSeqPerContainer(Integer rcfSeqPerContainer) {
		this.rcfSeqPerContainer = rcfSeqPerContainer;
	}

	public Boolean getRcfMergeSeq() {
		return this.rcfMergeSeq;
	}

	public void setRcfMergeSeq(Boolean rcfMergeSeq) {
		this.rcfMergeSeq = rcfMergeSeq;
	}

	public Boolean getRcfCheckSeqTol() {
		return this.rcfCheckSeqTol;
	}

	public void setRcfCheckSeqTol(Boolean rcfCheckSeqTol) {
		this.rcfCheckSeqTol = rcfCheckSeqTol;
	}

	public Integer getRcfMaxTol() {
		return this.rcfMaxTol;
	}

	public void setRcfMaxTol(Integer rcfMaxTol) {
		this.rcfMaxTol = rcfMaxTol;
	}

	public String getRcfModUserid() {
		return this.rcfModUserid;
	}

	public void setRcfModUserid(String rcfModUserid) {
		this.rcfModUserid = rcfModUserid;
	}

	public Date getRcfModDate() {
		return this.rcfModDate;
	}

	public void setRcfModDate(Date rcfModDate) {
		this.rcfModDate = rcfModDate;
	}

	public String getRcfModPgm() {
		return this.rcfModPgm;
	}

	public void setRcfModPgm(String rcfModPgm) {
		this.rcfModPgm = rcfModPgm;
	}

	public String getRcfUser1() {
		return this.rcfUser1;
	}

	public void setRcfUser1(String rcfUser1) {
		this.rcfUser1 = rcfUser1;
	}

	public String getRcfUser2() {
		return this.rcfUser2;
	}

	public void setRcfUser2(String rcfUser2) {
		this.rcfUser2 = rcfUser2;
	}

	public String getRcfQadc01() {
		return this.rcfQadc01;
	}

	public void setRcfQadc01(String rcfQadc01) {
		this.rcfQadc01 = rcfQadc01;
	}

	public String getRcfQadc02() {
		return this.rcfQadc02;
	}

	public void setRcfQadc02(String rcfQadc02) {
		this.rcfQadc02 = rcfQadc02;
	}

	public Double getRcfQadd01() {
		return this.rcfQadd01;
	}

	public void setRcfQadd01(Double rcfQadd01) {
		this.rcfQadd01 = rcfQadd01;
	}

	public Double getRcfQadd02() {
		return this.rcfQadd02;
	}

	public void setRcfQadd02(Double rcfQadd02) {
		this.rcfQadd02 = rcfQadd02;
	}

	public Integer getRcfQadi01() {
		return this.rcfQadi01;
	}

	public void setRcfQadi01(Integer rcfQadi01) {
		this.rcfQadi01 = rcfQadi01;
	}

	public Integer getRcfQadi02() {
		return this.rcfQadi02;
	}

	public void setRcfQadi02(Integer rcfQadi02) {
		this.rcfQadi02 = rcfQadi02;
	}

	public Boolean getRcfQadl01() {
		return this.rcfQadl01;
	}

	public void setRcfQadl01(Boolean rcfQadl01) {
		this.rcfQadl01 = rcfQadl01;
	}

	public Boolean getRcfQadl02() {
		return this.rcfQadl02;
	}

	public void setRcfQadl02(Boolean rcfQadl02) {
		this.rcfQadl02 = rcfQadl02;
	}

	public Boolean getRcfQadl03() {
		return this.rcfQadl03;
	}

	public void setRcfQadl03(Boolean rcfQadl03) {
		this.rcfQadl03 = rcfQadl03;
	}

	public Boolean getRcfQadl04() {
		return this.rcfQadl04;
	}

	public void setRcfQadl04(Boolean rcfQadl04) {
		this.rcfQadl04 = rcfQadl04;
	}

	public Date getRcfQadt01() {
		return this.rcfQadt01;
	}

	public void setRcfQadt01(Date rcfQadt01) {
		this.rcfQadt01 = rcfQadt01;
	}

	public Date getRcfQadt02() {
		return this.rcfQadt02;
	}

	public void setRcfQadt02(Date rcfQadt02) {
		this.rcfQadt02 = rcfQadt02;
	}

	public Double getOidRcfCtrl() {
		return this.oidRcfCtrl;
	}

	public void setOidRcfCtrl(Double oidRcfCtrl) {
		this.oidRcfCtrl = oidRcfCtrl;
	}

}