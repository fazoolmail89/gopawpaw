package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFslpPlnId entity provides the base persistence definition of the
 * FslpPlnId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFslpPlnId implements java.io.Serializable {

	// Fields

	private String fslpDomain;
	private String fslpPlanId;
	private String fslpPart;
	private String fslpSite;
	private String fslpLine;
	private Integer fslpYear;

	// Constructors

	/** default constructor */
	public AbstractFslpPlnId() {
	}

	/** minimal constructor */
	public AbstractFslpPlnId(String fslpDomain) {
		this.fslpDomain = fslpDomain;
	}

	/** full constructor */
	public AbstractFslpPlnId(String fslpDomain, String fslpPlanId,
			String fslpPart, String fslpSite, String fslpLine, Integer fslpYear) {
		this.fslpDomain = fslpDomain;
		this.fslpPlanId = fslpPlanId;
		this.fslpPart = fslpPart;
		this.fslpSite = fslpSite;
		this.fslpLine = fslpLine;
		this.fslpYear = fslpYear;
	}

	// Property accessors

	public String getFslpDomain() {
		return this.fslpDomain;
	}

	public void setFslpDomain(String fslpDomain) {
		this.fslpDomain = fslpDomain;
	}

	public String getFslpPlanId() {
		return this.fslpPlanId;
	}

	public void setFslpPlanId(String fslpPlanId) {
		this.fslpPlanId = fslpPlanId;
	}

	public String getFslpPart() {
		return this.fslpPart;
	}

	public void setFslpPart(String fslpPart) {
		this.fslpPart = fslpPart;
	}

	public String getFslpSite() {
		return this.fslpSite;
	}

	public void setFslpSite(String fslpSite) {
		this.fslpSite = fslpSite;
	}

	public String getFslpLine() {
		return this.fslpLine;
	}

	public void setFslpLine(String fslpLine) {
		this.fslpLine = fslpLine;
	}

	public Integer getFslpYear() {
		return this.fslpYear;
	}

	public void setFslpYear(Integer fslpYear) {
		this.fslpYear = fslpYear;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFslpPlnId))
			return false;
		AbstractFslpPlnId castOther = (AbstractFslpPlnId) other;

		return ((this.getFslpDomain() == castOther.getFslpDomain()) || (this
				.getFslpDomain() != null
				&& castOther.getFslpDomain() != null && this.getFslpDomain()
				.equals(castOther.getFslpDomain())))
				&& ((this.getFslpPlanId() == castOther.getFslpPlanId()) || (this
						.getFslpPlanId() != null
						&& castOther.getFslpPlanId() != null && this
						.getFslpPlanId().equals(castOther.getFslpPlanId())))
				&& ((this.getFslpPart() == castOther.getFslpPart()) || (this
						.getFslpPart() != null
						&& castOther.getFslpPart() != null && this
						.getFslpPart().equals(castOther.getFslpPart())))
				&& ((this.getFslpSite() == castOther.getFslpSite()) || (this
						.getFslpSite() != null
						&& castOther.getFslpSite() != null && this
						.getFslpSite().equals(castOther.getFslpSite())))
				&& ((this.getFslpLine() == castOther.getFslpLine()) || (this
						.getFslpLine() != null
						&& castOther.getFslpLine() != null && this
						.getFslpLine().equals(castOther.getFslpLine())))
				&& ((this.getFslpYear() == castOther.getFslpYear()) || (this
						.getFslpYear() != null
						&& castOther.getFslpYear() != null && this
						.getFslpYear().equals(castOther.getFslpYear())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFslpDomain() == null ? 0 : this.getFslpDomain()
						.hashCode());
		result = 37
				* result
				+ (getFslpPlanId() == null ? 0 : this.getFslpPlanId()
						.hashCode());
		result = 37 * result
				+ (getFslpPart() == null ? 0 : this.getFslpPart().hashCode());
		result = 37 * result
				+ (getFslpSite() == null ? 0 : this.getFslpSite().hashCode());
		result = 37 * result
				+ (getFslpLine() == null ? 0 : this.getFslpLine().hashCode());
		result = 37 * result
				+ (getFslpYear() == null ? 0 : this.getFslpYear().hashCode());
		return result;
	}

}