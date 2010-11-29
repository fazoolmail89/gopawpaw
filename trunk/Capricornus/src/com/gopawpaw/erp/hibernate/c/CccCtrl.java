package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CccCtrl entity. @author MyEclipse Persistence Tools
 */
public class CccCtrl extends AbstractCccCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CccCtrl() {
	}

	/** minimal constructor */
	public CccCtrl(Integer cccQadi02, String cccCcAppserverName,
			String cccCcHoldStatus, Integer cccCcAuthExpDays,
			Boolean cccCcAutoCapture, String cccModUserid, Date cccModDate,
			Double oidCccCtrl) {
		super(cccQadi02, cccCcAppserverName, cccCcHoldStatus, cccCcAuthExpDays,
				cccCcAutoCapture, cccModUserid, cccModDate, oidCccCtrl);
	}

	/** full constructor */
	public CccCtrl(Integer cccQadi02, String cccCcAppserverName,
			String cccCcHoldStatus, Integer cccCcAuthExpDays,
			Boolean cccCcAutoCapture, String cccModUserid, Date cccModDate,
			String cccUser1, String cccUser2, String cccQadc01,
			Integer cccQadi01, Double cccQadd01, Boolean cccQadl01,
			Date cccQadt01, String cccQadc02, String cccQadc03,
			String cccQadc04, String cccQadc05, Double oidCccCtrl) {
		super(cccQadi02, cccCcAppserverName, cccCcHoldStatus, cccCcAuthExpDays,
				cccCcAutoCapture, cccModUserid, cccModDate, cccUser1, cccUser2,
				cccQadc01, cccQadi01, cccQadd01, cccQadl01, cccQadt01,
				cccQadc02, cccQadc03, cccQadc04, cccQadc05, oidCccCtrl);
	}

}
