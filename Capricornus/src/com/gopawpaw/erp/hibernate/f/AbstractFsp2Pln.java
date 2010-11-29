package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFsp2Pln entity provides the base persistence definition of the
 * Fsp2Pln entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFsp2Pln implements java.io.Serializable {

	// Fields

	private Fsp2PlnId id;
	private Double fsp2BegInv;
	private String fsp2InvAct;
	private String fsp2InvFcst;
	private String fsp2OrdAct;
	private String fsp2OrdFcst;
	private Double fsp2Percent;
	private Double fsp2ProdRate;
	private Double fsp2SimRate;
	private Double fsp2SrcPct;
	private Double fsp2Target;
	private String fsp2User1;
	private String fsp2User2;
	private String fsp2ModUserid;
	private Date fsp2ModDate;
	private String fsp2Qadc01;
	private Double oidFsp2Pln;

	// Constructors

	/** default constructor */
	public AbstractFsp2Pln() {
	}

	/** minimal constructor */
	public AbstractFsp2Pln(Fsp2PlnId id, Double oidFsp2Pln) {
		this.id = id;
		this.oidFsp2Pln = oidFsp2Pln;
	}

	/** full constructor */
	public AbstractFsp2Pln(Fsp2PlnId id, Double fsp2BegInv, String fsp2InvAct,
			String fsp2InvFcst, String fsp2OrdAct, String fsp2OrdFcst,
			Double fsp2Percent, Double fsp2ProdRate, Double fsp2SimRate,
			Double fsp2SrcPct, Double fsp2Target, String fsp2User1,
			String fsp2User2, String fsp2ModUserid, Date fsp2ModDate,
			String fsp2Qadc01, Double oidFsp2Pln) {
		this.id = id;
		this.fsp2BegInv = fsp2BegInv;
		this.fsp2InvAct = fsp2InvAct;
		this.fsp2InvFcst = fsp2InvFcst;
		this.fsp2OrdAct = fsp2OrdAct;
		this.fsp2OrdFcst = fsp2OrdFcst;
		this.fsp2Percent = fsp2Percent;
		this.fsp2ProdRate = fsp2ProdRate;
		this.fsp2SimRate = fsp2SimRate;
		this.fsp2SrcPct = fsp2SrcPct;
		this.fsp2Target = fsp2Target;
		this.fsp2User1 = fsp2User1;
		this.fsp2User2 = fsp2User2;
		this.fsp2ModUserid = fsp2ModUserid;
		this.fsp2ModDate = fsp2ModDate;
		this.fsp2Qadc01 = fsp2Qadc01;
		this.oidFsp2Pln = oidFsp2Pln;
	}

	// Property accessors

	public Fsp2PlnId getId() {
		return this.id;
	}

	public void setId(Fsp2PlnId id) {
		this.id = id;
	}

	public Double getFsp2BegInv() {
		return this.fsp2BegInv;
	}

	public void setFsp2BegInv(Double fsp2BegInv) {
		this.fsp2BegInv = fsp2BegInv;
	}

	public String getFsp2InvAct() {
		return this.fsp2InvAct;
	}

	public void setFsp2InvAct(String fsp2InvAct) {
		this.fsp2InvAct = fsp2InvAct;
	}

	public String getFsp2InvFcst() {
		return this.fsp2InvFcst;
	}

	public void setFsp2InvFcst(String fsp2InvFcst) {
		this.fsp2InvFcst = fsp2InvFcst;
	}

	public String getFsp2OrdAct() {
		return this.fsp2OrdAct;
	}

	public void setFsp2OrdAct(String fsp2OrdAct) {
		this.fsp2OrdAct = fsp2OrdAct;
	}

	public String getFsp2OrdFcst() {
		return this.fsp2OrdFcst;
	}

	public void setFsp2OrdFcst(String fsp2OrdFcst) {
		this.fsp2OrdFcst = fsp2OrdFcst;
	}

	public Double getFsp2Percent() {
		return this.fsp2Percent;
	}

	public void setFsp2Percent(Double fsp2Percent) {
		this.fsp2Percent = fsp2Percent;
	}

	public Double getFsp2ProdRate() {
		return this.fsp2ProdRate;
	}

	public void setFsp2ProdRate(Double fsp2ProdRate) {
		this.fsp2ProdRate = fsp2ProdRate;
	}

	public Double getFsp2SimRate() {
		return this.fsp2SimRate;
	}

	public void setFsp2SimRate(Double fsp2SimRate) {
		this.fsp2SimRate = fsp2SimRate;
	}

	public Double getFsp2SrcPct() {
		return this.fsp2SrcPct;
	}

	public void setFsp2SrcPct(Double fsp2SrcPct) {
		this.fsp2SrcPct = fsp2SrcPct;
	}

	public Double getFsp2Target() {
		return this.fsp2Target;
	}

	public void setFsp2Target(Double fsp2Target) {
		this.fsp2Target = fsp2Target;
	}

	public String getFsp2User1() {
		return this.fsp2User1;
	}

	public void setFsp2User1(String fsp2User1) {
		this.fsp2User1 = fsp2User1;
	}

	public String getFsp2User2() {
		return this.fsp2User2;
	}

	public void setFsp2User2(String fsp2User2) {
		this.fsp2User2 = fsp2User2;
	}

	public String getFsp2ModUserid() {
		return this.fsp2ModUserid;
	}

	public void setFsp2ModUserid(String fsp2ModUserid) {
		this.fsp2ModUserid = fsp2ModUserid;
	}

	public Date getFsp2ModDate() {
		return this.fsp2ModDate;
	}

	public void setFsp2ModDate(Date fsp2ModDate) {
		this.fsp2ModDate = fsp2ModDate;
	}

	public String getFsp2Qadc01() {
		return this.fsp2Qadc01;
	}

	public void setFsp2Qadc01(String fsp2Qadc01) {
		this.fsp2Qadc01 = fsp2Qadc01;
	}

	public Double getOidFsp2Pln() {
		return this.oidFsp2Pln;
	}

	public void setOidFsp2Pln(Double oidFsp2Pln) {
		this.oidFsp2Pln = oidFsp2Pln;
	}

}