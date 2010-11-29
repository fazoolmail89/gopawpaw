package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFacldDetId entity provides the base persistence definition of the
 * FacldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFacldDetId implements java.io.Serializable {

	// Fields

	private String facldDomain;
	private String facldFaclId;
	private Integer facldYear;
	private Integer facldPer;

	// Constructors

	/** default constructor */
	public AbstractFacldDetId() {
	}

	/** full constructor */
	public AbstractFacldDetId(String facldDomain, String facldFaclId,
			Integer facldYear, Integer facldPer) {
		this.facldDomain = facldDomain;
		this.facldFaclId = facldFaclId;
		this.facldYear = facldYear;
		this.facldPer = facldPer;
	}

	// Property accessors

	public String getFacldDomain() {
		return this.facldDomain;
	}

	public void setFacldDomain(String facldDomain) {
		this.facldDomain = facldDomain;
	}

	public String getFacldFaclId() {
		return this.facldFaclId;
	}

	public void setFacldFaclId(String facldFaclId) {
		this.facldFaclId = facldFaclId;
	}

	public Integer getFacldYear() {
		return this.facldYear;
	}

	public void setFacldYear(Integer facldYear) {
		this.facldYear = facldYear;
	}

	public Integer getFacldPer() {
		return this.facldPer;
	}

	public void setFacldPer(Integer facldPer) {
		this.facldPer = facldPer;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFacldDetId))
			return false;
		AbstractFacldDetId castOther = (AbstractFacldDetId) other;

		return ((this.getFacldDomain() == castOther.getFacldDomain()) || (this
				.getFacldDomain() != null
				&& castOther.getFacldDomain() != null && this.getFacldDomain()
				.equals(castOther.getFacldDomain())))
				&& ((this.getFacldFaclId() == castOther.getFacldFaclId()) || (this
						.getFacldFaclId() != null
						&& castOther.getFacldFaclId() != null && this
						.getFacldFaclId().equals(castOther.getFacldFaclId())))
				&& ((this.getFacldYear() == castOther.getFacldYear()) || (this
						.getFacldYear() != null
						&& castOther.getFacldYear() != null && this
						.getFacldYear().equals(castOther.getFacldYear())))
				&& ((this.getFacldPer() == castOther.getFacldPer()) || (this
						.getFacldPer() != null
						&& castOther.getFacldPer() != null && this
						.getFacldPer().equals(castOther.getFacldPer())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFacldDomain() == null ? 0 : this.getFacldDomain()
						.hashCode());
		result = 37
				* result
				+ (getFacldFaclId() == null ? 0 : this.getFacldFaclId()
						.hashCode());
		result = 37 * result
				+ (getFacldYear() == null ? 0 : this.getFacldYear().hashCode());
		result = 37 * result
				+ (getFacldPer() == null ? 0 : this.getFacldPer().hashCode());
		return result;
	}

}