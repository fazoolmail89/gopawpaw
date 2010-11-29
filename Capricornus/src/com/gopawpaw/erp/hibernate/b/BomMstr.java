package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BomMstr entity. @author MyEclipse Persistence Tools
 */
public class BomMstr extends AbstractBomMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BomMstr() {
	}

	/** minimal constructor */
	public BomMstr(BomMstrId id, String bomBatchUm, String bomMthd,
			Double oidBomMstr) {
		super(id, bomBatchUm, bomMthd, oidBomMstr);
	}

	/** full constructor */
	public BomMstr(BomMstrId id, String bomDesc, Double bomBatch,
			String bomBatchUm, Integer bomCmtindx, Integer bomLlCode,
			String bomUser1, String bomUser2, String bomUserid,
			Date bomModDate, String bomChr01, String bomChr02, String bomChr03,
			String bomChr04, String bomChr05, Date bomDte01, Date bomDte02,
			Double bomDec01, Double bomDec02, Boolean bomLog01,
			Boolean bomFormula, String bomMthd, String bomFsmType,
			String bomSite, String bomLoc, String bomQadc01, String bomQadc02,
			String bomQadc03, Double bomQadd01, Integer bomQadi01,
			Integer bomQadi02, Date bomQadt01, Date bomQadt02,
			Boolean bomQadl01, Boolean bomQadl02, String bomMthdQtycompl,
			Double oidBomMstr) {
		super(id, bomDesc, bomBatch, bomBatchUm, bomCmtindx, bomLlCode,
				bomUser1, bomUser2, bomUserid, bomModDate, bomChr01, bomChr02,
				bomChr03, bomChr04, bomChr05, bomDte01, bomDte02, bomDec01,
				bomDec02, bomLog01, bomFormula, bomMthd, bomFsmType, bomSite,
				bomLoc, bomQadc01, bomQadc02, bomQadc03, bomQadd01, bomQadi01,
				bomQadi02, bomQadt01, bomQadt02, bomQadl01, bomQadl02,
				bomMthdQtycompl, oidBomMstr);
	}

}
