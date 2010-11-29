package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbismDet entity provides the base persistence definition of the
 * KnbismDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbismDet implements java.io.Serializable {

	// Fields

	private KnbismDetId id;
	private Double knbismKnbiKeyid;
	private Double knbismKnbsmKeyid;
	private Double knbismWorkingBuffer;
	private Double knbismMaxBuf;
	private Date knbismBufLimitChg;
	private String knbismBufLimitDisp;
	private String knbismBufMethod;
	private Boolean knbismBufModified;
	private Double knbismCriticalLimit;
	private Double knbismWarningLimit;
	private Double knbismDailyDemand;
	private String knbismDemandMethod;
	private Boolean knbismDemandModified;
	private Double knbismDemandPct;
	private Double knbismVarFactor;
	private String knbismTemplateUsed;
	private Double knbismPackQty;
	private String knbismPackType;
	private Double knbismOrderPoint;
	private String knbismSsMethod;
	private Double knbismSafetyStock;
	private Double knbismSafetyTime;
	private Double knbismSsTotalQty;
	private Integer knbismPeakPeriod;
	private Double knbismServiceLevel;
	private String knbismDestFax;
	private String knbismDestFax2;
	private String knbismDestEmail;
	private Date knbismModDate;
	private String knbismModUserid;
	private String knbismUser1;
	private String knbismUser2;
	private String knbismQadc01;
	private String knbismQadc02;
	private Integer knbismAvgInvMethod;
	private String knbismSsTemplate;
	private Double knbismCountTolerance;
	private Double knbismLagFactor;
	private Double oidKnbismDet;

	// Constructors

	/** default constructor */
	public AbstractKnbismDet() {
	}

	/** minimal constructor */
	public AbstractKnbismDet(KnbismDetId id, Double knbismKnbiKeyid,
			Double knbismKnbsmKeyid, Double knbismWorkingBuffer,
			Double knbismMaxBuf, String knbismBufLimitDisp,
			String knbismBufMethod, Boolean knbismBufModified,
			Double knbismCriticalLimit, Double knbismWarningLimit,
			Double knbismDailyDemand, String knbismDemandMethod,
			Boolean knbismDemandModified, Double knbismDemandPct,
			Double knbismVarFactor, String knbismTemplateUsed,
			Double knbismPackQty, String knbismPackType,
			Double knbismOrderPoint, String knbismSsMethod,
			Double knbismSafetyStock, Double knbismSafetyTime,
			Double knbismSsTotalQty, Integer knbismPeakPeriod,
			Double knbismServiceLevel, String knbismDestFax,
			String knbismDestFax2, String knbismDestEmail, Date knbismModDate,
			String knbismModUserid, String knbismUser1, String knbismUser2,
			String knbismQadc01, String knbismQadc02,
			Integer knbismAvgInvMethod, String knbismSsTemplate,
			Double knbismCountTolerance, Double knbismLagFactor,
			Double oidKnbismDet) {
		this.id = id;
		this.knbismKnbiKeyid = knbismKnbiKeyid;
		this.knbismKnbsmKeyid = knbismKnbsmKeyid;
		this.knbismWorkingBuffer = knbismWorkingBuffer;
		this.knbismMaxBuf = knbismMaxBuf;
		this.knbismBufLimitDisp = knbismBufLimitDisp;
		this.knbismBufMethod = knbismBufMethod;
		this.knbismBufModified = knbismBufModified;
		this.knbismCriticalLimit = knbismCriticalLimit;
		this.knbismWarningLimit = knbismWarningLimit;
		this.knbismDailyDemand = knbismDailyDemand;
		this.knbismDemandMethod = knbismDemandMethod;
		this.knbismDemandModified = knbismDemandModified;
		this.knbismDemandPct = knbismDemandPct;
		this.knbismVarFactor = knbismVarFactor;
		this.knbismTemplateUsed = knbismTemplateUsed;
		this.knbismPackQty = knbismPackQty;
		this.knbismPackType = knbismPackType;
		this.knbismOrderPoint = knbismOrderPoint;
		this.knbismSsMethod = knbismSsMethod;
		this.knbismSafetyStock = knbismSafetyStock;
		this.knbismSafetyTime = knbismSafetyTime;
		this.knbismSsTotalQty = knbismSsTotalQty;
		this.knbismPeakPeriod = knbismPeakPeriod;
		this.knbismServiceLevel = knbismServiceLevel;
		this.knbismDestFax = knbismDestFax;
		this.knbismDestFax2 = knbismDestFax2;
		this.knbismDestEmail = knbismDestEmail;
		this.knbismModDate = knbismModDate;
		this.knbismModUserid = knbismModUserid;
		this.knbismUser1 = knbismUser1;
		this.knbismUser2 = knbismUser2;
		this.knbismQadc01 = knbismQadc01;
		this.knbismQadc02 = knbismQadc02;
		this.knbismAvgInvMethod = knbismAvgInvMethod;
		this.knbismSsTemplate = knbismSsTemplate;
		this.knbismCountTolerance = knbismCountTolerance;
		this.knbismLagFactor = knbismLagFactor;
		this.oidKnbismDet = oidKnbismDet;
	}

	/** full constructor */
	public AbstractKnbismDet(KnbismDetId id, Double knbismKnbiKeyid,
			Double knbismKnbsmKeyid, Double knbismWorkingBuffer,
			Double knbismMaxBuf, Date knbismBufLimitChg,
			String knbismBufLimitDisp, String knbismBufMethod,
			Boolean knbismBufModified, Double knbismCriticalLimit,
			Double knbismWarningLimit, Double knbismDailyDemand,
			String knbismDemandMethod, Boolean knbismDemandModified,
			Double knbismDemandPct, Double knbismVarFactor,
			String knbismTemplateUsed, Double knbismPackQty,
			String knbismPackType, Double knbismOrderPoint,
			String knbismSsMethod, Double knbismSafetyStock,
			Double knbismSafetyTime, Double knbismSsTotalQty,
			Integer knbismPeakPeriod, Double knbismServiceLevel,
			String knbismDestFax, String knbismDestFax2,
			String knbismDestEmail, Date knbismModDate, String knbismModUserid,
			String knbismUser1, String knbismUser2, String knbismQadc01,
			String knbismQadc02, Integer knbismAvgInvMethod,
			String knbismSsTemplate, Double knbismCountTolerance,
			Double knbismLagFactor, Double oidKnbismDet) {
		this.id = id;
		this.knbismKnbiKeyid = knbismKnbiKeyid;
		this.knbismKnbsmKeyid = knbismKnbsmKeyid;
		this.knbismWorkingBuffer = knbismWorkingBuffer;
		this.knbismMaxBuf = knbismMaxBuf;
		this.knbismBufLimitChg = knbismBufLimitChg;
		this.knbismBufLimitDisp = knbismBufLimitDisp;
		this.knbismBufMethod = knbismBufMethod;
		this.knbismBufModified = knbismBufModified;
		this.knbismCriticalLimit = knbismCriticalLimit;
		this.knbismWarningLimit = knbismWarningLimit;
		this.knbismDailyDemand = knbismDailyDemand;
		this.knbismDemandMethod = knbismDemandMethod;
		this.knbismDemandModified = knbismDemandModified;
		this.knbismDemandPct = knbismDemandPct;
		this.knbismVarFactor = knbismVarFactor;
		this.knbismTemplateUsed = knbismTemplateUsed;
		this.knbismPackQty = knbismPackQty;
		this.knbismPackType = knbismPackType;
		this.knbismOrderPoint = knbismOrderPoint;
		this.knbismSsMethod = knbismSsMethod;
		this.knbismSafetyStock = knbismSafetyStock;
		this.knbismSafetyTime = knbismSafetyTime;
		this.knbismSsTotalQty = knbismSsTotalQty;
		this.knbismPeakPeriod = knbismPeakPeriod;
		this.knbismServiceLevel = knbismServiceLevel;
		this.knbismDestFax = knbismDestFax;
		this.knbismDestFax2 = knbismDestFax2;
		this.knbismDestEmail = knbismDestEmail;
		this.knbismModDate = knbismModDate;
		this.knbismModUserid = knbismModUserid;
		this.knbismUser1 = knbismUser1;
		this.knbismUser2 = knbismUser2;
		this.knbismQadc01 = knbismQadc01;
		this.knbismQadc02 = knbismQadc02;
		this.knbismAvgInvMethod = knbismAvgInvMethod;
		this.knbismSsTemplate = knbismSsTemplate;
		this.knbismCountTolerance = knbismCountTolerance;
		this.knbismLagFactor = knbismLagFactor;
		this.oidKnbismDet = oidKnbismDet;
	}

	// Property accessors

	public KnbismDetId getId() {
		return this.id;
	}

	public void setId(KnbismDetId id) {
		this.id = id;
	}

	public Double getKnbismKnbiKeyid() {
		return this.knbismKnbiKeyid;
	}

	public void setKnbismKnbiKeyid(Double knbismKnbiKeyid) {
		this.knbismKnbiKeyid = knbismKnbiKeyid;
	}

	public Double getKnbismKnbsmKeyid() {
		return this.knbismKnbsmKeyid;
	}

	public void setKnbismKnbsmKeyid(Double knbismKnbsmKeyid) {
		this.knbismKnbsmKeyid = knbismKnbsmKeyid;
	}

	public Double getKnbismWorkingBuffer() {
		return this.knbismWorkingBuffer;
	}

	public void setKnbismWorkingBuffer(Double knbismWorkingBuffer) {
		this.knbismWorkingBuffer = knbismWorkingBuffer;
	}

	public Double getKnbismMaxBuf() {
		return this.knbismMaxBuf;
	}

	public void setKnbismMaxBuf(Double knbismMaxBuf) {
		this.knbismMaxBuf = knbismMaxBuf;
	}

	public Date getKnbismBufLimitChg() {
		return this.knbismBufLimitChg;
	}

	public void setKnbismBufLimitChg(Date knbismBufLimitChg) {
		this.knbismBufLimitChg = knbismBufLimitChg;
	}

	public String getKnbismBufLimitDisp() {
		return this.knbismBufLimitDisp;
	}

	public void setKnbismBufLimitDisp(String knbismBufLimitDisp) {
		this.knbismBufLimitDisp = knbismBufLimitDisp;
	}

	public String getKnbismBufMethod() {
		return this.knbismBufMethod;
	}

	public void setKnbismBufMethod(String knbismBufMethod) {
		this.knbismBufMethod = knbismBufMethod;
	}

	public Boolean getKnbismBufModified() {
		return this.knbismBufModified;
	}

	public void setKnbismBufModified(Boolean knbismBufModified) {
		this.knbismBufModified = knbismBufModified;
	}

	public Double getKnbismCriticalLimit() {
		return this.knbismCriticalLimit;
	}

	public void setKnbismCriticalLimit(Double knbismCriticalLimit) {
		this.knbismCriticalLimit = knbismCriticalLimit;
	}

	public Double getKnbismWarningLimit() {
		return this.knbismWarningLimit;
	}

	public void setKnbismWarningLimit(Double knbismWarningLimit) {
		this.knbismWarningLimit = knbismWarningLimit;
	}

	public Double getKnbismDailyDemand() {
		return this.knbismDailyDemand;
	}

	public void setKnbismDailyDemand(Double knbismDailyDemand) {
		this.knbismDailyDemand = knbismDailyDemand;
	}

	public String getKnbismDemandMethod() {
		return this.knbismDemandMethod;
	}

	public void setKnbismDemandMethod(String knbismDemandMethod) {
		this.knbismDemandMethod = knbismDemandMethod;
	}

	public Boolean getKnbismDemandModified() {
		return this.knbismDemandModified;
	}

	public void setKnbismDemandModified(Boolean knbismDemandModified) {
		this.knbismDemandModified = knbismDemandModified;
	}

	public Double getKnbismDemandPct() {
		return this.knbismDemandPct;
	}

	public void setKnbismDemandPct(Double knbismDemandPct) {
		this.knbismDemandPct = knbismDemandPct;
	}

	public Double getKnbismVarFactor() {
		return this.knbismVarFactor;
	}

	public void setKnbismVarFactor(Double knbismVarFactor) {
		this.knbismVarFactor = knbismVarFactor;
	}

	public String getKnbismTemplateUsed() {
		return this.knbismTemplateUsed;
	}

	public void setKnbismTemplateUsed(String knbismTemplateUsed) {
		this.knbismTemplateUsed = knbismTemplateUsed;
	}

	public Double getKnbismPackQty() {
		return this.knbismPackQty;
	}

	public void setKnbismPackQty(Double knbismPackQty) {
		this.knbismPackQty = knbismPackQty;
	}

	public String getKnbismPackType() {
		return this.knbismPackType;
	}

	public void setKnbismPackType(String knbismPackType) {
		this.knbismPackType = knbismPackType;
	}

	public Double getKnbismOrderPoint() {
		return this.knbismOrderPoint;
	}

	public void setKnbismOrderPoint(Double knbismOrderPoint) {
		this.knbismOrderPoint = knbismOrderPoint;
	}

	public String getKnbismSsMethod() {
		return this.knbismSsMethod;
	}

	public void setKnbismSsMethod(String knbismSsMethod) {
		this.knbismSsMethod = knbismSsMethod;
	}

	public Double getKnbismSafetyStock() {
		return this.knbismSafetyStock;
	}

	public void setKnbismSafetyStock(Double knbismSafetyStock) {
		this.knbismSafetyStock = knbismSafetyStock;
	}

	public Double getKnbismSafetyTime() {
		return this.knbismSafetyTime;
	}

	public void setKnbismSafetyTime(Double knbismSafetyTime) {
		this.knbismSafetyTime = knbismSafetyTime;
	}

	public Double getKnbismSsTotalQty() {
		return this.knbismSsTotalQty;
	}

	public void setKnbismSsTotalQty(Double knbismSsTotalQty) {
		this.knbismSsTotalQty = knbismSsTotalQty;
	}

	public Integer getKnbismPeakPeriod() {
		return this.knbismPeakPeriod;
	}

	public void setKnbismPeakPeriod(Integer knbismPeakPeriod) {
		this.knbismPeakPeriod = knbismPeakPeriod;
	}

	public Double getKnbismServiceLevel() {
		return this.knbismServiceLevel;
	}

	public void setKnbismServiceLevel(Double knbismServiceLevel) {
		this.knbismServiceLevel = knbismServiceLevel;
	}

	public String getKnbismDestFax() {
		return this.knbismDestFax;
	}

	public void setKnbismDestFax(String knbismDestFax) {
		this.knbismDestFax = knbismDestFax;
	}

	public String getKnbismDestFax2() {
		return this.knbismDestFax2;
	}

	public void setKnbismDestFax2(String knbismDestFax2) {
		this.knbismDestFax2 = knbismDestFax2;
	}

	public String getKnbismDestEmail() {
		return this.knbismDestEmail;
	}

	public void setKnbismDestEmail(String knbismDestEmail) {
		this.knbismDestEmail = knbismDestEmail;
	}

	public Date getKnbismModDate() {
		return this.knbismModDate;
	}

	public void setKnbismModDate(Date knbismModDate) {
		this.knbismModDate = knbismModDate;
	}

	public String getKnbismModUserid() {
		return this.knbismModUserid;
	}

	public void setKnbismModUserid(String knbismModUserid) {
		this.knbismModUserid = knbismModUserid;
	}

	public String getKnbismUser1() {
		return this.knbismUser1;
	}

	public void setKnbismUser1(String knbismUser1) {
		this.knbismUser1 = knbismUser1;
	}

	public String getKnbismUser2() {
		return this.knbismUser2;
	}

	public void setKnbismUser2(String knbismUser2) {
		this.knbismUser2 = knbismUser2;
	}

	public String getKnbismQadc01() {
		return this.knbismQadc01;
	}

	public void setKnbismQadc01(String knbismQadc01) {
		this.knbismQadc01 = knbismQadc01;
	}

	public String getKnbismQadc02() {
		return this.knbismQadc02;
	}

	public void setKnbismQadc02(String knbismQadc02) {
		this.knbismQadc02 = knbismQadc02;
	}

	public Integer getKnbismAvgInvMethod() {
		return this.knbismAvgInvMethod;
	}

	public void setKnbismAvgInvMethod(Integer knbismAvgInvMethod) {
		this.knbismAvgInvMethod = knbismAvgInvMethod;
	}

	public String getKnbismSsTemplate() {
		return this.knbismSsTemplate;
	}

	public void setKnbismSsTemplate(String knbismSsTemplate) {
		this.knbismSsTemplate = knbismSsTemplate;
	}

	public Double getKnbismCountTolerance() {
		return this.knbismCountTolerance;
	}

	public void setKnbismCountTolerance(Double knbismCountTolerance) {
		this.knbismCountTolerance = knbismCountTolerance;
	}

	public Double getKnbismLagFactor() {
		return this.knbismLagFactor;
	}

	public void setKnbismLagFactor(Double knbismLagFactor) {
		this.knbismLagFactor = knbismLagFactor;
	}

	public Double getOidKnbismDet() {
		return this.oidKnbismDet;
	}

	public void setOidKnbismDet(Double oidKnbismDet) {
		this.oidKnbismDet = oidKnbismDet;
	}

}