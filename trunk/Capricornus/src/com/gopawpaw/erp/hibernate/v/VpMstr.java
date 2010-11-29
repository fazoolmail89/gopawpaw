package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VpMstr entity. @author MyEclipse Persistence Tools
 */
public class VpMstr extends AbstractVpMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VpMstr() {
	}

	/** minimal constructor */
	public VpMstr(VpMstrId id, String vpUm, Boolean vpTpUsePct, Double vpTpPct,
			Double oidVpMstr) {
		super(id, vpUm, vpTpUsePct, vpTpPct, oidVpMstr);
	}

	/** full constructor */
	public VpMstr(VpMstrId id, String vpUm, Integer vpVendLead,
			Double vpQPrice, Date vpQDate, Double vpQQty, String vpMfgr,
			String vpMfgrPart, String vpComment, String vpPrList,
			String vpUser1, String vpUser2, String vpCurr, Double vpBkageAmt,
			Double vpDutyAmt, String vpDutyType, Double vpFrtAmt,
			Double vpSchPct, Date vpApprDate, String vpChr01, String vpChr02,
			String vpChr03, String vpChr04, String vpChr05, Date vpDte01,
			Date vpDte02, Double vpDec01, Double vpDec02, Boolean vpLog01,
			String vpUserid, Date vpModDate, String vpPkgCode,
			Boolean vpInsRqd, String vpRcptStat, Boolean vpTpUsePct,
			Double vpTpPct, Double oidVpMstr) {
		super(id, vpUm, vpVendLead, vpQPrice, vpQDate, vpQQty, vpMfgr,
				vpMfgrPart, vpComment, vpPrList, vpUser1, vpUser2, vpCurr,
				vpBkageAmt, vpDutyAmt, vpDutyType, vpFrtAmt, vpSchPct,
				vpApprDate, vpChr01, vpChr02, vpChr03, vpChr04, vpChr05,
				vpDte01, vpDte02, vpDec01, vpDec02, vpLog01, vpUserid,
				vpModDate, vpPkgCode, vpInsRqd, vpRcptStat, vpTpUsePct,
				vpTpPct, oidVpMstr);
	}

}
