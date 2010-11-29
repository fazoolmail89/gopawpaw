package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RccMstr entity. @author MyEclipse Persistence Tools
 */
public class RccMstr extends AbstractRccMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RccMstr() {
	}

	/** minimal constructor */
	public RccMstr(RccMstrId id, Double oidRccMstr) {
		super(id, oidRccMstr);
	}

	/** full constructor */
	public RccMstr(RccMstrId id, Boolean rccIncInRss, Boolean rccPackingOrder,
			Boolean rccShipperPrint, Boolean rccInvoicePrint,
			Boolean rccAsnEdi, Boolean rccInvoiceEdi, Integer rccFirmSeqDays,
			Integer rccSeqPerContainer, Boolean rccMergeSeq,
			Boolean rccCheckSeqTol, Integer rccMaxTol, String rccModUserid,
			Date rccModDate, String rccModPgm, String rccUser1,
			String rccUser2, String rccQadc01, String rccQadc02,
			Double rccQadd01, Double rccQadd02, Integer rccQadi01,
			Integer rccQadi02, Boolean rccQadl01, Boolean rccQadl02,
			Boolean rccQadl03, Boolean rccQadl04, Date rccQadt01,
			Date rccQadt02, Double oidRccMstr) {
		super(id, rccIncInRss, rccPackingOrder, rccShipperPrint,
				rccInvoicePrint, rccAsnEdi, rccInvoiceEdi, rccFirmSeqDays,
				rccSeqPerContainer, rccMergeSeq, rccCheckSeqTol, rccMaxTol,
				rccModUserid, rccModDate, rccModPgm, rccUser1, rccUser2,
				rccQadc01, rccQadc02, rccQadd01, rccQadd02, rccQadi01,
				rccQadi02, rccQadl01, rccQadl02, rccQadl03, rccQadl04,
				rccQadt01, rccQadt02, oidRccMstr);
	}

}
