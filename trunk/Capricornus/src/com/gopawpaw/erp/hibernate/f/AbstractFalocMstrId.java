package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFalocMstrId entity provides the base persistence definition of the
 * FalocMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFalocMstrId implements java.io.Serializable {

	// Fields

	private String falocDomain;
	private String falocId;

	// Constructors

	/** default constructor */
	public AbstractFalocMstrId() {
	}

	/** full constructor */
	public AbstractFalocMstrId(String falocDomain, String falocId) {
		this.falocDomain = falocDomain;
		this.falocId = falocId;
	}

	// Property accessors

	public String getFalocDomain() {
		return this.falocDomain;
	}

	public void setFalocDomain(String falocDomain) {
		this.falocDomain = falocDomain;
	}

	public String getFalocId() {
		return this.falocId;
	}

	public void setFalocId(String falocId) {
		this.falocId = falocId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFalocMstrId))
			return false;
		AbstractFalocMstrId castOther = (AbstractFalocMstrId) other;

		return ((this.getFalocDomain() == castOther.getFalocDomain()) || (this
				.getFalocDomain() != null
				&& castOther.getFalocDomain() != null && this.getFalocDomain()
				.equals(castOther.getFalocDomain())))
				&& ((this.getFalocId() == castOther.getFalocId()) || (this
						.getFalocId() != null
						&& castOther.getFalocId() != null && this.getFalocId()
						.equals(castOther.getFalocId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFalocDomain() == null ? 0 : this.getFalocDomain()
						.hashCode());
		result = 37 * result
				+ (getFalocId() == null ? 0 : this.getFalocId().hashCode());
		return result;
	}

}