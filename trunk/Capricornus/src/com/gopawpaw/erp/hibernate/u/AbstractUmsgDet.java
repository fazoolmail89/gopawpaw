package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUmsgDet entity provides the base persistence definition of the
 * UmsgDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUmsgDet implements java.io.Serializable {

	// Fields

	private UmsgDetId id;
	private Integer umsgLevel;
	private String umsgExecPgm;
	private String umsgUser1;
	private String umsgUser2;
	private String umsgQadc01;
	private Double oidUmsgDet;

	// Constructors

	/** default constructor */
	public AbstractUmsgDet() {
	}

	/** minimal constructor */
	public AbstractUmsgDet(UmsgDetId id, Double oidUmsgDet) {
		this.id = id;
		this.oidUmsgDet = oidUmsgDet;
	}

	/** full constructor */
	public AbstractUmsgDet(UmsgDetId id, Integer umsgLevel, String umsgExecPgm,
			String umsgUser1, String umsgUser2, String umsgQadc01,
			Double oidUmsgDet) {
		this.id = id;
		this.umsgLevel = umsgLevel;
		this.umsgExecPgm = umsgExecPgm;
		this.umsgUser1 = umsgUser1;
		this.umsgUser2 = umsgUser2;
		this.umsgQadc01 = umsgQadc01;
		this.oidUmsgDet = oidUmsgDet;
	}

	// Property accessors

	public UmsgDetId getId() {
		return this.id;
	}

	public void setId(UmsgDetId id) {
		this.id = id;
	}

	public Integer getUmsgLevel() {
		return this.umsgLevel;
	}

	public void setUmsgLevel(Integer umsgLevel) {
		this.umsgLevel = umsgLevel;
	}

	public String getUmsgExecPgm() {
		return this.umsgExecPgm;
	}

	public void setUmsgExecPgm(String umsgExecPgm) {
		this.umsgExecPgm = umsgExecPgm;
	}

	public String getUmsgUser1() {
		return this.umsgUser1;
	}

	public void setUmsgUser1(String umsgUser1) {
		this.umsgUser1 = umsgUser1;
	}

	public String getUmsgUser2() {
		return this.umsgUser2;
	}

	public void setUmsgUser2(String umsgUser2) {
		this.umsgUser2 = umsgUser2;
	}

	public String getUmsgQadc01() {
		return this.umsgQadc01;
	}

	public void setUmsgQadc01(String umsgQadc01) {
		this.umsgQadc01 = umsgQadc01;
	}

	public Double getOidUmsgDet() {
		return this.oidUmsgDet;
	}

	public void setOidUmsgDet(Double oidUmsgDet) {
		this.oidUmsgDet = oidUmsgDet;
	}

}