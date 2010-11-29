package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEsapsDetId entity provides the base persistence definition of the
 * EsapsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapsDetId implements java.io.Serializable {

	// Fields

	private Double oidEsapMstr;
	private Double oidEsapsDetParent;
	private Integer esapsOrder;

	// Constructors

	/** default constructor */
	public AbstractEsapsDetId() {
	}

	/** full constructor */
	public AbstractEsapsDetId(Double oidEsapMstr, Double oidEsapsDetParent,
			Integer esapsOrder) {
		this.oidEsapMstr = oidEsapMstr;
		this.oidEsapsDetParent = oidEsapsDetParent;
		this.esapsOrder = esapsOrder;
	}

	// Property accessors

	public Double getOidEsapMstr() {
		return this.oidEsapMstr;
	}

	public void setOidEsapMstr(Double oidEsapMstr) {
		this.oidEsapMstr = oidEsapMstr;
	}

	public Double getOidEsapsDetParent() {
		return this.oidEsapsDetParent;
	}

	public void setOidEsapsDetParent(Double oidEsapsDetParent) {
		this.oidEsapsDetParent = oidEsapsDetParent;
	}

	public Integer getEsapsOrder() {
		return this.esapsOrder;
	}

	public void setEsapsOrder(Integer esapsOrder) {
		this.esapsOrder = esapsOrder;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsapsDetId))
			return false;
		AbstractEsapsDetId castOther = (AbstractEsapsDetId) other;

		return ((this.getOidEsapMstr() == castOther.getOidEsapMstr()) || (this
				.getOidEsapMstr() != null
				&& castOther.getOidEsapMstr() != null && this.getOidEsapMstr()
				.equals(castOther.getOidEsapMstr())))
				&& ((this.getOidEsapsDetParent() == castOther
						.getOidEsapsDetParent()) || (this
						.getOidEsapsDetParent() != null
						&& castOther.getOidEsapsDetParent() != null && this
						.getOidEsapsDetParent().equals(
								castOther.getOidEsapsDetParent())))
				&& ((this.getEsapsOrder() == castOther.getEsapsOrder()) || (this
						.getEsapsOrder() != null
						&& castOther.getEsapsOrder() != null && this
						.getEsapsOrder().equals(castOther.getEsapsOrder())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEsapMstr() == null ? 0 : this.getOidEsapMstr()
						.hashCode());
		result = 37
				* result
				+ (getOidEsapsDetParent() == null ? 0 : this
						.getOidEsapsDetParent().hashCode());
		result = 37
				* result
				+ (getEsapsOrder() == null ? 0 : this.getEsapsOrder()
						.hashCode());
		return result;
	}

}