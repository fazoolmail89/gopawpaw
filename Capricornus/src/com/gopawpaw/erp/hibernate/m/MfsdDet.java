package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MfsdDet entity. @author MyEclipse Persistence Tools
 */
public class MfsdDet extends AbstractMfsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MfsdDet() {
	}

	/** minimal constructor */
	public MfsdDet(String mfsdEngCode, String mfsdEngId, String mfsdSite,
			String mfsdLoc, String mfsdSvcGroup1, String mfsdSvcGroup2,
			Boolean mfsdSyncAuth, Boolean mfsdCallHeader, String mfsdSaPre,
			Boolean mfsdNonexistingUser, Boolean mfsdNonexistingItems,
			Boolean mfsdPrntsyscmnt, Boolean mfsdClientDocIds,
			String mfsdCaMoPre, String mfsdModUserid, Date mfsdModDate,
			String mfsdUser1, String mfsdUser2, String mfsdQadc01,
			String mfsdQadc02, String mfsdUserc03, String mfsdUserc04,
			String mfsdUserc05, Double mfsdUserd01, Double mfsdUserd02,
			Boolean mfsdUserl01, Boolean mfsdUserl02, String mfsdDomain,
			Double oidMfsdDet) {
		super(mfsdEngCode, mfsdEngId, mfsdSite, mfsdLoc, mfsdSvcGroup1,
				mfsdSvcGroup2, mfsdSyncAuth, mfsdCallHeader, mfsdSaPre,
				mfsdNonexistingUser, mfsdNonexistingItems, mfsdPrntsyscmnt,
				mfsdClientDocIds, mfsdCaMoPre, mfsdModUserid, mfsdModDate,
				mfsdUser1, mfsdUser2, mfsdQadc01, mfsdQadc02, mfsdUserc03,
				mfsdUserc04, mfsdUserc05, mfsdUserd01, mfsdUserd02,
				mfsdUserl01, mfsdUserl02, mfsdDomain, oidMfsdDet);
	}

	/** full constructor */
	public MfsdDet(String mfsdEngCode, String mfsdEngId, String mfsdSite,
			String mfsdLoc, String mfsdSvcGroup1, String mfsdSvcGroup2,
			Boolean mfsdSyncAuth, Boolean mfsdCallHeader, String mfsdSaPre,
			Boolean mfsdNonexistingUser, Boolean mfsdNonexistingItems,
			Boolean mfsdPrntsyscmnt, Boolean mfsdClientDocIds,
			String mfsdCaMoPre, String mfsdModUserid, Date mfsdModDate,
			String mfsdUser1, String mfsdUser2, String mfsdQadc01,
			String mfsdQadc02, String mfsdUserc03, String mfsdUserc04,
			String mfsdUserc05, Double mfsdUserd01, Double mfsdUserd02,
			Boolean mfsdUserl01, Boolean mfsdUserl02, Date mfsdUsert01,
			Date mfsdUsert02, String mfsdDomain, Double oidMfsdDet) {
		super(mfsdEngCode, mfsdEngId, mfsdSite, mfsdLoc, mfsdSvcGroup1,
				mfsdSvcGroup2, mfsdSyncAuth, mfsdCallHeader, mfsdSaPre,
				mfsdNonexistingUser, mfsdNonexistingItems, mfsdPrntsyscmnt,
				mfsdClientDocIds, mfsdCaMoPre, mfsdModUserid, mfsdModDate,
				mfsdUser1, mfsdUser2, mfsdQadc01, mfsdQadc02, mfsdUserc03,
				mfsdUserc04, mfsdUserc05, mfsdUserd01, mfsdUserd02,
				mfsdUserl01, mfsdUserl02, mfsdUsert01, mfsdUsert02, mfsdDomain,
				oidMfsdDet);
	}

}
