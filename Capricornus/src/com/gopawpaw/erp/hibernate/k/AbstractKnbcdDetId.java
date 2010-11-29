package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbcdDetId entity provides the base persistence definition of the
 * KnbcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbcdDetId implements java.io.Serializable {

	// Fields

	private String knbcdDomain;
	private String knbcdDispatchId;
	private Integer knbcdKnbdId;

	// Constructors

	/** default constructor */
	public AbstractKnbcdDetId() {
	}

	/** full constructor */
	public AbstractKnbcdDetId(String knbcdDomain, String knbcdDispatchId,
			Integer knbcdKnbdId) {
		this.knbcdDomain = knbcdDomain;
		this.knbcdDispatchId = knbcdDispatchId;
		this.knbcdKnbdId = knbcdKnbdId;
	}

	// Property accessors

	public String getKnbcdDomain() {
		return this.knbcdDomain;
	}

	public void setKnbcdDomain(String knbcdDomain) {
		this.knbcdDomain = knbcdDomain;
	}

	public String getKnbcdDispatchId() {
		return this.knbcdDispatchId;
	}

	public void setKnbcdDispatchId(String knbcdDispatchId) {
		this.knbcdDispatchId = knbcdDispatchId;
	}

	public Integer getKnbcdKnbdId() {
		return this.knbcdKnbdId;
	}

	public void setKnbcdKnbdId(Integer knbcdKnbdId) {
		this.knbcdKnbdId = knbcdKnbdId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbcdDetId))
			return false;
		AbstractKnbcdDetId castOther = (AbstractKnbcdDetId) other;

		return ((this.getKnbcdDomain() == castOther.getKnbcdDomain()) || (this
				.getKnbcdDomain() != null
				&& castOther.getKnbcdDomain() != null && this.getKnbcdDomain()
				.equals(castOther.getKnbcdDomain())))
				&& ((this.getKnbcdDispatchId() == castOther
						.getKnbcdDispatchId()) || (this.getKnbcdDispatchId() != null
						&& castOther.getKnbcdDispatchId() != null && this
						.getKnbcdDispatchId().equals(
								castOther.getKnbcdDispatchId())))
				&& ((this.getKnbcdKnbdId() == castOther.getKnbcdKnbdId()) || (this
						.getKnbcdKnbdId() != null
						&& castOther.getKnbcdKnbdId() != null && this
						.getKnbcdKnbdId().equals(castOther.getKnbcdKnbdId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnbcdDomain() == null ? 0 : this.getKnbcdDomain()
						.hashCode());
		result = 37
				* result
				+ (getKnbcdDispatchId() == null ? 0 : this.getKnbcdDispatchId()
						.hashCode());
		result = 37
				* result
				+ (getKnbcdKnbdId() == null ? 0 : this.getKnbcdKnbdId()
						.hashCode());
		return result;
	}

}