package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractShmMstr entity provides the base persistence definition of the
 * ShmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShmMstr implements java.io.Serializable {

	// Fields

	private ShmMstrId id;
	private Date shmEnd;
	private Double shmLoadLt;
	private Double shmTransit;
	private Double shmUnldLt;
	private String shmShipDay;
	private String shmRecDay;
	private Integer shmCmtindx;
	private Integer shmNoUnits;
	private String shmUser1;
	private String shmUser2;
	private String shmQadc01;
	private Double oidShmMstr;

	// Constructors

	/** default constructor */
	public AbstractShmMstr() {
	}

	/** minimal constructor */
	public AbstractShmMstr(ShmMstrId id, Integer shmNoUnits, Double oidShmMstr) {
		this.id = id;
		this.shmNoUnits = shmNoUnits;
		this.oidShmMstr = oidShmMstr;
	}

	/** full constructor */
	public AbstractShmMstr(ShmMstrId id, Date shmEnd, Double shmLoadLt,
			Double shmTransit, Double shmUnldLt, String shmShipDay,
			String shmRecDay, Integer shmCmtindx, Integer shmNoUnits,
			String shmUser1, String shmUser2, String shmQadc01,
			Double oidShmMstr) {
		this.id = id;
		this.shmEnd = shmEnd;
		this.shmLoadLt = shmLoadLt;
		this.shmTransit = shmTransit;
		this.shmUnldLt = shmUnldLt;
		this.shmShipDay = shmShipDay;
		this.shmRecDay = shmRecDay;
		this.shmCmtindx = shmCmtindx;
		this.shmNoUnits = shmNoUnits;
		this.shmUser1 = shmUser1;
		this.shmUser2 = shmUser2;
		this.shmQadc01 = shmQadc01;
		this.oidShmMstr = oidShmMstr;
	}

	// Property accessors

	public ShmMstrId getId() {
		return this.id;
	}

	public void setId(ShmMstrId id) {
		this.id = id;
	}

	public Date getShmEnd() {
		return this.shmEnd;
	}

	public void setShmEnd(Date shmEnd) {
		this.shmEnd = shmEnd;
	}

	public Double getShmLoadLt() {
		return this.shmLoadLt;
	}

	public void setShmLoadLt(Double shmLoadLt) {
		this.shmLoadLt = shmLoadLt;
	}

	public Double getShmTransit() {
		return this.shmTransit;
	}

	public void setShmTransit(Double shmTransit) {
		this.shmTransit = shmTransit;
	}

	public Double getShmUnldLt() {
		return this.shmUnldLt;
	}

	public void setShmUnldLt(Double shmUnldLt) {
		this.shmUnldLt = shmUnldLt;
	}

	public String getShmShipDay() {
		return this.shmShipDay;
	}

	public void setShmShipDay(String shmShipDay) {
		this.shmShipDay = shmShipDay;
	}

	public String getShmRecDay() {
		return this.shmRecDay;
	}

	public void setShmRecDay(String shmRecDay) {
		this.shmRecDay = shmRecDay;
	}

	public Integer getShmCmtindx() {
		return this.shmCmtindx;
	}

	public void setShmCmtindx(Integer shmCmtindx) {
		this.shmCmtindx = shmCmtindx;
	}

	public Integer getShmNoUnits() {
		return this.shmNoUnits;
	}

	public void setShmNoUnits(Integer shmNoUnits) {
		this.shmNoUnits = shmNoUnits;
	}

	public String getShmUser1() {
		return this.shmUser1;
	}

	public void setShmUser1(String shmUser1) {
		this.shmUser1 = shmUser1;
	}

	public String getShmUser2() {
		return this.shmUser2;
	}

	public void setShmUser2(String shmUser2) {
		this.shmUser2 = shmUser2;
	}

	public String getShmQadc01() {
		return this.shmQadc01;
	}

	public void setShmQadc01(String shmQadc01) {
		this.shmQadc01 = shmQadc01;
	}

	public Double getOidShmMstr() {
		return this.oidShmMstr;
	}

	public void setOidShmMstr(Double oidShmMstr) {
		this.oidShmMstr = oidShmMstr;
	}

}