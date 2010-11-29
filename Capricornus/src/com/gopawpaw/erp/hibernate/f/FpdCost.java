package com.gopawpaw.erp.hibernate.f;

/**
 * FpdCost entity. @author MyEclipse Persistence Tools
 */
public class FpdCost extends AbstractFpdCost implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FpdCost() {
	}

	/** minimal constructor */
	public FpdCost(FpdCostId id, Double oidFpdCost) {
		super(id, oidFpdCost);
	}

	/** full constructor */
	public FpdCost(FpdCostId id, Double fpdPrice, Double fpdRate1,
			Double fpdCost1, String fpdUser1, String fpdUser2, String fpdChr01,
			String fpdChr02, String fpdChr03, String fpdChr04, String fpdChr05,
			Double fpdDec01, Double fpdDec02, Double fpdDec03, Double fpdDec04,
			Double fpdDec05, Double fpdRate2, Double fpdCost2, Double fpdRate3,
			Double fpdCost3, Double fpdRate4, Double fpdCost4, Double fpdRate5,
			Double fpdCost5, Double oidFpdCost) {
		super(id, fpdPrice, fpdRate1, fpdCost1, fpdUser1, fpdUser2, fpdChr01,
				fpdChr02, fpdChr03, fpdChr04, fpdChr05, fpdDec01, fpdDec02,
				fpdDec03, fpdDec04, fpdDec05, fpdRate2, fpdCost2, fpdRate3,
				fpdCost3, fpdRate4, fpdCost4, fpdRate5, fpdCost5, oidFpdCost);
	}

}
