package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PctMstr entity. @author MyEclipse Persistence Tools
 */
public class PctMstr extends AbstractPctMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PctMstr() {
	}

	/** minimal constructor */
	public PctMstr(PctMstrId id, String pctDesc, String pctApproval,
			String pctDistr, String pctPrefix, Integer pctDcWarn,
			String pctUser1, String pctUser2, Boolean pctQad01,
			String pctQad03, String pctQad04, String pctQad05,
			String pctUserid, String pctSecureText, String pctSecureItem,
			String pctSecureStct, String pctSecureRouting,
			String pctSecureAdmn, Boolean pctSeqrevOff, String pctDocType,
			Double oidPctMstr) {
		super(id, pctDesc, pctApproval, pctDistr, pctPrefix, pctDcWarn,
				pctUser1, pctUser2, pctQad01, pctQad03, pctQad04, pctQad05,
				pctUserid, pctSecureText, pctSecureItem, pctSecureStct,
				pctSecureRouting, pctSecureAdmn, pctSeqrevOff, pctDocType,
				oidPctMstr);
	}

	/** full constructor */
	public PctMstr(PctMstrId id, String pctDesc, String pctApproval,
			String pctDistr, String pctPrefix, Integer pctDcWarn,
			String pctUser1, String pctUser2, Boolean pctQad01, Date pctQad02,
			String pctQad03, String pctQad04, String pctQad05, Date pctModDate,
			String pctUserid, String pctSecureText, String pctSecureItem,
			String pctSecureStct, String pctSecureRouting,
			String pctSecureAdmn, Boolean pctSeqrevOff, String pctDocType,
			Double oidPctMstr) {
		super(id, pctDesc, pctApproval, pctDistr, pctPrefix, pctDcWarn,
				pctUser1, pctUser2, pctQad01, pctQad02, pctQad03, pctQad04,
				pctQad05, pctModDate, pctUserid, pctSecureText, pctSecureItem,
				pctSecureStct, pctSecureRouting, pctSecureAdmn, pctSeqrevOff,
				pctDocType, oidPctMstr);
	}

}
