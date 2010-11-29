package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PjsxDet entity. @author MyEclipse Persistence Tools
 */
public class PjsxDet extends AbstractPjsxDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PjsxDet() {
	}

	/** minimal constructor */
	public PjsxDet(PjsxDetId id, String pjsxPrjNbr, Integer pjsxPjsLine,
			String pjsxDefWs, String pjsxIntStat, String pjsxLoc,
			Double pjsxQtyDemand, Double pjsxQtyOrd, Double pjsxQtyInProg,
			Double pjsxQtyIss, String pjsxSite, String pjsxSoNbr,
			Integer pjsxSodLine, String pjsxType, Date pjsxModDate,
			String pjsxModUserid, Double oidPjsxDet) {
		super(id, pjsxPrjNbr, pjsxPjsLine, pjsxDefWs, pjsxIntStat, pjsxLoc,
				pjsxQtyDemand, pjsxQtyOrd, pjsxQtyInProg, pjsxQtyIss, pjsxSite,
				pjsxSoNbr, pjsxSodLine, pjsxType, pjsxModDate, pjsxModUserid,
				oidPjsxDet);
	}

	/** full constructor */
	public PjsxDet(PjsxDetId id, String pjsxPrjNbr, Integer pjsxPjsLine,
			Date pjsxDate, String pjsxDefWs, Date pjsxEndDate,
			String pjsxIntStat, String pjsxLoc, Double pjsxQtyDemand,
			Double pjsxQtyOrd, Double pjsxQtyInProg, Double pjsxQtyIss,
			String pjsxSite, String pjsxSoNbr, Integer pjsxSodLine,
			Date pjsxStartDate, String pjsxType, Date pjsxModDate,
			String pjsxModUserid, String pjsxUser1, String pjsxUser2,
			Double pjsxDec01, Boolean pjsxLog01, Date pjsxDte01,
			String pjsxQadc01, String pjsxQadc02, Double pjsxQadd01,
			Integer pjsxQadi01, Boolean pjsxQadl01, Date pjsxQadt01,
			Double oidPjsxDet) {
		super(id, pjsxPrjNbr, pjsxPjsLine, pjsxDate, pjsxDefWs, pjsxEndDate,
				pjsxIntStat, pjsxLoc, pjsxQtyDemand, pjsxQtyOrd, pjsxQtyInProg,
				pjsxQtyIss, pjsxSite, pjsxSoNbr, pjsxSodLine, pjsxStartDate,
				pjsxType, pjsxModDate, pjsxModUserid, pjsxUser1, pjsxUser2,
				pjsxDec01, pjsxLog01, pjsxDte01, pjsxQadc01, pjsxQadc02,
				pjsxQadd01, pjsxQadi01, pjsxQadl01, pjsxQadt01, oidPjsxDet);
	}

}
