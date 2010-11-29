package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPjcCtrl entity provides the base persistence definition of the
 * PjcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjcCtrl implements java.io.Serializable {

	// Fields

	private String pjcDomain;
	private Integer pjcQadi02;
	private Boolean pjcAutoMo;
	private Double pjcBgAbove;
	private Double pjcBgBelow;
	private String pjcDfltQue;
	private Boolean pjcGlobalInv;
	private Integer pjcHoldLevel;
	private Boolean pjcHcmmts;
	private Boolean pjcScmmts;
	private Boolean pjcLcmmts;
	private Boolean pjcPaocmmts;
	private String pjcOpenStatus;
	private String pjcHoldStatus;
	private String pjcCompStatus;
	private String pjcCloseStatus;
	private Integer pjcPaoNbr;
	private String pjcPaoPre;
	private String pjcPaoOpen;
	private String pjcPaoHold;
	private String pjcPaoComplete;
	private String pjcPaoClose;
	private String pjcPaoCancel;
	private Boolean pjcParDetail;
	private String pjcParReturn;
	private String pjcParScrap;
	private String pjcPjType;
	private Boolean pjcPjsHist;
	private Integer pjcPrjNbr;
	private String pjcPrjPre;
	private String pjcPrjSite;
	private Boolean pjcPrRollup;
	private Boolean pjcPsInWip;
	private Boolean pjcPtProd;
	private Boolean pjcSchedulePao;
	private Integer pjcSoNbr;
	private String pjcSoPre;
	private Boolean pjcSubDet;
	private Boolean pjcUseBudgets;
	private Boolean pjcUsePayRate;
	private Date pjcModDate;
	private String pjcModUserid;
	private String pjcUser1;
	private String pjcUser2;
	private Boolean pjcLog01;
	private Boolean pjcLog02;
	private String pjcQadc01;
	private String pjcQadc02;
	private Double pjcQadd01;
	private Integer pjcQadi01;
	private Boolean pjcQadl01;
	private Boolean pjcQadl02;
	private Date pjcQadt01;
	private Boolean pjcParLaborSt;
	private Double oidPjcCtrl;

	// Constructors

	/** default constructor */
	public AbstractPjcCtrl() {
	}

	/** minimal constructor */
	public AbstractPjcCtrl(Integer pjcQadi02, Boolean pjcAutoMo,
			Double pjcBgAbove, Double pjcBgBelow, String pjcDfltQue,
			Boolean pjcGlobalInv, Integer pjcHoldLevel, Boolean pjcHcmmts,
			Boolean pjcScmmts, Boolean pjcLcmmts, Boolean pjcPaocmmts,
			String pjcOpenStatus, String pjcHoldStatus, String pjcCompStatus,
			String pjcCloseStatus, Integer pjcPaoNbr, String pjcPaoPre,
			String pjcPaoOpen, String pjcPaoHold, String pjcPaoComplete,
			String pjcPaoClose, String pjcPaoCancel, Boolean pjcParDetail,
			String pjcParReturn, String pjcParScrap, String pjcPjType,
			Boolean pjcPjsHist, Integer pjcPrjNbr, String pjcPrjPre,
			String pjcPrjSite, Boolean pjcPrRollup, Boolean pjcPsInWip,
			Boolean pjcPtProd, Boolean pjcSchedulePao, Integer pjcSoNbr,
			String pjcSoPre, Boolean pjcSubDet, Boolean pjcUseBudgets,
			Boolean pjcUsePayRate, Date pjcModDate, String pjcModUserid,
			Boolean pjcParLaborSt, Double oidPjcCtrl) {
		this.pjcQadi02 = pjcQadi02;
		this.pjcAutoMo = pjcAutoMo;
		this.pjcBgAbove = pjcBgAbove;
		this.pjcBgBelow = pjcBgBelow;
		this.pjcDfltQue = pjcDfltQue;
		this.pjcGlobalInv = pjcGlobalInv;
		this.pjcHoldLevel = pjcHoldLevel;
		this.pjcHcmmts = pjcHcmmts;
		this.pjcScmmts = pjcScmmts;
		this.pjcLcmmts = pjcLcmmts;
		this.pjcPaocmmts = pjcPaocmmts;
		this.pjcOpenStatus = pjcOpenStatus;
		this.pjcHoldStatus = pjcHoldStatus;
		this.pjcCompStatus = pjcCompStatus;
		this.pjcCloseStatus = pjcCloseStatus;
		this.pjcPaoNbr = pjcPaoNbr;
		this.pjcPaoPre = pjcPaoPre;
		this.pjcPaoOpen = pjcPaoOpen;
		this.pjcPaoHold = pjcPaoHold;
		this.pjcPaoComplete = pjcPaoComplete;
		this.pjcPaoClose = pjcPaoClose;
		this.pjcPaoCancel = pjcPaoCancel;
		this.pjcParDetail = pjcParDetail;
		this.pjcParReturn = pjcParReturn;
		this.pjcParScrap = pjcParScrap;
		this.pjcPjType = pjcPjType;
		this.pjcPjsHist = pjcPjsHist;
		this.pjcPrjNbr = pjcPrjNbr;
		this.pjcPrjPre = pjcPrjPre;
		this.pjcPrjSite = pjcPrjSite;
		this.pjcPrRollup = pjcPrRollup;
		this.pjcPsInWip = pjcPsInWip;
		this.pjcPtProd = pjcPtProd;
		this.pjcSchedulePao = pjcSchedulePao;
		this.pjcSoNbr = pjcSoNbr;
		this.pjcSoPre = pjcSoPre;
		this.pjcSubDet = pjcSubDet;
		this.pjcUseBudgets = pjcUseBudgets;
		this.pjcUsePayRate = pjcUsePayRate;
		this.pjcModDate = pjcModDate;
		this.pjcModUserid = pjcModUserid;
		this.pjcParLaborSt = pjcParLaborSt;
		this.oidPjcCtrl = oidPjcCtrl;
	}

	/** full constructor */
	public AbstractPjcCtrl(Integer pjcQadi02, Boolean pjcAutoMo,
			Double pjcBgAbove, Double pjcBgBelow, String pjcDfltQue,
			Boolean pjcGlobalInv, Integer pjcHoldLevel, Boolean pjcHcmmts,
			Boolean pjcScmmts, Boolean pjcLcmmts, Boolean pjcPaocmmts,
			String pjcOpenStatus, String pjcHoldStatus, String pjcCompStatus,
			String pjcCloseStatus, Integer pjcPaoNbr, String pjcPaoPre,
			String pjcPaoOpen, String pjcPaoHold, String pjcPaoComplete,
			String pjcPaoClose, String pjcPaoCancel, Boolean pjcParDetail,
			String pjcParReturn, String pjcParScrap, String pjcPjType,
			Boolean pjcPjsHist, Integer pjcPrjNbr, String pjcPrjPre,
			String pjcPrjSite, Boolean pjcPrRollup, Boolean pjcPsInWip,
			Boolean pjcPtProd, Boolean pjcSchedulePao, Integer pjcSoNbr,
			String pjcSoPre, Boolean pjcSubDet, Boolean pjcUseBudgets,
			Boolean pjcUsePayRate, Date pjcModDate, String pjcModUserid,
			String pjcUser1, String pjcUser2, Boolean pjcLog01,
			Boolean pjcLog02, String pjcQadc01, String pjcQadc02,
			Double pjcQadd01, Integer pjcQadi01, Boolean pjcQadl01,
			Boolean pjcQadl02, Date pjcQadt01, Boolean pjcParLaborSt,
			Double oidPjcCtrl) {
		this.pjcQadi02 = pjcQadi02;
		this.pjcAutoMo = pjcAutoMo;
		this.pjcBgAbove = pjcBgAbove;
		this.pjcBgBelow = pjcBgBelow;
		this.pjcDfltQue = pjcDfltQue;
		this.pjcGlobalInv = pjcGlobalInv;
		this.pjcHoldLevel = pjcHoldLevel;
		this.pjcHcmmts = pjcHcmmts;
		this.pjcScmmts = pjcScmmts;
		this.pjcLcmmts = pjcLcmmts;
		this.pjcPaocmmts = pjcPaocmmts;
		this.pjcOpenStatus = pjcOpenStatus;
		this.pjcHoldStatus = pjcHoldStatus;
		this.pjcCompStatus = pjcCompStatus;
		this.pjcCloseStatus = pjcCloseStatus;
		this.pjcPaoNbr = pjcPaoNbr;
		this.pjcPaoPre = pjcPaoPre;
		this.pjcPaoOpen = pjcPaoOpen;
		this.pjcPaoHold = pjcPaoHold;
		this.pjcPaoComplete = pjcPaoComplete;
		this.pjcPaoClose = pjcPaoClose;
		this.pjcPaoCancel = pjcPaoCancel;
		this.pjcParDetail = pjcParDetail;
		this.pjcParReturn = pjcParReturn;
		this.pjcParScrap = pjcParScrap;
		this.pjcPjType = pjcPjType;
		this.pjcPjsHist = pjcPjsHist;
		this.pjcPrjNbr = pjcPrjNbr;
		this.pjcPrjPre = pjcPrjPre;
		this.pjcPrjSite = pjcPrjSite;
		this.pjcPrRollup = pjcPrRollup;
		this.pjcPsInWip = pjcPsInWip;
		this.pjcPtProd = pjcPtProd;
		this.pjcSchedulePao = pjcSchedulePao;
		this.pjcSoNbr = pjcSoNbr;
		this.pjcSoPre = pjcSoPre;
		this.pjcSubDet = pjcSubDet;
		this.pjcUseBudgets = pjcUseBudgets;
		this.pjcUsePayRate = pjcUsePayRate;
		this.pjcModDate = pjcModDate;
		this.pjcModUserid = pjcModUserid;
		this.pjcUser1 = pjcUser1;
		this.pjcUser2 = pjcUser2;
		this.pjcLog01 = pjcLog01;
		this.pjcLog02 = pjcLog02;
		this.pjcQadc01 = pjcQadc01;
		this.pjcQadc02 = pjcQadc02;
		this.pjcQadd01 = pjcQadd01;
		this.pjcQadi01 = pjcQadi01;
		this.pjcQadl01 = pjcQadl01;
		this.pjcQadl02 = pjcQadl02;
		this.pjcQadt01 = pjcQadt01;
		this.pjcParLaborSt = pjcParLaborSt;
		this.oidPjcCtrl = oidPjcCtrl;
	}

	// Property accessors

	public String getPjcDomain() {
		return this.pjcDomain;
	}

	public void setPjcDomain(String pjcDomain) {
		this.pjcDomain = pjcDomain;
	}

	public Integer getPjcQadi02() {
		return this.pjcQadi02;
	}

	public void setPjcQadi02(Integer pjcQadi02) {
		this.pjcQadi02 = pjcQadi02;
	}

	public Boolean getPjcAutoMo() {
		return this.pjcAutoMo;
	}

	public void setPjcAutoMo(Boolean pjcAutoMo) {
		this.pjcAutoMo = pjcAutoMo;
	}

	public Double getPjcBgAbove() {
		return this.pjcBgAbove;
	}

	public void setPjcBgAbove(Double pjcBgAbove) {
		this.pjcBgAbove = pjcBgAbove;
	}

	public Double getPjcBgBelow() {
		return this.pjcBgBelow;
	}

	public void setPjcBgBelow(Double pjcBgBelow) {
		this.pjcBgBelow = pjcBgBelow;
	}

	public String getPjcDfltQue() {
		return this.pjcDfltQue;
	}

	public void setPjcDfltQue(String pjcDfltQue) {
		this.pjcDfltQue = pjcDfltQue;
	}

	public Boolean getPjcGlobalInv() {
		return this.pjcGlobalInv;
	}

	public void setPjcGlobalInv(Boolean pjcGlobalInv) {
		this.pjcGlobalInv = pjcGlobalInv;
	}

	public Integer getPjcHoldLevel() {
		return this.pjcHoldLevel;
	}

	public void setPjcHoldLevel(Integer pjcHoldLevel) {
		this.pjcHoldLevel = pjcHoldLevel;
	}

	public Boolean getPjcHcmmts() {
		return this.pjcHcmmts;
	}

	public void setPjcHcmmts(Boolean pjcHcmmts) {
		this.pjcHcmmts = pjcHcmmts;
	}

	public Boolean getPjcScmmts() {
		return this.pjcScmmts;
	}

	public void setPjcScmmts(Boolean pjcScmmts) {
		this.pjcScmmts = pjcScmmts;
	}

	public Boolean getPjcLcmmts() {
		return this.pjcLcmmts;
	}

	public void setPjcLcmmts(Boolean pjcLcmmts) {
		this.pjcLcmmts = pjcLcmmts;
	}

	public Boolean getPjcPaocmmts() {
		return this.pjcPaocmmts;
	}

	public void setPjcPaocmmts(Boolean pjcPaocmmts) {
		this.pjcPaocmmts = pjcPaocmmts;
	}

	public String getPjcOpenStatus() {
		return this.pjcOpenStatus;
	}

	public void setPjcOpenStatus(String pjcOpenStatus) {
		this.pjcOpenStatus = pjcOpenStatus;
	}

	public String getPjcHoldStatus() {
		return this.pjcHoldStatus;
	}

	public void setPjcHoldStatus(String pjcHoldStatus) {
		this.pjcHoldStatus = pjcHoldStatus;
	}

	public String getPjcCompStatus() {
		return this.pjcCompStatus;
	}

	public void setPjcCompStatus(String pjcCompStatus) {
		this.pjcCompStatus = pjcCompStatus;
	}

	public String getPjcCloseStatus() {
		return this.pjcCloseStatus;
	}

	public void setPjcCloseStatus(String pjcCloseStatus) {
		this.pjcCloseStatus = pjcCloseStatus;
	}

	public Integer getPjcPaoNbr() {
		return this.pjcPaoNbr;
	}

	public void setPjcPaoNbr(Integer pjcPaoNbr) {
		this.pjcPaoNbr = pjcPaoNbr;
	}

	public String getPjcPaoPre() {
		return this.pjcPaoPre;
	}

	public void setPjcPaoPre(String pjcPaoPre) {
		this.pjcPaoPre = pjcPaoPre;
	}

	public String getPjcPaoOpen() {
		return this.pjcPaoOpen;
	}

	public void setPjcPaoOpen(String pjcPaoOpen) {
		this.pjcPaoOpen = pjcPaoOpen;
	}

	public String getPjcPaoHold() {
		return this.pjcPaoHold;
	}

	public void setPjcPaoHold(String pjcPaoHold) {
		this.pjcPaoHold = pjcPaoHold;
	}

	public String getPjcPaoComplete() {
		return this.pjcPaoComplete;
	}

	public void setPjcPaoComplete(String pjcPaoComplete) {
		this.pjcPaoComplete = pjcPaoComplete;
	}

	public String getPjcPaoClose() {
		return this.pjcPaoClose;
	}

	public void setPjcPaoClose(String pjcPaoClose) {
		this.pjcPaoClose = pjcPaoClose;
	}

	public String getPjcPaoCancel() {
		return this.pjcPaoCancel;
	}

	public void setPjcPaoCancel(String pjcPaoCancel) {
		this.pjcPaoCancel = pjcPaoCancel;
	}

	public Boolean getPjcParDetail() {
		return this.pjcParDetail;
	}

	public void setPjcParDetail(Boolean pjcParDetail) {
		this.pjcParDetail = pjcParDetail;
	}

	public String getPjcParReturn() {
		return this.pjcParReturn;
	}

	public void setPjcParReturn(String pjcParReturn) {
		this.pjcParReturn = pjcParReturn;
	}

	public String getPjcParScrap() {
		return this.pjcParScrap;
	}

	public void setPjcParScrap(String pjcParScrap) {
		this.pjcParScrap = pjcParScrap;
	}

	public String getPjcPjType() {
		return this.pjcPjType;
	}

	public void setPjcPjType(String pjcPjType) {
		this.pjcPjType = pjcPjType;
	}

	public Boolean getPjcPjsHist() {
		return this.pjcPjsHist;
	}

	public void setPjcPjsHist(Boolean pjcPjsHist) {
		this.pjcPjsHist = pjcPjsHist;
	}

	public Integer getPjcPrjNbr() {
		return this.pjcPrjNbr;
	}

	public void setPjcPrjNbr(Integer pjcPrjNbr) {
		this.pjcPrjNbr = pjcPrjNbr;
	}

	public String getPjcPrjPre() {
		return this.pjcPrjPre;
	}

	public void setPjcPrjPre(String pjcPrjPre) {
		this.pjcPrjPre = pjcPrjPre;
	}

	public String getPjcPrjSite() {
		return this.pjcPrjSite;
	}

	public void setPjcPrjSite(String pjcPrjSite) {
		this.pjcPrjSite = pjcPrjSite;
	}

	public Boolean getPjcPrRollup() {
		return this.pjcPrRollup;
	}

	public void setPjcPrRollup(Boolean pjcPrRollup) {
		this.pjcPrRollup = pjcPrRollup;
	}

	public Boolean getPjcPsInWip() {
		return this.pjcPsInWip;
	}

	public void setPjcPsInWip(Boolean pjcPsInWip) {
		this.pjcPsInWip = pjcPsInWip;
	}

	public Boolean getPjcPtProd() {
		return this.pjcPtProd;
	}

	public void setPjcPtProd(Boolean pjcPtProd) {
		this.pjcPtProd = pjcPtProd;
	}

	public Boolean getPjcSchedulePao() {
		return this.pjcSchedulePao;
	}

	public void setPjcSchedulePao(Boolean pjcSchedulePao) {
		this.pjcSchedulePao = pjcSchedulePao;
	}

	public Integer getPjcSoNbr() {
		return this.pjcSoNbr;
	}

	public void setPjcSoNbr(Integer pjcSoNbr) {
		this.pjcSoNbr = pjcSoNbr;
	}

	public String getPjcSoPre() {
		return this.pjcSoPre;
	}

	public void setPjcSoPre(String pjcSoPre) {
		this.pjcSoPre = pjcSoPre;
	}

	public Boolean getPjcSubDet() {
		return this.pjcSubDet;
	}

	public void setPjcSubDet(Boolean pjcSubDet) {
		this.pjcSubDet = pjcSubDet;
	}

	public Boolean getPjcUseBudgets() {
		return this.pjcUseBudgets;
	}

	public void setPjcUseBudgets(Boolean pjcUseBudgets) {
		this.pjcUseBudgets = pjcUseBudgets;
	}

	public Boolean getPjcUsePayRate() {
		return this.pjcUsePayRate;
	}

	public void setPjcUsePayRate(Boolean pjcUsePayRate) {
		this.pjcUsePayRate = pjcUsePayRate;
	}

	public Date getPjcModDate() {
		return this.pjcModDate;
	}

	public void setPjcModDate(Date pjcModDate) {
		this.pjcModDate = pjcModDate;
	}

	public String getPjcModUserid() {
		return this.pjcModUserid;
	}

	public void setPjcModUserid(String pjcModUserid) {
		this.pjcModUserid = pjcModUserid;
	}

	public String getPjcUser1() {
		return this.pjcUser1;
	}

	public void setPjcUser1(String pjcUser1) {
		this.pjcUser1 = pjcUser1;
	}

	public String getPjcUser2() {
		return this.pjcUser2;
	}

	public void setPjcUser2(String pjcUser2) {
		this.pjcUser2 = pjcUser2;
	}

	public Boolean getPjcLog01() {
		return this.pjcLog01;
	}

	public void setPjcLog01(Boolean pjcLog01) {
		this.pjcLog01 = pjcLog01;
	}

	public Boolean getPjcLog02() {
		return this.pjcLog02;
	}

	public void setPjcLog02(Boolean pjcLog02) {
		this.pjcLog02 = pjcLog02;
	}

	public String getPjcQadc01() {
		return this.pjcQadc01;
	}

	public void setPjcQadc01(String pjcQadc01) {
		this.pjcQadc01 = pjcQadc01;
	}

	public String getPjcQadc02() {
		return this.pjcQadc02;
	}

	public void setPjcQadc02(String pjcQadc02) {
		this.pjcQadc02 = pjcQadc02;
	}

	public Double getPjcQadd01() {
		return this.pjcQadd01;
	}

	public void setPjcQadd01(Double pjcQadd01) {
		this.pjcQadd01 = pjcQadd01;
	}

	public Integer getPjcQadi01() {
		return this.pjcQadi01;
	}

	public void setPjcQadi01(Integer pjcQadi01) {
		this.pjcQadi01 = pjcQadi01;
	}

	public Boolean getPjcQadl01() {
		return this.pjcQadl01;
	}

	public void setPjcQadl01(Boolean pjcQadl01) {
		this.pjcQadl01 = pjcQadl01;
	}

	public Boolean getPjcQadl02() {
		return this.pjcQadl02;
	}

	public void setPjcQadl02(Boolean pjcQadl02) {
		this.pjcQadl02 = pjcQadl02;
	}

	public Date getPjcQadt01() {
		return this.pjcQadt01;
	}

	public void setPjcQadt01(Date pjcQadt01) {
		this.pjcQadt01 = pjcQadt01;
	}

	public Boolean getPjcParLaborSt() {
		return this.pjcParLaborSt;
	}

	public void setPjcParLaborSt(Boolean pjcParLaborSt) {
		this.pjcParLaborSt = pjcParLaborSt;
	}

	public Double getOidPjcCtrl() {
		return this.oidPjcCtrl;
	}

	public void setOidPjcCtrl(Double oidPjcCtrl) {
		this.oidPjcCtrl = oidPjcCtrl;
	}

}