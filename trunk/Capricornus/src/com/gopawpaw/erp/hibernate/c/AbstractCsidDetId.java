package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsidDetId entity provides the base persistence definition of the
 * CsidDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsidDetId implements java.io.Serializable {

	// Fields

	private String csidDomain;
	private String csidCtryCode;
	private String csidAuth;
	private String csidCtrl;
	private String csidPart;

	// Constructors

	/** default constructor */
	public AbstractCsidDetId() {
	}

	/** minimal constructor */
	public AbstractCsidDetId(String csidDomain) {
		this.csidDomain = csidDomain;
	}

	/** full constructor */
	public AbstractCsidDetId(String csidDomain, String csidCtryCode,
			String csidAuth, String csidCtrl, String csidPart) {
		this.csidDomain = csidDomain;
		this.csidCtryCode = csidCtryCode;
		this.csidAuth = csidAuth;
		this.csidCtrl = csidCtrl;
		this.csidPart = csidPart;
	}

	// Property accessors

	public String getCsidDomain() {
		return this.csidDomain;
	}

	public void setCsidDomain(String csidDomain) {
		this.csidDomain = csidDomain;
	}

	public String getCsidCtryCode() {
		return this.csidCtryCode;
	}

	public void setCsidCtryCode(String csidCtryCode) {
		this.csidCtryCode = csidCtryCode;
	}

	public String getCsidAuth() {
		return this.csidAuth;
	}

	public void setCsidAuth(String csidAuth) {
		this.csidAuth = csidAuth;
	}

	public String getCsidCtrl() {
		return this.csidCtrl;
	}

	public void setCsidCtrl(String csidCtrl) {
		this.csidCtrl = csidCtrl;
	}

	public String getCsidPart() {
		return this.csidPart;
	}

	public void setCsidPart(String csidPart) {
		this.csidPart = csidPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCsidDetId))
			return false;
		AbstractCsidDetId castOther = (AbstractCsidDetId) other;

		return ((this.getCsidDomain() == castOther.getCsidDomain()) || (this
				.getCsidDomain() != null
				&& castOther.getCsidDomain() != null && this.getCsidDomain()
				.equals(castOther.getCsidDomain())))
				&& ((this.getCsidCtryCode() == castOther.getCsidCtryCode()) || (this
						.getCsidCtryCode() != null
						&& castOther.getCsidCtryCode() != null && this
						.getCsidCtryCode().equals(castOther.getCsidCtryCode())))
				&& ((this.getCsidAuth() == castOther.getCsidAuth()) || (this
						.getCsidAuth() != null
						&& castOther.getCsidAuth() != null && this
						.getCsidAuth().equals(castOther.getCsidAuth())))
				&& ((this.getCsidCtrl() == castOther.getCsidCtrl()) || (this
						.getCsidCtrl() != null
						&& castOther.getCsidCtrl() != null && this
						.getCsidCtrl().equals(castOther.getCsidCtrl())))
				&& ((this.getCsidPart() == castOther.getCsidPart()) || (this
						.getCsidPart() != null
						&& castOther.getCsidPart() != null && this
						.getCsidPart().equals(castOther.getCsidPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCsidDomain() == null ? 0 : this.getCsidDomain()
						.hashCode());
		result = 37
				* result
				+ (getCsidCtryCode() == null ? 0 : this.getCsidCtryCode()
						.hashCode());
		result = 37 * result
				+ (getCsidAuth() == null ? 0 : this.getCsidAuth().hashCode());
		result = 37 * result
				+ (getCsidCtrl() == null ? 0 : this.getCsidCtrl().hashCode());
		result = 37 * result
				+ (getCsidPart() == null ? 0 : this.getCsidPart().hashCode());
		return result;
	}

}