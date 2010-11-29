package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVrcCtrl entity provides the base persistence definition of the
 * VrcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVrcCtrl implements java.io.Serializable {

	// Fields

	private VrcCtrlId id;
	private String vrcUser1;
	private String vrcUser2;
	private String vrcQadc01;
	private Double oidVrcCtrl;

	// Constructors

	/** default constructor */
	public AbstractVrcCtrl() {
	}

	/** minimal constructor */
	public AbstractVrcCtrl(VrcCtrlId id, Double oidVrcCtrl) {
		this.id = id;
		this.oidVrcCtrl = oidVrcCtrl;
	}

	/** full constructor */
	public AbstractVrcCtrl(VrcCtrlId id, String vrcUser1, String vrcUser2,
			String vrcQadc01, Double oidVrcCtrl) {
		this.id = id;
		this.vrcUser1 = vrcUser1;
		this.vrcUser2 = vrcUser2;
		this.vrcQadc01 = vrcQadc01;
		this.oidVrcCtrl = oidVrcCtrl;
	}

	// Property accessors

	public VrcCtrlId getId() {
		return this.id;
	}

	public void setId(VrcCtrlId id) {
		this.id = id;
	}

	public String getVrcUser1() {
		return this.vrcUser1;
	}

	public void setVrcUser1(String vrcUser1) {
		this.vrcUser1 = vrcUser1;
	}

	public String getVrcUser2() {
		return this.vrcUser2;
	}

	public void setVrcUser2(String vrcUser2) {
		this.vrcUser2 = vrcUser2;
	}

	public String getVrcQadc01() {
		return this.vrcQadc01;
	}

	public void setVrcQadc01(String vrcQadc01) {
		this.vrcQadc01 = vrcQadc01;
	}

	public Double getOidVrcCtrl() {
		return this.oidVrcCtrl;
	}

	public void setOidVrcCtrl(Double oidVrcCtrl) {
		this.oidVrcCtrl = oidVrcCtrl;
	}

}