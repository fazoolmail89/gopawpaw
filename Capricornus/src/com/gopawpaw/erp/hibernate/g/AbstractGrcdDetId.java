package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrcdDetId entity provides the base persistence definition of the
 * GrcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrcdDetId implements java.io.Serializable {

	// Fields

	private String grcdDomain;
	private String grcdColGroup;
	private Integer grcdCol;

	// Constructors

	/** default constructor */
	public AbstractGrcdDetId() {
	}

	/** minimal constructor */
	public AbstractGrcdDetId(String grcdDomain) {
		this.grcdDomain = grcdDomain;
	}

	/** full constructor */
	public AbstractGrcdDetId(String grcdDomain, String grcdColGroup,
			Integer grcdCol) {
		this.grcdDomain = grcdDomain;
		this.grcdColGroup = grcdColGroup;
		this.grcdCol = grcdCol;
	}

	// Property accessors

	public String getGrcdDomain() {
		return this.grcdDomain;
	}

	public void setGrcdDomain(String grcdDomain) {
		this.grcdDomain = grcdDomain;
	}

	public String getGrcdColGroup() {
		return this.grcdColGroup;
	}

	public void setGrcdColGroup(String grcdColGroup) {
		this.grcdColGroup = grcdColGroup;
	}

	public Integer getGrcdCol() {
		return this.grcdCol;
	}

	public void setGrcdCol(Integer grcdCol) {
		this.grcdCol = grcdCol;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrcdDetId))
			return false;
		AbstractGrcdDetId castOther = (AbstractGrcdDetId) other;

		return ((this.getGrcdDomain() == castOther.getGrcdDomain()) || (this
				.getGrcdDomain() != null
				&& castOther.getGrcdDomain() != null && this.getGrcdDomain()
				.equals(castOther.getGrcdDomain())))
				&& ((this.getGrcdColGroup() == castOther.getGrcdColGroup()) || (this
						.getGrcdColGroup() != null
						&& castOther.getGrcdColGroup() != null && this
						.getGrcdColGroup().equals(castOther.getGrcdColGroup())))
				&& ((this.getGrcdCol() == castOther.getGrcdCol()) || (this
						.getGrcdCol() != null
						&& castOther.getGrcdCol() != null && this.getGrcdCol()
						.equals(castOther.getGrcdCol())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGrcdDomain() == null ? 0 : this.getGrcdDomain()
						.hashCode());
		result = 37
				* result
				+ (getGrcdColGroup() == null ? 0 : this.getGrcdColGroup()
						.hashCode());
		result = 37 * result
				+ (getGrcdCol() == null ? 0 : this.getGrcdCol().hashCode());
		return result;
	}

}