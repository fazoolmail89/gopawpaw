package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCksdDet entity provides the base persistence definition of the
 * CksdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCksdDet implements java.io.Serializable {

	// Fields

	private CksdDetId id;
	private String cksdUser1;
	private String cksdUser2;
	private String cksdAcct;
	private String cksdCc;
	private Double cksdExRate;
	private String cksdQadc01;
	private Double cksdExRate2;
	private String cksdExRatetype;
	private Integer cksdExruSeq;
	private String cksdSub;
	private Double oidCksdDet;

	// Constructors

	/** default constructor */
	public AbstractCksdDet() {
	}

	/** minimal constructor */
	public AbstractCksdDet(CksdDetId id, Double cksdExRate2,
			String cksdExRatetype, Integer cksdExruSeq, Double oidCksdDet) {
		this.id = id;
		this.cksdExRate2 = cksdExRate2;
		this.cksdExRatetype = cksdExRatetype;
		this.cksdExruSeq = cksdExruSeq;
		this.oidCksdDet = oidCksdDet;
	}

	/** full constructor */
	public AbstractCksdDet(CksdDetId id, String cksdUser1, String cksdUser2,
			String cksdAcct, String cksdCc, Double cksdExRate,
			String cksdQadc01, Double cksdExRate2, String cksdExRatetype,
			Integer cksdExruSeq, String cksdSub, Double oidCksdDet) {
		this.id = id;
		this.cksdUser1 = cksdUser1;
		this.cksdUser2 = cksdUser2;
		this.cksdAcct = cksdAcct;
		this.cksdCc = cksdCc;
		this.cksdExRate = cksdExRate;
		this.cksdQadc01 = cksdQadc01;
		this.cksdExRate2 = cksdExRate2;
		this.cksdExRatetype = cksdExRatetype;
		this.cksdExruSeq = cksdExruSeq;
		this.cksdSub = cksdSub;
		this.oidCksdDet = oidCksdDet;
	}

	// Property accessors

	public CksdDetId getId() {
		return this.id;
	}

	public void setId(CksdDetId id) {
		this.id = id;
	}

	public String getCksdUser1() {
		return this.cksdUser1;
	}

	public void setCksdUser1(String cksdUser1) {
		this.cksdUser1 = cksdUser1;
	}

	public String getCksdUser2() {
		return this.cksdUser2;
	}

	public void setCksdUser2(String cksdUser2) {
		this.cksdUser2 = cksdUser2;
	}

	public String getCksdAcct() {
		return this.cksdAcct;
	}

	public void setCksdAcct(String cksdAcct) {
		this.cksdAcct = cksdAcct;
	}

	public String getCksdCc() {
		return this.cksdCc;
	}

	public void setCksdCc(String cksdCc) {
		this.cksdCc = cksdCc;
	}

	public Double getCksdExRate() {
		return this.cksdExRate;
	}

	public void setCksdExRate(Double cksdExRate) {
		this.cksdExRate = cksdExRate;
	}

	public String getCksdQadc01() {
		return this.cksdQadc01;
	}

	public void setCksdQadc01(String cksdQadc01) {
		this.cksdQadc01 = cksdQadc01;
	}

	public Double getCksdExRate2() {
		return this.cksdExRate2;
	}

	public void setCksdExRate2(Double cksdExRate2) {
		this.cksdExRate2 = cksdExRate2;
	}

	public String getCksdExRatetype() {
		return this.cksdExRatetype;
	}

	public void setCksdExRatetype(String cksdExRatetype) {
		this.cksdExRatetype = cksdExRatetype;
	}

	public Integer getCksdExruSeq() {
		return this.cksdExruSeq;
	}

	public void setCksdExruSeq(Integer cksdExruSeq) {
		this.cksdExruSeq = cksdExruSeq;
	}

	public String getCksdSub() {
		return this.cksdSub;
	}

	public void setCksdSub(String cksdSub) {
		this.cksdSub = cksdSub;
	}

	public Double getOidCksdDet() {
		return this.oidCksdDet;
	}

	public void setOidCksdDet(Double oidCksdDet) {
		this.oidCksdDet = oidCksdDet;
	}

}