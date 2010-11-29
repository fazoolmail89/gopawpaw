package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEsapfcDetId entity provides the base persistence definition of the
 * EsapfcDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapfcDetId implements java.io.Serializable {

	// Fields

	private Double oidEsapfsDet;
	private Double oidEsapfilDet;
	private String esapfcValue;

	// Constructors

	/** default constructor */
	public AbstractEsapfcDetId() {
	}

	/** full constructor */
	public AbstractEsapfcDetId(Double oidEsapfsDet, Double oidEsapfilDet,
			String esapfcValue) {
		this.oidEsapfsDet = oidEsapfsDet;
		this.oidEsapfilDet = oidEsapfilDet;
		this.esapfcValue = esapfcValue;
	}

	// Property accessors

	public Double getOidEsapfsDet() {
		return this.oidEsapfsDet;
	}

	public void setOidEsapfsDet(Double oidEsapfsDet) {
		this.oidEsapfsDet = oidEsapfsDet;
	}

	public Double getOidEsapfilDet() {
		return this.oidEsapfilDet;
	}

	public void setOidEsapfilDet(Double oidEsapfilDet) {
		this.oidEsapfilDet = oidEsapfilDet;
	}

	public String getEsapfcValue() {
		return this.esapfcValue;
	}

	public void setEsapfcValue(String esapfcValue) {
		this.esapfcValue = esapfcValue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsapfcDetId))
			return false;
		AbstractEsapfcDetId castOther = (AbstractEsapfcDetId) other;

		return ((this.getOidEsapfsDet() == castOther.getOidEsapfsDet()) || (this
				.getOidEsapfsDet() != null
				&& castOther.getOidEsapfsDet() != null && this
				.getOidEsapfsDet().equals(castOther.getOidEsapfsDet())))
				&& ((this.getOidEsapfilDet() == castOther.getOidEsapfilDet()) || (this
						.getOidEsapfilDet() != null
						&& castOther.getOidEsapfilDet() != null && this
						.getOidEsapfilDet()
						.equals(castOther.getOidEsapfilDet())))
				&& ((this.getEsapfcValue() == castOther.getEsapfcValue()) || (this
						.getEsapfcValue() != null
						&& castOther.getEsapfcValue() != null && this
						.getEsapfcValue().equals(castOther.getEsapfcValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEsapfsDet() == null ? 0 : this.getOidEsapfsDet()
						.hashCode());
		result = 37
				* result
				+ (getOidEsapfilDet() == null ? 0 : this.getOidEsapfilDet()
						.hashCode());
		result = 37
				* result
				+ (getEsapfcValue() == null ? 0 : this.getEsapfcValue()
						.hashCode());
		return result;
	}

}