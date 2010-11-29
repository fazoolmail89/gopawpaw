package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VoMstr entity. @author MyEclipse Persistence Tools
 */
public class VoMstr extends AbstractVoMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VoMstr() {
	}

	/** minimal constructor */
	public VoMstr(VoMstrId id, Double voExRate2, String voExRatetype,
			Double voBaseApplied, Double voBaseAmtChg, Double voBaseDiscChg,
			Double voBaseNdisc, Double voBaseHoldAmt, Integer voExruSeq,
			Boolean voWaitingExp, Double voResaleAmt, Double oidVoMstr) {
		super(id, voExRate2, voExRatetype, voBaseApplied, voBaseAmtChg,
				voBaseDiscChg, voBaseNdisc, voBaseHoldAmt, voExruSeq,
				voWaitingExp, voResaleAmt, oidVoMstr);
	}

	/** full constructor */
	public VoMstr(VoMstrId id, String voCrTerms, String voInvoice,
			Double voApplied, Date voDiscDate, Date voDueDate, Boolean voHold,
			Date voPaidDate, Double voAmtChg, Double voDiscChg, String voPo,
			String voReceiver, Double voNdiscAmt, Double voHoldAmt,
			Integer voCmtindx, String voCurr, Double voExRate, String voUser1,
			Boolean voSeparate, String voShip, String voChr01, String voChr02,
			String voChr03, String voChr04, String voChr05, Date voDte01,
			Date voDte02, Double voDec01, Double voDec02, Boolean voLog01,
			String voTaxPct, String voType, Boolean voConfirmed,
			String voConfBy, Boolean voPoRcvd, Double voPrepay, Date voTaxDate,
			Boolean voModok, String voUser2, String voTaxEnv, Boolean voRecur,
			String voRcycle, Integer voRnbrCyc, Date voRstart, Date voRexpire,
			Date voRelDate, String voRvNbr, Double voLcAmt, String voQad01,
			String voQad02, Boolean voQad03, Boolean voIsErs,
			Boolean voTaxable, String voTaxc, String voTaxUsage,
			Double voExRate2, String voExRatetype, Double voBaseApplied,
			Double voBaseAmtChg, Double voBaseDiscChg, Double voBaseNdisc,
			Double voBaseHoldAmt, Integer voExruSeq, Boolean voWaitingExp,
			Double voResaleAmt, Double oidVoMstr) {
		super(id, voCrTerms, voInvoice, voApplied, voDiscDate, voDueDate,
				voHold, voPaidDate, voAmtChg, voDiscChg, voPo, voReceiver,
				voNdiscAmt, voHoldAmt, voCmtindx, voCurr, voExRate, voUser1,
				voSeparate, voShip, voChr01, voChr02, voChr03, voChr04,
				voChr05, voDte01, voDte02, voDec01, voDec02, voLog01, voTaxPct,
				voType, voConfirmed, voConfBy, voPoRcvd, voPrepay, voTaxDate,
				voModok, voUser2, voTaxEnv, voRecur, voRcycle, voRnbrCyc,
				voRstart, voRexpire, voRelDate, voRvNbr, voLcAmt, voQad01,
				voQad02, voQad03, voIsErs, voTaxable, voTaxc, voTaxUsage,
				voExRate2, voExRatetype, voBaseApplied, voBaseAmtChg,
				voBaseDiscChg, voBaseNdisc, voBaseHoldAmt, voExruSeq,
				voWaitingExp, voResaleAmt, oidVoMstr);
	}

}
