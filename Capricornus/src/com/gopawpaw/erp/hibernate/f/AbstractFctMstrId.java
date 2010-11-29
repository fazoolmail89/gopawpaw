package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFctMstrId entity provides the base persistence definition of the
 * FctMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFctMstrId implements java.io.Serializable {

	// Fields

	private String fctDomain;
	private String fctType;

	// Constructors

	/** default constructor */
	public AbstractFctMstrId() {
	}

	/** minimal constructor */
	public AbstractFctMstrId(String fctDomain) {
		this.fctDomain = fctDomain;
	}

	/** full constructor */
	public AbstractFctMstrId(String fctDomain, String fctType) {
		this.fctDomain = fctDomain;
		this.fctType = fctType;
	}

	// Property accessors

	public String getFctDomain() {
		return this.fctDomain;
	}

	public void setFctDomain(String fctDomain) {
		this.fctDomain = fctDomain;
	}

	public String getFctType() {
		return this.fctType;
	}

	public void setFctType(String fctType) {
		this.fctType = fctType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFctMstrId))
			return false;
		AbstractFctMstrId castOther = (AbstractFctMstrId) other;

		return ((this.getFctDomain() == castOther.getFctDomain()) || (this
				.getFctDomain() != null
				&& castOther.getFctDomain() != null && this.getFctDomain()
				.equals(castOther.getFctDomain())))
				&& ((this.getFctType() == castOther.getFctType()) || (this
						.getFctType() != null
						&& castOther.getFctType() != null && this.getFctType()
						.equals(castOther.getFctType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFctDomain() == null ? 0 : this.getFctDomain().hashCode());
		result = 37 * result
				+ (getFctType() == null ? 0 : this.getFctType().hashCode());
		return result;
	}

}