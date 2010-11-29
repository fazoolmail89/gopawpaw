package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CahHist entity. @author MyEclipse Persistence Tools
 */
public class CahHist extends AbstractCahHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CahHist() {
	}

	/** minimal constructor */
	public CahHist(CahHistId id, Double oidCahHist) {
		super(id, oidCahHist);
	}

	/** full constructor */
	public CahHist(CahHistId id, Date cahNxtDate, String cahQue,
			String cahAssign, String cahEnterBy, String cahStatus,
			String cahType, String cahPart, String cahSerial, String cahNxtAct,
			String cahName, String cahPhone, String cahProblem, Integer cahPri,
			String cahDesc, Date cahEvtDate, Integer cahCmtindx,
			String cahSvCode, String cahChr01, String cahChr02,
			String cahChr03, String cahChr04, String cahChr05, Double cahDec01,
			String cahChr06, String cahChr07, String cahChr08, String cahChr09,
			String cahChr10, Date cahDte01, Date cahDte02, Date cahDte03,
			Date cahDte04, Date cahDte05, Double cahDec02, Double cahDec03,
			Boolean cahLog01, Boolean cahLog02, Boolean cahLog03,
			Boolean cahLog04, Boolean cahLog05, String cahArea,
			Integer cahTrvDist, String cahTrvUm, String cahFromQue,
			Date cahSntDate, Integer cahSntTime, String cahCode,
			String cahEvtTime, String cahNxtTime, Double cahTimeLog,
			Boolean cahBilled, String cahResolve, String cahSeverity,
			String cahUser1, String cahUser2, String cahCategory,
			Boolean cahCmmtMod, Date cahDateStmp, String cahEngArea,
			String cahEngGroup, String cahEscalate, String cahEsNbr,
			Integer cahEsSeq, String cahEuNbr, String cahIntType,
			Integer cahRef, String cahTimeStmp, String cahChr11,
			String cahContract, Date cahEuDate, String cahEuTime,
			String cahQadc01, String cahQadc02, String cahQadc03,
			Double cahQadd01, Double cahQadd02, Double cahQadd03,
			Integer cahQadi01, Integer cahQadi02, Integer cahQadi03,
			Boolean cahQadl01, Boolean cahQadl02, Boolean cahQadl03,
			Date cahQadt01, Date cahQadt02, Date cahQadt03, Double oidCahHist) {
		super(id, cahNxtDate, cahQue, cahAssign, cahEnterBy, cahStatus,
				cahType, cahPart, cahSerial, cahNxtAct, cahName, cahPhone,
				cahProblem, cahPri, cahDesc, cahEvtDate, cahCmtindx, cahSvCode,
				cahChr01, cahChr02, cahChr03, cahChr04, cahChr05, cahDec01,
				cahChr06, cahChr07, cahChr08, cahChr09, cahChr10, cahDte01,
				cahDte02, cahDte03, cahDte04, cahDte05, cahDec02, cahDec03,
				cahLog01, cahLog02, cahLog03, cahLog04, cahLog05, cahArea,
				cahTrvDist, cahTrvUm, cahFromQue, cahSntDate, cahSntTime,
				cahCode, cahEvtTime, cahNxtTime, cahTimeLog, cahBilled,
				cahResolve, cahSeverity, cahUser1, cahUser2, cahCategory,
				cahCmmtMod, cahDateStmp, cahEngArea, cahEngGroup, cahEscalate,
				cahEsNbr, cahEsSeq, cahEuNbr, cahIntType, cahRef, cahTimeStmp,
				cahChr11, cahContract, cahEuDate, cahEuTime, cahQadc01,
				cahQadc02, cahQadc03, cahQadd01, cahQadd02, cahQadd03,
				cahQadi01, cahQadi02, cahQadi03, cahQadl01, cahQadl02,
				cahQadl03, cahQadt01, cahQadt02, cahQadt03, oidCahHist);
	}

}
