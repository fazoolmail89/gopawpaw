package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCbMstr entity provides the base persistence definition of the CbMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCbMstr implements java.io.Serializable {

	// Fields

	private CbMstrId id;
	private String cbType;
	private Double cbAmt;
	private String cbRef;
	private Double cbExRate;
	private String cbUser1;
	private String cbUser2;
	private String cbCurr;
	private Double cbEntEx;
	private Double cbCurrAmt;
	private String cbQadc01;
	private Double cbExRate2;
	private String cbExRatetype;
	private Integer cbExruSeq;
	private String cbSubtype;
	private Double oidCbMstr;

	// Constructors

	/** default constructor */
	public AbstractCbMstr() {
	}

	/** minimal constructor */
	public AbstractCbMstr(CbMstrId id, Double cbExRate2, String cbExRatetype,
			Integer cbExruSeq, String cbSubtype, Double oidCbMstr) {
		this.id = id;
		this.cbExRate2 = cbExRate2;
		this.cbExRatetype = cbExRatetype;
		this.cbExruSeq = cbExruSeq;
		this.cbSubtype = cbSubtype;
		this.oidCbMstr = oidCbMstr;
	}

	/** full constructor */
	public AbstractCbMstr(CbMstrId id, String cbType, Double cbAmt,
			String cbRef, Double cbExRate, String cbUser1, String cbUser2,
			String cbCurr, Double cbEntEx, Double cbCurrAmt, String cbQadc01,
			Double cbExRate2, String cbExRatetype, Integer cbExruSeq,
			String cbSubtype, Double oidCbMstr) {
		this.id = id;
		this.cbType = cbType;
		this.cbAmt = cbAmt;
		this.cbRef = cbRef;
		this.cbExRate = cbExRate;
		this.cbUser1 = cbUser1;
		this.cbUser2 = cbUser2;
		this.cbCurr = cbCurr;
		this.cbEntEx = cbEntEx;
		this.cbCurrAmt = cbCurrAmt;
		this.cbQadc01 = cbQadc01;
		this.cbExRate2 = cbExRate2;
		this.cbExRatetype = cbExRatetype;
		this.cbExruSeq = cbExruSeq;
		this.cbSubtype = cbSubtype;
		this.oidCbMstr = oidCbMstr;
	}

	// Property accessors

	public CbMstrId getId() {
		return this.id;
	}

	public void setId(CbMstrId id) {
		this.id = id;
	}

	public String getCbType() {
		return this.cbType;
	}

	public void setCbType(String cbType) {
		this.cbType = cbType;
	}

	public Double getCbAmt() {
		return this.cbAmt;
	}

	public void setCbAmt(Double cbAmt) {
		this.cbAmt = cbAmt;
	}

	public String getCbRef() {
		return this.cbRef;
	}

	public void setCbRef(String cbRef) {
		this.cbRef = cbRef;
	}

	public Double getCbExRate() {
		return this.cbExRate;
	}

	public void setCbExRate(Double cbExRate) {
		this.cbExRate = cbExRate;
	}

	public String getCbUser1() {
		return this.cbUser1;
	}

	public void setCbUser1(String cbUser1) {
		this.cbUser1 = cbUser1;
	}

	public String getCbUser2() {
		return this.cbUser2;
	}

	public void setCbUser2(String cbUser2) {
		this.cbUser2 = cbUser2;
	}

	public String getCbCurr() {
		return this.cbCurr;
	}

	public void setCbCurr(String cbCurr) {
		this.cbCurr = cbCurr;
	}

	public Double getCbEntEx() {
		return this.cbEntEx;
	}

	public void setCbEntEx(Double cbEntEx) {
		this.cbEntEx = cbEntEx;
	}

	public Double getCbCurrAmt() {
		return this.cbCurrAmt;
	}

	public void setCbCurrAmt(Double cbCurrAmt) {
		this.cbCurrAmt = cbCurrAmt;
	}

	public String getCbQadc01() {
		return this.cbQadc01;
	}

	public void setCbQadc01(String cbQadc01) {
		this.cbQadc01 = cbQadc01;
	}

	public Double getCbExRate2() {
		return this.cbExRate2;
	}

	public void setCbExRate2(Double cbExRate2) {
		this.cbExRate2 = cbExRate2;
	}

	public String getCbExRatetype() {
		return this.cbExRatetype;
	}

	public void setCbExRatetype(String cbExRatetype) {
		this.cbExRatetype = cbExRatetype;
	}

	public Integer getCbExruSeq() {
		return this.cbExruSeq;
	}

	public void setCbExruSeq(Integer cbExruSeq) {
		this.cbExruSeq = cbExruSeq;
	}

	public String getCbSubtype() {
		return this.cbSubtype;
	}

	public void setCbSubtype(String cbSubtype) {
		this.cbSubtype = cbSubtype;
	}

	public Double getOidCbMstr() {
		return this.oidCbMstr;
	}

	public void setOidCbMstr(Double oidCbMstr) {
		this.oidCbMstr = oidCbMstr;
	}

}