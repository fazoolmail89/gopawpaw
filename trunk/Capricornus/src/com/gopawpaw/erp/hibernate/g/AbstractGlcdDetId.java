package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlcdDetId entity provides the base persistence definition of the
 * GlcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlcdDetId implements java.io.Serializable {

	// Fields

	private String glcdDomain;
	private Integer glcdYear;
	private Integer glcdPer;
	private String glcdEntity;

	// Constructors

	/** default constructor */
	public AbstractGlcdDetId() {
	}

	/** minimal constructor */
	public AbstractGlcdDetId(String glcdDomain) {
		this.glcdDomain = glcdDomain;
	}

	/** full constructor */
	public AbstractGlcdDetId(String glcdDomain, Integer glcdYear,
			Integer glcdPer, String glcdEntity) {
		this.glcdDomain = glcdDomain;
		this.glcdYear = glcdYear;
		this.glcdPer = glcdPer;
		this.glcdEntity = glcdEntity;
	}

	// Property accessors

	public String getGlcdDomain() {
		return this.glcdDomain;
	}

	public void setGlcdDomain(String glcdDomain) {
		this.glcdDomain = glcdDomain;
	}

	public Integer getGlcdYear() {
		return this.glcdYear;
	}

	public void setGlcdYear(Integer glcdYear) {
		this.glcdYear = glcdYear;
	}

	public Integer getGlcdPer() {
		return this.glcdPer;
	}

	public void setGlcdPer(Integer glcdPer) {
		this.glcdPer = glcdPer;
	}

	public String getGlcdEntity() {
		return this.glcdEntity;
	}

	public void setGlcdEntity(String glcdEntity) {
		this.glcdEntity = glcdEntity;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGlcdDetId))
			return false;
		AbstractGlcdDetId castOther = (AbstractGlcdDetId) other;

		return ((this.getGlcdDomain() == castOther.getGlcdDomain()) || (this
				.getGlcdDomain() != null
				&& castOther.getGlcdDomain() != null && this.getGlcdDomain()
				.equals(castOther.getGlcdDomain())))
				&& ((this.getGlcdYear() == castOther.getGlcdYear()) || (this
						.getGlcdYear() != null
						&& castOther.getGlcdYear() != null && this
						.getGlcdYear().equals(castOther.getGlcdYear())))
				&& ((this.getGlcdPer() == castOther.getGlcdPer()) || (this
						.getGlcdPer() != null
						&& castOther.getGlcdPer() != null && this.getGlcdPer()
						.equals(castOther.getGlcdPer())))
				&& ((this.getGlcdEntity() == castOther.getGlcdEntity()) || (this
						.getGlcdEntity() != null
						&& castOther.getGlcdEntity() != null && this
						.getGlcdEntity().equals(castOther.getGlcdEntity())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGlcdDomain() == null ? 0 : this.getGlcdDomain()
						.hashCode());
		result = 37 * result
				+ (getGlcdYear() == null ? 0 : this.getGlcdYear().hashCode());
		result = 37 * result
				+ (getGlcdPer() == null ? 0 : this.getGlcdPer().hashCode());
		result = 37
				* result
				+ (getGlcdEntity() == null ? 0 : this.getGlcdEntity()
						.hashCode());
		return result;
	}

}