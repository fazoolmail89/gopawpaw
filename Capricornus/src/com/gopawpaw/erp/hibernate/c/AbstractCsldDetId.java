package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsldDetId entity provides the base persistence definition of the
 * CsldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsldDetId implements java.io.Serializable {

	// Fields

	private String csldDomain;
	private String csldCtryCode;
	private String csldAuth;
	private String csldLicen;
	private String csldPart;

	// Constructors

	/** default constructor */
	public AbstractCsldDetId() {
	}

	/** minimal constructor */
	public AbstractCsldDetId(String csldDomain) {
		this.csldDomain = csldDomain;
	}

	/** full constructor */
	public AbstractCsldDetId(String csldDomain, String csldCtryCode,
			String csldAuth, String csldLicen, String csldPart) {
		this.csldDomain = csldDomain;
		this.csldCtryCode = csldCtryCode;
		this.csldAuth = csldAuth;
		this.csldLicen = csldLicen;
		this.csldPart = csldPart;
	}

	// Property accessors

	public String getCsldDomain() {
		return this.csldDomain;
	}

	public void setCsldDomain(String csldDomain) {
		this.csldDomain = csldDomain;
	}

	public String getCsldCtryCode() {
		return this.csldCtryCode;
	}

	public void setCsldCtryCode(String csldCtryCode) {
		this.csldCtryCode = csldCtryCode;
	}

	public String getCsldAuth() {
		return this.csldAuth;
	}

	public void setCsldAuth(String csldAuth) {
		this.csldAuth = csldAuth;
	}

	public String getCsldLicen() {
		return this.csldLicen;
	}

	public void setCsldLicen(String csldLicen) {
		this.csldLicen = csldLicen;
	}

	public String getCsldPart() {
		return this.csldPart;
	}

	public void setCsldPart(String csldPart) {
		this.csldPart = csldPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCsldDetId))
			return false;
		AbstractCsldDetId castOther = (AbstractCsldDetId) other;

		return ((this.getCsldDomain() == castOther.getCsldDomain()) || (this
				.getCsldDomain() != null
				&& castOther.getCsldDomain() != null && this.getCsldDomain()
				.equals(castOther.getCsldDomain())))
				&& ((this.getCsldCtryCode() == castOther.getCsldCtryCode()) || (this
						.getCsldCtryCode() != null
						&& castOther.getCsldCtryCode() != null && this
						.getCsldCtryCode().equals(castOther.getCsldCtryCode())))
				&& ((this.getCsldAuth() == castOther.getCsldAuth()) || (this
						.getCsldAuth() != null
						&& castOther.getCsldAuth() != null && this
						.getCsldAuth().equals(castOther.getCsldAuth())))
				&& ((this.getCsldLicen() == castOther.getCsldLicen()) || (this
						.getCsldLicen() != null
						&& castOther.getCsldLicen() != null && this
						.getCsldLicen().equals(castOther.getCsldLicen())))
				&& ((this.getCsldPart() == castOther.getCsldPart()) || (this
						.getCsldPart() != null
						&& castOther.getCsldPart() != null && this
						.getCsldPart().equals(castOther.getCsldPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCsldDomain() == null ? 0 : this.getCsldDomain()
						.hashCode());
		result = 37
				* result
				+ (getCsldCtryCode() == null ? 0 : this.getCsldCtryCode()
						.hashCode());
		result = 37 * result
				+ (getCsldAuth() == null ? 0 : this.getCsldAuth().hashCode());
		result = 37 * result
				+ (getCsldLicen() == null ? 0 : this.getCsldLicen().hashCode());
		result = 37 * result
				+ (getCsldPart() == null ? 0 : this.getCsldPart().hashCode());
		return result;
	}

}