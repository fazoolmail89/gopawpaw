package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTx2dDet entity provides the base persistence definition of the
 * Tx2dDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTx2dDet implements java.io.Serializable {

	// Fields

	private Tx2dDetId id;
	private Date tx2dEffdate;
	private String tx2dQadd01;
	private String tx2dQadd02;
	private Double tx2dTotamt;
	private Double tx2dTottax;
	private String tx2dUser1;
	private String tx2dUser2;
	private String tx2dQad01;
	private String tx2dQad02;
	private Boolean tx2dEdited;
	private String tx2dCurr;
	private Double tx2dDec01;
	private Date tx2dDte01;
	private Boolean tx2dLog01;
	private Double tx2dQad04;
	private Date tx2dPostedDate;
	private String tx2dChr01;
	private String tx2dChr02;
	private Double tx2dDec02;
	private Boolean tx2dRcptTaxPoint;
	private String tx2dCarrier;
	private String tx2dTaxEnv;
	private String tx2dZoneFrom;
	private String tx2dZoneTo;
	private String tx2dTaxType;
	private String tx2dTransEnt;
	private String tx2dLineSiteEnt;
	private String tx2dTaxc;
	private String tx2dTaxUsage;
	private Boolean tx2dTaxIn;
	private Boolean tx2dByLine;
	private Double tx2dCurTaxAmt;
	private Double tx2dTaxAmt;
	private Double tx2dEntTaxAmt;
	private Double tx2dCurNontaxAmt;
	private Double tx2dNontaxAmt;
	private Double tx2dEntNontaxAmt;
	private Double tx2dTaxableAmt;
	private Double tx2dCurRecovAmt;
	private Double tx2dRecovAmt;
	private Double tx2dEntRecovAmt;
	private Double tx2dCurAbsRetAmt;
	private Double tx2dAbsRetAmt;
	private Double tx2dEntAbsRetAmt;
	private Boolean tx2dQad03;
	private Date tx2dQad05;
	private Boolean tx2dUsageTaxPoint;
	private Double oidTx2dDet;

	// Constructors

	/** default constructor */
	public AbstractTx2dDet() {
	}

	/** minimal constructor */
	public AbstractTx2dDet(Tx2dDetId id, Date tx2dEffdate, String tx2dQadd01,
			String tx2dQadd02, Double tx2dTotamt, Double tx2dTottax,
			Boolean tx2dRcptTaxPoint, Boolean tx2dTaxIn, Boolean tx2dByLine,
			Double tx2dCurTaxAmt, Double tx2dTaxAmt, Double tx2dEntTaxAmt,
			Double tx2dCurNontaxAmt, Double tx2dNontaxAmt,
			Double tx2dEntNontaxAmt, Double tx2dTaxableAmt,
			Double tx2dCurRecovAmt, Double tx2dRecovAmt,
			Double tx2dEntRecovAmt, Double tx2dCurAbsRetAmt,
			Double tx2dAbsRetAmt, Double tx2dEntAbsRetAmt,
			Boolean tx2dUsageTaxPoint, Double oidTx2dDet) {
		this.id = id;
		this.tx2dEffdate = tx2dEffdate;
		this.tx2dQadd01 = tx2dQadd01;
		this.tx2dQadd02 = tx2dQadd02;
		this.tx2dTotamt = tx2dTotamt;
		this.tx2dTottax = tx2dTottax;
		this.tx2dRcptTaxPoint = tx2dRcptTaxPoint;
		this.tx2dTaxIn = tx2dTaxIn;
		this.tx2dByLine = tx2dByLine;
		this.tx2dCurTaxAmt = tx2dCurTaxAmt;
		this.tx2dTaxAmt = tx2dTaxAmt;
		this.tx2dEntTaxAmt = tx2dEntTaxAmt;
		this.tx2dCurNontaxAmt = tx2dCurNontaxAmt;
		this.tx2dNontaxAmt = tx2dNontaxAmt;
		this.tx2dEntNontaxAmt = tx2dEntNontaxAmt;
		this.tx2dTaxableAmt = tx2dTaxableAmt;
		this.tx2dCurRecovAmt = tx2dCurRecovAmt;
		this.tx2dRecovAmt = tx2dRecovAmt;
		this.tx2dEntRecovAmt = tx2dEntRecovAmt;
		this.tx2dCurAbsRetAmt = tx2dCurAbsRetAmt;
		this.tx2dAbsRetAmt = tx2dAbsRetAmt;
		this.tx2dEntAbsRetAmt = tx2dEntAbsRetAmt;
		this.tx2dUsageTaxPoint = tx2dUsageTaxPoint;
		this.oidTx2dDet = oidTx2dDet;
	}

	/** full constructor */
	public AbstractTx2dDet(Tx2dDetId id, Date tx2dEffdate, String tx2dQadd01,
			String tx2dQadd02, Double tx2dTotamt, Double tx2dTottax,
			String tx2dUser1, String tx2dUser2, String tx2dQad01,
			String tx2dQad02, Boolean tx2dEdited, String tx2dCurr,
			Double tx2dDec01, Date tx2dDte01, Boolean tx2dLog01,
			Double tx2dQad04, Date tx2dPostedDate, String tx2dChr01,
			String tx2dChr02, Double tx2dDec02, Boolean tx2dRcptTaxPoint,
			String tx2dCarrier, String tx2dTaxEnv, String tx2dZoneFrom,
			String tx2dZoneTo, String tx2dTaxType, String tx2dTransEnt,
			String tx2dLineSiteEnt, String tx2dTaxc, String tx2dTaxUsage,
			Boolean tx2dTaxIn, Boolean tx2dByLine, Double tx2dCurTaxAmt,
			Double tx2dTaxAmt, Double tx2dEntTaxAmt, Double tx2dCurNontaxAmt,
			Double tx2dNontaxAmt, Double tx2dEntNontaxAmt,
			Double tx2dTaxableAmt, Double tx2dCurRecovAmt, Double tx2dRecovAmt,
			Double tx2dEntRecovAmt, Double tx2dCurAbsRetAmt,
			Double tx2dAbsRetAmt, Double tx2dEntAbsRetAmt, Boolean tx2dQad03,
			Date tx2dQad05, Boolean tx2dUsageTaxPoint, Double oidTx2dDet) {
		this.id = id;
		this.tx2dEffdate = tx2dEffdate;
		this.tx2dQadd01 = tx2dQadd01;
		this.tx2dQadd02 = tx2dQadd02;
		this.tx2dTotamt = tx2dTotamt;
		this.tx2dTottax = tx2dTottax;
		this.tx2dUser1 = tx2dUser1;
		this.tx2dUser2 = tx2dUser2;
		this.tx2dQad01 = tx2dQad01;
		this.tx2dQad02 = tx2dQad02;
		this.tx2dEdited = tx2dEdited;
		this.tx2dCurr = tx2dCurr;
		this.tx2dDec01 = tx2dDec01;
		this.tx2dDte01 = tx2dDte01;
		this.tx2dLog01 = tx2dLog01;
		this.tx2dQad04 = tx2dQad04;
		this.tx2dPostedDate = tx2dPostedDate;
		this.tx2dChr01 = tx2dChr01;
		this.tx2dChr02 = tx2dChr02;
		this.tx2dDec02 = tx2dDec02;
		this.tx2dRcptTaxPoint = tx2dRcptTaxPoint;
		this.tx2dCarrier = tx2dCarrier;
		this.tx2dTaxEnv = tx2dTaxEnv;
		this.tx2dZoneFrom = tx2dZoneFrom;
		this.tx2dZoneTo = tx2dZoneTo;
		this.tx2dTaxType = tx2dTaxType;
		this.tx2dTransEnt = tx2dTransEnt;
		this.tx2dLineSiteEnt = tx2dLineSiteEnt;
		this.tx2dTaxc = tx2dTaxc;
		this.tx2dTaxUsage = tx2dTaxUsage;
		this.tx2dTaxIn = tx2dTaxIn;
		this.tx2dByLine = tx2dByLine;
		this.tx2dCurTaxAmt = tx2dCurTaxAmt;
		this.tx2dTaxAmt = tx2dTaxAmt;
		this.tx2dEntTaxAmt = tx2dEntTaxAmt;
		this.tx2dCurNontaxAmt = tx2dCurNontaxAmt;
		this.tx2dNontaxAmt = tx2dNontaxAmt;
		this.tx2dEntNontaxAmt = tx2dEntNontaxAmt;
		this.tx2dTaxableAmt = tx2dTaxableAmt;
		this.tx2dCurRecovAmt = tx2dCurRecovAmt;
		this.tx2dRecovAmt = tx2dRecovAmt;
		this.tx2dEntRecovAmt = tx2dEntRecovAmt;
		this.tx2dCurAbsRetAmt = tx2dCurAbsRetAmt;
		this.tx2dAbsRetAmt = tx2dAbsRetAmt;
		this.tx2dEntAbsRetAmt = tx2dEntAbsRetAmt;
		this.tx2dQad03 = tx2dQad03;
		this.tx2dQad05 = tx2dQad05;
		this.tx2dUsageTaxPoint = tx2dUsageTaxPoint;
		this.oidTx2dDet = oidTx2dDet;
	}

	// Property accessors

	public Tx2dDetId getId() {
		return this.id;
	}

	public void setId(Tx2dDetId id) {
		this.id = id;
	}

	public Date getTx2dEffdate() {
		return this.tx2dEffdate;
	}

	public void setTx2dEffdate(Date tx2dEffdate) {
		this.tx2dEffdate = tx2dEffdate;
	}

	public String getTx2dQadd01() {
		return this.tx2dQadd01;
	}

	public void setTx2dQadd01(String tx2dQadd01) {
		this.tx2dQadd01 = tx2dQadd01;
	}

	public String getTx2dQadd02() {
		return this.tx2dQadd02;
	}

	public void setTx2dQadd02(String tx2dQadd02) {
		this.tx2dQadd02 = tx2dQadd02;
	}

	public Double getTx2dTotamt() {
		return this.tx2dTotamt;
	}

	public void setTx2dTotamt(Double tx2dTotamt) {
		this.tx2dTotamt = tx2dTotamt;
	}

	public Double getTx2dTottax() {
		return this.tx2dTottax;
	}

	public void setTx2dTottax(Double tx2dTottax) {
		this.tx2dTottax = tx2dTottax;
	}

	public String getTx2dUser1() {
		return this.tx2dUser1;
	}

	public void setTx2dUser1(String tx2dUser1) {
		this.tx2dUser1 = tx2dUser1;
	}

	public String getTx2dUser2() {
		return this.tx2dUser2;
	}

	public void setTx2dUser2(String tx2dUser2) {
		this.tx2dUser2 = tx2dUser2;
	}

	public String getTx2dQad01() {
		return this.tx2dQad01;
	}

	public void setTx2dQad01(String tx2dQad01) {
		this.tx2dQad01 = tx2dQad01;
	}

	public String getTx2dQad02() {
		return this.tx2dQad02;
	}

	public void setTx2dQad02(String tx2dQad02) {
		this.tx2dQad02 = tx2dQad02;
	}

	public Boolean getTx2dEdited() {
		return this.tx2dEdited;
	}

	public void setTx2dEdited(Boolean tx2dEdited) {
		this.tx2dEdited = tx2dEdited;
	}

	public String getTx2dCurr() {
		return this.tx2dCurr;
	}

	public void setTx2dCurr(String tx2dCurr) {
		this.tx2dCurr = tx2dCurr;
	}

	public Double getTx2dDec01() {
		return this.tx2dDec01;
	}

	public void setTx2dDec01(Double tx2dDec01) {
		this.tx2dDec01 = tx2dDec01;
	}

	public Date getTx2dDte01() {
		return this.tx2dDte01;
	}

	public void setTx2dDte01(Date tx2dDte01) {
		this.tx2dDte01 = tx2dDte01;
	}

	public Boolean getTx2dLog01() {
		return this.tx2dLog01;
	}

	public void setTx2dLog01(Boolean tx2dLog01) {
		this.tx2dLog01 = tx2dLog01;
	}

	public Double getTx2dQad04() {
		return this.tx2dQad04;
	}

	public void setTx2dQad04(Double tx2dQad04) {
		this.tx2dQad04 = tx2dQad04;
	}

	public Date getTx2dPostedDate() {
		return this.tx2dPostedDate;
	}

	public void setTx2dPostedDate(Date tx2dPostedDate) {
		this.tx2dPostedDate = tx2dPostedDate;
	}

	public String getTx2dChr01() {
		return this.tx2dChr01;
	}

	public void setTx2dChr01(String tx2dChr01) {
		this.tx2dChr01 = tx2dChr01;
	}

	public String getTx2dChr02() {
		return this.tx2dChr02;
	}

	public void setTx2dChr02(String tx2dChr02) {
		this.tx2dChr02 = tx2dChr02;
	}

	public Double getTx2dDec02() {
		return this.tx2dDec02;
	}

	public void setTx2dDec02(Double tx2dDec02) {
		this.tx2dDec02 = tx2dDec02;
	}

	public Boolean getTx2dRcptTaxPoint() {
		return this.tx2dRcptTaxPoint;
	}

	public void setTx2dRcptTaxPoint(Boolean tx2dRcptTaxPoint) {
		this.tx2dRcptTaxPoint = tx2dRcptTaxPoint;
	}

	public String getTx2dCarrier() {
		return this.tx2dCarrier;
	}

	public void setTx2dCarrier(String tx2dCarrier) {
		this.tx2dCarrier = tx2dCarrier;
	}

	public String getTx2dTaxEnv() {
		return this.tx2dTaxEnv;
	}

	public void setTx2dTaxEnv(String tx2dTaxEnv) {
		this.tx2dTaxEnv = tx2dTaxEnv;
	}

	public String getTx2dZoneFrom() {
		return this.tx2dZoneFrom;
	}

	public void setTx2dZoneFrom(String tx2dZoneFrom) {
		this.tx2dZoneFrom = tx2dZoneFrom;
	}

	public String getTx2dZoneTo() {
		return this.tx2dZoneTo;
	}

	public void setTx2dZoneTo(String tx2dZoneTo) {
		this.tx2dZoneTo = tx2dZoneTo;
	}

	public String getTx2dTaxType() {
		return this.tx2dTaxType;
	}

	public void setTx2dTaxType(String tx2dTaxType) {
		this.tx2dTaxType = tx2dTaxType;
	}

	public String getTx2dTransEnt() {
		return this.tx2dTransEnt;
	}

	public void setTx2dTransEnt(String tx2dTransEnt) {
		this.tx2dTransEnt = tx2dTransEnt;
	}

	public String getTx2dLineSiteEnt() {
		return this.tx2dLineSiteEnt;
	}

	public void setTx2dLineSiteEnt(String tx2dLineSiteEnt) {
		this.tx2dLineSiteEnt = tx2dLineSiteEnt;
	}

	public String getTx2dTaxc() {
		return this.tx2dTaxc;
	}

	public void setTx2dTaxc(String tx2dTaxc) {
		this.tx2dTaxc = tx2dTaxc;
	}

	public String getTx2dTaxUsage() {
		return this.tx2dTaxUsage;
	}

	public void setTx2dTaxUsage(String tx2dTaxUsage) {
		this.tx2dTaxUsage = tx2dTaxUsage;
	}

	public Boolean getTx2dTaxIn() {
		return this.tx2dTaxIn;
	}

	public void setTx2dTaxIn(Boolean tx2dTaxIn) {
		this.tx2dTaxIn = tx2dTaxIn;
	}

	public Boolean getTx2dByLine() {
		return this.tx2dByLine;
	}

	public void setTx2dByLine(Boolean tx2dByLine) {
		this.tx2dByLine = tx2dByLine;
	}

	public Double getTx2dCurTaxAmt() {
		return this.tx2dCurTaxAmt;
	}

	public void setTx2dCurTaxAmt(Double tx2dCurTaxAmt) {
		this.tx2dCurTaxAmt = tx2dCurTaxAmt;
	}

	public Double getTx2dTaxAmt() {
		return this.tx2dTaxAmt;
	}

	public void setTx2dTaxAmt(Double tx2dTaxAmt) {
		this.tx2dTaxAmt = tx2dTaxAmt;
	}

	public Double getTx2dEntTaxAmt() {
		return this.tx2dEntTaxAmt;
	}

	public void setTx2dEntTaxAmt(Double tx2dEntTaxAmt) {
		this.tx2dEntTaxAmt = tx2dEntTaxAmt;
	}

	public Double getTx2dCurNontaxAmt() {
		return this.tx2dCurNontaxAmt;
	}

	public void setTx2dCurNontaxAmt(Double tx2dCurNontaxAmt) {
		this.tx2dCurNontaxAmt = tx2dCurNontaxAmt;
	}

	public Double getTx2dNontaxAmt() {
		return this.tx2dNontaxAmt;
	}

	public void setTx2dNontaxAmt(Double tx2dNontaxAmt) {
		this.tx2dNontaxAmt = tx2dNontaxAmt;
	}

	public Double getTx2dEntNontaxAmt() {
		return this.tx2dEntNontaxAmt;
	}

	public void setTx2dEntNontaxAmt(Double tx2dEntNontaxAmt) {
		this.tx2dEntNontaxAmt = tx2dEntNontaxAmt;
	}

	public Double getTx2dTaxableAmt() {
		return this.tx2dTaxableAmt;
	}

	public void setTx2dTaxableAmt(Double tx2dTaxableAmt) {
		this.tx2dTaxableAmt = tx2dTaxableAmt;
	}

	public Double getTx2dCurRecovAmt() {
		return this.tx2dCurRecovAmt;
	}

	public void setTx2dCurRecovAmt(Double tx2dCurRecovAmt) {
		this.tx2dCurRecovAmt = tx2dCurRecovAmt;
	}

	public Double getTx2dRecovAmt() {
		return this.tx2dRecovAmt;
	}

	public void setTx2dRecovAmt(Double tx2dRecovAmt) {
		this.tx2dRecovAmt = tx2dRecovAmt;
	}

	public Double getTx2dEntRecovAmt() {
		return this.tx2dEntRecovAmt;
	}

	public void setTx2dEntRecovAmt(Double tx2dEntRecovAmt) {
		this.tx2dEntRecovAmt = tx2dEntRecovAmt;
	}

	public Double getTx2dCurAbsRetAmt() {
		return this.tx2dCurAbsRetAmt;
	}

	public void setTx2dCurAbsRetAmt(Double tx2dCurAbsRetAmt) {
		this.tx2dCurAbsRetAmt = tx2dCurAbsRetAmt;
	}

	public Double getTx2dAbsRetAmt() {
		return this.tx2dAbsRetAmt;
	}

	public void setTx2dAbsRetAmt(Double tx2dAbsRetAmt) {
		this.tx2dAbsRetAmt = tx2dAbsRetAmt;
	}

	public Double getTx2dEntAbsRetAmt() {
		return this.tx2dEntAbsRetAmt;
	}

	public void setTx2dEntAbsRetAmt(Double tx2dEntAbsRetAmt) {
		this.tx2dEntAbsRetAmt = tx2dEntAbsRetAmt;
	}

	public Boolean getTx2dQad03() {
		return this.tx2dQad03;
	}

	public void setTx2dQad03(Boolean tx2dQad03) {
		this.tx2dQad03 = tx2dQad03;
	}

	public Date getTx2dQad05() {
		return this.tx2dQad05;
	}

	public void setTx2dQad05(Date tx2dQad05) {
		this.tx2dQad05 = tx2dQad05;
	}

	public Boolean getTx2dUsageTaxPoint() {
		return this.tx2dUsageTaxPoint;
	}

	public void setTx2dUsageTaxPoint(Boolean tx2dUsageTaxPoint) {
		this.tx2dUsageTaxPoint = tx2dUsageTaxPoint;
	}

	public Double getOidTx2dDet() {
		return this.oidTx2dDet;
	}

	public void setOidTx2dDet(Double oidTx2dDet) {
		this.oidTx2dDet = oidTx2dDet;
	}

}