package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCctMstrId entity provides the base persistence definition of the
 * CctMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCctMstrId implements java.io.Serializable {

	// Fields

	private String cctDomain;
	private String cctChargeType;

	// Constructors

	/** default constructor */
	public AbstractCctMstrId() {
	}

	/** full constructor */
	public AbstractCctMstrId(String cctDomain, String cctChargeType) {
		this.cctDomain = cctDomain;
		this.cctChargeType = cctChargeType;
	}

	// Property accessors

	public String getCctDomain() {
		return this.cctDomain;
	}

	public void setCctDomain(String cctDomain) {
		this.cctDomain = cctDomain;
	}

	public String getCctChargeType() {
		return this.cctChargeType;
	}

	public void setCctChargeType(String cctChargeType) {
		this.cctChargeType = cctChargeType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCctMstrId))
			return false;
		AbstractCctMstrId castOther = (AbstractCctMstrId) other;

		return ((this.getCctDomain() == castOther.getCctDomain()) || (this
				.getCctDomain() != null
				&& castOther.getCctDomain() != null && this.getCctDomain()
				.equals(castOther.getCctDomain())))
				&& ((this.getCctChargeType() == castOther.getCctChargeType()) || (this
						.getCctChargeType() != null
						&& castOther.getCctChargeType() != null && this
						.getCctChargeType()
						.equals(castOther.getCctChargeType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCctDomain() == null ? 0 : this.getCctDomain().hashCode());
		result = 37
				* result
				+ (getCctChargeType() == null ? 0 : this.getCctChargeType()
						.hashCode());
		return result;
	}

}