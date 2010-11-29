package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCcdMstr entity provides the base persistence definition of the
 * CcdMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCcdMstr implements java.io.Serializable {

	// Fields

	private CcdMstrId id;
	private String ccdType;
	private String ccdEngCode;
	private Double ccdHours;
	private String ccdProblem;
	private String ccdChr01;
	private String ccdChr02;
	private String ccdChr03;
	private String ccdChr04;
	private String ccdChr05;
	private String ccdChr06;
	private String ccdChr07;
	private String ccdChr08;
	private String ccdCause;
	private String ccdResolution;
	private String ccdSerial;
	private String ccdDate;
	private String ccdSysSer;
	private String ccdSysPart;
	private Integer ccdCmtindx;
	private String ccdUser1;
	private String ccdUser2;
	private Boolean ccdLog01;
	private String ccdQadc01;
	private String ccdQadc02;
	private String ccdQadc03;
	private String ccdQadc04;
	private Date ccdModDate;
	private String ccdModUserid;
	private Double oidCcdMstr;

	// Constructors

	/** default constructor */
	public AbstractCcdMstr() {
	}

	/** minimal constructor */
	public AbstractCcdMstr(CcdMstrId id, Double oidCcdMstr) {
		this.id = id;
		this.oidCcdMstr = oidCcdMstr;
	}

	/** full constructor */
	public AbstractCcdMstr(CcdMstrId id, String ccdType, String ccdEngCode,
			Double ccdHours, String ccdProblem, String ccdChr01,
			String ccdChr02, String ccdChr03, String ccdChr04, String ccdChr05,
			String ccdChr06, String ccdChr07, String ccdChr08, String ccdCause,
			String ccdResolution, String ccdSerial, String ccdDate,
			String ccdSysSer, String ccdSysPart, Integer ccdCmtindx,
			String ccdUser1, String ccdUser2, Boolean ccdLog01,
			String ccdQadc01, String ccdQadc02, String ccdQadc03,
			String ccdQadc04, Date ccdModDate, String ccdModUserid,
			Double oidCcdMstr) {
		this.id = id;
		this.ccdType = ccdType;
		this.ccdEngCode = ccdEngCode;
		this.ccdHours = ccdHours;
		this.ccdProblem = ccdProblem;
		this.ccdChr01 = ccdChr01;
		this.ccdChr02 = ccdChr02;
		this.ccdChr03 = ccdChr03;
		this.ccdChr04 = ccdChr04;
		this.ccdChr05 = ccdChr05;
		this.ccdChr06 = ccdChr06;
		this.ccdChr07 = ccdChr07;
		this.ccdChr08 = ccdChr08;
		this.ccdCause = ccdCause;
		this.ccdResolution = ccdResolution;
		this.ccdSerial = ccdSerial;
		this.ccdDate = ccdDate;
		this.ccdSysSer = ccdSysSer;
		this.ccdSysPart = ccdSysPart;
		this.ccdCmtindx = ccdCmtindx;
		this.ccdUser1 = ccdUser1;
		this.ccdUser2 = ccdUser2;
		this.ccdLog01 = ccdLog01;
		this.ccdQadc01 = ccdQadc01;
		this.ccdQadc02 = ccdQadc02;
		this.ccdQadc03 = ccdQadc03;
		this.ccdQadc04 = ccdQadc04;
		this.ccdModDate = ccdModDate;
		this.ccdModUserid = ccdModUserid;
		this.oidCcdMstr = oidCcdMstr;
	}

	// Property accessors

	public CcdMstrId getId() {
		return this.id;
	}

	public void setId(CcdMstrId id) {
		this.id = id;
	}

	public String getCcdType() {
		return this.ccdType;
	}

	public void setCcdType(String ccdType) {
		this.ccdType = ccdType;
	}

	public String getCcdEngCode() {
		return this.ccdEngCode;
	}

	public void setCcdEngCode(String ccdEngCode) {
		this.ccdEngCode = ccdEngCode;
	}

	public Double getCcdHours() {
		return this.ccdHours;
	}

	public void setCcdHours(Double ccdHours) {
		this.ccdHours = ccdHours;
	}

	public String getCcdProblem() {
		return this.ccdProblem;
	}

	public void setCcdProblem(String ccdProblem) {
		this.ccdProblem = ccdProblem;
	}

	public String getCcdChr01() {
		return this.ccdChr01;
	}

	public void setCcdChr01(String ccdChr01) {
		this.ccdChr01 = ccdChr01;
	}

	public String getCcdChr02() {
		return this.ccdChr02;
	}

	public void setCcdChr02(String ccdChr02) {
		this.ccdChr02 = ccdChr02;
	}

	public String getCcdChr03() {
		return this.ccdChr03;
	}

	public void setCcdChr03(String ccdChr03) {
		this.ccdChr03 = ccdChr03;
	}

	public String getCcdChr04() {
		return this.ccdChr04;
	}

	public void setCcdChr04(String ccdChr04) {
		this.ccdChr04 = ccdChr04;
	}

	public String getCcdChr05() {
		return this.ccdChr05;
	}

	public void setCcdChr05(String ccdChr05) {
		this.ccdChr05 = ccdChr05;
	}

	public String getCcdChr06() {
		return this.ccdChr06;
	}

	public void setCcdChr06(String ccdChr06) {
		this.ccdChr06 = ccdChr06;
	}

	public String getCcdChr07() {
		return this.ccdChr07;
	}

	public void setCcdChr07(String ccdChr07) {
		this.ccdChr07 = ccdChr07;
	}

	public String getCcdChr08() {
		return this.ccdChr08;
	}

	public void setCcdChr08(String ccdChr08) {
		this.ccdChr08 = ccdChr08;
	}

	public String getCcdCause() {
		return this.ccdCause;
	}

	public void setCcdCause(String ccdCause) {
		this.ccdCause = ccdCause;
	}

	public String getCcdResolution() {
		return this.ccdResolution;
	}

	public void setCcdResolution(String ccdResolution) {
		this.ccdResolution = ccdResolution;
	}

	public String getCcdSerial() {
		return this.ccdSerial;
	}

	public void setCcdSerial(String ccdSerial) {
		this.ccdSerial = ccdSerial;
	}

	public String getCcdDate() {
		return this.ccdDate;
	}

	public void setCcdDate(String ccdDate) {
		this.ccdDate = ccdDate;
	}

	public String getCcdSysSer() {
		return this.ccdSysSer;
	}

	public void setCcdSysSer(String ccdSysSer) {
		this.ccdSysSer = ccdSysSer;
	}

	public String getCcdSysPart() {
		return this.ccdSysPart;
	}

	public void setCcdSysPart(String ccdSysPart) {
		this.ccdSysPart = ccdSysPart;
	}

	public Integer getCcdCmtindx() {
		return this.ccdCmtindx;
	}

	public void setCcdCmtindx(Integer ccdCmtindx) {
		this.ccdCmtindx = ccdCmtindx;
	}

	public String getCcdUser1() {
		return this.ccdUser1;
	}

	public void setCcdUser1(String ccdUser1) {
		this.ccdUser1 = ccdUser1;
	}

	public String getCcdUser2() {
		return this.ccdUser2;
	}

	public void setCcdUser2(String ccdUser2) {
		this.ccdUser2 = ccdUser2;
	}

	public Boolean getCcdLog01() {
		return this.ccdLog01;
	}

	public void setCcdLog01(Boolean ccdLog01) {
		this.ccdLog01 = ccdLog01;
	}

	public String getCcdQadc01() {
		return this.ccdQadc01;
	}

	public void setCcdQadc01(String ccdQadc01) {
		this.ccdQadc01 = ccdQadc01;
	}

	public String getCcdQadc02() {
		return this.ccdQadc02;
	}

	public void setCcdQadc02(String ccdQadc02) {
		this.ccdQadc02 = ccdQadc02;
	}

	public String getCcdQadc03() {
		return this.ccdQadc03;
	}

	public void setCcdQadc03(String ccdQadc03) {
		this.ccdQadc03 = ccdQadc03;
	}

	public String getCcdQadc04() {
		return this.ccdQadc04;
	}

	public void setCcdQadc04(String ccdQadc04) {
		this.ccdQadc04 = ccdQadc04;
	}

	public Date getCcdModDate() {
		return this.ccdModDate;
	}

	public void setCcdModDate(Date ccdModDate) {
		this.ccdModDate = ccdModDate;
	}

	public String getCcdModUserid() {
		return this.ccdModUserid;
	}

	public void setCcdModUserid(String ccdModUserid) {
		this.ccdModUserid = ccdModUserid;
	}

	public Double getOidCcdMstr() {
		return this.oidCcdMstr;
	}

	public void setOidCcdMstr(Double oidCcdMstr) {
		this.oidCcdMstr = oidCcdMstr;
	}

}