package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GltrHist entity. @author MyEclipse Persistence Tools
 */
public class GltrHist extends AbstractGltrHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GltrHist() {
	}

	/** minimal constructor */
	public GltrHist(GltrHistId id, Boolean gltrCorrection, String gltrDyCode,
			String gltrDyNum, Double gltrExRate2, String gltrExRatetype,
			Double gltrEnExrate2, Integer gltrExruSeq, Integer gltrEnExruSeq,
			String gltrSrcDesc, Double oidGltrHist) {
		super(id, gltrCorrection, gltrDyCode, gltrDyNum, gltrExRate2,
				gltrExRatetype, gltrEnExrate2, gltrExruSeq, gltrEnExruSeq,
				gltrSrcDesc, oidGltrHist);
	}

	/** full constructor */
	public GltrHist(GltrHistId id, String gltrAcc, String gltrCtr,
			String gltrTrType, Date gltrEntDt, Date gltrEffDt, Double gltrAmt,
			String gltrDesc, Boolean gltrUnb, String gltrUser,
			String gltrProject, String gltrError, String gltrBatch,
			String gltrCurr, Double gltrCurramt, String gltrEntity,
			Double gltrExRate, Boolean gltrExport, String gltrAddr,
			String gltrDoc, String gltrDocTyp, String gltrUser1,
			String gltrUser2, String gltrFxInd, String gltrSub,
			Double gltrEcurAmt, Double gltrEnExrate, String gltrQadc01,
			Boolean gltrCorrection, String gltrDyCode, String gltrDyNum,
			Double gltrExRate2, String gltrExRatetype, Double gltrEnExrate2,
			Integer gltrExruSeq, Integer gltrEnExruSeq, String gltrSrcDesc,
			Double oidGltrHist) {
		super(id, gltrAcc, gltrCtr, gltrTrType, gltrEntDt, gltrEffDt, gltrAmt,
				gltrDesc, gltrUnb, gltrUser, gltrProject, gltrError, gltrBatch,
				gltrCurr, gltrCurramt, gltrEntity, gltrExRate, gltrExport,
				gltrAddr, gltrDoc, gltrDocTyp, gltrUser1, gltrUser2, gltrFxInd,
				gltrSub, gltrEcurAmt, gltrEnExrate, gltrQadc01, gltrCorrection,
				gltrDyCode, gltrDyNum, gltrExRate2, gltrExRatetype,
				gltrEnExrate2, gltrExruSeq, gltrEnExruSeq, gltrSrcDesc,
				oidGltrHist);
	}

}
