package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPlsdDetId entity provides the base persistence definition of the
 * PlsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlsdDetId implements java.io.Serializable {

	// Fields

	private String plsdDomain;
	private String plsdProdline;
	private String plsdSite;
	private String plsdCmtype;
	private String plsdChannel;

	// Constructors

	/** default constructor */
	public AbstractPlsdDetId() {
	}

	/** minimal constructor */
	public AbstractPlsdDetId(String plsdDomain, String plsdProdline) {
		this.plsdDomain = plsdDomain;
		this.plsdProdline = plsdProdline;
	}

	/** full constructor */
	public AbstractPlsdDetId(String plsdDomain, String plsdProdline,
			String plsdSite, String plsdCmtype, String plsdChannel) {
		this.plsdDomain = plsdDomain;
		this.plsdProdline = plsdProdline;
		this.plsdSite = plsdSite;
		this.plsdCmtype = plsdCmtype;
		this.plsdChannel = plsdChannel;
	}

	// Property accessors

	public String getPlsdDomain() {
		return this.plsdDomain;
	}

	public void setPlsdDomain(String plsdDomain) {
		this.plsdDomain = plsdDomain;
	}

	public String getPlsdProdline() {
		return this.plsdProdline;
	}

	public void setPlsdProdline(String plsdProdline) {
		this.plsdProdline = plsdProdline;
	}

	public String getPlsdSite() {
		return this.plsdSite;
	}

	public void setPlsdSite(String plsdSite) {
		this.plsdSite = plsdSite;
	}

	public String getPlsdCmtype() {
		return this.plsdCmtype;
	}

	public void setPlsdCmtype(String plsdCmtype) {
		this.plsdCmtype = plsdCmtype;
	}

	public String getPlsdChannel() {
		return this.plsdChannel;
	}

	public void setPlsdChannel(String plsdChannel) {
		this.plsdChannel = plsdChannel;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPlsdDetId))
			return false;
		AbstractPlsdDetId castOther = (AbstractPlsdDetId) other;

		return ((this.getPlsdDomain() == castOther.getPlsdDomain()) || (this
				.getPlsdDomain() != null
				&& castOther.getPlsdDomain() != null && this.getPlsdDomain()
				.equals(castOther.getPlsdDomain())))
				&& ((this.getPlsdProdline() == castOther.getPlsdProdline()) || (this
						.getPlsdProdline() != null
						&& castOther.getPlsdProdline() != null && this
						.getPlsdProdline().equals(castOther.getPlsdProdline())))
				&& ((this.getPlsdSite() == castOther.getPlsdSite()) || (this
						.getPlsdSite() != null
						&& castOther.getPlsdSite() != null && this
						.getPlsdSite().equals(castOther.getPlsdSite())))
				&& ((this.getPlsdCmtype() == castOther.getPlsdCmtype()) || (this
						.getPlsdCmtype() != null
						&& castOther.getPlsdCmtype() != null && this
						.getPlsdCmtype().equals(castOther.getPlsdCmtype())))
				&& ((this.getPlsdChannel() == castOther.getPlsdChannel()) || (this
						.getPlsdChannel() != null
						&& castOther.getPlsdChannel() != null && this
						.getPlsdChannel().equals(castOther.getPlsdChannel())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPlsdDomain() == null ? 0 : this.getPlsdDomain()
						.hashCode());
		result = 37
				* result
				+ (getPlsdProdline() == null ? 0 : this.getPlsdProdline()
						.hashCode());
		result = 37 * result
				+ (getPlsdSite() == null ? 0 : this.getPlsdSite().hashCode());
		result = 37
				* result
				+ (getPlsdCmtype() == null ? 0 : this.getPlsdCmtype()
						.hashCode());
		result = 37
				* result
				+ (getPlsdChannel() == null ? 0 : this.getPlsdChannel()
						.hashCode());
		return result;
	}

}