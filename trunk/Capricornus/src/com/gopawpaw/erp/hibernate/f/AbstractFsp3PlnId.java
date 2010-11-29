package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFsp3PlnId entity provides the base persistence definition of the
 * Fsp3PlnId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFsp3PlnId implements java.io.Serializable {

	// Fields

	private String fsp3Domain;
	private String fsp3PlanId;
	private String fsp3Site;
	private String fsp3Part;
	private Integer fsp3Year;

	// Constructors

	/** default constructor */
	public AbstractFsp3PlnId() {
	}

	/** minimal constructor */
	public AbstractFsp3PlnId(String fsp3Domain) {
		this.fsp3Domain = fsp3Domain;
	}

	/** full constructor */
	public AbstractFsp3PlnId(String fsp3Domain, String fsp3PlanId,
			String fsp3Site, String fsp3Part, Integer fsp3Year) {
		this.fsp3Domain = fsp3Domain;
		this.fsp3PlanId = fsp3PlanId;
		this.fsp3Site = fsp3Site;
		this.fsp3Part = fsp3Part;
		this.fsp3Year = fsp3Year;
	}

	// Property accessors

	public String getFsp3Domain() {
		return this.fsp3Domain;
	}

	public void setFsp3Domain(String fsp3Domain) {
		this.fsp3Domain = fsp3Domain;
	}

	public String getFsp3PlanId() {
		return this.fsp3PlanId;
	}

	public void setFsp3PlanId(String fsp3PlanId) {
		this.fsp3PlanId = fsp3PlanId;
	}

	public String getFsp3Site() {
		return this.fsp3Site;
	}

	public void setFsp3Site(String fsp3Site) {
		this.fsp3Site = fsp3Site;
	}

	public String getFsp3Part() {
		return this.fsp3Part;
	}

	public void setFsp3Part(String fsp3Part) {
		this.fsp3Part = fsp3Part;
	}

	public Integer getFsp3Year() {
		return this.fsp3Year;
	}

	public void setFsp3Year(Integer fsp3Year) {
		this.fsp3Year = fsp3Year;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFsp3PlnId))
			return false;
		AbstractFsp3PlnId castOther = (AbstractFsp3PlnId) other;

		return ((this.getFsp3Domain() == castOther.getFsp3Domain()) || (this
				.getFsp3Domain() != null
				&& castOther.getFsp3Domain() != null && this.getFsp3Domain()
				.equals(castOther.getFsp3Domain())))
				&& ((this.getFsp3PlanId() == castOther.getFsp3PlanId()) || (this
						.getFsp3PlanId() != null
						&& castOther.getFsp3PlanId() != null && this
						.getFsp3PlanId().equals(castOther.getFsp3PlanId())))
				&& ((this.getFsp3Site() == castOther.getFsp3Site()) || (this
						.getFsp3Site() != null
						&& castOther.getFsp3Site() != null && this
						.getFsp3Site().equals(castOther.getFsp3Site())))
				&& ((this.getFsp3Part() == castOther.getFsp3Part()) || (this
						.getFsp3Part() != null
						&& castOther.getFsp3Part() != null && this
						.getFsp3Part().equals(castOther.getFsp3Part())))
				&& ((this.getFsp3Year() == castOther.getFsp3Year()) || (this
						.getFsp3Year() != null
						&& castOther.getFsp3Year() != null && this
						.getFsp3Year().equals(castOther.getFsp3Year())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFsp3Domain() == null ? 0 : this.getFsp3Domain()
						.hashCode());
		result = 37
				* result
				+ (getFsp3PlanId() == null ? 0 : this.getFsp3PlanId()
						.hashCode());
		result = 37 * result
				+ (getFsp3Site() == null ? 0 : this.getFsp3Site().hashCode());
		result = 37 * result
				+ (getFsp3Part() == null ? 0 : this.getFsp3Part().hashCode());
		result = 37 * result
				+ (getFsp3Year() == null ? 0 : this.getFsp3Year().hashCode());
		return result;
	}

}