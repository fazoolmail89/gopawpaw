package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPclMstr entity provides the base persistence definition of the
 * PclMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPclMstr implements java.io.Serializable {

	// Fields

	private PclMstrId id;
	private String pclDesc;
	private String pclUser1;
	private String pclUser2;
	private Date pclModDate;
	private String pclUserid;
	private Integer pclIndex;
	private Integer pclBsnUnit;
	private String pclQadc01;
	private Double oidPclMstr;

	// Constructors

	/** default constructor */
	public AbstractPclMstr() {
	}

	/** minimal constructor */
	public AbstractPclMstr(PclMstrId id, String pclDesc, String pclUser1,
			String pclUser2, String pclUserid, Integer pclIndex,
			Integer pclBsnUnit, Double oidPclMstr) {
		this.id = id;
		this.pclDesc = pclDesc;
		this.pclUser1 = pclUser1;
		this.pclUser2 = pclUser2;
		this.pclUserid = pclUserid;
		this.pclIndex = pclIndex;
		this.pclBsnUnit = pclBsnUnit;
		this.oidPclMstr = oidPclMstr;
	}

	/** full constructor */
	public AbstractPclMstr(PclMstrId id, String pclDesc, String pclUser1,
			String pclUser2, Date pclModDate, String pclUserid,
			Integer pclIndex, Integer pclBsnUnit, String pclQadc01,
			Double oidPclMstr) {
		this.id = id;
		this.pclDesc = pclDesc;
		this.pclUser1 = pclUser1;
		this.pclUser2 = pclUser2;
		this.pclModDate = pclModDate;
		this.pclUserid = pclUserid;
		this.pclIndex = pclIndex;
		this.pclBsnUnit = pclBsnUnit;
		this.pclQadc01 = pclQadc01;
		this.oidPclMstr = oidPclMstr;
	}

	// Property accessors

	public PclMstrId getId() {
		return this.id;
	}

	public void setId(PclMstrId id) {
		this.id = id;
	}

	public String getPclDesc() {
		return this.pclDesc;
	}

	public void setPclDesc(String pclDesc) {
		this.pclDesc = pclDesc;
	}

	public String getPclUser1() {
		return this.pclUser1;
	}

	public void setPclUser1(String pclUser1) {
		this.pclUser1 = pclUser1;
	}

	public String getPclUser2() {
		return this.pclUser2;
	}

	public void setPclUser2(String pclUser2) {
		this.pclUser2 = pclUser2;
	}

	public Date getPclModDate() {
		return this.pclModDate;
	}

	public void setPclModDate(Date pclModDate) {
		this.pclModDate = pclModDate;
	}

	public String getPclUserid() {
		return this.pclUserid;
	}

	public void setPclUserid(String pclUserid) {
		this.pclUserid = pclUserid;
	}

	public Integer getPclIndex() {
		return this.pclIndex;
	}

	public void setPclIndex(Integer pclIndex) {
		this.pclIndex = pclIndex;
	}

	public Integer getPclBsnUnit() {
		return this.pclBsnUnit;
	}

	public void setPclBsnUnit(Integer pclBsnUnit) {
		this.pclBsnUnit = pclBsnUnit;
	}

	public String getPclQadc01() {
		return this.pclQadc01;
	}

	public void setPclQadc01(String pclQadc01) {
		this.pclQadc01 = pclQadc01;
	}

	public Double getOidPclMstr() {
		return this.oidPclMstr;
	}

	public void setOidPclMstr(Double oidPclMstr) {
		this.oidPclMstr = oidPclMstr;
	}

}