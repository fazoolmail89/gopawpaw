package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FlcrhHist entity. @author MyEclipse Persistence Tools
 */
public class FlcrhHist extends AbstractFlcrhHist implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlcrhHist() {
	}

	/** minimal constructor */
	public FlcrhHist(FlcrhHistId id, String flcrhRateCode,
			Boolean flcrhEntryMode, String flcrhModUserid, Date flcrhModDate,
			String flcrhUser1, String flcrhUser2, String flcrhUserc03,
			Double flcrhUserd01, Integer flcrhUseri01, Boolean flcrhUserl01,
			String flcrhQadc01, String flcrhQadc02, String flcrhQadc03,
			Double flcrhQadd01, Integer flcrhQadi01, Boolean flcrhQadl01,
			Double oidFlcrhHist) {
		super(id, flcrhRateCode, flcrhEntryMode, flcrhModUserid, flcrhModDate,
				flcrhUser1, flcrhUser2, flcrhUserc03, flcrhUserd01,
				flcrhUseri01, flcrhUserl01, flcrhQadc01, flcrhQadc02,
				flcrhQadc03, flcrhQadd01, flcrhQadi01, flcrhQadl01,
				oidFlcrhHist);
	}

	/** full constructor */
	public FlcrhHist(FlcrhHistId id, String flcrhRateCode,
			Boolean flcrhEntryMode, String flcrhModUserid, Date flcrhModDate,
			String flcrhUser1, String flcrhUser2, String flcrhUserc03,
			Double flcrhUserd01, Integer flcrhUseri01, Boolean flcrhUserl01,
			Date flcrhUsert01, String flcrhQadc01, String flcrhQadc02,
			String flcrhQadc03, Double flcrhQadd01, Integer flcrhQadi01,
			Boolean flcrhQadl01, Date flcrhQadt01, Double oidFlcrhHist) {
		super(id, flcrhRateCode, flcrhEntryMode, flcrhModUserid, flcrhModDate,
				flcrhUser1, flcrhUser2, flcrhUserc03, flcrhUserd01,
				flcrhUseri01, flcrhUserl01, flcrhUsert01, flcrhQadc01,
				flcrhQadc02, flcrhQadc03, flcrhQadd01, flcrhQadi01,
				flcrhQadl01, flcrhQadt01, oidFlcrhHist);
	}

}
