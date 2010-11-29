package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnpdDetId entity provides the base persistence definition of the
 * KnpdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnpdDetId implements java.io.Serializable {

	// Fields

	private String knpdDomain;
	private Double knpdKeyid;

	// Constructors

	/** default constructor */
	public AbstractKnpdDetId() {
	}

	/** full constructor */
	public AbstractKnpdDetId(String knpdDomain, Double knpdKeyid) {
		this.knpdDomain = knpdDomain;
		this.knpdKeyid = knpdKeyid;
	}

	// Property accessors

	public String getKnpdDomain() {
		return this.knpdDomain;
	}

	public void setKnpdDomain(String knpdDomain) {
		this.knpdDomain = knpdDomain;
	}

	public Double getKnpdKeyid() {
		return this.knpdKeyid;
	}

	public void setKnpdKeyid(Double knpdKeyid) {
		this.knpdKeyid = knpdKeyid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnpdDetId))
			return false;
		AbstractKnpdDetId castOther = (AbstractKnpdDetId) other;

		return ((this.getKnpdDomain() == castOther.getKnpdDomain()) || (this
				.getKnpdDomain() != null
				&& castOther.getKnpdDomain() != null && this.getKnpdDomain()
				.equals(castOther.getKnpdDomain())))
				&& ((this.getKnpdKeyid() == castOther.getKnpdKeyid()) || (this
						.getKnpdKeyid() != null
						&& castOther.getKnpdKeyid() != null && this
						.getKnpdKeyid().equals(castOther.getKnpdKeyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnpdDomain() == null ? 0 : this.getKnpdDomain()
						.hashCode());
		result = 37 * result
				+ (getKnpdKeyid() == null ? 0 : this.getKnpdKeyid().hashCode());
		return result;
	}

}