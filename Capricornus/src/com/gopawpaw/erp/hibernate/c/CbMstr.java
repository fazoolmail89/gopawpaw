package com.gopawpaw.erp.hibernate.c;

/**
 * CbMstr entity. @author MyEclipse Persistence Tools
 */
public class CbMstr extends AbstractCbMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CbMstr() {
	}

	/** minimal constructor */
	public CbMstr(CbMstrId id, Double cbExRate2, String cbExRatetype,
			Integer cbExruSeq, String cbSubtype, Double oidCbMstr) {
		super(id, cbExRate2, cbExRatetype, cbExruSeq, cbSubtype, oidCbMstr);
	}

	/** full constructor */
	public CbMstr(CbMstrId id, String cbType, Double cbAmt, String cbRef,
			Double cbExRate, String cbUser1, String cbUser2, String cbCurr,
			Double cbEntEx, Double cbCurrAmt, String cbQadc01,
			Double cbExRate2, String cbExRatetype, Integer cbExruSeq,
			String cbSubtype, Double oidCbMstr) {
		super(id, cbType, cbAmt, cbRef, cbExRate, cbUser1, cbUser2, cbCurr,
				cbEntEx, cbCurrAmt, cbQadc01, cbExRate2, cbExRatetype,
				cbExruSeq, cbSubtype, oidCbMstr);
	}

}
