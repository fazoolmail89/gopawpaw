package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IedDet entity. @author MyEclipse Persistence Tools
 */
public class IedDet extends AbstractIedDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IedDet() {
	}

	/** minimal constructor */
	public IedDet(IedDetId id, String iedShipvia, String iedAffiliation,
			String iedItemSpec, Integer iedCsa, Boolean iedContainer,
			Integer iedPreference, String iedDeclRegion, String iedReqNbr,
			Integer iedTrnbr, Double oidIedDet) {
		super(id, iedShipvia, iedAffiliation, iedItemSpec, iedCsa,
				iedContainer, iedPreference, iedDeclRegion, iedReqNbr,
				iedTrnbr, oidIedDet);
	}

	/** full constructor */
	public IedDet(IedDetId id, String iedComCode, String iedCtryOrigin,
			String iedModeTransp, String iedNatTrans, String iedPortArrdisp,
			String iedPortTransh, String iedStatProc, String iedTermsDeliv,
			String iedUserid, Date iedModDate, String iedCtryDesdisp,
			Boolean iedIntrastat, String iedRegion, String iedChr01,
			String iedChr02, String iedChr03, String iedChr04, String iedChr05,
			Double iedDec01, Double iedDec02, Double iedDec03, Double iedDec04,
			Double iedDec05, Date iedDte01, Date iedDte02, Date iedDte03,
			Date iedDte04, Date iedDte05, Boolean iedLog01, Boolean iedLog02,
			Boolean iedLog03, String iedQadc01, String iedQadc02,
			String iedQadc03, String iedQadc04, String iedQadc05,
			Double iedQadd01, Double iedQadd02, Double iedQadd03,
			Double iedQadd04, Double iedQadd05, Boolean iedQadl01,
			Boolean iedQadl02, Boolean iedQadl03, Boolean iedQadl04,
			Boolean iedQadl05, Date iedQadt01, Date iedQadt02, Date iedQadt03,
			Boolean iedLog04, Boolean iedLog05, Boolean iedLog06,
			String iedUser1, String iedUser2, String iedShipvia,
			String iedAffiliation, String iedItemSpec, Integer iedCsa,
			Boolean iedContainer, Integer iedPreference, String iedDeclRegion,
			String iedReqNbr, Integer iedTrnbr, Double oidIedDet) {
		super(id, iedComCode, iedCtryOrigin, iedModeTransp, iedNatTrans,
				iedPortArrdisp, iedPortTransh, iedStatProc, iedTermsDeliv,
				iedUserid, iedModDate, iedCtryDesdisp, iedIntrastat, iedRegion,
				iedChr01, iedChr02, iedChr03, iedChr04, iedChr05, iedDec01,
				iedDec02, iedDec03, iedDec04, iedDec05, iedDte01, iedDte02,
				iedDte03, iedDte04, iedDte05, iedLog01, iedLog02, iedLog03,
				iedQadc01, iedQadc02, iedQadc03, iedQadc04, iedQadc05,
				iedQadd01, iedQadd02, iedQadd03, iedQadd04, iedQadd05,
				iedQadl01, iedQadl02, iedQadl03, iedQadl04, iedQadl05,
				iedQadt01, iedQadt02, iedQadt03, iedLog04, iedLog05, iedLog06,
				iedUser1, iedUser2, iedShipvia, iedAffiliation, iedItemSpec,
				iedCsa, iedContainer, iedPreference, iedDeclRegion, iedReqNbr,
				iedTrnbr, oidIedDet);
	}

}
