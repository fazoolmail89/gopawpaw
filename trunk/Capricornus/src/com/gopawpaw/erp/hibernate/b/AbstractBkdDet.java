package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBkdDet entity provides the base persistence definition of the BkdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkdDet implements java.io.Serializable {

	// Fields

	private BkdDetId id;
	private Boolean bkdAutoPayment;
	private Boolean bkdManualPayment;
	private Boolean bkdDraft;
	private Integer bkdFromCk;
	private Integer bkdToCk;
	private Integer bkdNextCk;
	private String bkdPipAcct;
	private String bkdPipCc;
	private String bkdProgram;
	private String bkdUser1;
	private String bkdUser2;
	private Boolean bkdFile;
	private String bkdValidationList;
	private String bkdCurrList;
	private Boolean bkdSwift;
	private Boolean bkdAccMandatory;
	private Boolean bkdUserl01;
	private Boolean bkdQadl01;
	private Double bkdUserd01;
	private Double bkdQadd01;
	private Date bkdUsert01;
	private Integer bkdPayGroup;
	private Boolean bkdExceedBalance;
	private Boolean bkdReconCredit;
	private String bkdPipSub;
	private Integer bkdUseri01;
	private Integer bkdQadi01;
	private String bkdQadc01;
	private String bkdQadc02;
	private Date bkdQadt01;
	private Date bkdModDate;
	private String bkdModUserid;
	private Double oidBkdDet;

	// Constructors

	/** default constructor */
	public AbstractBkdDet() {
	}

	/** minimal constructor */
	public AbstractBkdDet(BkdDetId id, Boolean bkdAutoPayment,
			Boolean bkdManualPayment, Boolean bkdDraft, Integer bkdFromCk,
			Integer bkdToCk, Integer bkdNextCk, String bkdPipAcct,
			String bkdPipCc, String bkdProgram, String bkdUser1,
			String bkdUser2, Boolean bkdFile, String bkdValidationList,
			String bkdCurrList, Boolean bkdSwift, Boolean bkdAccMandatory,
			Boolean bkdUserl01, Boolean bkdQadl01, Double bkdUserd01,
			Double bkdQadd01, Integer bkdPayGroup, Boolean bkdExceedBalance,
			Boolean bkdReconCredit, String bkdPipSub, Integer bkdUseri01,
			Integer bkdQadi01, String bkdQadc01, String bkdQadc02,
			Date bkdModDate, String bkdModUserid, Double oidBkdDet) {
		this.id = id;
		this.bkdAutoPayment = bkdAutoPayment;
		this.bkdManualPayment = bkdManualPayment;
		this.bkdDraft = bkdDraft;
		this.bkdFromCk = bkdFromCk;
		this.bkdToCk = bkdToCk;
		this.bkdNextCk = bkdNextCk;
		this.bkdPipAcct = bkdPipAcct;
		this.bkdPipCc = bkdPipCc;
		this.bkdProgram = bkdProgram;
		this.bkdUser1 = bkdUser1;
		this.bkdUser2 = bkdUser2;
		this.bkdFile = bkdFile;
		this.bkdValidationList = bkdValidationList;
		this.bkdCurrList = bkdCurrList;
		this.bkdSwift = bkdSwift;
		this.bkdAccMandatory = bkdAccMandatory;
		this.bkdUserl01 = bkdUserl01;
		this.bkdQadl01 = bkdQadl01;
		this.bkdUserd01 = bkdUserd01;
		this.bkdQadd01 = bkdQadd01;
		this.bkdPayGroup = bkdPayGroup;
		this.bkdExceedBalance = bkdExceedBalance;
		this.bkdReconCredit = bkdReconCredit;
		this.bkdPipSub = bkdPipSub;
		this.bkdUseri01 = bkdUseri01;
		this.bkdQadi01 = bkdQadi01;
		this.bkdQadc01 = bkdQadc01;
		this.bkdQadc02 = bkdQadc02;
		this.bkdModDate = bkdModDate;
		this.bkdModUserid = bkdModUserid;
		this.oidBkdDet = oidBkdDet;
	}

	/** full constructor */
	public AbstractBkdDet(BkdDetId id, Boolean bkdAutoPayment,
			Boolean bkdManualPayment, Boolean bkdDraft, Integer bkdFromCk,
			Integer bkdToCk, Integer bkdNextCk, String bkdPipAcct,
			String bkdPipCc, String bkdProgram, String bkdUser1,
			String bkdUser2, Boolean bkdFile, String bkdValidationList,
			String bkdCurrList, Boolean bkdSwift, Boolean bkdAccMandatory,
			Boolean bkdUserl01, Boolean bkdQadl01, Double bkdUserd01,
			Double bkdQadd01, Date bkdUsert01, Integer bkdPayGroup,
			Boolean bkdExceedBalance, Boolean bkdReconCredit, String bkdPipSub,
			Integer bkdUseri01, Integer bkdQadi01, String bkdQadc01,
			String bkdQadc02, Date bkdQadt01, Date bkdModDate,
			String bkdModUserid, Double oidBkdDet) {
		this.id = id;
		this.bkdAutoPayment = bkdAutoPayment;
		this.bkdManualPayment = bkdManualPayment;
		this.bkdDraft = bkdDraft;
		this.bkdFromCk = bkdFromCk;
		this.bkdToCk = bkdToCk;
		this.bkdNextCk = bkdNextCk;
		this.bkdPipAcct = bkdPipAcct;
		this.bkdPipCc = bkdPipCc;
		this.bkdProgram = bkdProgram;
		this.bkdUser1 = bkdUser1;
		this.bkdUser2 = bkdUser2;
		this.bkdFile = bkdFile;
		this.bkdValidationList = bkdValidationList;
		this.bkdCurrList = bkdCurrList;
		this.bkdSwift = bkdSwift;
		this.bkdAccMandatory = bkdAccMandatory;
		this.bkdUserl01 = bkdUserl01;
		this.bkdQadl01 = bkdQadl01;
		this.bkdUserd01 = bkdUserd01;
		this.bkdQadd01 = bkdQadd01;
		this.bkdUsert01 = bkdUsert01;
		this.bkdPayGroup = bkdPayGroup;
		this.bkdExceedBalance = bkdExceedBalance;
		this.bkdReconCredit = bkdReconCredit;
		this.bkdPipSub = bkdPipSub;
		this.bkdUseri01 = bkdUseri01;
		this.bkdQadi01 = bkdQadi01;
		this.bkdQadc01 = bkdQadc01;
		this.bkdQadc02 = bkdQadc02;
		this.bkdQadt01 = bkdQadt01;
		this.bkdModDate = bkdModDate;
		this.bkdModUserid = bkdModUserid;
		this.oidBkdDet = oidBkdDet;
	}

	// Property accessors

	public BkdDetId getId() {
		return this.id;
	}

	public void setId(BkdDetId id) {
		this.id = id;
	}

	public Boolean getBkdAutoPayment() {
		return this.bkdAutoPayment;
	}

	public void setBkdAutoPayment(Boolean bkdAutoPayment) {
		this.bkdAutoPayment = bkdAutoPayment;
	}

	public Boolean getBkdManualPayment() {
		return this.bkdManualPayment;
	}

	public void setBkdManualPayment(Boolean bkdManualPayment) {
		this.bkdManualPayment = bkdManualPayment;
	}

	public Boolean getBkdDraft() {
		return this.bkdDraft;
	}

	public void setBkdDraft(Boolean bkdDraft) {
		this.bkdDraft = bkdDraft;
	}

	public Integer getBkdFromCk() {
		return this.bkdFromCk;
	}

	public void setBkdFromCk(Integer bkdFromCk) {
		this.bkdFromCk = bkdFromCk;
	}

	public Integer getBkdToCk() {
		return this.bkdToCk;
	}

	public void setBkdToCk(Integer bkdToCk) {
		this.bkdToCk = bkdToCk;
	}

	public Integer getBkdNextCk() {
		return this.bkdNextCk;
	}

	public void setBkdNextCk(Integer bkdNextCk) {
		this.bkdNextCk = bkdNextCk;
	}

	public String getBkdPipAcct() {
		return this.bkdPipAcct;
	}

	public void setBkdPipAcct(String bkdPipAcct) {
		this.bkdPipAcct = bkdPipAcct;
	}

	public String getBkdPipCc() {
		return this.bkdPipCc;
	}

	public void setBkdPipCc(String bkdPipCc) {
		this.bkdPipCc = bkdPipCc;
	}

	public String getBkdProgram() {
		return this.bkdProgram;
	}

	public void setBkdProgram(String bkdProgram) {
		this.bkdProgram = bkdProgram;
	}

	public String getBkdUser1() {
		return this.bkdUser1;
	}

	public void setBkdUser1(String bkdUser1) {
		this.bkdUser1 = bkdUser1;
	}

	public String getBkdUser2() {
		return this.bkdUser2;
	}

	public void setBkdUser2(String bkdUser2) {
		this.bkdUser2 = bkdUser2;
	}

	public Boolean getBkdFile() {
		return this.bkdFile;
	}

	public void setBkdFile(Boolean bkdFile) {
		this.bkdFile = bkdFile;
	}

	public String getBkdValidationList() {
		return this.bkdValidationList;
	}

	public void setBkdValidationList(String bkdValidationList) {
		this.bkdValidationList = bkdValidationList;
	}

	public String getBkdCurrList() {
		return this.bkdCurrList;
	}

	public void setBkdCurrList(String bkdCurrList) {
		this.bkdCurrList = bkdCurrList;
	}

	public Boolean getBkdSwift() {
		return this.bkdSwift;
	}

	public void setBkdSwift(Boolean bkdSwift) {
		this.bkdSwift = bkdSwift;
	}

	public Boolean getBkdAccMandatory() {
		return this.bkdAccMandatory;
	}

	public void setBkdAccMandatory(Boolean bkdAccMandatory) {
		this.bkdAccMandatory = bkdAccMandatory;
	}

	public Boolean getBkdUserl01() {
		return this.bkdUserl01;
	}

	public void setBkdUserl01(Boolean bkdUserl01) {
		this.bkdUserl01 = bkdUserl01;
	}

	public Boolean getBkdQadl01() {
		return this.bkdQadl01;
	}

	public void setBkdQadl01(Boolean bkdQadl01) {
		this.bkdQadl01 = bkdQadl01;
	}

	public Double getBkdUserd01() {
		return this.bkdUserd01;
	}

	public void setBkdUserd01(Double bkdUserd01) {
		this.bkdUserd01 = bkdUserd01;
	}

	public Double getBkdQadd01() {
		return this.bkdQadd01;
	}

	public void setBkdQadd01(Double bkdQadd01) {
		this.bkdQadd01 = bkdQadd01;
	}

	public Date getBkdUsert01() {
		return this.bkdUsert01;
	}

	public void setBkdUsert01(Date bkdUsert01) {
		this.bkdUsert01 = bkdUsert01;
	}

	public Integer getBkdPayGroup() {
		return this.bkdPayGroup;
	}

	public void setBkdPayGroup(Integer bkdPayGroup) {
		this.bkdPayGroup = bkdPayGroup;
	}

	public Boolean getBkdExceedBalance() {
		return this.bkdExceedBalance;
	}

	public void setBkdExceedBalance(Boolean bkdExceedBalance) {
		this.bkdExceedBalance = bkdExceedBalance;
	}

	public Boolean getBkdReconCredit() {
		return this.bkdReconCredit;
	}

	public void setBkdReconCredit(Boolean bkdReconCredit) {
		this.bkdReconCredit = bkdReconCredit;
	}

	public String getBkdPipSub() {
		return this.bkdPipSub;
	}

	public void setBkdPipSub(String bkdPipSub) {
		this.bkdPipSub = bkdPipSub;
	}

	public Integer getBkdUseri01() {
		return this.bkdUseri01;
	}

	public void setBkdUseri01(Integer bkdUseri01) {
		this.bkdUseri01 = bkdUseri01;
	}

	public Integer getBkdQadi01() {
		return this.bkdQadi01;
	}

	public void setBkdQadi01(Integer bkdQadi01) {
		this.bkdQadi01 = bkdQadi01;
	}

	public String getBkdQadc01() {
		return this.bkdQadc01;
	}

	public void setBkdQadc01(String bkdQadc01) {
		this.bkdQadc01 = bkdQadc01;
	}

	public String getBkdQadc02() {
		return this.bkdQadc02;
	}

	public void setBkdQadc02(String bkdQadc02) {
		this.bkdQadc02 = bkdQadc02;
	}

	public Date getBkdQadt01() {
		return this.bkdQadt01;
	}

	public void setBkdQadt01(Date bkdQadt01) {
		this.bkdQadt01 = bkdQadt01;
	}

	public Date getBkdModDate() {
		return this.bkdModDate;
	}

	public void setBkdModDate(Date bkdModDate) {
		this.bkdModDate = bkdModDate;
	}

	public String getBkdModUserid() {
		return this.bkdModUserid;
	}

	public void setBkdModUserid(String bkdModUserid) {
		this.bkdModUserid = bkdModUserid;
	}

	public Double getOidBkdDet() {
		return this.oidBkdDet;
	}

	public void setOidBkdDet(Double oidBkdDet) {
		this.oidBkdDet = oidBkdDet;
	}

}