package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDeltMstrId entity provides the base persistence definition of the
 * DeltMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDeltMstrId implements java.io.Serializable {

	// Fields

	private String deltDomain;
	private String deltUseCategory;
	private String deltSite;
	private String deltCtry;
	private String deltState;
	private String deltCity;
	private String deltMethod;

	// Constructors

	/** default constructor */
	public AbstractDeltMstrId() {
	}

	/** full constructor */
	public AbstractDeltMstrId(String deltDomain, String deltUseCategory,
			String deltSite, String deltCtry, String deltState,
			String deltCity, String deltMethod) {
		this.deltDomain = deltDomain;
		this.deltUseCategory = deltUseCategory;
		this.deltSite = deltSite;
		this.deltCtry = deltCtry;
		this.deltState = deltState;
		this.deltCity = deltCity;
		this.deltMethod = deltMethod;
	}

	// Property accessors

	public String getDeltDomain() {
		return this.deltDomain;
	}

	public void setDeltDomain(String deltDomain) {
		this.deltDomain = deltDomain;
	}

	public String getDeltUseCategory() {
		return this.deltUseCategory;
	}

	public void setDeltUseCategory(String deltUseCategory) {
		this.deltUseCategory = deltUseCategory;
	}

	public String getDeltSite() {
		return this.deltSite;
	}

	public void setDeltSite(String deltSite) {
		this.deltSite = deltSite;
	}

	public String getDeltCtry() {
		return this.deltCtry;
	}

	public void setDeltCtry(String deltCtry) {
		this.deltCtry = deltCtry;
	}

	public String getDeltState() {
		return this.deltState;
	}

	public void setDeltState(String deltState) {
		this.deltState = deltState;
	}

	public String getDeltCity() {
		return this.deltCity;
	}

	public void setDeltCity(String deltCity) {
		this.deltCity = deltCity;
	}

	public String getDeltMethod() {
		return this.deltMethod;
	}

	public void setDeltMethod(String deltMethod) {
		this.deltMethod = deltMethod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDeltMstrId))
			return false;
		AbstractDeltMstrId castOther = (AbstractDeltMstrId) other;

		return ((this.getDeltDomain() == castOther.getDeltDomain()) || (this
				.getDeltDomain() != null
				&& castOther.getDeltDomain() != null && this.getDeltDomain()
				.equals(castOther.getDeltDomain())))
				&& ((this.getDeltUseCategory() == castOther
						.getDeltUseCategory()) || (this.getDeltUseCategory() != null
						&& castOther.getDeltUseCategory() != null && this
						.getDeltUseCategory().equals(
								castOther.getDeltUseCategory())))
				&& ((this.getDeltSite() == castOther.getDeltSite()) || (this
						.getDeltSite() != null
						&& castOther.getDeltSite() != null && this
						.getDeltSite().equals(castOther.getDeltSite())))
				&& ((this.getDeltCtry() == castOther.getDeltCtry()) || (this
						.getDeltCtry() != null
						&& castOther.getDeltCtry() != null && this
						.getDeltCtry().equals(castOther.getDeltCtry())))
				&& ((this.getDeltState() == castOther.getDeltState()) || (this
						.getDeltState() != null
						&& castOther.getDeltState() != null && this
						.getDeltState().equals(castOther.getDeltState())))
				&& ((this.getDeltCity() == castOther.getDeltCity()) || (this
						.getDeltCity() != null
						&& castOther.getDeltCity() != null && this
						.getDeltCity().equals(castOther.getDeltCity())))
				&& ((this.getDeltMethod() == castOther.getDeltMethod()) || (this
						.getDeltMethod() != null
						&& castOther.getDeltMethod() != null && this
						.getDeltMethod().equals(castOther.getDeltMethod())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDeltDomain() == null ? 0 : this.getDeltDomain()
						.hashCode());
		result = 37
				* result
				+ (getDeltUseCategory() == null ? 0 : this.getDeltUseCategory()
						.hashCode());
		result = 37 * result
				+ (getDeltSite() == null ? 0 : this.getDeltSite().hashCode());
		result = 37 * result
				+ (getDeltCtry() == null ? 0 : this.getDeltCtry().hashCode());
		result = 37 * result
				+ (getDeltState() == null ? 0 : this.getDeltState().hashCode());
		result = 37 * result
				+ (getDeltCity() == null ? 0 : this.getDeltCity().hashCode());
		result = 37
				* result
				+ (getDeltMethod() == null ? 0 : this.getDeltMethod()
						.hashCode());
		return result;
	}

}