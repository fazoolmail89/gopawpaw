package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSsdDetId entity provides the base persistence definition of the
 * SsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSsdDetId implements java.io.Serializable {

	// Fields

	private String ssdDomain;
	private String ssdNetwork;
	private String ssdRecSite;
	private String ssdSrcSite;
	private String ssdRef;

	// Constructors

	/** default constructor */
	public AbstractSsdDetId() {
	}

	/** minimal constructor */
	public AbstractSsdDetId(String ssdDomain) {
		this.ssdDomain = ssdDomain;
	}

	/** full constructor */
	public AbstractSsdDetId(String ssdDomain, String ssdNetwork,
			String ssdRecSite, String ssdSrcSite, String ssdRef) {
		this.ssdDomain = ssdDomain;
		this.ssdNetwork = ssdNetwork;
		this.ssdRecSite = ssdRecSite;
		this.ssdSrcSite = ssdSrcSite;
		this.ssdRef = ssdRef;
	}

	// Property accessors

	public String getSsdDomain() {
		return this.ssdDomain;
	}

	public void setSsdDomain(String ssdDomain) {
		this.ssdDomain = ssdDomain;
	}

	public String getSsdNetwork() {
		return this.ssdNetwork;
	}

	public void setSsdNetwork(String ssdNetwork) {
		this.ssdNetwork = ssdNetwork;
	}

	public String getSsdRecSite() {
		return this.ssdRecSite;
	}

	public void setSsdRecSite(String ssdRecSite) {
		this.ssdRecSite = ssdRecSite;
	}

	public String getSsdSrcSite() {
		return this.ssdSrcSite;
	}

	public void setSsdSrcSite(String ssdSrcSite) {
		this.ssdSrcSite = ssdSrcSite;
	}

	public String getSsdRef() {
		return this.ssdRef;
	}

	public void setSsdRef(String ssdRef) {
		this.ssdRef = ssdRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSsdDetId))
			return false;
		AbstractSsdDetId castOther = (AbstractSsdDetId) other;

		return ((this.getSsdDomain() == castOther.getSsdDomain()) || (this
				.getSsdDomain() != null
				&& castOther.getSsdDomain() != null && this.getSsdDomain()
				.equals(castOther.getSsdDomain())))
				&& ((this.getSsdNetwork() == castOther.getSsdNetwork()) || (this
						.getSsdNetwork() != null
						&& castOther.getSsdNetwork() != null && this
						.getSsdNetwork().equals(castOther.getSsdNetwork())))
				&& ((this.getSsdRecSite() == castOther.getSsdRecSite()) || (this
						.getSsdRecSite() != null
						&& castOther.getSsdRecSite() != null && this
						.getSsdRecSite().equals(castOther.getSsdRecSite())))
				&& ((this.getSsdSrcSite() == castOther.getSsdSrcSite()) || (this
						.getSsdSrcSite() != null
						&& castOther.getSsdSrcSite() != null && this
						.getSsdSrcSite().equals(castOther.getSsdSrcSite())))
				&& ((this.getSsdRef() == castOther.getSsdRef()) || (this
						.getSsdRef() != null
						&& castOther.getSsdRef() != null && this.getSsdRef()
						.equals(castOther.getSsdRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSsdDomain() == null ? 0 : this.getSsdDomain().hashCode());
		result = 37
				* result
				+ (getSsdNetwork() == null ? 0 : this.getSsdNetwork()
						.hashCode());
		result = 37
				* result
				+ (getSsdRecSite() == null ? 0 : this.getSsdRecSite()
						.hashCode());
		result = 37
				* result
				+ (getSsdSrcSite() == null ? 0 : this.getSsdSrcSite()
						.hashCode());
		result = 37 * result
				+ (getSsdRef() == null ? 0 : this.getSsdRef().hashCode());
		return result;
	}

}