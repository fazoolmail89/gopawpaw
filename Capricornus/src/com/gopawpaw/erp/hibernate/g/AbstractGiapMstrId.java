package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGiapMstrId entity provides the base persistence definition of the
 * GiapMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGiapMstrId implements java.io.Serializable {

	// Fields

	private String giapDomain;
	private String giapAppCode;

	// Constructors

	/** default constructor */
	public AbstractGiapMstrId() {
	}

	/** full constructor */
	public AbstractGiapMstrId(String giapDomain, String giapAppCode) {
		this.giapDomain = giapDomain;
		this.giapAppCode = giapAppCode;
	}

	// Property accessors

	public String getGiapDomain() {
		return this.giapDomain;
	}

	public void setGiapDomain(String giapDomain) {
		this.giapDomain = giapDomain;
	}

	public String getGiapAppCode() {
		return this.giapAppCode;
	}

	public void setGiapAppCode(String giapAppCode) {
		this.giapAppCode = giapAppCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGiapMstrId))
			return false;
		AbstractGiapMstrId castOther = (AbstractGiapMstrId) other;

		return ((this.getGiapDomain() == castOther.getGiapDomain()) || (this
				.getGiapDomain() != null
				&& castOther.getGiapDomain() != null && this.getGiapDomain()
				.equals(castOther.getGiapDomain())))
				&& ((this.getGiapAppCode() == castOther.getGiapAppCode()) || (this
						.getGiapAppCode() != null
						&& castOther.getGiapAppCode() != null && this
						.getGiapAppCode().equals(castOther.getGiapAppCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGiapDomain() == null ? 0 : this.getGiapDomain()
						.hashCode());
		result = 37
				* result
				+ (getGiapAppCode() == null ? 0 : this.getGiapAppCode()
						.hashCode());
		return result;
	}

}