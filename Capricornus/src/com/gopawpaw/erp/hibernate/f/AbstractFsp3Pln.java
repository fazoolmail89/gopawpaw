package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFsp3Pln entity provides the base persistence definition of the
 * Fsp3Pln entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFsp3Pln implements java.io.Serializable {

	// Fields

	private Fsp3PlnId id;
	private Double fsp3BegInv;
	private String fsp3ProdAct;
	private String fsp3ProdFcst;
	private String fsp3ShipAct;
	private String fsp3ShipFcst;
	private Double fsp3Percent;
	private Double fsp3ProdRate;
	private Double fsp3SimRate;
	private Double fsp3SrcPct;
	private Double fsp3Target;
	private String fsp3User1;
	private String fsp3User2;
	private String fsp3ModUserid;
	private Date fsp3ModDate;
	private String fsp3Qadc01;
	private Double oidFsp3Pln;

	// Constructors

	/** default constructor */
	public AbstractFsp3Pln() {
	}

	/** minimal constructor */
	public AbstractFsp3Pln(Fsp3PlnId id, Double oidFsp3Pln) {
		this.id = id;
		this.oidFsp3Pln = oidFsp3Pln;
	}

	/** full constructor */
	public AbstractFsp3Pln(Fsp3PlnId id, Double fsp3BegInv, String fsp3ProdAct,
			String fsp3ProdFcst, String fsp3ShipAct, String fsp3ShipFcst,
			Double fsp3Percent, Double fsp3ProdRate, Double fsp3SimRate,
			Double fsp3SrcPct, Double fsp3Target, String fsp3User1,
			String fsp3User2, String fsp3ModUserid, Date fsp3ModDate,
			String fsp3Qadc01, Double oidFsp3Pln) {
		this.id = id;
		this.fsp3BegInv = fsp3BegInv;
		this.fsp3ProdAct = fsp3ProdAct;
		this.fsp3ProdFcst = fsp3ProdFcst;
		this.fsp3ShipAct = fsp3ShipAct;
		this.fsp3ShipFcst = fsp3ShipFcst;
		this.fsp3Percent = fsp3Percent;
		this.fsp3ProdRate = fsp3ProdRate;
		this.fsp3SimRate = fsp3SimRate;
		this.fsp3SrcPct = fsp3SrcPct;
		this.fsp3Target = fsp3Target;
		this.fsp3User1 = fsp3User1;
		this.fsp3User2 = fsp3User2;
		this.fsp3ModUserid = fsp3ModUserid;
		this.fsp3ModDate = fsp3ModDate;
		this.fsp3Qadc01 = fsp3Qadc01;
		this.oidFsp3Pln = oidFsp3Pln;
	}

	// Property accessors

	public Fsp3PlnId getId() {
		return this.id;
	}

	public void setId(Fsp3PlnId id) {
		this.id = id;
	}

	public Double getFsp3BegInv() {
		return this.fsp3BegInv;
	}

	public void setFsp3BegInv(Double fsp3BegInv) {
		this.fsp3BegInv = fsp3BegInv;
	}

	public String getFsp3ProdAct() {
		return this.fsp3ProdAct;
	}

	public void setFsp3ProdAct(String fsp3ProdAct) {
		this.fsp3ProdAct = fsp3ProdAct;
	}

	public String getFsp3ProdFcst() {
		return this.fsp3ProdFcst;
	}

	public void setFsp3ProdFcst(String fsp3ProdFcst) {
		this.fsp3ProdFcst = fsp3ProdFcst;
	}

	public String getFsp3ShipAct() {
		return this.fsp3ShipAct;
	}

	public void setFsp3ShipAct(String fsp3ShipAct) {
		this.fsp3ShipAct = fsp3ShipAct;
	}

	public String getFsp3ShipFcst() {
		return this.fsp3ShipFcst;
	}

	public void setFsp3ShipFcst(String fsp3ShipFcst) {
		this.fsp3ShipFcst = fsp3ShipFcst;
	}

	public Double getFsp3Percent() {
		return this.fsp3Percent;
	}

	public void setFsp3Percent(Double fsp3Percent) {
		this.fsp3Percent = fsp3Percent;
	}

	public Double getFsp3ProdRate() {
		return this.fsp3ProdRate;
	}

	public void setFsp3ProdRate(Double fsp3ProdRate) {
		this.fsp3ProdRate = fsp3ProdRate;
	}

	public Double getFsp3SimRate() {
		return this.fsp3SimRate;
	}

	public void setFsp3SimRate(Double fsp3SimRate) {
		this.fsp3SimRate = fsp3SimRate;
	}

	public Double getFsp3SrcPct() {
		return this.fsp3SrcPct;
	}

	public void setFsp3SrcPct(Double fsp3SrcPct) {
		this.fsp3SrcPct = fsp3SrcPct;
	}

	public Double getFsp3Target() {
		return this.fsp3Target;
	}

	public void setFsp3Target(Double fsp3Target) {
		this.fsp3Target = fsp3Target;
	}

	public String getFsp3User1() {
		return this.fsp3User1;
	}

	public void setFsp3User1(String fsp3User1) {
		this.fsp3User1 = fsp3User1;
	}

	public String getFsp3User2() {
		return this.fsp3User2;
	}

	public void setFsp3User2(String fsp3User2) {
		this.fsp3User2 = fsp3User2;
	}

	public String getFsp3ModUserid() {
		return this.fsp3ModUserid;
	}

	public void setFsp3ModUserid(String fsp3ModUserid) {
		this.fsp3ModUserid = fsp3ModUserid;
	}

	public Date getFsp3ModDate() {
		return this.fsp3ModDate;
	}

	public void setFsp3ModDate(Date fsp3ModDate) {
		this.fsp3ModDate = fsp3ModDate;
	}

	public String getFsp3Qadc01() {
		return this.fsp3Qadc01;
	}

	public void setFsp3Qadc01(String fsp3Qadc01) {
		this.fsp3Qadc01 = fsp3Qadc01;
	}

	public Double getOidFsp3Pln() {
		return this.oidFsp3Pln;
	}

	public void setOidFsp3Pln(Double oidFsp3Pln) {
		this.oidFsp3Pln = oidFsp3Pln;
	}

}