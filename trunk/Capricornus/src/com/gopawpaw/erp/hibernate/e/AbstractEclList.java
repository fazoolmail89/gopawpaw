package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEclList entity provides the base persistence definition of the
 * EclList entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEclList implements java.io.Serializable {

	// Fields

	private EclListId id;
	private String eclDev;
	private Integer eclCopies;
	private String eclDesc;
	private String eclUser1;
	private String eclUser2;
	private Boolean eclQad01;
	private Date eclQad02;
	private String eclQad03;
	private String eclQad04;
	private String eclQad05;
	private Date eclModDate;
	private String eclUserid;
	private Double oidEclList;

	// Constructors

	/** default constructor */
	public AbstractEclList() {
	}

	/** minimal constructor */
	public AbstractEclList(EclListId id, Double oidEclList) {
		this.id = id;
		this.oidEclList = oidEclList;
	}

	/** full constructor */
	public AbstractEclList(EclListId id, String eclDev, Integer eclCopies,
			String eclDesc, String eclUser1, String eclUser2, Boolean eclQad01,
			Date eclQad02, String eclQad03, String eclQad04, String eclQad05,
			Date eclModDate, String eclUserid, Double oidEclList) {
		this.id = id;
		this.eclDev = eclDev;
		this.eclCopies = eclCopies;
		this.eclDesc = eclDesc;
		this.eclUser1 = eclUser1;
		this.eclUser2 = eclUser2;
		this.eclQad01 = eclQad01;
		this.eclQad02 = eclQad02;
		this.eclQad03 = eclQad03;
		this.eclQad04 = eclQad04;
		this.eclQad05 = eclQad05;
		this.eclModDate = eclModDate;
		this.eclUserid = eclUserid;
		this.oidEclList = oidEclList;
	}

	// Property accessors

	public EclListId getId() {
		return this.id;
	}

	public void setId(EclListId id) {
		this.id = id;
	}

	public String getEclDev() {
		return this.eclDev;
	}

	public void setEclDev(String eclDev) {
		this.eclDev = eclDev;
	}

	public Integer getEclCopies() {
		return this.eclCopies;
	}

	public void setEclCopies(Integer eclCopies) {
		this.eclCopies = eclCopies;
	}

	public String getEclDesc() {
		return this.eclDesc;
	}

	public void setEclDesc(String eclDesc) {
		this.eclDesc = eclDesc;
	}

	public String getEclUser1() {
		return this.eclUser1;
	}

	public void setEclUser1(String eclUser1) {
		this.eclUser1 = eclUser1;
	}

	public String getEclUser2() {
		return this.eclUser2;
	}

	public void setEclUser2(String eclUser2) {
		this.eclUser2 = eclUser2;
	}

	public Boolean getEclQad01() {
		return this.eclQad01;
	}

	public void setEclQad01(Boolean eclQad01) {
		this.eclQad01 = eclQad01;
	}

	public Date getEclQad02() {
		return this.eclQad02;
	}

	public void setEclQad02(Date eclQad02) {
		this.eclQad02 = eclQad02;
	}

	public String getEclQad03() {
		return this.eclQad03;
	}

	public void setEclQad03(String eclQad03) {
		this.eclQad03 = eclQad03;
	}

	public String getEclQad04() {
		return this.eclQad04;
	}

	public void setEclQad04(String eclQad04) {
		this.eclQad04 = eclQad04;
	}

	public String getEclQad05() {
		return this.eclQad05;
	}

	public void setEclQad05(String eclQad05) {
		this.eclQad05 = eclQad05;
	}

	public Date getEclModDate() {
		return this.eclModDate;
	}

	public void setEclModDate(Date eclModDate) {
		this.eclModDate = eclModDate;
	}

	public String getEclUserid() {
		return this.eclUserid;
	}

	public void setEclUserid(String eclUserid) {
		this.eclUserid = eclUserid;
	}

	public Double getOidEclList() {
		return this.oidEclList;
	}

	public void setOidEclList(Double oidEclList) {
		this.oidEclList = oidEclList;
	}

}