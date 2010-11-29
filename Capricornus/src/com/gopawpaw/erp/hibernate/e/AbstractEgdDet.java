package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEgdDet entity provides the base persistence definition of the EgdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgdDet implements java.io.Serializable {

	// Fields

	private EgdDetId id;
	private String egdStartTime;
	private Date egdEndEff;
	private String egdEndTime;
	private String egdDays;
	private String egdSchedType;
	private String egdStatus;
	private Boolean egdHolidays;
	private Boolean egdOncall;
	private String egdEshSchedule;
	private String egdUser1;
	private String egdUser2;
	private Date egdModDate;
	private String egdModUserid;
	private String egdChr01;
	private String egdQadc01;
	private String egdQadc02;
	private Boolean egdLog01;
	private Boolean egdLog02;
	private Boolean egdQadl01;
	private Boolean egdQadl02;
	private Date egdDte01;
	private Date egdQadt01;
	private Date egdQadt02;
	private Double egdDec01;
	private Double egdQade01;
	private Double oidEgdDet;

	// Constructors

	/** default constructor */
	public AbstractEgdDet() {
	}

	/** minimal constructor */
	public AbstractEgdDet(EgdDetId id, Double oidEgdDet) {
		this.id = id;
		this.oidEgdDet = oidEgdDet;
	}

	/** full constructor */
	public AbstractEgdDet(EgdDetId id, String egdStartTime, Date egdEndEff,
			String egdEndTime, String egdDays, String egdSchedType,
			String egdStatus, Boolean egdHolidays, Boolean egdOncall,
			String egdEshSchedule, String egdUser1, String egdUser2,
			Date egdModDate, String egdModUserid, String egdChr01,
			String egdQadc01, String egdQadc02, Boolean egdLog01,
			Boolean egdLog02, Boolean egdQadl01, Boolean egdQadl02,
			Date egdDte01, Date egdQadt01, Date egdQadt02, Double egdDec01,
			Double egdQade01, Double oidEgdDet) {
		this.id = id;
		this.egdStartTime = egdStartTime;
		this.egdEndEff = egdEndEff;
		this.egdEndTime = egdEndTime;
		this.egdDays = egdDays;
		this.egdSchedType = egdSchedType;
		this.egdStatus = egdStatus;
		this.egdHolidays = egdHolidays;
		this.egdOncall = egdOncall;
		this.egdEshSchedule = egdEshSchedule;
		this.egdUser1 = egdUser1;
		this.egdUser2 = egdUser2;
		this.egdModDate = egdModDate;
		this.egdModUserid = egdModUserid;
		this.egdChr01 = egdChr01;
		this.egdQadc01 = egdQadc01;
		this.egdQadc02 = egdQadc02;
		this.egdLog01 = egdLog01;
		this.egdLog02 = egdLog02;
		this.egdQadl01 = egdQadl01;
		this.egdQadl02 = egdQadl02;
		this.egdDte01 = egdDte01;
		this.egdQadt01 = egdQadt01;
		this.egdQadt02 = egdQadt02;
		this.egdDec01 = egdDec01;
		this.egdQade01 = egdQade01;
		this.oidEgdDet = oidEgdDet;
	}

	// Property accessors

	public EgdDetId getId() {
		return this.id;
	}

	public void setId(EgdDetId id) {
		this.id = id;
	}

	public String getEgdStartTime() {
		return this.egdStartTime;
	}

	public void setEgdStartTime(String egdStartTime) {
		this.egdStartTime = egdStartTime;
	}

	public Date getEgdEndEff() {
		return this.egdEndEff;
	}

	public void setEgdEndEff(Date egdEndEff) {
		this.egdEndEff = egdEndEff;
	}

	public String getEgdEndTime() {
		return this.egdEndTime;
	}

	public void setEgdEndTime(String egdEndTime) {
		this.egdEndTime = egdEndTime;
	}

	public String getEgdDays() {
		return this.egdDays;
	}

	public void setEgdDays(String egdDays) {
		this.egdDays = egdDays;
	}

	public String getEgdSchedType() {
		return this.egdSchedType;
	}

	public void setEgdSchedType(String egdSchedType) {
		this.egdSchedType = egdSchedType;
	}

	public String getEgdStatus() {
		return this.egdStatus;
	}

	public void setEgdStatus(String egdStatus) {
		this.egdStatus = egdStatus;
	}

	public Boolean getEgdHolidays() {
		return this.egdHolidays;
	}

	public void setEgdHolidays(Boolean egdHolidays) {
		this.egdHolidays = egdHolidays;
	}

	public Boolean getEgdOncall() {
		return this.egdOncall;
	}

	public void setEgdOncall(Boolean egdOncall) {
		this.egdOncall = egdOncall;
	}

	public String getEgdEshSchedule() {
		return this.egdEshSchedule;
	}

	public void setEgdEshSchedule(String egdEshSchedule) {
		this.egdEshSchedule = egdEshSchedule;
	}

	public String getEgdUser1() {
		return this.egdUser1;
	}

	public void setEgdUser1(String egdUser1) {
		this.egdUser1 = egdUser1;
	}

	public String getEgdUser2() {
		return this.egdUser2;
	}

	public void setEgdUser2(String egdUser2) {
		this.egdUser2 = egdUser2;
	}

	public Date getEgdModDate() {
		return this.egdModDate;
	}

	public void setEgdModDate(Date egdModDate) {
		this.egdModDate = egdModDate;
	}

	public String getEgdModUserid() {
		return this.egdModUserid;
	}

	public void setEgdModUserid(String egdModUserid) {
		this.egdModUserid = egdModUserid;
	}

	public String getEgdChr01() {
		return this.egdChr01;
	}

	public void setEgdChr01(String egdChr01) {
		this.egdChr01 = egdChr01;
	}

	public String getEgdQadc01() {
		return this.egdQadc01;
	}

	public void setEgdQadc01(String egdQadc01) {
		this.egdQadc01 = egdQadc01;
	}

	public String getEgdQadc02() {
		return this.egdQadc02;
	}

	public void setEgdQadc02(String egdQadc02) {
		this.egdQadc02 = egdQadc02;
	}

	public Boolean getEgdLog01() {
		return this.egdLog01;
	}

	public void setEgdLog01(Boolean egdLog01) {
		this.egdLog01 = egdLog01;
	}

	public Boolean getEgdLog02() {
		return this.egdLog02;
	}

	public void setEgdLog02(Boolean egdLog02) {
		this.egdLog02 = egdLog02;
	}

	public Boolean getEgdQadl01() {
		return this.egdQadl01;
	}

	public void setEgdQadl01(Boolean egdQadl01) {
		this.egdQadl01 = egdQadl01;
	}

	public Boolean getEgdQadl02() {
		return this.egdQadl02;
	}

	public void setEgdQadl02(Boolean egdQadl02) {
		this.egdQadl02 = egdQadl02;
	}

	public Date getEgdDte01() {
		return this.egdDte01;
	}

	public void setEgdDte01(Date egdDte01) {
		this.egdDte01 = egdDte01;
	}

	public Date getEgdQadt01() {
		return this.egdQadt01;
	}

	public void setEgdQadt01(Date egdQadt01) {
		this.egdQadt01 = egdQadt01;
	}

	public Date getEgdQadt02() {
		return this.egdQadt02;
	}

	public void setEgdQadt02(Date egdQadt02) {
		this.egdQadt02 = egdQadt02;
	}

	public Double getEgdDec01() {
		return this.egdDec01;
	}

	public void setEgdDec01(Double egdDec01) {
		this.egdDec01 = egdDec01;
	}

	public Double getEgdQade01() {
		return this.egdQade01;
	}

	public void setEgdQade01(Double egdQade01) {
		this.egdQade01 = egdQade01;
	}

	public Double getOidEgdDet() {
		return this.oidEgdDet;
	}

	public void setOidEgdDet(Double oidEgdDet) {
		this.oidEgdDet = oidEgdDet;
	}

}