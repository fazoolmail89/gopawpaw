package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPlsdDet entity provides the base persistence definition of the
 * PlsdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlsdDet implements java.io.Serializable {

	// Fields

	private PlsdDetId id;
	private String plsdSlsAcct;
	private String plsdSlsCc;
	private String plsdDscAcct;
	private String plsdDscCc;
	private String plsdCbdnAcct;
	private String plsdCbdnCc;
	private String plsdClbrAcct;
	private String plsdClbrCc;
	private String plsdCmtlAcct;
	private String plsdCmtlCc;
	private String plsdCovhAcct;
	private String plsdCovhCc;
	private String plsdCsubAcct;
	private String plsdCsubCc;
	private String plsdUser1;
	private String plsdUser2;
	private String plsdUserid;
	private Date plsdModDate;
	private String plsdQadc01;
	private String plsdCbdnSub;
	private String plsdClbrSub;
	private String plsdCmtlSub;
	private String plsdCovhSub;
	private String plsdCsubSub;
	private String plsdDscSub;
	private String plsdSlsSub;
	private String plsdFsaccrAcct;
	private String plsdFsaccrSub;
	private String plsdFsaccrCc;
	private String plsdFsdefAcct;
	private String plsdFsdefSub;
	private String plsdFsdefCc;
	private Double oidPlsdDet;

	// Constructors

	/** default constructor */
	public AbstractPlsdDet() {
	}

	/** minimal constructor */
	public AbstractPlsdDet(PlsdDetId id, String plsdFsaccrAcct,
			String plsdFsaccrSub, String plsdFsaccrCc, String plsdFsdefAcct,
			String plsdFsdefSub, String plsdFsdefCc, Double oidPlsdDet) {
		this.id = id;
		this.plsdFsaccrAcct = plsdFsaccrAcct;
		this.plsdFsaccrSub = plsdFsaccrSub;
		this.plsdFsaccrCc = plsdFsaccrCc;
		this.plsdFsdefAcct = plsdFsdefAcct;
		this.plsdFsdefSub = plsdFsdefSub;
		this.plsdFsdefCc = plsdFsdefCc;
		this.oidPlsdDet = oidPlsdDet;
	}

	/** full constructor */
	public AbstractPlsdDet(PlsdDetId id, String plsdSlsAcct, String plsdSlsCc,
			String plsdDscAcct, String plsdDscCc, String plsdCbdnAcct,
			String plsdCbdnCc, String plsdClbrAcct, String plsdClbrCc,
			String plsdCmtlAcct, String plsdCmtlCc, String plsdCovhAcct,
			String plsdCovhCc, String plsdCsubAcct, String plsdCsubCc,
			String plsdUser1, String plsdUser2, String plsdUserid,
			Date plsdModDate, String plsdQadc01, String plsdCbdnSub,
			String plsdClbrSub, String plsdCmtlSub, String plsdCovhSub,
			String plsdCsubSub, String plsdDscSub, String plsdSlsSub,
			String plsdFsaccrAcct, String plsdFsaccrSub, String plsdFsaccrCc,
			String plsdFsdefAcct, String plsdFsdefSub, String plsdFsdefCc,
			Double oidPlsdDet) {
		this.id = id;
		this.plsdSlsAcct = plsdSlsAcct;
		this.plsdSlsCc = plsdSlsCc;
		this.plsdDscAcct = plsdDscAcct;
		this.plsdDscCc = plsdDscCc;
		this.plsdCbdnAcct = plsdCbdnAcct;
		this.plsdCbdnCc = plsdCbdnCc;
		this.plsdClbrAcct = plsdClbrAcct;
		this.plsdClbrCc = plsdClbrCc;
		this.plsdCmtlAcct = plsdCmtlAcct;
		this.plsdCmtlCc = plsdCmtlCc;
		this.plsdCovhAcct = plsdCovhAcct;
		this.plsdCovhCc = plsdCovhCc;
		this.plsdCsubAcct = plsdCsubAcct;
		this.plsdCsubCc = plsdCsubCc;
		this.plsdUser1 = plsdUser1;
		this.plsdUser2 = plsdUser2;
		this.plsdUserid = plsdUserid;
		this.plsdModDate = plsdModDate;
		this.plsdQadc01 = plsdQadc01;
		this.plsdCbdnSub = plsdCbdnSub;
		this.plsdClbrSub = plsdClbrSub;
		this.plsdCmtlSub = plsdCmtlSub;
		this.plsdCovhSub = plsdCovhSub;
		this.plsdCsubSub = plsdCsubSub;
		this.plsdDscSub = plsdDscSub;
		this.plsdSlsSub = plsdSlsSub;
		this.plsdFsaccrAcct = plsdFsaccrAcct;
		this.plsdFsaccrSub = plsdFsaccrSub;
		this.plsdFsaccrCc = plsdFsaccrCc;
		this.plsdFsdefAcct = plsdFsdefAcct;
		this.plsdFsdefSub = plsdFsdefSub;
		this.plsdFsdefCc = plsdFsdefCc;
		this.oidPlsdDet = oidPlsdDet;
	}

	// Property accessors

	public PlsdDetId getId() {
		return this.id;
	}

	public void setId(PlsdDetId id) {
		this.id = id;
	}

	public String getPlsdSlsAcct() {
		return this.plsdSlsAcct;
	}

	public void setPlsdSlsAcct(String plsdSlsAcct) {
		this.plsdSlsAcct = plsdSlsAcct;
	}

	public String getPlsdSlsCc() {
		return this.plsdSlsCc;
	}

	public void setPlsdSlsCc(String plsdSlsCc) {
		this.plsdSlsCc = plsdSlsCc;
	}

	public String getPlsdDscAcct() {
		return this.plsdDscAcct;
	}

	public void setPlsdDscAcct(String plsdDscAcct) {
		this.plsdDscAcct = plsdDscAcct;
	}

	public String getPlsdDscCc() {
		return this.plsdDscCc;
	}

	public void setPlsdDscCc(String plsdDscCc) {
		this.plsdDscCc = plsdDscCc;
	}

	public String getPlsdCbdnAcct() {
		return this.plsdCbdnAcct;
	}

	public void setPlsdCbdnAcct(String plsdCbdnAcct) {
		this.plsdCbdnAcct = plsdCbdnAcct;
	}

	public String getPlsdCbdnCc() {
		return this.plsdCbdnCc;
	}

	public void setPlsdCbdnCc(String plsdCbdnCc) {
		this.plsdCbdnCc = plsdCbdnCc;
	}

	public String getPlsdClbrAcct() {
		return this.plsdClbrAcct;
	}

	public void setPlsdClbrAcct(String plsdClbrAcct) {
		this.plsdClbrAcct = plsdClbrAcct;
	}

	public String getPlsdClbrCc() {
		return this.plsdClbrCc;
	}

	public void setPlsdClbrCc(String plsdClbrCc) {
		this.plsdClbrCc = plsdClbrCc;
	}

	public String getPlsdCmtlAcct() {
		return this.plsdCmtlAcct;
	}

	public void setPlsdCmtlAcct(String plsdCmtlAcct) {
		this.plsdCmtlAcct = plsdCmtlAcct;
	}

	public String getPlsdCmtlCc() {
		return this.plsdCmtlCc;
	}

	public void setPlsdCmtlCc(String plsdCmtlCc) {
		this.plsdCmtlCc = plsdCmtlCc;
	}

	public String getPlsdCovhAcct() {
		return this.plsdCovhAcct;
	}

	public void setPlsdCovhAcct(String plsdCovhAcct) {
		this.plsdCovhAcct = plsdCovhAcct;
	}

	public String getPlsdCovhCc() {
		return this.plsdCovhCc;
	}

	public void setPlsdCovhCc(String plsdCovhCc) {
		this.plsdCovhCc = plsdCovhCc;
	}

	public String getPlsdCsubAcct() {
		return this.plsdCsubAcct;
	}

	public void setPlsdCsubAcct(String plsdCsubAcct) {
		this.plsdCsubAcct = plsdCsubAcct;
	}

	public String getPlsdCsubCc() {
		return this.plsdCsubCc;
	}

	public void setPlsdCsubCc(String plsdCsubCc) {
		this.plsdCsubCc = plsdCsubCc;
	}

	public String getPlsdUser1() {
		return this.plsdUser1;
	}

	public void setPlsdUser1(String plsdUser1) {
		this.plsdUser1 = plsdUser1;
	}

	public String getPlsdUser2() {
		return this.plsdUser2;
	}

	public void setPlsdUser2(String plsdUser2) {
		this.plsdUser2 = plsdUser2;
	}

	public String getPlsdUserid() {
		return this.plsdUserid;
	}

	public void setPlsdUserid(String plsdUserid) {
		this.plsdUserid = plsdUserid;
	}

	public Date getPlsdModDate() {
		return this.plsdModDate;
	}

	public void setPlsdModDate(Date plsdModDate) {
		this.plsdModDate = plsdModDate;
	}

	public String getPlsdQadc01() {
		return this.plsdQadc01;
	}

	public void setPlsdQadc01(String plsdQadc01) {
		this.plsdQadc01 = plsdQadc01;
	}

	public String getPlsdCbdnSub() {
		return this.plsdCbdnSub;
	}

	public void setPlsdCbdnSub(String plsdCbdnSub) {
		this.plsdCbdnSub = plsdCbdnSub;
	}

	public String getPlsdClbrSub() {
		return this.plsdClbrSub;
	}

	public void setPlsdClbrSub(String plsdClbrSub) {
		this.plsdClbrSub = plsdClbrSub;
	}

	public String getPlsdCmtlSub() {
		return this.plsdCmtlSub;
	}

	public void setPlsdCmtlSub(String plsdCmtlSub) {
		this.plsdCmtlSub = plsdCmtlSub;
	}

	public String getPlsdCovhSub() {
		return this.plsdCovhSub;
	}

	public void setPlsdCovhSub(String plsdCovhSub) {
		this.plsdCovhSub = plsdCovhSub;
	}

	public String getPlsdCsubSub() {
		return this.plsdCsubSub;
	}

	public void setPlsdCsubSub(String plsdCsubSub) {
		this.plsdCsubSub = plsdCsubSub;
	}

	public String getPlsdDscSub() {
		return this.plsdDscSub;
	}

	public void setPlsdDscSub(String plsdDscSub) {
		this.plsdDscSub = plsdDscSub;
	}

	public String getPlsdSlsSub() {
		return this.plsdSlsSub;
	}

	public void setPlsdSlsSub(String plsdSlsSub) {
		this.plsdSlsSub = plsdSlsSub;
	}

	public String getPlsdFsaccrAcct() {
		return this.plsdFsaccrAcct;
	}

	public void setPlsdFsaccrAcct(String plsdFsaccrAcct) {
		this.plsdFsaccrAcct = plsdFsaccrAcct;
	}

	public String getPlsdFsaccrSub() {
		return this.plsdFsaccrSub;
	}

	public void setPlsdFsaccrSub(String plsdFsaccrSub) {
		this.plsdFsaccrSub = plsdFsaccrSub;
	}

	public String getPlsdFsaccrCc() {
		return this.plsdFsaccrCc;
	}

	public void setPlsdFsaccrCc(String plsdFsaccrCc) {
		this.plsdFsaccrCc = plsdFsaccrCc;
	}

	public String getPlsdFsdefAcct() {
		return this.plsdFsdefAcct;
	}

	public void setPlsdFsdefAcct(String plsdFsdefAcct) {
		this.plsdFsdefAcct = plsdFsdefAcct;
	}

	public String getPlsdFsdefSub() {
		return this.plsdFsdefSub;
	}

	public void setPlsdFsdefSub(String plsdFsdefSub) {
		this.plsdFsdefSub = plsdFsdefSub;
	}

	public String getPlsdFsdefCc() {
		return this.plsdFsdefCc;
	}

	public void setPlsdFsdefCc(String plsdFsdefCc) {
		this.plsdFsdefCc = plsdFsdefCc;
	}

	public Double getOidPlsdDet() {
		return this.oidPlsdDet;
	}

	public void setOidPlsdDet(Double oidPlsdDet) {
		this.oidPlsdDet = oidPlsdDet;
	}

}