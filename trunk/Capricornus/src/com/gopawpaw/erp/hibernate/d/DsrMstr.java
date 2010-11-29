package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DsrMstr entity. @author MyEclipse Persistence Tools
 */
public class DsrMstr extends AbstractDsrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DsrMstr() {
	}

	/** minimal constructor */
	public DsrMstr(DsrMstrId id, String dsrAppOwner, Double oidDsrMstr) {
		super(id, dsrAppOwner, oidDsrMstr);
	}

	/** full constructor */
	public DsrMstr(DsrMstrId id, Integer dsrCmtindx, Date dsrDueDate,
			String dsrLoc, Date dsrOrdDate, String dsrPart, String dsrProject,
			Double dsrQtyReq, String dsrRev, String dsrRmks, String dsrSoJob,
			String dsrStatus, String dsrUser1, String dsrUser2,
			String dsrChr01, String dsrChr02, String dsrChr03, String dsrChr04,
			String dsrChr05, Double dsrDec01, Double dsrDec02, Date dsrDte01,
			Date dsrDte02, Boolean dsrLog01, String dsrAppOwner,
			Double oidDsrMstr) {
		super(id, dsrCmtindx, dsrDueDate, dsrLoc, dsrOrdDate, dsrPart,
				dsrProject, dsrQtyReq, dsrRev, dsrRmks, dsrSoJob, dsrStatus,
				dsrUser1, dsrUser2, dsrChr01, dsrChr02, dsrChr03, dsrChr04,
				dsrChr05, dsrDec01, dsrDec02, dsrDte01, dsrDte02, dsrLog01,
				dsrAppOwner, oidDsrMstr);
	}

}
