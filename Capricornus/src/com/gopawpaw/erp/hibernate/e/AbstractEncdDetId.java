package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEncdDetId entity provides the base persistence definition of the
 * EncdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEncdDetId implements java.io.Serializable {

	// Fields

	private String encdDomain;
	private String encdConsEntity;
	private String encdSubDomain;
	private String encdSubEntity;

	// Constructors

	/** default constructor */
	public AbstractEncdDetId() {
	}

	/** full constructor */
	public AbstractEncdDetId(String encdDomain, String encdConsEntity,
			String encdSubDomain, String encdSubEntity) {
		this.encdDomain = encdDomain;
		this.encdConsEntity = encdConsEntity;
		this.encdSubDomain = encdSubDomain;
		this.encdSubEntity = encdSubEntity;
	}

	// Property accessors

	public String getEncdDomain() {
		return this.encdDomain;
	}

	public void setEncdDomain(String encdDomain) {
		this.encdDomain = encdDomain;
	}

	public String getEncdConsEntity() {
		return this.encdConsEntity;
	}

	public void setEncdConsEntity(String encdConsEntity) {
		this.encdConsEntity = encdConsEntity;
	}

	public String getEncdSubDomain() {
		return this.encdSubDomain;
	}

	public void setEncdSubDomain(String encdSubDomain) {
		this.encdSubDomain = encdSubDomain;
	}

	public String getEncdSubEntity() {
		return this.encdSubEntity;
	}

	public void setEncdSubEntity(String encdSubEntity) {
		this.encdSubEntity = encdSubEntity;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEncdDetId))
			return false;
		AbstractEncdDetId castOther = (AbstractEncdDetId) other;

		return ((this.getEncdDomain() == castOther.getEncdDomain()) || (this
				.getEncdDomain() != null
				&& castOther.getEncdDomain() != null && this.getEncdDomain()
				.equals(castOther.getEncdDomain())))
				&& ((this.getEncdConsEntity() == castOther.getEncdConsEntity()) || (this
						.getEncdConsEntity() != null
						&& castOther.getEncdConsEntity() != null && this
						.getEncdConsEntity().equals(
								castOther.getEncdConsEntity())))
				&& ((this.getEncdSubDomain() == castOther.getEncdSubDomain()) || (this
						.getEncdSubDomain() != null
						&& castOther.getEncdSubDomain() != null && this
						.getEncdSubDomain()
						.equals(castOther.getEncdSubDomain())))
				&& ((this.getEncdSubEntity() == castOther.getEncdSubEntity()) || (this
						.getEncdSubEntity() != null
						&& castOther.getEncdSubEntity() != null && this
						.getEncdSubEntity()
						.equals(castOther.getEncdSubEntity())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEncdDomain() == null ? 0 : this.getEncdDomain()
						.hashCode());
		result = 37
				* result
				+ (getEncdConsEntity() == null ? 0 : this.getEncdConsEntity()
						.hashCode());
		result = 37
				* result
				+ (getEncdSubDomain() == null ? 0 : this.getEncdSubDomain()
						.hashCode());
		result = 37
				* result
				+ (getEncdSubEntity() == null ? 0 : this.getEncdSubEntity()
						.hashCode());
		return result;
	}

}