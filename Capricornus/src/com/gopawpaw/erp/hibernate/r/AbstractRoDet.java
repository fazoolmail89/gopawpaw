package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRoDet entity provides the base persistence definition of the RoDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRoDet implements java.io.Serializable {

	// Fields

	private RoDetId id;
	private String roDesc;
	private String roWkctr;
	private Double roSetup;
	private Double roRun;
	private Double roMove;
	private Double roYieldPct;
	private String roTool;
	private String roVend;
	private Double roSubCost;
	private Date roEnd;
	private Integer roTranQty;
	private Double roInvValue;
	private Integer roCmtindx;
	private String roMch;
	private Boolean roMilestone;
	private Double roBatch;
	private String roUser1;
	private String roUser2;
	private String roStdOp;
	private Double roSetupMen;
	private Double roMenMch;
	private Integer roMchOp;
	private Double roLbrOvhd;
	private Double roQueue;
	private Double roWait;
	private Integer roSubLead;
	private Double roCycUnit;
	private Double roCycRate;
	private String roChr01;
	private String roChr02;
	private String roChr03;
	private String roChr04;
	private String roChr05;
	private Date roDte01;
	private Date roDte02;
	private Double roDec01;
	private Double roDec02;
	private Boolean roLog01;
	private Double roStdBatch;
	private Boolean roRollup;
	private String roRollupId;
	private String roElmLbr;
	private String roElmBdn;
	private String roElmSub;
	private String roStartEcn;
	private String roEndEcn;
	private String roPoNbr;
	private Integer roPoLine;
	private Boolean roMvNxtOp;
	private String roWipmtlPart;
	private Boolean roAutoLbr;
	private String roBomCode;
	private Double roCost;
	private String roFsmType;
	private Double roPrice;
	private Date roModDate;
	private String roModUserid;
	private String roQadc01;
	private String roQadc02;
	private String roQadc03;
	private Double roQade01;
	private Double roQade02;
	private Date roQadt01;
	private Date roQadt02;
	private Boolean roQadl01;
	private Boolean roQadl02;
	private String roFscCode;
	private Double oidRoDet;

	// Constructors

	/** default constructor */
	public AbstractRoDet() {
	}

	/** minimal constructor */
	public AbstractRoDet(RoDetId id, Double oidRoDet) {
		this.id = id;
		this.oidRoDet = oidRoDet;
	}

	/** full constructor */
	public AbstractRoDet(RoDetId id, String roDesc, String roWkctr,
			Double roSetup, Double roRun, Double roMove, Double roYieldPct,
			String roTool, String roVend, Double roSubCost, Date roEnd,
			Integer roTranQty, Double roInvValue, Integer roCmtindx,
			String roMch, Boolean roMilestone, Double roBatch, String roUser1,
			String roUser2, String roStdOp, Double roSetupMen, Double roMenMch,
			Integer roMchOp, Double roLbrOvhd, Double roQueue, Double roWait,
			Integer roSubLead, Double roCycUnit, Double roCycRate,
			String roChr01, String roChr02, String roChr03, String roChr04,
			String roChr05, Date roDte01, Date roDte02, Double roDec01,
			Double roDec02, Boolean roLog01, Double roStdBatch,
			Boolean roRollup, String roRollupId, String roElmLbr,
			String roElmBdn, String roElmSub, String roStartEcn,
			String roEndEcn, String roPoNbr, Integer roPoLine,
			Boolean roMvNxtOp, String roWipmtlPart, Boolean roAutoLbr,
			String roBomCode, Double roCost, String roFsmType, Double roPrice,
			Date roModDate, String roModUserid, String roQadc01,
			String roQadc02, String roQadc03, Double roQade01, Double roQade02,
			Date roQadt01, Date roQadt02, Boolean roQadl01, Boolean roQadl02,
			String roFscCode, Double oidRoDet) {
		this.id = id;
		this.roDesc = roDesc;
		this.roWkctr = roWkctr;
		this.roSetup = roSetup;
		this.roRun = roRun;
		this.roMove = roMove;
		this.roYieldPct = roYieldPct;
		this.roTool = roTool;
		this.roVend = roVend;
		this.roSubCost = roSubCost;
		this.roEnd = roEnd;
		this.roTranQty = roTranQty;
		this.roInvValue = roInvValue;
		this.roCmtindx = roCmtindx;
		this.roMch = roMch;
		this.roMilestone = roMilestone;
		this.roBatch = roBatch;
		this.roUser1 = roUser1;
		this.roUser2 = roUser2;
		this.roStdOp = roStdOp;
		this.roSetupMen = roSetupMen;
		this.roMenMch = roMenMch;
		this.roMchOp = roMchOp;
		this.roLbrOvhd = roLbrOvhd;
		this.roQueue = roQueue;
		this.roWait = roWait;
		this.roSubLead = roSubLead;
		this.roCycUnit = roCycUnit;
		this.roCycRate = roCycRate;
		this.roChr01 = roChr01;
		this.roChr02 = roChr02;
		this.roChr03 = roChr03;
		this.roChr04 = roChr04;
		this.roChr05 = roChr05;
		this.roDte01 = roDte01;
		this.roDte02 = roDte02;
		this.roDec01 = roDec01;
		this.roDec02 = roDec02;
		this.roLog01 = roLog01;
		this.roStdBatch = roStdBatch;
		this.roRollup = roRollup;
		this.roRollupId = roRollupId;
		this.roElmLbr = roElmLbr;
		this.roElmBdn = roElmBdn;
		this.roElmSub = roElmSub;
		this.roStartEcn = roStartEcn;
		this.roEndEcn = roEndEcn;
		this.roPoNbr = roPoNbr;
		this.roPoLine = roPoLine;
		this.roMvNxtOp = roMvNxtOp;
		this.roWipmtlPart = roWipmtlPart;
		this.roAutoLbr = roAutoLbr;
		this.roBomCode = roBomCode;
		this.roCost = roCost;
		this.roFsmType = roFsmType;
		this.roPrice = roPrice;
		this.roModDate = roModDate;
		this.roModUserid = roModUserid;
		this.roQadc01 = roQadc01;
		this.roQadc02 = roQadc02;
		this.roQadc03 = roQadc03;
		this.roQade01 = roQade01;
		this.roQade02 = roQade02;
		this.roQadt01 = roQadt01;
		this.roQadt02 = roQadt02;
		this.roQadl01 = roQadl01;
		this.roQadl02 = roQadl02;
		this.roFscCode = roFscCode;
		this.oidRoDet = oidRoDet;
	}

	// Property accessors

	public RoDetId getId() {
		return this.id;
	}

	public void setId(RoDetId id) {
		this.id = id;
	}

	public String getRoDesc() {
		return this.roDesc;
	}

	public void setRoDesc(String roDesc) {
		this.roDesc = roDesc;
	}

	public String getRoWkctr() {
		return this.roWkctr;
	}

	public void setRoWkctr(String roWkctr) {
		this.roWkctr = roWkctr;
	}

	public Double getRoSetup() {
		return this.roSetup;
	}

	public void setRoSetup(Double roSetup) {
		this.roSetup = roSetup;
	}

	public Double getRoRun() {
		return this.roRun;
	}

	public void setRoRun(Double roRun) {
		this.roRun = roRun;
	}

	public Double getRoMove() {
		return this.roMove;
	}

	public void setRoMove(Double roMove) {
		this.roMove = roMove;
	}

	public Double getRoYieldPct() {
		return this.roYieldPct;
	}

	public void setRoYieldPct(Double roYieldPct) {
		this.roYieldPct = roYieldPct;
	}

	public String getRoTool() {
		return this.roTool;
	}

	public void setRoTool(String roTool) {
		this.roTool = roTool;
	}

	public String getRoVend() {
		return this.roVend;
	}

	public void setRoVend(String roVend) {
		this.roVend = roVend;
	}

	public Double getRoSubCost() {
		return this.roSubCost;
	}

	public void setRoSubCost(Double roSubCost) {
		this.roSubCost = roSubCost;
	}

	public Date getRoEnd() {
		return this.roEnd;
	}

	public void setRoEnd(Date roEnd) {
		this.roEnd = roEnd;
	}

	public Integer getRoTranQty() {
		return this.roTranQty;
	}

	public void setRoTranQty(Integer roTranQty) {
		this.roTranQty = roTranQty;
	}

	public Double getRoInvValue() {
		return this.roInvValue;
	}

	public void setRoInvValue(Double roInvValue) {
		this.roInvValue = roInvValue;
	}

	public Integer getRoCmtindx() {
		return this.roCmtindx;
	}

	public void setRoCmtindx(Integer roCmtindx) {
		this.roCmtindx = roCmtindx;
	}

	public String getRoMch() {
		return this.roMch;
	}

	public void setRoMch(String roMch) {
		this.roMch = roMch;
	}

	public Boolean getRoMilestone() {
		return this.roMilestone;
	}

	public void setRoMilestone(Boolean roMilestone) {
		this.roMilestone = roMilestone;
	}

	public Double getRoBatch() {
		return this.roBatch;
	}

	public void setRoBatch(Double roBatch) {
		this.roBatch = roBatch;
	}

	public String getRoUser1() {
		return this.roUser1;
	}

	public void setRoUser1(String roUser1) {
		this.roUser1 = roUser1;
	}

	public String getRoUser2() {
		return this.roUser2;
	}

	public void setRoUser2(String roUser2) {
		this.roUser2 = roUser2;
	}

	public String getRoStdOp() {
		return this.roStdOp;
	}

	public void setRoStdOp(String roStdOp) {
		this.roStdOp = roStdOp;
	}

	public Double getRoSetupMen() {
		return this.roSetupMen;
	}

	public void setRoSetupMen(Double roSetupMen) {
		this.roSetupMen = roSetupMen;
	}

	public Double getRoMenMch() {
		return this.roMenMch;
	}

	public void setRoMenMch(Double roMenMch) {
		this.roMenMch = roMenMch;
	}

	public Integer getRoMchOp() {
		return this.roMchOp;
	}

	public void setRoMchOp(Integer roMchOp) {
		this.roMchOp = roMchOp;
	}

	public Double getRoLbrOvhd() {
		return this.roLbrOvhd;
	}

	public void setRoLbrOvhd(Double roLbrOvhd) {
		this.roLbrOvhd = roLbrOvhd;
	}

	public Double getRoQueue() {
		return this.roQueue;
	}

	public void setRoQueue(Double roQueue) {
		this.roQueue = roQueue;
	}

	public Double getRoWait() {
		return this.roWait;
	}

	public void setRoWait(Double roWait) {
		this.roWait = roWait;
	}

	public Integer getRoSubLead() {
		return this.roSubLead;
	}

	public void setRoSubLead(Integer roSubLead) {
		this.roSubLead = roSubLead;
	}

	public Double getRoCycUnit() {
		return this.roCycUnit;
	}

	public void setRoCycUnit(Double roCycUnit) {
		this.roCycUnit = roCycUnit;
	}

	public Double getRoCycRate() {
		return this.roCycRate;
	}

	public void setRoCycRate(Double roCycRate) {
		this.roCycRate = roCycRate;
	}

	public String getRoChr01() {
		return this.roChr01;
	}

	public void setRoChr01(String roChr01) {
		this.roChr01 = roChr01;
	}

	public String getRoChr02() {
		return this.roChr02;
	}

	public void setRoChr02(String roChr02) {
		this.roChr02 = roChr02;
	}

	public String getRoChr03() {
		return this.roChr03;
	}

	public void setRoChr03(String roChr03) {
		this.roChr03 = roChr03;
	}

	public String getRoChr04() {
		return this.roChr04;
	}

	public void setRoChr04(String roChr04) {
		this.roChr04 = roChr04;
	}

	public String getRoChr05() {
		return this.roChr05;
	}

	public void setRoChr05(String roChr05) {
		this.roChr05 = roChr05;
	}

	public Date getRoDte01() {
		return this.roDte01;
	}

	public void setRoDte01(Date roDte01) {
		this.roDte01 = roDte01;
	}

	public Date getRoDte02() {
		return this.roDte02;
	}

	public void setRoDte02(Date roDte02) {
		this.roDte02 = roDte02;
	}

	public Double getRoDec01() {
		return this.roDec01;
	}

	public void setRoDec01(Double roDec01) {
		this.roDec01 = roDec01;
	}

	public Double getRoDec02() {
		return this.roDec02;
	}

	public void setRoDec02(Double roDec02) {
		this.roDec02 = roDec02;
	}

	public Boolean getRoLog01() {
		return this.roLog01;
	}

	public void setRoLog01(Boolean roLog01) {
		this.roLog01 = roLog01;
	}

	public Double getRoStdBatch() {
		return this.roStdBatch;
	}

	public void setRoStdBatch(Double roStdBatch) {
		this.roStdBatch = roStdBatch;
	}

	public Boolean getRoRollup() {
		return this.roRollup;
	}

	public void setRoRollup(Boolean roRollup) {
		this.roRollup = roRollup;
	}

	public String getRoRollupId() {
		return this.roRollupId;
	}

	public void setRoRollupId(String roRollupId) {
		this.roRollupId = roRollupId;
	}

	public String getRoElmLbr() {
		return this.roElmLbr;
	}

	public void setRoElmLbr(String roElmLbr) {
		this.roElmLbr = roElmLbr;
	}

	public String getRoElmBdn() {
		return this.roElmBdn;
	}

	public void setRoElmBdn(String roElmBdn) {
		this.roElmBdn = roElmBdn;
	}

	public String getRoElmSub() {
		return this.roElmSub;
	}

	public void setRoElmSub(String roElmSub) {
		this.roElmSub = roElmSub;
	}

	public String getRoStartEcn() {
		return this.roStartEcn;
	}

	public void setRoStartEcn(String roStartEcn) {
		this.roStartEcn = roStartEcn;
	}

	public String getRoEndEcn() {
		return this.roEndEcn;
	}

	public void setRoEndEcn(String roEndEcn) {
		this.roEndEcn = roEndEcn;
	}

	public String getRoPoNbr() {
		return this.roPoNbr;
	}

	public void setRoPoNbr(String roPoNbr) {
		this.roPoNbr = roPoNbr;
	}

	public Integer getRoPoLine() {
		return this.roPoLine;
	}

	public void setRoPoLine(Integer roPoLine) {
		this.roPoLine = roPoLine;
	}

	public Boolean getRoMvNxtOp() {
		return this.roMvNxtOp;
	}

	public void setRoMvNxtOp(Boolean roMvNxtOp) {
		this.roMvNxtOp = roMvNxtOp;
	}

	public String getRoWipmtlPart() {
		return this.roWipmtlPart;
	}

	public void setRoWipmtlPart(String roWipmtlPart) {
		this.roWipmtlPart = roWipmtlPart;
	}

	public Boolean getRoAutoLbr() {
		return this.roAutoLbr;
	}

	public void setRoAutoLbr(Boolean roAutoLbr) {
		this.roAutoLbr = roAutoLbr;
	}

	public String getRoBomCode() {
		return this.roBomCode;
	}

	public void setRoBomCode(String roBomCode) {
		this.roBomCode = roBomCode;
	}

	public Double getRoCost() {
		return this.roCost;
	}

	public void setRoCost(Double roCost) {
		this.roCost = roCost;
	}

	public String getRoFsmType() {
		return this.roFsmType;
	}

	public void setRoFsmType(String roFsmType) {
		this.roFsmType = roFsmType;
	}

	public Double getRoPrice() {
		return this.roPrice;
	}

	public void setRoPrice(Double roPrice) {
		this.roPrice = roPrice;
	}

	public Date getRoModDate() {
		return this.roModDate;
	}

	public void setRoModDate(Date roModDate) {
		this.roModDate = roModDate;
	}

	public String getRoModUserid() {
		return this.roModUserid;
	}

	public void setRoModUserid(String roModUserid) {
		this.roModUserid = roModUserid;
	}

	public String getRoQadc01() {
		return this.roQadc01;
	}

	public void setRoQadc01(String roQadc01) {
		this.roQadc01 = roQadc01;
	}

	public String getRoQadc02() {
		return this.roQadc02;
	}

	public void setRoQadc02(String roQadc02) {
		this.roQadc02 = roQadc02;
	}

	public String getRoQadc03() {
		return this.roQadc03;
	}

	public void setRoQadc03(String roQadc03) {
		this.roQadc03 = roQadc03;
	}

	public Double getRoQade01() {
		return this.roQade01;
	}

	public void setRoQade01(Double roQade01) {
		this.roQade01 = roQade01;
	}

	public Double getRoQade02() {
		return this.roQade02;
	}

	public void setRoQade02(Double roQade02) {
		this.roQade02 = roQade02;
	}

	public Date getRoQadt01() {
		return this.roQadt01;
	}

	public void setRoQadt01(Date roQadt01) {
		this.roQadt01 = roQadt01;
	}

	public Date getRoQadt02() {
		return this.roQadt02;
	}

	public void setRoQadt02(Date roQadt02) {
		this.roQadt02 = roQadt02;
	}

	public Boolean getRoQadl01() {
		return this.roQadl01;
	}

	public void setRoQadl01(Boolean roQadl01) {
		this.roQadl01 = roQadl01;
	}

	public Boolean getRoQadl02() {
		return this.roQadl02;
	}

	public void setRoQadl02(Boolean roQadl02) {
		this.roQadl02 = roQadl02;
	}

	public String getRoFscCode() {
		return this.roFscCode;
	}

	public void setRoFscCode(String roFscCode) {
		this.roFscCode = roFscCode;
	}

	public Double getOidRoDet() {
		return this.oidRoDet;
	}

	public void setOidRoDet(Double oidRoDet) {
		this.oidRoDet = oidRoDet;
	}

}