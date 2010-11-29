package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPliMstr entity provides the base persistence definition of the
 * PliMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPliMstr implements java.io.Serializable {

	// Fields

	private PliMstrId id;
	private String pliInternalRefType;
	private String pliInternalRef;
	private String pliSupplier;
	private String pliInvoice;
	private Double pliInvoiceAmt;
	private String pliCurr;
	private Date pliInvoiceDate;
	private String pliVoRef;
	private Double pliExRate;
	private Double pliExRate2;
	private String pliExRatetype;
	private Integer pliExruSeq;
	private Boolean pliTaxable;
	private String pliTaxc;
	private String pliTaxEnv;
	private Boolean pliTaxIn;
	private String pliTaxUsage;
	private Date pliTaxDate;
	private Date pliModDate;
	private String pliModUserid;
	private String pliUser1;
	private String pliUser2;
	private String pliQadc01;
	private String pliQadc02;
	private Double oidPliMstr;

	// Constructors

	/** default constructor */
	public AbstractPliMstr() {
	}

	/** minimal constructor */
	public AbstractPliMstr(PliMstrId id, String pliInternalRefType,
			String pliInternalRef, String pliSupplier, String pliInvoice,
			Double pliInvoiceAmt, String pliCurr, Date pliInvoiceDate,
			String pliVoRef, Double pliExRate, Double pliExRate2,
			String pliExRatetype, Integer pliExruSeq, Boolean pliTaxable,
			String pliTaxc, String pliTaxEnv, Boolean pliTaxIn,
			String pliTaxUsage, Date pliModDate, String pliModUserid,
			String pliUser1, String pliUser2, String pliQadc01,
			String pliQadc02, Double oidPliMstr) {
		this.id = id;
		this.pliInternalRefType = pliInternalRefType;
		this.pliInternalRef = pliInternalRef;
		this.pliSupplier = pliSupplier;
		this.pliInvoice = pliInvoice;
		this.pliInvoiceAmt = pliInvoiceAmt;
		this.pliCurr = pliCurr;
		this.pliInvoiceDate = pliInvoiceDate;
		this.pliVoRef = pliVoRef;
		this.pliExRate = pliExRate;
		this.pliExRate2 = pliExRate2;
		this.pliExRatetype = pliExRatetype;
		this.pliExruSeq = pliExruSeq;
		this.pliTaxable = pliTaxable;
		this.pliTaxc = pliTaxc;
		this.pliTaxEnv = pliTaxEnv;
		this.pliTaxIn = pliTaxIn;
		this.pliTaxUsage = pliTaxUsage;
		this.pliModDate = pliModDate;
		this.pliModUserid = pliModUserid;
		this.pliUser1 = pliUser1;
		this.pliUser2 = pliUser2;
		this.pliQadc01 = pliQadc01;
		this.pliQadc02 = pliQadc02;
		this.oidPliMstr = oidPliMstr;
	}

	/** full constructor */
	public AbstractPliMstr(PliMstrId id, String pliInternalRefType,
			String pliInternalRef, String pliSupplier, String pliInvoice,
			Double pliInvoiceAmt, String pliCurr, Date pliInvoiceDate,
			String pliVoRef, Double pliExRate, Double pliExRate2,
			String pliExRatetype, Integer pliExruSeq, Boolean pliTaxable,
			String pliTaxc, String pliTaxEnv, Boolean pliTaxIn,
			String pliTaxUsage, Date pliTaxDate, Date pliModDate,
			String pliModUserid, String pliUser1, String pliUser2,
			String pliQadc01, String pliQadc02, Double oidPliMstr) {
		this.id = id;
		this.pliInternalRefType = pliInternalRefType;
		this.pliInternalRef = pliInternalRef;
		this.pliSupplier = pliSupplier;
		this.pliInvoice = pliInvoice;
		this.pliInvoiceAmt = pliInvoiceAmt;
		this.pliCurr = pliCurr;
		this.pliInvoiceDate = pliInvoiceDate;
		this.pliVoRef = pliVoRef;
		this.pliExRate = pliExRate;
		this.pliExRate2 = pliExRate2;
		this.pliExRatetype = pliExRatetype;
		this.pliExruSeq = pliExruSeq;
		this.pliTaxable = pliTaxable;
		this.pliTaxc = pliTaxc;
		this.pliTaxEnv = pliTaxEnv;
		this.pliTaxIn = pliTaxIn;
		this.pliTaxUsage = pliTaxUsage;
		this.pliTaxDate = pliTaxDate;
		this.pliModDate = pliModDate;
		this.pliModUserid = pliModUserid;
		this.pliUser1 = pliUser1;
		this.pliUser2 = pliUser2;
		this.pliQadc01 = pliQadc01;
		this.pliQadc02 = pliQadc02;
		this.oidPliMstr = oidPliMstr;
	}

	// Property accessors

	public PliMstrId getId() {
		return this.id;
	}

	public void setId(PliMstrId id) {
		this.id = id;
	}

	public String getPliInternalRefType() {
		return this.pliInternalRefType;
	}

	public void setPliInternalRefType(String pliInternalRefType) {
		this.pliInternalRefType = pliInternalRefType;
	}

	public String getPliInternalRef() {
		return this.pliInternalRef;
	}

	public void setPliInternalRef(String pliInternalRef) {
		this.pliInternalRef = pliInternalRef;
	}

	public String getPliSupplier() {
		return this.pliSupplier;
	}

	public void setPliSupplier(String pliSupplier) {
		this.pliSupplier = pliSupplier;
	}

	public String getPliInvoice() {
		return this.pliInvoice;
	}

	public void setPliInvoice(String pliInvoice) {
		this.pliInvoice = pliInvoice;
	}

	public Double getPliInvoiceAmt() {
		return this.pliInvoiceAmt;
	}

	public void setPliInvoiceAmt(Double pliInvoiceAmt) {
		this.pliInvoiceAmt = pliInvoiceAmt;
	}

	public String getPliCurr() {
		return this.pliCurr;
	}

	public void setPliCurr(String pliCurr) {
		this.pliCurr = pliCurr;
	}

	public Date getPliInvoiceDate() {
		return this.pliInvoiceDate;
	}

	public void setPliInvoiceDate(Date pliInvoiceDate) {
		this.pliInvoiceDate = pliInvoiceDate;
	}

	public String getPliVoRef() {
		return this.pliVoRef;
	}

	public void setPliVoRef(String pliVoRef) {
		this.pliVoRef = pliVoRef;
	}

	public Double getPliExRate() {
		return this.pliExRate;
	}

	public void setPliExRate(Double pliExRate) {
		this.pliExRate = pliExRate;
	}

	public Double getPliExRate2() {
		return this.pliExRate2;
	}

	public void setPliExRate2(Double pliExRate2) {
		this.pliExRate2 = pliExRate2;
	}

	public String getPliExRatetype() {
		return this.pliExRatetype;
	}

	public void setPliExRatetype(String pliExRatetype) {
		this.pliExRatetype = pliExRatetype;
	}

	public Integer getPliExruSeq() {
		return this.pliExruSeq;
	}

	public void setPliExruSeq(Integer pliExruSeq) {
		this.pliExruSeq = pliExruSeq;
	}

	public Boolean getPliTaxable() {
		return this.pliTaxable;
	}

	public void setPliTaxable(Boolean pliTaxable) {
		this.pliTaxable = pliTaxable;
	}

	public String getPliTaxc() {
		return this.pliTaxc;
	}

	public void setPliTaxc(String pliTaxc) {
		this.pliTaxc = pliTaxc;
	}

	public String getPliTaxEnv() {
		return this.pliTaxEnv;
	}

	public void setPliTaxEnv(String pliTaxEnv) {
		this.pliTaxEnv = pliTaxEnv;
	}

	public Boolean getPliTaxIn() {
		return this.pliTaxIn;
	}

	public void setPliTaxIn(Boolean pliTaxIn) {
		this.pliTaxIn = pliTaxIn;
	}

	public String getPliTaxUsage() {
		return this.pliTaxUsage;
	}

	public void setPliTaxUsage(String pliTaxUsage) {
		this.pliTaxUsage = pliTaxUsage;
	}

	public Date getPliTaxDate() {
		return this.pliTaxDate;
	}

	public void setPliTaxDate(Date pliTaxDate) {
		this.pliTaxDate = pliTaxDate;
	}

	public Date getPliModDate() {
		return this.pliModDate;
	}

	public void setPliModDate(Date pliModDate) {
		this.pliModDate = pliModDate;
	}

	public String getPliModUserid() {
		return this.pliModUserid;
	}

	public void setPliModUserid(String pliModUserid) {
		this.pliModUserid = pliModUserid;
	}

	public String getPliUser1() {
		return this.pliUser1;
	}

	public void setPliUser1(String pliUser1) {
		this.pliUser1 = pliUser1;
	}

	public String getPliUser2() {
		return this.pliUser2;
	}

	public void setPliUser2(String pliUser2) {
		this.pliUser2 = pliUser2;
	}

	public String getPliQadc01() {
		return this.pliQadc01;
	}

	public void setPliQadc01(String pliQadc01) {
		this.pliQadc01 = pliQadc01;
	}

	public String getPliQadc02() {
		return this.pliQadc02;
	}

	public void setPliQadc02(String pliQadc02) {
		this.pliQadc02 = pliQadc02;
	}

	public Double getOidPliMstr() {
		return this.oidPliMstr;
	}

	public void setOidPliMstr(Double oidPliMstr) {
		this.oidPliMstr = oidPliMstr;
	}

}