package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EngMstr entity. @author MyEclipse Persistence Tools
 */
public class EngMstr extends AbstractEngMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EngMstr() {
	}

	/** minimal constructor */
	public EngMstr(EngMstrId id, Double oidEngMstr) {
		super(id, oidEngMstr);
	}

	/** full constructor */
	public EngMstr(EngMstrId id, String engStatus, String engLocation,
			String engSkills, String engArea, String engPager, String engGroup,
			String engLabor, Date engCpltDt, Integer engCpltTm, String engSort,
			String engChr01, String engChr02, String engChr03, String engChr04,
			String engChr05, String engSite, String engLoc, String engChr06,
			String engChr07, String engChr08, String engChr09, String engChr10,
			Double engDec01, Double engDec02, Double engDec03, Date engDte01,
			Date engDte02, Date engDte03, Date engDte04, Boolean engLog01,
			Boolean engLog02, Boolean engLog03, Boolean engLog04,
			Boolean engLog05, String engLocRtn, String engSiteRtn,
			Boolean engSub, String engUser1, String engUser2,
			Integer engCallLoad, String engCode, Boolean engField,
			String engEshSchedule, Boolean eng3rdParty, Boolean engAvailOt,
			String engQadc01, String engQadc02, Date engQadd01, Date engQadd02,
			Double engQadde01, Integer engQadi01, Integer engQadi02,
			Boolean engQadl01, Boolean engQadl02, String engModUserid,
			Date engModDate, String engAddress, Double oidEngMstr) {
		super(id, engStatus, engLocation, engSkills, engArea, engPager,
				engGroup, engLabor, engCpltDt, engCpltTm, engSort, engChr01,
				engChr02, engChr03, engChr04, engChr05, engSite, engLoc,
				engChr06, engChr07, engChr08, engChr09, engChr10, engDec01,
				engDec02, engDec03, engDte01, engDte02, engDte03, engDte04,
				engLog01, engLog02, engLog03, engLog04, engLog05, engLocRtn,
				engSiteRtn, engSub, engUser1, engUser2, engCallLoad, engCode,
				engField, engEshSchedule, eng3rdParty, engAvailOt, engQadc01,
				engQadc02, engQadd01, engQadd02, engQadde01, engQadi01,
				engQadi02, engQadl01, engQadl02, engModUserid, engModDate,
				engAddress, oidEngMstr);
	}

}
