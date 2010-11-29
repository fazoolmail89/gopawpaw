package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVoMstrId entity provides the base persistence definition of the
 * VoMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVoMstrId implements java.io.Serializable {

	// Fields

	private String voDomain;
	private String voRef;

	// Constructors

	/** default constructor */
	public AbstractVoMstrId() {
	}

	/** minimal constructor */
	public AbstractVoMstrId(String voDomain) {
		this.voDomain = voDomain;
	}

	/** full constructor */
	public AbstractVoMstrId(String voDomain, String voRef) {
		this.voDomain = voDomain;
		this.voRef = voRef;
	}

	// Property accessors

	public String getVoDomain() {
		return this.voDomain;
	}

	public void setVoDomain(String voDomain) {
		this.voDomain = voDomain;
	}

	public String getVoRef() {
		return this.voRef;
	}

	public void setVoRef(String voRef) {
		this.voRef = voRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVoMstrId))
			return false;
		AbstractVoMstrId castOther = (AbstractVoMstrId) other;

		return ((this.getVoDomain() == castOther.getVoDomain()) || (this
				.getVoDomain() != null
				&& castOther.getVoDomain() != null && this.getVoDomain()
				.equals(castOther.getVoDomain())))
				&& ((this.getVoRef() == castOther.getVoRef()) || (this
						.getVoRef() != null
						&& castOther.getVoRef() != null && this.getVoRef()
						.equals(castOther.getVoRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVoDomain() == null ? 0 : this.getVoDomain().hashCode());
		result = 37 * result
				+ (getVoRef() == null ? 0 : this.getVoRef().hashCode());
		return result;
	}

}