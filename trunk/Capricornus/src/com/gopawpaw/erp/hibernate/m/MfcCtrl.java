package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MfcCtrl entity. @author MyEclipse Persistence Tools
 */
public class MfcCtrl extends AbstractMfcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MfcCtrl() {
	}

	/** minimal constructor */
	public MfcCtrl(MfcCtrlId id, Double oidMfcCtrl) {
		super(id, oidMfcCtrl);
	}

	/** full constructor */
	public MfcCtrl(MfcCtrlId id, String mfcModule, Integer mfcSeq,
			String mfcLabel, String mfcDesc, String mfcType,
			Integer mfcInteger, String mfcChar, Double mfcDecimal,
			Boolean mfcLogical, Date mfcDate, String mfcUser1, String mfcUser2,
			String mfcQadc01, Double oidMfcCtrl) {
		super(id, mfcModule, mfcSeq, mfcLabel, mfcDesc, mfcType, mfcInteger,
				mfcChar, mfcDecimal, mfcLogical, mfcDate, mfcUser1, mfcUser2,
				mfcQadc01, oidMfcCtrl);
	}

}
