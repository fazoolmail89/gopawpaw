package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRccMstr entity provides the base persistence definition of the
 * RccMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRccMstr implements java.io.Serializable {

	// Fields

	private RccMstrId id;
	private Boolean rccIncInRss;
	private Boolean rccPackingOrder;
	private Boolean rccShipperPrint;
	private Boolean rccInvoicePrint;
	private Boolean rccAsnEdi;
	private Boolean rccInvoiceEdi;
	private Integer rccFirmSeqDays;
	private Integer rccSeqPerContainer;
	private Boolean rccMergeSeq;
	private Boolean rccCheckSeqTol;
	private Integer rccMaxTol;
	private String rccModUserid;
	private Date rccModDate;
	private String rccModPgm;
	private String rccUser1;
	private String rccUser2;
	private String rccQadc01;
	private String rccQadc02;
	private Double rccQadd01;
	private Double rccQadd02;
	private Integer rccQadi01;
	private Integer rccQadi02;
	private Boolean rccQadl01;
	private Boolean rccQadl02;
	private Boolean rccQadl03;
	private Boolean rccQadl04;
	private Date rccQadt01;
	private Date rccQadt02;
	private Double oidRccMstr;

	// Constructors

	/** default constructor */
	public AbstractRccMstr() {
	}

	/** minimal constructor */
	public AbstractRccMstr(RccMstrId id, Double oidRccMstr) {
		this.id = id;
		this.oidRccMstr = oidRccMstr;
	}

	/** full constructor */
	public AbstractRccMstr(RccMstrId id, Boolean rccIncInRss,
			Boolean rccPackingOrder, Boolean rccShipperPrint,
			Boolean rccInvoicePrint, Boolean rccAsnEdi, Boolean rccInvoiceEdi,
			Integer rccFirmSeqDays, Integer rccSeqPerContainer,
			Boolean rccMergeSeq, Boolean rccCheckSeqTol, Integer rccMaxTol,
			String rccModUserid, Date rccModDate, String rccModPgm,
			String rccUser1, String rccUser2, String rccQadc01,
			String rccQadc02, Double rccQadd01, Double rccQadd02,
			Integer rccQadi01, Integer rccQadi02, Boolean rccQadl01,
			Boolean rccQadl02, Boolean rccQadl03, Boolean rccQadl04,
			Date rccQadt01, Date rccQadt02, Double oidRccMstr) {
		this.id = id;
		this.rccIncInRss = rccIncInRss;
		this.rccPackingOrder = rccPackingOrder;
		this.rccShipperPrint = rccShipperPrint;
		this.rccInvoicePrint = rccInvoicePrint;
		this.rccAsnEdi = rccAsnEdi;
		this.rccInvoiceEdi = rccInvoiceEdi;
		this.rccFirmSeqDays = rccFirmSeqDays;
		this.rccSeqPerContainer = rccSeqPerContainer;
		this.rccMergeSeq = rccMergeSeq;
		this.rccCheckSeqTol = rccCheckSeqTol;
		this.rccMaxTol = rccMaxTol;
		this.rccModUserid = rccModUserid;
		this.rccModDate = rccModDate;
		this.rccModPgm = rccModPgm;
		this.rccUser1 = rccUser1;
		this.rccUser2 = rccUser2;
		this.rccQadc01 = rccQadc01;
		this.rccQadc02 = rccQadc02;
		this.rccQadd01 = rccQadd01;
		this.rccQadd02 = rccQadd02;
		this.rccQadi01 = rccQadi01;
		this.rccQadi02 = rccQadi02;
		this.rccQadl01 = rccQadl01;
		this.rccQadl02 = rccQadl02;
		this.rccQadl03 = rccQadl03;
		this.rccQadl04 = rccQadl04;
		this.rccQadt01 = rccQadt01;
		this.rccQadt02 = rccQadt02;
		this.oidRccMstr = oidRccMstr;
	}

	// Property accessors

	public RccMstrId getId() {
		return this.id;
	}

	public void setId(RccMstrId id) {
		this.id = id;
	}

	public Boolean getRccIncInRss() {
		return this.rccIncInRss;
	}

	public void setRccIncInRss(Boolean rccIncInRss) {
		this.rccIncInRss = rccIncInRss;
	}

	public Boolean getRccPackingOrder() {
		return this.rccPackingOrder;
	}

	public void setRccPackingOrder(Boolean rccPackingOrder) {
		this.rccPackingOrder = rccPackingOrder;
	}

	public Boolean getRccShipperPrint() {
		return this.rccShipperPrint;
	}

	public void setRccShipperPrint(Boolean rccShipperPrint) {
		this.rccShipperPrint = rccShipperPrint;
	}

	public Boolean getRccInvoicePrint() {
		return this.rccInvoicePrint;
	}

	public void setRccInvoicePrint(Boolean rccInvoicePrint) {
		this.rccInvoicePrint = rccInvoicePrint;
	}

	public Boolean getRccAsnEdi() {
		return this.rccAsnEdi;
	}

	public void setRccAsnEdi(Boolean rccAsnEdi) {
		this.rccAsnEdi = rccAsnEdi;
	}

	public Boolean getRccInvoiceEdi() {
		return this.rccInvoiceEdi;
	}

	public void setRccInvoiceEdi(Boolean rccInvoiceEdi) {
		this.rccInvoiceEdi = rccInvoiceEdi;
	}

	public Integer getRccFirmSeqDays() {
		return this.rccFirmSeqDays;
	}

	public void setRccFirmSeqDays(Integer rccFirmSeqDays) {
		this.rccFirmSeqDays = rccFirmSeqDays;
	}

	public Integer getRccSeqPerContainer() {
		return this.rccSeqPerContainer;
	}

	public void setRccSeqPerContainer(Integer rccSeqPerContainer) {
		this.rccSeqPerContainer = rccSeqPerContainer;
	}

	public Boolean getRccMergeSeq() {
		return this.rccMergeSeq;
	}

	public void setRccMergeSeq(Boolean rccMergeSeq) {
		this.rccMergeSeq = rccMergeSeq;
	}

	public Boolean getRccCheckSeqTol() {
		return this.rccCheckSeqTol;
	}

	public void setRccCheckSeqTol(Boolean rccCheckSeqTol) {
		this.rccCheckSeqTol = rccCheckSeqTol;
	}

	public Integer getRccMaxTol() {
		return this.rccMaxTol;
	}

	public void setRccMaxTol(Integer rccMaxTol) {
		this.rccMaxTol = rccMaxTol;
	}

	public String getRccModUserid() {
		return this.rccModUserid;
	}

	public void setRccModUserid(String rccModUserid) {
		this.rccModUserid = rccModUserid;
	}

	public Date getRccModDate() {
		return this.rccModDate;
	}

	public void setRccModDate(Date rccModDate) {
		this.rccModDate = rccModDate;
	}

	public String getRccModPgm() {
		return this.rccModPgm;
	}

	public void setRccModPgm(String rccModPgm) {
		this.rccModPgm = rccModPgm;
	}

	public String getRccUser1() {
		return this.rccUser1;
	}

	public void setRccUser1(String rccUser1) {
		this.rccUser1 = rccUser1;
	}

	public String getRccUser2() {
		return this.rccUser2;
	}

	public void setRccUser2(String rccUser2) {
		this.rccUser2 = rccUser2;
	}

	public String getRccQadc01() {
		return this.rccQadc01;
	}

	public void setRccQadc01(String rccQadc01) {
		this.rccQadc01 = rccQadc01;
	}

	public String getRccQadc02() {
		return this.rccQadc02;
	}

	public void setRccQadc02(String rccQadc02) {
		this.rccQadc02 = rccQadc02;
	}

	public Double getRccQadd01() {
		return this.rccQadd01;
	}

	public void setRccQadd01(Double rccQadd01) {
		this.rccQadd01 = rccQadd01;
	}

	public Double getRccQadd02() {
		return this.rccQadd02;
	}

	public void setRccQadd02(Double rccQadd02) {
		this.rccQadd02 = rccQadd02;
	}

	public Integer getRccQadi01() {
		return this.rccQadi01;
	}

	public void setRccQadi01(Integer rccQadi01) {
		this.rccQadi01 = rccQadi01;
	}

	public Integer getRccQadi02() {
		return this.rccQadi02;
	}

	public void setRccQadi02(Integer rccQadi02) {
		this.rccQadi02 = rccQadi02;
	}

	public Boolean getRccQadl01() {
		return this.rccQadl01;
	}

	public void setRccQadl01(Boolean rccQadl01) {
		this.rccQadl01 = rccQadl01;
	}

	public Boolean getRccQadl02() {
		return this.rccQadl02;
	}

	public void setRccQadl02(Boolean rccQadl02) {
		this.rccQadl02 = rccQadl02;
	}

	public Boolean getRccQadl03() {
		return this.rccQadl03;
	}

	public void setRccQadl03(Boolean rccQadl03) {
		this.rccQadl03 = rccQadl03;
	}

	public Boolean getRccQadl04() {
		return this.rccQadl04;
	}

	public void setRccQadl04(Boolean rccQadl04) {
		this.rccQadl04 = rccQadl04;
	}

	public Date getRccQadt01() {
		return this.rccQadt01;
	}

	public void setRccQadt01(Date rccQadt01) {
		this.rccQadt01 = rccQadt01;
	}

	public Date getRccQadt02() {
		return this.rccQadt02;
	}

	public void setRccQadt02(Date rccQadt02) {
		this.rccQadt02 = rccQadt02;
	}

	public Double getOidRccMstr() {
		return this.oidRccMstr;
	}

	public void setOidRccMstr(Double oidRccMstr) {
		this.oidRccMstr = oidRccMstr;
	}

}