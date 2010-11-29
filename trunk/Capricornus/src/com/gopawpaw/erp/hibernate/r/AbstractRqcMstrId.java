package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqcMstrId entity provides the base persistence definition of the
 * RqcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqcMstrId implements java.io.Serializable {

	// Fields

	private String rqcDomain;
	private String rqcCategory;

	// Constructors

	/** default constructor */
	public AbstractRqcMstrId() {
	}

	/** minimal constructor */
	public AbstractRqcMstrId(String rqcDomain) {
		this.rqcDomain = rqcDomain;
	}

	/** full constructor */
	public AbstractRqcMstrId(String rqcDomain, String rqcCategory) {
		this.rqcDomain = rqcDomain;
		this.rqcCategory = rqcCategory;
	}

	// Property accessors

	public String getRqcDomain() {
		return this.rqcDomain;
	}

	public void setRqcDomain(String rqcDomain) {
		this.rqcDomain = rqcDomain;
	}

	public String getRqcCategory() {
		return this.rqcCategory;
	}

	public void setRqcCategory(String rqcCategory) {
		this.rqcCategory = rqcCategory;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqcMstrId))
			return false;
		AbstractRqcMstrId castOther = (AbstractRqcMstrId) other;

		return ((this.getRqcDomain() == castOther.getRqcDomain()) || (this
				.getRqcDomain() != null
				&& castOther.getRqcDomain() != null && this.getRqcDomain()
				.equals(castOther.getRqcDomain())))
				&& ((this.getRqcCategory() == castOther.getRqcCategory()) || (this
						.getRqcCategory() != null
						&& castOther.getRqcCategory() != null && this
						.getRqcCategory().equals(castOther.getRqcCategory())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRqcDomain() == null ? 0 : this.getRqcDomain().hashCode());
		result = 37
				* result
				+ (getRqcCategory() == null ? 0 : this.getRqcCategory()
						.hashCode());
		return result;
	}

}