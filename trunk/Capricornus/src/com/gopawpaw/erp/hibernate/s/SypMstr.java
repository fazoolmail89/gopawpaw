package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SypMstr entity. @author MyEclipse Persistence Tools
 */
public class SypMstr extends AbstractSypMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SypMstr() {
	}

	/** minimal constructor */
	public SypMstr(Double oidSypMstr) {
		super(oidSypMstr);
	}

	/** full constructor */
	public SypMstr(String sypProflDesc, String sypDbname, String sypTblname,
			String sypPublProc, Boolean sypExpDump, Boolean sypExpAdd,
			Boolean sypAddAsChg, Boolean sypExpDel, Boolean sypDelAsChg,
			Boolean sypExpChg, String sypFltCrit, String sypModUserid,
			Date sypModDate, String sypUser1, String sypUser2, String sypChr01,
			String sypChr02, Double sypDec01, Double sypDec02,
			Integer sypInt01, Integer sypInt02, Boolean sypLog01,
			Boolean sypLog02, Date sypDte01, Date sypDte02, String sypQadc01,
			String sypQadc02, String sypQadc03, String sypQadc04,
			Double sypQadd01, Double sypQadd02, Integer sypQadi01,
			Integer sypQadi02, Boolean sypQadl01, Boolean sypQadl02,
			Date sypQadt01, Date sypQadt02, Boolean sypExpRowidOnly,
			Double oidSypMstr) {
		super(sypProflDesc, sypDbname, sypTblname, sypPublProc, sypExpDump,
				sypExpAdd, sypAddAsChg, sypExpDel, sypDelAsChg, sypExpChg,
				sypFltCrit, sypModUserid, sypModDate, sypUser1, sypUser2,
				sypChr01, sypChr02, sypDec01, sypDec02, sypInt01, sypInt02,
				sypLog01, sypLog02, sypDte01, sypDte02, sypQadc01, sypQadc02,
				sypQadc03, sypQadc04, sypQadd01, sypQadd02, sypQadi01,
				sypQadi02, sypQadl01, sypQadl02, sypQadt01, sypQadt02,
				sypExpRowidOnly, oidSypMstr);
	}

}
