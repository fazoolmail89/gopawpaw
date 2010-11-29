package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractArsdDet entity provides the base persistence definition of the
 * ArsdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArsdDet implements java.io.Serializable {

	// Fields

	private ArsdDetId id;
	private String arsdAcct;
	private String arsdSub;
	private String arsdCc;
	private Double arsdExRate;
	private Double arsdExRate2;
	private String arsdExRatetype;
	private Integer arsdExruSeq;
	private Date arsdModDate;
	private String arsdModUserid;
	private String arsdUser1;
	private String arsdUser2;
	private String arsdQadc01;
	private String arsdQadc02;
	private Double oidArsdDet;

	// Constructors

	/** default constructor */
	public AbstractArsdDet() {
	}

	/** full constructor */
	public AbstractArsdDet(ArsdDetId id, String arsdAcct, String arsdSub,
			String arsdCc, Double arsdExRate, Double arsdExRate2,
			String arsdExRatetype, Integer arsdExruSeq, Date arsdModDate,
			String arsdModUserid, String arsdUser1, String arsdUser2,
			String arsdQadc01, String arsdQadc02, Double oidArsdDet) {
		this.id = id;
		this.arsdAcct = arsdAcct;
		this.arsdSub = arsdSub;
		this.arsdCc = arsdCc;
		this.arsdExRate = arsdExRate;
		this.arsdExRate2 = arsdExRate2;
		this.arsdExRatetype = arsdExRatetype;
		this.arsdExruSeq = arsdExruSeq;
		this.arsdModDate = arsdModDate;
		this.arsdModUserid = arsdModUserid;
		this.arsdUser1 = arsdUser1;
		this.arsdUser2 = arsdUser2;
		this.arsdQadc01 = arsdQadc01;
		this.arsdQadc02 = arsdQadc02;
		this.oidArsdDet = oidArsdDet;
	}

	// Property accessors

	public ArsdDetId getId() {
		return this.id;
	}

	public void setId(ArsdDetId id) {
		this.id = id;
	}

	public String getArsdAcct() {
		return this.arsdAcct;
	}

	public void setArsdAcct(String arsdAcct) {
		this.arsdAcct = arsdAcct;
	}

	public String getArsdSub() {
		return this.arsdSub;
	}

	public void setArsdSub(String arsdSub) {
		this.arsdSub = arsdSub;
	}

	public String getArsdCc() {
		return this.arsdCc;
	}

	public void setArsdCc(String arsdCc) {
		this.arsdCc = arsdCc;
	}

	public Double getArsdExRate() {
		return this.arsdExRate;
	}

	public void setArsdExRate(Double arsdExRate) {
		this.arsdExRate = arsdExRate;
	}

	public Double getArsdExRate2() {
		return this.arsdExRate2;
	}

	public void setArsdExRate2(Double arsdExRate2) {
		this.arsdExRate2 = arsdExRate2;
	}

	public String getArsdExRatetype() {
		return this.arsdExRatetype;
	}

	public void setArsdExRatetype(String arsdExRatetype) {
		this.arsdExRatetype = arsdExRatetype;
	}

	public Integer getArsdExruSeq() {
		return this.arsdExruSeq;
	}

	public void setArsdExruSeq(Integer arsdExruSeq) {
		this.arsdExruSeq = arsdExruSeq;
	}

	public Date getArsdModDate() {
		return this.arsdModDate;
	}

	public void setArsdModDate(Date arsdModDate) {
		this.arsdModDate = arsdModDate;
	}

	public String getArsdModUserid() {
		return this.arsdModUserid;
	}

	public void setArsdModUserid(String arsdModUserid) {
		this.arsdModUserid = arsdModUserid;
	}

	public String getArsdUser1() {
		return this.arsdUser1;
	}

	public void setArsdUser1(String arsdUser1) {
		this.arsdUser1 = arsdUser1;
	}

	public String getArsdUser2() {
		return this.arsdUser2;
	}

	public void setArsdUser2(String arsdUser2) {
		this.arsdUser2 = arsdUser2;
	}

	public String getArsdQadc01() {
		return this.arsdQadc01;
	}

	public void setArsdQadc01(String arsdQadc01) {
		this.arsdQadc01 = arsdQadc01;
	}

	public String getArsdQadc02() {
		return this.arsdQadc02;
	}

	public void setArsdQadc02(String arsdQadc02) {
		this.arsdQadc02 = arsdQadc02;
	}

	public Double getOidArsdDet() {
		return this.oidArsdDet;
	}

	public void setOidArsdDet(Double oidArsdDet) {
		this.oidArsdDet = oidArsdDet;
	}

}