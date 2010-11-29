package com.gopawpaw.erp.hibernate.g;

/**
 * GracDet entity. @author MyEclipse Persistence Tools
 */
public class GracDet extends AbstractGracDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GracDet() {
	}

	/** minimal constructor */
	public GracDet(GracDetId id, Double gracDrAmt, Double gracCrAmt,
			Double gracCrCurrAmt, Double gracDrCurrAmt, Double gracYtdCrAmt,
			Double gracYtdDrAmt, Double gracYtdCrCurrAmt,
			Double gracYtdDrCurrAmt, Double gracBegDrBal, Double gracBegDrCbal,
			Double gracBegCrBal, Double gracBegCrCbal, Double oidGracDet) {
		super(id, gracDrAmt, gracCrAmt, gracCrCurrAmt, gracDrCurrAmt,
				gracYtdCrAmt, gracYtdDrAmt, gracYtdCrCurrAmt, gracYtdDrCurrAmt,
				gracBegDrBal, gracBegDrCbal, gracBegCrBal, gracBegCrCbal,
				oidGracDet);
	}

	/** full constructor */
	public GracDet(GracDetId id, Double gracAmt, Double gracCurrAmt,
			String gracUser1, String gracUser2, Double gracYtdBal,
			Double gracBegBal, Double gracBegCbal, Double gracYtdCbal,
			Double gracPerBal, Double gracPerCbal, String gracQadc01,
			Double gracDrAmt, Double gracCrAmt, Double gracCrCurrAmt,
			Double gracDrCurrAmt, Double gracYtdCrAmt, Double gracYtdDrAmt,
			Double gracYtdCrCurrAmt, Double gracYtdDrCurrAmt,
			Double gracBegDrBal, Double gracBegDrCbal, Double gracBegCrBal,
			Double gracBegCrCbal, Double oidGracDet) {
		super(id, gracAmt, gracCurrAmt, gracUser1, gracUser2, gracYtdBal,
				gracBegBal, gracBegCbal, gracYtdCbal, gracPerBal, gracPerCbal,
				gracQadc01, gracDrAmt, gracCrAmt, gracCrCurrAmt, gracDrCurrAmt,
				gracYtdCrAmt, gracYtdDrAmt, gracYtdCrCurrAmt, gracYtdDrCurrAmt,
				gracBegDrBal, gracBegDrCbal, gracBegCrBal, gracBegCrCbal,
				oidGracDet);
	}

}
