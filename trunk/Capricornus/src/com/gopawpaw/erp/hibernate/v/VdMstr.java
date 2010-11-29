package com.gopawpaw.erp.hibernate.v;

import java.math.BigDecimal;
import java.util.Date;

/**
 * VdMstr entity. @author MyEclipse Persistence Tools
 */
public class VdMstr extends AbstractVdMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VdMstr() {
	}

	/** minimal constructor */
	public VdMstr(VdMstrId id, String vdTidNotice, String vdPromo,
			Boolean vdMiscCr, Boolean vdRcvSoPrice, Boolean vdRcvHeldSo,
			Boolean vdTpUsePct, Double vdTpPct, String vdExRatetype,
			String vdTotTermsCode, Double oidVdMstr) {
		super(id, vdTidNotice, vdPromo, vdMiscCr, vdRcvSoPrice, vdRcvHeldSo,
				vdTpUsePct, vdTpPct, vdExRatetype, vdTotTermsCode, oidVdMstr);
	}

	/** full constructor */
	public VdMstr(VdMstrId id, String vdCrTerms, String vdBuyer,
			Double vdDiscPct, String vdShipvia, Boolean vdPartial,
			String vdRmks, String vdApAcct, String vdApCc, String vdPurAcct,
			String vdPurCc, String vdPurCntct, String vdApCntct,
			Boolean vd1099, String vdSort, Date vdLastCk, Double vdBalance,
			Boolean vdHold, String vdTaxId, Boolean vdTaxable, String vdUser1,
			String vdUser2, String vdCurr, String vdLang, String vdVtId,
			String vdChr01, String vdChr02, String vdChr03, String vdChr04,
			String vdChr05, String vdChr06, String vdChr07, String vdChr08,
			String vdChr09, String vdChr10, Date vdDte01, Date vdDte02,
			Double vdDec01, Double vdDec02, Boolean vdLog01, String vdFob,
			String vdDebtor, String vdBank, String vdCkfrm, Boolean vdPaySpec,
			String vdRemit, String vdType, String vdUserid, Date vdModDate,
			Double vdPrepay, String vdConrepLogic, String vdPrList,
			Double vdDrftBal, Double vdLcBal, String vdPrList2,
			Boolean vdFixPr, String vdFrList, BigDecimal vdFrMinWt,
			String vdFrTerms, String vdTidNotice, String vdPromo,
			Boolean vdMiscCr, Boolean vdRcvSoPrice, Boolean vdRcvHeldSo,
			Boolean vdTpUsePct, Double vdTpPct, String vdExRatetype,
			String vdDb, String vdQadc01, String vdQadc02, String vdQadc03,
			String vdQadc04, Double vdQadd01, Double vdQadd02,
			Boolean vdQadl01, Boolean vdQadl02, Date vdQadt01, Date vdQadt02,
			Integer vdQadi01, Integer vdQadi02, Boolean vdQadl03,
			Boolean vdQadl04, String vdApSub, String vdPurSub,
			String vdTotTermsCode, Double oidVdMstr) {
		super(id, vdCrTerms, vdBuyer, vdDiscPct, vdShipvia, vdPartial, vdRmks,
				vdApAcct, vdApCc, vdPurAcct, vdPurCc, vdPurCntct, vdApCntct,
				vd1099, vdSort, vdLastCk, vdBalance, vdHold, vdTaxId,
				vdTaxable, vdUser1, vdUser2, vdCurr, vdLang, vdVtId, vdChr01,
				vdChr02, vdChr03, vdChr04, vdChr05, vdChr06, vdChr07, vdChr08,
				vdChr09, vdChr10, vdDte01, vdDte02, vdDec01, vdDec02, vdLog01,
				vdFob, vdDebtor, vdBank, vdCkfrm, vdPaySpec, vdRemit, vdType,
				vdUserid, vdModDate, vdPrepay, vdConrepLogic, vdPrList,
				vdDrftBal, vdLcBal, vdPrList2, vdFixPr, vdFrList, vdFrMinWt,
				vdFrTerms, vdTidNotice, vdPromo, vdMiscCr, vdRcvSoPrice,
				vdRcvHeldSo, vdTpUsePct, vdTpPct, vdExRatetype, vdDb, vdQadc01,
				vdQadc02, vdQadc03, vdQadc04, vdQadd01, vdQadd02, vdQadl01,
				vdQadl02, vdQadt01, vdQadt02, vdQadi01, vdQadi02, vdQadl03,
				vdQadl04, vdApSub, vdPurSub, vdTotTermsCode, oidVdMstr);
	}

}
