package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RegMstr entity. @author MyEclipse Persistence Tools
 */
public class RegMstr extends AbstractRegMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RegMstr() {
	}

	/** minimal constructor */
	public RegMstr(RegMstrId id, Boolean reg3rdParty, Boolean regRepair,
			String regSite, Integer regTimeZone, Double oidRegMstr) {
		super(id, reg3rdParty, regRepair, regSite, regTimeZone, oidRegMstr);
	}

	/** full constructor */
	public RegMstr(RegMstrId id, String regType, String regDesc,
			String regChr01, String regChr02, String regChr03, Double regDec01,
			Double regDec02, Date regDte01, Date regDte02, Boolean regLog01,
			Boolean regLog02, String regUser1, String regUser2,
			Boolean reg3rdParty, String regLoc, Boolean regRepair,
			String regSite, Integer regTimeZone, String regLang,
			String regProdLine, String regSiteRtn, String regLocRtn,
			String regWkctr, String regProject, String regQadc05,
			String regQadc04, Date regModDate, String regModUserid,
			String regQadc01, String regQadc02, String regQadc03,
			Boolean regQadl01, Boolean regQadl02, Date regQadt01,
			Double regQade01, Double oidRegMstr) {
		super(id, regType, regDesc, regChr01, regChr02, regChr03, regDec01,
				regDec02, regDte01, regDte02, regLog01, regLog02, regUser1,
				regUser2, reg3rdParty, regLoc, regRepair, regSite, regTimeZone,
				regLang, regProdLine, regSiteRtn, regLocRtn, regWkctr,
				regProject, regQadc05, regQadc04, regModDate, regModUserid,
				regQadc01, regQadc02, regQadc03, regQadl01, regQadl02,
				regQadt01, regQade01, oidRegMstr);
	}

}
