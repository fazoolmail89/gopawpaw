package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLocMstr entity provides the base persistence definition of the
 * LocMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLocMstr implements java.io.Serializable {

	// Fields

	private LocMstrId id;
	private Boolean locQad01;
	private Date locDate;
	private Boolean locPerm;
	private String locQadc01;
	private String locQadc02;
	private String locProject;
	private String locStatus;
	private String locUser1;
	private String locUser2;
	private Boolean locSingle;
	private String locType;
	private String locDesc;
	private Double locCap;
	private String locCapUm;
	private String locPhysAddr;
	private Boolean locXferOwnership;
	private Double oidLocMstr;

	// Constructors

	/** default constructor */
	public AbstractLocMstr() {
	}

	/** minimal constructor */
	public AbstractLocMstr(LocMstrId id, Date locDate, Boolean locSingle,
			String locType, String locPhysAddr, Boolean locXferOwnership,
			Double oidLocMstr) {
		this.id = id;
		this.locDate = locDate;
		this.locSingle = locSingle;
		this.locType = locType;
		this.locPhysAddr = locPhysAddr;
		this.locXferOwnership = locXferOwnership;
		this.oidLocMstr = oidLocMstr;
	}

	/** full constructor */
	public AbstractLocMstr(LocMstrId id, Boolean locQad01, Date locDate,
			Boolean locPerm, String locQadc01, String locQadc02,
			String locProject, String locStatus, String locUser1,
			String locUser2, Boolean locSingle, String locType, String locDesc,
			Double locCap, String locCapUm, String locPhysAddr,
			Boolean locXferOwnership, Double oidLocMstr) {
		this.id = id;
		this.locQad01 = locQad01;
		this.locDate = locDate;
		this.locPerm = locPerm;
		this.locQadc01 = locQadc01;
		this.locQadc02 = locQadc02;
		this.locProject = locProject;
		this.locStatus = locStatus;
		this.locUser1 = locUser1;
		this.locUser2 = locUser2;
		this.locSingle = locSingle;
		this.locType = locType;
		this.locDesc = locDesc;
		this.locCap = locCap;
		this.locCapUm = locCapUm;
		this.locPhysAddr = locPhysAddr;
		this.locXferOwnership = locXferOwnership;
		this.oidLocMstr = oidLocMstr;
	}

	// Property accessors

	public LocMstrId getId() {
		return this.id;
	}

	public void setId(LocMstrId id) {
		this.id = id;
	}

	public Boolean getLocQad01() {
		return this.locQad01;
	}

	public void setLocQad01(Boolean locQad01) {
		this.locQad01 = locQad01;
	}

	public Date getLocDate() {
		return this.locDate;
	}

	public void setLocDate(Date locDate) {
		this.locDate = locDate;
	}

	public Boolean getLocPerm() {
		return this.locPerm;
	}

	public void setLocPerm(Boolean locPerm) {
		this.locPerm = locPerm;
	}

	public String getLocQadc01() {
		return this.locQadc01;
	}

	public void setLocQadc01(String locQadc01) {
		this.locQadc01 = locQadc01;
	}

	public String getLocQadc02() {
		return this.locQadc02;
	}

	public void setLocQadc02(String locQadc02) {
		this.locQadc02 = locQadc02;
	}

	public String getLocProject() {
		return this.locProject;
	}

	public void setLocProject(String locProject) {
		this.locProject = locProject;
	}

	public String getLocStatus() {
		return this.locStatus;
	}

	public void setLocStatus(String locStatus) {
		this.locStatus = locStatus;
	}

	public String getLocUser1() {
		return this.locUser1;
	}

	public void setLocUser1(String locUser1) {
		this.locUser1 = locUser1;
	}

	public String getLocUser2() {
		return this.locUser2;
	}

	public void setLocUser2(String locUser2) {
		this.locUser2 = locUser2;
	}

	public Boolean getLocSingle() {
		return this.locSingle;
	}

	public void setLocSingle(Boolean locSingle) {
		this.locSingle = locSingle;
	}

	public String getLocType() {
		return this.locType;
	}

	public void setLocType(String locType) {
		this.locType = locType;
	}

	public String getLocDesc() {
		return this.locDesc;
	}

	public void setLocDesc(String locDesc) {
		this.locDesc = locDesc;
	}

	public Double getLocCap() {
		return this.locCap;
	}

	public void setLocCap(Double locCap) {
		this.locCap = locCap;
	}

	public String getLocCapUm() {
		return this.locCapUm;
	}

	public void setLocCapUm(String locCapUm) {
		this.locCapUm = locCapUm;
	}

	public String getLocPhysAddr() {
		return this.locPhysAddr;
	}

	public void setLocPhysAddr(String locPhysAddr) {
		this.locPhysAddr = locPhysAddr;
	}

	public Boolean getLocXferOwnership() {
		return this.locXferOwnership;
	}

	public void setLocXferOwnership(Boolean locXferOwnership) {
		this.locXferOwnership = locXferOwnership;
	}

	public Double getOidLocMstr() {
		return this.oidLocMstr;
	}

	public void setOidLocMstr(Double oidLocMstr) {
		this.oidLocMstr = oidLocMstr;
	}

}