package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEsapfDetId entity provides the base persistence definition of the
 * EsapfDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapfDetId implements java.io.Serializable {

	// Fields

	private Double oidEsapsDet;
	private Integer esapfFieldOrder;

	// Constructors

	/** default constructor */
	public AbstractEsapfDetId() {
	}

	/** full constructor */
	public AbstractEsapfDetId(Double oidEsapsDet, Integer esapfFieldOrder) {
		this.oidEsapsDet = oidEsapsDet;
		this.esapfFieldOrder = esapfFieldOrder;
	}

	// Property accessors

	public Double getOidEsapsDet() {
		return this.oidEsapsDet;
	}

	public void setOidEsapsDet(Double oidEsapsDet) {
		this.oidEsapsDet = oidEsapsDet;
	}

	public Integer getEsapfFieldOrder() {
		return this.esapfFieldOrder;
	}

	public void setEsapfFieldOrder(Integer esapfFieldOrder) {
		this.esapfFieldOrder = esapfFieldOrder;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsapfDetId))
			return false;
		AbstractEsapfDetId castOther = (AbstractEsapfDetId) other;

		return ((this.getOidEsapsDet() == castOther.getOidEsapsDet()) || (this
				.getOidEsapsDet() != null
				&& castOther.getOidEsapsDet() != null && this.getOidEsapsDet()
				.equals(castOther.getOidEsapsDet())))
				&& ((this.getEsapfFieldOrder() == castOther
						.getEsapfFieldOrder()) || (this.getEsapfFieldOrder() != null
						&& castOther.getEsapfFieldOrder() != null && this
						.getEsapfFieldOrder().equals(
								castOther.getEsapfFieldOrder())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEsapsDet() == null ? 0 : this.getOidEsapsDet()
						.hashCode());
		result = 37
				* result
				+ (getEsapfFieldOrder() == null ? 0 : this.getEsapfFieldOrder()
						.hashCode());
		return result;
	}

}