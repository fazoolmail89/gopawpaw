package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTrqMstrId entity provides the base persistence definition of the
 * TrqMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrqMstrId implements java.io.Serializable {

	// Fields

	private String trqDomain;
	private Integer trqId;

	// Constructors

	/** default constructor */
	public AbstractTrqMstrId() {
	}

	/** full constructor */
	public AbstractTrqMstrId(String trqDomain, Integer trqId) {
		this.trqDomain = trqDomain;
		this.trqId = trqId;
	}

	// Property accessors

	public String getTrqDomain() {
		return this.trqDomain;
	}

	public void setTrqDomain(String trqDomain) {
		this.trqDomain = trqDomain;
	}

	public Integer getTrqId() {
		return this.trqId;
	}

	public void setTrqId(Integer trqId) {
		this.trqId = trqId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTrqMstrId))
			return false;
		AbstractTrqMstrId castOther = (AbstractTrqMstrId) other;

		return ((this.getTrqDomain() == castOther.getTrqDomain()) || (this
				.getTrqDomain() != null
				&& castOther.getTrqDomain() != null && this.getTrqDomain()
				.equals(castOther.getTrqDomain())))
				&& ((this.getTrqId() == castOther.getTrqId()) || (this
						.getTrqId() != null
						&& castOther.getTrqId() != null && this.getTrqId()
						.equals(castOther.getTrqId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTrqDomain() == null ? 0 : this.getTrqDomain().hashCode());
		result = 37 * result
				+ (getTrqId() == null ? 0 : this.getTrqId().hashCode());
		return result;
	}

}