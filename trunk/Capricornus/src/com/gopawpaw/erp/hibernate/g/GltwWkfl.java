package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GltwWkfl entity. @author MyEclipse Persistence Tools
 */
public class GltwWkfl extends AbstractGltwWkfl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GltwWkfl() {
	}

	/** minimal constructor */
	public GltwWkfl(GltwWkflId id, String gltwDyCode, String gltwDyNum,
			Boolean gltwCorrection, Double gltwExRate2, String gltwExRatetype,
			Integer gltwExruSeq, Double oidGltwWkfl) {
		super(id, gltwDyCode, gltwDyNum, gltwCorrection, gltwExRate2,
				gltwExRatetype, gltwExruSeq, oidGltwWkfl);
	}

	/** full constructor */
	public GltwWkfl(GltwWkflId id, String gltwEntity, String gltwAcct,
			String gltwCc, String gltwDesc, Date gltwDate, Date gltwEffdate,
			Double gltwAmt, String gltwUserid, String gltwProject,
			String gltwBatch, String gltwAddr, String gltwDoc,
			String gltwDocTyp, String gltwUser1, String gltwUser2,
			String gltwCurr, Double gltwCurramt, String gltwTrType,
			Double gltwExRate, String gltwFxInd, String gltwSub,
			Double gltwEcurAmt, String gltwQadc01, String gltwDyCode,
			String gltwDyNum, Boolean gltwCorrection, Double gltwExRate2,
			String gltwExRatetype, Integer gltwExruSeq, Double oidGltwWkfl) {
		super(id, gltwEntity, gltwAcct, gltwCc, gltwDesc, gltwDate,
				gltwEffdate, gltwAmt, gltwUserid, gltwProject, gltwBatch,
				gltwAddr, gltwDoc, gltwDocTyp, gltwUser1, gltwUser2, gltwCurr,
				gltwCurramt, gltwTrType, gltwExRate, gltwFxInd, gltwSub,
				gltwEcurAmt, gltwQadc01, gltwDyCode, gltwDyNum, gltwCorrection,
				gltwExRate2, gltwExRatetype, gltwExruSeq, oidGltwWkfl);
	}

}
