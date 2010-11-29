package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCssiDetId entity provides the base persistence definition of the
 * CssiDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCssiDetId implements java.io.Serializable {

	// Fields

	private String cssiDomain;
	private String cssiSite;
	private String cssiSet;
	private Boolean cssiActive;

	// Constructors

	/** default constructor */
	public AbstractCssiDetId() {
	}

	/** minimal constructor */
	public AbstractCssiDetId(String cssiDomain) {
		this.cssiDomain = cssiDomain;
	}

	/** full constructor */
	public AbstractCssiDetId(String cssiDomain, String cssiSite,
			String cssiSet, Boolean cssiActive) {
		this.cssiDomain = cssiDomain;
		this.cssiSite = cssiSite;
		this.cssiSet = cssiSet;
		this.cssiActive = cssiActive;
	}

	// Property accessors

	public String getCssiDomain() {
		return this.cssiDomain;
	}

	public void setCssiDomain(String cssiDomain) {
		this.cssiDomain = cssiDomain;
	}

	public String getCssiSite() {
		return this.cssiSite;
	}

	public void setCssiSite(String cssiSite) {
		this.cssiSite = cssiSite;
	}

	public String getCssiSet() {
		return this.cssiSet;
	}

	public void setCssiSet(String cssiSet) {
		this.cssiSet = cssiSet;
	}

	public Boolean getCssiActive() {
		return this.cssiActive;
	}

	public void setCssiActive(Boolean cssiActive) {
		this.cssiActive = cssiActive;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCssiDetId))
			return false;
		AbstractCssiDetId castOther = (AbstractCssiDetId) other;

		return ((this.getCssiDomain() == castOther.getCssiDomain()) || (this
				.getCssiDomain() != null
				&& castOther.getCssiDomain() != null && this.getCssiDomain()
				.equals(castOther.getCssiDomain())))
				&& ((this.getCssiSite() == castOther.getCssiSite()) || (this
						.getCssiSite() != null
						&& castOther.getCssiSite() != null && this
						.getCssiSite().equals(castOther.getCssiSite())))
				&& ((this.getCssiSet() == castOther.getCssiSet()) || (this
						.getCssiSet() != null
						&& castOther.getCssiSet() != null && this.getCssiSet()
						.equals(castOther.getCssiSet())))
				&& ((this.getCssiActive() == castOther.getCssiActive()) || (this
						.getCssiActive() != null
						&& castOther.getCssiActive() != null && this
						.getCssiActive().equals(castOther.getCssiActive())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCssiDomain() == null ? 0 : this.getCssiDomain()
						.hashCode());
		result = 37 * result
				+ (getCssiSite() == null ? 0 : this.getCssiSite().hashCode());
		result = 37 * result
				+ (getCssiSet() == null ? 0 : this.getCssiSet().hashCode());
		result = 37
				* result
				+ (getCssiActive() == null ? 0 : this.getCssiActive()
						.hashCode());
		return result;
	}

}