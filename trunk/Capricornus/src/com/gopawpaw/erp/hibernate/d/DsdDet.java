package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DsdDet entity. @author MyEclipse Persistence Tools
 */
public class DsdDet extends AbstractDsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DsdDet() {
	}

	/** minimal constructor */
	public DsdDet(DsdDetId id, Double oidDsdDet) {
		super(id, oidDsdDet);
	}

	/** full constructor */
	public DsdDet(DsdDetId id, String dsdGitSite, Double dsdQtyConf,
			Date dsdShipdate, Date dsdDueDate, Date dsdPerDate, String dsdPart,
			Double dsdQtyOrd, Double dsdQtyRcvd, Double dsdQtyShip,
			Double dsdTransit, String dsdStatus, String dsdRmks, String dsdRev,
			String dsdGitAcct, String dsdGitCc, String dsdProject,
			Integer dsdCmtindx, Double dsdResidual, String dsdLoc,
			String dsdTransId, Boolean dsdUpdated, String dsdUser1,
			String dsdUser2, String dsdChr01, String dsdChr02, String dsdChr03,
			String dsdChr04, String dsdChr05, Date dsdDte01, Date dsdDte02,
			Double dsdDec01, Double dsdDec02, Boolean dsdLog01, String dsdNbr,
			Double dsdQtyChg, String dsdPoNbr, Integer dsdPodLine,
			String dsdGitSub, Double oidDsdDet) {
		super(id, dsdGitSite, dsdQtyConf, dsdShipdate, dsdDueDate, dsdPerDate,
				dsdPart, dsdQtyOrd, dsdQtyRcvd, dsdQtyShip, dsdTransit,
				dsdStatus, dsdRmks, dsdRev, dsdGitAcct, dsdGitCc, dsdProject,
				dsdCmtindx, dsdResidual, dsdLoc, dsdTransId, dsdUpdated,
				dsdUser1, dsdUser2, dsdChr01, dsdChr02, dsdChr03, dsdChr04,
				dsdChr05, dsdDte01, dsdDte02, dsdDec01, dsdDec02, dsdLog01,
				dsdNbr, dsdQtyChg, dsdPoNbr, dsdPodLine, dsdGitSub, oidDsdDet);
	}

}
