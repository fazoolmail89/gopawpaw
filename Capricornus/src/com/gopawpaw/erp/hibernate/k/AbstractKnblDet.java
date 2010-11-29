package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnblDet entity provides the base persistence definition of the
 * KnblDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnblDet implements java.io.Serializable {

	// Fields

	private KnblDetId id;
	private Double knblKnbKeyid;
	private String knblCardType;
	private Boolean knblCalcMode;
	private Double knblKanbanQuantity;
	private Double knblOrderQty;
	private Integer knblNumberOfCards;
	private Double knblContSize;
	private String knblContType;
	private String knblTypeUserRef;
	private String knblMinCycleCheck;
	private Double knblMinCycleTime;
	private Double knblMaxCycleTime;
	private Boolean knblPrintQuantity;
	private Boolean knblIdBarcode;
	private Boolean knblItemBarcode;
	private Boolean knblPrintConsumeRef;
	private String knblCardPrintOption;
	private Boolean knblRegenRequired;
	private Boolean knblImpactInventory;
	private Boolean knblBackflush;
	private Double knblRepTime;
	private Double knblFifoTime;
	private Boolean knblDispatchList;
	private Boolean knblFaxDispatchList;
	private String knblSourceFax;
	private String knblSourceFax2;
	private Boolean knblEmailDispList;
	private String knblSourceEmail;
	private Boolean knblBlanketPo;
	private String knblAccumType;
	private Double knblIntervalTime;
	private Date knblNextDate;
	private Double knblNextTime;
	private String knblAccumSchedule;
	private String knblAccumSchTime;
	private Date knblModDate;
	private String knblModUserid;
	private String knblUser1;
	private String knblUser2;
	private String knblQadc01;
	private String knblQadc02;
	private Integer knblCardReporting;
	private Double knblFractionalKanban;
	private Integer knblCmtindx;
	private Integer knblRunOutOption;
	private Double oidKnblDet;

	// Constructors

	/** default constructor */
	public AbstractKnblDet() {
	}

	/** minimal constructor */
	public AbstractKnblDet(KnblDetId id, Double knblKnbKeyid,
			String knblCardType, Boolean knblCalcMode,
			Double knblKanbanQuantity, Double knblOrderQty,
			Integer knblNumberOfCards, Double knblContSize,
			String knblContType, String knblTypeUserRef,
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
		this.id = id;
		this.knblKnbKeyid = knblKnbKeyid;
		this.knblCardType = knblCardType;
		this.knblCalcMode = knblCalcMode;
		this.knblKanbanQuantity = knblKanbanQuantity;
		this.knblOrderQty = knblOrderQty;
		this.knblNumberOfCards = knblNumberOfCards;
		this.knblContSize = knblContSize;
		this.knblContType = knblContType;
		this.knblTypeUserRef = knblTypeUserRef;
		this.knblMinCycleCheck = knblMinCycleCheck;
		this.knblMinCycleTime = knblMinCycleTime;
		this.knblMaxCycleTime = knblMaxCycleTime;
		this.knblPrintQuantity = knblPrintQuantity;
		this.knblIdBarcode = knblIdBarcode;
		this.knblItemBarcode = knblItemBarcode;
		this.knblPrintConsumeRef = knblPrintConsumeRef;
		this.knblCardPrintOption = knblCardPrintOption;
		this.knblRegenRequired = knblRegenRequired;
		this.knblImpactInventory = knblImpactInventory;
		this.knblBackflush = knblBackflush;
		this.knblRepTime = knblRepTime;
		this.knblFifoTime = knblFifoTime;
		this.knblDispatchList = knblDispatchList;
		this.knblFaxDispatchList = knblFaxDispatchList;
		this.knblSourceFax = knblSourceFax;
		this.knblSourceFax2 = knblSourceFax2;
		this.knblEmailDispList = knblEmailDispList;
		this.knblSourceEmail = knblSourceEmail;
		this.knblBlanketPo = knblBlanketPo;
		this.knblAccumType = knblAccumType;
		this.knblIntervalTime = knblIntervalTime;
		this.knblNextTime = knblNextTime;
		this.knblAccumSchedule = knblAccumSchedule;
		this.knblAccumSchTime = knblAccumSchTime;
		this.knblModDate = knblModDate;
		this.knblModUserid = knblModUserid;
		this.knblUser1 = knblUser1;
		this.knblUser2 = knblUser2;
		this.knblQadc01 = knblQadc01;
		this.knblQadc02 = knblQadc02;
		this.knblCardReporting = knblCardReporting;
		this.knblFractionalKanban = knblFractionalKanban;
		this.knblCmtindx = knblCmtindx;
		this.knblRunOutOption = knblRunOutOption;
		this.oidKnblDet = oidKnblDet;
	}

	/** full constructor */
	public AbstractKnblDet(KnblDetId id, Double knblKnbKeyid,
			String knblCardType, Boolean knblCalcMode,
			Double knblKanbanQuantity, Double knblOrderQty,
			Integer knblNumberOfCards, Double knblContSize,
			String knblContType, String knblTypeUserRef,
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
		this.id = id;
		this.knblKnbKeyid = knblKnbKeyid;
		this.knblCardType = knblCardType;
		this.knblCalcMode = knblCalcMode;
		this.knblKanbanQuantity = knblKanbanQuantity;
		this.knblOrderQty = knblOrderQty;
		this.knblNumberOfCards = knblNumberOfCards;
		this.knblContSize = knblContSize;
		this.knblContType = knblContType;
		this.knblTypeUserRef = knblTypeUserRef;
		this.knblMinCycleCheck = knblMinCycleCheck;
		this.knblMinCycleTime = knblMinCycleTime;
		this.knblMaxCycleTime = knblMaxCycleTime;
		this.knblPrintQuantity = knblPrintQuantity;
		this.knblIdBarcode = knblIdBarcode;
		this.knblItemBarcode = knblItemBarcode;
		this.knblPrintConsumeRef = knblPrintConsumeRef;
		this.knblCardPrintOption = knblCardPrintOption;
		this.knblRegenRequired = knblRegenRequired;
		this.knblImpactInventory = knblImpactInventory;
		this.knblBackflush = knblBackflush;
		this.knblRepTime = knblRepTime;
		this.knblFifoTime = knblFifoTime;
		this.knblDispatchList = knblDispatchList;
		this.knblFaxDispatchList = knblFaxDispatchList;
		this.knblSourceFax = knblSourceFax;
		this.knblSourceFax2 = knblSourceFax2;
		this.knblEmailDispList = knblEmailDispList;
		this.knblSourceEmail = knblSourceEmail;
		this.knblBlanketPo = knblBlanketPo;
		this.knblAccumType = knblAccumType;
		this.knblIntervalTime = knblIntervalTime;
		this.knblNextDate = knblNextDate;
		this.knblNextTime = knblNextTime;
		this.knblAccumSchedule = knblAccumSchedule;
		this.knblAccumSchTime = knblAccumSchTime;
		this.knblModDate = knblModDate;
		this.knblModUserid = knblModUserid;
		this.knblUser1 = knblUser1;
		this.knblUser2 = knblUser2;
		this.knblQadc01 = knblQadc01;
		this.knblQadc02 = knblQadc02;
		this.knblCardReporting = knblCardReporting;
		this.knblFractionalKanban = knblFractionalKanban;
		this.knblCmtindx = knblCmtindx;
		this.knblRunOutOption = knblRunOutOption;
		this.oidKnblDet = oidKnblDet;
	}

	// Property accessors

	public KnblDetId getId() {
		return this.id;
	}

	public void setId(KnblDetId id) {
		this.id = id;
	}

	public Double getKnblKnbKeyid() {
		return this.knblKnbKeyid;
	}

	public void setKnblKnbKeyid(Double knblKnbKeyid) {
		this.knblKnbKeyid = knblKnbKeyid;
	}

	public String getKnblCardType() {
		return this.knblCardType;
	}

	public void setKnblCardType(String knblCardType) {
		this.knblCardType = knblCardType;
	}

	public Boolean getKnblCalcMode() {
		return this.knblCalcMode;
	}

	public void setKnblCalcMode(Boolean knblCalcMode) {
		this.knblCalcMode = knblCalcMode;
	}

	public Double getKnblKanbanQuantity() {
		return this.knblKanbanQuantity;
	}

	public void setKnblKanbanQuantity(Double knblKanbanQuantity) {
		this.knblKanbanQuantity = knblKanbanQuantity;
	}

	public Double getKnblOrderQty() {
		return this.knblOrderQty;
	}

	public void setKnblOrderQty(Double knblOrderQty) {
		this.knblOrderQty = knblOrderQty;
	}

	public Integer getKnblNumberOfCards() {
		return this.knblNumberOfCards;
	}

	public void setKnblNumberOfCards(Integer knblNumberOfCards) {
		this.knblNumberOfCards = knblNumberOfCards;
	}

	public Double getKnblContSize() {
		return this.knblContSize;
	}

	public void setKnblContSize(Double knblContSize) {
		this.knblContSize = knblContSize;
	}

	public String getKnblContType() {
		return this.knblContType;
	}

	public void setKnblContType(String knblContType) {
		this.knblContType = knblContType;
	}

	public String getKnblTypeUserRef() {
		return this.knblTypeUserRef;
	}

	public void setKnblTypeUserRef(String knblTypeUserRef) {
		this.knblTypeUserRef = knblTypeUserRef;
	}

	public String getKnblMinCycleCheck() {
		return this.knblMinCycleCheck;
	}

	public void setKnblMinCycleCheck(String knblMinCycleCheck) {
		this.knblMinCycleCheck = knblMinCycleCheck;
	}

	public Double getKnblMinCycleTime() {
		return this.knblMinCycleTime;
	}

	public void setKnblMinCycleTime(Double knblMinCycleTime) {
		this.knblMinCycleTime = knblMinCycleTime;
	}

	public Double getKnblMaxCycleTime() {
		return this.knblMaxCycleTime;
	}

	public void setKnblMaxCycleTime(Double knblMaxCycleTime) {
		this.knblMaxCycleTime = knblMaxCycleTime;
	}

	public Boolean getKnblPrintQuantity() {
		return this.knblPrintQuantity;
	}

	public void setKnblPrintQuantity(Boolean knblPrintQuantity) {
		this.knblPrintQuantity = knblPrintQuantity;
	}

	public Boolean getKnblIdBarcode() {
		return this.knblIdBarcode;
	}

	public void setKnblIdBarcode(Boolean knblIdBarcode) {
		this.knblIdBarcode = knblIdBarcode;
	}

	public Boolean getKnblItemBarcode() {
		return this.knblItemBarcode;
	}

	public void setKnblItemBarcode(Boolean knblItemBarcode) {
		this.knblItemBarcode = knblItemBarcode;
	}

	public Boolean getKnblPrintConsumeRef() {
		return this.knblPrintConsumeRef;
	}

	public void setKnblPrintConsumeRef(Boolean knblPrintConsumeRef) {
		this.knblPrintConsumeRef = knblPrintConsumeRef;
	}

	public String getKnblCardPrintOption() {
		return this.knblCardPrintOption;
	}

	public void setKnblCardPrintOption(String knblCardPrintOption) {
		this.knblCardPrintOption = knblCardPrintOption;
	}

	public Boolean getKnblRegenRequired() {
		return this.knblRegenRequired;
	}

	public void setKnblRegenRequired(Boolean knblRegenRequired) {
		this.knblRegenRequired = knblRegenRequired;
	}

	public Boolean getKnblImpactInventory() {
		return this.knblImpactInventory;
	}

	public void setKnblImpactInventory(Boolean knblImpactInventory) {
		this.knblImpactInventory = knblImpactInventory;
	}

	public Boolean getKnblBackflush() {
		return this.knblBackflush;
	}

	public void setKnblBackflush(Boolean knblBackflush) {
		this.knblBackflush = knblBackflush;
	}

	public Double getKnblRepTime() {
		return this.knblRepTime;
	}

	public void setKnblRepTime(Double knblRepTime) {
		this.knblRepTime = knblRepTime;
	}

	public Double getKnblFifoTime() {
		return this.knblFifoTime;
	}

	public void setKnblFifoTime(Double knblFifoTime) {
		this.knblFifoTime = knblFifoTime;
	}

	public Boolean getKnblDispatchList() {
		return this.knblDispatchList;
	}

	public void setKnblDispatchList(Boolean knblDispatchList) {
		this.knblDispatchList = knblDispatchList;
	}

	public Boolean getKnblFaxDispatchList() {
		return this.knblFaxDispatchList;
	}

	public void setKnblFaxDispatchList(Boolean knblFaxDispatchList) {
		this.knblFaxDispatchList = knblFaxDispatchList;
	}

	public String getKnblSourceFax() {
		return this.knblSourceFax;
	}

	public void setKnblSourceFax(String knblSourceFax) {
		this.knblSourceFax = knblSourceFax;
	}

	public String getKnblSourceFax2() {
		return this.knblSourceFax2;
	}

	public void setKnblSourceFax2(String knblSourceFax2) {
		this.knblSourceFax2 = knblSourceFax2;
	}

	public Boolean getKnblEmailDispList() {
		return this.knblEmailDispList;
	}

	public void setKnblEmailDispList(Boolean knblEmailDispList) {
		this.knblEmailDispList = knblEmailDispList;
	}

	public String getKnblSourceEmail() {
		return this.knblSourceEmail;
	}

	public void setKnblSourceEmail(String knblSourceEmail) {
		this.knblSourceEmail = knblSourceEmail;
	}

	public Boolean getKnblBlanketPo() {
		return this.knblBlanketPo;
	}

	public void setKnblBlanketPo(Boolean knblBlanketPo) {
		this.knblBlanketPo = knblBlanketPo;
	}

	public String getKnblAccumType() {
		return this.knblAccumType;
	}

	public void setKnblAccumType(String knblAccumType) {
		this.knblAccumType = knblAccumType;
	}

	public Double getKnblIntervalTime() {
		return this.knblIntervalTime;
	}

	public void setKnblIntervalTime(Double knblIntervalTime) {
		this.knblIntervalTime = knblIntervalTime;
	}

	public Date getKnblNextDate() {
		return this.knblNextDate;
	}

	public void setKnblNextDate(Date knblNextDate) {
		this.knblNextDate = knblNextDate;
	}

	public Double getKnblNextTime() {
		return this.knblNextTime;
	}

	public void setKnblNextTime(Double knblNextTime) {
		this.knblNextTime = knblNextTime;
	}

	public String getKnblAccumSchedule() {
		return this.knblAccumSchedule;
	}

	public void setKnblAccumSchedule(String knblAccumSchedule) {
		this.knblAccumSchedule = knblAccumSchedule;
	}

	public String getKnblAccumSchTime() {
		return this.knblAccumSchTime;
	}

	public void setKnblAccumSchTime(String knblAccumSchTime) {
		this.knblAccumSchTime = knblAccumSchTime;
	}

	public Date getKnblModDate() {
		return this.knblModDate;
	}

	public void setKnblModDate(Date knblModDate) {
		this.knblModDate = knblModDate;
	}

	public String getKnblModUserid() {
		return this.knblModUserid;
	}

	public void setKnblModUserid(String knblModUserid) {
		this.knblModUserid = knblModUserid;
	}

	public String getKnblUser1() {
		return this.knblUser1;
	}

	public void setKnblUser1(String knblUser1) {
		this.knblUser1 = knblUser1;
	}

	public String getKnblUser2() {
		return this.knblUser2;
	}

	public void setKnblUser2(String knblUser2) {
		this.knblUser2 = knblUser2;
	}

	public String getKnblQadc01() {
		return this.knblQadc01;
	}

	public void setKnblQadc01(String knblQadc01) {
		this.knblQadc01 = knblQadc01;
	}

	public String getKnblQadc02() {
		return this.knblQadc02;
	}

	public void setKnblQadc02(String knblQadc02) {
		this.knblQadc02 = knblQadc02;
	}

	public Integer getKnblCardReporting() {
		return this.knblCardReporting;
	}

	public void setKnblCardReporting(Integer knblCardReporting) {
		this.knblCardReporting = knblCardReporting;
	}

	public Double getKnblFractionalKanban() {
		return this.knblFractionalKanban;
	}

	public void setKnblFractionalKanban(Double knblFractionalKanban) {
		this.knblFractionalKanban = knblFractionalKanban;
	}

	public Integer getKnblCmtindx() {
		return this.knblCmtindx;
	}

	public void setKnblCmtindx(Integer knblCmtindx) {
		this.knblCmtindx = knblCmtindx;
	}

	public Integer getKnblRunOutOption() {
		return this.knblRunOutOption;
	}

	public void setKnblRunOutOption(Integer knblRunOutOption) {
		this.knblRunOutOption = knblRunOutOption;
	}

	public Double getOidKnblDet() {
		return this.oidKnblDet;
	}

	public void setOidKnblDet(Double oidKnblDet) {
		this.oidKnblDet = oidKnblDet;
	}

}