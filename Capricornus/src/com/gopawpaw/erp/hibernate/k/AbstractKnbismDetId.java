package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbismDetId entity provides the base persistence definition of the
 * KnbismDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbismDetId implements java.io.Serializable {

	// Fields

	private String knbismDomain;
	private Double knbismKeyid;

	// Constructors

	/** default constructor */
	public AbstractKnbismDetId() {
	}

	/** full constructor */
	public AbstractKnbismDetId(String knbismDomain, Double knbismKeyid) {
		this.knbismDomain = knbismDomain;
		this.knbismKeyid = knbismKeyid;
	}

	// Property accessors

	public String getKnbismDomain() {
		return this.knbismDomain;
	}

	public void setKnbismDomain(String knbismDomain) {
		this.knbismDomain = knbismDomain;
	}

	public Double getKnbismKeyid() {
		return this.knbismKeyid;
	}

	public void setKnbismKeyid(Double knbismKeyid) {
		this.knbismKeyid = knbismKeyid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbismDetId))
			return false;
		AbstractKnbismDetId castOther = (AbstractKnbismDetId) other;

		return ((this.getKnbismDomain() == castOther.getKnbismDomain()) || (this
				.getKnbismDomain() != null
				&& castOther.getKnbismDomain() != null && this
				.getKnbismDomain().equals(castOther.getKnbismDomain())))
				&& ((this.getKnbismKeyid() == castOther.getKnbismKeyid()) || (this
						.getKnbismKeyid() != null
						&& castOther.getKnbismKeyid() != null && this
						.getKnbismKeyid().equals(castOther.getKnbismKeyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnbismDomain() == null ? 0 : this.getKnbismDomain()
						.hashCode());
		result = 37
				* result
				+ (getKnbismKeyid() == null ? 0 : this.getKnbismKeyid()
						.hashCode());
		return result;
	}

}