package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PjtMstr entity. @author MyEclipse Persistence Tools
 */
public class PjtMstr extends AbstractPjtMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PjtMstr() {
	}

	/** minimal constructor */
	public PjtMstr(PjtMstrId id, String pjtCaIntType, Integer pjtCmtindx,
			String pjtDesc, Integer pjtPriority, String pjtProdLine,
			String pjtPrList, Boolean pjtTaxable, String pjtTaxc,
			Date pjtModDate, String pjtModUserid, Double oidPjtMstr) {
		super(id, pjtCaIntType, pjtCmtindx, pjtDesc, pjtPriority, pjtProdLine,
				pjtPrList, pjtTaxable, pjtTaxc, pjtModDate, pjtModUserid,
				oidPjtMstr);
	}

	/** full constructor */
	public PjtMstr(PjtMstrId id, String pjtCaIntType, Integer pjtCmtindx,
			String pjtDesc, Integer pjtPriority, String pjtProdLine,
			String pjtPrList, Boolean pjtTaxable, String pjtTaxc,
			Date pjtModDate, String pjtModUserid, String pjtUser1,
			String pjtUser2, String pjtQadc01, Double pjtQadd01,
			Integer pjtQadi01, Boolean pjtQadl01, Date pjtQadt01,
			Double oidPjtMstr) {
		super(id, pjtCaIntType, pjtCmtindx, pjtDesc, pjtPriority, pjtProdLine,
				pjtPrList, pjtTaxable, pjtTaxc, pjtModDate, pjtModUserid,
				pjtUser1, pjtUser2, pjtQadc01, pjtQadd01, pjtQadi01, pjtQadl01,
				pjtQadt01, oidPjtMstr);
	}

}
