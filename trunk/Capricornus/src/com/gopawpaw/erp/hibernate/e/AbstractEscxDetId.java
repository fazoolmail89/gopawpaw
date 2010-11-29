package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEscxDetId entity provides the base persistence definition of the
 * EscxDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEscxDetId implements java.io.Serializable {

	// Fields

	private Double oidEscdDet;
	private Integer escxRecordOrder;

	// Constructors

	/** default constructor */
	public AbstractEscxDetId() {
	}

	/** full constructor */
	public AbstractEscxDetId(Double oidEscdDet, Integer escxRecordOrder) {
		this.oidEscdDet = oidEscdDet;
		this.escxRecordOrder = escxRecordOrder;
	}

	// Property accessors

	public Double getOidEscdDet() {
		return this.oidEscdDet;
	}

	public void setOidEscdDet(Double oidEscdDet) {
		this.oidEscdDet = oidEscdDet;
	}

	public Integer getEscxRecordOrder() {
		return this.escxRecordOrder;
	}

	public void setEscxRecordOrder(Integer escxRecordOrder) {
		this.escxRecordOrder = escxRecordOrder;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEscxDetId))
			return false;
		AbstractEscxDetId castOther = (AbstractEscxDetId) other;

		return ((this.getOidEscdDet() == castOther.getOidEscdDet()) || (this
				.getOidEscdDet() != null
				&& castOther.getOidEscdDet() != null && this.getOidEscdDet()
				.equals(castOther.getOidEscdDet())))
				&& ((this.getEscxRecordOrder() == castOther
						.getEscxRecordOrder()) || (this.getEscxRecordOrder() != null
						&& castOther.getEscxRecordOrder() != null && this
						.getEscxRecordOrder().equals(
								castOther.getEscxRecordOrder())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEscdDet() == null ? 0 : this.getOidEscdDet()
						.hashCode());
		result = 37
				* result
				+ (getEscxRecordOrder() == null ? 0 : this.getEscxRecordOrder()
						.hashCode());
		return result;
	}

}