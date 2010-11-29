package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlcCalId entity provides the base persistence definition of the
 * GlcCalId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlcCalId implements java.io.Serializable {

	// Fields

	private String glcDomain;
	private Integer glcYear;
	private Integer glcPer;

	// Constructors

	/** default constructor */
	public AbstractGlcCalId() {
	}

	/** minimal constructor */
	public AbstractGlcCalId(String glcDomain) {
		this.glcDomain = glcDomain;
	}

	/** full constructor */
	public AbstractGlcCalId(String glcDomain, Integer glcYear, Integer glcPer) {
		this.glcDomain = glcDomain;
		this.glcYear = glcYear;
		this.glcPer = glcPer;
	}

	// Property accessors

	public String getGlcDomain() {
		return this.glcDomain;
	}

	public void setGlcDomain(String glcDomain) {
		this.glcDomain = glcDomain;
	}

	public Integer getGlcYear() {
		return this.glcYear;
	}

	public void setGlcYear(Integer glcYear) {
		this.glcYear = glcYear;
	}

	public Integer getGlcPer() {
		return this.glcPer;
	}

	public void setGlcPer(Integer glcPer) {
		this.glcPer = glcPer;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGlcCalId))
			return false;
		AbstractGlcCalId castOther = (AbstractGlcCalId) other;

		return ((this.getGlcDomain() == castOther.getGlcDomain()) || (this
				.getGlcDomain() != null
				&& castOther.getGlcDomain() != null && this.getGlcDomain()
				.equals(castOther.getGlcDomain())))
				&& ((this.getGlcYear() == castOther.getGlcYear()) || (this
						.getGlcYear() != null
						&& castOther.getGlcYear() != null && this.getGlcYear()
						.equals(castOther.getGlcYear())))
				&& ((this.getGlcPer() == castOther.getGlcPer()) || (this
						.getGlcPer() != null
						&& castOther.getGlcPer() != null && this.getGlcPer()
						.equals(castOther.getGlcPer())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGlcDomain() == null ? 0 : this.getGlcDomain().hashCode());
		result = 37 * result
				+ (getGlcYear() == null ? 0 : this.getGlcYear().hashCode());
		result = 37 * result
				+ (getGlcPer() == null ? 0 : this.getGlcPer().hashCode());
		return result;
	}

}