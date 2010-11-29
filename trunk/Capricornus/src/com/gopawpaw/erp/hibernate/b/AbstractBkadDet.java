package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBkadDet entity provides the base persistence definition of the
 * BkadDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkadDet implements java.io.Serializable {

	// Fields

	private BkadDetId id;
	private String bkadBank;
	private String bkadPayMethod;
	private String bkadModule;
	private String bkadAddr;
	private Integer bkadPaymentNbr;
	private String bkadRef;
	private Boolean bkadProcessed;
	private Double bkadAmtChg;
	private Double bkadDiscChg;
	private String bkadUser1;
	private String bkadUser2;
	private String bkadUserc03;
	private String bkadUserc04;
	private Date bkadUsert01;
	private Date bkadUsert02;
	private Boolean bkadUserl01;
	private Boolean bkadUserl02;
	private String bkadQadc01;
	private String bkadQadc02;
	private String bkadCurr;
	private Integer bkadSeq;
	private Date bkadModDate;
	private String bkadModUserid;
	private String bkadUserc05;
	private Double bkadUserd01;
	private Double bkadUserd02;
	private Integer bkadUseri01;
	private Integer bkadUseri02;
	private String bkadQadc03;
	private String bkadQadc04;
	private String bkadQadc05;
	private Double bkadQadd01;
	private Double bkadQadd02;
	private Integer bkadQadi01;
	private Integer bkadQadi02;
	private Boolean bkadQadl01;
	private Boolean bkadQadl02;
	private Date bkadQadt01;
	private Date bkadQadt02;
	private Double oidBkadDet;

	// Constructors

	/** default constructor */
	public AbstractBkadDet() {
	}

	/** minimal constructor */
	public AbstractBkadDet(BkadDetId id, String bkadBank, String bkadPayMethod,
			String bkadModule, String bkadAddr, Integer bkadPaymentNbr,
			String bkadRef, Boolean bkadProcessed, Double bkadAmtChg,
			Double bkadDiscChg, String bkadUser1, String bkadUser2,
			String bkadUserc03, String bkadUserc04, Boolean bkadUserl01,
			Boolean bkadUserl02, String bkadQadc01, String bkadQadc02,
			String bkadCurr, Integer bkadSeq, Date bkadModDate,
			String bkadModUserid, String bkadUserc05, Double bkadUserd01,
			Double bkadUserd02, Integer bkadUseri01, Integer bkadUseri02,
			String bkadQadc03, String bkadQadc04, String bkadQadc05,
			Double bkadQadd01, Double bkadQadd02, Integer bkadQadi01,
			Integer bkadQadi02, Boolean bkadQadl01, Boolean bkadQadl02,
			Double oidBkadDet) {
		this.id = id;
		this.bkadBank = bkadBank;
		this.bkadPayMethod = bkadPayMethod;
		this.bkadModule = bkadModule;
		this.bkadAddr = bkadAddr;
		this.bkadPaymentNbr = bkadPaymentNbr;
		this.bkadRef = bkadRef;
		this.bkadProcessed = bkadProcessed;
		this.bkadAmtChg = bkadAmtChg;
		this.bkadDiscChg = bkadDiscChg;
		this.bkadUser1 = bkadUser1;
		this.bkadUser2 = bkadUser2;
		this.bkadUserc03 = bkadUserc03;
		this.bkadUserc04 = bkadUserc04;
		this.bkadUserl01 = bkadUserl01;
		this.bkadUserl02 = bkadUserl02;
		this.bkadQadc01 = bkadQadc01;
		this.bkadQadc02 = bkadQadc02;
		this.bkadCurr = bkadCurr;
		this.bkadSeq = bkadSeq;
		this.bkadModDate = bkadModDate;
		this.bkadModUserid = bkadModUserid;
		this.bkadUserc05 = bkadUserc05;
		this.bkadUserd01 = bkadUserd01;
		this.bkadUserd02 = bkadUserd02;
		this.bkadUseri01 = bkadUseri01;
		this.bkadUseri02 = bkadUseri02;
		this.bkadQadc03 = bkadQadc03;
		this.bkadQadc04 = bkadQadc04;
		this.bkadQadc05 = bkadQadc05;
		this.bkadQadd01 = bkadQadd01;
		this.bkadQadd02 = bkadQadd02;
		this.bkadQadi01 = bkadQadi01;
		this.bkadQadi02 = bkadQadi02;
		this.bkadQadl01 = bkadQadl01;
		this.bkadQadl02 = bkadQadl02;
		this.oidBkadDet = oidBkadDet;
	}

	/** full constructor */
	public AbstractBkadDet(BkadDetId id, String bkadBank, String bkadPayMethod,
			String bkadModule, String bkadAddr, Integer bkadPaymentNbr,
			String bkadRef, Boolean bkadProcessed, Double bkadAmtChg,
			Double bkadDiscChg, String bkadUser1, String bkadUser2,
			String bkadUserc03, String bkadUserc04, Date bkadUsert01,
			Date bkadUsert02, Boolean bkadUserl01, Boolean bkadUserl02,
			String bkadQadc01, String bkadQadc02, String bkadCurr,
			Integer bkadSeq, Date bkadModDate, String bkadModUserid,
			String bkadUserc05, Double bkadUserd01, Double bkadUserd02,
			Integer bkadUseri01, Integer bkadUseri02, String bkadQadc03,
			String bkadQadc04, String bkadQadc05, Double bkadQadd01,
			Double bkadQadd02, Integer bkadQadi01, Integer bkadQadi02,
			Boolean bkadQadl01, Boolean bkadQadl02, Date bkadQadt01,
			Date bkadQadt02, Double oidBkadDet) {
		this.id = id;
		this.bkadBank = bkadBank;
		this.bkadPayMethod = bkadPayMethod;
		this.bkadModule = bkadModule;
		this.bkadAddr = bkadAddr;
		this.bkadPaymentNbr = bkadPaymentNbr;
		this.bkadRef = bkadRef;
		this.bkadProcessed = bkadProcessed;
		this.bkadAmtChg = bkadAmtChg;
		this.bkadDiscChg = bkadDiscChg;
		this.bkadUser1 = bkadUser1;
		this.bkadUser2 = bkadUser2;
		this.bkadUserc03 = bkadUserc03;
		this.bkadUserc04 = bkadUserc04;
		this.bkadUsert01 = bkadUsert01;
		this.bkadUsert02 = bkadUsert02;
		this.bkadUserl01 = bkadUserl01;
		this.bkadUserl02 = bkadUserl02;
		this.bkadQadc01 = bkadQadc01;
		this.bkadQadc02 = bkadQadc02;
		this.bkadCurr = bkadCurr;
		this.bkadSeq = bkadSeq;
		this.bkadModDate = bkadModDate;
		this.bkadModUserid = bkadModUserid;
		this.bkadUserc05 = bkadUserc05;
		this.bkadUserd01 = bkadUserd01;
		this.bkadUserd02 = bkadUserd02;
		this.bkadUseri01 = bkadUseri01;
		this.bkadUseri02 = bkadUseri02;
		this.bkadQadc03 = bkadQadc03;
		this.bkadQadc04 = bkadQadc04;
		this.bkadQadc05 = bkadQadc05;
		this.bkadQadd01 = bkadQadd01;
		this.bkadQadd02 = bkadQadd02;
		this.bkadQadi01 = bkadQadi01;
		this.bkadQadi02 = bkadQadi02;
		this.bkadQadl01 = bkadQadl01;
		this.bkadQadl02 = bkadQadl02;
		this.bkadQadt01 = bkadQadt01;
		this.bkadQadt02 = bkadQadt02;
		this.oidBkadDet = oidBkadDet;
	}

	// Property accessors

	public BkadDetId getId() {
		return this.id;
	}

	public void setId(BkadDetId id) {
		this.id = id;
	}

	public String getBkadBank() {
		return this.bkadBank;
	}

	public void setBkadBank(String bkadBank) {
		this.bkadBank = bkadBank;
	}

	public String getBkadPayMethod() {
		return this.bkadPayMethod;
	}

	public void setBkadPayMethod(String bkadPayMethod) {
		this.bkadPayMethod = bkadPayMethod;
	}

	public String getBkadModule() {
		return this.bkadModule;
	}

	public void setBkadModule(String bkadModule) {
		this.bkadModule = bkadModule;
	}

	public String getBkadAddr() {
		return this.bkadAddr;
	}

	public void setBkadAddr(String bkadAddr) {
		this.bkadAddr = bkadAddr;
	}

	public Integer getBkadPaymentNbr() {
		return this.bkadPaymentNbr;
	}

	public void setBkadPaymentNbr(Integer bkadPaymentNbr) {
		this.bkadPaymentNbr = bkadPaymentNbr;
	}

	public String getBkadRef() {
		return this.bkadRef;
	}

	public void setBkadRef(String bkadRef) {
		this.bkadRef = bkadRef;
	}

	public Boolean getBkadProcessed() {
		return this.bkadProcessed;
	}

	public void setBkadProcessed(Boolean bkadProcessed) {
		this.bkadProcessed = bkadProcessed;
	}

	public Double getBkadAmtChg() {
		return this.bkadAmtChg;
	}

	public void setBkadAmtChg(Double bkadAmtChg) {
		this.bkadAmtChg = bkadAmtChg;
	}

	public Double getBkadDiscChg() {
		return this.bkadDiscChg;
	}

	public void setBkadDiscChg(Double bkadDiscChg) {
		this.bkadDiscChg = bkadDiscChg;
	}

	public String getBkadUser1() {
		return this.bkadUser1;
	}

	public void setBkadUser1(String bkadUser1) {
		this.bkadUser1 = bkadUser1;
	}

	public String getBkadUser2() {
		return this.bkadUser2;
	}

	public void setBkadUser2(String bkadUser2) {
		this.bkadUser2 = bkadUser2;
	}

	public String getBkadUserc03() {
		return this.bkadUserc03;
	}

	public void setBkadUserc03(String bkadUserc03) {
		this.bkadUserc03 = bkadUserc03;
	}

	public String getBkadUserc04() {
		return this.bkadUserc04;
	}

	public void setBkadUserc04(String bkadUserc04) {
		this.bkadUserc04 = bkadUserc04;
	}

	public Date getBkadUsert01() {
		return this.bkadUsert01;
	}

	public void setBkadUsert01(Date bkadUsert01) {
		this.bkadUsert01 = bkadUsert01;
	}

	public Date getBkadUsert02() {
		return this.bkadUsert02;
	}

	public void setBkadUsert02(Date bkadUsert02) {
		this.bkadUsert02 = bkadUsert02;
	}

	public Boolean getBkadUserl01() {
		return this.bkadUserl01;
	}

	public void setBkadUserl01(Boolean bkadUserl01) {
		this.bkadUserl01 = bkadUserl01;
	}

	public Boolean getBkadUserl02() {
		return this.bkadUserl02;
	}

	public void setBkadUserl02(Boolean bkadUserl02) {
		this.bkadUserl02 = bkadUserl02;
	}

	public String getBkadQadc01() {
		return this.bkadQadc01;
	}

	public void setBkadQadc01(String bkadQadc01) {
		this.bkadQadc01 = bkadQadc01;
	}

	public String getBkadQadc02() {
		return this.bkadQadc02;
	}

	public void setBkadQadc02(String bkadQadc02) {
		this.bkadQadc02 = bkadQadc02;
	}

	public String getBkadCurr() {
		return this.bkadCurr;
	}

	public void setBkadCurr(String bkadCurr) {
		this.bkadCurr = bkadCurr;
	}

	public Integer getBkadSeq() {
		return this.bkadSeq;
	}

	public void setBkadSeq(Integer bkadSeq) {
		this.bkadSeq = bkadSeq;
	}

	public Date getBkadModDate() {
		return this.bkadModDate;
	}

	public void setBkadModDate(Date bkadModDate) {
		this.bkadModDate = bkadModDate;
	}

	public String getBkadModUserid() {
		return this.bkadModUserid;
	}

	public void setBkadModUserid(String bkadModUserid) {
		this.bkadModUserid = bkadModUserid;
	}

	public String getBkadUserc05() {
		return this.bkadUserc05;
	}

	public void setBkadUserc05(String bkadUserc05) {
		this.bkadUserc05 = bkadUserc05;
	}

	public Double getBkadUserd01() {
		return this.bkadUserd01;
	}

	public void setBkadUserd01(Double bkadUserd01) {
		this.bkadUserd01 = bkadUserd01;
	}

	public Double getBkadUserd02() {
		return this.bkadUserd02;
	}

	public void setBkadUserd02(Double bkadUserd02) {
		this.bkadUserd02 = bkadUserd02;
	}

	public Integer getBkadUseri01() {
		return this.bkadUseri01;
	}

	public void setBkadUseri01(Integer bkadUseri01) {
		this.bkadUseri01 = bkadUseri01;
	}

	public Integer getBkadUseri02() {
		return this.bkadUseri02;
	}

	public void setBkadUseri02(Integer bkadUseri02) {
		this.bkadUseri02 = bkadUseri02;
	}

	public String getBkadQadc03() {
		return this.bkadQadc03;
	}

	public void setBkadQadc03(String bkadQadc03) {
		this.bkadQadc03 = bkadQadc03;
	}

	public String getBkadQadc04() {
		return this.bkadQadc04;
	}

	public void setBkadQadc04(String bkadQadc04) {
		this.bkadQadc04 = bkadQadc04;
	}

	public String getBkadQadc05() {
		return this.bkadQadc05;
	}

	public void setBkadQadc05(String bkadQadc05) {
		this.bkadQadc05 = bkadQadc05;
	}

	public Double getBkadQadd01() {
		return this.bkadQadd01;
	}

	public void setBkadQadd01(Double bkadQadd01) {
		this.bkadQadd01 = bkadQadd01;
	}

	public Double getBkadQadd02() {
		return this.bkadQadd02;
	}

	public void setBkadQadd02(Double bkadQadd02) {
		this.bkadQadd02 = bkadQadd02;
	}

	public Integer getBkadQadi01() {
		return this.bkadQadi01;
	}

	public void setBkadQadi01(Integer bkadQadi01) {
		this.bkadQadi01 = bkadQadi01;
	}

	public Integer getBkadQadi02() {
		return this.bkadQadi02;
	}

	public void setBkadQadi02(Integer bkadQadi02) {
		this.bkadQadi02 = bkadQadi02;
	}

	public Boolean getBkadQadl01() {
		return this.bkadQadl01;
	}

	public void setBkadQadl01(Boolean bkadQadl01) {
		this.bkadQadl01 = bkadQadl01;
	}

	public Boolean getBkadQadl02() {
		return this.bkadQadl02;
	}

	public void setBkadQadl02(Boolean bkadQadl02) {
		this.bkadQadl02 = bkadQadl02;
	}

	public Date getBkadQadt01() {
		return this.bkadQadt01;
	}

	public void setBkadQadt01(Date bkadQadt01) {
		this.bkadQadt01 = bkadQadt01;
	}

	public Date getBkadQadt02() {
		return this.bkadQadt02;
	}

	public void setBkadQadt02(Date bkadQadt02) {
		this.bkadQadt02 = bkadQadt02;
	}

	public Double getOidBkadDet() {
		return this.oidBkadDet;
	}

	public void setOidBkadDet(Double oidBkadDet) {
		this.oidBkadDet = oidBkadDet;
	}

}