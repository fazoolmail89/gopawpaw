package com.gopawpaw.erp.hibernate.s;

/**
 * ShcCtrl entity. @author MyEclipse Persistence Tools
 */
public class ShcCtrl extends AbstractShcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShcCtrl() {
	}

	/** minimal constructor */
	public ShcCtrl(Integer shcQadi01, String shcPreshipNrId,
			String shcShipNrId, String shcMasterNrId, Boolean shcRequireInvMov,
			Boolean shcTrlAmts, Double oidShcCtrl) {
		super(shcQadi01, shcPreshipNrId, shcShipNrId, shcMasterNrId,
				shcRequireInvMov, shcTrlAmts, oidShcCtrl);
	}

	/** full constructor */
	public ShcCtrl(Integer shcQadi01, String shcPreshipNrId,
			String shcShipNrId, String shcMasterNrId, Boolean shcRequireInvMov,
			Boolean shcTrlAmts, String shcUser1, String shcUser2,
			String shcQadc01, String shcFormat, Boolean shcShipRcpt,
			Double oidShcCtrl) {
		super(shcQadi01, shcPreshipNrId, shcShipNrId, shcMasterNrId,
				shcRequireInvMov, shcTrlAmts, shcUser1, shcUser2, shcQadc01,
				shcFormat, shcShipRcpt, oidShcCtrl);
	}

}
