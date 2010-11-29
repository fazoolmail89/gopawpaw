package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrhdDet entity provides the base persistence definition of the
 * GrhdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrhdDet implements java.io.Serializable {

	// Fields

	private GrhdDetId id;
	private Boolean grhdExplode;
	private Integer grhdPriority;
	private Integer grhdSubIndent;
	private String grhdUser1;
	private String grhdUser2;
	private String grhdQadc01;
	private Double oidGrhdDet;

	// Constructors

	/** default constructor */
	public AbstractGrhdDet() {
	}

	/** minimal constructor */
	public AbstractGrhdDet(GrhdDetId id, Double oidGrhdDet) {
		this.id = id;
		this.oidGrhdDet = oidGrhdDet;
	}

	/** full constructor */
	public AbstractGrhdDet(GrhdDetId id, Boolean grhdExplode,
			Integer grhdPriority, Integer grhdSubIndent, String grhdUser1,
			String grhdUser2, String grhdQadc01, Double oidGrhdDet) {
		this.id = id;
		this.grhdExplode = grhdExplode;
		this.grhdPriority = grhdPriority;
		this.grhdSubIndent = grhdSubIndent;
		this.grhdUser1 = grhdUser1;
		this.grhdUser2 = grhdUser2;
		this.grhdQadc01 = grhdQadc01;
		this.oidGrhdDet = oidGrhdDet;
	}

	// Property accessors

	public GrhdDetId getId() {
		return this.id;
	}

	public void setId(GrhdDetId id) {
		this.id = id;
	}

	public Boolean getGrhdExplode() {
		return this.grhdExplode;
	}

	public void setGrhdExplode(Boolean grhdExplode) {
		this.grhdExplode = grhdExplode;
	}

	public Integer getGrhdPriority() {
		return this.grhdPriority;
	}

	public void setGrhdPriority(Integer grhdPriority) {
		this.grhdPriority = grhdPriority;
	}

	public Integer getGrhdSubIndent() {
		return this.grhdSubIndent;
	}

	public void setGrhdSubIndent(Integer grhdSubIndent) {
		this.grhdSubIndent = grhdSubIndent;
	}

	public String getGrhdUser1() {
		return this.grhdUser1;
	}

	public void setGrhdUser1(String grhdUser1) {
		this.grhdUser1 = grhdUser1;
	}

	public String getGrhdUser2() {
		return this.grhdUser2;
	}

	public void setGrhdUser2(String grhdUser2) {
		this.grhdUser2 = grhdUser2;
	}

	public String getGrhdQadc01() {
		return this.grhdQadc01;
	}

	public void setGrhdQadc01(String grhdQadc01) {
		this.grhdQadc01 = grhdQadc01;
	}

	public Double getOidGrhdDet() {
		return this.oidGrhdDet;
	}

	public void setOidGrhdDet(Double oidGrhdDet) {
		this.oidGrhdDet = oidGrhdDet;
	}

}