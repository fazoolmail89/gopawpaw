package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEswpfDetId entity provides the base persistence definition of the
 * EswpfDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpfDetId implements java.io.Serializable {

	// Fields

	private Double oidEswpsDet;
	private Integer eswpfFieldOrder;

	// Constructors

	/** default constructor */
	public AbstractEswpfDetId() {
	}

	/** full constructor */
	public AbstractEswpfDetId(Double oidEswpsDet, Integer eswpfFieldOrder) {
		this.oidEswpsDet = oidEswpsDet;
		this.eswpfFieldOrder = eswpfFieldOrder;
	}

	// Property accessors

	public Double getOidEswpsDet() {
		return this.oidEswpsDet;
	}

	public void setOidEswpsDet(Double oidEswpsDet) {
		this.oidEswpsDet = oidEswpsDet;
	}

	public Integer getEswpfFieldOrder() {
		return this.eswpfFieldOrder;
	}

	public void setEswpfFieldOrder(Integer eswpfFieldOrder) {
		this.eswpfFieldOrder = eswpfFieldOrder;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEswpfDetId))
			return false;
		AbstractEswpfDetId castOther = (AbstractEswpfDetId) other;

		return ((this.getOidEswpsDet() == castOther.getOidEswpsDet()) || (this
				.getOidEswpsDet() != null
				&& castOther.getOidEswpsDet() != null && this.getOidEswpsDet()
				.equals(castOther.getOidEswpsDet())))
				&& ((this.getEswpfFieldOrder() == castOther
						.getEswpfFieldOrder()) || (this.getEswpfFieldOrder() != null
						&& castOther.getEswpfFieldOrder() != null && this
						.getEswpfFieldOrder().equals(
								castOther.getEswpfFieldOrder())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEswpsDet() == null ? 0 : this.getOidEswpsDet()
						.hashCode());
		result = 37
				* result
				+ (getEswpfFieldOrder() == null ? 0 : this.getEswpfFieldOrder()
						.hashCode());
		return result;
	}

}