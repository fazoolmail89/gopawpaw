package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRstdDet entity provides the base persistence definition of the
 * RstdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRstdDet implements java.io.Serializable {

	// Fields

	private RstdDetId id;
	private Integer rstdSequence;
	private Date rstdModDate;
	private String rstdUserid;
	private String rstdUser1;
	private String rstdUser2;
	private Boolean rstdNotifyNxt;
	private Boolean rstdCanreroute;
	private Integer rstdSvrtyLvl;
	private String rstdQadc01;
	private Double oidRstdDet;

	// Constructors

	/** default constructor */
	public AbstractRstdDet() {
	}

	/** minimal constructor */
	public AbstractRstdDet(RstdDetId id, Integer rstdSequence,
			String rstdUserid, String rstdUser1, String rstdUser2,
			Boolean rstdNotifyNxt, Boolean rstdCanreroute,
			Integer rstdSvrtyLvl, Double oidRstdDet) {
		this.id = id;
		this.rstdSequence = rstdSequence;
		this.rstdUserid = rstdUserid;
		this.rstdUser1 = rstdUser1;
		this.rstdUser2 = rstdUser2;
		this.rstdNotifyNxt = rstdNotifyNxt;
		this.rstdCanreroute = rstdCanreroute;
		this.rstdSvrtyLvl = rstdSvrtyLvl;
		this.oidRstdDet = oidRstdDet;
	}

	/** full constructor */
	public AbstractRstdDet(RstdDetId id, Integer rstdSequence,
			Date rstdModDate, String rstdUserid, String rstdUser1,
			String rstdUser2, Boolean rstdNotifyNxt, Boolean rstdCanreroute,
			Integer rstdSvrtyLvl, String rstdQadc01, Double oidRstdDet) {
		this.id = id;
		this.rstdSequence = rstdSequence;
		this.rstdModDate = rstdModDate;
		this.rstdUserid = rstdUserid;
		this.rstdUser1 = rstdUser1;
		this.rstdUser2 = rstdUser2;
		this.rstdNotifyNxt = rstdNotifyNxt;
		this.rstdCanreroute = rstdCanreroute;
		this.rstdSvrtyLvl = rstdSvrtyLvl;
		this.rstdQadc01 = rstdQadc01;
		this.oidRstdDet = oidRstdDet;
	}

	// Property accessors

	public RstdDetId getId() {
		return this.id;
	}

	public void setId(RstdDetId id) {
		this.id = id;
	}

	public Integer getRstdSequence() {
		return this.rstdSequence;
	}

	public void setRstdSequence(Integer rstdSequence) {
		this.rstdSequence = rstdSequence;
	}

	public Date getRstdModDate() {
		return this.rstdModDate;
	}

	public void setRstdModDate(Date rstdModDate) {
		this.rstdModDate = rstdModDate;
	}

	public String getRstdUserid() {
		return this.rstdUserid;
	}

	public void setRstdUserid(String rstdUserid) {
		this.rstdUserid = rstdUserid;
	}

	public String getRstdUser1() {
		return this.rstdUser1;
	}

	public void setRstdUser1(String rstdUser1) {
		this.rstdUser1 = rstdUser1;
	}

	public String getRstdUser2() {
		return this.rstdUser2;
	}

	public void setRstdUser2(String rstdUser2) {
		this.rstdUser2 = rstdUser2;
	}

	public Boolean getRstdNotifyNxt() {
		return this.rstdNotifyNxt;
	}

	public void setRstdNotifyNxt(Boolean rstdNotifyNxt) {
		this.rstdNotifyNxt = rstdNotifyNxt;
	}

	public Boolean getRstdCanreroute() {
		return this.rstdCanreroute;
	}

	public void setRstdCanreroute(Boolean rstdCanreroute) {
		this.rstdCanreroute = rstdCanreroute;
	}

	public Integer getRstdSvrtyLvl() {
		return this.rstdSvrtyLvl;
	}

	public void setRstdSvrtyLvl(Integer rstdSvrtyLvl) {
		this.rstdSvrtyLvl = rstdSvrtyLvl;
	}

	public String getRstdQadc01() {
		return this.rstdQadc01;
	}

	public void setRstdQadc01(String rstdQadc01) {
		this.rstdQadc01 = rstdQadc01;
	}

	public Double getOidRstdDet() {
		return this.oidRstdDet;
	}

	public void setOidRstdDet(Double oidRstdDet) {
		this.oidRstdDet = oidRstdDet;
	}

}