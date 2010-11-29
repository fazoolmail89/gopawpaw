package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FabDet entity. @author MyEclipse Persistence Tools
 */
public class FabDet extends AbstractFabDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FabDet() {
	}

	/** minimal constructor */
	public FabDet(FabDetId id, String fabFamtId, Double fabLife, Date fabDate,
			Double fabAmt, Double fabOvramt, Double fabSalvamt,
			Integer fabUplife, Integer fabUpper, String fabUm,
			String fabFamtrId, Double fabUpcost, String fabCstAdjper,
			String fabModUserid, Date fabModDate, String fabUser1,
			String fabUser2, String fabChr01, Double fabDec01,
			Boolean fabLog01, Integer fabInt01, String fabQadc01,
			Integer fabInt02, Double fabDec02, Double fabQadd01,
			Boolean fabQadl01, Integer fabQadi01, String fabQadc02,
			Double fabQadd02, Integer fabQadi02, Boolean fabQadl02,
			String fabQadc03, Double oidFabDet) {
		super(id, fabFamtId, fabLife, fabDate, fabAmt, fabOvramt, fabSalvamt,
				fabUplife, fabUpper, fabUm, fabFamtrId, fabUpcost,
				fabCstAdjper, fabModUserid, fabModDate, fabUser1, fabUser2,
				fabChr01, fabDec01, fabLog01, fabInt01, fabQadc01, fabInt02,
				fabDec02, fabQadd01, fabQadl01, fabQadi01, fabQadc02,
				fabQadd02, fabQadi02, fabQadl02, fabQadc03, oidFabDet);
	}

	/** full constructor */
	public FabDet(FabDetId id, String fabFamtId, Double fabLife, Date fabDate,
			Double fabAmt, Date fabOvrdt, Double fabOvramt, Double fabSalvamt,
			Integer fabUplife, Integer fabUpper, String fabUm,
			String fabFamtrId, Double fabUpcost, String fabCstAdjper,
			String fabModUserid, Date fabModDate, String fabUser1,
			String fabUser2, String fabChr01, Double fabDec01,
			Boolean fabLog01, Date fabDte01, Integer fabInt01,
			String fabQadc01, Integer fabInt02, Double fabDec02,
			Double fabQadd01, Boolean fabQadl01, Integer fabQadi01,
			Date fabQadt01, String fabQadc02, Double fabQadd02,
			Integer fabQadi02, Boolean fabQadl02, Date fabQadt02,
			String fabQadc03, Double oidFabDet) {
		super(id, fabFamtId, fabLife, fabDate, fabAmt, fabOvrdt, fabOvramt,
				fabSalvamt, fabUplife, fabUpper, fabUm, fabFamtrId, fabUpcost,
				fabCstAdjper, fabModUserid, fabModDate, fabUser1, fabUser2,
				fabChr01, fabDec01, fabLog01, fabDte01, fabInt01, fabQadc01,
				fabInt02, fabDec02, fabQadd01, fabQadl01, fabQadi01, fabQadt01,
				fabQadc02, fabQadd02, fabQadi02, fabQadl02, fabQadt02,
				fabQadc03, oidFabDet);
	}

}
