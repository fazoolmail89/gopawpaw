package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPfdDetId entity provides the base persistence definition of the
 * PfdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPfdDetId implements java.io.Serializable {

	// Fields

	private String pfdDomain;
	private String pfdPart;
	private String pfdSite;

	// Constructors

	/** default constructor */
	public AbstractPfdDetId() {
	}

	/** minimal constructor */
	public AbstractPfdDetId(String pfdDomain) {
		this.pfdDomain = pfdDomain;
	}

	/** full constructor */
	public AbstractPfdDetId(String pfdDomain, String pfdPart, String pfdSite) {
		this.pfdDomain = pfdDomain;
		this.pfdPart = pfdPart;
		this.pfdSite = pfdSite;
	}

	// Property accessors

	public String getPfdDomain() {
		return this.pfdDomain;
	}

	public void setPfdDomain(String pfdDomain) {
		this.pfdDomain = pfdDomain;
	}

	public String getPfdPart() {
		return this.pfdPart;
	}

	public void setPfdPart(String pfdPart) {
		this.pfdPart = pfdPart;
	}

	public String getPfdSite() {
		return this.pfdSite;
	}

	public void setPfdSite(String pfdSite) {
		this.pfdSite = pfdSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPfdDetId))
			return false;
		AbstractPfdDetId castOther = (AbstractPfdDetId) other;

		return ((this.getPfdDomain() == castOther.getPfdDomain()) || (this
				.getPfdDomain() != null
				&& castOther.getPfdDomain() != null && this.getPfdDomain()
				.equals(castOther.getPfdDomain())))
				&& ((this.getPfdPart() == castOther.getPfdPart()) || (this
						.getPfdPart() != null
						&& castOther.getPfdPart() != null && this.getPfdPart()
						.equals(castOther.getPfdPart())))
				&& ((this.getPfdSite() == castOther.getPfdSite()) || (this
						.getPfdSite() != null
						&& castOther.getPfdSite() != null && this.getPfdSite()
						.equals(castOther.getPfdSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPfdDomain() == null ? 0 : this.getPfdDomain().hashCode());
		result = 37 * result
				+ (getPfdPart() == null ? 0 : this.getPfdPart().hashCode());
		result = 37 * result
				+ (getPfdSite() == null ? 0 : this.getPfdSite().hashCode());
		return result;
	}

}