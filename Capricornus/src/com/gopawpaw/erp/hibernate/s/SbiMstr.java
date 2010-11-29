package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SbiMstr entity. @author MyEclipse Persistence Tools
 */
public class SbiMstr extends AbstractSbiMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SbiMstr() {
	}

	/** minimal constructor */
	public SbiMstr(SbiMstrId id, String sbiXmission, Double oidSbiMstr) {
		super(id, sbiXmission, oidSbiMstr);
	}

	/** full constructor */
	public SbiMstr(SbiMstrId id, String sbiXmission, Date sbiRespDate,
			Double sbiAmt, String sbiCurr, Integer sbiLines, Double sbiCtrlAmt,
			String sbiCheck, String sbiModUserid, Date sbiModDate,
			String sbiUser1, String sbiUser2, String sbiUser3, String sbiUser4,
			String sbiUser5, String sbiQadc01, String sbiQadc02,
			String sbiQadc03, String sbiQadc04, String sbiQadc05,
			String sbiQadc06, String sbiQadc07, String sbiQadc08,
			String sbiQadc09, String sbiQadc10, Integer sbiQadi01,
			Integer sbiQadi02, Integer sbiQadi03, Integer sbiQadi04,
			Integer sbiQadi05, Double sbiQadd01, Double sbiQadd02,
			Double sbiQadd03, Double sbiQadd04, Double sbiQadd05,
			Boolean sbiQadl01, Boolean sbiQadl02, Boolean sbiQadl03,
			Boolean sbiQadl04, Boolean sbiQadl05, Date sbiQadt01,
			Date sbiQadt02, Date sbiQadt03, Date sbiQadt04, Date sbiQadt05,
			Double oidSbiMstr) {
		super(id, sbiXmission, sbiRespDate, sbiAmt, sbiCurr, sbiLines,
				sbiCtrlAmt, sbiCheck, sbiModUserid, sbiModDate, sbiUser1,
				sbiUser2, sbiUser3, sbiUser4, sbiUser5, sbiQadc01, sbiQadc02,
				sbiQadc03, sbiQadc04, sbiQadc05, sbiQadc06, sbiQadc07,
				sbiQadc08, sbiQadc09, sbiQadc10, sbiQadi01, sbiQadi02,
				sbiQadi03, sbiQadi04, sbiQadi05, sbiQadd01, sbiQadd02,
				sbiQadd03, sbiQadd04, sbiQadd05, sbiQadl01, sbiQadl02,
				sbiQadl03, sbiQadl04, sbiQadl05, sbiQadt01, sbiQadt02,
				sbiQadt03, sbiQadt04, sbiQadt05, oidSbiMstr);
	}

}
