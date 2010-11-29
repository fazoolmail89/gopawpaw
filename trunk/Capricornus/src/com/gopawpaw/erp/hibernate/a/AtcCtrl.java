package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtcCtrl entity. @author MyEclipse Persistence Tools
 */
public class AtcCtrl extends AbstractAtcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtcCtrl() {
	}

	/** full constructor */
	public AtcCtrl(Double oidAtcCtrl, Boolean atcStorageShutdown,
			String atcLogfile, Date atcModDate, String atcModUserid,
			String atcUser1, String atcUser2, String atcQadc01, String atcQadc02) {
		super(oidAtcCtrl, atcStorageShutdown, atcLogfile, atcModDate,
				atcModUserid, atcUser1, atcUser2, atcQadc01, atcQadc02);
	}

}
