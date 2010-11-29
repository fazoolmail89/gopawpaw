package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFadfMstrId entity provides the base persistence definition of the
 * FadfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFadfMstrId implements java.io.Serializable {

	// Fields

	private String fadfDomain;
	private String fadfFaclsId;
	private String fadfFabkId;

	// Constructors

	/** default constructor */
	public AbstractFadfMstrId() {
	}

	/** full constructor */
	public AbstractFadfMstrId(String fadfDomain, String fadfFaclsId,
			String fadfFabkId) {
		this.fadfDomain = fadfDomain;
		this.fadfFaclsId = fadfFaclsId;
		this.fadfFabkId = fadfFabkId;
	}

	// Property accessors

	public String getFadfDomain() {
		return this.fadfDomain;
	}

	public void setFadfDomain(String fadfDomain) {
		this.fadfDomain = fadfDomain;
	}

	public String getFadfFaclsId() {
		return this.fadfFaclsId;
	}

	public void setFadfFaclsId(String fadfFaclsId) {
		this.fadfFaclsId = fadfFaclsId;
	}

	public String getFadfFabkId() {
		return this.fadfFabkId;
	}

	public void setFadfFabkId(String fadfFabkId) {
		this.fadfFabkId = fadfFabkId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFadfMstrId))
			return false;
		AbstractFadfMstrId castOther = (AbstractFadfMstrId) other;

		return ((this.getFadfDomain() == castOther.getFadfDomain()) || (this
				.getFadfDomain() != null
				&& castOther.getFadfDomain() != null && this.getFadfDomain()
				.equals(castOther.getFadfDomain())))
				&& ((this.getFadfFaclsId() == castOther.getFadfFaclsId()) || (this
						.getFadfFaclsId() != null
						&& castOther.getFadfFaclsId() != null && this
						.getFadfFaclsId().equals(castOther.getFadfFaclsId())))
				&& ((this.getFadfFabkId() == castOther.getFadfFabkId()) || (this
						.getFadfFabkId() != null
						&& castOther.getFadfFabkId() != null && this
						.getFadfFabkId().equals(castOther.getFadfFabkId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFadfDomain() == null ? 0 : this.getFadfDomain()
						.hashCode());
		result = 37
				* result
				+ (getFadfFaclsId() == null ? 0 : this.getFadfFaclsId()
						.hashCode());
		result = 37
				* result
				+ (getFadfFabkId() == null ? 0 : this.getFadfFabkId()
						.hashCode());
		return result;
	}

}