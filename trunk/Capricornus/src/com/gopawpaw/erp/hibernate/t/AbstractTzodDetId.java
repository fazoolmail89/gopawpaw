package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTzodDetId entity provides the base persistence definition of the
 * TzodDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTzodDetId implements java.io.Serializable {

	// Fields

	private String tzodTzone;
	private String tzodStdDay;
	private Integer tzodSyear;
	private Integer tzodEyear;

	// Constructors

	/** default constructor */
	public AbstractTzodDetId() {
	}

	/** full constructor */
	public AbstractTzodDetId(String tzodTzone, String tzodStdDay,
			Integer tzodSyear, Integer tzodEyear) {
		this.tzodTzone = tzodTzone;
		this.tzodStdDay = tzodStdDay;
		this.tzodSyear = tzodSyear;
		this.tzodEyear = tzodEyear;
	}

	// Property accessors

	public String getTzodTzone() {
		return this.tzodTzone;
	}

	public void setTzodTzone(String tzodTzone) {
		this.tzodTzone = tzodTzone;
	}

	public String getTzodStdDay() {
		return this.tzodStdDay;
	}

	public void setTzodStdDay(String tzodStdDay) {
		this.tzodStdDay = tzodStdDay;
	}

	public Integer getTzodSyear() {
		return this.tzodSyear;
	}

	public void setTzodSyear(Integer tzodSyear) {
		this.tzodSyear = tzodSyear;
	}

	public Integer getTzodEyear() {
		return this.tzodEyear;
	}

	public void setTzodEyear(Integer tzodEyear) {
		this.tzodEyear = tzodEyear;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTzodDetId))
			return false;
		AbstractTzodDetId castOther = (AbstractTzodDetId) other;

		return ((this.getTzodTzone() == castOther.getTzodTzone()) || (this
				.getTzodTzone() != null
				&& castOther.getTzodTzone() != null && this.getTzodTzone()
				.equals(castOther.getTzodTzone())))
				&& ((this.getTzodStdDay() == castOther.getTzodStdDay()) || (this
						.getTzodStdDay() != null
						&& castOther.getTzodStdDay() != null && this
						.getTzodStdDay().equals(castOther.getTzodStdDay())))
				&& ((this.getTzodSyear() == castOther.getTzodSyear()) || (this
						.getTzodSyear() != null
						&& castOther.getTzodSyear() != null && this
						.getTzodSyear().equals(castOther.getTzodSyear())))
				&& ((this.getTzodEyear() == castOther.getTzodEyear()) || (this
						.getTzodEyear() != null
						&& castOther.getTzodEyear() != null && this
						.getTzodEyear().equals(castOther.getTzodEyear())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTzodTzone() == null ? 0 : this.getTzodTzone().hashCode());
		result = 37
				* result
				+ (getTzodStdDay() == null ? 0 : this.getTzodStdDay()
						.hashCode());
		result = 37 * result
				+ (getTzodSyear() == null ? 0 : this.getTzodSyear().hashCode());
		result = 37 * result
				+ (getTzodEyear() == null ? 0 : this.getTzodEyear().hashCode());
		return result;
	}

}