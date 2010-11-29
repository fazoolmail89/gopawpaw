package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLadDet entity provides the base persistence definition of the LadDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLadDet implements java.io.Serializable {

	// Fields

	private LadDetId id;
	private Double ladQtyAll;
	private Double ladQtyPick;
	private Double ladQtyChg;
	private String ladUser1;
	private String ladUser2;
	private String ladOrdSite;
	private String ladQadc01;
	private Double oidLadDet;

	// Constructors

	/** default constructor */
	public AbstractLadDet() {
	}

	/** minimal constructor */
	public AbstractLadDet(LadDetId id, Double oidLadDet) {
		this.id = id;
		this.oidLadDet = oidLadDet;
	}

	/** full constructor */
	public AbstractLadDet(LadDetId id, Double ladQtyAll, Double ladQtyPick,
			Double ladQtyChg, String ladUser1, String ladUser2,
			String ladOrdSite, String ladQadc01, Double oidLadDet) {
		this.id = id;
		this.ladQtyAll = ladQtyAll;
		this.ladQtyPick = ladQtyPick;
		this.ladQtyChg = ladQtyChg;
		this.ladUser1 = ladUser1;
		this.ladUser2 = ladUser2;
		this.ladOrdSite = ladOrdSite;
		this.ladQadc01 = ladQadc01;
		this.oidLadDet = oidLadDet;
	}

	// Property accessors

	public LadDetId getId() {
		return this.id;
	}

	public void setId(LadDetId id) {
		this.id = id;
	}

	public Double getLadQtyAll() {
		return this.ladQtyAll;
	}

	public void setLadQtyAll(Double ladQtyAll) {
		this.ladQtyAll = ladQtyAll;
	}

	public Double getLadQtyPick() {
		return this.ladQtyPick;
	}

	public void setLadQtyPick(Double ladQtyPick) {
		this.ladQtyPick = ladQtyPick;
	}

	public Double getLadQtyChg() {
		return this.ladQtyChg;
	}

	public void setLadQtyChg(Double ladQtyChg) {
		this.ladQtyChg = ladQtyChg;
	}

	public String getLadUser1() {
		return this.ladUser1;
	}

	public void setLadUser1(String ladUser1) {
		this.ladUser1 = ladUser1;
	}

	public String getLadUser2() {
		return this.ladUser2;
	}

	public void setLadUser2(String ladUser2) {
		this.ladUser2 = ladUser2;
	}

	public String getLadOrdSite() {
		return this.ladOrdSite;
	}

	public void setLadOrdSite(String ladOrdSite) {
		this.ladOrdSite = ladOrdSite;
	}

	public String getLadQadc01() {
		return this.ladQadc01;
	}

	public void setLadQadc01(String ladQadc01) {
		this.ladQadc01 = ladQadc01;
	}

	public Double getOidLadDet() {
		return this.oidLadDet;
	}

	public void setOidLadDet(Double oidLadDet) {
		this.oidLadDet = oidLadDet;
	}

}