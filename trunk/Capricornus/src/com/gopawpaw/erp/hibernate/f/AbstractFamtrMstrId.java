package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFamtrMstrId entity provides the base persistence definition of the
 * FamtrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFamtrMstrId implements java.io.Serializable {

	// Fields

	private String famtrDomain;
	private String famtrId;

	// Constructors

	/** default constructor */
	public AbstractFamtrMstrId() {
	}

	/** full constructor */
	public AbstractFamtrMstrId(String famtrDomain, String famtrId) {
		this.famtrDomain = famtrDomain;
		this.famtrId = famtrId;
	}

	// Property accessors

	public String getFamtrDomain() {
		return this.famtrDomain;
	}

	public void setFamtrDomain(String famtrDomain) {
		this.famtrDomain = famtrDomain;
	}

	public String getFamtrId() {
		return this.famtrId;
	}

	public void setFamtrId(String famtrId) {
		this.famtrId = famtrId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFamtrMstrId))
			return false;
		AbstractFamtrMstrId castOther = (AbstractFamtrMstrId) other;

		return ((this.getFamtrDomain() == castOther.getFamtrDomain()) || (this
				.getFamtrDomain() != null
				&& castOther.getFamtrDomain() != null && this.getFamtrDomain()
				.equals(castOther.getFamtrDomain())))
				&& ((this.getFamtrId() == castOther.getFamtrId()) || (this
						.getFamtrId() != null
						&& castOther.getFamtrId() != null && this.getFamtrId()
						.equals(castOther.getFamtrId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFamtrDomain() == null ? 0 : this.getFamtrDomain()
						.hashCode());
		result = 37 * result
				+ (getFamtrId() == null ? 0 : this.getFamtrId().hashCode());
		return result;
	}

}