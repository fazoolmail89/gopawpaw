package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbMstrId entity provides the base persistence definition of the
 * KnbMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbMstrId implements java.io.Serializable {

	// Fields

	private String knbDomain;
	private Double knbKeyid;

	// Constructors

	/** default constructor */
	public AbstractKnbMstrId() {
	}

	/** full constructor */
	public AbstractKnbMstrId(String knbDomain, Double knbKeyid) {
		this.knbDomain = knbDomain;
		this.knbKeyid = knbKeyid;
	}

	// Property accessors

	public String getKnbDomain() {
		return this.knbDomain;
	}

	public void setKnbDomain(String knbDomain) {
		this.knbDomain = knbDomain;
	}

	public Double getKnbKeyid() {
		return this.knbKeyid;
	}

	public void setKnbKeyid(Double knbKeyid) {
		this.knbKeyid = knbKeyid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbMstrId))
			return false;
		AbstractKnbMstrId castOther = (AbstractKnbMstrId) other;

		return ((this.getKnbDomain() == castOther.getKnbDomain()) || (this
				.getKnbDomain() != null
				&& castOther.getKnbDomain() != null && this.getKnbDomain()
				.equals(castOther.getKnbDomain())))
				&& ((this.getKnbKeyid() == castOther.getKnbKeyid()) || (this
						.getKnbKeyid() != null
						&& castOther.getKnbKeyid() != null && this
						.getKnbKeyid().equals(castOther.getKnbKeyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getKnbDomain() == null ? 0 : this.getKnbDomain().hashCode());
		result = 37 * result
				+ (getKnbKeyid() == null ? 0 : this.getKnbKeyid().hashCode());
		return result;
	}

}