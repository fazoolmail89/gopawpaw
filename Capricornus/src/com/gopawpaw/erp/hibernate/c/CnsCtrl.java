package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CnsCtrl entity. @author MyEclipse Persistence Tools
 */
public class CnsCtrl extends AbstractCnsCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CnsCtrl() {
	}

	/** full constructor */
	public CnsCtrl(Integer cnsQadi01, Boolean cnsActive,
			Boolean cnsConsignFlag, Integer cnsMaxAgingDays,
			String cnsPickingLogic, String cnsTransferOwnership,
			String cnsModUserid, Date cnsModDate, String cnsUser1,
			String cnsUser2, String cnsQadc01, String cnsQadc02,
			Double oidCnsCtrl) {
		super(cnsQadi01, cnsActive, cnsConsignFlag, cnsMaxAgingDays,
				cnsPickingLogic, cnsTransferOwnership, cnsModUserid,
				cnsModDate, cnsUser1, cnsUser2, cnsQadc01, cnsQadc02,
				oidCnsCtrl);
	}

}
