package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LgsMstr entity. @author MyEclipse Persistence Tools
 */
public class LgsMstr extends AbstractLgsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LgsMstr() {
	}

	/** minimal constructor */
	public LgsMstr(LgsMstrId id, Double oidLgsMstr) {
		super(id, oidLgsMstr);
	}

	/** full constructor */
	public LgsMstr(LgsMstrId id, Boolean lgsAct, Boolean lgsShipExp,
			Boolean lgsPtCstExp, Boolean lgsInvExp, Boolean lgsLadExp,
			Boolean lgsPickExp, Boolean lgsPymtExp, Boolean lgsArBalExp,
			Boolean lgsSoImp, Boolean lgsInvcExp, Boolean lgsArImp,
			Boolean lgsPtMnt, Boolean lgsCmMnt, Boolean lgsSoMnt,
			Boolean lgsLadMnt, Boolean lgsInvcImp, Date lgsModDate,
			String lgsModUserid, String lgsUser1, String lgsUser2,
			Double lgsDec01, Double lgsDec02, Integer lgsInt01,
			Integer lgsInt02, Boolean lgsLog01, Boolean lgsLog02,
			Date lgsDte01, Date lgsDte02, String lgsQadc01, String lgsQadc02,
			String lgsQadc03, String lgsQadc04, Double lgsQadd01,
			Double lgsQadd02, Integer lgsQadi01, Integer lgsQadi02,
			Boolean lgsQadl01, Boolean lgsQadl02, Date lgsQadt01,
			Date lgsQadt02, String lgsTaxEnv, String lgsTaxc,
			Boolean lgsPriceImp, Boolean lgsTaxImp, Double oidLgsMstr) {
		super(id, lgsAct, lgsShipExp, lgsPtCstExp, lgsInvExp, lgsLadExp,
				lgsPickExp, lgsPymtExp, lgsArBalExp, lgsSoImp, lgsInvcExp,
				lgsArImp, lgsPtMnt, lgsCmMnt, lgsSoMnt, lgsLadMnt, lgsInvcImp,
				lgsModDate, lgsModUserid, lgsUser1, lgsUser2, lgsDec01,
				lgsDec02, lgsInt01, lgsInt02, lgsLog01, lgsLog02, lgsDte01,
				lgsDte02, lgsQadc01, lgsQadc02, lgsQadc03, lgsQadc04,
				lgsQadd01, lgsQadd02, lgsQadi01, lgsQadi02, lgsQadl01,
				lgsQadl02, lgsQadt01, lgsQadt02, lgsTaxEnv, lgsTaxc,
				lgsPriceImp, lgsTaxImp, oidLgsMstr);
	}

}
