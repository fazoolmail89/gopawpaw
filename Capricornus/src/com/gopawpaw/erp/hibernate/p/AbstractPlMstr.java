package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPlMstr entity provides the base persistence definition of the PlMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlMstr implements java.io.Serializable {

	// Fields

	private PlMstrId id;
	private String plDesc;
	private String plSlsAcct;
	private String plInvAcct;
	private String plWipAcct;
	private String plCogAcct;
	private String plPurAcct;
	private String plScrpAcct;
	private String plDscrAcct;
	private String plSlsCc;
	private String plInvCc;
	private String plWipCc;
	private String plCogCc;
	private String plPurCc;
	private String plScrpCc;
	private String plDscrCc;
	private String plPpvAcct;
	private String plPpvCc;
	private String plRcptAcct;
	private String plRcptCc;
	private String plDscAcct;
	private String plDscCc;
	private String plWvarAcct;
	private String plWvarCc;
	private String plTaxc;
	private Boolean plTaxable;
	private String plUser1;
	private String plUser2;
	private Boolean plPst;
	private String plEslsAcct;
	private String plEslsCc;
	private String plChr01;
	private String plChr02;
	private String plChr03;
	private String plChr04;
	private String plChr05;
	private Date plDte01;
	private Date plDte02;
	private Double plDec01;
	private Double plDec02;
	private Boolean plLog01;
	private String plGroup;
	private String plDivision;
	private String plCchgAcct;
	private String plCchgCc;
	private String plUserid;
	private Date plModDate;
	private String plCmtlAcct;
	private String plCmtlCc;
	private String plClbrAcct;
	private String plClbrCc;
	private String plCbdnAcct;
	private String plCbdnCc;
	private String plCovhAcct;
	private String plCovhCc;
	private String plCsubAcct;
	private String plCsubCc;
	private String plApvrAcct;
	private String plApvrCc;
	private String plApvuAcct;
	private String plApvuCc;
	private String plOvhAcct;
	private String plOvhCc;
	private String plMvarAcct;
	private String plMvarCc;
	private String plMvrrAcct;
	private String plMvrrCc;
	private String plSvarAcct;
	private String plSvarCc;
	private String plSvrrAcct;
	private String plSvrrCc;
	private String plCopAcct;
	private String plCopCc;
	private String plFlrAcct;
	private String plFlrCc;
	private String plQadc06;
	private String plQadc07;
	private String plQadc08;
	private String plQadc09;
	private String plRmarAcct;
	private String plRmarCc;
	private String plQadc12;
	private String plQadc13;
	private String plQadc14;
	private String plQadc15;
	private String plFiscalClass;
	private String plXvarAcct;
	private String plXvarCc;
	private String plFslbrAcct;
	private String plFsbdnAcct;
	private String plQadc10;
	private String plFsexpAcct;
	private String plFsexdAcct;
	private String plFslbrCc;
	private String plFsbdnCc;
	private String plQadc11;
	private String plFsexpCc;
	private String plFsexdCc;
	private String plFsrcInvAcct;
	private String plFsrcInvCc;
	private String plFscmInvAcct;
	private String plFscmInvCc;
	private String plQadc01;
	private String plQadc02;
	private String plQadc03;
	private String plQadc04;
	private String plQadc05;
	private Boolean plQadl01;
	private Date plQadt01;
	private Double plQadd01;
	private String plApvrSub;
	private String plApvuSub;
	private String plCbdnSub;
	private String plCchgSub;
	private String plClbrSub;
	private String plCmtlSub;
	private String plCogSub;
	private String plCopSub;
	private String plCovhSub;
	private String plCsubSub;
	private String plDscrSub;
	private String plDscSub;
	private String plFlrSub;
	private String plFsbdnSub;
	private String plFscmInvSub;
	private String plFsexdSub;
	private String plFsexpSub;
	private String plFslbrSub;
	private String plFsrcInvSub;
	private String plInvSub;
	private String plMvarSub;
	private String plMvrrSub;
	private String plOvhSub;
	private String plPpvSub;
	private String plPurSub;
	private String plRcptSub;
	private String plRmarSub;
	private String plScrpSub;
	private String plSlsSub;
	private String plSvarSub;
	private String plSvrrSub;
	private String plWipSub;
	private String plWvarSub;
	private String plXvarSub;
	private String plXferAcct;
	private String plXferSub;
	private String plXferCc;
	private String plFsdefAcct;
	private String plFsdefSub;
	private String plFsdefCc;
	private String plFsaccrAcct;
	private String plFsaccrSub;
	private String plFsaccrCc;
	private Double oidPlMstr;

	// Constructors

	/** default constructor */
	public AbstractPlMstr() {
	}

	/** minimal constructor */
	public AbstractPlMstr(PlMstrId id, String plXferAcct, String plXferSub,
			String plXferCc, String plFsdefAcct, String plFsdefSub,
			String plFsdefCc, String plFsaccrAcct, String plFsaccrSub,
			String plFsaccrCc, Double oidPlMstr) {
		this.id = id;
		this.plXferAcct = plXferAcct;
		this.plXferSub = plXferSub;
		this.plXferCc = plXferCc;
		this.plFsdefAcct = plFsdefAcct;
		this.plFsdefSub = plFsdefSub;
		this.plFsdefCc = plFsdefCc;
		this.plFsaccrAcct = plFsaccrAcct;
		this.plFsaccrSub = plFsaccrSub;
		this.plFsaccrCc = plFsaccrCc;
		this.oidPlMstr = oidPlMstr;
	}

	/** full constructor */
	public AbstractPlMstr(PlMstrId id, String plDesc, String plSlsAcct,
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
		this.id = id;
		this.plDesc = plDesc;
		this.plSlsAcct = plSlsAcct;
		this.plInvAcct = plInvAcct;
		this.plWipAcct = plWipAcct;
		this.plCogAcct = plCogAcct;
		this.plPurAcct = plPurAcct;
		this.plScrpAcct = plScrpAcct;
		this.plDscrAcct = plDscrAcct;
		this.plSlsCc = plSlsCc;
		this.plInvCc = plInvCc;
		this.plWipCc = plWipCc;
		this.plCogCc = plCogCc;
		this.plPurCc = plPurCc;
		this.plScrpCc = plScrpCc;
		this.plDscrCc = plDscrCc;
		this.plPpvAcct = plPpvAcct;
		this.plPpvCc = plPpvCc;
		this.plRcptAcct = plRcptAcct;
		this.plRcptCc = plRcptCc;
		this.plDscAcct = plDscAcct;
		this.plDscCc = plDscCc;
		this.plWvarAcct = plWvarAcct;
		this.plWvarCc = plWvarCc;
		this.plTaxc = plTaxc;
		this.plTaxable = plTaxable;
		this.plUser1 = plUser1;
		this.plUser2 = plUser2;
		this.plPst = plPst;
		this.plEslsAcct = plEslsAcct;
		this.plEslsCc = plEslsCc;
		this.plChr01 = plChr01;
		this.plChr02 = plChr02;
		this.plChr03 = plChr03;
		this.plChr04 = plChr04;
		this.plChr05 = plChr05;
		this.plDte01 = plDte01;
		this.plDte02 = plDte02;
		this.plDec01 = plDec01;
		this.plDec02 = plDec02;
		this.plLog01 = plLog01;
		this.plGroup = plGroup;
		this.plDivision = plDivision;
		this.plCchgAcct = plCchgAcct;
		this.plCchgCc = plCchgCc;
		this.plUserid = plUserid;
		this.plModDate = plModDate;
		this.plCmtlAcct = plCmtlAcct;
		this.plCmtlCc = plCmtlCc;
		this.plClbrAcct = plClbrAcct;
		this.plClbrCc = plClbrCc;
		this.plCbdnAcct = plCbdnAcct;
		this.plCbdnCc = plCbdnCc;
		this.plCovhAcct = plCovhAcct;
		this.plCovhCc = plCovhCc;
		this.plCsubAcct = plCsubAcct;
		this.plCsubCc = plCsubCc;
		this.plApvrAcct = plApvrAcct;
		this.plApvrCc = plApvrCc;
		this.plApvuAcct = plApvuAcct;
		this.plApvuCc = plApvuCc;
		this.plOvhAcct = plOvhAcct;
		this.plOvhCc = plOvhCc;
		this.plMvarAcct = plMvarAcct;
		this.plMvarCc = plMvarCc;
		this.plMvrrAcct = plMvrrAcct;
		this.plMvrrCc = plMvrrCc;
		this.plSvarAcct = plSvarAcct;
		this.plSvarCc = plSvarCc;
		this.plSvrrAcct = plSvrrAcct;
		this.plSvrrCc = plSvrrCc;
		this.plCopAcct = plCopAcct;
		this.plCopCc = plCopCc;
		this.plFlrAcct = plFlrAcct;
		this.plFlrCc = plFlrCc;
		this.plQadc06 = plQadc06;
		this.plQadc07 = plQadc07;
		this.plQadc08 = plQadc08;
		this.plQadc09 = plQadc09;
		this.plRmarAcct = plRmarAcct;
		this.plRmarCc = plRmarCc;
		this.plQadc12 = plQadc12;
		this.plQadc13 = plQadc13;
		this.plQadc14 = plQadc14;
		this.plQadc15 = plQadc15;
		this.plFiscalClass = plFiscalClass;
		this.plXvarAcct = plXvarAcct;
		this.plXvarCc = plXvarCc;
		this.plFslbrAcct = plFslbrAcct;
		this.plFsbdnAcct = plFsbdnAcct;
		this.plQadc10 = plQadc10;
		this.plFsexpAcct = plFsexpAcct;
		this.plFsexdAcct = plFsexdAcct;
		this.plFslbrCc = plFslbrCc;
		this.plFsbdnCc = plFsbdnCc;
		this.plQadc11 = plQadc11;
		this.plFsexpCc = plFsexpCc;
		this.plFsexdCc = plFsexdCc;
		this.plFsrcInvAcct = plFsrcInvAcct;
		this.plFsrcInvCc = plFsrcInvCc;
		this.plFscmInvAcct = plFscmInvAcct;
		this.plFscmInvCc = plFscmInvCc;
		this.plQadc01 = plQadc01;
		this.plQadc02 = plQadc02;
		this.plQadc03 = plQadc03;
		this.plQadc04 = plQadc04;
		this.plQadc05 = plQadc05;
		this.plQadl01 = plQadl01;
		this.plQadt01 = plQadt01;
		this.plQadd01 = plQadd01;
		this.plApvrSub = plApvrSub;
		this.plApvuSub = plApvuSub;
		this.plCbdnSub = plCbdnSub;
		this.plCchgSub = plCchgSub;
		this.plClbrSub = plClbrSub;
		this.plCmtlSub = plCmtlSub;
		this.plCogSub = plCogSub;
		this.plCopSub = plCopSub;
		this.plCovhSub = plCovhSub;
		this.plCsubSub = plCsubSub;
		this.plDscrSub = plDscrSub;
		this.plDscSub = plDscSub;
		this.plFlrSub = plFlrSub;
		this.plFsbdnSub = plFsbdnSub;
		this.plFscmInvSub = plFscmInvSub;
		this.plFsexdSub = plFsexdSub;
		this.plFsexpSub = plFsexpSub;
		this.plFslbrSub = plFslbrSub;
		this.plFsrcInvSub = plFsrcInvSub;
		this.plInvSub = plInvSub;
		this.plMvarSub = plMvarSub;
		this.plMvrrSub = plMvrrSub;
		this.plOvhSub = plOvhSub;
		this.plPpvSub = plPpvSub;
		this.plPurSub = plPurSub;
		this.plRcptSub = plRcptSub;
		this.plRmarSub = plRmarSub;
		this.plScrpSub = plScrpSub;
		this.plSlsSub = plSlsSub;
		this.plSvarSub = plSvarSub;
		this.plSvrrSub = plSvrrSub;
		this.plWipSub = plWipSub;
		this.plWvarSub = plWvarSub;
		this.plXvarSub = plXvarSub;
		this.plXferAcct = plXferAcct;
		this.plXferSub = plXferSub;
		this.plXferCc = plXferCc;
		this.plFsdefAcct = plFsdefAcct;
		this.plFsdefSub = plFsdefSub;
		this.plFsdefCc = plFsdefCc;
		this.plFsaccrAcct = plFsaccrAcct;
		this.plFsaccrSub = plFsaccrSub;
		this.plFsaccrCc = plFsaccrCc;
		this.oidPlMstr = oidPlMstr;
	}

	// Property accessors

	public PlMstrId getId() {
		return this.id;
	}

	public void setId(PlMstrId id) {
		this.id = id;
	}

	public String getPlDesc() {
		return this.plDesc;
	}

	public void setPlDesc(String plDesc) {
		this.plDesc = plDesc;
	}

	public String getPlSlsAcct() {
		return this.plSlsAcct;
	}

	public void setPlSlsAcct(String plSlsAcct) {
		this.plSlsAcct = plSlsAcct;
	}

	public String getPlInvAcct() {
		return this.plInvAcct;
	}

	public void setPlInvAcct(String plInvAcct) {
		this.plInvAcct = plInvAcct;
	}

	public String getPlWipAcct() {
		return this.plWipAcct;
	}

	public void setPlWipAcct(String plWipAcct) {
		this.plWipAcct = plWipAcct;
	}

	public String getPlCogAcct() {
		return this.plCogAcct;
	}

	public void setPlCogAcct(String plCogAcct) {
		this.plCogAcct = plCogAcct;
	}

	public String getPlPurAcct() {
		return this.plPurAcct;
	}

	public void setPlPurAcct(String plPurAcct) {
		this.plPurAcct = plPurAcct;
	}

	public String getPlScrpAcct() {
		return this.plScrpAcct;
	}

	public void setPlScrpAcct(String plScrpAcct) {
		this.plScrpAcct = plScrpAcct;
	}

	public String getPlDscrAcct() {
		return this.plDscrAcct;
	}

	public void setPlDscrAcct(String plDscrAcct) {
		this.plDscrAcct = plDscrAcct;
	}

	public String getPlSlsCc() {
		return this.plSlsCc;
	}

	public void setPlSlsCc(String plSlsCc) {
		this.plSlsCc = plSlsCc;
	}

	public String getPlInvCc() {
		return this.plInvCc;
	}

	public void setPlInvCc(String plInvCc) {
		this.plInvCc = plInvCc;
	}

	public String getPlWipCc() {
		return this.plWipCc;
	}

	public void setPlWipCc(String plWipCc) {
		this.plWipCc = plWipCc;
	}

	public String getPlCogCc() {
		return this.plCogCc;
	}

	public void setPlCogCc(String plCogCc) {
		this.plCogCc = plCogCc;
	}

	public String getPlPurCc() {
		return this.plPurCc;
	}

	public void setPlPurCc(String plPurCc) {
		this.plPurCc = plPurCc;
	}

	public String getPlScrpCc() {
		return this.plScrpCc;
	}

	public void setPlScrpCc(String plScrpCc) {
		this.plScrpCc = plScrpCc;
	}

	public String getPlDscrCc() {
		return this.plDscrCc;
	}

	public void setPlDscrCc(String plDscrCc) {
		this.plDscrCc = plDscrCc;
	}

	public String getPlPpvAcct() {
		return this.plPpvAcct;
	}

	public void setPlPpvAcct(String plPpvAcct) {
		this.plPpvAcct = plPpvAcct;
	}

	public String getPlPpvCc() {
		return this.plPpvCc;
	}

	public void setPlPpvCc(String plPpvCc) {
		this.plPpvCc = plPpvCc;
	}

	public String getPlRcptAcct() {
		return this.plRcptAcct;
	}

	public void setPlRcptAcct(String plRcptAcct) {
		this.plRcptAcct = plRcptAcct;
	}

	public String getPlRcptCc() {
		return this.plRcptCc;
	}

	public void setPlRcptCc(String plRcptCc) {
		this.plRcptCc = plRcptCc;
	}

	public String getPlDscAcct() {
		return this.plDscAcct;
	}

	public void setPlDscAcct(String plDscAcct) {
		this.plDscAcct = plDscAcct;
	}

	public String getPlDscCc() {
		return this.plDscCc;
	}

	public void setPlDscCc(String plDscCc) {
		this.plDscCc = plDscCc;
	}

	public String getPlWvarAcct() {
		return this.plWvarAcct;
	}

	public void setPlWvarAcct(String plWvarAcct) {
		this.plWvarAcct = plWvarAcct;
	}

	public String getPlWvarCc() {
		return this.plWvarCc;
	}

	public void setPlWvarCc(String plWvarCc) {
		this.plWvarCc = plWvarCc;
	}

	public String getPlTaxc() {
		return this.plTaxc;
	}

	public void setPlTaxc(String plTaxc) {
		this.plTaxc = plTaxc;
	}

	public Boolean getPlTaxable() {
		return this.plTaxable;
	}

	public void setPlTaxable(Boolean plTaxable) {
		this.plTaxable = plTaxable;
	}

	public String getPlUser1() {
		return this.plUser1;
	}

	public void setPlUser1(String plUser1) {
		this.plUser1 = plUser1;
	}

	public String getPlUser2() {
		return this.plUser2;
	}

	public void setPlUser2(String plUser2) {
		this.plUser2 = plUser2;
	}

	public Boolean getPlPst() {
		return this.plPst;
	}

	public void setPlPst(Boolean plPst) {
		this.plPst = plPst;
	}

	public String getPlEslsAcct() {
		return this.plEslsAcct;
	}

	public void setPlEslsAcct(String plEslsAcct) {
		this.plEslsAcct = plEslsAcct;
	}

	public String getPlEslsCc() {
		return this.plEslsCc;
	}

	public void setPlEslsCc(String plEslsCc) {
		this.plEslsCc = plEslsCc;
	}

	public String getPlChr01() {
		return this.plChr01;
	}

	public void setPlChr01(String plChr01) {
		this.plChr01 = plChr01;
	}

	public String getPlChr02() {
		return this.plChr02;
	}

	public void setPlChr02(String plChr02) {
		this.plChr02 = plChr02;
	}

	public String getPlChr03() {
		return this.plChr03;
	}

	public void setPlChr03(String plChr03) {
		this.plChr03 = plChr03;
	}

	public String getPlChr04() {
		return this.plChr04;
	}

	public void setPlChr04(String plChr04) {
		this.plChr04 = plChr04;
	}

	public String getPlChr05() {
		return this.plChr05;
	}

	public void setPlChr05(String plChr05) {
		this.plChr05 = plChr05;
	}

	public Date getPlDte01() {
		return this.plDte01;
	}

	public void setPlDte01(Date plDte01) {
		this.plDte01 = plDte01;
	}

	public Date getPlDte02() {
		return this.plDte02;
	}

	public void setPlDte02(Date plDte02) {
		this.plDte02 = plDte02;
	}

	public Double getPlDec01() {
		return this.plDec01;
	}

	public void setPlDec01(Double plDec01) {
		this.plDec01 = plDec01;
	}

	public Double getPlDec02() {
		return this.plDec02;
	}

	public void setPlDec02(Double plDec02) {
		this.plDec02 = plDec02;
	}

	public Boolean getPlLog01() {
		return this.plLog01;
	}

	public void setPlLog01(Boolean plLog01) {
		this.plLog01 = plLog01;
	}

	public String getPlGroup() {
		return this.plGroup;
	}

	public void setPlGroup(String plGroup) {
		this.plGroup = plGroup;
	}

	public String getPlDivision() {
		return this.plDivision;
	}

	public void setPlDivision(String plDivision) {
		this.plDivision = plDivision;
	}

	public String getPlCchgAcct() {
		return this.plCchgAcct;
	}

	public void setPlCchgAcct(String plCchgAcct) {
		this.plCchgAcct = plCchgAcct;
	}

	public String getPlCchgCc() {
		return this.plCchgCc;
	}

	public void setPlCchgCc(String plCchgCc) {
		this.plCchgCc = plCchgCc;
	}

	public String getPlUserid() {
		return this.plUserid;
	}

	public void setPlUserid(String plUserid) {
		this.plUserid = plUserid;
	}

	public Date getPlModDate() {
		return this.plModDate;
	}

	public void setPlModDate(Date plModDate) {
		this.plModDate = plModDate;
	}

	public String getPlCmtlAcct() {
		return this.plCmtlAcct;
	}

	public void setPlCmtlAcct(String plCmtlAcct) {
		this.plCmtlAcct = plCmtlAcct;
	}

	public String getPlCmtlCc() {
		return this.plCmtlCc;
	}

	public void setPlCmtlCc(String plCmtlCc) {
		this.plCmtlCc = plCmtlCc;
	}

	public String getPlClbrAcct() {
		return this.plClbrAcct;
	}

	public void setPlClbrAcct(String plClbrAcct) {
		this.plClbrAcct = plClbrAcct;
	}

	public String getPlClbrCc() {
		return this.plClbrCc;
	}

	public void setPlClbrCc(String plClbrCc) {
		this.plClbrCc = plClbrCc;
	}

	public String getPlCbdnAcct() {
		return this.plCbdnAcct;
	}

	public void setPlCbdnAcct(String plCbdnAcct) {
		this.plCbdnAcct = plCbdnAcct;
	}

	public String getPlCbdnCc() {
		return this.plCbdnCc;
	}

	public void setPlCbdnCc(String plCbdnCc) {
		this.plCbdnCc = plCbdnCc;
	}

	public String getPlCovhAcct() {
		return this.plCovhAcct;
	}

	public void setPlCovhAcct(String plCovhAcct) {
		this.plCovhAcct = plCovhAcct;
	}

	public String getPlCovhCc() {
		return this.plCovhCc;
	}

	public void setPlCovhCc(String plCovhCc) {
		this.plCovhCc = plCovhCc;
	}

	public String getPlCsubAcct() {
		return this.plCsubAcct;
	}

	public void setPlCsubAcct(String plCsubAcct) {
		this.plCsubAcct = plCsubAcct;
	}

	public String getPlCsubCc() {
		return this.plCsubCc;
	}

	public void setPlCsubCc(String plCsubCc) {
		this.plCsubCc = plCsubCc;
	}

	public String getPlApvrAcct() {
		return this.plApvrAcct;
	}

	public void setPlApvrAcct(String plApvrAcct) {
		this.plApvrAcct = plApvrAcct;
	}

	public String getPlApvrCc() {
		return this.plApvrCc;
	}

	public void setPlApvrCc(String plApvrCc) {
		this.plApvrCc = plApvrCc;
	}

	public String getPlApvuAcct() {
		return this.plApvuAcct;
	}

	public void setPlApvuAcct(String plApvuAcct) {
		this.plApvuAcct = plApvuAcct;
	}

	public String getPlApvuCc() {
		return this.plApvuCc;
	}

	public void setPlApvuCc(String plApvuCc) {
		this.plApvuCc = plApvuCc;
	}

	public String getPlOvhAcct() {
		return this.plOvhAcct;
	}

	public void setPlOvhAcct(String plOvhAcct) {
		this.plOvhAcct = plOvhAcct;
	}

	public String getPlOvhCc() {
		return this.plOvhCc;
	}

	public void setPlOvhCc(String plOvhCc) {
		this.plOvhCc = plOvhCc;
	}

	public String getPlMvarAcct() {
		return this.plMvarAcct;
	}

	public void setPlMvarAcct(String plMvarAcct) {
		this.plMvarAcct = plMvarAcct;
	}

	public String getPlMvarCc() {
		return this.plMvarCc;
	}

	public void setPlMvarCc(String plMvarCc) {
		this.plMvarCc = plMvarCc;
	}

	public String getPlMvrrAcct() {
		return this.plMvrrAcct;
	}

	public void setPlMvrrAcct(String plMvrrAcct) {
		this.plMvrrAcct = plMvrrAcct;
	}

	public String getPlMvrrCc() {
		return this.plMvrrCc;
	}

	public void setPlMvrrCc(String plMvrrCc) {
		this.plMvrrCc = plMvrrCc;
	}

	public String getPlSvarAcct() {
		return this.plSvarAcct;
	}

	public void setPlSvarAcct(String plSvarAcct) {
		this.plSvarAcct = plSvarAcct;
	}

	public String getPlSvarCc() {
		return this.plSvarCc;
	}

	public void setPlSvarCc(String plSvarCc) {
		this.plSvarCc = plSvarCc;
	}

	public String getPlSvrrAcct() {
		return this.plSvrrAcct;
	}

	public void setPlSvrrAcct(String plSvrrAcct) {
		this.plSvrrAcct = plSvrrAcct;
	}

	public String getPlSvrrCc() {
		return this.plSvrrCc;
	}

	public void setPlSvrrCc(String plSvrrCc) {
		this.plSvrrCc = plSvrrCc;
	}

	public String getPlCopAcct() {
		return this.plCopAcct;
	}

	public void setPlCopAcct(String plCopAcct) {
		this.plCopAcct = plCopAcct;
	}

	public String getPlCopCc() {
		return this.plCopCc;
	}

	public void setPlCopCc(String plCopCc) {
		this.plCopCc = plCopCc;
	}

	public String getPlFlrAcct() {
		return this.plFlrAcct;
	}

	public void setPlFlrAcct(String plFlrAcct) {
		this.plFlrAcct = plFlrAcct;
	}

	public String getPlFlrCc() {
		return this.plFlrCc;
	}

	public void setPlFlrCc(String plFlrCc) {
		this.plFlrCc = plFlrCc;
	}

	public String getPlQadc06() {
		return this.plQadc06;
	}

	public void setPlQadc06(String plQadc06) {
		this.plQadc06 = plQadc06;
	}

	public String getPlQadc07() {
		return this.plQadc07;
	}

	public void setPlQadc07(String plQadc07) {
		this.plQadc07 = plQadc07;
	}

	public String getPlQadc08() {
		return this.plQadc08;
	}

	public void setPlQadc08(String plQadc08) {
		this.plQadc08 = plQadc08;
	}

	public String getPlQadc09() {
		return this.plQadc09;
	}

	public void setPlQadc09(String plQadc09) {
		this.plQadc09 = plQadc09;
	}

	public String getPlRmarAcct() {
		return this.plRmarAcct;
	}

	public void setPlRmarAcct(String plRmarAcct) {
		this.plRmarAcct = plRmarAcct;
	}

	public String getPlRmarCc() {
		return this.plRmarCc;
	}

	public void setPlRmarCc(String plRmarCc) {
		this.plRmarCc = plRmarCc;
	}

	public String getPlQadc12() {
		return this.plQadc12;
	}

	public void setPlQadc12(String plQadc12) {
		this.plQadc12 = plQadc12;
	}

	public String getPlQadc13() {
		return this.plQadc13;
	}

	public void setPlQadc13(String plQadc13) {
		this.plQadc13 = plQadc13;
	}

	public String getPlQadc14() {
		return this.plQadc14;
	}

	public void setPlQadc14(String plQadc14) {
		this.plQadc14 = plQadc14;
	}

	public String getPlQadc15() {
		return this.plQadc15;
	}

	public void setPlQadc15(String plQadc15) {
		this.plQadc15 = plQadc15;
	}

	public String getPlFiscalClass() {
		return this.plFiscalClass;
	}

	public void setPlFiscalClass(String plFiscalClass) {
		this.plFiscalClass = plFiscalClass;
	}

	public String getPlXvarAcct() {
		return this.plXvarAcct;
	}

	public void setPlXvarAcct(String plXvarAcct) {
		this.plXvarAcct = plXvarAcct;
	}

	public String getPlXvarCc() {
		return this.plXvarCc;
	}

	public void setPlXvarCc(String plXvarCc) {
		this.plXvarCc = plXvarCc;
	}

	public String getPlFslbrAcct() {
		return this.plFslbrAcct;
	}

	public void setPlFslbrAcct(String plFslbrAcct) {
		this.plFslbrAcct = plFslbrAcct;
	}

	public String getPlFsbdnAcct() {
		return this.plFsbdnAcct;
	}

	public void setPlFsbdnAcct(String plFsbdnAcct) {
		this.plFsbdnAcct = plFsbdnAcct;
	}

	public String getPlQadc10() {
		return this.plQadc10;
	}

	public void setPlQadc10(String plQadc10) {
		this.plQadc10 = plQadc10;
	}

	public String getPlFsexpAcct() {
		return this.plFsexpAcct;
	}

	public void setPlFsexpAcct(String plFsexpAcct) {
		this.plFsexpAcct = plFsexpAcct;
	}

	public String getPlFsexdAcct() {
		return this.plFsexdAcct;
	}

	public void setPlFsexdAcct(String plFsexdAcct) {
		this.plFsexdAcct = plFsexdAcct;
	}

	public String getPlFslbrCc() {
		return this.plFslbrCc;
	}

	public void setPlFslbrCc(String plFslbrCc) {
		this.plFslbrCc = plFslbrCc;
	}

	public String getPlFsbdnCc() {
		return this.plFsbdnCc;
	}

	public void setPlFsbdnCc(String plFsbdnCc) {
		this.plFsbdnCc = plFsbdnCc;
	}

	public String getPlQadc11() {
		return this.plQadc11;
	}

	public void setPlQadc11(String plQadc11) {
		this.plQadc11 = plQadc11;
	}

	public String getPlFsexpCc() {
		return this.plFsexpCc;
	}

	public void setPlFsexpCc(String plFsexpCc) {
		this.plFsexpCc = plFsexpCc;
	}

	public String getPlFsexdCc() {
		return this.plFsexdCc;
	}

	public void setPlFsexdCc(String plFsexdCc) {
		this.plFsexdCc = plFsexdCc;
	}

	public String getPlFsrcInvAcct() {
		return this.plFsrcInvAcct;
	}

	public void setPlFsrcInvAcct(String plFsrcInvAcct) {
		this.plFsrcInvAcct = plFsrcInvAcct;
	}

	public String getPlFsrcInvCc() {
		return this.plFsrcInvCc;
	}

	public void setPlFsrcInvCc(String plFsrcInvCc) {
		this.plFsrcInvCc = plFsrcInvCc;
	}

	public String getPlFscmInvAcct() {
		return this.plFscmInvAcct;
	}

	public void setPlFscmInvAcct(String plFscmInvAcct) {
		this.plFscmInvAcct = plFscmInvAcct;
	}

	public String getPlFscmInvCc() {
		return this.plFscmInvCc;
	}

	public void setPlFscmInvCc(String plFscmInvCc) {
		this.plFscmInvCc = plFscmInvCc;
	}

	public String getPlQadc01() {
		return this.plQadc01;
	}

	public void setPlQadc01(String plQadc01) {
		this.plQadc01 = plQadc01;
	}

	public String getPlQadc02() {
		return this.plQadc02;
	}

	public void setPlQadc02(String plQadc02) {
		this.plQadc02 = plQadc02;
	}

	public String getPlQadc03() {
		return this.plQadc03;
	}

	public void setPlQadc03(String plQadc03) {
		this.plQadc03 = plQadc03;
	}

	public String getPlQadc04() {
		return this.plQadc04;
	}

	public void setPlQadc04(String plQadc04) {
		this.plQadc04 = plQadc04;
	}

	public String getPlQadc05() {
		return this.plQadc05;
	}

	public void setPlQadc05(String plQadc05) {
		this.plQadc05 = plQadc05;
	}

	public Boolean getPlQadl01() {
		return this.plQadl01;
	}

	public void setPlQadl01(Boolean plQadl01) {
		this.plQadl01 = plQadl01;
	}

	public Date getPlQadt01() {
		return this.plQadt01;
	}

	public void setPlQadt01(Date plQadt01) {
		this.plQadt01 = plQadt01;
	}

	public Double getPlQadd01() {
		return this.plQadd01;
	}

	public void setPlQadd01(Double plQadd01) {
		this.plQadd01 = plQadd01;
	}

	public String getPlApvrSub() {
		return this.plApvrSub;
	}

	public void setPlApvrSub(String plApvrSub) {
		this.plApvrSub = plApvrSub;
	}

	public String getPlApvuSub() {
		return this.plApvuSub;
	}

	public void setPlApvuSub(String plApvuSub) {
		this.plApvuSub = plApvuSub;
	}

	public String getPlCbdnSub() {
		return this.plCbdnSub;
	}

	public void setPlCbdnSub(String plCbdnSub) {
		this.plCbdnSub = plCbdnSub;
	}

	public String getPlCchgSub() {
		return this.plCchgSub;
	}

	public void setPlCchgSub(String plCchgSub) {
		this.plCchgSub = plCchgSub;
	}

	public String getPlClbrSub() {
		return this.plClbrSub;
	}

	public void setPlClbrSub(String plClbrSub) {
		this.plClbrSub = plClbrSub;
	}

	public String getPlCmtlSub() {
		return this.plCmtlSub;
	}

	public void setPlCmtlSub(String plCmtlSub) {
		this.plCmtlSub = plCmtlSub;
	}

	public String getPlCogSub() {
		return this.plCogSub;
	}

	public void setPlCogSub(String plCogSub) {
		this.plCogSub = plCogSub;
	}

	public String getPlCopSub() {
		return this.plCopSub;
	}

	public void setPlCopSub(String plCopSub) {
		this.plCopSub = plCopSub;
	}

	public String getPlCovhSub() {
		return this.plCovhSub;
	}

	public void setPlCovhSub(String plCovhSub) {
		this.plCovhSub = plCovhSub;
	}

	public String getPlCsubSub() {
		return this.plCsubSub;
	}

	public void setPlCsubSub(String plCsubSub) {
		this.plCsubSub = plCsubSub;
	}

	public String getPlDscrSub() {
		return this.plDscrSub;
	}

	public void setPlDscrSub(String plDscrSub) {
		this.plDscrSub = plDscrSub;
	}

	public String getPlDscSub() {
		return this.plDscSub;
	}

	public void setPlDscSub(String plDscSub) {
		this.plDscSub = plDscSub;
	}

	public String getPlFlrSub() {
		return this.plFlrSub;
	}

	public void setPlFlrSub(String plFlrSub) {
		this.plFlrSub = plFlrSub;
	}

	public String getPlFsbdnSub() {
		return this.plFsbdnSub;
	}

	public void setPlFsbdnSub(String plFsbdnSub) {
		this.plFsbdnSub = plFsbdnSub;
	}

	public String getPlFscmInvSub() {
		return this.plFscmInvSub;
	}

	public void setPlFscmInvSub(String plFscmInvSub) {
		this.plFscmInvSub = plFscmInvSub;
	}

	public String getPlFsexdSub() {
		return this.plFsexdSub;
	}

	public void setPlFsexdSub(String plFsexdSub) {
		this.plFsexdSub = plFsexdSub;
	}

	public String getPlFsexpSub() {
		return this.plFsexpSub;
	}

	public void setPlFsexpSub(String plFsexpSub) {
		this.plFsexpSub = plFsexpSub;
	}

	public String getPlFslbrSub() {
		return this.plFslbrSub;
	}

	public void setPlFslbrSub(String plFslbrSub) {
		this.plFslbrSub = plFslbrSub;
	}

	public String getPlFsrcInvSub() {
		return this.plFsrcInvSub;
	}

	public void setPlFsrcInvSub(String plFsrcInvSub) {
		this.plFsrcInvSub = plFsrcInvSub;
	}

	public String getPlInvSub() {
		return this.plInvSub;
	}

	public void setPlInvSub(String plInvSub) {
		this.plInvSub = plInvSub;
	}

	public String getPlMvarSub() {
		return this.plMvarSub;
	}

	public void setPlMvarSub(String plMvarSub) {
		this.plMvarSub = plMvarSub;
	}

	public String getPlMvrrSub() {
		return this.plMvrrSub;
	}

	public void setPlMvrrSub(String plMvrrSub) {
		this.plMvrrSub = plMvrrSub;
	}

	public String getPlOvhSub() {
		return this.plOvhSub;
	}

	public void setPlOvhSub(String plOvhSub) {
		this.plOvhSub = plOvhSub;
	}

	public String getPlPpvSub() {
		return this.plPpvSub;
	}

	public void setPlPpvSub(String plPpvSub) {
		this.plPpvSub = plPpvSub;
	}

	public String getPlPurSub() {
		return this.plPurSub;
	}

	public void setPlPurSub(String plPurSub) {
		this.plPurSub = plPurSub;
	}

	public String getPlRcptSub() {
		return this.plRcptSub;
	}

	public void setPlRcptSub(String plRcptSub) {
		this.plRcptSub = plRcptSub;
	}

	public String getPlRmarSub() {
		return this.plRmarSub;
	}

	public void setPlRmarSub(String plRmarSub) {
		this.plRmarSub = plRmarSub;
	}

	public String getPlScrpSub() {
		return this.plScrpSub;
	}

	public void setPlScrpSub(String plScrpSub) {
		this.plScrpSub = plScrpSub;
	}

	public String getPlSlsSub() {
		return this.plSlsSub;
	}

	public void setPlSlsSub(String plSlsSub) {
		this.plSlsSub = plSlsSub;
	}

	public String getPlSvarSub() {
		return this.plSvarSub;
	}

	public void setPlSvarSub(String plSvarSub) {
		this.plSvarSub = plSvarSub;
	}

	public String getPlSvrrSub() {
		return this.plSvrrSub;
	}

	public void setPlSvrrSub(String plSvrrSub) {
		this.plSvrrSub = plSvrrSub;
	}

	public String getPlWipSub() {
		return this.plWipSub;
	}

	public void setPlWipSub(String plWipSub) {
		this.plWipSub = plWipSub;
	}

	public String getPlWvarSub() {
		return this.plWvarSub;
	}

	public void setPlWvarSub(String plWvarSub) {
		this.plWvarSub = plWvarSub;
	}

	public String getPlXvarSub() {
		return this.plXvarSub;
	}

	public void setPlXvarSub(String plXvarSub) {
		this.plXvarSub = plXvarSub;
	}

	public String getPlXferAcct() {
		return this.plXferAcct;
	}

	public void setPlXferAcct(String plXferAcct) {
		this.plXferAcct = plXferAcct;
	}

	public String getPlXferSub() {
		return this.plXferSub;
	}

	public void setPlXferSub(String plXferSub) {
		this.plXferSub = plXferSub;
	}

	public String getPlXferCc() {
		return this.plXferCc;
	}

	public void setPlXferCc(String plXferCc) {
		this.plXferCc = plXferCc;
	}

	public String getPlFsdefAcct() {
		return this.plFsdefAcct;
	}

	public void setPlFsdefAcct(String plFsdefAcct) {
		this.plFsdefAcct = plFsdefAcct;
	}

	public String getPlFsdefSub() {
		return this.plFsdefSub;
	}

	public void setPlFsdefSub(String plFsdefSub) {
		this.plFsdefSub = plFsdefSub;
	}

	public String getPlFsdefCc() {
		return this.plFsdefCc;
	}

	public void setPlFsdefCc(String plFsdefCc) {
		this.plFsdefCc = plFsdefCc;
	}

	public String getPlFsaccrAcct() {
		return this.plFsaccrAcct;
	}

	public void setPlFsaccrAcct(String plFsaccrAcct) {
		this.plFsaccrAcct = plFsaccrAcct;
	}

	public String getPlFsaccrSub() {
		return this.plFsaccrSub;
	}

	public void setPlFsaccrSub(String plFsaccrSub) {
		this.plFsaccrSub = plFsaccrSub;
	}

	public String getPlFsaccrCc() {
		return this.plFsaccrCc;
	}

	public void setPlFsaccrCc(String plFsaccrCc) {
		this.plFsaccrCc = plFsaccrCc;
	}

	public Double getOidPlMstr() {
		return this.oidPlMstr;
	}

	public void setOidPlMstr(Double oidPlMstr) {
		this.oidPlMstr = oidPlMstr;
	}

}