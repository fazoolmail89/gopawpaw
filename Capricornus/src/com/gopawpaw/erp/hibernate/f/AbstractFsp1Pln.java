package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFsp1Pln entity provides the base persistence definition of the
 * Fsp1Pln entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFsp1Pln implements java.io.Serializable {

	// Fields

	private Fsp1PlnId id;
	private Double fsp1BegInv;
	private String fsp1BklgAct;
	private String fsp1BklgFcst;
	private String fsp1CostAct;
	private String fsp1CostFcst;
	private Double fsp1Percent;
	private Double fsp1ProdRate;
	private Double fsp1SimRate;
	private Double fsp1SrcPct;
	private Double fsp1Target;
	private String fsp1User1;
	private String fsp1User2;
	private String fsp1ModUserid;
	private Date fsp1ModDate;
	private String fsp1Qadc01;
	private Double oidFsp1Pln;

	// Constructors

	/** default constructor */
	public AbstractFsp1Pln() {
	}

	/** minimal constructor */
	public AbstractFsp1Pln(Fsp1PlnId id, Double oidFsp1Pln) {
		this.id = id;
		this.oidFsp1Pln = oidFsp1Pln;
	}

	/** full constructor */
	public AbstractFsp1Pln(Fsp1PlnId id, Double fsp1BegInv, String fsp1BklgAct,
			String fsp1BklgFcst, String fsp1CostAct, String fsp1CostFcst,
			Double fsp1Percent, Double fsp1ProdRate, Double fsp1SimRate,
			Double fsp1SrcPct, Double fsp1Target, String fsp1User1,
			String fsp1User2, String fsp1ModUserid, Date fsp1ModDate,
			String fsp1Qadc01, Double oidFsp1Pln) {
		this.id = id;
		this.fsp1BegInv = fsp1BegInv;
		this.fsp1BklgAct = fsp1BklgAct;
		this.fsp1BklgFcst = fsp1BklgFcst;
		this.fsp1CostAct = fsp1CostAct;
		this.fsp1CostFcst = fsp1CostFcst;
		this.fsp1Percent = fsp1Percent;
		this.fsp1ProdRate = fsp1ProdRate;
		this.fsp1SimRate = fsp1SimRate;
		this.fsp1SrcPct = fsp1SrcPct;
		this.fsp1Target = fsp1Target;
		this.fsp1User1 = fsp1User1;
		this.fsp1User2 = fsp1User2;
		this.fsp1ModUserid = fsp1ModUserid;
		this.fsp1ModDate = fsp1ModDate;
		this.fsp1Qadc01 = fsp1Qadc01;
		this.oidFsp1Pln = oidFsp1Pln;
	}

	// Property accessors

	public Fsp1PlnId getId() {
		return this.id;
	}

	public void setId(Fsp1PlnId id) {
		this.id = id;
	}

	public Double getFsp1BegInv() {
		return this.fsp1BegInv;
	}

	public void setFsp1BegInv(Double fsp1BegInv) {
		this.fsp1BegInv = fsp1BegInv;
	}

	public String getFsp1BklgAct() {
		return this.fsp1BklgAct;
	}

	public void setFsp1BklgAct(String fsp1BklgAct) {
		this.fsp1BklgAct = fsp1BklgAct;
	}

	public String getFsp1BklgFcst() {
		return this.fsp1BklgFcst;
	}

	public void setFsp1BklgFcst(String fsp1BklgFcst) {
		this.fsp1BklgFcst = fsp1BklgFcst;
	}

	public String getFsp1CostAct() {
		return this.fsp1CostAct;
	}

	public void setFsp1CostAct(String fsp1CostAct) {
		this.fsp1CostAct = fsp1CostAct;
	}

	public String getFsp1CostFcst() {
		return this.fsp1CostFcst;
	}

	public void setFsp1CostFcst(String fsp1CostFcst) {
		this.fsp1CostFcst = fsp1CostFcst;
	}

	public Double getFsp1Percent() {
		return this.fsp1Percent;
	}

	public void setFsp1Percent(Double fsp1Percent) {
		this.fsp1Percent = fsp1Percent;
	}

	public Double getFsp1ProdRate() {
		return this.fsp1ProdRate;
	}

	public void setFsp1ProdRate(Double fsp1ProdRate) {
		this.fsp1ProdRate = fsp1ProdRate;
	}

	public Double getFsp1SimRate() {
		return this.fsp1SimRate;
	}

	public void setFsp1SimRate(Double fsp1SimRate) {
		this.fsp1SimRate = fsp1SimRate;
	}

	public Double getFsp1SrcPct() {
		return this.fsp1SrcPct;
	}

	public void setFsp1SrcPct(Double fsp1SrcPct) {
		this.fsp1SrcPct = fsp1SrcPct;
	}

	public Double getFsp1Target() {
		return this.fsp1Target;
	}

	public void setFsp1Target(Double fsp1Target) {
		this.fsp1Target = fsp1Target;
	}

	public String getFsp1User1() {
		return this.fsp1User1;
	}

	public void setFsp1User1(String fsp1User1) {
		this.fsp1User1 = fsp1User1;
	}

	public String getFsp1User2() {
		return this.fsp1User2;
	}

	public void setFsp1User2(String fsp1User2) {
		this.fsp1User2 = fsp1User2;
	}

	public String getFsp1ModUserid() {
		return this.fsp1ModUserid;
	}

	public void setFsp1ModUserid(String fsp1ModUserid) {
		this.fsp1ModUserid = fsp1ModUserid;
	}

	public Date getFsp1ModDate() {
		return this.fsp1ModDate;
	}

	public void setFsp1ModDate(Date fsp1ModDate) {
		this.fsp1ModDate = fsp1ModDate;
	}

	public String getFsp1Qadc01() {
		return this.fsp1Qadc01;
	}

	public void setFsp1Qadc01(String fsp1Qadc01) {
		this.fsp1Qadc01 = fsp1Qadc01;
	}

	public Double getOidFsp1Pln() {
		return this.oidFsp1Pln;
	}

	public void setOidFsp1Pln(Double oidFsp1Pln) {
		this.oidFsp1Pln = oidFsp1Pln;
	}

}