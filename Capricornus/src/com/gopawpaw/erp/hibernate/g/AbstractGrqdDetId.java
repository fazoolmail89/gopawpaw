package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrqdDetId entity provides the base persistence definition of the
 * GrqdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrqdDetId implements java.io.Serializable {

	// Fields

	private String grqdDomain;
	private Integer grqdYear;
	private Integer grqdQuarter;

	// Constructors

	/** default constructor */
	public AbstractGrqdDetId() {
	}

	/** minimal constructor */
	public AbstractGrqdDetId(String grqdDomain) {
		this.grqdDomain = grqdDomain;
	}

	/** full constructor */
	public AbstractGrqdDetId(String grqdDomain, Integer grqdYear,
			Integer grqdQuarter) {
		this.grqdDomain = grqdDomain;
		this.grqdYear = grqdYear;
		this.grqdQuarter = grqdQuarter;
	}

	// Property accessors

	public String getGrqdDomain() {
		return this.grqdDomain;
	}

	public void setGrqdDomain(String grqdDomain) {
		this.grqdDomain = grqdDomain;
	}

	public Integer getGrqdYear() {
		return this.grqdYear;
	}

	public void setGrqdYear(Integer grqdYear) {
		this.grqdYear = grqdYear;
	}

	public Integer getGrqdQuarter() {
		return this.grqdQuarter;
	}

	public void setGrqdQuarter(Integer grqdQuarter) {
		this.grqdQuarter = grqdQuarter;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrqdDetId))
			return false;
		AbstractGrqdDetId castOther = (AbstractGrqdDetId) other;

		return ((this.getGrqdDomain() == castOther.getGrqdDomain()) || (this
				.getGrqdDomain() != null
				&& castOther.getGrqdDomain() != null && this.getGrqdDomain()
				.equals(castOther.getGrqdDomain())))
				&& ((this.getGrqdYear() == castOther.getGrqdYear()) || (this
						.getGrqdYear() != null
						&& castOther.getGrqdYear() != null && this
						.getGrqdYear().equals(castOther.getGrqdYear())))
				&& ((this.getGrqdQuarter() == castOther.getGrqdQuarter()) || (this
						.getGrqdQuarter() != null
						&& castOther.getGrqdQuarter() != null && this
						.getGrqdQuarter().equals(castOther.getGrqdQuarter())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGrqdDomain() == null ? 0 : this.getGrqdDomain()
						.hashCode());
		result = 37 * result
				+ (getGrqdYear() == null ? 0 : this.getGrqdYear().hashCode());
		result = 37
				* result
				+ (getGrqdQuarter() == null ? 0 : this.getGrqdQuarter()
						.hashCode());
		return result;
	}

}