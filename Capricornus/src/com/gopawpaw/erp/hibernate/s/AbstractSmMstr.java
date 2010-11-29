package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSmMstr entity provides the base persistence definition of the SmMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSmMstr implements java.io.Serializable {

	// Fields

	private SmMstrId id;
	private Date smEnd;
	private Double smPct;
	private String smTrans;
	private Double smLead;
	private String smUser1;
	private String smUser2;
	private String smQadc01;
	private Double oidSmMstr;

	// Constructors

	/** default constructor */
	public AbstractSmMstr() {
	}

	/** minimal constructor */
	public AbstractSmMstr(SmMstrId id, Double oidSmMstr) {
		this.id = id;
		this.oidSmMstr = oidSmMstr;
	}

	/** full constructor */
	public AbstractSmMstr(SmMstrId id, Date smEnd, Double smPct,
			String smTrans, Double smLead, String smUser1, String smUser2,
			String smQadc01, Double oidSmMstr) {
		this.id = id;
		this.smEnd = smEnd;
		this.smPct = smPct;
		this.smTrans = smTrans;
		this.smLead = smLead;
		this.smUser1 = smUser1;
		this.smUser2 = smUser2;
		this.smQadc01 = smQadc01;
		this.oidSmMstr = oidSmMstr;
	}

	// Property accessors

	public SmMstrId getId() {
		return this.id;
	}

	public void setId(SmMstrId id) {
		this.id = id;
	}

	public Date getSmEnd() {
		return this.smEnd;
	}

	public void setSmEnd(Date smEnd) {
		this.smEnd = smEnd;
	}

	public Double getSmPct() {
		return this.smPct;
	}

	public void setSmPct(Double smPct) {
		this.smPct = smPct;
	}

	public String getSmTrans() {
		return this.smTrans;
	}

	public void setSmTrans(String smTrans) {
		this.smTrans = smTrans;
	}

	public Double getSmLead() {
		return this.smLead;
	}

	public void setSmLead(Double smLead) {
		this.smLead = smLead;
	}

	public String getSmUser1() {
		return this.smUser1;
	}

	public void setSmUser1(String smUser1) {
		this.smUser1 = smUser1;
	}

	public String getSmUser2() {
		return this.smUser2;
	}

	public void setSmUser2(String smUser2) {
		this.smUser2 = smUser2;
	}

	public String getSmQadc01() {
		return this.smQadc01;
	}

	public void setSmQadc01(String smQadc01) {
		this.smQadc01 = smQadc01;
	}

	public Double getOidSmMstr() {
		return this.oidSmMstr;
	}

	public void setOidSmMstr(Double oidSmMstr) {
		this.oidSmMstr = oidSmMstr;
	}

}