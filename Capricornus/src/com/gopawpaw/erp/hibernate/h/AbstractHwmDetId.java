package com.gopawpaw.erp.hibernate.h;

import java.util.Date;

/**
 * AbstractHwmDetId entity provides the base persistence definition of the
 * HwmDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHwmDetId implements java.io.Serializable {

	// Fields

	private String hwmProduct;
	private Date hwmDate;

	// Constructors

	/** default constructor */
	public AbstractHwmDetId() {
	}

	/** full constructor */
	public AbstractHwmDetId(String hwmProduct, Date hwmDate) {
		this.hwmProduct = hwmProduct;
		this.hwmDate = hwmDate;
	}

	// Property accessors

	public String getHwmProduct() {
		return this.hwmProduct;
	}

	public void setHwmProduct(String hwmProduct) {
		this.hwmProduct = hwmProduct;
	}

	public Date getHwmDate() {
		return this.hwmDate;
	}

	public void setHwmDate(Date hwmDate) {
		this.hwmDate = hwmDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHwmDetId))
			return false;
		AbstractHwmDetId castOther = (AbstractHwmDetId) other;

		return ((this.getHwmProduct() == castOther.getHwmProduct()) || (this
				.getHwmProduct() != null
				&& castOther.getHwmProduct() != null && this.getHwmProduct()
				.equals(castOther.getHwmProduct())))
				&& ((this.getHwmDate() == castOther.getHwmDate()) || (this
						.getHwmDate() != null
						&& castOther.getHwmDate() != null && this.getHwmDate()
						.equals(castOther.getHwmDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getHwmProduct() == null ? 0 : this.getHwmProduct()
						.hashCode());
		result = 37 * result
				+ (getHwmDate() == null ? 0 : this.getHwmDate().hashCode());
		return result;
	}

}