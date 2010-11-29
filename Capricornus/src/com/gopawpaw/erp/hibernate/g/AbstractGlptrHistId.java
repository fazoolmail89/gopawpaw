package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlptrHistId entity provides the base persistence definition of the
 * GlptrHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlptrHistId implements java.io.Serializable {

	// Fields

	private String glptrDomain;
	private String glptrEntity;
	private String glptrRef;

	// Constructors

	/** default constructor */
	public AbstractGlptrHistId() {
	}

	/** full constructor */
	public AbstractGlptrHistId(String glptrDomain, String glptrEntity,
			String glptrRef) {
		this.glptrDomain = glptrDomain;
		this.glptrEntity = glptrEntity;
		this.glptrRef = glptrRef;
	}

	// Property accessors

	public String getGlptrDomain() {
		return this.glptrDomain;
	}

	public void setGlptrDomain(String glptrDomain) {
		this.glptrDomain = glptrDomain;
	}

	public String getGlptrEntity() {
		return this.glptrEntity;
	}

	public void setGlptrEntity(String glptrEntity) {
		this.glptrEntity = glptrEntity;
	}

	public String getGlptrRef() {
		return this.glptrRef;
	}

	public void setGlptrRef(String glptrRef) {
		this.glptrRef = glptrRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGlptrHistId))
			return false;
		AbstractGlptrHistId castOther = (AbstractGlptrHistId) other;

		return ((this.getGlptrDomain() == castOther.getGlptrDomain()) || (this
				.getGlptrDomain() != null
				&& castOther.getGlptrDomain() != null && this.getGlptrDomain()
				.equals(castOther.getGlptrDomain())))
				&& ((this.getGlptrEntity() == castOther.getGlptrEntity()) || (this
						.getGlptrEntity() != null
						&& castOther.getGlptrEntity() != null && this
						.getGlptrEntity().equals(castOther.getGlptrEntity())))
				&& ((this.getGlptrRef() == castOther.getGlptrRef()) || (this
						.getGlptrRef() != null
						&& castOther.getGlptrRef() != null && this
						.getGlptrRef().equals(castOther.getGlptrRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGlptrDomain() == null ? 0 : this.getGlptrDomain()
						.hashCode());
		result = 37
				* result
				+ (getGlptrEntity() == null ? 0 : this.getGlptrEntity()
						.hashCode());
		result = 37 * result
				+ (getGlptrRef() == null ? 0 : this.getGlptrRef().hashCode());
		return result;
	}

}