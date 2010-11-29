package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBkadDetId entity provides the base persistence definition of the
 * BkadDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkadDetId implements java.io.Serializable {

	// Fields

	private String bkadDomain;
	private Integer bkadAllocId;

	// Constructors

	/** default constructor */
	public AbstractBkadDetId() {
	}

	/** full constructor */
	public AbstractBkadDetId(String bkadDomain, Integer bkadAllocId) {
		this.bkadDomain = bkadDomain;
		this.bkadAllocId = bkadAllocId;
	}

	// Property accessors

	public String getBkadDomain() {
		return this.bkadDomain;
	}

	public void setBkadDomain(String bkadDomain) {
		this.bkadDomain = bkadDomain;
	}

	public Integer getBkadAllocId() {
		return this.bkadAllocId;
	}

	public void setBkadAllocId(Integer bkadAllocId) {
		this.bkadAllocId = bkadAllocId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBkadDetId))
			return false;
		AbstractBkadDetId castOther = (AbstractBkadDetId) other;

		return ((this.getBkadDomain() == castOther.getBkadDomain()) || (this
				.getBkadDomain() != null
				&& castOther.getBkadDomain() != null && this.getBkadDomain()
				.equals(castOther.getBkadDomain())))
				&& ((this.getBkadAllocId() == castOther.getBkadAllocId()) || (this
						.getBkadAllocId() != null
						&& castOther.getBkadAllocId() != null && this
						.getBkadAllocId().equals(castOther.getBkadAllocId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getBkadDomain() == null ? 0 : this.getBkadDomain()
						.hashCode());
		result = 37
				* result
				+ (getBkadAllocId() == null ? 0 : this.getBkadAllocId()
						.hashCode());
		return result;
	}

}