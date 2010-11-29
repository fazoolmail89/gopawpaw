package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlCtrl entity provides the base persistence definition of the GlCtrl
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlCtrl implements java.io.Serializable {

	// Fields

	private String glDomain;
	private String glArAcct;
	private String glArCc;
	private String glDiscAcct;
	private String glQadc01;
	private String glQadc03;
	private String glQadc05;
	private String glTermAcct;
	private String glFinAcct;
	private String glRtnsAcct;
	private String glCsAcct;
	private String glDiscCc;
	private String glQadc02;
	private String glQadc04;
	private String glQadc06;
	private String glTax1Cc;
	private String glTax2Cc;
	private String glTax3Cc;
	private String glTermCc;
	private String glFinCc;
	private String glRtnsCc;
	private String glCsCc;
	private String glTax1Acct;
	private String glTax2Acct;
	private String glTax3Acct;
	private String glSlsAcct;
	private String glSlsCc;
	private String glApAcct;
	private String glApCc;
	private String glPurAcct;
	private String glPurCc;
	private String glInvAcct;
	private String glInvCc;
	private String glDscrAcct;
	private String glDscrCc;
	private String glWipAcct;
	private String glWipCc;
	private String glCogAcct;
	private String glCogCc;
	private String glScrpAcct;
	private String glScrpCc;
	private String glApdsAcct;
	private String glApdsCc;
	private Boolean glVerify;
	private String glPpvAcct;
	private String glPpvCc;
	private String glRcptAcct;
	private String glRcptCc;
	private String glBdnAcct;
	private String glBdnCc;
	private String glLbrAcct;
	private String glLbrCc;
	private String glLvarAcct;
	private String glLvarCc;
	private String glOtAcct;
	private String glOtCc;
	private String glCopAcct;
	private String glCopCc;
	private String glWvarAcct;
	private String glWvarCc;
	private String glBaseCurr;
	private String glSymbol;
	private String glUserAcct;
	private String glUserCc;
	private String glEntity;
	private Integer glQad01;
	private String glUser1;
	private String glUser2;
	private Integer glIndex1;
	private Boolean glVat;
	private Integer glExRound;
	private Boolean glCan;
	private String glCchgAcct;
	private String glCchgCc;
	private String glXferAcct;
	private String glXferCc;
	private String glCmtlAcct;
	private String glCmtlCc;
	private String glClbrAcct;
	private String glClbrCc;
	private String glCbdnAcct;
	private String glCbdnCc;
	private String glCovhAcct;
	private String glCovhCc;
	private String glCsubAcct;
	private String glCsubCc;
	private String glApvrAcct;
	private String glApvrCc;
	private String glApvuAcct;
	private String glApvuCc;
	private String glBvarAcct;
	private String glBvarCc;
	private String glLvrrAcct;
	private String glLvrrCc;
	private String glBvrrAcct;
	private String glBvrrCc;
	private String glOvhAcct;
	private String glOvhCc;
	private Boolean glQadl01;
	private Integer glSubLen;
	private String glMvarAcct;
	private String glMvarCc;
	private String glMvrrAcct;
	private String glMvrrCc;
	private String glSvarAcct;
	private String glSvarCc;
	private String glSvrrAcct;
	private String glSvrrCc;
	private String glQadc07;
	private String glQadc08;
	private String glFlrAcct;
	private String glFlrCc;
	private String glEslsAcct;
	private String glEslsCc;
	private String glTaxType;
	private String glFrtappAcct;
	private String glFrtappCc;
	private String glFrtaccAcct;
	private String glFrtaccCc;
	private String glBkVal;
	private String glApvrxAcct;
	private String glApvrxCc;
	private String glApvuxAcct;
	private String glApvuxCc;
	private String glRcptxAcct;
	private String glRcptxCc;
	private String glCrtermsAcct;
	private String glCrtermsCc;
	private String glLateAcct;
	private String glLateCc;
	private String glXvarAcct;
	private String glXvarCc;
	private String glRndMthd;
	private String glLang;
	private String glFslbrAcct;
	private String glFslbrCc;
	private String glFsbdnAcct;
	private String glFsbdnCc;
	private String glFsexpAcct;
	private String glFsexpCc;
	private String glFsexdAcct;
	private String glFsexdCc;
	private String glFsrcInvAcct;
	private String glFsrcInvCc;
	private String glFscmInvAcct;
	private String glFscmInvCc;
	private String glRmarAcct;
	private String glRmarCc;
	private String glExRndAcct;
	private String glExRndCc;
	private String glExRatetype;
	private String glUgainAcct;
	private String glUgainCc;
	private String glUlossAcct;
	private String glUlossCc;
	private String glRgainAcct;
	private String glRgainCc;
	private String glRlossAcct;
	private String glRlossCc;
	private String glApdsSub;
	private String glApvrxSub;
	private String glApvrSub;
	private String glApvuxSub;
	private String glApvuSub;
	private String glApSub;
	private String glArSub;
	private String glBdnSub;
	private String glBvarSub;
	private String glBvrrSub;
	private String glCbdnSub;
	private String glCchgSub;
	private String glClbrSub;
	private String glCmtlSub;
	private String glCogSub;
	private String glCopSub;
	private String glCovhSub;
	private String glCrtermsSub;
	private String glCsubSub;
	private String glCsSub;
	private String glDiscSub;
	private String glDscrSub;
	private String glExRndSub;
	private String glFinSub;
	private String glFlrSub;
	private String glFrtaccSub;
	private String glFrtappSub;
	private String glFsbdnSub;
	private String glFscmInvSub;
	private String glFsexdSub;
	private String glFsexpSub;
	private String glFslbrSub;
	private String glFsrcInvSub;
	private String glInvSub;
	private String glLateSub;
	private String glLbrSub;
	private String glLvarSub;
	private String glLvrrSub;
	private String glMvarSub;
	private String glMvrrSub;
	private String glOtSub;
	private String glOvhSub;
	private String glPpvSub;
	private String glPurSub;
	private String glRcptxSub;
	private String glRcptSub;
	private String glRgainSub;
	private String glRlossSub;
	private String glRmarSub;
	private String glRtnsSub;
	private String glScrpSub;
	private String glSlsSub;
	private String glSvarSub;
	private String glSvrrSub;
	private String glTermSub;
	private String glTxapAcct;
	private String glTxapSub;
	private String glTxapCc;
	private String glTxaprAcct;
	private String glTxaprSub;
	private String glTxaprCc;
	private String glTxarAcct;
	private String glTxarSub;
	private String glTxarCc;
	private String glTxaraAcct;
	private String glTxaraSub;
	private String glTxaraCc;
	private String glUgainSub;
	private String glUlossSub;
	private String glUserSub;
	private String glWipSub;
	private String glWvarSub;
	private String glXferSub;
	private String glXvarSub;
	private String glFsdefAcct;
	private String glFsdefSub;
	private String glFsdefCc;
	private String glFsaccrAcct;
	private String glFsaccrSub;
	private String glFsaccrCc;
	private String glTimezone;
	private Double oidGlCtrl;

	// Constructors

	/** default constructor */
	public AbstractGlCtrl() {
	}

	/** minimal constructor */
	public AbstractGlCtrl(String glExRndAcct, String glExRndCc,
			String glExRatetype, String glUgainAcct, String glUgainCc,
			String glUlossAcct, String glUlossCc, String glRgainAcct,
			String glRgainCc, String glRlossAcct, String glRlossCc,
			String glFsdefAcct, String glFsdefSub, String glFsdefCc,
			String glFsaccrAcct, String glFsaccrSub, String glFsaccrCc,
			String glTimezone, Double oidGlCtrl) {
		this.glExRndAcct = glExRndAcct;
		this.glExRndCc = glExRndCc;
		this.glExRatetype = glExRatetype;
		this.glUgainAcct = glUgainAcct;
		this.glUgainCc = glUgainCc;
		this.glUlossAcct = glUlossAcct;
		this.glUlossCc = glUlossCc;
		this.glRgainAcct = glRgainAcct;
		this.glRgainCc = glRgainCc;
		this.glRlossAcct = glRlossAcct;
		this.glRlossCc = glRlossCc;
		this.glFsdefAcct = glFsdefAcct;
		this.glFsdefSub = glFsdefSub;
		this.glFsdefCc = glFsdefCc;
		this.glFsaccrAcct = glFsaccrAcct;
		this.glFsaccrSub = glFsaccrSub;
		this.glFsaccrCc = glFsaccrCc;
		this.glTimezone = glTimezone;
		this.oidGlCtrl = oidGlCtrl;
	}

	/** full constructor */
	public AbstractGlCtrl(String glArAcct, String glArCc, String glDiscAcct,
			String glQadc01, String glQadc03, String glQadc05,
			String glTermAcct, String glFinAcct, String glRtnsAcct,
			String glCsAcct, String glDiscCc, String glQadc02, String glQadc04,
			String glQadc06, String glTax1Cc, String glTax2Cc, String glTax3Cc,
			String glTermCc, String glFinCc, String glRtnsCc, String glCsCc,
			String glTax1Acct, String glTax2Acct, String glTax3Acct,
			String glSlsAcct, String glSlsCc, String glApAcct, String glApCc,
			String glPurAcct, String glPurCc, String glInvAcct, String glInvCc,
			String glDscrAcct, String glDscrCc, String glWipAcct,
			String glWipCc, String glCogAcct, String glCogCc,
			String glScrpAcct, String glScrpCc, String glApdsAcct,
			String glApdsCc, Boolean glVerify, String glPpvAcct,
			String glPpvCc, String glRcptAcct, String glRcptCc,
			String glBdnAcct, String glBdnCc, String glLbrAcct, String glLbrCc,
			String glLvarAcct, String glLvarCc, String glOtAcct, String glOtCc,
			String glCopAcct, String glCopCc, String glWvarAcct,
			String glWvarCc, String glBaseCurr, String glSymbol,
			String glUserAcct, String glUserCc, String glEntity,
			Integer glQad01, String glUser1, String glUser2, Integer glIndex1,
			Boolean glVat, Integer glExRound, Boolean glCan, String glCchgAcct,
			String glCchgCc, String glXferAcct, String glXferCc,
			String glCmtlAcct, String glCmtlCc, String glClbrAcct,
			String glClbrCc, String glCbdnAcct, String glCbdnCc,
			String glCovhAcct, String glCovhCc, String glCsubAcct,
			String glCsubCc, String glApvrAcct, String glApvrCc,
			String glApvuAcct, String glApvuCc, String glBvarAcct,
			String glBvarCc, String glLvrrAcct, String glLvrrCc,
			String glBvrrAcct, String glBvrrCc, String glOvhAcct,
			String glOvhCc, Boolean glQadl01, Integer glSubLen,
			String glMvarAcct, String glMvarCc, String glMvrrAcct,
			String glMvrrCc, String glSvarAcct, String glSvarCc,
			String glSvrrAcct, String glSvrrCc, String glQadc07,
			String glQadc08, String glFlrAcct, String glFlrCc,
			String glEslsAcct, String glEslsCc, String glTaxType,
			String glFrtappAcct, String glFrtappCc, String glFrtaccAcct,
			String glFrtaccCc, String glBkVal, String glApvrxAcct,
			String glApvrxCc, String glApvuxAcct, String glApvuxCc,
			String glRcptxAcct, String glRcptxCc, String glCrtermsAcct,
			String glCrtermsCc, String glLateAcct, String glLateCc,
			String glXvarAcct, String glXvarCc, String glRndMthd,
			String glLang, String glFslbrAcct, String glFslbrCc,
			String glFsbdnAcct, String glFsbdnCc, String glFsexpAcct,
			String glFsexpCc, String glFsexdAcct, String glFsexdCc,
			String glFsrcInvAcct, String glFsrcInvCc, String glFscmInvAcct,
			String glFscmInvCc, String glRmarAcct, String glRmarCc,
			String glExRndAcct, String glExRndCc, String glExRatetype,
			String glUgainAcct, String glUgainCc, String glUlossAcct,
			String glUlossCc, String glRgainAcct, String glRgainCc,
			String glRlossAcct, String glRlossCc, String glApdsSub,
			String glApvrxSub, String glApvrSub, String glApvuxSub,
			String glApvuSub, String glApSub, String glArSub, String glBdnSub,
			String glBvarSub, String glBvrrSub, String glCbdnSub,
			String glCchgSub, String glClbrSub, String glCmtlSub,
			String glCogSub, String glCopSub, String glCovhSub,
			String glCrtermsSub, String glCsubSub, String glCsSub,
			String glDiscSub, String glDscrSub, String glExRndSub,
			String glFinSub, String glFlrSub, String glFrtaccSub,
			String glFrtappSub, String glFsbdnSub, String glFscmInvSub,
			String glFsexdSub, String glFsexpSub, String glFslbrSub,
			String glFsrcInvSub, String glInvSub, String glLateSub,
			String glLbrSub, String glLvarSub, String glLvrrSub,
			String glMvarSub, String glMvrrSub, String glOtSub,
			String glOvhSub, String glPpvSub, String glPurSub,
			String glRcptxSub, String glRcptSub, String glRgainSub,
			String glRlossSub, String glRmarSub, String glRtnsSub,
			String glScrpSub, String glSlsSub, String glSvarSub,
			String glSvrrSub, String glTermSub, String glTxapAcct,
			String glTxapSub, String glTxapCc, String glTxaprAcct,
			String glTxaprSub, String glTxaprCc, String glTxarAcct,
			String glTxarSub, String glTxarCc, String glTxaraAcct,
			String glTxaraSub, String glTxaraCc, String glUgainSub,
			String glUlossSub, String glUserSub, String glWipSub,
			String glWvarSub, String glXferSub, String glXvarSub,
			String glFsdefAcct, String glFsdefSub, String glFsdefCc,
			String glFsaccrAcct, String glFsaccrSub, String glFsaccrCc,
			String glTimezone, Double oidGlCtrl) {
		this.glArAcct = glArAcct;
		this.glArCc = glArCc;
		this.glDiscAcct = glDiscAcct;
		this.glQadc01 = glQadc01;
		this.glQadc03 = glQadc03;
		this.glQadc05 = glQadc05;
		this.glTermAcct = glTermAcct;
		this.glFinAcct = glFinAcct;
		this.glRtnsAcct = glRtnsAcct;
		this.glCsAcct = glCsAcct;
		this.glDiscCc = glDiscCc;
		this.glQadc02 = glQadc02;
		this.glQadc04 = glQadc04;
		this.glQadc06 = glQadc06;
		this.glTax1Cc = glTax1Cc;
		this.glTax2Cc = glTax2Cc;
		this.glTax3Cc = glTax3Cc;
		this.glTermCc = glTermCc;
		this.glFinCc = glFinCc;
		this.glRtnsCc = glRtnsCc;
		this.glCsCc = glCsCc;
		this.glTax1Acct = glTax1Acct;
		this.glTax2Acct = glTax2Acct;
		this.glTax3Acct = glTax3Acct;
		this.glSlsAcct = glSlsAcct;
		this.glSlsCc = glSlsCc;
		this.glApAcct = glApAcct;
		this.glApCc = glApCc;
		this.glPurAcct = glPurAcct;
		this.glPurCc = glPurCc;
		this.glInvAcct = glInvAcct;
		this.glInvCc = glInvCc;
		this.glDscrAcct = glDscrAcct;
		this.glDscrCc = glDscrCc;
		this.glWipAcct = glWipAcct;
		this.glWipCc = glWipCc;
		this.glCogAcct = glCogAcct;
		this.glCogCc = glCogCc;
		this.glScrpAcct = glScrpAcct;
		this.glScrpCc = glScrpCc;
		this.glApdsAcct = glApdsAcct;
		this.glApdsCc = glApdsCc;
		this.glVerify = glVerify;
		this.glPpvAcct = glPpvAcct;
		this.glPpvCc = glPpvCc;
		this.glRcptAcct = glRcptAcct;
		this.glRcptCc = glRcptCc;
		this.glBdnAcct = glBdnAcct;
		this.glBdnCc = glBdnCc;
		this.glLbrAcct = glLbrAcct;
		this.glLbrCc = glLbrCc;
		this.glLvarAcct = glLvarAcct;
		this.glLvarCc = glLvarCc;
		this.glOtAcct = glOtAcct;
		this.glOtCc = glOtCc;
		this.glCopAcct = glCopAcct;
		this.glCopCc = glCopCc;
		this.glWvarAcct = glWvarAcct;
		this.glWvarCc = glWvarCc;
		this.glBaseCurr = glBaseCurr;
		this.glSymbol = glSymbol;
		this.glUserAcct = glUserAcct;
		this.glUserCc = glUserCc;
		this.glEntity = glEntity;
		this.glQad01 = glQad01;
		this.glUser1 = glUser1;
		this.glUser2 = glUser2;
		this.glIndex1 = glIndex1;
		this.glVat = glVat;
		this.glExRound = glExRound;
		this.glCan = glCan;
		this.glCchgAcct = glCchgAcct;
		this.glCchgCc = glCchgCc;
		this.glXferAcct = glXferAcct;
		this.glXferCc = glXferCc;
		this.glCmtlAcct = glCmtlAcct;
		this.glCmtlCc = glCmtlCc;
		this.glClbrAcct = glClbrAcct;
		this.glClbrCc = glClbrCc;
		this.glCbdnAcct = glCbdnAcct;
		this.glCbdnCc = glCbdnCc;
		this.glCovhAcct = glCovhAcct;
		this.glCovhCc = glCovhCc;
		this.glCsubAcct = glCsubAcct;
		this.glCsubCc = glCsubCc;
		this.glApvrAcct = glApvrAcct;
		this.glApvrCc = glApvrCc;
		this.glApvuAcct = glApvuAcct;
		this.glApvuCc = glApvuCc;
		this.glBvarAcct = glBvarAcct;
		this.glBvarCc = glBvarCc;
		this.glLvrrAcct = glLvrrAcct;
		this.glLvrrCc = glLvrrCc;
		this.glBvrrAcct = glBvrrAcct;
		this.glBvrrCc = glBvrrCc;
		this.glOvhAcct = glOvhAcct;
		this.glOvhCc = glOvhCc;
		this.glQadl01 = glQadl01;
		this.glSubLen = glSubLen;
		this.glMvarAcct = glMvarAcct;
		this.glMvarCc = glMvarCc;
		this.glMvrrAcct = glMvrrAcct;
		this.glMvrrCc = glMvrrCc;
		this.glSvarAcct = glSvarAcct;
		this.glSvarCc = glSvarCc;
		this.glSvrrAcct = glSvrrAcct;
		this.glSvrrCc = glSvrrCc;
		this.glQadc07 = glQadc07;
		this.glQadc08 = glQadc08;
		this.glFlrAcct = glFlrAcct;
		this.glFlrCc = glFlrCc;
		this.glEslsAcct = glEslsAcct;
		this.glEslsCc = glEslsCc;
		this.glTaxType = glTaxType;
		this.glFrtappAcct = glFrtappAcct;
		this.glFrtappCc = glFrtappCc;
		this.glFrtaccAcct = glFrtaccAcct;
		this.glFrtaccCc = glFrtaccCc;
		this.glBkVal = glBkVal;
		this.glApvrxAcct = glApvrxAcct;
		this.glApvrxCc = glApvrxCc;
		this.glApvuxAcct = glApvuxAcct;
		this.glApvuxCc = glApvuxCc;
		this.glRcptxAcct = glRcptxAcct;
		this.glRcptxCc = glRcptxCc;
		this.glCrtermsAcct = glCrtermsAcct;
		this.glCrtermsCc = glCrtermsCc;
		this.glLateAcct = glLateAcct;
		this.glLateCc = glLateCc;
		this.glXvarAcct = glXvarAcct;
		this.glXvarCc = glXvarCc;
		this.glRndMthd = glRndMthd;
		this.glLang = glLang;
		this.glFslbrAcct = glFslbrAcct;
		this.glFslbrCc = glFslbrCc;
		this.glFsbdnAcct = glFsbdnAcct;
		this.glFsbdnCc = glFsbdnCc;
		this.glFsexpAcct = glFsexpAcct;
		this.glFsexpCc = glFsexpCc;
		this.glFsexdAcct = glFsexdAcct;
		this.glFsexdCc = glFsexdCc;
		this.glFsrcInvAcct = glFsrcInvAcct;
		this.glFsrcInvCc = glFsrcInvCc;
		this.glFscmInvAcct = glFscmInvAcct;
		this.glFscmInvCc = glFscmInvCc;
		this.glRmarAcct = glRmarAcct;
		this.glRmarCc = glRmarCc;
		this.glExRndAcct = glExRndAcct;
		this.glExRndCc = glExRndCc;
		this.glExRatetype = glExRatetype;
		this.glUgainAcct = glUgainAcct;
		this.glUgainCc = glUgainCc;
		this.glUlossAcct = glUlossAcct;
		this.glUlossCc = glUlossCc;
		this.glRgainAcct = glRgainAcct;
		this.glRgainCc = glRgainCc;
		this.glRlossAcct = glRlossAcct;
		this.glRlossCc = glRlossCc;
		this.glApdsSub = glApdsSub;
		this.glApvrxSub = glApvrxSub;
		this.glApvrSub = glApvrSub;
		this.glApvuxSub = glApvuxSub;
		this.glApvuSub = glApvuSub;
		this.glApSub = glApSub;
		this.glArSub = glArSub;
		this.glBdnSub = glBdnSub;
		this.glBvarSub = glBvarSub;
		this.glBvrrSub = glBvrrSub;
		this.glCbdnSub = glCbdnSub;
		this.glCchgSub = glCchgSub;
		this.glClbrSub = glClbrSub;
		this.glCmtlSub = glCmtlSub;
		this.glCogSub = glCogSub;
		this.glCopSub = glCopSub;
		this.glCovhSub = glCovhSub;
		this.glCrtermsSub = glCrtermsSub;
		this.glCsubSub = glCsubSub;
		this.glCsSub = glCsSub;
		this.glDiscSub = glDiscSub;
		this.glDscrSub = glDscrSub;
		this.glExRndSub = glExRndSub;
		this.glFinSub = glFinSub;
		this.glFlrSub = glFlrSub;
		this.glFrtaccSub = glFrtaccSub;
		this.glFrtappSub = glFrtappSub;
		this.glFsbdnSub = glFsbdnSub;
		this.glFscmInvSub = glFscmInvSub;
		this.glFsexdSub = glFsexdSub;
		this.glFsexpSub = glFsexpSub;
		this.glFslbrSub = glFslbrSub;
		this.glFsrcInvSub = glFsrcInvSub;
		this.glInvSub = glInvSub;
		this.glLateSub = glLateSub;
		this.glLbrSub = glLbrSub;
		this.glLvarSub = glLvarSub;
		this.glLvrrSub = glLvrrSub;
		this.glMvarSub = glMvarSub;
		this.glMvrrSub = glMvrrSub;
		this.glOtSub = glOtSub;
		this.glOvhSub = glOvhSub;
		this.glPpvSub = glPpvSub;
		this.glPurSub = glPurSub;
		this.glRcptxSub = glRcptxSub;
		this.glRcptSub = glRcptSub;
		this.glRgainSub = glRgainSub;
		this.glRlossSub = glRlossSub;
		this.glRmarSub = glRmarSub;
		this.glRtnsSub = glRtnsSub;
		this.glScrpSub = glScrpSub;
		this.glSlsSub = glSlsSub;
		this.glSvarSub = glSvarSub;
		this.glSvrrSub = glSvrrSub;
		this.glTermSub = glTermSub;
		this.glTxapAcct = glTxapAcct;
		this.glTxapSub = glTxapSub;
		this.glTxapCc = glTxapCc;
		this.glTxaprAcct = glTxaprAcct;
		this.glTxaprSub = glTxaprSub;
		this.glTxaprCc = glTxaprCc;
		this.glTxarAcct = glTxarAcct;
		this.glTxarSub = glTxarSub;
		this.glTxarCc = glTxarCc;
		this.glTxaraAcct = glTxaraAcct;
		this.glTxaraSub = glTxaraSub;
		this.glTxaraCc = glTxaraCc;
		this.glUgainSub = glUgainSub;
		this.glUlossSub = glUlossSub;
		this.glUserSub = glUserSub;
		this.glWipSub = glWipSub;
		this.glWvarSub = glWvarSub;
		this.glXferSub = glXferSub;
		this.glXvarSub = glXvarSub;
		this.glFsdefAcct = glFsdefAcct;
		this.glFsdefSub = glFsdefSub;
		this.glFsdefCc = glFsdefCc;
		this.glFsaccrAcct = glFsaccrAcct;
		this.glFsaccrSub = glFsaccrSub;
		this.glFsaccrCc = glFsaccrCc;
		this.glTimezone = glTimezone;
		this.oidGlCtrl = oidGlCtrl;
	}

	// Property accessors

	public String getGlDomain() {
		return this.glDomain;
	}

	public void setGlDomain(String glDomain) {
		this.glDomain = glDomain;
	}

	public String getGlArAcct() {
		return this.glArAcct;
	}

	public void setGlArAcct(String glArAcct) {
		this.glArAcct = glArAcct;
	}

	public String getGlArCc() {
		return this.glArCc;
	}

	public void setGlArCc(String glArCc) {
		this.glArCc = glArCc;
	}

	public String getGlDiscAcct() {
		return this.glDiscAcct;
	}

	public void setGlDiscAcct(String glDiscAcct) {
		this.glDiscAcct = glDiscAcct;
	}

	public String getGlQadc01() {
		return this.glQadc01;
	}

	public void setGlQadc01(String glQadc01) {
		this.glQadc01 = glQadc01;
	}

	public String getGlQadc03() {
		return this.glQadc03;
	}

	public void setGlQadc03(String glQadc03) {
		this.glQadc03 = glQadc03;
	}

	public String getGlQadc05() {
		return this.glQadc05;
	}

	public void setGlQadc05(String glQadc05) {
		this.glQadc05 = glQadc05;
	}

	public String getGlTermAcct() {
		return this.glTermAcct;
	}

	public void setGlTermAcct(String glTermAcct) {
		this.glTermAcct = glTermAcct;
	}

	public String getGlFinAcct() {
		return this.glFinAcct;
	}

	public void setGlFinAcct(String glFinAcct) {
		this.glFinAcct = glFinAcct;
	}

	public String getGlRtnsAcct() {
		return this.glRtnsAcct;
	}

	public void setGlRtnsAcct(String glRtnsAcct) {
		this.glRtnsAcct = glRtnsAcct;
	}

	public String getGlCsAcct() {
		return this.glCsAcct;
	}

	public void setGlCsAcct(String glCsAcct) {
		this.glCsAcct = glCsAcct;
	}

	public String getGlDiscCc() {
		return this.glDiscCc;
	}

	public void setGlDiscCc(String glDiscCc) {
		this.glDiscCc = glDiscCc;
	}

	public String getGlQadc02() {
		return this.glQadc02;
	}

	public void setGlQadc02(String glQadc02) {
		this.glQadc02 = glQadc02;
	}

	public String getGlQadc04() {
		return this.glQadc04;
	}

	public void setGlQadc04(String glQadc04) {
		this.glQadc04 = glQadc04;
	}

	public String getGlQadc06() {
		return this.glQadc06;
	}

	public void setGlQadc06(String glQadc06) {
		this.glQadc06 = glQadc06;
	}

	public String getGlTax1Cc() {
		return this.glTax1Cc;
	}

	public void setGlTax1Cc(String glTax1Cc) {
		this.glTax1Cc = glTax1Cc;
	}

	public String getGlTax2Cc() {
		return this.glTax2Cc;
	}

	public void setGlTax2Cc(String glTax2Cc) {
		this.glTax2Cc = glTax2Cc;
	}

	public String getGlTax3Cc() {
		return this.glTax3Cc;
	}

	public void setGlTax3Cc(String glTax3Cc) {
		this.glTax3Cc = glTax3Cc;
	}

	public String getGlTermCc() {
		return this.glTermCc;
	}

	public void setGlTermCc(String glTermCc) {
		this.glTermCc = glTermCc;
	}

	public String getGlFinCc() {
		return this.glFinCc;
	}

	public void setGlFinCc(String glFinCc) {
		this.glFinCc = glFinCc;
	}

	public String getGlRtnsCc() {
		return this.glRtnsCc;
	}

	public void setGlRtnsCc(String glRtnsCc) {
		this.glRtnsCc = glRtnsCc;
	}

	public String getGlCsCc() {
		return this.glCsCc;
	}

	public void setGlCsCc(String glCsCc) {
		this.glCsCc = glCsCc;
	}

	public String getGlTax1Acct() {
		return this.glTax1Acct;
	}

	public void setGlTax1Acct(String glTax1Acct) {
		this.glTax1Acct = glTax1Acct;
	}

	public String getGlTax2Acct() {
		return this.glTax2Acct;
	}

	public void setGlTax2Acct(String glTax2Acct) {
		this.glTax2Acct = glTax2Acct;
	}

	public String getGlTax3Acct() {
		return this.glTax3Acct;
	}

	public void setGlTax3Acct(String glTax3Acct) {
		this.glTax3Acct = glTax3Acct;
	}

	public String getGlSlsAcct() {
		return this.glSlsAcct;
	}

	public void setGlSlsAcct(String glSlsAcct) {
		this.glSlsAcct = glSlsAcct;
	}

	public String getGlSlsCc() {
		return this.glSlsCc;
	}

	public void setGlSlsCc(String glSlsCc) {
		this.glSlsCc = glSlsCc;
	}

	public String getGlApAcct() {
		return this.glApAcct;
	}

	public void setGlApAcct(String glApAcct) {
		this.glApAcct = glApAcct;
	}

	public String getGlApCc() {
		return this.glApCc;
	}

	public void setGlApCc(String glApCc) {
		this.glApCc = glApCc;
	}

	public String getGlPurAcct() {
		return this.glPurAcct;
	}

	public void setGlPurAcct(String glPurAcct) {
		this.glPurAcct = glPurAcct;
	}

	public String getGlPurCc() {
		return this.glPurCc;
	}

	public void setGlPurCc(String glPurCc) {
		this.glPurCc = glPurCc;
	}

	public String getGlInvAcct() {
		return this.glInvAcct;
	}

	public void setGlInvAcct(String glInvAcct) {
		this.glInvAcct = glInvAcct;
	}

	public String getGlInvCc() {
		return this.glInvCc;
	}

	public void setGlInvCc(String glInvCc) {
		this.glInvCc = glInvCc;
	}

	public String getGlDscrAcct() {
		return this.glDscrAcct;
	}

	public void setGlDscrAcct(String glDscrAcct) {
		this.glDscrAcct = glDscrAcct;
	}

	public String getGlDscrCc() {
		return this.glDscrCc;
	}

	public void setGlDscrCc(String glDscrCc) {
		this.glDscrCc = glDscrCc;
	}

	public String getGlWipAcct() {
		return this.glWipAcct;
	}

	public void setGlWipAcct(String glWipAcct) {
		this.glWipAcct = glWipAcct;
	}

	public String getGlWipCc() {
		return this.glWipCc;
	}

	public void setGlWipCc(String glWipCc) {
		this.glWipCc = glWipCc;
	}

	public String getGlCogAcct() {
		return this.glCogAcct;
	}

	public void setGlCogAcct(String glCogAcct) {
		this.glCogAcct = glCogAcct;
	}

	public String getGlCogCc() {
		return this.glCogCc;
	}

	public void setGlCogCc(String glCogCc) {
		this.glCogCc = glCogCc;
	}

	public String getGlScrpAcct() {
		return this.glScrpAcct;
	}

	public void setGlScrpAcct(String glScrpAcct) {
		this.glScrpAcct = glScrpAcct;
	}

	public String getGlScrpCc() {
		return this.glScrpCc;
	}

	public void setGlScrpCc(String glScrpCc) {
		this.glScrpCc = glScrpCc;
	}

	public String getGlApdsAcct() {
		return this.glApdsAcct;
	}

	public void setGlApdsAcct(String glApdsAcct) {
		this.glApdsAcct = glApdsAcct;
	}

	public String getGlApdsCc() {
		return this.glApdsCc;
	}

	public void setGlApdsCc(String glApdsCc) {
		this.glApdsCc = glApdsCc;
	}

	public Boolean getGlVerify() {
		return this.glVerify;
	}

	public void setGlVerify(Boolean glVerify) {
		this.glVerify = glVerify;
	}

	public String getGlPpvAcct() {
		return this.glPpvAcct;
	}

	public void setGlPpvAcct(String glPpvAcct) {
		this.glPpvAcct = glPpvAcct;
	}

	public String getGlPpvCc() {
		return this.glPpvCc;
	}

	public void setGlPpvCc(String glPpvCc) {
		this.glPpvCc = glPpvCc;
	}

	public String getGlRcptAcct() {
		return this.glRcptAcct;
	}

	public void setGlRcptAcct(String glRcptAcct) {
		this.glRcptAcct = glRcptAcct;
	}

	public String getGlRcptCc() {
		return this.glRcptCc;
	}

	public void setGlRcptCc(String glRcptCc) {
		this.glRcptCc = glRcptCc;
	}

	public String getGlBdnAcct() {
		return this.glBdnAcct;
	}

	public void setGlBdnAcct(String glBdnAcct) {
		this.glBdnAcct = glBdnAcct;
	}

	public String getGlBdnCc() {
		return this.glBdnCc;
	}

	public void setGlBdnCc(String glBdnCc) {
		this.glBdnCc = glBdnCc;
	}

	public String getGlLbrAcct() {
		return this.glLbrAcct;
	}

	public void setGlLbrAcct(String glLbrAcct) {
		this.glLbrAcct = glLbrAcct;
	}

	public String getGlLbrCc() {
		return this.glLbrCc;
	}

	public void setGlLbrCc(String glLbrCc) {
		this.glLbrCc = glLbrCc;
	}

	public String getGlLvarAcct() {
		return this.glLvarAcct;
	}

	public void setGlLvarAcct(String glLvarAcct) {
		this.glLvarAcct = glLvarAcct;
	}

	public String getGlLvarCc() {
		return this.glLvarCc;
	}

	public void setGlLvarCc(String glLvarCc) {
		this.glLvarCc = glLvarCc;
	}

	public String getGlOtAcct() {
		return this.glOtAcct;
	}

	public void setGlOtAcct(String glOtAcct) {
		this.glOtAcct = glOtAcct;
	}

	public String getGlOtCc() {
		return this.glOtCc;
	}

	public void setGlOtCc(String glOtCc) {
		this.glOtCc = glOtCc;
	}

	public String getGlCopAcct() {
		return this.glCopAcct;
	}

	public void setGlCopAcct(String glCopAcct) {
		this.glCopAcct = glCopAcct;
	}

	public String getGlCopCc() {
		return this.glCopCc;
	}

	public void setGlCopCc(String glCopCc) {
		this.glCopCc = glCopCc;
	}

	public String getGlWvarAcct() {
		return this.glWvarAcct;
	}

	public void setGlWvarAcct(String glWvarAcct) {
		this.glWvarAcct = glWvarAcct;
	}

	public String getGlWvarCc() {
		return this.glWvarCc;
	}

	public void setGlWvarCc(String glWvarCc) {
		this.glWvarCc = glWvarCc;
	}

	public String getGlBaseCurr() {
		return this.glBaseCurr;
	}

	public void setGlBaseCurr(String glBaseCurr) {
		this.glBaseCurr = glBaseCurr;
	}

	public String getGlSymbol() {
		return this.glSymbol;
	}

	public void setGlSymbol(String glSymbol) {
		this.glSymbol = glSymbol;
	}

	public String getGlUserAcct() {
		return this.glUserAcct;
	}

	public void setGlUserAcct(String glUserAcct) {
		this.glUserAcct = glUserAcct;
	}

	public String getGlUserCc() {
		return this.glUserCc;
	}

	public void setGlUserCc(String glUserCc) {
		this.glUserCc = glUserCc;
	}

	public String getGlEntity() {
		return this.glEntity;
	}

	public void setGlEntity(String glEntity) {
		this.glEntity = glEntity;
	}

	public Integer getGlQad01() {
		return this.glQad01;
	}

	public void setGlQad01(Integer glQad01) {
		this.glQad01 = glQad01;
	}

	public String getGlUser1() {
		return this.glUser1;
	}

	public void setGlUser1(String glUser1) {
		this.glUser1 = glUser1;
	}

	public String getGlUser2() {
		return this.glUser2;
	}

	public void setGlUser2(String glUser2) {
		this.glUser2 = glUser2;
	}

	public Integer getGlIndex1() {
		return this.glIndex1;
	}

	public void setGlIndex1(Integer glIndex1) {
		this.glIndex1 = glIndex1;
	}

	public Boolean getGlVat() {
		return this.glVat;
	}

	public void setGlVat(Boolean glVat) {
		this.glVat = glVat;
	}

	public Integer getGlExRound() {
		return this.glExRound;
	}

	public void setGlExRound(Integer glExRound) {
		this.glExRound = glExRound;
	}

	public Boolean getGlCan() {
		return this.glCan;
	}

	public void setGlCan(Boolean glCan) {
		this.glCan = glCan;
	}

	public String getGlCchgAcct() {
		return this.glCchgAcct;
	}

	public void setGlCchgAcct(String glCchgAcct) {
		this.glCchgAcct = glCchgAcct;
	}

	public String getGlCchgCc() {
		return this.glCchgCc;
	}

	public void setGlCchgCc(String glCchgCc) {
		this.glCchgCc = glCchgCc;
	}

	public String getGlXferAcct() {
		return this.glXferAcct;
	}

	public void setGlXferAcct(String glXferAcct) {
		this.glXferAcct = glXferAcct;
	}

	public String getGlXferCc() {
		return this.glXferCc;
	}

	public void setGlXferCc(String glXferCc) {
		this.glXferCc = glXferCc;
	}

	public String getGlCmtlAcct() {
		return this.glCmtlAcct;
	}

	public void setGlCmtlAcct(String glCmtlAcct) {
		this.glCmtlAcct = glCmtlAcct;
	}

	public String getGlCmtlCc() {
		return this.glCmtlCc;
	}

	public void setGlCmtlCc(String glCmtlCc) {
		this.glCmtlCc = glCmtlCc;
	}

	public String getGlClbrAcct() {
		return this.glClbrAcct;
	}

	public void setGlClbrAcct(String glClbrAcct) {
		this.glClbrAcct = glClbrAcct;
	}

	public String getGlClbrCc() {
		return this.glClbrCc;
	}

	public void setGlClbrCc(String glClbrCc) {
		this.glClbrCc = glClbrCc;
	}

	public String getGlCbdnAcct() {
		return this.glCbdnAcct;
	}

	public void setGlCbdnAcct(String glCbdnAcct) {
		this.glCbdnAcct = glCbdnAcct;
	}

	public String getGlCbdnCc() {
		return this.glCbdnCc;
	}

	public void setGlCbdnCc(String glCbdnCc) {
		this.glCbdnCc = glCbdnCc;
	}

	public String getGlCovhAcct() {
		return this.glCovhAcct;
	}

	public void setGlCovhAcct(String glCovhAcct) {
		this.glCovhAcct = glCovhAcct;
	}

	public String getGlCovhCc() {
		return this.glCovhCc;
	}

	public void setGlCovhCc(String glCovhCc) {
		this.glCovhCc = glCovhCc;
	}

	public String getGlCsubAcct() {
		return this.glCsubAcct;
	}

	public void setGlCsubAcct(String glCsubAcct) {
		this.glCsubAcct = glCsubAcct;
	}

	public String getGlCsubCc() {
		return this.glCsubCc;
	}

	public void setGlCsubCc(String glCsubCc) {
		this.glCsubCc = glCsubCc;
	}

	public String getGlApvrAcct() {
		return this.glApvrAcct;
	}

	public void setGlApvrAcct(String glApvrAcct) {
		this.glApvrAcct = glApvrAcct;
	}

	public String getGlApvrCc() {
		return this.glApvrCc;
	}

	public void setGlApvrCc(String glApvrCc) {
		this.glApvrCc = glApvrCc;
	}

	public String getGlApvuAcct() {
		return this.glApvuAcct;
	}

	public void setGlApvuAcct(String glApvuAcct) {
		this.glApvuAcct = glApvuAcct;
	}

	public String getGlApvuCc() {
		return this.glApvuCc;
	}

	public void setGlApvuCc(String glApvuCc) {
		this.glApvuCc = glApvuCc;
	}

	public String getGlBvarAcct() {
		return this.glBvarAcct;
	}

	public void setGlBvarAcct(String glBvarAcct) {
		this.glBvarAcct = glBvarAcct;
	}

	public String getGlBvarCc() {
		return this.glBvarCc;
	}

	public void setGlBvarCc(String glBvarCc) {
		this.glBvarCc = glBvarCc;
	}

	public String getGlLvrrAcct() {
		return this.glLvrrAcct;
	}

	public void setGlLvrrAcct(String glLvrrAcct) {
		this.glLvrrAcct = glLvrrAcct;
	}

	public String getGlLvrrCc() {
		return this.glLvrrCc;
	}

	public void setGlLvrrCc(String glLvrrCc) {
		this.glLvrrCc = glLvrrCc;
	}

	public String getGlBvrrAcct() {
		return this.glBvrrAcct;
	}

	public void setGlBvrrAcct(String glBvrrAcct) {
		this.glBvrrAcct = glBvrrAcct;
	}

	public String getGlBvrrCc() {
		return this.glBvrrCc;
	}

	public void setGlBvrrCc(String glBvrrCc) {
		this.glBvrrCc = glBvrrCc;
	}

	public String getGlOvhAcct() {
		return this.glOvhAcct;
	}

	public void setGlOvhAcct(String glOvhAcct) {
		this.glOvhAcct = glOvhAcct;
	}

	public String getGlOvhCc() {
		return this.glOvhCc;
	}

	public void setGlOvhCc(String glOvhCc) {
		this.glOvhCc = glOvhCc;
	}

	public Boolean getGlQadl01() {
		return this.glQadl01;
	}

	public void setGlQadl01(Boolean glQadl01) {
		this.glQadl01 = glQadl01;
	}

	public Integer getGlSubLen() {
		return this.glSubLen;
	}

	public void setGlSubLen(Integer glSubLen) {
		this.glSubLen = glSubLen;
	}

	public String getGlMvarAcct() {
		return this.glMvarAcct;
	}

	public void setGlMvarAcct(String glMvarAcct) {
		this.glMvarAcct = glMvarAcct;
	}

	public String getGlMvarCc() {
		return this.glMvarCc;
	}

	public void setGlMvarCc(String glMvarCc) {
		this.glMvarCc = glMvarCc;
	}

	public String getGlMvrrAcct() {
		return this.glMvrrAcct;
	}

	public void setGlMvrrAcct(String glMvrrAcct) {
		this.glMvrrAcct = glMvrrAcct;
	}

	public String getGlMvrrCc() {
		return this.glMvrrCc;
	}

	public void setGlMvrrCc(String glMvrrCc) {
		this.glMvrrCc = glMvrrCc;
	}

	public String getGlSvarAcct() {
		return this.glSvarAcct;
	}

	public void setGlSvarAcct(String glSvarAcct) {
		this.glSvarAcct = glSvarAcct;
	}

	public String getGlSvarCc() {
		return this.glSvarCc;
	}

	public void setGlSvarCc(String glSvarCc) {
		this.glSvarCc = glSvarCc;
	}

	public String getGlSvrrAcct() {
		return this.glSvrrAcct;
	}

	public void setGlSvrrAcct(String glSvrrAcct) {
		this.glSvrrAcct = glSvrrAcct;
	}

	public String getGlSvrrCc() {
		return this.glSvrrCc;
	}

	public void setGlSvrrCc(String glSvrrCc) {
		this.glSvrrCc = glSvrrCc;
	}

	public String getGlQadc07() {
		return this.glQadc07;
	}

	public void setGlQadc07(String glQadc07) {
		this.glQadc07 = glQadc07;
	}

	public String getGlQadc08() {
		return this.glQadc08;
	}

	public void setGlQadc08(String glQadc08) {
		this.glQadc08 = glQadc08;
	}

	public String getGlFlrAcct() {
		return this.glFlrAcct;
	}

	public void setGlFlrAcct(String glFlrAcct) {
		this.glFlrAcct = glFlrAcct;
	}

	public String getGlFlrCc() {
		return this.glFlrCc;
	}

	public void setGlFlrCc(String glFlrCc) {
		this.glFlrCc = glFlrCc;
	}

	public String getGlEslsAcct() {
		return this.glEslsAcct;
	}

	public void setGlEslsAcct(String glEslsAcct) {
		this.glEslsAcct = glEslsAcct;
	}

	public String getGlEslsCc() {
		return this.glEslsCc;
	}

	public void setGlEslsCc(String glEslsCc) {
		this.glEslsCc = glEslsCc;
	}

	public String getGlTaxType() {
		return this.glTaxType;
	}

	public void setGlTaxType(String glTaxType) {
		this.glTaxType = glTaxType;
	}

	public String getGlFrtappAcct() {
		return this.glFrtappAcct;
	}

	public void setGlFrtappAcct(String glFrtappAcct) {
		this.glFrtappAcct = glFrtappAcct;
	}

	public String getGlFrtappCc() {
		return this.glFrtappCc;
	}

	public void setGlFrtappCc(String glFrtappCc) {
		this.glFrtappCc = glFrtappCc;
	}

	public String getGlFrtaccAcct() {
		return this.glFrtaccAcct;
	}

	public void setGlFrtaccAcct(String glFrtaccAcct) {
		this.glFrtaccAcct = glFrtaccAcct;
	}

	public String getGlFrtaccCc() {
		return this.glFrtaccCc;
	}

	public void setGlFrtaccCc(String glFrtaccCc) {
		this.glFrtaccCc = glFrtaccCc;
	}

	public String getGlBkVal() {
		return this.glBkVal;
	}

	public void setGlBkVal(String glBkVal) {
		this.glBkVal = glBkVal;
	}

	public String getGlApvrxAcct() {
		return this.glApvrxAcct;
	}

	public void setGlApvrxAcct(String glApvrxAcct) {
		this.glApvrxAcct = glApvrxAcct;
	}

	public String getGlApvrxCc() {
		return this.glApvrxCc;
	}

	public void setGlApvrxCc(String glApvrxCc) {
		this.glApvrxCc = glApvrxCc;
	}

	public String getGlApvuxAcct() {
		return this.glApvuxAcct;
	}

	public void setGlApvuxAcct(String glApvuxAcct) {
		this.glApvuxAcct = glApvuxAcct;
	}

	public String getGlApvuxCc() {
		return this.glApvuxCc;
	}

	public void setGlApvuxCc(String glApvuxCc) {
		this.glApvuxCc = glApvuxCc;
	}

	public String getGlRcptxAcct() {
		return this.glRcptxAcct;
	}

	public void setGlRcptxAcct(String glRcptxAcct) {
		this.glRcptxAcct = glRcptxAcct;
	}

	public String getGlRcptxCc() {
		return this.glRcptxCc;
	}

	public void setGlRcptxCc(String glRcptxCc) {
		this.glRcptxCc = glRcptxCc;
	}

	public String getGlCrtermsAcct() {
		return this.glCrtermsAcct;
	}

	public void setGlCrtermsAcct(String glCrtermsAcct) {
		this.glCrtermsAcct = glCrtermsAcct;
	}

	public String getGlCrtermsCc() {
		return this.glCrtermsCc;
	}

	public void setGlCrtermsCc(String glCrtermsCc) {
		this.glCrtermsCc = glCrtermsCc;
	}

	public String getGlLateAcct() {
		return this.glLateAcct;
	}

	public void setGlLateAcct(String glLateAcct) {
		this.glLateAcct = glLateAcct;
	}

	public String getGlLateCc() {
		return this.glLateCc;
	}

	public void setGlLateCc(String glLateCc) {
		this.glLateCc = glLateCc;
	}

	public String getGlXvarAcct() {
		return this.glXvarAcct;
	}

	public void setGlXvarAcct(String glXvarAcct) {
		this.glXvarAcct = glXvarAcct;
	}

	public String getGlXvarCc() {
		return this.glXvarCc;
	}

	public void setGlXvarCc(String glXvarCc) {
		this.glXvarCc = glXvarCc;
	}

	public String getGlRndMthd() {
		return this.glRndMthd;
	}

	public void setGlRndMthd(String glRndMthd) {
		this.glRndMthd = glRndMthd;
	}

	public String getGlLang() {
		return this.glLang;
	}

	public void setGlLang(String glLang) {
		this.glLang = glLang;
	}

	public String getGlFslbrAcct() {
		return this.glFslbrAcct;
	}

	public void setGlFslbrAcct(String glFslbrAcct) {
		this.glFslbrAcct = glFslbrAcct;
	}

	public String getGlFslbrCc() {
		return this.glFslbrCc;
	}

	public void setGlFslbrCc(String glFslbrCc) {
		this.glFslbrCc = glFslbrCc;
	}

	public String getGlFsbdnAcct() {
		return this.glFsbdnAcct;
	}

	public void setGlFsbdnAcct(String glFsbdnAcct) {
		this.glFsbdnAcct = glFsbdnAcct;
	}

	public String getGlFsbdnCc() {
		return this.glFsbdnCc;
	}

	public void setGlFsbdnCc(String glFsbdnCc) {
		this.glFsbdnCc = glFsbdnCc;
	}

	public String getGlFsexpAcct() {
		return this.glFsexpAcct;
	}

	public void setGlFsexpAcct(String glFsexpAcct) {
		this.glFsexpAcct = glFsexpAcct;
	}

	public String getGlFsexpCc() {
		return this.glFsexpCc;
	}

	public void setGlFsexpCc(String glFsexpCc) {
		this.glFsexpCc = glFsexpCc;
	}

	public String getGlFsexdAcct() {
		return this.glFsexdAcct;
	}

	public void setGlFsexdAcct(String glFsexdAcct) {
		this.glFsexdAcct = glFsexdAcct;
	}

	public String getGlFsexdCc() {
		return this.glFsexdCc;
	}

	public void setGlFsexdCc(String glFsexdCc) {
		this.glFsexdCc = glFsexdCc;
	}

	public String getGlFsrcInvAcct() {
		return this.glFsrcInvAcct;
	}

	public void setGlFsrcInvAcct(String glFsrcInvAcct) {
		this.glFsrcInvAcct = glFsrcInvAcct;
	}

	public String getGlFsrcInvCc() {
		return this.glFsrcInvCc;
	}

	public void setGlFsrcInvCc(String glFsrcInvCc) {
		this.glFsrcInvCc = glFsrcInvCc;
	}

	public String getGlFscmInvAcct() {
		return this.glFscmInvAcct;
	}

	public void setGlFscmInvAcct(String glFscmInvAcct) {
		this.glFscmInvAcct = glFscmInvAcct;
	}

	public String getGlFscmInvCc() {
		return this.glFscmInvCc;
	}

	public void setGlFscmInvCc(String glFscmInvCc) {
		this.glFscmInvCc = glFscmInvCc;
	}

	public String getGlRmarAcct() {
		return this.glRmarAcct;
	}

	public void setGlRmarAcct(String glRmarAcct) {
		this.glRmarAcct = glRmarAcct;
	}

	public String getGlRmarCc() {
		return this.glRmarCc;
	}

	public void setGlRmarCc(String glRmarCc) {
		this.glRmarCc = glRmarCc;
	}

	public String getGlExRndAcct() {
		return this.glExRndAcct;
	}

	public void setGlExRndAcct(String glExRndAcct) {
		this.glExRndAcct = glExRndAcct;
	}

	public String getGlExRndCc() {
		return this.glExRndCc;
	}

	public void setGlExRndCc(String glExRndCc) {
		this.glExRndCc = glExRndCc;
	}

	public String getGlExRatetype() {
		return this.glExRatetype;
	}

	public void setGlExRatetype(String glExRatetype) {
		this.glExRatetype = glExRatetype;
	}

	public String getGlUgainAcct() {
		return this.glUgainAcct;
	}

	public void setGlUgainAcct(String glUgainAcct) {
		this.glUgainAcct = glUgainAcct;
	}

	public String getGlUgainCc() {
		return this.glUgainCc;
	}

	public void setGlUgainCc(String glUgainCc) {
		this.glUgainCc = glUgainCc;
	}

	public String getGlUlossAcct() {
		return this.glUlossAcct;
	}

	public void setGlUlossAcct(String glUlossAcct) {
		this.glUlossAcct = glUlossAcct;
	}

	public String getGlUlossCc() {
		return this.glUlossCc;
	}

	public void setGlUlossCc(String glUlossCc) {
		this.glUlossCc = glUlossCc;
	}

	public String getGlRgainAcct() {
		return this.glRgainAcct;
	}

	public void setGlRgainAcct(String glRgainAcct) {
		this.glRgainAcct = glRgainAcct;
	}

	public String getGlRgainCc() {
		return this.glRgainCc;
	}

	public void setGlRgainCc(String glRgainCc) {
		this.glRgainCc = glRgainCc;
	}

	public String getGlRlossAcct() {
		return this.glRlossAcct;
	}

	public void setGlRlossAcct(String glRlossAcct) {
		this.glRlossAcct = glRlossAcct;
	}

	public String getGlRlossCc() {
		return this.glRlossCc;
	}

	public void setGlRlossCc(String glRlossCc) {
		this.glRlossCc = glRlossCc;
	}

	public String getGlApdsSub() {
		return this.glApdsSub;
	}

	public void setGlApdsSub(String glApdsSub) {
		this.glApdsSub = glApdsSub;
	}

	public String getGlApvrxSub() {
		return this.glApvrxSub;
	}

	public void setGlApvrxSub(String glApvrxSub) {
		this.glApvrxSub = glApvrxSub;
	}

	public String getGlApvrSub() {
		return this.glApvrSub;
	}

	public void setGlApvrSub(String glApvrSub) {
		this.glApvrSub = glApvrSub;
	}

	public String getGlApvuxSub() {
		return this.glApvuxSub;
	}

	public void setGlApvuxSub(String glApvuxSub) {
		this.glApvuxSub = glApvuxSub;
	}

	public String getGlApvuSub() {
		return this.glApvuSub;
	}

	public void setGlApvuSub(String glApvuSub) {
		this.glApvuSub = glApvuSub;
	}

	public String getGlApSub() {
		return this.glApSub;
	}

	public void setGlApSub(String glApSub) {
		this.glApSub = glApSub;
	}

	public String getGlArSub() {
		return this.glArSub;
	}

	public void setGlArSub(String glArSub) {
		this.glArSub = glArSub;
	}

	public String getGlBdnSub() {
		return this.glBdnSub;
	}

	public void setGlBdnSub(String glBdnSub) {
		this.glBdnSub = glBdnSub;
	}

	public String getGlBvarSub() {
		return this.glBvarSub;
	}

	public void setGlBvarSub(String glBvarSub) {
		this.glBvarSub = glBvarSub;
	}

	public String getGlBvrrSub() {
		return this.glBvrrSub;
	}

	public void setGlBvrrSub(String glBvrrSub) {
		this.glBvrrSub = glBvrrSub;
	}

	public String getGlCbdnSub() {
		return this.glCbdnSub;
	}

	public void setGlCbdnSub(String glCbdnSub) {
		this.glCbdnSub = glCbdnSub;
	}

	public String getGlCchgSub() {
		return this.glCchgSub;
	}

	public void setGlCchgSub(String glCchgSub) {
		this.glCchgSub = glCchgSub;
	}

	public String getGlClbrSub() {
		return this.glClbrSub;
	}

	public void setGlClbrSub(String glClbrSub) {
		this.glClbrSub = glClbrSub;
	}

	public String getGlCmtlSub() {
		return this.glCmtlSub;
	}

	public void setGlCmtlSub(String glCmtlSub) {
		this.glCmtlSub = glCmtlSub;
	}

	public String getGlCogSub() {
		return this.glCogSub;
	}

	public void setGlCogSub(String glCogSub) {
		this.glCogSub = glCogSub;
	}

	public String getGlCopSub() {
		return this.glCopSub;
	}

	public void setGlCopSub(String glCopSub) {
		this.glCopSub = glCopSub;
	}

	public String getGlCovhSub() {
		return this.glCovhSub;
	}

	public void setGlCovhSub(String glCovhSub) {
		this.glCovhSub = glCovhSub;
	}

	public String getGlCrtermsSub() {
		return this.glCrtermsSub;
	}

	public void setGlCrtermsSub(String glCrtermsSub) {
		this.glCrtermsSub = glCrtermsSub;
	}

	public String getGlCsubSub() {
		return this.glCsubSub;
	}

	public void setGlCsubSub(String glCsubSub) {
		this.glCsubSub = glCsubSub;
	}

	public String getGlCsSub() {
		return this.glCsSub;
	}

	public void setGlCsSub(String glCsSub) {
		this.glCsSub = glCsSub;
	}

	public String getGlDiscSub() {
		return this.glDiscSub;
	}

	public void setGlDiscSub(String glDiscSub) {
		this.glDiscSub = glDiscSub;
	}

	public String getGlDscrSub() {
		return this.glDscrSub;
	}

	public void setGlDscrSub(String glDscrSub) {
		this.glDscrSub = glDscrSub;
	}

	public String getGlExRndSub() {
		return this.glExRndSub;
	}

	public void setGlExRndSub(String glExRndSub) {
		this.glExRndSub = glExRndSub;
	}

	public String getGlFinSub() {
		return this.glFinSub;
	}

	public void setGlFinSub(String glFinSub) {
		this.glFinSub = glFinSub;
	}

	public String getGlFlrSub() {
		return this.glFlrSub;
	}

	public void setGlFlrSub(String glFlrSub) {
		this.glFlrSub = glFlrSub;
	}

	public String getGlFrtaccSub() {
		return this.glFrtaccSub;
	}

	public void setGlFrtaccSub(String glFrtaccSub) {
		this.glFrtaccSub = glFrtaccSub;
	}

	public String getGlFrtappSub() {
		return this.glFrtappSub;
	}

	public void setGlFrtappSub(String glFrtappSub) {
		this.glFrtappSub = glFrtappSub;
	}

	public String getGlFsbdnSub() {
		return this.glFsbdnSub;
	}

	public void setGlFsbdnSub(String glFsbdnSub) {
		this.glFsbdnSub = glFsbdnSub;
	}

	public String getGlFscmInvSub() {
		return this.glFscmInvSub;
	}

	public void setGlFscmInvSub(String glFscmInvSub) {
		this.glFscmInvSub = glFscmInvSub;
	}

	public String getGlFsexdSub() {
		return this.glFsexdSub;
	}

	public void setGlFsexdSub(String glFsexdSub) {
		this.glFsexdSub = glFsexdSub;
	}

	public String getGlFsexpSub() {
		return this.glFsexpSub;
	}

	public void setGlFsexpSub(String glFsexpSub) {
		this.glFsexpSub = glFsexpSub;
	}

	public String getGlFslbrSub() {
		return this.glFslbrSub;
	}

	public void setGlFslbrSub(String glFslbrSub) {
		this.glFslbrSub = glFslbrSub;
	}

	public String getGlFsrcInvSub() {
		return this.glFsrcInvSub;
	}

	public void setGlFsrcInvSub(String glFsrcInvSub) {
		this.glFsrcInvSub = glFsrcInvSub;
	}

	public String getGlInvSub() {
		return this.glInvSub;
	}

	public void setGlInvSub(String glInvSub) {
		this.glInvSub = glInvSub;
	}

	public String getGlLateSub() {
		return this.glLateSub;
	}

	public void setGlLateSub(String glLateSub) {
		this.glLateSub = glLateSub;
	}

	public String getGlLbrSub() {
		return this.glLbrSub;
	}

	public void setGlLbrSub(String glLbrSub) {
		this.glLbrSub = glLbrSub;
	}

	public String getGlLvarSub() {
		return this.glLvarSub;
	}

	public void setGlLvarSub(String glLvarSub) {
		this.glLvarSub = glLvarSub;
	}

	public String getGlLvrrSub() {
		return this.glLvrrSub;
	}

	public void setGlLvrrSub(String glLvrrSub) {
		this.glLvrrSub = glLvrrSub;
	}

	public String getGlMvarSub() {
		return this.glMvarSub;
	}

	public void setGlMvarSub(String glMvarSub) {
		this.glMvarSub = glMvarSub;
	}

	public String getGlMvrrSub() {
		return this.glMvrrSub;
	}

	public void setGlMvrrSub(String glMvrrSub) {
		this.glMvrrSub = glMvrrSub;
	}

	public String getGlOtSub() {
		return this.glOtSub;
	}

	public void setGlOtSub(String glOtSub) {
		this.glOtSub = glOtSub;
	}

	public String getGlOvhSub() {
		return this.glOvhSub;
	}

	public void setGlOvhSub(String glOvhSub) {
		this.glOvhSub = glOvhSub;
	}

	public String getGlPpvSub() {
		return this.glPpvSub;
	}

	public void setGlPpvSub(String glPpvSub) {
		this.glPpvSub = glPpvSub;
	}

	public String getGlPurSub() {
		return this.glPurSub;
	}

	public void setGlPurSub(String glPurSub) {
		this.glPurSub = glPurSub;
	}

	public String getGlRcptxSub() {
		return this.glRcptxSub;
	}

	public void setGlRcptxSub(String glRcptxSub) {
		this.glRcptxSub = glRcptxSub;
	}

	public String getGlRcptSub() {
		return this.glRcptSub;
	}

	public void setGlRcptSub(String glRcptSub) {
		this.glRcptSub = glRcptSub;
	}

	public String getGlRgainSub() {
		return this.glRgainSub;
	}

	public void setGlRgainSub(String glRgainSub) {
		this.glRgainSub = glRgainSub;
	}

	public String getGlRlossSub() {
		return this.glRlossSub;
	}

	public void setGlRlossSub(String glRlossSub) {
		this.glRlossSub = glRlossSub;
	}

	public String getGlRmarSub() {
		return this.glRmarSub;
	}

	public void setGlRmarSub(String glRmarSub) {
		this.glRmarSub = glRmarSub;
	}

	public String getGlRtnsSub() {
		return this.glRtnsSub;
	}

	public void setGlRtnsSub(String glRtnsSub) {
		this.glRtnsSub = glRtnsSub;
	}

	public String getGlScrpSub() {
		return this.glScrpSub;
	}

	public void setGlScrpSub(String glScrpSub) {
		this.glScrpSub = glScrpSub;
	}

	public String getGlSlsSub() {
		return this.glSlsSub;
	}

	public void setGlSlsSub(String glSlsSub) {
		this.glSlsSub = glSlsSub;
	}

	public String getGlSvarSub() {
		return this.glSvarSub;
	}

	public void setGlSvarSub(String glSvarSub) {
		this.glSvarSub = glSvarSub;
	}

	public String getGlSvrrSub() {
		return this.glSvrrSub;
	}

	public void setGlSvrrSub(String glSvrrSub) {
		this.glSvrrSub = glSvrrSub;
	}

	public String getGlTermSub() {
		return this.glTermSub;
	}

	public void setGlTermSub(String glTermSub) {
		this.glTermSub = glTermSub;
	}

	public String getGlTxapAcct() {
		return this.glTxapAcct;
	}

	public void setGlTxapAcct(String glTxapAcct) {
		this.glTxapAcct = glTxapAcct;
	}

	public String getGlTxapSub() {
		return this.glTxapSub;
	}

	public void setGlTxapSub(String glTxapSub) {
		this.glTxapSub = glTxapSub;
	}

	public String getGlTxapCc() {
		return this.glTxapCc;
	}

	public void setGlTxapCc(String glTxapCc) {
		this.glTxapCc = glTxapCc;
	}

	public String getGlTxaprAcct() {
		return this.glTxaprAcct;
	}

	public void setGlTxaprAcct(String glTxaprAcct) {
		this.glTxaprAcct = glTxaprAcct;
	}

	public String getGlTxaprSub() {
		return this.glTxaprSub;
	}

	public void setGlTxaprSub(String glTxaprSub) {
		this.glTxaprSub = glTxaprSub;
	}

	public String getGlTxaprCc() {
		return this.glTxaprCc;
	}

	public void setGlTxaprCc(String glTxaprCc) {
		this.glTxaprCc = glTxaprCc;
	}

	public String getGlTxarAcct() {
		return this.glTxarAcct;
	}

	public void setGlTxarAcct(String glTxarAcct) {
		this.glTxarAcct = glTxarAcct;
	}

	public String getGlTxarSub() {
		return this.glTxarSub;
	}

	public void setGlTxarSub(String glTxarSub) {
		this.glTxarSub = glTxarSub;
	}

	public String getGlTxarCc() {
		return this.glTxarCc;
	}

	public void setGlTxarCc(String glTxarCc) {
		this.glTxarCc = glTxarCc;
	}

	public String getGlTxaraAcct() {
		return this.glTxaraAcct;
	}

	public void setGlTxaraAcct(String glTxaraAcct) {
		this.glTxaraAcct = glTxaraAcct;
	}

	public String getGlTxaraSub() {
		return this.glTxaraSub;
	}

	public void setGlTxaraSub(String glTxaraSub) {
		this.glTxaraSub = glTxaraSub;
	}

	public String getGlTxaraCc() {
		return this.glTxaraCc;
	}

	public void setGlTxaraCc(String glTxaraCc) {
		this.glTxaraCc = glTxaraCc;
	}

	public String getGlUgainSub() {
		return this.glUgainSub;
	}

	public void setGlUgainSub(String glUgainSub) {
		this.glUgainSub = glUgainSub;
	}

	public String getGlUlossSub() {
		return this.glUlossSub;
	}

	public void setGlUlossSub(String glUlossSub) {
		this.glUlossSub = glUlossSub;
	}

	public String getGlUserSub() {
		return this.glUserSub;
	}

	public void setGlUserSub(String glUserSub) {
		this.glUserSub = glUserSub;
	}

	public String getGlWipSub() {
		return this.glWipSub;
	}

	public void setGlWipSub(String glWipSub) {
		this.glWipSub = glWipSub;
	}

	public String getGlWvarSub() {
		return this.glWvarSub;
	}

	public void setGlWvarSub(String glWvarSub) {
		this.glWvarSub = glWvarSub;
	}

	public String getGlXferSub() {
		return this.glXferSub;
	}

	public void setGlXferSub(String glXferSub) {
		this.glXferSub = glXferSub;
	}

	public String getGlXvarSub() {
		return this.glXvarSub;
	}

	public void setGlXvarSub(String glXvarSub) {
		this.glXvarSub = glXvarSub;
	}

	public String getGlFsdefAcct() {
		return this.glFsdefAcct;
	}

	public void setGlFsdefAcct(String glFsdefAcct) {
		this.glFsdefAcct = glFsdefAcct;
	}

	public String getGlFsdefSub() {
		return this.glFsdefSub;
	}

	public void setGlFsdefSub(String glFsdefSub) {
		this.glFsdefSub = glFsdefSub;
	}

	public String getGlFsdefCc() {
		return this.glFsdefCc;
	}

	public void setGlFsdefCc(String glFsdefCc) {
		this.glFsdefCc = glFsdefCc;
	}

	public String getGlFsaccrAcct() {
		return this.glFsaccrAcct;
	}

	public void setGlFsaccrAcct(String glFsaccrAcct) {
		this.glFsaccrAcct = glFsaccrAcct;
	}

	public String getGlFsaccrSub() {
		return this.glFsaccrSub;
	}

	public void setGlFsaccrSub(String glFsaccrSub) {
		this.glFsaccrSub = glFsaccrSub;
	}

	public String getGlFsaccrCc() {
		return this.glFsaccrCc;
	}

	public void setGlFsaccrCc(String glFsaccrCc) {
		this.glFsaccrCc = glFsaccrCc;
	}

	public String getGlTimezone() {
		return this.glTimezone;
	}

	public void setGlTimezone(String glTimezone) {
		this.glTimezone = glTimezone;
	}

	public Double getOidGlCtrl() {
		return this.oidGlCtrl;
	}

	public void setOidGlCtrl(Double oidGlCtrl) {
		this.oidGlCtrl = oidGlCtrl;
	}

}