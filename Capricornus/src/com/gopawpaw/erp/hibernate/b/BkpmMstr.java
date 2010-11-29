package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BkpmMstr entity. @author MyEclipse Persistence Tools
 */
public class BkpmMstr extends AbstractBkpmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BkpmMstr() {
	}

	/** minimal constructor */
	public BkpmMstr(BkpmMstrId id, String bkpmFilename, String bkpmCreateTime,
			String bkpmBkAcct, Boolean bkpmProcessed, Double bkpmMaxAmt,
			Boolean bkpmReconCredit, Double bkpmAmt, String bkpmMediaNbr,
			String bkpmUser1, String bkpmUser2, String bkpmUserc03,
			String bkpmUserc04, Boolean bkpmUserl01, Boolean bkpmUserl02,
			String bkpmQadc01, String bkpmQadc02, String bkpmBatch,
			Boolean bkpmExceedBalance, String bkpmFullBkAcct,
			String bkpmCompAddr, Date bkpmModDate, String bkpmModUserid,
			String bkpmUserc05, Double bkpmUserd01, Double bkpmUserd02,
			Integer bkpmUseri01, Integer bkpmUseri02, String bkpmQadc03,
			String bkpmQadc04, String bkpmQadc05, Double bkpmQadd01,
			Double bkpmQadd02, Integer bkpmQadi01, Integer bkpmQadi02,
			Boolean bkpmQadl01, Boolean bkpmQadl02, Double oidBkpmMstr) {
		super(id, bkpmFilename, bkpmCreateTime, bkpmBkAcct, bkpmProcessed,
				bkpmMaxAmt, bkpmReconCredit, bkpmAmt, bkpmMediaNbr, bkpmUser1,
				bkpmUser2, bkpmUserc03, bkpmUserc04, bkpmUserl01, bkpmUserl02,
				bkpmQadc01, bkpmQadc02, bkpmBatch, bkpmExceedBalance,
				bkpmFullBkAcct, bkpmCompAddr, bkpmModDate, bkpmModUserid,
				bkpmUserc05, bkpmUserd01, bkpmUserd02, bkpmUseri01,
				bkpmUseri02, bkpmQadc03, bkpmQadc04, bkpmQadc05, bkpmQadd01,
				bkpmQadd02, bkpmQadi01, bkpmQadi02, bkpmQadl01, bkpmQadl02,
				oidBkpmMstr);
	}

	/** full constructor */
	public BkpmMstr(BkpmMstrId id, String bkpmFilename, Date bkpmCreateDate,
			String bkpmCreateTime, String bkpmBkAcct, Boolean bkpmProcessed,
			Date bkpmCkDate, Double bkpmMaxAmt, Boolean bkpmReconCredit,
			Double bkpmAmt, String bkpmMediaNbr, String bkpmUser1,
			String bkpmUser2, String bkpmUserc03, String bkpmUserc04,
			Date bkpmUsert01, Date bkpmUsert02, Boolean bkpmUserl01,
			Boolean bkpmUserl02, String bkpmQadc01, String bkpmQadc02,
			String bkpmBatch, Boolean bkpmExceedBalance, String bkpmFullBkAcct,
			String bkpmCompAddr, Date bkpmModDate, String bkpmModUserid,
			String bkpmUserc05, Double bkpmUserd01, Double bkpmUserd02,
			Integer bkpmUseri01, Integer bkpmUseri02, String bkpmQadc03,
			String bkpmQadc04, String bkpmQadc05, Double bkpmQadd01,
			Double bkpmQadd02, Integer bkpmQadi01, Integer bkpmQadi02,
			Boolean bkpmQadl01, Boolean bkpmQadl02, Date bkpmQadt01,
			Date bkpmQadt02, Double oidBkpmMstr) {
		super(id, bkpmFilename, bkpmCreateDate, bkpmCreateTime, bkpmBkAcct,
				bkpmProcessed, bkpmCkDate, bkpmMaxAmt, bkpmReconCredit,
				bkpmAmt, bkpmMediaNbr, bkpmUser1, bkpmUser2, bkpmUserc03,
				bkpmUserc04, bkpmUsert01, bkpmUsert02, bkpmUserl01,
				bkpmUserl02, bkpmQadc01, bkpmQadc02, bkpmBatch,
				bkpmExceedBalance, bkpmFullBkAcct, bkpmCompAddr, bkpmModDate,
				bkpmModUserid, bkpmUserc05, bkpmUserd01, bkpmUserd02,
				bkpmUseri01, bkpmUseri02, bkpmQadc03, bkpmQadc04, bkpmQadc05,
				bkpmQadd01, bkpmQadd02, bkpmQadi01, bkpmQadi02, bkpmQadl01,
				bkpmQadl02, bkpmQadt01, bkpmQadt02, oidBkpmMstr);
	}

}
