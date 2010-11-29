package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGipDetId entity provides the base persistence definition of the
 * GipDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGipDetId implements java.io.Serializable {

	// Fields

	private String gipDomain;
	private Integer gipRefKey;
	private String gipAttribute;

	// Constructors

	/** default constructor */
	public AbstractGipDetId() {
	}

	/** full constructor */
	public AbstractGipDetId(String gipDomain, Integer gipRefKey,
			String gipAttribute) {
		this.gipDomain = gipDomain;
		this.gipRefKey = gipRefKey;
		this.gipAttribute = gipAttribute;
	}

	// Property accessors

	public String getGipDomain() {
		return this.gipDomain;
	}

	public void setGipDomain(String gipDomain) {
		this.gipDomain = gipDomain;
	}

	public Integer getGipRefKey() {
		return this.gipRefKey;
	}

	public void setGipRefKey(Integer gipRefKey) {
		this.gipRefKey = gipRefKey;
	}

	public String getGipAttribute() {
		return this.gipAttribute;
	}

	public void setGipAttribute(String gipAttribute) {
		this.gipAttribute = gipAttribute;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGipDetId))
			return false;
		AbstractGipDetId castOther = (AbstractGipDetId) other;

		return ((this.getGipDomain() == castOther.getGipDomain()) || (this
				.getGipDomain() != null
				&& castOther.getGipDomain() != null && this.getGipDomain()
				.equals(castOther.getGipDomain())))
				&& ((this.getGipRefKey() == castOther.getGipRefKey()) || (this
						.getGipRefKey() != null
						&& castOther.getGipRefKey() != null && this
						.getGipRefKey().equals(castOther.getGipRefKey())))
				&& ((this.getGipAttribute() == castOther.getGipAttribute()) || (this
						.getGipAttribute() != null
						&& castOther.getGipAttribute() != null && this
						.getGipAttribute().equals(castOther.getGipAttribute())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGipDomain() == null ? 0 : this.getGipDomain().hashCode());
		result = 37 * result
				+ (getGipRefKey() == null ? 0 : this.getGipRefKey().hashCode());
		result = 37
				* result
				+ (getGipAttribute() == null ? 0 : this.getGipAttribute()
						.hashCode());
		return result;
	}

}