package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPjshHist entity provides the base persistence definition of the
 * PjshHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjshHist implements java.io.Serializable {

	// Fields

	private PjshHistId id;
	private String pjshNbr;
	private Integer pjshPjsLine;
	private Date pjshTrDate;
	private Integer pjshTrTime;
	private String pjshTrType;
	private String pjshTrInd;
	private Double pjshTrQty;
	private Double pjshTrCost;
	private Double pjshAmtInv;
	private Double pjshAmtInvChg;
	private Double pjshCostActual;
	private Double pjshCostActChg;
	private Double pjshCostIss;
	private Double pjshCostIssChg;
	private Double pjshCostPlanned;
	private Double pjshCostPlnChg;
	private Double pjshCostWip;
	private Double pjshCostWipChg;
	private Double pjshQtyActual;
	private Double pjshQtyActChg;
	private Double pjshQtyBudget;
	private Double pjshQtyBgChg;
	private Double pjshQtyInv;
	private Double pjshQtyInvChg;
	private Double pjshQtyIss;
	private Double pjshQtyIssChg;
	private Double pjshQtyOh;
	private Double pjshQtyOhChg;
	private Double pjshQtyPlanned;
	private Double pjshQtyPlnChg;
	private Double pjshQtySelInv;
	private Double pjshQtySelChg;
	private Double pjshQtyWip;
	private Double pjshQtyWipChg;
	private Double pjshPovarAmt;
	private Double pjshPovarChg;
	private String pjshOldStatus;
	private String pjshStatus;
	private String pjshRelNbr;
	private String pjshUserid;
	private Date pjshModDate;
	private String pjshModUserid;
	private String pjshUser1;
	private String pjshUser2;
	private String pjshQadc01;
	private Double pjshQadd01;
	private Integer pjshQadi01;
	private Boolean pjshQadl01;
	private Date pjshQadt01;
	private Double oidPjshHist;

	// Constructors

	/** default constructor */
	public AbstractPjshHist() {
	}

	/** minimal constructor */
	public AbstractPjshHist(PjshHistId id, String pjshNbr, Integer pjshPjsLine,
			Date pjshTrDate, Integer pjshTrTime, String pjshTrType,
			String pjshTrInd, Double pjshTrQty, Double pjshTrCost,
			Double pjshAmtInv, Double pjshAmtInvChg, Double pjshCostActual,
			Double pjshCostActChg, Double pjshCostIss, Double pjshCostIssChg,
			Double pjshCostPlanned, Double pjshCostPlnChg, Double pjshCostWip,
			Double pjshCostWipChg, Double pjshQtyActual, Double pjshQtyActChg,
			Double pjshQtyBudget, Double pjshQtyBgChg, Double pjshQtyInv,
			Double pjshQtyInvChg, Double pjshQtyIss, Double pjshQtyIssChg,
			Double pjshQtyOh, Double pjshQtyOhChg, Double pjshQtyPlanned,
			Double pjshQtyPlnChg, Double pjshQtySelInv, Double pjshQtySelChg,
			Double pjshQtyWip, Double pjshQtyWipChg, Double pjshPovarAmt,
			Double pjshPovarChg, String pjshOldStatus, String pjshStatus,
			String pjshRelNbr, String pjshUserid, Date pjshModDate,
			String pjshModUserid, Double oidPjshHist) {
		this.id = id;
		this.pjshNbr = pjshNbr;
		this.pjshPjsLine = pjshPjsLine;
		this.pjshTrDate = pjshTrDate;
		this.pjshTrTime = pjshTrTime;
		this.pjshTrType = pjshTrType;
		this.pjshTrInd = pjshTrInd;
		this.pjshTrQty = pjshTrQty;
		this.pjshTrCost = pjshTrCost;
		this.pjshAmtInv = pjshAmtInv;
		this.pjshAmtInvChg = pjshAmtInvChg;
		this.pjshCostActual = pjshCostActual;
		this.pjshCostActChg = pjshCostActChg;
		this.pjshCostIss = pjshCostIss;
		this.pjshCostIssChg = pjshCostIssChg;
		this.pjshCostPlanned = pjshCostPlanned;
		this.pjshCostPlnChg = pjshCostPlnChg;
		this.pjshCostWip = pjshCostWip;
		this.pjshCostWipChg = pjshCostWipChg;
		this.pjshQtyActual = pjshQtyActual;
		this.pjshQtyActChg = pjshQtyActChg;
		this.pjshQtyBudget = pjshQtyBudget;
		this.pjshQtyBgChg = pjshQtyBgChg;
		this.pjshQtyInv = pjshQtyInv;
		this.pjshQtyInvChg = pjshQtyInvChg;
		this.pjshQtyIss = pjshQtyIss;
		this.pjshQtyIssChg = pjshQtyIssChg;
		this.pjshQtyOh = pjshQtyOh;
		this.pjshQtyOhChg = pjshQtyOhChg;
		this.pjshQtyPlanned = pjshQtyPlanned;
		this.pjshQtyPlnChg = pjshQtyPlnChg;
		this.pjshQtySelInv = pjshQtySelInv;
		this.pjshQtySelChg = pjshQtySelChg;
		this.pjshQtyWip = pjshQtyWip;
		this.pjshQtyWipChg = pjshQtyWipChg;
		this.pjshPovarAmt = pjshPovarAmt;
		this.pjshPovarChg = pjshPovarChg;
		this.pjshOldStatus = pjshOldStatus;
		this.pjshStatus = pjshStatus;
		this.pjshRelNbr = pjshRelNbr;
		this.pjshUserid = pjshUserid;
		this.pjshModDate = pjshModDate;
		this.pjshModUserid = pjshModUserid;
		this.oidPjshHist = oidPjshHist;
	}

	/** full constructor */
	public AbstractPjshHist(PjshHistId id, String pjshNbr, Integer pjshPjsLine,
			Date pjshTrDate, Integer pjshTrTime, String pjshTrType,
			String pjshTrInd, Double pjshTrQty, Double pjshTrCost,
			Double pjshAmtInv, Double pjshAmtInvChg, Double pjshCostActual,
			Double pjshCostActChg, Double pjshCostIss, Double pjshCostIssChg,
			Double pjshCostPlanned, Double pjshCostPlnChg, Double pjshCostWip,
			Double pjshCostWipChg, Double pjshQtyActual, Double pjshQtyActChg,
			Double pjshQtyBudget, Double pjshQtyBgChg, Double pjshQtyInv,
			Double pjshQtyInvChg, Double pjshQtyIss, Double pjshQtyIssChg,
			Double pjshQtyOh, Double pjshQtyOhChg, Double pjshQtyPlanned,
			Double pjshQtyPlnChg, Double pjshQtySelInv, Double pjshQtySelChg,
			Double pjshQtyWip, Double pjshQtyWipChg, Double pjshPovarAmt,
			Double pjshPovarChg, String pjshOldStatus, String pjshStatus,
			String pjshRelNbr, String pjshUserid, Date pjshModDate,
			String pjshModUserid, String pjshUser1, String pjshUser2,
			String pjshQadc01, Double pjshQadd01, Integer pjshQadi01,
			Boolean pjshQadl01, Date pjshQadt01, Double oidPjshHist) {
		this.id = id;
		this.pjshNbr = pjshNbr;
		this.pjshPjsLine = pjshPjsLine;
		this.pjshTrDate = pjshTrDate;
		this.pjshTrTime = pjshTrTime;
		this.pjshTrType = pjshTrType;
		this.pjshTrInd = pjshTrInd;
		this.pjshTrQty = pjshTrQty;
		this.pjshTrCost = pjshTrCost;
		this.pjshAmtInv = pjshAmtInv;
		this.pjshAmtInvChg = pjshAmtInvChg;
		this.pjshCostActual = pjshCostActual;
		this.pjshCostActChg = pjshCostActChg;
		this.pjshCostIss = pjshCostIss;
		this.pjshCostIssChg = pjshCostIssChg;
		this.pjshCostPlanned = pjshCostPlanned;
		this.pjshCostPlnChg = pjshCostPlnChg;
		this.pjshCostWip = pjshCostWip;
		this.pjshCostWipChg = pjshCostWipChg;
		this.pjshQtyActual = pjshQtyActual;
		this.pjshQtyActChg = pjshQtyActChg;
		this.pjshQtyBudget = pjshQtyBudget;
		this.pjshQtyBgChg = pjshQtyBgChg;
		this.pjshQtyInv = pjshQtyInv;
		this.pjshQtyInvChg = pjshQtyInvChg;
		this.pjshQtyIss = pjshQtyIss;
		this.pjshQtyIssChg = pjshQtyIssChg;
		this.pjshQtyOh = pjshQtyOh;
		this.pjshQtyOhChg = pjshQtyOhChg;
		this.pjshQtyPlanned = pjshQtyPlanned;
		this.pjshQtyPlnChg = pjshQtyPlnChg;
		this.pjshQtySelInv = pjshQtySelInv;
		this.pjshQtySelChg = pjshQtySelChg;
		this.pjshQtyWip = pjshQtyWip;
		this.pjshQtyWipChg = pjshQtyWipChg;
		this.pjshPovarAmt = pjshPovarAmt;
		this.pjshPovarChg = pjshPovarChg;
		this.pjshOldStatus = pjshOldStatus;
		this.pjshStatus = pjshStatus;
		this.pjshRelNbr = pjshRelNbr;
		this.pjshUserid = pjshUserid;
		this.pjshModDate = pjshModDate;
		this.pjshModUserid = pjshModUserid;
		this.pjshUser1 = pjshUser1;
		this.pjshUser2 = pjshUser2;
		this.pjshQadc01 = pjshQadc01;
		this.pjshQadd01 = pjshQadd01;
		this.pjshQadi01 = pjshQadi01;
		this.pjshQadl01 = pjshQadl01;
		this.pjshQadt01 = pjshQadt01;
		this.oidPjshHist = oidPjshHist;
	}

	// Property accessors

	public PjshHistId getId() {
		return this.id;
	}

	public void setId(PjshHistId id) {
		this.id = id;
	}

	public String getPjshNbr() {
		return this.pjshNbr;
	}

	public void setPjshNbr(String pjshNbr) {
		this.pjshNbr = pjshNbr;
	}

	public Integer getPjshPjsLine() {
		return this.pjshPjsLine;
	}

	public void setPjshPjsLine(Integer pjshPjsLine) {
		this.pjshPjsLine = pjshPjsLine;
	}

	public Date getPjshTrDate() {
		return this.pjshTrDate;
	}

	public void setPjshTrDate(Date pjshTrDate) {
		this.pjshTrDate = pjshTrDate;
	}

	public Integer getPjshTrTime() {
		return this.pjshTrTime;
	}

	public void setPjshTrTime(Integer pjshTrTime) {
		this.pjshTrTime = pjshTrTime;
	}

	public String getPjshTrType() {
		return this.pjshTrType;
	}

	public void setPjshTrType(String pjshTrType) {
		this.pjshTrType = pjshTrType;
	}

	public String getPjshTrInd() {
		return this.pjshTrInd;
	}

	public void setPjshTrInd(String pjshTrInd) {
		this.pjshTrInd = pjshTrInd;
	}

	public Double getPjshTrQty() {
		return this.pjshTrQty;
	}

	public void setPjshTrQty(Double pjshTrQty) {
		this.pjshTrQty = pjshTrQty;
	}

	public Double getPjshTrCost() {
		return this.pjshTrCost;
	}

	public void setPjshTrCost(Double pjshTrCost) {
		this.pjshTrCost = pjshTrCost;
	}

	public Double getPjshAmtInv() {
		return this.pjshAmtInv;
	}

	public void setPjshAmtInv(Double pjshAmtInv) {
		this.pjshAmtInv = pjshAmtInv;
	}

	public Double getPjshAmtInvChg() {
		return this.pjshAmtInvChg;
	}

	public void setPjshAmtInvChg(Double pjshAmtInvChg) {
		this.pjshAmtInvChg = pjshAmtInvChg;
	}

	public Double getPjshCostActual() {
		return this.pjshCostActual;
	}

	public void setPjshCostActual(Double pjshCostActual) {
		this.pjshCostActual = pjshCostActual;
	}

	public Double getPjshCostActChg() {
		return this.pjshCostActChg;
	}

	public void setPjshCostActChg(Double pjshCostActChg) {
		this.pjshCostActChg = pjshCostActChg;
	}

	public Double getPjshCostIss() {
		return this.pjshCostIss;
	}

	public void setPjshCostIss(Double pjshCostIss) {
		this.pjshCostIss = pjshCostIss;
	}

	public Double getPjshCostIssChg() {
		return this.pjshCostIssChg;
	}

	public void setPjshCostIssChg(Double pjshCostIssChg) {
		this.pjshCostIssChg = pjshCostIssChg;
	}

	public Double getPjshCostPlanned() {
		return this.pjshCostPlanned;
	}

	public void setPjshCostPlanned(Double pjshCostPlanned) {
		this.pjshCostPlanned = pjshCostPlanned;
	}

	public Double getPjshCostPlnChg() {
		return this.pjshCostPlnChg;
	}

	public void setPjshCostPlnChg(Double pjshCostPlnChg) {
		this.pjshCostPlnChg = pjshCostPlnChg;
	}

	public Double getPjshCostWip() {
		return this.pjshCostWip;
	}

	public void setPjshCostWip(Double pjshCostWip) {
		this.pjshCostWip = pjshCostWip;
	}

	public Double getPjshCostWipChg() {
		return this.pjshCostWipChg;
	}

	public void setPjshCostWipChg(Double pjshCostWipChg) {
		this.pjshCostWipChg = pjshCostWipChg;
	}

	public Double getPjshQtyActual() {
		return this.pjshQtyActual;
	}

	public void setPjshQtyActual(Double pjshQtyActual) {
		this.pjshQtyActual = pjshQtyActual;
	}

	public Double getPjshQtyActChg() {
		return this.pjshQtyActChg;
	}

	public void setPjshQtyActChg(Double pjshQtyActChg) {
		this.pjshQtyActChg = pjshQtyActChg;
	}

	public Double getPjshQtyBudget() {
		return this.pjshQtyBudget;
	}

	public void setPjshQtyBudget(Double pjshQtyBudget) {
		this.pjshQtyBudget = pjshQtyBudget;
	}

	public Double getPjshQtyBgChg() {
		return this.pjshQtyBgChg;
	}

	public void setPjshQtyBgChg(Double pjshQtyBgChg) {
		this.pjshQtyBgChg = pjshQtyBgChg;
	}

	public Double getPjshQtyInv() {
		return this.pjshQtyInv;
	}

	public void setPjshQtyInv(Double pjshQtyInv) {
		this.pjshQtyInv = pjshQtyInv;
	}

	public Double getPjshQtyInvChg() {
		return this.pjshQtyInvChg;
	}

	public void setPjshQtyInvChg(Double pjshQtyInvChg) {
		this.pjshQtyInvChg = pjshQtyInvChg;
	}

	public Double getPjshQtyIss() {
		return this.pjshQtyIss;
	}

	public void setPjshQtyIss(Double pjshQtyIss) {
		this.pjshQtyIss = pjshQtyIss;
	}

	public Double getPjshQtyIssChg() {
		return this.pjshQtyIssChg;
	}

	public void setPjshQtyIssChg(Double pjshQtyIssChg) {
		this.pjshQtyIssChg = pjshQtyIssChg;
	}

	public Double getPjshQtyOh() {
		return this.pjshQtyOh;
	}

	public void setPjshQtyOh(Double pjshQtyOh) {
		this.pjshQtyOh = pjshQtyOh;
	}

	public Double getPjshQtyOhChg() {
		return this.pjshQtyOhChg;
	}

	public void setPjshQtyOhChg(Double pjshQtyOhChg) {
		this.pjshQtyOhChg = pjshQtyOhChg;
	}

	public Double getPjshQtyPlanned() {
		return this.pjshQtyPlanned;
	}

	public void setPjshQtyPlanned(Double pjshQtyPlanned) {
		this.pjshQtyPlanned = pjshQtyPlanned;
	}

	public Double getPjshQtyPlnChg() {
		return this.pjshQtyPlnChg;
	}

	public void setPjshQtyPlnChg(Double pjshQtyPlnChg) {
		this.pjshQtyPlnChg = pjshQtyPlnChg;
	}

	public Double getPjshQtySelInv() {
		return this.pjshQtySelInv;
	}

	public void setPjshQtySelInv(Double pjshQtySelInv) {
		this.pjshQtySelInv = pjshQtySelInv;
	}

	public Double getPjshQtySelChg() {
		return this.pjshQtySelChg;
	}

	public void setPjshQtySelChg(Double pjshQtySelChg) {
		this.pjshQtySelChg = pjshQtySelChg;
	}

	public Double getPjshQtyWip() {
		return this.pjshQtyWip;
	}

	public void setPjshQtyWip(Double pjshQtyWip) {
		this.pjshQtyWip = pjshQtyWip;
	}

	public Double getPjshQtyWipChg() {
		return this.pjshQtyWipChg;
	}

	public void setPjshQtyWipChg(Double pjshQtyWipChg) {
		this.pjshQtyWipChg = pjshQtyWipChg;
	}

	public Double getPjshPovarAmt() {
		return this.pjshPovarAmt;
	}

	public void setPjshPovarAmt(Double pjshPovarAmt) {
		this.pjshPovarAmt = pjshPovarAmt;
	}

	public Double getPjshPovarChg() {
		return this.pjshPovarChg;
	}

	public void setPjshPovarChg(Double pjshPovarChg) {
		this.pjshPovarChg = pjshPovarChg;
	}

	public String getPjshOldStatus() {
		return this.pjshOldStatus;
	}

	public void setPjshOldStatus(String pjshOldStatus) {
		this.pjshOldStatus = pjshOldStatus;
	}

	public String getPjshStatus() {
		return this.pjshStatus;
	}

	public void setPjshStatus(String pjshStatus) {
		this.pjshStatus = pjshStatus;
	}

	public String getPjshRelNbr() {
		return this.pjshRelNbr;
	}

	public void setPjshRelNbr(String pjshRelNbr) {
		this.pjshRelNbr = pjshRelNbr;
	}

	public String getPjshUserid() {
		return this.pjshUserid;
	}

	public void setPjshUserid(String pjshUserid) {
		this.pjshUserid = pjshUserid;
	}

	public Date getPjshModDate() {
		return this.pjshModDate;
	}

	public void setPjshModDate(Date pjshModDate) {
		this.pjshModDate = pjshModDate;
	}

	public String getPjshModUserid() {
		return this.pjshModUserid;
	}

	public void setPjshModUserid(String pjshModUserid) {
		this.pjshModUserid = pjshModUserid;
	}

	public String getPjshUser1() {
		return this.pjshUser1;
	}

	public void setPjshUser1(String pjshUser1) {
		this.pjshUser1 = pjshUser1;
	}

	public String getPjshUser2() {
		return this.pjshUser2;
	}

	public void setPjshUser2(String pjshUser2) {
		this.pjshUser2 = pjshUser2;
	}

	public String getPjshQadc01() {
		return this.pjshQadc01;
	}

	public void setPjshQadc01(String pjshQadc01) {
		this.pjshQadc01 = pjshQadc01;
	}

	public Double getPjshQadd01() {
		return this.pjshQadd01;
	}

	public void setPjshQadd01(Double pjshQadd01) {
		this.pjshQadd01 = pjshQadd01;
	}

	public Integer getPjshQadi01() {
		return this.pjshQadi01;
	}

	public void setPjshQadi01(Integer pjshQadi01) {
		this.pjshQadi01 = pjshQadi01;
	}

	public Boolean getPjshQadl01() {
		return this.pjshQadl01;
	}

	public void setPjshQadl01(Boolean pjshQadl01) {
		this.pjshQadl01 = pjshQadl01;
	}

	public Date getPjshQadt01() {
		return this.pjshQadt01;
	}

	public void setPjshQadt01(Date pjshQadt01) {
		this.pjshQadt01 = pjshQadt01;
	}

	public Double getOidPjshHist() {
		return this.oidPjshHist;
	}

	public void setOidPjshHist(Double oidPjshHist) {
		this.oidPjshHist = oidPjshHist;
	}

}