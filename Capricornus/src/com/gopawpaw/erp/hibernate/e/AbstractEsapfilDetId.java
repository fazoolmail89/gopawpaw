package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEsapfilDetId entity provides the base persistence definition of the
 * EsapfilDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapfilDetId implements java.io.Serializable {

	// Fields

	private Double oidEsfilMstr;
	private Double oidEsapMstr;

	// Constructors

	/** default constructor */
	public AbstractEsapfilDetId() {
	}

	/** full constructor */
	public AbstractEsapfilDetId(Double oidEsfilMstr, Double oidEsapMstr) {
		this.oidEsfilMstr = oidEsfilMstr;
		this.oidEsapMstr = oidEsapMstr;
	}

	// Property accessors

	public Double getOidEsfilMstr() {
		return this.oidEsfilMstr;
	}

	public void setOidEsfilMstr(Double oidEsfilMstr) {
		this.oidEsfilMstr = oidEsfilMstr;
	}

	public Double getOidEsapMstr() {
		return this.oidEsapMstr;
	}

	public void setOidEsapMstr(Double oidEsapMstr) {
		this.oidEsapMstr = oidEsapMstr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsapfilDetId))
			return false;
		AbstractEsapfilDetId castOther = (AbstractEsapfilDetId) other;

		return ((this.getOidEsfilMstr() == castOther.getOidEsfilMstr()) || (this
				.getOidEsfilMstr() != null
				&& castOther.getOidEsfilMstr() != null && this
				.getOidEsfilMstr().equals(castOther.getOidEsfilMstr())))
				&& ((this.getOidEsapMstr() == castOther.getOidEsapMstr()) || (this
						.getOidEsapMstr() != null
						&& castOther.getOidEsapMstr() != null && this
						.getOidEsapMstr().equals(castOther.getOidEsapMstr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEsfilMstr() == null ? 0 : this.getOidEsfilMstr()
						.hashCode());
		result = 37
				* result
				+ (getOidEsapMstr() == null ? 0 : this.getOidEsapMstr()
						.hashCode());
		return result;
	}

}