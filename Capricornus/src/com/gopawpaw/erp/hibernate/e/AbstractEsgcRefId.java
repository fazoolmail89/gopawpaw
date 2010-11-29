package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEsgcRefId entity provides the base persistence definition of the
 * EsgcRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsgcRefId implements java.io.Serializable {

	// Fields

	private Double oidEscatMstr;
	private Double oidAtgMstr;

	// Constructors

	/** default constructor */
	public AbstractEsgcRefId() {
	}

	/** full constructor */
	public AbstractEsgcRefId(Double oidEscatMstr, Double oidAtgMstr) {
		this.oidEscatMstr = oidEscatMstr;
		this.oidAtgMstr = oidAtgMstr;
	}

	// Property accessors

	public Double getOidEscatMstr() {
		return this.oidEscatMstr;
	}

	public void setOidEscatMstr(Double oidEscatMstr) {
		this.oidEscatMstr = oidEscatMstr;
	}

	public Double getOidAtgMstr() {
		return this.oidAtgMstr;
	}

	public void setOidAtgMstr(Double oidAtgMstr) {
		this.oidAtgMstr = oidAtgMstr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsgcRefId))
			return false;
		AbstractEsgcRefId castOther = (AbstractEsgcRefId) other;

		return ((this.getOidEscatMstr() == castOther.getOidEscatMstr()) || (this
				.getOidEscatMstr() != null
				&& castOther.getOidEscatMstr() != null && this
				.getOidEscatMstr().equals(castOther.getOidEscatMstr())))
				&& ((this.getOidAtgMstr() == castOther.getOidAtgMstr()) || (this
						.getOidAtgMstr() != null
						&& castOther.getOidAtgMstr() != null && this
						.getOidAtgMstr().equals(castOther.getOidAtgMstr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEscatMstr() == null ? 0 : this.getOidEscatMstr()
						.hashCode());
		result = 37
				* result
				+ (getOidAtgMstr() == null ? 0 : this.getOidAtgMstr()
						.hashCode());
		return result;
	}

}