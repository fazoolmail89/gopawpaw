package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPgmDet entity provides the base persistence definition of the PgmDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPgmDet implements java.io.Serializable {

	// Fields

	private PgmDetId id;
	private String pgmCmmt;
	private Date pgmModDate;
	private String pgmUserid;
	private String pgmUser1;
	private String pgmUser2;
	private String pgmDesc;
	private String pgmQadc01;
	private Double oidPgmDet;

	// Constructors

	/** default constructor */
	public AbstractPgmDet() {
	}

	/** minimal constructor */
	public AbstractPgmDet(PgmDetId id, Double oidPgmDet) {
		this.id = id;
		this.oidPgmDet = oidPgmDet;
	}

	/** full constructor */
	public AbstractPgmDet(PgmDetId id, String pgmCmmt, Date pgmModDate,
			String pgmUserid, String pgmUser1, String pgmUser2, String pgmDesc,
			String pgmQadc01, Double oidPgmDet) {
		this.id = id;
		this.pgmCmmt = pgmCmmt;
		this.pgmModDate = pgmModDate;
		this.pgmUserid = pgmUserid;
		this.pgmUser1 = pgmUser1;
		this.pgmUser2 = pgmUser2;
		this.pgmDesc = pgmDesc;
		this.pgmQadc01 = pgmQadc01;
		this.oidPgmDet = oidPgmDet;
	}

	// Property accessors

	public PgmDetId getId() {
		return this.id;
	}

	public void setId(PgmDetId id) {
		this.id = id;
	}

	public String getPgmCmmt() {
		return this.pgmCmmt;
	}

	public void setPgmCmmt(String pgmCmmt) {
		this.pgmCmmt = pgmCmmt;
	}

	public Date getPgmModDate() {
		return this.pgmModDate;
	}

	public void setPgmModDate(Date pgmModDate) {
		this.pgmModDate = pgmModDate;
	}

	public String getPgmUserid() {
		return this.pgmUserid;
	}

	public void setPgmUserid(String pgmUserid) {
		this.pgmUserid = pgmUserid;
	}

	public String getPgmUser1() {
		return this.pgmUser1;
	}

	public void setPgmUser1(String pgmUser1) {
		this.pgmUser1 = pgmUser1;
	}

	public String getPgmUser2() {
		return this.pgmUser2;
	}

	public void setPgmUser2(String pgmUser2) {
		this.pgmUser2 = pgmUser2;
	}

	public String getPgmDesc() {
		return this.pgmDesc;
	}

	public void setPgmDesc(String pgmDesc) {
		this.pgmDesc = pgmDesc;
	}

	public String getPgmQadc01() {
		return this.pgmQadc01;
	}

	public void setPgmQadc01(String pgmQadc01) {
		this.pgmQadc01 = pgmQadc01;
	}

	public Double getOidPgmDet() {
		return this.oidPgmDet;
	}

	public void setOidPgmDet(Double oidPgmDet) {
		this.oidPgmDet = oidPgmDet;
	}

}