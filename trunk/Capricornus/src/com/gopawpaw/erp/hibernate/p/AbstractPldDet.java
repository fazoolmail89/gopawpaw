package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPldDet entity provides the base persistence definition of the PldDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPldDet implements java.io.Serializable {

	// Fields

	private PldDetId id;
	private String pldInvAcct;
	private String pldScrpacct;
	private String pldDscracct;
	private String pldInvCc;
	private String pldScrpCc;
	private String pldDscrCc;
	private String pldUser1;
	private String pldUser2;
	private String pldUserid;
	private Date pldModDate;
	private String pldCchgAcc;
	private String pldCchgCc;
	private String pldQadc01;
	private String pldCchgSub;
	private String pldDscrSub;
	private String pldInvSub;
	private String pldScrpSub;
	private Double oidPldDet;

	// Constructors

	/** default constructor */
	public AbstractPldDet() {
	}

	/** minimal constructor */
	public AbstractPldDet(PldDetId id, Double oidPldDet) {
		this.id = id;
		this.oidPldDet = oidPldDet;
	}

	/** full constructor */
	public AbstractPldDet(PldDetId id, String pldInvAcct, String pldScrpacct,
			String pldDscracct, String pldInvCc, String pldScrpCc,
			String pldDscrCc, String pldUser1, String pldUser2,
			String pldUserid, Date pldModDate, String pldCchgAcc,
			String pldCchgCc, String pldQadc01, String pldCchgSub,
			String pldDscrSub, String pldInvSub, String pldScrpSub,
			Double oidPldDet) {
		this.id = id;
		this.pldInvAcct = pldInvAcct;
		this.pldScrpacct = pldScrpacct;
		this.pldDscracct = pldDscracct;
		this.pldInvCc = pldInvCc;
		this.pldScrpCc = pldScrpCc;
		this.pldDscrCc = pldDscrCc;
		this.pldUser1 = pldUser1;
		this.pldUser2 = pldUser2;
		this.pldUserid = pldUserid;
		this.pldModDate = pldModDate;
		this.pldCchgAcc = pldCchgAcc;
		this.pldCchgCc = pldCchgCc;
		this.pldQadc01 = pldQadc01;
		this.pldCchgSub = pldCchgSub;
		this.pldDscrSub = pldDscrSub;
		this.pldInvSub = pldInvSub;
		this.pldScrpSub = pldScrpSub;
		this.oidPldDet = oidPldDet;
	}

	// Property accessors

	public PldDetId getId() {
		return this.id;
	}

	public void setId(PldDetId id) {
		this.id = id;
	}

	public String getPldInvAcct() {
		return this.pldInvAcct;
	}

	public void setPldInvAcct(String pldInvAcct) {
		this.pldInvAcct = pldInvAcct;
	}

	public String getPldScrpacct() {
		return this.pldScrpacct;
	}

	public void setPldScrpacct(String pldScrpacct) {
		this.pldScrpacct = pldScrpacct;
	}

	public String getPldDscracct() {
		return this.pldDscracct;
	}

	public void setPldDscracct(String pldDscracct) {
		this.pldDscracct = pldDscracct;
	}

	public String getPldInvCc() {
		return this.pldInvCc;
	}

	public void setPldInvCc(String pldInvCc) {
		this.pldInvCc = pldInvCc;
	}

	public String getPldScrpCc() {
		return this.pldScrpCc;
	}

	public void setPldScrpCc(String pldScrpCc) {
		this.pldScrpCc = pldScrpCc;
	}

	public String getPldDscrCc() {
		return this.pldDscrCc;
	}

	public void setPldDscrCc(String pldDscrCc) {
		this.pldDscrCc = pldDscrCc;
	}

	public String getPldUser1() {
		return this.pldUser1;
	}

	public void setPldUser1(String pldUser1) {
		this.pldUser1 = pldUser1;
	}

	public String getPldUser2() {
		return this.pldUser2;
	}

	public void setPldUser2(String pldUser2) {
		this.pldUser2 = pldUser2;
	}

	public String getPldUserid() {
		return this.pldUserid;
	}

	public void setPldUserid(String pldUserid) {
		this.pldUserid = pldUserid;
	}

	public Date getPldModDate() {
		return this.pldModDate;
	}

	public void setPldModDate(Date pldModDate) {
		this.pldModDate = pldModDate;
	}

	public String getPldCchgAcc() {
		return this.pldCchgAcc;
	}

	public void setPldCchgAcc(String pldCchgAcc) {
		this.pldCchgAcc = pldCchgAcc;
	}

	public String getPldCchgCc() {
		return this.pldCchgCc;
	}

	public void setPldCchgCc(String pldCchgCc) {
		this.pldCchgCc = pldCchgCc;
	}

	public String getPldQadc01() {
		return this.pldQadc01;
	}

	public void setPldQadc01(String pldQadc01) {
		this.pldQadc01 = pldQadc01;
	}

	public String getPldCchgSub() {
		return this.pldCchgSub;
	}

	public void setPldCchgSub(String pldCchgSub) {
		this.pldCchgSub = pldCchgSub;
	}

	public String getPldDscrSub() {
		return this.pldDscrSub;
	}

	public void setPldDscrSub(String pldDscrSub) {
		this.pldDscrSub = pldDscrSub;
	}

	public String getPldInvSub() {
		return this.pldInvSub;
	}

	public void setPldInvSub(String pldInvSub) {
		this.pldInvSub = pldInvSub;
	}

	public String getPldScrpSub() {
		return this.pldScrpSub;
	}

	public void setPldScrpSub(String pldScrpSub) {
		this.pldScrpSub = pldScrpSub;
	}

	public Double getOidPldDet() {
		return this.oidPldDet;
	}

	public void setOidPldDet(Double oidPldDet) {
		this.oidPldDet = oidPldDet;
	}

}