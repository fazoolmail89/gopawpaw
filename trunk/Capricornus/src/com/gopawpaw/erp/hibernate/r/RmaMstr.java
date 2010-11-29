package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RmaMstr entity. @author MyEclipse Persistence Tools
 */
public class RmaMstr extends AbstractRmaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RmaMstr() {
	}

	/** minimal constructor */
	public RmaMstr(RmaMstrId id, Double oidRmaMstr) {
		super(id, oidRmaMstr);
	}

	/** full constructor */
	public RmaMstr(RmaMstrId id, String rmaCustVen, String rmaShip,
			Date rmaOrdDate, Date rmaReqDate, Date rmaExpDate,
			Boolean rmaPrtRec, String rmaPrList, String rmaSource,
			String rmaStat, Date rmaShipdate, Integer rmaCmtindx,
			String rmaUser1, String rmaUser2, String rmaType, String rmaChr01,
			String rmaChr02, String rmaChr03, String rmaChr04, String rmaChr05,
			String rmaChr06, String rmaChr07, String rmaChr08, String rmaChr09,
			String rmaChr10, Date rmaDte01, Date rmaDte02, Double rmaDec01,
			Double rmaDec02, Boolean rmaLog01, Boolean rmaComplete,
			String rmaCrprlist, String rmaContract, String rmaCtype,
			String rmaCaNbr, String rmaLocIss, String rmaSiteRec,
			String rmaSiteIss, String rmaLocRec, String rmaBillTo,
			String rmaQadc04, String rmaEngCode, Double rmaQadd03,
			Boolean rmaTaxable, String rmaTaxc, String rmaCstmlist,
			String rmaEnduser, String rmaQadc01, String rmaQadc02,
			String rmaQadc03, Date rmaQadt01, Date rmaQadt02, Date rmaQadt03,
			Double rmaQadd01, Double rmaQadd02, Integer rmaQadi01,
			Integer rmaQadi02, Boolean rmaQadl01, Boolean rmaQadl02,
			String rmaModUserid, Date rmaModDate, Double rmaRstkPct,
			Double rmaQadd04, String rmaQadc05, Integer rmaQadi03,
			Double oidRmaMstr) {
		super(id, rmaCustVen, rmaShip, rmaOrdDate, rmaReqDate, rmaExpDate,
				rmaPrtRec, rmaPrList, rmaSource, rmaStat, rmaShipdate,
				rmaCmtindx, rmaUser1, rmaUser2, rmaType, rmaChr01, rmaChr02,
				rmaChr03, rmaChr04, rmaChr05, rmaChr06, rmaChr07, rmaChr08,
				rmaChr09, rmaChr10, rmaDte01, rmaDte02, rmaDec01, rmaDec02,
				rmaLog01, rmaComplete, rmaCrprlist, rmaContract, rmaCtype,
				rmaCaNbr, rmaLocIss, rmaSiteRec, rmaSiteIss, rmaLocRec,
				rmaBillTo, rmaQadc04, rmaEngCode, rmaQadd03, rmaTaxable,
				rmaTaxc, rmaCstmlist, rmaEnduser, rmaQadc01, rmaQadc02,
				rmaQadc03, rmaQadt01, rmaQadt02, rmaQadt03, rmaQadd01,
				rmaQadd02, rmaQadi01, rmaQadi02, rmaQadl01, rmaQadl02,
				rmaModUserid, rmaModDate, rmaRstkPct, rmaQadd04, rmaQadc05,
				rmaQadi03, oidRmaMstr);
	}

}
