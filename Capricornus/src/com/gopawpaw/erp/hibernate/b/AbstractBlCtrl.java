package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBlCtrl entity provides the base persistence definition of the BlCtrl
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBlCtrl implements java.io.Serializable {

	// Fields

	private BlCtrlId id;
	private String blUser1;
	private String blUser2;
	private String blQadc01;
	private Double oidBlCtrl;

	// Constructors

	/** default constructor */
	public AbstractBlCtrl() {
	}

	/** minimal constructor */
	public AbstractBlCtrl(BlCtrlId id, Double oidBlCtrl) {
		this.id = id;
		this.oidBlCtrl = oidBlCtrl;
	}

	/** full constructor */
	public AbstractBlCtrl(BlCtrlId id, String blUser1, String blUser2,
			String blQadc01, Double oidBlCtrl) {
		this.id = id;
		this.blUser1 = blUser1;
		this.blUser2 = blUser2;
		this.blQadc01 = blQadc01;
		this.oidBlCtrl = oidBlCtrl;
	}

	// Property accessors

	public BlCtrlId getId() {
		return this.id;
	}

	public void setId(BlCtrlId id) {
		this.id = id;
	}

	public String getBlUser1() {
		return this.blUser1;
	}

	public void setBlUser1(String blUser1) {
		this.blUser1 = blUser1;
	}

	public String getBlUser2() {
		return this.blUser2;
	}

	public void setBlUser2(String blUser2) {
		this.blUser2 = blUser2;
	}

	public String getBlQadc01() {
		return this.blQadc01;
	}

	public void setBlQadc01(String blQadc01) {
		this.blQadc01 = blQadc01;
	}

	public Double getOidBlCtrl() {
		return this.oidBlCtrl;
	}

	public void setOidBlCtrl(Double oidBlCtrl) {
		this.oidBlCtrl = oidBlCtrl;
	}

}