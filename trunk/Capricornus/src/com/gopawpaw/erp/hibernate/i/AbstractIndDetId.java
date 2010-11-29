package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIndDetId entity provides the base persistence definition of the
 * IndDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIndDetId implements java.io.Serializable {

	// Fields

	private String indDomain;
	private String indSite;
	private String indNbr;
	private String indPart;

	// Constructors

	/** default constructor */
	public AbstractIndDetId() {
	}

	/** minimal constructor */
	public AbstractIndDetId(String indDomain) {
		this.indDomain = indDomain;
	}

	/** full constructor */
	public AbstractIndDetId(String indDomain, String indSite, String indNbr,
			String indPart) {
		this.indDomain = indDomain;
		this.indSite = indSite;
		this.indNbr = indNbr;
		this.indPart = indPart;
	}

	// Property accessors

	public String getIndDomain() {
		return this.indDomain;
	}

	public void setIndDomain(String indDomain) {
		this.indDomain = indDomain;
	}

	public String getIndSite() {
		return this.indSite;
	}

	public void setIndSite(String indSite) {
		this.indSite = indSite;
	}

	public String getIndNbr() {
		return this.indNbr;
	}

	public void setIndNbr(String indNbr) {
		this.indNbr = indNbr;
	}

	public String getIndPart() {
		return this.indPart;
	}

	public void setIndPart(String indPart) {
		this.indPart = indPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIndDetId))
			return false;
		AbstractIndDetId castOther = (AbstractIndDetId) other;

		return ((this.getIndDomain() == castOther.getIndDomain()) || (this
				.getIndDomain() != null
				&& castOther.getIndDomain() != null && this.getIndDomain()
				.equals(castOther.getIndDomain())))
				&& ((this.getIndSite() == castOther.getIndSite()) || (this
						.getIndSite() != null
						&& castOther.getIndSite() != null && this.getIndSite()
						.equals(castOther.getIndSite())))
				&& ((this.getIndNbr() == castOther.getIndNbr()) || (this
						.getIndNbr() != null
						&& castOther.getIndNbr() != null && this.getIndNbr()
						.equals(castOther.getIndNbr())))
				&& ((this.getIndPart() == castOther.getIndPart()) || (this
						.getIndPart() != null
						&& castOther.getIndPart() != null && this.getIndPart()
						.equals(castOther.getIndPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIndDomain() == null ? 0 : this.getIndDomain().hashCode());
		result = 37 * result
				+ (getIndSite() == null ? 0 : this.getIndSite().hashCode());
		result = 37 * result
				+ (getIndNbr() == null ? 0 : this.getIndNbr().hashCode());
		result = 37 * result
				+ (getIndPart() == null ? 0 : this.getIndPart().hashCode());
		return result;
	}

}