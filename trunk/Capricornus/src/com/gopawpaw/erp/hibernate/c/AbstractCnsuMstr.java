package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCnsuMstr entity provides the base persistence definition of the
 * CnsuMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCnsuMstr implements java.io.Serializable {

	// Fields

	private CnsuMstrId id;
	private Integer cnsuBatch;
	private Date cnsuTransDate;
	private Date cnsuEffDate;
	private String cnsuPoNbr;
	private Integer cnsuPodLine;
	private String cnsuSite;
	private String cnsuPart;
	private Double cnsuQtyUsed;
	private Double cnsuCumQty;
	private String cnsuLotser;
	private String cnsuRef;
	private Integer cnsuTrnbr;
	private Boolean cnsuPrintFlag;
	private Boolean cnsuExportFlag;
	private String cnsuModUserid;
	private Date cnsuModDate;
	private String cnsuUser1;
	private String cnsuUser2;
	private String cnsuQadc01;
	private String cnsuQadc02;
	private String cnsuEdiBatch;
	private Double oidCnsuMstr;

	// Constructors

	/** default constructor */
	public AbstractCnsuMstr() {
	}

	/** full constructor */
	public AbstractCnsuMstr(CnsuMstrId id, Integer cnsuBatch,
			Date cnsuTransDate, Date cnsuEffDate, String cnsuPoNbr,
			Integer cnsuPodLine, String cnsuSite, String cnsuPart,
			Double cnsuQtyUsed, Double cnsuCumQty, String cnsuLotser,
			String cnsuRef, Integer cnsuTrnbr, Boolean cnsuPrintFlag,
			Boolean cnsuExportFlag, String cnsuModUserid, Date cnsuModDate,
			String cnsuUser1, String cnsuUser2, String cnsuQadc01,
			String cnsuQadc02, String cnsuEdiBatch, Double oidCnsuMstr) {
		this.id = id;
		this.cnsuBatch = cnsuBatch;
		this.cnsuTransDate = cnsuTransDate;
		this.cnsuEffDate = cnsuEffDate;
		this.cnsuPoNbr = cnsuPoNbr;
		this.cnsuPodLine = cnsuPodLine;
		this.cnsuSite = cnsuSite;
		this.cnsuPart = cnsuPart;
		this.cnsuQtyUsed = cnsuQtyUsed;
		this.cnsuCumQty = cnsuCumQty;
		this.cnsuLotser = cnsuLotser;
		this.cnsuRef = cnsuRef;
		this.cnsuTrnbr = cnsuTrnbr;
		this.cnsuPrintFlag = cnsuPrintFlag;
		this.cnsuExportFlag = cnsuExportFlag;
		this.cnsuModUserid = cnsuModUserid;
		this.cnsuModDate = cnsuModDate;
		this.cnsuUser1 = cnsuUser1;
		this.cnsuUser2 = cnsuUser2;
		this.cnsuQadc01 = cnsuQadc01;
		this.cnsuQadc02 = cnsuQadc02;
		this.cnsuEdiBatch = cnsuEdiBatch;
		this.oidCnsuMstr = oidCnsuMstr;
	}

	// Property accessors

	public CnsuMstrId getId() {
		return this.id;
	}

	public void setId(CnsuMstrId id) {
		this.id = id;
	}

	public Integer getCnsuBatch() {
		return this.cnsuBatch;
	}

	public void setCnsuBatch(Integer cnsuBatch) {
		this.cnsuBatch = cnsuBatch;
	}

	public Date getCnsuTransDate() {
		return this.cnsuTransDate;
	}

	public void setCnsuTransDate(Date cnsuTransDate) {
		this.cnsuTransDate = cnsuTransDate;
	}

	public Date getCnsuEffDate() {
		return this.cnsuEffDate;
	}

	public void setCnsuEffDate(Date cnsuEffDate) {
		this.cnsuEffDate = cnsuEffDate;
	}

	public String getCnsuPoNbr() {
		return this.cnsuPoNbr;
	}

	public void setCnsuPoNbr(String cnsuPoNbr) {
		this.cnsuPoNbr = cnsuPoNbr;
	}

	public Integer getCnsuPodLine() {
		return this.cnsuPodLine;
	}

	public void setCnsuPodLine(Integer cnsuPodLine) {
		this.cnsuPodLine = cnsuPodLine;
	}

	public String getCnsuSite() {
		return this.cnsuSite;
	}

	public void setCnsuSite(String cnsuSite) {
		this.cnsuSite = cnsuSite;
	}

	public String getCnsuPart() {
		return this.cnsuPart;
	}

	public void setCnsuPart(String cnsuPart) {
		this.cnsuPart = cnsuPart;
	}

	public Double getCnsuQtyUsed() {
		return this.cnsuQtyUsed;
	}

	public void setCnsuQtyUsed(Double cnsuQtyUsed) {
		this.cnsuQtyUsed = cnsuQtyUsed;
	}

	public Double getCnsuCumQty() {
		return this.cnsuCumQty;
	}

	public void setCnsuCumQty(Double cnsuCumQty) {
		this.cnsuCumQty = cnsuCumQty;
	}

	public String getCnsuLotser() {
		return this.cnsuLotser;
	}

	public void setCnsuLotser(String cnsuLotser) {
		this.cnsuLotser = cnsuLotser;
	}

	public String getCnsuRef() {
		return this.cnsuRef;
	}

	public void setCnsuRef(String cnsuRef) {
		this.cnsuRef = cnsuRef;
	}

	public Integer getCnsuTrnbr() {
		return this.cnsuTrnbr;
	}

	public void setCnsuTrnbr(Integer cnsuTrnbr) {
		this.cnsuTrnbr = cnsuTrnbr;
	}

	public Boolean getCnsuPrintFlag() {
		return this.cnsuPrintFlag;
	}

	public void setCnsuPrintFlag(Boolean cnsuPrintFlag) {
		this.cnsuPrintFlag = cnsuPrintFlag;
	}

	public Boolean getCnsuExportFlag() {
		return this.cnsuExportFlag;
	}

	public void setCnsuExportFlag(Boolean cnsuExportFlag) {
		this.cnsuExportFlag = cnsuExportFlag;
	}

	public String getCnsuModUserid() {
		return this.cnsuModUserid;
	}

	public void setCnsuModUserid(String cnsuModUserid) {
		this.cnsuModUserid = cnsuModUserid;
	}

	public Date getCnsuModDate() {
		return this.cnsuModDate;
	}

	public void setCnsuModDate(Date cnsuModDate) {
		this.cnsuModDate = cnsuModDate;
	}

	public String getCnsuUser1() {
		return this.cnsuUser1;
	}

	public void setCnsuUser1(String cnsuUser1) {
		this.cnsuUser1 = cnsuUser1;
	}

	public String getCnsuUser2() {
		return this.cnsuUser2;
	}

	public void setCnsuUser2(String cnsuUser2) {
		this.cnsuUser2 = cnsuUser2;
	}

	public String getCnsuQadc01() {
		return this.cnsuQadc01;
	}

	public void setCnsuQadc01(String cnsuQadc01) {
		this.cnsuQadc01 = cnsuQadc01;
	}

	public String getCnsuQadc02() {
		return this.cnsuQadc02;
	}

	public void setCnsuQadc02(String cnsuQadc02) {
		this.cnsuQadc02 = cnsuQadc02;
	}

	public String getCnsuEdiBatch() {
		return this.cnsuEdiBatch;
	}

	public void setCnsuEdiBatch(String cnsuEdiBatch) {
		this.cnsuEdiBatch = cnsuEdiBatch;
	}

	public Double getOidCnsuMstr() {
		return this.oidCnsuMstr;
	}

	public void setOidCnsuMstr(Double oidCnsuMstr) {
		this.oidCnsuMstr = oidCnsuMstr;
	}

}