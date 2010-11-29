package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCncuMstr entity provides the base persistence definition of the
 * CncuMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCncuMstr implements java.io.Serializable {

	// Fields

	private CncuMstrId id;
	private Integer cncuBatch;
	private Date cncuTransDate;
	private Date cncuEffDate;
	private String cncuCustUsageRef;
	private Date cncuCustUsageDate;
	private String cncuSoNbr;
	private Integer cncuSodLine;
	private String cncuSite;
	private String cncuShipto;
	private String cncuCust;
	private String cncuPart;
	private String cncuCustpart;
	private Double cncuUsageQty;
	private String cncuUsageUm;
	private Double cncuUsageUmConv;
	private Double cncuUsageSoUmConv;
	private Double cncuCumQty;
	private String cncuPo;
	private String cncuLotser;
	private String cncuRef;
	private String cncuAuth;
	private String cncuSelfbillAuth;
	private String cncuCustJob;
	private String cncuCustSeq;
	private String cncuCustRef;
	private String cncuModelyr;
	private Integer cncuTrnbr;
	private String cncuInvoice;
	private String cncuOrigin;
	private Double cncuManualQty;
	private String cncuModUserid;
	private Date cncuModDate;
	private String cncuUser1;
	private String cncuUser2;
	private String cncuQadc01;
	private String cncuQadc02;
	private Double oidCncuMstr;

	// Constructors

	/** default constructor */
	public AbstractCncuMstr() {
	}

	/** minimal constructor */
	public AbstractCncuMstr(CncuMstrId id, Integer cncuBatch,
			Date cncuTransDate, Date cncuEffDate, String cncuCustUsageRef,
			String cncuSoNbr, Integer cncuSodLine, String cncuSite,
			String cncuShipto, String cncuCust, String cncuPart,
			String cncuCustpart, Double cncuUsageQty, String cncuUsageUm,
			Double cncuUsageUmConv, Double cncuUsageSoUmConv,
			Double cncuCumQty, String cncuPo, String cncuLotser,
			String cncuRef, String cncuAuth, String cncuSelfbillAuth,
			String cncuCustJob, String cncuCustSeq, String cncuCustRef,
			String cncuModelyr, Integer cncuTrnbr, String cncuInvoice,
			String cncuOrigin, Double cncuManualQty, String cncuModUserid,
			Date cncuModDate, String cncuUser1, String cncuUser2,
			String cncuQadc01, String cncuQadc02, Double oidCncuMstr) {
		this.id = id;
		this.cncuBatch = cncuBatch;
		this.cncuTransDate = cncuTransDate;
		this.cncuEffDate = cncuEffDate;
		this.cncuCustUsageRef = cncuCustUsageRef;
		this.cncuSoNbr = cncuSoNbr;
		this.cncuSodLine = cncuSodLine;
		this.cncuSite = cncuSite;
		this.cncuShipto = cncuShipto;
		this.cncuCust = cncuCust;
		this.cncuPart = cncuPart;
		this.cncuCustpart = cncuCustpart;
		this.cncuUsageQty = cncuUsageQty;
		this.cncuUsageUm = cncuUsageUm;
		this.cncuUsageUmConv = cncuUsageUmConv;
		this.cncuUsageSoUmConv = cncuUsageSoUmConv;
		this.cncuCumQty = cncuCumQty;
		this.cncuPo = cncuPo;
		this.cncuLotser = cncuLotser;
		this.cncuRef = cncuRef;
		this.cncuAuth = cncuAuth;
		this.cncuSelfbillAuth = cncuSelfbillAuth;
		this.cncuCustJob = cncuCustJob;
		this.cncuCustSeq = cncuCustSeq;
		this.cncuCustRef = cncuCustRef;
		this.cncuModelyr = cncuModelyr;
		this.cncuTrnbr = cncuTrnbr;
		this.cncuInvoice = cncuInvoice;
		this.cncuOrigin = cncuOrigin;
		this.cncuManualQty = cncuManualQty;
		this.cncuModUserid = cncuModUserid;
		this.cncuModDate = cncuModDate;
		this.cncuUser1 = cncuUser1;
		this.cncuUser2 = cncuUser2;
		this.cncuQadc01 = cncuQadc01;
		this.cncuQadc02 = cncuQadc02;
		this.oidCncuMstr = oidCncuMstr;
	}

	/** full constructor */
	public AbstractCncuMstr(CncuMstrId id, Integer cncuBatch,
			Date cncuTransDate, Date cncuEffDate, String cncuCustUsageRef,
			Date cncuCustUsageDate, String cncuSoNbr, Integer cncuSodLine,
			String cncuSite, String cncuShipto, String cncuCust,
			String cncuPart, String cncuCustpart, Double cncuUsageQty,
			String cncuUsageUm, Double cncuUsageUmConv,
			Double cncuUsageSoUmConv, Double cncuCumQty, String cncuPo,
			String cncuLotser, String cncuRef, String cncuAuth,
			String cncuSelfbillAuth, String cncuCustJob, String cncuCustSeq,
			String cncuCustRef, String cncuModelyr, Integer cncuTrnbr,
			String cncuInvoice, String cncuOrigin, Double cncuManualQty,
			String cncuModUserid, Date cncuModDate, String cncuUser1,
			String cncuUser2, String cncuQadc01, String cncuQadc02,
			Double oidCncuMstr) {
		this.id = id;
		this.cncuBatch = cncuBatch;
		this.cncuTransDate = cncuTransDate;
		this.cncuEffDate = cncuEffDate;
		this.cncuCustUsageRef = cncuCustUsageRef;
		this.cncuCustUsageDate = cncuCustUsageDate;
		this.cncuSoNbr = cncuSoNbr;
		this.cncuSodLine = cncuSodLine;
		this.cncuSite = cncuSite;
		this.cncuShipto = cncuShipto;
		this.cncuCust = cncuCust;
		this.cncuPart = cncuPart;
		this.cncuCustpart = cncuCustpart;
		this.cncuUsageQty = cncuUsageQty;
		this.cncuUsageUm = cncuUsageUm;
		this.cncuUsageUmConv = cncuUsageUmConv;
		this.cncuUsageSoUmConv = cncuUsageSoUmConv;
		this.cncuCumQty = cncuCumQty;
		this.cncuPo = cncuPo;
		this.cncuLotser = cncuLotser;
		this.cncuRef = cncuRef;
		this.cncuAuth = cncuAuth;
		this.cncuSelfbillAuth = cncuSelfbillAuth;
		this.cncuCustJob = cncuCustJob;
		this.cncuCustSeq = cncuCustSeq;
		this.cncuCustRef = cncuCustRef;
		this.cncuModelyr = cncuModelyr;
		this.cncuTrnbr = cncuTrnbr;
		this.cncuInvoice = cncuInvoice;
		this.cncuOrigin = cncuOrigin;
		this.cncuManualQty = cncuManualQty;
		this.cncuModUserid = cncuModUserid;
		this.cncuModDate = cncuModDate;
		this.cncuUser1 = cncuUser1;
		this.cncuUser2 = cncuUser2;
		this.cncuQadc01 = cncuQadc01;
		this.cncuQadc02 = cncuQadc02;
		this.oidCncuMstr = oidCncuMstr;
	}

	// Property accessors

	public CncuMstrId getId() {
		return this.id;
	}

	public void setId(CncuMstrId id) {
		this.id = id;
	}

	public Integer getCncuBatch() {
		return this.cncuBatch;
	}

	public void setCncuBatch(Integer cncuBatch) {
		this.cncuBatch = cncuBatch;
	}

	public Date getCncuTransDate() {
		return this.cncuTransDate;
	}

	public void setCncuTransDate(Date cncuTransDate) {
		this.cncuTransDate = cncuTransDate;
	}

	public Date getCncuEffDate() {
		return this.cncuEffDate;
	}

	public void setCncuEffDate(Date cncuEffDate) {
		this.cncuEffDate = cncuEffDate;
	}

	public String getCncuCustUsageRef() {
		return this.cncuCustUsageRef;
	}

	public void setCncuCustUsageRef(String cncuCustUsageRef) {
		this.cncuCustUsageRef = cncuCustUsageRef;
	}

	public Date getCncuCustUsageDate() {
		return this.cncuCustUsageDate;
	}

	public void setCncuCustUsageDate(Date cncuCustUsageDate) {
		this.cncuCustUsageDate = cncuCustUsageDate;
	}

	public String getCncuSoNbr() {
		return this.cncuSoNbr;
	}

	public void setCncuSoNbr(String cncuSoNbr) {
		this.cncuSoNbr = cncuSoNbr;
	}

	public Integer getCncuSodLine() {
		return this.cncuSodLine;
	}

	public void setCncuSodLine(Integer cncuSodLine) {
		this.cncuSodLine = cncuSodLine;
	}

	public String getCncuSite() {
		return this.cncuSite;
	}

	public void setCncuSite(String cncuSite) {
		this.cncuSite = cncuSite;
	}

	public String getCncuShipto() {
		return this.cncuShipto;
	}

	public void setCncuShipto(String cncuShipto) {
		this.cncuShipto = cncuShipto;
	}

	public String getCncuCust() {
		return this.cncuCust;
	}

	public void setCncuCust(String cncuCust) {
		this.cncuCust = cncuCust;
	}

	public String getCncuPart() {
		return this.cncuPart;
	}

	public void setCncuPart(String cncuPart) {
		this.cncuPart = cncuPart;
	}

	public String getCncuCustpart() {
		return this.cncuCustpart;
	}

	public void setCncuCustpart(String cncuCustpart) {
		this.cncuCustpart = cncuCustpart;
	}

	public Double getCncuUsageQty() {
		return this.cncuUsageQty;
	}

	public void setCncuUsageQty(Double cncuUsageQty) {
		this.cncuUsageQty = cncuUsageQty;
	}

	public String getCncuUsageUm() {
		return this.cncuUsageUm;
	}

	public void setCncuUsageUm(String cncuUsageUm) {
		this.cncuUsageUm = cncuUsageUm;
	}

	public Double getCncuUsageUmConv() {
		return this.cncuUsageUmConv;
	}

	public void setCncuUsageUmConv(Double cncuUsageUmConv) {
		this.cncuUsageUmConv = cncuUsageUmConv;
	}

	public Double getCncuUsageSoUmConv() {
		return this.cncuUsageSoUmConv;
	}

	public void setCncuUsageSoUmConv(Double cncuUsageSoUmConv) {
		this.cncuUsageSoUmConv = cncuUsageSoUmConv;
	}

	public Double getCncuCumQty() {
		return this.cncuCumQty;
	}

	public void setCncuCumQty(Double cncuCumQty) {
		this.cncuCumQty = cncuCumQty;
	}

	public String getCncuPo() {
		return this.cncuPo;
	}

	public void setCncuPo(String cncuPo) {
		this.cncuPo = cncuPo;
	}

	public String getCncuLotser() {
		return this.cncuLotser;
	}

	public void setCncuLotser(String cncuLotser) {
		this.cncuLotser = cncuLotser;
	}

	public String getCncuRef() {
		return this.cncuRef;
	}

	public void setCncuRef(String cncuRef) {
		this.cncuRef = cncuRef;
	}

	public String getCncuAuth() {
		return this.cncuAuth;
	}

	public void setCncuAuth(String cncuAuth) {
		this.cncuAuth = cncuAuth;
	}

	public String getCncuSelfbillAuth() {
		return this.cncuSelfbillAuth;
	}

	public void setCncuSelfbillAuth(String cncuSelfbillAuth) {
		this.cncuSelfbillAuth = cncuSelfbillAuth;
	}

	public String getCncuCustJob() {
		return this.cncuCustJob;
	}

	public void setCncuCustJob(String cncuCustJob) {
		this.cncuCustJob = cncuCustJob;
	}

	public String getCncuCustSeq() {
		return this.cncuCustSeq;
	}

	public void setCncuCustSeq(String cncuCustSeq) {
		this.cncuCustSeq = cncuCustSeq;
	}

	public String getCncuCustRef() {
		return this.cncuCustRef;
	}

	public void setCncuCustRef(String cncuCustRef) {
		this.cncuCustRef = cncuCustRef;
	}

	public String getCncuModelyr() {
		return this.cncuModelyr;
	}

	public void setCncuModelyr(String cncuModelyr) {
		this.cncuModelyr = cncuModelyr;
	}

	public Integer getCncuTrnbr() {
		return this.cncuTrnbr;
	}

	public void setCncuTrnbr(Integer cncuTrnbr) {
		this.cncuTrnbr = cncuTrnbr;
	}

	public String getCncuInvoice() {
		return this.cncuInvoice;
	}

	public void setCncuInvoice(String cncuInvoice) {
		this.cncuInvoice = cncuInvoice;
	}

	public String getCncuOrigin() {
		return this.cncuOrigin;
	}

	public void setCncuOrigin(String cncuOrigin) {
		this.cncuOrigin = cncuOrigin;
	}

	public Double getCncuManualQty() {
		return this.cncuManualQty;
	}

	public void setCncuManualQty(Double cncuManualQty) {
		this.cncuManualQty = cncuManualQty;
	}

	public String getCncuModUserid() {
		return this.cncuModUserid;
	}

	public void setCncuModUserid(String cncuModUserid) {
		this.cncuModUserid = cncuModUserid;
	}

	public Date getCncuModDate() {
		return this.cncuModDate;
	}

	public void setCncuModDate(Date cncuModDate) {
		this.cncuModDate = cncuModDate;
	}

	public String getCncuUser1() {
		return this.cncuUser1;
	}

	public void setCncuUser1(String cncuUser1) {
		this.cncuUser1 = cncuUser1;
	}

	public String getCncuUser2() {
		return this.cncuUser2;
	}

	public void setCncuUser2(String cncuUser2) {
		this.cncuUser2 = cncuUser2;
	}

	public String getCncuQadc01() {
		return this.cncuQadc01;
	}

	public void setCncuQadc01(String cncuQadc01) {
		this.cncuQadc01 = cncuQadc01;
	}

	public String getCncuQadc02() {
		return this.cncuQadc02;
	}

	public void setCncuQadc02(String cncuQadc02) {
		this.cncuQadc02 = cncuQadc02;
	}

	public Double getOidCncuMstr() {
		return this.oidCncuMstr;
	}

	public void setOidCncuMstr(Double oidCncuMstr) {
		this.oidCncuMstr = oidCncuMstr;
	}

}