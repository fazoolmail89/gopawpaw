package com.gopawpaw.erp.hibernate.u;

/**
 * UsrcCtrl entity. @author MyEclipse Persistence Tools
 */
public class UsrcCtrl extends AbstractUsrcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UsrcCtrl() {
	}

	/** minimal constructor */
	public UsrcCtrl(Integer usrcRightHdrDisp, Integer usrcMaxAccessFails,
			Integer usrcWarningDays, Integer usrcMinLength,
			Integer usrcMinNumeric, Integer usrcReuseDays,
			Integer usrcReuseChanges, String usrcLogonHistLevel,
			Integer usrcMinNonNumeric, String usrcActiveRsnType,
			String usrcDeactivationRsn, String usrcPasswordCreate,
			Double oidUsrgMstrAdmin, String usrcEmSystemId, Double oidUsrcCtrl) {
		super(usrcRightHdrDisp, usrcMaxAccessFails, usrcWarningDays,
				usrcMinLength, usrcMinNumeric, usrcReuseDays, usrcReuseChanges,
				usrcLogonHistLevel, usrcMinNonNumeric, usrcActiveRsnType,
				usrcDeactivationRsn, usrcPasswordCreate, oidUsrgMstrAdmin,
				usrcEmSystemId, oidUsrcCtrl);
	}

	/** full constructor */
	public UsrcCtrl(String usrcSecOpt, String usrcSessId,
			Integer usrcTimeoutMin, Integer usrcExpireDays, String usrcQad01,
			String usrcQad02, String usrcUser1, String usrcUser2,
			Integer usrcRightHdrDisp, Integer usrcMaxAccessFails,
			Integer usrcWarningDays, Integer usrcMinLength,
			Integer usrcMinNumeric, Integer usrcReuseDays,
			Integer usrcReuseChanges, String usrcLogonHistLevel,
			Integer usrcMinNonNumeric, String usrcActiveRsnType,
			String usrcDeactivationRsn, String usrcPasswordCreate,
			Double oidUsrgMstrAdmin, String usrcEmSystemId, Double oidUsrcCtrl) {
		super(usrcSecOpt, usrcSessId, usrcTimeoutMin, usrcExpireDays,
				usrcQad01, usrcQad02, usrcUser1, usrcUser2, usrcRightHdrDisp,
				usrcMaxAccessFails, usrcWarningDays, usrcMinLength,
				usrcMinNumeric, usrcReuseDays, usrcReuseChanges,
				usrcLogonHistLevel, usrcMinNonNumeric, usrcActiveRsnType,
				usrcDeactivationRsn, usrcPasswordCreate, oidUsrgMstrAdmin,
				usrcEmSystemId, oidUsrcCtrl);
	}

}
