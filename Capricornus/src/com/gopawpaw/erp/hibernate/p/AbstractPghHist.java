package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPghHist entity provides the base persistence definition of the
 * PghHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPghHist implements java.io.Serializable {

	// Fields

	private PghHistId id;
	private String pghEngCode;
	private String pghCaNbr;
	private String pghPhone;
	private Date pghDate;
	private String pghTimeInit;
	private String pghStatus;
	private String pghTimePaged;
	private String pghUser1;
	private String pghUser2;
	private String pghQadc01;
	private String pghQadc02;
	private Date pghQadt01;
	private String pghChr01;
	private String pghChr02;
	private Date pghDte01;
	private Boolean pghLog01;
	private Boolean pghQadl01;
	private Double oidPghHist;

	// Constructors

	/** default constructor */
	public AbstractPghHist() {
	}

	/** minimal constructor */
	public AbstractPghHist(PghHistId id, Double oidPghHist) {
		this.id = id;
		this.oidPghHist = oidPghHist;
	}

	/** full constructor */
	public AbstractPghHist(PghHistId id, String pghEngCode, String pghCaNbr,
			String pghPhone, Date pghDate, String pghTimeInit,
			String pghStatus, String pghTimePaged, String pghUser1,
			String pghUser2, String pghQadc01, String pghQadc02,
			Date pghQadt01, String pghChr01, String pghChr02, Date pghDte01,
			Boolean pghLog01, Boolean pghQadl01, Double oidPghHist) {
		this.id = id;
		this.pghEngCode = pghEngCode;
		this.pghCaNbr = pghCaNbr;
		this.pghPhone = pghPhone;
		this.pghDate = pghDate;
		this.pghTimeInit = pghTimeInit;
		this.pghStatus = pghStatus;
		this.pghTimePaged = pghTimePaged;
		this.pghUser1 = pghUser1;
		this.pghUser2 = pghUser2;
		this.pghQadc01 = pghQadc01;
		this.pghQadc02 = pghQadc02;
		this.pghQadt01 = pghQadt01;
		this.pghChr01 = pghChr01;
		this.pghChr02 = pghChr02;
		this.pghDte01 = pghDte01;
		this.pghLog01 = pghLog01;
		this.pghQadl01 = pghQadl01;
		this.oidPghHist = oidPghHist;
	}

	// Property accessors

	public PghHistId getId() {
		return this.id;
	}

	public void setId(PghHistId id) {
		this.id = id;
	}

	public String getPghEngCode() {
		return this.pghEngCode;
	}

	public void setPghEngCode(String pghEngCode) {
		this.pghEngCode = pghEngCode;
	}

	public String getPghCaNbr() {
		return this.pghCaNbr;
	}

	public void setPghCaNbr(String pghCaNbr) {
		this.pghCaNbr = pghCaNbr;
	}

	public String getPghPhone() {
		return this.pghPhone;
	}

	public void setPghPhone(String pghPhone) {
		this.pghPhone = pghPhone;
	}

	public Date getPghDate() {
		return this.pghDate;
	}

	public void setPghDate(Date pghDate) {
		this.pghDate = pghDate;
	}

	public String getPghTimeInit() {
		return this.pghTimeInit;
	}

	public void setPghTimeInit(String pghTimeInit) {
		this.pghTimeInit = pghTimeInit;
	}

	public String getPghStatus() {
		return this.pghStatus;
	}

	public void setPghStatus(String pghStatus) {
		this.pghStatus = pghStatus;
	}

	public String getPghTimePaged() {
		return this.pghTimePaged;
	}

	public void setPghTimePaged(String pghTimePaged) {
		this.pghTimePaged = pghTimePaged;
	}

	public String getPghUser1() {
		return this.pghUser1;
	}

	public void setPghUser1(String pghUser1) {
		this.pghUser1 = pghUser1;
	}

	public String getPghUser2() {
		return this.pghUser2;
	}

	public void setPghUser2(String pghUser2) {
		this.pghUser2 = pghUser2;
	}

	public String getPghQadc01() {
		return this.pghQadc01;
	}

	public void setPghQadc01(String pghQadc01) {
		this.pghQadc01 = pghQadc01;
	}

	public String getPghQadc02() {
		return this.pghQadc02;
	}

	public void setPghQadc02(String pghQadc02) {
		this.pghQadc02 = pghQadc02;
	}

	public Date getPghQadt01() {
		return this.pghQadt01;
	}

	public void setPghQadt01(Date pghQadt01) {
		this.pghQadt01 = pghQadt01;
	}

	public String getPghChr01() {
		return this.pghChr01;
	}

	public void setPghChr01(String pghChr01) {
		this.pghChr01 = pghChr01;
	}

	public String getPghChr02() {
		return this.pghChr02;
	}

	public void setPghChr02(String pghChr02) {
		this.pghChr02 = pghChr02;
	}

	public Date getPghDte01() {
		return this.pghDte01;
	}

	public void setPghDte01(Date pghDte01) {
		this.pghDte01 = pghDte01;
	}

	public Boolean getPghLog01() {
		return this.pghLog01;
	}

	public void setPghLog01(Boolean pghLog01) {
		this.pghLog01 = pghLog01;
	}

	public Boolean getPghQadl01() {
		return this.pghQadl01;
	}

	public void setPghQadl01(Boolean pghQadl01) {
		this.pghQadl01 = pghQadl01;
	}

	public Double getOidPghHist() {
		return this.oidPghHist;
	}

	public void setOidPghHist(Double oidPghHist) {
		this.oidPghHist = oidPghHist;
	}

}