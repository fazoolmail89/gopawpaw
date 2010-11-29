package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbdDetId entity provides the base persistence definition of the
 * KnbdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbdDetId implements java.io.Serializable {

	// Fields

	private String knbdDomain;
	private Integer knbdId;

	// Constructors

	/** default constructor */
	public AbstractKnbdDetId() {
	}

	/** full constructor */
	public AbstractKnbdDetId(String knbdDomain, Integer knbdId) {
		this.knbdDomain = knbdDomain;
		this.knbdId = knbdId;
	}

	// Property accessors

	public String getKnbdDomain() {
		return this.knbdDomain;
	}

	public void setKnbdDomain(String knbdDomain) {
		this.knbdDomain = knbdDomain;
	}

	public Integer getKnbdId() {
		return this.knbdId;
	}

	public void setKnbdId(Integer knbdId) {
		this.knbdId = knbdId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbdDetId))
			return false;
		AbstractKnbdDetId castOther = (AbstractKnbdDetId) other;

		return ((this.getKnbdDomain() == castOther.getKnbdDomain()) || (this
				.getKnbdDomain() != null
				&& castOther.getKnbdDomain() != null && this.getKnbdDomain()
				.equals(castOther.getKnbdDomain())))
				&& ((this.getKnbdId() == castOther.getKnbdId()) || (this
						.getKnbdId() != null
						&& castOther.getKnbdId() != null && this.getKnbdId()
						.equals(castOther.getKnbdId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnbdDomain() == null ? 0 : this.getKnbdDomain()
						.hashCode());
		result = 37 * result
				+ (getKnbdId() == null ? 0 : this.getKnbdId().hashCode());
		return result;
	}

}