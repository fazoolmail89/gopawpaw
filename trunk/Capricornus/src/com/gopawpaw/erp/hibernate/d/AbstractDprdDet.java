package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDprdDet entity provides the base persistence definition of the
 * DprdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDprdDet implements java.io.Serializable {

	// Fields

	private DprdDetId id;
	private Integer dprdPd;
	private Double dprdAmt;
	private Double dprdCurrAmt;
	private Double dprdExRate;
	private Double dprdEntEx;
	private String dprdUser1;
	private Boolean dprdPost;
	private Date dprdEffdate;
	private String dprdAcct;
	private String dprdSub;
	private String dprdCc;
	private String dprdProj;
	private String dprdType;
	private String dprdMethod;
	private String dprdQad01;
	private String dprdQad02;
	private Boolean dprdPdClosed;
	private String dprdRef;
	private Integer dprdGlLine;
	private String dprdUser2;
	private String dprdDesc;
	private Double dprdCostPct;
	private Double dprdExRate2;
	private String dprdExRatetype;
	private Integer dprdExruSeq;
	private Double oidDprdDet;

	// Constructors

	/** default constructor */
	public AbstractDprdDet() {
	}

	/** minimal constructor */
	public AbstractDprdDet(DprdDetId id, Double dprdExRate2,
			String dprdExRatetype, Integer dprdExruSeq, Double oidDprdDet) {
		this.id = id;
		this.dprdExRate2 = dprdExRate2;
		this.dprdExRatetype = dprdExRatetype;
		this.dprdExruSeq = dprdExruSeq;
		this.oidDprdDet = oidDprdDet;
	}

	/** full constructor */
	public AbstractDprdDet(DprdDetId id, Integer dprdPd, Double dprdAmt,
			Double dprdCurrAmt, Double dprdExRate, Double dprdEntEx,
			String dprdUser1, Boolean dprdPost, Date dprdEffdate,
			String dprdAcct, String dprdSub, String dprdCc, String dprdProj,
			String dprdType, String dprdMethod, String dprdQad01,
			String dprdQad02, Boolean dprdPdClosed, String dprdRef,
			Integer dprdGlLine, String dprdUser2, String dprdDesc,
			Double dprdCostPct, Double dprdExRate2, String dprdExRatetype,
			Integer dprdExruSeq, Double oidDprdDet) {
		this.id = id;
		this.dprdPd = dprdPd;
		this.dprdAmt = dprdAmt;
		this.dprdCurrAmt = dprdCurrAmt;
		this.dprdExRate = dprdExRate;
		this.dprdEntEx = dprdEntEx;
		this.dprdUser1 = dprdUser1;
		this.dprdPost = dprdPost;
		this.dprdEffdate = dprdEffdate;
		this.dprdAcct = dprdAcct;
		this.dprdSub = dprdSub;
		this.dprdCc = dprdCc;
		this.dprdProj = dprdProj;
		this.dprdType = dprdType;
		this.dprdMethod = dprdMethod;
		this.dprdQad01 = dprdQad01;
		this.dprdQad02 = dprdQad02;
		this.dprdPdClosed = dprdPdClosed;
		this.dprdRef = dprdRef;
		this.dprdGlLine = dprdGlLine;
		this.dprdUser2 = dprdUser2;
		this.dprdDesc = dprdDesc;
		this.dprdCostPct = dprdCostPct;
		this.dprdExRate2 = dprdExRate2;
		this.dprdExRatetype = dprdExRatetype;
		this.dprdExruSeq = dprdExruSeq;
		this.oidDprdDet = oidDprdDet;
	}

	// Property accessors

	public DprdDetId getId() {
		return this.id;
	}

	public void setId(DprdDetId id) {
		this.id = id;
	}

	public Integer getDprdPd() {
		return this.dprdPd;
	}

	public void setDprdPd(Integer dprdPd) {
		this.dprdPd = dprdPd;
	}

	public Double getDprdAmt() {
		return this.dprdAmt;
	}

	public void setDprdAmt(Double dprdAmt) {
		this.dprdAmt = dprdAmt;
	}

	public Double getDprdCurrAmt() {
		return this.dprdCurrAmt;
	}

	public void setDprdCurrAmt(Double dprdCurrAmt) {
		this.dprdCurrAmt = dprdCurrAmt;
	}

	public Double getDprdExRate() {
		return this.dprdExRate;
	}

	public void setDprdExRate(Double dprdExRate) {
		this.dprdExRate = dprdExRate;
	}

	public Double getDprdEntEx() {
		return this.dprdEntEx;
	}

	public void setDprdEntEx(Double dprdEntEx) {
		this.dprdEntEx = dprdEntEx;
	}

	public String getDprdUser1() {
		return this.dprdUser1;
	}

	public void setDprdUser1(String dprdUser1) {
		this.dprdUser1 = dprdUser1;
	}

	public Boolean getDprdPost() {
		return this.dprdPost;
	}

	public void setDprdPost(Boolean dprdPost) {
		this.dprdPost = dprdPost;
	}

	public Date getDprdEffdate() {
		return this.dprdEffdate;
	}

	public void setDprdEffdate(Date dprdEffdate) {
		this.dprdEffdate = dprdEffdate;
	}

	public String getDprdAcct() {
		return this.dprdAcct;
	}

	public void setDprdAcct(String dprdAcct) {
		this.dprdAcct = dprdAcct;
	}

	public String getDprdSub() {
		return this.dprdSub;
	}

	public void setDprdSub(String dprdSub) {
		this.dprdSub = dprdSub;
	}

	public String getDprdCc() {
		return this.dprdCc;
	}

	public void setDprdCc(String dprdCc) {
		this.dprdCc = dprdCc;
	}

	public String getDprdProj() {
		return this.dprdProj;
	}

	public void setDprdProj(String dprdProj) {
		this.dprdProj = dprdProj;
	}

	public String getDprdType() {
		return this.dprdType;
	}

	public void setDprdType(String dprdType) {
		this.dprdType = dprdType;
	}

	public String getDprdMethod() {
		return this.dprdMethod;
	}

	public void setDprdMethod(String dprdMethod) {
		this.dprdMethod = dprdMethod;
	}

	public String getDprdQad01() {
		return this.dprdQad01;
	}

	public void setDprdQad01(String dprdQad01) {
		this.dprdQad01 = dprdQad01;
	}

	public String getDprdQad02() {
		return this.dprdQad02;
	}

	public void setDprdQad02(String dprdQad02) {
		this.dprdQad02 = dprdQad02;
	}

	public Boolean getDprdPdClosed() {
		return this.dprdPdClosed;
	}

	public void setDprdPdClosed(Boolean dprdPdClosed) {
		this.dprdPdClosed = dprdPdClosed;
	}

	public String getDprdRef() {
		return this.dprdRef;
	}

	public void setDprdRef(String dprdRef) {
		this.dprdRef = dprdRef;
	}

	public Integer getDprdGlLine() {
		return this.dprdGlLine;
	}

	public void setDprdGlLine(Integer dprdGlLine) {
		this.dprdGlLine = dprdGlLine;
	}

	public String getDprdUser2() {
		return this.dprdUser2;
	}

	public void setDprdUser2(String dprdUser2) {
		this.dprdUser2 = dprdUser2;
	}

	public String getDprdDesc() {
		return this.dprdDesc;
	}

	public void setDprdDesc(String dprdDesc) {
		this.dprdDesc = dprdDesc;
	}

	public Double getDprdCostPct() {
		return this.dprdCostPct;
	}

	public void setDprdCostPct(Double dprdCostPct) {
		this.dprdCostPct = dprdCostPct;
	}

	public Double getDprdExRate2() {
		return this.dprdExRate2;
	}

	public void setDprdExRate2(Double dprdExRate2) {
		this.dprdExRate2 = dprdExRate2;
	}

	public String getDprdExRatetype() {
		return this.dprdExRatetype;
	}

	public void setDprdExRatetype(String dprdExRatetype) {
		this.dprdExRatetype = dprdExRatetype;
	}

	public Integer getDprdExruSeq() {
		return this.dprdExruSeq;
	}

	public void setDprdExruSeq(Integer dprdExruSeq) {
		this.dprdExruSeq = dprdExruSeq;
	}

	public Double getOidDprdDet() {
		return this.oidDprdDet;
	}

	public void setOidDprdDet(Double oidDprdDet) {
		this.oidDprdDet = oidDprdDet;
	}

}