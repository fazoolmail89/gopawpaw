package com.gopawpaw.erp.hibernate.c;

/**
 * CostCal entity. @author MyEclipse Persistence Tools
 */
public class CostCal extends AbstractCostCal implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CostCal() {
	}

	/** minimal constructor */
	public CostCal(CostCalId id, Double oidCostCal) {
		super(id, oidCostCal);
	}

	/** full constructor */
	public CostCal(CostCalId id, String costSet, String costMemo,
			Integer costCmtindx, String costUser1, String costUser2,
			String costQadc01, Double oidCostCal) {
		super(id, costSet, costMemo, costCmtindx, costUser1, costUser2,
				costQadc01, oidCostCal);
	}

}
