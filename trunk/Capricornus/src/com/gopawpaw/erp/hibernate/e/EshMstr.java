package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EshMstr entity. @author MyEclipse Persistence Tools
 */
public class EshMstr extends AbstractEshMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EshMstr() {
	}

	/** minimal constructor */
	public EshMstr(EshMstrId id, Double oidEshMstr) {
		super(id, oidEshMstr);
	}

	/** full constructor */
	public EshMstr(EshMstrId id, String eshRegCode, Date eshEndEff,
			String eshSchedType, String eshDays, String eshStartTime,
			String eshEndTime, String eshStatus, String eshShiftCode,
			Boolean eshOncall, Boolean eshHolidays, String eshUser1,
			String eshUser2, Date eshModDate, String eshModUserid,
			String eshChr01, String eshChr02, Boolean eshLog01,
			Boolean eshLog02, Date eshDte01, Date eshDte02, String eshQadc01,
			String eshQadc02, Boolean eshQadl01, Boolean eshQadl02,
			Date eshQadt01, Date eshQadt02, Integer eshQadi01,
			String eshQadi02, Double oidEshMstr) {
		super(id, eshRegCode, eshEndEff, eshSchedType, eshDays, eshStartTime,
				eshEndTime, eshStatus, eshShiftCode, eshOncall, eshHolidays,
				eshUser1, eshUser2, eshModDate, eshModUserid, eshChr01,
				eshChr02, eshLog01, eshLog02, eshDte01, eshDte02, eshQadc01,
				eshQadc02, eshQadl01, eshQadl02, eshQadt01, eshQadt02,
				eshQadi01, eshQadi02, oidEshMstr);
	}

}
