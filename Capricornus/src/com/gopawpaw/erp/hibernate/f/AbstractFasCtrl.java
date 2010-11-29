package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFasCtrl entity provides the base persistence definition of the
 * FasCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFasCtrl implements java.io.Serializable {

	// Fields

	private Integer fasIndex1;
	private String fasGainAcct;
	private String fasGainCc;
	private String fasGainSub;
	private String fasLossAcct;
	private String fasLossSub;
	private String fasLossCc;
	private String fasUser1;
	private String fasUser2;
	private Double fasMinimum;
	private Boolean fasDetail;
	private Boolean fasShortYear;
	private String fasUserid;
	private Date fasModDate;
	private Integer fasNextAsset;
	private Date fasShortEnd;
	private Boolean fasQad01;
	private String fasQad02;
	private String fasQad03;
	private Double oidFasCtrl;

	// Constructors

	/** default constructor */
	public AbstractFasCtrl() {
	}

	/** minimal constructor */
	public AbstractFasCtrl(Double oidFasCtrl) {
		this.oidFasCtrl = oidFasCtrl;
	}

	/** full constructor */
	public AbstractFasCtrl(String fasGainAcct, String fasGainCc,
			String fasGainSub, String fasLossAcct, String fasLossSub,
			String fasLossCc, String fasUser1, String fasUser2,
			Double fasMinimum, Boolean fasDetail, Boolean fasShortYear,
			String fasUserid, Date fasModDate, Integer fasNextAsset,
			Date fasShortEnd, Boolean fasQad01, String fasQad02,
			String fasQad03, Double oidFasCtrl) {
		this.fasGainAcct = fasGainAcct;
		this.fasGainCc = fasGainCc;
		this.fasGainSub = fasGainSub;
		this.fasLossAcct = fasLossAcct;
		this.fasLossSub = fasLossSub;
		this.fasLossCc = fasLossCc;
		this.fasUser1 = fasUser1;
		this.fasUser2 = fasUser2;
		this.fasMinimum = fasMinimum;
		this.fasDetail = fasDetail;
		this.fasShortYear = fasShortYear;
		this.fasUserid = fasUserid;
		this.fasModDate = fasModDate;
		this.fasNextAsset = fasNextAsset;
		this.fasShortEnd = fasShortEnd;
		this.fasQad01 = fasQad01;
		this.fasQad02 = fasQad02;
		this.fasQad03 = fasQad03;
		this.oidFasCtrl = oidFasCtrl;
	}

	// Property accessors

	public Integer getFasIndex1() {
		return this.fasIndex1;
	}

	public void setFasIndex1(Integer fasIndex1) {
		this.fasIndex1 = fasIndex1;
	}

	public String getFasGainAcct() {
		return this.fasGainAcct;
	}

	public void setFasGainAcct(String fasGainAcct) {
		this.fasGainAcct = fasGainAcct;
	}

	public String getFasGainCc() {
		return this.fasGainCc;
	}

	public void setFasGainCc(String fasGainCc) {
		this.fasGainCc = fasGainCc;
	}

	public String getFasGainSub() {
		return this.fasGainSub;
	}

	public void setFasGainSub(String fasGainSub) {
		this.fasGainSub = fasGainSub;
	}

	public String getFasLossAcct() {
		return this.fasLossAcct;
	}

	public void setFasLossAcct(String fasLossAcct) {
		this.fasLossAcct = fasLossAcct;
	}

	public String getFasLossSub() {
		return this.fasLossSub;
	}

	public void setFasLossSub(String fasLossSub) {
		this.fasLossSub = fasLossSub;
	}

	public String getFasLossCc() {
		return this.fasLossCc;
	}

	public void setFasLossCc(String fasLossCc) {
		this.fasLossCc = fasLossCc;
	}

	public String getFasUser1() {
		return this.fasUser1;
	}

	public void setFasUser1(String fasUser1) {
		this.fasUser1 = fasUser1;
	}

	public String getFasUser2() {
		return this.fasUser2;
	}

	public void setFasUser2(String fasUser2) {
		this.fasUser2 = fasUser2;
	}

	public Double getFasMinimum() {
		return this.fasMinimum;
	}

	public void setFasMinimum(Double fasMinimum) {
		this.fasMinimum = fasMinimum;
	}

	public Boolean getFasDetail() {
		return this.fasDetail;
	}

	public void setFasDetail(Boolean fasDetail) {
		this.fasDetail = fasDetail;
	}

	public Boolean getFasShortYear() {
		return this.fasShortYear;
	}

	public void setFasShortYear(Boolean fasShortYear) {
		this.fasShortYear = fasShortYear;
	}

	public String getFasUserid() {
		return this.fasUserid;
	}

	public void setFasUserid(String fasUserid) {
		this.fasUserid = fasUserid;
	}

	public Date getFasModDate() {
		return this.fasModDate;
	}

	public void setFasModDate(Date fasModDate) {
		this.fasModDate = fasModDate;
	}

	public Integer getFasNextAsset() {
		return this.fasNextAsset;
	}

	public void setFasNextAsset(Integer fasNextAsset) {
		this.fasNextAsset = fasNextAsset;
	}

	public Date getFasShortEnd() {
		return this.fasShortEnd;
	}

	public void setFasShortEnd(Date fasShortEnd) {
		this.fasShortEnd = fasShortEnd;
	}

	public Boolean getFasQad01() {
		return this.fasQad01;
	}

	public void setFasQad01(Boolean fasQad01) {
		this.fasQad01 = fasQad01;
	}

	public String getFasQad02() {
		return this.fasQad02;
	}

	public void setFasQad02(String fasQad02) {
		this.fasQad02 = fasQad02;
	}

	public String getFasQad03() {
		return this.fasQad03;
	}

	public void setFasQad03(String fasQad03) {
		this.fasQad03 = fasQad03;
	}

	public Double getOidFasCtrl() {
		return this.oidFasCtrl;
	}

	public void setOidFasCtrl(Double oidFasCtrl) {
		this.oidFasCtrl = oidFasCtrl;
	}

}