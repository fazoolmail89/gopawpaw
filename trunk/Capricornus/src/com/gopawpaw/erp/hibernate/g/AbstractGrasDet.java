package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrasDet entity provides the base persistence definition of the
 * GrasDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrasDet implements java.io.Serializable {

	// Fields

	private GrasDetId id;
	private String grasUser1;
	private String grasUser2;
	private String grasQadc01;
	private Double oidGrasDet;

	// Constructors

	/** default constructor */
	public AbstractGrasDet() {
	}

	/** minimal constructor */
	public AbstractGrasDet(GrasDetId id, Double oidGrasDet) {
		this.id = id;
		this.oidGrasDet = oidGrasDet;
	}

	/** full constructor */
	public AbstractGrasDet(GrasDetId id, String grasUser1, String grasUser2,
			String grasQadc01, Double oidGrasDet) {
		this.id = id;
		this.grasUser1 = grasUser1;
		this.grasUser2 = grasUser2;
		this.grasQadc01 = grasQadc01;
		this.oidGrasDet = oidGrasDet;
	}

	// Property accessors

	public GrasDetId getId() {
		return this.id;
	}

	public void setId(GrasDetId id) {
		this.id = id;
	}

	public String getGrasUser1() {
		return this.grasUser1;
	}

	public void setGrasUser1(String grasUser1) {
		this.grasUser1 = grasUser1;
	}

	public String getGrasUser2() {
		return this.grasUser2;
	}

	public void setGrasUser2(String grasUser2) {
		this.grasUser2 = grasUser2;
	}

	public String getGrasQadc01() {
		return this.grasQadc01;
	}

	public void setGrasQadc01(String grasQadc01) {
		this.grasQadc01 = grasQadc01;
	}

	public Double getOidGrasDet() {
		return this.oidGrasDet;
	}

	public void setOidGrasDet(Double oidGrasDet) {
		this.oidGrasDet = oidGrasDet;
	}

}