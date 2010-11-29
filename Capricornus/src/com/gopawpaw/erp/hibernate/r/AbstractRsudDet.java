package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRsudDet entity provides the base persistence definition of the
 * RsudDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRsudDet implements java.io.Serializable {

	// Fields

	private RsudDetId id;
	private Integer rsudSequence;
	private Boolean rsudNotifyNxt;
	private Integer rsudSvrtyLvl;
	private Boolean rsudCanreroute;
	private Boolean rsudApproved;
	private String rsudApproverid;
	private Date rsudApprDate;
	private Integer rsudCmmtindx;
	private String rsudUser1;
	private String rsudUser2;
	private Date rsudRerouteDate;
	private String rsudQadc01;
	private Double oidRsudDet;

	// Constructors

	/** default constructor */
	public AbstractRsudDet() {
	}

	/** minimal constructor */
	public AbstractRsudDet(RsudDetId id, Integer rsudSequence,
			Boolean rsudNotifyNxt, Integer rsudSvrtyLvl,
			Boolean rsudCanreroute, Boolean rsudApproved,
			String rsudApproverid, Integer rsudCmmtindx, String rsudUser1,
			String rsudUser2, Double oidRsudDet) {
		this.id = id;
		this.rsudSequence = rsudSequence;
		this.rsudNotifyNxt = rsudNotifyNxt;
		this.rsudSvrtyLvl = rsudSvrtyLvl;
		this.rsudCanreroute = rsudCanreroute;
		this.rsudApproved = rsudApproved;
		this.rsudApproverid = rsudApproverid;
		this.rsudCmmtindx = rsudCmmtindx;
		this.rsudUser1 = rsudUser1;
		this.rsudUser2 = rsudUser2;
		this.oidRsudDet = oidRsudDet;
	}

	/** full constructor */
	public AbstractRsudDet(RsudDetId id, Integer rsudSequence,
			Boolean rsudNotifyNxt, Integer rsudSvrtyLvl,
			Boolean rsudCanreroute, Boolean rsudApproved,
			String rsudApproverid, Date rsudApprDate, Integer rsudCmmtindx,
			String rsudUser1, String rsudUser2, Date rsudRerouteDate,
			String rsudQadc01, Double oidRsudDet) {
		this.id = id;
		this.rsudSequence = rsudSequence;
		this.rsudNotifyNxt = rsudNotifyNxt;
		this.rsudSvrtyLvl = rsudSvrtyLvl;
		this.rsudCanreroute = rsudCanreroute;
		this.rsudApproved = rsudApproved;
		this.rsudApproverid = rsudApproverid;
		this.rsudApprDate = rsudApprDate;
		this.rsudCmmtindx = rsudCmmtindx;
		this.rsudUser1 = rsudUser1;
		this.rsudUser2 = rsudUser2;
		this.rsudRerouteDate = rsudRerouteDate;
		this.rsudQadc01 = rsudQadc01;
		this.oidRsudDet = oidRsudDet;
	}

	// Property accessors

	public RsudDetId getId() {
		return this.id;
	}

	public void setId(RsudDetId id) {
		this.id = id;
	}

	public Integer getRsudSequence() {
		return this.rsudSequence;
	}

	public void setRsudSequence(Integer rsudSequence) {
		this.rsudSequence = rsudSequence;
	}

	public Boolean getRsudNotifyNxt() {
		return this.rsudNotifyNxt;
	}

	public void setRsudNotifyNxt(Boolean rsudNotifyNxt) {
		this.rsudNotifyNxt = rsudNotifyNxt;
	}

	public Integer getRsudSvrtyLvl() {
		return this.rsudSvrtyLvl;
	}

	public void setRsudSvrtyLvl(Integer rsudSvrtyLvl) {
		this.rsudSvrtyLvl = rsudSvrtyLvl;
	}

	public Boolean getRsudCanreroute() {
		return this.rsudCanreroute;
	}

	public void setRsudCanreroute(Boolean rsudCanreroute) {
		this.rsudCanreroute = rsudCanreroute;
	}

	public Boolean getRsudApproved() {
		return this.rsudApproved;
	}

	public void setRsudApproved(Boolean rsudApproved) {
		this.rsudApproved = rsudApproved;
	}

	public String getRsudApproverid() {
		return this.rsudApproverid;
	}

	public void setRsudApproverid(String rsudApproverid) {
		this.rsudApproverid = rsudApproverid;
	}

	public Date getRsudApprDate() {
		return this.rsudApprDate;
	}

	public void setRsudApprDate(Date rsudApprDate) {
		this.rsudApprDate = rsudApprDate;
	}

	public Integer getRsudCmmtindx() {
		return this.rsudCmmtindx;
	}

	public void setRsudCmmtindx(Integer rsudCmmtindx) {
		this.rsudCmmtindx = rsudCmmtindx;
	}

	public String getRsudUser1() {
		return this.rsudUser1;
	}

	public void setRsudUser1(String rsudUser1) {
		this.rsudUser1 = rsudUser1;
	}

	public String getRsudUser2() {
		return this.rsudUser2;
	}

	public void setRsudUser2(String rsudUser2) {
		this.rsudUser2 = rsudUser2;
	}

	public Date getRsudRerouteDate() {
		return this.rsudRerouteDate;
	}

	public void setRsudRerouteDate(Date rsudRerouteDate) {
		this.rsudRerouteDate = rsudRerouteDate;
	}

	public String getRsudQadc01() {
		return this.rsudQadc01;
	}

	public void setRsudQadc01(String rsudQadc01) {
		this.rsudQadc01 = rsudQadc01;
	}

	public Double getOidRsudDet() {
		return this.oidRsudDet;
	}

	public void setOidRsudDet(Double oidRsudDet) {
		this.oidRsudDet = oidRsudDet;
	}

}