package com.gopawpaw.erp.hibernate.f;

/**
 * FlpPlan entity. @author MyEclipse Persistence Tools
 */
public class FlpPlan extends AbstractFlpPlan implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlpPlan() {
	}

	/** minimal constructor */
	public FlpPlan(FlpPlanId id, Double oidFlpPlan) {
		super(id, oidFlpPlan);
	}

	/** full constructor */
	public FlpPlan(FlpPlanId id, String flpProdFcst, String flpProdAct,
			String flpUser1, String flpUser2, Double flpDec01, Double flpDec02,
			String flpDec03, String flpDec04, Double oidFlpPlan) {
		super(id, flpProdFcst, flpProdAct, flpUser1, flpUser2, flpDec01,
				flpDec02, flpDec03, flpDec04, oidFlpPlan);
	}

}
