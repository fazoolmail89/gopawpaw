package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbdDet entity. @author MyEclipse Persistence Tools
 */
public class AbdDet extends AbstractAbdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbdDet() {
	}

	/** minimal constructor */
	public AbdDet(AbdDetId id, Integer abdLifeYr, Integer abdLifeMnth,
			Integer abdRemYr, Integer abdRemMnth, Date abdLastDepr,
			Double abdSchedDepr, Double abdUdec4, Double abdExRate2,
			String abdExRatetype, Integer abdExruSeq, Double oidAbdDet) {
		super(id, abdLifeYr, abdLifeMnth, abdRemYr, abdRemMnth, abdLastDepr,
				abdSchedDepr, abdUdec4, abdExRate2, abdExRatetype, abdExruSeq,
				oidAbdDet);
	}

	/** full constructor */
	public AbdDet(AbdDetId id, String abdType, Boolean abdActive,
			Double abdCost, Double abdCurrCost, Double abdExRate,
			Double abdEntEx, Integer abdLifeYr, Integer abdLifeMnth,
			Integer abdRemYr, Integer abdRemMnth, String abdMethod,
			Double abdSalvage, Double abdDtd, Double abdYtd, Double abdPdDepr,
			Date abdLastDepr, Double abdExpense, Double abdBonus,
			Double abdCredit, Double abdCrAmt, String abdConv, Double abdDbPct,
			Integer abdUint1, Integer abdUint2, Integer abdUint3,
			Double abdUdec1, Double abdUdec2, Double abdUdec3,
			Double abdPriorAst, String abdUser1, String abdUser2,
			String abdQad01, String abdQad02, Double abdRepPct, Date abdDate,
			Integer abdPeriods, Double abdYtdTotal, Double abdFirstMnth,
			Date abdRtDate, String abdQad03, Double abdSchedDepr,
			Double abdUdec4, Double abdExRate2, String abdExRatetype,
			Integer abdExruSeq, Double oidAbdDet) {
		super(id, abdType, abdActive, abdCost, abdCurrCost, abdExRate,
				abdEntEx, abdLifeYr, abdLifeMnth, abdRemYr, abdRemMnth,
				abdMethod, abdSalvage, abdDtd, abdYtd, abdPdDepr, abdLastDepr,
				abdExpense, abdBonus, abdCredit, abdCrAmt, abdConv, abdDbPct,
				abdUint1, abdUint2, abdUint3, abdUdec1, abdUdec2, abdUdec3,
				abdPriorAst, abdUser1, abdUser2, abdQad01, abdQad02, abdRepPct,
				abdDate, abdPeriods, abdYtdTotal, abdFirstMnth, abdRtDate,
				abdQad03, abdSchedDepr, abdUdec4, abdExRate2, abdExRatetype,
				abdExruSeq, oidAbdDet);
	}

}
