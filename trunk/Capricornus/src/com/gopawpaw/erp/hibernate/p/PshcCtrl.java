package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PshcCtrl entity. @author MyEclipse Persistence Tools
 */
public class PshcCtrl extends AbstractPshcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PshcCtrl() {
	}

	/** full constructor */
	public PshcCtrl(String pshcShipperNrId, String pshcMasterNrId,
			Integer pshcQadi01, Date pshcModDate, String pshcModUserid,
			String pshcUser1, String pshcUser2, String pshcQadc01,
			String pshcQadc02, Double oidPshcCtrl) {
		super(pshcShipperNrId, pshcMasterNrId, pshcQadi01, pshcModDate,
				pshcModUserid, pshcUser1, pshcUser2, pshcQadc01, pshcQadc02,
				oidPshcCtrl);
	}

}
