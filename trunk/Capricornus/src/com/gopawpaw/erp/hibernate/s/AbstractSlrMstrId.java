package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSlrMstrId entity provides the base persistence definition of the
 * SlrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSlrMstrId implements java.io.Serializable {

	// Fields

	private String slrDomain;
	private String slrInventorySite;

	// Constructors

	/** default constructor */
	public AbstractSlrMstrId() {
	}

	/** full constructor */
	public AbstractSlrMstrId(String slrDomain, String slrInventorySite) {
		this.slrDomain = slrDomain;
		this.slrInventorySite = slrInventorySite;
	}

	// Property accessors

	public String getSlrDomain() {
		return this.slrDomain;
	}

	public void setSlrDomain(String slrDomain) {
		this.slrDomain = slrDomain;
	}

	public String getSlrInventorySite() {
		return this.slrInventorySite;
	}

	public void setSlrInventorySite(String slrInventorySite) {
		this.slrInventorySite = slrInventorySite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSlrMstrId))
			return false;
		AbstractSlrMstrId castOther = (AbstractSlrMstrId) other;

		return ((this.getSlrDomain() == castOther.getSlrDomain()) || (this
				.getSlrDomain() != null
				&& castOther.getSlrDomain() != null && this.getSlrDomain()
				.equals(castOther.getSlrDomain())))
				&& ((this.getSlrInventorySite() == castOther
						.getSlrInventorySite()) || (this.getSlrInventorySite() != null
						&& castOther.getSlrInventorySite() != null && this
						.getSlrInventorySite().equals(
								castOther.getSlrInventorySite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSlrDomain() == null ? 0 : this.getSlrDomain().hashCode());
		result = 37
				* result
				+ (getSlrInventorySite() == null ? 0 : this
						.getSlrInventorySite().hashCode());
		return result;
	}

}