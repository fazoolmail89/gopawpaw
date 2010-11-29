package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PsMstr entity. @author MyEclipse Persistence Tools
 */
public class PsMstr extends AbstractPsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PsMstr() {
	}

	/** minimal constructor */
	public PsMstr(PsMstrId id, Double psQtyPer, Double psAssay,
			String psCommCode, String psCompUm, Double psUmConv,
			String psJointType, Double psCopQty, Double psCstPct,
			Double oidPsMstr) {
		super(id, psQtyPer, psAssay, psCommCode, psCompUm, psUmConv,
				psJointType, psCopQty, psCstPct, oidPsMstr);
	}

	/** full constructor */
	public PsMstr(PsMstrId id, Double psQtyPer, Double psScrpPct,
			String psPsCode, Integer psLtOff, Date psEnd, String psRmks,
			Integer psOp, Integer psItemNo, Boolean psMandatory,
			Boolean psExclusive, String psProcess, String psQtyType,
			String psUser1, String psUser2, Double psFcstPct,
			Boolean psDefault, String psGroup, Boolean psCritical,
			Double psQtyPerB, Double psAssay, String psCommCode,
			String psCompUm, Double psUmConv, String psUserid, Date psModDate,
			Boolean psQad01, Boolean psNonBal, Double psBatchPct,
			Integer psCmtindx, String psStartEcn, String psEndEcn,
			String psJointType, Double psCopQty, Double psCstPct,
			Double psProdPct, Double psQtyCons, Double psQtyExch,
			Double psQtyDiag, String psChr01, String psChr02, Date psDte01,
			Date psDte02, Double psDec01, Double psDec02, Boolean psLog01,
			Boolean psLog02, String psQadc01, String psQadc02, Date psQadt01,
			Date psQadt02, Date psQadt03, Double psQadd01, Double psQadd02,
			Boolean psQadl01, Boolean psQadl02, Double oidPsMstr) {
		super(id, psQtyPer, psScrpPct, psPsCode, psLtOff, psEnd, psRmks, psOp,
				psItemNo, psMandatory, psExclusive, psProcess, psQtyType,
				psUser1, psUser2, psFcstPct, psDefault, psGroup, psCritical,
				psQtyPerB, psAssay, psCommCode, psCompUm, psUmConv, psUserid,
				psModDate, psQad01, psNonBal, psBatchPct, psCmtindx,
				psStartEcn, psEndEcn, psJointType, psCopQty, psCstPct,
				psProdPct, psQtyCons, psQtyExch, psQtyDiag, psChr01, psChr02,
				psDte01, psDte02, psDec01, psDec02, psLog01, psLog02, psQadc01,
				psQadc02, psQadt01, psQadt02, psQadt03, psQadd01, psQadd02,
				psQadl01, psQadl02, oidPsMstr);
	}

}
