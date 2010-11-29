package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFlffMstrId entity provides the base persistence definition of the
 * FlffMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlffMstrId implements java.io.Serializable {

	// Fields

	private String flffDomain;
	private String flffSite;
	private String flffProductionLine;
	private String flffScheduleCode;
	private Integer flffPeriodNumber;

	// Constructors

	/** default constructor */
	public AbstractFlffMstrId() {
	}

	/** full constructor */
	public AbstractFlffMstrId(String flffDomain, String flffSite,
			String flffProductionLine, String flffScheduleCode,
			Integer flffPeriodNumber) {
		this.flffDomain = flffDomain;
		this.flffSite = flffSite;
		this.flffProductionLine = flffProductionLine;
		this.flffScheduleCode = flffScheduleCode;
		this.flffPeriodNumber = flffPeriodNumber;
	}

	// Property accessors

	public String getFlffDomain() {
		return this.flffDomain;
	}

	public void setFlffDomain(String flffDomain) {
		this.flffDomain = flffDomain;
	}

	public String getFlffSite() {
		return this.flffSite;
	}

	public void setFlffSite(String flffSite) {
		this.flffSite = flffSite;
	}

	public String getFlffProductionLine() {
		return this.flffProductionLine;
	}

	public void setFlffProductionLine(String flffProductionLine) {
		this.flffProductionLine = flffProductionLine;
	}

	public String getFlffScheduleCode() {
		return this.flffScheduleCode;
	}

	public void setFlffScheduleCode(String flffScheduleCode) {
		this.flffScheduleCode = flffScheduleCode;
	}

	public Integer getFlffPeriodNumber() {
		return this.flffPeriodNumber;
	}

	public void setFlffPeriodNumber(Integer flffPeriodNumber) {
		this.flffPeriodNumber = flffPeriodNumber;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFlffMstrId))
			return false;
		AbstractFlffMstrId castOther = (AbstractFlffMstrId) other;

		return ((this.getFlffDomain() == castOther.getFlffDomain()) || (this
				.getFlffDomain() != null
				&& castOther.getFlffDomain() != null && this.getFlffDomain()
				.equals(castOther.getFlffDomain())))
				&& ((this.getFlffSite() == castOther.getFlffSite()) || (this
						.getFlffSite() != null
						&& castOther.getFlffSite() != null && this
						.getFlffSite().equals(castOther.getFlffSite())))
				&& ((this.getFlffProductionLine() == castOther
						.getFlffProductionLine()) || (this
						.getFlffProductionLine() != null
						&& castOther.getFlffProductionLine() != null && this
						.getFlffProductionLine().equals(
								castOther.getFlffProductionLine())))
				&& ((this.getFlffScheduleCode() == castOther
						.getFlffScheduleCode()) || (this.getFlffScheduleCode() != null
						&& castOther.getFlffScheduleCode() != null && this
						.getFlffScheduleCode().equals(
								castOther.getFlffScheduleCode())))
				&& ((this.getFlffPeriodNumber() == castOther
						.getFlffPeriodNumber()) || (this.getFlffPeriodNumber() != null
						&& castOther.getFlffPeriodNumber() != null && this
						.getFlffPeriodNumber().equals(
								castOther.getFlffPeriodNumber())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFlffDomain() == null ? 0 : this.getFlffDomain()
						.hashCode());
		result = 37 * result
				+ (getFlffSite() == null ? 0 : this.getFlffSite().hashCode());
		result = 37
				* result
				+ (getFlffProductionLine() == null ? 0 : this
						.getFlffProductionLine().hashCode());
		result = 37
				* result
				+ (getFlffScheduleCode() == null ? 0 : this
						.getFlffScheduleCode().hashCode());
		result = 37
				* result
				+ (getFlffPeriodNumber() == null ? 0 : this
						.getFlffPeriodNumber().hashCode());
		return result;
	}

}