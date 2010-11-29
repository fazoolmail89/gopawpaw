package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsMstr entity. @author MyEclipse Persistence Tools
 */
public class EsMstr extends AbstractEsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsMstr() {
	}

	/** minimal constructor */
	public EsMstr(EsMstrId id, Double oidEsMstr) {
		super(id, oidEsMstr);
	}

	/** full constructor */
	public EsMstr(EsMstrId id, String esCaCategory, String esTimeIn,
			Integer esDaysIn, Integer esCaPri, Boolean esEscalate,
			String esGroup, Boolean esMessage, Boolean esPrint,
			Integer esPriBump, Boolean esPage, Integer esCmtindx,
			String esDesc, String esNextQue, String esNextStatus,
			String esProgram, String esEscProgram, String esUser1,
			String esUser2, String esChr01, String esChr02, String esChr03,
			String esChr04, Double esDec01, Double esDec02, Double esDec03,
			Date esDte01, Date esDte02, Date esDte03, Boolean esLog01,
			Boolean esLog02, Boolean esLog03, String esQadc01, String esQadc02,
			String esQadc03, String esQadc04, Date esQadd01, Date esQadd02,
			Date esQadd03, Double esQadde01, Double esQadde02,
			Double esQadde03, Boolean esQadl01, Boolean esQadl02,
			Boolean esQadl03, String esMessageList, String esDocDesc,
			String esDocExec, Date esDueDate, Boolean esDocsPrinted,
			String esDocPrinted, String esRepairStep, String esEsNbr,
			Date esActDate, String esDocPrintit, Date esInitialDate,
			String esDocPrinter, String esDocPaged, Double oidEsMstr) {
		super(id, esCaCategory, esTimeIn, esDaysIn, esCaPri, esEscalate,
				esGroup, esMessage, esPrint, esPriBump, esPage, esCmtindx,
				esDesc, esNextQue, esNextStatus, esProgram, esEscProgram,
				esUser1, esUser2, esChr01, esChr02, esChr03, esChr04, esDec01,
				esDec02, esDec03, esDte01, esDte02, esDte03, esLog01, esLog02,
				esLog03, esQadc01, esQadc02, esQadc03, esQadc04, esQadd01,
				esQadd02, esQadd03, esQadde01, esQadde02, esQadde03, esQadl01,
				esQadl02, esQadl03, esMessageList, esDocDesc, esDocExec,
				esDueDate, esDocsPrinted, esDocPrinted, esRepairStep, esEsNbr,
				esActDate, esDocPrintit, esInitialDate, esDocPrinter,
				esDocPaged, oidEsMstr);
	}

}
