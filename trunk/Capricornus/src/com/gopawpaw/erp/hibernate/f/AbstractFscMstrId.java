package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFscMstrId entity provides the base persistence definition of the
 * FscMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFscMstrId implements java.io.Serializable {

	// Fields

	private String fscDomain;
	private String fscCode;

	// Constructors

	/** default constructor */
	public AbstractFscMstrId() {
	}

	/** minimal constructor */
	public AbstractFscMstrId(String fscDomain) {
		this.fscDomain = fscDomain;
	}

	/** full constructor */
	public AbstractFscMstrId(String fscDomain, String fscCode) {
		this.fscDomain = fscDomain;
		this.fscCode = fscCode;
	}

	// Property accessors

	public String getFscDomain() {
		return this.fscDomain;
	}

	public void setFscDomain(String fscDomain) {
		this.fscDomain = fscDomain;
	}

	public String getFscCode() {
		return this.fscCode;
	}

	public void setFscCode(String fscCode) {
		this.fscCode = fscCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFscMstrId))
			return false;
		AbstractFscMstrId castOther = (AbstractFscMstrId) other;

		return ((this.getFscDomain() == castOther.getFscDomain()) || (this
				.getFscDomain() != null
				&& castOther.getFscDomain() != null && this.getFscDomain()
				.equals(castOther.getFscDomain())))
				&& ((this.getFscCode() == castOther.getFscCode()) || (this
						.getFscCode() != null
						&& castOther.getFscCode() != null && this.getFscCode()
						.equals(castOther.getFscCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFscDomain() == null ? 0 : this.getFscDomain().hashCode());
		result = 37 * result
				+ (getFscCode() == null ? 0 : this.getFscCode().hashCode());
		return result;
	}

}