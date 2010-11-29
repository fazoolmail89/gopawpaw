package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVecMstrId entity provides the base persistence definition of the
 * VecMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVecMstrId implements java.io.Serializable {

	// Fields

	private String vecDomain;
	private String vecCategory;

	// Constructors

	/** default constructor */
	public AbstractVecMstrId() {
	}

	/** full constructor */
	public AbstractVecMstrId(String vecDomain, String vecCategory) {
		this.vecDomain = vecDomain;
		this.vecCategory = vecCategory;
	}

	// Property accessors

	public String getVecDomain() {
		return this.vecDomain;
	}

	public void setVecDomain(String vecDomain) {
		this.vecDomain = vecDomain;
	}

	public String getVecCategory() {
		return this.vecCategory;
	}

	public void setVecCategory(String vecCategory) {
		this.vecCategory = vecCategory;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVecMstrId))
			return false;
		AbstractVecMstrId castOther = (AbstractVecMstrId) other;

		return ((this.getVecDomain() == castOther.getVecDomain()) || (this
				.getVecDomain() != null
				&& castOther.getVecDomain() != null && this.getVecDomain()
				.equals(castOther.getVecDomain())))
				&& ((this.getVecCategory() == castOther.getVecCategory()) || (this
						.getVecCategory() != null
						&& castOther.getVecCategory() != null && this
						.getVecCategory().equals(castOther.getVecCategory())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVecDomain() == null ? 0 : this.getVecDomain().hashCode());
		result = 37
				* result
				+ (getVecCategory() == null ? 0 : this.getVecCategory()
						.hashCode());
		return result;
	}

}