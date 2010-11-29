package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractShpdHistId entity provides the base persistence definition of the
 * ShpdHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShpdHistId implements java.io.Serializable {

	// Fields

	private String shpdDomain;
	private Integer shpdTranId;
	private Integer shpdMeasurementType;
	private Integer shpdMeasSubtype;

	// Constructors

	/** default constructor */
	public AbstractShpdHistId() {
	}

	/** full constructor */
	public AbstractShpdHistId(String shpdDomain, Integer shpdTranId,
			Integer shpdMeasurementType, Integer shpdMeasSubtype) {
		this.shpdDomain = shpdDomain;
		this.shpdTranId = shpdTranId;
		this.shpdMeasurementType = shpdMeasurementType;
		this.shpdMeasSubtype = shpdMeasSubtype;
	}

	// Property accessors

	public String getShpdDomain() {
		return this.shpdDomain;
	}

	public void setShpdDomain(String shpdDomain) {
		this.shpdDomain = shpdDomain;
	}

	public Integer getShpdTranId() {
		return this.shpdTranId;
	}

	public void setShpdTranId(Integer shpdTranId) {
		this.shpdTranId = shpdTranId;
	}

	public Integer getShpdMeasurementType() {
		return this.shpdMeasurementType;
	}

	public void setShpdMeasurementType(Integer shpdMeasurementType) {
		this.shpdMeasurementType = shpdMeasurementType;
	}

	public Integer getShpdMeasSubtype() {
		return this.shpdMeasSubtype;
	}

	public void setShpdMeasSubtype(Integer shpdMeasSubtype) {
		this.shpdMeasSubtype = shpdMeasSubtype;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractShpdHistId))
			return false;
		AbstractShpdHistId castOther = (AbstractShpdHistId) other;

		return ((this.getShpdDomain() == castOther.getShpdDomain()) || (this
				.getShpdDomain() != null
				&& castOther.getShpdDomain() != null && this.getShpdDomain()
				.equals(castOther.getShpdDomain())))
				&& ((this.getShpdTranId() == castOther.getShpdTranId()) || (this
						.getShpdTranId() != null
						&& castOther.getShpdTranId() != null && this
						.getShpdTranId().equals(castOther.getShpdTranId())))
				&& ((this.getShpdMeasurementType() == castOther
						.getShpdMeasurementType()) || (this
						.getShpdMeasurementType() != null
						&& castOther.getShpdMeasurementType() != null && this
						.getShpdMeasurementType().equals(
								castOther.getShpdMeasurementType())))
				&& ((this.getShpdMeasSubtype() == castOther
						.getShpdMeasSubtype()) || (this.getShpdMeasSubtype() != null
						&& castOther.getShpdMeasSubtype() != null && this
						.getShpdMeasSubtype().equals(
								castOther.getShpdMeasSubtype())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getShpdDomain() == null ? 0 : this.getShpdDomain()
						.hashCode());
		result = 37
				* result
				+ (getShpdTranId() == null ? 0 : this.getShpdTranId()
						.hashCode());
		result = 37
				* result
				+ (getShpdMeasurementType() == null ? 0 : this
						.getShpdMeasurementType().hashCode());
		result = 37
				* result
				+ (getShpdMeasSubtype() == null ? 0 : this.getShpdMeasSubtype()
						.hashCode());
		return result;
	}

}