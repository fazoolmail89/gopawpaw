package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFaclCalId entity provides the base persistence definition of the
 * FaclCalId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFaclCalId implements java.io.Serializable {

	// Fields

	private String faclDomain;
	private String faclId;
	private Integer faclYear;

	// Constructors

	/** default constructor */
	public AbstractFaclCalId() {
	}

	/** full constructor */
	public AbstractFaclCalId(String faclDomain, String faclId, Integer faclYear) {
		this.faclDomain = faclDomain;
		this.faclId = faclId;
		this.faclYear = faclYear;
	}

	// Property accessors

	public String getFaclDomain() {
		return this.faclDomain;
	}

	public void setFaclDomain(String faclDomain) {
		this.faclDomain = faclDomain;
	}

	public String getFaclId() {
		return this.faclId;
	}

	public void setFaclId(String faclId) {
		this.faclId = faclId;
	}

	public Integer getFaclYear() {
		return this.faclYear;
	}

	public void setFaclYear(Integer faclYear) {
		this.faclYear = faclYear;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFaclCalId))
			return false;
		AbstractFaclCalId castOther = (AbstractFaclCalId) other;

		return ((this.getFaclDomain() == castOther.getFaclDomain()) || (this
				.getFaclDomain() != null
				&& castOther.getFaclDomain() != null && this.getFaclDomain()
				.equals(castOther.getFaclDomain())))
				&& ((this.getFaclId() == castOther.getFaclId()) || (this
						.getFaclId() != null
						&& castOther.getFaclId() != null && this.getFaclId()
						.equals(castOther.getFaclId())))
				&& ((this.getFaclYear() == castOther.getFaclYear()) || (this
						.getFaclYear() != null
						&& castOther.getFaclYear() != null && this
						.getFaclYear().equals(castOther.getFaclYear())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFaclDomain() == null ? 0 : this.getFaclDomain()
						.hashCode());
		result = 37 * result
				+ (getFaclId() == null ? 0 : this.getFaclId().hashCode());
		result = 37 * result
				+ (getFaclYear() == null ? 0 : this.getFaclYear().hashCode());
		return result;
	}

}