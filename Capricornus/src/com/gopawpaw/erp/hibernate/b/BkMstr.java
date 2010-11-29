package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BkMstr entity. @author MyEclipse Persistence Tools
 */
public class BkMstr extends AbstractBkMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BkMstr() {
	}

	/** minimal constructor */
	public BkMstr(BkMstrId id, String bkDftarAcct, String bkDftarCc,
			String bkBkchgAcct, String bkBkchgCc, String bkDiscAcct,
			String bkDiscCc, String bkDdftAcct, String bkDdftCc,
			String bkDftapAcct, String bkDftapCc, String bkBktxAcct,
			String bkBktxCc, String bkCdftAcct, String bkCdftCc,
			String bkEdftAcct, String bkEdftCc, String bkQadc06,
			String bkQadc07, String bkQadc08, String bkQadc09,
			String bkValidation, Double oidBkMstr) {
		super(id, bkDftarAcct, bkDftarCc, bkBkchgAcct, bkBkchgCc, bkDiscAcct,
				bkDiscCc, bkDdftAcct, bkDdftCc, bkDftapAcct, bkDftapCc,
				bkBktxAcct, bkBktxCc, bkCdftAcct, bkCdftCc, bkEdftAcct,
				bkEdftCc, bkQadc06, bkQadc07, bkQadc08, bkQadc09, bkValidation,
				oidBkMstr);
	}

	/** full constructor */
	public BkMstr(BkMstrId id, String bkAcct, String bkCc, Integer bkCheck,
			String bkDesc, String bkCurr, String bkQadc10, String bkQadc12,
			String bkUser1, String bkUser2, String bkEntity, String bkPipAcct,
			String bkPipCc, String bkBkAcct1, String bkBkAcct2,
			String bkUserid, Date bkModDate, String bkQadc02, String bkQadc03,
			String bkQadc04, String bkQadc05, Double bkMinDrft,
			Double bkMaxDrft, Double bkDrftChg, Double bkDrftChgPct,
			String bkDftarAcct, String bkDftarCc, String bkBkchgAcct,
			String bkBkchgCc, String bkDiscAcct, String bkDiscCc,
			String bkDdftAcct, String bkDdftCc, String bkDftapAcct,
			String bkDftapCc, String bkBktxAcct, String bkBktxCc,
			String bkCdftAcct, String bkCdftCc, String bkEdftAcct,
			String bkEdftCc, String bkQadc01, String bkQadc06, String bkQadc07,
			String bkQadc08, String bkQadc09, String bkSub, String bkBkchgSub,
			String bkBktxSub, String bkCdftSub, String bkDdftSub,
			String bkDftapSub, String bkDftarSub, String bkDiscSub,
			String bkEdftSub, String bkPipSub, String bkQadc11,
			String bkValidation, Double oidBkMstr) {
		super(id, bkAcct, bkCc, bkCheck, bkDesc, bkCurr, bkQadc10, bkQadc12,
				bkUser1, bkUser2, bkEntity, bkPipAcct, bkPipCc, bkBkAcct1,
				bkBkAcct2, bkUserid, bkModDate, bkQadc02, bkQadc03, bkQadc04,
				bkQadc05, bkMinDrft, bkMaxDrft, bkDrftChg, bkDrftChgPct,
				bkDftarAcct, bkDftarCc, bkBkchgAcct, bkBkchgCc, bkDiscAcct,
				bkDiscCc, bkDdftAcct, bkDdftCc, bkDftapAcct, bkDftapCc,
				bkBktxAcct, bkBktxCc, bkCdftAcct, bkCdftCc, bkEdftAcct,
				bkEdftCc, bkQadc01, bkQadc06, bkQadc07, bkQadc08, bkQadc09,
				bkSub, bkBkchgSub, bkBktxSub, bkCdftSub, bkDdftSub, bkDftapSub,
				bkDftarSub, bkDiscSub, bkEdftSub, bkPipSub, bkQadc11,
				bkValidation, oidBkMstr);
	}

}
