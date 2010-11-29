package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SalhHist entity. @author MyEclipse Persistence Tools
 */
public class SalhHist extends AbstractSalhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SalhHist() {
	}

	/** minimal constructor */
	public SalhHist(SalhHistId id, Double oidSalhHist) {
		super(id, oidSalhHist);
	}

	/** full constructor */
	public SalhHist(SalhHistId id, Double salhBudget, String salhCaIntType,
			String salhCode, Date salhEnd, String salhFcgCode, String salhFile,
			String salhFisSort, String salhFscCode, Double salhLimitAmt,
			Boolean salhQadl04, Integer salhLine, String salhNbr,
			String salhOvFcgCode, Double salhPctCovered, Boolean salhPerCall,
			String salhPrefix, Date salhStart, Double salhTotal,
			String salhType, String salhUser1, String salhUser2,
			String salhChr01, String salhChr02, String salhChr03,
			String salhChr04, Double salhDec01, Double salhDec02,
			Double salhDec03, Date salhDte01, Date salhDte02, Date salhDte03,
			Boolean salhLog01, Boolean salhLog02, Boolean salhLog03,
			String salhQadc01, String salhQadc02, String salhQadc03,
			String salhQadc04, Date salhQadt01, Date salhQadt02,
			Date salhQadt03, Double salhQadd01, Double salhQadd02,
			Double salhQadd03, Boolean salhQadl01, Boolean salhQadl02,
			Boolean salhQadl03, Double salhUnpostedAmt, Integer salhCallsAllow,
			String salhModUserid, Date salhModDate, Double salhListprLimit,
			Integer salhCallsTotal, Integer salhSequence, Integer salhDays,
			Date salhFirstActivity, Date salhLastActivity, String salhUsage,
			String salhReport, String salhCall, String salhCategory,
			Integer salhItmLine, Integer salhOp, Double salhConsumedAmt,
			Double salhQadd04, Date salhConsumedDate, String salhItmPart,
			Double oidSalhHist) {
		super(id, salhBudget, salhCaIntType, salhCode, salhEnd, salhFcgCode,
				salhFile, salhFisSort, salhFscCode, salhLimitAmt, salhQadl04,
				salhLine, salhNbr, salhOvFcgCode, salhPctCovered, salhPerCall,
				salhPrefix, salhStart, salhTotal, salhType, salhUser1,
				salhUser2, salhChr01, salhChr02, salhChr03, salhChr04,
				salhDec01, salhDec02, salhDec03, salhDte01, salhDte02,
				salhDte03, salhLog01, salhLog02, salhLog03, salhQadc01,
				salhQadc02, salhQadc03, salhQadc04, salhQadt01, salhQadt02,
				salhQadt03, salhQadd01, salhQadd02, salhQadd03, salhQadl01,
				salhQadl02, salhQadl03, salhUnpostedAmt, salhCallsAllow,
				salhModUserid, salhModDate, salhListprLimit, salhCallsTotal,
				salhSequence, salhDays, salhFirstActivity, salhLastActivity,
				salhUsage, salhReport, salhCall, salhCategory, salhItmLine,
				salhOp, salhConsumedAmt, salhQadd04, salhConsumedDate,
				salhItmPart, oidSalhHist);
	}

}
