package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MfrelMstr entity. @author MyEclipse Persistence Tools
 */
public class MfrelMstr extends AbstractMfrelMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MfrelMstr() {
	}

	/** minimal constructor */
	public MfrelMstr(MfrelMstrId id, String mfrelQadc01, String mfrelQadc02,
			String mfrelQadc03, String mfrelQadc04, String mfrelQadc05,
			Double mfrelQadd01, Double mfrelQadd02, Double mfrelQadd03,
			Double mfrelQadd04, Double mfrelQadd05, Boolean mfrelQadl01,
			Boolean mfrelQadl02, String mfrelModUserid, Date mfrelModDate,
			String mfrelUser1, String mfrelUser2, Double oidMfrelMstr) {
		super(id, mfrelQadc01, mfrelQadc02, mfrelQadc03, mfrelQadc04,
				mfrelQadc05, mfrelQadd01, mfrelQadd02, mfrelQadd03,
				mfrelQadd04, mfrelQadd05, mfrelQadl01, mfrelQadl02,
				mfrelModUserid, mfrelModDate, mfrelUser1, mfrelUser2,
				oidMfrelMstr);
	}

	/** full constructor */
	public MfrelMstr(MfrelMstrId id, String mfrelQadc01, String mfrelQadc02,
			String mfrelQadc03, String mfrelQadc04, String mfrelQadc05,
			Double mfrelQadd01, Double mfrelQadd02, Double mfrelQadd03,
			Double mfrelQadd04, Double mfrelQadd05, Boolean mfrelQadl01,
			Boolean mfrelQadl02, Date mfrelQaddt01, Date mfrelQaddt02,
			String mfrelModUserid, Date mfrelModDate, String mfrelUser1,
			String mfrelUser2, Double oidMfrelMstr) {
		super(id, mfrelQadc01, mfrelQadc02, mfrelQadc03, mfrelQadc04,
				mfrelQadc05, mfrelQadd01, mfrelQadd02, mfrelQadd03,
				mfrelQadd04, mfrelQadd05, mfrelQadl01, mfrelQadl02,
				mfrelQaddt01, mfrelQaddt02, mfrelModUserid, mfrelModDate,
				mfrelUser1, mfrelUser2, oidMfrelMstr);
	}

}
