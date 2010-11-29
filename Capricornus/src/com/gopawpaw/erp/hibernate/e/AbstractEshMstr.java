package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEshMstr entity provides the base persistence definition of the
 * EshMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEshMstr implements java.io.Serializable {

	// Fields

	private EshMstrId id;
	private String eshRegCode;
	private Date eshEndEff;
	private String eshSchedType;
	private String eshDays;
	private String eshStartTime;
	private String eshEndTime;
	private String eshStatus;
	private String eshShiftCode;
	private Boolean eshOncall;
	private Boolean eshHolidays;
	private String eshUser1;
	private String eshUser2;
	private Date eshModDate;
	private String eshModUserid;
	private String eshChr01;
	private String eshChr02;
	private Boolean eshLog01;
	private Boolean eshLog02;
	private Date eshDte01;
	private Date eshDte02;
	private String eshQadc01;
	private String eshQadc02;
	private Boolean eshQadl01;
	private Boolean eshQadl02;
	private Date eshQadt01;
	private Date eshQadt02;
	private Integer eshQadi01;
	private String eshQadi02;
	private Double oidEshMstr;

	// Constructors

	/** default constructor */
	public AbstractEshMstr() {
	}

	/** minimal constructor */
	public AbstractEshMstr(EshMstrId id, Double oidEshMstr) {
		this.id = id;
		this.oidEshMstr = oidEshMstr;
	}

	/** full constructor */
	public AbstractEshMstr(EshMstrId id, String eshRegCode, Date eshEndEff,
			String eshSchedType, String eshDays, String eshStartTime,
			String eshEndTime, String eshStatus, String eshShiftCode,
			Boolean eshOncall, Boolean eshHolidays, String eshUser1,
			String eshUser2, Date eshModDate, String eshModUserid,
			String eshChr01, String eshChr02, Boolean eshLog01,
			Boolean eshLog02, Date eshDte01, Date eshDte02, String eshQadc01,
			String eshQadc02, Boolean eshQadl01, Boolean eshQadl02,
			Date eshQadt01, Date eshQadt02, Integer eshQadi01,
			String eshQadi02, Double oidEshMstr) {
		this.id = id;
		this.eshRegCode = eshRegCode;
		this.eshEndEff = eshEndEff;
		this.eshSchedType = eshSchedType;
		this.eshDays = eshDays;
		this.eshStartTime = eshStartTime;
		this.eshEndTime = eshEndTime;
		this.eshStatus = eshStatus;
		this.eshShiftCode = eshShiftCode;
		this.eshOncall = eshOncall;
		this.eshHolidays = eshHolidays;
		this.eshUser1 = eshUser1;
		this.eshUser2 = eshUser2;
		this.eshModDate = eshModDate;
		this.eshModUserid = eshModUserid;
		this.eshChr01 = eshChr01;
		this.eshChr02 = eshChr02;
		this.eshLog01 = eshLog01;
		this.eshLog02 = eshLog02;
		this.eshDte01 = eshDte01;
		this.eshDte02 = eshDte02;
		this.eshQadc01 = eshQadc01;
		this.eshQadc02 = eshQadc02;
		this.eshQadl01 = eshQadl01;
		this.eshQadl02 = eshQadl02;
		this.eshQadt01 = eshQadt01;
		this.eshQadt02 = eshQadt02;
		this.eshQadi01 = eshQadi01;
		this.eshQadi02 = eshQadi02;
		this.oidEshMstr = oidEshMstr;
	}

	// Property accessors

	public EshMstrId getId() {
		return this.id;
	}

	public void setId(EshMstrId id) {
		this.id = id;
	}

	public String getEshRegCode() {
		return this.eshRegCode;
	}

	public void setEshRegCode(String eshRegCode) {
		this.eshRegCode = eshRegCode;
	}

	public Date getEshEndEff() {
		return this.eshEndEff;
	}

	public void setEshEndEff(Date eshEndEff) {
		this.eshEndEff = eshEndEff;
	}

	public String getEshSchedType() {
		return this.eshSchedType;
	}

	public void setEshSchedType(String eshSchedType) {
		this.eshSchedType = eshSchedType;
	}

	public String getEshDays() {
		return this.eshDays;
	}

	public void setEshDays(String eshDays) {
		this.eshDays = eshDays;
	}

	public String getEshStartTime() {
		return this.eshStartTime;
	}

	public void setEshStartTime(String eshStartTime) {
		this.eshStartTime = eshStartTime;
	}

	public String getEshEndTime() {
		return this.eshEndTime;
	}

	public void setEshEndTime(String eshEndTime) {
		this.eshEndTime = eshEndTime;
	}

	public String getEshStatus() {
		return this.eshStatus;
	}

	public void setEshStatus(String eshStatus) {
		this.eshStatus = eshStatus;
	}

	public String getEshShiftCode() {
		return this.eshShiftCode;
	}

	public void setEshShiftCode(String eshShiftCode) {
		this.eshShiftCode = eshShiftCode;
	}

	public Boolean getEshOncall() {
		return this.eshOncall;
	}

	public void setEshOncall(Boolean eshOncall) {
		this.eshOncall = eshOncall;
	}

	public Boolean getEshHolidays() {
		return this.eshHolidays;
	}

	public void setEshHolidays(Boolean eshHolidays) {
		this.eshHolidays = eshHolidays;
	}

	public String getEshUser1() {
		return this.eshUser1;
	}

	public void setEshUser1(String eshUser1) {
		this.eshUser1 = eshUser1;
	}

	public String getEshUser2() {
		return this.eshUser2;
	}

	public void setEshUser2(String eshUser2) {
		this.eshUser2 = eshUser2;
	}

	public Date getEshModDate() {
		return this.eshModDate;
	}

	public void setEshModDate(Date eshModDate) {
		this.eshModDate = eshModDate;
	}

	public String getEshModUserid() {
		return this.eshModUserid;
	}

	public void setEshModUserid(String eshModUserid) {
		this.eshModUserid = eshModUserid;
	}

	public String getEshChr01() {
		return this.eshChr01;
	}

	public void setEshChr01(String eshChr01) {
		this.eshChr01 = eshChr01;
	}

	public String getEshChr02() {
		return this.eshChr02;
	}

	public void setEshChr02(String eshChr02) {
		this.eshChr02 = eshChr02;
	}

	public Boolean getEshLog01() {
		return this.eshLog01;
	}

	public void setEshLog01(Boolean eshLog01) {
		this.eshLog01 = eshLog01;
	}

	public Boolean getEshLog02() {
		return this.eshLog02;
	}

	public void setEshLog02(Boolean eshLog02) {
		this.eshLog02 = eshLog02;
	}

	public Date getEshDte01() {
		return this.eshDte01;
	}

	public void setEshDte01(Date eshDte01) {
		this.eshDte01 = eshDte01;
	}

	public Date getEshDte02() {
		return this.eshDte02;
	}

	public void setEshDte02(Date eshDte02) {
		this.eshDte02 = eshDte02;
	}

	public String getEshQadc01() {
		return this.eshQadc01;
	}

	public void setEshQadc01(String eshQadc01) {
		this.eshQadc01 = eshQadc01;
	}

	public String getEshQadc02() {
		return this.eshQadc02;
	}

	public void setEshQadc02(String eshQadc02) {
		this.eshQadc02 = eshQadc02;
	}

	public Boolean getEshQadl01() {
		return this.eshQadl01;
	}

	public void setEshQadl01(Boolean eshQadl01) {
		this.eshQadl01 = eshQadl01;
	}

	public Boolean getEshQadl02() {
		return this.eshQadl02;
	}

	public void setEshQadl02(Boolean eshQadl02) {
		this.eshQadl02 = eshQadl02;
	}

	public Date getEshQadt01() {
		return this.eshQadt01;
	}

	public void setEshQadt01(Date eshQadt01) {
		this.eshQadt01 = eshQadt01;
	}

	public Date getEshQadt02() {
		return this.eshQadt02;
	}

	public void setEshQadt02(Date eshQadt02) {
		this.eshQadt02 = eshQadt02;
	}

	public Integer getEshQadi01() {
		return this.eshQadi01;
	}

	public void setEshQadi01(Integer eshQadi01) {
		this.eshQadi01 = eshQadi01;
	}

	public String getEshQadi02() {
		return this.eshQadi02;
	}

	public void setEshQadi02(String eshQadi02) {
		this.eshQadi02 = eshQadi02;
	}

	public Double getOidEshMstr() {
		return this.oidEshMstr;
	}

	public void setOidEshMstr(Double oidEshMstr) {
		this.oidEshMstr = oidEshMstr;
	}

}