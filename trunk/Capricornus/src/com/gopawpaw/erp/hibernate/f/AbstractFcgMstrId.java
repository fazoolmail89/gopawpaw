package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFcgMstrId entity provides the base persistence definition of the
 * FcgMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFcgMstrId implements java.io.Serializable {

	// Fields

	private String fcgDomain;
	private String fcgCode;

	// Constructors

	/** default constructor */
	public AbstractFcgMstrId() {
	}

	/** minimal constructor */
	public AbstractFcgMstrId(String fcgDomain) {
		this.fcgDomain = fcgDomain;
	}

	/** full constructor */
	public AbstractFcgMstrId(String fcgDomain, String fcgCode) {
		this.fcgDomain = fcgDomain;
		this.fcgCode = fcgCode;
	}

	// Property accessors

	public String getFcgDomain() {
		return this.fcgDomain;
	}

	public void setFcgDomain(String fcgDomain) {
		this.fcgDomain = fcgDomain;
	}

	public String getFcgCode() {
		return this.fcgCode;
	}

	public void setFcgCode(String fcgCode) {
		this.fcgCode = fcgCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFcgMstrId))
			return false;
		AbstractFcgMstrId castOther = (AbstractFcgMstrId) other;

		return ((this.getFcgDomain() == castOther.getFcgDomain()) || (this
				.getFcgDomain() != null
				&& castOther.getFcgDomain() != null && this.getFcgDomain()
				.equals(castOther.getFcgDomain())))
				&& ((this.getFcgCode() == castOther.getFcgCode()) || (this
						.getFcgCode() != null
						&& castOther.getFcgCode() != null && this.getFcgCode()
						.equals(castOther.getFcgCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFcgDomain() == null ? 0 : this.getFcgDomain().hashCode());
		result = 37 * result
				+ (getFcgCode() == null ? 0 : this.getFcgCode().hashCode());
		return result;
	}

}