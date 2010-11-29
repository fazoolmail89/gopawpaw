package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsimMstrId entity provides the base persistence definition of the
 * CsimMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsimMstrId implements java.io.Serializable {

	// Fields

	private String csimDomain;
	private String csimCtryCode;
	private String csimAuth;
	private String csimCtrl;

	// Constructors

	/** default constructor */
	public AbstractCsimMstrId() {
	}

	/** minimal constructor */
	public AbstractCsimMstrId(String csimDomain) {
		this.csimDomain = csimDomain;
	}

	/** full constructor */
	public AbstractCsimMstrId(String csimDomain, String csimCtryCode,
			String csimAuth, String csimCtrl) {
		this.csimDomain = csimDomain;
		this.csimCtryCode = csimCtryCode;
		this.csimAuth = csimAuth;
		this.csimCtrl = csimCtrl;
	}

	// Property accessors

	public String getCsimDomain() {
		return this.csimDomain;
	}

	public void setCsimDomain(String csimDomain) {
		this.csimDomain = csimDomain;
	}

	public String getCsimCtryCode() {
		return this.csimCtryCode;
	}

	public void setCsimCtryCode(String csimCtryCode) {
		this.csimCtryCode = csimCtryCode;
	}

	public String getCsimAuth() {
		return this.csimAuth;
	}

	public void setCsimAuth(String csimAuth) {
		this.csimAuth = csimAuth;
	}

	public String getCsimCtrl() {
		return this.csimCtrl;
	}

	public void setCsimCtrl(String csimCtrl) {
		this.csimCtrl = csimCtrl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCsimMstrId))
			return false;
		AbstractCsimMstrId castOther = (AbstractCsimMstrId) other;

		return ((this.getCsimDomain() == castOther.getCsimDomain()) || (this
				.getCsimDomain() != null
				&& castOther.getCsimDomain() != null && this.getCsimDomain()
				.equals(castOther.getCsimDomain())))
				&& ((this.getCsimCtryCode() == castOther.getCsimCtryCode()) || (this
						.getCsimCtryCode() != null
						&& castOther.getCsimCtryCode() != null && this
						.getCsimCtryCode().equals(castOther.getCsimCtryCode())))
				&& ((this.getCsimAuth() == castOther.getCsimAuth()) || (this
						.getCsimAuth() != null
						&& castOther.getCsimAuth() != null && this
						.getCsimAuth().equals(castOther.getCsimAuth())))
				&& ((this.getCsimCtrl() == castOther.getCsimCtrl()) || (this
						.getCsimCtrl() != null
						&& castOther.getCsimCtrl() != null && this
						.getCsimCtrl().equals(castOther.getCsimCtrl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCsimDomain() == null ? 0 : this.getCsimDomain()
						.hashCode());
		result = 37
				* result
				+ (getCsimCtryCode() == null ? 0 : this.getCsimCtryCode()
						.hashCode());
		result = 37 * result
				+ (getCsimAuth() == null ? 0 : this.getCsimAuth().hashCode());
		result = 37 * result
				+ (getCsimCtrl() == null ? 0 : this.getCsimCtrl().hashCode());
		return result;
	}

}