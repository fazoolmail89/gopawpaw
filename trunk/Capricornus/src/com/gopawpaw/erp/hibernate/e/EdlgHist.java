package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EdlgHist entity. @author MyEclipse Persistence Tools
 */
public class EdlgHist extends AbstractEdlgHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EdlgHist() {
	}

	/** minimal constructor */
	public EdlgHist(EdlgHistId id, Double oidEdlgHist) {
		super(id, oidEdlgHist);
	}

	/** full constructor */
	public EdlgHist(EdlgHistId id, Date edlgDateSent, String edlgTimeSent,
			String edlgErrStat, String edlgModUserid, Date edlgModDate,
			String edlgUser1, String edlgUser2, String edlgChr01,
			String edlgChr02, Double edlgDec01, Double edlgDec02,
			Integer edlgInt01, Integer edlgInt02, Boolean edlgLog01,
			Boolean edlgLog02, Date edlgDte01, Date edlgDte02,
			String edlgQadc01, String edlgQadc02, String edlgQadc03,
			String edlgQadc04, Double edlgQadd01, Double edlgQadd02,
			Integer edlgQadi01, Integer edlgQadi02, Boolean edlgQadl01,
			Boolean edlgQadl02, Date edlgQadt01, Date edlgQadt02,
			Double oidEdlgHist) {
		super(id, edlgDateSent, edlgTimeSent, edlgErrStat, edlgModUserid,
				edlgModDate, edlgUser1, edlgUser2, edlgChr01, edlgChr02,
				edlgDec01, edlgDec02, edlgInt01, edlgInt02, edlgLog01,
				edlgLog02, edlgDte01, edlgDte02, edlgQadc01, edlgQadc02,
				edlgQadc03, edlgQadc04, edlgQadd01, edlgQadd02, edlgQadi01,
				edlgQadi02, edlgQadl01, edlgQadl02, edlgQadt01, edlgQadt02,
				oidEdlgHist);
	}

}
