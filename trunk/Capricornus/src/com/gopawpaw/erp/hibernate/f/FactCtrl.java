package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FactCtrl entity. @author MyEclipse Persistence Tools
 */
public class FactCtrl extends AbstractFactCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FactCtrl() {
	}

	/** minimal constructor */
	public FactCtrl(Boolean factAuto, Boolean factGlSum, Integer factIndex1,
			String factSeqId, String factQadc03, String factQadc05,
			String factQadc04, String factModUserid, Date factModDate,
			String factUser1, String factUser2, String factChr01,
			Double factDec01, Boolean factLog01, Integer factInt01,
			String factQadc01, Double factQadd01, Boolean factQadl01,
			Integer factQadi01, String factQadc02, Double oidFactCtrl) {
		super(factAuto, factGlSum, factIndex1, factSeqId, factQadc03,
				factQadc05, factQadc04, factModUserid, factModDate, factUser1,
				factUser2, factChr01, factDec01, factLog01, factInt01,
				factQadc01, factQadd01, factQadl01, factQadi01, factQadc02,
				oidFactCtrl);
	}

	/** full constructor */
	public FactCtrl(Boolean factAuto, Boolean factGlSum, Integer factIndex1,
			String factSeqId, String factQadc03, String factQadc05,
			String factQadc04, String factModUserid, Date factModDate,
			String factUser1, String factUser2, String factChr01,
			Double factDec01, Boolean factLog01, Date factDte01,
			Integer factInt01, String factQadc01, Double factQadd01,
			Boolean factQadl01, Integer factQadi01, Date factQadt01,
			String factQadc02, Double oidFactCtrl) {
		super(factAuto, factGlSum, factIndex1, factSeqId, factQadc03,
				factQadc05, factQadc04, factModUserid, factModDate, factUser1,
				factUser2, factChr01, factDec01, factLog01, factDte01,
				factInt01, factQadc01, factQadd01, factQadl01, factQadi01,
				factQadt01, factQadc02, oidFactCtrl);
	}

}
