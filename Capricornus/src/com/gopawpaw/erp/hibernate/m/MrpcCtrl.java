package com.gopawpaw.erp.hibernate.m;

/**
 * MrpcCtrl entity. @author MyEclipse Persistence Tools
 */
public class MrpcCtrl extends AbstractMrpcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MrpcCtrl() {
	}

	/** minimal constructor */
	public MrpcCtrl(Double oidMrpcCtrl) {
		super(oidMrpcCtrl);
	}

	/** full constructor */
	public MrpcCtrl(Integer mrpcHorizon, Integer mrpcSumDef, String mrpcUser1,
			String mrpcUser2, Integer mrpcQadi01, Boolean mrpcDrp,
			Integer mrpcReldays, String mrpcQadc01, Boolean mrpcOpYield,
			Double oidMrpcCtrl) {
		super(mrpcHorizon, mrpcSumDef, mrpcUser1, mrpcUser2, mrpcQadi01,
				mrpcDrp, mrpcReldays, mrpcQadc01, mrpcOpYield, oidMrpcCtrl);
	}

}
