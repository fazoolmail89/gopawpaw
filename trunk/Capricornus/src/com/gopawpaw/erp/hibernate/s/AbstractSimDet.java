package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSimDet entity provides the base persistence definition of the SimDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSimDet implements java.io.Serializable {

	// Fields

	private SimDetId id;
	private String simCanrun;
	private String simUser1;
	private String simUser2;
	private String simQadc01;
	private Double oidSimDet;

	// Constructors

	/** default constructor */
	public AbstractSimDet() {
	}

	/** minimal constructor */
	public AbstractSimDet(SimDetId id, String simCanrun, Double oidSimDet) {
		this.id = id;
		this.simCanrun = simCanrun;
		this.oidSimDet = oidSimDet;
	}

	/** full constructor */
	public AbstractSimDet(SimDetId id, String simCanrun, String simUser1,
			String simUser2, String simQadc01, Double oidSimDet) {
		this.id = id;
		this.simCanrun = simCanrun;
		this.simUser1 = simUser1;
		this.simUser2 = simUser2;
		this.simQadc01 = simQadc01;
		this.oidSimDet = oidSimDet;
	}

	// Property accessors

	public SimDetId getId() {
		return this.id;
	}

	public void setId(SimDetId id) {
		this.id = id;
	}

	public String getSimCanrun() {
		return this.simCanrun;
	}

	public void setSimCanrun(String simCanrun) {
		this.simCanrun = simCanrun;
	}

	public String getSimUser1() {
		return this.simUser1;
	}

	public void setSimUser1(String simUser1) {
		this.simUser1 = simUser1;
	}

	public String getSimUser2() {
		return this.simUser2;
	}

	public void setSimUser2(String simUser2) {
		this.simUser2 = simUser2;
	}

	public String getSimQadc01() {
		return this.simQadc01;
	}

	public void setSimQadc01(String simQadc01) {
		this.simQadc01 = simQadc01;
	}

	public Double getOidSimDet() {
		return this.oidSimDet;
	}

	public void setOidSimDet(Double oidSimDet) {
		this.oidSimDet = oidSimDet;
	}

}