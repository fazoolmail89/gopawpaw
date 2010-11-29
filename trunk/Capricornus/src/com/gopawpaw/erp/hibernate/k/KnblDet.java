package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnblDet entity. @author MyEclipse Persistence Tools
 */
public class KnblDet extends AbstractKnblDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnblDet() {
	}

	/** minimal constructor */
	public KnblDet(KnblDetId id, Double knblKnbKeyid, String knblCardType,
			Boolean knblCalcMode, Double knblKanbanQuantity,
			Double knblOrderQty, Integer knblNumberOfCards,
			Double knblContSize, String knblContType, String knblTypeUserRef,
			String knblMinCycleCheck, Double knblMinCycleTime,
			Double knblMaxCycleTime, Boolean knblPrintQuantity,
			Boolean knblIdBarcode, Boolean knblItemBarcode,
			Boolean knblPrintConsumeRef, String knblCardPrintOption,
			Boolean knblRegenRequired, Boolean knblImpactInventory,
			Boolean knblBackflush, Double knblRepTime, Double knblFifoTime,
			Boolean knblDispatchList, Boolean knblFaxDispatchList,
			String knblSourceFax, String knblSourceFax2,
			Boolean knblEmailDispList, String knblSourceEmail,
			Boolean knblBlanketPo, String knblAccumType,
			Double knblIntervalTime, Double knblNextTime,
			String knblAccumSchedule, String knblAccumSchTime,
			Date knblModDate, String knblModUserid, String knblUser1,
			String knblUser2, String knblQadc01, String knblQadc02,
			Integer knblCardReporting, Double knblFractionalKanban,
			Integer knblCmtindx, Integer knblRunOutOption, Double oidKnblDet) {
		super(id, knblKnbKeyid, knblCardType, knblCalcMode, knblKanbanQuantity,
				knblOrderQty, knblNumberOfCards, knblContSize, knblContType,
				knblTypeUserRef, knblMinCycleCheck, knblMinCycleTime,
				knblMaxCycleTime, knblPrintQuantity, knblIdBarcode,
				knblItemBarcode, knblPrintConsumeRef, knblCardPrintOption,
				knblRegenRequired, knblImpactInventory, knblBackflush,
				knblRepTime, knblFifoTime, knblDispatchList,
				knblFaxDispatchList, knblSourceFax, knblSourceFax2,
				knblEmailDispList, knblSourceEmail, knblBlanketPo,
				knblAccumType, knblIntervalTime, knblNextTime,
				knblAccumSchedule, knblAccumSchTime, knblModDate,
				knblModUserid, knblUser1, knblUser2, knblQadc01, knblQadc02,
				knblCardReporting, knblFractionalKanban, knblCmtindx,
				knblRunOutOption, oidKnblDet);
	}

	/** full constructor */
	public KnblDet(KnblDetId id, Double knblKnbKeyid, String knblCardType,
			Boolean knblCalcMode, Double knblKanbanQuantity,
			Double knblOrderQty, Integer knblNumberOfCards,
			Double knblContSize, String knblContType, String knblTypeUserRef,
			String knblMinCycleCheck, Double knblMinCycleTime,
			Double knblMaxCycleTime, Boolean knblPrintQuantity,
			Boolean knblIdBarcode, Boolean knblItemBarcode,
			Boolean knblPrintConsumeRef, String knblCardPrintOption,
			Boolean knblRegenRequired, Boolean knblImpactInventory,
			Boolean knblBackflush, Double knblRepTime, Double knblFifoTime,
			Boolean knblDispatchList, Boolean knblFaxDispatchList,
			String knblSourceFax, String knblSourceFax2,
			Boolean knblEmailDispList, String knblSourceEmail,
			Boolean knblBlanketPo, String knblAccumType,
			Double knblIntervalTime, Date knblNextDate, Double knblNextTime,
			String knblAccumSchedule, String knblAccumSchTime,
			Date knblModDate, String knblModUserid, String knblUser1,
			String knblUser2, String knblQadc01, String knblQadc02,
			Integer knblCardReporting, Double knblFractionalKanban,
			Integer knblCmtindx, Integer knblRunOutOption, Double oidKnblDet) {
		super(id, knblKnbKeyid, knblCardType, knblCalcMode, knblKanbanQuantity,
				knblOrderQty, knblNumberOfCards, knblContSize, knblContType,
				knblTypeUserRef, knblMinCycleCheck, knblMinCycleTime,
				knblMaxCycleTime, knblPrintQuantity, knblIdBarcode,
				knblItemBarcode, knblPrintConsumeRef, knblCardPrintOption,
				knblRegenRequired, knblImpactInventory, knblBackflush,
				knblRepTime, knblFifoTime, knblDispatchList,
				knblFaxDispatchList, knblSourceFax, knblSourceFax2,
				knblEmailDispList, knblSourceEmail, knblBlanketPo,
				knblAccumType, knblIntervalTime, knblNextDate, knblNextTime,
				knblAccumSchedule, knblAccumSchTime, knblModDate,
				knblModUserid, knblUser1, knblUser2, knblQadc01, knblQadc02,
				knblCardReporting, knblFractionalKanban, knblCmtindx,
				knblRunOutOption, oidKnblDet);
	}

}
