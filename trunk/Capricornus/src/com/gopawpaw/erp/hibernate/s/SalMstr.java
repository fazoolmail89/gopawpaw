package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SalMstr entity. @author MyEclipse Persistence Tools
 */
public class SalMstr extends AbstractSalMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SalMstr() {
	}

	/** minimal constructor */
	public SalMstr(SalMstrId id, Double salBgPrice, Double oidSalMstr) {
		super(id, salBgPrice, oidSalMstr);
	}

	/** full constructor */
	public SalMstr(SalMstrId id, String salCode, Double salLimitAmt,
			Double salTotal, String salUser1, String salUser2,
			Double salBudget, Date salEnd, String salFcgCode,
			Boolean salQadl04, String salOvFcgCode, Double salPctCovered,
			Boolean salPerCall, String salChr01, String salChr02,
			String salChr03, String salChr04, Double salDec01, Double salDec02,
			Double salDec03, Date salDte01, Date salDte02, Date salDte03,
			Boolean salLog01, Boolean salLog02, Boolean salLog03,
			String salQadc01, String salQadc02, String salQadc03,
			String salQadc04, Date salQadd01, Date salQadd02, Date salQadd03,
			Double salQadde01, Double salQadde02, Double salQadde03,
			Boolean salQadl01, Boolean salQadl02, Boolean salQadl03,
			Double salUnpostedAmt, Double salListprLimit,
			Integer salCallsAllow, Integer salCallsTotal, String salModUserid,
			Date salModDate, Integer salSequence, Integer salDays,
			Date salFirstActivity, Date salLastActivity, Double salBgPrice,
			Double oidSalMstr) {
		super(id, salCode, salLimitAmt, salTotal, salUser1, salUser2,
				salBudget, salEnd, salFcgCode, salQadl04, salOvFcgCode,
				salPctCovered, salPerCall, salChr01, salChr02, salChr03,
				salChr04, salDec01, salDec02, salDec03, salDte01, salDte02,
				salDte03, salLog01, salLog02, salLog03, salQadc01, salQadc02,
				salQadc03, salQadc04, salQadd01, salQadd02, salQadd03,
				salQadde01, salQadde02, salQadde03, salQadl01, salQadl02,
				salQadl03, salUnpostedAmt, salListprLimit, salCallsAllow,
				salCallsTotal, salModUserid, salModDate, salSequence, salDays,
				salFirstActivity, salLastActivity, salBgPrice, oidSalMstr);
	}

}
