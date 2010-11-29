package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEswpMstrId entity provides the base persistence definition of the
 * EswpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpMstrId implements java.io.Serializable {

	// Fields

	private String eswpProfileType;
	private String eswpCollection;
	private Double oidEscatMstr;

	// Constructors

	/** default constructor */
	public AbstractEswpMstrId() {
	}

	/** full constructor */
	public AbstractEswpMstrId(String eswpProfileType, String eswpCollection,
			Double oidEscatMstr) {
		this.eswpProfileType = eswpProfileType;
		this.eswpCollection = eswpCollection;
		this.oidEscatMstr = oidEscatMstr;
	}

	// Property accessors

	public String getEswpProfileType() {
		return this.eswpProfileType;
	}

	public void setEswpProfileType(String eswpProfileType) {
		this.eswpProfileType = eswpProfileType;
	}

	public String getEswpCollection() {
		return this.eswpCollection;
	}

	public void setEswpCollection(String eswpCollection) {
		this.eswpCollection = eswpCollection;
	}

	public Double getOidEscatMstr() {
		return this.oidEscatMstr;
	}

	public void setOidEscatMstr(Double oidEscatMstr) {
		this.oidEscatMstr = oidEscatMstr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEswpMstrId))
			return false;
		AbstractEswpMstrId castOther = (AbstractEswpMstrId) other;

		return ((this.getEswpProfileType() == castOther.getEswpProfileType()) || (this
				.getEswpProfileType() != null
				&& castOther.getEswpProfileType() != null && this
				.getEswpProfileType().equals(castOther.getEswpProfileType())))
				&& ((this.getEswpCollection() == castOther.getEswpCollection()) || (this
						.getEswpCollection() != null
						&& castOther.getEswpCollection() != null && this
						.getEswpCollection().equals(
								castOther.getEswpCollection())))
				&& ((this.getOidEscatMstr() == castOther.getOidEscatMstr()) || (this
						.getOidEscatMstr() != null
						&& castOther.getOidEscatMstr() != null && this
						.getOidEscatMstr().equals(castOther.getOidEscatMstr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEswpProfileType() == null ? 0 : this.getEswpProfileType()
						.hashCode());
		result = 37
				* result
				+ (getEswpCollection() == null ? 0 : this.getEswpCollection()
						.hashCode());
		result = 37
				* result
				+ (getOidEscatMstr() == null ? 0 : this.getOidEscatMstr()
						.hashCode());
		return result;
	}

}