package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SroMstr entity. @author MyEclipse Persistence Tools
 */
public class SroMstr extends AbstractSroMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SroMstr() {
	}

	/** minimal constructor */
	public SroMstr(SroMstrId id, Double oidSroMstr) {
		super(id, oidSroMstr);
	}

	/** full constructor */
	public SroMstr(SroMstrId id, String sroCust, String sroShip,
			String sroTaken, String sroAssign, Date sroEntDate,
			Date sroClsDate, String sroType, String sroStatus,
			String sroCrTerms, String sroShipvia, String sroPo, String sroRga,
			String sroAuthor, Boolean sroPrintRg, Boolean sroPrintPl,
			String sroDspstn, String sroPart, String sroDesc, String sroSerial,
			String sroRev, Boolean sroWrrnty, String sroFailure1,
			String sroFailure2, String sroFailure3, String sroFailure4,
			String sroFailure5, String sroRepair1, String sroRepair2,
			String sroRepair3, String sroRepair4, String sroRepair5,
			String sroCmmt, Double sroFrt, Double sroServChg,
			Double sroDiscPct, Double sroSpecChg, String sroTaxPct,
			Double sroPrepaid, Boolean sroToInv, Boolean sroInvoiced,
			String sroQadc05, String sroQadc06, Date sroInvDate,
			Date sroShpDate, Boolean sroClosed, Date sroDueDate,
			String sroUser1, String sroUser2, Double sroQty,
			Integer sroCmtindx, String sroChr01, String sroChr02,
			String sroChr03, String sroChr04, String sroChr05, Date sroDte01,
			Date sroDte02, Double sroDec01, Double sroDec02, Boolean sroLog01,
			Double oidSroMstr) {
		super(id, sroCust, sroShip, sroTaken, sroAssign, sroEntDate,
				sroClsDate, sroType, sroStatus, sroCrTerms, sroShipvia, sroPo,
				sroRga, sroAuthor, sroPrintRg, sroPrintPl, sroDspstn, sroPart,
				sroDesc, sroSerial, sroRev, sroWrrnty, sroFailure1,
				sroFailure2, sroFailure3, sroFailure4, sroFailure5, sroRepair1,
				sroRepair2, sroRepair3, sroRepair4, sroRepair5, sroCmmt,
				sroFrt, sroServChg, sroDiscPct, sroSpecChg, sroTaxPct,
				sroPrepaid, sroToInv, sroInvoiced, sroQadc05, sroQadc06,
				sroInvDate, sroShpDate, sroClosed, sroDueDate, sroUser1,
				sroUser2, sroQty, sroCmtindx, sroChr01, sroChr02, sroChr03,
				sroChr04, sroChr05, sroDte01, sroDte02, sroDec01, sroDec02,
				sroLog01, oidSroMstr);
	}

}
