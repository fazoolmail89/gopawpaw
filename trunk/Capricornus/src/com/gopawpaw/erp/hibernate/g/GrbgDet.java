package com.gopawpaw.erp.hibernate.g;

/**
 * GrbgDet entity. @author MyEclipse Persistence Tools
 */
public class GrbgDet extends AbstractGrbgDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrbgDet() {
	}

	/** minimal constructor */
	public GrbgDet(GrbgDetId id, Double oidGrbgDet) {
		super(id, oidGrbgDet);
	}

	/** full constructor */
	public GrbgDet(GrbgDetId id, Double grbgAmt, String grbgUser1,
			String grbgUser2, Double grbgYtdBal, Double grbgPerBal,
			Double grbgBegBal, String grbgQadc01, Double oidGrbgDet) {
		super(id, grbgAmt, grbgUser1, grbgUser2, grbgYtdBal, grbgPerBal,
				grbgBegBal, grbgQadc01, oidGrbgDet);
	}

}
