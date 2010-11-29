package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEnMstrId entity provides the base persistence definition of the
 * EnMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEnMstrId implements java.io.Serializable {

	// Fields

	private String enDomain;
	private String enEntity;

	// Constructors

	/** default constructor */
	public AbstractEnMstrId() {
	}

	/** minimal constructor */
	public AbstractEnMstrId(String enDomain) {
		this.enDomain = enDomain;
	}

	/** full constructor */
	public AbstractEnMstrId(String enDomain, String enEntity) {
		this.enDomain = enDomain;
		this.enEntity = enEntity;
	}

	// Property accessors

	public String getEnDomain() {
		return this.enDomain;
	}

	public void setEnDomain(String enDomain) {
		this.enDomain = enDomain;
	}

	public String getEnEntity() {
		return this.enEntity;
	}

	public void setEnEntity(String enEntity) {
		this.enEntity = enEntity;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEnMstrId))
			return false;
		AbstractEnMstrId castOther = (AbstractEnMstrId) other;

		return ((this.getEnDomain() == castOther.getEnDomain()) || (this
				.getEnDomain() != null
				&& castOther.getEnDomain() != null && this.getEnDomain()
				.equals(castOther.getEnDomain())))
				&& ((this.getEnEntity() == castOther.getEnEntity()) || (this
						.getEnEntity() != null
						&& castOther.getEnEntity() != null && this
						.getEnEntity().equals(castOther.getEnEntity())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEnDomain() == null ? 0 : this.getEnDomain().hashCode());
		result = 37 * result
				+ (getEnEntity() == null ? 0 : this.getEnEntity().hashCode());
		return result;
	}

}