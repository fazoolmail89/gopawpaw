package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFadDetId entity provides the base persistence definition of the
 * FadDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFadDetId implements java.io.Serializable {

	// Fields

	private String fadDomain;
	private String fadTag;

	// Constructors

	/** default constructor */
	public AbstractFadDetId() {
	}

	/** full constructor */
	public AbstractFadDetId(String fadDomain, String fadTag) {
		this.fadDomain = fadDomain;
		this.fadTag = fadTag;
	}

	// Property accessors

	public String getFadDomain() {
		return this.fadDomain;
	}

	public void setFadDomain(String fadDomain) {
		this.fadDomain = fadDomain;
	}

	public String getFadTag() {
		return this.fadTag;
	}

	public void setFadTag(String fadTag) {
		this.fadTag = fadTag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFadDetId))
			return false;
		AbstractFadDetId castOther = (AbstractFadDetId) other;

		return ((this.getFadDomain() == castOther.getFadDomain()) || (this
				.getFadDomain() != null
				&& castOther.getFadDomain() != null && this.getFadDomain()
				.equals(castOther.getFadDomain())))
				&& ((this.getFadTag() == castOther.getFadTag()) || (this
						.getFadTag() != null
						&& castOther.getFadTag() != null && this.getFadTag()
						.equals(castOther.getFadTag())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFadDomain() == null ? 0 : this.getFadDomain().hashCode());
		result = 37 * result
				+ (getFadTag() == null ? 0 : this.getFadTag().hashCode());
		return result;
	}

}