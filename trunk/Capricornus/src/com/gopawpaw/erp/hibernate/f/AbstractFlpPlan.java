package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFlpPlan entity provides the base persistence definition of the
 * FlpPlan entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlpPlan implements java.io.Serializable {

	// Fields

	private FlpPlanId id;
	private String flpProdFcst;
	private String flpProdAct;
	private String flpUser1;
	private String flpUser2;
	private Double flpDec01;
	private Double flpDec02;
	private String flpDec03;
	private String flpDec04;
	private Double oidFlpPlan;

	// Constructors

	/** default constructor */
	public AbstractFlpPlan() {
	}

	/** minimal constructor */
	public AbstractFlpPlan(FlpPlanId id, Double oidFlpPlan) {
		this.id = id;
		this.oidFlpPlan = oidFlpPlan;
	}

	/** full constructor */
	public AbstractFlpPlan(FlpPlanId id, String flpProdFcst, String flpProdAct,
			String flpUser1, String flpUser2, Double flpDec01, Double flpDec02,
			String flpDec03, String flpDec04, Double oidFlpPlan) {
		this.id = id;
		this.flpProdFcst = flpProdFcst;
		this.flpProdAct = flpProdAct;
		this.flpUser1 = flpUser1;
		this.flpUser2 = flpUser2;
		this.flpDec01 = flpDec01;
		this.flpDec02 = flpDec02;
		this.flpDec03 = flpDec03;
		this.flpDec04 = flpDec04;
		this.oidFlpPlan = oidFlpPlan;
	}

	// Property accessors

	public FlpPlanId getId() {
		return this.id;
	}

	public void setId(FlpPlanId id) {
		this.id = id;
	}

	public String getFlpProdFcst() {
		return this.flpProdFcst;
	}

	public void setFlpProdFcst(String flpProdFcst) {
		this.flpProdFcst = flpProdFcst;
	}

	public String getFlpProdAct() {
		return this.flpProdAct;
	}

	public void setFlpProdAct(String flpProdAct) {
		this.flpProdAct = flpProdAct;
	}

	public String getFlpUser1() {
		return this.flpUser1;
	}

	public void setFlpUser1(String flpUser1) {
		this.flpUser1 = flpUser1;
	}

	public String getFlpUser2() {
		return this.flpUser2;
	}

	public void setFlpUser2(String flpUser2) {
		this.flpUser2 = flpUser2;
	}

	public Double getFlpDec01() {
		return this.flpDec01;
	}

	public void setFlpDec01(Double flpDec01) {
		this.flpDec01 = flpDec01;
	}

	public Double getFlpDec02() {
		return this.flpDec02;
	}

	public void setFlpDec02(Double flpDec02) {
		this.flpDec02 = flpDec02;
	}

	public String getFlpDec03() {
		return this.flpDec03;
	}

	public void setFlpDec03(String flpDec03) {
		this.flpDec03 = flpDec03;
	}

	public String getFlpDec04() {
		return this.flpDec04;
	}

	public void setFlpDec04(String flpDec04) {
		this.flpDec04 = flpDec04;
	}

	public Double getOidFlpPlan() {
		return this.oidFlpPlan;
	}

	public void setOidFlpPlan(Double oidFlpPlan) {
		this.oidFlpPlan = oidFlpPlan;
	}

}