package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrvDet entity provides the base persistence definition of the GrvDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrvDet implements java.io.Serializable {

	// Fields

	private GrvDetId id;
	private String grvUser1;
	private String grvUser2;
	private String grvQadc01;
	private Double oidGrvDet;

	// Constructors

	/** default constructor */
	public AbstractGrvDet() {
	}

	/** minimal constructor */
	public AbstractGrvDet(GrvDetId id, Double oidGrvDet) {
		this.id = id;
		this.oidGrvDet = oidGrvDet;
	}

	/** full constructor */
	public AbstractGrvDet(GrvDetId id, String grvUser1, String grvUser2,
			String grvQadc01, Double oidGrvDet) {
		this.id = id;
		this.grvUser1 = grvUser1;
		this.grvUser2 = grvUser2;
		this.grvQadc01 = grvQadc01;
		this.oidGrvDet = oidGrvDet;
	}

	// Property accessors

	public GrvDetId getId() {
		return this.id;
	}

	public void setId(GrvDetId id) {
		this.id = id;
	}

	public String getGrvUser1() {
		return this.grvUser1;
	}

	public void setGrvUser1(String grvUser1) {
		this.grvUser1 = grvUser1;
	}

	public String getGrvUser2() {
		return this.grvUser2;
	}

	public void setGrvUser2(String grvUser2) {
		this.grvUser2 = grvUser2;
	}

	public String getGrvQadc01() {
		return this.grvQadc01;
	}

	public void setGrvQadc01(String grvQadc01) {
		this.grvQadc01 = grvQadc01;
	}

	public Double getOidGrvDet() {
		return this.oidGrvDet;
	}

	public void setOidGrvDet(Double oidGrvDet) {
		this.oidGrvDet = oidGrvDet;
	}

}