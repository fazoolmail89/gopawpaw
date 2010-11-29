package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RcfCtrl entity. @author MyEclipse Persistence Tools
 */
public class RcfCtrl extends AbstractRcfCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RcfCtrl() {
	}

	/** minimal constructor */
	public RcfCtrl(Double oidRcfCtrl) {
		super(oidRcfCtrl);
	}

	/** full constructor */
	public RcfCtrl(Integer rcfQadi03, Boolean rcfActive, Boolean rcfIncInRss,
			Boolean rcfSchDefault, Boolean rcfPackingOrder,
			Boolean rcfShipperPrint, Boolean rcfInvoicePrint,
			Boolean rcfAsnEdi, Boolean rcfInvoiceEdi, Integer rcfFirmSeqDays,
			Integer rcfSeqPerContainer, Boolean rcfMergeSeq,
			Boolean rcfCheckSeqTol, Integer rcfMaxTol, String rcfModUserid,
			Date rcfModDate, String rcfModPgm, String rcfUser1,
			String rcfUser2, String rcfQadc01, String rcfQadc02,
			Double rcfQadd01, Double rcfQadd02, Integer rcfQadi01,
			Integer rcfQadi02, Boolean rcfQadl01, Boolean rcfQadl02,
			Boolean rcfQadl03, Boolean rcfQadl04, Date rcfQadt01,
			Date rcfQadt02, Double oidRcfCtrl) {
		super(rcfQadi03, rcfActive, rcfIncInRss, rcfSchDefault,
				rcfPackingOrder, rcfShipperPrint, rcfInvoicePrint, rcfAsnEdi,
				rcfInvoiceEdi, rcfFirmSeqDays, rcfSeqPerContainer, rcfMergeSeq,
				rcfCheckSeqTol, rcfMaxTol, rcfModUserid, rcfModDate, rcfModPgm,
				rcfUser1, rcfUser2, rcfQadc01, rcfQadc02, rcfQadd01, rcfQadd02,
				rcfQadi01, rcfQadi02, rcfQadl01, rcfQadl02, rcfQadl03,
				rcfQadl04, rcfQadt01, rcfQadt02, oidRcfCtrl);
	}

}
