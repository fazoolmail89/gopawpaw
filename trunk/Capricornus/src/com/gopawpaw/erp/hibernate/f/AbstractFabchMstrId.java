package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFabchMstrId entity provides the base persistence definition of the
 * FabchMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabchMstrId implements java.io.Serializable {

	// Fields

	private String fabchDomain;
	private String fabchId;

	// Constructors

	/** default constructor */
	public AbstractFabchMstrId() {
	}

	/** full constructor */
	public AbstractFabchMstrId(String fabchDomain, String fabchId) {
		this.fabchDomain = fabchDomain;
		this.fabchId = fabchId;
	}

	// Property accessors

	public String getFabchDomain() {
		return this.fabchDomain;
	}

	public void setFabchDomain(String fabchDomain) {
		this.fabchDomain = fabchDomain;
	}

	public String getFabchId() {
		return this.fabchId;
	}

	public void setFabchId(String fabchId) {
		this.fabchId = fabchId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFabchMstrId))
			return false;
		AbstractFabchMstrId castOther = (AbstractFabchMstrId) other;

		return ((this.getFabchDomain() == castOther.getFabchDomain()) || (this
				.getFabchDomain() != null
				&& castOther.getFabchDomain() != null && this.getFabchDomain()
				.equals(castOther.getFabchDomain())))
				&& ((this.getFabchId() == castOther.getFabchId()) || (this
						.getFabchId() != null
						&& castOther.getFabchId() != null && this.getFabchId()
						.equals(castOther.getFabchId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFabchDomain() == null ? 0 : this.getFabchDomain()
						.hashCode());
		result = 37 * result
				+ (getFabchId() == null ? 0 : this.getFabchId().hashCode());
		return result;
	}

}