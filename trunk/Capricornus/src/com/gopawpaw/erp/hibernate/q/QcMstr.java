package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QcMstr entity. @author MyEclipse Persistence Tools
 */
public class QcMstr extends AbstractQcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QcMstr() {
	}

	/** minimal constructor */
	public QcMstr(QcMstrId id, Double oidQcMstr) {
		super(id, oidQcMstr);
	}

	/** full constructor */
	public QcMstr(QcMstrId id, String qcRef, Date qcOrdDate, Date qcRelDate,
			Date qcDueDate, String qcProject, String qcPart, String qcType,
			Double qcQtyOrd, Double qcQtyComp, Double qcQtyRjct,
			String qcStatus, String qcRmks, Double qcLeadTime,
			Integer qcCmtindx, String qcUser1, String qcUser2, String qcLoc,
			String qcSerial, String qcTeststep, String qcSite, String qcChr01,
			String qcChr02, String qcChr03, String qcChr04, String qcChr05,
			Date qcDte01, Date qcDte02, Double qcDec01, Double qcDec02,
			Boolean qcLog01, String qcInspLoc, String qcInvStat,
			Boolean qcAutoissue, String qcJob, Double oidQcMstr) {
		super(id, qcRef, qcOrdDate, qcRelDate, qcDueDate, qcProject, qcPart,
				qcType, qcQtyOrd, qcQtyComp, qcQtyRjct, qcStatus, qcRmks,
				qcLeadTime, qcCmtindx, qcUser1, qcUser2, qcLoc, qcSerial,
				qcTeststep, qcSite, qcChr01, qcChr02, qcChr03, qcChr04,
				qcChr05, qcDte01, qcDte02, qcDec01, qcDec02, qcLog01,
				qcInspLoc, qcInvStat, qcAutoissue, qcJob, oidQcMstr);
	}

}
