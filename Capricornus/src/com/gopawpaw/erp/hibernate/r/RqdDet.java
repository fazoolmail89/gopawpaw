package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqdDet entity. @author MyEclipse Persistence Tools
 */
public class RqdDet extends AbstractRqdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqdDet() {
	}

	/** minimal constructor */
	public RqdDet(RqdDetId id, Double oidRqdDet) {
		super(id, oidRqdDet);
	}

	/** full constructor */
	public RqdDet(RqdDetId id, String rqdPart, Double rqdReqQty,
			Double rqdUmConv, String rqdVend, String rqdShip, String rqdVpart,
			Boolean rqdTaxable, Double rqdDiscPct, Date rqdDueDate,
			String rqdDesc, String rqdType, Double rqdMaxCost,
			String rqdCategory, String rqdStatus, String rqdRev, String rqdLoc,
			Boolean rqdInspRqd, String rqdAcct, String rqdCc,
			String rqdProject, Date rqdNeedDate, Double rqdPurCost,
			String rqdAprvStat, Date rqdRelDate, String rqdSite, String rqdUm,
			Integer rqdCmtindx, Double rqdOotPonetcst, String rqdOotPoum,
			Double rqdOotRqnetcst, String rqdOotRqum, String rqdPrList,
			String rqdPrList2, String rqdGrade, Date rqdExpire,
			String rqdRctstat, Double rqdAssay, Boolean rqdLotRcpt,
			String rqdChr01, String rqdChr02, String rqdChr03, String rqdChr04,
			String rqdQadc01, String rqdQadc02, String rqdQadc03,
			String rqdQadc04, Boolean rqdOpen, String rqdOotExtra,
			Double oidRqdDet) {
		super(id, rqdPart, rqdReqQty, rqdUmConv, rqdVend, rqdShip, rqdVpart,
				rqdTaxable, rqdDiscPct, rqdDueDate, rqdDesc, rqdType,
				rqdMaxCost, rqdCategory, rqdStatus, rqdRev, rqdLoc, rqdInspRqd,
				rqdAcct, rqdCc, rqdProject, rqdNeedDate, rqdPurCost,
				rqdAprvStat, rqdRelDate, rqdSite, rqdUm, rqdCmtindx,
				rqdOotPonetcst, rqdOotPoum, rqdOotRqnetcst, rqdOotRqum,
				rqdPrList, rqdPrList2, rqdGrade, rqdExpire, rqdRctstat,
				rqdAssay, rqdLotRcpt, rqdChr01, rqdChr02, rqdChr03, rqdChr04,
				rqdQadc01, rqdQadc02, rqdQadc03, rqdQadc04, rqdOpen,
				rqdOotExtra, oidRqdDet);
	}

}
