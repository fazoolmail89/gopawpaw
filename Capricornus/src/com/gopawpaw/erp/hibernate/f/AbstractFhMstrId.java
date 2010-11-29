package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFhMstrId entity provides the base persistence definition of the
 * FhMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFhMstrId implements java.io.Serializable {

	// Fields

	private String fhDomain;
	private String fhParent;
	private String fhComp;
	private String fhSite;
	private Integer fhYear;

	// Constructors

	/** default constructor */
	public AbstractFhMstrId() {
	}

	/** minimal constructor */
	public AbstractFhMstrId(String fhDomain) {
		this.fhDomain = fhDomain;
	}

	/** full constructor */
	public AbstractFhMstrId(String fhDomain, String fhParent, String fhComp,
			String fhSite, Integer fhYear) {
		this.fhDomain = fhDomain;
		this.fhParent = fhParent;
		this.fhComp = fhComp;
		this.fhSite = fhSite;
		this.fhYear = fhYear;
	}

	// Property accessors

	public String getFhDomain() {
		return this.fhDomain;
	}

	public void setFhDomain(String fhDomain) {
		this.fhDomain = fhDomain;
	}

	public String getFhParent() {
		return this.fhParent;
	}

	public void setFhParent(String fhParent) {
		this.fhParent = fhParent;
	}

	public String getFhComp() {
		return this.fhComp;
	}

	public void setFhComp(String fhComp) {
		this.fhComp = fhComp;
	}

	public String getFhSite() {
		return this.fhSite;
	}

	public void setFhSite(String fhSite) {
		this.fhSite = fhSite;
	}

	public Integer getFhYear() {
		return this.fhYear;
	}

	public void setFhYear(Integer fhYear) {
		this.fhYear = fhYear;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFhMstrId))
			return false;
		AbstractFhMstrId castOther = (AbstractFhMstrId) other;

		return ((this.getFhDomain() == castOther.getFhDomain()) || (this
				.getFhDomain() != null
				&& castOther.getFhDomain() != null && this.getFhDomain()
				.equals(castOther.getFhDomain())))
				&& ((this.getFhParent() == castOther.getFhParent()) || (this
						.getFhParent() != null
						&& castOther.getFhParent() != null && this
						.getFhParent().equals(castOther.getFhParent())))
				&& ((this.getFhComp() == castOther.getFhComp()) || (this
						.getFhComp() != null
						&& castOther.getFhComp() != null && this.getFhComp()
						.equals(castOther.getFhComp())))
				&& ((this.getFhSite() == castOther.getFhSite()) || (this
						.getFhSite() != null
						&& castOther.getFhSite() != null && this.getFhSite()
						.equals(castOther.getFhSite())))
				&& ((this.getFhYear() == castOther.getFhYear()) || (this
						.getFhYear() != null
						&& castOther.getFhYear() != null && this.getFhYear()
						.equals(castOther.getFhYear())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFhDomain() == null ? 0 : this.getFhDomain().hashCode());
		result = 37 * result
				+ (getFhParent() == null ? 0 : this.getFhParent().hashCode());
		result = 37 * result
				+ (getFhComp() == null ? 0 : this.getFhComp().hashCode());
		result = 37 * result
				+ (getFhSite() == null ? 0 : this.getFhSite().hashCode());
		result = 37 * result
				+ (getFhYear() == null ? 0 : this.getFhYear().hashCode());
		return result;
	}

}