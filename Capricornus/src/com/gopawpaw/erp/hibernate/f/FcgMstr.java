package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FcgMstr entity. @author MyEclipse Persistence Tools
 */
public class FcgMstr extends AbstractFcgMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FcgMstr() {
	}

	/** minimal constructor */
	public FcgMstr(FcgMstrId id, Double oidFcgMstr) {
		super(id, oidFcgMstr);
	}

	/** full constructor */
	public FcgMstr(FcgMstrId id, Boolean fcgBillable, Boolean fcgContract,
			String fcgDesc, Boolean fcgFixBillable, Boolean fcgGiveaway,
			Integer fcgIndex, Boolean fcgProject, Boolean fcgWarranty,
			String fcgChr01, String fcgChr02, String fcgChr03, String fcgChr04,
			Double fcgDec01, Double fcgDec02, Double fcgDec03, Date fcgDte01,
			Date fcgDte02, Date fcgDte03, Boolean fcgLog01, Boolean fcgLog02,
			Boolean fcgLog03, String fcgQadc01, String fcgQadc02,
			String fcgQadc03, String fcgQadc04, Date fcgQadd01, Date fcgQadd02,
			Date fcgQadd03, Double fcgQadde01, Double fcgQadde02,
			Double fcgQadde03, Boolean fcgQadl01, Boolean fcgQadl02,
			Boolean fcgQadl03, Boolean fcgFixIndex, Boolean fcgCovered,
			String fcgUser1, String fcgUser2, String fcgModUserid,
			Date fcgModDate, Double oidFcgMstr) {
		super(id, fcgBillable, fcgContract, fcgDesc, fcgFixBillable,
				fcgGiveaway, fcgIndex, fcgProject, fcgWarranty, fcgChr01,
				fcgChr02, fcgChr03, fcgChr04, fcgDec01, fcgDec02, fcgDec03,
				fcgDte01, fcgDte02, fcgDte03, fcgLog01, fcgLog02, fcgLog03,
				fcgQadc01, fcgQadc02, fcgQadc03, fcgQadc04, fcgQadd01,
				fcgQadd02, fcgQadd03, fcgQadde01, fcgQadde02, fcgQadde03,
				fcgQadl01, fcgQadl02, fcgQadl03, fcgFixIndex, fcgCovered,
				fcgUser1, fcgUser2, fcgModUserid, fcgModDate, oidFcgMstr);
	}

}
