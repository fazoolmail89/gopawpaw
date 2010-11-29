package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEgwWkfl entity provides the base persistence definition of the
 * EgwWkfl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgwWkfl implements java.io.Serializable {

	// Fields

	private EgwWkflId id;
	private Integer egwPoints;
	private Boolean egwProb;
	private String egwArea;
	private Boolean egwAvailable;
	private Date egwWeek;
	private String egwHours;
	private String egwAvailHours;
	private String egwName;
	private Boolean egwTag;
	private String egwCalls;
	private Integer egwEgaRecid;
	private String egwUser1;
	private String egwUser2;
	private String egwStTime;
	private String egwEndTime;
	private Boolean egwOvertime;
	private Boolean egwQadl01;
	private Boolean egwQadl02;
	private Date egwQadt01;
	private String egwSchedule;
	private Date egwQadt02;
	private String egwQadc02;
	private Integer egwQadi01;
	private Integer egwQadi02;
	private String egwQadc03;
	private Double oidEgwWkfl;

	// Constructors

	/** default constructor */
	public AbstractEgwWkfl() {
	}

	/** minimal constructor */
	public AbstractEgwWkfl(EgwWkflId id, Double oidEgwWkfl) {
		this.id = id;
		this.oidEgwWkfl = oidEgwWkfl;
	}

	/** full constructor */
	public AbstractEgwWkfl(EgwWkflId id, Integer egwPoints, Boolean egwProb,
			String egwArea, Boolean egwAvailable, Date egwWeek,
			String egwHours, String egwAvailHours, String egwName,
			Boolean egwTag, String egwCalls, Integer egwEgaRecid,
			String egwUser1, String egwUser2, String egwStTime,
			String egwEndTime, Boolean egwOvertime, Boolean egwQadl01,
			Boolean egwQadl02, Date egwQadt01, String egwSchedule,
			Date egwQadt02, String egwQadc02, Integer egwQadi01,
			Integer egwQadi02, String egwQadc03, Double oidEgwWkfl) {
		this.id = id;
		this.egwPoints = egwPoints;
		this.egwProb = egwProb;
		this.egwArea = egwArea;
		this.egwAvailable = egwAvailable;
		this.egwWeek = egwWeek;
		this.egwHours = egwHours;
		this.egwAvailHours = egwAvailHours;
		this.egwName = egwName;
		this.egwTag = egwTag;
		this.egwCalls = egwCalls;
		this.egwEgaRecid = egwEgaRecid;
		this.egwUser1 = egwUser1;
		this.egwUser2 = egwUser2;
		this.egwStTime = egwStTime;
		this.egwEndTime = egwEndTime;
		this.egwOvertime = egwOvertime;
		this.egwQadl01 = egwQadl01;
		this.egwQadl02 = egwQadl02;
		this.egwQadt01 = egwQadt01;
		this.egwSchedule = egwSchedule;
		this.egwQadt02 = egwQadt02;
		this.egwQadc02 = egwQadc02;
		this.egwQadi01 = egwQadi01;
		this.egwQadi02 = egwQadi02;
		this.egwQadc03 = egwQadc03;
		this.oidEgwWkfl = oidEgwWkfl;
	}

	// Property accessors

	public EgwWkflId getId() {
		return this.id;
	}

	public void setId(EgwWkflId id) {
		this.id = id;
	}

	public Integer getEgwPoints() {
		return this.egwPoints;
	}

	public void setEgwPoints(Integer egwPoints) {
		this.egwPoints = egwPoints;
	}

	public Boolean getEgwProb() {
		return this.egwProb;
	}

	public void setEgwProb(Boolean egwProb) {
		this.egwProb = egwProb;
	}

	public String getEgwArea() {
		return this.egwArea;
	}

	public void setEgwArea(String egwArea) {
		this.egwArea = egwArea;
	}

	public Boolean getEgwAvailable() {
		return this.egwAvailable;
	}

	public void setEgwAvailable(Boolean egwAvailable) {
		this.egwAvailable = egwAvailable;
	}

	public Date getEgwWeek() {
		return this.egwWeek;
	}

	public void setEgwWeek(Date egwWeek) {
		this.egwWeek = egwWeek;
	}

	public String getEgwHours() {
		return this.egwHours;
	}

	public void setEgwHours(String egwHours) {
		this.egwHours = egwHours;
	}

	public String getEgwAvailHours() {
		return this.egwAvailHours;
	}

	public void setEgwAvailHours(String egwAvailHours) {
		this.egwAvailHours = egwAvailHours;
	}

	public String getEgwName() {
		return this.egwName;
	}

	public void setEgwName(String egwName) {
		this.egwName = egwName;
	}

	public Boolean getEgwTag() {
		return this.egwTag;
	}

	public void setEgwTag(Boolean egwTag) {
		this.egwTag = egwTag;
	}

	public String getEgwCalls() {
		return this.egwCalls;
	}

	public void setEgwCalls(String egwCalls) {
		this.egwCalls = egwCalls;
	}

	public Integer getEgwEgaRecid() {
		return this.egwEgaRecid;
	}

	public void setEgwEgaRecid(Integer egwEgaRecid) {
		this.egwEgaRecid = egwEgaRecid;
	}

	public String getEgwUser1() {
		return this.egwUser1;
	}

	public void setEgwUser1(String egwUser1) {
		this.egwUser1 = egwUser1;
	}

	public String getEgwUser2() {
		return this.egwUser2;
	}

	public void setEgwUser2(String egwUser2) {
		this.egwUser2 = egwUser2;
	}

	public String getEgwStTime() {
		return this.egwStTime;
	}

	public void setEgwStTime(String egwStTime) {
		this.egwStTime = egwStTime;
	}

	public String getEgwEndTime() {
		return this.egwEndTime;
	}

	public void setEgwEndTime(String egwEndTime) {
		this.egwEndTime = egwEndTime;
	}

	public Boolean getEgwOvertime() {
		return this.egwOvertime;
	}

	public void setEgwOvertime(Boolean egwOvertime) {
		this.egwOvertime = egwOvertime;
	}

	public Boolean getEgwQadl01() {
		return this.egwQadl01;
	}

	public void setEgwQadl01(Boolean egwQadl01) {
		this.egwQadl01 = egwQadl01;
	}

	public Boolean getEgwQadl02() {
		return this.egwQadl02;
	}

	public void setEgwQadl02(Boolean egwQadl02) {
		this.egwQadl02 = egwQadl02;
	}

	public Date getEgwQadt01() {
		return this.egwQadt01;
	}

	public void setEgwQadt01(Date egwQadt01) {
		this.egwQadt01 = egwQadt01;
	}

	public String getEgwSchedule() {
		return this.egwSchedule;
	}

	public void setEgwSchedule(String egwSchedule) {
		this.egwSchedule = egwSchedule;
	}

	public Date getEgwQadt02() {
		return this.egwQadt02;
	}

	public void setEgwQadt02(Date egwQadt02) {
		this.egwQadt02 = egwQadt02;
	}

	public String getEgwQadc02() {
		return this.egwQadc02;
	}

	public void setEgwQadc02(String egwQadc02) {
		this.egwQadc02 = egwQadc02;
	}

	public Integer getEgwQadi01() {
		return this.egwQadi01;
	}

	public void setEgwQadi01(Integer egwQadi01) {
		this.egwQadi01 = egwQadi01;
	}

	public Integer getEgwQadi02() {
		return this.egwQadi02;
	}

	public void setEgwQadi02(Integer egwQadi02) {
		this.egwQadi02 = egwQadi02;
	}

	public String getEgwQadc03() {
		return this.egwQadc03;
	}

	public void setEgwQadc03(String egwQadc03) {
		this.egwQadc03 = egwQadc03;
	}

	public Double getOidEgwWkfl() {
		return this.oidEgwWkfl;
	}

	public void setOidEgwWkfl(Double oidEgwWkfl) {
		this.oidEgwWkfl = oidEgwWkfl;
	}

}