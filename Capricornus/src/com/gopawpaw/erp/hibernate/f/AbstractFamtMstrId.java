package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFamtMstrId entity provides the base persistence definition of the
 * FamtMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFamtMstrId implements java.io.Serializable {

	// Fields

	private String famtDomain;
	private String famtId;

	// Constructors

	/** default constructor */
	public AbstractFamtMstrId() {
	}

	/** full constructor */
	public AbstractFamtMstrId(String famtDomain, String famtId) {
		this.famtDomain = famtDomain;
		this.famtId = famtId;
	}

	// Property accessors

	public String getFamtDomain() {
		return this.famtDomain;
	}

	public void setFamtDomain(String famtDomain) {
		this.famtDomain = famtDomain;
	}

	public String getFamtId() {
		return this.famtId;
	}

	public void setFamtId(String famtId) {
		this.famtId = famtId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFamtMstrId))
			return false;
		AbstractFamtMstrId castOther = (AbstractFamtMstrId) other;

		return ((this.getFamtDomain() == castOther.getFamtDomain()) || (this
				.getFamtDomain() != null
				&& castOther.getFamtDomain() != null && this.getFamtDomain()
				.equals(castOther.getFamtDomain())))
				&& ((this.getFamtId() == castOther.getFamtId()) || (this
						.getFamtId() != null
						&& castOther.getFamtId() != null && this.getFamtId()
						.equals(castOther.getFamtId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFamtDomain() == null ? 0 : this.getFamtDomain()
						.hashCode());
		result = 37 * result
				+ (getFamtId() == null ? 0 : this.getFamtId().hashCode());
		return result;
	}

}