package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVerdDetId entity provides the base persistence definition of the
 * VerdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVerdDetId implements java.io.Serializable {

	// Fields

	private String verdDomain;
	private String verdVendor;
	private String verdVendorSource;
	private String verdSite;
	private String verdCategory;

	// Constructors

	/** default constructor */
	public AbstractVerdDetId() {
	}

	/** full constructor */
	public AbstractVerdDetId(String verdDomain, String verdVendor,
			String verdVendorSource, String verdSite, String verdCategory) {
		this.verdDomain = verdDomain;
		this.verdVendor = verdVendor;
		this.verdVendorSource = verdVendorSource;
		this.verdSite = verdSite;
		this.verdCategory = verdCategory;
	}

	// Property accessors

	public String getVerdDomain() {
		return this.verdDomain;
	}

	public void setVerdDomain(String verdDomain) {
		this.verdDomain = verdDomain;
	}

	public String getVerdVendor() {
		return this.verdVendor;
	}

	public void setVerdVendor(String verdVendor) {
		this.verdVendor = verdVendor;
	}

	public String getVerdVendorSource() {
		return this.verdVendorSource;
	}

	public void setVerdVendorSource(String verdVendorSource) {
		this.verdVendorSource = verdVendorSource;
	}

	public String getVerdSite() {
		return this.verdSite;
	}

	public void setVerdSite(String verdSite) {
		this.verdSite = verdSite;
	}

	public String getVerdCategory() {
		return this.verdCategory;
	}

	public void setVerdCategory(String verdCategory) {
		this.verdCategory = verdCategory;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVerdDetId))
			return false;
		AbstractVerdDetId castOther = (AbstractVerdDetId) other;

		return ((this.getVerdDomain() == castOther.getVerdDomain()) || (this
				.getVerdDomain() != null
				&& castOther.getVerdDomain() != null && this.getVerdDomain()
				.equals(castOther.getVerdDomain())))
				&& ((this.getVerdVendor() == castOther.getVerdVendor()) || (this
						.getVerdVendor() != null
						&& castOther.getVerdVendor() != null && this
						.getVerdVendor().equals(castOther.getVerdVendor())))
				&& ((this.getVerdVendorSource() == castOther
						.getVerdVendorSource()) || (this.getVerdVendorSource() != null
						&& castOther.getVerdVendorSource() != null && this
						.getVerdVendorSource().equals(
								castOther.getVerdVendorSource())))
				&& ((this.getVerdSite() == castOther.getVerdSite()) || (this
						.getVerdSite() != null
						&& castOther.getVerdSite() != null && this
						.getVerdSite().equals(castOther.getVerdSite())))
				&& ((this.getVerdCategory() == castOther.getVerdCategory()) || (this
						.getVerdCategory() != null
						&& castOther.getVerdCategory() != null && this
						.getVerdCategory().equals(castOther.getVerdCategory())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getVerdDomain() == null ? 0 : this.getVerdDomain()
						.hashCode());
		result = 37
				* result
				+ (getVerdVendor() == null ? 0 : this.getVerdVendor()
						.hashCode());
		result = 37
				* result
				+ (getVerdVendorSource() == null ? 0 : this
						.getVerdVendorSource().hashCode());
		result = 37 * result
				+ (getVerdSite() == null ? 0 : this.getVerdSite().hashCode());
		result = 37
				* result
				+ (getVerdCategory() == null ? 0 : this.getVerdCategory()
						.hashCode());
		return result;
	}

}