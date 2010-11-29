package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCssMstrId entity provides the base persistence definition of the
 * CssMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCssMstrId implements java.io.Serializable {

	// Fields

	private String cssDomain;
	private String cssCtryCode;
	private String cssAuth;
	private String cssSite;

	// Constructors

	/** default constructor */
	public AbstractCssMstrId() {
	}

	/** minimal constructor */
	public AbstractCssMstrId(String cssDomain) {
		this.cssDomain = cssDomain;
	}

	/** full constructor */
	public AbstractCssMstrId(String cssDomain, String cssCtryCode,
			String cssAuth, String cssSite) {
		this.cssDomain = cssDomain;
		this.cssCtryCode = cssCtryCode;
		this.cssAuth = cssAuth;
		this.cssSite = cssSite;
	}

	// Property accessors

	public String getCssDomain() {
		return this.cssDomain;
	}

	public void setCssDomain(String cssDomain) {
		this.cssDomain = cssDomain;
	}

	public String getCssCtryCode() {
		return this.cssCtryCode;
	}

	public void setCssCtryCode(String cssCtryCode) {
		this.cssCtryCode = cssCtryCode;
	}

	public String getCssAuth() {
		return this.cssAuth;
	}

	public void setCssAuth(String cssAuth) {
		this.cssAuth = cssAuth;
	}

	public String getCssSite() {
		return this.cssSite;
	}

	public void setCssSite(String cssSite) {
		this.cssSite = cssSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCssMstrId))
			return false;
		AbstractCssMstrId castOther = (AbstractCssMstrId) other;

		return ((this.getCssDomain() == castOther.getCssDomain()) || (this
				.getCssDomain() != null
				&& castOther.getCssDomain() != null && this.getCssDomain()
				.equals(castOther.getCssDomain())))
				&& ((this.getCssCtryCode() == castOther.getCssCtryCode()) || (this
						.getCssCtryCode() != null
						&& castOther.getCssCtryCode() != null && this
						.getCssCtryCode().equals(castOther.getCssCtryCode())))
				&& ((this.getCssAuth() == castOther.getCssAuth()) || (this
						.getCssAuth() != null
						&& castOther.getCssAuth() != null && this.getCssAuth()
						.equals(castOther.getCssAuth())))
				&& ((this.getCssSite() == castOther.getCssSite()) || (this
						.getCssSite() != null
						&& castOther.getCssSite() != null && this.getCssSite()
						.equals(castOther.getCssSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCssDomain() == null ? 0 : this.getCssDomain().hashCode());
		result = 37
				* result
				+ (getCssCtryCode() == null ? 0 : this.getCssCtryCode()
						.hashCode());
		result = 37 * result
				+ (getCssAuth() == null ? 0 : this.getCssAuth().hashCode());
		result = 37 * result
				+ (getCssSite() == null ? 0 : this.getCssSite().hashCode());
		return result;
	}

}