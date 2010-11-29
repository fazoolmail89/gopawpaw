package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBkpdDet entity provides the base persistence definition of the
 * BkpdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkpdDet implements java.io.Serializable {

	// Fields

	private BkpdDetId id;
	private Boolean bkpdProcessed;
	private Double bkpdAmt;
	private String bkpdBkAcct;
	private Double bkpdResaleAmt;
	private String bkpdRef;
	private String bkpdUser1;
	private String bkpdUser2;
	private String bkpdUserc03;
	private String bkpdUserc04;
	private Date bkpdUsert01;
	private Date bkpdUsert02;
	private Boolean bkpdUserl01;
	private Boolean bkpdUserl02;
	private String bkpdQadc01;
	private String bkpdQadc02;
	private String bkpdNbr;
	private Date bkpdDueDate;
	private Boolean bkpdSeparate;
	private String bkpdFullBkAcct;
	private String bkpdCsBank;
	private Date bkpdModDate;
	private String bkpdModUserid;
	private String bkpdUserc05;
	private Double bkpdUserd01;
	private Double bkpdUserd02;
	private Integer bkpdUseri01;
	private Integer bkpdUseri02;
	private String bkpdQadc03;
	private String bkpdQadc04;
	private String bkpdQadc05;
	private Double bkpdQadd01;
	private Double bkpdQadd02;
	private Integer bkpdQadi01;
	private Integer bkpdQadi02;
	private Boolean bkpdQadl01;
	private Boolean bkpdQadl02;
	private Date bkpdQadt01;
	private Date bkpdQadt02;
	private Double oidBkpdDet;

	// Constructors

	/** default constructor */
	public AbstractBkpdDet() {
	}

	/** minimal constructor */
	public AbstractBkpdDet(BkpdDetId id, Boolean bkpdProcessed, Double bkpdAmt,
			String bkpdBkAcct, Double bkpdResaleAmt, String bkpdRef,
			String bkpdUser1, String bkpdUser2, String bkpdUserc03,
			String bkpdUserc04, Boolean bkpdUserl01, Boolean bkpdUserl02,
			String bkpdQadc01, String bkpdQadc02, String bkpdNbr,
			Boolean bkpdSeparate, String bkpdFullBkAcct, String bkpdCsBank,
			Date bkpdModDate, String bkpdModUserid, String bkpdUserc05,
			Double bkpdUserd01, Double bkpdUserd02, Integer bkpdUseri01,
			Integer bkpdUseri02, String bkpdQadc03, String bkpdQadc04,
			String bkpdQadc05, Double bkpdQadd01, Double bkpdQadd02,
			Integer bkpdQadi01, Integer bkpdQadi02, Boolean bkpdQadl01,
			Boolean bkpdQadl02, Double oidBkpdDet) {
		this.id = id;
		this.bkpdProcessed = bkpdProcessed;
		this.bkpdAmt = bkpdAmt;
		this.bkpdBkAcct = bkpdBkAcct;
		this.bkpdResaleAmt = bkpdResaleAmt;
		this.bkpdRef = bkpdRef;
		this.bkpdUser1 = bkpdUser1;
		this.bkpdUser2 = bkpdUser2;
		this.bkpdUserc03 = bkpdUserc03;
		this.bkpdUserc04 = bkpdUserc04;
		this.bkpdUserl01 = bkpdUserl01;
		this.bkpdUserl02 = bkpdUserl02;
		this.bkpdQadc01 = bkpdQadc01;
		this.bkpdQadc02 = bkpdQadc02;
		this.bkpdNbr = bkpdNbr;
		this.bkpdSeparate = bkpdSeparate;
		this.bkpdFullBkAcct = bkpdFullBkAcct;
		this.bkpdCsBank = bkpdCsBank;
		this.bkpdModDate = bkpdModDate;
		this.bkpdModUserid = bkpdModUserid;
		this.bkpdUserc05 = bkpdUserc05;
		this.bkpdUserd01 = bkpdUserd01;
		this.bkpdUserd02 = bkpdUserd02;
		this.bkpdUseri01 = bkpdUseri01;
		this.bkpdUseri02 = bkpdUseri02;
		this.bkpdQadc03 = bkpdQadc03;
		this.bkpdQadc04 = bkpdQadc04;
		this.bkpdQadc05 = bkpdQadc05;
		this.bkpdQadd01 = bkpdQadd01;
		this.bkpdQadd02 = bkpdQadd02;
		this.bkpdQadi01 = bkpdQadi01;
		this.bkpdQadi02 = bkpdQadi02;
		this.bkpdQadl01 = bkpdQadl01;
		this.bkpdQadl02 = bkpdQadl02;
		this.oidBkpdDet = oidBkpdDet;
	}

	/** full constructor */
	public AbstractBkpdDet(BkpdDetId id, Boolean bkpdProcessed, Double bkpdAmt,
			String bkpdBkAcct, Double bkpdResaleAmt, String bkpdRef,
			String bkpdUser1, String bkpdUser2, String bkpdUserc03,
			String bkpdUserc04, Date bkpdUsert01, Date bkpdUsert02,
			Boolean bkpdUserl01, Boolean bkpdUserl02, String bkpdQadc01,
			String bkpdQadc02, String bkpdNbr, Date bkpdDueDate,
			Boolean bkpdSeparate, String bkpdFullBkAcct, String bkpdCsBank,
			Date bkpdModDate, String bkpdModUserid, String bkpdUserc05,
			Double bkpdUserd01, Double bkpdUserd02, Integer bkpdUseri01,
			Integer bkpdUseri02, String bkpdQadc03, String bkpdQadc04,
			String bkpdQadc05, Double bkpdQadd01, Double bkpdQadd02,
			Integer bkpdQadi01, Integer bkpdQadi02, Boolean bkpdQadl01,
			Boolean bkpdQadl02, Date bkpdQadt01, Date bkpdQadt02,
			Double oidBkpdDet) {
		this.id = id;
		this.bkpdProcessed = bkpdProcessed;
		this.bkpdAmt = bkpdAmt;
		this.bkpdBkAcct = bkpdBkAcct;
		this.bkpdResaleAmt = bkpdResaleAmt;
		this.bkpdRef = bkpdRef;
		this.bkpdUser1 = bkpdUser1;
		this.bkpdUser2 = bkpdUser2;
		this.bkpdUserc03 = bkpdUserc03;
		this.bkpdUserc04 = bkpdUserc04;
		this.bkpdUsert01 = bkpdUsert01;
		this.bkpdUsert02 = bkpdUsert02;
		this.bkpdUserl01 = bkpdUserl01;
		this.bkpdUserl02 = bkpdUserl02;
		this.bkpdQadc01 = bkpdQadc01;
		this.bkpdQadc02 = bkpdQadc02;
		this.bkpdNbr = bkpdNbr;
		this.bkpdDueDate = bkpdDueDate;
		this.bkpdSeparate = bkpdSeparate;
		this.bkpdFullBkAcct = bkpdFullBkAcct;
		this.bkpdCsBank = bkpdCsBank;
		this.bkpdModDate = bkpdModDate;
		this.bkpdModUserid = bkpdModUserid;
		this.bkpdUserc05 = bkpdUserc05;
		this.bkpdUserd01 = bkpdUserd01;
		this.bkpdUserd02 = bkpdUserd02;
		this.bkpdUseri01 = bkpdUseri01;
		this.bkpdUseri02 = bkpdUseri02;
		this.bkpdQadc03 = bkpdQadc03;
		this.bkpdQadc04 = bkpdQadc04;
		this.bkpdQadc05 = bkpdQadc05;
		this.bkpdQadd01 = bkpdQadd01;
		this.bkpdQadd02 = bkpdQadd02;
		this.bkpdQadi01 = bkpdQadi01;
		this.bkpdQadi02 = bkpdQadi02;
		this.bkpdQadl01 = bkpdQadl01;
		this.bkpdQadl02 = bkpdQadl02;
		this.bkpdQadt01 = bkpdQadt01;
		this.bkpdQadt02 = bkpdQadt02;
		this.oidBkpdDet = oidBkpdDet;
	}

	// Property accessors

	public BkpdDetId getId() {
		return this.id;
	}

	public void setId(BkpdDetId id) {
		this.id = id;
	}

	public Boolean getBkpdProcessed() {
		return this.bkpdProcessed;
	}

	public void setBkpdProcessed(Boolean bkpdProcessed) {
		this.bkpdProcessed = bkpdProcessed;
	}

	public Double getBkpdAmt() {
		return this.bkpdAmt;
	}

	public void setBkpdAmt(Double bkpdAmt) {
		this.bkpdAmt = bkpdAmt;
	}

	public String getBkpdBkAcct() {
		return this.bkpdBkAcct;
	}

	public void setBkpdBkAcct(String bkpdBkAcct) {
		this.bkpdBkAcct = bkpdBkAcct;
	}

	public Double getBkpdResaleAmt() {
		return this.bkpdResaleAmt;
	}

	public void setBkpdResaleAmt(Double bkpdResaleAmt) {
		this.bkpdResaleAmt = bkpdResaleAmt;
	}

	public String getBkpdRef() {
		return this.bkpdRef;
	}

	public void setBkpdRef(String bkpdRef) {
		this.bkpdRef = bkpdRef;
	}

	public String getBkpdUser1() {
		return this.bkpdUser1;
	}

	public void setBkpdUser1(String bkpdUser1) {
		this.bkpdUser1 = bkpdUser1;
	}

	public String getBkpdUser2() {
		return this.bkpdUser2;
	}

	public void setBkpdUser2(String bkpdUser2) {
		this.bkpdUser2 = bkpdUser2;
	}

	public String getBkpdUserc03() {
		return this.bkpdUserc03;
	}

	public void setBkpdUserc03(String bkpdUserc03) {
		this.bkpdUserc03 = bkpdUserc03;
	}

	public String getBkpdUserc04() {
		return this.bkpdUserc04;
	}

	public void setBkpdUserc04(String bkpdUserc04) {
		this.bkpdUserc04 = bkpdUserc04;
	}

	public Date getBkpdUsert01() {
		return this.bkpdUsert01;
	}

	public void setBkpdUsert01(Date bkpdUsert01) {
		this.bkpdUsert01 = bkpdUsert01;
	}

	public Date getBkpdUsert02() {
		return this.bkpdUsert02;
	}

	public void setBkpdUsert02(Date bkpdUsert02) {
		this.bkpdUsert02 = bkpdUsert02;
	}

	public Boolean getBkpdUserl01() {
		return this.bkpdUserl01;
	}

	public void setBkpdUserl01(Boolean bkpdUserl01) {
		this.bkpdUserl01 = bkpdUserl01;
	}

	public Boolean getBkpdUserl02() {
		return this.bkpdUserl02;
	}

	public void setBkpdUserl02(Boolean bkpdUserl02) {
		this.bkpdUserl02 = bkpdUserl02;
	}

	public String getBkpdQadc01() {
		return this.bkpdQadc01;
	}

	public void setBkpdQadc01(String bkpdQadc01) {
		this.bkpdQadc01 = bkpdQadc01;
	}

	public String getBkpdQadc02() {
		return this.bkpdQadc02;
	}

	public void setBkpdQadc02(String bkpdQadc02) {
		this.bkpdQadc02 = bkpdQadc02;
	}

	public String getBkpdNbr() {
		return this.bkpdNbr;
	}

	public void setBkpdNbr(String bkpdNbr) {
		this.bkpdNbr = bkpdNbr;
	}

	public Date getBkpdDueDate() {
		return this.bkpdDueDate;
	}

	public void setBkpdDueDate(Date bkpdDueDate) {
		this.bkpdDueDate = bkpdDueDate;
	}

	public Boolean getBkpdSeparate() {
		return this.bkpdSeparate;
	}

	public void setBkpdSeparate(Boolean bkpdSeparate) {
		this.bkpdSeparate = bkpdSeparate;
	}

	public String getBkpdFullBkAcct() {
		return this.bkpdFullBkAcct;
	}

	public void setBkpdFullBkAcct(String bkpdFullBkAcct) {
		this.bkpdFullBkAcct = bkpdFullBkAcct;
	}

	public String getBkpdCsBank() {
		return this.bkpdCsBank;
	}

	public void setBkpdCsBank(String bkpdCsBank) {
		this.bkpdCsBank = bkpdCsBank;
	}

	public Date getBkpdModDate() {
		return this.bkpdModDate;
	}

	public void setBkpdModDate(Date bkpdModDate) {
		this.bkpdModDate = bkpdModDate;
	}

	public String getBkpdModUserid() {
		return this.bkpdModUserid;
	}

	public void setBkpdModUserid(String bkpdModUserid) {
		this.bkpdModUserid = bkpdModUserid;
	}

	public String getBkpdUserc05() {
		return this.bkpdUserc05;
	}

	public void setBkpdUserc05(String bkpdUserc05) {
		this.bkpdUserc05 = bkpdUserc05;
	}

	public Double getBkpdUserd01() {
		return this.bkpdUserd01;
	}

	public void setBkpdUserd01(Double bkpdUserd01) {
		this.bkpdUserd01 = bkpdUserd01;
	}

	public Double getBkpdUserd02() {
		return this.bkpdUserd02;
	}

	public void setBkpdUserd02(Double bkpdUserd02) {
		this.bkpdUserd02 = bkpdUserd02;
	}

	public Integer getBkpdUseri01() {
		return this.bkpdUseri01;
	}

	public void setBkpdUseri01(Integer bkpdUseri01) {
		this.bkpdUseri01 = bkpdUseri01;
	}

	public Integer getBkpdUseri02() {
		return this.bkpdUseri02;
	}

	public void setBkpdUseri02(Integer bkpdUseri02) {
		this.bkpdUseri02 = bkpdUseri02;
	}

	public String getBkpdQadc03() {
		return this.bkpdQadc03;
	}

	public void setBkpdQadc03(String bkpdQadc03) {
		this.bkpdQadc03 = bkpdQadc03;
	}

	public String getBkpdQadc04() {
		return this.bkpdQadc04;
	}

	public void setBkpdQadc04(String bkpdQadc04) {
		this.bkpdQadc04 = bkpdQadc04;
	}

	public String getBkpdQadc05() {
		return this.bkpdQadc05;
	}

	public void setBkpdQadc05(String bkpdQadc05) {
		this.bkpdQadc05 = bkpdQadc05;
	}

	public Double getBkpdQadd01() {
		return this.bkpdQadd01;
	}

	public void setBkpdQadd01(Double bkpdQadd01) {
		this.bkpdQadd01 = bkpdQadd01;
	}

	public Double getBkpdQadd02() {
		return this.bkpdQadd02;
	}

	public void setBkpdQadd02(Double bkpdQadd02) {
		this.bkpdQadd02 = bkpdQadd02;
	}

	public Integer getBkpdQadi01() {
		return this.bkpdQadi01;
	}

	public void setBkpdQadi01(Integer bkpdQadi01) {
		this.bkpdQadi01 = bkpdQadi01;
	}

	public Integer getBkpdQadi02() {
		return this.bkpdQadi02;
	}

	public void setBkpdQadi02(Integer bkpdQadi02) {
		this.bkpdQadi02 = bkpdQadi02;
	}

	public Boolean getBkpdQadl01() {
		return this.bkpdQadl01;
	}

	public void setBkpdQadl01(Boolean bkpdQadl01) {
		this.bkpdQadl01 = bkpdQadl01;
	}

	public Boolean getBkpdQadl02() {
		return this.bkpdQadl02;
	}

	public void setBkpdQadl02(Boolean bkpdQadl02) {
		this.bkpdQadl02 = bkpdQadl02;
	}

	public Date getBkpdQadt01() {
		return this.bkpdQadt01;
	}

	public void setBkpdQadt01(Date bkpdQadt01) {
		this.bkpdQadt01 = bkpdQadt01;
	}

	public Date getBkpdQadt02() {
		return this.bkpdQadt02;
	}

	public void setBkpdQadt02(Date bkpdQadt02) {
		this.bkpdQadt02 = bkpdQadt02;
	}

	public Double getOidBkpdDet() {
		return this.oidBkpdDet;
	}

	public void setOidBkpdDet(Double oidBkpdDet) {
		this.oidBkpdDet = oidBkpdDet;
	}

}