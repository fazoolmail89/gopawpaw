package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFaMstrId entity provides the base persistence definition of the
 * FaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFaMstrId implements java.io.Serializable {

	// Fields

	private String faDomain;
	private String faId;

	// Constructors

	/** default constructor */
	public AbstractFaMstrId() {
	}

	/** full constructor */
	public AbstractFaMstrId(String faDomain, String faId) {
		this.faDomain = faDomain;
		this.faId = faId;
	}

	// Property accessors

	public String getFaDomain() {
		return this.faDomain;
	}

	public void setFaDomain(String faDomain) {
		this.faDomain = faDomain;
	}

	public String getFaId() {
		return this.faId;
	}

	public void setFaId(String faId) {
		this.faId = faId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFaMstrId))
			return false;
		AbstractFaMstrId castOther = (AbstractFaMstrId) other;

		return ((this.getFaDomain() == castOther.getFaDomain()) || (this
				.getFaDomain() != null
				&& castOther.getFaDomain() != null && this.getFaDomain()
				.equals(castOther.getFaDomain())))
				&& ((this.getFaId() == castOther.getFaId()) || (this.getFaId() != null
						&& castOther.getFaId() != null && this.getFaId()
						.equals(castOther.getFaId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFaDomain() == null ? 0 : this.getFaDomain().hashCode());
		result = 37 * result
				+ (getFaId() == null ? 0 : this.getFaId().hashCode());
		return result;
	}

}