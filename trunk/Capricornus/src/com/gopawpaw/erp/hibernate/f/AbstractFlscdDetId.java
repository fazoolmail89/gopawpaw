package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFlscdDetId entity provides the base persistence definition of the
 * FlscdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlscdDetId implements java.io.Serializable {

	// Fields

	private String flscdDomain;
	private String flscdScheduleCode;
	private String flscdSite;
	private String flscdProductionLine;

	// Constructors

	/** default constructor */
	public AbstractFlscdDetId() {
	}

	/** full constructor */
	public AbstractFlscdDetId(String flscdDomain, String flscdScheduleCode,
			String flscdSite, String flscdProductionLine) {
		this.flscdDomain = flscdDomain;
		this.flscdScheduleCode = flscdScheduleCode;
		this.flscdSite = flscdSite;
		this.flscdProductionLine = flscdProductionLine;
	}

	// Property accessors

	public String getFlscdDomain() {
		return this.flscdDomain;
	}

	public void setFlscdDomain(String flscdDomain) {
		this.flscdDomain = flscdDomain;
	}

	public String getFlscdScheduleCode() {
		return this.flscdScheduleCode;
	}

	public void setFlscdScheduleCode(String flscdScheduleCode) {
		this.flscdScheduleCode = flscdScheduleCode;
	}

	public String getFlscdSite() {
		return this.flscdSite;
	}

	public void setFlscdSite(String flscdSite) {
		this.flscdSite = flscdSite;
	}

	public String getFlscdProductionLine() {
		return this.flscdProductionLine;
	}

	public void setFlscdProductionLine(String flscdProductionLine) {
		this.flscdProductionLine = flscdProductionLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFlscdDetId))
			return false;
		AbstractFlscdDetId castOther = (AbstractFlscdDetId) other;

		return ((this.getFlscdDomain() == castOther.getFlscdDomain()) || (this
				.getFlscdDomain() != null
				&& castOther.getFlscdDomain() != null && this.getFlscdDomain()
				.equals(castOther.getFlscdDomain())))
				&& ((this.getFlscdScheduleCode() == castOther
						.getFlscdScheduleCode()) || (this
						.getFlscdScheduleCode() != null
						&& castOther.getFlscdScheduleCode() != null && this
						.getFlscdScheduleCode().equals(
								castOther.getFlscdScheduleCode())))
				&& ((this.getFlscdSite() == castOther.getFlscdSite()) || (this
						.getFlscdSite() != null
						&& castOther.getFlscdSite() != null && this
						.getFlscdSite().equals(castOther.getFlscdSite())))
				&& ((this.getFlscdProductionLine() == castOther
						.getFlscdProductionLine()) || (this
						.getFlscdProductionLine() != null
						&& castOther.getFlscdProductionLine() != null && this
						.getFlscdProductionLine().equals(
								castOther.getFlscdProductionLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFlscdDomain() == null ? 0 : this.getFlscdDomain()
						.hashCode());
		result = 37
				* result
				+ (getFlscdScheduleCode() == null ? 0 : this
						.getFlscdScheduleCode().hashCode());
		result = 37 * result
				+ (getFlscdSite() == null ? 0 : this.getFlscdSite().hashCode());
		result = 37
				* result
				+ (getFlscdProductionLine() == null ? 0 : this
						.getFlscdProductionLine().hashCode());
		return result;
	}

}