package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCalDet entity provides the base persistence definition of the CalDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCalDet implements java.io.Serializable {

	// Fields

	private CalDetId id;
	private Date calEnd;
	private Double calHours;
	private String calUser1;
	private String calUser2;
	private Double calShift1;
	private Double calShift2;
	private Double calShift3;
	private Double calShift4;
	private String calQadc01;
	private Double oidCalDet;

	// Constructors

	/** default constructor */
	public AbstractCalDet() {
	}

	/** minimal constructor */
	public AbstractCalDet(CalDetId id, Double oidCalDet) {
		this.id = id;
		this.oidCalDet = oidCalDet;
	}

	/** full constructor */
	public AbstractCalDet(CalDetId id, Date calEnd, Double calHours,
			String calUser1, String calUser2, Double calShift1,
			Double calShift2, Double calShift3, Double calShift4,
			String calQadc01, Double oidCalDet) {
		this.id = id;
		this.calEnd = calEnd;
		this.calHours = calHours;
		this.calUser1 = calUser1;
		this.calUser2 = calUser2;
		this.calShift1 = calShift1;
		this.calShift2 = calShift2;
		this.calShift3 = calShift3;
		this.calShift4 = calShift4;
		this.calQadc01 = calQadc01;
		this.oidCalDet = oidCalDet;
	}

	// Property accessors

	public CalDetId getId() {
		return this.id;
	}

	public void setId(CalDetId id) {
		this.id = id;
	}

	public Date getCalEnd() {
		return this.calEnd;
	}

	public void setCalEnd(Date calEnd) {
		this.calEnd = calEnd;
	}

	public Double getCalHours() {
		return this.calHours;
	}

	public void setCalHours(Double calHours) {
		this.calHours = calHours;
	}

	public String getCalUser1() {
		return this.calUser1;
	}

	public void setCalUser1(String calUser1) {
		this.calUser1 = calUser1;
	}

	public String getCalUser2() {
		return this.calUser2;
	}

	public void setCalUser2(String calUser2) {
		this.calUser2 = calUser2;
	}

	public Double getCalShift1() {
		return this.calShift1;
	}

	public void setCalShift1(Double calShift1) {
		this.calShift1 = calShift1;
	}

	public Double getCalShift2() {
		return this.calShift2;
	}

	public void setCalShift2(Double calShift2) {
		this.calShift2 = calShift2;
	}

	public Double getCalShift3() {
		return this.calShift3;
	}

	public void setCalShift3(Double calShift3) {
		this.calShift3 = calShift3;
	}

	public Double getCalShift4() {
		return this.calShift4;
	}

	public void setCalShift4(Double calShift4) {
		this.calShift4 = calShift4;
	}

	public String getCalQadc01() {
		return this.calQadc01;
	}

	public void setCalQadc01(String calQadc01) {
		this.calQadc01 = calQadc01;
	}

	public Double getOidCalDet() {
		return this.oidCalDet;
	}

	public void setOidCalDet(Double oidCalDet) {
		this.oidCalDet = oidCalDet;
	}

}