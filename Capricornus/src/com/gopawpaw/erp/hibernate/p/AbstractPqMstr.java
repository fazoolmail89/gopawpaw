package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPqMstr entity provides the base persistence definition of the PqMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPqMstr implements java.io.Serializable {

	// Fields

	private PqMstrId id;
	private Double pqQtyPer;
	private Integer pqLead;
	private Integer pqLtOff;
	private Date pqEnd;
	private String pqUser1;
	private String pqUser2;
	private String pqQadc01;
	private Double oidPqMstr;

	// Constructors

	/** default constructor */
	public AbstractPqMstr() {
	}

	/** minimal constructor */
	public AbstractPqMstr(PqMstrId id, Double oidPqMstr) {
		this.id = id;
		this.oidPqMstr = oidPqMstr;
	}

	/** full constructor */
	public AbstractPqMstr(PqMstrId id, Double pqQtyPer, Integer pqLead,
			Integer pqLtOff, Date pqEnd, String pqUser1, String pqUser2,
			String pqQadc01, Double oidPqMstr) {
		this.id = id;
		this.pqQtyPer = pqQtyPer;
		this.pqLead = pqLead;
		this.pqLtOff = pqLtOff;
		this.pqEnd = pqEnd;
		this.pqUser1 = pqUser1;
		this.pqUser2 = pqUser2;
		this.pqQadc01 = pqQadc01;
		this.oidPqMstr = oidPqMstr;
	}

	// Property accessors

	public PqMstrId getId() {
		return this.id;
	}

	public void setId(PqMstrId id) {
		this.id = id;
	}

	public Double getPqQtyPer() {
		return this.pqQtyPer;
	}

	public void setPqQtyPer(Double pqQtyPer) {
		this.pqQtyPer = pqQtyPer;
	}

	public Integer getPqLead() {
		return this.pqLead;
	}

	public void setPqLead(Integer pqLead) {
		this.pqLead = pqLead;
	}

	public Integer getPqLtOff() {
		return this.pqLtOff;
	}

	public void setPqLtOff(Integer pqLtOff) {
		this.pqLtOff = pqLtOff;
	}

	public Date getPqEnd() {
		return this.pqEnd;
	}

	public void setPqEnd(Date pqEnd) {
		this.pqEnd = pqEnd;
	}

	public String getPqUser1() {
		return this.pqUser1;
	}

	public void setPqUser1(String pqUser1) {
		this.pqUser1 = pqUser1;
	}

	public String getPqUser2() {
		return this.pqUser2;
	}

	public void setPqUser2(String pqUser2) {
		this.pqUser2 = pqUser2;
	}

	public String getPqQadc01() {
		return this.pqQadc01;
	}

	public void setPqQadc01(String pqQadc01) {
		this.pqQadc01 = pqQadc01;
	}

	public Double getOidPqMstr() {
		return this.oidPqMstr;
	}

	public void setOidPqMstr(Double oidPqMstr) {
		this.oidPqMstr = oidPqMstr;
	}

}