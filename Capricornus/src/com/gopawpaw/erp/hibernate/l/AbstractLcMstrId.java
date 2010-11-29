package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLcMstrId entity provides the base persistence definition of the
 * LcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLcMstrId implements java.io.Serializable {

	// Fields

	private String lcDomain;
	private String lcCharge;

	// Constructors

	/** default constructor */
	public AbstractLcMstrId() {
	}

	/** full constructor */
	public AbstractLcMstrId(String lcDomain, String lcCharge) {
		this.lcDomain = lcDomain;
		this.lcCharge = lcCharge;
	}

	// Property accessors

	public String getLcDomain() {
		return this.lcDomain;
	}

	public void setLcDomain(String lcDomain) {
		this.lcDomain = lcDomain;
	}

	public String getLcCharge() {
		return this.lcCharge;
	}

	public void setLcCharge(String lcCharge) {
		this.lcCharge = lcCharge;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLcMstrId))
			return false;
		AbstractLcMstrId castOther = (AbstractLcMstrId) other;

		return ((this.getLcDomain() == castOther.getLcDomain()) || (this
				.getLcDomain() != null
				&& castOther.getLcDomain() != null && this.getLcDomain()
				.equals(castOther.getLcDomain())))
				&& ((this.getLcCharge() == castOther.getLcCharge()) || (this
						.getLcCharge() != null
						&& castOther.getLcCharge() != null && this
						.getLcCharge().equals(castOther.getLcCharge())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLcDomain() == null ? 0 : this.getLcDomain().hashCode());
		result = 37 * result
				+ (getLcCharge() == null ? 0 : this.getLcCharge().hashCode());
		return result;
	}

}