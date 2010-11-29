package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCkdDet entity provides the base persistence definition of the CkdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCkdDet implements java.io.Serializable {

	// Fields

	private CkdDetId id;
	private Double ckdAmt;
	private Double ckdDisc;
	private String ckdUser1;
	private String ckdUser2;
	private Double ckdCurAmt;
	private Double ckdCurDisc;
	private Double ckdExRate;
	private String ckdQadc01;
	private String ckdDyCode;
	private String ckdDyNum;
	private Double ckdExRate2;
	private String ckdExRatetype;
	private Integer ckdExruSeq;
	private String ckdUnappliedRef;
	private Double oidCkdDet;

	// Constructors

	/** default constructor */
	public AbstractCkdDet() {
	}

	/** minimal constructor */
	public AbstractCkdDet(CkdDetId id, String ckdDyCode, String ckdDyNum,
			Double ckdExRate2, String ckdExRatetype, Integer ckdExruSeq,
			String ckdUnappliedRef, Double oidCkdDet) {
		this.id = id;
		this.ckdDyCode = ckdDyCode;
		this.ckdDyNum = ckdDyNum;
		this.ckdExRate2 = ckdExRate2;
		this.ckdExRatetype = ckdExRatetype;
		this.ckdExruSeq = ckdExruSeq;
		this.ckdUnappliedRef = ckdUnappliedRef;
		this.oidCkdDet = oidCkdDet;
	}

	/** full constructor */
	public AbstractCkdDet(CkdDetId id, Double ckdAmt, Double ckdDisc,
			String ckdUser1, String ckdUser2, Double ckdCurAmt,
			Double ckdCurDisc, Double ckdExRate, String ckdQadc01,
			String ckdDyCode, String ckdDyNum, Double ckdExRate2,
			String ckdExRatetype, Integer ckdExruSeq, String ckdUnappliedRef,
			Double oidCkdDet) {
		this.id = id;
		this.ckdAmt = ckdAmt;
		this.ckdDisc = ckdDisc;
		this.ckdUser1 = ckdUser1;
		this.ckdUser2 = ckdUser2;
		this.ckdCurAmt = ckdCurAmt;
		this.ckdCurDisc = ckdCurDisc;
		this.ckdExRate = ckdExRate;
		this.ckdQadc01 = ckdQadc01;
		this.ckdDyCode = ckdDyCode;
		this.ckdDyNum = ckdDyNum;
		this.ckdExRate2 = ckdExRate2;
		this.ckdExRatetype = ckdExRatetype;
		this.ckdExruSeq = ckdExruSeq;
		this.ckdUnappliedRef = ckdUnappliedRef;
		this.oidCkdDet = oidCkdDet;
	}

	// Property accessors

	public CkdDetId getId() {
		return this.id;
	}

	public void setId(CkdDetId id) {
		this.id = id;
	}

	public Double getCkdAmt() {
		return this.ckdAmt;
	}

	public void setCkdAmt(Double ckdAmt) {
		this.ckdAmt = ckdAmt;
	}

	public Double getCkdDisc() {
		return this.ckdDisc;
	}

	public void setCkdDisc(Double ckdDisc) {
		this.ckdDisc = ckdDisc;
	}

	public String getCkdUser1() {
		return this.ckdUser1;
	}

	public void setCkdUser1(String ckdUser1) {
		this.ckdUser1 = ckdUser1;
	}

	public String getCkdUser2() {
		return this.ckdUser2;
	}

	public void setCkdUser2(String ckdUser2) {
		this.ckdUser2 = ckdUser2;
	}

	public Double getCkdCurAmt() {
		return this.ckdCurAmt;
	}

	public void setCkdCurAmt(Double ckdCurAmt) {
		this.ckdCurAmt = ckdCurAmt;
	}

	public Double getCkdCurDisc() {
		return this.ckdCurDisc;
	}

	public void setCkdCurDisc(Double ckdCurDisc) {
		this.ckdCurDisc = ckdCurDisc;
	}

	public Double getCkdExRate() {
		return this.ckdExRate;
	}

	public void setCkdExRate(Double ckdExRate) {
		this.ckdExRate = ckdExRate;
	}

	public String getCkdQadc01() {
		return this.ckdQadc01;
	}

	public void setCkdQadc01(String ckdQadc01) {
		this.ckdQadc01 = ckdQadc01;
	}

	public String getCkdDyCode() {
		return this.ckdDyCode;
	}

	public void setCkdDyCode(String ckdDyCode) {
		this.ckdDyCode = ckdDyCode;
	}

	public String getCkdDyNum() {
		return this.ckdDyNum;
	}

	public void setCkdDyNum(String ckdDyNum) {
		this.ckdDyNum = ckdDyNum;
	}

	public Double getCkdExRate2() {
		return this.ckdExRate2;
	}

	public void setCkdExRate2(Double ckdExRate2) {
		this.ckdExRate2 = ckdExRate2;
	}

	public String getCkdExRatetype() {
		return this.ckdExRatetype;
	}

	public void setCkdExRatetype(String ckdExRatetype) {
		this.ckdExRatetype = ckdExRatetype;
	}

	public Integer getCkdExruSeq() {
		return this.ckdExruSeq;
	}

	public void setCkdExruSeq(Integer ckdExruSeq) {
		this.ckdExruSeq = ckdExruSeq;
	}

	public String getCkdUnappliedRef() {
		return this.ckdUnappliedRef;
	}

	public void setCkdUnappliedRef(String ckdUnappliedRef) {
		this.ckdUnappliedRef = ckdUnappliedRef;
	}

	public Double getOidCkdDet() {
		return this.oidCkdDet;
	}

	public void setOidCkdDet(Double oidCkdDet) {
		this.oidCkdDet = oidCkdDet;
	}

}