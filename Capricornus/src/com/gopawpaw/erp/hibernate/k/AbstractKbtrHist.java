package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKbtrHist entity provides the base persistence definition of the
 * KbtrHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbtrHist implements java.io.Serializable {

	// Fields

	private KbtrHistId id;
	private Date kbtrTransDate;
	private Integer kbtrTransTime;
	private Date kbtrEffDate;
	private Integer kbtrId;
	private String kbtrPart;
	private String kbtrSuppSource;
	private String kbtrSuppRef;
	private String kbtrConsSource;
	private String kbtrConsRef;
	private String kbtrMode;
	private String kbtrTransType;
	private Double kbtrTransQty;
	private Double kbtrKanbanQuantity;
	private String kbtrPattern;
	private Double kbtrDemandHr;
	private Double kbtrRepTime;
	private Double kbtrContSize;
	private String kbtrContType;
	private Boolean kbtrLoop;
	private Boolean kbtrCalcMode;
	private Integer kbtrCards;
	private String kbtrCardType;
	private Double kbtrSafetyStock;
	private Double kbtrVarFactor;
	private Integer kbtrCardNbr;
	private Date kbtrCalcDate;
	private Date kbtrPrintDate;
	private Integer kbtrPrintTime;
	private Boolean kbtrBackflush;
	private String kbtrVend;
	private String kbtrPoNbr;
	private String kbtrType;
	private Double kbtrBatchSize;
	private String kbtrProductionLine;
	private Boolean kbtrImpactInventory;
	private Integer kbtrMaxCycleTime;
	private String kbtrMinCycleCheck;
	private Integer kbtrMinCycleTime;
	private Date kbtrDispListDate;
	private String kbtrModUserid;
	private Date kbtrModDate;
	private String kbtrUser1;
	private String kbtrUser2;
	private Double kbtrUserd01;
	private Integer kbtrUseri01;
	private Boolean kbtrUserl01;
	private Date kbtrUsert01;
	private String kbtrQadc01;
	private String kbtrQadc02;
	private String kbtrQadc03;
	private Double kbtrQadd01;
	private Integer kbtrQadi01;
	private Boolean kbtrQadl01;
	private Date kbtrQadt01;
	private Double kbtrLotSize;
	private String kbtrPouSite;
	private String kbtrPouRef;
	private String kbtrTransactionEvent;
	private Double kbtrDailyDemand;
	private Double kbtrLeadTime;
	private Integer kbtrNumberOfCards;
	private String kbtrTypeUserRef;
	private Double kbtrOrderQty;
	private Integer kbtrStep;
	private String kbtrSourceType;
	private String kbtrSourceRef1;
	private String kbtrSourceRef2;
	private String kbtrSourceRef3;
	private String kbtrSourceRef4;
	private String kbtrSourceRef5;
	private String kbtrSupermarketId;
	private String kbtrSupermarketSite;
	private String kbtrLoopType;
	private String kbtrSourceApp;
	private String kbtrCurrProcessId;
	private Double oidKbtrHist;

	// Constructors

	/** default constructor */
	public AbstractKbtrHist() {
	}

	/** minimal constructor */
	public AbstractKbtrHist(KbtrHistId id, Date kbtrTransDate,
			Integer kbtrTransTime, Integer kbtrId, String kbtrPart,
			String kbtrSuppSource, String kbtrSuppRef, String kbtrConsSource,
			String kbtrConsRef, String kbtrMode, String kbtrTransType,
			Double kbtrTransQty, Double kbtrKanbanQuantity, String kbtrPattern,
			Double kbtrDemandHr, Double kbtrRepTime, Double kbtrContSize,
			String kbtrContType, Boolean kbtrLoop, Boolean kbtrCalcMode,
			Integer kbtrCards, String kbtrCardType, Double kbtrSafetyStock,
			Double kbtrVarFactor, Integer kbtrCardNbr, Integer kbtrPrintTime,
			Boolean kbtrBackflush, String kbtrVend, String kbtrPoNbr,
			String kbtrType, Double kbtrBatchSize, String kbtrProductionLine,
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
		this.id = id;
		this.kbtrTransDate = kbtrTransDate;
		this.kbtrTransTime = kbtrTransTime;
		this.kbtrId = kbtrId;
		this.kbtrPart = kbtrPart;
		this.kbtrSuppSource = kbtrSuppSource;
		this.kbtrSuppRef = kbtrSuppRef;
		this.kbtrConsSource = kbtrConsSource;
		this.kbtrConsRef = kbtrConsRef;
		this.kbtrMode = kbtrMode;
		this.kbtrTransType = kbtrTransType;
		this.kbtrTransQty = kbtrTransQty;
		this.kbtrKanbanQuantity = kbtrKanbanQuantity;
		this.kbtrPattern = kbtrPattern;
		this.kbtrDemandHr = kbtrDemandHr;
		this.kbtrRepTime = kbtrRepTime;
		this.kbtrContSize = kbtrContSize;
		this.kbtrContType = kbtrContType;
		this.kbtrLoop = kbtrLoop;
		this.kbtrCalcMode = kbtrCalcMode;
		this.kbtrCards = kbtrCards;
		this.kbtrCardType = kbtrCardType;
		this.kbtrSafetyStock = kbtrSafetyStock;
		this.kbtrVarFactor = kbtrVarFactor;
		this.kbtrCardNbr = kbtrCardNbr;
		this.kbtrPrintTime = kbtrPrintTime;
		this.kbtrBackflush = kbtrBackflush;
		this.kbtrVend = kbtrVend;
		this.kbtrPoNbr = kbtrPoNbr;
		this.kbtrType = kbtrType;
		this.kbtrBatchSize = kbtrBatchSize;
		this.kbtrProductionLine = kbtrProductionLine;
		this.kbtrImpactInventory = kbtrImpactInventory;
		this.kbtrMaxCycleTime = kbtrMaxCycleTime;
		this.kbtrMinCycleCheck = kbtrMinCycleCheck;
		this.kbtrMinCycleTime = kbtrMinCycleTime;
		this.kbtrModUserid = kbtrModUserid;
		this.kbtrModDate = kbtrModDate;
		this.kbtrUser1 = kbtrUser1;
		this.kbtrUser2 = kbtrUser2;
		this.kbtrUserd01 = kbtrUserd01;
		this.kbtrUseri01 = kbtrUseri01;
		this.kbtrUserl01 = kbtrUserl01;
		this.kbtrQadc01 = kbtrQadc01;
		this.kbtrQadc02 = kbtrQadc02;
		this.kbtrQadc03 = kbtrQadc03;
		this.kbtrQadd01 = kbtrQadd01;
		this.kbtrQadi01 = kbtrQadi01;
		this.kbtrQadl01 = kbtrQadl01;
		this.kbtrLotSize = kbtrLotSize;
		this.kbtrPouSite = kbtrPouSite;
		this.kbtrPouRef = kbtrPouRef;
		this.kbtrTransactionEvent = kbtrTransactionEvent;
		this.kbtrDailyDemand = kbtrDailyDemand;
		this.kbtrLeadTime = kbtrLeadTime;
		this.kbtrNumberOfCards = kbtrNumberOfCards;
		this.kbtrTypeUserRef = kbtrTypeUserRef;
		this.kbtrOrderQty = kbtrOrderQty;
		this.kbtrStep = kbtrStep;
		this.kbtrSourceType = kbtrSourceType;
		this.kbtrSourceRef1 = kbtrSourceRef1;
		this.kbtrSourceRef2 = kbtrSourceRef2;
		this.kbtrSourceRef3 = kbtrSourceRef3;
		this.kbtrSourceRef4 = kbtrSourceRef4;
		this.kbtrSourceRef5 = kbtrSourceRef5;
		this.kbtrSupermarketId = kbtrSupermarketId;
		this.kbtrSupermarketSite = kbtrSupermarketSite;
		this.kbtrLoopType = kbtrLoopType;
		this.kbtrSourceApp = kbtrSourceApp;
		this.kbtrCurrProcessId = kbtrCurrProcessId;
		this.oidKbtrHist = oidKbtrHist;
	}

	/** full constructor */
	public AbstractKbtrHist(KbtrHistId id, Date kbtrTransDate,
			Integer kbtrTransTime, Date kbtrEffDate, Integer kbtrId,
			String kbtrPart, String kbtrSuppSource, String kbtrSuppRef,
			String kbtrConsSource, String kbtrConsRef, String kbtrMode,
			String kbtrTransType, Double kbtrTransQty,
			Double kbtrKanbanQuantity, String kbtrPattern, Double kbtrDemandHr,
			Double kbtrRepTime, Double kbtrContSize, String kbtrContType,
			Boolean kbtrLoop, Boolean kbtrCalcMode, Integer kbtrCards,
			String kbtrCardType, Double kbtrSafetyStock, Double kbtrVarFactor,
			Integer kbtrCardNbr, Date kbtrCalcDate, Date kbtrPrintDate,
			Integer kbtrPrintTime, Boolean kbtrBackflush, String kbtrVend,
			String kbtrPoNbr, String kbtrType, Double kbtrBatchSize,
			String kbtrProductionLine, Boolean kbtrImpactInventory,
			Integer kbtrMaxCycleTime, String kbtrMinCycleCheck,
			Integer kbtrMinCycleTime, Date kbtrDispListDate,
			String kbtrModUserid, Date kbtrModDate, String kbtrUser1,
			String kbtrUser2, Double kbtrUserd01, Integer kbtrUseri01,
			Boolean kbtrUserl01, Date kbtrUsert01, String kbtrQadc01,
			String kbtrQadc02, String kbtrQadc03, Double kbtrQadd01,
			Integer kbtrQadi01, Boolean kbtrQadl01, Date kbtrQadt01,
			Double kbtrLotSize, String kbtrPouSite, String kbtrPouRef,
			String kbtrTransactionEvent, Double kbtrDailyDemand,
			Double kbtrLeadTime, Integer kbtrNumberOfCards,
			String kbtrTypeUserRef, Double kbtrOrderQty, Integer kbtrStep,
			String kbtrSourceType, String kbtrSourceRef1,
			String kbtrSourceRef2, String kbtrSourceRef3,
			String kbtrSourceRef4, String kbtrSourceRef5,
			String kbtrSupermarketId, String kbtrSupermarketSite,
			String kbtrLoopType, String kbtrSourceApp,
			String kbtrCurrProcessId, Double oidKbtrHist) {
		this.id = id;
		this.kbtrTransDate = kbtrTransDate;
		this.kbtrTransTime = kbtrTransTime;
		this.kbtrEffDate = kbtrEffDate;
		this.kbtrId = kbtrId;
		this.kbtrPart = kbtrPart;
		this.kbtrSuppSource = kbtrSuppSource;
		this.kbtrSuppRef = kbtrSuppRef;
		this.kbtrConsSource = kbtrConsSource;
		this.kbtrConsRef = kbtrConsRef;
		this.kbtrMode = kbtrMode;
		this.kbtrTransType = kbtrTransType;
		this.kbtrTransQty = kbtrTransQty;
		this.kbtrKanbanQuantity = kbtrKanbanQuantity;
		this.kbtrPattern = kbtrPattern;
		this.kbtrDemandHr = kbtrDemandHr;
		this.kbtrRepTime = kbtrRepTime;
		this.kbtrContSize = kbtrContSize;
		this.kbtrContType = kbtrContType;
		this.kbtrLoop = kbtrLoop;
		this.kbtrCalcMode = kbtrCalcMode;
		this.kbtrCards = kbtrCards;
		this.kbtrCardType = kbtrCardType;
		this.kbtrSafetyStock = kbtrSafetyStock;
		this.kbtrVarFactor = kbtrVarFactor;
		this.kbtrCardNbr = kbtrCardNbr;
		this.kbtrCalcDate = kbtrCalcDate;
		this.kbtrPrintDate = kbtrPrintDate;
		this.kbtrPrintTime = kbtrPrintTime;
		this.kbtrBackflush = kbtrBackflush;
		this.kbtrVend = kbtrVend;
		this.kbtrPoNbr = kbtrPoNbr;
		this.kbtrType = kbtrType;
		this.kbtrBatchSize = kbtrBatchSize;
		this.kbtrProductionLine = kbtrProductionLine;
		this.kbtrImpactInventory = kbtrImpactInventory;
		this.kbtrMaxCycleTime = kbtrMaxCycleTime;
		this.kbtrMinCycleCheck = kbtrMinCycleCheck;
		this.kbtrMinCycleTime = kbtrMinCycleTime;
		this.kbtrDispListDate = kbtrDispListDate;
		this.kbtrModUserid = kbtrModUserid;
		this.kbtrModDate = kbtrModDate;
		this.kbtrUser1 = kbtrUser1;
		this.kbtrUser2 = kbtrUser2;
		this.kbtrUserd01 = kbtrUserd01;
		this.kbtrUseri01 = kbtrUseri01;
		this.kbtrUserl01 = kbtrUserl01;
		this.kbtrUsert01 = kbtrUsert01;
		this.kbtrQadc01 = kbtrQadc01;
		this.kbtrQadc02 = kbtrQadc02;
		this.kbtrQadc03 = kbtrQadc03;
		this.kbtrQadd01 = kbtrQadd01;
		this.kbtrQadi01 = kbtrQadi01;
		this.kbtrQadl01 = kbtrQadl01;
		this.kbtrQadt01 = kbtrQadt01;
		this.kbtrLotSize = kbtrLotSize;
		this.kbtrPouSite = kbtrPouSite;
		this.kbtrPouRef = kbtrPouRef;
		this.kbtrTransactionEvent = kbtrTransactionEvent;
		this.kbtrDailyDemand = kbtrDailyDemand;
		this.kbtrLeadTime = kbtrLeadTime;
		this.kbtrNumberOfCards = kbtrNumberOfCards;
		this.kbtrTypeUserRef = kbtrTypeUserRef;
		this.kbtrOrderQty = kbtrOrderQty;
		this.kbtrStep = kbtrStep;
		this.kbtrSourceType = kbtrSourceType;
		this.kbtrSourceRef1 = kbtrSourceRef1;
		this.kbtrSourceRef2 = kbtrSourceRef2;
		this.kbtrSourceRef3 = kbtrSourceRef3;
		this.kbtrSourceRef4 = kbtrSourceRef4;
		this.kbtrSourceRef5 = kbtrSourceRef5;
		this.kbtrSupermarketId = kbtrSupermarketId;
		this.kbtrSupermarketSite = kbtrSupermarketSite;
		this.kbtrLoopType = kbtrLoopType;
		this.kbtrSourceApp = kbtrSourceApp;
		this.kbtrCurrProcessId = kbtrCurrProcessId;
		this.oidKbtrHist = oidKbtrHist;
	}

	// Property accessors

	public KbtrHistId getId() {
		return this.id;
	}

	public void setId(KbtrHistId id) {
		this.id = id;
	}

	public Date getKbtrTransDate() {
		return this.kbtrTransDate;
	}

	public void setKbtrTransDate(Date kbtrTransDate) {
		this.kbtrTransDate = kbtrTransDate;
	}

	public Integer getKbtrTransTime() {
		return this.kbtrTransTime;
	}

	public void setKbtrTransTime(Integer kbtrTransTime) {
		this.kbtrTransTime = kbtrTransTime;
	}

	public Date getKbtrEffDate() {
		return this.kbtrEffDate;
	}

	public void setKbtrEffDate(Date kbtrEffDate) {
		this.kbtrEffDate = kbtrEffDate;
	}

	public Integer getKbtrId() {
		return this.kbtrId;
	}

	public void setKbtrId(Integer kbtrId) {
		this.kbtrId = kbtrId;
	}

	public String getKbtrPart() {
		return this.kbtrPart;
	}

	public void setKbtrPart(String kbtrPart) {
		this.kbtrPart = kbtrPart;
	}

	public String getKbtrSuppSource() {
		return this.kbtrSuppSource;
	}

	public void setKbtrSuppSource(String kbtrSuppSource) {
		this.kbtrSuppSource = kbtrSuppSource;
	}

	public String getKbtrSuppRef() {
		return this.kbtrSuppRef;
	}

	public void setKbtrSuppRef(String kbtrSuppRef) {
		this.kbtrSuppRef = kbtrSuppRef;
	}

	public String getKbtrConsSource() {
		return this.kbtrConsSource;
	}

	public void setKbtrConsSource(String kbtrConsSource) {
		this.kbtrConsSource = kbtrConsSource;
	}

	public String getKbtrConsRef() {
		return this.kbtrConsRef;
	}

	public void setKbtrConsRef(String kbtrConsRef) {
		this.kbtrConsRef = kbtrConsRef;
	}

	public String getKbtrMode() {
		return this.kbtrMode;
	}

	public void setKbtrMode(String kbtrMode) {
		this.kbtrMode = kbtrMode;
	}

	public String getKbtrTransType() {
		return this.kbtrTransType;
	}

	public void setKbtrTransType(String kbtrTransType) {
		this.kbtrTransType = kbtrTransType;
	}

	public Double getKbtrTransQty() {
		return this.kbtrTransQty;
	}

	public void setKbtrTransQty(Double kbtrTransQty) {
		this.kbtrTransQty = kbtrTransQty;
	}

	public Double getKbtrKanbanQuantity() {
		return this.kbtrKanbanQuantity;
	}

	public void setKbtrKanbanQuantity(Double kbtrKanbanQuantity) {
		this.kbtrKanbanQuantity = kbtrKanbanQuantity;
	}

	public String getKbtrPattern() {
		return this.kbtrPattern;
	}

	public void setKbtrPattern(String kbtrPattern) {
		this.kbtrPattern = kbtrPattern;
	}

	public Double getKbtrDemandHr() {
		return this.kbtrDemandHr;
	}

	public void setKbtrDemandHr(Double kbtrDemandHr) {
		this.kbtrDemandHr = kbtrDemandHr;
	}

	public Double getKbtrRepTime() {
		return this.kbtrRepTime;
	}

	public void setKbtrRepTime(Double kbtrRepTime) {
		this.kbtrRepTime = kbtrRepTime;
	}

	public Double getKbtrContSize() {
		return this.kbtrContSize;
	}

	public void setKbtrContSize(Double kbtrContSize) {
		this.kbtrContSize = kbtrContSize;
	}

	public String getKbtrContType() {
		return this.kbtrContType;
	}

	public void setKbtrContType(String kbtrContType) {
		this.kbtrContType = kbtrContType;
	}

	public Boolean getKbtrLoop() {
		return this.kbtrLoop;
	}

	public void setKbtrLoop(Boolean kbtrLoop) {
		this.kbtrLoop = kbtrLoop;
	}

	public Boolean getKbtrCalcMode() {
		return this.kbtrCalcMode;
	}

	public void setKbtrCalcMode(Boolean kbtrCalcMode) {
		this.kbtrCalcMode = kbtrCalcMode;
	}

	public Integer getKbtrCards() {
		return this.kbtrCards;
	}

	public void setKbtrCards(Integer kbtrCards) {
		this.kbtrCards = kbtrCards;
	}

	public String getKbtrCardType() {
		return this.kbtrCardType;
	}

	public void setKbtrCardType(String kbtrCardType) {
		this.kbtrCardType = kbtrCardType;
	}

	public Double getKbtrSafetyStock() {
		return this.kbtrSafetyStock;
	}

	public void setKbtrSafetyStock(Double kbtrSafetyStock) {
		this.kbtrSafetyStock = kbtrSafetyStock;
	}

	public Double getKbtrVarFactor() {
		return this.kbtrVarFactor;
	}

	public void setKbtrVarFactor(Double kbtrVarFactor) {
		this.kbtrVarFactor = kbtrVarFactor;
	}

	public Integer getKbtrCardNbr() {
		return this.kbtrCardNbr;
	}

	public void setKbtrCardNbr(Integer kbtrCardNbr) {
		this.kbtrCardNbr = kbtrCardNbr;
	}

	public Date getKbtrCalcDate() {
		return this.kbtrCalcDate;
	}

	public void setKbtrCalcDate(Date kbtrCalcDate) {
		this.kbtrCalcDate = kbtrCalcDate;
	}

	public Date getKbtrPrintDate() {
		return this.kbtrPrintDate;
	}

	public void setKbtrPrintDate(Date kbtrPrintDate) {
		this.kbtrPrintDate = kbtrPrintDate;
	}

	public Integer getKbtrPrintTime() {
		return this.kbtrPrintTime;
	}

	public void setKbtrPrintTime(Integer kbtrPrintTime) {
		this.kbtrPrintTime = kbtrPrintTime;
	}

	public Boolean getKbtrBackflush() {
		return this.kbtrBackflush;
	}

	public void setKbtrBackflush(Boolean kbtrBackflush) {
		this.kbtrBackflush = kbtrBackflush;
	}

	public String getKbtrVend() {
		return this.kbtrVend;
	}

	public void setKbtrVend(String kbtrVend) {
		this.kbtrVend = kbtrVend;
	}

	public String getKbtrPoNbr() {
		return this.kbtrPoNbr;
	}

	public void setKbtrPoNbr(String kbtrPoNbr) {
		this.kbtrPoNbr = kbtrPoNbr;
	}

	public String getKbtrType() {
		return this.kbtrType;
	}

	public void setKbtrType(String kbtrType) {
		this.kbtrType = kbtrType;
	}

	public Double getKbtrBatchSize() {
		return this.kbtrBatchSize;
	}

	public void setKbtrBatchSize(Double kbtrBatchSize) {
		this.kbtrBatchSize = kbtrBatchSize;
	}

	public String getKbtrProductionLine() {
		return this.kbtrProductionLine;
	}

	public void setKbtrProductionLine(String kbtrProductionLine) {
		this.kbtrProductionLine = kbtrProductionLine;
	}

	public Boolean getKbtrImpactInventory() {
		return this.kbtrImpactInventory;
	}

	public void setKbtrImpactInventory(Boolean kbtrImpactInventory) {
		this.kbtrImpactInventory = kbtrImpactInventory;
	}

	public Integer getKbtrMaxCycleTime() {
		return this.kbtrMaxCycleTime;
	}

	public void setKbtrMaxCycleTime(Integer kbtrMaxCycleTime) {
		this.kbtrMaxCycleTime = kbtrMaxCycleTime;
	}

	public String getKbtrMinCycleCheck() {
		return this.kbtrMinCycleCheck;
	}

	public void setKbtrMinCycleCheck(String kbtrMinCycleCheck) {
		this.kbtrMinCycleCheck = kbtrMinCycleCheck;
	}

	public Integer getKbtrMinCycleTime() {
		return this.kbtrMinCycleTime;
	}

	public void setKbtrMinCycleTime(Integer kbtrMinCycleTime) {
		this.kbtrMinCycleTime = kbtrMinCycleTime;
	}

	public Date getKbtrDispListDate() {
		return this.kbtrDispListDate;
	}

	public void setKbtrDispListDate(Date kbtrDispListDate) {
		this.kbtrDispListDate = kbtrDispListDate;
	}

	public String getKbtrModUserid() {
		return this.kbtrModUserid;
	}

	public void setKbtrModUserid(String kbtrModUserid) {
		this.kbtrModUserid = kbtrModUserid;
	}

	public Date getKbtrModDate() {
		return this.kbtrModDate;
	}

	public void setKbtrModDate(Date kbtrModDate) {
		this.kbtrModDate = kbtrModDate;
	}

	public String getKbtrUser1() {
		return this.kbtrUser1;
	}

	public void setKbtrUser1(String kbtrUser1) {
		this.kbtrUser1 = kbtrUser1;
	}

	public String getKbtrUser2() {
		return this.kbtrUser2;
	}

	public void setKbtrUser2(String kbtrUser2) {
		this.kbtrUser2 = kbtrUser2;
	}

	public Double getKbtrUserd01() {
		return this.kbtrUserd01;
	}

	public void setKbtrUserd01(Double kbtrUserd01) {
		this.kbtrUserd01 = kbtrUserd01;
	}

	public Integer getKbtrUseri01() {
		return this.kbtrUseri01;
	}

	public void setKbtrUseri01(Integer kbtrUseri01) {
		this.kbtrUseri01 = kbtrUseri01;
	}

	public Boolean getKbtrUserl01() {
		return this.kbtrUserl01;
	}

	public void setKbtrUserl01(Boolean kbtrUserl01) {
		this.kbtrUserl01 = kbtrUserl01;
	}

	public Date getKbtrUsert01() {
		return this.kbtrUsert01;
	}

	public void setKbtrUsert01(Date kbtrUsert01) {
		this.kbtrUsert01 = kbtrUsert01;
	}

	public String getKbtrQadc01() {
		return this.kbtrQadc01;
	}

	public void setKbtrQadc01(String kbtrQadc01) {
		this.kbtrQadc01 = kbtrQadc01;
	}

	public String getKbtrQadc02() {
		return this.kbtrQadc02;
	}

	public void setKbtrQadc02(String kbtrQadc02) {
		this.kbtrQadc02 = kbtrQadc02;
	}

	public String getKbtrQadc03() {
		return this.kbtrQadc03;
	}

	public void setKbtrQadc03(String kbtrQadc03) {
		this.kbtrQadc03 = kbtrQadc03;
	}

	public Double getKbtrQadd01() {
		return this.kbtrQadd01;
	}

	public void setKbtrQadd01(Double kbtrQadd01) {
		this.kbtrQadd01 = kbtrQadd01;
	}

	public Integer getKbtrQadi01() {
		return this.kbtrQadi01;
	}

	public void setKbtrQadi01(Integer kbtrQadi01) {
		this.kbtrQadi01 = kbtrQadi01;
	}

	public Boolean getKbtrQadl01() {
		return this.kbtrQadl01;
	}

	public void setKbtrQadl01(Boolean kbtrQadl01) {
		this.kbtrQadl01 = kbtrQadl01;
	}

	public Date getKbtrQadt01() {
		return this.kbtrQadt01;
	}

	public void setKbtrQadt01(Date kbtrQadt01) {
		this.kbtrQadt01 = kbtrQadt01;
	}

	public Double getKbtrLotSize() {
		return this.kbtrLotSize;
	}

	public void setKbtrLotSize(Double kbtrLotSize) {
		this.kbtrLotSize = kbtrLotSize;
	}

	public String getKbtrPouSite() {
		return this.kbtrPouSite;
	}

	public void setKbtrPouSite(String kbtrPouSite) {
		this.kbtrPouSite = kbtrPouSite;
	}

	public String getKbtrPouRef() {
		return this.kbtrPouRef;
	}

	public void setKbtrPouRef(String kbtrPouRef) {
		this.kbtrPouRef = kbtrPouRef;
	}

	public String getKbtrTransactionEvent() {
		return this.kbtrTransactionEvent;
	}

	public void setKbtrTransactionEvent(String kbtrTransactionEvent) {
		this.kbtrTransactionEvent = kbtrTransactionEvent;
	}

	public Double getKbtrDailyDemand() {
		return this.kbtrDailyDemand;
	}

	public void setKbtrDailyDemand(Double kbtrDailyDemand) {
		this.kbtrDailyDemand = kbtrDailyDemand;
	}

	public Double getKbtrLeadTime() {
		return this.kbtrLeadTime;
	}

	public void setKbtrLeadTime(Double kbtrLeadTime) {
		this.kbtrLeadTime = kbtrLeadTime;
	}

	public Integer getKbtrNumberOfCards() {
		return this.kbtrNumberOfCards;
	}

	public void setKbtrNumberOfCards(Integer kbtrNumberOfCards) {
		this.kbtrNumberOfCards = kbtrNumberOfCards;
	}

	public String getKbtrTypeUserRef() {
		return this.kbtrTypeUserRef;
	}

	public void setKbtrTypeUserRef(String kbtrTypeUserRef) {
		this.kbtrTypeUserRef = kbtrTypeUserRef;
	}

	public Double getKbtrOrderQty() {
		return this.kbtrOrderQty;
	}

	public void setKbtrOrderQty(Double kbtrOrderQty) {
		this.kbtrOrderQty = kbtrOrderQty;
	}

	public Integer getKbtrStep() {
		return this.kbtrStep;
	}

	public void setKbtrStep(Integer kbtrStep) {
		this.kbtrStep = kbtrStep;
	}

	public String getKbtrSourceType() {
		return this.kbtrSourceType;
	}

	public void setKbtrSourceType(String kbtrSourceType) {
		this.kbtrSourceType = kbtrSourceType;
	}

	public String getKbtrSourceRef1() {
		return this.kbtrSourceRef1;
	}

	public void setKbtrSourceRef1(String kbtrSourceRef1) {
		this.kbtrSourceRef1 = kbtrSourceRef1;
	}

	public String getKbtrSourceRef2() {
		return this.kbtrSourceRef2;
	}

	public void setKbtrSourceRef2(String kbtrSourceRef2) {
		this.kbtrSourceRef2 = kbtrSourceRef2;
	}

	public String getKbtrSourceRef3() {
		return this.kbtrSourceRef3;
	}

	public void setKbtrSourceRef3(String kbtrSourceRef3) {
		this.kbtrSourceRef3 = kbtrSourceRef3;
	}

	public String getKbtrSourceRef4() {
		return this.kbtrSourceRef4;
	}

	public void setKbtrSourceRef4(String kbtrSourceRef4) {
		this.kbtrSourceRef4 = kbtrSourceRef4;
	}

	public String getKbtrSourceRef5() {
		return this.kbtrSourceRef5;
	}

	public void setKbtrSourceRef5(String kbtrSourceRef5) {
		this.kbtrSourceRef5 = kbtrSourceRef5;
	}

	public String getKbtrSupermarketId() {
		return this.kbtrSupermarketId;
	}

	public void setKbtrSupermarketId(String kbtrSupermarketId) {
		this.kbtrSupermarketId = kbtrSupermarketId;
	}

	public String getKbtrSupermarketSite() {
		return this.kbtrSupermarketSite;
	}

	public void setKbtrSupermarketSite(String kbtrSupermarketSite) {
		this.kbtrSupermarketSite = kbtrSupermarketSite;
	}

	public String getKbtrLoopType() {
		return this.kbtrLoopType;
	}

	public void setKbtrLoopType(String kbtrLoopType) {
		this.kbtrLoopType = kbtrLoopType;
	}

	public String getKbtrSourceApp() {
		return this.kbtrSourceApp;
	}

	public void setKbtrSourceApp(String kbtrSourceApp) {
		this.kbtrSourceApp = kbtrSourceApp;
	}

	public String getKbtrCurrProcessId() {
		return this.kbtrCurrProcessId;
	}

	public void setKbtrCurrProcessId(String kbtrCurrProcessId) {
		this.kbtrCurrProcessId = kbtrCurrProcessId;
	}

	public Double getOidKbtrHist() {
		return this.oidKbtrHist;
	}

	public void setOidKbtrHist(Double oidKbtrHist) {
		this.oidKbtrHist = oidKbtrHist;
	}

}