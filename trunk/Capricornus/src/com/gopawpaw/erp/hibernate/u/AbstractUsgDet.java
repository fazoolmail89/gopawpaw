package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUsgDet entity provides the base persistence definition of the UsgDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsgDet implements java.io.Serializable {

	// Fields

	private UsgDetId id;
	private Integer usgCount;
	private String usgUserid;
	private String usgUser1;
	private String usgUser2;
	private String usgQadc01;
	private String usgQadc02;
	private Double usgQadd01;
	private Date usgQadt01;
	private Date usgDate;
	private Date usgClearDate;
	private Double oidUsgDet;

	// Constructors

	/** default constructor */
	public AbstractUsgDet() {
	}

	/** minimal constructor */
	public AbstractUsgDet(UsgDetId id, Integer usgCount, String usgUserid,
			String usgUser1, String usgUser2, String usgQadc01,
			String usgQadc02, Double usgQadd01, Double oidUsgDet) {
		this.id = id;
		this.usgCount = usgCount;
		this.usgUserid = usgUserid;
		this.usgUser1 = usgUser1;
		this.usgUser2 = usgUser2;
		this.usgQadc01 = usgQadc01;
		this.usgQadc02 = usgQadc02;
		this.usgQadd01 = usgQadd01;
		this.oidUsgDet = oidUsgDet;
	}

	/** full constructor */
	public AbstractUsgDet(UsgDetId id, Integer usgCount, String usgUserid,
			String usgUser1, String usgUser2, String usgQadc01,
			String usgQadc02, Double usgQadd01, Date usgQadt01, Date usgDate,
			Date usgClearDate, Double oidUsgDet) {
		this.id = id;
		this.usgCount = usgCount;
		this.usgUserid = usgUserid;
		this.usgUser1 = usgUser1;
		this.usgUser2 = usgUser2;
		this.usgQadc01 = usgQadc01;
		this.usgQadc02 = usgQadc02;
		this.usgQadd01 = usgQadd01;
		this.usgQadt01 = usgQadt01;
		this.usgDate = usgDate;
		this.usgClearDate = usgClearDate;
		this.oidUsgDet = oidUsgDet;
	}

	// Property accessors

	public UsgDetId getId() {
		return this.id;
	}

	public void setId(UsgDetId id) {
		this.id = id;
	}

	public Integer getUsgCount() {
		return this.usgCount;
	}

	public void setUsgCount(Integer usgCount) {
		this.usgCount = usgCount;
	}

	public String getUsgUserid() {
		return this.usgUserid;
	}

	public void setUsgUserid(String usgUserid) {
		this.usgUserid = usgUserid;
	}

	public String getUsgUser1() {
		return this.usgUser1;
	}

	public void setUsgUser1(String usgUser1) {
		this.usgUser1 = usgUser1;
	}

	public String getUsgUser2() {
		return this.usgUser2;
	}

	public void setUsgUser2(String usgUser2) {
		this.usgUser2 = usgUser2;
	}

	public String getUsgQadc01() {
		return this.usgQadc01;
	}

	public void setUsgQadc01(String usgQadc01) {
		this.usgQadc01 = usgQadc01;
	}

	public String getUsgQadc02() {
		return this.usgQadc02;
	}

	public void setUsgQadc02(String usgQadc02) {
		this.usgQadc02 = usgQadc02;
	}

	public Double getUsgQadd01() {
		return this.usgQadd01;
	}

	public void setUsgQadd01(Double usgQadd01) {
		this.usgQadd01 = usgQadd01;
	}

	public Date getUsgQadt01() {
		return this.usgQadt01;
	}

	public void setUsgQadt01(Date usgQadt01) {
		this.usgQadt01 = usgQadt01;
	}

	public Date getUsgDate() {
		return this.usgDate;
	}

	public void setUsgDate(Date usgDate) {
		this.usgDate = usgDate;
	}

	public Date getUsgClearDate() {
		return this.usgClearDate;
	}

	public void setUsgClearDate(Date usgClearDate) {
		this.usgClearDate = usgClearDate;
	}

	public Double getOidUsgDet() {
		return this.oidUsgDet;
	}

	public void setOidUsgDet(Double oidUsgDet) {
		this.oidUsgDet = oidUsgDet;
	}

}