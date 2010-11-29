package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCslmMstrId entity provides the base persistence definition of the
 * CslmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCslmMstrId implements java.io.Serializable {

	// Fields

	private String cslmDomain;
	private String cslmCtryCode;
	private String cslmAuth;
	private String cslmLicen;
	private String cslmCtrl;

	// Constructors

	/** default constructor */
	public AbstractCslmMstrId() {
	}

	/** minimal constructor */
	public AbstractCslmMstrId(String cslmDomain) {
		this.cslmDomain = cslmDomain;
	}

	/** full constructor */
	public AbstractCslmMstrId(String cslmDomain, String cslmCtryCode,
			String cslmAuth, String cslmLicen, String cslmCtrl) {
		this.cslmDomain = cslmDomain;
		this.cslmCtryCode = cslmCtryCode;
		this.cslmAuth = cslmAuth;
		this.cslmLicen = cslmLicen;
		this.cslmCtrl = cslmCtrl;
	}

	// Property accessors

	public String getCslmDomain() {
		return this.cslmDomain;
	}

	public void setCslmDomain(String cslmDomain) {
		this.cslmDomain = cslmDomain;
	}

	public String getCslmCtryCode() {
		return this.cslmCtryCode;
	}

	public void setCslmCtryCode(String cslmCtryCode) {
		this.cslmCtryCode = cslmCtryCode;
	}

	public String getCslmAuth() {
		return this.cslmAuth;
	}

	public void setCslmAuth(String cslmAuth) {
		this.cslmAuth = cslmAuth;
	}

	public String getCslmLicen() {
		return this.cslmLicen;
	}

	public void setCslmLicen(String cslmLicen) {
		this.cslmLicen = cslmLicen;
	}

	public String getCslmCtrl() {
		return this.cslmCtrl;
	}

	public void setCslmCtrl(String cslmCtrl) {
		this.cslmCtrl = cslmCtrl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCslmMstrId))
			return false;
		AbstractCslmMstrId castOther = (AbstractCslmMstrId) other;

		return ((this.getCslmDomain() == castOther.getCslmDomain()) || (this
				.getCslmDomain() != null
				&& castOther.getCslmDomain() != null && this.getCslmDomain()
				.equals(castOther.getCslmDomain())))
				&& ((this.getCslmCtryCode() == castOther.getCslmCtryCode()) || (this
						.getCslmCtryCode() != null
						&& castOther.getCslmCtryCode() != null && this
						.getCslmCtryCode().equals(castOther.getCslmCtryCode())))
				&& ((this.getCslmAuth() == castOther.getCslmAuth()) || (this
						.getCslmAuth() != null
						&& castOther.getCslmAuth() != null && this
						.getCslmAuth().equals(castOther.getCslmAuth())))
				&& ((this.getCslmLicen() == castOther.getCslmLicen()) || (this
						.getCslmLicen() != null
						&& castOther.getCslmLicen() != null && this
						.getCslmLicen().equals(castOther.getCslmLicen())))
				&& ((this.getCslmCtrl() == castOther.getCslmCtrl()) || (this
						.getCslmCtrl() != null
						&& castOther.getCslmCtrl() != null && this
						.getCslmCtrl().equals(castOther.getCslmCtrl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCslmDomain() == null ? 0 : this.getCslmDomain()
						.hashCode());
		result = 37
				* result
				+ (getCslmCtryCode() == null ? 0 : this.getCslmCtryCode()
						.hashCode());
		result = 37 * result
				+ (getCslmAuth() == null ? 0 : this.getCslmAuth().hashCode());
		result = 37 * result
				+ (getCslmLicen() == null ? 0 : this.getCslmLicen().hashCode());
		result = 37 * result
				+ (getCslmCtrl() == null ? 0 : this.getCslmCtrl().hashCode());
		return result;
	}

}