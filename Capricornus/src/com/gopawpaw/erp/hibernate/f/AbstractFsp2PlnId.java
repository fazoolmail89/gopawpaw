package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFsp2PlnId entity provides the base persistence definition of the
 * Fsp2PlnId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFsp2PlnId implements java.io.Serializable {

	// Fields

	private String fsp2Domain;
	private String fsp2PlanId;
	private String fsp2Site;
	private String fsp2Part;
	private Integer fsp2Year;

	// Constructors

	/** default constructor */
	public AbstractFsp2PlnId() {
	}

	/** minimal constructor */
	public AbstractFsp2PlnId(String fsp2Domain) {
		this.fsp2Domain = fsp2Domain;
	}

	/** full constructor */
	public AbstractFsp2PlnId(String fsp2Domain, String fsp2PlanId,
			String fsp2Site, String fsp2Part, Integer fsp2Year) {
		this.fsp2Domain = fsp2Domain;
		this.fsp2PlanId = fsp2PlanId;
		this.fsp2Site = fsp2Site;
		this.fsp2Part = fsp2Part;
		this.fsp2Year = fsp2Year;
	}

	// Property accessors

	public String getFsp2Domain() {
		return this.fsp2Domain;
	}

	public void setFsp2Domain(String fsp2Domain) {
		this.fsp2Domain = fsp2Domain;
	}

	public String getFsp2PlanId() {
		return this.fsp2PlanId;
	}

	public void setFsp2PlanId(String fsp2PlanId) {
		this.fsp2PlanId = fsp2PlanId;
	}

	public String getFsp2Site() {
		return this.fsp2Site;
	}

	public void setFsp2Site(String fsp2Site) {
		this.fsp2Site = fsp2Site;
	}

	public String getFsp2Part() {
		return this.fsp2Part;
	}

	public void setFsp2Part(String fsp2Part) {
		this.fsp2Part = fsp2Part;
	}

	public Integer getFsp2Year() {
		return this.fsp2Year;
	}

	public void setFsp2Year(Integer fsp2Year) {
		this.fsp2Year = fsp2Year;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFsp2PlnId))
			return false;
		AbstractFsp2PlnId castOther = (AbstractFsp2PlnId) other;

		return ((this.getFsp2Domain() == castOther.getFsp2Domain()) || (this
				.getFsp2Domain() != null
				&& castOther.getFsp2Domain() != null && this.getFsp2Domain()
				.equals(castOther.getFsp2Domain())))
				&& ((this.getFsp2PlanId() == castOther.getFsp2PlanId()) || (this
						.getFsp2PlanId() != null
						&& castOther.getFsp2PlanId() != null && this
						.getFsp2PlanId().equals(castOther.getFsp2PlanId())))
				&& ((this.getFsp2Site() == castOther.getFsp2Site()) || (this
						.getFsp2Site() != null
						&& castOther.getFsp2Site() != null && this
						.getFsp2Site().equals(castOther.getFsp2Site())))
				&& ((this.getFsp2Part() == castOther.getFsp2Part()) || (this
						.getFsp2Part() != null
						&& castOther.getFsp2Part() != null && this
						.getFsp2Part().equals(castOther.getFsp2Part())))
				&& ((this.getFsp2Year() == castOther.getFsp2Year()) || (this
						.getFsp2Year() != null
						&& castOther.getFsp2Year() != null && this
						.getFsp2Year().equals(castOther.getFsp2Year())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFsp2Domain() == null ? 0 : this.getFsp2Domain()
						.hashCode());
		result = 37
				* result
				+ (getFsp2PlanId() == null ? 0 : this.getFsp2PlanId()
						.hashCode());
		result = 37 * result
				+ (getFsp2Site() == null ? 0 : this.getFsp2Site().hashCode());
		result = 37 * result
				+ (getFsp2Part() == null ? 0 : this.getFsp2Part().hashCode());
		result = 37 * result
				+ (getFsp2Year() == null ? 0 : this.getFsp2Year().hashCode());
		return result;
	}

}