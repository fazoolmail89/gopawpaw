package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PccCtrl entity. @author MyEclipse Persistence Tools
 */
public class PccCtrl extends AbstractPccCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PccCtrl() {
	}

	/** minimal constructor */
	public PccCtrl(Integer pccQadi01, Boolean pccAutoNbr, String pccCmmtType,
			Boolean pccSecurityOn, Integer pccMaxWkfl, Boolean pccStructOk,
			Boolean pccRoutingOk, Boolean pccQspecOk, Boolean pccQualityOk,
			String pccCommLang, String pccPcoPre, String pccNextPco,
			Integer pccDbSeq, Boolean pccFormulaOk, Boolean pccProcessOk,
			Double oidPccCtrl, Boolean pccEnforceSeq) {
		super(pccQadi01, pccAutoNbr, pccCmmtType, pccSecurityOn, pccMaxWkfl,
				pccStructOk, pccRoutingOk, pccQspecOk, pccQualityOk,
				pccCommLang, pccPcoPre, pccNextPco, pccDbSeq, pccFormulaOk,
				pccProcessOk, oidPccCtrl, pccEnforceSeq);
	}

	/** full constructor */
	public PccCtrl(Integer pccQadi01, Boolean pccAutoNbr, String pccCmmtType,
			Boolean pccSecurityOn, Integer pccMaxWkfl, Boolean pccStructOk,
			Boolean pccRoutingOk, Boolean pccQspecOk, Boolean pccQualityOk,
			Date pccInitialDate, Date pccEcooffDate, String pccCommLang,
			String pccPcoPre, String pccNextPco, Integer pccDbSeq,
			String pccUser1, String pccUser2, String pccQadc01,
			Boolean pccFormulaOk, Boolean pccProcessOk, Double oidPccCtrl,
			Boolean pccEnforceSeq) {
		super(pccQadi01, pccAutoNbr, pccCmmtType, pccSecurityOn, pccMaxWkfl,
				pccStructOk, pccRoutingOk, pccQspecOk, pccQualityOk,
				pccInitialDate, pccEcooffDate, pccCommLang, pccPcoPre,
				pccNextPco, pccDbSeq, pccUser1, pccUser2, pccQadc01,
				pccFormulaOk, pccProcessOk, oidPccCtrl, pccEnforceSeq);
	}

}
