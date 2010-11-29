package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFsp1PlnId entity provides the base persistence definition of the
 * Fsp1PlnId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFsp1PlnId implements java.io.Serializable {

	// Fields

	private String fsp1Domain;
	private String fsp1PlanId;
	private String fsp1Site;
	private String fsp1Part;
	private Integer fsp1Year;

	// Constructors

	/** default constructor */
	public AbstractFsp1PlnId() {
	}

	/** minimal constructor */
	public AbstractFsp1PlnId(String fsp1Domain) {
		this.fsp1Domain = fsp1Domain;
	}

	/** full constructor */
	public AbstractFsp1PlnId(String fsp1Domain, String fsp1PlanId,
			String fsp1Site, String fsp1Part, Integer fsp1Year) {
		this.fsp1Domain = fsp1Domain;
		this.fsp1PlanId = fsp1PlanId;
		this.fsp1Site = fsp1Site;
		this.fsp1Part = fsp1Part;
		this.fsp1Year = fsp1Year;
	}

	// Property accessors

	public String getFsp1Domain() {
		return this.fsp1Domain;
	}

	public void setFsp1Domain(String fsp1Domain) {
		this.fsp1Domain = fsp1Domain;
	}

	public String getFsp1PlanId() {
		return this.fsp1PlanId;
	}

	public void setFsp1PlanId(String fsp1PlanId) {
		this.fsp1PlanId = fsp1PlanId;
	}

	public String getFsp1Site() {
		return this.fsp1Site;
	}

	public void setFsp1Site(String fsp1Site) {
		this.fsp1Site = fsp1Site;
	}

	public String getFsp1Part() {
		return this.fsp1Part;
	}

	public void setFsp1Part(String fsp1Part) {
		this.fsp1Part = fsp1Part;
	}

	public Integer getFsp1Year() {
		return this.fsp1Year;
	}

	public void setFsp1Year(Integer fsp1Year) {
		this.fsp1Year = fsp1Year;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFsp1PlnId))
			return false;
		AbstractFsp1PlnId castOther = (AbstractFsp1PlnId) other;

		return ((this.getFsp1Domain() == castOther.getFsp1Domain()) || (this
				.getFsp1Domain() != null
				&& castOther.getFsp1Domain() != null && this.getFsp1Domain()
				.equals(castOther.getFsp1Domain())))
				&& ((this.getFsp1PlanId() == castOther.getFsp1PlanId()) || (this
						.getFsp1PlanId() != null
						&& castOther.getFsp1PlanId() != null && this
						.getFsp1PlanId().equals(castOther.getFsp1PlanId())))
				&& ((this.getFsp1Site() == castOther.getFsp1Site()) || (this
						.getFsp1Site() != null
						&& castOther.getFsp1Site() != null && this
						.getFsp1Site().equals(castOther.getFsp1Site())))
				&& ((this.getFsp1Part() == castOther.getFsp1Part()) || (this
						.getFsp1Part() != null
						&& castOther.getFsp1Part() != null && this
						.getFsp1Part().equals(castOther.getFsp1Part())))
				&& ((this.getFsp1Year() == castOther.getFsp1Year()) || (this
						.getFsp1Year() != null
						&& castOther.getFsp1Year() != null && this
						.getFsp1Year().equals(castOther.getFsp1Year())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFsp1Domain() == null ? 0 : this.getFsp1Domain()
						.hashCode());
		result = 37
				* result
				+ (getFsp1PlanId() == null ? 0 : this.getFsp1PlanId()
						.hashCode());
		result = 37 * result
				+ (getFsp1Site() == null ? 0 : this.getFsp1Site().hashCode());
		result = 37 * result
				+ (getFsp1Part() == null ? 0 : this.getFsp1Part().hashCode());
		result = 37 * result
				+ (getFsp1Year() == null ? 0 : this.getFsp1Year().hashCode());
		return result;
	}

}