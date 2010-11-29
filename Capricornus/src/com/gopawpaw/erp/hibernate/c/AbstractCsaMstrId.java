package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsaMstrId entity provides the base persistence definition of the
 * CsaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsaMstrId implements java.io.Serializable {

	// Fields

	private String csaDomain;
	private String csaAuth;

	// Constructors

	/** default constructor */
	public AbstractCsaMstrId() {
	}

	/** minimal constructor */
	public AbstractCsaMstrId(String csaDomain) {
		this.csaDomain = csaDomain;
	}

	/** full constructor */
	public AbstractCsaMstrId(String csaDomain, String csaAuth) {
		this.csaDomain = csaDomain;
		this.csaAuth = csaAuth;
	}

	// Property accessors

	public String getCsaDomain() {
		return this.csaDomain;
	}

	public void setCsaDomain(String csaDomain) {
		this.csaDomain = csaDomain;
	}

	public String getCsaAuth() {
		return this.csaAuth;
	}

	public void setCsaAuth(String csaAuth) {
		this.csaAuth = csaAuth;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCsaMstrId))
			return false;
		AbstractCsaMstrId castOther = (AbstractCsaMstrId) other;

		return ((this.getCsaDomain() == castOther.getCsaDomain()) || (this
				.getCsaDomain() != null
				&& castOther.getCsaDomain() != null && this.getCsaDomain()
				.equals(castOther.getCsaDomain())))
				&& ((this.getCsaAuth() == castOther.getCsaAuth()) || (this
						.getCsaAuth() != null
						&& castOther.getCsaAuth() != null && this.getCsaAuth()
						.equals(castOther.getCsaAuth())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCsaDomain() == null ? 0 : this.getCsaDomain().hashCode());
		result = 37 * result
				+ (getCsaAuth() == null ? 0 : this.getCsaAuth().hashCode());
		return result;
	}

}