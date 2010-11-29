package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFlcrhHistId entity provides the base persistence definition of the
 * FlcrhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlcrhHistId implements java.io.Serializable {

	// Fields

	private String flcrhDomain;
	private String flcrhSite;
	private String flcrhProductionLine;
	private String flcrhScheduleCode;
	private Date flcrhStartDate;

	// Constructors

	/** default constructor */
	public AbstractFlcrhHistId() {
	}

	/** full constructor */
	public AbstractFlcrhHistId(String flcrhDomain, String flcrhSite,
			String flcrhProductionLine, String flcrhScheduleCode,
			Date flcrhStartDate) {
		this.flcrhDomain = flcrhDomain;
		this.flcrhSite = flcrhSite;
		this.flcrhProductionLine = flcrhProductionLine;
		this.flcrhScheduleCode = flcrhScheduleCode;
		this.flcrhStartDate = flcrhStartDate;
	}

	// Property accessors

	public String getFlcrhDomain() {
		return this.flcrhDomain;
	}

	public void setFlcrhDomain(String flcrhDomain) {
		this.flcrhDomain = flcrhDomain;
	}

	public String getFlcrhSite() {
		return this.flcrhSite;
	}

	public void setFlcrhSite(String flcrhSite) {
		this.flcrhSite = flcrhSite;
	}

	public String getFlcrhProductionLine() {
		return this.flcrhProductionLine;
	}

	public void setFlcrhProductionLine(String flcrhProductionLine) {
		this.flcrhProductionLine = flcrhProductionLine;
	}

	public String getFlcrhScheduleCode() {
		return this.flcrhScheduleCode;
	}

	public void setFlcrhScheduleCode(String flcrhScheduleCode) {
		this.flcrhScheduleCode = flcrhScheduleCode;
	}

	public Date getFlcrhStartDate() {
		return this.flcrhStartDate;
	}

	public void setFlcrhStartDate(Date flcrhStartDate) {
		this.flcrhStartDate = flcrhStartDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFlcrhHistId))
			return false;
		AbstractFlcrhHistId castOther = (AbstractFlcrhHistId) other;

		return ((this.getFlcrhDomain() == castOther.getFlcrhDomain()) || (this
				.getFlcrhDomain() != null
				&& castOther.getFlcrhDomain() != null && this.getFlcrhDomain()
				.equals(castOther.getFlcrhDomain())))
				&& ((this.getFlcrhSite() == castOther.getFlcrhSite()) || (this
						.getFlcrhSite() != null
						&& castOther.getFlcrhSite() != null && this
						.getFlcrhSite().equals(castOther.getFlcrhSite())))
				&& ((this.getFlcrhProductionLine() == castOther
						.getFlcrhProductionLine()) || (this
						.getFlcrhProductionLine() != null
						&& castOther.getFlcrhProductionLine() != null && this
						.getFlcrhProductionLine().equals(
								castOther.getFlcrhProductionLine())))
				&& ((this.getFlcrhScheduleCode() == castOther
						.getFlcrhScheduleCode()) || (this
						.getFlcrhScheduleCode() != null
						&& castOther.getFlcrhScheduleCode() != null && this
						.getFlcrhScheduleCode().equals(
								castOther.getFlcrhScheduleCode())))
				&& ((this.getFlcrhStartDate() == castOther.getFlcrhStartDate()) || (this
						.getFlcrhStartDate() != null
						&& castOther.getFlcrhStartDate() != null && this
						.getFlcrhStartDate().equals(
								castOther.getFlcrhStartDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFlcrhDomain() == null ? 0 : this.getFlcrhDomain()
						.hashCode());
		result = 37 * result
				+ (getFlcrhSite() == null ? 0 : this.getFlcrhSite().hashCode());
		result = 37
				* result
				+ (getFlcrhProductionLine() == null ? 0 : this
						.getFlcrhProductionLine().hashCode());
		result = 37
				* result
				+ (getFlcrhScheduleCode() == null ? 0 : this
						.getFlcrhScheduleCode().hashCode());
		result = 37
				* result
				+ (getFlcrhStartDate() == null ? 0 : this.getFlcrhStartDate()
						.hashCode());
		return result;
	}

}