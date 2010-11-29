package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSsdDet entity provides the base persistence definition of the SsdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSsdDet implements java.io.Serializable {

	// Fields

	private SsdDetId id;
	private Double ssdPercent;
	private Date ssdStart;
	private Date ssdEnd;
	private String ssdTrans;
	private Integer ssdLeadtime;
	private String ssdUser1;
	private String ssdUser2;
	private Double ssdQadd01;
	private String ssdQadc01;
	private Double oidSsdDet;

	// Constructors

	/** default constructor */
	public AbstractSsdDet() {
	}

	/** minimal constructor */
	public AbstractSsdDet(SsdDetId id, Double oidSsdDet) {
		this.id = id;
		this.oidSsdDet = oidSsdDet;
	}

	/** full constructor */
	public AbstractSsdDet(SsdDetId id, Double ssdPercent, Date ssdStart,
			Date ssdEnd, String ssdTrans, Integer ssdLeadtime, String ssdUser1,
			String ssdUser2, Double ssdQadd01, String ssdQadc01,
			Double oidSsdDet) {
		this.id = id;
		this.ssdPercent = ssdPercent;
		this.ssdStart = ssdStart;
		this.ssdEnd = ssdEnd;
		this.ssdTrans = ssdTrans;
		this.ssdLeadtime = ssdLeadtime;
		this.ssdUser1 = ssdUser1;
		this.ssdUser2 = ssdUser2;
		this.ssdQadd01 = ssdQadd01;
		this.ssdQadc01 = ssdQadc01;
		this.oidSsdDet = oidSsdDet;
	}

	// Property accessors

	public SsdDetId getId() {
		return this.id;
	}

	public void setId(SsdDetId id) {
		this.id = id;
	}

	public Double getSsdPercent() {
		return this.ssdPercent;
	}

	public void setSsdPercent(Double ssdPercent) {
		this.ssdPercent = ssdPercent;
	}

	public Date getSsdStart() {
		return this.ssdStart;
	}

	public void setSsdStart(Date ssdStart) {
		this.ssdStart = ssdStart;
	}

	public Date getSsdEnd() {
		return this.ssdEnd;
	}

	public void setSsdEnd(Date ssdEnd) {
		this.ssdEnd = ssdEnd;
	}

	public String getSsdTrans() {
		return this.ssdTrans;
	}

	public void setSsdTrans(String ssdTrans) {
		this.ssdTrans = ssdTrans;
	}

	public Integer getSsdLeadtime() {
		return this.ssdLeadtime;
	}

	public void setSsdLeadtime(Integer ssdLeadtime) {
		this.ssdLeadtime = ssdLeadtime;
	}

	public String getSsdUser1() {
		return this.ssdUser1;
	}

	public void setSsdUser1(String ssdUser1) {
		this.ssdUser1 = ssdUser1;
	}

	public String getSsdUser2() {
		return this.ssdUser2;
	}

	public void setSsdUser2(String ssdUser2) {
		this.ssdUser2 = ssdUser2;
	}

	public Double getSsdQadd01() {
		return this.ssdQadd01;
	}

	public void setSsdQadd01(Double ssdQadd01) {
		this.ssdQadd01 = ssdQadd01;
	}

	public String getSsdQadc01() {
		return this.ssdQadc01;
	}

	public void setSsdQadc01(String ssdQadc01) {
		this.ssdQadc01 = ssdQadc01;
	}

	public Double getOidSsdDet() {
		return this.oidSsdDet;
	}

	public void setOidSsdDet(Double oidSsdDet) {
		this.oidSsdDet = oidSsdDet;
	}

}