package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlrMstrId entity provides the base persistence definition of the
 * GlrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlrMstrId implements java.io.Serializable {

	// Fields

	private String glrDomain;
	private String glrCode;

	// Constructors

	/** default constructor */
	public AbstractGlrMstrId() {
	}

	/** minimal constructor */
	public AbstractGlrMstrId(String glrDomain) {
		this.glrDomain = glrDomain;
	}

	/** full constructor */
	public AbstractGlrMstrId(String glrDomain, String glrCode) {
		this.glrDomain = glrDomain;
		this.glrCode = glrCode;
	}

	// Property accessors

	public String getGlrDomain() {
		return this.glrDomain;
	}

	public void setGlrDomain(String glrDomain) {
		this.glrDomain = glrDomain;
	}

	public String getGlrCode() {
		return this.glrCode;
	}

	public void setGlrCode(String glrCode) {
		this.glrCode = glrCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGlrMstrId))
			return false;
		AbstractGlrMstrId castOther = (AbstractGlrMstrId) other;

		return ((this.getGlrDomain() == castOther.getGlrDomain()) || (this
				.getGlrDomain() != null
				&& castOther.getGlrDomain() != null && this.getGlrDomain()
				.equals(castOther.getGlrDomain())))
				&& ((this.getGlrCode() == castOther.getGlrCode()) || (this
						.getGlrCode() != null
						&& castOther.getGlrCode() != null && this.getGlrCode()
						.equals(castOther.getGlrCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGlrDomain() == null ? 0 : this.getGlrDomain().hashCode());
		result = 37 * result
				+ (getGlrCode() == null ? 0 : this.getGlrCode().hashCode());
		return result;
	}

}