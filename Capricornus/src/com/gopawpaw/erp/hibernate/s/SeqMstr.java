package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SeqMstr entity. @author MyEclipse Persistence Tools
 */
public class SeqMstr extends AbstractSeqMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SeqMstr() {
	}

	/** minimal constructor */
	public SeqMstr(SeqMstrId id, Double oidSeqMstr) {
		super(id, oidSeqMstr);
	}

	/** full constructor */
	public SeqMstr(SeqMstrId id, Double seqQtyReq, Date seqStart,
			Date seqRelease, Double seqPriority, Boolean seqMode,
			Double seqModeQty, Boolean seqType, Integer seqShift1,
			Double seqShift2, Double seqShift3, Double seqShift4,
			String seqUser1, String seqUser2, String seqChr01, String seqChr02,
			String seqChr03, String seqChr04, String seqChr05, Double seqDec01,
			Double seqDec02, Double seqDec03, Boolean seqLog01,
			Double oidSeqMstr) {
		super(id, seqQtyReq, seqStart, seqRelease, seqPriority, seqMode,
				seqModeQty, seqType, seqShift1, seqShift2, seqShift3,
				seqShift4, seqUser1, seqUser2, seqChr01, seqChr02, seqChr03,
				seqChr04, seqChr05, seqDec01, seqDec02, seqDec03, seqLog01,
				oidSeqMstr);
	}

}
