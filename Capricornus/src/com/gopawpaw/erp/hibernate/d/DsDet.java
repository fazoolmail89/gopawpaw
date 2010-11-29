package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DsDet entity. @author MyEclipse Persistence Tools
 */
public class DsDet extends AbstractDsDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DsDet() {
	}

	/** minimal constructor */
	public DsDet(DsDetId id, String dsOrderCategory, Double dsFrRate,
			Double dsFrWt, String dsFrWtUm, String dsFrClass, Double dsFrChg,
			String dsFrList, Integer dsLine, Double oidDsDet) {
		super(id, dsOrderCategory, dsFrRate, dsFrWt, dsFrWtUm, dsFrClass,
				dsFrChg, dsFrList, dsLine, oidDsDet);
	}

	/** full constructor */
	public DsDet(DsDetId id, String dsNbr, String dsGitSite, Date dsShipdate,
			Date dsDueDate, Date dsPerDate, String dsPart, Double dsQtyOrd,
			Double dsQtyConf, Double dsQtyShip, String dsStatus, String dsRmks,
			String dsRev, String dsGitAcct, String dsGitCc, String dsProject,
			Integer dsCmtindx, Double dsResidual, String dsSoNbr, String dsLoc,
			String dsTransId, String dsUser1, String dsUser2, String dsChr01,
			String dsChr02, String dsChr03, String dsChr04, String dsChr05,
			Date dsDte01, Date dsDte02, Double dsDec01, Double dsDec02,
			Boolean dsLog01, Double dsQtyAll, Double dsQtyPick,
			Double dsQtyChg, Integer dsSodLine, String dsGitSub,
			String dsOrderCategory, Double dsFrRate, Double dsFrWt,
			String dsFrWtUm, String dsFrClass, Double dsFrChg, String dsFrList,
			Integer dsLine, Double oidDsDet) {
		super(id, dsNbr, dsGitSite, dsShipdate, dsDueDate, dsPerDate, dsPart,
				dsQtyOrd, dsQtyConf, dsQtyShip, dsStatus, dsRmks, dsRev,
				dsGitAcct, dsGitCc, dsProject, dsCmtindx, dsResidual, dsSoNbr,
				dsLoc, dsTransId, dsUser1, dsUser2, dsChr01, dsChr02, dsChr03,
				dsChr04, dsChr05, dsDte01, dsDte02, dsDec01, dsDec02, dsLog01,
				dsQtyAll, dsQtyPick, dsQtyChg, dsSodLine, dsGitSub,
				dsOrderCategory, dsFrRate, dsFrWt, dsFrWtUm, dsFrClass,
				dsFrChg, dsFrList, dsLine, oidDsDet);
	}

}
