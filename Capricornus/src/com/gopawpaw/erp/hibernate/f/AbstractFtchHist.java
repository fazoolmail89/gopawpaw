package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFtchHist entity provides the base persistence definition of the
 * FtchHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFtchHist implements java.io.Serializable {

	// Fields

	private FtchHistId id;
	private String ftchDesc;
	private Date ftchEffDate;
	private String ftchEngCode;
	private Date ftchEntDate;
	private String ftchModel;
	private String ftchNbr;
	private String ftchPart;
	private String ftchSerial;
	private Boolean ftchSwapped;
	private String ftchTrans;
	private Date ftchModDate;
	private String ftchChr01;
	private String ftchModUserid;
	private Date ftchDte01;
	private Boolean ftchLog01;
	private String ftchPriorValue;
	private Date ftchQadt01;
	private Boolean ftchQadl01;
	private String ftchUser1;
	private String ftchUser2;
	private String ftchQadc02;
	private Double ftchQadd01;
	private Double oidFtchHist;

	// Constructors

	/** default constructor */
	public AbstractFtchHist() {
	}

	/** minimal constructor */
	public AbstractFtchHist(FtchHistId id, Double oidFtchHist) {
		this.id = id;
		this.oidFtchHist = oidFtchHist;
	}

	/** full constructor */
	public AbstractFtchHist(FtchHistId id, String ftchDesc, Date ftchEffDate,
			String ftchEngCode, Date ftchEntDate, String ftchModel,
			String ftchNbr, String ftchPart, String ftchSerial,
			Boolean ftchSwapped, String ftchTrans, Date ftchModDate,
			String ftchChr01, String ftchModUserid, Date ftchDte01,
			Boolean ftchLog01, String ftchPriorValue, Date ftchQadt01,
			Boolean ftchQadl01, String ftchUser1, String ftchUser2,
			String ftchQadc02, Double ftchQadd01, Double oidFtchHist) {
		this.id = id;
		this.ftchDesc = ftchDesc;
		this.ftchEffDate = ftchEffDate;
		this.ftchEngCode = ftchEngCode;
		this.ftchEntDate = ftchEntDate;
		this.ftchModel = ftchModel;
		this.ftchNbr = ftchNbr;
		this.ftchPart = ftchPart;
		this.ftchSerial = ftchSerial;
		this.ftchSwapped = ftchSwapped;
		this.ftchTrans = ftchTrans;
		this.ftchModDate = ftchModDate;
		this.ftchChr01 = ftchChr01;
		this.ftchModUserid = ftchModUserid;
		this.ftchDte01 = ftchDte01;
		this.ftchLog01 = ftchLog01;
		this.ftchPriorValue = ftchPriorValue;
		this.ftchQadt01 = ftchQadt01;
		this.ftchQadl01 = ftchQadl01;
		this.ftchUser1 = ftchUser1;
		this.ftchUser2 = ftchUser2;
		this.ftchQadc02 = ftchQadc02;
		this.ftchQadd01 = ftchQadd01;
		this.oidFtchHist = oidFtchHist;
	}

	// Property accessors

	public FtchHistId getId() {
		return this.id;
	}

	public void setId(FtchHistId id) {
		this.id = id;
	}

	public String getFtchDesc() {
		return this.ftchDesc;
	}

	public void setFtchDesc(String ftchDesc) {
		this.ftchDesc = ftchDesc;
	}

	public Date getFtchEffDate() {
		return this.ftchEffDate;
	}

	public void setFtchEffDate(Date ftchEffDate) {
		this.ftchEffDate = ftchEffDate;
	}

	public String getFtchEngCode() {
		return this.ftchEngCode;
	}

	public void setFtchEngCode(String ftchEngCode) {
		this.ftchEngCode = ftchEngCode;
	}

	public Date getFtchEntDate() {
		return this.ftchEntDate;
	}

	public void setFtchEntDate(Date ftchEntDate) {
		this.ftchEntDate = ftchEntDate;
	}

	public String getFtchModel() {
		return this.ftchModel;
	}

	public void setFtchModel(String ftchModel) {
		this.ftchModel = ftchModel;
	}

	public String getFtchNbr() {
		return this.ftchNbr;
	}

	public void setFtchNbr(String ftchNbr) {
		this.ftchNbr = ftchNbr;
	}

	public String getFtchPart() {
		return this.ftchPart;
	}

	public void setFtchPart(String ftchPart) {
		this.ftchPart = ftchPart;
	}

	public String getFtchSerial() {
		return this.ftchSerial;
	}

	public void setFtchSerial(String ftchSerial) {
		this.ftchSerial = ftchSerial;
	}

	public Boolean getFtchSwapped() {
		return this.ftchSwapped;
	}

	public void setFtchSwapped(Boolean ftchSwapped) {
		this.ftchSwapped = ftchSwapped;
	}

	public String getFtchTrans() {
		return this.ftchTrans;
	}

	public void setFtchTrans(String ftchTrans) {
		this.ftchTrans = ftchTrans;
	}

	public Date getFtchModDate() {
		return this.ftchModDate;
	}

	public void setFtchModDate(Date ftchModDate) {
		this.ftchModDate = ftchModDate;
	}

	public String getFtchChr01() {
		return this.ftchChr01;
	}

	public void setFtchChr01(String ftchChr01) {
		this.ftchChr01 = ftchChr01;
	}

	public String getFtchModUserid() {
		return this.ftchModUserid;
	}

	public void setFtchModUserid(String ftchModUserid) {
		this.ftchModUserid = ftchModUserid;
	}

	public Date getFtchDte01() {
		return this.ftchDte01;
	}

	public void setFtchDte01(Date ftchDte01) {
		this.ftchDte01 = ftchDte01;
	}

	public Boolean getFtchLog01() {
		return this.ftchLog01;
	}

	public void setFtchLog01(Boolean ftchLog01) {
		this.ftchLog01 = ftchLog01;
	}

	public String getFtchPriorValue() {
		return this.ftchPriorValue;
	}

	public void setFtchPriorValue(String ftchPriorValue) {
		this.ftchPriorValue = ftchPriorValue;
	}

	public Date getFtchQadt01() {
		return this.ftchQadt01;
	}

	public void setFtchQadt01(Date ftchQadt01) {
		this.ftchQadt01 = ftchQadt01;
	}

	public Boolean getFtchQadl01() {
		return this.ftchQadl01;
	}

	public void setFtchQadl01(Boolean ftchQadl01) {
		this.ftchQadl01 = ftchQadl01;
	}

	public String getFtchUser1() {
		return this.ftchUser1;
	}

	public void setFtchUser1(String ftchUser1) {
		this.ftchUser1 = ftchUser1;
	}

	public String getFtchUser2() {
		return this.ftchUser2;
	}

	public void setFtchUser2(String ftchUser2) {
		this.ftchUser2 = ftchUser2;
	}

	public String getFtchQadc02() {
		return this.ftchQadc02;
	}

	public void setFtchQadc02(String ftchQadc02) {
		this.ftchQadc02 = ftchQadc02;
	}

	public Double getFtchQadd01() {
		return this.ftchQadd01;
	}

	public void setFtchQadd01(Double ftchQadd01) {
		this.ftchQadd01 = ftchQadd01;
	}

	public Double getOidFtchHist() {
		return this.oidFtchHist;
	}

	public void setOidFtchHist(Double oidFtchHist) {
		this.oidFtchHist = oidFtchHist;
	}

}