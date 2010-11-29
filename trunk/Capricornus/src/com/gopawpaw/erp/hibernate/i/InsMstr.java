package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * InsMstr entity. @author MyEclipse Persistence Tools
 */
public class InsMstr extends AbstractInsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public InsMstr() {
	}

	/** minimal constructor */
	public InsMstr(InsMstrId id, String insArAcct, String insArSub,
			String insArCc, String insBillTo, Integer insCmtindx,
			String insCrTerms, String insCurr, Boolean insFixed,
			Boolean insHold, String insHoldRmks, Double insInvAmt,
			String insInvNbr, Double insInvPct, String insInvType,
			Boolean insPrepayment, Boolean insReleased, String insRmks,
			String insSoNbr, String insUserid, Date insModDate,
			String insModUserid, Double oidInsMstr) {
		super(id, insArAcct, insArSub, insArCc, insBillTo, insCmtindx,
				insCrTerms, insCurr, insFixed, insHold, insHoldRmks, insInvAmt,
				insInvNbr, insInvPct, insInvType, insPrepayment, insReleased,
				insRmks, insSoNbr, insUserid, insModDate, insModUserid,
				oidInsMstr);
	}

	/** full constructor */
	public InsMstr(InsMstrId id, String insArAcct, String insArSub,
			String insArCc, String insBillTo, Integer insCmtindx,
			String insCrTerms, String insCurr, Boolean insFixed,
			Boolean insHold, String insHoldRmks, Double insInvAmt,
			Date insSchedDate, String insInvNbr, Double insInvPct,
			String insInvType, Date insOrdDate, Date insOrigDate,
			Boolean insPrepayment, Date insRelDate, Boolean insReleased,
			String insRmks, String insSoNbr, String insUserid, Date insModDate,
			String insModUserid, String insUser1, String insUser2,
			String insQadc01, Double insQadd01, Integer insQadi01,
			Boolean insQadl01, Date insQadt01, Double oidInsMstr) {
		super(id, insArAcct, insArSub, insArCc, insBillTo, insCmtindx,
				insCrTerms, insCurr, insFixed, insHold, insHoldRmks, insInvAmt,
				insSchedDate, insInvNbr, insInvPct, insInvType, insOrdDate,
				insOrigDate, insPrepayment, insRelDate, insReleased, insRmks,
				insSoNbr, insUserid, insModDate, insModUserid, insUser1,
				insUser2, insQadc01, insQadd01, insQadi01, insQadl01,
				insQadt01, oidInsMstr);
	}

}
