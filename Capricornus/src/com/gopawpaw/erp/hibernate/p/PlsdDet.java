package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PlsdDet entity. @author MyEclipse Persistence Tools
 */
public class PlsdDet extends AbstractPlsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PlsdDet() {
	}

	/** minimal constructor */
	public PlsdDet(PlsdDetId id, String plsdFsaccrAcct, String plsdFsaccrSub,
			String plsdFsaccrCc, String plsdFsdefAcct, String plsdFsdefSub,
			String plsdFsdefCc, Double oidPlsdDet) {
		super(id, plsdFsaccrAcct, plsdFsaccrSub, plsdFsaccrCc, plsdFsdefAcct,
				plsdFsdefSub, plsdFsdefCc, oidPlsdDet);
	}

	/** full constructor */
	public PlsdDet(PlsdDetId id, String plsdSlsAcct, String plsdSlsCc,
			String plsdDscAcct, String plsdDscCc, String plsdCbdnAcct,
			String plsdCbdnCc, String plsdClbrAcct, String plsdClbrCc,
			String plsdCmtlAcct, String plsdCmtlCc, String plsdCovhAcct,
			String plsdCovhCc, String plsdCsubAcct, String plsdCsubCc,
			String plsdUser1, String plsdUser2, String plsdUserid,
			Date plsdModDate, String plsdQadc01, String plsdCbdnSub,
			String plsdClbrSub, String plsdCmtlSub, String plsdCovhSub,
			String plsdCsubSub, String plsdDscSub, String plsdSlsSub,
			String plsdFsaccrAcct, String plsdFsaccrSub, String plsdFsaccrCc,
			String plsdFsdefAcct, String plsdFsdefSub, String plsdFsdefCc,
			Double oidPlsdDet) {
		super(id, plsdSlsAcct, plsdSlsCc, plsdDscAcct, plsdDscCc, plsdCbdnAcct,
				plsdCbdnCc, plsdClbrAcct, plsdClbrCc, plsdCmtlAcct, plsdCmtlCc,
				plsdCovhAcct, plsdCovhCc, plsdCsubAcct, plsdCsubCc, plsdUser1,
				plsdUser2, plsdUserid, plsdModDate, plsdQadc01, plsdCbdnSub,
				plsdClbrSub, plsdCmtlSub, plsdCovhSub, plsdCsubSub, plsdDscSub,
				plsdSlsSub, plsdFsaccrAcct, plsdFsaccrSub, plsdFsaccrCc,
				plsdFsdefAcct, plsdFsdefSub, plsdFsdefCc, oidPlsdDet);
	}

}
