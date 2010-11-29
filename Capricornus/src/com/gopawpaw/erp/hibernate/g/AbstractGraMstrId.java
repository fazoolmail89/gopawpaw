package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGraMstrId entity provides the base persistence definition of the
 * GraMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGraMstrId implements java.io.Serializable {

	// Fields

	private String graDomain;
	private String graAnCode;

	// Constructors

	/** default constructor */
	public AbstractGraMstrId() {
	}

	/** minimal constructor */
	public AbstractGraMstrId(String graDomain) {
		this.graDomain = graDomain;
	}

	/** full constructor */
	public AbstractGraMstrId(String graDomain, String graAnCode) {
		this.graDomain = graDomain;
		this.graAnCode = graAnCode;
	}

	// Property accessors

	public String getGraDomain() {
		return this.graDomain;
	}

	public void setGraDomain(String graDomain) {
		this.graDomain = graDomain;
	}

	public String getGraAnCode() {
		return this.graAnCode;
	}

	public void setGraAnCode(String graAnCode) {
		this.graAnCode = graAnCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGraMstrId))
			return false;
		AbstractGraMstrId castOther = (AbstractGraMstrId) other;

		return ((this.getGraDomain() == castOther.getGraDomain()) || (this
				.getGraDomain() != null
				&& castOther.getGraDomain() != null && this.getGraDomain()
				.equals(castOther.getGraDomain())))
				&& ((this.getGraAnCode() == castOther.getGraAnCode()) || (this
						.getGraAnCode() != null
						&& castOther.getGraAnCode() != null && this
						.getGraAnCode().equals(castOther.getGraAnCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGraDomain() == null ? 0 : this.getGraDomain().hashCode());
		result = 37 * result
				+ (getGraAnCode() == null ? 0 : this.getGraAnCode().hashCode());
		return result;
	}

}