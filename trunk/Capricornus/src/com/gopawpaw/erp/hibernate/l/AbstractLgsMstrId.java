package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLgsMstrId entity provides the base persistence definition of the
 * LgsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLgsMstrId implements java.io.Serializable {

	// Fields

	private String lgsDomain;
	private String lgsAppId;

	// Constructors

	/** default constructor */
	public AbstractLgsMstrId() {
	}

	/** minimal constructor */
	public AbstractLgsMstrId(String lgsDomain) {
		this.lgsDomain = lgsDomain;
	}

	/** full constructor */
	public AbstractLgsMstrId(String lgsDomain, String lgsAppId) {
		this.lgsDomain = lgsDomain;
		this.lgsAppId = lgsAppId;
	}

	// Property accessors

	public String getLgsDomain() {
		return this.lgsDomain;
	}

	public void setLgsDomain(String lgsDomain) {
		this.lgsDomain = lgsDomain;
	}

	public String getLgsAppId() {
		return this.lgsAppId;
	}

	public void setLgsAppId(String lgsAppId) {
		this.lgsAppId = lgsAppId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLgsMstrId))
			return false;
		AbstractLgsMstrId castOther = (AbstractLgsMstrId) other;

		return ((this.getLgsDomain() == castOther.getLgsDomain()) || (this
				.getLgsDomain() != null
				&& castOther.getLgsDomain() != null && this.getLgsDomain()
				.equals(castOther.getLgsDomain())))
				&& ((this.getLgsAppId() == castOther.getLgsAppId()) || (this
						.getLgsAppId() != null
						&& castOther.getLgsAppId() != null && this
						.getLgsAppId().equals(castOther.getLgsAppId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLgsDomain() == null ? 0 : this.getLgsDomain().hashCode());
		result = 37 * result
				+ (getLgsAppId() == null ? 0 : this.getLgsAppId().hashCode());
		return result;
	}

}