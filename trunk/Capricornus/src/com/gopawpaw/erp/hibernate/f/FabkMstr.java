package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FabkMstr entity. @author MyEclipse Persistence Tools
 */
public class FabkMstr extends AbstractFabkMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FabkMstr() {
	}

	/** minimal constructor */
	public FabkMstr(FabkMstrId id, String fabkDesc, Integer fabkSeq,
			Boolean fabkPost, String fabkCalendar, String fabkModUserid,
			Date fabkModDate, String fabkUser1, String fabkUser2,
			String fabkChr01, Double fabkDec01, Boolean fabkLog01,
			Integer fabkInt01, String fabkQadc01, Double fabkQadd01,
			Boolean fabkQadl01, Integer fabkQadi01, String fabkQadc02,
			Double oidFabkMstr) {
		super(id, fabkDesc, fabkSeq, fabkPost, fabkCalendar, fabkModUserid,
				fabkModDate, fabkUser1, fabkUser2, fabkChr01, fabkDec01,
				fabkLog01, fabkInt01, fabkQadc01, fabkQadd01, fabkQadl01,
				fabkQadi01, fabkQadc02, oidFabkMstr);
	}

	/** full constructor */
	public FabkMstr(FabkMstrId id, String fabkDesc, Integer fabkSeq,
			Boolean fabkPost, String fabkCalendar, String fabkModUserid,
			Date fabkModDate, String fabkUser1, String fabkUser2,
			String fabkChr01, Double fabkDec01, Boolean fabkLog01,
			Date fabkDte01, Integer fabkInt01, String fabkQadc01,
			Double fabkQadd01, Boolean fabkQadl01, Date fabkQadt01,
			Integer fabkQadi01, String fabkQadc02, Double oidFabkMstr) {
		super(id, fabkDesc, fabkSeq, fabkPost, fabkCalendar, fabkModUserid,
				fabkModDate, fabkUser1, fabkUser2, fabkChr01, fabkDec01,
				fabkLog01, fabkDte01, fabkInt01, fabkQadc01, fabkQadd01,
				fabkQadl01, fabkQadt01, fabkQadi01, fabkQadc02, oidFabkMstr);
	}

}
