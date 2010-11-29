package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QaddbCtrl entity. @author MyEclipse Persistence Tools
 */
public class QaddbCtrl extends AbstractQaddbCtrl implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public QaddbCtrl() {
	}

	/** full constructor */
	public QaddbCtrl(String qaddbServerTimezone, Integer qaddbOidCode,
			Double qaddbOidRegid, String qaddbModUserid, Date qaddbModDate,
			String qaddbUser1, String qaddbUser2, String qaddbQadc01,
			String qaddbQadc02, Double oidQaddbCtrl) {
		super(qaddbServerTimezone, qaddbOidCode, qaddbOidRegid, qaddbModUserid,
				qaddbModDate, qaddbUser1, qaddbUser2, qaddbQadc01, qaddbQadc02,
				oidQaddbCtrl);
	}

}
