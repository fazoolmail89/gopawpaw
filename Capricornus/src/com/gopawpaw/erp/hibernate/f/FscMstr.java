package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FscMstr entity. @author MyEclipse Persistence Tools
 */
public class FscMstr extends AbstractFscMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FscMstr() {
	}

	/** minimal constructor */
	public FscMstr(FscMstrId id, Double oidFscMstr) {
		super(id, oidFscMstr);
	}

	/** full constructor */
	public FscMstr(FscMstrId id, Boolean fscConParts, Boolean fscCustomer,
			Boolean fscCusNonProd, String fscDesc, Boolean fscExgParts,
			Boolean fscExpense, Integer fscFisColumn, String fscFisSort,
			Boolean fscLabor, Boolean fscNonProd, Boolean fscOther,
			Boolean fscParts, Boolean fscSick, Boolean fscTraining,
			Boolean fscTravelExp, Boolean fscTravelLabor, Boolean fscVacation,
			String fscChr01, String fscChr02, String fscChr03, String fscChr04,
			Double fscDec01, Double fscDec02, Double fscDec03, Date fscDte01,
			Date fscDte02, Date fscDte03, Boolean fscLog01, Boolean fscLog02,
			Boolean fscLog03, String fscQadc01, String fscQadc02,
			String fscQadc03, String fscQadc04, Date fscQadd01, Date fscQadd02,
			Date fscQadd03, Double fscQadde01, Double fscQadde02,
			Double fscQadde03, Boolean fscQadl01, Boolean fscQadl02,
			Boolean fscQadl03, String fscUser1, String fscUser2,
			Double fscLbrRate, Double fscBdnPct, Double fscBdnRate,
			String fscTaxc, Boolean fscTaxable, Double oidFscMstr) {
		super(id, fscConParts, fscCustomer, fscCusNonProd, fscDesc,
				fscExgParts, fscExpense, fscFisColumn, fscFisSort, fscLabor,
				fscNonProd, fscOther, fscParts, fscSick, fscTraining,
				fscTravelExp, fscTravelLabor, fscVacation, fscChr01, fscChr02,
				fscChr03, fscChr04, fscDec01, fscDec02, fscDec03, fscDte01,
				fscDte02, fscDte03, fscLog01, fscLog02, fscLog03, fscQadc01,
				fscQadc02, fscQadc03, fscQadc04, fscQadd01, fscQadd02,
				fscQadd03, fscQadde01, fscQadde02, fscQadde03, fscQadl01,
				fscQadl02, fscQadl03, fscUser1, fscUser2, fscLbrRate,
				fscBdnPct, fscBdnRate, fscTaxc, fscTaxable, oidFscMstr);
	}

}
