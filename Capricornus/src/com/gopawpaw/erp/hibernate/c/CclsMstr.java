package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CclsMstr entity. @author MyEclipse Persistence Tools
 */
public class CclsMstr extends AbstractCclsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CclsMstr() {
	}

	/** full constructor */
	public CclsMstr(CclsMstrId id, Boolean cclsEditLcShipper,
			Boolean cclsCcInvoice, Boolean cclsLcInvoice, Boolean cclsCcAsn,
			Boolean cclsLcAsn, String cclsChargeType, String cclsModUserid,
			Date cclsModDate, String cclsUserc01, String cclsUserc02,
			String cclsQadc01, String cclsQadc02, Double oidCclsMstr) {
		super(id, cclsEditLcShipper, cclsCcInvoice, cclsLcInvoice, cclsCcAsn,
				cclsLcAsn, cclsChargeType, cclsModUserid, cclsModDate,
				cclsUserc01, cclsUserc02, cclsQadc01, cclsQadc02, oidCclsMstr);
	}

}
