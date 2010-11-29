package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFlpPlanId entity provides the base persistence definition of the
 * FlpPlanId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlpPlanId implements java.io.Serializable {

	// Fields

	private String flpDomain;
	private String flpPart;
	private String flpSite;
	private String flpLine;
	private Integer flpYear;

	// Constructors

	/** default constructor */
	public AbstractFlpPlanId() {
	}

	/** minimal constructor */
	public AbstractFlpPlanId(String flpDomain) {
		this.flpDomain = flpDomain;
	}

	/** full constructor */
	public AbstractFlpPlanId(String flpDomain, String flpPart, String flpSite,
			String flpLine, Integer flpYear) {
		this.flpDomain = flpDomain;
		this.flpPart = flpPart;
		this.flpSite = flpSite;
		this.flpLine = flpLine;
		this.flpYear = flpYear;
	}

	// Property accessors

	public String getFlpDomain() {
		return this.flpDomain;
	}

	public void setFlpDomain(String flpDomain) {
		this.flpDomain = flpDomain;
	}

	public String getFlpPart() {
		return this.flpPart;
	}

	public void setFlpPart(String flpPart) {
		this.flpPart = flpPart;
	}

	public String getFlpSite() {
		return this.flpSite;
	}

	public void setFlpSite(String flpSite) {
		this.flpSite = flpSite;
	}

	public String getFlpLine() {
		return this.flpLine;
	}

	public void setFlpLine(String flpLine) {
		this.flpLine = flpLine;
	}

	public Integer getFlpYear() {
		return this.flpYear;
	}

	public void setFlpYear(Integer flpYear) {
		this.flpYear = flpYear;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFlpPlanId))
			return false;
		AbstractFlpPlanId castOther = (AbstractFlpPlanId) other;

		return ((this.getFlpDomain() == castOther.getFlpDomain()) || (this
				.getFlpDomain() != null
				&& castOther.getFlpDomain() != null && this.getFlpDomain()
				.equals(castOther.getFlpDomain())))
				&& ((this.getFlpPart() == castOther.getFlpPart()) || (this
						.getFlpPart() != null
						&& castOther.getFlpPart() != null && this.getFlpPart()
						.equals(castOther.getFlpPart())))
				&& ((this.getFlpSite() == castOther.getFlpSite()) || (this
						.getFlpSite() != null
						&& castOther.getFlpSite() != null && this.getFlpSite()
						.equals(castOther.getFlpSite())))
				&& ((this.getFlpLine() == castOther.getFlpLine()) || (this
						.getFlpLine() != null
						&& castOther.getFlpLine() != null && this.getFlpLine()
						.equals(castOther.getFlpLine())))
				&& ((this.getFlpYear() == castOther.getFlpYear()) || (this
						.getFlpYear() != null
						&& castOther.getFlpYear() != null && this.getFlpYear()
						.equals(castOther.getFlpYear())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFlpDomain() == null ? 0 : this.getFlpDomain().hashCode());
		result = 37 * result
				+ (getFlpPart() == null ? 0 : this.getFlpPart().hashCode());
		result = 37 * result
				+ (getFlpSite() == null ? 0 : this.getFlpSite().hashCode());
		result = 37 * result
				+ (getFlpLine() == null ? 0 : this.getFlpLine().hashCode());
		result = 37 * result
				+ (getFlpYear() == null ? 0 : this.getFlpYear().hashCode());
		return result;
	}

}