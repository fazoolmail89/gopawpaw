package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BicCtrl entity. @author MyEclipse Persistence Tools
 */
public class BicCtrl extends AbstractBicCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BicCtrl() {
	}

	/** minimal constructor */
	public BicCtrl(Double oidBicCtrl) {
		super(oidBicCtrl);
	}

	/** full constructor */
	public BicCtrl(Integer bicPeriods, Date bicLastDue, String bicLastCyc,
			Date bicLstDate, Integer bicQadi01, Boolean bicAudit,
			String bicUser1, String bicUser2, String bicQadc01,
			Double oidBicCtrl) {
		super(bicPeriods, bicLastDue, bicLastCyc, bicLstDate, bicQadi01,
				bicAudit, bicUser1, bicUser2, bicQadc01, oidBicCtrl);
	}

}
