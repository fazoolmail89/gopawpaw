package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPoulMstr entity provides the base persistence definition of the
 * PoulMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPoulMstr implements java.io.Serializable {

	// Fields

	private PoulMstrId id;
	private Integer poulRefKey;
	private Integer poulCmtindx;
	private String poulModUserid;
	private Date poulModDate;
	private String poulUser1;
	private String poulUser2;
	private String poulQadc01;
	private String poulQadc02;
	private Double oidPoulMstr;

	// Constructors

	/** default constructor */
	public AbstractPoulMstr() {
	}

	/** full constructor */
	public AbstractPoulMstr(PoulMstrId id, Integer poulRefKey,
			Integer poulCmtindx, String poulModUserid, Date poulModDate,
			String poulUser1, String poulUser2, String poulQadc01,
			String poulQadc02, Double oidPoulMstr) {
		this.id = id;
		this.poulRefKey = poulRefKey;
		this.poulCmtindx = poulCmtindx;
		this.poulModUserid = poulModUserid;
		this.poulModDate = poulModDate;
		this.poulUser1 = poulUser1;
		this.poulUser2 = poulUser2;
		this.poulQadc01 = poulQadc01;
		this.poulQadc02 = poulQadc02;
		this.oidPoulMstr = oidPoulMstr;
	}

	// Property accessors

	public PoulMstrId getId() {
		return this.id;
	}

	public void setId(PoulMstrId id) {
		this.id = id;
	}

	public Integer getPoulRefKey() {
		return this.poulRefKey;
	}

	public void setPoulRefKey(Integer poulRefKey) {
		this.poulRefKey = poulRefKey;
	}

	public Integer getPoulCmtindx() {
		return this.poulCmtindx;
	}

	public void setPoulCmtindx(Integer poulCmtindx) {
		this.poulCmtindx = poulCmtindx;
	}

	public String getPoulModUserid() {
		return this.poulModUserid;
	}

	public void setPoulModUserid(String poulModUserid) {
		this.poulModUserid = poulModUserid;
	}

	public Date getPoulModDate() {
		return this.poulModDate;
	}

	public void setPoulModDate(Date poulModDate) {
		this.poulModDate = poulModDate;
	}

	public String getPoulUser1() {
		return this.poulUser1;
	}

	public void setPoulUser1(String poulUser1) {
		this.poulUser1 = poulUser1;
	}

	public String getPoulUser2() {
		return this.poulUser2;
	}

	public void setPoulUser2(String poulUser2) {
		this.poulUser2 = poulUser2;
	}

	public String getPoulQadc01() {
		return this.poulQadc01;
	}

	public void setPoulQadc01(String poulQadc01) {
		this.poulQadc01 = poulQadc01;
	}

	public String getPoulQadc02() {
		return this.poulQadc02;
	}

	public void setPoulQadc02(String poulQadc02) {
		this.poulQadc02 = poulQadc02;
	}

	public Double getOidPoulMstr() {
		return this.oidPoulMstr;
	}

	public void setOidPoulMstr(Double oidPoulMstr) {
		this.oidPoulMstr = oidPoulMstr;
	}

}