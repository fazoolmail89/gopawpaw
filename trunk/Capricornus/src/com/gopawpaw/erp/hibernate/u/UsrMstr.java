package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UsrMstr entity. @author MyEclipse Persistence Tools
 */
public class UsrMstr extends AbstractUsrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UsrMstr() {
	}

	/** minimal constructor */
	public UsrMstr(Boolean usrQadl03, String usrQadc03, String usrAddr,
			Boolean usrRestrict, String usrType, String usrTimezone,
			String usrAccessType, String usrAccessLoc, String usrCtryCode,
			String usrVariantCode, Integer usrFailedAttempts,
			Boolean usrForceChange, Boolean usrActive, String usrActiveBy,
			String usrActiveReason, Date usrActiveDate,
			String usrLogonTimezone, Integer usrLogonTime, Double oidUsrMstr) {
		super(usrQadl03, usrQadc03, usrAddr, usrRestrict, usrType, usrTimezone,
				usrAccessType, usrAccessLoc, usrCtryCode, usrVariantCode,
				usrFailedAttempts, usrForceChange, usrActive, usrActiveBy,
				usrActiveReason, usrActiveDate, usrLogonTimezone, usrLogonTime,
				oidUsrMstr);
	}

	/** full constructor */
	public UsrMstr(String usrLang, String usrUser1, String usrUser2,
			String usrSite, String usrQadc05, String usrPasswd, String usrName,
			Date usrLastDate, String usrQad01, String usrQad02,
			Boolean usrQadl03, String usrQadc03, String usrAddr,
			Boolean usrRestrict, String usrQadc02, Integer usrQadi02,
			String usrQadc01, Boolean usrQadl01, Boolean usrQadl02,
			String usrQadc04, Integer usrQadi01, String usrMailAddress,
			String usrType, String usrTimezone, String usrAccessType,
			String usrAccessLoc, String usrCtryCode, String usrVariantCode,
			Integer usrFailedAttempts, Boolean usrForceChange,
			Date usrLogonDate, Boolean usrActive, String usrActiveBy,
			String usrActiveReason, Date usrActiveDate,
			String usrLogonTimezone, String usrRemark, Integer usrLogonTime,
			Double oidUsrMstr) {
		super(usrLang, usrUser1, usrUser2, usrSite, usrQadc05, usrPasswd,
				usrName, usrLastDate, usrQad01, usrQad02, usrQadl03, usrQadc03,
				usrAddr, usrRestrict, usrQadc02, usrQadi02, usrQadc01,
				usrQadl01, usrQadl02, usrQadc04, usrQadi01, usrMailAddress,
				usrType, usrTimezone, usrAccessType, usrAccessLoc, usrCtryCode,
				usrVariantCode, usrFailedAttempts, usrForceChange,
				usrLogonDate, usrActive, usrActiveBy, usrActiveReason,
				usrActiveDate, usrLogonTimezone, usrRemark, usrLogonTime,
				oidUsrMstr);
	}

}
