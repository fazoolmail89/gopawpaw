package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCostCal entity provides the base persistence definition of the
 * CostCal entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCostCal implements java.io.Serializable {

	// Fields

	private CostCalId id;
	private String costSet;
	private String costMemo;
	private Integer costCmtindx;
	private String costUser1;
	private String costUser2;
	private String costQadc01;
	private Double oidCostCal;

	// Constructors

	/** default constructor */
	public AbstractCostCal() {
	}

	/** minimal constructor */
	public AbstractCostCal(CostCalId id, Double oidCostCal) {
		this.id = id;
		this.oidCostCal = oidCostCal;
	}

	/** full constructor */
	public AbstractCostCal(CostCalId id, String costSet, String costMemo,
			Integer costCmtindx, String costUser1, String costUser2,
			String costQadc01, Double oidCostCal) {
		this.id = id;
		this.costSet = costSet;
		this.costMemo = costMemo;
		this.costCmtindx = costCmtindx;
		this.costUser1 = costUser1;
		this.costUser2 = costUser2;
		this.costQadc01 = costQadc01;
		this.oidCostCal = oidCostCal;
	}

	// Property accessors

	public CostCalId getId() {
		return this.id;
	}

	public void setId(CostCalId id) {
		this.id = id;
	}

	public String getCostSet() {
		return this.costSet;
	}

	public void setCostSet(String costSet) {
		this.costSet = costSet;
	}

	public String getCostMemo() {
		return this.costMemo;
	}

	public void setCostMemo(String costMemo) {
		this.costMemo = costMemo;
	}

	public Integer getCostCmtindx() {
		return this.costCmtindx;
	}

	public void setCostCmtindx(Integer costCmtindx) {
		this.costCmtindx = costCmtindx;
	}

	public String getCostUser1() {
		return this.costUser1;
	}

	public void setCostUser1(String costUser1) {
		this.costUser1 = costUser1;
	}

	public String getCostUser2() {
		return this.costUser2;
	}

	public void setCostUser2(String costUser2) {
		this.costUser2 = costUser2;
	}

	public String getCostQadc01() {
		return this.costQadc01;
	}

	public void setCostQadc01(String costQadc01) {
		this.costQadc01 = costQadc01;
	}

	public Double getOidCostCal() {
		return this.oidCostCal;
	}

	public void setOidCostCal(Double oidCostCal) {
		this.oidCostCal = oidCostCal;
	}

}