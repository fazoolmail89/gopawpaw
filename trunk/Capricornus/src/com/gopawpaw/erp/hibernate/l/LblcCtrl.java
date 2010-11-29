package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LblcCtrl entity. @author MyEclipse Persistence Tools
 */
public class LblcCtrl extends AbstractLblcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LblcCtrl() {
	}

	/** full constructor */
	public LblcCtrl(Boolean lblcTransFrame, String lblcModUserid,
			Date lblcModDate, String lblcUser1, String lblcUser2,
			String lblcQadc01, String lblcQadc02, Boolean lblcQadl01,
			Boolean lblcQadl02, Double oidLblcCtrl) {
		super(lblcTransFrame, lblcModUserid, lblcModDate, lblcUser1, lblcUser2,
				lblcQadc01, lblcQadc02, lblcQadl01, lblcQadl02, oidLblcCtrl);
	}

}
