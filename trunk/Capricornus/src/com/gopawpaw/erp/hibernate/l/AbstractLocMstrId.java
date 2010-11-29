package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLocMstrId entity provides the base persistence definition of the
 * LocMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLocMstrId implements java.io.Serializable {

	// Fields

	private String locDomain;
	private String locSite;
	private String locLoc;

	// Constructors

	/** default constructor */
	public AbstractLocMstrId() {
	}

	/** minimal constructor */
	public AbstractLocMstrId(String locDomain) {
		this.locDomain = locDomain;
	}

	/** full constructor */
	public AbstractLocMstrId(String locDomain, String locSite, String locLoc) {
		this.locDomain = locDomain;
		this.locSite = locSite;
		this.locLoc = locLoc;
	}

	// Property accessors

	public String getLocDomain() {
		return this.locDomain;
	}

	public void setLocDomain(String locDomain) {
		this.locDomain = locDomain;
	}

	public String getLocSite() {
		return this.locSite;
	}

	public void setLocSite(String locSite) {
		this.locSite = locSite;
	}

	public String getLocLoc() {
		return this.locLoc;
	}

	public void setLocLoc(String locLoc) {
		this.locLoc = locLoc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLocMstrId))
			return false;
		AbstractLocMstrId castOther = (AbstractLocMstrId) other;

		return ((this.getLocDomain() == castOther.getLocDomain()) || (this
				.getLocDomain() != null
				&& castOther.getLocDomain() != null && this.getLocDomain()
				.equals(castOther.getLocDomain())))
				&& ((this.getLocSite() == castOther.getLocSite()) || (this
						.getLocSite() != null
						&& castOther.getLocSite() != null && this.getLocSite()
						.equals(castOther.getLocSite())))
				&& ((this.getLocLoc() == castOther.getLocLoc()) || (this
						.getLocLoc() != null
						&& castOther.getLocLoc() != null && this.getLocLoc()
						.equals(castOther.getLocLoc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLocDomain() == null ? 0 : this.getLocDomain().hashCode());
		result = 37 * result
				+ (getLocSite() == null ? 0 : this.getLocSite().hashCode());
		result = 37 * result
				+ (getLocLoc() == null ? 0 : this.getLocLoc().hashCode());
		return result;
	}

}