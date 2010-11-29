package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEscfRefId entity provides the base persistence definition of the
 * EscfRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEscfRefId implements java.io.Serializable {

	// Fields

	private Double oidEscatMstr;
	private Double oidEsfilMstr;

	// Constructors

	/** default constructor */
	public AbstractEscfRefId() {
	}

	/** full constructor */
	public AbstractEscfRefId(Double oidEscatMstr, Double oidEsfilMstr) {
		this.oidEscatMstr = oidEscatMstr;
		this.oidEsfilMstr = oidEsfilMstr;
	}

	// Property accessors

	public Double getOidEscatMstr() {
		return this.oidEscatMstr;
	}

	public void setOidEscatMstr(Double oidEscatMstr) {
		this.oidEscatMstr = oidEscatMstr;
	}

	public Double getOidEsfilMstr() {
		return this.oidEsfilMstr;
	}

	public void setOidEsfilMstr(Double oidEsfilMstr) {
		this.oidEsfilMstr = oidEsfilMstr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEscfRefId))
			return false;
		AbstractEscfRefId castOther = (AbstractEscfRefId) other;

		return ((this.getOidEscatMstr() == castOther.getOidEscatMstr()) || (this
				.getOidEscatMstr() != null
				&& castOther.getOidEscatMstr() != null && this
				.getOidEscatMstr().equals(castOther.getOidEscatMstr())))
				&& ((this.getOidEsfilMstr() == castOther.getOidEsfilMstr()) || (this
						.getOidEsfilMstr() != null
						&& castOther.getOidEsfilMstr() != null && this
						.getOidEsfilMstr().equals(castOther.getOidEsfilMstr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEscatMstr() == null ? 0 : this.getOidEscatMstr()
						.hashCode());
		result = 37
				* result
				+ (getOidEsfilMstr() == null ? 0 : this.getOidEsfilMstr()
						.hashCode());
		return result;
	}

}