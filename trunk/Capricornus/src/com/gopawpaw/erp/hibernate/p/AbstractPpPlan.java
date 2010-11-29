package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPpPlan entity provides the base persistence definition of the PpPlan
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPpPlan implements java.io.Serializable {

	// Fields

	private PpPlanId id;
	private String ppShipFcst;
	private String ppShipAct;
	private String ppOrdFcst;
	private String ppOrdAct;
	private Double ppInvFcst;
	private String ppInvAct;
	private Double ppBklgFcst;
	private String ppBklgAct;
	private String ppCostFcst;
	private String ppCostAct;
	private String ppProdFcst;
	private String ppProdAct;
	private String ppUser1;
	private String ppUser2;
	private String ppQadc01;
	private Double oidPpPlan;

	// Constructors

	/** default constructor */
	public AbstractPpPlan() {
	}

	/** minimal constructor */
	public AbstractPpPlan(PpPlanId id, Double oidPpPlan) {
		this.id = id;
		this.oidPpPlan = oidPpPlan;
	}

	/** full constructor */
	public AbstractPpPlan(PpPlanId id, String ppShipFcst, String ppShipAct,
			String ppOrdFcst, String ppOrdAct, Double ppInvFcst,
			String ppInvAct, Double ppBklgFcst, String ppBklgAct,
			String ppCostFcst, String ppCostAct, String ppProdFcst,
			String ppProdAct, String ppUser1, String ppUser2, String ppQadc01,
			Double oidPpPlan) {
		this.id = id;
		this.ppShipFcst = ppShipFcst;
		this.ppShipAct = ppShipAct;
		this.ppOrdFcst = ppOrdFcst;
		this.ppOrdAct = ppOrdAct;
		this.ppInvFcst = ppInvFcst;
		this.ppInvAct = ppInvAct;
		this.ppBklgFcst = ppBklgFcst;
		this.ppBklgAct = ppBklgAct;
		this.ppCostFcst = ppCostFcst;
		this.ppCostAct = ppCostAct;
		this.ppProdFcst = ppProdFcst;
		this.ppProdAct = ppProdAct;
		this.ppUser1 = ppUser1;
		this.ppUser2 = ppUser2;
		this.ppQadc01 = ppQadc01;
		this.oidPpPlan = oidPpPlan;
	}

	// Property accessors

	public PpPlanId getId() {
		return this.id;
	}

	public void setId(PpPlanId id) {
		this.id = id;
	}

	public String getPpShipFcst() {
		return this.ppShipFcst;
	}

	public void setPpShipFcst(String ppShipFcst) {
		this.ppShipFcst = ppShipFcst;
	}

	public String getPpShipAct() {
		return this.ppShipAct;
	}

	public void setPpShipAct(String ppShipAct) {
		this.ppShipAct = ppShipAct;
	}

	public String getPpOrdFcst() {
		return this.ppOrdFcst;
	}

	public void setPpOrdFcst(String ppOrdFcst) {
		this.ppOrdFcst = ppOrdFcst;
	}

	public String getPpOrdAct() {
		return this.ppOrdAct;
	}

	public void setPpOrdAct(String ppOrdAct) {
		this.ppOrdAct = ppOrdAct;
	}

	public Double getPpInvFcst() {
		return this.ppInvFcst;
	}

	public void setPpInvFcst(Double ppInvFcst) {
		this.ppInvFcst = ppInvFcst;
	}

	public String getPpInvAct() {
		return this.ppInvAct;
	}

	public void setPpInvAct(String ppInvAct) {
		this.ppInvAct = ppInvAct;
	}

	public Double getPpBklgFcst() {
		return this.ppBklgFcst;
	}

	public void setPpBklgFcst(Double ppBklgFcst) {
		this.ppBklgFcst = ppBklgFcst;
	}

	public String getPpBklgAct() {
		return this.ppBklgAct;
	}

	public void setPpBklgAct(String ppBklgAct) {
		this.ppBklgAct = ppBklgAct;
	}

	public String getPpCostFcst() {
		return this.ppCostFcst;
	}

	public void setPpCostFcst(String ppCostFcst) {
		this.ppCostFcst = ppCostFcst;
	}

	public String getPpCostAct() {
		return this.ppCostAct;
	}

	public void setPpCostAct(String ppCostAct) {
		this.ppCostAct = ppCostAct;
	}

	public String getPpProdFcst() {
		return this.ppProdFcst;
	}

	public void setPpProdFcst(String ppProdFcst) {
		this.ppProdFcst = ppProdFcst;
	}

	public String getPpProdAct() {
		return this.ppProdAct;
	}

	public void setPpProdAct(String ppProdAct) {
		this.ppProdAct = ppProdAct;
	}

	public String getPpUser1() {
		return this.ppUser1;
	}

	public void setPpUser1(String ppUser1) {
		this.ppUser1 = ppUser1;
	}

	public String getPpUser2() {
		return this.ppUser2;
	}

	public void setPpUser2(String ppUser2) {
		this.ppUser2 = ppUser2;
	}

	public String getPpQadc01() {
		return this.ppQadc01;
	}

	public void setPpQadc01(String ppQadc01) {
		this.ppQadc01 = ppQadc01;
	}

	public Double getOidPpPlan() {
		return this.oidPpPlan;
	}

	public void setOidPpPlan(Double oidPpPlan) {
		this.oidPpPlan = oidPpPlan;
	}

}