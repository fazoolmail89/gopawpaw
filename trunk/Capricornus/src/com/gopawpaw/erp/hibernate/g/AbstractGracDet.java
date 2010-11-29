package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGracDet entity provides the base persistence definition of the
 * GracDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGracDet implements java.io.Serializable {

	// Fields

	private GracDetId id;
	private Double gracAmt;
	private Double gracCurrAmt;
	private String gracUser1;
	private String gracUser2;
	private Double gracYtdBal;
	private Double gracBegBal;
	private Double gracBegCbal;
	private Double gracYtdCbal;
	private Double gracPerBal;
	private Double gracPerCbal;
	private String gracQadc01;
	private Double gracDrAmt;
	private Double gracCrAmt;
	private Double gracCrCurrAmt;
	private Double gracDrCurrAmt;
	private Double gracYtdCrAmt;
	private Double gracYtdDrAmt;
	private Double gracYtdCrCurrAmt;
	private Double gracYtdDrCurrAmt;
	private Double gracBegDrBal;
	private Double gracBegDrCbal;
	private Double gracBegCrBal;
	private Double gracBegCrCbal;
	private Double oidGracDet;

	// Constructors

	/** default constructor */
	public AbstractGracDet() {
	}

	/** minimal constructor */
	public AbstractGracDet(GracDetId id, Double gracDrAmt, Double gracCrAmt,
			Double gracCrCurrAmt, Double gracDrCurrAmt, Double gracYtdCrAmt,
			Double gracYtdDrAmt, Double gracYtdCrCurrAmt,
			Double gracYtdDrCurrAmt, Double gracBegDrBal, Double gracBegDrCbal,
			Double gracBegCrBal, Double gracBegCrCbal, Double oidGracDet) {
		this.id = id;
		this.gracDrAmt = gracDrAmt;
		this.gracCrAmt = gracCrAmt;
		this.gracCrCurrAmt = gracCrCurrAmt;
		this.gracDrCurrAmt = gracDrCurrAmt;
		this.gracYtdCrAmt = gracYtdCrAmt;
		this.gracYtdDrAmt = gracYtdDrAmt;
		this.gracYtdCrCurrAmt = gracYtdCrCurrAmt;
		this.gracYtdDrCurrAmt = gracYtdDrCurrAmt;
		this.gracBegDrBal = gracBegDrBal;
		this.gracBegDrCbal = gracBegDrCbal;
		this.gracBegCrBal = gracBegCrBal;
		this.gracBegCrCbal = gracBegCrCbal;
		this.oidGracDet = oidGracDet;
	}

	/** full constructor */
	public AbstractGracDet(GracDetId id, Double gracAmt, Double gracCurrAmt,
			String gracUser1, String gracUser2, Double gracYtdBal,
			Double gracBegBal, Double gracBegCbal, Double gracYtdCbal,
			Double gracPerBal, Double gracPerCbal, String gracQadc01,
			Double gracDrAmt, Double gracCrAmt, Double gracCrCurrAmt,
			Double gracDrCurrAmt, Double gracYtdCrAmt, Double gracYtdDrAmt,
			Double gracYtdCrCurrAmt, Double gracYtdDrCurrAmt,
			Double gracBegDrBal, Double gracBegDrCbal, Double gracBegCrBal,
			Double gracBegCrCbal, Double oidGracDet) {
		this.id = id;
		this.gracAmt = gracAmt;
		this.gracCurrAmt = gracCurrAmt;
		this.gracUser1 = gracUser1;
		this.gracUser2 = gracUser2;
		this.gracYtdBal = gracYtdBal;
		this.gracBegBal = gracBegBal;
		this.gracBegCbal = gracBegCbal;
		this.gracYtdCbal = gracYtdCbal;
		this.gracPerBal = gracPerBal;
		this.gracPerCbal = gracPerCbal;
		this.gracQadc01 = gracQadc01;
		this.gracDrAmt = gracDrAmt;
		this.gracCrAmt = gracCrAmt;
		this.gracCrCurrAmt = gracCrCurrAmt;
		this.gracDrCurrAmt = gracDrCurrAmt;
		this.gracYtdCrAmt = gracYtdCrAmt;
		this.gracYtdDrAmt = gracYtdDrAmt;
		this.gracYtdCrCurrAmt = gracYtdCrCurrAmt;
		this.gracYtdDrCurrAmt = gracYtdDrCurrAmt;
		this.gracBegDrBal = gracBegDrBal;
		this.gracBegDrCbal = gracBegDrCbal;
		this.gracBegCrBal = gracBegCrBal;
		this.gracBegCrCbal = gracBegCrCbal;
		this.oidGracDet = oidGracDet;
	}

	// Property accessors

	public GracDetId getId() {
		return this.id;
	}

	public void setId(GracDetId id) {
		this.id = id;
	}

	public Double getGracAmt() {
		return this.gracAmt;
	}

	public void setGracAmt(Double gracAmt) {
		this.gracAmt = gracAmt;
	}

	public Double getGracCurrAmt() {
		return this.gracCurrAmt;
	}

	public void setGracCurrAmt(Double gracCurrAmt) {
		this.gracCurrAmt = gracCurrAmt;
	}

	public String getGracUser1() {
		return this.gracUser1;
	}

	public void setGracUser1(String gracUser1) {
		this.gracUser1 = gracUser1;
	}

	public String getGracUser2() {
		return this.gracUser2;
	}

	public void setGracUser2(String gracUser2) {
		this.gracUser2 = gracUser2;
	}

	public Double getGracYtdBal() {
		return this.gracYtdBal;
	}

	public void setGracYtdBal(Double gracYtdBal) {
		this.gracYtdBal = gracYtdBal;
	}

	public Double getGracBegBal() {
		return this.gracBegBal;
	}

	public void setGracBegBal(Double gracBegBal) {
		this.gracBegBal = gracBegBal;
	}

	public Double getGracBegCbal() {
		return this.gracBegCbal;
	}

	public void setGracBegCbal(Double gracBegCbal) {
		this.gracBegCbal = gracBegCbal;
	}

	public Double getGracYtdCbal() {
		return this.gracYtdCbal;
	}

	public void setGracYtdCbal(Double gracYtdCbal) {
		this.gracYtdCbal = gracYtdCbal;
	}

	public Double getGracPerBal() {
		return this.gracPerBal;
	}

	public void setGracPerBal(Double gracPerBal) {
		this.gracPerBal = gracPerBal;
	}

	public Double getGracPerCbal() {
		return this.gracPerCbal;
	}

	public void setGracPerCbal(Double gracPerCbal) {
		this.gracPerCbal = gracPerCbal;
	}

	public String getGracQadc01() {
		return this.gracQadc01;
	}

	public void setGracQadc01(String gracQadc01) {
		this.gracQadc01 = gracQadc01;
	}

	public Double getGracDrAmt() {
		return this.gracDrAmt;
	}

	public void setGracDrAmt(Double gracDrAmt) {
		this.gracDrAmt = gracDrAmt;
	}

	public Double getGracCrAmt() {
		return this.gracCrAmt;
	}

	public void setGracCrAmt(Double gracCrAmt) {
		this.gracCrAmt = gracCrAmt;
	}

	public Double getGracCrCurrAmt() {
		return this.gracCrCurrAmt;
	}

	public void setGracCrCurrAmt(Double gracCrCurrAmt) {
		this.gracCrCurrAmt = gracCrCurrAmt;
	}

	public Double getGracDrCurrAmt() {
		return this.gracDrCurrAmt;
	}

	public void setGracDrCurrAmt(Double gracDrCurrAmt) {
		this.gracDrCurrAmt = gracDrCurrAmt;
	}

	public Double getGracYtdCrAmt() {
		return this.gracYtdCrAmt;
	}

	public void setGracYtdCrAmt(Double gracYtdCrAmt) {
		this.gracYtdCrAmt = gracYtdCrAmt;
	}

	public Double getGracYtdDrAmt() {
		return this.gracYtdDrAmt;
	}

	public void setGracYtdDrAmt(Double gracYtdDrAmt) {
		this.gracYtdDrAmt = gracYtdDrAmt;
	}

	public Double getGracYtdCrCurrAmt() {
		return this.gracYtdCrCurrAmt;
	}

	public void setGracYtdCrCurrAmt(Double gracYtdCrCurrAmt) {
		this.gracYtdCrCurrAmt = gracYtdCrCurrAmt;
	}

	public Double getGracYtdDrCurrAmt() {
		return this.gracYtdDrCurrAmt;
	}

	public void setGracYtdDrCurrAmt(Double gracYtdDrCurrAmt) {
		this.gracYtdDrCurrAmt = gracYtdDrCurrAmt;
	}

	public Double getGracBegDrBal() {
		return this.gracBegDrBal;
	}

	public void setGracBegDrBal(Double gracBegDrBal) {
		this.gracBegDrBal = gracBegDrBal;
	}

	public Double getGracBegDrCbal() {
		return this.gracBegDrCbal;
	}

	public void setGracBegDrCbal(Double gracBegDrCbal) {
		this.gracBegDrCbal = gracBegDrCbal;
	}

	public Double getGracBegCrBal() {
		return this.gracBegCrBal;
	}

	public void setGracBegCrBal(Double gracBegCrBal) {
		this.gracBegCrBal = gracBegCrBal;
	}

	public Double getGracBegCrCbal() {
		return this.gracBegCrCbal;
	}

	public void setGracBegCrCbal(Double gracBegCrCbal) {
		this.gracBegCrCbal = gracBegCrCbal;
	}

	public Double getOidGracDet() {
		return this.oidGracDet;
	}

	public void setOidGracDet(Double oidGracDet) {
		this.oidGracDet = oidGracDet;
	}

}