package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WhlMstr entity. @author MyEclipse Persistence Tools
 */
public class WhlMstr extends AbstractWhlMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WhlMstr() {
	}

	/** minimal constructor */
	public WhlMstr(WhlMstrId id, Date whlDate, Boolean whlDoExp,
			Boolean whlPtExp, Double oidWhlMstr) {
		super(id, whlDate, whlDoExp, whlPtExp, oidWhlMstr);
	}

	/** full constructor */
	public WhlMstr(WhlMstrId id, String whlSrcDestId, Date whlDate,
			Boolean whlAct, Boolean whlUmExp, Boolean whlPoExp,
			Boolean whlSoExp, Boolean whlWoExp, Boolean whlDoExp,
			Boolean whlDoReqExp, Boolean whlCustExp, Boolean whlSupExp,
			Boolean whlCustItemNbrExp, Boolean whlRpsExp,
			Boolean whlSupItemNbrExp, Boolean whlDoReqCmtExp,
			Boolean whlDoCmtExp, Boolean whlPoCmtExp, Boolean whlWoCmtExp,
			Boolean whlSoCmtExp, String whlUser1, String whlUser2,
			String whlQadc01, String whlQadc02, Double whlQadd03,
			Date whlQadt04, Boolean whlQadl05, String whlChr01,
			Double whlDec01, Date whlDte01, Boolean whlLog01, Boolean whlPtExp,
			Boolean whlWoRcptExp, Double oidWhlMstr) {
		super(id, whlSrcDestId, whlDate, whlAct, whlUmExp, whlPoExp, whlSoExp,
				whlWoExp, whlDoExp, whlDoReqExp, whlCustExp, whlSupExp,
				whlCustItemNbrExp, whlRpsExp, whlSupItemNbrExp, whlDoReqCmtExp,
				whlDoCmtExp, whlPoCmtExp, whlWoCmtExp, whlSoCmtExp, whlUser1,
				whlUser2, whlQadc01, whlQadc02, whlQadd03, whlQadt04,
				whlQadl05, whlChr01, whlDec01, whlDte01, whlLog01, whlPtExp,
				whlWoRcptExp, oidWhlMstr);
	}

}
