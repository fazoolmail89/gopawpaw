package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RsudDet entity. @author MyEclipse Persistence Tools
 */
public class RsudDet extends AbstractRsudDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RsudDet() {
	}

	/** minimal constructor */
	public RsudDet(RsudDetId id, Integer rsudSequence, Boolean rsudNotifyNxt,
			Integer rsudSvrtyLvl, Boolean rsudCanreroute, Boolean rsudApproved,
			String rsudApproverid, Integer rsudCmmtindx, String rsudUser1,
			String rsudUser2, Double oidRsudDet) {
		super(id, rsudSequence, rsudNotifyNxt, rsudSvrtyLvl, rsudCanreroute,
				rsudApproved, rsudApproverid, rsudCmmtindx, rsudUser1,
				rsudUser2, oidRsudDet);
	}

	/** full constructor */
	public RsudDet(RsudDetId id, Integer rsudSequence, Boolean rsudNotifyNxt,
			Integer rsudSvrtyLvl, Boolean rsudCanreroute, Boolean rsudApproved,
			String rsudApproverid, Date rsudApprDate, Integer rsudCmmtindx,
			String rsudUser1, String rsudUser2, Date rsudRerouteDate,
			String rsudQadc01, Double oidRsudDet) {
		super(id, rsudSequence, rsudNotifyNxt, rsudSvrtyLvl, rsudCanreroute,
				rsudApproved, rsudApproverid, rsudApprDate, rsudCmmtindx,
				rsudUser1, rsudUser2, rsudRerouteDate, rsudQadc01, oidRsudDet);
	}

}
