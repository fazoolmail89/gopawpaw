package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFaclsMstrId entity provides the base persistence definition of the
 * FaclsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFaclsMstrId implements java.io.Serializable {

	// Fields

	private String faclsDomain;
	private String faclsId;

	// Constructors

	/** default constructor */
	public AbstractFaclsMstrId() {
	}

	/** full constructor */
	public AbstractFaclsMstrId(String faclsDomain, String faclsId) {
		this.faclsDomain = faclsDomain;
		this.faclsId = faclsId;
	}

	// Property accessors

	public String getFaclsDomain() {
		return this.faclsDomain;
	}

	public void setFaclsDomain(String faclsDomain) {
		this.faclsDomain = faclsDomain;
	}

	public String getFaclsId() {
		return this.faclsId;
	}

	public void setFaclsId(String faclsId) {
		this.faclsId = faclsId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFaclsMstrId))
			return false;
		AbstractFaclsMstrId castOther = (AbstractFaclsMstrId) other;

		return ((this.getFaclsDomain() == castOther.getFaclsDomain()) || (this
				.getFaclsDomain() != null
				&& castOther.getFaclsDomain() != null && this.getFaclsDomain()
				.equals(castOther.getFaclsDomain())))
				&& ((this.getFaclsId() == castOther.getFaclsId()) || (this
						.getFaclsId() != null
						&& castOther.getFaclsId() != null && this.getFaclsId()
						.equals(castOther.getFaclsId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFaclsDomain() == null ? 0 : this.getFaclsDomain()
						.hashCode());
		result = 37 * result
				+ (getFaclsId() == null ? 0 : this.getFaclsId().hashCode());
		return result;
	}

}