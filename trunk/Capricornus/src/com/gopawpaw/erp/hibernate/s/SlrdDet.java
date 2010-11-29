package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SlrdDet entity. @author MyEclipse Persistence Tools
 */
public class SlrdDet extends AbstractSlrdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SlrdDet() {
	}

	/** minimal constructor */
	public SlrdDet(SlrdDetId id, Integer slrdLinkingRule,
			String slrdGlCostSite, Date slrdModDate, String slrdModUserid,
			String slrdQadc01, String slrdQadc02, Double slrdQadd01,
			Double slrdQadd02, Boolean slrdQadl01, String slrdUserc01,
			String slrdUserc02, Double slrdUserd01, Integer slrdUseri01,
			Boolean slrdUserl01, Integer slrdQadi01, Double oidSlrdDet) {
		super(id, slrdLinkingRule, slrdGlCostSite, slrdModDate, slrdModUserid,
				slrdQadc01, slrdQadc02, slrdQadd01, slrdQadd02, slrdQadl01,
				slrdUserc01, slrdUserc02, slrdUserd01, slrdUseri01,
				slrdUserl01, slrdQadi01, oidSlrdDet);
	}

	/** full constructor */
	public SlrdDet(SlrdDetId id, Integer slrdLinkingRule,
			String slrdGlCostSite, Date slrdModDate, String slrdModUserid,
			String slrdQadc01, String slrdQadc02, Double slrdQadd01,
			Double slrdQadd02, Boolean slrdQadl01, Date slrdQadt01,
			Date slrdQadt02, String slrdUserc01, String slrdUserc02,
			Double slrdUserd01, Integer slrdUseri01, Boolean slrdUserl01,
			Date slrdUsert01, Integer slrdQadi01, Double oidSlrdDet) {
		super(id, slrdLinkingRule, slrdGlCostSite, slrdModDate, slrdModUserid,
				slrdQadc01, slrdQadc02, slrdQadd01, slrdQadd02, slrdQadl01,
				slrdQadt01, slrdQadt02, slrdUserc01, slrdUserc02, slrdUserd01,
				slrdUseri01, slrdUserl01, slrdUsert01, slrdQadi01, oidSlrdDet);
	}

}
