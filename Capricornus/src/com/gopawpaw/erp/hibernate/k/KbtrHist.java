package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KbtrHist entity. @author MyEclipse Persistence Tools
 */
public class KbtrHist extends AbstractKbtrHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KbtrHist() {
	}

	/** minimal constructor */
	public KbtrHist(KbtrHistId id, Date kbtrTransDate, Integer kbtrTransTime,
			Integer kbtrId, String kbtrPart, String kbtrSuppSource,
			String kbtrSuppRef, String kbtrConsSource, String kbtrConsRef,
			String kbtrMode, String kbtrTransType, Double kbtrTransQty,
			Double kbtrKanbanQuantity, String kbtrPattern, Double kbtrDemandHr,
			Double kbtrRepTime, Double kbtrContSize, String kbtrContType,
			Boolean kbtrLoop, Boolean kbtrCalcMode, Integer kbtrCards,
			String kbtrCardType, Double kbtrSafetyStock, Double kbtrVarFactor,
			Integer kbtrCardNbr, Integer kbtrPrintTime, Boolean kbtrBackflush,
			String kbtrVend, String kbtrPoNbr, String kbtrType,
			Double kbtrBatchSize, String kbtrProductionLine,
			Boolean kbtrImpactInventory, Integer kbtrMaxCycleTime,
			String kbtrMinCycleCheck, Integer kbtrMinCycleTime,
			String kbtrModUserid, Date kbtrModDate, String kbtrUser1,
			String kbtrUser2, Double kbtrUserd01, Integer kbtrUseri01,
			Boolean kbtrUserl01, String kbtrQadc01, String kbtrQadc02,
			String kbtrQadc03, Double kbtrQadd01, Integer kbtrQadi01,
			Boolean kbtrQadl01, Double kbtrLotSize, String kbtrPouSite,
			String kbtrPouRef, String kbtrTransactionEvent,
			Double kbtrDailyDemand, Double kbtrLeadTime,
			Integer kbtrNumberOfCards, String kbtrTypeUserRef,
			Double kbtrOrderQty, Integer kbtrStep, String kbtrSourceType,
			String kbtrSourceRef1, String kbtrSourceRef2,
			String kbtrSourceRef3, String kbtrSourceRef4,
			String kbtrSourceRef5, String kbtrSupermarketId,
			String kbtrSupermarketSite, String kbtrLoopType,
			String kbtrSourceApp, String kbtrCurrProcessId, Double oidKbtrHist) {
		super(id, kbtrTransDate, kbtrTransTime, kbtrId, kbtrPart,
				kbtrSuppSource, kbtrSuppRef, kbtrConsSource, kbtrConsRef,
				kbtrMode, kbtrTransType, kbtrTransQty, kbtrKanbanQuantity,
				kbtrPattern, kbtrDemandHr, kbtrRepTime, kbtrContSize,
				kbtrContType, kbtrLoop, kbtrCalcMode, kbtrCards, kbtrCardType,
				kbtrSafetyStock, kbtrVarFactor, kbtrCardNbr, kbtrPrintTime,
				kbtrBackflush, kbtrVend, kbtrPoNbr, kbtrType, kbtrBatchSize,
				kbtrProductionLine, kbtrImpactInventory, kbtrMaxCycleTime,
				kbtrMinCycleCheck, kbtrMinCycleTime, kbtrModUserid,
				kbtrModDate, kbtrUser1, kbtrUser2, kbtrUserd01, kbtrUseri01,
				kbtrUserl01, kbtrQadc01, kbtrQadc02, kbtrQadc03, kbtrQadd01,
				kbtrQadi01, kbtrQadl01, kbtrLotSize, kbtrPouSite, kbtrPouRef,
				kbtrTransactionEvent, kbtrDailyDemand, kbtrLeadTime,
				kbtrNumberOfCards, kbtrTypeUserRef, kbtrOrderQty, kbtrStep,
				kbtrSourceType, kbtrSourceRef1, kbtrSourceRef2, kbtrSourceRef3,
				kbtrSourceRef4, kbtrSourceRef5, kbtrSupermarketId,
				kbtrSupermarketSite, kbtrLoopType, kbtrSourceApp,
				kbtrCurrProcessId, oidKbtrHist);
	}

	/** full constructor */
	public KbtrHist(KbtrHistId id, Date kbtrTransDate, Integer kbtrTransTime,
			Date kbtrEffDate, Integer kbtrId, String kbtrPart,
			String kbtrSuppSource, String kbtrSuppRef, String kbtrConsSource,
			String kbtrConsRef, String kbtrMode, String kbtrTransType,
			Double kbtrTransQty, Double kbtrKanbanQuantity, String kbtrPattern,
			Double kbtrDemandHr, Double kbtrRepTime, Double kbtrContSize,
			String kbtrContType, Boolean kbtrLoop, Boolean kbtrCalcMode,
			Integer kbtrCards, String kbtrCardType, Double kbtrSafetyStock,
			Double kbtrVarFactor, Integer kbtrCardNbr, Date kbtrCalcDate,
			Date kbtrPrintDate, Integer kbtrPrintTime, Boolean kbtrBackflush,
			String kbtrVend, String kbtrPoNbr, String kbtrType,
			Double kbtrBatchSize, String kbtrProductionLine,
			Boolean kbtrImpactInventory, Integer kbtrMaxCycleTime,
			String kbtrMinCycleCheck, Integer kbtrMinCycleTime,
			Date kbtrDispListDate, String kbtrModUserid, Date kbtrModDate,
			String kbtrUser1, String kbtrUser2, Double kbtrUserd01,
			Integer kbtrUseri01, Boolean kbtrUserl01, Date kbtrUsert01,
			String kbtrQadc01, String kbtrQadc02, String kbtrQadc03,
			Double kbtrQadd01, Integer kbtrQadi01, Boolean kbtrQadl01,
			Date kbtrQadt01, Double kbtrLotSize, String kbtrPouSite,
			String kbtrPouRef, String kbtrTransactionEvent,
			Double kbtrDailyDemand, Double kbtrLeadTime,
			Integer kbtrNumberOfCards, String kbtrTypeUserRef,
			Double kbtrOrderQty, Integer kbtrStep, String kbtrSourceType,
			String kbtrSourceRef1, String kbtrSourceRef2,
			String kbtrSourceRef3, String kbtrSourceRef4,
			String kbtrSourceRef5, String kbtrSupermarketId,
			String kbtrSupermarketSite, String kbtrLoopType,
			String kbtrSourceApp, String kbtrCurrProcessId, Double oidKbtrHist) {
		super(id, kbtrTransDate, kbtrTransTime, kbtrEffDate, kbtrId, kbtrPart,
				kbtrSuppSource, kbtrSuppRef, kbtrConsSource, kbtrConsRef,
				kbtrMode, kbtrTransType, kbtrTransQty, kbtrKanbanQuantity,
				kbtrPattern, kbtrDemandHr, kbtrRepTime, kbtrContSize,
				kbtrContType, kbtrLoop, kbtrCalcMode, kbtrCards, kbtrCardType,
				kbtrSafetyStock, kbtrVarFactor, kbtrCardNbr, kbtrCalcDate,
				kbtrPrintDate, kbtrPrintTime, kbtrBackflush, kbtrVend,
				kbtrPoNbr, kbtrType, kbtrBatchSize, kbtrProductionLine,
				kbtrImpactInventory, kbtrMaxCycleTime, kbtrMinCycleCheck,
				kbtrMinCycleTime, kbtrDispListDate, kbtrModUserid, kbtrModDate,
				kbtrUser1, kbtrUser2, kbtrUserd01, kbtrUseri01, kbtrUserl01,
				kbtrUsert01, kbtrQadc01, kbtrQadc02, kbtrQadc03, kbtrQadd01,
				kbtrQadi01, kbtrQadl01, kbtrQadt01, kbtrLotSize, kbtrPouSite,
				kbtrPouRef, kbtrTransactionEvent, kbtrDailyDemand,
				kbtrLeadTime, kbtrNumberOfCards, kbtrTypeUserRef, kbtrOrderQty,
				kbtrStep, kbtrSourceType, kbtrSourceRef1, kbtrSourceRef2,
				kbtrSourceRef3, kbtrSourceRef4, kbtrSourceRef5,
				kbtrSupermarketId, kbtrSupermarketSite, kbtrLoopType,
				kbtrSourceApp, kbtrCurrProcessId, oidKbtrHist);
	}

}
