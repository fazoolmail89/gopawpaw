package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFlcrMstrId entity provides the base persistence definition of the
 * FlcrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlcrMstrId implements java.io.Serializable {

	// Fields

	private String flcrDomain;
	private String flcrSite;
	private String flcrProductionLine;
	private String flcrScheduleCode;
	private String flcrTypeCode;
	private String flcrTypeValue;
	private String flcrRateCode;

	// Constructors

	/** default constructor */
	public AbstractFlcrMstrId() {
	}

	/** full constructor */
	public AbstractFlcrMstrId(String flcrDomain, String flcrSite,
			String flcrProductionLine, String flcrScheduleCode,
			String flcrTypeCode, String flcrTypeValue, String flcrRateCode) {
		this.flcrDomain = flcrDomain;
		this.flcrSite = flcrSite;
		this.flcrProductionLine = flcrProductionLine;
		this.flcrScheduleCode = flcrScheduleCode;
		this.flcrTypeCode = flcrTypeCode;
		this.flcrTypeValue = flcrTypeValue;
		this.flcrRateCode = flcrRateCode;
	}

	// Property accessors

	public String getFlcrDomain() {
		return this.flcrDomain;
	}

	public void setFlcrDomain(String flcrDomain) {
		this.flcrDomain = flcrDomain;
	}

	public String getFlcrSite() {
		return this.flcrSite;
	}

	public void setFlcrSite(String flcrSite) {
		this.flcrSite = flcrSite;
	}

	public String getFlcrProductionLine() {
		return this.flcrProductionLine;
	}

	public void setFlcrProductionLine(String flcrProductionLine) {
		this.flcrProductionLine = flcrProductionLine;
	}

	public String getFlcrScheduleCode() {
		return this.flcrScheduleCode;
	}

	public void setFlcrScheduleCode(String flcrScheduleCode) {
		this.flcrScheduleCode = flcrScheduleCode;
	}

	public String getFlcrTypeCode() {
		return this.flcrTypeCode;
	}

	public void setFlcrTypeCode(String flcrTypeCode) {
		this.flcrTypeCode = flcrTypeCode;
	}

	public String getFlcrTypeValue() {
		return this.flcrTypeValue;
	}

	public void setFlcrTypeValue(String flcrTypeValue) {
		this.flcrTypeValue = flcrTypeValue;
	}

	public String getFlcrRateCode() {
		return this.flcrRateCode;
	}

	public void setFlcrRateCode(String flcrRateCode) {
		this.flcrRateCode = flcrRateCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFlcrMstrId))
			return false;
		AbstractFlcrMstrId castOther = (AbstractFlcrMstrId) other;

		return ((this.getFlcrDomain() == castOther.getFlcrDomain()) || (this
				.getFlcrDomain() != null
				&& castOther.getFlcrDomain() != null && this.getFlcrDomain()
				.equals(castOther.getFlcrDomain())))
				&& ((this.getFlcrSite() == castOther.getFlcrSite()) || (this
						.getFlcrSite() != null
						&& castOther.getFlcrSite() != null && this
						.getFlcrSite().equals(castOther.getFlcrSite())))
				&& ((this.getFlcrProductionLine() == castOther
						.getFlcrProductionLine()) || (this
						.getFlcrProductionLine() != null
						&& castOther.getFlcrProductionLine() != null && this
						.getFlcrProductionLine().equals(
								castOther.getFlcrProductionLine())))
				&& ((this.getFlcrScheduleCode() == castOther
						.getFlcrScheduleCode()) || (this.getFlcrScheduleCode() != null
						&& castOther.getFlcrScheduleCode() != null && this
						.getFlcrScheduleCode().equals(
								castOther.getFlcrScheduleCode())))
				&& ((this.getFlcrTypeCode() == castOther.getFlcrTypeCode()) || (this
						.getFlcrTypeCode() != null
						&& castOther.getFlcrTypeCode() != null && this
						.getFlcrTypeCode().equals(castOther.getFlcrTypeCode())))
				&& ((this.getFlcrTypeValue() == castOther.getFlcrTypeValue()) || (this
						.getFlcrTypeValue() != null
						&& castOther.getFlcrTypeValue() != null && this
						.getFlcrTypeValue()
						.equals(castOther.getFlcrTypeValue())))
				&& ((this.getFlcrRateCode() == castOther.getFlcrRateCode()) || (this
						.getFlcrRateCode() != null
						&& castOther.getFlcrRateCode() != null && this
						.getFlcrRateCode().equals(castOther.getFlcrRateCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFlcrDomain() == null ? 0 : this.getFlcrDomain()
						.hashCode());
		result = 37 * result
				+ (getFlcrSite() == null ? 0 : this.getFlcrSite().hashCode());
		result = 37
				* result
				+ (getFlcrProductionLine() == null ? 0 : this
						.getFlcrProductionLine().hashCode());
		result = 37
				* result
				+ (getFlcrScheduleCode() == null ? 0 : this
						.getFlcrScheduleCode().hashCode());
		result = 37
				* result
				+ (getFlcrTypeCode() == null ? 0 : this.getFlcrTypeCode()
						.hashCode());
		result = 37
				* result
				+ (getFlcrTypeValue() == null ? 0 : this.getFlcrTypeValue()
						.hashCode());
		result = 37
				* result
				+ (getFlcrRateCode() == null ? 0 : this.getFlcrRateCode()
						.hashCode());
		return result;
	}

}