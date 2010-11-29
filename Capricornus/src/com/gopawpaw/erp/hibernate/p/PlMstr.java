package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PlMstr entity. @author MyEclipse Persistence Tools
 */
public class PlMstr extends AbstractPlMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PlMstr() {
	}

	/** minimal constructor */
	public PlMstr(PlMstrId id, String plXferAcct, String plXferSub,
			String plXferCc, String plFsdefAcct, String plFsdefSub,
			String plFsdefCc, String plFsaccrAcct, String plFsaccrSub,
			String plFsaccrCc, Double oidPlMstr) {
		super(id, plXferAcct, plXferSub, plXferCc, plFsdefAcct, plFsdefSub,
				plFsdefCc, plFsaccrAcct, plFsaccrSub, plFsaccrCc, oidPlMstr);
	}

	/** full constructor */
	public PlMstr(PlMstrId id, String plDesc, String plSlsAcct,
			String plInvAcct, String plWipAcct, String plCogAcct,
			String plPurAcct, String plScrpAcct, String plDscrAcct,
			String plSlsCc, String plInvCc, String plWipCc, String plCogCc,
			String plPurCc, String plScrpCc, String plDscrCc, String plPpvAcct,
			String plPpvCc, String plRcptAcct, String plRcptCc,
			String plDscAcct, String plDscCc, String plWvarAcct,
			String plWvarCc, String plTaxc, Boolean plTaxable, String plUser1,
			String plUser2, Boolean plPst, String plEslsAcct, String plEslsCc,
			String plChr01, String plChr02, String plChr03, String plChr04,
			String plChr05, Date plDte01, Date plDte02, Double plDec01,
			Double plDec02, Boolean plLog01, String plGroup, String plDivision,
			String plCchgAcct, String plCchgCc, String plUserid,
			Date plModDate, String plCmtlAcct, String plCmtlCc,
			String plClbrAcct, String plClbrCc, String plCbdnAcct,
			String plCbdnCc, String plCovhAcct, String plCovhCc,
			String plCsubAcct, String plCsubCc, String plApvrAcct,
			String plApvrCc, String plApvuAcct, String plApvuCc,
			String plOvhAcct, String plOvhCc, String plMvarAcct,
			String plMvarCc, String plMvrrAcct, String plMvrrCc,
			String plSvarAcct, String plSvarCc, String plSvrrAcct,
			String plSvrrCc, String plCopAcct, String plCopCc,
			String plFlrAcct, String plFlrCc, String plQadc06, String plQadc07,
			String plQadc08, String plQadc09, String plRmarAcct,
			String plRmarCc, String plQadc12, String plQadc13, String plQadc14,
			String plQadc15, String plFiscalClass, String plXvarAcct,
			String plXvarCc, String plFslbrAcct, String plFsbdnAcct,
			String plQadc10, String plFsexpAcct, String plFsexdAcct,
			String plFslbrCc, String plFsbdnCc, String plQadc11,
			String plFsexpCc, String plFsexdCc, String plFsrcInvAcct,
			String plFsrcInvCc, String plFscmInvAcct, String plFscmInvCc,
			String plQadc01, String plQadc02, String plQadc03, String plQadc04,
			String plQadc05, Boolean plQadl01, Date plQadt01, Double plQadd01,
			String plApvrSub, String plApvuSub, String plCbdnSub,
			String plCchgSub, String plClbrSub, String plCmtlSub,
			String plCogSub, String plCopSub, String plCovhSub,
			String plCsubSub, String plDscrSub, String plDscSub,
			String plFlrSub, String plFsbdnSub, String plFscmInvSub,
			String plFsexdSub, String plFsexpSub, String plFslbrSub,
			String plFsrcInvSub, String plInvSub, String plMvarSub,
			String plMvrrSub, String plOvhSub, String plPpvSub,
			String plPurSub, String plRcptSub, String plRmarSub,
			String plScrpSub, String plSlsSub, String plSvarSub,
			String plSvrrSub, String plWipSub, String plWvarSub,
			String plXvarSub, String plXferAcct, String plXferSub,
			String plXferCc, String plFsdefAcct, String plFsdefSub,
			String plFsdefCc, String plFsaccrAcct, String plFsaccrSub,
			String plFsaccrCc, Double oidPlMstr) {
		super(id, plDesc, plSlsAcct, plInvAcct, plWipAcct, plCogAcct,
				plPurAcct, plScrpAcct, plDscrAcct, plSlsCc, plInvCc, plWipCc,
				plCogCc, plPurCc, plScrpCc, plDscrCc, plPpvAcct, plPpvCc,
				plRcptAcct, plRcptCc, plDscAcct, plDscCc, plWvarAcct, plWvarCc,
				plTaxc, plTaxable, plUser1, plUser2, plPst, plEslsAcct,
				plEslsCc, plChr01, plChr02, plChr03, plChr04, plChr05, plDte01,
				plDte02, plDec01, plDec02, plLog01, plGroup, plDivision,
				plCchgAcct, plCchgCc, plUserid, plModDate, plCmtlAcct,
				plCmtlCc, plClbrAcct, plClbrCc, plCbdnAcct, plCbdnCc,
				plCovhAcct, plCovhCc, plCsubAcct, plCsubCc, plApvrAcct,
				plApvrCc, plApvuAcct, plApvuCc, plOvhAcct, plOvhCc, plMvarAcct,
				plMvarCc, plMvrrAcct, plMvrrCc, plSvarAcct, plSvarCc,
				plSvrrAcct, plSvrrCc, plCopAcct, plCopCc, plFlrAcct, plFlrCc,
				plQadc06, plQadc07, plQadc08, plQadc09, plRmarAcct, plRmarCc,
				plQadc12, plQadc13, plQadc14, plQadc15, plFiscalClass,
				plXvarAcct, plXvarCc, plFslbrAcct, plFsbdnAcct, plQadc10,
				plFsexpAcct, plFsexdAcct, plFslbrCc, plFsbdnCc, plQadc11,
				plFsexpCc, plFsexdCc, plFsrcInvAcct, plFsrcInvCc,
				plFscmInvAcct, plFscmInvCc, plQadc01, plQadc02, plQadc03,
				plQadc04, plQadc05, plQadl01, plQadt01, plQadd01, plApvrSub,
				plApvuSub, plCbdnSub, plCchgSub, plClbrSub, plCmtlSub,
				plCogSub, plCopSub, plCovhSub, plCsubSub, plDscrSub, plDscSub,
				plFlrSub, plFsbdnSub, plFscmInvSub, plFsexdSub, plFsexpSub,
				plFslbrSub, plFsrcInvSub, plInvSub, plMvarSub, plMvrrSub,
				plOvhSub, plPpvSub, plPurSub, plRcptSub, plRmarSub, plScrpSub,
				plSlsSub, plSvarSub, plSvrrSub, plWipSub, plWvarSub, plXvarSub,
				plXferAcct, plXferSub, plXferCc, plFsdefAcct, plFsdefSub,
				plFsdefCc, plFsaccrAcct, plFsaccrSub, plFsaccrCc, oidPlMstr);
	}

}
