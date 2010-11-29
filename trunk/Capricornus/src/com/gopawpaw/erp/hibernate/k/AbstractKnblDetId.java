package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnblDetId entity provides the base persistence definition of the
 * KnblDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnblDetId implements java.io.Serializable {

	// Fields

	private String knblDomain;
	private Double knblKeyid;

	// Constructors

	/** default constructor */
	public AbstractKnblDetId() {
	}

	/** full constructor */
	public AbstractKnblDetId(String knblDomain, Double knblKeyid) {
		this.knblDomain = knblDomain;
		this.knblKeyid = knblKeyid;
	}

	// Property accessors

	public String getKnblDomain() {
		return this.knblDomain;
	}

	public void setKnblDomain(String knblDomain) {
		this.knblDomain = knblDomain;
	}

	public Double getKnblKeyid() {
		return this.knblKeyid;
	}

	public void setKnblKeyid(Double knblKeyid) {
		this.knblKeyid = knblKeyid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnblDetId))
			return false;
		AbstractKnblDetId castOther = (AbstractKnblDetId) other;

		return ((this.getKnblDomain() == castOther.getKnblDomain()) || (this
				.getKnblDomain() != null
				&& castOther.getKnblDomain() != null && this.getKnblDomain()
				.equals(castOther.getKnblDomain())))
				&& ((this.getKnblKeyid() == castOther.getKnblKeyid()) || (this
						.getKnblKeyid() != null
						&& castOther.getKnblKeyid() != null && this
						.getKnblKeyid().equals(castOther.getKnblKeyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnblDomain() == null ? 0 : this.getKnblDomain()
						.hashCode());
		result = 37 * result
				+ (getKnblKeyid() == null ? 0 : this.getKnblKeyid().hashCode());
		return result;
	}

}