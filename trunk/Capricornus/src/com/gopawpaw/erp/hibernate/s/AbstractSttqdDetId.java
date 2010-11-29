package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSttqdDetId entity provides the base persistence definition of the
 * SttqdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSttqdDetId implements java.io.Serializable {

	// Fields

	private String sttqdDomain;
	private Integer sttqdMeasurementType;
	private String sttqdStatusCode;
	private String sttqdCustomerSource;
	private String sttqdShipfrom;
	private String sttqdReceiveAddr;
	private String sttqdPart;

	// Constructors

	/** default constructor */
	public AbstractSttqdDetId() {
	}

	/** full constructor */
	public AbstractSttqdDetId(String sttqdDomain, Integer sttqdMeasurementType,
			String sttqdStatusCode, String sttqdCustomerSource,
			String sttqdShipfrom, String sttqdReceiveAddr, String sttqdPart) {
		this.sttqdDomain = sttqdDomain;
		this.sttqdMeasurementType = sttqdMeasurementType;
		this.sttqdStatusCode = sttqdStatusCode;
		this.sttqdCustomerSource = sttqdCustomerSource;
		this.sttqdShipfrom = sttqdShipfrom;
		this.sttqdReceiveAddr = sttqdReceiveAddr;
		this.sttqdPart = sttqdPart;
	}

	// Property accessors

	public String getSttqdDomain() {
		return this.sttqdDomain;
	}

	public void setSttqdDomain(String sttqdDomain) {
		this.sttqdDomain = sttqdDomain;
	}

	public Integer getSttqdMeasurementType() {
		return this.sttqdMeasurementType;
	}

	public void setSttqdMeasurementType(Integer sttqdMeasurementType) {
		this.sttqdMeasurementType = sttqdMeasurementType;
	}

	public String getSttqdStatusCode() {
		return this.sttqdStatusCode;
	}

	public void setSttqdStatusCode(String sttqdStatusCode) {
		this.sttqdStatusCode = sttqdStatusCode;
	}

	public String getSttqdCustomerSource() {
		return this.sttqdCustomerSource;
	}

	public void setSttqdCustomerSource(String sttqdCustomerSource) {
		this.sttqdCustomerSource = sttqdCustomerSource;
	}

	public String getSttqdShipfrom() {
		return this.sttqdShipfrom;
	}

	public void setSttqdShipfrom(String sttqdShipfrom) {
		this.sttqdShipfrom = sttqdShipfrom;
	}

	public String getSttqdReceiveAddr() {
		return this.sttqdReceiveAddr;
	}

	public void setSttqdReceiveAddr(String sttqdReceiveAddr) {
		this.sttqdReceiveAddr = sttqdReceiveAddr;
	}

	public String getSttqdPart() {
		return this.sttqdPart;
	}

	public void setSttqdPart(String sttqdPart) {
		this.sttqdPart = sttqdPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSttqdDetId))
			return false;
		AbstractSttqdDetId castOther = (AbstractSttqdDetId) other;

		return ((this.getSttqdDomain() == castOther.getSttqdDomain()) || (this
				.getSttqdDomain() != null
				&& castOther.getSttqdDomain() != null && this.getSttqdDomain()
				.equals(castOther.getSttqdDomain())))
				&& ((this.getSttqdMeasurementType() == castOther
						.getSttqdMeasurementType()) || (this
						.getSttqdMeasurementType() != null
						&& castOther.getSttqdMeasurementType() != null && this
						.getSttqdMeasurementType().equals(
								castOther.getSttqdMeasurementType())))
				&& ((this.getSttqdStatusCode() == castOther
						.getSttqdStatusCode()) || (this.getSttqdStatusCode() != null
						&& castOther.getSttqdStatusCode() != null && this
						.getSttqdStatusCode().equals(
								castOther.getSttqdStatusCode())))
				&& ((this.getSttqdCustomerSource() == castOther
						.getSttqdCustomerSource()) || (this
						.getSttqdCustomerSource() != null
						&& castOther.getSttqdCustomerSource() != null && this
						.getSttqdCustomerSource().equals(
								castOther.getSttqdCustomerSource())))
				&& ((this.getSttqdShipfrom() == castOther.getSttqdShipfrom()) || (this
						.getSttqdShipfrom() != null
						&& castOther.getSttqdShipfrom() != null && this
						.getSttqdShipfrom()
						.equals(castOther.getSttqdShipfrom())))
				&& ((this.getSttqdReceiveAddr() == castOther
						.getSttqdReceiveAddr()) || (this.getSttqdReceiveAddr() != null
						&& castOther.getSttqdReceiveAddr() != null && this
						.getSttqdReceiveAddr().equals(
								castOther.getSttqdReceiveAddr())))
				&& ((this.getSttqdPart() == castOther.getSttqdPart()) || (this
						.getSttqdPart() != null
						&& castOther.getSttqdPart() != null && this
						.getSttqdPart().equals(castOther.getSttqdPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSttqdDomain() == null ? 0 : this.getSttqdDomain()
						.hashCode());
		result = 37
				* result
				+ (getSttqdMeasurementType() == null ? 0 : this
						.getSttqdMeasurementType().hashCode());
		result = 37
				* result
				+ (getSttqdStatusCode() == null ? 0 : this.getSttqdStatusCode()
						.hashCode());
		result = 37
				* result
				+ (getSttqdCustomerSource() == null ? 0 : this
						.getSttqdCustomerSource().hashCode());
		result = 37
				* result
				+ (getSttqdShipfrom() == null ? 0 : this.getSttqdShipfrom()
						.hashCode());
		result = 37
				* result
				+ (getSttqdReceiveAddr() == null ? 0 : this
						.getSttqdReceiveAddr().hashCode());
		result = 37 * result
				+ (getSttqdPart() == null ? 0 : this.getSttqdPart().hashCode());
		return result;
	}

}