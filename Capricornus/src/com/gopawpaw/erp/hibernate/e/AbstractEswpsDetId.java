package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEswpsDetId entity provides the base persistence definition of the
 * EswpsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpsDetId implements java.io.Serializable {

	// Fields

	private Double oidEswpMstr;
	private Double oidEswpsDetParent;
	private Integer eswpsOrder;

	// Constructors

	/** default constructor */
	public AbstractEswpsDetId() {
	}

	/** full constructor */
	public AbstractEswpsDetId(Double oidEswpMstr, Double oidEswpsDetParent,
			Integer eswpsOrder) {
		this.oidEswpMstr = oidEswpMstr;
		this.oidEswpsDetParent = oidEswpsDetParent;
		this.eswpsOrder = eswpsOrder;
	}

	// Property accessors

	public Double getOidEswpMstr() {
		return this.oidEswpMstr;
	}

	public void setOidEswpMstr(Double oidEswpMstr) {
		this.oidEswpMstr = oidEswpMstr;
	}

	public Double getOidEswpsDetParent() {
		return this.oidEswpsDetParent;
	}

	public void setOidEswpsDetParent(Double oidEswpsDetParent) {
		this.oidEswpsDetParent = oidEswpsDetParent;
	}

	public Integer getEswpsOrder() {
		return this.eswpsOrder;
	}

	public void setEswpsOrder(Integer eswpsOrder) {
		this.eswpsOrder = eswpsOrder;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEswpsDetId))
			return false;
		AbstractEswpsDetId castOther = (AbstractEswpsDetId) other;

		return ((this.getOidEswpMstr() == castOther.getOidEswpMstr()) || (this
				.getOidEswpMstr() != null
				&& castOther.getOidEswpMstr() != null && this.getOidEswpMstr()
				.equals(castOther.getOidEswpMstr())))
				&& ((this.getOidEswpsDetParent() == castOther
						.getOidEswpsDetParent()) || (this
						.getOidEswpsDetParent() != null
						&& castOther.getOidEswpsDetParent() != null && this
						.getOidEswpsDetParent().equals(
								castOther.getOidEswpsDetParent())))
				&& ((this.getEswpsOrder() == castOther.getEswpsOrder()) || (this
						.getEswpsOrder() != null
						&& castOther.getEswpsOrder() != null && this
						.getEswpsOrder().equals(castOther.getEswpsOrder())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEswpMstr() == null ? 0 : this.getOidEswpMstr()
						.hashCode());
		result = 37
				* result
				+ (getOidEswpsDetParent() == null ? 0 : this
						.getOidEswpsDetParent().hashCode());
		result = 37
				* result
				+ (getEswpsOrder() == null ? 0 : this.getEswpsOrder()
						.hashCode());
		return result;
	}

}