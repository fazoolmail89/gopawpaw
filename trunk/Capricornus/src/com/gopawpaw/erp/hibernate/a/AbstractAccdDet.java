package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAccdDet entity provides the base persistence definition of the
 * AccdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAccdDet implements java.io.Serializable {

	// Fields

	private AccdDetId id;
	private String accdDesc;
	private Date accdDate;
	private Double accdAmt;
	private String accdCurr;
	private Double accdCurrAmt;
	private Double accdExRate;
	private Double accdEntEx;
	private Integer accdLifeYr;
	private Integer accdLifeMnth;
	private String accdUserid;
	private Date accdModDate;
	private String accdUser1;
	private String accdUser2;
	private String accdQadc01;
	private Double accdExRate2;
	private String accdExRatetype;
	private Integer accdExruSeq;
	private Double oidAccdDet;

	// Constructors

	/** default constructor */
	public AbstractAccdDet() {
	}

	/** minimal constructor */
	public AbstractAccdDet(AccdDetId id, Double accdExRate2,
			String accdExRatetype, Integer accdExruSeq, Double oidAccdDet) {
		this.id = id;
		this.accdExRate2 = accdExRate2;
		this.accdExRatetype = accdExRatetype;
		this.accdExruSeq = accdExruSeq;
		this.oidAccdDet = oidAccdDet;
	}

	/** full constructor */
	public AbstractAccdDet(AccdDetId id, String accdDesc, Date accdDate,
			Double accdAmt, String accdCurr, Double accdCurrAmt,
			Double accdExRate, Double accdEntEx, Integer accdLifeYr,
			Integer accdLifeMnth, String accdUserid, Date accdModDate,
			String accdUser1, String accdUser2, String accdQadc01,
			Double accdExRate2, String accdExRatetype, Integer accdExruSeq,
			Double oidAccdDet) {
		this.id = id;
		this.accdDesc = accdDesc;
		this.accdDate = accdDate;
		this.accdAmt = accdAmt;
		this.accdCurr = accdCurr;
		this.accdCurrAmt = accdCurrAmt;
		this.accdExRate = accdExRate;
		this.accdEntEx = accdEntEx;
		this.accdLifeYr = accdLifeYr;
		this.accdLifeMnth = accdLifeMnth;
		this.accdUserid = accdUserid;
		this.accdModDate = accdModDate;
		this.accdUser1 = accdUser1;
		this.accdUser2 = accdUser2;
		this.accdQadc01 = accdQadc01;
		this.accdExRate2 = accdExRate2;
		this.accdExRatetype = accdExRatetype;
		this.accdExruSeq = accdExruSeq;
		this.oidAccdDet = oidAccdDet;
	}

	// Property accessors

	public AccdDetId getId() {
		return this.id;
	}

	public void setId(AccdDetId id) {
		this.id = id;
	}

	public String getAccdDesc() {
		return this.accdDesc;
	}

	public void setAccdDesc(String accdDesc) {
		this.accdDesc = accdDesc;
	}

	public Date getAccdDate() {
		return this.accdDate;
	}

	public void setAccdDate(Date accdDate) {
		this.accdDate = accdDate;
	}

	public Double getAccdAmt() {
		return this.accdAmt;
	}

	public void setAccdAmt(Double accdAmt) {
		this.accdAmt = accdAmt;
	}

	public String getAccdCurr() {
		return this.accdCurr;
	}

	public void setAccdCurr(String accdCurr) {
		this.accdCurr = accdCurr;
	}

	public Double getAccdCurrAmt() {
		return this.accdCurrAmt;
	}

	public void setAccdCurrAmt(Double accdCurrAmt) {
		this.accdCurrAmt = accdCurrAmt;
	}

	public Double getAccdExRate() {
		return this.accdExRate;
	}

	public void setAccdExRate(Double accdExRate) {
		this.accdExRate = accdExRate;
	}

	public Double getAccdEntEx() {
		return this.accdEntEx;
	}

	public void setAccdEntEx(Double accdEntEx) {
		this.accdEntEx = accdEntEx;
	}

	public Integer getAccdLifeYr() {
		return this.accdLifeYr;
	}

	public void setAccdLifeYr(Integer accdLifeYr) {
		this.accdLifeYr = accdLifeYr;
	}

	public Integer getAccdLifeMnth() {
		return this.accdLifeMnth;
	}

	public void setAccdLifeMnth(Integer accdLifeMnth) {
		this.accdLifeMnth = accdLifeMnth;
	}

	public String getAccdUserid() {
		return this.accdUserid;
	}

	public void setAccdUserid(String accdUserid) {
		this.accdUserid = accdUserid;
	}

	public Date getAccdModDate() {
		return this.accdModDate;
	}

	public void setAccdModDate(Date accdModDate) {
		this.accdModDate = accdModDate;
	}

	public String getAccdUser1() {
		return this.accdUser1;
	}

	public void setAccdUser1(String accdUser1) {
		this.accdUser1 = accdUser1;
	}

	public String getAccdUser2() {
		return this.accdUser2;
	}

	public void setAccdUser2(String accdUser2) {
		this.accdUser2 = accdUser2;
	}

	public String getAccdQadc01() {
		return this.accdQadc01;
	}

	public void setAccdQadc01(String accdQadc01) {
		this.accdQadc01 = accdQadc01;
	}

	public Double getAccdExRate2() {
		return this.accdExRate2;
	}

	public void setAccdExRate2(Double accdExRate2) {
		this.accdExRate2 = accdExRate2;
	}

	public String getAccdExRatetype() {
		return this.accdExRatetype;
	}

	public void setAccdExRatetype(String accdExRatetype) {
		this.accdExRatetype = accdExRatetype;
	}

	public Integer getAccdExruSeq() {
		return this.accdExruSeq;
	}

	public void setAccdExruSeq(Integer accdExruSeq) {
		this.accdExruSeq = accdExruSeq;
	}

	public Double getOidAccdDet() {
		return this.oidAccdDet;
	}

	public void setOidAccdDet(Double oidAccdDet) {
		this.oidAccdDet = oidAccdDet;
	}

}