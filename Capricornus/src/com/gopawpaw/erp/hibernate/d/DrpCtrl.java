package com.gopawpaw.erp.hibernate.d;

/**
 * DrpCtrl entity. @author MyEclipse Persistence Tools
 */
public class DrpCtrl extends AbstractDrpCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DrpCtrl() {
	}

	/** minimal constructor */
	public DrpCtrl(Double oidDrpCtrl) {
		super(oidDrpCtrl);
	}

	/** full constructor */
	public DrpCtrl(Boolean drpAutoReq, Integer drpQadi01, Integer drpReqNbr,
			String drpReqPre, Boolean drpRcmmts, String drpUser1,
			String drpUser2, Boolean drpAutoNbr, Integer drpNbr,
			String drpNbrPre, Boolean drpDcmmts, Boolean drpMrp,
			String drpQadc01, Double oidDrpCtrl) {
		super(drpAutoReq, drpQadi01, drpReqNbr, drpReqPre, drpRcmmts, drpUser1,
				drpUser2, drpAutoNbr, drpNbr, drpNbrPre, drpDcmmts, drpMrp,
				drpQadc01, oidDrpCtrl);
	}

}
