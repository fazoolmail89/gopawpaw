package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEswpfcDetId entity provides the base persistence definition of the
 * EswpfcDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpfcDetId implements java.io.Serializable {

	// Fields

	private Double oidEswpfsDet;
	private Double oidEswpfilDet;
	private String eswpfcValue;

	// Constructors

	/** default constructor */
	public AbstractEswpfcDetId() {
	}

	/** full constructor */
	public AbstractEswpfcDetId(Double oidEswpfsDet, Double oidEswpfilDet,
			String eswpfcValue) {
		this.oidEswpfsDet = oidEswpfsDet;
		this.oidEswpfilDet = oidEswpfilDet;
		this.eswpfcValue = eswpfcValue;
	}

	// Property accessors

	public Double getOidEswpfsDet() {
		return this.oidEswpfsDet;
	}

	public void setOidEswpfsDet(Double oidEswpfsDet) {
		this.oidEswpfsDet = oidEswpfsDet;
	}

	public Double getOidEswpfilDet() {
		return this.oidEswpfilDet;
	}

	public void setOidEswpfilDet(Double oidEswpfilDet) {
		this.oidEswpfilDet = oidEswpfilDet;
	}

	public String getEswpfcValue() {
		return this.eswpfcValue;
	}

	public void setEswpfcValue(String eswpfcValue) {
		this.eswpfcValue = eswpfcValue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEswpfcDetId))
			return false;
		AbstractEswpfcDetId castOther = (AbstractEswpfcDetId) other;

		return ((this.getOidEswpfsDet() == castOther.getOidEswpfsDet()) || (this
				.getOidEswpfsDet() != null
				&& castOther.getOidEswpfsDet() != null && this
				.getOidEswpfsDet().equals(castOther.getOidEswpfsDet())))
				&& ((this.getOidEswpfilDet() == castOther.getOidEswpfilDet()) || (this
						.getOidEswpfilDet() != null
						&& castOther.getOidEswpfilDet() != null && this
						.getOidEswpfilDet()
						.equals(castOther.getOidEswpfilDet())))
				&& ((this.getEswpfcValue() == castOther.getEswpfcValue()) || (this
						.getEswpfcValue() != null
						&& castOther.getEswpfcValue() != null && this
						.getEswpfcValue().equals(castOther.getEswpfcValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEswpfsDet() == null ? 0 : this.getOidEswpfsDet()
						.hashCode());
		result = 37
				* result
				+ (getOidEswpfilDet() == null ? 0 : this.getOidEswpfilDet()
						.hashCode());
		result = 37
				* result
				+ (getEswpfcValue() == null ? 0 : this.getEswpfcValue()
						.hashCode());
		return result;
	}

}