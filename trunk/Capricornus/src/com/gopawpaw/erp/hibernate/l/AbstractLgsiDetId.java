package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLgsiDetId entity provides the base persistence definition of the
 * LgsiDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLgsiDetId implements java.io.Serializable {

	// Fields

	private String lgsiDomain;
	private String lgsiAppId;
	private String lgsiSite;

	// Constructors

	/** default constructor */
	public AbstractLgsiDetId() {
	}

	/** minimal constructor */
	public AbstractLgsiDetId(String lgsiDomain) {
		this.lgsiDomain = lgsiDomain;
	}

	/** full constructor */
	public AbstractLgsiDetId(String lgsiDomain, String lgsiAppId,
			String lgsiSite) {
		this.lgsiDomain = lgsiDomain;
		this.lgsiAppId = lgsiAppId;
		this.lgsiSite = lgsiSite;
	}

	// Property accessors

	public String getLgsiDomain() {
		return this.lgsiDomain;
	}

	public void setLgsiDomain(String lgsiDomain) {
		this.lgsiDomain = lgsiDomain;
	}

	public String getLgsiAppId() {
		return this.lgsiAppId;
	}

	public void setLgsiAppId(String lgsiAppId) {
		this.lgsiAppId = lgsiAppId;
	}

	public String getLgsiSite() {
		return this.lgsiSite;
	}

	public void setLgsiSite(String lgsiSite) {
		this.lgsiSite = lgsiSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLgsiDetId))
			return false;
		AbstractLgsiDetId castOther = (AbstractLgsiDetId) other;

		return ((this.getLgsiDomain() == castOther.getLgsiDomain()) || (this
				.getLgsiDomain() != null
				&& castOther.getLgsiDomain() != null && this.getLgsiDomain()
				.equals(castOther.getLgsiDomain())))
				&& ((this.getLgsiAppId() == castOther.getLgsiAppId()) || (this
						.getLgsiAppId() != null
						&& castOther.getLgsiAppId() != null && this
						.getLgsiAppId().equals(castOther.getLgsiAppId())))
				&& ((this.getLgsiSite() == castOther.getLgsiSite()) || (this
						.getLgsiSite() != null
						&& castOther.getLgsiSite() != null && this
						.getLgsiSite().equals(castOther.getLgsiSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getLgsiDomain() == null ? 0 : this.getLgsiDomain()
						.hashCode());
		result = 37 * result
				+ (getLgsiAppId() == null ? 0 : this.getLgsiAppId().hashCode());
		result = 37 * result
				+ (getLgsiSite() == null ? 0 : this.getLgsiSite().hashCode());
		return result;
	}

}