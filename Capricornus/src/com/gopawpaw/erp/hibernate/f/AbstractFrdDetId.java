package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFrdDetId entity provides the base persistence definition of the
 * FrdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFrdDetId implements java.io.Serializable {

	// Fields

	private String frdDomain;
	private String frdCode;
	private Double frdWeight;

	// Constructors

	/** default constructor */
	public AbstractFrdDetId() {
	}

	/** minimal constructor */
	public AbstractFrdDetId(String frdDomain) {
		this.frdDomain = frdDomain;
	}

	/** full constructor */
	public AbstractFrdDetId(String frdDomain, String frdCode, Double frdWeight) {
		this.frdDomain = frdDomain;
		this.frdCode = frdCode;
		this.frdWeight = frdWeight;
	}

	// Property accessors

	public String getFrdDomain() {
		return this.frdDomain;
	}

	public void setFrdDomain(String frdDomain) {
		this.frdDomain = frdDomain;
	}

	public String getFrdCode() {
		return this.frdCode;
	}

	public void setFrdCode(String frdCode) {
		this.frdCode = frdCode;
	}

	public Double getFrdWeight() {
		return this.frdWeight;
	}

	public void setFrdWeight(Double frdWeight) {
		this.frdWeight = frdWeight;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFrdDetId))
			return false;
		AbstractFrdDetId castOther = (AbstractFrdDetId) other;

		return ((this.getFrdDomain() == castOther.getFrdDomain()) || (this
				.getFrdDomain() != null
				&& castOther.getFrdDomain() != null && this.getFrdDomain()
				.equals(castOther.getFrdDomain())))
				&& ((this.getFrdCode() == castOther.getFrdCode()) || (this
						.getFrdCode() != null
						&& castOther.getFrdCode() != null && this.getFrdCode()
						.equals(castOther.getFrdCode())))
				&& ((this.getFrdWeight() == castOther.getFrdWeight()) || (this
						.getFrdWeight() != null
						&& castOther.getFrdWeight() != null && this
						.getFrdWeight().equals(castOther.getFrdWeight())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFrdDomain() == null ? 0 : this.getFrdDomain().hashCode());
		result = 37 * result
				+ (getFrdCode() == null ? 0 : this.getFrdCode().hashCode());
		result = 37 * result
				+ (getFrdWeight() == null ? 0 : this.getFrdWeight().hashCode());
		return result;
	}

}