package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSlrdDetId entity provides the base persistence definition of the
 * SlrdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSlrdDetId implements java.io.Serializable {

	// Fields

	private String slrdDomain;
	private String slrdInventorySite;
	private String slrdAttribCode;

	// Constructors

	/** default constructor */
	public AbstractSlrdDetId() {
	}

	/** full constructor */
	public AbstractSlrdDetId(String slrdDomain, String slrdInventorySite,
			String slrdAttribCode) {
		this.slrdDomain = slrdDomain;
		this.slrdInventorySite = slrdInventorySite;
		this.slrdAttribCode = slrdAttribCode;
	}

	// Property accessors

	public String getSlrdDomain() {
		return this.slrdDomain;
	}

	public void setSlrdDomain(String slrdDomain) {
		this.slrdDomain = slrdDomain;
	}

	public String getSlrdInventorySite() {
		return this.slrdInventorySite;
	}

	public void setSlrdInventorySite(String slrdInventorySite) {
		this.slrdInventorySite = slrdInventorySite;
	}

	public String getSlrdAttribCode() {
		return this.slrdAttribCode;
	}

	public void setSlrdAttribCode(String slrdAttribCode) {
		this.slrdAttribCode = slrdAttribCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSlrdDetId))
			return false;
		AbstractSlrdDetId castOther = (AbstractSlrdDetId) other;

		return ((this.getSlrdDomain() == castOther.getSlrdDomain()) || (this
				.getSlrdDomain() != null
				&& castOther.getSlrdDomain() != null && this.getSlrdDomain()
				.equals(castOther.getSlrdDomain())))
				&& ((this.getSlrdInventorySite() == castOther
						.getSlrdInventorySite()) || (this
						.getSlrdInventorySite() != null
						&& castOther.getSlrdInventorySite() != null && this
						.getSlrdInventorySite().equals(
								castOther.getSlrdInventorySite())))
				&& ((this.getSlrdAttribCode() == castOther.getSlrdAttribCode()) || (this
						.getSlrdAttribCode() != null
						&& castOther.getSlrdAttribCode() != null && this
						.getSlrdAttribCode().equals(
								castOther.getSlrdAttribCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSlrdDomain() == null ? 0 : this.getSlrdDomain()
						.hashCode());
		result = 37
				* result
				+ (getSlrdInventorySite() == null ? 0 : this
						.getSlrdInventorySite().hashCode());
		result = 37
				* result
				+ (getSlrdAttribCode() == null ? 0 : this.getSlrdAttribCode()
						.hashCode());
		return result;
	}

}