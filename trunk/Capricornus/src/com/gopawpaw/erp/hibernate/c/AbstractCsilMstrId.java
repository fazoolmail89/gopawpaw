package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsilMstrId entity provides the base persistence definition of the
 * CsilMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsilMstrId implements java.io.Serializable {

	// Fields

	private String csilDomain;
	private String csilCtryCode;
	private String csilAuth;
	private String csilLicen;

	// Constructors

	/** default constructor */
	public AbstractCsilMstrId() {
	}

	/** minimal constructor */
	public AbstractCsilMstrId(String csilDomain) {
		this.csilDomain = csilDomain;
	}

	/** full constructor */
	public AbstractCsilMstrId(String csilDomain, String csilCtryCode,
			String csilAuth, String csilLicen) {
		this.csilDomain = csilDomain;
		this.csilCtryCode = csilCtryCode;
		this.csilAuth = csilAuth;
		this.csilLicen = csilLicen;
	}

	// Property accessors

	public String getCsilDomain() {
		return this.csilDomain;
	}

	public void setCsilDomain(String csilDomain) {
		this.csilDomain = csilDomain;
	}

	public String getCsilCtryCode() {
		return this.csilCtryCode;
	}

	public void setCsilCtryCode(String csilCtryCode) {
		this.csilCtryCode = csilCtryCode;
	}

	public String getCsilAuth() {
		return this.csilAuth;
	}

	public void setCsilAuth(String csilAuth) {
		this.csilAuth = csilAuth;
	}

	public String getCsilLicen() {
		return this.csilLicen;
	}

	public void setCsilLicen(String csilLicen) {
		this.csilLicen = csilLicen;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCsilMstrId))
			return false;
		AbstractCsilMstrId castOther = (AbstractCsilMstrId) other;

		return ((this.getCsilDomain() == castOther.getCsilDomain()) || (this
				.getCsilDomain() != null
				&& castOther.getCsilDomain() != null && this.getCsilDomain()
				.equals(castOther.getCsilDomain())))
				&& ((this.getCsilCtryCode() == castOther.getCsilCtryCode()) || (this
						.getCsilCtryCode() != null
						&& castOther.getCsilCtryCode() != null && this
						.getCsilCtryCode().equals(castOther.getCsilCtryCode())))
				&& ((this.getCsilAuth() == castOther.getCsilAuth()) || (this
						.getCsilAuth() != null
						&& castOther.getCsilAuth() != null && this
						.getCsilAuth().equals(castOther.getCsilAuth())))
				&& ((this.getCsilLicen() == castOther.getCsilLicen()) || (this
						.getCsilLicen() != null
						&& castOther.getCsilLicen() != null && this
						.getCsilLicen().equals(castOther.getCsilLicen())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCsilDomain() == null ? 0 : this.getCsilDomain()
						.hashCode());
		result = 37
				* result
				+ (getCsilCtryCode() == null ? 0 : this.getCsilCtryCode()
						.hashCode());
		result = 37 * result
				+ (getCsilAuth() == null ? 0 : this.getCsilAuth().hashCode());
		result = 37 * result
				+ (getCsilLicen() == null ? 0 : this.getCsilLicen().hashCode());
		return result;
	}

}