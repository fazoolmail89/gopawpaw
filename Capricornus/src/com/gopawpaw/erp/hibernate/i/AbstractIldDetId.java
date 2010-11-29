package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIldDetId entity provides the base persistence definition of the
 * IldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIldDetId implements java.io.Serializable {

	// Fields

	private String ildDomain;
	private String ildPart;
	private String ildSite;
	private String ildLoc;

	// Constructors

	/** default constructor */
	public AbstractIldDetId() {
	}

	/** minimal constructor */
	public AbstractIldDetId(String ildDomain, String ildPart) {
		this.ildDomain = ildDomain;
		this.ildPart = ildPart;
	}

	/** full constructor */
	public AbstractIldDetId(String ildDomain, String ildPart, String ildSite,
			String ildLoc) {
		this.ildDomain = ildDomain;
		this.ildPart = ildPart;
		this.ildSite = ildSite;
		this.ildLoc = ildLoc;
	}

	// Property accessors

	public String getIldDomain() {
		return this.ildDomain;
	}

	public void setIldDomain(String ildDomain) {
		this.ildDomain = ildDomain;
	}

	public String getIldPart() {
		return this.ildPart;
	}

	public void setIldPart(String ildPart) {
		this.ildPart = ildPart;
	}

	public String getIldSite() {
		return this.ildSite;
	}

	public void setIldSite(String ildSite) {
		this.ildSite = ildSite;
	}

	public String getIldLoc() {
		return this.ildLoc;
	}

	public void setIldLoc(String ildLoc) {
		this.ildLoc = ildLoc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIldDetId))
			return false;
		AbstractIldDetId castOther = (AbstractIldDetId) other;

		return ((this.getIldDomain() == castOther.getIldDomain()) || (this
				.getIldDomain() != null
				&& castOther.getIldDomain() != null && this.getIldDomain()
				.equals(castOther.getIldDomain())))
				&& ((this.getIldPart() == castOther.getIldPart()) || (this
						.getIldPart() != null
						&& castOther.getIldPart() != null && this.getIldPart()
						.equals(castOther.getIldPart())))
				&& ((this.getIldSite() == castOther.getIldSite()) || (this
						.getIldSite() != null
						&& castOther.getIldSite() != null && this.getIldSite()
						.equals(castOther.getIldSite())))
				&& ((this.getIldLoc() == castOther.getIldLoc()) || (this
						.getIldLoc() != null
						&& castOther.getIldLoc() != null && this.getIldLoc()
						.equals(castOther.getIldLoc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIldDomain() == null ? 0 : this.getIldDomain().hashCode());
		result = 37 * result
				+ (getIldPart() == null ? 0 : this.getIldPart().hashCode());
		result = 37 * result
				+ (getIldSite() == null ? 0 : this.getIldSite().hashCode());
		result = 37 * result
				+ (getIldLoc() == null ? 0 : this.getIldLoc().hashCode());
		return result;
	}

}