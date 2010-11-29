package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SlrMstr entity. @author MyEclipse Persistence Tools
 */
public class SlrMstr extends AbstractSlrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SlrMstr() {
	}

	/** minimal constructor */
	public SlrMstr(SlrMstrId id, String slrAttribute, Boolean slrLscActive,
			Date slrModDate, String slrModUserid, String slrQadc01,
			String slrQadc02, Double slrQadd01, Double slrQadd02,
			Integer slrQadi01, Boolean slrQadl01, String slrUserc01,
			String slrUserc02, Double slrUserd01, Integer slrUseri01,
			Boolean slrUserl01, Double oidSlrMstr) {
		super(id, slrAttribute, slrLscActive, slrModDate, slrModUserid,
				slrQadc01, slrQadc02, slrQadd01, slrQadd02, slrQadi01,
				slrQadl01, slrUserc01, slrUserc02, slrUserd01, slrUseri01,
				slrUserl01, oidSlrMstr);
	}

	/** full constructor */
	public SlrMstr(SlrMstrId id, String slrAttribute, Boolean slrLscActive,
			Date slrModDate, String slrModUserid, String slrQadc01,
			String slrQadc02, Double slrQadd01, Double slrQadd02,
			Integer slrQadi01, Boolean slrQadl01, Date slrQadt01,
			Date slrQadt02, String slrUserc01, String slrUserc02,
			Double slrUserd01, Integer slrUseri01, Boolean slrUserl01,
			Date slrUsert01, Double oidSlrMstr) {
		super(id, slrAttribute, slrLscActive, slrModDate, slrModUserid,
				slrQadc01, slrQadc02, slrQadd01, slrQadd02, slrQadi01,
				slrQadl01, slrQadt01, slrQadt02, slrUserc01, slrUserc02,
				slrUserd01, slrUseri01, slrUserl01, slrUsert01, oidSlrMstr);
	}

}
