package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRbmMstr entity provides the base persistence definition of the
 * RbmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRbmMstr implements java.io.Serializable {

	// Fields

	private RbmMstrId id;
	private Date rbmEff;
	private Double rbmNewprice;
	private String rbmRsn;
	private String rbmStatus;
	private String rbmArNbr;
	private Integer rbmCmtindx;
	private String rbmUser1;
	private String rbmUser2;
	private String rbmQadc01;
	private Double oidRbmMstr;

	// Constructors

	/** default constructor */
	public AbstractRbmMstr() {
	}

	/** minimal constructor */
	public AbstractRbmMstr(RbmMstrId id, Double oidRbmMstr) {
		this.id = id;
		this.oidRbmMstr = oidRbmMstr;
	}

	/** full constructor */
	public AbstractRbmMstr(RbmMstrId id, Date rbmEff, Double rbmNewprice,
			String rbmRsn, String rbmStatus, String rbmArNbr,
			Integer rbmCmtindx, String rbmUser1, String rbmUser2,
			String rbmQadc01, Double oidRbmMstr) {
		this.id = id;
		this.rbmEff = rbmEff;
		this.rbmNewprice = rbmNewprice;
		this.rbmRsn = rbmRsn;
		this.rbmStatus = rbmStatus;
		this.rbmArNbr = rbmArNbr;
		this.rbmCmtindx = rbmCmtindx;
		this.rbmUser1 = rbmUser1;
		this.rbmUser2 = rbmUser2;
		this.rbmQadc01 = rbmQadc01;
		this.oidRbmMstr = oidRbmMstr;
	}

	// Property accessors

	public RbmMstrId getId() {
		return this.id;
	}

	public void setId(RbmMstrId id) {
		this.id = id;
	}

	public Date getRbmEff() {
		return this.rbmEff;
	}

	public void setRbmEff(Date rbmEff) {
		this.rbmEff = rbmEff;
	}

	public Double getRbmNewprice() {
		return this.rbmNewprice;
	}

	public void setRbmNewprice(Double rbmNewprice) {
		this.rbmNewprice = rbmNewprice;
	}

	public String getRbmRsn() {
		return this.rbmRsn;
	}

	public void setRbmRsn(String rbmRsn) {
		this.rbmRsn = rbmRsn;
	}

	public String getRbmStatus() {
		return this.rbmStatus;
	}

	public void setRbmStatus(String rbmStatus) {
		this.rbmStatus = rbmStatus;
	}

	public String getRbmArNbr() {
		return this.rbmArNbr;
	}

	public void setRbmArNbr(String rbmArNbr) {
		this.rbmArNbr = rbmArNbr;
	}

	public Integer getRbmCmtindx() {
		return this.rbmCmtindx;
	}

	public void setRbmCmtindx(Integer rbmCmtindx) {
		this.rbmCmtindx = rbmCmtindx;
	}

	public String getRbmUser1() {
		return this.rbmUser1;
	}

	public void setRbmUser1(String rbmUser1) {
		this.rbmUser1 = rbmUser1;
	}

	public String getRbmUser2() {
		return this.rbmUser2;
	}

	public void setRbmUser2(String rbmUser2) {
		this.rbmUser2 = rbmUser2;
	}

	public String getRbmQadc01() {
		return this.rbmQadc01;
	}

	public void setRbmQadc01(String rbmQadc01) {
		this.rbmQadc01 = rbmQadc01;
	}

	public Double getOidRbmMstr() {
		return this.oidRbmMstr;
	}

	public void setOidRbmMstr(Double oidRbmMstr) {
		this.oidRbmMstr = oidRbmMstr;
	}

}