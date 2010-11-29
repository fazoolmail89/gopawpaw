package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbfdDetId entity provides the base persistence definition of the
 * KnbfdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbfdDetId implements java.io.Serializable {

	// Fields

	private String knbfdDomain;
	private Double knbfdKeyid;

	// Constructors

	/** default constructor */
	public AbstractKnbfdDetId() {
	}

	/** full constructor */
	public AbstractKnbfdDetId(String knbfdDomain, Double knbfdKeyid) {
		this.knbfdDomain = knbfdDomain;
		this.knbfdKeyid = knbfdKeyid;
	}

	// Property accessors

	public String getKnbfdDomain() {
		return this.knbfdDomain;
	}

	public void setKnbfdDomain(String knbfdDomain) {
		this.knbfdDomain = knbfdDomain;
	}

	public Double getKnbfdKeyid() {
		return this.knbfdKeyid;
	}

	public void setKnbfdKeyid(Double knbfdKeyid) {
		this.knbfdKeyid = knbfdKeyid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbfdDetId))
			return false;
		AbstractKnbfdDetId castOther = (AbstractKnbfdDetId) other;

		return ((this.getKnbfdDomain() == castOther.getKnbfdDomain()) || (this
				.getKnbfdDomain() != null
				&& castOther.getKnbfdDomain() != null && this.getKnbfdDomain()
				.equals(castOther.getKnbfdDomain())))
				&& ((this.getKnbfdKeyid() == castOther.getKnbfdKeyid()) || (this
						.getKnbfdKeyid() != null
						&& castOther.getKnbfdKeyid() != null && this
						.getKnbfdKeyid().equals(castOther.getKnbfdKeyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnbfdDomain() == null ? 0 : this.getKnbfdDomain()
						.hashCode());
		result = 37
				* result
				+ (getKnbfdKeyid() == null ? 0 : this.getKnbfdKeyid()
						.hashCode());
		return result;
	}

}