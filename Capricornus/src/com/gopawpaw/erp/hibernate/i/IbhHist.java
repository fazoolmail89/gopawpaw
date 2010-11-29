package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IbhHist entity. @author MyEclipse Persistence Tools
 */
public class IbhHist extends AbstractIbhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IbhHist() {
	}

	/** minimal constructor */
	public IbhHist(IbhHistId id, String ibhParent, Double oidIbhHist) {
		super(id, ibhParent, oidIbhHist);
	}

	/** full constructor */
	public IbhHist(IbhHistId id, Date ibhIssDate, Double ibhQtyReq,
			Double ibhQtyAll, Double ibhQtyPick, Double ibhQtyIss,
			Double ibhTotStd, Double ibhQtyChg, Double ibhBoChg,
			Double ibhPrice, String ibhLoc, String ibhSerial,
			Integer ibhCmtindx, String ibhUser1, String ibhUser2,
			String ibhSite, String ibhParent, String ibhQadc01,
			String ibhCfgType, Double oidIbhHist) {
		super(id, ibhIssDate, ibhQtyReq, ibhQtyAll, ibhQtyPick, ibhQtyIss,
				ibhTotStd, ibhQtyChg, ibhBoChg, ibhPrice, ibhLoc, ibhSerial,
				ibhCmtindx, ibhUser1, ibhUser2, ibhSite, ibhParent, ibhQadc01,
				ibhCfgType, oidIbhHist);
	}

}
