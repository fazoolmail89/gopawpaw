package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CclCtrl entity. @author MyEclipse Persistence Tools
 */
public class CclCtrl extends AbstractCclCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CclCtrl() {
	}

	/** minimal constructor */
	public CclCtrl(Integer cclQadi01, Boolean cclContActive,
			Boolean cclLineActive, Boolean cclEditLcShipper,
			Boolean cclCcInvoice, Boolean cclLcInvoice, Boolean cclCcAsn,
			Boolean cclLcAsn, String cclChargeType, String cclModUserid,
			String cclUserc01, String cclUserc02, String cclQadc01,
			String cclQadc02, Double oidCclCtrl) {
		super(cclQadi01, cclContActive, cclLineActive, cclEditLcShipper,
				cclCcInvoice, cclLcInvoice, cclCcAsn, cclLcAsn, cclChargeType,
				cclModUserid, cclUserc01, cclUserc02, cclQadc01, cclQadc02,
				oidCclCtrl);
	}

	/** full constructor */
	public CclCtrl(Integer cclQadi01, Boolean cclContActive,
			Boolean cclLineActive, Boolean cclEditLcShipper,
			Boolean cclCcInvoice, Boolean cclLcInvoice, Boolean cclCcAsn,
			Boolean cclLcAsn, String cclChargeType, String cclModUserid,
			Date cclModDate, String cclUserc01, String cclUserc02,
			String cclQadc01, String cclQadc02, Double oidCclCtrl) {
		super(cclQadi01, cclContActive, cclLineActive, cclEditLcShipper,
				cclCcInvoice, cclLcInvoice, cclCcAsn, cclLcAsn, cclChargeType,
				cclModUserid, cclModDate, cclUserc01, cclUserc02, cclQadc01,
				cclQadc02, oidCclCtrl);
	}

}
