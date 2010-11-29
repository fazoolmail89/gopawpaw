package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAtgtRefId entity provides the base persistence definition of the
 * AtgtRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtgtRefId implements java.io.Serializable {

	// Fields

	private Double oidAtgMstr;
	private Double oidAttMstr;

	// Constructors

	/** default constructor */
	public AbstractAtgtRefId() {
	}

	/** full constructor */
	public AbstractAtgtRefId(Double oidAtgMstr, Double oidAttMstr) {
		this.oidAtgMstr = oidAtgMstr;
		this.oidAttMstr = oidAttMstr;
	}

	// Property accessors

	public Double getOidAtgMstr() {
		return this.oidAtgMstr;
	}

	public void setOidAtgMstr(Double oidAtgMstr) {
		this.oidAtgMstr = oidAtgMstr;
	}

	public Double getOidAttMstr() {
		return this.oidAttMstr;
	}

	public void setOidAttMstr(Double oidAttMstr) {
		this.oidAttMstr = oidAttMstr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAtgtRefId))
			return false;
		AbstractAtgtRefId castOther = (AbstractAtgtRefId) other;

		return ((this.getOidAtgMstr() == castOther.getOidAtgMstr()) || (this
				.getOidAtgMstr() != null
				&& castOther.getOidAtgMstr() != null && this.getOidAtgMstr()
				.equals(castOther.getOidAtgMstr())))
				&& ((this.getOidAttMstr() == castOther.getOidAttMstr()) || (this
						.getOidAttMstr() != null
						&& castOther.getOidAttMstr() != null && this
						.getOidAttMstr().equals(castOther.getOidAttMstr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidAtgMstr() == null ? 0 : this.getOidAtgMstr()
						.hashCode());
		result = 37
				* result
				+ (getOidAttMstr() == null ? 0 : this.getOidAttMstr()
						.hashCode());
		return result;
	}

}