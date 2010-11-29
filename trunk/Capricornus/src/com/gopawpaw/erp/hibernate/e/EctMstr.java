package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EctMstr entity. @author MyEclipse Persistence Tools
 */
public class EctMstr extends AbstractEctMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EctMstr() {
	}

	/** minimal constructor */
	public EctMstr(EctMstrId id, Double oidEctMstr) {
		super(id, oidEctMstr);
	}

	/** full constructor */
	public EctMstr(EctMstrId id, String ectDesc, String ectApproval,
			String ectDistr, String ectPrefix, Integer ectDcWarn,
			String ectUser1, String ectUser2, Boolean ectQad01, Date ectQad02,
			String ectQad03, String ectQad04, String ectQad05, Date ectModDate,
			String ectUserid, String ectDocType, String ectSecureText,
			String ectSecureItem, String ectSecureStct,
			String ectSecureRouting, String ectSecureAdmn,
			Boolean ectSeqrevOff, Double oidEctMstr) {
		super(id, ectDesc, ectApproval, ectDistr, ectPrefix, ectDcWarn,
				ectUser1, ectUser2, ectQad01, ectQad02, ectQad03, ectQad04,
				ectQad05, ectModDate, ectUserid, ectDocType, ectSecureText,
				ectSecureItem, ectSecureStct, ectSecureRouting, ectSecureAdmn,
				ectSeqrevOff, oidEctMstr);
	}

}
