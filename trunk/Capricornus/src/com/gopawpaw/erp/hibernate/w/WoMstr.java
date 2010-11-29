package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WoMstr entity. @author MyEclipse Persistence Tools
 */
public class WoMstr extends AbstractWoMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WoMstr() {
	}

	/** minimal constructor */
	public WoMstr(WoMstrId id, String woFsmType, Double woMyldVar,
			String woBatch, String woRef, String woStatCloseUserid,
			String woAppOwner, Double oidWoMstr) {
		super(id, woFsmType, woMyldVar, woBatch, woRef, woStatCloseUserid,
				woAppOwner, oidWoMstr);
	}

	/** full constructor */
	public WoMstr(WoMstrId id, String woSoJob, Date woOrdDate, Date woRelDate,
			Date woDueDate, Date woPerDate, String woPart, String woType,
			Double woQtyOrd, Double woQtyComp, Double woQtyRjct,
			String woStatus, String woVend, String woRmks, Double woQtyChg,
			Double woRjctChg, Double woBoChg, Double woYieldPct, String woRev,
			String woAcct, String woCc, String woQad01, String woLotPrev,
			String woSchdType, Integer woCmtindx, String woProject,
			Integer woLeadTime, Double woWipTot, Double woLbrTot,
			Double woMtlTot, Double woBdnTot, Double woSubTot, String woUser1,
			String woUser2, Double woOvhTot, String woLoc, String woSerial,
			String woRouting, String woBomCode, String woSite,
			Double woQueueEff, String woDraw, Boolean woLbrUp, Boolean woBdnUp,
			Boolean woGlLbr, Boolean woGlBdn, String woChr01, String woChr02,
			String woChr03, String woChr04, String woChr05, Date woDte01,
			Date woDte02, Double woDec01, Double woDec02, Boolean woLog01,
			String woLine, Boolean woVar, Double woMtlVar, Double woLbrVar,
			Double woBdnVar, Double woSubVar, String woMvarAcct,
			String woMvarCc, String woMvrrAcct, String woMvrrCc,
			String woSvarAcct, String woSvarCc, String woSvrrAcct,
			String woSvrrCc, String woFlrAcct, String woFlrCc, Double woDec03,
			Double woRjctTot, Double woMthdVar, Double woRvalTot,
			Boolean woAcctClose, Date woCloseDate, Date woCloseEff,
			String woFsmType, String woXvarAcct, String woXvarCc,
			Double woMyldVar, String woJointType, Double woProdPct,
			String woQtyType, Double woDec04, String woBaseId,
			Double woUnitCost, Double woMixVar, Double woBdnTotx,
			Double woLbrTotx, Double woMtlTotx, Double woSubTotx,
			Double woOvhTotx, String woBatch, Double woAssay, String woGrade,
			Date woExpire, String woRctstat, String woLotNext,
			Boolean woLotRcpt, Boolean woRctstatActive, String woCaIntType,
			Date woDatePosted, String woIssSite, Integer woItmLine,
			String woQadc01, String woQadc02, String woQadc03, Date woQadt01,
			Date woQadt02, Double woQade01, Double woQade02, Double woQade03,
			Integer woQadi01, Integer woQadi02, Boolean woQadl01,
			Boolean woQadl02, String woEngCode, String woSub, String woFlrSub,
			String woMvarSub, String woMvrrSub, String woSvarSub,
			String woSvrrSub, String woXvarSub, String woRef,
			Date woRecordDate, Date woStatCloseDate, String woStatCloseUserid,
			String woAppOwner, Double oidWoMstr) {
		super(id, woSoJob, woOrdDate, woRelDate, woDueDate, woPerDate, woPart,
				woType, woQtyOrd, woQtyComp, woQtyRjct, woStatus, woVend,
				woRmks, woQtyChg, woRjctChg, woBoChg, woYieldPct, woRev,
				woAcct, woCc, woQad01, woLotPrev, woSchdType, woCmtindx,
				woProject, woLeadTime, woWipTot, woLbrTot, woMtlTot, woBdnTot,
				woSubTot, woUser1, woUser2, woOvhTot, woLoc, woSerial,
				woRouting, woBomCode, woSite, woQueueEff, woDraw, woLbrUp,
				woBdnUp, woGlLbr, woGlBdn, woChr01, woChr02, woChr03, woChr04,
				woChr05, woDte01, woDte02, woDec01, woDec02, woLog01, woLine,
				woVar, woMtlVar, woLbrVar, woBdnVar, woSubVar, woMvarAcct,
				woMvarCc, woMvrrAcct, woMvrrCc, woSvarAcct, woSvarCc,
				woSvrrAcct, woSvrrCc, woFlrAcct, woFlrCc, woDec03, woRjctTot,
				woMthdVar, woRvalTot, woAcctClose, woCloseDate, woCloseEff,
				woFsmType, woXvarAcct, woXvarCc, woMyldVar, woJointType,
				woProdPct, woQtyType, woDec04, woBaseId, woUnitCost, woMixVar,
				woBdnTotx, woLbrTotx, woMtlTotx, woSubTotx, woOvhTotx, woBatch,
				woAssay, woGrade, woExpire, woRctstat, woLotNext, woLotRcpt,
				woRctstatActive, woCaIntType, woDatePosted, woIssSite,
				woItmLine, woQadc01, woQadc02, woQadc03, woQadt01, woQadt02,
				woQade01, woQade02, woQade03, woQadi01, woQadi02, woQadl01,
				woQadl02, woEngCode, woSub, woFlrSub, woMvarSub, woMvrrSub,
				woSvarSub, woSvrrSub, woXvarSub, woRef, woRecordDate,
				woStatCloseDate, woStatCloseUserid, woAppOwner, oidWoMstr);
	}

}
