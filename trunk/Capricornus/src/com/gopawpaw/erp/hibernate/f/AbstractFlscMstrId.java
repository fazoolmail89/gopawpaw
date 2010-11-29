package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFlscMstrId entity provides the base persistence definition of the
 * FlscMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlscMstrId implements java.io.Serializable {

	// Fields

	private String flscDomain;
	private String flscScheduleCode;

	// Constructors

	/** default constructor */
	public AbstractFlscMstrId() {
	}

	/** full constructor */
	public AbstractFlscMstrId(String flscDomain, String flscScheduleCode) {
		this.flscDomain = flscDomain;
		this.flscScheduleCode = flscScheduleCode;
	}

	// Property accessors

	public String getFlscDomain() {
		return this.flscDomain;
	}

	public void setFlscDomain(String flscDomain) {
		this.flscDomain = flscDomain;
	}

	public String getFlscScheduleCode() {
		return this.flscScheduleCode;
	}

	public void setFlscScheduleCode(String flscScheduleCode) {
		this.flscScheduleCode = flscScheduleCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFlscMstrId))
			return false;
		AbstractFlscMstrId castOther = (AbstractFlscMstrId) other;

		return ((this.getFlscDomain() == castOther.getFlscDomain()) || (this
				.getFlscDomain() != null
				&& castOther.getFlscDomain() != null && this.getFlscDomain()
				.equals(castOther.getFlscDomain())))
				&& ((this.getFlscScheduleCode() == castOther
						.getFlscScheduleCode()) || (this.getFlscScheduleCode() != null
						&& castOther.getFlscScheduleCode() != null && this
						.getFlscScheduleCode().equals(
								castOther.getFlscScheduleCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFlscDomain() == null ? 0 : this.getFlscDomain()
						.hashCode());
		result = 37
				* result
				+ (getFlscScheduleCode() == null ? 0 : this
						.getFlscScheduleCode().hashCode());
		return result;
	}

}