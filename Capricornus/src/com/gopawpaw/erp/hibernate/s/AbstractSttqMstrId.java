package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSttqMstrId entity provides the base persistence definition of the
 * SttqMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSttqMstrId implements java.io.Serializable {

	// Fields

	private String sttqDomain;
	private Integer sttqMeasurementType;
	private String sttqStatusCode;

	// Constructors

	/** default constructor */
	public AbstractSttqMstrId() {
	}

	/** full constructor */
	public AbstractSttqMstrId(String sttqDomain, Integer sttqMeasurementType,
			String sttqStatusCode) {
		this.sttqDomain = sttqDomain;
		this.sttqMeasurementType = sttqMeasurementType;
		this.sttqStatusCode = sttqStatusCode;
	}

	// Property accessors

	public String getSttqDomain() {
		return this.sttqDomain;
	}

	public void setSttqDomain(String sttqDomain) {
		this.sttqDomain = sttqDomain;
	}

	public Integer getSttqMeasurementType() {
		return this.sttqMeasurementType;
	}

	public void setSttqMeasurementType(Integer sttqMeasurementType) {
		this.sttqMeasurementType = sttqMeasurementType;
	}

	public String getSttqStatusCode() {
		return this.sttqStatusCode;
	}

	public void setSttqStatusCode(String sttqStatusCode) {
		this.sttqStatusCode = sttqStatusCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSttqMstrId))
			return false;
		AbstractSttqMstrId castOther = (AbstractSttqMstrId) other;

		return ((this.getSttqDomain() == castOther.getSttqDomain()) || (this
				.getSttqDomain() != null
				&& castOther.getSttqDomain() != null && this.getSttqDomain()
				.equals(castOther.getSttqDomain())))
				&& ((this.getSttqMeasurementType() == castOther
						.getSttqMeasurementType()) || (this
						.getSttqMeasurementType() != null
						&& castOther.getSttqMeasurementType() != null && this
						.getSttqMeasurementType().equals(
								castOther.getSttqMeasurementType())))
				&& ((this.getSttqStatusCode() == castOther.getSttqStatusCode()) || (this
						.getSttqStatusCode() != null
						&& castOther.getSttqStatusCode() != null && this
						.getSttqStatusCode().equals(
								castOther.getSttqStatusCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSttqDomain() == null ? 0 : this.getSttqDomain()
						.hashCode());
		result = 37
				* result
				+ (getSttqMeasurementType() == null ? 0 : this
						.getSttqMeasurementType().hashCode());
		result = 37
				* result
				+ (getSttqStatusCode() == null ? 0 : this.getSttqStatusCode()
						.hashCode());
		return result;
	}

}