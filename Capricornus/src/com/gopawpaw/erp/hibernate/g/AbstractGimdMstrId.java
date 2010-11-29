package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGimdMstrId entity provides the base persistence definition of the
 * GimdMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGimdMstrId implements java.io.Serializable {

	// Fields

	private String gimdDomain;
	private String gimdAppCode;
	private String gimdModelName;

	// Constructors

	/** default constructor */
	public AbstractGimdMstrId() {
	}

	/** full constructor */
	public AbstractGimdMstrId(String gimdDomain, String gimdAppCode,
			String gimdModelName) {
		this.gimdDomain = gimdDomain;
		this.gimdAppCode = gimdAppCode;
		this.gimdModelName = gimdModelName;
	}

	// Property accessors

	public String getGimdDomain() {
		return this.gimdDomain;
	}

	public void setGimdDomain(String gimdDomain) {
		this.gimdDomain = gimdDomain;
	}

	public String getGimdAppCode() {
		return this.gimdAppCode;
	}

	public void setGimdAppCode(String gimdAppCode) {
		this.gimdAppCode = gimdAppCode;
	}

	public String getGimdModelName() {
		return this.gimdModelName;
	}

	public void setGimdModelName(String gimdModelName) {
		this.gimdModelName = gimdModelName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGimdMstrId))
			return false;
		AbstractGimdMstrId castOther = (AbstractGimdMstrId) other;

		return ((this.getGimdDomain() == castOther.getGimdDomain()) || (this
				.getGimdDomain() != null
				&& castOther.getGimdDomain() != null && this.getGimdDomain()
				.equals(castOther.getGimdDomain())))
				&& ((this.getGimdAppCode() == castOther.getGimdAppCode()) || (this
						.getGimdAppCode() != null
						&& castOther.getGimdAppCode() != null && this
						.getGimdAppCode().equals(castOther.getGimdAppCode())))
				&& ((this.getGimdModelName() == castOther.getGimdModelName()) || (this
						.getGimdModelName() != null
						&& castOther.getGimdModelName() != null && this
						.getGimdModelName()
						.equals(castOther.getGimdModelName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGimdDomain() == null ? 0 : this.getGimdDomain()
						.hashCode());
		result = 37
				* result
				+ (getGimdAppCode() == null ? 0 : this.getGimdAppCode()
						.hashCode());
		result = 37
				* result
				+ (getGimdModelName() == null ? 0 : this.getGimdModelName()
						.hashCode());
		return result;
	}

}