package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRbmMstrId entity provides the base persistence definition of the
 * RbmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRbmMstrId implements java.io.Serializable {

	// Fields

	private String rbmDomain;
	private String rbmCust;
	private String rbmAuth;

	// Constructors

	/** default constructor */
	public AbstractRbmMstrId() {
	}

	/** minimal constructor */
	public AbstractRbmMstrId(String rbmDomain) {
		this.rbmDomain = rbmDomain;
	}

	/** full constructor */
	public AbstractRbmMstrId(String rbmDomain, String rbmCust, String rbmAuth) {
		this.rbmDomain = rbmDomain;
		this.rbmCust = rbmCust;
		this.rbmAuth = rbmAuth;
	}

	// Property accessors

	public String getRbmDomain() {
		return this.rbmDomain;
	}

	public void setRbmDomain(String rbmDomain) {
		this.rbmDomain = rbmDomain;
	}

	public String getRbmCust() {
		return this.rbmCust;
	}

	public void setRbmCust(String rbmCust) {
		this.rbmCust = rbmCust;
	}

	public String getRbmAuth() {
		return this.rbmAuth;
	}

	public void setRbmAuth(String rbmAuth) {
		this.rbmAuth = rbmAuth;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRbmMstrId))
			return false;
		AbstractRbmMstrId castOther = (AbstractRbmMstrId) other;

		return ((this.getRbmDomain() == castOther.getRbmDomain()) || (this
				.getRbmDomain() != null
				&& castOther.getRbmDomain() != null && this.getRbmDomain()
				.equals(castOther.getRbmDomain())))
				&& ((this.getRbmCust() == castOther.getRbmCust()) || (this
						.getRbmCust() != null
						&& castOther.getRbmCust() != null && this.getRbmCust()
						.equals(castOther.getRbmCust())))
				&& ((this.getRbmAuth() == castOther.getRbmAuth()) || (this
						.getRbmAuth() != null
						&& castOther.getRbmAuth() != null && this.getRbmAuth()
						.equals(castOther.getRbmAuth())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRbmDomain() == null ? 0 : this.getRbmDomain().hashCode());
		result = 37 * result
				+ (getRbmCust() == null ? 0 : this.getRbmCust().hashCode());
		result = 37 * result
				+ (getRbmAuth() == null ? 0 : this.getRbmAuth().hashCode());
		return result;
	}

}