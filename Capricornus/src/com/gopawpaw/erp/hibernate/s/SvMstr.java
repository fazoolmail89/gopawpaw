package com.gopawpaw.erp.hibernate.s;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SvMstr entity. @author MyEclipse Persistence Tools
 */
public class SvMstr extends AbstractSvMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SvMstr() {
	}

	/** minimal constructor */
	public SvMstr(SvMstrId id, Double oidSvMstr) {
		super(id, oidSvMstr);
	}

	/** full constructor */
	public SvMstr(SvMstrId id, String svDesc, String svPrList,
			Integer svRspTime, Boolean svRmaonly, Integer svDfltPri,
			Boolean svOnsite, String svQoTitle, String svSoTitle,
			Integer svDuration, String svDays, Boolean svHolidays,
			String svSvcType, String svChr01, String svChr02, String svChr03,
			String svChr04, String svChr05, Integer svCmtindx, String svStTime,
			String svEdTime, Boolean svShpB4rtn, String svCrPrlist,
			Double svRstkPct, String svRspUm, String svDurUm,
			Boolean svBlanket, String svRmaprice, Double svVisits,
			String svStime, String svEtime, String svCstmlist, String svUser1,
			String svUser2, String svEsNbr, String svOffHoursPt,
			String svProdLine, BigDecimal svCallsAllow, Integer svLaborDur,
			String svLaborUm, Boolean svTaxable, String svTaxc,
			String svTaxUsage, String svCallPrice, String svQadc01,
			String svQadc02, String svQadc03, String svQadc04, Date svQadt01,
			Date svQadt02, Date svQadt03, Double svQadd01, Double svQadd02,
			Double svQadd03, Boolean svQadl01, Boolean svQadl02,
			Boolean svQadl03, Double oidSvMstr) {
		super(id, svDesc, svPrList, svRspTime, svRmaonly, svDfltPri, svOnsite,
				svQoTitle, svSoTitle, svDuration, svDays, svHolidays,
				svSvcType, svChr01, svChr02, svChr03, svChr04, svChr05,
				svCmtindx, svStTime, svEdTime, svShpB4rtn, svCrPrlist,
				svRstkPct, svRspUm, svDurUm, svBlanket, svRmaprice, svVisits,
				svStime, svEtime, svCstmlist, svUser1, svUser2, svEsNbr,
				svOffHoursPt, svProdLine, svCallsAllow, svLaborDur, svLaborUm,
				svTaxable, svTaxc, svTaxUsage, svCallPrice, svQadc01, svQadc02,
				svQadc03, svQadc04, svQadt01, svQadt02, svQadt03, svQadd01,
				svQadd02, svQadd03, svQadl01, svQadl02, svQadl03, oidSvMstr);
	}

}
