package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CnsuMstr entity. @author MyEclipse Persistence Tools
 */
public class CnsuMstr extends AbstractCnsuMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CnsuMstr() {
	}

	/** full constructor */
	public CnsuMstr(CnsuMstrId id, Integer cnsuBatch, Date cnsuTransDate,
			Date cnsuEffDate, String cnsuPoNbr, Integer cnsuPodLine,
			String cnsuSite, String cnsuPart, Double cnsuQtyUsed,
			Double cnsuCumQty, String cnsuLotser, String cnsuRef,
			Integer cnsuTrnbr, Boolean cnsuPrintFlag, Boolean cnsuExportFlag,
			String cnsuModUserid, Date cnsuModDate, String cnsuUser1,
			String cnsuUser2, String cnsuQadc01, String cnsuQadc02,
			String cnsuEdiBatch, Double oidCnsuMstr) {
		super(id, cnsuBatch, cnsuTransDate, cnsuEffDate, cnsuPoNbr,
				cnsuPodLine, cnsuSite, cnsuPart, cnsuQtyUsed, cnsuCumQty,
				cnsuLotser, cnsuRef, cnsuTrnbr, cnsuPrintFlag, cnsuExportFlag,
				cnsuModUserid, cnsuModDate, cnsuUser1, cnsuUser2, cnsuQadc01,
				cnsuQadc02, cnsuEdiBatch, oidCnsuMstr);
	}

}
