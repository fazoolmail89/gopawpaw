package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbadcHistId entity provides the base persistence definition of the
 * KnbadcHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbadcHistId implements java.io.Serializable {

	// Fields

	private String knbadcDomain;
	private Double knbadcKeyid;

	// Constructors

	/** default constructor */
	public AbstractKnbadcHistId() {
	}

	/** full constructor */
	public AbstractKnbadcHistId(String knbadcDomain, Double knbadcKeyid) {
		this.knbadcDomain = knbadcDomain;
		this.knbadcKeyid = knbadcKeyid;
	}

	// Property accessors

	public String getKnbadcDomain() {
		return this.knbadcDomain;
	}

	public void setKnbadcDomain(String knbadcDomain) {
		this.knbadcDomain = knbadcDomain;
	}

	public Double getKnbadcKeyid() {
		return this.knbadcKeyid;
	}

	public void setKnbadcKeyid(Double knbadcKeyid) {
		this.knbadcKeyid = knbadcKeyid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbadcHistId))
			return false;
		AbstractKnbadcHistId castOther = (AbstractKnbadcHistId) other;

		return ((this.getKnbadcDomain() == castOther.getKnbadcDomain()) || (this
				.getKnbadcDomain() != null
				&& castOther.getKnbadcDomain() != null && this
				.getKnbadcDomain().equals(castOther.getKnbadcDomain())))
				&& ((this.getKnbadcKeyid() == castOther.getKnbadcKeyid()) || (this
						.getKnbadcKeyid() != null
						&& castOther.getKnbadcKeyid() != null && this
						.getKnbadcKeyid().equals(castOther.getKnbadcKeyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnbadcDomain() == null ? 0 : this.getKnbadcDomain()
						.hashCode());
		result = 37
				* result
				+ (getKnbadcKeyid() == null ? 0 : this.getKnbadcKeyid()
						.hashCode());
		return result;
	}

}