package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CdfMstr entity. @author MyEclipse Persistence Tools
 */
public class CdfMstr extends AbstractCdfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CdfMstr() {
	}

	/** minimal constructor */
	public CdfMstr(CdfMstrId id, Double oidCdfMstr) {
		super(id, oidCdfMstr);
	}

	/** full constructor */
	public CdfMstr(CdfMstrId id, String cdfCaType, String cdfCaProb,
			String cdfCaQue, String cdfCaSeverity, Integer cdfCaPri,
			String cdfCaNxtsts, String cdfCaStatus, String cdfDesc,
			String cdfPart, String cdfCaDesc, String cdfUser1, String cdfUser2,
			String cdfExec, String cdfChr01, String cdfChr02, String cdfChr03,
			String cdfChr04, Double cdfDec01, Double cdfDec02, Double cdfDec03,
			Date cdfDte01, Date cdfDte02, Date cdfDte03, Boolean cdfLog01,
			Boolean cdfLog02, Boolean cdfLog03, String cdfQadc01,
			String cdfQadc02, String cdfQadc03, String cdfQadc04,
			Date cdfQadd01, Date cdfQadd02, Date cdfQadd03, Double cdfQadde01,
			Double cdfQadde02, Double cdfQadde03, Boolean cdfQadl01,
			Boolean cdfQadl02, Boolean cdfQadl03, String cdfCaEsNbr,
			String cdfEstTime, String cdfModUserid, Date cdfModDate,
			Double oidCdfMstr) {
		super(id, cdfCaType, cdfCaProb, cdfCaQue, cdfCaSeverity, cdfCaPri,
				cdfCaNxtsts, cdfCaStatus, cdfDesc, cdfPart, cdfCaDesc,
				cdfUser1, cdfUser2, cdfExec, cdfChr01, cdfChr02, cdfChr03,
				cdfChr04, cdfDec01, cdfDec02, cdfDec03, cdfDte01, cdfDte02,
				cdfDte03, cdfLog01, cdfLog02, cdfLog03, cdfQadc01, cdfQadc02,
				cdfQadc03, cdfQadc04, cdfQadd01, cdfQadd02, cdfQadd03,
				cdfQadde01, cdfQadde02, cdfQadde03, cdfQadl01, cdfQadl02,
				cdfQadl03, cdfCaEsNbr, cdfEstTime, cdfModUserid, cdfModDate,
				oidCdfMstr);
	}

}
