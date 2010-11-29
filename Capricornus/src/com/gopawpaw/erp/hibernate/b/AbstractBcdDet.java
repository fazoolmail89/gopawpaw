package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBcdDet entity provides the base persistence definition of the BcdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBcdDet implements java.io.Serializable {

	// Fields

	private BcdDetId id;
	private Integer bcdPriority;
	private String bcdExec;
	private String bcdDev;
	private Boolean bcdPerm;
	private Boolean bcdProcess;
	private Date bcdDateRun;
	private String bcdTimeRun;
	private String bcdRunStat;
	private String bcdParm;
	private String bcdUser1;
	private String bcdUser2;
	private String bcdMnuNbr;
	private Integer bcdMnuSel;
	private String bcdQadc01;
	private Double oidBcdDet;

	// Constructors

	/** default constructor */
	public AbstractBcdDet() {
	}

	/** minimal constructor */
	public AbstractBcdDet(BcdDetId id, String bcdMnuNbr, Integer bcdMnuSel,
			Double oidBcdDet) {
		this.id = id;
		this.bcdMnuNbr = bcdMnuNbr;
		this.bcdMnuSel = bcdMnuSel;
		this.oidBcdDet = oidBcdDet;
	}

	/** full constructor */
	public AbstractBcdDet(BcdDetId id, Integer bcdPriority, String bcdExec,
			String bcdDev, Boolean bcdPerm, Boolean bcdProcess,
			Date bcdDateRun, String bcdTimeRun, String bcdRunStat,
			String bcdParm, String bcdUser1, String bcdUser2, String bcdMnuNbr,
			Integer bcdMnuSel, String bcdQadc01, Double oidBcdDet) {
		this.id = id;
		this.bcdPriority = bcdPriority;
		this.bcdExec = bcdExec;
		this.bcdDev = bcdDev;
		this.bcdPerm = bcdPerm;
		this.bcdProcess = bcdProcess;
		this.bcdDateRun = bcdDateRun;
		this.bcdTimeRun = bcdTimeRun;
		this.bcdRunStat = bcdRunStat;
		this.bcdParm = bcdParm;
		this.bcdUser1 = bcdUser1;
		this.bcdUser2 = bcdUser2;
		this.bcdMnuNbr = bcdMnuNbr;
		this.bcdMnuSel = bcdMnuSel;
		this.bcdQadc01 = bcdQadc01;
		this.oidBcdDet = oidBcdDet;
	}

	// Property accessors

	public BcdDetId getId() {
		return this.id;
	}

	public void setId(BcdDetId id) {
		this.id = id;
	}

	public Integer getBcdPriority() {
		return this.bcdPriority;
	}

	public void setBcdPriority(Integer bcdPriority) {
		this.bcdPriority = bcdPriority;
	}

	public String getBcdExec() {
		return this.bcdExec;
	}

	public void setBcdExec(String bcdExec) {
		this.bcdExec = bcdExec;
	}

	public String getBcdDev() {
		return this.bcdDev;
	}

	public void setBcdDev(String bcdDev) {
		this.bcdDev = bcdDev;
	}

	public Boolean getBcdPerm() {
		return this.bcdPerm;
	}

	public void setBcdPerm(Boolean bcdPerm) {
		this.bcdPerm = bcdPerm;
	}

	public Boolean getBcdProcess() {
		return this.bcdProcess;
	}

	public void setBcdProcess(Boolean bcdProcess) {
		this.bcdProcess = bcdProcess;
	}

	public Date getBcdDateRun() {
		return this.bcdDateRun;
	}

	public void setBcdDateRun(Date bcdDateRun) {
		this.bcdDateRun = bcdDateRun;
	}

	public String getBcdTimeRun() {
		return this.bcdTimeRun;
	}

	public void setBcdTimeRun(String bcdTimeRun) {
		this.bcdTimeRun = bcdTimeRun;
	}

	public String getBcdRunStat() {
		return this.bcdRunStat;
	}

	public void setBcdRunStat(String bcdRunStat) {
		this.bcdRunStat = bcdRunStat;
	}

	public String getBcdParm() {
		return this.bcdParm;
	}

	public void setBcdParm(String bcdParm) {
		this.bcdParm = bcdParm;
	}

	public String getBcdUser1() {
		return this.bcdUser1;
	}

	public void setBcdUser1(String bcdUser1) {
		this.bcdUser1 = bcdUser1;
	}

	public String getBcdUser2() {
		return this.bcdUser2;
	}

	public void setBcdUser2(String bcdUser2) {
		this.bcdUser2 = bcdUser2;
	}

	public String getBcdMnuNbr() {
		return this.bcdMnuNbr;
	}

	public void setBcdMnuNbr(String bcdMnuNbr) {
		this.bcdMnuNbr = bcdMnuNbr;
	}

	public Integer getBcdMnuSel() {
		return this.bcdMnuSel;
	}

	public void setBcdMnuSel(Integer bcdMnuSel) {
		this.bcdMnuSel = bcdMnuSel;
	}

	public String getBcdQadc01() {
		return this.bcdQadc01;
	}

	public void setBcdQadc01(String bcdQadc01) {
		this.bcdQadc01 = bcdQadc01;
	}

	public Double getOidBcdDet() {
		return this.oidBcdDet;
	}

	public void setOidBcdDet(Double oidBcdDet) {
		this.oidBcdDet = oidBcdDet;
	}

}