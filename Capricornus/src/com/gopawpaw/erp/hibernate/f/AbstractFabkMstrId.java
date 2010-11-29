package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFabkMstrId entity provides the base persistence definition of the
 * FabkMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabkMstrId implements java.io.Serializable {

	// Fields

	private String fabkDomain;
	private String fabkId;

	// Constructors

	/** default constructor */
	public AbstractFabkMstrId() {
	}

	/** full constructor */
	public AbstractFabkMstrId(String fabkDomain, String fabkId) {
		this.fabkDomain = fabkDomain;
		this.fabkId = fabkId;
	}

	// Property accessors

	public String getFabkDomain() {
		return this.fabkDomain;
	}

	public void setFabkDomain(String fabkDomain) {
		this.fabkDomain = fabkDomain;
	}

	public String getFabkId() {
		return this.fabkId;
	}

	public void setFabkId(String fabkId) {
		this.fabkId = fabkId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFabkMstrId))
			return false;
		AbstractFabkMstrId castOther = (AbstractFabkMstrId) other;

		return ((this.getFabkDomain() == castOther.getFabkDomain()) || (this
				.getFabkDomain() != null
				&& castOther.getFabkDomain() != null && this.getFabkDomain()
				.equals(castOther.getFabkDomain())))
				&& ((this.getFabkId() == castOther.getFabkId()) || (this
						.getFabkId() != null
						&& castOther.getFabkId() != null && this.getFabkId()
						.equals(castOther.getFabkId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFabkDomain() == null ? 0 : this.getFabkDomain()
						.hashCode());
		result = 37 * result
				+ (getFabkId() == null ? 0 : this.getFabkId().hashCode());
		return result;
	}

}