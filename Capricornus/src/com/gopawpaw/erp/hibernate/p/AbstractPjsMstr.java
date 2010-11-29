package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPjsMstr entity provides the base persistence definition of the
 * PjsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjsMstr implements java.io.Serializable {

	// Fields

	private PjsMstrId id;
	private Integer pjsSubNbr;
	private String pjsLineDisp;
	private Integer pjsLinePar;
	private Integer pjsLineSeq;
	private String pjsLineSort;
	private Double pjsAmtInv;
	private Integer pjsBudgetType;
	private String pjsCaIntType;
	private Integer pjsCmtindx;
	private Boolean pjsCompleted;
	private Double pjsCost;
	private Double pjsCostActual;
	private Double pjsCostIss;
	private Double pjsCostWip;
	private String pjsDesc;
	private Double pjsDiscPct;
	private Boolean pjsFrozen;
	private String pjsFscCode;
	private Boolean pjsDetailOnInv;
	private Boolean pjsPriceOnInv;
	private Boolean pjsInvLvl;
	private String pjsInvGroup;
	private Boolean pjsLinkOk;
	private Double pjsListPr;
	private String pjsPart;
	private Double pjsPovarAmt;
	private Double pjsPrice;
	private String pjsProdLine;
	private Double pjsQtyActual;
	private Double pjsQtyBudget;
	private Double pjsQtyInv;
	private Double pjsQtyIss;
	private Double pjsQtyOh;
	private Double pjsQtyPlanned;
	private Double pjsQtySelInv;
	private Double pjsQtyWip;
	private String pjsStatus;
	private Boolean pjsSubassy;
	private String pjsUm;
	private Double pjsUmConv;
	private Boolean pjsVariation;
	private Date pjsModDate;
	private String pjsModUserid;
	private String pjsUser1;
	private String pjsUser2;
	private String pjsChr01;
	private Double pjsDec01;
	private Double pjsDec02;
	private Boolean pjsLog01;
	private Boolean pjsLog02;
	private Date pjsDte01;
	private Date pjsDte02;
	private String pjsQadc01;
	private String pjsQadc02;
	private String pjsQadc03;
	private Double pjsQadd01;
	private Double pjsQadd02;
	private Integer pjsQadi01;
	private Integer pjsQadi02;
	private Boolean pjsQadl01;
	private Boolean pjsQadl02;
	private Date pjsQadt01;
	private Date pjsQadt02;
	private Double oidPjsMstr;

	// Constructors

	/** default constructor */
	public AbstractPjsMstr() {
	}

	/** minimal constructor */
	public AbstractPjsMstr(PjsMstrId id, Integer pjsSubNbr, String pjsLineDisp,
			Integer pjsLinePar, Integer pjsLineSeq, String pjsLineSort,
			Double pjsAmtInv, Integer pjsBudgetType, String pjsCaIntType,
			Integer pjsCmtindx, Boolean pjsCompleted, Double pjsCost,
			Double pjsCostActual, Double pjsCostIss, Double pjsCostWip,
			String pjsDesc, Double pjsDiscPct, Boolean pjsFrozen,
			String pjsFscCode, Boolean pjsDetailOnInv, Boolean pjsPriceOnInv,
			Boolean pjsInvLvl, String pjsInvGroup, Boolean pjsLinkOk,
			Double pjsListPr, String pjsPart, Double pjsPovarAmt,
			Double pjsPrice, String pjsProdLine, Double pjsQtyActual,
			Double pjsQtyBudget, Double pjsQtyInv, Double pjsQtyIss,
			Double pjsQtyOh, Double pjsQtyPlanned, Double pjsQtySelInv,
			Double pjsQtyWip, String pjsStatus, Boolean pjsSubassy,
			String pjsUm, Double pjsUmConv, Boolean pjsVariation,
			Date pjsModDate, String pjsModUserid, Double oidPjsMstr) {
		this.id = id;
		this.pjsSubNbr = pjsSubNbr;
		this.pjsLineDisp = pjsLineDisp;
		this.pjsLinePar = pjsLinePar;
		this.pjsLineSeq = pjsLineSeq;
		this.pjsLineSort = pjsLineSort;
		this.pjsAmtInv = pjsAmtInv;
		this.pjsBudgetType = pjsBudgetType;
		this.pjsCaIntType = pjsCaIntType;
		this.pjsCmtindx = pjsCmtindx;
		this.pjsCompleted = pjsCompleted;
		this.pjsCost = pjsCost;
		this.pjsCostActual = pjsCostActual;
		this.pjsCostIss = pjsCostIss;
		this.pjsCostWip = pjsCostWip;
		this.pjsDesc = pjsDesc;
		this.pjsDiscPct = pjsDiscPct;
		this.pjsFrozen = pjsFrozen;
		this.pjsFscCode = pjsFscCode;
		this.pjsDetailOnInv = pjsDetailOnInv;
		this.pjsPriceOnInv = pjsPriceOnInv;
		this.pjsInvLvl = pjsInvLvl;
		this.pjsInvGroup = pjsInvGroup;
		this.pjsLinkOk = pjsLinkOk;
		this.pjsListPr = pjsListPr;
		this.pjsPart = pjsPart;
		this.pjsPovarAmt = pjsPovarAmt;
		this.pjsPrice = pjsPrice;
		this.pjsProdLine = pjsProdLine;
		this.pjsQtyActual = pjsQtyActual;
		this.pjsQtyBudget = pjsQtyBudget;
		this.pjsQtyInv = pjsQtyInv;
		this.pjsQtyIss = pjsQtyIss;
		this.pjsQtyOh = pjsQtyOh;
		this.pjsQtyPlanned = pjsQtyPlanned;
		this.pjsQtySelInv = pjsQtySelInv;
		this.pjsQtyWip = pjsQtyWip;
		this.pjsStatus = pjsStatus;
		this.pjsSubassy = pjsSubassy;
		this.pjsUm = pjsUm;
		this.pjsUmConv = pjsUmConv;
		this.pjsVariation = pjsVariation;
		this.pjsModDate = pjsModDate;
		this.pjsModUserid = pjsModUserid;
		this.oidPjsMstr = oidPjsMstr;
	}

	/** full constructor */
	public AbstractPjsMstr(PjsMstrId id, Integer pjsSubNbr, String pjsLineDisp,
			Integer pjsLinePar, Integer pjsLineSeq, String pjsLineSort,
			Double pjsAmtInv, Integer pjsBudgetType, String pjsCaIntType,
			Integer pjsCmtindx, Boolean pjsCompleted, Double pjsCost,
			Double pjsCostActual, Double pjsCostIss, Double pjsCostWip,
			String pjsDesc, Double pjsDiscPct, Boolean pjsFrozen,
			String pjsFscCode, Boolean pjsDetailOnInv, Boolean pjsPriceOnInv,
			Boolean pjsInvLvl, String pjsInvGroup, Boolean pjsLinkOk,
			Double pjsListPr, String pjsPart, Double pjsPovarAmt,
			Double pjsPrice, String pjsProdLine, Double pjsQtyActual,
			Double pjsQtyBudget, Double pjsQtyInv, Double pjsQtyIss,
			Double pjsQtyOh, Double pjsQtyPlanned, Double pjsQtySelInv,
			Double pjsQtyWip, String pjsStatus, Boolean pjsSubassy,
			String pjsUm, Double pjsUmConv, Boolean pjsVariation,
			Date pjsModDate, String pjsModUserid, String pjsUser1,
			String pjsUser2, String pjsChr01, Double pjsDec01, Double pjsDec02,
			Boolean pjsLog01, Boolean pjsLog02, Date pjsDte01, Date pjsDte02,
			String pjsQadc01, String pjsQadc02, String pjsQadc03,
			Double pjsQadd01, Double pjsQadd02, Integer pjsQadi01,
			Integer pjsQadi02, Boolean pjsQadl01, Boolean pjsQadl02,
			Date pjsQadt01, Date pjsQadt02, Double oidPjsMstr) {
		this.id = id;
		this.pjsSubNbr = pjsSubNbr;
		this.pjsLineDisp = pjsLineDisp;
		this.pjsLinePar = pjsLinePar;
		this.pjsLineSeq = pjsLineSeq;
		this.pjsLineSort = pjsLineSort;
		this.pjsAmtInv = pjsAmtInv;
		this.pjsBudgetType = pjsBudgetType;
		this.pjsCaIntType = pjsCaIntType;
		this.pjsCmtindx = pjsCmtindx;
		this.pjsCompleted = pjsCompleted;
		this.pjsCost = pjsCost;
		this.pjsCostActual = pjsCostActual;
		this.pjsCostIss = pjsCostIss;
		this.pjsCostWip = pjsCostWip;
		this.pjsDesc = pjsDesc;
		this.pjsDiscPct = pjsDiscPct;
		this.pjsFrozen = pjsFrozen;
		this.pjsFscCode = pjsFscCode;
		this.pjsDetailOnInv = pjsDetailOnInv;
		this.pjsPriceOnInv = pjsPriceOnInv;
		this.pjsInvLvl = pjsInvLvl;
		this.pjsInvGroup = pjsInvGroup;
		this.pjsLinkOk = pjsLinkOk;
		this.pjsListPr = pjsListPr;
		this.pjsPart = pjsPart;
		this.pjsPovarAmt = pjsPovarAmt;
		this.pjsPrice = pjsPrice;
		this.pjsProdLine = pjsProdLine;
		this.pjsQtyActual = pjsQtyActual;
		this.pjsQtyBudget = pjsQtyBudget;
		this.pjsQtyInv = pjsQtyInv;
		this.pjsQtyIss = pjsQtyIss;
		this.pjsQtyOh = pjsQtyOh;
		this.pjsQtyPlanned = pjsQtyPlanned;
		this.pjsQtySelInv = pjsQtySelInv;
		this.pjsQtyWip = pjsQtyWip;
		this.pjsStatus = pjsStatus;
		this.pjsSubassy = pjsSubassy;
		this.pjsUm = pjsUm;
		this.pjsUmConv = pjsUmConv;
		this.pjsVariation = pjsVariation;
		this.pjsModDate = pjsModDate;
		this.pjsModUserid = pjsModUserid;
		this.pjsUser1 = pjsUser1;
		this.pjsUser2 = pjsUser2;
		this.pjsChr01 = pjsChr01;
		this.pjsDec01 = pjsDec01;
		this.pjsDec02 = pjsDec02;
		this.pjsLog01 = pjsLog01;
		this.pjsLog02 = pjsLog02;
		this.pjsDte01 = pjsDte01;
		this.pjsDte02 = pjsDte02;
		this.pjsQadc01 = pjsQadc01;
		this.pjsQadc02 = pjsQadc02;
		this.pjsQadc03 = pjsQadc03;
		this.pjsQadd01 = pjsQadd01;
		this.pjsQadd02 = pjsQadd02;
		this.pjsQadi01 = pjsQadi01;
		this.pjsQadi02 = pjsQadi02;
		this.pjsQadl01 = pjsQadl01;
		this.pjsQadl02 = pjsQadl02;
		this.pjsQadt01 = pjsQadt01;
		this.pjsQadt02 = pjsQadt02;
		this.oidPjsMstr = oidPjsMstr;
	}

	// Property accessors

	public PjsMstrId getId() {
		return this.id;
	}

	public void setId(PjsMstrId id) {
		this.id = id;
	}

	public Integer getPjsSubNbr() {
		return this.pjsSubNbr;
	}

	public void setPjsSubNbr(Integer pjsSubNbr) {
		this.pjsSubNbr = pjsSubNbr;
	}

	public String getPjsLineDisp() {
		return this.pjsLineDisp;
	}

	public void setPjsLineDisp(String pjsLineDisp) {
		this.pjsLineDisp = pjsLineDisp;
	}

	public Integer getPjsLinePar() {
		return this.pjsLinePar;
	}

	public void setPjsLinePar(Integer pjsLinePar) {
		this.pjsLinePar = pjsLinePar;
	}

	public Integer getPjsLineSeq() {
		return this.pjsLineSeq;
	}

	public void setPjsLineSeq(Integer pjsLineSeq) {
		this.pjsLineSeq = pjsLineSeq;
	}

	public String getPjsLineSort() {
		return this.pjsLineSort;
	}

	public void setPjsLineSort(String pjsLineSort) {
		this.pjsLineSort = pjsLineSort;
	}

	public Double getPjsAmtInv() {
		return this.pjsAmtInv;
	}

	public void setPjsAmtInv(Double pjsAmtInv) {
		this.pjsAmtInv = pjsAmtInv;
	}

	public Integer getPjsBudgetType() {
		return this.pjsBudgetType;
	}

	public void setPjsBudgetType(Integer pjsBudgetType) {
		this.pjsBudgetType = pjsBudgetType;
	}

	public String getPjsCaIntType() {
		return this.pjsCaIntType;
	}

	public void setPjsCaIntType(String pjsCaIntType) {
		this.pjsCaIntType = pjsCaIntType;
	}

	public Integer getPjsCmtindx() {
		return this.pjsCmtindx;
	}

	public void setPjsCmtindx(Integer pjsCmtindx) {
		this.pjsCmtindx = pjsCmtindx;
	}

	public Boolean getPjsCompleted() {
		return this.pjsCompleted;
	}

	public void setPjsCompleted(Boolean pjsCompleted) {
		this.pjsCompleted = pjsCompleted;
	}

	public Double getPjsCost() {
		return this.pjsCost;
	}

	public void setPjsCost(Double pjsCost) {
		this.pjsCost = pjsCost;
	}

	public Double getPjsCostActual() {
		return this.pjsCostActual;
	}

	public void setPjsCostActual(Double pjsCostActual) {
		this.pjsCostActual = pjsCostActual;
	}

	public Double getPjsCostIss() {
		return this.pjsCostIss;
	}

	public void setPjsCostIss(Double pjsCostIss) {
		this.pjsCostIss = pjsCostIss;
	}

	public Double getPjsCostWip() {
		return this.pjsCostWip;
	}

	public void setPjsCostWip(Double pjsCostWip) {
		this.pjsCostWip = pjsCostWip;
	}

	public String getPjsDesc() {
		return this.pjsDesc;
	}

	public void setPjsDesc(String pjsDesc) {
		this.pjsDesc = pjsDesc;
	}

	public Double getPjsDiscPct() {
		return this.pjsDiscPct;
	}

	public void setPjsDiscPct(Double pjsDiscPct) {
		this.pjsDiscPct = pjsDiscPct;
	}

	public Boolean getPjsFrozen() {
		return this.pjsFrozen;
	}

	public void setPjsFrozen(Boolean pjsFrozen) {
		this.pjsFrozen = pjsFrozen;
	}

	public String getPjsFscCode() {
		return this.pjsFscCode;
	}

	public void setPjsFscCode(String pjsFscCode) {
		this.pjsFscCode = pjsFscCode;
	}

	public Boolean getPjsDetailOnInv() {
		return this.pjsDetailOnInv;
	}

	public void setPjsDetailOnInv(Boolean pjsDetailOnInv) {
		this.pjsDetailOnInv = pjsDetailOnInv;
	}

	public Boolean getPjsPriceOnInv() {
		return this.pjsPriceOnInv;
	}

	public void setPjsPriceOnInv(Boolean pjsPriceOnInv) {
		this.pjsPriceOnInv = pjsPriceOnInv;
	}

	public Boolean getPjsInvLvl() {
		return this.pjsInvLvl;
	}

	public void setPjsInvLvl(Boolean pjsInvLvl) {
		this.pjsInvLvl = pjsInvLvl;
	}

	public String getPjsInvGroup() {
		return this.pjsInvGroup;
	}

	public void setPjsInvGroup(String pjsInvGroup) {
		this.pjsInvGroup = pjsInvGroup;
	}

	public Boolean getPjsLinkOk() {
		return this.pjsLinkOk;
	}

	public void setPjsLinkOk(Boolean pjsLinkOk) {
		this.pjsLinkOk = pjsLinkOk;
	}

	public Double getPjsListPr() {
		return this.pjsListPr;
	}

	public void setPjsListPr(Double pjsListPr) {
		this.pjsListPr = pjsListPr;
	}

	public String getPjsPart() {
		return this.pjsPart;
	}

	public void setPjsPart(String pjsPart) {
		this.pjsPart = pjsPart;
	}

	public Double getPjsPovarAmt() {
		return this.pjsPovarAmt;
	}

	public void setPjsPovarAmt(Double pjsPovarAmt) {
		this.pjsPovarAmt = pjsPovarAmt;
	}

	public Double getPjsPrice() {
		return this.pjsPrice;
	}

	public void setPjsPrice(Double pjsPrice) {
		this.pjsPrice = pjsPrice;
	}

	public String getPjsProdLine() {
		return this.pjsProdLine;
	}

	public void setPjsProdLine(String pjsProdLine) {
		this.pjsProdLine = pjsProdLine;
	}

	public Double getPjsQtyActual() {
		return this.pjsQtyActual;
	}

	public void setPjsQtyActual(Double pjsQtyActual) {
		this.pjsQtyActual = pjsQtyActual;
	}

	public Double getPjsQtyBudget() {
		return this.pjsQtyBudget;
	}

	public void setPjsQtyBudget(Double pjsQtyBudget) {
		this.pjsQtyBudget = pjsQtyBudget;
	}

	public Double getPjsQtyInv() {
		return this.pjsQtyInv;
	}

	public void setPjsQtyInv(Double pjsQtyInv) {
		this.pjsQtyInv = pjsQtyInv;
	}

	public Double getPjsQtyIss() {
		return this.pjsQtyIss;
	}

	public void setPjsQtyIss(Double pjsQtyIss) {
		this.pjsQtyIss = pjsQtyIss;
	}

	public Double getPjsQtyOh() {
		return this.pjsQtyOh;
	}

	public void setPjsQtyOh(Double pjsQtyOh) {
		this.pjsQtyOh = pjsQtyOh;
	}

	public Double getPjsQtyPlanned() {
		return this.pjsQtyPlanned;
	}

	public void setPjsQtyPlanned(Double pjsQtyPlanned) {
		this.pjsQtyPlanned = pjsQtyPlanned;
	}

	public Double getPjsQtySelInv() {
		return this.pjsQtySelInv;
	}

	public void setPjsQtySelInv(Double pjsQtySelInv) {
		this.pjsQtySelInv = pjsQtySelInv;
	}

	public Double getPjsQtyWip() {
		return this.pjsQtyWip;
	}

	public void setPjsQtyWip(Double pjsQtyWip) {
		this.pjsQtyWip = pjsQtyWip;
	}

	public String getPjsStatus() {
		return this.pjsStatus;
	}

	public void setPjsStatus(String pjsStatus) {
		this.pjsStatus = pjsStatus;
	}

	public Boolean getPjsSubassy() {
		return this.pjsSubassy;
	}

	public void setPjsSubassy(Boolean pjsSubassy) {
		this.pjsSubassy = pjsSubassy;
	}

	public String getPjsUm() {
		return this.pjsUm;
	}

	public void setPjsUm(String pjsUm) {
		this.pjsUm = pjsUm;
	}

	public Double getPjsUmConv() {
		return this.pjsUmConv;
	}

	public void setPjsUmConv(Double pjsUmConv) {
		this.pjsUmConv = pjsUmConv;
	}

	public Boolean getPjsVariation() {
		return this.pjsVariation;
	}

	public void setPjsVariation(Boolean pjsVariation) {
		this.pjsVariation = pjsVariation;
	}

	public Date getPjsModDate() {
		return this.pjsModDate;
	}

	public void setPjsModDate(Date pjsModDate) {
		this.pjsModDate = pjsModDate;
	}

	public String getPjsModUserid() {
		return this.pjsModUserid;
	}

	public void setPjsModUserid(String pjsModUserid) {
		this.pjsModUserid = pjsModUserid;
	}

	public String getPjsUser1() {
		return this.pjsUser1;
	}

	public void setPjsUser1(String pjsUser1) {
		this.pjsUser1 = pjsUser1;
	}

	public String getPjsUser2() {
		return this.pjsUser2;
	}

	public void setPjsUser2(String pjsUser2) {
		this.pjsUser2 = pjsUser2;
	}

	public String getPjsChr01() {
		return this.pjsChr01;
	}

	public void setPjsChr01(String pjsChr01) {
		this.pjsChr01 = pjsChr01;
	}

	public Double getPjsDec01() {
		return this.pjsDec01;
	}

	public void setPjsDec01(Double pjsDec01) {
		this.pjsDec01 = pjsDec01;
	}

	public Double getPjsDec02() {
		return this.pjsDec02;
	}

	public void setPjsDec02(Double pjsDec02) {
		this.pjsDec02 = pjsDec02;
	}

	public Boolean getPjsLog01() {
		return this.pjsLog01;
	}

	public void setPjsLog01(Boolean pjsLog01) {
		this.pjsLog01 = pjsLog01;
	}

	public Boolean getPjsLog02() {
		return this.pjsLog02;
	}

	public void setPjsLog02(Boolean pjsLog02) {
		this.pjsLog02 = pjsLog02;
	}

	public Date getPjsDte01() {
		return this.pjsDte01;
	}

	public void setPjsDte01(Date pjsDte01) {
		this.pjsDte01 = pjsDte01;
	}

	public Date getPjsDte02() {
		return this.pjsDte02;
	}

	public void setPjsDte02(Date pjsDte02) {
		this.pjsDte02 = pjsDte02;
	}

	public String getPjsQadc01() {
		return this.pjsQadc01;
	}

	public void setPjsQadc01(String pjsQadc01) {
		this.pjsQadc01 = pjsQadc01;
	}

	public String getPjsQadc02() {
		return this.pjsQadc02;
	}

	public void setPjsQadc02(String pjsQadc02) {
		this.pjsQadc02 = pjsQadc02;
	}

	public String getPjsQadc03() {
		return this.pjsQadc03;
	}

	public void setPjsQadc03(String pjsQadc03) {
		this.pjsQadc03 = pjsQadc03;
	}

	public Double getPjsQadd01() {
		return this.pjsQadd01;
	}

	public void setPjsQadd01(Double pjsQadd01) {
		this.pjsQadd01 = pjsQadd01;
	}

	public Double getPjsQadd02() {
		return this.pjsQadd02;
	}

	public void setPjsQadd02(Double pjsQadd02) {
		this.pjsQadd02 = pjsQadd02;
	}

	public Integer getPjsQadi01() {
		return this.pjsQadi01;
	}

	public void setPjsQadi01(Integer pjsQadi01) {
		this.pjsQadi01 = pjsQadi01;
	}

	public Integer getPjsQadi02() {
		return this.pjsQadi02;
	}

	public void setPjsQadi02(Integer pjsQadi02) {
		this.pjsQadi02 = pjsQadi02;
	}

	public Boolean getPjsQadl01() {
		return this.pjsQadl01;
	}

	public void setPjsQadl01(Boolean pjsQadl01) {
		this.pjsQadl01 = pjsQadl01;
	}

	public Boolean getPjsQadl02() {
		return this.pjsQadl02;
	}

	public void setPjsQadl02(Boolean pjsQadl02) {
		this.pjsQadl02 = pjsQadl02;
	}

	public Date getPjsQadt01() {
		return this.pjsQadt01;
	}

	public void setPjsQadt01(Date pjsQadt01) {
		this.pjsQadt01 = pjsQadt01;
	}

	public Date getPjsQadt02() {
		return this.pjsQadt02;
	}

	public void setPjsQadt02(Date pjsQadt02) {
		this.pjsQadt02 = pjsQadt02;
	}

	public Double getOidPjsMstr() {
		return this.oidPjsMstr;
	}

	public void setOidPjsMstr(Double oidPjsMstr) {
		this.oidPjsMstr = oidPjsMstr;
	}

}