package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QoMstr entity. @author MyEclipse Persistence Tools
 */
public class QoMstr extends AbstractQoMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QoMstr() {
	}

	/** minimal constructor */
	public QoMstr(QoMstrId id, Double qoExRate2, String qoExRatetype,
			Integer qoExruSeq, String qoAppOwner, Boolean qoManualFrTerms,
			Double oidQoMstr) {
		super(id, qoExRate2, qoExRatetype, qoExruSeq, qoAppOwner,
				qoManualFrTerms, oidQoMstr);
	}

	/** full constructor */
	public QoMstr(QoMstrId id, String qoCust, String qoShip, Date qoOrdDate,
			Date qoReqDate, Date qoDueDate, String qoRmks, String qoCrTerms,
			String qoFob, String qoPo, String qoShipvia, Boolean qoPartial,
			Boolean qoPrintQo, String qoPrList, String qoXslspsn,
			String qoSource, String qoXcommPct, String qoCrCard,
			Boolean qoPrintPl, String qoCrInit, String qoStat, Double qoQad01,
			Double qoQad02, Double qoQad03, Double qoDiscPct, String qoTaxPct,
			Double qoPrepaid, String qoArAcct, String qoArCc, Date qoShipDate,
			Boolean qoTaxable, Integer qoCmtindx, Integer qoQad04,
			String qoUser1, String qoUser2, String qoSoNbr, Date qoConfirm,
			Date qoExpDate, Date qoRelDate, Boolean qoRelease, Boolean qoRecur,
			String qoCycle, Integer qoRelCnt, Date qoFlwDate, String qoCurr,
			Double qoExRate, String qoLang, String qoQad05, Boolean qoPst,
			String qoFstId, String qoPstId, Double qoTrl1Amt, String qoTrl1Cd,
			Double qoTrl2Amt, String qoTrl2Cd, Double qoTrl3Amt,
			String qoTrl3Cd, Double qoWeight, String qoWeightUm, Double qoSize,
			String qoSizeUm, Integer qoCartons, String qoBol, String qoSite,
			String qoTaxc, String qoChr01, String qoChr02, String qoChr03,
			String qoChr04, String qoChr05, String qoChr06, String qoChr07,
			String qoChr08, String qoChr09, String qoChr10, Date qoDte01,
			Date qoDte02, Double qoDec01, Double qoDec02, Boolean qoLog01,
			String qoProject, Integer qoRev, Double qoPstPct, String qoFrList,
			String qoFrTerms, String qoCommPct, String qoSlspsn,
			Boolean qoFixRate, Double qoEntEx, String qoBill,
			Boolean qoPrintBl, String qoUserid, Date qoTaxDate,
			String qoChannel, String qoInvMthd, String qoBank,
			Double qoFrMinWt, String qoPrList2, String qoTaxEnv,
			String qoTaxUsage, Date qoPricedDt, Date qoPricingDt,
			Double qoExRate2, String qoExRatetype, String qoDiv,
			Integer qoExruSeq, String qoArSub, String qoAppOwner,
			Boolean qoManualFrTerms, Double oidQoMstr) {
		super(id, qoCust, qoShip, qoOrdDate, qoReqDate, qoDueDate, qoRmks,
				qoCrTerms, qoFob, qoPo, qoShipvia, qoPartial, qoPrintQo,
				qoPrList, qoXslspsn, qoSource, qoXcommPct, qoCrCard, qoPrintPl,
				qoCrInit, qoStat, qoQad01, qoQad02, qoQad03, qoDiscPct,
				qoTaxPct, qoPrepaid, qoArAcct, qoArCc, qoShipDate, qoTaxable,
				qoCmtindx, qoQad04, qoUser1, qoUser2, qoSoNbr, qoConfirm,
				qoExpDate, qoRelDate, qoRelease, qoRecur, qoCycle, qoRelCnt,
				qoFlwDate, qoCurr, qoExRate, qoLang, qoQad05, qoPst, qoFstId,
				qoPstId, qoTrl1Amt, qoTrl1Cd, qoTrl2Amt, qoTrl2Cd, qoTrl3Amt,
				qoTrl3Cd, qoWeight, qoWeightUm, qoSize, qoSizeUm, qoCartons,
				qoBol, qoSite, qoTaxc, qoChr01, qoChr02, qoChr03, qoChr04,
				qoChr05, qoChr06, qoChr07, qoChr08, qoChr09, qoChr10, qoDte01,
				qoDte02, qoDec01, qoDec02, qoLog01, qoProject, qoRev, qoPstPct,
				qoFrList, qoFrTerms, qoCommPct, qoSlspsn, qoFixRate, qoEntEx,
				qoBill, qoPrintBl, qoUserid, qoTaxDate, qoChannel, qoInvMthd,
				qoBank, qoFrMinWt, qoPrList2, qoTaxEnv, qoTaxUsage, qoPricedDt,
				qoPricingDt, qoExRate2, qoExRatetype, qoDiv, qoExruSeq,
				qoArSub, qoAppOwner, qoManualFrTerms, oidQoMstr);
	}

}
