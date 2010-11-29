package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFwkMstrId entity provides the base persistence definition of the
 * FwkMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFwkMstrId implements java.io.Serializable {

	// Fields

	private String fwkDomain;
	private String fwkCaIntType;

	// Constructors

	/** default constructor */
	public AbstractFwkMstrId() {
	}

	/** minimal constructor */
	public AbstractFwkMstrId(String fwkDomain) {
		this.fwkDomain = fwkDomain;
	}

	/** full constructor */
	public AbstractFwkMstrId(String fwkDomain, String fwkCaIntType) {
		this.fwkDomain = fwkDomain;
		this.fwkCaIntType = fwkCaIntType;
	}

	// Property accessors

	public String getFwkDomain() {
		return this.fwkDomain;
	}

	public void setFwkDomain(String fwkDomain) {
		this.fwkDomain = fwkDomain;
	}

	public String getFwkCaIntType() {
		return this.fwkCaIntType;
	}

	public void setFwkCaIntType(String fwkCaIntType) {
		this.fwkCaIntType = fwkCaIntType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFwkMstrId))
			return false;
		AbstractFwkMstrId castOther = (AbstractFwkMstrId) other;

		return ((this.getFwkDomain() == castOther.getFwkDomain()) || (this
				.getFwkDomain() != null
				&& castOther.getFwkDomain() != null && this.getFwkDomain()
				.equals(castOther.getFwkDomain())))
				&& ((this.getFwkCaIntType() == castOther.getFwkCaIntType()) || (this
						.getFwkCaIntType() != null
						&& castOther.getFwkCaIntType() != null && this
						.getFwkCaIntType().equals(castOther.getFwkCaIntType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFwkDomain() == null ? 0 : this.getFwkDomain().hashCode());
		result = 37
				* result
				+ (getFwkCaIntType() == null ? 0 : this.getFwkCaIntType()
						.hashCode());
		return result;
	}

}