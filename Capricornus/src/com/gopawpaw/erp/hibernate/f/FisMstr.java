package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FisMstr entity. @author MyEclipse Persistence Tools
 */
public class FisMstr extends AbstractFisMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FisMstr() {
	}

	/** minimal constructor */
	public FisMstr(FisMstrId id, Double oidFisMstr) {
		super(id, oidFisMstr);
	}

	/** full constructor */
	public FisMstr(FisMstrId id, Integer fisColumn, String fisDesc,
			Boolean fisDetail, String fisLabel, Integer fisOrder,
			Boolean fisTotal, Boolean fisIncludeFix, String fisModUserid,
			Date fisModDate, String fisUser1, String fisUser2, String fisChr01,
			String fisChr02, Date fisDte01, Double fisDec01, Integer fisInt01,
			Boolean fisLog01, String fisQadc01, String fisQadc02,
			Date fisQadt01, Double fisQade01, Integer fisQadi01,
			Boolean fisQadl01, Double oidFisMstr) {
		super(id, fisColumn, fisDesc, fisDetail, fisLabel, fisOrder, fisTotal,
				fisIncludeFix, fisModUserid, fisModDate, fisUser1, fisUser2,
				fisChr01, fisChr02, fisDte01, fisDec01, fisInt01, fisLog01,
				fisQadc01, fisQadc02, fisQadt01, fisQade01, fisQadi01,
				fisQadl01, oidFisMstr);
	}

}
