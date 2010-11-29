package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FpciMstr entity. @author MyEclipse Persistence Tools
 */
public class FpciMstr extends AbstractFpciMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FpciMstr() {
	}

	/** minimal constructor */
	public FpciMstr(FpciMstrId id, Double oidFpciMstr) {
		super(id, oidFpciMstr);
	}

	/** full constructor */
	public FpciMstr(FpciMstrId id, Date fpciModDate, Double fpciRevalLink,
			String fpciUserid, String fpciValues, String fpciChr01,
			String fpciChr02, String fpciChr03, String fpciChr04,
			Double fpciDec01, Double fpciDec02, Double fpciDec03,
			Date fpciDte01, Date fpciDte02, Date fpciDte03, Boolean fpciLog01,
			Boolean fpciLog02, Boolean fpciLog03, String fpciQadc01,
			String fpciQadc02, String fpciQadc03, String fpciQadc04,
			Date fpciQadd01, Date fpciQadd02, Date fpciQadd03,
			Double fpciQadde01, Double fpciQadde02, Double fpciQadde03,
			Boolean fpciQadl01, Boolean fpciQadl02, Boolean fpciQadl03,
			String fpciUser1, String fpciUser2, Double oidFpciMstr) {
		super(id, fpciModDate, fpciRevalLink, fpciUserid, fpciValues,
				fpciChr01, fpciChr02, fpciChr03, fpciChr04, fpciDec01,
				fpciDec02, fpciDec03, fpciDte01, fpciDte02, fpciDte03,
				fpciLog01, fpciLog02, fpciLog03, fpciQadc01, fpciQadc02,
				fpciQadc03, fpciQadc04, fpciQadd01, fpciQadd02, fpciQadd03,
				fpciQadde01, fpciQadde02, fpciQadde03, fpciQadl01, fpciQadl02,
				fpciQadl03, fpciUser1, fpciUser2, oidFpciMstr);
	}

}
