package com.gopawpaw.erp.hibernate.p;

/**
 * PpPlan entity. @author MyEclipse Persistence Tools
 */
public class PpPlan extends AbstractPpPlan implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PpPlan() {
	}

	/** minimal constructor */
	public PpPlan(PpPlanId id, Double oidPpPlan) {
		super(id, oidPpPlan);
	}

	/** full constructor */
	public PpPlan(PpPlanId id, String ppShipFcst, String ppShipAct,
			String ppOrdFcst, String ppOrdAct, Double ppInvFcst,
			String ppInvAct, Double ppBklgFcst, String ppBklgAct,
			String ppCostFcst, String ppCostAct, String ppProdFcst,
			String ppProdAct, String ppUser1, String ppUser2, String ppQadc01,
			Double oidPpPlan) {
		super(id, ppShipFcst, ppShipAct, ppOrdFcst, ppOrdAct, ppInvFcst,
				ppInvAct, ppBklgFcst, ppBklgAct, ppCostFcst, ppCostAct,
				ppProdFcst, ppProdAct, ppUser1, ppUser2, ppQadc01, oidPpPlan);
	}

}
