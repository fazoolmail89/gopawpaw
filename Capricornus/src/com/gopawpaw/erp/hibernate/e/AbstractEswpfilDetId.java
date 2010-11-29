package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEswpfilDetId entity provides the base persistence definition of the
 * EswpfilDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpfilDetId implements java.io.Serializable {

	// Fields

	private Double oidEsfilMstr;
	private Double oidEswpMstr;

	// Constructors

	/** default constructor */
	public AbstractEswpfilDetId() {
	}

	/** full constructor */
	public AbstractEswpfilDetId(Double oidEsfilMstr, Double oidEswpMstr) {
		this.oidEsfilMstr = oidEsfilMstr;
		this.oidEswpMstr = oidEswpMstr;
	}

	// Property accessors

	public Double getOidEsfilMstr() {
		return this.oidEsfilMstr;
	}

	public void setOidEsfilMstr(Double oidEsfilMstr) {
		this.oidEsfilMstr = oidEsfilMstr;
	}

	public Double getOidEswpMstr() {
		return this.oidEswpMstr;
	}

	public void setOidEswpMstr(Double oidEswpMstr) {
		this.oidEswpMstr = oidEswpMstr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEswpfilDetId))
			return false;
		AbstractEswpfilDetId castOther = (AbstractEswpfilDetId) other;

		return ((this.getOidEsfilMstr() == castOther.getOidEsfilMstr()) || (this
				.getOidEsfilMstr() != null
				&& castOther.getOidEsfilMstr() != null && this
				.getOidEsfilMstr().equals(castOther.getOidEsfilMstr())))
				&& ((this.getOidEswpMstr() == castOther.getOidEswpMstr()) || (this
						.getOidEswpMstr() != null
						&& castOther.getOidEswpMstr() != null && this
						.getOidEswpMstr().equals(castOther.getOidEswpMstr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEsfilMstr() == null ? 0 : this.getOidEsfilMstr()
						.hashCode());
		result = 37
				* result
				+ (getOidEswpMstr() == null ? 0 : this.getOidEswpMstr()
						.hashCode());
		return result;
	}

}