package com.gopawpaw.erp.hibernate.l;

/**
 * LnMstr entity. @author MyEclipse Persistence Tools
 */
public class LnMstr extends AbstractLnMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LnMstr() {
	}

	/** minimal constructor */
	public LnMstr(LnMstrId id, String lnScheduleCode, String lnRateCode,
			Integer lnFreezePeriod, Boolean lnKanbanReceipts, Double oidLnMstr) {
		super(id, lnScheduleCode, lnRateCode, lnFreezePeriod, lnKanbanReceipts,
				oidLnMstr);
	}

	/** full constructor */
	public LnMstr(LnMstrId id, String lnDesc, String lnUser1, String lnUser2,
			Double lnRate, Boolean lnRateBase, Double lnShift1,
			Double lnShift2, Double lnShift3, String lnChr01, String lnChr03,
			String lnChr04, String lnChr05, Double lnDec01, Double lnDec02,
			Double lnDec03, Boolean lnLog01, Double lnShift4,
			String lnScheduleCode, String lnRateCode, Integer lnFreezePeriod,
			Boolean lnKanbanReceipts, Double oidLnMstr) {
		super(id, lnDesc, lnUser1, lnUser2, lnRate, lnRateBase, lnShift1,
				lnShift2, lnShift3, lnChr01, lnChr03, lnChr04, lnChr05,
				lnDec01, lnDec02, lnDec03, lnLog01, lnShift4, lnScheduleCode,
				lnRateCode, lnFreezePeriod, lnKanbanReceipts, oidLnMstr);
	}

}
