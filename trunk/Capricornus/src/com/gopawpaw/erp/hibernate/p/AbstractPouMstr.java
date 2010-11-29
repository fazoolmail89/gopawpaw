package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPouMstr entity provides the base persistence definition of the
 * PouMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPouMstr implements java.io.Serializable {

	// Fields

	private PouMstrId id;
	private String pouDesc;
	private Integer pouCmtindx;
	private String pouModUserid;
	private Date pouModDate;
	private String pouUser1;
	private String pouUser2;
	private String pouQadc01;
	private String pouQadc02;
	private Double oidPouMstr;

	// Constructors

	/** default constructor */
	public AbstractPouMstr() {
	}

	/** full constructor */
	public AbstractPouMstr(PouMstrId id, String pouDesc, Integer pouCmtindx,
			String pouModUserid, Date pouModDate, String pouUser1,
			String pouUser2, String pouQadc01, String pouQadc02,
			Double oidPouMstr) {
		this.id = id;
		this.pouDesc = pouDesc;
		this.pouCmtindx = pouCmtindx;
		this.pouModUserid = pouModUserid;
		this.pouModDate = pouModDate;
		this.pouUser1 = pouUser1;
		this.pouUser2 = pouUser2;
		this.pouQadc01 = pouQadc01;
		this.pouQadc02 = pouQadc02;
		this.oidPouMstr = oidPouMstr;
	}

	// Property accessors

	public PouMstrId getId() {
		return this.id;
	}

	public void setId(PouMstrId id) {
		this.id = id;
	}

	public String getPouDesc() {
		return this.pouDesc;
	}

	public void setPouDesc(String pouDesc) {
		this.pouDesc = pouDesc;
	}

	public Integer getPouCmtindx() {
		return this.pouCmtindx;
	}

	public void setPouCmtindx(Integer pouCmtindx) {
		this.pouCmtindx = pouCmtindx;
	}

	public String getPouModUserid() {
		return this.pouModUserid;
	}

	public void setPouModUserid(String pouModUserid) {
		this.pouModUserid = pouModUserid;
	}

	public Date getPouModDate() {
		return this.pouModDate;
	}

	public void setPouModDate(Date pouModDate) {
		this.pouModDate = pouModDate;
	}

	public String getPouUser1() {
		return this.pouUser1;
	}

	public void setPouUser1(String pouUser1) {
		this.pouUser1 = pouUser1;
	}

	public String getPouUser2() {
		return this.pouUser2;
	}

	public void setPouUser2(String pouUser2) {
		this.pouUser2 = pouUser2;
	}

	public String getPouQadc01() {
		return this.pouQadc01;
	}

	public void setPouQadc01(String pouQadc01) {
		this.pouQadc01 = pouQadc01;
	}

	public String getPouQadc02() {
		return this.pouQadc02;
	}

	public void setPouQadc02(String pouQadc02) {
		this.pouQadc02 = pouQadc02;
	}

	public Double getOidPouMstr() {
		return this.oidPouMstr;
	}

	public void setOidPouMstr(Double oidPouMstr) {
		this.oidPouMstr = oidPouMstr;
	}

}