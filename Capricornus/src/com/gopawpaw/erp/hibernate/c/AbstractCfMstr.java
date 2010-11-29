package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCfMstr entity provides the base persistence definition of the CfMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCfMstr implements java.io.Serializable {

	// Fields

	private CfMstrId id;
	private Double cfRefAmt;
	private Double cfCumAmt;
	private Double cfExptAmt;
	private String cfBank;
	private Boolean cfType;
	private Integer cfCmtindx;
	private String cfCurr;
	private Date cfDate;
	private Date cfDueDate;
	private Double cfExRate;
	private String cfEntity;
	private Double cfEntEx;
	private Date cfExptDate;
	private Date cfLdueDate;
	private String cfUser1;
	private String cfUser2;
	private String cfChr01;
	private String cfChr02;
	private String cfChr03;
	private String cfChr04;
	private String cfChr05;
	private Double cfDec01;
	private Double cfDec02;
	private Date cfDte01;
	private Date cfDte02;
	private Boolean cfLog01;
	private String cfDesc1;
	private String cfDesc2;
	private Date cfLastedit;
	private String cfRef;
	private String cfUserid;
	private Double cfExRate2;
	private String cfExRatetype;
	private Integer cfExruSeq;
	private Double oidCfMstr;

	// Constructors

	/** default constructor */
	public AbstractCfMstr() {
	}

	/** minimal constructor */
	public AbstractCfMstr(CfMstrId id, Boolean cfType, Double cfExRate2,
			String cfExRatetype, Integer cfExruSeq, Double oidCfMstr) {
		this.id = id;
		this.cfType = cfType;
		this.cfExRate2 = cfExRate2;
		this.cfExRatetype = cfExRatetype;
		this.cfExruSeq = cfExruSeq;
		this.oidCfMstr = oidCfMstr;
	}

	/** full constructor */
	public AbstractCfMstr(CfMstrId id, Double cfRefAmt, Double cfCumAmt,
			Double cfExptAmt, String cfBank, Boolean cfType, Integer cfCmtindx,
			String cfCurr, Date cfDate, Date cfDueDate, Double cfExRate,
			String cfEntity, Double cfEntEx, Date cfExptDate, Date cfLdueDate,
			String cfUser1, String cfUser2, String cfChr01, String cfChr02,
			String cfChr03, String cfChr04, String cfChr05, Double cfDec01,
			Double cfDec02, Date cfDte01, Date cfDte02, Boolean cfLog01,
			String cfDesc1, String cfDesc2, Date cfLastedit, String cfRef,
			String cfUserid, Double cfExRate2, String cfExRatetype,
			Integer cfExruSeq, Double oidCfMstr) {
		this.id = id;
		this.cfRefAmt = cfRefAmt;
		this.cfCumAmt = cfCumAmt;
		this.cfExptAmt = cfExptAmt;
		this.cfBank = cfBank;
		this.cfType = cfType;
		this.cfCmtindx = cfCmtindx;
		this.cfCurr = cfCurr;
		this.cfDate = cfDate;
		this.cfDueDate = cfDueDate;
		this.cfExRate = cfExRate;
		this.cfEntity = cfEntity;
		this.cfEntEx = cfEntEx;
		this.cfExptDate = cfExptDate;
		this.cfLdueDate = cfLdueDate;
		this.cfUser1 = cfUser1;
		this.cfUser2 = cfUser2;
		this.cfChr01 = cfChr01;
		this.cfChr02 = cfChr02;
		this.cfChr03 = cfChr03;
		this.cfChr04 = cfChr04;
		this.cfChr05 = cfChr05;
		this.cfDec01 = cfDec01;
		this.cfDec02 = cfDec02;
		this.cfDte01 = cfDte01;
		this.cfDte02 = cfDte02;
		this.cfLog01 = cfLog01;
		this.cfDesc1 = cfDesc1;
		this.cfDesc2 = cfDesc2;
		this.cfLastedit = cfLastedit;
		this.cfRef = cfRef;
		this.cfUserid = cfUserid;
		this.cfExRate2 = cfExRate2;
		this.cfExRatetype = cfExRatetype;
		this.cfExruSeq = cfExruSeq;
		this.oidCfMstr = oidCfMstr;
	}

	// Property accessors

	public CfMstrId getId() {
		return this.id;
	}

	public void setId(CfMstrId id) {
		this.id = id;
	}

	public Double getCfRefAmt() {
		return this.cfRefAmt;
	}

	public void setCfRefAmt(Double cfRefAmt) {
		this.cfRefAmt = cfRefAmt;
	}

	public Double getCfCumAmt() {
		return this.cfCumAmt;
	}

	public void setCfCumAmt(Double cfCumAmt) {
		this.cfCumAmt = cfCumAmt;
	}

	public Double getCfExptAmt() {
		return this.cfExptAmt;
	}

	public void setCfExptAmt(Double cfExptAmt) {
		this.cfExptAmt = cfExptAmt;
	}

	public String getCfBank() {
		return this.cfBank;
	}

	public void setCfBank(String cfBank) {
		this.cfBank = cfBank;
	}

	public Boolean getCfType() {
		return this.cfType;
	}

	public void setCfType(Boolean cfType) {
		this.cfType = cfType;
	}

	public Integer getCfCmtindx() {
		return this.cfCmtindx;
	}

	public void setCfCmtindx(Integer cfCmtindx) {
		this.cfCmtindx = cfCmtindx;
	}

	public String getCfCurr() {
		return this.cfCurr;
	}

	public void setCfCurr(String cfCurr) {
		this.cfCurr = cfCurr;
	}

	public Date getCfDate() {
		return this.cfDate;
	}

	public void setCfDate(Date cfDate) {
		this.cfDate = cfDate;
	}

	public Date getCfDueDate() {
		return this.cfDueDate;
	}

	public void setCfDueDate(Date cfDueDate) {
		this.cfDueDate = cfDueDate;
	}

	public Double getCfExRate() {
		return this.cfExRate;
	}

	public void setCfExRate(Double cfExRate) {
		this.cfExRate = cfExRate;
	}

	public String getCfEntity() {
		return this.cfEntity;
	}

	public void setCfEntity(String cfEntity) {
		this.cfEntity = cfEntity;
	}

	public Double getCfEntEx() {
		return this.cfEntEx;
	}

	public void setCfEntEx(Double cfEntEx) {
		this.cfEntEx = cfEntEx;
	}

	public Date getCfExptDate() {
		return this.cfExptDate;
	}

	public void setCfExptDate(Date cfExptDate) {
		this.cfExptDate = cfExptDate;
	}

	public Date getCfLdueDate() {
		return this.cfLdueDate;
	}

	public void setCfLdueDate(Date cfLdueDate) {
		this.cfLdueDate = cfLdueDate;
	}

	public String getCfUser1() {
		return this.cfUser1;
	}

	public void setCfUser1(String cfUser1) {
		this.cfUser1 = cfUser1;
	}

	public String getCfUser2() {
		return this.cfUser2;
	}

	public void setCfUser2(String cfUser2) {
		this.cfUser2 = cfUser2;
	}

	public String getCfChr01() {
		return this.cfChr01;
	}

	public void setCfChr01(String cfChr01) {
		this.cfChr01 = cfChr01;
	}

	public String getCfChr02() {
		return this.cfChr02;
	}

	public void setCfChr02(String cfChr02) {
		this.cfChr02 = cfChr02;
	}

	public String getCfChr03() {
		return this.cfChr03;
	}

	public void setCfChr03(String cfChr03) {
		this.cfChr03 = cfChr03;
	}

	public String getCfChr04() {
		return this.cfChr04;
	}

	public void setCfChr04(String cfChr04) {
		this.cfChr04 = cfChr04;
	}

	public String getCfChr05() {
		return this.cfChr05;
	}

	public void setCfChr05(String cfChr05) {
		this.cfChr05 = cfChr05;
	}

	public Double getCfDec01() {
		return this.cfDec01;
	}

	public void setCfDec01(Double cfDec01) {
		this.cfDec01 = cfDec01;
	}

	public Double getCfDec02() {
		return this.cfDec02;
	}

	public void setCfDec02(Double cfDec02) {
		this.cfDec02 = cfDec02;
	}

	public Date getCfDte01() {
		return this.cfDte01;
	}

	public void setCfDte01(Date cfDte01) {
		this.cfDte01 = cfDte01;
	}

	public Date getCfDte02() {
		return this.cfDte02;
	}

	public void setCfDte02(Date cfDte02) {
		this.cfDte02 = cfDte02;
	}

	public Boolean getCfLog01() {
		return this.cfLog01;
	}

	public void setCfLog01(Boolean cfLog01) {
		this.cfLog01 = cfLog01;
	}

	public String getCfDesc1() {
		return this.cfDesc1;
	}

	public void setCfDesc1(String cfDesc1) {
		this.cfDesc1 = cfDesc1;
	}

	public String getCfDesc2() {
		return this.cfDesc2;
	}

	public void setCfDesc2(String cfDesc2) {
		this.cfDesc2 = cfDesc2;
	}

	public Date getCfLastedit() {
		return this.cfLastedit;
	}

	public void setCfLastedit(Date cfLastedit) {
		this.cfLastedit = cfLastedit;
	}

	public String getCfRef() {
		return this.cfRef;
	}

	public void setCfRef(String cfRef) {
		this.cfRef = cfRef;
	}

	public String getCfUserid() {
		return this.cfUserid;
	}

	public void setCfUserid(String cfUserid) {
		this.cfUserid = cfUserid;
	}

	public Double getCfExRate2() {
		return this.cfExRate2;
	}

	public void setCfExRate2(Double cfExRate2) {
		this.cfExRate2 = cfExRate2;
	}

	public String getCfExRatetype() {
		return this.cfExRatetype;
	}

	public void setCfExRatetype(String cfExRatetype) {
		this.cfExRatetype = cfExRatetype;
	}

	public Integer getCfExruSeq() {
		return this.cfExruSeq;
	}

	public void setCfExruSeq(Integer cfExruSeq) {
		this.cfExruSeq = cfExruSeq;
	}

	public Double getOidCfMstr() {
		return this.oidCfMstr;
	}

	public void setOidCfMstr(Double oidCfMstr) {
		this.oidCfMstr = oidCfMstr;
	}

}