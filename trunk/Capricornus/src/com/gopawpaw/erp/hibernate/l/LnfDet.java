package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LnfDet entity. @author MyEclipse Persistence Tools
 */
public class LnfDet extends AbstractLnfDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LnfDet() {
	}

	/** minimal constructor */
	public LnfDet(LnfDetId id, Integer lnfPreference, String lnfModUserid,
			Date lnfModDate, String lnfUser1, String lnfUser2,
			String lnfUserc03, Double lnfUserd01, Integer lnfUseri01,
			Boolean lnfUserl01, String lnfQadc01, String lnfQadc02,
			String lnfQadc03, Double lnfQadd01, Integer lnfQadi01,
			Boolean lnfQadl01, Double oidLnfDet) {
		super(id, lnfPreference, lnfModUserid, lnfModDate, lnfUser1, lnfUser2,
				lnfUserc03, lnfUserd01, lnfUseri01, lnfUserl01, lnfQadc01,
				lnfQadc02, lnfQadc03, lnfQadd01, lnfQadi01, lnfQadl01,
				oidLnfDet);
	}

	/** full constructor */
	public LnfDet(LnfDetId id, Integer lnfPreference, String lnfModUserid,
			Date lnfModDate, String lnfUser1, String lnfUser2,
			String lnfUserc03, Double lnfUserd01, Integer lnfUseri01,
			Boolean lnfUserl01, Date lnfUsert01, String lnfQadc01,
			String lnfQadc02, String lnfQadc03, Double lnfQadd01,
			Integer lnfQadi01, Boolean lnfQadl01, Date lnfQadt01,
			Double oidLnfDet) {
		super(id, lnfPreference, lnfModUserid, lnfModDate, lnfUser1, lnfUser2,
				lnfUserc03, lnfUserd01, lnfUseri01, lnfUserl01, lnfUsert01,
				lnfQadc01, lnfQadc02, lnfQadc03, lnfQadd01, lnfQadi01,
				lnfQadl01, lnfQadt01, oidLnfDet);
	}

}
