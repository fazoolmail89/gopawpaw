package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSosrMstr entity provides the base persistence definition of the
 * SosrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSosrMstr implements java.io.Serializable {

	// Fields

	private SosrMstrId id;
	private Integer sosrCmtindx;
	private String sosrQadc01;
	private String sosrQadc02;
	private String sosrModUserid;
	private Date sosrModDate;
	private String sosrUser1;
	private String sosrUser2;
	private Double oidSosrMstr;

	// Constructors

	/** default constructor */
	public AbstractSosrMstr() {
	}

	/** full constructor */
	public AbstractSosrMstr(SosrMstrId id, Integer sosrCmtindx,
			String sosrQadc01, String sosrQadc02, String sosrModUserid,
			Date sosrModDate, String sosrUser1, String sosrUser2,
			Double oidSosrMstr) {
		this.id = id;
		this.sosrCmtindx = sosrCmtindx;
		this.sosrQadc01 = sosrQadc01;
		this.sosrQadc02 = sosrQadc02;
		this.sosrModUserid = sosrModUserid;
		this.sosrModDate = sosrModDate;
		this.sosrUser1 = sosrUser1;
		this.sosrUser2 = sosrUser2;
		this.oidSosrMstr = oidSosrMstr;
	}

	// Property accessors

	public SosrMstrId getId() {
		return this.id;
	}

	public void setId(SosrMstrId id) {
		this.id = id;
	}

	public Integer getSosrCmtindx() {
		return this.sosrCmtindx;
	}

	public void setSosrCmtindx(Integer sosrCmtindx) {
		this.sosrCmtindx = sosrCmtindx;
	}

	public String getSosrQadc01() {
		return this.sosrQadc01;
	}

	public void setSosrQadc01(String sosrQadc01) {
		this.sosrQadc01 = sosrQadc01;
	}

	public String getSosrQadc02() {
		return this.sosrQadc02;
	}

	public void setSosrQadc02(String sosrQadc02) {
		this.sosrQadc02 = sosrQadc02;
	}

	public String getSosrModUserid() {
		return this.sosrModUserid;
	}

	public void setSosrModUserid(String sosrModUserid) {
		this.sosrModUserid = sosrModUserid;
	}

	public Date getSosrModDate() {
		return this.sosrModDate;
	}

	public void setSosrModDate(Date sosrModDate) {
		this.sosrModDate = sosrModDate;
	}

	public String getSosrUser1() {
		return this.sosrUser1;
	}

	public void setSosrUser1(String sosrUser1) {
		this.sosrUser1 = sosrUser1;
	}

	public String getSosrUser2() {
		return this.sosrUser2;
	}

	public void setSosrUser2(String sosrUser2) {
		this.sosrUser2 = sosrUser2;
	}

	public Double getOidSosrMstr() {
		return this.oidSosrMstr;
	}

	public void setOidSosrMstr(Double oidSosrMstr) {
		this.oidSosrMstr = oidSosrMstr;
	}

}