package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVpoDet entity provides the base persistence definition of the VpoDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVpoDet implements java.io.Serializable {

	// Fields

	private VpoDetId id;
	private String vpoUser1;
	private String vpoUser2;
	private String vpoQadc01;
	private Double oidVpoDet;

	// Constructors

	/** default constructor */
	public AbstractVpoDet() {
	}

	/** minimal constructor */
	public AbstractVpoDet(VpoDetId id, Double oidVpoDet) {
		this.id = id;
		this.oidVpoDet = oidVpoDet;
	}

	/** full constructor */
	public AbstractVpoDet(VpoDetId id, String vpoUser1, String vpoUser2,
			String vpoQadc01, Double oidVpoDet) {
		this.id = id;
		this.vpoUser1 = vpoUser1;
		this.vpoUser2 = vpoUser2;
		this.vpoQadc01 = vpoQadc01;
		this.oidVpoDet = oidVpoDet;
	}

	// Property accessors

	public VpoDetId getId() {
		return this.id;
	}

	public void setId(VpoDetId id) {
		this.id = id;
	}

	public String getVpoUser1() {
		return this.vpoUser1;
	}

	public void setVpoUser1(String vpoUser1) {
		this.vpoUser1 = vpoUser1;
	}

	public String getVpoUser2() {
		return this.vpoUser2;
	}

	public void setVpoUser2(String vpoUser2) {
		this.vpoUser2 = vpoUser2;
	}

	public String getVpoQadc01() {
		return this.vpoQadc01;
	}

	public void setVpoQadc01(String vpoQadc01) {
		this.vpoQadc01 = vpoQadc01;
	}

	public Double getOidVpoDet() {
		return this.oidVpoDet;
	}

	public void setOidVpoDet(Double oidVpoDet) {
		this.oidVpoDet = oidVpoDet;
	}

}