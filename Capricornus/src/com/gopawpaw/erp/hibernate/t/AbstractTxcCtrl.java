package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTxcCtrl entity provides the base persistence definition of the
 * TxcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxcCtrl implements java.io.Serializable {

	// Fields

	private String txcDomain;
	private Boolean txcByLine;
	private Boolean txcInvDisc;
	private String txcMethod;
	private Boolean txcPmtDisc;
	private Boolean txcUpdateTax;
	private String txcUser1;
	private String txcUser2;
	private Boolean txcInvHist;
	private String txcChr01;
	private String txcChr02;
	private Double txcDec01;
	private Double txcDec02;
	private Date txcDte01;
	private Boolean txcLog01;
	private String txcQad01;
	private String txcQad02;
	private Boolean txcQad03;
	private Double txcQad04;
	private Date txcQad05;
	private String txcRound;
	private String txcCtryCode;
	private Integer txcIndex1;
	private Boolean txcEditHist;
	private String txcTaxCode;
	private Boolean txcRcptTaxPoint;
	private Boolean txcValVatReg;
	private Boolean txcPrtVatReg;
	private String txcTaxZone;
	private String txcTaxEnv;
	private Boolean txcDetrp;
	private Boolean txcUsageTaxPoint;
	private Double oidTxcCtrl;

	// Constructors

	/** default constructor */
	public AbstractTxcCtrl() {
	}

	/** minimal constructor */
	public AbstractTxcCtrl(Boolean txcByLine, Boolean txcInvDisc,
			String txcMethod, Boolean txcPmtDisc, Boolean txcUpdateTax,
			Boolean txcInvHist, String txcRound, Boolean txcEditHist,
			Boolean txcRcptTaxPoint, Boolean txcValVatReg,
			Boolean txcPrtVatReg, String txcTaxZone, String txcTaxEnv,
			Boolean txcDetrp, Boolean txcUsageTaxPoint, Double oidTxcCtrl) {
		this.txcByLine = txcByLine;
		this.txcInvDisc = txcInvDisc;
		this.txcMethod = txcMethod;
		this.txcPmtDisc = txcPmtDisc;
		this.txcUpdateTax = txcUpdateTax;
		this.txcInvHist = txcInvHist;
		this.txcRound = txcRound;
		this.txcEditHist = txcEditHist;
		this.txcRcptTaxPoint = txcRcptTaxPoint;
		this.txcValVatReg = txcValVatReg;
		this.txcPrtVatReg = txcPrtVatReg;
		this.txcTaxZone = txcTaxZone;
		this.txcTaxEnv = txcTaxEnv;
		this.txcDetrp = txcDetrp;
		this.txcUsageTaxPoint = txcUsageTaxPoint;
		this.oidTxcCtrl = oidTxcCtrl;
	}

	/** full constructor */
	public AbstractTxcCtrl(Boolean txcByLine, Boolean txcInvDisc,
			String txcMethod, Boolean txcPmtDisc, Boolean txcUpdateTax,
			String txcUser1, String txcUser2, Boolean txcInvHist,
			String txcChr01, String txcChr02, Double txcDec01, Double txcDec02,
			Date txcDte01, Boolean txcLog01, String txcQad01, String txcQad02,
			Boolean txcQad03, Double txcQad04, Date txcQad05, String txcRound,
			String txcCtryCode, Integer txcIndex1, Boolean txcEditHist,
			String txcTaxCode, Boolean txcRcptTaxPoint, Boolean txcValVatReg,
			Boolean txcPrtVatReg, String txcTaxZone, String txcTaxEnv,
			Boolean txcDetrp, Boolean txcUsageTaxPoint, Double oidTxcCtrl) {
		this.txcByLine = txcByLine;
		this.txcInvDisc = txcInvDisc;
		this.txcMethod = txcMethod;
		this.txcPmtDisc = txcPmtDisc;
		this.txcUpdateTax = txcUpdateTax;
		this.txcUser1 = txcUser1;
		this.txcUser2 = txcUser2;
		this.txcInvHist = txcInvHist;
		this.txcChr01 = txcChr01;
		this.txcChr02 = txcChr02;
		this.txcDec01 = txcDec01;
		this.txcDec02 = txcDec02;
		this.txcDte01 = txcDte01;
		this.txcLog01 = txcLog01;
		this.txcQad01 = txcQad01;
		this.txcQad02 = txcQad02;
		this.txcQad03 = txcQad03;
		this.txcQad04 = txcQad04;
		this.txcQad05 = txcQad05;
		this.txcRound = txcRound;
		this.txcCtryCode = txcCtryCode;
		this.txcIndex1 = txcIndex1;
		this.txcEditHist = txcEditHist;
		this.txcTaxCode = txcTaxCode;
		this.txcRcptTaxPoint = txcRcptTaxPoint;
		this.txcValVatReg = txcValVatReg;
		this.txcPrtVatReg = txcPrtVatReg;
		this.txcTaxZone = txcTaxZone;
		this.txcTaxEnv = txcTaxEnv;
		this.txcDetrp = txcDetrp;
		this.txcUsageTaxPoint = txcUsageTaxPoint;
		this.oidTxcCtrl = oidTxcCtrl;
	}

	// Property accessors

	public String getTxcDomain() {
		return this.txcDomain;
	}

	public void setTxcDomain(String txcDomain) {
		this.txcDomain = txcDomain;
	}

	public Boolean getTxcByLine() {
		return this.txcByLine;
	}

	public void setTxcByLine(Boolean txcByLine) {
		this.txcByLine = txcByLine;
	}

	public Boolean getTxcInvDisc() {
		return this.txcInvDisc;
	}

	public void setTxcInvDisc(Boolean txcInvDisc) {
		this.txcInvDisc = txcInvDisc;
	}

	public String getTxcMethod() {
		return this.txcMethod;
	}

	public void setTxcMethod(String txcMethod) {
		this.txcMethod = txcMethod;
	}

	public Boolean getTxcPmtDisc() {
		return this.txcPmtDisc;
	}

	public void setTxcPmtDisc(Boolean txcPmtDisc) {
		this.txcPmtDisc = txcPmtDisc;
	}

	public Boolean getTxcUpdateTax() {
		return this.txcUpdateTax;
	}

	public void setTxcUpdateTax(Boolean txcUpdateTax) {
		this.txcUpdateTax = txcUpdateTax;
	}

	public String getTxcUser1() {
		return this.txcUser1;
	}

	public void setTxcUser1(String txcUser1) {
		this.txcUser1 = txcUser1;
	}

	public String getTxcUser2() {
		return this.txcUser2;
	}

	public void setTxcUser2(String txcUser2) {
		this.txcUser2 = txcUser2;
	}

	public Boolean getTxcInvHist() {
		return this.txcInvHist;
	}

	public void setTxcInvHist(Boolean txcInvHist) {
		this.txcInvHist = txcInvHist;
	}

	public String getTxcChr01() {
		return this.txcChr01;
	}

	public void setTxcChr01(String txcChr01) {
		this.txcChr01 = txcChr01;
	}

	public String getTxcChr02() {
		return this.txcChr02;
	}

	public void setTxcChr02(String txcChr02) {
		this.txcChr02 = txcChr02;
	}

	public Double getTxcDec01() {
		return this.txcDec01;
	}

	public void setTxcDec01(Double txcDec01) {
		this.txcDec01 = txcDec01;
	}

	public Double getTxcDec02() {
		return this.txcDec02;
	}

	public void setTxcDec02(Double txcDec02) {
		this.txcDec02 = txcDec02;
	}

	public Date getTxcDte01() {
		return this.txcDte01;
	}

	public void setTxcDte01(Date txcDte01) {
		this.txcDte01 = txcDte01;
	}

	public Boolean getTxcLog01() {
		return this.txcLog01;
	}

	public void setTxcLog01(Boolean txcLog01) {
		this.txcLog01 = txcLog01;
	}

	public String getTxcQad01() {
		return this.txcQad01;
	}

	public void setTxcQad01(String txcQad01) {
		this.txcQad01 = txcQad01;
	}

	public String getTxcQad02() {
		return this.txcQad02;
	}

	public void setTxcQad02(String txcQad02) {
		this.txcQad02 = txcQad02;
	}

	public Boolean getTxcQad03() {
		return this.txcQad03;
	}

	public void setTxcQad03(Boolean txcQad03) {
		this.txcQad03 = txcQad03;
	}

	public Double getTxcQad04() {
		return this.txcQad04;
	}

	public void setTxcQad04(Double txcQad04) {
		this.txcQad04 = txcQad04;
	}

	public Date getTxcQad05() {
		return this.txcQad05;
	}

	public void setTxcQad05(Date txcQad05) {
		this.txcQad05 = txcQad05;
	}

	public String getTxcRound() {
		return this.txcRound;
	}

	public void setTxcRound(String txcRound) {
		this.txcRound = txcRound;
	}

	public String getTxcCtryCode() {
		return this.txcCtryCode;
	}

	public void setTxcCtryCode(String txcCtryCode) {
		this.txcCtryCode = txcCtryCode;
	}

	public Integer getTxcIndex1() {
		return this.txcIndex1;
	}

	public void setTxcIndex1(Integer txcIndex1) {
		this.txcIndex1 = txcIndex1;
	}

	public Boolean getTxcEditHist() {
		return this.txcEditHist;
	}

	public void setTxcEditHist(Boolean txcEditHist) {
		this.txcEditHist = txcEditHist;
	}

	public String getTxcTaxCode() {
		return this.txcTaxCode;
	}

	public void setTxcTaxCode(String txcTaxCode) {
		this.txcTaxCode = txcTaxCode;
	}

	public Boolean getTxcRcptTaxPoint() {
		return this.txcRcptTaxPoint;
	}

	public void setTxcRcptTaxPoint(Boolean txcRcptTaxPoint) {
		this.txcRcptTaxPoint = txcRcptTaxPoint;
	}

	public Boolean getTxcValVatReg() {
		return this.txcValVatReg;
	}

	public void setTxcValVatReg(Boolean txcValVatReg) {
		this.txcValVatReg = txcValVatReg;
	}

	public Boolean getTxcPrtVatReg() {
		return this.txcPrtVatReg;
	}

	public void setTxcPrtVatReg(Boolean txcPrtVatReg) {
		this.txcPrtVatReg = txcPrtVatReg;
	}

	public String getTxcTaxZone() {
		return this.txcTaxZone;
	}

	public void setTxcTaxZone(String txcTaxZone) {
		this.txcTaxZone = txcTaxZone;
	}

	public String getTxcTaxEnv() {
		return this.txcTaxEnv;
	}

	public void setTxcTaxEnv(String txcTaxEnv) {
		this.txcTaxEnv = txcTaxEnv;
	}

	public Boolean getTxcDetrp() {
		return this.txcDetrp;
	}

	public void setTxcDetrp(Boolean txcDetrp) {
		this.txcDetrp = txcDetrp;
	}

	public Boolean getTxcUsageTaxPoint() {
		return this.txcUsageTaxPoint;
	}

	public void setTxcUsageTaxPoint(Boolean txcUsageTaxPoint) {
		this.txcUsageTaxPoint = txcUsageTaxPoint;
	}

	public Double getOidTxcCtrl() {
		return this.oidTxcCtrl;
	}

	public void setOidTxcCtrl(Double oidTxcCtrl) {
		this.oidTxcCtrl = oidTxcCtrl;
	}

}