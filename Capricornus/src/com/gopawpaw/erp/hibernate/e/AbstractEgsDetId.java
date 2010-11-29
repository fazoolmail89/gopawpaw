package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEgsDetId entity provides the base persistence definition of the
 * EgsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgsDetId implements java.io.Serializable {

	// Fields

	private String egsDomain;
	private String egsEngCode;
	private String egsType;
	private String egsSkill;

	// Constructors

	/** default constructor */
	public AbstractEgsDetId() {
	}

	/** minimal constructor */
	public AbstractEgsDetId(String egsDomain) {
		this.egsDomain = egsDomain;
	}

	/** full constructor */
	public AbstractEgsDetId(String egsDomain, String egsEngCode,
			String egsType, String egsSkill) {
		this.egsDomain = egsDomain;
		this.egsEngCode = egsEngCode;
		this.egsType = egsType;
		this.egsSkill = egsSkill;
	}

	// Property accessors

	public String getEgsDomain() {
		return this.egsDomain;
	}

	public void setEgsDomain(String egsDomain) {
		this.egsDomain = egsDomain;
	}

	public String getEgsEngCode() {
		return this.egsEngCode;
	}

	public void setEgsEngCode(String egsEngCode) {
		this.egsEngCode = egsEngCode;
	}

	public String getEgsType() {
		return this.egsType;
	}

	public void setEgsType(String egsType) {
		this.egsType = egsType;
	}

	public String getEgsSkill() {
		return this.egsSkill;
	}

	public void setEgsSkill(String egsSkill) {
		this.egsSkill = egsSkill;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEgsDetId))
			return false;
		AbstractEgsDetId castOther = (AbstractEgsDetId) other;

		return ((this.getEgsDomain() == castOther.getEgsDomain()) || (this
				.getEgsDomain() != null
				&& castOther.getEgsDomain() != null && this.getEgsDomain()
				.equals(castOther.getEgsDomain())))
				&& ((this.getEgsEngCode() == castOther.getEgsEngCode()) || (this
						.getEgsEngCode() != null
						&& castOther.getEgsEngCode() != null && this
						.getEgsEngCode().equals(castOther.getEgsEngCode())))
				&& ((this.getEgsType() == castOther.getEgsType()) || (this
						.getEgsType() != null
						&& castOther.getEgsType() != null && this.getEgsType()
						.equals(castOther.getEgsType())))
				&& ((this.getEgsSkill() == castOther.getEgsSkill()) || (this
						.getEgsSkill() != null
						&& castOther.getEgsSkill() != null && this
						.getEgsSkill().equals(castOther.getEgsSkill())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEgsDomain() == null ? 0 : this.getEgsDomain().hashCode());
		result = 37
				* result
				+ (getEgsEngCode() == null ? 0 : this.getEgsEngCode()
						.hashCode());
		result = 37 * result
				+ (getEgsType() == null ? 0 : this.getEgsType().hashCode());
		result = 37 * result
				+ (getEgsSkill() == null ? 0 : this.getEgsSkill().hashCode());
		return result;
	}

}