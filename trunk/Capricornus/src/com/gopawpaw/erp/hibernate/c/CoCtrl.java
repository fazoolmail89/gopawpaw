package com.gopawpaw.erp.hibernate.c;

/**
 * CoCtrl entity. @author MyEclipse Persistence Tools
 */
public class CoCtrl extends AbstractCoCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CoCtrl() {
	}

	/** minimal constructor */
	public CoCtrl(String coExRatetype, String coYecAcct, String coYecSub,
			String coYecCc, String coYecDesc, String coBfbAcct,
			String coBfbSub, String coBfbCc, String coBfbDesc,
			Boolean coCloseBs, Boolean coSupReop, Double oidCoCtrl) {
		super(coExRatetype, coYecAcct, coYecSub, coYecCc, coYecDesc, coBfbAcct,
				coBfbSub, coBfbCc, coBfbDesc, coCloseBs, coSupReop, oidCoCtrl);
	}

	/** full constructor */
	public CoCtrl(String coQad01, String coPl, String coRet, String coVarAcct,
			Boolean coEntyBal, String coTrnsAcct, String coFxAcct,
			String coUser1, String coUser2, Integer coQadi01,
			Boolean coAllowMod, Integer coPageNum, Boolean coContPage,
			Boolean coUseSub, Boolean coUseCc, Boolean coDailySeq,
			String coExRatetype, Boolean coAudglt, Boolean coQadl01,
			String coYecAcct, String coYecSub, String coYecCc,
			String coYecDesc, String coBfbAcct, String coBfbSub,
			String coBfbCc, String coBfbDesc, Boolean coCloseBs,
			Boolean coSupReop, Double oidCoCtrl) {
		super(coQad01, coPl, coRet, coVarAcct, coEntyBal, coTrnsAcct, coFxAcct,
				coUser1, coUser2, coQadi01, coAllowMod, coPageNum, coContPage,
				coUseSub, coUseCc, coDailySeq, coExRatetype, coAudglt,
				coQadl01, coYecAcct, coYecSub, coYecCc, coYecDesc, coBfbAcct,
				coBfbSub, coBfbCc, coBfbDesc, coCloseBs, coSupReop, oidCoCtrl);
	}

}
