package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVewMstrId entity provides the base persistence definition of the
 * VewMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVewMstrId implements java.io.Serializable {

	// Fields

	private String vewDomain;
	private String vewWeightCode;

	// Constructors

	/** default constructor */
	public AbstractVewMstrId() {
	}

	/** full constructor */
	public AbstractVewMstrId(String vewDomain, String vewWeightCode) {
		this.vewDomain = vewDomain;
		this.vewWeightCode = vewWeightCode;
	}

	// Property accessors

	public String getVewDomain() {
		return this.vewDomain;
	}

	public void setVewDomain(String vewDomain) {
		this.vewDomain = vewDomain;
	}

	public String getVewWeightCode() {
		return this.vewWeightCode;
	}

	public void setVewWeightCode(String vewWeightCode) {
		this.vewWeightCode = vewWeightCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVewMstrId))
			return false;
		AbstractVewMstrId castOther = (AbstractVewMstrId) other;

		return ((this.getVewDomain() == castOther.getVewDomain()) || (this
				.getVewDomain() != null
				&& castOther.getVewDomain() != null && this.getVewDomain()
				.equals(castOther.getVewDomain())))
				&& ((this.getVewWeightCode() == castOther.getVewWeightCode()) || (this
						.getVewWeightCode() != null
						&& castOther.getVewWeightCode() != null && this
						.getVewWeightCode()
						.equals(castOther.getVewWeightCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVewDomain() == null ? 0 : this.getVewDomain().hashCode());
		result = 37
				* result
				+ (getVewWeightCode() == null ? 0 : this.getVewWeightCode()
						.hashCode());
		return result;
	}

}