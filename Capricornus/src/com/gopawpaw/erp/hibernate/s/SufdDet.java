package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SufdDet entity. @author MyEclipse Persistence Tools
 */
public class SufdDet extends AbstractSufdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SufdDet() {
	}

	/** minimal constructor */
	public SufdDet(SufdDetId id, String sufdAbsFldName, String sufdFldName,
			String sufdFldValue, Boolean sufdFldPrompt, String sufdValidate,
			String sufdModUserid, String sufdUserc01, String sufdUserc02,
			String sufdQadc01, String sufdQadc02, Double oidSufdDet) {
		super(id, sufdAbsFldName, sufdFldName, sufdFldValue, sufdFldPrompt,
				sufdValidate, sufdModUserid, sufdUserc01, sufdUserc02,
				sufdQadc01, sufdQadc02, oidSufdDet);
	}

	/** full constructor */
	public SufdDet(SufdDetId id, String sufdAbsFldName, String sufdFldName,
			String sufdFldValue, Boolean sufdFldPrompt, String sufdValidate,
			String sufdModUserid, Date sufdModDate, String sufdUserc01,
			String sufdUserc02, String sufdQadc01, String sufdQadc02,
			Double oidSufdDet) {
		super(id, sufdAbsFldName, sufdFldName, sufdFldValue, sufdFldPrompt,
				sufdValidate, sufdModUserid, sufdModDate, sufdUserc01,
				sufdUserc02, sufdQadc01, sufdQadc02, oidSufdDet);
	}

}
