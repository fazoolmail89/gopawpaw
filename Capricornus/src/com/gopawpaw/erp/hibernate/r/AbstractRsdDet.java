package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRsdDet entity provides the base persistence definition of the RsdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRsdDet implements java.io.Serializable {

	// Fields

	private RsdDetId id;
	private Double rsdCap;
	private Date rsdStart;
	private Date rsdEnd;
	private String rsdUser1;
	private String rsdUser2;
	private Double rsdShift1;
	private Double rsdShift2;
	private Double rsdShift3;
	private Double rsdShift4;
	private String rsdQadc01;
	private Double oidRsdDet;

	// Constructors

	/** default constructor */
	public AbstractRsdDet() {
	}

	/** minimal constructor */
	public AbstractRsdDet(RsdDetId id, Double oidRsdDet) {
		this.id = id;
		this.oidRsdDet = oidRsdDet;
	}

	/** full constructor */
	public AbstractRsdDet(RsdDetId id, Double rsdCap, Date rsdStart,
			Date rsdEnd, String rsdUser1, String rsdUser2, Double rsdShift1,
			Double rsdShift2, Double rsdShift3, Double rsdShift4,
			String rsdQadc01, Double oidRsdDet) {
		this.id = id;
		this.rsdCap = rsdCap;
		this.rsdStart = rsdStart;
		this.rsdEnd = rsdEnd;
		this.rsdUser1 = rsdUser1;
		this.rsdUser2 = rsdUser2;
		this.rsdShift1 = rsdShift1;
		this.rsdShift2 = rsdShift2;
		this.rsdShift3 = rsdShift3;
		this.rsdShift4 = rsdShift4;
		this.rsdQadc01 = rsdQadc01;
		this.oidRsdDet = oidRsdDet;
	}

	// Property accessors

	public RsdDetId getId() {
		return this.id;
	}

	public void setId(RsdDetId id) {
		this.id = id;
	}

	public Double getRsdCap() {
		return this.rsdCap;
	}

	public void setRsdCap(Double rsdCap) {
		this.rsdCap = rsdCap;
	}

	public Date getRsdStart() {
		return this.rsdStart;
	}

	public void setRsdStart(Date rsdStart) {
		this.rsdStart = rsdStart;
	}

	public Date getRsdEnd() {
		return this.rsdEnd;
	}

	public void setRsdEnd(Date rsdEnd) {
		this.rsdEnd = rsdEnd;
	}

	public String getRsdUser1() {
		return this.rsdUser1;
	}

	public void setRsdUser1(String rsdUser1) {
		this.rsdUser1 = rsdUser1;
	}

	public String getRsdUser2() {
		return this.rsdUser2;
	}

	public void setRsdUser2(String rsdUser2) {
		this.rsdUser2 = rsdUser2;
	}

	public Double getRsdShift1() {
		return this.rsdShift1;
	}

	public void setRsdShift1(Double rsdShift1) {
		this.rsdShift1 = rsdShift1;
	}

	public Double getRsdShift2() {
		return this.rsdShift2;
	}

	public void setRsdShift2(Double rsdShift2) {
		this.rsdShift2 = rsdShift2;
	}

	public Double getRsdShift3() {
		return this.rsdShift3;
	}

	public void setRsdShift3(Double rsdShift3) {
		this.rsdShift3 = rsdShift3;
	}

	public Double getRsdShift4() {
		return this.rsdShift4;
	}

	public void setRsdShift4(Double rsdShift4) {
		this.rsdShift4 = rsdShift4;
	}

	public String getRsdQadc01() {
		return this.rsdQadc01;
	}

	public void setRsdQadc01(String rsdQadc01) {
		this.rsdQadc01 = rsdQadc01;
	}

	public Double getOidRsdDet() {
		return this.oidRsdDet;
	}

	public void setOidRsdDet(Double oidRsdDet) {
		this.oidRsdDet = oidRsdDet;
	}

}