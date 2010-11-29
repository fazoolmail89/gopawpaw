package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFabdDetId entity provides the base persistence definition of the
 * FabdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabdDetId implements java.io.Serializable {

	// Fields

	private String fabdDomain;
	private Integer fabdSeq;

	// Constructors

	/** default constructor */
	public AbstractFabdDetId() {
	}

	/** full constructor */
	public AbstractFabdDetId(String fabdDomain, Integer fabdSeq) {
		this.fabdDomain = fabdDomain;
		this.fabdSeq = fabdSeq;
	}

	// Property accessors

	public String getFabdDomain() {
		return this.fabdDomain;
	}

	public void setFabdDomain(String fabdDomain) {
		this.fabdDomain = fabdDomain;
	}

	public Integer getFabdSeq() {
		return this.fabdSeq;
	}

	public void setFabdSeq(Integer fabdSeq) {
		this.fabdSeq = fabdSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFabdDetId))
			return false;
		AbstractFabdDetId castOther = (AbstractFabdDetId) other;

		return ((this.getFabdDomain() == castOther.getFabdDomain()) || (this
				.getFabdDomain() != null
				&& castOther.getFabdDomain() != null && this.getFabdDomain()
				.equals(castOther.getFabdDomain())))
				&& ((this.getFabdSeq() == castOther.getFabdSeq()) || (this
						.getFabdSeq() != null
						&& castOther.getFabdSeq() != null && this.getFabdSeq()
						.equals(castOther.getFabdSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFabdDomain() == null ? 0 : this.getFabdDomain()
						.hashCode());
		result = 37 * result
				+ (getFabdSeq() == null ? 0 : this.getFabdSeq().hashCode());
		return result;
	}

}