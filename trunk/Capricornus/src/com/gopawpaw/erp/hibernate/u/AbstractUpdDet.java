package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUpdDet entity provides the base persistence definition of the UpdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUpdDet implements java.io.Serializable {

	// Fields

	private UpdDetId id;
	private String updExec;
	private String updDev;
	private String updUser1;
	private String updUser2;
	private String updQadc01;
	private Double oidUpdDet;

	// Constructors

	/** default constructor */
	public AbstractUpdDet() {
	}

	/** minimal constructor */
	public AbstractUpdDet(UpdDetId id, Double oidUpdDet) {
		this.id = id;
		this.oidUpdDet = oidUpdDet;
	}

	/** full constructor */
	public AbstractUpdDet(UpdDetId id, String updExec, String updDev,
			String updUser1, String updUser2, String updQadc01, Double oidUpdDet) {
		this.id = id;
		this.updExec = updExec;
		this.updDev = updDev;
		this.updUser1 = updUser1;
		this.updUser2 = updUser2;
		this.updQadc01 = updQadc01;
		this.oidUpdDet = oidUpdDet;
	}

	// Property accessors

	public UpdDetId getId() {
		return this.id;
	}

	public void setId(UpdDetId id) {
		this.id = id;
	}

	public String getUpdExec() {
		return this.updExec;
	}

	public void setUpdExec(String updExec) {
		this.updExec = updExec;
	}

	public String getUpdDev() {
		return this.updDev;
	}

	public void setUpdDev(String updDev) {
		this.updDev = updDev;
	}

	public String getUpdUser1() {
		return this.updUser1;
	}

	public void setUpdUser1(String updUser1) {
		this.updUser1 = updUser1;
	}

	public String getUpdUser2() {
		return this.updUser2;
	}

	public void setUpdUser2(String updUser2) {
		this.updUser2 = updUser2;
	}

	public String getUpdQadc01() {
		return this.updQadc01;
	}

	public void setUpdQadc01(String updQadc01) {
		this.updQadc01 = updQadc01;
	}

	public Double getOidUpdDet() {
		return this.oidUpdDet;
	}

	public void setOidUpdDet(Double oidUpdDet) {
		this.oidUpdDet = oidUpdDet;
	}

}