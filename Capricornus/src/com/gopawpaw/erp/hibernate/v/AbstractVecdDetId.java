package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVecdDetId entity provides the base persistence definition of the
 * VecdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVecdDetId implements java.io.Serializable {

	// Fields

	private String vecdDomain;
	private String vecdCategory;
	private Double vecdValueFrom;

	// Constructors

	/** default constructor */
	public AbstractVecdDetId() {
	}

	/** full constructor */
	public AbstractVecdDetId(String vecdDomain, String vecdCategory,
			Double vecdValueFrom) {
		this.vecdDomain = vecdDomain;
		this.vecdCategory = vecdCategory;
		this.vecdValueFrom = vecdValueFrom;
	}

	// Property accessors

	public String getVecdDomain() {
		return this.vecdDomain;
	}

	public void setVecdDomain(String vecdDomain) {
		this.vecdDomain = vecdDomain;
	}

	public String getVecdCategory() {
		return this.vecdCategory;
	}

	public void setVecdCategory(String vecdCategory) {
		this.vecdCategory = vecdCategory;
	}

	public Double getVecdValueFrom() {
		return this.vecdValueFrom;
	}

	public void setVecdValueFrom(Double vecdValueFrom) {
		this.vecdValueFrom = vecdValueFrom;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVecdDetId))
			return false;
		AbstractVecdDetId castOther = (AbstractVecdDetId) other;

		return ((this.getVecdDomain() == castOther.getVecdDomain()) || (this
				.getVecdDomain() != null
				&& castOther.getVecdDomain() != null && this.getVecdDomain()
				.equals(castOther.getVecdDomain())))
				&& ((this.getVecdCategory() == castOther.getVecdCategory()) || (this
						.getVecdCategory() != null
						&& castOther.getVecdCategory() != null && this
						.getVecdCategory().equals(castOther.getVecdCategory())))
				&& ((this.getVecdValueFrom() == castOther.getVecdValueFrom()) || (this
						.getVecdValueFrom() != null
						&& castOther.getVecdValueFrom() != null && this
						.getVecdValueFrom()
						.equals(castOther.getVecdValueFrom())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getVecdDomain() == null ? 0 : this.getVecdDomain()
						.hashCode());
		result = 37
				* result
				+ (getVecdCategory() == null ? 0 : this.getVecdCategory()
						.hashCode());
		result = 37
				* result
				+ (getVecdValueFrom() == null ? 0 : this.getVecdValueFrom()
						.hashCode());
		return result;
	}

}