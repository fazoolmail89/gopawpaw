package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EcmMstr entity. @author MyEclipse Persistence Tools
 */
public class EcmMstr extends AbstractEcmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EcmMstr() {
	}

	/** minimal constructor */
	public EcmMstr(EcmMstrId id, Double oidEcmMstr) {
		super(id, oidEcmMstr);
	}

	/** full constructor */
	public EcmMstr(EcmMstrId id, Date ecmDate, String ecmInit, String ecmCmmt,
			Double ecmQad01, String ecmQad02, String ecmUser1, String ecmUser2,
			Integer ecmCmtindx, String ecmUserid, Date ecmModDate,
			Date ecmEffDate, Date ecmManDate, Date ecmSubDate, Date ecmEndDate,
			Date ecmRelDate, String ecmTitle, String ecmApproval,
			String ecmDistr, Boolean ecmReplan, String ecmType,
			String ecmStatus, String ecmNbrFr, String ecmNbrTo,
			Double ecmExpCost, String ecmName, String ecmAssign,
			Date ecmOpenDate, Date ecmCloseDate, String ecmEcrDspn,
			Boolean ecmQad03, Date ecmQad04, Double ecmQad05, String ecmQad06,
			String ecmQad07, String ecmSecureText, String ecmSecureItem,
			String ecmSecureStct, String ecmSecureRouting,
			String ecmSecureAdmn, Boolean ecmSeqrevOff, Date ecmApprDate,
			Date ecmSelectedEff, Boolean ecmBatched, Boolean ecmReprocess,
			String ecmDocType, Double oidEcmMstr) {
		super(id, ecmDate, ecmInit, ecmCmmt, ecmQad01, ecmQad02, ecmUser1,
				ecmUser2, ecmCmtindx, ecmUserid, ecmModDate, ecmEffDate,
				ecmManDate, ecmSubDate, ecmEndDate, ecmRelDate, ecmTitle,
				ecmApproval, ecmDistr, ecmReplan, ecmType, ecmStatus, ecmNbrFr,
				ecmNbrTo, ecmExpCost, ecmName, ecmAssign, ecmOpenDate,
				ecmCloseDate, ecmEcrDspn, ecmQad03, ecmQad04, ecmQad05,
				ecmQad06, ecmQad07, ecmSecureText, ecmSecureItem,
				ecmSecureStct, ecmSecureRouting, ecmSecureAdmn, ecmSeqrevOff,
				ecmApprDate, ecmSelectedEff, ecmBatched, ecmReprocess,
				ecmDocType, oidEcmMstr);
	}

}
