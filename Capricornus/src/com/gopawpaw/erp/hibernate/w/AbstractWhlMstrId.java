package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWhlMstrId entity provides the base persistence definition of the
 * WhlMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWhlMstrId implements java.io.Serializable {

	// Fields

	private String whlDomain;
	private String whlSite;
	private String whlLoc;

	// Constructors

	/** default constructor */
	public AbstractWhlMstrId() {
	}

	/** minimal constructor */
	public AbstractWhlMstrId(String whlDomain) {
		this.whlDomain = whlDomain;
	}

	/** full constructor */
	public AbstractWhlMstrId(String whlDomain, String whlSite, String whlLoc) {
		this.whlDomain = whlDomain;
		this.whlSite = whlSite;
		this.whlLoc = whlLoc;
	}

	// Property accessors

	public String getWhlDomain() {
		return this.whlDomain;
	}

	public void setWhlDomain(String whlDomain) {
		this.whlDomain = whlDomain;
	}

	public String getWhlSite() {
		return this.whlSite;
	}

	public void setWhlSite(String whlSite) {
		this.whlSite = whlSite;
	}

	public String getWhlLoc() {
		return this.whlLoc;
	}

	public void setWhlLoc(String whlLoc) {
		this.whlLoc = whlLoc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWhlMstrId))
			return false;
		AbstractWhlMstrId castOther = (AbstractWhlMstrId) other;

		return ((this.getWhlDomain() == castOther.getWhlDomain()) || (this
				.getWhlDomain() != null
				&& castOther.getWhlDomain() != null && this.getWhlDomain()
				.equals(castOther.getWhlDomain())))
				&& ((this.getWhlSite() == castOther.getWhlSite()) || (this
						.getWhlSite() != null
						&& castOther.getWhlSite() != null && this.getWhlSite()
						.equals(castOther.getWhlSite())))
				&& ((this.getWhlLoc() == castOther.getWhlLoc()) || (this
						.getWhlLoc() != null
						&& castOther.getWhlLoc() != null && this.getWhlLoc()
						.equals(castOther.getWhlLoc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWhlDomain() == null ? 0 : this.getWhlDomain().hashCode());
		result = 37 * result
				+ (getWhlSite() == null ? 0 : this.getWhlSite().hashCode());
		result = 37 * result
				+ (getWhlLoc() == null ? 0 : this.getWhlLoc().hashCode());
		return result;
	}

}